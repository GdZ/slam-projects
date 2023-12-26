/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.roadattribution;

public interface SurfaceAttributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.SurfaceAttribution)
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
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 2;</code>
   * @return Whether the positionAndAccuracy field is set.
   */
  boolean hasPositionAndAccuracy();
  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 2;</code>
   * @return The positionAndAccuracy.
   */
  org.sensoris.types.spatial.PositionAndAccuracy getPositionAndAccuracy();
  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 2;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracyOrBuilder getPositionAndAccuracyOrBuilder();

  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   * @return Whether the inclinationAndCurvature field is set.
   */
  boolean hasInclinationAndCurvature();
  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   * @return The inclinationAndCurvature.
   */
  org.sensoris.categories.roadattribution.InclinationAndCurvature getInclinationAndCurvature();
  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   */
  org.sensoris.categories.roadattribution.InclinationAndCurvatureOrBuilder getInclinationAndCurvatureOrBuilder();

  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidence> 
      getMaterialAndConfidenceList();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidence getMaterialAndConfidence(int index);
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  int getMaterialAndConfidenceCount();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidenceOrBuilder> 
      getMaterialAndConfidenceOrBuilderList();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidenceOrBuilder getMaterialAndConfidenceOrBuilder(
      int index);

  /**
   * <pre>
   * International Roughness Index (IRI).
   *
   * &#64;unit MilliMeter per KiloMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy road_roughness_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the roadRoughnessAndAccuracy field is set.
   */
  boolean hasRoadRoughnessAndAccuracy();
  /**
   * <pre>
   * International Roughness Index (IRI).
   *
   * &#64;unit MilliMeter per KiloMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy road_roughness_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The roadRoughnessAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getRoadRoughnessAndAccuracy();
  /**
   * <pre>
   * International Roughness Index (IRI).
   *
   * &#64;unit MilliMeter per KiloMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy road_roughness_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getRoadRoughnessAndAccuracyOrBuilder();
}
