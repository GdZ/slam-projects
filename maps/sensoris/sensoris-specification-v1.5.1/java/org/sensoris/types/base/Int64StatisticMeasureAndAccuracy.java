/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

/**
 * <pre>
 * Statistic measure of int64 value and accuracy.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy}
 */
public final class Int64StatisticMeasureAndAccuracy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
    Int64StatisticMeasureAndAccuracyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int64StatisticMeasureAndAccuracy.newBuilder() to construct.
  private Int64StatisticMeasureAndAccuracy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64StatisticMeasureAndAccuracy() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Int64StatisticMeasureAndAccuracy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.class, org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_INTERVAL_FIELD_NUMBER = 1;
  private org.sensoris.types.base.TimestampInterval timestampInterval_;
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   * @return Whether the timestampInterval field is set.
   */
  @java.lang.Override
  public boolean hasTimestampInterval() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   * @return The timestampInterval.
   */
  @java.lang.Override
  public org.sensoris.types.base.TimestampInterval getTimestampInterval() {
    return timestampInterval_ == null ? org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
  }
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder() {
    return timestampInterval_ == null ? org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   * @return The type.
   */
  @java.lang.Override public org.sensoris.types.base.StatisticMeasureType getType() {
    org.sensoris.types.base.StatisticMeasureType result = org.sensoris.types.base.StatisticMeasureType.forNumber(type_);
    return result == null ? org.sensoris.types.base.StatisticMeasureType.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private long value_ = 0L;
  /**
   * <pre>
   * Value.
   * </pre>
   *
   * <code>int64 value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }

  public static final int ACCURACY_FIELD_NUMBER = 4;
  private com.google.protobuf.Int64Value accuracy_;
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   * @return Whether the accuracy field is set.
   */
  @java.lang.Override
  public boolean hasAccuracy() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   * @return The accuracy.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getAccuracy() {
    return accuracy_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : accuracy_;
  }
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getAccuracyOrBuilder() {
    return accuracy_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : accuracy_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTimestampInterval());
    }
    if (type_ != org.sensoris.types.base.StatisticMeasureType.UNKNOWN_STATISTIC_MEASURE_TYPE.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (value_ != 0L) {
      output.writeInt64(3, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getAccuracy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestampInterval());
    }
    if (type_ != org.sensoris.types.base.StatisticMeasureType.UNKNOWN_STATISTIC_MEASURE_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAccuracy());
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
    if (!(obj instanceof org.sensoris.types.base.Int64StatisticMeasureAndAccuracy)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.Int64StatisticMeasureAndAccuracy other = (org.sensoris.types.base.Int64StatisticMeasureAndAccuracy) obj;

    if (hasTimestampInterval() != other.hasTimestampInterval()) return false;
    if (hasTimestampInterval()) {
      if (!getTimestampInterval()
          .equals(other.getTimestampInterval())) return false;
    }
    if (type_ != other.type_) return false;
    if (getValue()
        != other.getValue()) return false;
    if (hasAccuracy() != other.hasAccuracy()) return false;
    if (hasAccuracy()) {
      if (!getAccuracy()
          .equals(other.getAccuracy())) return false;
    }
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
    if (hasTimestampInterval()) {
      hash = (37 * hash) + TIMESTAMP_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getTimestampInterval().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    if (hasAccuracy()) {
      hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + getAccuracy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.sensoris.types.base.Int64StatisticMeasureAndAccuracy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Statistic measure of int64 value and accuracy.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
      org.sensoris.types.base.Int64StatisticMeasureAndAccuracyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.class, org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.Builder.class);
    }

    // Construct using org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTimestampIntervalFieldBuilder();
        getAccuracyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timestampInterval_ = null;
      if (timestampIntervalBuilder_ != null) {
        timestampIntervalBuilder_.dispose();
        timestampIntervalBuilder_ = null;
      }
      type_ = 0;
      value_ = 0L;
      accuracy_ = null;
      if (accuracyBuilder_ != null) {
        accuracyBuilder_.dispose();
        accuracyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_descriptor;
    }

    @java.lang.Override
    public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy getDefaultInstanceForType() {
      return org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy build() {
      org.sensoris.types.base.Int64StatisticMeasureAndAccuracy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy buildPartial() {
      org.sensoris.types.base.Int64StatisticMeasureAndAccuracy result = new org.sensoris.types.base.Int64StatisticMeasureAndAccuracy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.sensoris.types.base.Int64StatisticMeasureAndAccuracy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timestampInterval_ = timestampIntervalBuilder_ == null
            ? timestampInterval_
            : timestampIntervalBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.accuracy_ = accuracyBuilder_ == null
            ? accuracy_
            : accuracyBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.sensoris.types.base.Int64StatisticMeasureAndAccuracy) {
        return mergeFrom((org.sensoris.types.base.Int64StatisticMeasureAndAccuracy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.Int64StatisticMeasureAndAccuracy other) {
      if (other == org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.getDefaultInstance()) return this;
      if (other.hasTimestampInterval()) {
        mergeTimestampInterval(other.getTimestampInterval());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      if (other.hasAccuracy()) {
        mergeAccuracy(other.getAccuracy());
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
            case 10: {
              input.readMessage(
                  getTimestampIntervalFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              value_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getAccuracyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
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

    private org.sensoris.types.base.TimestampInterval timestampInterval_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder> timestampIntervalBuilder_;
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     * @return Whether the timestampInterval field is set.
     */
    public boolean hasTimestampInterval() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     * @return The timestampInterval.
     */
    public org.sensoris.types.base.TimestampInterval getTimestampInterval() {
      if (timestampIntervalBuilder_ == null) {
        return timestampInterval_ == null ? org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
      } else {
        return timestampIntervalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder setTimestampInterval(org.sensoris.types.base.TimestampInterval value) {
      if (timestampIntervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestampInterval_ = value;
      } else {
        timestampIntervalBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder setTimestampInterval(
        org.sensoris.types.base.TimestampInterval.Builder builderForValue) {
      if (timestampIntervalBuilder_ == null) {
        timestampInterval_ = builderForValue.build();
      } else {
        timestampIntervalBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder mergeTimestampInterval(org.sensoris.types.base.TimestampInterval value) {
      if (timestampIntervalBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          timestampInterval_ != null &&
          timestampInterval_ != org.sensoris.types.base.TimestampInterval.getDefaultInstance()) {
          getTimestampIntervalBuilder().mergeFrom(value);
        } else {
          timestampInterval_ = value;
        }
      } else {
        timestampIntervalBuilder_.mergeFrom(value);
      }
      if (timestampInterval_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder clearTimestampInterval() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timestampInterval_ = null;
      if (timestampIntervalBuilder_ != null) {
        timestampIntervalBuilder_.dispose();
        timestampIntervalBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampInterval.Builder getTimestampIntervalBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimestampIntervalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder() {
      if (timestampIntervalBuilder_ != null) {
        return timestampIntervalBuilder_.getMessageOrBuilder();
      } else {
        return timestampInterval_ == null ?
            org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
      }
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder> 
        getTimestampIntervalFieldBuilder() {
      if (timestampIntervalBuilder_ == null) {
        timestampIntervalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder>(
                getTimestampInterval(),
                getParentForChildren(),
                isClean());
        timestampInterval_ = null;
      }
      return timestampIntervalBuilder_;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.sensoris.types.base.StatisticMeasureType getType() {
      org.sensoris.types.base.StatisticMeasureType result = org.sensoris.types.base.StatisticMeasureType.forNumber(type_);
      return result == null ? org.sensoris.types.base.StatisticMeasureType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.sensoris.types.base.StatisticMeasureType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {

      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value accuracy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> accuracyBuilder_;
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     * @return Whether the accuracy field is set.
     */
    public boolean hasAccuracy() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     * @return The accuracy.
     */
    public com.google.protobuf.Int64Value getAccuracy() {
      if (accuracyBuilder_ == null) {
        return accuracy_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : accuracy_;
      } else {
        return accuracyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder setAccuracy(com.google.protobuf.Int64Value value) {
      if (accuracyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accuracy_ = value;
      } else {
        accuracyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder setAccuracy(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (accuracyBuilder_ == null) {
        accuracy_ = builderForValue.build();
      } else {
        accuracyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder mergeAccuracy(com.google.protobuf.Int64Value value) {
      if (accuracyBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          accuracy_ != null &&
          accuracy_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getAccuracyBuilder().mergeFrom(value);
        } else {
          accuracy_ = value;
        }
      } else {
        accuracyBuilder_.mergeFrom(value);
      }
      if (accuracy_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder clearAccuracy() {
      bitField0_ = (bitField0_ & ~0x00000008);
      accuracy_ = null;
      if (accuracyBuilder_ != null) {
        accuracyBuilder_.dispose();
        accuracyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public com.google.protobuf.Int64Value.Builder getAccuracyBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAccuracyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getAccuracyOrBuilder() {
      if (accuracyBuilder_ != null) {
        return accuracyBuilder_.getMessageOrBuilder();
      } else {
        return accuracy_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : accuracy_;
      }
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getAccuracyFieldBuilder() {
      if (accuracyBuilder_ == null) {
        accuracyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getAccuracy(),
                getParentForChildren(),
                isClean());
        accuracy_ = null;
      }
      return accuracyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
  private static final org.sensoris.types.base.Int64StatisticMeasureAndAccuracy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.Int64StatisticMeasureAndAccuracy();
  }

  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64StatisticMeasureAndAccuracy>
      PARSER = new com.google.protobuf.AbstractParser<Int64StatisticMeasureAndAccuracy>() {
    @java.lang.Override
    public Int64StatisticMeasureAndAccuracy parsePartialFrom(
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

  public static com.google.protobuf.Parser<Int64StatisticMeasureAndAccuracy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64StatisticMeasureAndAccuracy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

