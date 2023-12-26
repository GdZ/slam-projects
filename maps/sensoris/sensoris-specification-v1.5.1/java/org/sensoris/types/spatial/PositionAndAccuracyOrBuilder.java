/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/spatial.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.spatial;

public interface PositionAndAccuracyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.spatial.PositionAndAccuracy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Geographic position in World Geodetic System 84 (WGS84) reference system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Geographic geographic_wgs84 = 1;</code>
   * @return Whether the geographicWgs84 field is set.
   */
  boolean hasGeographicWgs84();
  /**
   * <pre>
   * Geographic position in World Geodetic System 84 (WGS84) reference system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Geographic geographic_wgs84 = 1;</code>
   * @return The geographicWgs84.
   */
  org.sensoris.types.spatial.PositionAndAccuracy.Geographic getGeographicWgs84();
  /**
   * <pre>
   * Geographic position in World Geodetic System 84 (WGS84) reference system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Geographic geographic_wgs84 = 1;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy.GeographicOrBuilder getGeographicWgs84OrBuilder();

  /**
   * <pre>
   * Metric position in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_vehicle = 2;</code>
   * @return Whether the metricVehicle field is set.
   */
  boolean hasMetricVehicle();
  /**
   * <pre>
   * Metric position in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_vehicle = 2;</code>
   * @return The metricVehicle.
   */
  org.sensoris.types.spatial.PositionAndAccuracy.Metric getMetricVehicle();
  /**
   * <pre>
   * Metric position in SENSORIS vehicle coordinate system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_vehicle = 2;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy.MetricOrBuilder getMetricVehicleOrBuilder();

  /**
   * <pre>
   * Metric position in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_event_group = 3;</code>
   * @return Whether the metricEventGroup field is set.
   */
  boolean hasMetricEventGroup();
  /**
   * <pre>
   * Metric position in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_event_group = 3;</code>
   * @return The metricEventGroup.
   */
  org.sensoris.types.spatial.PositionAndAccuracy.Metric getMetricEventGroup();
  /**
   * <pre>
   * Metric position in relative coordinate system, the reference coordinate system is the origin of the event group.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_event_group = 3;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy.MetricOrBuilder getMetricEventGroupOrBuilder();

  /**
   * <pre>
   * Metric position in Earth-Centered Earth-Fixed (ECEF) reference system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_ecef = 4;</code>
   * @return Whether the metricEcef field is set.
   */
  boolean hasMetricEcef();
  /**
   * <pre>
   * Metric position in Earth-Centered Earth-Fixed (ECEF) reference system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_ecef = 4;</code>
   * @return The metricEcef.
   */
  org.sensoris.types.spatial.PositionAndAccuracy.Metric getMetricEcef();
  /**
   * <pre>
   * Metric position in Earth-Centered Earth-Fixed (ECEF) reference system.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.Metric metric_ecef = 4;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy.MetricOrBuilder getMetricEcefOrBuilder();

  /**
   * <pre>
   * Accuracy as combined standard deviation of metric horizontal and metric vertical position.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value combined_std_dev = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the combinedStdDev field is set.
   */
  boolean hasCombinedStdDev();
  /**
   * <pre>
   * Accuracy as combined standard deviation of metric horizontal and metric vertical position.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value combined_std_dev = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The combinedStdDev.
   */
  com.google.protobuf.Int64Value getCombinedStdDev();
  /**
   * <pre>
   * Accuracy as combined standard deviation of metric horizontal and metric vertical position.
   *
   * &#64;unit MilliMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value combined_std_dev = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCombinedStdDevOrBuilder();

  /**
   * <pre>
   * Accuracy as standard deviation of metric horizontal position and metric vertical position.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.HorizontalVerticalStdDev std_dev = 6;</code>
   * @return Whether the stdDev field is set.
   */
  boolean hasStdDev();
  /**
   * <pre>
   * Accuracy as standard deviation of metric horizontal position and metric vertical position.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.HorizontalVerticalStdDev std_dev = 6;</code>
   * @return The stdDev.
   */
  org.sensoris.types.spatial.PositionAndAccuracy.HorizontalVerticalStdDev getStdDev();
  /**
   * <pre>
   * Accuracy as standard deviation of metric horizontal position and metric vertical position.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.HorizontalVerticalStdDev std_dev = 6;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy.HorizontalVerticalStdDevOrBuilder getStdDevOrBuilder();

  /**
   * <pre>
   * Accuracy as metric horizontal confidence ellipse and standard deviation of metric vertical position.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.HorizontalConfidenceEllipseVerticalStdDev horizontal_confidence_ellipse_vertical_std_dev = 7;</code>
   * @return Whether the horizontalConfidenceEllipseVerticalStdDev field is set.
   */
  boolean hasHorizontalConfidenceEllipseVerticalStdDev();
  /**
   * <pre>
   * Accuracy as metric horizontal confidence ellipse and standard deviation of metric vertical position.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.HorizontalConfidenceEllipseVerticalStdDev horizontal_confidence_ellipse_vertical_std_dev = 7;</code>
   * @return The horizontalConfidenceEllipseVerticalStdDev.
   */
  org.sensoris.types.spatial.PositionAndAccuracy.HorizontalConfidenceEllipseVerticalStdDev getHorizontalConfidenceEllipseVerticalStdDev();
  /**
   * <pre>
   * Accuracy as metric horizontal confidence ellipse and standard deviation of metric vertical position.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy.HorizontalConfidenceEllipseVerticalStdDev horizontal_confidence_ellipse_vertical_std_dev = 7;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy.HorizontalConfidenceEllipseVerticalStdDevOrBuilder getHorizontalConfidenceEllipseVerticalStdDevOrBuilder();

  /**
   * <pre>
   * Accuracy as 3 x 3 covariance matrix of metric position of (x, x), (x, y), (x, z), (y, x), (y, y), (y, z), (z, x), (z, y), (z, z).
   *
   * &#64;unit MilliMeter squared
   * &#64;resolution 1
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Matrix3x3 covariance = 8 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the covariance field is set.
   */
  boolean hasCovariance();
  /**
   * <pre>
   * Accuracy as 3 x 3 covariance matrix of metric position of (x, x), (x, y), (x, z), (y, x), (y, y), (y, z), (z, x), (z, y), (z, z).
   *
   * &#64;unit MilliMeter squared
   * &#64;resolution 1
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Matrix3x3 covariance = 8 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The covariance.
   */
  org.sensoris.types.base.Int64Matrix3x3 getCovariance();
  /**
   * <pre>
   * Accuracy as 3 x 3 covariance matrix of metric position of (x, x), (x, y), (x, z), (y, x), (y, y), (y, z), (z, x), (z, y), (z, z).
   *
   * &#64;unit MilliMeter squared
   * &#64;resolution 1
   * &#64;range ( , )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64Matrix3x3 covariance = 8 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64Matrix3x3OrBuilder getCovarianceOrBuilder();

  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.Any getExtension(int index);
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index);

  org.sensoris.types.spatial.PositionAndAccuracy.GeographicMetricCase getGeographicMetricCase();

  org.sensoris.types.spatial.PositionAndAccuracy.AccuracyCase getAccuracyCase();
}