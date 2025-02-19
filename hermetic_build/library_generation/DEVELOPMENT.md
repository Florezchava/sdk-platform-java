> [!IMPORTANT]
> All examples assume you are inside the `hermetic_build` folder.


# Linting

When contributing, ensure your changes to python code have a valid format.

```
python -m pip install black
black .
```

# Running the integration tests

The integration tests build the docker image declared in
`.cloudbuild/library_generation/library_generation.Dockerfile`, pull GAPIC
repositories, generate the libraries and compares the results with the source
code declared in a "golden branch" of the repo.

It requires docker and python 3.x to be installed.

```
python -m pip install --require-hashes -r library_generation/requirements.txt
python -m pip install library_generation
python -m unittest library_generation/tests/integration_tests.py
```

# Running the unit tests

The unit tests of the hermetic build scripts are contained in several scripts,
corresponding to a specific component.
Every unit test script ends with `unit_tests.py`.
To avoid them specifying them individually, we can use the following command:

```bash
python -m unittest discover -s library_generation/tests/ -p "*unit_tests.py"
```

> [!NOTE]
> The output of this command may look erratic during the first 30 seconds.
> This is normal. After the tests are done, an "OK" message should be shown.

# Running the scripts in your local environment

Although the scripts are designed to be run in a Docker container, you can also
run them directly.
This section explains how to run the entrypoint script
(`library_generation/cli/entry_point.py`).

## Assumptions made by the scripts
### The Hermetic Build's well-known folder
Located in `${HOME}/.library_generation`, this folder is assumed by the scripts
to contain certain tools.

Developers must make sure this folder is properly configured before running the
scripts locally.
Note that this relies on the `HOME` en var which is always defined as per
[POSIX env var definition](https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap08.html).

#### Put the gapic-generator-java jar in its well-known location

Run `cd sdk-platform-java && mvn install -DskipTests -Dclirr.skip
-Dcheckstyle.skip`. 
This will generate a jar located in
`~/.m2/repository/com/google/api/gapic-generator-java/{version}/gapic-generator-java-{version}.jar`

Then `mv` the jar into the well-known location of the jar. 
The generation scripts will assume the jar is there.

```shell
mv /path/to/jar "${HOME}/.library_generation/gapic-generator-java.jar"
```

#### Put the java formatter jar in its well-known location

Download google-java-format-{version}-all-deps.jar from [Maven Central](https://central.sonatype.com/artifact/com.google.googlejavaformat/google-java-format)
or [GitHub releases](https://github.com/google/google-java-format/releases).
Then `mv` the jar into the well-known location of the jar.
The generation scripts will assume the jar is there.

```shell
mv /path/to/jar "${HOME}/.library_generation/google-java-format.jar"
```

## Installing prerequisites

In order to run the generation scripts directly, there are a few tools we
need to install beforehand.

### Install the owl-bot CLI

Requires node.js to be installed.
Check this [installation guide](https://github.com/nvm-sh/nvm?tab=readme-ov-file#install--update-script)
for NVM, Node.js's version manager.

After you install it, you can install the owl-bot CLI with the following
commands:
```bash
git clone https://github.com/googleapis/repo-automation-bots
cd repo-automation-bots/packages/owl-bot
npm i && npm run compile && npm link
owl-bot copy-code --version
```

The key step is `npm link`, which will make the command available in you current
shell session.


## Running the script
The entrypoint script (`library_generation/cli/entry_point.py`) allows you to
generate a GAPIC repository with a given api definition (proto, service yaml).

### Download the api definition
For example, googleapis
```
git clone https://github.com/googleapis/googleapis
export api_definitions_path="$(pwd)/googleapis"
```

### Download the repo
For example, google-cloud-java
```
git clone https://github.com/googleapis/google-cloud-java
export path_to_repo="$(pwd)/google-cloud-java"
```

### Install the scripts
```
python -m pip install .
```

### Run the script
```
python library_generation/cli/entry_point.py generate \
   --repository-path="${path_to_repo}" \
   --api-definitions-path="${api_definitions_path}"
```


# Running the scripts using the docker container image
This is convenient in order to avoid installing the dependencies manually. 

> [!IMPORTANT]
> From now, the examples assume you are in the root of your sdk-platform-java
> folder.

## Build the docker image
```bash
docker build --file .cloudbuild/library_generation/library_generation.Dockerfile --iidfile image-id .
```

This will create an `image-id` file at the root of the repo with the hash ID of
the image.

## Run the docker image
The docker image will perform changes on its internal `/workspace` folder, 
to which you need to map a folder on your host machine (i.e. map your downloaded
repo to this folder).

To run the docker container on the google-cloud-java repo, you must run:
```bash
docker run \
  -u "$(id -u)":"$(id -g)"  \
  -v /path/to/google-cloud-java:/workspace \
  -v /path/to/api-definition:/workspace/apis \
  $(cat image-id) \
  --api-definitions-path=/workspace/apis
```

 * `-u "$(id -u)":"$(id -g)"` makes docker run the container impersonating
   yourself. This avoids folder ownership changes since it runs as root by
   default.
 * `-v /path/to/google-cloud-java:/workspace` maps the host machine's
   google-cloud-java folder to the /workspace folder. 
   The image is configured to perform changes in this directory.
 * `-v /path/to/api-definition:/workspace/apis` maps the host machine's
   api-definition folder to /workspace/apis folder.
 * `$(cat image-id)` obtains the image ID created in the build step.
 * `--api-definitions-path=/workspace/apis` set the API definition path to
   `/workspace/apis`.

## Debug the created containers
If you are working on changing the way the containers are created, you may want
to inspect the containers to check the setup.
It would be convenient in such case to have a text editor/viewer available. 
You can achieve this by modifying the Dockerfile as follows:

```docker
# install OS tools
RUN apt-get update && apt-get install -y \
	unzip openjdk-17-jdk rsync maven jq less vim \
	&& apt-get clean
```

We add `less` and `vim` as text tools for further inspection.

You can also run a shell in a new container by running:

```bash
docker run \
  --rm -it \
  -u $(id -u):$(id -g) \
  -v /path/to/google-cloud-java:/workspace \
  --entrypoint="bash" \
  $(cat image-id)
```
