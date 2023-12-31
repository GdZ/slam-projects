// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/messages/data.proto

// Protobuf Java Version: 3.25.1
package org.sensoris.messages.data;

public interface EventGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.messages.data.EventGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.EventGroup.Envelope envelope = 1;</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.EventGroup.Envelope envelope = 1;</code>
   * @return The envelope.
   */
  org.sensoris.messages.data.EventGroup.Envelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.EventGroup.Envelope envelope = 1;</code>
   */
  org.sensoris.messages.data.EventGroup.EnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Localization category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.localization.LocalizationCategory localization_category = 2;</code>
   * @return Whether the localizationCategory field is set.
   */
  boolean hasLocalizationCategory();
  /**
   * <pre>
   * Localization category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.localization.LocalizationCategory localization_category = 2;</code>
   * @return The localizationCategory.
   */
  org.sensoris.categories.localization.LocalizationCategory getLocalizationCategory();
  /**
   * <pre>
   * Localization category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.localization.LocalizationCategory localization_category = 2;</code>
   */
  org.sensoris.categories.localization.LocalizationCategoryOrBuilder getLocalizationCategoryOrBuilder();

  /**
   * <pre>
   * Object detection category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.ObjectDetectionCategory object_detection_category = 3;</code>
   * @return Whether the objectDetectionCategory field is set.
   */
  boolean hasObjectDetectionCategory();
  /**
   * <pre>
   * Object detection category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.ObjectDetectionCategory object_detection_category = 3;</code>
   * @return The objectDetectionCategory.
   */
  org.sensoris.categories.objectdetection.ObjectDetectionCategory getObjectDetectionCategory();
  /**
   * <pre>
   * Object detection category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.objectdetection.ObjectDetectionCategory object_detection_category = 3;</code>
   */
  org.sensoris.categories.objectdetection.ObjectDetectionCategoryOrBuilder getObjectDetectionCategoryOrBuilder();

  /**
   * <pre>
   * Weather category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.weather.WeatherCategory weather_category = 4;</code>
   * @return Whether the weatherCategory field is set.
   */
  boolean hasWeatherCategory();
  /**
   * <pre>
   * Weather category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.weather.WeatherCategory weather_category = 4;</code>
   * @return The weatherCategory.
   */
  org.sensoris.categories.weather.WeatherCategory getWeatherCategory();
  /**
   * <pre>
   * Weather category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.weather.WeatherCategory weather_category = 4;</code>
   */
  org.sensoris.categories.weather.WeatherCategoryOrBuilder getWeatherCategoryOrBuilder();

  /**
   * <pre>
   * Driving behavior category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory driving_behavior_category = 5;</code>
   * @return Whether the drivingBehaviorCategory field is set.
   */
  boolean hasDrivingBehaviorCategory();
  /**
   * <pre>
   * Driving behavior category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory driving_behavior_category = 5;</code>
   * @return The drivingBehaviorCategory.
   */
  org.sensoris.categories.drivingbehavior.DrivingBehaviorCategory getDrivingBehaviorCategory();
  /**
   * <pre>
   * Driving behavior category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.drivingbehavior.DrivingBehaviorCategory driving_behavior_category = 5;</code>
   */
  org.sensoris.categories.drivingbehavior.DrivingBehaviorCategoryOrBuilder getDrivingBehaviorCategoryOrBuilder();

  /**
   * <pre>
   * Intersection attribution category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.intersectionattribution.IntersectionAttributionCategory intersection_attribution_category = 6;</code>
   * @return Whether the intersectionAttributionCategory field is set.
   */
  boolean hasIntersectionAttributionCategory();
  /**
   * <pre>
   * Intersection attribution category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.intersectionattribution.IntersectionAttributionCategory intersection_attribution_category = 6;</code>
   * @return The intersectionAttributionCategory.
   */
  org.sensoris.categories.intersectionattribution.IntersectionAttributionCategory getIntersectionAttributionCategory();
  /**
   * <pre>
   * Intersection attribution category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.intersectionattribution.IntersectionAttributionCategory intersection_attribution_category = 6;</code>
   */
  org.sensoris.categories.intersectionattribution.IntersectionAttributionCategoryOrBuilder getIntersectionAttributionCategoryOrBuilder();

  /**
   * <pre>
   * Road attribution category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.RoadAttributionCategory road_attribution_category = 7;</code>
   * @return Whether the roadAttributionCategory field is set.
   */
  boolean hasRoadAttributionCategory();
  /**
   * <pre>
   * Road attribution category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.RoadAttributionCategory road_attribution_category = 7;</code>
   * @return The roadAttributionCategory.
   */
  org.sensoris.categories.roadattribution.RoadAttributionCategory getRoadAttributionCategory();
  /**
   * <pre>
   * Road attribution category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.RoadAttributionCategory road_attribution_category = 7;</code>
   */
  org.sensoris.categories.roadattribution.RoadAttributionCategoryOrBuilder getRoadAttributionCategoryOrBuilder();

  /**
   * <pre>
   * Traffic regulation category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory traffic_regulation_category = 8;</code>
   * @return Whether the trafficRegulationCategory field is set.
   */
  boolean hasTrafficRegulationCategory();
  /**
   * <pre>
   * Traffic regulation category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory traffic_regulation_category = 8;</code>
   * @return The trafficRegulationCategory.
   */
  org.sensoris.categories.trafficregulation.TrafficRegulationCategory getTrafficRegulationCategory();
  /**
   * <pre>
   * Traffic regulation category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficregulation.TrafficRegulationCategory traffic_regulation_category = 8;</code>
   */
  org.sensoris.categories.trafficregulation.TrafficRegulationCategoryOrBuilder getTrafficRegulationCategoryOrBuilder();

  /**
   * <pre>
   * Traffic events category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficevents.TrafficEventsCategory traffic_events_category = 9;</code>
   * @return Whether the trafficEventsCategory field is set.
   */
  boolean hasTrafficEventsCategory();
  /**
   * <pre>
   * Traffic events category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficevents.TrafficEventsCategory traffic_events_category = 9;</code>
   * @return The trafficEventsCategory.
   */
  org.sensoris.categories.trafficevents.TrafficEventsCategory getTrafficEventsCategory();
  /**
   * <pre>
   * Traffic events category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficevents.TrafficEventsCategory traffic_events_category = 9;</code>
   */
  org.sensoris.categories.trafficevents.TrafficEventsCategoryOrBuilder getTrafficEventsCategoryOrBuilder();

  /**
   * <pre>
   * Traffic maneuver category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficmaneuver.TrafficManeuverCategory traffic_maneuver_category = 10;</code>
   * @return Whether the trafficManeuverCategory field is set.
   */
  boolean hasTrafficManeuverCategory();
  /**
   * <pre>
   * Traffic maneuver category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficmaneuver.TrafficManeuverCategory traffic_maneuver_category = 10;</code>
   * @return The trafficManeuverCategory.
   */
  org.sensoris.categories.trafficmaneuver.TrafficManeuverCategory getTrafficManeuverCategory();
  /**
   * <pre>
   * Traffic maneuver category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.trafficmaneuver.TrafficManeuverCategory traffic_maneuver_category = 10;</code>
   */
  org.sensoris.categories.trafficmaneuver.TrafficManeuverCategoryOrBuilder getTrafficManeuverCategoryOrBuilder();

  /**
   * <pre>
   * Brake category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.brake.BrakeCategory brake_category = 11;</code>
   * @return Whether the brakeCategory field is set.
   */
  boolean hasBrakeCategory();
  /**
   * <pre>
   * Brake category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.brake.BrakeCategory brake_category = 11;</code>
   * @return The brakeCategory.
   */
  org.sensoris.categories.brake.BrakeCategory getBrakeCategory();
  /**
   * <pre>
   * Brake category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.brake.BrakeCategory brake_category = 11;</code>
   */
  org.sensoris.categories.brake.BrakeCategoryOrBuilder getBrakeCategoryOrBuilder();

  /**
   * <pre>
   * Powertrain category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.PowertrainCategory powertrain_category = 12;</code>
   * @return Whether the powertrainCategory field is set.
   */
  boolean hasPowertrainCategory();
  /**
   * <pre>
   * Powertrain category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.PowertrainCategory powertrain_category = 12;</code>
   * @return The powertrainCategory.
   */
  org.sensoris.categories.powertrain.PowertrainCategory getPowertrainCategory();
  /**
   * <pre>
   * Powertrain category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.powertrain.PowertrainCategory powertrain_category = 12;</code>
   */
  org.sensoris.categories.powertrain.PowertrainCategoryOrBuilder getPowertrainCategoryOrBuilder();

  /**
   * <pre>
   * Map category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.map.MapCategory map_category = 13;</code>
   * @return Whether the mapCategory field is set.
   */
  boolean hasMapCategory();
  /**
   * <pre>
   * Map category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.map.MapCategory map_category = 13;</code>
   * @return The mapCategory.
   */
  org.sensoris.categories.map.MapCategory getMapCategory();
  /**
   * <pre>
   * Map category.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.map.MapCategory map_category = 13;</code>
   */
  org.sensoris.categories.map.MapCategoryOrBuilder getMapCategoryOrBuilder();
}
