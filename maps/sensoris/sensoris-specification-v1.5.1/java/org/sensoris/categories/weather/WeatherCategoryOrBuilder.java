/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
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

  /**
   * <pre>
   * Atmosphere condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.AtmosphereCondition atmosphere_condition = 3;</code>
   */
  java.util.List<org.sensoris.categories.weather.AtmosphereCondition> 
      getAtmosphereConditionList();
  /**
   * <pre>
   * Atmosphere condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.AtmosphereCondition atmosphere_condition = 3;</code>
   */
  org.sensoris.categories.weather.AtmosphereCondition getAtmosphereCondition(int index);
  /**
   * <pre>
   * Atmosphere condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.AtmosphereCondition atmosphere_condition = 3;</code>
   */
  int getAtmosphereConditionCount();
  /**
   * <pre>
   * Atmosphere condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.AtmosphereCondition atmosphere_condition = 3;</code>
   */
  java.util.List<? extends org.sensoris.categories.weather.AtmosphereConditionOrBuilder> 
      getAtmosphereConditionOrBuilderList();
  /**
   * <pre>
   * Atmosphere condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.AtmosphereCondition atmosphere_condition = 3;</code>
   */
  org.sensoris.categories.weather.AtmosphereConditionOrBuilder getAtmosphereConditionOrBuilder(
      int index);

  /**
   * <pre>
   * Wind condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.WindCondition wind_condition = 4;</code>
   */
  java.util.List<org.sensoris.categories.weather.WindCondition> 
      getWindConditionList();
  /**
   * <pre>
   * Wind condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.WindCondition wind_condition = 4;</code>
   */
  org.sensoris.categories.weather.WindCondition getWindCondition(int index);
  /**
   * <pre>
   * Wind condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.WindCondition wind_condition = 4;</code>
   */
  int getWindConditionCount();
  /**
   * <pre>
   * Wind condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.WindCondition wind_condition = 4;</code>
   */
  java.util.List<? extends org.sensoris.categories.weather.WindConditionOrBuilder> 
      getWindConditionOrBuilderList();
  /**
   * <pre>
   * Wind condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.WindCondition wind_condition = 4;</code>
   */
  org.sensoris.categories.weather.WindConditionOrBuilder getWindConditionOrBuilder(
      int index);

  /**
   * <pre>
   * Visibility condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.VisibilityCondition visibility_condition = 5;</code>
   */
  java.util.List<org.sensoris.categories.weather.VisibilityCondition> 
      getVisibilityConditionList();
  /**
   * <pre>
   * Visibility condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.VisibilityCondition visibility_condition = 5;</code>
   */
  org.sensoris.categories.weather.VisibilityCondition getVisibilityCondition(int index);
  /**
   * <pre>
   * Visibility condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.VisibilityCondition visibility_condition = 5;</code>
   */
  int getVisibilityConditionCount();
  /**
   * <pre>
   * Visibility condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.VisibilityCondition visibility_condition = 5;</code>
   */
  java.util.List<? extends org.sensoris.categories.weather.VisibilityConditionOrBuilder> 
      getVisibilityConditionOrBuilderList();
  /**
   * <pre>
   * Visibility condition.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.weather.VisibilityCondition visibility_condition = 5;</code>
   */
  org.sensoris.categories.weather.VisibilityConditionOrBuilder getVisibilityConditionOrBuilder(
      int index);
}
