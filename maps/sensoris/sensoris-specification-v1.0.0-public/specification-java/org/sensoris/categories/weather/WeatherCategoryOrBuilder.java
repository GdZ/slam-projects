// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/weather.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.weather;

public interface WeatherCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.weather.WeatherCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   * @return The envelope.
   */
  org.sensoris.types.base.CategoryEnvelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  java.util.List<org.sensoris.categories.weather.Precipitation> 
      getPrecipitationList();
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  org.sensoris.categories.weather.Precipitation getPrecipitation(int index);
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  int getPrecipitationCount();
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.weather.PrecipitationOrBuilder> 
      getPrecipitationOrBuilderList();
  /**
   * <pre>
   * Precipitation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.Precipitation precipitation = 2;</code>
   */
  org.sensoris.categories.weather.PrecipitationOrBuilder getPrecipitationOrBuilder(
      int index);
}
