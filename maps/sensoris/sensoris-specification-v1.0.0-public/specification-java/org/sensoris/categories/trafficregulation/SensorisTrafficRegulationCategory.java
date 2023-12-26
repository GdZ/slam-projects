// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/traffic_regulation.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.trafficregulation;

public final class SensorisTrafficRegulationCategory {
  private SensorisTrafficRegulationCategory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ShapeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ShapeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_TypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_TypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValueAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValueAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_PermanencyAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_PermanencyAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValidationAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValidationAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_DominantBackgroundColorAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_DominantBackgroundColorAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_TypeAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_TypeAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5sensoris/protobuf/categories/traffic_r" +
      "egulation.proto\022.sensoris.protobuf.categ" +
      "ories.trafficregulation\032\036google/protobuf" +
      "/wrappers.proto\032\"sensoris/protobuf/types" +
      "/base.proto\032%sensoris/protobuf/types/spa" +
      "tial.proto\"\312a\n\013TrafficSign\022=\n\010envelope\030\001" +
      " \001(\0132+.sensoris.protobuf.types.base.Even" +
      "tEnvelope\022F\n\024existence_confidence\030\002 \001(\0132" +
      "(.sensoris.protobuf.types.base.Confidenc" +
      "e\022L\n\020detection_status\030\003 \001(\01322.sensoris.p" +
      "rotobuf.types.base.EventDetectionStatus\022" +
      "`\n\034rectangular_box_and_accuracy\030\004 \001(\0132:." +
      "sensoris.protobuf.types.spatial.Rectangu" +
      "larBoxAndAccuracy\022l\n\024shape_and_confidenc" +
      "e\030\005 \001(\0132N.sensoris.protobuf.categories.t" +
      "rafficregulation.TrafficSign.ShapeAndCon" +
      "fidence\022j\n\023type_and_confidence\030\006 \001(\0132M.s" +
      "ensoris.protobuf.categories.trafficregul" +
      "ation.TrafficSign.TypeAndConfidence\022l\n\024v" +
      "alue_and_confidence\030\007 \001(\0132N.sensoris.pro" +
      "tobuf.categories.trafficregulation.Traff" +
      "icSign.ValueAndConfidence\022v\n\031permanency_" +
      "and_confidence\030\010 \001(\0132S.sensoris.protobuf" +
      ".categories.trafficregulation.TrafficSig" +
      "n.PermanencyAndConfidence\022v\n\031validation_" +
      "and_confidence\030\t \001(\0132S.sensoris.protobuf" +
      ".categories.trafficregulation.TrafficSig" +
      "n.ValidationAndConfidence\022\211\001\n\037background" +
      "_color_and_confidence\030\n \001(\0132`.sensoris.p" +
      "rotobuf.categories.trafficregulation.Tra" +
      "fficSign.DominantBackgroundColorAndConfi" +
      "dence\022\205\001\n!supplementary_sign_and_confide" +
      "nce\030\013 \003(\0132Z.sensoris.protobuf.categories" +
      ".trafficregulation.TrafficSign.Supplemen" +
      "tarySignAndConfidence\032\367\002\n\022ShapeAndConfid" +
      "ence\022a\n\004type\030\001 \001(\0162S.sensoris.protobuf.c" +
      "ategories.trafficregulation.TrafficSign." +
      "ShapeAndConfidence.Type\022<\n\nconfidence\030\002 " +
      "\001(\0132(.sensoris.protobuf.types.base.Confi" +
      "dence\"\277\001\n\004Type\022\020\n\014UNKNOWN_TYPE\020\000\022\t\n\005OTHE" +
      "R\020\001\022\r\n\tRECTANGLE\020\002\022\n\n\006SQUARE\020\003\022\017\n\013TRIANG" +
      "LE_UP\020\004\022\021\n\rTRIANGLE_DOWN\020\005\022\013\n\007DIAMOND\020\006\022" +
      "\013\n\007HEXAGON\020\007\022\t\n\005ROUND\020\010\022\016\n\nCROSS_BUCK\020\t\022" +
      "\013\n\007OCTAGON\020\n\022\013\n\007ELLIPSE\020\013\022\014\n\010PENTAGON\020\014\032" +
      "\356:\n\021TypeAndConfidence\022`\n\004type\030\001 \001(\0162R.se" +
      "nsoris.protobuf.categories.trafficregula" +
      "tion.TrafficSign.TypeAndConfidence.Type\022" +
      "<\n\nconfidence\030\002 \001(\0132(.sensoris.protobuf." +
      "types.base.Confidence\0220\n\nother_text\030\003 \001(" +
      "\0132\034.google.protobuf.StringValue\"\2069\n\004Type" +
      "\022\020\n\014UNKNOWN_TYPE\020\000\022\021\n\rOTHER_AS_TEXT\020\001\022\017\n" +
      "\013SPEED_LIMIT\020\002\022\023\n\017SPEED_LIMIT_END\020\003\022\037\n\033S" +
      "PEED_LIMIT_CHANGE_UPCOMING\020\004\022\030\n\024ADVISORY" +
      "_SPEED_LIMIT\020\005\022\034\n\030ADVISORY_SPEED_LIMIT_E" +
      "ND\020\006\022\021\n\rNO_OVERTAKING\020\007\022\025\n\021NO_OVERTAKING" +
      "_END\020\010\022\033\n\027PROTECTED_PASSING_START\020\t\022\031\n\025P" +
      "ROTECTED_PASSING_END\020\n\022 \n\034PROTECTED_PASS" +
      "ING_LEFT_START\020\013\022!\n\035PROTECTED_PASSING_RI" +
      "GHT_START\020\014\022\036\n\032PROTECTED_PASSING_LEFT_EN" +
      "D\020\r\022\037\n\033PROTECTED_PASSING_RIGHT_END\020\016\022\027\n\023" +
      "NO_OVERTAKING_TRUCK\020\017\022\033\n\027NO_OVERTAKING_T" +
      "RUCK_END\020\020\022\030\n\024ALL_RESTRICTIONS_END\020\021\022\016\n\n" +
      "CITY_START\020\022\022\014\n\010CITY_END\020\023\022\013\n\007HIGHWAY\020\024\022" +
      "\017\n\013HIGHWAY_END\020\025\022\014\n\010MOTORWAY\020\026\022\020\n\014MOTORW" +
      "AY_END\020\027\022\020\n\014CONSTRUCTION\020\030\022\024\n\020CONSTRUCTI" +
      "ON_END\020\031\022\016\n\nLANE_MERGE\020\032\022\027\n\023LANE_MERGE_O" +
      "N_RIGHT\020\033\022\026\n\022LANE_MERGE_ON_LEFT\020\034\022\025\n\021LAN" +
      "E_MERGE_CENTER\020\035\022\034\n\030RAILWAY_CROSSING_GEN" +
      "ERAL\020\036\022\036\n\032RAILWAY_CROSSING_PROTECTED\020\037\022 " +
      "\n\034RAILWAY_CROSSING_UNPROTECTED\020 \022\020\n\014ROAD" +
      "_NARROWS\020!\022\025\n\021ROAD_NARROWS_LEFT\020\"\022\026\n\022ROA" +
      "D_NARROWS_RIGHT\020#\022\027\n\023ROAD_NARROWS_CENTER" +
      "\020$\022\017\n\013SHARP_CURVE\020%\022\024\n\020SHARP_CURVE_LEFT\020" +
      "&\022\025\n\021SHARP_CURVE_RIGHT\020\'\022\020\n\014WINDING_ROAD" +
      "\020(\022\036\n\032WINDING_ROAD_STARTING_LEFT\020)\022\037\n\033WI" +
      "NDING_ROAD_STARTING_RIGHT\020*\022\016\n\nSTEEP_HIL" +
      "L\020+\022\026\n\022STEEP_HILL_UPWARDS\020,\022\030\n\024STEEP_HIL" +
      "L_DOWNWARDS\020-\022\r\n\tSTOP_SIGN\020.\022\020\n\014LATERAL_" +
      "WIND\020/\022\033\n\027LATERAL_WIND_FROM_RIGHT\0200\022\032\n\026L" +
      "ATERAL_WIND_FROM_LEFT\0201\022\023\n\017GENERAL_WARNI" +
      "NG\0202\022\025\n\021RISK_OF_GROUNDING\0203\022\n\n\006ANIMAL\0204\022" +
      "\022\n\016ICY_CONDITIONS\0205\022\021\n\rSLIPPERY_ROAD\0206\022\017" +
      "\n\013UNEVEN_ROAD\0207\022\017\n\013SCHOOL_ZONE\0208\022\024\n\020TRAM" +
      "WAY_CROSSING\0209\022\025\n\021CONGESTION_HAZARD\020:\022\023\n" +
      "\017ACCIDENT_HAZARD\020;\022\024\n\020BICYCLE_CROSSING\020<" +
      "\022\"\n\036PRIORITY_OVER_ONCOMING_TRAFFIC\020=\022\t\n\005" +
      "YIELD\020>\022\021\n\rPRIORITY_ROAD\020?\022\025\n\021PRIORITY_R" +
      "OAD_END\020@\022\023\n\017TRAFFIC_CALMING\020A\022\027\n\023TRAFFI" +
      "C_CALMING_END\020B\022\026\n\022ENVIRONMENTAL_AREA\020C\022" +
      "\032\n\026ENVIRONMENTAL_AREA_END\020D\022\020\n\014INTERSECT" +
      "ION\020E\022\016\n\nROUNDABOUT\020F\022\023\n\017PASSING_ON_LEFT" +
      "\020G\022\024\n\020PASSING_ON_RIGHT\020H\022\034\n\030PASSING_ON_L" +
      "EFT_OR_RIGHT\020I\022\035\n\031MANDATORY_TURN_RIGHT_O" +
      "NLY\020J\022\034\n\030MANDATORY_TURN_LEFT_ONLY\020K\022\033\n\027M" +
      "ANDATORY_STRAIGHT_ONLY\020L\022 \n\034MANDATORY_TU" +
      "RN_LEFT_OR_RIGHT\020M\022\036\n\032MANDATORY_TURN_RES" +
      "TRICTION\020N\022\036\n\032MANDATORY_STRAIGHT_OR_LEFT" +
      "\020O\022\037\n\033MANDATORY_STRAIGHT_OR_RIGHT\020P\022\020\n\014N" +
      "O_LEFT_TURN\020Q\022\021\n\rNO_RIGHT_TURN\020R\022\r\n\tNO_U" +
      "_TURN\020S\022\025\n\021NO_U_OR_LEFT_TURN\020T\022\022\n\016U_TURN" +
      "_ALLOWED\020U\022\030\n\024MANDATORY_LEFT_TRUCK\020V\022\031\n\025" +
      "MANDATORY_RIGHT_TRUCK\020W\022\034\n\030MANDATORY_STR" +
      "AIGHT_TRUCK\020X\022\014\n\010NO_ENTRY\020Y\022\014\n\010DEAD_END\020" +
      "Z\022\037\n\033HIGH_OCCUPANCY_VEHICLE_LANE\020[\022\010\n\004TO" +
      "LL\020\\\022\014\n\010TOLL_CAR\020]\022\r\n\tTOLL_LANE\020^\022\020\n\014EXP" +
      "RESS_LANE\020_\022\035\n\031SHOULDER_OPEN_FOR_TRAFFIC" +
      "\020`\022\037\n\033SHOULDER_CLOSED_FOR_TRAFFIC\020a\022\017\n\013L" +
      "ANE_CLOSED\020b\022\037\n\033LANE_CLOSED_RIGHT_MOST_L" +
      "ANE\020c\022\036\n\032LANE_CLOSED_LEFT_MOST_LANE\020d\022\026\n" +
      "\022WARNING_PEDESTRIAN\020e\022\024\n\020WARNING_CHILDRE" +
      "N\020f\022\023\n\017WARNING_BICYCLE\020g\022\017\n\013WARNING_BUS\020" +
      "h\022\036\n\032PUBLIC_TRANSPORTATION_STOP\020i\022\027\n\023PED" +
      "ESTRIAN_CROSSING\020j\022\026\n\022WEIGHT_RESTRICTION" +
      "\020k\022\026\n\022HEIGHT_RESTRICTION\020l\022\026\n\022LENGTH_RES" +
      "TRICTION\020m\022\025\n\021WIDTH_RESTRICTION\020n\022\032\n\026WAR" +
      "NING_TRUCK_ROLLOVER\020o\022\020\n\014SIGNAL_AHEAD\020p\022" +
      "\020\n\014SKI_CROSSING\020q\022\031\n\025NO_AGRICULTUR_VEHIC" +
      "LE\020r\022\016\n\nNO_BICYCLE\020s\022\n\n\006NO_BUS\020t\022\026\n\022NO_H" +
      "AUL_EXPLOSIVES\020u\022\034\n\030NO_HAUL_HARMFUL_TO_W" +
      "ATER\020v\022\036\n\032NO_HAUL_HAZARDOUS_MATERIAL\020w\022\021" +
      "\n\rNO_MOTORCYCLE\020x\022\016\n\nNO_TRAILER\020y\022\031\n\025NO_" +
      "TRUCK_WITH_TRAILER\020z\022\021\n\rPARK_AND_RIDE\020{\022" +
      "\021\n\rROAD_DISTANCE\020|\022\023\n\017EMERGENCY_PHONE\020}\022" +
      "\033\n\027SPEED_LIMIT_ENFORCEMENT\020~\022\035\n\031TRAFFIC_" +
      "LIGHT_ENFORCEMENT\020\177\022\024\n\017BOARD_DIRECTION\020\200" +
      "\001\022\020\n\013STREET_NAME\020\201\001\022\026\n\021TRUCK_SPEED_LIMIT" +
      "\020\202\001\022\032\n\025TRUCK_SPEED_LIMIT_END\020\203\001\022\026\n\021SPEED" +
      "_LIMIT_NIGHT\020\204\001\022\032\n\025SPEED_LIMIT_NIGHT_END" +
      "\020\205\001\022\022\n\rMINIMUM_SPEED\020\206\001\022\026\n\021MINIMUM_SPEED" +
      "_END\020\207\001\022\024\n\017PEDESTRIAN_ZONE\020\210\001\022\030\n\023PEDESTR" +
      "IAN_ZONE_END\020\211\001\022\024\n\017PEDESTRIAN_PATH\020\212\001\022\030\n" +
      "\023PEDESTRIAN_PATH_END\020\213\001\022\034\n\027PEDESTRIAN_BI" +
      "CYCLE_PATH\020\214\001\022 \n\033PEDESTRIAN_BICYCLE_PATH" +
      "_END\020\215\001\022\021\n\014BICYCLE_PATH\020\216\001\022\025\n\020BICYCLE_PA" +
      "TH_END\020\217\001\022\023\n\016BICYCLE_STREET\020\220\001\022\027\n\022BICYCL" +
      "E_STREET_END\020\221\001\022\032\n\025CURVE_LEFT_THEN_RIGHT" +
      "\020\222\001\022\032\n\025CURVE_RIGHT_THEN_LEFT\020\223\001\022\031\n\024CURVE" +
      "_TRIPLE_HAIRPIN\020\224\001\022\017\n\nSTEEP_DROP\020\225\001\022\027\n\022S" +
      "TEEP_DROP_ON_LEFT\020\226\001\022\030\n\023STEEP_DROP_ON_RI" +
      "GHT\020\227\001\022\025\n\020NO_ANIMAL_CATTLE\020\230\001\022\020\n\013ANIMAL_" +
      "DEER\020\231\001\022\021\n\014ANIMAL_MOOSE\020\232\001\022\024\n\017NO_HORSE_R" +
      "IDING\020\233\001\022\022\n\rFALLING_ROCKS\020\234\001\022\027\n\022FALLING_" +
      "ROCKS_LEFT\020\235\001\022\030\n\023FALLING_ROCKS_RIGHT\020\236\001\022" +
      "\036\n\031YIELD_TO_ONCOMING_TRAFFIC\020\237\001\022\032\n\025UNPRO" +
      "TECTED_LEFT_TURN\020\240\001\022\023\n\016ONEWAY_TRAFFIC\020\241\001" +
      "\022\033\n\026ONEWAY_TRAFFIC_TO_LEFT\020\242\001\022\034\n\027ONEWAY_" +
      "TRAFFIC_TO_RIGHT\020\243\001\022\037\n\032ONEWAY_TRAFFIC_TO" +
      "_STRAIGHT\020\244\001\022\017\n\nNO_VEHICLE\020\245\001\022\025\n\020NO_MOTO" +
      "R_VEHICLE\020\246\001\022\r\n\010NO_TRUCK\020\247\001\022\022\n\rNO_PEDEST" +
      "RIAN\020\250\001\022!\n\034LANE_USED_IN_BOTH_DIRECTIONS\020" +
      "\251\001\022\r\n\010FOG_AREA\020\252\001\022\032\n\025TIRE_CHAINS_MANDATO" +
      "RY\020\253\001\022\026\n\021HIJACKING_HOTSPOT\020\254\001\022\023\n\016OVERPAS" +
      "S_AHEAD\020\255\001\022\013\n\006TUNNEL\020\256\001\022\023\n\016FERRY_TERMINA" +
      "L\020\257\001\022\022\n\rNARROW_BRIDGE\020\260\001\022\016\n\tNO_IDLING\020\261\001" +
      "\022\024\n\017HUMPBACK_BRIDGE\020\262\001\022\017\n\nEMBANKMENT\020\263\001\022" +
      "\033\n\026EMBANKMENT_ON_THE_LEFT\020\264\001\022\034\n\027EMBANKME" +
      "NT_ON_THE_RIGHT\020\265\001\022+\n&CROSSING_WITH_PRIO" +
      "RITY_OVER_MINOR_ROAD\020\266\001\022(\n#CROSSING_WITH" +
      "_PRIORITY_TO_THE_RIGHT\020\267\001\022\027\n\022BRANCH_TO_T" +
      "HE_LEFT\020\270\001\022\030\n\023BRANCH_TO_THE_RIGHT\020\271\001\022\024\n\017" +
      "TWO_WAY_TRAFFIC\020\272\001\022\t\n\004BUMP\020\273\001\022\010\n\003DIP\020\274\001\022" +
      "\021\n\014ROAD_FLOODED\020\275\001\022\024\n\017AUDIBLE_WARNING\020\276\001" +
      "\022\022\n\rVILLAGE_AHEAD\020\277\001\022\023\n\016MOVABLE_BRIDGE\020\300" +
      "\001\022\016\n\tSLOW_DOWN\020\301\001\022\023\n\016INTERSECTION_T\020\302\001\022\030" +
      "\n\023INTERSECTION_T_LEFT\020\303\001\022\031\n\024INTERSECTION" +
      "_T_RIGHT\020\304\001\022\036\n\031INTERSECTION_T_LEFT_RIGHT" +
      "\020\305\001\022\023\n\016INTERSECTION_Y\020\306\001\022\021\n\014USE_LOW_GEAR" +
      "\020\307\001\022\025\n\020USE_LOW_GEAR_END\020\310\001\022\033\n\026NO_COMPRES" +
      "SION_BRAKING\020\311\001\022\037\n\032NO_COMPRESSION_BRAKIN" +
      "G_END\020\312\001\022\021\n\014WAITING_LINE\020\313\001\022\023\n\016DONT_STOP" +
      "_ZONE\020\314\001\022\027\n\022HONKING_PROHIBITED\020\315\001\022\025\n\020FAS" +
      "TEN_SEAT_BELT\020\316\001\022\021\n\014HAMLET_ENTRY\020\317\001\022\020\n\013H" +
      "AMLET_EXIT\020\320\001\022\034\n\027HIGHWAY_MARKER_1_STRIPE" +
      "\020\321\001\022\035\n\030HIGHWAY_MARKER_2_STRIPES\020\322\001\022\035\n\030HI" +
      "GHWAY_MARKER_3_STRIPES\020\323\001\022\023\n\016GUIDING_BEA" +
      "CON\020\324\001\022\036\n\031COUNTDOWN_MARKER_1_STRIPE\020\325\001\022\037" +
      "\n\032COUNTDOWN_MARKER_2_STRIPES\020\326\001\022\037\n\032COUNT" +
      "DOWN_MARKER_3_STRIPES\020\327\001\022\024\n\017DIVERSION_RO" +
      "UTE\020\330\001\022\030\n\023DIVERSION_ROUTE_END\020\331\001\022\034\n\027NO_S" +
      "TOPPING_EXCEPT_TAXI\020\332\001\022\020\n\013NO_STOPPING\020\333\001" +
      "\022\025\n\020NO_STOPPING_LEFT\020\334\001\022\026\n\021NO_STOPPING_R" +
      "IGHT\020\335\001\022\037\n\032NO_STOPPING_LEFT_AND_RIGHT\020\336\001" +
      "\022\017\n\nNO_PARKING\020\337\001\022\024\n\017NO_PARKING_LEFT\020\340\001\022" +
      "\025\n\020NO_PARKING_RIGHT\020\341\001\022\036\n\031NO_PARKING_LEF" +
      "T_AND_RIGHT\020\342\001\022\030\n\023RUNNAWAY_TRUCK_RAMP\020\343\001" +
      "\022\022\n\rTURN_ON_GREEN\020\344\001\022\023\n\016NO_TURN_ON_RED\020\345" +
      "\001\022\031\n\024MOTORWAY_ROAD_NUMBER\020\346\001\022\030\n\023HIGHWAY_" +
      "ROAD_NUMBER\020\347\001\022\037\n\032HIGHWAY_INTERCHANGE_NU" +
      "MBER\020\350\001\022\031\n\024EUROPEAN_ROAD_NUMBER\020\351\001\022\025\n\020SP" +
      "EED_LIMIT_ZONE\020\352\001\022\031\n\024SPEED_LIMIT_ZONE_EN" +
      "D\020\353\001\022\024\n\017NO_PARKING_ZONE\020\354\001\022\030\n\023NO_PARKING" +
      "_ZONE_END\020\355\001\022\021\n\014PARKING_ZONE\020\356\001\022\025\n\020PARKI" +
      "NG_ZONE_END\020\357\001\022\014\n\007PARKING\020\360\001\022\024\n\017PARKING_" +
      "TO_LEFT\020\361\001\022\025\n\020PARKING_TO_RIGHT\020\362\001\022\023\n\016PAR" +
      "KING_GARAGE\020\363\001\022\027\n\022PARKING_ON_SIDEWAY\020\364\001\022" +
      "\024\n\017SAFETY_DISTANCE\020\365\001\022\034\n\027SAFETY_DISTANCE" +
      "_VEHICLE\020\366\001\022\032\n\025SAFETY_DISTANCE_TRUCK\020\367\001\022" +
      "\013\n\006DETOUR\020\370\001\022\017\n\nDETOUR_END\020\371\001\022\020\n\013DETOUR_" +
      "LEFT\020\372\001\022\021\n\014DETOUR_RIGHT\020\373\001\022\020\n\013STATION_GA" +
      "S\020\374\001\022\020\n\013STATION_LPG\020\375\001\022\020\n\013STATION_CNG\020\376\001" +
      "\022\017\n\nSTATION_H2\020\377\001\022\024\n\017STATION_ELECTRO\020\200\002\022" +
      "\023\n\016STATION_POLICE\020\201\002\022\021\n\014CAMPING_SPOT\020\202\002\022" +
      "\016\n\tRESTROOMS\020\203\002\022\017\n\nINFO_POINT\020\204\002\022\030\n\023MOTO" +
      "RWAY_EXIT_AHEAD\020\205\002\022\027\n\022HIGHWAY_EXIT_AHEAD" +
      "\020\206\002\022\022\n\rMOTORWAY_EXIT\020\207\002\022\021\n\014HIGHWAY_EXIT\020" +
      "\210\002\022\016\n\tFIRST_AID\020\211\002\022\017\n\nLOW_FLYING\020\212\002\022\017\n\nL" +
      "ANE_SHIFT\020\213\002\022\027\n\022LANE_SHIFT_TO_LEFT\020\214\002\022\030\n" +
      "\023LANE_SHIFT_TO_RIGHT\020\215\002\022\031\n\024PEDESTRIAN_UN" +
      "DERPASS\020\216\002\022\030\n\023PEDESTRIAN_OVERPASS\020\217\002\022\022\n\r" +
      "BREAKDOWN_BAY\020\220\002\022\r\n\010BUS_LANE\020\221\002\022\023\n\016DOUBL" +
      "E_HAIRPIN\020\222\002\022!\n\034COUNTRY_SPECIFIC_INFORMA" +
      "TION\020\223\002\022#\n\036PEDESTRIAN_BICYCLE_SHARED_PAT" +
      "H\020\224\002\022!\n\034OVERHEAD_LANE_CONTROL_CLOSED\020\225\002\022" +
      "\037\n\032OVERHEAD_LANE_CONTROL_OPEN\020\226\002\022\'\n\"OVER" +
      "HEAD_LANE_CONTROL_CLOSING_LEFT\020\227\002\022(\n#OVE" +
      "RHEAD_LANE_CONTROL_CLOSING_RIGHT\020\230\002\022+\n&O" +
      "VERHEAD_LANE_CONTROL_FLASH_ARROW_LEFT\020\231\002" +
      "\022,\n\'OVERHEAD_LANE_CONTROL_FLASH_ARROW_RI" +
      "GHT\020\232\002\022\016\n\tTRINATURE\020\233\002\022\020\n\013ANIMAL_FROG\020\234\002" +
      "\022\013\n\006GRAVEL\020\235\002\022 \n\033WARNING_PEDESTRIAN_CROS" +
      "SING\020\236\002\022\r\n\010LOW_TREE\020\237\002\022\022\n\rWARNING_RIDER\020" +
      "\240\002\022\017\n\nSTOP_AHEAD\020\241\002\022\020\n\013YIELD_AHEAD\020\242\002\022\032\n" +
      "\025WATER_PROTECTION_AREA\020\243\002\022\020\n\013TOLL_DOUANE" +
      "\020\244\002\022\023\n\016NO_CAR_OR_BIKE\020\245\002\022\036\n\031DRIVING_DIRE" +
      "CTION_ONLY_UP\020\246\002\022\"\n\035DRIVING_DIRECTION_UP" +
      "_AND_DOWN\020\247\002\022\022\n\rMILITARY_SIGN\020\250\002\022\t\n\004SMOG" +
      "\020\251\002\022\025\n\020ROUNDABOUT_AHEAD\020\252\002\022(\n#MANDATORY_" +
      "LEFT_OR_STRAIGHT_OR_RIGHT\020\253\002\022\023\n\016DEAD_END" +
      "_RIGHT\020\254\002\022\022\n\rDEAD_END_LEFT\020\255\002\022\017\n\nTOLL_TR" +
      "UCK\020\256\002\022\023\n\016TOLL_TRUCK_END\020\257\002\022\027\n\022STAGGERED" +
      "_JUNCTION\020\260\002\022\034\n\027AXLE_WEIGHT_RESTRICTION\020" +
      "\261\002\022\r\n\010TOLL_END\020\262\002\022\021\n\014TOLL_CAR_END\020\263\002\022\022\n\r" +
      "TOLL_LANE_END\020\264\002\032\177\n\022ValueAndConfidence\022+" +
      "\n\005value\030\001 \001(\0132\034.google.protobuf.StringVa" +
      "lue\022<\n\nconfidence\030\002 \001(\0132(.sensoris.proto" +
      "buf.types.base.Confidence\032\306\002\n\027Permanency" +
      "AndConfidence\022f\n\004type\030\001 \001(\0162X.sensoris.p" +
      "rotobuf.categories.trafficregulation.Tra" +
      "fficSign.PermanencyAndConfidence.Type\022<\n" +
      "\nconfidence\030\002 \001(\0132(.sensoris.protobuf.ty" +
      "pes.base.Confidence\"\204\001\n\004Type\022\020\n\014UNKNOWN_" +
      "TYPE\020\000\022\n\n\006STATIC\020\001\022\014\n\010VARIABLE\020\002\022\033\n\027VARI" +
      "ABLE_ELECTRONICALLY\020\003\022\031\n\025VARIABLE_MECHAN" +
      "ICALLY\020\004\022\030\n\024VARIABLE_DEACTIVATED\020\005\032\361\001\n\027V" +
      "alidationAndConfidence\022f\n\004type\030\001 \001(\0162X.s" +
      "ensoris.protobuf.categories.trafficregul" +
      "ation.TrafficSign.ValidationAndConfidenc" +
      "e.Type\022<\n\nconfidence\030\002 \001(\0132(.sensoris.pr" +
      "otobuf.types.base.Confidence\"0\n\004Type\022\020\n\014" +
      "UNKNOWN_TYPE\020\000\022\t\n\005VALID\020\001\022\013\n\007INVALID\020\002\032\311" +
      "\002\n$DominantBackgroundColorAndConfidence\022" +
      "s\n\004type\030\001 \001(\0162e.sensoris.protobuf.catego" +
      "ries.trafficregulation.TrafficSign.Domin" +
      "antBackgroundColorAndConfidence.Type\022<\n\n" +
      "confidence\030\002 \001(\0132(.sensoris.protobuf.typ" +
      "es.base.Confidence\"n\n\004Type\022\020\n\014UNKNOWN_TY" +
      "PE\020\000\022\t\n\005OTHER\020\001\022\t\n\005WHITE\020\002\022\007\n\003RED\020\003\022\t\n\005G" +
      "REEN\020\004\022\010\n\004BLUE\020\005\022\n\n\006YELLOW\020\006\022\t\n\005BLACK\020\007\022" +
      "\t\n\005BROWN\020\010\032\302\022\n\036SupplementarySignAndConfi" +
      "dence\022F\n\024existence_confidence\030\001 \001(\0132(.se" +
      "nsoris.protobuf.types.base.Confidence\022L\n" +
      "\020detection_status\030\002 \001(\01322.sensoris.proto" +
      "buf.types.base.EventDetectionStatus\022\211\001\n\023" +
      "type_and_confidence\030\003 \001(\0132l.sensoris.pro" +
      "tobuf.categories.trafficregulation.Traff" +
      "icSign.SupplementarySignAndConfidence.Ty" +
      "peAndConfidence\022l\n\024value_and_confidence\030" +
      "\004 \001(\0132N.sensoris.protobuf.categories.tra" +
      "fficregulation.TrafficSign.ValueAndConfi" +
      "dence\032\217\017\n\021TypeAndConfidence\022\177\n\004type\030\001 \001(" +
      "\0162q.sensoris.protobuf.categories.traffic" +
      "regulation.TrafficSign.SupplementarySign" +
      "AndConfidence.TypeAndConfidence.Type\022<\n\n" +
      "confidence\030\002 \001(\0132(.sensoris.protobuf.typ" +
      "es.base.Confidence\0220\n\nother_text\030\003 \001(\0132\034" +
      ".google.protobuf.StringValue\"\210\r\n\004Type\022\020\n" +
      "\014UNKNOWN_TYPE\020\000\022\025\n\021SUP_OTHER_AS_TEXT\020\001\022\013" +
      "\n\007SUP_WET\020\002\022\014\n\010SUP_RAIN\020\003\022\014\n\010SUP_SNOW\020\004\022" +
      "\024\n\020SUP_SNOW_OR_RAIN\020\005\022\013\n\007SUP_FOG\020\006\022\014\n\010SU" +
      "P_TIME\020\007\022\024\n\020SUP_DAY_AND_TIME\020\010\022\r\n\tSUP_NI" +
      "GHT\020\t\022\016\n\nSUP_SEASON\020\n\022\020\n\014SUP_WORKDAYS\020\013\022" +
      "\031\n\025SUP_WORKDAYS_AND_TIME\020\014\022\016\n\nSUP_SCHOOL" +
      "\020\r\022\014\n\010SUP_RAMP\020\016\022\r\n\tSUP_TRUCK\020\017\022\032\n\026SUP_T" +
      "RUCK_WITH_TRAILER\020\020\022\025\n\021SUP_PASSENGER_CAR" +
      "\020\021\022!\n\035SUP_PASSENGER_CAR_WITH_TAILER\020\022\022\026\n" +
      "\022SUP_TRACTOR_EXCEPT\020\023\022\013\n\007SUP_BUS\020\024\022\026\n\022SU" +
      "P_TRUCKS_AND_BUS\020\025\022\027\n\023SUP_CARS_TRUCKS_BU" +
      "S\020\026\022\014\n\010SUP_TAXI\020\027\022\014\n\010SUP_TANK\020\030\022\020\n\014SUP_R" +
      "OADSIDE\020\031\022\016\n\nSUP_WEIGHT\020\032\022\023\n\017SUP_STARTIN" +
      "G_IN\020\033\022\021\n\rSUP_VALID_FOR\020\034\022\032\n\026SUP_IN_RIGH" +
      "T_DIRECTION\020\035\022\031\n\025SUP_IN_LEFT_DIRECTION\020\036" +
      "\022\014\n\010SUP_ZONE\020\037\022\022\n\016SUP_ZONE_START\020 \022\020\n\014SU" +
      "P_ZONE_END\020!\022\031\n\025SUP_BEGIN_OF_VALIDITY\020\"\022" +
      "\027\n\023SUP_END_OF_VALIDITY\020#\022\014\n\010SUP_FROG\020$\022\017" +
      "\n\013SUP_ALL_WAY\020%\022\014\n\010SUP_BIKE\020&\022\023\n\017SUP_BIK" +
      "E_EXCEPT\020\'\022\022\n\016SUP_BUS_EXCEPT\020(\022\016\n\nSUP_CA" +
      "MPER\020)\022\017\n\013SUP_CARAVAN\020*\022\034\n\030SUP_CONSTRUCT" +
      "ION_GATEWAY\020+\022\021\n\rSUP_CROSS_WAY\020,\022\027\n\023SUP_" +
      "DELIVERY_EXCEPT\020-\022\026\n\022SUP_ELECTRONIC_CAR\020" +
      ".\022\017\n\013SUP_GATEWAY\020/\022\025\n\021SUP_GIVE_WAY_LEFT\020" +
      "0\022\026\n\022SUP_GIVE_WAY_RIGHT\0201\022\016\n\nSUP_GRAVEL\020" +
      "2\022\016\n\nSUP_HAZMAT\0203\022\021\n\rSUP_HAZ_WATER\0204\022\014\n\010" +
      "SUP_KIDS\0205\022\023\n\017SUP_LOCAL_EXCEP\0206\022\020\n\014SUP_L" +
      "OW_TREE\0207\022\022\n\016SUP_MOTORCYCLE\0208\022\031\n\025SUP_MOT" +
      "ORCYCLE_EXCEPT\0209\022\024\n\020SUP_NEW_ROAD_BED\020:\022\030" +
      "\n\024SUP_NO_STOP_SHOULDER\020;\022\021\n\rSUP_OIL_TRAI" +
      "L\020<\022\034\n\030SUP_PASSENGER_CAR_EXCEPT\020=\022(\n$SUP" +
      "_PASSENGER_CAR_WITH_TAILER_EXCEPT\020>\022\022\n\016S" +
      "UP_PEDESTRIAN\020?\022\032\n\026SUP_PRIORITY_TURN_LEF" +
      "T\020@\022\033\n\027SUP_PRIORITY_TURN_RIGHT\020A\022\023\n\017SUP_" +
      "ROAD_DAMAGE\020B\022\014\n\010SUP_RUTS\020C\022\017\n\013SUP_TRACT" +
      "OR\020D\022 \n\034SUP_TRACTOR_MAY_BE_OVERTAKEN\020E\022\023" +
      "\n\017SUP_TRAFFIC_JAM\020F\022\r\n\tSUP_TRAIN\020G\022\014\n\010SU" +
      "P_TRAM\020H\022\024\n\020SUP_TRUCK_EXCEPT\020I\022!\n\035SUP_TR" +
      "UCK_WITH_TRAILER_EXCEPT\020J\022\032\n\026SUP_GET_IN_" +
      "PROPER_LANE\020K\022\026\n\022SUP_ROADSIDE_TRUCK\020L\022\016\n" +
      "\nSUP_RAPPEL\020M\022\026\n\022SUP_RADAR_ENFORCED\020N\022\030\n" +
      "\024SUP_STOP_IN_DISTANCE\020O\"\260\001\n\031TrafficRegul" +
      "ationCategory\022@\n\010envelope\030\001 \001(\0132..sensor" +
      "is.protobuf.types.base.CategoryEnvelope\022" +
      "Q\n\014traffic_sign\030\002 \003(\0132;.sensoris.protobu" +
      "f.categories.trafficregulation.TrafficSi" +
      "gnBS\n)org.sensoris.categories.trafficreg" +
      "ulationB!SensorisTrafficRegulationCatego" +
      "ryP\001\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
          org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor(),
        });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor,
        new java.lang.String[] { "Envelope", "ExistenceConfidence", "DetectionStatus", "RectangularBoxAndAccuracy", "ShapeAndConfidence", "TypeAndConfidence", "ValueAndConfidence", "PermanencyAndConfidence", "ValidationAndConfidence", "BackgroundColorAndConfidence", "SupplementarySignAndConfidence", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ShapeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ShapeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ShapeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_TypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor.getNestedTypes().get(1);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_TypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_TypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", "OtherText", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValueAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor.getNestedTypes().get(2);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValueAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValueAndConfidence_descriptor,
        new java.lang.String[] { "Value", "Confidence", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_PermanencyAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor.getNestedTypes().get(3);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_PermanencyAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_PermanencyAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValidationAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor.getNestedTypes().get(4);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValidationAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_ValidationAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_DominantBackgroundColorAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor.getNestedTypes().get(5);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_DominantBackgroundColorAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_DominantBackgroundColorAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_descriptor.getNestedTypes().get(6);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_descriptor,
        new java.lang.String[] { "ExistenceConfidence", "DetectionStatus", "TypeAndConfidence", "ValueAndConfidence", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_TypeAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_TypeAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficSign_SupplementarySignAndConfidence_TypeAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", "OtherText", });
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_trafficregulation_TrafficRegulationCategory_descriptor,
        new java.lang.String[] { "Envelope", "TrafficSign", });
    com.google.protobuf.WrappersProto.getDescriptor();
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
    org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
