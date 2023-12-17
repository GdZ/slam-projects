# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.lane_access_type
import nds.core.types.lane_functional_type
import nds.core.types.road_type

class LaneType:
    def __init__(
            self,
            functional_lane_type_: typing.Union[nds.core.types.lane_functional_type.LaneFunctionalType, None] = None,
            access_lane_type_: typing.Union[nds.core.types.lane_access_type.LaneAccessType, None] = None,
            road_type_: typing.Union[nds.core.types.road_type.RoadType, None] = None) -> None:
        self._functional_lane_type_ = functional_lane_type_
        self._access_lane_type_ = access_lane_type_
        self._road_type_ = road_type_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneType'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneType':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneType'],
            zserio_context: LaneType.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneType':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneType):
            return ((self._functional_lane_type_ == other._functional_lane_type_) and
                    (self._access_lane_type_ == other._access_lane_type_) and
                    (self._road_type_ == other._road_type_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._functional_lane_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._access_lane_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._road_type_)

        return result

    @property
    def functional_lane_type(self) -> typing.Union[nds.core.types.lane_functional_type.LaneFunctionalType, None]:
        return self._functional_lane_type_

    @functional_lane_type.setter
    def functional_lane_type(self, functional_lane_type_: typing.Union[nds.core.types.lane_functional_type.LaneFunctionalType, None]) -> None:
        self._functional_lane_type_ = functional_lane_type_

    @property
    def access_lane_type(self) -> typing.Union[nds.core.types.lane_access_type.LaneAccessType, None]:
        return self._access_lane_type_

    @access_lane_type.setter
    def access_lane_type(self, access_lane_type_: typing.Union[nds.core.types.lane_access_type.LaneAccessType, None]) -> None:
        self._access_lane_type_ = access_lane_type_

    @property
    def road_type(self) -> typing.Union[nds.core.types.road_type.RoadType, None]:
        return self._road_type_

    @road_type.setter
    def road_type(self, road_type_: typing.Union[nds.core.types.road_type.RoadType, None]) -> None:
        self._road_type_ = road_type_

    def init_packing_context(self, zserio_context: LaneType.ZserioPackingContext) -> None:
        self._functional_lane_type_.init_packing_context(zserio_context.functional_lane_type)
        self._access_lane_type_.init_packing_context(zserio_context.access_lane_type)
        self._road_type_.init_packing_context(zserio_context.road_type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._functional_lane_type_.bitsizeof(end_bitposition)
        end_bitposition += self._access_lane_type_.bitsizeof(end_bitposition)
        end_bitposition += self._road_type_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneType.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._functional_lane_type_.bitsizeof_packed(zserio_context.functional_lane_type, end_bitposition)
        end_bitposition += self._access_lane_type_.bitsizeof_packed(zserio_context.access_lane_type, end_bitposition)
        end_bitposition += self._road_type_.bitsizeof_packed(zserio_context.road_type, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._functional_lane_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._access_lane_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._road_type_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneType.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._functional_lane_type_.initialize_offsets_packed(zserio_context.functional_lane_type, end_bitposition)
        end_bitposition = self._access_lane_type_.initialize_offsets_packed(zserio_context.access_lane_type, end_bitposition)
        end_bitposition = self._road_type_.initialize_offsets_packed(zserio_context.road_type, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._functional_lane_type_ = nds.core.types.lane_functional_type.LaneFunctionalType.from_reader(zserio_reader)
        self._access_lane_type_ = nds.core.types.lane_access_type.LaneAccessType.from_reader(zserio_reader)
        self._road_type_ = nds.core.types.road_type.RoadType.from_reader(zserio_reader)

    def read_packed(self, zserio_context: LaneType.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._functional_lane_type_ = nds.core.types.lane_functional_type.LaneFunctionalType.from_reader_packed(zserio_context.functional_lane_type, zserio_reader)

        self._access_lane_type_ = nds.core.types.lane_access_type.LaneAccessType.from_reader_packed(zserio_context.access_lane_type, zserio_reader)

        self._road_type_ = nds.core.types.road_type.RoadType.from_reader_packed(zserio_context.road_type, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._functional_lane_type_.write(zserio_writer)
        self._access_lane_type_.write(zserio_writer)
        self._road_type_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneType.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._functional_lane_type_.write_packed(zserio_context.functional_lane_type, zserio_writer)

        self._access_lane_type_.write_packed(zserio_context.access_lane_type, zserio_writer)

        self._road_type_.write_packed(zserio_context.road_type, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._functional_lane_type_ = zserio.array.DeltaContext()
            self._access_lane_type_ = zserio.array.DeltaContext()
            self._road_type_ = nds.core.types.road_type.RoadType.ZserioPackingContext()

        @property
        def functional_lane_type(self):
            return self._functional_lane_type_

        @property
        def access_lane_type(self):
            return self._access_lane_type_

        @property
        def road_type(self):
            return self._road_type_
