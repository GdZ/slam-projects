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
 * Proprietary extension type URL and format version of the extension.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.ExtensionTypeUrlAndVersion}
 */
public final class ExtensionTypeUrlAndVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersion)
    ExtensionTypeUrlAndVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtensionTypeUrlAndVersion.newBuilder() to construct.
  private ExtensionTypeUrlAndVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtensionTypeUrlAndVersion() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExtensionTypeUrlAndVersion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.ExtensionTypeUrlAndVersion.class, org.sensoris.types.base.ExtensionTypeUrlAndVersion.Builder.class);
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

  public static final int VERSION_FIELD_NUMBER = 2;
  private org.sensoris.types.base.Version version_;
  /**
   * <pre>
   * Version.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Version.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public org.sensoris.types.base.Version getVersion() {
    return version_ == null ? org.sensoris.types.base.Version.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * Version.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.VersionOrBuilder getVersionOrBuilder() {
    return version_ == null ? org.sensoris.types.base.Version.getDefaultInstance() : version_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getVersion());
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
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVersion());
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
    if (!(obj instanceof org.sensoris.types.base.ExtensionTypeUrlAndVersion)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.ExtensionTypeUrlAndVersion other = (org.sensoris.types.base.ExtensionTypeUrlAndVersion) obj;

    if (hasTypeUrl() != other.hasTypeUrl()) return false;
    if (hasTypeUrl()) {
      if (!getTypeUrl()
          .equals(other.getTypeUrl())) return false;
    }
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
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
    if (hasTypeUrl()) {
      hash = (37 * hash) + TYPE_URL_FIELD_NUMBER;
      hash = (53 * hash) + getTypeUrl().hashCode();
    }
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.ExtensionTypeUrlAndVersion prototype) {
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
   * Proprietary extension type URL and format version of the extension.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.ExtensionTypeUrlAndVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersion)
      org.sensoris.types.base.ExtensionTypeUrlAndVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.ExtensionTypeUrlAndVersion.class, org.sensoris.types.base.ExtensionTypeUrlAndVersion.Builder.class);
    }

    // Construct using org.sensoris.types.base.ExtensionTypeUrlAndVersion.newBuilder()
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
        getVersionFieldBuilder();
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
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_ExtensionTypeUrlAndVersion_descriptor;
    }

    @java.lang.Override
    public org.sensoris.types.base.ExtensionTypeUrlAndVersion getDefaultInstanceForType() {
      return org.sensoris.types.base.ExtensionTypeUrlAndVersion.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.types.base.ExtensionTypeUrlAndVersion build() {
      org.sensoris.types.base.ExtensionTypeUrlAndVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.types.base.ExtensionTypeUrlAndVersion buildPartial() {
      org.sensoris.types.base.ExtensionTypeUrlAndVersion result = new org.sensoris.types.base.ExtensionTypeUrlAndVersion(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.sensoris.types.base.ExtensionTypeUrlAndVersion result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.typeUrl_ = typeUrlBuilder_ == null
            ? typeUrl_
            : typeUrlBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = versionBuilder_ == null
            ? version_
            : versionBuilder_.build();
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
      if (other instanceof org.sensoris.types.base.ExtensionTypeUrlAndVersion) {
        return mergeFrom((org.sensoris.types.base.ExtensionTypeUrlAndVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.ExtensionTypeUrlAndVersion other) {
      if (other == org.sensoris.types.base.ExtensionTypeUrlAndVersion.getDefaultInstance()) return this;
      if (other.hasTypeUrl()) {
        mergeTypeUrl(other.getTypeUrl());
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
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
              input.readMessage(
                  getVersionFieldBuilder().getBuilder(),
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

    private org.sensoris.types.base.Version version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Version, org.sensoris.types.base.Version.Builder, org.sensoris.types.base.VersionOrBuilder> versionBuilder_;
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     * @return The version.
     */
    public org.sensoris.types.base.Version getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? org.sensoris.types.base.Version.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     */
    public Builder setVersion(org.sensoris.types.base.Version value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     */
    public Builder setVersion(
        org.sensoris.types.base.Version.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     */
    public Builder mergeVersion(org.sensoris.types.base.Version value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          version_ != null &&
          version_ != org.sensoris.types.base.Version.getDefaultInstance()) {
          getVersionBuilder().mergeFrom(value);
        } else {
          version_ = value;
        }
      } else {
        versionBuilder_.mergeFrom(value);
      }
      if (version_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     */
    public org.sensoris.types.base.Version.Builder getVersionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     */
    public org.sensoris.types.base.VersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            org.sensoris.types.base.Version.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * Version.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Version version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Version, org.sensoris.types.base.Version.Builder, org.sensoris.types.base.VersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.Version, org.sensoris.types.base.Version.Builder, org.sensoris.types.base.VersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersion)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.ExtensionTypeUrlAndVersion)
  private static final org.sensoris.types.base.ExtensionTypeUrlAndVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.ExtensionTypeUrlAndVersion();
  }

  public static org.sensoris.types.base.ExtensionTypeUrlAndVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtensionTypeUrlAndVersion>
      PARSER = new com.google.protobuf.AbstractParser<ExtensionTypeUrlAndVersion>() {
    @java.lang.Override
    public ExtensionTypeUrlAndVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExtensionTypeUrlAndVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtensionTypeUrlAndVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.types.base.ExtensionTypeUrlAndVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

