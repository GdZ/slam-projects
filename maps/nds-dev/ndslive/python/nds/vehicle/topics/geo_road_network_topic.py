# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.time_stamp
import nds.vehicle.types.horizon

class GeoRoadNetworkTopic:
    def __init__(
            self,
            stamp_: typing.Union[nds.core.types.time_stamp.TimeStamp, None] = None,
            road_network_: typing.Union[nds.vehicle.types.horizon.Horizon, None] = None) -> None:
        self._stamp_ = stamp_
        self._road_network_ = road_network_

    @classmethod
    def from_reader(
            cls: typing.Type['GeoRoadNetworkTopic'],
            zserio_reader: zserio.BitStreamReader) -> 'GeoRoadNetworkTopic':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['GeoRoadNetworkTopic'],
            zserio_context: GeoRoadNetworkTopic.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'GeoRoadNetworkTopic':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, GeoRoadNetworkTopic):
            return ((self._stamp_ == other._stamp_) and
                    (self._road_network_ == other._road_network_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._stamp_)
        result = zserio.hashcode.calc_hashcode_object(result, self._road_network_)

        return result

    @property
    def stamp(self) -> typing.Union[nds.core.types.time_stamp.TimeStamp, None]:
        return self._stamp_

    @stamp.setter
    def stamp(self, stamp_: typing.Union[nds.core.types.time_stamp.TimeStamp, None]) -> None:
        self._stamp_ = stamp_

    @property
    def road_network(self) -> typing.Union[nds.vehicle.types.horizon.Horizon, None]:
        return self._road_network_

    @road_network.setter
    def road_network(self, road_network_: typing.Union[nds.vehicle.types.horizon.Horizon, None]) -> None:
        self._road_network_ = road_network_

    def init_packing_context(self, zserio_context: GeoRoadNetworkTopic.ZserioPackingContext) -> None:
        self._stamp_.init_packing_context(zserio_context.stamp)
        self._road_network_.init_packing_context(zserio_context.road_network)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._stamp_.bitsizeof(end_bitposition)
        end_bitposition += self._road_network_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: GeoRoadNetworkTopic.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._stamp_.bitsizeof_packed(zserio_context.stamp, end_bitposition)
        end_bitposition += self._road_network_.bitsizeof_packed(zserio_context.road_network, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._stamp_.initialize_offsets(end_bitposition)
        end_bitposition = self._road_network_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: GeoRoadNetworkTopic.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._stamp_.initialize_offsets_packed(zserio_context.stamp, end_bitposition)
        end_bitposition = self._road_network_.initialize_offsets_packed(zserio_context.road_network, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._stamp_ = nds.core.types.time_stamp.TimeStamp.from_reader(zserio_reader)
        self._road_network_ = nds.vehicle.types.horizon.Horizon.from_reader(zserio_reader)

    def read_packed(self, zserio_context: GeoRoadNetworkTopic.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._stamp_ = nds.core.types.time_stamp.TimeStamp.from_reader_packed(zserio_context.stamp, zserio_reader)

        self._road_network_ = nds.vehicle.types.horizon.Horizon.from_reader_packed(zserio_context.road_network, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._stamp_.write(zserio_writer)
        self._road_network_.write(zserio_writer)

    def write_packed(self, zserio_context: GeoRoadNetworkTopic.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._stamp_.write_packed(zserio_context.stamp, zserio_writer)

        self._road_network_.write_packed(zserio_context.road_network, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._stamp_ = nds.core.types.time_stamp.TimeStamp.ZserioPackingContext()
            self._road_network_ = nds.vehicle.types.horizon.Horizon.ZserioPackingContext()

        @property
        def stamp(self):
            return self._stamp_

        @property
        def road_network(self):
            return self._road_network_
