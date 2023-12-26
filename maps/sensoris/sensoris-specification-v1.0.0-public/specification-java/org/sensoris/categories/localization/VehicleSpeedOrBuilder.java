// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/localization.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.localization;

public interface VehicleSpeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.localization.VehicleSpeed)
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
   * Value and accuracy.
   *
   * &#64;unit Meter per Second
   * &#64;resolution 0.1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.XyzVectorAndAccuracy value_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   * @return Whether the valueAndAccuracy field is set.
   */
  boolean hasValueAndAccuracy();
  /**
   * <pre>
   * Value and accuracy.
   *
   * &#64;unit Meter per Second
   * &#64;resolution 0.1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.XyzVectorAndAccuracy value_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   * @return The valueAndAccuracy.
   */
  org.sensoris.types.spatial.XyzVectorAndAccuracy getValueAndAccuracy();
  /**
   * <pre>
   * Value and accuracy.
   *
   * &#64;unit Meter per Second
   * &#64;resolution 0.1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.XyzVectorAndAccuracy value_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   */
  org.sensoris.types.spatial.XyzVectorAndAccuracyOrBuilder getValueAndAccuracyOrBuilder();
}