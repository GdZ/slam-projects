# SENSORIS Specification

The **Sensor Interface Specification (SENSORIS)** defines an interface for requesting and sending vehicle sensor data from vehicles to clouds and across clouds. The specification and its standardization focus on the content and encoding of the interface.

For more information please visit the [SENSORIS webpage](https://sensoris.org/).

## Change Log

### SENSORIS v1.4.1

Bugfixes:

- In the `LocalizationCategory` the `VehicleSpeed` is fixed to set the vehicle speed to negative if the vehicle drives backwards.

### SENSORIS v1.4.0

New enums have been added:

- In the `ObjectDetectionCategory` three new values were added to the `StaticObject` type: `TRAFFIC_ENFORCEMENT_CAMERA`, `TRAFFIC_ENFORCEMENT_CAMERA_FIXED`, and `TRAFFIC_ENFORCEMENT_CAMERA_MOBILE`.
- Static objects of type `TRAFFIC_ENFORCEMENT_CAMERA_MOBILE` which are hand-held can be related to a movable object of type `PERSON`.
- Static objects of type `TRAFFIC_ENFORCEMENT_CAMERA_MOBILE` which are vehicle-mounted can be related to a movable object of type `VEHICLE` or one of it's sub-types.
- Additional lane boundary types were added to `LaneBoundary` in `RoadAttributionCategory`.

A few bugfixes were necessary:

- The unit of the base type `XyzVectorAndAccuracy` depends on the usage in a composite type. For the resolution this was described in the architecture document, but not for unit and range.
- Fix documentation of resolution of `RoadAttribution` > `InclinationAndCurvature` > `horizontal_curvature_and_accuracy`.
- Description for `THREE_D` for `NavigationSatelliteSystemStatus` of `VehiclePositionAndOrientation` is fixed.

### SENSORIS v1.3.0

Some events have been added:

- Added the `VehicleDeviceCategory` to the SENSORIS DataMessage.
- In the `VehicleDeviceCategory` the `ExteriorLightStatus` event and `WiperStatus` events for the front and rear wiper have been added.
- In the `TrafficEventsCategory` the `ECallStatus` event has been added.

In addition package names for the Google Go programming language have been added throughout the specification.

A few bugfixes were necessary:

- For the states of a Job the UML state diagram in the interface architecture has been fixed to allow for termination from inactive state.
- Clarification of the spatial reference system for the `RotationAndAccuracy` type.

### SENSORIS v1.2.0

In context of the EU Data Task Force several hazard events have been added:

- In the `TrafficEventsCategory` the `Hazard` event has been extended and the `RoadSurfaceCondition`, `RoadObstructionCondition` and `VulnerableRoadUserCondition` have been added.
- In the `WeatherCategory` the `AtmosphereCondition`, `WindCondition`, and `VisibilityCondition` have been added.
- In the `EventEnvelope` the `DetectionType` has been added, which is available for all events.

In addition, enumeration values have been extended for the `StaticObject` event in the `ObjectDetectionCategory`, for the `MarkingColorAndConfidence` in the `RoadAttributionCategory`, and for the `TrafficSign` event in the `TrafficRegulationCategory`.

### SENSORIS v1.1.1

A few bugfixes were necessary:

- In the interface architecture document several minor issues have been fixed.
- The enumeration value `OTHER` has been deprecated affecting several events, as it complicates compatibility between versions.
- The value range for the relative speed of the `MoveableObject` event in the `ObjectDetectionCategory` has been fixed to allow also negative values.
- The example for the `AbsolutePaths` in the `DataMessage` has been fixed to point to the correct event.

### SENSORIS v1.1.0

The Request Channel has been added. Job Messages are defined so that the cloud can request jobs to the vehicle. This version allows closing the loop, from Job Request to Data Messages upload.

Proto files corresponding to the Job Request Channel:

```bash
-- messages/
      - job.proto
-- types/
      - collection.proto
      - job.proto
      - job_validity.proto
      - logical_expresion.proto
      - map.proto
```

Some backwards compatible additions have been made with respect SENSORIS v1.0.0:

```bash
-- messages/
      - data.proto
-- types/
      - base.proto
      - spatial.proto
```

### SENSORIS v1.0.0

Focuses on the definition of Data Messages to transmit vehicle sensor data from the vehicle to the cloud.

Proto files corresponding to the Data Messages:

```bash
-- messages/
         - data.proto
-- types/
      - base.proto
      - source.proto
      - spatial.proto
-- categories/
      - brake.proto
      - driving_behavior.proto
      - intersection_attribution.proto
      - localization.proto
      - map.proto
      - object_detection.proto
      - powertrain.proto
      - road_attribution.proto
      - traffic_events.proto
      - traffic_maneuver.proto
      - traffic_regulation.proto
      - weather.proto
```

## Protobuf

The SENSORIS specification uses [Google Protocol Buffers](https://developers.google.com/protocol-buffers/) (protobuf) version 3 for message encoding. The SENSORIS protobuf schemas are located in the src directory.

To compile the SENSORIS protobuf schemas for target languages, e.g. C++ and Java, some steps are required which are described below for a Linux based system.

First, download the [protoc compiler](https://github.com/google/protobuf/releases/tag/v3.5.1) for the target system and unzip it.

```bash
wget https://github.com/google/protobuf/releases/download/v3.5.1/protoc-3.5.1-linux-x86_64.zip
unzip protoc-3.5.1-linux-x86_64.zip -d protobuf
```

Then clone the SENSORIS specification from GitHub and checkout the desired Git branch, e.g. feature/localization-category.

```bash
git clone https://github.com/sensoris/specification.git
cd specification
git checkout feature/localization-category
cd ..
```

The protobuf compiler requires that the output directories for the generated sources exist, e.g. for C++ and Java.

```bash
mkdir specification-cpp specification-java
```

Finally, run the protobuf compiler to generate the sources for C++ and Java. For protoc all protobuf files have to be listed individually, which is automatically done by the find command.

```bash
protobuf/bin/protoc --cpp_out=specification-cpp --java_out=specification-java --proto_path=specification/src $(find specification -name '*.proto' -printf "%p ")
```

For reference the expanded version of the protobuf compiler call is listed below.

```bash
protobuf/bin/protoc --cpp_out=specification-cpp --java_out=specification-java --proto_path=specification/src specification/src/sensoris/protobuf/types/base.proto specification/src/sensoris/protobuf/types/source.proto specification/src/sensoris/protobuf/types/spatial.proto specification/src/sensoris/protobuf/messages/data.proto specification/src/sensoris/protobuf/categories/traffic_regulation.proto specification/src/sensoris/protobuf/categories/map.proto specification/src/sensoris/protobuf/categories/brake.proto specification/src/sensoris/protobuf/categories/weather.proto specification/src/sensoris/protobuf/categories/intersection_attribution.proto specification/src/sensoris/protobuf/categories/traffic_events.proto specification/src/sensoris/protobuf/categories/traffic_maneuver.proto specification/src/sensoris/protobuf/categories/localization.proto specification/src/sensoris/protobuf/categories/driving_behavior.proto specification/src/sensoris/protobuf/categories/powertrain.proto specification/src/sensoris/protobuf/categories/object_detection.proto specification/src/sensoris/protobuf/categories/road_attribution.proto
```

The generated source files for C++ and Java are created in the respective directories, e.g. specification-cpp and specification-java.
