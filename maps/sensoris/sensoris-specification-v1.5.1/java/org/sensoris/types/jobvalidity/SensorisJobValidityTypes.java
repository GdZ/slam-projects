/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/job_validity.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.jobvalidity;

public final class SensorisJobValidityTypes {
  private SensorisJobValidityTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeTimeRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeTimeRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_MapRestriction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_MapRestriction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*sensoris/protobuf/types/job_validity.p" +
      "roto\022#sensoris.protobuf.types.jobvalidit" +
      "y\032\031google/protobuf/any.proto\032\036google/pro" +
      "tobuf/wrappers.proto\032\"sensoris/protobuf/" +
      "types/base.proto\032!sensoris/protobuf/type" +
      "s/map.proto\032%sensoris/protobuf/types/spa" +
      "tial.proto\"\334\013\n\027JobValidityRestrictions\022\204" +
      "\001\n\037basic_job_validity_restrictions\030\001 \001(\013" +
      "2Y.sensoris.protobuf.types.jobvalidity.J" +
      "obValidityRestrictions.BasicJobValidityR" +
      "estrictionsH\000\032\251\n\n\034BasicJobValidityRestri" +
      "ctions\022\207\001\n\021time_restrictions\030\001 \001(\0132l.sen" +
      "soris.protobuf.types.jobvalidity.JobVali" +
      "dityRestrictions.BasicJobValidityRestric" +
      "tions.CompositeTimeRange\022\211\001\n\024spatial_res" +
      "trictions\030\002 \001(\0132k.sensoris.protobuf.type" +
      "s.jobvalidity.JobValidityRestrictions.Ba" +
      "sicJobValidityRestrictions.CompositeLoca" +
      "tion\022\201\001\n\017map_restriction\030\003 \003(\0132h.sensori" +
      "s.protobuf.types.jobvalidity.JobValidity" +
      "Restrictions.BasicJobValidityRestriction" +
      "s.MapRestriction\022\'\n\textension\030\017 \003(\0132\024.go" +
      "ogle.protobuf.Any\032\206\002\n\022CompositeTimeRange" +
      "\022C\n\ndate_range\030\001 \003(\0132/.sensoris.protobuf" +
      ".types.base.TimestampInterval\0226\n\007weekday" +
      "\030\002 \003(\0162%.sensoris.protobuf.types.base.We" +
      "ekday\022J\n\025time_of_the_day_range\030\003 \003(\0132+.s" +
      "ensoris.protobuf.types.base.Int64Interva" +
      "l\022\'\n\textension\030\017 \003(\0132\024.google.protobuf.A" +
      "ny\032\357\002\n\021CompositeLocation\022B\n\006circle\030\001 \003(\013" +
      "22.sensoris.protobuf.types.spatial.Circl" +
      "eAndAccuracy\022H\n\trectangle\030\002 \003(\01325.sensor" +
      "is.protobuf.types.spatial.RectangleAndAc" +
      "curacy\022D\n\007polygon\030\003 \003(\01323.sensoris.proto" +
      "buf.types.spatial.PolygonAndAccuracy\022]\n\032" +
      "directed_polyline_corridor\030\004 \003(\01329.senso" +
      "ris.protobuf.types.spatial.DirectedPolyl" +
      "ineCorridor\022\'\n\textension\030\017 \003(\0132\024.google." +
      "protobuf.Any\032\312\001\n\016MapRestriction\022R\n\027map_a" +
      "ttribute_and_value\030\001 \001(\01321.sensoris.prot" +
      "obuf.types.map.MapAttributeAndValue\022;\n\027i" +
      "gnore_if_not_supported\030\002 \001(\0132\032.google.pr" +
      "otobuf.BoolValue\022\'\n\textension\030\017 \003(\0132\024.go" +
      "ogle.protobuf.AnyB\016\n\014restrictionsBm\n\036org" +
      ".sensoris.types.jobvalidityB\030SensorisJob" +
      "ValidityTypesP\001Z,sensoris.org/specificat" +
      "ion/types/jobvalidity\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
          org.sensoris.types.map.SensorisMapTypes.getDescriptor(),
          org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor(),
        });
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_descriptor,
        new java.lang.String[] { "BasicJobValidityRestrictions", "Restrictions", });
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_descriptor =
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_descriptor,
        new java.lang.String[] { "TimeRestrictions", "SpatialRestrictions", "MapRestriction", "Extension", });
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeTimeRange_descriptor =
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeTimeRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeTimeRange_descriptor,
        new java.lang.String[] { "DateRange", "Weekday", "TimeOfTheDayRange", "Extension", });
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeLocation_descriptor =
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_descriptor.getNestedTypes().get(1);
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_CompositeLocation_descriptor,
        new java.lang.String[] { "Circle", "Rectangle", "Polygon", "DirectedPolylineCorridor", "Extension", });
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_MapRestriction_descriptor =
      internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_descriptor.getNestedTypes().get(2);
    internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_MapRestriction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_jobvalidity_JobValidityRestrictions_BasicJobValidityRestrictions_MapRestriction_descriptor,
        new java.lang.String[] { "MapAttributeAndValue", "IgnoreIfNotSupported", "Extension", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
    org.sensoris.types.map.SensorisMapTypes.getDescriptor();
    org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}