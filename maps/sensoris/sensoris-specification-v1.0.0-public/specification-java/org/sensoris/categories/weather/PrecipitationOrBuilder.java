// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/weather.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.weather;

public interface PrecipitationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.weather.Precipitation)
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
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 2;</code>
   * @return Whether the detectionStatus field is set.
   */
  boolean hasDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 2;</code>
   * @return The detectionStatus.
   */
  org.sensoris.types.base.EventDetectionStatus getDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 2;</code>
   */
  org.sensoris.types.base.EventDetectionStatusOrBuilder getDetectionStatusOrBuilder();

  /**
   * <pre>
   * Type and confidence of type.
   *
   * If type is NONE, then intensity shall not be set.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.weather.Precipitation.TypeAndConfidence type_and_confidence = 3;</code>
   * @return Whether the typeAndConfidence field is set.
   */
  boolean hasTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence of type.
   *
   * If type is NONE, then intensity shall not be set.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.weather.Precipitation.TypeAndConfidence type_and_confidence = 3;</code>
   * @return The typeAndConfidence.
   */
  org.sensoris.categories.weather.Precipitation.TypeAndConfidence getTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence of type.
   *
   * If type is NONE, then intensity shall not be set.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.weather.Precipitation.TypeAndConfidence type_and_confidence = 3;</code>
   */
  org.sensoris.categories.weather.Precipitation.TypeAndConfidenceOrBuilder getTypeAndConfidenceOrBuilder();

  /**
   * <pre>
   * Intensity as percentage of maximum intensity.
   *
   * Intensity as percentage is non-standardized and may vary, e.g. depending on sensor manufacturer, software and hardware version, or mounting position.
   *
   * &#64;unit Percent
   * &#64;resolution 1
   * &#64;range (0, 100]
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy relative_intensity_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the relativeIntensityAndAccuracy field is set.
   */
  boolean hasRelativeIntensityAndAccuracy();
  /**
   * <pre>
   * Intensity as percentage of maximum intensity.
   *
   * Intensity as percentage is non-standardized and may vary, e.g. depending on sensor manufacturer, software and hardware version, or mounting position.
   *
   * &#64;unit Percent
   * &#64;resolution 1
   * &#64;range (0, 100]
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy relative_intensity_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The relativeIntensityAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getRelativeIntensityAndAccuracy();
  /**
   * <pre>
   * Intensity as percentage of maximum intensity.
   *
   * Intensity as percentage is non-standardized and may vary, e.g. depending on sensor manufacturer, software and hardware version, or mounting position.
   *
   * &#64;unit Percent
   * &#64;resolution 1
   * &#64;range (0, 100]
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy relative_intensity_and_accuracy = 4 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getRelativeIntensityAndAccuracyOrBuilder();

  /**
   * <pre>
   * Intensity.
   *
   * &#64;unit MilliMeter per Hour
   * &#64;resolution 0.1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy absolute_intensity_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   * @return Whether the absoluteIntensityAndAccuracy field is set.
   */
  boolean hasAbsoluteIntensityAndAccuracy();
  /**
   * <pre>
   * Intensity.
   *
   * &#64;unit MilliMeter per Hour
   * &#64;resolution 0.1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy absolute_intensity_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   * @return The absoluteIntensityAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getAbsoluteIntensityAndAccuracy();
  /**
   * <pre>
   * Intensity.
   *
   * &#64;unit MilliMeter per Hour
   * &#64;resolution 0.1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy absolute_intensity_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 1];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getAbsoluteIntensityAndAccuracyOrBuilder();

  org.sensoris.categories.weather.Precipitation.IntensityCase getIntensityCase();
}
