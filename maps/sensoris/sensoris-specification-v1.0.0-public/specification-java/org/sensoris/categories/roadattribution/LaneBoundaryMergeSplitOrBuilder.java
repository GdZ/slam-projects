// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.roadattribution;

public interface LaneBoundaryMergeSplitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit)
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
   * Confidence that a lane boundary merge or split has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   * @return Whether the existenceConfidence field is set.
   */
  boolean hasExistenceConfidence();
  /**
   * <pre>
   * Confidence that a lane boundary merge or split has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 2;</code>
   * @return The existenceConfidence.
   */
  org.sensoris.types.base.Confidence getExistenceConfidence();
  /**
   * <pre>
   * Confidence that a lane boundary merge or split has been detected.
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
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit.TypeAndConfidence type_and_confidence = 4;</code>
   * @return Whether the typeAndConfidence field is set.
   */
  boolean hasTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit.TypeAndConfidence type_and_confidence = 4;</code>
   * @return The typeAndConfidence.
   */
  org.sensoris.categories.roadattribution.LaneBoundaryMergeSplit.TypeAndConfidence getTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundaryMergeSplit.TypeAndConfidence type_and_confidence = 4;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundaryMergeSplit.TypeAndConfidenceOrBuilder getTypeAndConfidenceOrBuilder();

  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 5;</code>
   * @return Whether the positionAndAccuracy field is set.
   */
  boolean hasPositionAndAccuracy();
  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 5;</code>
   * @return The positionAndAccuracy.
   */
  org.sensoris.types.spatial.PositionAndAccuracy getPositionAndAccuracy();
  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 5;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracyOrBuilder getPositionAndAccuracyOrBuilder();
}