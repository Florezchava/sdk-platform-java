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
// source: google/shopping/type/types.proto

// Protobuf Java Version: 3.25.4
package com.google.shopping.type;

/**
 *
 *
 * <pre>
 * The weight represented as the value in string and the unit.
 * </pre>
 *
 * Protobuf type {@code google.shopping.type.Weight}
 */
public final class Weight extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.type.Weight)
    WeightOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Weight.newBuilder() to construct.
  private Weight(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Weight() {
    unit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Weight();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.type.TypesProto
        .internal_static_google_shopping_type_Weight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.type.TypesProto
        .internal_static_google_shopping_type_Weight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.type.Weight.class, com.google.shopping.type.Weight.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The weight unit.
   * </pre>
   *
   * Protobuf enum {@code google.shopping.type.Weight.WeightUnit}
   */
  public enum WeightUnit implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * unit unspecified
     * </pre>
     *
     * <code>WEIGHT_UNIT_UNSPECIFIED = 0;</code>
     */
    WEIGHT_UNIT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * lb unit.
     * </pre>
     *
     * <code>POUND = 1;</code>
     */
    POUND(1),
    /**
     *
     *
     * <pre>
     * kg unit.
     * </pre>
     *
     * <code>KILOGRAM = 2;</code>
     */
    KILOGRAM(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * unit unspecified
     * </pre>
     *
     * <code>WEIGHT_UNIT_UNSPECIFIED = 0;</code>
     */
    public static final int WEIGHT_UNIT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * lb unit.
     * </pre>
     *
     * <code>POUND = 1;</code>
     */
    public static final int POUND_VALUE = 1;
    /**
     *
     *
     * <pre>
     * kg unit.
     * </pre>
     *
     * <code>KILOGRAM = 2;</code>
     */
    public static final int KILOGRAM_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WeightUnit valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WeightUnit forNumber(int value) {
      switch (value) {
        case 0:
          return WEIGHT_UNIT_UNSPECIFIED;
        case 1:
          return POUND;
        case 2:
          return KILOGRAM;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WeightUnit> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<WeightUnit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WeightUnit>() {
          public WeightUnit findValueByNumber(int number) {
            return WeightUnit.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.shopping.type.Weight.getDescriptor().getEnumTypes().get(0);
    }

    private static final WeightUnit[] VALUES = values();

    public static WeightUnit valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WeightUnit(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.shopping.type.Weight.WeightUnit)
  }

  private int bitField0_;
  public static final int AMOUNT_MICROS_FIELD_NUMBER = 1;
  private long amountMicros_ = 0L;
  /**
   *
   *
   * <pre>
   * Required. The weight represented as a number in micros (1 million micros is
   * an equivalent to one's currency standard unit, for example, 1 kg = 1000000
   * micros).
   * This field can also be set as infinity by setting to -1.
   * This field only support -1 and positive value.
   * </pre>
   *
   * <code>optional int64 amount_micros = 1;</code>
   *
   * @return Whether the amountMicros field is set.
   */
  @java.lang.Override
  public boolean hasAmountMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The weight represented as a number in micros (1 million micros is
   * an equivalent to one's currency standard unit, for example, 1 kg = 1000000
   * micros).
   * This field can also be set as infinity by setting to -1.
   * This field only support -1 and positive value.
   * </pre>
   *
   * <code>optional int64 amount_micros = 1;</code>
   *
   * @return The amountMicros.
   */
  @java.lang.Override
  public long getAmountMicros() {
    return amountMicros_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;
  private int unit_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The weight unit.
   * Acceptable values are: kg and lb
   * </pre>
   *
   * <code>.google.shopping.type.Weight.WeightUnit unit = 2;</code>
   *
   * @return The enum numeric value on the wire for unit.
   */
  @java.lang.Override
  public int getUnitValue() {
    return unit_;
  }
  /**
   *
   *
   * <pre>
   * Required. The weight unit.
   * Acceptable values are: kg and lb
   * </pre>
   *
   * <code>.google.shopping.type.Weight.WeightUnit unit = 2;</code>
   *
   * @return The unit.
   */
  @java.lang.Override
  public com.google.shopping.type.Weight.WeightUnit getUnit() {
    com.google.shopping.type.Weight.WeightUnit result =
        com.google.shopping.type.Weight.WeightUnit.forNumber(unit_);
    return result == null ? com.google.shopping.type.Weight.WeightUnit.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, amountMicros_);
    }
    if (unit_ != com.google.shopping.type.Weight.WeightUnit.WEIGHT_UNIT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, unit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, amountMicros_);
    }
    if (unit_ != com.google.shopping.type.Weight.WeightUnit.WEIGHT_UNIT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, unit_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.shopping.type.Weight)) {
      return super.equals(obj);
    }
    com.google.shopping.type.Weight other = (com.google.shopping.type.Weight) obj;

    if (hasAmountMicros() != other.hasAmountMicros()) return false;
    if (hasAmountMicros()) {
      if (getAmountMicros() != other.getAmountMicros()) return false;
    }
    if (unit_ != other.unit_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAmountMicros()) {
      hash = (37 * hash) + AMOUNT_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAmountMicros());
    }
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.type.Weight parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.type.Weight parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.type.Weight parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.type.Weight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.type.Weight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.type.Weight parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.type.Weight parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.type.Weight parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.type.Weight parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.type.Weight parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.type.Weight parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.type.Weight parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.shopping.type.Weight prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The weight represented as the value in string and the unit.
   * </pre>
   *
   * Protobuf type {@code google.shopping.type.Weight}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.type.Weight)
      com.google.shopping.type.WeightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.type.TypesProto
          .internal_static_google_shopping_type_Weight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.type.TypesProto
          .internal_static_google_shopping_type_Weight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.type.Weight.class, com.google.shopping.type.Weight.Builder.class);
    }

    // Construct using com.google.shopping.type.Weight.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      amountMicros_ = 0L;
      unit_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.type.TypesProto
          .internal_static_google_shopping_type_Weight_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.type.Weight getDefaultInstanceForType() {
      return com.google.shopping.type.Weight.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.type.Weight build() {
      com.google.shopping.type.Weight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.type.Weight buildPartial() {
      com.google.shopping.type.Weight result = new com.google.shopping.type.Weight(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.shopping.type.Weight result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.amountMicros_ = amountMicros_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.unit_ = unit_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.shopping.type.Weight) {
        return mergeFrom((com.google.shopping.type.Weight) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.type.Weight other) {
      if (other == com.google.shopping.type.Weight.getDefaultInstance()) return this;
      if (other.hasAmountMicros()) {
        setAmountMicros(other.getAmountMicros());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                amountMicros_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                unit_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private long amountMicros_;
    /**
     *
     *
     * <pre>
     * Required. The weight represented as a number in micros (1 million micros is
     * an equivalent to one's currency standard unit, for example, 1 kg = 1000000
     * micros).
     * This field can also be set as infinity by setting to -1.
     * This field only support -1 and positive value.
     * </pre>
     *
     * <code>optional int64 amount_micros = 1;</code>
     *
     * @return Whether the amountMicros field is set.
     */
    @java.lang.Override
    public boolean hasAmountMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The weight represented as a number in micros (1 million micros is
     * an equivalent to one's currency standard unit, for example, 1 kg = 1000000
     * micros).
     * This field can also be set as infinity by setting to -1.
     * This field only support -1 and positive value.
     * </pre>
     *
     * <code>optional int64 amount_micros = 1;</code>
     *
     * @return The amountMicros.
     */
    @java.lang.Override
    public long getAmountMicros() {
      return amountMicros_;
    }
    /**
     *
     *
     * <pre>
     * Required. The weight represented as a number in micros (1 million micros is
     * an equivalent to one's currency standard unit, for example, 1 kg = 1000000
     * micros).
     * This field can also be set as infinity by setting to -1.
     * This field only support -1 and positive value.
     * </pre>
     *
     * <code>optional int64 amount_micros = 1;</code>
     *
     * @param value The amountMicros to set.
     * @return This builder for chaining.
     */
    public Builder setAmountMicros(long value) {

      amountMicros_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The weight represented as a number in micros (1 million micros is
     * an equivalent to one's currency standard unit, for example, 1 kg = 1000000
     * micros).
     * This field can also be set as infinity by setting to -1.
     * This field only support -1 and positive value.
     * </pre>
     *
     * <code>optional int64 amount_micros = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAmountMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      amountMicros_ = 0L;
      onChanged();
      return this;
    }

    private int unit_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The weight unit.
     * Acceptable values are: kg and lb
     * </pre>
     *
     * <code>.google.shopping.type.Weight.WeightUnit unit = 2;</code>
     *
     * @return The enum numeric value on the wire for unit.
     */
    @java.lang.Override
    public int getUnitValue() {
      return unit_;
    }
    /**
     *
     *
     * <pre>
     * Required. The weight unit.
     * Acceptable values are: kg and lb
     * </pre>
     *
     * <code>.google.shopping.type.Weight.WeightUnit unit = 2;</code>
     *
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The weight unit.
     * Acceptable values are: kg and lb
     * </pre>
     *
     * <code>.google.shopping.type.Weight.WeightUnit unit = 2;</code>
     *
     * @return The unit.
     */
    @java.lang.Override
    public com.google.shopping.type.Weight.WeightUnit getUnit() {
      com.google.shopping.type.Weight.WeightUnit result =
          com.google.shopping.type.Weight.WeightUnit.forNumber(unit_);
      return result == null ? com.google.shopping.type.Weight.WeightUnit.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The weight unit.
     * Acceptable values are: kg and lb
     * </pre>
     *
     * <code>.google.shopping.type.Weight.WeightUnit unit = 2;</code>
     *
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(com.google.shopping.type.Weight.WeightUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The weight unit.
     * Acceptable values are: kg and lb
     * </pre>
     *
     * <code>.google.shopping.type.Weight.WeightUnit unit = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      unit_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.shopping.type.Weight)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.type.Weight)
  private static final com.google.shopping.type.Weight DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.type.Weight();
  }

  public static com.google.shopping.type.Weight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Weight> PARSER =
      new com.google.protobuf.AbstractParser<Weight>() {
        @java.lang.Override
        public Weight parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<Weight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Weight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.type.Weight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
