// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface RelativeInt64HistogramOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.RelativeInt64Histogram)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   * @return Whether the timestampInterval field is set.
   */
  boolean hasTimestampInterval();
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   * @return The timestampInterval.
   */
  org.sensoris.types.base.TimestampInterval getTimestampInterval();
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder();

  /**
   * <pre>
   * Total elements.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_elements = 2;</code>
   * @return Whether the totalElements field is set.
   */
  boolean hasTotalElements();
  /**
   * <pre>
   * Total elements.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_elements = 2;</code>
   * @return The totalElements.
   */
  com.google.protobuf.Int64Value getTotalElements();
  /**
   * <pre>
   * Total elements.
   *
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value total_elements = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTotalElementsOrBuilder();

  /**
   * <pre>
   * Bin.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.RelativeInt64Histogram.Bin bin = 3;</code>
   */
  java.util.List<org.sensoris.types.base.RelativeInt64Histogram.Bin> 
      getBinList();
  /**
   * <pre>
   * Bin.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.RelativeInt64Histogram.Bin bin = 3;</code>
   */
  org.sensoris.types.base.RelativeInt64Histogram.Bin getBin(int index);
  /**
   * <pre>
   * Bin.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.RelativeInt64Histogram.Bin bin = 3;</code>
   */
  int getBinCount();
  /**
   * <pre>
   * Bin.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.RelativeInt64Histogram.Bin bin = 3;</code>
   */
  java.util.List<? extends org.sensoris.types.base.RelativeInt64Histogram.BinOrBuilder> 
      getBinOrBuilderList();
  /**
   * <pre>
   * Bin.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.types.base.RelativeInt64Histogram.Bin bin = 3;</code>
   */
  org.sensoris.types.base.RelativeInt64Histogram.BinOrBuilder getBinOrBuilder(
      int index);

  /**
   * <pre>
   * Upper endpoint of last bin.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value upper_endpoint_inclusive = 4;</code>
   * @return Whether the upperEndpointInclusive field is set.
   */
  boolean hasUpperEndpointInclusive();
  /**
   * <pre>
   * Upper endpoint of last bin.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value upper_endpoint_inclusive = 4;</code>
   * @return The upperEndpointInclusive.
   */
  com.google.protobuf.Int64Value getUpperEndpointInclusive();
  /**
   * <pre>
   * Upper endpoint of last bin.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value upper_endpoint_inclusive = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getUpperEndpointInclusiveOrBuilder();
}
