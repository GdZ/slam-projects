# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.conditions.day_of_year
import nds.core.conditions.time_of_day

class TimeRangeOfYear:
    def __init__(
            self,
            start_day_: typing.Union[nds.core.conditions.day_of_year.DayOfYear, None] = None,
            start_time_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None] = None,
            end_day_: typing.Union[nds.core.conditions.day_of_year.DayOfYear, None] = None,
            end_time_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None] = None,
            is_inclusive_: bool = bool()) -> None:
        self._start_day_ = start_day_
        self._start_time_ = start_time_
        self._end_day_ = end_day_
        self._end_time_ = end_time_
        self._is_inclusive_ = is_inclusive_

    @classmethod
    def from_reader(
            cls: typing.Type['TimeRangeOfYear'],
            zserio_reader: zserio.BitStreamReader) -> 'TimeRangeOfYear':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TimeRangeOfYear'],
            zserio_context: TimeRangeOfYear.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TimeRangeOfYear':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TimeRangeOfYear):
            return ((self._start_day_ == other._start_day_) and
                    (self._start_time_ == other._start_time_) and
                    (self._end_day_ == other._end_day_) and
                    (self._end_time_ == other._end_time_) and
                    (self._is_inclusive_ == other._is_inclusive_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._start_day_)
        result = zserio.hashcode.calc_hashcode_object(result, self._start_time_)
        result = zserio.hashcode.calc_hashcode_object(result, self._end_day_)
        result = zserio.hashcode.calc_hashcode_object(result, self._end_time_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_inclusive_)

        return result

    @property
    def start_day(self) -> typing.Union[nds.core.conditions.day_of_year.DayOfYear, None]:
        return self._start_day_

    @start_day.setter
    def start_day(self, start_day_: typing.Union[nds.core.conditions.day_of_year.DayOfYear, None]) -> None:
        self._start_day_ = start_day_

    @property
    def start_time(self) -> typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]:
        return self._start_time_

    @start_time.setter
    def start_time(self, start_time_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]) -> None:
        self._start_time_ = start_time_

    @property
    def end_day(self) -> typing.Union[nds.core.conditions.day_of_year.DayOfYear, None]:
        return self._end_day_

    @end_day.setter
    def end_day(self, end_day_: typing.Union[nds.core.conditions.day_of_year.DayOfYear, None]) -> None:
        self._end_day_ = end_day_

    @property
    def end_time(self) -> typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]:
        return self._end_time_

    @end_time.setter
    def end_time(self, end_time_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]) -> None:
        self._end_time_ = end_time_

    @property
    def is_inclusive(self) -> bool:
        return self._is_inclusive_

    @is_inclusive.setter
    def is_inclusive(self, is_inclusive_: bool) -> None:
        self._is_inclusive_ = is_inclusive_

    def init_packing_context(self, zserio_context: TimeRangeOfYear.ZserioPackingContext) -> None:
        self._start_day_.init_packing_context(zserio_context.start_day)
        self._start_time_.init_packing_context(zserio_context.start_time)
        self._end_day_.init_packing_context(zserio_context.end_day)
        self._end_time_.init_packing_context(zserio_context.end_time)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_day_.bitsizeof(end_bitposition)
        end_bitposition += self._start_time_.bitsizeof(end_bitposition)
        end_bitposition += self._end_day_.bitsizeof(end_bitposition)
        end_bitposition += self._end_time_.bitsizeof(end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TimeRangeOfYear.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_day_.bitsizeof_packed(zserio_context.start_day, end_bitposition)
        end_bitposition += self._start_time_.bitsizeof_packed(zserio_context.start_time, end_bitposition)
        end_bitposition += self._end_day_.bitsizeof_packed(zserio_context.end_day, end_bitposition)
        end_bitposition += self._end_time_.bitsizeof_packed(zserio_context.end_time, end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_day_.initialize_offsets(end_bitposition)
        end_bitposition = self._start_time_.initialize_offsets(end_bitposition)
        end_bitposition = self._end_day_.initialize_offsets(end_bitposition)
        end_bitposition = self._end_time_.initialize_offsets(end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TimeRangeOfYear.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_day_.initialize_offsets_packed(zserio_context.start_day, end_bitposition)
        end_bitposition = self._start_time_.initialize_offsets_packed(zserio_context.start_time, end_bitposition)
        end_bitposition = self._end_day_.initialize_offsets_packed(zserio_context.end_day, end_bitposition)
        end_bitposition = self._end_time_.initialize_offsets_packed(zserio_context.end_time, end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_day_ = nds.core.conditions.day_of_year.DayOfYear.from_reader(zserio_reader)
        self._start_time_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader(zserio_reader)
        self._end_day_ = nds.core.conditions.day_of_year.DayOfYear.from_reader(zserio_reader)
        self._end_time_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader(zserio_reader)
        self._is_inclusive_ = zserio_reader.read_bool()

    def read_packed(self, zserio_context: TimeRangeOfYear.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_day_ = nds.core.conditions.day_of_year.DayOfYear.from_reader_packed(zserio_context.start_day, zserio_reader)

        self._start_time_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader_packed(zserio_context.start_time, zserio_reader)

        self._end_day_ = nds.core.conditions.day_of_year.DayOfYear.from_reader_packed(zserio_context.end_day, zserio_reader)

        self._end_time_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader_packed(zserio_context.end_time, zserio_reader)

        self._is_inclusive_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._start_day_.write(zserio_writer)
        self._start_time_.write(zserio_writer)
        self._end_day_.write(zserio_writer)
        self._end_time_.write(zserio_writer)
        zserio_writer.write_bool(self._is_inclusive_)

    def write_packed(self, zserio_context: TimeRangeOfYear.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._start_day_.write_packed(zserio_context.start_day, zserio_writer)

        self._start_time_.write_packed(zserio_context.start_time, zserio_writer)

        self._end_day_.write_packed(zserio_context.end_day, zserio_writer)

        self._end_time_.write_packed(zserio_context.end_time, zserio_writer)

        zserio_writer.write_bool(self._is_inclusive_)

    class ZserioPackingContext:
        def __init__(self):
            self._start_day_ = nds.core.conditions.day_of_year.DayOfYear.ZserioPackingContext()
            self._start_time_ = nds.core.conditions.time_of_day.TimeOfDay.ZserioPackingContext()
            self._end_day_ = nds.core.conditions.day_of_year.DayOfYear.ZserioPackingContext()
            self._end_time_ = nds.core.conditions.time_of_day.TimeOfDay.ZserioPackingContext()

        @property
        def start_day(self):
            return self._start_day_

        @property
        def start_time(self):
            return self._start_time_

        @property
        def end_day(self):
            return self._end_day_

        @property
        def end_time(self):
            return self._end_time_
