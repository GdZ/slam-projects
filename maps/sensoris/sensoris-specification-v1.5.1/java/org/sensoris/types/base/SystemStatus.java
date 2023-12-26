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
 * System status.
 * </pre>
 *
 * Protobuf enum {@code sensoris.protobuf.types.base.SystemStatus}
 */
public enum SystemStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>UNKNOWN_SYSTEM_STATUS = 0;</code>
   */
  UNKNOWN_SYSTEM_STATUS(0),
  /**
   * <pre>
   * Active, i.e. system is on and controls vehicle.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  ACTIVE(1),
  /**
   * <pre>
   * Inactive, i.e. system is on and doesn't control vehicle.
   * </pre>
   *
   * <code>INACTIVE = 2;</code>
   */
  INACTIVE(2),
  /**
   * <pre>
   * Disabled, i.e. system is off, e.g. disabled by driver.
   * </pre>
   *
   * <code>DISABLED = 3;</code>
   */
  DISABLED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>UNKNOWN_SYSTEM_STATUS = 0;</code>
   */
  public static final int UNKNOWN_SYSTEM_STATUS_VALUE = 0;
  /**
   * <pre>
   * Active, i.e. system is on and controls vehicle.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  public static final int ACTIVE_VALUE = 1;
  /**
   * <pre>
   * Inactive, i.e. system is on and doesn't control vehicle.
   * </pre>
   *
   * <code>INACTIVE = 2;</code>
   */
  public static final int INACTIVE_VALUE = 2;
  /**
   * <pre>
   * Disabled, i.e. system is off, e.g. disabled by driver.
   * </pre>
   *
   * <code>DISABLED = 3;</code>
   */
  public static final int DISABLED_VALUE = 3;


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
  public static SystemStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SystemStatus forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_SYSTEM_STATUS;
      case 1: return ACTIVE;
      case 2: return INACTIVE;
      case 3: return DISABLED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SystemStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SystemStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SystemStatus>() {
          public SystemStatus findValueByNumber(int number) {
            return SystemStatus.forNumber(number);
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
    return org.sensoris.types.base.SensorisBaseTypes.getDescriptor().getEnumTypes().get(3);
  }

  private static final SystemStatus[] VALUES = values();

  public static SystemStatus valueOf(
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

  private SystemStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sensoris.protobuf.types.base.SystemStatus)
}
