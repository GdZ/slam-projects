/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.roadattribution;

public interface InclinationAndCurvatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.InclinationAndCurvature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Longitudinal declination and accuracy, also referred as slope.
   *
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range (-90, 90)
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy longitudinal_inclination_and_accuracy = 1 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   * @return Whether the longitudinalInclinationAndAccuracy field is set.
   */
  boolean hasLongitudinalInclinationAndAccuracy();
  /**
   * <pre>
   * Longitudinal declination and accuracy, also referred as slope.
   *
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range (-90, 90)
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy longitudinal_inclination_and_accuracy = 1 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   * @return The longitudinalInclinationAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getLongitudinalInclinationAndAccuracy();
  /**
   * <pre>
   * Longitudinal declination and accuracy, also referred as slope.
   *
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range (-90, 90)
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy longitudinal_inclination_and_accuracy = 1 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getLongitudinalInclinationAndAccuracyOrBuilder();

  /**
   * <pre>
   * Lateral declination and accuracy, also referred as cross fall.
   *
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range (-90, 90)
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy lateral_inclination_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   * @return Whether the lateralInclinationAndAccuracy field is set.
   */
  boolean hasLateralInclinationAndAccuracy();
  /**
   * <pre>
   * Lateral declination and accuracy, also referred as cross fall.
   *
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range (-90, 90)
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy lateral_inclination_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   * @return The lateralInclinationAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getLateralInclinationAndAccuracy();
  /**
   * <pre>
   * Lateral declination and accuracy, also referred as cross fall.
   *
   * &#64;unit Degree
   * &#64;resolution 0.01
   * &#64;range (-90, 90)
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy lateral_inclination_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 2];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getLateralInclinationAndAccuracyOrBuilder();

  /**
   * <pre>
   * Horizontal curvature and accuracy.
   *
   * Negative value represents curve to the left, positive value represents curve to the right. Value of 0 represents straight road. The value is the reciproke of the radius (curvature = 1/radius) whereas high radii are represented by low values.
   *
   * &#64;unit 1 per KiloMeter
   * &#64;resolution 0.001
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy horizontal_curvature_and_accuracy = 3 [(.sensoris.protobuf.types.base.exponent) = 3];</code>
   * @return Whether the horizontalCurvatureAndAccuracy field is set.
   */
  boolean hasHorizontalCurvatureAndAccuracy();
  /**
   * <pre>
   * Horizontal curvature and accuracy.
   *
   * Negative value represents curve to the left, positive value represents curve to the right. Value of 0 represents straight road. The value is the reciproke of the radius (curvature = 1/radius) whereas high radii are represented by low values.
   *
   * &#64;unit 1 per KiloMeter
   * &#64;resolution 0.001
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy horizontal_curvature_and_accuracy = 3 [(.sensoris.protobuf.types.base.exponent) = 3];</code>
   * @return The horizontalCurvatureAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getHorizontalCurvatureAndAccuracy();
  /**
   * <pre>
   * Horizontal curvature and accuracy.
   *
   * Negative value represents curve to the left, positive value represents curve to the right. Value of 0 represents straight road. The value is the reciproke of the radius (curvature = 1/radius) whereas high radii are represented by low values.
   *
   * &#64;unit 1 per KiloMeter
   * &#64;resolution 0.001
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy horizontal_curvature_and_accuracy = 3 [(.sensoris.protobuf.types.base.exponent) = 3];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getHorizontalCurvatureAndAccuracyOrBuilder();
}
