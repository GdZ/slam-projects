# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.vehicle.topics.geo_road_network_topic
import nds.vehicle.topics.matched_geo_road_network_topic
import nds.vehicle.topics.mpp_topic
import nds.vehicle.topics.pose_geo_matched_topic
import nds.vehicle.topics.pose_raw_topic

class VehicleTopicCollection:
    def __init__(self, pubsub: zserio.PubsubInterface) -> None:
        self._pubsub = pubsub

    def publish_pose_raw(self, message: nds.vehicle.topics.pose_raw_topic.PoseRawTopic, context: typing.Any = None) -> None:
        self._publish("nds/vehicle/+/pose/raw", message, context)

    def subscribe_pose_raw(self, callback: typing.Callable[[str, nds.vehicle.topics.pose_raw_topic.PoseRawTopic], None], context: typing.Any = None) -> int:
        def on_raw(topic: str, data: bytes) -> None:
            self._on_raw_pose_raw(callback, topic, data)
        return self._pubsub.subscribe("nds/vehicle/+/pose/raw", on_raw, context)

    def publish_pose_geo_matched(self, message: nds.vehicle.topics.pose_geo_matched_topic.PoseGeoMatchedTopic, context: typing.Any = None) -> None:
        self._publish("nds/vehicle/+/pose/geomatched", message, context)

    def subscribe_pose_geo_matched(self, callback: typing.Callable[[str, nds.vehicle.topics.pose_geo_matched_topic.PoseGeoMatchedTopic], None], context: typing.Any = None) -> int:
        def on_raw(topic: str, data: bytes) -> None:
            self._on_raw_pose_geo_matched(callback, topic, data)
        return self._pubsub.subscribe("nds/vehicle/+/pose/geomatched", on_raw, context)

    def publish_geo_road_network(self, message: nds.vehicle.topics.geo_road_network_topic.GeoRoadNetworkTopic, context: typing.Any = None) -> None:
        self._publish("nds/vehicle/+/path/network", message, context)

    def subscribe_geo_road_network(self, callback: typing.Callable[[str, nds.vehicle.topics.geo_road_network_topic.GeoRoadNetworkTopic], None], context: typing.Any = None) -> int:
        def on_raw(topic: str, data: bytes) -> None:
            self._on_raw_geo_road_network(callback, topic, data)
        return self._pubsub.subscribe("nds/vehicle/+/path/network", on_raw, context)

    def publish_mpp(self, message: nds.vehicle.topics.mpp_topic.MppTopic, context: typing.Any = None) -> None:
        self._publish("nds/vehicle/+/path/mpp", message, context)

    def subscribe_mpp(self, callback: typing.Callable[[str, nds.vehicle.topics.mpp_topic.MppTopic], None], context: typing.Any = None) -> int:
        def on_raw(topic: str, data: bytes) -> None:
            self._on_raw_mpp(callback, topic, data)
        return self._pubsub.subscribe("nds/vehicle/+/path/mpp", on_raw, context)

    def publish_matched_geo_road_network(self, message: nds.vehicle.topics.matched_geo_road_network_topic.MatchedGeoRoadNetworkTopic, context: typing.Any = None) -> None:
        self._publish("nds/vehicle/+/path/network/matched", message, context)

    def subscribe_matched_geo_road_network(self, callback: typing.Callable[[str, nds.vehicle.topics.matched_geo_road_network_topic.MatchedGeoRoadNetworkTopic], None], context: typing.Any = None) -> int:
        def on_raw(topic: str, data: bytes) -> None:
            self._on_raw_matched_geo_road_network(callback, topic, data)
        return self._pubsub.subscribe("nds/vehicle/+/path/network/matched", on_raw, context)

    def unsubscribe(self, subscription_id: int) -> None:
        self._pubsub.unsubscribe(subscription_id)

    def _on_raw_pose_raw(self, callback: typing.Callable[[str, nds.vehicle.topics.pose_raw_topic.PoseRawTopic], None], topic: str, data: bytes) -> None:
        reader = zserio.BitStreamReader(data)
        message = nds.vehicle.topics.pose_raw_topic.PoseRawTopic.from_reader(reader)
        callback(topic, message)

    def _on_raw_pose_geo_matched(self, callback: typing.Callable[[str, nds.vehicle.topics.pose_geo_matched_topic.PoseGeoMatchedTopic], None], topic: str, data: bytes) -> None:
        reader = zserio.BitStreamReader(data)
        message = nds.vehicle.topics.pose_geo_matched_topic.PoseGeoMatchedTopic.from_reader(reader)
        callback(topic, message)

    def _on_raw_geo_road_network(self, callback: typing.Callable[[str, nds.vehicle.topics.geo_road_network_topic.GeoRoadNetworkTopic], None], topic: str, data: bytes) -> None:
        reader = zserio.BitStreamReader(data)
        message = nds.vehicle.topics.geo_road_network_topic.GeoRoadNetworkTopic.from_reader(reader)
        callback(topic, message)

    def _on_raw_mpp(self, callback: typing.Callable[[str, nds.vehicle.topics.mpp_topic.MppTopic], None], topic: str, data: bytes) -> None:
        reader = zserio.BitStreamReader(data)
        message = nds.vehicle.topics.mpp_topic.MppTopic.from_reader(reader)
        callback(topic, message)

    def _on_raw_matched_geo_road_network(self, callback: typing.Callable[[str, nds.vehicle.topics.matched_geo_road_network_topic.MatchedGeoRoadNetworkTopic], None], topic: str, data: bytes) -> None:
        reader = zserio.BitStreamReader(data)
        message = nds.vehicle.topics.matched_geo_road_network_topic.MatchedGeoRoadNetworkTopic.from_reader(reader)
        callback(topic, message)

    def _publish(self, topic: str, message: typing.Any, context: typing.Any) -> None:
        writer = zserio.BitStreamWriter()
        message.write(writer)
        self._pubsub.publish(topic, writer.byte_array, context)
