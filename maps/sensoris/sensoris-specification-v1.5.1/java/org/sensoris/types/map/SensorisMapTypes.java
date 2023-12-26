/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/map.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.types.map;

public final class SensorisMapTypes {
  private SensorisMapTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_map_MapTilingScheme_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_map_MapTilingScheme_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_map_MapTiles_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_map_MapTiles_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_map_MapAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_map_MapAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_map_MapAttributeAndValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_map_MapAttributeAndValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!sensoris/protobuf/types/map.proto\022\033sen" +
      "soris.protobuf.types.map\032\036google/protobu" +
      "f/wrappers.proto\032\"sensoris/protobuf/type" +
      "s/base.proto\"A\n\017MapTilingScheme\022.\n\003urn\030\001" +
      " \001(\0132!.sensoris.protobuf.types.base.Urn\"" +
      "\177\n\010MapTiles\022C\n\rtiling_scheme\030\001 \001(\0132,.sen" +
      "soris.protobuf.types.map.MapTilingScheme" +
      "\022.\n\010tile_ids\030\002 \001(\0132\034.google.protobuf.Str" +
      "ingValue\">\n\014MapAttribute\022.\n\003urn\030\001 \001(\0132!." +
      "sensoris.protobuf.types.base.Urn\"\202\001\n\024Map" +
      "AttributeAndValue\022<\n\tattribute\030\001 \001(\0132).s" +
      "ensoris.protobuf.types.map.MapAttribute\022" +
      ",\n\006values\030\002 \001(\0132\034.google.protobuf.String" +
      "ValueBY\n\026org.sensoris.types.mapB\020Sensori" +
      "sMapTypesP\001Z(sensoris.org/specification/" +
      "types/mapping\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
        });
    internal_static_sensoris_protobuf_types_map_MapTilingScheme_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_types_map_MapTilingScheme_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_map_MapTilingScheme_descriptor,
        new java.lang.String[] { "Urn", });
    internal_static_sensoris_protobuf_types_map_MapTiles_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensoris_protobuf_types_map_MapTiles_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_map_MapTiles_descriptor,
        new java.lang.String[] { "TilingScheme", "TileIds", });
    internal_static_sensoris_protobuf_types_map_MapAttribute_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensoris_protobuf_types_map_MapAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_map_MapAttribute_descriptor,
        new java.lang.String[] { "Urn", });
    internal_static_sensoris_protobuf_types_map_MapAttributeAndValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sensoris_protobuf_types_map_MapAttributeAndValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_map_MapAttributeAndValue_descriptor,
        new java.lang.String[] { "Attribute", "Values", });
    com.google.protobuf.WrappersProto.getDescriptor();
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
