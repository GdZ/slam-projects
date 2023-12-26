// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/traffic_regulation.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.trafficregulation;

/**
 * <pre>
 * Traffic regulation category.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory}
 */
public final class TrafficRegulationCategory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory)
    TrafficRegulationCategoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrafficRegulationCategory.newBuilder() to construct.
  private TrafficRegulationCategory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrafficRegulationCategory() {
    trafficSign_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrafficRegulationCategory();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.categories.trafficregulation.SensorisTrafficRegulationCategory.internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.categories.trafficregulation.SensorisTrafficRegulationCategory.internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.categories.trafficregulation.TrafficRegulationCategory.class, org.sensoris.categories.trafficregulation.TrafficRegulationCategory.Builder.class);
  }

  private int bitField0_;
  public static final int ENVELOPE_FIELD_NUMBER = 1;
  private org.sensoris.types.base.CategoryEnvelope envelope_;
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  @java.lang.Override
  public boolean hasEnvelope() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   * @return The envelope.
   */
  @java.lang.Override
  public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
    return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
    return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
  }

  public static final int TRAFFIC_SIGN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.sensoris.categories.trafficregulation.TrafficSign> trafficSign_;
  /**
   * <pre>
   * Traffic sign.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.sensoris.categories.trafficregulation.TrafficSign> getTrafficSignList() {
    return trafficSign_;
  }
  /**
   * <pre>
   * Traffic sign.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.sensoris.categories.trafficregulation.TrafficSignOrBuilder> 
      getTrafficSignOrBuilderList() {
    return trafficSign_;
  }
  /**
   * <pre>
   * Traffic sign.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
   */
  @java.lang.Override
  public int getTrafficSignCount() {
    return trafficSign_.size();
  }
  /**
   * <pre>
   * Traffic sign.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
   */
  @java.lang.Override
  public org.sensoris.categories.trafficregulation.TrafficSign getTrafficSign(int index) {
    return trafficSign_.get(index);
  }
  /**
   * <pre>
   * Traffic sign.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
   */
  @java.lang.Override
  public org.sensoris.categories.trafficregulation.TrafficSignOrBuilder getTrafficSignOrBuilder(
      int index) {
    return trafficSign_.get(index);
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
      output.writeMessage(1, getEnvelope());
    }
    for (int i = 0; i < trafficSign_.size(); i++) {
      output.writeMessage(2, trafficSign_.get(i));
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
        .computeMessageSize(1, getEnvelope());
    }
    for (int i = 0; i < trafficSign_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, trafficSign_.get(i));
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
    if (!(obj instanceof org.sensoris.categories.trafficregulation.TrafficRegulationCategory)) {
      return super.equals(obj);
    }
    org.sensoris.categories.trafficregulation.TrafficRegulationCategory other = (org.sensoris.categories.trafficregulation.TrafficRegulationCategory) obj;

    if (hasEnvelope() != other.hasEnvelope()) return false;
    if (hasEnvelope()) {
      if (!getEnvelope()
          .equals(other.getEnvelope())) return false;
    }
    if (!getTrafficSignList()
        .equals(other.getTrafficSignList())) return false;
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
    if (hasEnvelope()) {
      hash = (37 * hash) + ENVELOPE_FIELD_NUMBER;
      hash = (53 * hash) + getEnvelope().hashCode();
    }
    if (getTrafficSignCount() > 0) {
      hash = (37 * hash) + TRAFFIC_SIGN_FIELD_NUMBER;
      hash = (53 * hash) + getTrafficSignList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory parseFrom(
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
  public static Builder newBuilder(org.sensoris.categories.trafficregulation.TrafficRegulationCategory prototype) {
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
   * Traffic regulation category.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory)
      org.sensoris.categories.trafficregulation.TrafficRegulationCategoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.categories.trafficregulation.SensorisTrafficRegulationCategory.internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.categories.trafficregulation.SensorisTrafficRegulationCategory.internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.categories.trafficregulation.TrafficRegulationCategory.class, org.sensoris.categories.trafficregulation.TrafficRegulationCategory.Builder.class);
    }

    // Construct using org.sensoris.categories.trafficregulation.TrafficRegulationCategory.newBuilder()
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
        getEnvelopeFieldBuilder();
        getTrafficSignFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      envelope_ = null;
      if (envelopeBuilder_ != null) {
        envelopeBuilder_.dispose();
        envelopeBuilder_ = null;
      }
      if (trafficSignBuilder_ == null) {
        trafficSign_ = java.util.Collections.emptyList();
      } else {
        trafficSign_ = null;
        trafficSignBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.categories.trafficregulation.SensorisTrafficRegulationCategory.internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_descriptor;
    }

    @java.lang.Override
    public org.sensoris.categories.trafficregulation.TrafficRegulationCategory getDefaultInstanceForType() {
      return org.sensoris.categories.trafficregulation.TrafficRegulationCategory.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.categories.trafficregulation.TrafficRegulationCategory build() {
      org.sensoris.categories.trafficregulation.TrafficRegulationCategory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.categories.trafficregulation.TrafficRegulationCategory buildPartial() {
      org.sensoris.categories.trafficregulation.TrafficRegulationCategory result = new org.sensoris.categories.trafficregulation.TrafficRegulationCategory(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.sensoris.categories.trafficregulation.TrafficRegulationCategory result) {
      if (trafficSignBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          trafficSign_ = java.util.Collections.unmodifiableList(trafficSign_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.trafficSign_ = trafficSign_;
      } else {
        result.trafficSign_ = trafficSignBuilder_.build();
      }
    }

    private void buildPartial0(org.sensoris.categories.trafficregulation.TrafficRegulationCategory result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.envelope_ = envelopeBuilder_ == null
            ? envelope_
            : envelopeBuilder_.build();
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
      if (other instanceof org.sensoris.categories.trafficregulation.TrafficRegulationCategory) {
        return mergeFrom((org.sensoris.categories.trafficregulation.TrafficRegulationCategory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.categories.trafficregulation.TrafficRegulationCategory other) {
      if (other == org.sensoris.categories.trafficregulation.TrafficRegulationCategory.getDefaultInstance()) return this;
      if (other.hasEnvelope()) {
        mergeEnvelope(other.getEnvelope());
      }
      if (trafficSignBuilder_ == null) {
        if (!other.trafficSign_.isEmpty()) {
          if (trafficSign_.isEmpty()) {
            trafficSign_ = other.trafficSign_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTrafficSignIsMutable();
            trafficSign_.addAll(other.trafficSign_);
          }
          onChanged();
        }
      } else {
        if (!other.trafficSign_.isEmpty()) {
          if (trafficSignBuilder_.isEmpty()) {
            trafficSignBuilder_.dispose();
            trafficSignBuilder_ = null;
            trafficSign_ = other.trafficSign_;
            bitField0_ = (bitField0_ & ~0x00000002);
            trafficSignBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTrafficSignFieldBuilder() : null;
          } else {
            trafficSignBuilder_.addAllMessages(other.trafficSign_);
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
                  getEnvelopeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              org.sensoris.categories.trafficregulation.TrafficSign m =
                  input.readMessage(
                      org.sensoris.categories.trafficregulation.TrafficSign.parser(),
                      extensionRegistry);
              if (trafficSignBuilder_ == null) {
                ensureTrafficSignIsMutable();
                trafficSign_.add(m);
              } else {
                trafficSignBuilder_.addMessage(m);
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

    private org.sensoris.types.base.CategoryEnvelope envelope_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> envelopeBuilder_;
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     * @return Whether the envelope field is set.
     */
    public boolean hasEnvelope() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     * @return The envelope.
     */
    public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
      if (envelopeBuilder_ == null) {
        return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      } else {
        return envelopeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        envelope_ = value;
      } else {
        envelopeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(
        org.sensoris.types.base.CategoryEnvelope.Builder builderForValue) {
      if (envelopeBuilder_ == null) {
        envelope_ = builderForValue.build();
      } else {
        envelopeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder mergeEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          envelope_ != null &&
          envelope_ != org.sensoris.types.base.CategoryEnvelope.getDefaultInstance()) {
          getEnvelopeBuilder().mergeFrom(value);
        } else {
          envelope_ = value;
        }
      } else {
        envelopeBuilder_.mergeFrom(value);
      }
      if (envelope_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder clearEnvelope() {
      bitField0_ = (bitField0_ & ~0x00000001);
      envelope_ = null;
      if (envelopeBuilder_ != null) {
        envelopeBuilder_.dispose();
        envelopeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelope.Builder getEnvelopeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnvelopeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
      if (envelopeBuilder_ != null) {
        return envelopeBuilder_.getMessageOrBuilder();
      } else {
        return envelope_ == null ?
            org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> 
        getEnvelopeFieldBuilder() {
      if (envelopeBuilder_ == null) {
        envelopeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder>(
                getEnvelope(),
                getParentForChildren(),
                isClean());
        envelope_ = null;
      }
      return envelopeBuilder_;
    }

    private java.util.List<org.sensoris.categories.trafficregulation.TrafficSign> trafficSign_ =
      java.util.Collections.emptyList();
    private void ensureTrafficSignIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        trafficSign_ = new java.util.ArrayList<org.sensoris.categories.trafficregulation.TrafficSign>(trafficSign_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.trafficregulation.TrafficSign, org.sensoris.categories.trafficregulation.TrafficSign.Builder, org.sensoris.categories.trafficregulation.TrafficSignOrBuilder> trafficSignBuilder_;

    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public java.util.List<org.sensoris.categories.trafficregulation.TrafficSign> getTrafficSignList() {
      if (trafficSignBuilder_ == null) {
        return java.util.Collections.unmodifiableList(trafficSign_);
      } else {
        return trafficSignBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public int getTrafficSignCount() {
      if (trafficSignBuilder_ == null) {
        return trafficSign_.size();
      } else {
        return trafficSignBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public org.sensoris.categories.trafficregulation.TrafficSign getTrafficSign(int index) {
      if (trafficSignBuilder_ == null) {
        return trafficSign_.get(index);
      } else {
        return trafficSignBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder setTrafficSign(
        int index, org.sensoris.categories.trafficregulation.TrafficSign value) {
      if (trafficSignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrafficSignIsMutable();
        trafficSign_.set(index, value);
        onChanged();
      } else {
        trafficSignBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder setTrafficSign(
        int index, org.sensoris.categories.trafficregulation.TrafficSign.Builder builderForValue) {
      if (trafficSignBuilder_ == null) {
        ensureTrafficSignIsMutable();
        trafficSign_.set(index, builderForValue.build());
        onChanged();
      } else {
        trafficSignBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder addTrafficSign(org.sensoris.categories.trafficregulation.TrafficSign value) {
      if (trafficSignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrafficSignIsMutable();
        trafficSign_.add(value);
        onChanged();
      } else {
        trafficSignBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder addTrafficSign(
        int index, org.sensoris.categories.trafficregulation.TrafficSign value) {
      if (trafficSignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrafficSignIsMutable();
        trafficSign_.add(index, value);
        onChanged();
      } else {
        trafficSignBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder addTrafficSign(
        org.sensoris.categories.trafficregulation.TrafficSign.Builder builderForValue) {
      if (trafficSignBuilder_ == null) {
        ensureTrafficSignIsMutable();
        trafficSign_.add(builderForValue.build());
        onChanged();
      } else {
        trafficSignBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder addTrafficSign(
        int index, org.sensoris.categories.trafficregulation.TrafficSign.Builder builderForValue) {
      if (trafficSignBuilder_ == null) {
        ensureTrafficSignIsMutable();
        trafficSign_.add(index, builderForValue.build());
        onChanged();
      } else {
        trafficSignBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder addAllTrafficSign(
        java.lang.Iterable<? extends org.sensoris.categories.trafficregulation.TrafficSign> values) {
      if (trafficSignBuilder_ == null) {
        ensureTrafficSignIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, trafficSign_);
        onChanged();
      } else {
        trafficSignBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder clearTrafficSign() {
      if (trafficSignBuilder_ == null) {
        trafficSign_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        trafficSignBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public Builder removeTrafficSign(int index) {
      if (trafficSignBuilder_ == null) {
        ensureTrafficSignIsMutable();
        trafficSign_.remove(index);
        onChanged();
      } else {
        trafficSignBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public org.sensoris.categories.trafficregulation.TrafficSign.Builder getTrafficSignBuilder(
        int index) {
      return getTrafficSignFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public org.sensoris.categories.trafficregulation.TrafficSignOrBuilder getTrafficSignOrBuilder(
        int index) {
      if (trafficSignBuilder_ == null) {
        return trafficSign_.get(index);  } else {
        return trafficSignBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public java.util.List<? extends org.sensoris.categories.trafficregulation.TrafficSignOrBuilder> 
         getTrafficSignOrBuilderList() {
      if (trafficSignBuilder_ != null) {
        return trafficSignBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(trafficSign_);
      }
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public org.sensoris.categories.trafficregulation.TrafficSign.Builder addTrafficSignBuilder() {
      return getTrafficSignFieldBuilder().addBuilder(
          org.sensoris.categories.trafficregulation.TrafficSign.getDefaultInstance());
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public org.sensoris.categories.trafficregulation.TrafficSign.Builder addTrafficSignBuilder(
        int index) {
      return getTrafficSignFieldBuilder().addBuilder(
          index, org.sensoris.categories.trafficregulation.TrafficSign.getDefaultInstance());
    }
    /**
     * <pre>
     * Traffic sign.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.trafficregulation.TrafficSign traffic_sign = 2;</code>
     */
    public java.util.List<org.sensoris.categories.trafficregulation.TrafficSign.Builder> 
         getTrafficSignBuilderList() {
      return getTrafficSignFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.trafficregulation.TrafficSign, org.sensoris.categories.trafficregulation.TrafficSign.Builder, org.sensoris.categories.trafficregulation.TrafficSignOrBuilder> 
        getTrafficSignFieldBuilder() {
      if (trafficSignBuilder_ == null) {
        trafficSignBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.sensoris.categories.trafficregulation.TrafficSign, org.sensoris.categories.trafficregulation.TrafficSign.Builder, org.sensoris.categories.trafficregulation.TrafficSignOrBuilder>(
                trafficSign_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        trafficSign_ = null;
      }
      return trafficSignBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory)
  private static final org.sensoris.categories.trafficregulation.TrafficRegulationCategory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.categories.trafficregulation.TrafficRegulationCategory();
  }

  public static org.sensoris.categories.trafficregulation.TrafficRegulationCategory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficRegulationCategory>
      PARSER = new com.google.protobuf.AbstractParser<TrafficRegulationCategory>() {
    @java.lang.Override
    public TrafficRegulationCategory parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrafficRegulationCategory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficRegulationCategory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.categories.trafficregulation.TrafficRegulationCategory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
