# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.reference.types.lane_validity_position

class LaneValidityRange:
    def __init__(
            self,
            start_: typing.Union[nds.lane.reference.types.lane_validity_position.LaneValidityPosition, None] = None,
            end_: typing.Union[nds.lane.reference.types.lane_validity_position.LaneValidityPosition, None] = None) -> None:
        self._start_ = start_
        self._end_ = end_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneValidityRange'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneValidityRange':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneValidityRange'],
            zserio_context: LaneValidityRange.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneValidityRange':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneValidityRange):
            return ((self._start_ == other._start_) and
                    (self._end_ == other._end_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._start_)
        result = zserio.hashcode.calc_hashcode_object(result, self._end_)

        return result

    @property
    def start(self) -> typing.Union[nds.lane.reference.types.lane_validity_position.LaneValidityPosition, None]:
        return self._start_

    @start.setter
    def start(self, start_: typing.Union[nds.lane.reference.types.lane_validity_position.LaneValidityPosition, None]) -> None:
        self._start_ = start_

    @property
    def end(self) -> typing.Union[nds.lane.reference.types.lane_validity_position.LaneValidityPosition, None]:
        return self._end_

    @end.setter
    def end(self, end_: typing.Union[nds.lane.reference.types.lane_validity_position.LaneValidityPosition, None]) -> None:
        self._end_ = end_

    def init_packing_context(self, zserio_context: LaneValidityRange.ZserioPackingContext) -> None:
        self._start_.init_packing_context(zserio_context.start)
        self._end_.init_packing_context(zserio_context.end)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_.bitsizeof(end_bitposition)
        end_bitposition += self._end_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneValidityRange.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_.bitsizeof_packed(zserio_context.start, end_bitposition)
        end_bitposition += self._end_.bitsizeof_packed(zserio_context.end, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_.initialize_offsets(end_bitposition)
        end_bitposition = self._end_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneValidityRange.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_.initialize_offsets_packed(zserio_context.start, end_bitposition)
        end_bitposition = self._end_.initialize_offsets_packed(zserio_context.end, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_ = nds.lane.reference.types.lane_validity_position.LaneValidityPosition.from_reader(zserio_reader)
        self._end_ = nds.lane.reference.types.lane_validity_position.LaneValidityPosition.from_reader(zserio_reader)

    def read_packed(self, zserio_context: LaneValidityRange.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_ = nds.lane.reference.types.lane_validity_position.LaneValidityPosition.from_reader_packed(zserio_context.start, zserio_reader)

        self._end_ = nds.lane.reference.types.lane_validity_position.LaneValidityPosition.from_reader_packed(zserio_context.end, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._start_.write(zserio_writer)
        self._end_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneValidityRange.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._start_.write_packed(zserio_context.start, zserio_writer)

        self._end_.write_packed(zserio_context.end, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._start_ = nds.lane.reference.types.lane_validity_position.LaneValidityPosition.ZserioPackingContext()
            self._end_ = nds.lane.reference.types.lane_validity_position.LaneValidityPosition.ZserioPackingContext()

        @property
        def start(self):
            return self._start_

        @property
        def end(self):
            return self._end_
