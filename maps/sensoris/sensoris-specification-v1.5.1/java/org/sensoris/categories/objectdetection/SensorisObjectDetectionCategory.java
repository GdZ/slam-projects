/*
 * Copyright (c) 2017-2022 SENSORIS Innovation Platform hosted by ERTICO - ITS Europe.
 *
 * This program and the accompanying materials are made available under the terms of the Creative Commons Attribution-NoDerivatives 4.0 International license which accompanies this distribution, and is available at https://creativecommons.org/licenses/by-nd/4.0/legalcode.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/object_detection.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.objectdetection;

public final class SensorisObjectDetectionCategory {
  private SensorisObjectDetectionCategory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_TypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_TypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_TypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_TypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_ConeAndAccuracy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_ConeAndAccuracy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceTypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceTypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceMaterialAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceMaterialAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceColorAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceColorAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_objectdetection_ObjectDetectionCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_objectdetection_ObjectDetectionCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3sensoris/protobuf/categories/object_de" +
      "tection.proto\022,sensoris.protobuf.categor" +
      "ies.objectdetection\032\031google/protobuf/any" +
      ".proto\032\036google/protobuf/wrappers.proto\032\"" +
      "sensoris/protobuf/types/base.proto\032%sens" +
      "oris/protobuf/types/spatial.proto\"\275\010\n\rMo" +
      "vableObject\022=\n\010envelope\030\001 \001(\0132+.sensoris" +
      ".protobuf.types.base.EventEnvelope\022.\n\tob" +
      "ject_id\030\002 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\022F\n\024existence_confidence\030\003 \001(\0132(.senso" +
      "ris.protobuf.types.base.Confidence\022L\n\020de" +
      "tection_status\030\004 \001(\01322.sensoris.protobuf" +
      ".types.base.EventDetectionStatus\022j\n\023type" +
      "_and_confidence\030\005 \001(\0132M.sensoris.protobu" +
      "f.categories.objectdetection.MovableObje" +
      "ct.TypeAndConfidence\022`\n\034rectangular_box_" +
      "and_accuracy\030\006 \001(\0132:.sensoris.protobuf.t" +
      "ypes.spatial.RectangularBoxAndAccuracy\022W" +
      "\n\022speed_and_accuracy\030\007 \001(\01325.sensoris.pr" +
      "otobuf.types.spatial.XyzVectorAndAccurac" +
      "yB\004\210\265\030\001\022^\n\031acceleration_and_accuracy\030\010 \001" +
      "(\01325.sensoris.protobuf.types.spatial.Xyz" +
      "VectorAndAccuracyB\004\210\265\030\001\032\237\003\n\021TypeAndConfi" +
      "dence\022`\n\004type\030\001 \001(\0162R.sensoris.protobuf." +
      "categories.objectdetection.MovableObject" +
      ".TypeAndConfidence.Type\022<\n\nconfidence\030\002 " +
      "\001(\0132(.sensoris.protobuf.types.base.Confi" +
      "dence\"\351\001\n\004Type\022\020\n\014UNKNOWN_TYPE\020\000\022\013\n\007VEHI" +
      "CLE\020\001\022\031\n\025VEHICLE_PASSENGER_CAR\020\002\022\021\n\rVEHI" +
      "CLE_TRUCK\020\003\022\017\n\013VEHICLE_BUS\020\004\022\020\n\014VEHICLE_" +
      "TRAM\020\005\022\023\n\017VEHICLE_TRAILER\020\006\022\017\n\013TWO_WHEEL" +
      "ER\020\007\022\032\n\026TWO_WHEELER_MOTORCYCLE\020\010\022\027\n\023TWO_" +
      "WHEELER_BICYCLE\020\t\022\n\n\006PERSON\020\n\022\n\n\006ANIMAL\020" +
      "\013\"\306\030\n\014StaticObject\022=\n\010envelope\030\001 \001(\0132+.s" +
      "ensoris.protobuf.types.base.EventEnvelop" +
      "e\022.\n\tobject_id\030\002 \001(\0132\033.google.protobuf.I" +
      "nt64Value\022F\n\024existence_confidence\030\003 \001(\0132" +
      "(.sensoris.protobuf.types.base.Confidenc" +
      "e\022L\n\020detection_status\030\004 \001(\01322.sensoris.p" +
      "rotobuf.types.base.EventDetectionStatus\022" +
      "i\n\023type_and_confidence\030\005 \001(\0132L.sensoris." +
      "protobuf.categories.objectdetection.Stat" +
      "icObject.TypeAndConfidence\022b\n\034rectangula" +
      "r_box_and_accuracy\030\006 \001(\0132:.sensoris.prot" +
      "obuf.types.spatial.RectangularBoxAndAccu" +
      "racyH\000\022g\n\021cone_and_accuracy\030\007 \001(\0132J.sens" +
      "oris.protobuf.categories.objectdetection" +
      ".StaticObject.ConeAndAccuracyH\000\022x\n\033surfa" +
      "ce_type_and_confidence\030\010 \001(\0132S.sensoris." +
      "protobuf.categories.objectdetection.Stat" +
      "icObject.SurfaceTypeAndConfidence\022\200\001\n\037su" +
      "rface_material_and_confidence\030\t \001(\0132W.se" +
      "nsoris.protobuf.categories.objectdetecti" +
      "on.StaticObject.SurfaceMaterialAndConfid" +
      "ence\022z\n\034surface_color_and_confidence\030\n \003" +
      "(\0132T.sensoris.protobuf.categories.object" +
      "detection.StaticObject.SurfaceColorAndCo" +
      "nfidence\032\327\005\n\021TypeAndConfidence\022_\n\004type\030\001" +
      " \001(\0162Q.sensoris.protobuf.categories.obje" +
      "ctdetection.StaticObject.TypeAndConfiden" +
      "ce.Type\022<\n\nconfidence\030\002 \001(\0132(.sensoris.p" +
      "rotobuf.types.base.Confidence\"\242\004\n\004Type\022\020" +
      "\n\014UNKNOWN_TYPE\020\000\022\n\n\006BRIDGE\020\001\022\n\n\006TUNNEL\020\002" +
      "\022\010\n\004POLE\020\003\022\016\n\nPOLE_LIGHT\020\004\022\022\n\016POLE_REFLE" +
      "CTOR\020\005\022\023\n\017POLE_DELINEATOR\020\006\022\017\n\013POLE_GANT" +
      "RY\020\007\022\r\n\tPOLE_SIGN\020\010\022\023\n\017POLE_GUARD_RAIL\020\t" +
      "\022\007\n\003BAR\020\n\022\010\n\004TREE\020\013\022\013\n\007BOLLARD\020\014\022\010\n\004CONE" +
      "\020\r\022\n\n\006BARREL\020\016\022\010\n\004WALL\020\017\022\022\n\016TRAFFIC_ISLA" +
      "ND\020\020\022\016\n\nSPEED_BUMP\020\021\022\014\n\010POT_HOLE\020\022\022\021\n\rMA" +
      "NHOLE_COVER\020\023\022\030\n\024MANHOLE_COVER_CLOSED\020\024\022" +
      "\026\n\022MANHOLE_COVER_OPEN\020\025\022\017\n\013SIGN_BRIDGE\020\026" +
      "\022\026\n\022TRAFFIC_LIGHT_BODY\020\027\022\027\n\023BARRIER_PARK" +
      "ING_LOT\020\030\022\022\n\016SURFACE_RAISED\020\031\022\036\n\032TRAFFIC" +
      "_ENFORCEMENT_CAMERA\020\032\022$\n TRAFFIC_ENFORCE" +
      "MENT_CAMERA_FIXED\020\033\022%\n!TRAFFIC_ENFORCEME" +
      "NT_CAMERA_MOBILE\020\034\032\260\003\n\017ConeAndAccuracy\022Y" +
      "\n\033lower_position_and_accuracy\030\001 \001(\01324.se" +
      "nsoris.protobuf.types.spatial.PositionAn" +
      "dAccuracy\022Y\n\033upper_position_and_accuracy" +
      "\030\002 \001(\01324.sensoris.protobuf.types.spatial" +
      ".PositionAndAccuracy\022^\n\033lower_diameter_a" +
      "nd_accuracy\030\003 \001(\01323.sensoris.protobuf.ty" +
      "pes.base.Int64ValueAndAccuracyB\004\210\265\030\000\022^\n\033" +
      "upper_diameter_and_accuracy\030\004 \001(\01323.sens" +
      "oris.protobuf.types.base.Int64ValueAndAc" +
      "curacyB\004\210\265\030\000\022\'\n\textension\030\017 \003(\0132\024.google" +
      ".protobuf.Any\032\357\001\n\030SurfaceTypeAndConfiden" +
      "ce\022f\n\004type\030\001 \001(\0162X.sensoris.protobuf.cat" +
      "egories.objectdetection.StaticObject.Sur" +
      "faceTypeAndConfidence.Type\022<\n\nconfidence" +
      "\030\002 \001(\0132(.sensoris.protobuf.types.base.Co" +
      "nfidence\"-\n\004Type\022\020\n\014UNKNOWN_TYPE\020\000\022\010\n\004FL" +
      "AT\020\001\022\t\n\005ROUGH\020\002\032\225\003\n\034SurfaceMaterialAndCo" +
      "nfidence\022j\n\004type\030\001 \001(\0162\\.sensoris.protob" +
      "uf.categories.objectdetection.StaticObje" +
      "ct.SurfaceMaterialAndConfidence.Type\022<\n\n" +
      "confidence\030\002 \001(\0132(.sensoris.protobuf.typ" +
      "es.base.Confidence\022\\\n\031reflectivity_and_a" +
      "ccuracy\030\003 \001(\01323.sensoris.protobuf.types." +
      "base.Int64ValueAndAccuracyB\004\210\265\030\000\"m\n\004Type" +
      "\022\020\n\014UNKNOWN_TYPE\020\000\022\t\n\005METAL\020\001\022\014\n\010CONCRET" +
      "E\020\002\022\t\n\005STONE\020\003\022\010\n\004WOOD\020\004\022\013\n\007PLASTIC\020\005\022\013\n" +
      "\007ASPHALT\020\006\022\013\n\007ORGANIC\020\007\032\334\002\n\031SurfaceColor" +
      "AndConfidence\022g\n\004type\030\001 \001(\0162Y.sensoris.p" +
      "rotobuf.categories.objectdetection.Stati" +
      "cObject.SurfaceColorAndConfidence.Type\022<" +
      "\n\nconfidence\030\002 \001(\0132(.sensoris.protobuf.t" +
      "ypes.base.Confidence\"\227\001\n\004Type\022\017\n\013UNKOWN_" +
      "TYPE\020\000\022\t\n\005OTHER\020\001\022\t\n\005WHITE\020\002\022\010\n\004GRAY\020\003\022\016" +
      "\n\nGRAY_LIGHT\020\004\022\r\n\tGRAY_DARK\020\005\022\t\n\005BLACK\020\006" +
      "\022\007\n\003RED\020\007\022\t\n\005GREEN\020\010\022\010\n\004BLUE\020\t\022\n\n\006YELLOW" +
      "\020\n\022\n\n\006ORANGE\020\013B\n\n\010geometry\"\203\002\n\027ObjectDet" +
      "ectionCategory\022@\n\010envelope\030\001 \001(\0132..senso" +
      "ris.protobuf.types.base.CategoryEnvelope" +
      "\022S\n\016movable_object\030\002 \003(\0132;.sensoris.prot" +
      "obuf.categories.objectdetection.MovableO" +
      "bject\022Q\n\rstatic_object\030\003 \003(\0132:.sensoris." +
      "protobuf.categories.objectdetection.Stat" +
      "icObjectB\206\001\n\'org.sensoris.categories.obj" +
      "ectdetectionB\037SensorisObjectDetectionCat" +
      "egoryP\001Z5sensoris.org/specification/cate" +
      "gories/objectdetection\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
          org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor(),
        });
    internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_descriptor,
        new java.lang.String[] { "Envelope", "ObjectId", "ExistenceConfidence", "DetectionStatus", "TypeAndConfidence", "RectangularBoxAndAccuracy", "SpeedAndAccuracy", "AccelerationAndAccuracy", });
    internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_TypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_TypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_MovableObject_TypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor,
        new java.lang.String[] { "Envelope", "ObjectId", "ExistenceConfidence", "DetectionStatus", "TypeAndConfidence", "RectangularBoxAndAccuracy", "ConeAndAccuracy", "SurfaceTypeAndConfidence", "SurfaceMaterialAndConfidence", "SurfaceColorAndConfidence", "Geometry", });
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_TypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_TypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_TypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_ConeAndAccuracy_descriptor =
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor.getNestedTypes().get(1);
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_ConeAndAccuracy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_ConeAndAccuracy_descriptor,
        new java.lang.String[] { "LowerPositionAndAccuracy", "UpperPositionAndAccuracy", "LowerDiameterAndAccuracy", "UpperDiameterAndAccuracy", "Extension", });
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceTypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor.getNestedTypes().get(2);
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceTypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceTypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceMaterialAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor.getNestedTypes().get(3);
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceMaterialAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceMaterialAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", "ReflectivityAndAccuracy", });
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceColorAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_descriptor.getNestedTypes().get(4);
    internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceColorAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_StaticObject_SurfaceColorAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_objectdetection_ObjectDetectionCategory_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensoris_protobuf_categories_objectdetection_ObjectDetectionCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_objectdetection_ObjectDetectionCategory_descriptor,
        new java.lang.String[] { "Envelope", "MovableObject", "StaticObject", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.sensoris.types.base.SensorisBaseTypes.exponent);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
    org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
