// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.roadattribution;

public interface LaneBoundaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.LaneBoundary)
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
   * Lane boundary identifier.
   *
   * Identifier is unique within a DataMessage and can be used to trace lane boundaries between LaneBoundary events.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value lane_boundary_id = 2;</code>
   * @return Whether the laneBoundaryId field is set.
   */
  boolean hasLaneBoundaryId();
  /**
   * <pre>
   * Lane boundary identifier.
   *
   * Identifier is unique within a DataMessage and can be used to trace lane boundaries between LaneBoundary events.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value lane_boundary_id = 2;</code>
   * @return The laneBoundaryId.
   */
  com.google.protobuf.Int64Value getLaneBoundaryId();
  /**
   * <pre>
   * Lane boundary identifier.
   *
   * Identifier is unique within a DataMessage and can be used to trace lane boundaries between LaneBoundary events.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value lane_boundary_id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLaneBoundaryIdOrBuilder();

  /**
   * <pre>
   * Confidence that a lane boundary has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 3;</code>
   * @return Whether the existenceConfidence field is set.
   */
  boolean hasExistenceConfidence();
  /**
   * <pre>
   * Confidence that a lane boundary has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 3;</code>
   * @return The existenceConfidence.
   */
  org.sensoris.types.base.Confidence getExistenceConfidence();
  /**
   * <pre>
   * Confidence that a lane boundary has been detected.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence existence_confidence = 3;</code>
   */
  org.sensoris.types.base.ConfidenceOrBuilder getExistenceConfidenceOrBuilder();

  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 4;</code>
   * @return Whether the detectionStatus field is set.
   */
  boolean hasDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 4;</code>
   * @return The detectionStatus.
   */
  org.sensoris.types.base.EventDetectionStatus getDetectionStatus();
  /**
   * <pre>
   * Event detection status.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventDetectionStatus detection_status = 4;</code>
   */
  org.sensoris.types.base.EventDetectionStatusOrBuilder getDetectionStatusOrBuilder();

  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.TypeAndConfidence type_and_confidence = 5;</code>
   * @return Whether the typeAndConfidence field is set.
   */
  boolean hasTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.TypeAndConfidence type_and_confidence = 5;</code>
   * @return The typeAndConfidence.
   */
  org.sensoris.categories.roadattribution.LaneBoundary.TypeAndConfidence getTypeAndConfidence();
  /**
   * <pre>
   * Type and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.TypeAndConfidence type_and_confidence = 5;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundary.TypeAndConfidenceOrBuilder getTypeAndConfidenceOrBuilder();

  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 6;</code>
   * @return Whether the materialAndConfidence field is set.
   */
  boolean hasMaterialAndConfidence();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 6;</code>
   * @return The materialAndConfidence.
   */
  org.sensoris.categories.roadattribution.MarkingMaterialAndConfidence getMaterialAndConfidence();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingMaterialAndConfidence material_and_confidence = 6;</code>
   */
  org.sensoris.categories.roadattribution.MarkingMaterialAndConfidenceOrBuilder getMaterialAndConfidenceOrBuilder();

  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 7;</code>
   * @return Whether the colorAndConfidence field is set.
   */
  boolean hasColorAndConfidence();
  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 7;</code>
   * @return The colorAndConfidence.
   */
  org.sensoris.categories.roadattribution.MarkingColorAndConfidence getColorAndConfidence();
  /**
   * <pre>
   * Marking color and confidence.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence color_and_confidence = 7;</code>
   */
  org.sensoris.categories.roadattribution.MarkingColorAndConfidenceOrBuilder getColorAndConfidenceOrBuilder();

  /**
   * <pre>
   * Position reference of lane boundary marking geometry, i.e. polyline_and_accuracy represents left boundary, center line or right boundary of the lane boundary markings.
   *
   * Whereas for e.g. lines all values may be used, for physical barriers the geometry shall represent the boundary closest to the vehicle.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.PositionReference position_reference = 8;</code>
   * @return The enum numeric value on the wire for positionReference.
   */
  int getPositionReferenceValue();
  /**
   * <pre>
   * Position reference of lane boundary marking geometry, i.e. polyline_and_accuracy represents left boundary, center line or right boundary of the lane boundary markings.
   *
   * Whereas for e.g. lines all values may be used, for physical barriers the geometry shall represent the boundary closest to the vehicle.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.PositionReference position_reference = 8;</code>
   * @return The positionReference.
   */
  org.sensoris.categories.roadattribution.LaneBoundary.PositionReference getPositionReference();

  /**
   * <pre>
   * Polyline geometry.
   *
   * Polyline can also be a single point.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PolylineAndAccuracy polyline_and_accuracy = 9;</code>
   * @return Whether the polylineAndAccuracy field is set.
   */
  boolean hasPolylineAndAccuracy();
  /**
   * <pre>
   * Polyline geometry.
   *
   * Polyline can also be a single point.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PolylineAndAccuracy polyline_and_accuracy = 9;</code>
   * @return The polylineAndAccuracy.
   */
  org.sensoris.types.spatial.PolylineAndAccuracy getPolylineAndAccuracy();
  /**
   * <pre>
   * Polyline geometry.
   *
   * Polyline can also be a single point.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PolylineAndAccuracy polyline_and_accuracy = 9;</code>
   */
  org.sensoris.types.spatial.PolylineAndAccuracyOrBuilder getPolylineAndAccuracyOrBuilder();

  /**
   * <pre>
   * Width and accuracy.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy width_and_accuracy = 10 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the widthAndAccuracy field is set.
   */
  boolean hasWidthAndAccuracy();
  /**
   * <pre>
   * Width and accuracy.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy width_and_accuracy = 10 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The widthAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getWidthAndAccuracy();
  /**
   * <pre>
   * Width and accuracy.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy width_and_accuracy = 10 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getWidthAndAccuracyOrBuilder();

  /**
   * <pre>
   * Height and accuracy.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy height_and_accuracy = 11 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the heightAndAccuracy field is set.
   */
  boolean hasHeightAndAccuracy();
  /**
   * <pre>
   * Height and accuracy.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy height_and_accuracy = 11 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The heightAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getHeightAndAccuracy();
  /**
   * <pre>
   * Height and accuracy.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy height_and_accuracy = 11 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getHeightAndAccuracyOrBuilder();

  /**
   * <pre>
   * Distance between parallel double lines.
   *
   * Only applicable for types LINE_DOUBLE, LINE_DOUBLE_SOLID, LINE_DOUBLE_DASHED, LINE_DOUBLE_SOLID_DASHED and LINE_DOUBLE_DASHED_SOLID.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy distance_between_double_and_accuracy = 12 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the distanceBetweenDoubleAndAccuracy field is set.
   */
  boolean hasDistanceBetweenDoubleAndAccuracy();
  /**
   * <pre>
   * Distance between parallel double lines.
   *
   * Only applicable for types LINE_DOUBLE, LINE_DOUBLE_SOLID, LINE_DOUBLE_DASHED, LINE_DOUBLE_SOLID_DASHED and LINE_DOUBLE_DASHED_SOLID.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy distance_between_double_and_accuracy = 12 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The distanceBetweenDoubleAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getDistanceBetweenDoubleAndAccuracy();
  /**
   * <pre>
   * Distance between parallel double lines.
   *
   * Only applicable for types LINE_DOUBLE, LINE_DOUBLE_SOLID, LINE_DOUBLE_DASHED, LINE_DOUBLE_SOLID_DASHED and LINE_DOUBLE_DASHED_SOLID.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy distance_between_double_and_accuracy = 12 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getDistanceBetweenDoubleAndAccuracyOrBuilder();

  /**
   * <pre>
   * Statistics of length of single lane dashes and offset between dashes on lane boundary geometry.
   *
   * Only applicable for lane boundaries of type LONG_DASHED_LINE, SOLID_LINE_DASHED_LINE, DASHED_LINE_SOLID_LINE, SHORT_DASHED, DASHED_BLOCKS and DOUBLE_DASHED_LINE.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.DashStatistics dash_statistics = 13;</code>
   * @return Whether the dashStatistics field is set.
   */
  boolean hasDashStatistics();
  /**
   * <pre>
   * Statistics of length of single lane dashes and offset between dashes on lane boundary geometry.
   *
   * Only applicable for lane boundaries of type LONG_DASHED_LINE, SOLID_LINE_DASHED_LINE, DASHED_LINE_SOLID_LINE, SHORT_DASHED, DASHED_BLOCKS and DOUBLE_DASHED_LINE.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.DashStatistics dash_statistics = 13;</code>
   * @return The dashStatistics.
   */
  org.sensoris.categories.roadattribution.LaneBoundary.DashStatistics getDashStatistics();
  /**
   * <pre>
   * Statistics of length of single lane dashes and offset between dashes on lane boundary geometry.
   *
   * Only applicable for lane boundaries of type LONG_DASHED_LINE, SOLID_LINE_DASHED_LINE, DASHED_LINE_SOLID_LINE, SHORT_DASHED, DASHED_BLOCKS and DOUBLE_DASHED_LINE.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.DashStatistics dash_statistics = 13;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundary.DashStatisticsOrBuilder getDashStatisticsOrBuilder();

  /**
   * <pre>
   * Offsets of markings as type and offset on lane boundary geometry relative to first vertex of lane boundary geometry.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.MarkingOffsets marking_offsets = 14;</code>
   * @return Whether the markingOffsets field is set.
   */
  boolean hasMarkingOffsets();
  /**
   * <pre>
   * Offsets of markings as type and offset on lane boundary geometry relative to first vertex of lane boundary geometry.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.MarkingOffsets marking_offsets = 14;</code>
   * @return The markingOffsets.
   */
  org.sensoris.categories.roadattribution.LaneBoundary.MarkingOffsets getMarkingOffsets();
  /**
   * <pre>
   * Offsets of markings as type and offset on lane boundary geometry relative to first vertex of lane boundary geometry.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.LaneBoundary.MarkingOffsets marking_offsets = 14;</code>
   */
  org.sensoris.categories.roadattribution.LaneBoundary.MarkingOffsetsOrBuilder getMarkingOffsetsOrBuilder();

  org.sensoris.categories.roadattribution.LaneBoundary.GeometryCase getGeometryCase();

  org.sensoris.categories.roadattribution.LaneBoundary.MarkingsCase getMarkingsCase();
}