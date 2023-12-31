/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/weather.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.weather;

public final class SensorisWeatherCategory {
  private SensorisWeatherCategory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_Precipitation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_Precipitation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_Precipitation_TypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_Precipitation_TypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_AtmosphereCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_AtmosphereCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_WindCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_WindCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_WindCondition_TypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_WindCondition_TypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_TypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_TypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_weather_WeatherCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_weather_WeatherCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*sensoris/protobuf/categories/weather.p" +
      "roto\022$sensoris.protobuf.categories.weath" +
      "er\032\"sensoris/protobuf/types/base.proto\"\336" +
      "\005\n\rPrecipitation\022=\n\010envelope\030\001 \001(\0132+.sen" +
      "soris.protobuf.types.base.EventEnvelope\022" +
      "L\n\020detection_status\030\002 \001(\01322.sensoris.pro" +
      "tobuf.types.base.EventDetectionStatus\022b\n" +
      "\023type_and_confidence\030\003 \001(\0132E.sensoris.pr" +
      "otobuf.categories.weather.Precipitation." +
      "TypeAndConfidence\022d\n\037relative_intensity_" +
      "and_accuracy\030\004 \001(\01323.sensoris.protobuf.t" +
      "ypes.base.Int64ValueAndAccuracyB\004\210\265\030\000H\000\022" +
      "d\n\037absolute_intensity_and_accuracy\030\005 \001(\013" +
      "23.sensoris.protobuf.types.base.Int64Val" +
      "ueAndAccuracyB\004\210\265\030\001H\000\032\202\002\n\021TypeAndConfide" +
      "nce\022X\n\004type\030\001 \001(\0162J.sensoris.protobuf.ca" +
      "tegories.weather.Precipitation.TypeAndCo" +
      "nfidence.Type\022<\n\nconfidence\030\002 \001(\0132(.sens" +
      "oris.protobuf.types.base.Confidence\"U\n\004T" +
      "ype\022\020\n\014UNKNOWN_TYPE\020\000\022\010\n\004NONE\020\001\022\010\n\004RAIN\020" +
      "\002\022\023\n\017MIXED_RAIN_SNOW\020\003\022\010\n\004SNOW\020\004\022\010\n\004HAIL" +
      "\020\005B\013\n\tintensity\"\336\002\n\023AtmosphereCondition\022" +
      "=\n\010envelope\030\001 \001(\0132+.sensoris.protobuf.ty" +
      "pes.base.EventEnvelope\022Z\n\027outside_air_te" +
      "mperature\030\002 \001(\01323.sensoris.protobuf.type" +
      "s.base.Int64ValueAndAccuracyB\004\210\265\030\000\022T\n\021re" +
      "lative_humidity\030\003 \001(\01323.sensoris.protobu" +
      "f.types.base.Int64ValueAndAccuracyB\004\210\265\030\000" +
      "\022V\n\023static_air_pressure\030\004 \001(\01323.sensoris" +
      ".protobuf.types.base.Int64ValueAndAccura" +
      "cyB\004\210\265\030\000\"\261\005\n\rWindCondition\022=\n\010envelope\030\001" +
      " \001(\0132+.sensoris.protobuf.types.base.Even" +
      "tEnvelope\022L\n\020detection_status\030\002 \001(\01322.se" +
      "nsoris.protobuf.types.base.EventDetectio" +
      "nStatus\022b\n\023type_and_confidence\030\003 \001(\0132E.s" +
      "ensoris.protobuf.categories.weather.Wind" +
      "Condition.TypeAndConfidence\022U\n\022speed_and" +
      "_accuracy\030\004 \001(\01323.sensoris.protobuf.type" +
      "s.base.Int64ValueAndAccuracyB\004\210\265\030\000\022Y\n\026di" +
      "rection_and_accuracy\030\005 \001(\01323.sensoris.pr" +
      "otobuf.types.base.Int64ValueAndAccuracyB" +
      "\004\210\265\030\000\032\374\001\n\021TypeAndConfidence\022X\n\004type\030\001 \001(" +
      "\0162J.sensoris.protobuf.categories.weather" +
      ".WindCondition.TypeAndConfidence.Type\022<\n" +
      "\nconfidence\030\002 \001(\0132(.sensoris.protobuf.ty" +
      "pes.base.Confidence\"O\n\004Type\022\020\n\014UNKNOWN_T" +
      "YPE\020\000\022\014\n\010VARIABLE\020\001\022\n\n\006STRONG\020\002\022\020\n\014STRON" +
      "G_CROSS\020\003\022\t\n\005STORM\020\004\"\306\005\n\023VisibilityCondi" +
      "tion\022=\n\010envelope\030\001 \001(\0132+.sensoris.protob" +
      "uf.types.base.EventEnvelope\022h\n\023type_and_" +
      "confidence\030\002 \001(\0132K.sensoris.protobuf.cat" +
      "egories.weather.VisibilityCondition.Type" +
      "AndConfidence\022`\n\035visible_distance_and_ac" +
      "curacy\030\003 \001(\01323.sensoris.protobuf.types.b" +
      "ase.Int64ValueAndAccuracyB\004\210\265\030\000\022i\n&senso" +
      "r_detection_distance_and_accuracy\030\004 \001(\0132" +
      "3.sensoris.protobuf.types.base.Int64Valu" +
      "eAndAccuracyB\004\210\265\030\000\032\270\002\n\021TypeAndConfidence" +
      "\022^\n\004type\030\001 \001(\0162P.sensoris.protobuf.categ" +
      "ories.weather.VisibilityCondition.TypeAn" +
      "dConfidence.Type\022<\n\nconfidence\030\002 \001(\0132(.s" +
      "ensoris.protobuf.types.base.Confidence\"\204" +
      "\001\n\004Type\022\020\n\014UNKNOWN_TYPE\020\000\022\t\n\005CLEAR\020\001\022\010\n\004" +
      "MIST\020\002\022\022\n\016LOW_HEAVY_RAIN\020\003\022\022\n\016LOW_HEAVY_" +
      "SNOW\020\004\022\r\n\tLOW_SMOKE\020\005\022\013\n\007LOW_FOG\020\006\022\021\n\rLO" +
      "W_SUN_GLARE\020\007\"\236\003\n\017WeatherCategory\022@\n\010env" +
      "elope\030\001 \001(\0132..sensoris.protobuf.types.ba" +
      "se.CategoryEnvelope\022J\n\rprecipitation\030\002 \003" +
      "(\01323.sensoris.protobuf.categories.weathe" +
      "r.Precipitation\022W\n\024atmosphere_condition\030" +
      "\003 \003(\01329.sensoris.protobuf.categories.wea" +
      "ther.AtmosphereCondition\022K\n\016wind_conditi" +
      "on\030\004 \003(\01323.sensoris.protobuf.categories." +
      "weather.WindCondition\022W\n\024visibility_cond" +
      "ition\030\005 \003(\01329.sensoris.protobuf.categori" +
      "es.weather.VisibilityConditionBn\n\037org.se" +
      "nsoris.categories.weatherB\027SensorisWeath" +
      "erCategoryP\001Z-sensoris.org/specification" +
      "/categories/weather\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
        });
    internal_static_sensoris_protobuf_categories_weather_Precipitation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_categories_weather_Precipitation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_Precipitation_descriptor,
        new java.lang.String[] { "Envelope", "DetectionStatus", "TypeAndConfidence", "RelativeIntensityAndAccuracy", "AbsoluteIntensityAndAccuracy", "Intensity", });
    internal_static_sensoris_protobuf_categories_weather_Precipitation_TypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_weather_Precipitation_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_weather_Precipitation_TypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_Precipitation_TypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_weather_AtmosphereCondition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensoris_protobuf_categories_weather_AtmosphereCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_AtmosphereCondition_descriptor,
        new java.lang.String[] { "Envelope", "OutsideAirTemperature", "RelativeHumidity", "StaticAirPressure", });
    internal_static_sensoris_protobuf_categories_weather_WindCondition_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensoris_protobuf_categories_weather_WindCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_WindCondition_descriptor,
        new java.lang.String[] { "Envelope", "DetectionStatus", "TypeAndConfidence", "SpeedAndAccuracy", "DirectionAndAccuracy", });
    internal_static_sensoris_protobuf_categories_weather_WindCondition_TypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_weather_WindCondition_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_weather_WindCondition_TypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_WindCondition_TypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_descriptor,
        new java.lang.String[] { "Envelope", "TypeAndConfidence", "VisibleDistanceAndAccuracy", "SensorDetectionDistanceAndAccuracy", });
    internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_TypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_TypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_VisibilityCondition_TypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_weather_WeatherCategory_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sensoris_protobuf_categories_weather_WeatherCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_weather_WeatherCategory_descriptor,
        new java.lang.String[] { "Envelope", "Precipitation", "AtmosphereCondition", "WindCondition", "VisibilityCondition", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.sensoris.types.base.SensorisBaseTypes.exponent);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
