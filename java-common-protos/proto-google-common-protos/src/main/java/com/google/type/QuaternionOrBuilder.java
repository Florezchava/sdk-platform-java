/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/type/quaternion.proto
// Protobuf Java Version: 4.27.1

package com.google.type;

public interface QuaternionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.type.Quaternion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The x component.
   * </pre>
   *
   * <code>double x = 1;</code>
   *
   * @return The x.
   */
  double getX();

  /**
   *
   *
   * <pre>
   * The y component.
   * </pre>
   *
   * <code>double y = 2;</code>
   *
   * @return The y.
   */
  double getY();

  /**
   *
   *
   * <pre>
   * The z component.
   * </pre>
   *
   * <code>double z = 3;</code>
   *
   * @return The z.
   */
  double getZ();

  /**
   *
   *
   * <pre>
   * The scalar component.
   * </pre>
   *
   * <code>double w = 4;</code>
   *
   * @return The w.
   */
  double getW();
}
