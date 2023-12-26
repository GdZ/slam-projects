// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/intersection_attribution.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.categories.intersectionattribution;

public interface IntersectionAttributionCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.intersectionattribution.IntersectionAttributionCategory)
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
   * Bulb of a traffic signal, i.e. the individual traffic light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignalBulb traffic_signal_bulb = 2;</code>
   */
  java.util.List<org.sensoris.categories.intersectionattribution.TrafficSignalBulb> 
      getTrafficSignalBulbList();
  /**
   * <pre>
   * Bulb of a traffic signal, i.e. the individual traffic light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignalBulb traffic_signal_bulb = 2;</code>
   */
  org.sensoris.categories.intersectionattribution.TrafficSignalBulb getTrafficSignalBulb(int index);
  /**
   * <pre>
   * Bulb of a traffic signal, i.e. the individual traffic light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignalBulb traffic_signal_bulb = 2;</code>
   */
  int getTrafficSignalBulbCount();
  /**
   * <pre>
   * Bulb of a traffic signal, i.e. the individual traffic light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignalBulb traffic_signal_bulb = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.intersectionattribution.TrafficSignalBulbOrBuilder> 
      getTrafficSignalBulbOrBuilderList();
  /**
   * <pre>
   * Bulb of a traffic signal, i.e. the individual traffic light.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignalBulb traffic_signal_bulb = 2;</code>
   */
  org.sensoris.categories.intersectionattribution.TrafficSignalBulbOrBuilder getTrafficSignalBulbOrBuilder(
      int index);

  /**
   * <pre>
   * Traffic signal of one or more traffic lights for an intersection scenario. Traffic signals also might be part of no intersection, e.g. on pedestrian crossings.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignal traffic_signal = 3;</code>
   */
  java.util.List<org.sensoris.categories.intersectionattribution.TrafficSignal> 
      getTrafficSignalList();
  /**
   * <pre>
   * Traffic signal of one or more traffic lights for an intersection scenario. Traffic signals also might be part of no intersection, e.g. on pedestrian crossings.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignal traffic_signal = 3;</code>
   */
  org.sensoris.categories.intersectionattribution.TrafficSignal getTrafficSignal(int index);
  /**
   * <pre>
   * Traffic signal of one or more traffic lights for an intersection scenario. Traffic signals also might be part of no intersection, e.g. on pedestrian crossings.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignal traffic_signal = 3;</code>
   */
  int getTrafficSignalCount();
  /**
   * <pre>
   * Traffic signal of one or more traffic lights for an intersection scenario. Traffic signals also might be part of no intersection, e.g. on pedestrian crossings.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignal traffic_signal = 3;</code>
   */
  java.util.List<? extends org.sensoris.categories.intersectionattribution.TrafficSignalOrBuilder> 
      getTrafficSignalOrBuilderList();
  /**
   * <pre>
   * Traffic signal of one or more traffic lights for an intersection scenario. Traffic signals also might be part of no intersection, e.g. on pedestrian crossings.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.intersectionattribution.TrafficSignal traffic_signal = 3;</code>
   */
  org.sensoris.categories.intersectionattribution.TrafficSignalOrBuilder getTrafficSignalOrBuilder(
      int index);
}
