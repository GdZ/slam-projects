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
 * Timestamp.
 *
 * Timestamp may be also used to model duration.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.Timestamp}
 */
public final class Timestamp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.Timestamp)
    TimestampOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Timestamp.newBuilder() to construct.
  private Timestamp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Timestamp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Timestamp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Timestamp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Timestamp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.Timestamp.class, org.sensoris.types.base.Timestamp.Builder.class);
  }

  private int bitField0_;
  public static final int POSIX_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value posixTime_;
  /**
   * <pre>
   * POSIX time in milliseconds.
   *
   * &#64;unit MilliSecond
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time = 1;</code>
   * @return Whether the posixTime field is set.
   */
  @java.lang.Override
  public boolean hasPosixTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * POSIX time in milliseconds.
   *
   * &#64;unit MilliSecond
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time = 1;</code>
   * @return The posixTime.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getPosixTime() {
    return posixTime_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : posixTime_;
  }
  /**
   * <pre>
   * POSIX time in milliseconds.
   *
   * &#64;unit MilliSecond
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getPosixTimeOrBuilder() {
    return posixTime_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : posixTime_;
  }

  public static final int POSIX_TIME_FRACTION_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value posixTimeFraction_;
  /**
   * <pre>
   * Microseconds fraction of POSIX time.
   *
   * &#64;unit MicroSecond
   * &#64;resolution 1
   * &#64;range [0, 1000)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the posixTimeFraction field is set.
   */
  @java.lang.Override
  public boolean hasPosixTimeFraction() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Microseconds fraction of POSIX time.
   *
   * &#64;unit MicroSecond
   * &#64;resolution 1
   * &#64;range [0, 1000)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The posixTimeFraction.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getPosixTimeFraction() {
    return posixTimeFraction_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : posixTimeFraction_;
  }
  /**
   * <pre>
   * Microseconds fraction of POSIX time.
   *
   * &#64;unit MicroSecond
   * &#64;resolution 1
   * &#64;range [0, 1000)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getPosixTimeFractionOrBuilder() {
    return posixTimeFraction_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : posixTimeFraction_;
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
      output.writeMessage(1, getPosixTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getPosixTimeFraction());
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
        .computeMessageSize(1, getPosixTime());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPosixTimeFraction());
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
    if (!(obj instanceof org.sensoris.types.base.Timestamp)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.Timestamp other = (org.sensoris.types.base.Timestamp) obj;

    if (hasPosixTime() != other.hasPosixTime()) return false;
    if (hasPosixTime()) {
      if (!getPosixTime()
          .equals(other.getPosixTime())) return false;
    }
    if (hasPosixTimeFraction() != other.hasPosixTimeFraction()) return false;
    if (hasPosixTimeFraction()) {
      if (!getPosixTimeFraction()
          .equals(other.getPosixTimeFraction())) return false;
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
    if (hasPosixTime()) {
      hash = (37 * hash) + POSIX_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPosixTime().hashCode();
    }
    if (hasPosixTimeFraction()) {
      hash = (37 * hash) + POSIX_TIME_FRACTION_FIELD_NUMBER;
      hash = (53 * hash) + getPosixTimeFraction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.Timestamp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.sensoris.types.base.Timestamp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.sensoris.types.base.Timestamp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Timestamp parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.Timestamp prototype) {
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
   * Timestamp.
   *
   * Timestamp may be also used to model duration.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.Timestamp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.Timestamp)
      org.sensoris.types.base.TimestampOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Timestamp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Timestamp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.Timestamp.class, org.sensoris.types.base.Timestamp.Builder.class);
    }

    // Construct using org.sensoris.types.base.Timestamp.newBuilder()
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
        getPosixTimeFieldBuilder();
        getPosixTimeFractionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      posixTime_ = null;
      if (posixTimeBuilder_ != null) {
        posixTimeBuilder_.dispose();
        posixTimeBuilder_ = null;
      }
      posixTimeFraction_ = null;
      if (posixTimeFractionBuilder_ != null) {
        posixTimeFractionBuilder_.dispose();
        posixTimeFractionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Timestamp_descriptor;
    }

    @java.lang.Override
    public org.sensoris.types.base.Timestamp getDefaultInstanceForType() {
      return org.sensoris.types.base.Timestamp.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.types.base.Timestamp build() {
      org.sensoris.types.base.Timestamp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.types.base.Timestamp buildPartial() {
      org.sensoris.types.base.Timestamp result = new org.sensoris.types.base.Timestamp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.sensoris.types.base.Timestamp result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.posixTime_ = posixTimeBuilder_ == null
            ? posixTime_
            : posixTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.posixTimeFraction_ = posixTimeFractionBuilder_ == null
            ? posixTimeFraction_
            : posixTimeFractionBuilder_.build();
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
      if (other instanceof org.sensoris.types.base.Timestamp) {
        return mergeFrom((org.sensoris.types.base.Timestamp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.Timestamp other) {
      if (other == org.sensoris.types.base.Timestamp.getDefaultInstance()) return this;
      if (other.hasPosixTime()) {
        mergePosixTime(other.getPosixTime());
      }
      if (other.hasPosixTimeFraction()) {
        mergePosixTimeFraction(other.getPosixTimeFraction());
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
                  getPosixTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPosixTimeFractionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.protobuf.Int64Value posixTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> posixTimeBuilder_;
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     * @return Whether the posixTime field is set.
     */
    public boolean hasPosixTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     * @return The posixTime.
     */
    public com.google.protobuf.Int64Value getPosixTime() {
      if (posixTimeBuilder_ == null) {
        return posixTime_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : posixTime_;
      } else {
        return posixTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     */
    public Builder setPosixTime(com.google.protobuf.Int64Value value) {
      if (posixTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        posixTime_ = value;
      } else {
        posixTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     */
    public Builder setPosixTime(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (posixTimeBuilder_ == null) {
        posixTime_ = builderForValue.build();
      } else {
        posixTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     */
    public Builder mergePosixTime(com.google.protobuf.Int64Value value) {
      if (posixTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          posixTime_ != null &&
          posixTime_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getPosixTimeBuilder().mergeFrom(value);
        } else {
          posixTime_ = value;
        }
      } else {
        posixTimeBuilder_.mergeFrom(value);
      }
      if (posixTime_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     */
    public Builder clearPosixTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      posixTime_ = null;
      if (posixTimeBuilder_ != null) {
        posixTimeBuilder_.dispose();
        posixTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getPosixTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPosixTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getPosixTimeOrBuilder() {
      if (posixTimeBuilder_ != null) {
        return posixTimeBuilder_.getMessageOrBuilder();
      } else {
        return posixTime_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : posixTime_;
      }
    }
    /**
     * <pre>
     * POSIX time in milliseconds.
     *
     * &#64;unit MilliSecond
     * &#64;resolution 1
     * &#64;range [0, )
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getPosixTimeFieldBuilder() {
      if (posixTimeBuilder_ == null) {
        posixTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getPosixTime(),
                getParentForChildren(),
                isClean());
        posixTime_ = null;
      }
      return posixTimeBuilder_;
    }

    private com.google.protobuf.Int64Value posixTimeFraction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> posixTimeFractionBuilder_;
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     * @return Whether the posixTimeFraction field is set.
     */
    public boolean hasPosixTimeFraction() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     * @return The posixTimeFraction.
     */
    public com.google.protobuf.Int64Value getPosixTimeFraction() {
      if (posixTimeFractionBuilder_ == null) {
        return posixTimeFraction_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : posixTimeFraction_;
      } else {
        return posixTimeFractionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public Builder setPosixTimeFraction(com.google.protobuf.Int64Value value) {
      if (posixTimeFractionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        posixTimeFraction_ = value;
      } else {
        posixTimeFractionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public Builder setPosixTimeFraction(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (posixTimeFractionBuilder_ == null) {
        posixTimeFraction_ = builderForValue.build();
      } else {
        posixTimeFractionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public Builder mergePosixTimeFraction(com.google.protobuf.Int64Value value) {
      if (posixTimeFractionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          posixTimeFraction_ != null &&
          posixTimeFraction_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getPosixTimeFractionBuilder().mergeFrom(value);
        } else {
          posixTimeFraction_ = value;
        }
      } else {
        posixTimeFractionBuilder_.mergeFrom(value);
      }
      if (posixTimeFraction_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public Builder clearPosixTimeFraction() {
      bitField0_ = (bitField0_ & ~0x00000002);
      posixTimeFraction_ = null;
      if (posixTimeFractionBuilder_ != null) {
        posixTimeFractionBuilder_.dispose();
        posixTimeFractionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public com.google.protobuf.Int64Value.Builder getPosixTimeFractionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPosixTimeFractionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getPosixTimeFractionOrBuilder() {
      if (posixTimeFractionBuilder_ != null) {
        return posixTimeFractionBuilder_.getMessageOrBuilder();
      } else {
        return posixTimeFraction_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : posixTimeFraction_;
      }
    }
    /**
     * <pre>
     * Microseconds fraction of POSIX time.
     *
     * &#64;unit MicroSecond
     * &#64;resolution 1
     * &#64;range [0, 1000)
     * </pre>
     *
     * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getPosixTimeFractionFieldBuilder() {
      if (posixTimeFractionBuilder_ == null) {
        posixTimeFractionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getPosixTimeFraction(),
                getParentForChildren(),
                isClean());
        posixTimeFraction_ = null;
      }
      return posixTimeFractionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.Timestamp)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.Timestamp)
  private static final org.sensoris.types.base.Timestamp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.Timestamp();
  }

  public static org.sensoris.types.base.Timestamp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Timestamp>
      PARSER = new com.google.protobuf.AbstractParser<Timestamp>() {
    @java.lang.Override
    public Timestamp parsePartialFrom(
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

  public static com.google.protobuf.Parser<Timestamp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Timestamp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.types.base.Timestamp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

