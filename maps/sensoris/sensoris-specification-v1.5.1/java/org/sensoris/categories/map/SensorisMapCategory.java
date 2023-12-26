/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/map.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.map;

public final class SensorisMapCategory {
  private SensorisMapCategory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_map_MapReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_map_MapReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_map_MapCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_map_MapCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&sensoris/protobuf/categories/map.proto" +
      "\022 sensoris.protobuf.categories.map\032\"sens" +
      "oris/protobuf/types/base.proto\032%sensoris" +
      "/protobuf/types/spatial.proto\"\240\001\n\014MapRef" +
      "erence\022=\n\010envelope\030\001 \001(\0132+.sensoris.prot" +
      "obuf.types.base.EventEnvelope\022Q\n\022locatio" +
      "n_reference\030\002 \001(\01325.sensoris.protobuf.ty" +
      "pes.spatial.MapLocationReference\"\226\001\n\013Map" +
      "Category\022@\n\010envelope\030\001 \001(\0132..sensoris.pr" +
      "otobuf.types.base.CategoryEnvelope\022E\n\rma" +
      "p_reference\030\002 \003(\0132..sensoris.protobuf.ca" +
      "tegories.map.MapReferenceBf\n\033org.sensori" +
      "s.categories.mapB\023SensorisMapCategoryP\001Z" +
      "-sensoris.org/specification/categories/m" +
      "apping\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
          org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor(),
        });
    internal_static_sensoris_protobuf_categories_map_MapReference_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_categories_map_MapReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_map_MapReference_descriptor,
        new java.lang.String[] { "Envelope", "LocationReference", });
    internal_static_sensoris_protobuf_categories_map_MapCategory_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensoris_protobuf_categories_map_MapCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_map_MapCategory_descriptor,
        new java.lang.String[] { "Envelope", "MapReference", });
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
    org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
