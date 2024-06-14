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
// source: google/api/context.proto
// Protobuf Java Version: 4.27.1

package com.google.api;

public final class ContextProto {
  private ContextProto() {}

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 1,
        /* suffix= */ "",
        ContextProto.class.getName());
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Context_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_ContextRule_descriptor;
  static final com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_ContextRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/context.proto\022\ngoogle.api\"1"
          + "\n\007Context\022&\n\005rules\030\001 \003(\0132\027.google.api.Co"
          + "ntextRule\"\215\001\n\013ContextRule\022\020\n\010selector\030\001 "
          + "\001(\t\022\021\n\trequested\030\002 \003(\t\022\020\n\010provided\030\003 \003(\t"
          + "\022\"\n\032allowed_request_extensions\030\004 \003(\t\022#\n\033"
          + "allowed_response_extensions\030\005 \003(\tBn\n\016com"
          + ".google.apiB\014ContextProtoP\001ZEgoogle.gola"
          + "ng.org/genproto/googleapis/api/serviceco"
          + "nfig;serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_api_Context_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Context_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_api_Context_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_api_ContextRule_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_ContextRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_google_api_ContextRule_descriptor,
            new java.lang.String[] {
              "Selector",
              "Requested",
              "Provided",
              "AllowedRequestExtensions",
              "AllowedResponseExtensions",
            });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
