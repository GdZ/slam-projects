// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/traffic_maneuver.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.trafficmaneuver;

public interface ChargingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.trafficmaneuver.Charging)
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
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficmaneuver.Charging.Type type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficmaneuver.Charging.Type type = 2;</code>
   * @return The type.
   */
  org.sensoris.categories.trafficmaneuver.Charging.Type getType();

  /**
   * <pre>
   * Voltage and accuracy measured by the vehicle.
   *
   * &#64;unit Volt
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy voltage_and_accuracy = 3 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the voltageAndAccuracy field is set.
   */
  boolean hasVoltageAndAccuracy();
  /**
   * <pre>
   * Voltage and accuracy measured by the vehicle.
   *
   * &#64;unit Volt
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy voltage_and_accuracy = 3 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The voltageAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getVoltageAndAccuracy();
  /**
   * <pre>
   * Voltage and accuracy measured by the vehicle.
   *
   * &#64;unit Volt
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy voltage_and_accuracy = 3 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getVoltageAndAccuracyOrBuilder();

  /**
   * <pre>
   * Current and accuracy provided to the vehicle.
   *
   * &#64;unit Ampere
   * &#64;resolution 0.1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy current_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   * @return Whether the currentAndAccuracy field is set.
   */
  boolean hasCurrentAndAccuracy();
  /**
   * <pre>
   * Current and accuracy provided to the vehicle.
   *
   * &#64;unit Ampere
   * &#64;resolution 0.1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy current_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   * @return The currentAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getCurrentAndAccuracy();
  /**
   * <pre>
   * Current and accuracy provided to the vehicle.
   *
   * &#64;unit Ampere
   * &#64;resolution 0.1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy current_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getCurrentAndAccuracyOrBuilder();
}
