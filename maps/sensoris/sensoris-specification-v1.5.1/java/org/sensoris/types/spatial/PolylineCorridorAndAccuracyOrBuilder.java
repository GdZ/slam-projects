/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/spatial.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.spatial;

public interface PolylineCorridorAndAccuracyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.spatial.PolylineCorridorAndAccuracy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Center polyline of geographic or metric positions and metric accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PolylineAndAccuracy center_polyline_and_accuracy = 1;</code>
   * @return Whether the centerPolylineAndAccuracy field is set.
   */
  boolean hasCenterPolylineAndAccuracy();
  /**
   * <pre>
   * Center polyline of geographic or metric positions and metric accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PolylineAndAccuracy center_polyline_and_accuracy = 1;</code>
   * @return The centerPolylineAndAccuracy.
   */
  org.sensoris.types.spatial.PolylineAndAccuracy getCenterPolylineAndAccuracy();
  /**
   * <pre>
   * Center polyline of geographic or metric positions and metric accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PolylineAndAccuracy center_polyline_and_accuracy = 1;</code>
   */
  org.sensoris.types.spatial.PolylineAndAccuracyOrBuilder getCenterPolylineAndAccuracyOrBuilder();

  /**
   * <pre>
   * Total width and accuracy defined as double symmetric distance from the center polyline.
   *
   * &#64;unit CentiMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy total_width_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the totalWidthAndAccuracy field is set.
   */
  boolean hasTotalWidthAndAccuracy();
  /**
   * <pre>
   * Total width and accuracy defined as double symmetric distance from the center polyline.
   *
   * &#64;unit CentiMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy total_width_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The totalWidthAndAccuracy.
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getTotalWidthAndAccuracy();
  /**
   * <pre>
   * Total width and accuracy defined as double symmetric distance from the center polyline.
   *
   * &#64;unit CentiMeter
   * &#64;resolution 1
   * &#64;range (0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy total_width_and_accuracy = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getTotalWidthAndAccuracyOrBuilder();

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
}