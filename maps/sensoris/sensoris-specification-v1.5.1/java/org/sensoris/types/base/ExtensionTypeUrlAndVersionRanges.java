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
 * Proprietary extension type URL and format version ranges of the extension.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.ExtensionTypeUrlAndVersionRanges}
 */
public final class ExtensionTypeUrlAndVersionRanges extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersionRanges)
    ExtensionTypeUrlAndVersionRangesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtensionTypeUrlAndVersionRanges.newBuilder() to construct.
  private ExtensionTypeUrlAndVersionRanges(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtensionTypeUrlAndVersionRanges() {
    versionRange_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExtensionTypeUrlAndVersionRanges();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersionRanges_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersionRanges_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges.class, org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_URL_FIELD_NUMBER = 1;
  private org.sensoris.types.base.ExtensionTypeUrl typeUrl_;
  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
   * @return Whether the typeUrl field is set.
   */
  @java.lang.Override
  public boolean hasTypeUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
   * @return The typeUrl.
   */
  @java.lang.Override
  public org.sensoris.types.base.ExtensionTypeUrl getTypeUrl() {
    return typeUrl_ == null ? org.sensoris.types.base.ExtensionTypeUrl.getDefaultInstance() : typeUrl_;
  }
  /**
   * <pre>
   * Type URL of proprietary extension.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.ExtensionTypeUrlOrBuilder getTypeUrlOrBuilder() {
    return typeUrl_ == null ? org.sensoris.types.base.ExtensionTypeUrl.getDefaultInstance() : typeUrl_;
  }

  public static final int VERSION_RANGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.sensoris.types.base.VersionRange> versionRange_;
  /**
   * <pre>
   * Version range.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.sensoris.types.base.VersionRange> getVersionRangeList() {
    return versionRange_;
  }
  /**
   * <pre>
   * Version range.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.sensoris.types.base.VersionRangeOrBuilder> 
      getVersionRangeOrBuilderList() {
    return versionRange_;
  }
  /**
   * <pre>
   * Version range.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
   */
  @java.lang.Override
  public int getVersionRangeCount() {
    return versionRange_.size();
  }
  /**
   * <pre>
   * Version range.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.VersionRange getVersionRange(int index) {
    return versionRange_.get(index);
  }
  /**
   * <pre>
   * Version range.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.VersionRangeOrBuilder getVersionRangeOrBuilder(
      int index) {
    return versionRange_.get(index);
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
      output.writeMessage(1, getTypeUrl());
    }
    for (int i = 0; i < versionRange_.size(); i++) {
      output.writeMessage(2, versionRange_.get(i));
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
        .computeMessageSize(1, getTypeUrl());
    }
    for (int i = 0; i < versionRange_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, versionRange_.get(i));
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
    if (!(obj instanceof org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges other = (org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges) obj;

    if (hasTypeUrl() != other.hasTypeUrl()) return false;
    if (hasTypeUrl()) {
      if (!getTypeUrl()
          .equals(other.getTypeUrl())) return false;
    }
    if (!getVersionRangeList()
        .equals(other.getVersionRangeList())) return false;
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
    if (hasTypeUrl()) {
      hash = (37 * hash) + TYPE_URL_FIELD_NUMBER;
      hash = (53 * hash) + getTypeUrl().hashCode();
    }
    if (getVersionRangeCount() > 0) {
      hash = (37 * hash) + VERSION_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getVersionRangeList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges prototype) {
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
   * Proprietary extension type URL and format version ranges of the extension.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.ExtensionTypeUrlAndVersionRanges}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersionRanges)
      org.sensoris.types.base.ExtensionTypeUrlAndVersionRangesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersionRanges_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersionRanges_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges.class, org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges.Builder.class);
    }

    // Construct using org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges.newBuilder()
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
        getTypeUrlFieldBuilder();
        getVersionRangeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      typeUrl_ = null;
      if (typeUrlBuilder_ != null) {
        typeUrlBuilder_.dispose();
        typeUrlBuilder_ = null;
      }
      if (versionRangeBuilder_ == null) {
        versionRange_ = java.util.Collections.emptyList();
      } else {
        versionRange_ = null;
        versionRangeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersionRanges_descriptor;
    }

    @java.lang.Override
    public org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges getDefaultInstanceForType() {
      return org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges build() {
      org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges buildPartial() {
      org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges result = new org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges result) {
      if (versionRangeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          versionRange_ = java.util.Collections.unmodifiableList(versionRange_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.versionRange_ = versionRange_;
      } else {
        result.versionRange_ = versionRangeBuilder_.build();
      }
    }

    private void buildPartial0(org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.typeUrl_ = typeUrlBuilder_ == null
            ? typeUrl_
            : typeUrlBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges) {
        return mergeFrom((org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges other) {
      if (other == org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges.getDefaultInstance()) return this;
      if (other.hasTypeUrl()) {
        mergeTypeUrl(other.getTypeUrl());
      }
      if (versionRangeBuilder_ == null) {
        if (!other.versionRange_.isEmpty()) {
          if (versionRange_.isEmpty()) {
            versionRange_ = other.versionRange_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureVersionRangeIsMutable();
            versionRange_.addAll(other.versionRange_);
          }
          onChanged();
        }
      } else {
        if (!other.versionRange_.isEmpty()) {
          if (versionRangeBuilder_.isEmpty()) {
            versionRangeBuilder_.dispose();
            versionRangeBuilder_ = null;
            versionRange_ = other.versionRange_;
            bitField0_ = (bitField0_ & ~0x00000002);
            versionRangeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVersionRangeFieldBuilder() : null;
          } else {
            versionRangeBuilder_.addAllMessages(other.versionRange_);
          }
        }
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
                  getTypeUrlFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              org.sensoris.types.base.VersionRange m =
                  input.readMessage(
                      org.sensoris.types.base.VersionRange.parser(),
                      extensionRegistry);
              if (versionRangeBuilder_ == null) {
                ensureVersionRangeIsMutable();
                versionRange_.add(m);
              } else {
                versionRangeBuilder_.addMessage(m);
              }
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

    private org.sensoris.types.base.ExtensionTypeUrl typeUrl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.ExtensionTypeUrl, org.sensoris.types.base.ExtensionTypeUrl.Builder, org.sensoris.types.base.ExtensionTypeUrlOrBuilder> typeUrlBuilder_;
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     * @return Whether the typeUrl field is set.
     */
    public boolean hasTypeUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     * @return The typeUrl.
     */
    public org.sensoris.types.base.ExtensionTypeUrl getTypeUrl() {
      if (typeUrlBuilder_ == null) {
        return typeUrl_ == null ? org.sensoris.types.base.ExtensionTypeUrl.getDefaultInstance() : typeUrl_;
      } else {
        return typeUrlBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     */
    public Builder setTypeUrl(org.sensoris.types.base.ExtensionTypeUrl value) {
      if (typeUrlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typeUrl_ = value;
      } else {
        typeUrlBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     */
    public Builder setTypeUrl(
        org.sensoris.types.base.ExtensionTypeUrl.Builder builderForValue) {
      if (typeUrlBuilder_ == null) {
        typeUrl_ = builderForValue.build();
      } else {
        typeUrlBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     */
    public Builder mergeTypeUrl(org.sensoris.types.base.ExtensionTypeUrl value) {
      if (typeUrlBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          typeUrl_ != null &&
          typeUrl_ != org.sensoris.types.base.ExtensionTypeUrl.getDefaultInstance()) {
          getTypeUrlBuilder().mergeFrom(value);
        } else {
          typeUrl_ = value;
        }
      } else {
        typeUrlBuilder_.mergeFrom(value);
      }
      if (typeUrl_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     */
    public Builder clearTypeUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      typeUrl_ = null;
      if (typeUrlBuilder_ != null) {
        typeUrlBuilder_.dispose();
        typeUrlBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     */
    public org.sensoris.types.base.ExtensionTypeUrl.Builder getTypeUrlBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTypeUrlFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     */
    public org.sensoris.types.base.ExtensionTypeUrlOrBuilder getTypeUrlOrBuilder() {
      if (typeUrlBuilder_ != null) {
        return typeUrlBuilder_.getMessageOrBuilder();
      } else {
        return typeUrl_ == null ?
            org.sensoris.types.base.ExtensionTypeUrl.getDefaultInstance() : typeUrl_;
      }
    }
    /**
     * <pre>
     * Type URL of proprietary extension.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.ExtensionTypeUrl type_url = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.ExtensionTypeUrl, org.sensoris.types.base.ExtensionTypeUrl.Builder, org.sensoris.types.base.ExtensionTypeUrlOrBuilder> 
        getTypeUrlFieldBuilder() {
      if (typeUrlBuilder_ == null) {
        typeUrlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.ExtensionTypeUrl, org.sensoris.types.base.ExtensionTypeUrl.Builder, org.sensoris.types.base.ExtensionTypeUrlOrBuilder>(
                getTypeUrl(),
                getParentForChildren(),
                isClean());
        typeUrl_ = null;
      }
      return typeUrlBuilder_;
    }

    private java.util.List<org.sensoris.types.base.VersionRange> versionRange_ =
      java.util.Collections.emptyList();
    private void ensureVersionRangeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        versionRange_ = new java.util.ArrayList<org.sensoris.types.base.VersionRange>(versionRange_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.types.base.VersionRange, org.sensoris.types.base.VersionRange.Builder, org.sensoris.types.base.VersionRangeOrBuilder> versionRangeBuilder_;

    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public java.util.List<org.sensoris.types.base.VersionRange> getVersionRangeList() {
      if (versionRangeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(versionRange_);
      } else {
        return versionRangeBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public int getVersionRangeCount() {
      if (versionRangeBuilder_ == null) {
        return versionRange_.size();
      } else {
        return versionRangeBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public org.sensoris.types.base.VersionRange getVersionRange(int index) {
      if (versionRangeBuilder_ == null) {
        return versionRange_.get(index);
      } else {
        return versionRangeBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder setVersionRange(
        int index, org.sensoris.types.base.VersionRange value) {
      if (versionRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionRangeIsMutable();
        versionRange_.set(index, value);
        onChanged();
      } else {
        versionRangeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder setVersionRange(
        int index, org.sensoris.types.base.VersionRange.Builder builderForValue) {
      if (versionRangeBuilder_ == null) {
        ensureVersionRangeIsMutable();
        versionRange_.set(index, builderForValue.build());
        onChanged();
      } else {
        versionRangeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder addVersionRange(org.sensoris.types.base.VersionRange value) {
      if (versionRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionRangeIsMutable();
        versionRange_.add(value);
        onChanged();
      } else {
        versionRangeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder addVersionRange(
        int index, org.sensoris.types.base.VersionRange value) {
      if (versionRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionRangeIsMutable();
        versionRange_.add(index, value);
        onChanged();
      } else {
        versionRangeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder addVersionRange(
        org.sensoris.types.base.VersionRange.Builder builderForValue) {
      if (versionRangeBuilder_ == null) {
        ensureVersionRangeIsMutable();
        versionRange_.add(builderForValue.build());
        onChanged();
      } else {
        versionRangeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder addVersionRange(
        int index, org.sensoris.types.base.VersionRange.Builder builderForValue) {
      if (versionRangeBuilder_ == null) {
        ensureVersionRangeIsMutable();
        versionRange_.add(index, builderForValue.build());
        onChanged();
      } else {
        versionRangeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder addAllVersionRange(
        java.lang.Iterable<? extends org.sensoris.types.base.VersionRange> values) {
      if (versionRangeBuilder_ == null) {
        ensureVersionRangeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, versionRange_);
        onChanged();
      } else {
        versionRangeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder clearVersionRange() {
      if (versionRangeBuilder_ == null) {
        versionRange_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        versionRangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public Builder removeVersionRange(int index) {
      if (versionRangeBuilder_ == null) {
        ensureVersionRangeIsMutable();
        versionRange_.remove(index);
        onChanged();
      } else {
        versionRangeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public org.sensoris.types.base.VersionRange.Builder getVersionRangeBuilder(
        int index) {
      return getVersionRangeFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public org.sensoris.types.base.VersionRangeOrBuilder getVersionRangeOrBuilder(
        int index) {
      if (versionRangeBuilder_ == null) {
        return versionRange_.get(index);  } else {
        return versionRangeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public java.util.List<? extends org.sensoris.types.base.VersionRangeOrBuilder> 
         getVersionRangeOrBuilderList() {
      if (versionRangeBuilder_ != null) {
        return versionRangeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(versionRange_);
      }
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public org.sensoris.types.base.VersionRange.Builder addVersionRangeBuilder() {
      return getVersionRangeFieldBuilder().addBuilder(
          org.sensoris.types.base.VersionRange.getDefaultInstance());
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public org.sensoris.types.base.VersionRange.Builder addVersionRangeBuilder(
        int index) {
      return getVersionRangeFieldBuilder().addBuilder(
          index, org.sensoris.types.base.VersionRange.getDefaultInstance());
    }
    /**
     * <pre>
     * Version range.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.types.base.VersionRange version_range = 2;</code>
     */
    public java.util.List<org.sensoris.types.base.VersionRange.Builder> 
         getVersionRangeBuilderList() {
      return getVersionRangeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.types.base.VersionRange, org.sensoris.types.base.VersionRange.Builder, org.sensoris.types.base.VersionRangeOrBuilder> 
        getVersionRangeFieldBuilder() {
      if (versionRangeBuilder_ == null) {
        versionRangeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.sensoris.types.base.VersionRange, org.sensoris.types.base.VersionRange.Builder, org.sensoris.types.base.VersionRangeOrBuilder>(
                versionRange_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        versionRange_ = null;
      }
      return versionRangeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersionRanges)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersionRanges)
  private static final org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges();
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtensionTypeUrlAndVersionRanges>
      PARSER = new com.google.protobuf.AbstractParser<ExtensionTypeUrlAndVersionRanges>() {
    @java.lang.Override
    public ExtensionTypeUrlAndVersionRanges parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExtensionTypeUrlAndVersionRanges> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtensionTypeUrlAndVersionRanges> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.types.base.ExtensionTypeUrlAndVersionRanges getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
