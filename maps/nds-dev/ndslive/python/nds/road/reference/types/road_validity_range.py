# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.road.reference.types.road_validity_position

class RoadValidityRange:
    def __init__(
            self,
            shift_: nds.core.geometry.coord_shift.CoordShift,
            start_: typing.Union[nds.road.reference.types.road_validity_position.RoadValidityPosition, None] = None,
            end_: typing.Union[nds.road.reference.types.road_validity_position.RoadValidityPosition, None] = None) -> None:
        self._shift_ = shift_
        self._start_ = start_
        self._end_ = end_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadValidityRange'],
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoadValidityRange':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadValidityRange'],
            zserio_context: RoadValidityRange.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoadValidityRange':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadValidityRange):
            return (self._shift_ == other._shift_ and
                    (self._start_ == other._start_) and
                    (self._end_ == other._end_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        result = zserio.hashcode.calc_hashcode_object(result, self._start_)
        result = zserio.hashcode.calc_hashcode_object(result, self._end_)

        return result

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @property
    def start(self) -> typing.Union[nds.road.reference.types.road_validity_position.RoadValidityPosition, None]:
        return self._start_

    @start.setter
    def start(self, start_: typing.Union[nds.road.reference.types.road_validity_position.RoadValidityPosition, None]) -> None:
        self._start_ = start_

    @property
    def end(self) -> typing.Union[nds.road.reference.types.road_validity_position.RoadValidityPosition, None]:
        return self._end_

    @end.setter
    def end(self, end_: typing.Union[nds.road.reference.types.road_validity_position.RoadValidityPosition, None]) -> None:
        self._end_ = end_

    def init_packing_context(self, zserio_context: RoadValidityRange.ZserioPackingContext) -> None:
        self._start_.init_packing_context(zserio_context.start)
        self._end_.init_packing_context(zserio_context.end)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_.bitsizeof(end_bitposition)
        end_bitposition += self._end_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadValidityRange.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_.bitsizeof_packed(zserio_context.start, end_bitposition)
        end_bitposition += self._end_.bitsizeof_packed(zserio_context.end, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_.initialize_offsets(end_bitposition)
        end_bitposition = self._end_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadValidityRange.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_.initialize_offsets_packed(zserio_context.start, end_bitposition)
        end_bitposition = self._end_.initialize_offsets_packed(zserio_context.end, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_ = nds.road.reference.types.road_validity_position.RoadValidityPosition.from_reader(zserio_reader, self._shift_)
        self._end_ = nds.road.reference.types.road_validity_position.RoadValidityPosition.from_reader(zserio_reader, self._shift_)

    def read_packed(self, zserio_context: RoadValidityRange.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_ = nds.road.reference.types.road_validity_position.RoadValidityPosition.from_reader_packed(zserio_context.start, zserio_reader, self._shift_)

        self._end_ = nds.road.reference.types.road_validity_position.RoadValidityPosition.from_reader_packed(zserio_context.end, zserio_reader, self._shift_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._start_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadValidityRange.start: "
                                                f"{self._start_.shift} != {self._shift_}!")
        self._start_.write(zserio_writer)

        # check parameters
        if self._end_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadValidityRange.end: "
                                                f"{self._end_.shift} != {self._shift_}!")
        self._end_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadValidityRange.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._start_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadValidityRange.start: "
                                                f"{self._start_.shift} != {self._shift_}!")
        self._start_.write_packed(zserio_context.start, zserio_writer)

        # check parameters
        if self._end_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadValidityRange.end: "
                                                f"{self._end_.shift} != {self._shift_}!")
        self._end_.write_packed(zserio_context.end, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._start_ = nds.road.reference.types.road_validity_position.RoadValidityPosition.ZserioPackingContext()
            self._end_ = nds.road.reference.types.road_validity_position.RoadValidityPosition.ZserioPackingContext()

        @property
        def start(self):
            return self._start_

        @property
        def end(self):
            return self._end_
