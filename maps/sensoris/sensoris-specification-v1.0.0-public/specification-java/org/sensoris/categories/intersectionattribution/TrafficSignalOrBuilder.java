// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/intersection_attribution.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.intersectionattribution;

public interface TrafficSignalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.intersectionattribution.TrafficSignal)
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
   * Confidence that a traffic signal has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   * @return Whether the existenceConfidence field is set.
   */
  boolean hasExistenceConfidence();
  /**
   * <pre>
   * Confidence that a traffic signal has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   * @return The existenceConfidence.
   */
  org.sensoris.types.base.Confidence getExistenceConfidence();
  /**
   * <pre>
   * Confidence that a traffic signal has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   */
  org.sensoris.types.base.ConfidenceOrBuilder getExistenceConfidenceOrBuilder();

  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 3;</code>
   * @return Whether the detectionStatus field is set.
   */
  boolean hasDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 3;</code>
   * @return The detectionStatus.
   */
  org.sensoris.types.base.EventDetectionStatus getDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 3;</code>
   */
  org.sensoris.types.base.EventDetectionStatusOrBuilder getDetectionStatusOrBuilder();

  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 4;</code>
   * @return Whether the rectangularBoxAndAccuracy field is set.
   */
  boolean hasRectangularBoxAndAccuracy();
  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 4;</code>
   * @return The rectangularBoxAndAccuracy.
   */
  org.sensoris.types.spatial.RectangularBoxAndAccuracy getRectangularBoxAndAccuracy();
  /**
   * <pre>
   * Rectangular box and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RectangularBoxAndAccuracy rectangular_box_and_accuracy = 4;</code>
   */
  org.sensoris.types.spatial.RectangularBoxAndAccuracyOrBuilder getRectangularBoxAndAccuracyOrBuilder();

  /**
   * <pre>
   * Number of bulbs and confidence.
   *
   * &#64;example Traffic signal has three bulbs with confidence 90 %.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CountAndConfidence bulb_count_and_confidence = 5;</code>
   * @return Whether the bulbCountAndConfidence field is set.
   */
  boolean hasBulbCountAndConfidence();
  /**
   * <pre>
   * Number of bulbs and confidence.
   *
   * &#64;example Traffic signal has three bulbs with confidence 90 %.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CountAndConfidence bulb_count_and_confidence = 5;</code>
   * @return The bulbCountAndConfidence.
   */
  org.sensoris.types.base.CountAndConfidence getBulbCountAndConfidence();
  /**
   * <pre>
   * Number of bulbs and confidence.
   *
   * &#64;example Traffic signal has three bulbs with confidence 90 %.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CountAndConfidence bulb_count_and_confidence = 5;</code>
   */
  org.sensoris.types.base.CountAndConfidenceOrBuilder getBulbCountAndConfidenceOrBuilder();

  /**
   * <pre>
   * Orientation and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.intersectionattribution.TrafficSignal.OrientationAndConfidence orientation_and_confidence = 6;</code>
   * @return Whether the orientationAndConfidence field is set.
   */
  boolean hasOrientationAndConfidence();
  /**
   * <pre>
   * Orientation and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.intersectionattribution.TrafficSignal.OrientationAndConfidence orientation_and_confidence = 6;</code>
   * @return The orientationAndConfidence.
   */
  org.sensoris.categories.intersectionattribution.TrafficSignal.OrientationAndConfidence getOrientationAndConfidence();
  /**
   * <pre>
   * Orientation and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.intersectionattribution.TrafficSignal.OrientationAndConfidence orientation_and_confidence = 6;</code>
   */
  org.sensoris.categories.intersectionattribution.TrafficSignal.OrientationAndConfidenceOrBuilder getOrientationAndConfidenceOrBuilder();
}
