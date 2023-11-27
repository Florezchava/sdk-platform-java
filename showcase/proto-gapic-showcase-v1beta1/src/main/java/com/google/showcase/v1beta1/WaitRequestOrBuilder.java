// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

// Protobuf Java Version: 3.25.1
package com.google.showcase.v1beta1;

public interface WaitRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.WaitRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time that this operation will complete.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The time that this operation will complete.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * The time that this operation will complete.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * The duration of this operation.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 4;</code>
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   * <pre>
   * The duration of this operation.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 4;</code>
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   * <pre>
   * The duration of this operation.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();

  /**
   * <pre>
   * The error that will be returned by the server. If this code is specified
   * to be the OK rpc code, an empty response will be returned.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * The error that will be returned by the server. If this code is specified
   * to be the OK rpc code, an empty response will be returned.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * The error that will be returned by the server. If this code is specified
   * to be the OK rpc code, an empty response will be returned.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The response to be returned on operation completion.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.WaitResponse success = 3;</code>
   * @return Whether the success field is set.
   */
  boolean hasSuccess();
  /**
   * <pre>
   * The response to be returned on operation completion.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.WaitResponse success = 3;</code>
   * @return The success.
   */
  com.google.showcase.v1beta1.WaitResponse getSuccess();
  /**
   * <pre>
   * The response to be returned on operation completion.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.WaitResponse success = 3;</code>
   */
  com.google.showcase.v1beta1.WaitResponseOrBuilder getSuccessOrBuilder();

  com.google.showcase.v1beta1.WaitRequest.EndCase getEndCase();

  com.google.showcase.v1beta1.WaitRequest.ResponseCase getResponseCase();
}
