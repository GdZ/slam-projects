// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/powertrain.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.powertrain;

public interface PowertrainCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.powertrain.PowertrainCategory)
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
   * Status of engine.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.EngineStatus engine_status = 2;</code>
   */
  java.util.List<org.sensoris.categories.powertrain.EngineStatus> 
      getEngineStatusList();
  /**
   * <pre>
   * Status of engine.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.EngineStatus engine_status = 2;</code>
   */
  org.sensoris.categories.powertrain.EngineStatus getEngineStatus(int index);
  /**
   * <pre>
   * Status of engine.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.EngineStatus engine_status = 2;</code>
   */
  int getEngineStatusCount();
  /**
   * <pre>
   * Status of engine.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.EngineStatus engine_status = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.powertrain.EngineStatusOrBuilder> 
      getEngineStatusOrBuilderList();
  /**
   * <pre>
   * Status of engine.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.EngineStatus engine_status = 2;</code>
   */
  org.sensoris.categories.powertrain.EngineStatusOrBuilder getEngineStatusOrBuilder(
      int index);

  /**
   * <pre>
   * Status of transmission.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.TransmissionStatus transmission_status = 3;</code>
   */
  java.util.List<org.sensoris.categories.powertrain.TransmissionStatus> 
      getTransmissionStatusList();
  /**
   * <pre>
   * Status of transmission.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.TransmissionStatus transmission_status = 3;</code>
   */
  org.sensoris.categories.powertrain.TransmissionStatus getTransmissionStatus(int index);
  /**
   * <pre>
   * Status of transmission.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.TransmissionStatus transmission_status = 3;</code>
   */
  int getTransmissionStatusCount();
  /**
   * <pre>
   * Status of transmission.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.TransmissionStatus transmission_status = 3;</code>
   */
  java.util.List<? extends org.sensoris.categories.powertrain.TransmissionStatusOrBuilder> 
      getTransmissionStatusOrBuilderList();
  /**
   * <pre>
   * Status of transmission.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.TransmissionStatus transmission_status = 3;</code>
   */
  org.sensoris.categories.powertrain.TransmissionStatusOrBuilder getTransmissionStatusOrBuilder(
      int index);

  /**
   * <pre>
   * Status of cruise control.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.CruiseControlStatus cruise_control_status = 4;</code>
   */
  java.util.List<org.sensoris.categories.powertrain.CruiseControlStatus> 
      getCruiseControlStatusList();
  /**
   * <pre>
   * Status of cruise control.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.CruiseControlStatus cruise_control_status = 4;</code>
   */
  org.sensoris.categories.powertrain.CruiseControlStatus getCruiseControlStatus(int index);
  /**
   * <pre>
   * Status of cruise control.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.CruiseControlStatus cruise_control_status = 4;</code>
   */
  int getCruiseControlStatusCount();
  /**
   * <pre>
   * Status of cruise control.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.CruiseControlStatus cruise_control_status = 4;</code>
   */
  java.util.List<? extends org.sensoris.categories.powertrain.CruiseControlStatusOrBuilder> 
      getCruiseControlStatusOrBuilderList();
  /**
   * <pre>
   * Status of cruise control.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.powertrain.CruiseControlStatus cruise_control_status = 4;</code>
   */
  org.sensoris.categories.powertrain.CruiseControlStatusOrBuilder getCruiseControlStatusOrBuilder(
      int index);
}
