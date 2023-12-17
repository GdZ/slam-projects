# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.conditions.time_of_week

class TimeRangeOfWeek:
    def __init__(
            self,
            start_time_: nds.core.conditions.time_of_week.TimeOfWeek = nds.core.conditions.time_of_week.TimeOfWeek(),
            end_time_: nds.core.conditions.time_of_week.TimeOfWeek = nds.core.conditions.time_of_week.TimeOfWeek()) -> None:
        self._start_time_ = start_time_
        self._end_time_ = end_time_

    @classmethod
    def from_reader(
            cls: typing.Type['TimeRangeOfWeek'],
            zserio_reader: zserio.BitStreamReader) -> 'TimeRangeOfWeek':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TimeRangeOfWeek'],
            zserio_context: TimeRangeOfWeek.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TimeRangeOfWeek':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TimeRangeOfWeek):
            return ((self._start_time_ == other._start_time_) and
                    (self._end_time_ == other._end_time_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._start_time_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._end_time_)

        return result

    @property
    def start_time(self) -> nds.core.conditions.time_of_week.TimeOfWeek:
        return self._start_time_

    @start_time.setter
    def start_time(self, start_time_: nds.core.conditions.time_of_week.TimeOfWeek) -> None:
        self._start_time_ = start_time_

    @property
    def end_time(self) -> nds.core.conditions.time_of_week.TimeOfWeek:
        return self._end_time_

    @end_time.setter
    def end_time(self, end_time_: nds.core.conditions.time_of_week.TimeOfWeek) -> None:
        self._end_time_ = end_time_

    def init_packing_context(self, zserio_context: TimeRangeOfWeek.ZserioPackingContext) -> None:
        zserio_context.start_time.init(zserio.array.BitFieldArrayTraits(14), self._start_time_)
        zserio_context.end_time.init(zserio.array.BitFieldArrayTraits(14), self._end_time_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 14
        end_bitposition += 14

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TimeRangeOfWeek.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.start_time.bitsizeof(zserio.array.BitFieldArrayTraits(14), self._start_time_)
        end_bitposition += zserio_context.end_time.bitsizeof(zserio.array.BitFieldArrayTraits(14), self._end_time_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 14
        end_bitposition += 14

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TimeRangeOfWeek.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.start_time.bitsizeof(zserio.array.BitFieldArrayTraits(14), self._start_time_)
        end_bitposition += zserio_context.end_time.bitsizeof(zserio.array.BitFieldArrayTraits(14), self._end_time_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_time_ = zserio_reader.read_bits(14)
        self._end_time_ = zserio_reader.read_bits(14)

    def read_packed(self, zserio_context: TimeRangeOfWeek.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_time_ = zserio_context.start_time.read(zserio.array.BitFieldArrayTraits(14), zserio_reader)

        self._end_time_ = zserio_context.end_time.read(zserio.array.BitFieldArrayTraits(14), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._start_time_, 14)
        zserio_writer.write_bits(self._end_time_, 14)

    def write_packed(self, zserio_context: TimeRangeOfWeek.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.start_time.write(zserio.array.BitFieldArrayTraits(14), zserio_writer, self._start_time_)

        zserio_context.end_time.write(zserio.array.BitFieldArrayTraits(14), zserio_writer, self._end_time_)

    class ZserioPackingContext:
        def __init__(self):
            self._start_time_ = zserio.array.DeltaContext()
            self._end_time_ = zserio.array.DeltaContext()

        @property
        def start_time(self):
            return self._start_time_

        @property
        def end_time(self):
            return self._end_time_