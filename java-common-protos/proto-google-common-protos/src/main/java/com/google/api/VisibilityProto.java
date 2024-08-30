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
// source: google/api/visibility.proto

// Protobuf Java Version: 3.25.4
package com.google.api;

public final class VisibilityProto {
  private VisibilityProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.VisibilityProto.enumVisibility);
    registry.add(com.google.api.VisibilityProto.valueVisibility);
    registry.add(com.google.api.VisibilityProto.fieldVisibility);
    registry.add(com.google.api.VisibilityProto.messageVisibility);
    registry.add(com.google.api.VisibilityProto.methodVisibility);
    registry.add(com.google.api.VisibilityProto.apiVisibility);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int ENUM_VISIBILITY_FIELD_NUMBER = 72295727;
  /**
   *
   *
   * <pre>
   * See `VisibilityRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.EnumOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.EnumOptions, com.google.api.VisibilityRule>
      enumVisibility =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.VisibilityRule.class,
              com.google.api.VisibilityRule.getDefaultInstance());

  public static final int VALUE_VISIBILITY_FIELD_NUMBER = 72295727;
  /**
   *
   *
   * <pre>
   * See `VisibilityRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.EnumValueOptions, com.google.api.VisibilityRule>
      valueVisibility =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.VisibilityRule.class,
              com.google.api.VisibilityRule.getDefaultInstance());

  public static final int FIELD_VISIBILITY_FIELD_NUMBER = 72295727;
  /**
   *
   *
   * <pre>
   * See `VisibilityRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.FieldOptions, com.google.api.VisibilityRule>
      fieldVisibility =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.VisibilityRule.class,
              com.google.api.VisibilityRule.getDefaultInstance());

  public static final int MESSAGE_VISIBILITY_FIELD_NUMBER = 72295727;
  /**
   *
   *
   * <pre>
   * See `VisibilityRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MessageOptions, com.google.api.VisibilityRule>
      messageVisibility =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.VisibilityRule.class,
              com.google.api.VisibilityRule.getDefaultInstance());

  public static final int METHOD_VISIBILITY_FIELD_NUMBER = 72295727;
  /**
   *
   *
   * <pre>
   * See `VisibilityRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MethodOptions, com.google.api.VisibilityRule>
      methodVisibility =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.VisibilityRule.class,
              com.google.api.VisibilityRule.getDefaultInstance());

  public static final int API_VISIBILITY_FIELD_NUMBER = 72295727;
  /**
   *
   *
   * <pre>
   * See `VisibilityRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.ServiceOptions, com.google.api.VisibilityRule>
      apiVisibility =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.VisibilityRule.class,
              com.google.api.VisibilityRule.getDefaultInstance());

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Visibility_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Visibility_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_VisibilityRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_VisibilityRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\033google/api/visibility.proto\022\ngoogle.ap"
          + "i\032 google/protobuf/descriptor.proto\"7\n\nV"
          + "isibility\022)\n\005rules\030\001 \003(\0132\032.google.api.Vi"
          + "sibilityRule\"7\n\016VisibilityRule\022\020\n\010select"
          + "or\030\001 \001(\t\022\023\n\013restriction\030\002 \001(\t:T\n\017enum_vi"
          + "sibility\022\034.google.protobuf.EnumOptions\030\257"
          + "\312\274\" \001(\0132\032.google.api.VisibilityRule:Z\n\020v"
          + "alue_visibility\022!.google.protobuf.EnumVa"
          + "lueOptions\030\257\312\274\" \001(\0132\032.google.api.Visibil"
          + "ityRule:V\n\020field_visibility\022\035.google.pro"
          + "tobuf.FieldOptions\030\257\312\274\" \001(\0132\032.google.api"
          + ".VisibilityRule:Z\n\022message_visibility\022\037."
          + "google.protobuf.MessageOptions\030\257\312\274\" \001(\0132"
          + "\032.google.api.VisibilityRule:X\n\021method_vi"
          + "sibility\022\036.google.protobuf.MethodOptions"
          + "\030\257\312\274\" \001(\0132\032.google.api.VisibilityRule:V\n"
          + "\016api_visibility\022\037.google.protobuf.Servic"
          + "eOptions\030\257\312\274\" \001(\0132\032.google.api.Visibilit"
          + "yRuleBn\n\016com.google.apiB\017VisibilityProto"
          + "P\001Z?google.golang.org/genproto/googleapi"
          + "s/api/visibility;visibility\370\001\001\242\002\004GAPIb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DescriptorProtos.getDescriptor(),
            });
    internal_static_google_api_Visibility_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Visibility_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Visibility_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_api_VisibilityRule_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_VisibilityRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_VisibilityRule_descriptor,
            new java.lang.String[] {
              "Selector", "Restriction",
            });
    enumVisibility.internalInit(descriptor.getExtensions().get(0));
    valueVisibility.internalInit(descriptor.getExtensions().get(1));
    fieldVisibility.internalInit(descriptor.getExtensions().get(2));
    messageVisibility.internalInit(descriptor.getExtensions().get(3));
    methodVisibility.internalInit(descriptor.getExtensions().get(4));
    apiVisibility.internalInit(descriptor.getExtensions().get(5));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
