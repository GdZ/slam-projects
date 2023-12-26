// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.roadattribution;

/**
 * <pre>
 * Marking color and confidence.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence}
 */
public final class MarkingColorAndConfidence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence)
    MarkingColorAndConfidenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarkingColorAndConfidence.newBuilder() to construct.
  private MarkingColorAndConfidence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarkingColorAndConfidence() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MarkingColorAndConfidence();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.categories.roadattribution.SensorisRoadAttributionCategory.internal_static_sensoris_protobuf_categories_roadattribution_MarkingColorAndConfidence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.categories.roadattribution.SensorisRoadAttributionCategory.internal_static_sensoris_protobuf_categories_roadattribution_MarkingColorAndConfidence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.categories.roadattribution.MarkingColorAndConfidence.class, org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Builder.class);
  }

  /**
   * <pre>
   * Type.
   * </pre>
   *
   * Protobuf enum {@code sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>UNKNOWN_TYPE = 0;</code>
     */
    UNKNOWN_TYPE(0),
    /**
     * <pre>
     * White.
     * </pre>
     *
     * <code>WHITE = 1;</code>
     */
    WHITE(1),
    /**
     * <pre>
     * Gray.
     * </pre>
     *
     * <code>GRAY = 2;</code>
     */
    GRAY(2),
    /**
     * <pre>
     * Light gray.
     * </pre>
     *
     * <code>GRAY_LIGHT = 3;</code>
     */
    GRAY_LIGHT(3),
    /**
     * <pre>
     * Dark gray.
     * </pre>
     *
     * <code>GRAY_DARK = 4;</code>
     */
    GRAY_DARK(4),
    /**
     * <pre>
     * Black.
     * </pre>
     *
     * <code>BLACK = 5;</code>
     */
    BLACK(5),
    /**
     * <pre>
     * Red.
     * </pre>
     *
     * <code>RED = 6;</code>
     */
    RED(6),
    /**
     * <pre>
     * Yellow.
     * </pre>
     *
     * <code>YELLOW = 7;</code>
     */
    YELLOW(7),
    /**
     * <pre>
     * Green.
     * </pre>
     *
     * <code>GREEN = 8;</code>
     */
    GREEN(8),
    /**
     * <pre>
     * Cyan.
     * </pre>
     *
     * <code>CYAN = 9;</code>
     */
    CYAN(9),
    /**
     * <pre>
     * Blue.
     * </pre>
     *
     * <code>BLUE = 10;</code>
     */
    BLUE(10),
    /**
     * <pre>
     * Orange.
     * </pre>
     *
     * <code>ORANGE = 11;</code>
     */
    ORANGE(11),
    /**
     * <pre>
     * Pink.
     * </pre>
     *
     * <code>PINK = 12;</code>
     */
    PINK(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>UNKNOWN_TYPE = 0;</code>
     */
    public static final int UNKNOWN_TYPE_VALUE = 0;
    /**
     * <pre>
     * White.
     * </pre>
     *
     * <code>WHITE = 1;</code>
     */
    public static final int WHITE_VALUE = 1;
    /**
     * <pre>
     * Gray.
     * </pre>
     *
     * <code>GRAY = 2;</code>
     */
    public static final int GRAY_VALUE = 2;
    /**
     * <pre>
     * Light gray.
     * </pre>
     *
     * <code>GRAY_LIGHT = 3;</code>
     */
    public static final int GRAY_LIGHT_VALUE = 3;
    /**
     * <pre>
     * Dark gray.
     * </pre>
     *
     * <code>GRAY_DARK = 4;</code>
     */
    public static final int GRAY_DARK_VALUE = 4;
    /**
     * <pre>
     * Black.
     * </pre>
     *
     * <code>BLACK = 5;</code>
     */
    public static final int BLACK_VALUE = 5;
    /**
     * <pre>
     * Red.
     * </pre>
     *
     * <code>RED = 6;</code>
     */
    public static final int RED_VALUE = 6;
    /**
     * <pre>
     * Yellow.
     * </pre>
     *
     * <code>YELLOW = 7;</code>
     */
    public static final int YELLOW_VALUE = 7;
    /**
     * <pre>
     * Green.
     * </pre>
     *
     * <code>GREEN = 8;</code>
     */
    public static final int GREEN_VALUE = 8;
    /**
     * <pre>
     * Cyan.
     * </pre>
     *
     * <code>CYAN = 9;</code>
     */
    public static final int CYAN_VALUE = 9;
    /**
     * <pre>
     * Blue.
     * </pre>
     *
     * <code>BLUE = 10;</code>
     */
    public static final int BLUE_VALUE = 10;
    /**
     * <pre>
     * Orange.
     * </pre>
     *
     * <code>ORANGE = 11;</code>
     */
    public static final int ORANGE_VALUE = 11;
    /**
     * <pre>
     * Pink.
     * </pre>
     *
     * <code>PINK = 12;</code>
     */
    public static final int PINK_VALUE = 12;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_TYPE;
        case 1: return WHITE;
        case 2: return GRAY;
        case 3: return GRAY_LIGHT;
        case 4: return GRAY_DARK;
        case 5: return BLACK;
        case 6: return RED;
        case 7: return YELLOW;
        case 8: return GREEN;
        case 9: return CYAN;
        case 10: return BLUE;
        case 11: return ORANGE;
        case 12: return PINK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.sensoris.categories.roadattribution.MarkingColorAndConfidence.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
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
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type getType() {
    org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type result = org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type.forNumber(type_);
    return result == null ? org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type.UNRECOGNIZED : result;
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private org.sensoris.types.base.Confidence confidence_;
  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   * @return Whether the confidence field is set.
   */
  @java.lang.Override
  public boolean hasConfidence() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   * @return The confidence.
   */
  @java.lang.Override
  public org.sensoris.types.base.Confidence getConfidence() {
    return confidence_ == null ? org.sensoris.types.base.Confidence.getDefaultInstance() : confidence_;
  }
  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  @java.lang.Override
  public org.sensoris.types.base.ConfidenceOrBuilder getConfidenceOrBuilder() {
    return confidence_ == null ? org.sensoris.types.base.Confidence.getDefaultInstance() : confidence_;
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
    if (type_ != org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type.UNKNOWN_TYPE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getConfidence());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type.UNKNOWN_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfidence());
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
    if (!(obj instanceof org.sensoris.categories.roadattribution.MarkingColorAndConfidence)) {
      return super.equals(obj);
    }
    org.sensoris.categories.roadattribution.MarkingColorAndConfidence other = (org.sensoris.categories.roadattribution.MarkingColorAndConfidence) obj;

    if (type_ != other.type_) return false;
    if (hasConfidence() != other.hasConfidence()) return false;
    if (hasConfidence()) {
      if (!getConfidence()
          .equals(other.getConfidence())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasConfidence()) {
      hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
      hash = (53 * hash) + getConfidence().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence parseFrom(
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
  public static Builder newBuilder(org.sensoris.categories.roadattribution.MarkingColorAndConfidence prototype) {
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
   * Marking color and confidence.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence)
      org.sensoris.categories.roadattribution.MarkingColorAndConfidenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.categories.roadattribution.SensorisRoadAttributionCategory.internal_static_sensoris_protobuf_categories_roadattribution_MarkingColorAndConfidence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.categories.roadattribution.SensorisRoadAttributionCategory.internal_static_sensoris_protobuf_categories_roadattribution_MarkingColorAndConfidence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.categories.roadattribution.MarkingColorAndConfidence.class, org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Builder.class);
    }

    // Construct using org.sensoris.categories.roadattribution.MarkingColorAndConfidence.newBuilder()
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
        getConfidenceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      confidence_ = null;
      if (confidenceBuilder_ != null) {
        confidenceBuilder_.dispose();
        confidenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.categories.roadattribution.SensorisRoadAttributionCategory.internal_static_sensoris_protobuf_categories_roadattribution_MarkingColorAndConfidence_descriptor;
    }

    @java.lang.Override
    public org.sensoris.categories.roadattribution.MarkingColorAndConfidence getDefaultInstanceForType() {
      return org.sensoris.categories.roadattribution.MarkingColorAndConfidence.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.categories.roadattribution.MarkingColorAndConfidence build() {
      org.sensoris.categories.roadattribution.MarkingColorAndConfidence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.categories.roadattribution.MarkingColorAndConfidence buildPartial() {
      org.sensoris.categories.roadattribution.MarkingColorAndConfidence result = new org.sensoris.categories.roadattribution.MarkingColorAndConfidence(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.sensoris.categories.roadattribution.MarkingColorAndConfidence result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.confidence_ = confidenceBuilder_ == null
            ? confidence_
            : confidenceBuilder_.build();
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
      if (other instanceof org.sensoris.categories.roadattribution.MarkingColorAndConfidence) {
        return mergeFrom((org.sensoris.categories.roadattribution.MarkingColorAndConfidence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.categories.roadattribution.MarkingColorAndConfidence other) {
      if (other == org.sensoris.categories.roadattribution.MarkingColorAndConfidence.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasConfidence()) {
        mergeConfidence(other.getConfidence());
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
            case 8: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getConfidenceFieldBuilder().getBuilder(),
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

    private int type_ = 0;
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
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
     * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type getType() {
      org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type result = org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type.forNumber(type_);
      return result == null ? org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private org.sensoris.types.base.Confidence confidence_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Confidence, org.sensoris.types.base.Confidence.Builder, org.sensoris.types.base.ConfidenceOrBuilder> confidenceBuilder_;
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     * @return Whether the confidence field is set.
     */
    public boolean hasConfidence() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     * @return The confidence.
     */
    public org.sensoris.types.base.Confidence getConfidence() {
      if (confidenceBuilder_ == null) {
        return confidence_ == null ? org.sensoris.types.base.Confidence.getDefaultInstance() : confidence_;
      } else {
        return confidenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder setConfidence(org.sensoris.types.base.Confidence value) {
      if (confidenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        confidence_ = value;
      } else {
        confidenceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder setConfidence(
        org.sensoris.types.base.Confidence.Builder builderForValue) {
      if (confidenceBuilder_ == null) {
        confidence_ = builderForValue.build();
      } else {
        confidenceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder mergeConfidence(org.sensoris.types.base.Confidence value) {
      if (confidenceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          confidence_ != null &&
          confidence_ != org.sensoris.types.base.Confidence.getDefaultInstance()) {
          getConfidenceBuilder().mergeFrom(value);
        } else {
          confidence_ = value;
        }
      } else {
        confidenceBuilder_.mergeFrom(value);
      }
      if (confidence_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public Builder clearConfidence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      confidence_ = null;
      if (confidenceBuilder_ != null) {
        confidenceBuilder_.dispose();
        confidenceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public org.sensoris.types.base.Confidence.Builder getConfidenceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConfidenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    public org.sensoris.types.base.ConfidenceOrBuilder getConfidenceOrBuilder() {
      if (confidenceBuilder_ != null) {
        return confidenceBuilder_.getMessageOrBuilder();
      } else {
        return confidence_ == null ?
            org.sensoris.types.base.Confidence.getDefaultInstance() : confidence_;
      }
    }
    /**
     * <pre>
     * Confidence of type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.Confidence, org.sensoris.types.base.Confidence.Builder, org.sensoris.types.base.ConfidenceOrBuilder> 
        getConfidenceFieldBuilder() {
      if (confidenceBuilder_ == null) {
        confidenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.Confidence, org.sensoris.types.base.Confidence.Builder, org.sensoris.types.base.ConfidenceOrBuilder>(
                getConfidence(),
                getParentForChildren(),
                isClean());
        confidence_ = null;
      }
      return confidenceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence)
  private static final org.sensoris.categories.roadattribution.MarkingColorAndConfidence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.categories.roadattribution.MarkingColorAndConfidence();
  }

  public static org.sensoris.categories.roadattribution.MarkingColorAndConfidence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarkingColorAndConfidence>
      PARSER = new com.google.protobuf.AbstractParser<MarkingColorAndConfidence>() {
    @java.lang.Override
    public MarkingColorAndConfidence parsePartialFrom(
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

  public static com.google.protobuf.Parser<MarkingColorAndConfidence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarkingColorAndConfidence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.categories.roadattribution.MarkingColorAndConfidence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

