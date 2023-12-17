# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.reference.types.lane_geometry_range
import nds.lane.reference.types.lane_id
import nds.rules.types.right_of_way_type

class LaneRightOfWayRegulation:
    def __init__(
            self,
            other_lane_: typing.Union[nds.lane.reference.types.lane_id.LaneId, None] = None,
            other_lane_range_: typing.Union[nds.lane.reference.types.lane_geometry_range.LaneGeometryRange, None] = None,
            type_: typing.Union[nds.rules.types.right_of_way_type.RightOfWayType, None] = None) -> None:
        self._other_lane_ = other_lane_
        self._other_lane_range_ = other_lane_range_
        self._type_ = type_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneRightOfWayRegulation'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneRightOfWayRegulation':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneRightOfWayRegulation'],
            zserio_context: LaneRightOfWayRegulation.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneRightOfWayRegulation':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneRightOfWayRegulation):
            return ((self._other_lane_ == other._other_lane_) and
                    (self._other_lane_range_ == other._other_lane_range_) and
                    (self._type_ == other._type_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._other_lane_)
        result = zserio.hashcode.calc_hashcode_object(result, self._other_lane_range_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)

        return result

    @property
    def other_lane(self) -> typing.Union[nds.lane.reference.types.lane_id.LaneId, None]:
        return self._other_lane_

    @other_lane.setter
    def other_lane(self, other_lane_: typing.Union[nds.lane.reference.types.lane_id.LaneId, None]) -> None:
        self._other_lane_ = other_lane_

    @property
    def other_lane_range(self) -> typing.Union[nds.lane.reference.types.lane_geometry_range.LaneGeometryRange, None]:
        return self._other_lane_range_

    @other_lane_range.setter
    def other_lane_range(self, other_lane_range_: typing.Union[nds.lane.reference.types.lane_geometry_range.LaneGeometryRange, None]) -> None:
        self._other_lane_range_ = other_lane_range_

    @property
    def type(self) -> typing.Union[nds.rules.types.right_of_way_type.RightOfWayType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.rules.types.right_of_way_type.RightOfWayType, None]) -> None:
        self._type_ = type_

    def init_packing_context(self, zserio_context: LaneRightOfWayRegulation.ZserioPackingContext) -> None:
        self._other_lane_.init_packing_context(zserio_context.other_lane)
        self._other_lane_range_.init_packing_context(zserio_context.other_lane_range)
        self._type_.init_packing_context(zserio_context.type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._other_lane_.bitsizeof(end_bitposition)
        end_bitposition += self._other_lane_range_.bitsizeof(end_bitposition)
        end_bitposition += self._type_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneRightOfWayRegulation.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._other_lane_.bitsizeof_packed(zserio_context.other_lane, end_bitposition)
        end_bitposition += self._other_lane_range_.bitsizeof_packed(zserio_context.other_lane_range, end_bitposition)
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._other_lane_.initialize_offsets(end_bitposition)
        end_bitposition = self._other_lane_range_.initialize_offsets(end_bitposition)
        end_bitposition = self._type_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneRightOfWayRegulation.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._other_lane_.initialize_offsets_packed(zserio_context.other_lane, end_bitposition)
        end_bitposition = self._other_lane_range_.initialize_offsets_packed(zserio_context.other_lane_range, end_bitposition)
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._other_lane_ = nds.lane.reference.types.lane_id.LaneId.from_reader(zserio_reader)
        self._other_lane_range_ = nds.lane.reference.types.lane_geometry_range.LaneGeometryRange.from_reader(zserio_reader)
        self._type_ = nds.rules.types.right_of_way_type.RightOfWayType.from_reader(zserio_reader)

    def read_packed(self, zserio_context: LaneRightOfWayRegulation.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._other_lane_ = nds.lane.reference.types.lane_id.LaneId.from_reader_packed(zserio_context.other_lane, zserio_reader)

        self._other_lane_range_ = nds.lane.reference.types.lane_geometry_range.LaneGeometryRange.from_reader_packed(zserio_context.other_lane_range, zserio_reader)

        self._type_ = nds.rules.types.right_of_way_type.RightOfWayType.from_reader_packed(zserio_context.type, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._other_lane_.write(zserio_writer)
        self._other_lane_range_.write(zserio_writer)
        self._type_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneRightOfWayRegulation.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._other_lane_.write_packed(zserio_context.other_lane, zserio_writer)

        self._other_lane_range_.write_packed(zserio_context.other_lane_range, zserio_writer)

        self._type_.write_packed(zserio_context.type, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._other_lane_ = nds.lane.reference.types.lane_id.LaneId.ZserioPackingContext()
            self._other_lane_range_ = nds.lane.reference.types.lane_geometry_range.LaneGeometryRange.ZserioPackingContext()
            self._type_ = zserio.array.DeltaContext()

        @property
        def other_lane(self):
            return self._other_lane_

        @property
        def other_lane_range(self):
            return self._other_lane_range_

        @property
        def type(self):
            return self._type_
