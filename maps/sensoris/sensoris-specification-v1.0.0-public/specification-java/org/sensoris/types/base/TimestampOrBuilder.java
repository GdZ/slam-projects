// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.base;

public interface TimestampOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.Timestamp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * POSIX time in milliseconds.
   *
   * &#64;unit MilliSecond
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time = 1;</code>
   * @return Whether the posixTime field is set.
   */
  boolean hasPosixTime();
  /**
   * <pre>
   * POSIX time in milliseconds.
   *
   * &#64;unit MilliSecond
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time = 1;</code>
   * @return The posixTime.
   */
  com.google.protobuf.Int64Value getPosixTime();
  /**
   * <pre>
   * POSIX time in milliseconds.
   *
   * &#64;unit MilliSecond
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPosixTimeOrBuilder();

  /**
   * <pre>
   * Microseconds fraction of POSIX time.
   *
   * &#64;unit MicroSecond
   * &#64;resolution 1
   * &#64;range [0, 1000)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return Whether the posixTimeFraction field is set.
   */
  boolean hasPosixTimeFraction();
  /**
   * <pre>
   * Microseconds fraction of POSIX time.
   *
   * &#64;unit MicroSecond
   * &#64;resolution 1
   * &#64;range [0, 1000)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   * @return The posixTimeFraction.
   */
  com.google.protobuf.Int64Value getPosixTimeFraction();
  /**
   * <pre>
   * Microseconds fraction of POSIX time.
   *
   * &#64;unit MicroSecond
   * &#64;resolution 1
   * &#64;range [0, 1000)
   * </pre>
   *
   * <code>.google.protobuf.Int64Value posix_time_fraction = 2 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getPosixTimeFractionOrBuilder();
}