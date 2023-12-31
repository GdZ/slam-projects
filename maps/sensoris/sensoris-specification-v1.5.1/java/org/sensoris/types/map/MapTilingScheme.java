/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/map.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.map;

/**
 * <pre>
 * Map tiling scheme.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.map.MapTilingScheme}
 */
public final class MapTilingScheme extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.map.MapTilingScheme)
    MapTilingSchemeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MapTilingScheme.newBuilder() to construct.
  private MapTilingScheme(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MapTilingScheme() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MapTilingScheme();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.types.map.SensorisMapTypes.internal_static_sensoris_protobuf_types_map_MapTilingScheme_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.map.SensorisMapTypes.internal_static_sensoris_protobuf_types_map_MapTilingScheme_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.map.MapTilingScheme.class, org.sensoris.types.map.MapTilingScheme.Builder.class);
  }

  private int bitField0_;
  public static final int URN_FIELD_NUMBER = 1;
  private org.sensoris.types.base.Urn urn_;
  /**
   * <pre>
   * Uniform resource name (URN).
   *
   * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
   * @return Whether the urn field is set.
   */
  @java.lang.Override
  public boolean hasUrn() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Uniform resource name (URN).
   *
   * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
   * @return The urn.
   */
  @java.lang.Override
  public org.sensoris.types.base.Urn getUrn() {
    return urn_ == null ? org.sensoris.types.base.Urn.getDefaultInstance() : urn_;
  }
  /**
   * <pre>
   * Uniform resource name (URN).
   *
   * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.UrnOrBuilder getUrnOrBuilder() {
    return urn_ == null ? org.sensoris.types.base.Urn.getDefaultInstance() : urn_;
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
      output.writeMessage(1, getUrn());
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
        .computeMessageSize(1, getUrn());
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
    if (!(obj instanceof org.sensoris.types.map.MapTilingScheme)) {
      return super.equals(obj);
    }
    org.sensoris.types.map.MapTilingScheme other = (org.sensoris.types.map.MapTilingScheme) obj;

    if (hasUrn() != other.hasUrn()) return false;
    if (hasUrn()) {
      if (!getUrn()
          .equals(other.getUrn())) return false;
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
    if (hasUrn()) {
      hash = (37 * hash) + URN_FIELD_NUMBER;
      hash = (53 * hash) + getUrn().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.map.MapTilingScheme parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.sensoris.types.map.MapTilingScheme parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.sensoris.types.map.MapTilingScheme parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.map.MapTilingScheme parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.map.MapTilingScheme prototype) {
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
   * Map tiling scheme.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.map.MapTilingScheme}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.map.MapTilingScheme)
      org.sensoris.types.map.MapTilingSchemeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.map.SensorisMapTypes.internal_static_sensoris_protobuf_types_map_MapTilingScheme_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.map.SensorisMapTypes.internal_static_sensoris_protobuf_types_map_MapTilingScheme_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.map.MapTilingScheme.class, org.sensoris.types.map.MapTilingScheme.Builder.class);
    }

    // Construct using org.sensoris.types.map.MapTilingScheme.newBuilder()
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
        getUrnFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      urn_ = null;
      if (urnBuilder_ != null) {
        urnBuilder_.dispose();
        urnBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.map.SensorisMapTypes.internal_static_sensoris_protobuf_types_map_MapTilingScheme_descriptor;
    }

    @java.lang.Override
    public org.sensoris.types.map.MapTilingScheme getDefaultInstanceForType() {
      return org.sensoris.types.map.MapTilingScheme.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.types.map.MapTilingScheme build() {
      org.sensoris.types.map.MapTilingScheme result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.types.map.MapTilingScheme buildPartial() {
      org.sensoris.types.map.MapTilingScheme result = new org.sensoris.types.map.MapTilingScheme(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.sensoris.types.map.MapTilingScheme result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.urn_ = urnBuilder_ == null
            ? urn_
            : urnBuilder_.build();
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
      if (other instanceof org.sensoris.types.map.MapTilingScheme) {
        return mergeFrom((org.sensoris.types.map.MapTilingScheme)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.map.MapTilingScheme other) {
      if (other == org.sensoris.types.map.MapTilingScheme.getDefaultInstance()) return this;
      if (other.hasUrn()) {
        mergeUrn(other.getUrn());
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
                  getUrnFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private org.sensoris.types.base.Urn urn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Urn, org.sensoris.types.base.Urn.Builder, org.sensoris.types.base.UrnOrBuilder> urnBuilder_;
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     * @return Whether the urn field is set.
     */
    public boolean hasUrn() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     * @return The urn.
     */
    public org.sensoris.types.base.Urn getUrn() {
      if (urnBuilder_ == null) {
        return urn_ == null ? org.sensoris.types.base.Urn.getDefaultInstance() : urn_;
      } else {
        return urnBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     */
    public Builder setUrn(org.sensoris.types.base.Urn value) {
      if (urnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        urn_ = value;
      } else {
        urnBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     */
    public Builder setUrn(
        org.sensoris.types.base.Urn.Builder builderForValue) {
      if (urnBuilder_ == null) {
        urn_ = builderForValue.build();
      } else {
        urnBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     */
    public Builder mergeUrn(org.sensoris.types.base.Urn value) {
      if (urnBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          urn_ != null &&
          urn_ != org.sensoris.types.base.Urn.getDefaultInstance()) {
          getUrnBuilder().mergeFrom(value);
        } else {
          urn_ = value;
        }
      } else {
        urnBuilder_.mergeFrom(value);
      }
      if (urn_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     */
    public Builder clearUrn() {
      bitField0_ = (bitField0_ & ~0x00000001);
      urn_ = null;
      if (urnBuilder_ != null) {
        urnBuilder_.dispose();
        urnBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     */
    public org.sensoris.types.base.Urn.Builder getUrnBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUrnFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     */
    public org.sensoris.types.base.UrnOrBuilder getUrnOrBuilder() {
      if (urnBuilder_ != null) {
        return urnBuilder_.getMessageOrBuilder();
      } else {
        return urn_ == null ?
            org.sensoris.types.base.Urn.getDefaultInstance() : urn_;
      }
    }
    /**
     * <pre>
     * Uniform resource name (URN).
     *
     * &#64;syntax urn:map-tiling-scheme:[&lt;map-vendor&gt;]:&lt;tiling-scheme&gt;:[&lt;level&gt;]
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Urn urn = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Urn, org.sensoris.types.base.Urn.Builder, org.sensoris.types.base.UrnOrBuilder> 
        getUrnFieldBuilder() {
      if (urnBuilder_ == null) {
        urnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.Urn, org.sensoris.types.base.Urn.Builder, org.sensoris.types.base.UrnOrBuilder>(
                getUrn(),
                getParentForChildren(),
                isClean());
        urn_ = null;
      }
      return urnBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.map.MapTilingScheme)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.map.MapTilingScheme)
  private static final org.sensoris.types.map.MapTilingScheme DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.map.MapTilingScheme();
  }

  public static org.sensoris.types.map.MapTilingScheme getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MapTilingScheme>
      PARSER = new com.google.protobuf.AbstractParser<MapTilingScheme>() {
    @java.lang.Override
    public MapTilingScheme parsePartialFrom(
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

  public static com.google.protobuf.Parser<MapTilingScheme> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MapTilingScheme> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.types.map.MapTilingScheme getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

