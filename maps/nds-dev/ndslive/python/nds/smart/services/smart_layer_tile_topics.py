# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.tile_id

class SmartLayerTileTopics:
    def __init__(self, pubsub: zserio.PubsubInterface) -> None:
        self._pubsub = pubsub

    def publish_tile_id(self, message: nds.core.types.tile_id.TileId, context: typing.Any = None) -> None:
        self._publish("nds/smart/tile/update", message, context)

    def subscribe_tile_id(self, callback: typing.Callable[[str, nds.core.types.tile_id.TileId], None], context: typing.Any = None) -> int:
        def on_raw(topic: str, data: bytes) -> None:
            self._on_raw_tile_id(callback, topic, data)
        return self._pubsub.subscribe("nds/smart/tile/update", on_raw, context)

    def unsubscribe(self, subscription_id: int) -> None:
        self._pubsub.unsubscribe(subscription_id)

    def _on_raw_tile_id(self, callback: typing.Callable[[str, nds.core.types.tile_id.TileId], None], topic: str, data: bytes) -> None:
        reader = zserio.BitStreamReader(data)
        message = nds.core.types.tile_id.TileId.from_reader(reader)
        callback(topic, message)

    def _publish(self, topic: str, message: typing.Any, context: typing.Any) -> None:
        writer = zserio.BitStreamWriter()
        message.write(writer)
        self._pubsub.publish(topic, writer.byte_array, context)
