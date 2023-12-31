// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/traffic_maneuver.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.trafficmaneuver;

public interface TrafficManeuverCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.trafficmaneuver.TrafficManeuverCategory)
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
   * Maneuver.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Maneuver maneuver = 2;</code>
   */
  java.util.List<org.sensoris.categories.trafficmaneuver.Maneuver> 
      getManeuverList();
  /**
   * <pre>
   * Maneuver.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Maneuver maneuver = 2;</code>
   */
  org.sensoris.categories.trafficmaneuver.Maneuver getManeuver(int index);
  /**
   * <pre>
   * Maneuver.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Maneuver maneuver = 2;</code>
   */
  int getManeuverCount();
  /**
   * <pre>
   * Maneuver.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Maneuver maneuver = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.trafficmaneuver.ManeuverOrBuilder> 
      getManeuverOrBuilderList();
  /**
   * <pre>
   * Maneuver.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Maneuver maneuver = 2;</code>
   */
  org.sensoris.categories.trafficmaneuver.ManeuverOrBuilder getManeuverOrBuilder(
      int index);

  /**
   * <pre>
   * Charging.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Charging charging = 3;</code>
   */
  java.util.List<org.sensoris.categories.trafficmaneuver.Charging> 
      getChargingList();
  /**
   * <pre>
   * Charging.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Charging charging = 3;</code>
   */
  org.sensoris.categories.trafficmaneuver.Charging getCharging(int index);
  /**
   * <pre>
   * Charging.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Charging charging = 3;</code>
   */
  int getChargingCount();
  /**
   * <pre>
   * Charging.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Charging charging = 3;</code>
   */
  java.util.List<? extends org.sensoris.categories.trafficmaneuver.ChargingOrBuilder> 
      getChargingOrBuilderList();
  /**
   * <pre>
   * Charging.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Charging charging = 3;</code>
   */
  org.sensoris.categories.trafficmaneuver.ChargingOrBuilder getChargingOrBuilder(
      int index);

  /**
   * <pre>
   * Refueling.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Refueling refueling = 4;</code>
   */
  java.util.List<org.sensoris.categories.trafficmaneuver.Refueling> 
      getRefuelingList();
  /**
   * <pre>
   * Refueling.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Refueling refueling = 4;</code>
   */
  org.sensoris.categories.trafficmaneuver.Refueling getRefueling(int index);
  /**
   * <pre>
   * Refueling.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Refueling refueling = 4;</code>
   */
  int getRefuelingCount();
  /**
   * <pre>
   * Refueling.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Refueling refueling = 4;</code>
   */
  java.util.List<? extends org.sensoris.categories.trafficmaneuver.RefuelingOrBuilder> 
      getRefuelingOrBuilderList();
  /**
   * <pre>
   * Refueling.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.trafficmaneuver.Refueling refueling = 4;</code>
   */
  org.sensoris.categories.trafficmaneuver.RefuelingOrBuilder getRefuelingOrBuilder(
      int index);
}
