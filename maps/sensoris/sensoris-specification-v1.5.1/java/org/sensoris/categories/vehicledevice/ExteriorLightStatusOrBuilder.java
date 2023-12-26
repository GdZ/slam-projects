/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/vehicle_device.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.vehicledevice;

public interface ExteriorLightStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   * @return The envelope.
   */
  org.sensoris.types.base.EventEnvelope getEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Light type and status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus.TypeAndStatus type_and_status = 2;</code>
   */
  java.util.List<org.sensoris.categories.vehicledevice.ExteriorLightStatus.TypeAndStatus> 
      getTypeAndStatusList();
  /**
   * <pre>
   * Light type and status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus.TypeAndStatus type_and_status = 2;</code>
   */
  org.sensoris.categories.vehicledevice.ExteriorLightStatus.TypeAndStatus getTypeAndStatus(int index);
  /**
   * <pre>
   * Light type and status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus.TypeAndStatus type_and_status = 2;</code>
   */
  int getTypeAndStatusCount();
  /**
   * <pre>
   * Light type and status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus.TypeAndStatus type_and_status = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.vehicledevice.ExteriorLightStatus.TypeAndStatusOrBuilder> 
      getTypeAndStatusOrBuilderList();
  /**
   * <pre>
   * Light type and status.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus.TypeAndStatus type_and_status = 2;</code>
   */
  org.sensoris.categories.vehicledevice.ExteriorLightStatus.TypeAndStatusOrBuilder getTypeAndStatusOrBuilder(
      int index);
}
