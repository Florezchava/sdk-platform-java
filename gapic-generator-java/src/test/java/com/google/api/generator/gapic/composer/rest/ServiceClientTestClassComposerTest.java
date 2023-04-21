// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.generator.gapic.composer.rest;

import static com.google.api.generator.test.framework.Assert.assertCodeEquals;

import com.google.api.generator.engine.writer.JavaWriterVisitor;
import com.google.api.generator.gapic.model.GapicClass;
import com.google.api.generator.gapic.model.GapicContext;
import com.google.api.generator.gapic.model.Service;
import com.google.api.generator.test.framework.GoldenTestHelper;
import com.google.api.generator.test.protoloader.RestTestProtoLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;

public class ServiceClientTestClassComposerTest {
  @Test
  public void generateServiceClasses() {
    GapicContext context = RestTestProtoLoader.instance().parseCompliance();
    Service echoProtoService = context.services().get(0);
    GapicClass clazz =
        ServiceClientTestClassComposer.instance().generate(context, echoProtoService);

    JavaWriterVisitor visitor = new JavaWriterVisitor();
    clazz.classDefinition().accept(visitor);
    GoldenTestHelper.saveCodegenToFile(
        this.getClass(), "ComplianceClientTest.golden", visitor.write());
    Path goldenFilePath =
        Paths.get(GoldenTestHelper.getGoldenDir(this.getClass()), "ComplianceClientTest.golden");
    assertCodeEquals(goldenFilePath, visitor.write());
  }
}
