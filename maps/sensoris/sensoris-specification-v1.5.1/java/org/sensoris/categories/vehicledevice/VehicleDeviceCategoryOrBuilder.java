/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/vehicle_device.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.vehicledevice;

public interface VehicleDeviceCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.vehicledevice.VehicleDeviceCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   * @return The envelope.
   */
  org.sensoris.types.base.CategoryEnvelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Status of exterior light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus exterior_light_status = 2;</code>
   */
  java.util.List<org.sensoris.categories.vehicledevice.ExteriorLightStatus> 
      getExteriorLightStatusList();
  /**
   * <pre>
   * Status of exterior light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus exterior_light_status = 2;</code>
   */
  org.sensoris.categories.vehicledevice.ExteriorLightStatus getExteriorLightStatus(int index);
  /**
   * <pre>
   * Status of exterior light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus exterior_light_status = 2;</code>
   */
  int getExteriorLightStatusCount();
  /**
   * <pre>
   * Status of exterior light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus exterior_light_status = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.vehicledevice.ExteriorLightStatusOrBuilder> 
      getExteriorLightStatusOrBuilderList();
  /**
   * <pre>
   * Status of exterior light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.ExteriorLightStatus exterior_light_status = 2;</code>
   */
  org.sensoris.categories.vehicledevice.ExteriorLightStatusOrBuilder getExteriorLightStatusOrBuilder(
      int index);

  /**
   * <pre>
   * Status of the front wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus front_wiper_status = 3;</code>
   */
  java.util.List<org.sensoris.categories.vehicledevice.WiperStatus> 
      getFrontWiperStatusList();
  /**
   * <pre>
   * Status of the front wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus front_wiper_status = 3;</code>
   */
  org.sensoris.categories.vehicledevice.WiperStatus getFrontWiperStatus(int index);
  /**
   * <pre>
   * Status of the front wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus front_wiper_status = 3;</code>
   */
  int getFrontWiperStatusCount();
  /**
   * <pre>
   * Status of the front wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus front_wiper_status = 3;</code>
   */
  java.util.List<? extends org.sensoris.categories.vehicledevice.WiperStatusOrBuilder> 
      getFrontWiperStatusOrBuilderList();
  /**
   * <pre>
   * Status of the front wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus front_wiper_status = 3;</code>
   */
  org.sensoris.categories.vehicledevice.WiperStatusOrBuilder getFrontWiperStatusOrBuilder(
      int index);

  /**
   * <pre>
   * Status of the rear wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus rear_wiper_status = 4;</code>
   */
  java.util.List<org.sensoris.categories.vehicledevice.WiperStatus> 
      getRearWiperStatusList();
  /**
   * <pre>
   * Status of the rear wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus rear_wiper_status = 4;</code>
   */
  org.sensoris.categories.vehicledevice.WiperStatus getRearWiperStatus(int index);
  /**
   * <pre>
   * Status of the rear wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus rear_wiper_status = 4;</code>
   */
  int getRearWiperStatusCount();
  /**
   * <pre>
   * Status of the rear wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus rear_wiper_status = 4;</code>
   */
  java.util.List<? extends org.sensoris.categories.vehicledevice.WiperStatusOrBuilder> 
      getRearWiperStatusOrBuilderList();
  /**
   * <pre>
   * Status of the rear wiper.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.vehicledevice.WiperStatus rear_wiper_status = 4;</code>
   */
  org.sensoris.categories.vehicledevice.WiperStatusOrBuilder getRearWiperStatusOrBuilder(
      int index);
}
