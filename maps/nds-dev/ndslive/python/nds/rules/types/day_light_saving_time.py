# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.conditions.month_of_year
import nds.core.conditions.time_of_day
import nds.core.conditions.weekday_in_month
import nds.core.types.quarter_hour_time_offset
import nds.rules.types.time_zone_name

class DayLightSavingTime:
    def __init__(
            self,
            utc_offset_: nds.core.types.quarter_hour_time_offset.QuarterHourTimeOffset = nds.core.types.quarter_hour_time_offset.QuarterHourTimeOffset(),
            names_: typing.Optional[typing.List[nds.rules.types.time_zone_name.TimeZoneName]] = None,
            abbreviation_names_: typing.Optional[typing.List[nds.rules.types.time_zone_name.TimeZoneName]] = None,
            start_time_of_day_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None] = None,
            start_weekday_in_month_: typing.Union[nds.core.conditions.weekday_in_month.WeekdayInMonth, None] = None,
            start_month_of_year_: nds.core.conditions.month_of_year.MonthOfYear = nds.core.conditions.month_of_year.MonthOfYear(),
            end_time_of_day_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None] = None,
            end_weekday_in_month_: typing.Union[nds.core.conditions.weekday_in_month.WeekdayInMonth, None] = None,
            end_month_of_year_: nds.core.conditions.month_of_year.MonthOfYear = nds.core.conditions.month_of_year.MonthOfYear()) -> None:
        self._utc_offset_ = utc_offset_
        if names_ is None:
            self._names_ = None
        else:
            self._names_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_names()), names_, is_auto=True)
        if abbreviation_names_ is None:
            self._abbreviation_names_ = None
        else:
            self._abbreviation_names_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_abbreviation_names()), abbreviation_names_, is_auto=True)
        self._start_time_of_day_ = start_time_of_day_
        self._start_weekday_in_month_ = start_weekday_in_month_
        self._start_month_of_year_ = start_month_of_year_
        self._end_time_of_day_ = end_time_of_day_
        self._end_weekday_in_month_ = end_weekday_in_month_
        self._end_month_of_year_ = end_month_of_year_

    @classmethod
    def from_reader(
            cls: typing.Type['DayLightSavingTime'],
            zserio_reader: zserio.BitStreamReader) -> 'DayLightSavingTime':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DayLightSavingTime'],
            zserio_context: DayLightSavingTime.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DayLightSavingTime':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DayLightSavingTime):
            return ((self._utc_offset_ == other._utc_offset_) and
                    (not other.is_names_used() if not self.is_names_used() else (self._names_ == other._names_)) and
                    (not other.is_abbreviation_names_used() if not self.is_abbreviation_names_used() else (self._abbreviation_names_ == other._abbreviation_names_)) and
                    (self._start_time_of_day_ == other._start_time_of_day_) and
                    (self._start_weekday_in_month_ == other._start_weekday_in_month_) and
                    (self._start_month_of_year_ == other._start_month_of_year_) and
                    (self._end_time_of_day_ == other._end_time_of_day_) and
                    (self._end_weekday_in_month_ == other._end_weekday_in_month_) and
                    (self._end_month_of_year_ == other._end_month_of_year_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._utc_offset_)
        if self.is_names_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._names_)
        if self.is_abbreviation_names_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._abbreviation_names_)
        result = zserio.hashcode.calc_hashcode_object(result, self._start_time_of_day_)
        result = zserio.hashcode.calc_hashcode_object(result, self._start_weekday_in_month_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._start_month_of_year_)
        result = zserio.hashcode.calc_hashcode_object(result, self._end_time_of_day_)
        result = zserio.hashcode.calc_hashcode_object(result, self._end_weekday_in_month_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._end_month_of_year_)

        return result

    @property
    def utc_offset(self) -> nds.core.types.quarter_hour_time_offset.QuarterHourTimeOffset:
        return self._utc_offset_

    @utc_offset.setter
    def utc_offset(self, utc_offset_: nds.core.types.quarter_hour_time_offset.QuarterHourTimeOffset) -> None:
        self._utc_offset_ = utc_offset_

    @property
    def names(self) -> typing.Optional[typing.List[nds.rules.types.time_zone_name.TimeZoneName]]:
        return None if self._names_ is None else self._names_.raw_array

    @names.setter
    def names(self, names_: typing.Optional[typing.List[nds.rules.types.time_zone_name.TimeZoneName]]) -> None:
        if names_ is None:
            self._names_ = None
        else:
            self._names_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_names()), names_, is_auto=True)

    def is_names_used(self) -> bool:
        return self.is_names_set()

    def is_names_set(self) -> bool:
        return not self._names_ is None

    def reset_names(self) -> None:
        self._names_ = None

    @property
    def abbreviation_names(self) -> typing.Optional[typing.List[nds.rules.types.time_zone_name.TimeZoneName]]:
        return None if self._abbreviation_names_ is None else self._abbreviation_names_.raw_array

    @abbreviation_names.setter
    def abbreviation_names(self, abbreviation_names_: typing.Optional[typing.List[nds.rules.types.time_zone_name.TimeZoneName]]) -> None:
        if abbreviation_names_ is None:
            self._abbreviation_names_ = None
        else:
            self._abbreviation_names_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_abbreviation_names()), abbreviation_names_, is_auto=True)

    def is_abbreviation_names_used(self) -> bool:
        return self.is_abbreviation_names_set()

    def is_abbreviation_names_set(self) -> bool:
        return not self._abbreviation_names_ is None

    def reset_abbreviation_names(self) -> None:
        self._abbreviation_names_ = None

    @property
    def start_time_of_day(self) -> typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]:
        return self._start_time_of_day_

    @start_time_of_day.setter
    def start_time_of_day(self, start_time_of_day_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]) -> None:
        self._start_time_of_day_ = start_time_of_day_

    @property
    def start_weekday_in_month(self) -> typing.Union[nds.core.conditions.weekday_in_month.WeekdayInMonth, None]:
        return self._start_weekday_in_month_

    @start_weekday_in_month.setter
    def start_weekday_in_month(self, start_weekday_in_month_: typing.Union[nds.core.conditions.weekday_in_month.WeekdayInMonth, None]) -> None:
        self._start_weekday_in_month_ = start_weekday_in_month_

    @property
    def start_month_of_year(self) -> nds.core.conditions.month_of_year.MonthOfYear:
        return self._start_month_of_year_

    @start_month_of_year.setter
    def start_month_of_year(self, start_month_of_year_: nds.core.conditions.month_of_year.MonthOfYear) -> None:
        self._start_month_of_year_ = start_month_of_year_

    @property
    def end_time_of_day(self) -> typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]:
        return self._end_time_of_day_

    @end_time_of_day.setter
    def end_time_of_day(self, end_time_of_day_: typing.Union[nds.core.conditions.time_of_day.TimeOfDay, None]) -> None:
        self._end_time_of_day_ = end_time_of_day_

    @property
    def end_weekday_in_month(self) -> typing.Union[nds.core.conditions.weekday_in_month.WeekdayInMonth, None]:
        return self._end_weekday_in_month_

    @end_weekday_in_month.setter
    def end_weekday_in_month(self, end_weekday_in_month_: typing.Union[nds.core.conditions.weekday_in_month.WeekdayInMonth, None]) -> None:
        self._end_weekday_in_month_ = end_weekday_in_month_

    @property
    def end_month_of_year(self) -> nds.core.conditions.month_of_year.MonthOfYear:
        return self._end_month_of_year_

    @end_month_of_year.setter
    def end_month_of_year(self, end_month_of_year_: nds.core.conditions.month_of_year.MonthOfYear) -> None:
        self._end_month_of_year_ = end_month_of_year_

    def init_packing_context(self, zserio_context: DayLightSavingTime.ZserioPackingContext) -> None:
        zserio_context.utc_offset.init(zserio.array.SignedBitFieldArrayTraits(8), self._utc_offset_)
        self._start_time_of_day_.init_packing_context(zserio_context.start_time_of_day)
        self._start_weekday_in_month_.init_packing_context(zserio_context.start_weekday_in_month)
        zserio_context.start_month_of_year.init(zserio.array.BitFieldArrayTraits(4), self._start_month_of_year_)
        self._end_time_of_day_.init_packing_context(zserio_context.end_time_of_day)
        self._end_weekday_in_month_.init_packing_context(zserio_context.end_weekday_in_month)
        zserio_context.end_month_of_year.init(zserio.array.BitFieldArrayTraits(4), self._end_month_of_year_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += 1
        if self.is_names_used():
            end_bitposition += self._names_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_abbreviation_names_used():
            end_bitposition += self._abbreviation_names_.bitsizeof(end_bitposition)
        end_bitposition += self._start_time_of_day_.bitsizeof(end_bitposition)
        end_bitposition += self._start_weekday_in_month_.bitsizeof(end_bitposition)
        end_bitposition += 4
        end_bitposition += self._end_time_of_day_.bitsizeof(end_bitposition)
        end_bitposition += self._end_weekday_in_month_.bitsizeof(end_bitposition)
        end_bitposition += 4

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DayLightSavingTime.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.utc_offset.bitsizeof(zserio.array.SignedBitFieldArrayTraits(8), self._utc_offset_)
        end_bitposition += 1
        if self.is_names_used():
            end_bitposition += self._names_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        if self.is_abbreviation_names_used():
            end_bitposition += self._abbreviation_names_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._start_time_of_day_.bitsizeof_packed(zserio_context.start_time_of_day, end_bitposition)
        end_bitposition += self._start_weekday_in_month_.bitsizeof_packed(zserio_context.start_weekday_in_month, end_bitposition)
        end_bitposition += zserio_context.start_month_of_year.bitsizeof(zserio.array.BitFieldArrayTraits(4), self._start_month_of_year_)
        end_bitposition += self._end_time_of_day_.bitsizeof_packed(zserio_context.end_time_of_day, end_bitposition)
        end_bitposition += self._end_weekday_in_month_.bitsizeof_packed(zserio_context.end_weekday_in_month, end_bitposition)
        end_bitposition += zserio_context.end_month_of_year.bitsizeof(zserio.array.BitFieldArrayTraits(4), self._end_month_of_year_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += 1
        if self.is_names_used():
            end_bitposition = self._names_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_abbreviation_names_used():
            end_bitposition = self._abbreviation_names_.initialize_offsets(end_bitposition)
        end_bitposition = self._start_time_of_day_.initialize_offsets(end_bitposition)
        end_bitposition = self._start_weekday_in_month_.initialize_offsets(end_bitposition)
        end_bitposition += 4
        end_bitposition = self._end_time_of_day_.initialize_offsets(end_bitposition)
        end_bitposition = self._end_weekday_in_month_.initialize_offsets(end_bitposition)
        end_bitposition += 4

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DayLightSavingTime.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.utc_offset.bitsizeof(zserio.array.SignedBitFieldArrayTraits(8), self._utc_offset_)
        end_bitposition += 1
        if self.is_names_used():
            end_bitposition = self._names_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        if self.is_abbreviation_names_used():
            end_bitposition = self._abbreviation_names_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._start_time_of_day_.initialize_offsets_packed(zserio_context.start_time_of_day, end_bitposition)
        end_bitposition = self._start_weekday_in_month_.initialize_offsets_packed(zserio_context.start_weekday_in_month, end_bitposition)
        end_bitposition += zserio_context.start_month_of_year.bitsizeof(zserio.array.BitFieldArrayTraits(4), self._start_month_of_year_)
        end_bitposition = self._end_time_of_day_.initialize_offsets_packed(zserio_context.end_time_of_day, end_bitposition)
        end_bitposition = self._end_weekday_in_month_.initialize_offsets_packed(zserio_context.end_weekday_in_month, end_bitposition)
        end_bitposition += zserio_context.end_month_of_year.bitsizeof(zserio.array.BitFieldArrayTraits(4), self._end_month_of_year_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._utc_offset_ = zserio_reader.read_signed_bits(8)
        if zserio_reader.read_bool():
            self._names_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_names()), zserio_reader, is_auto=True)
        else:
            self._names_ = None
        if zserio_reader.read_bool():
            self._abbreviation_names_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_abbreviation_names()), zserio_reader, is_auto=True)
        else:
            self._abbreviation_names_ = None
        self._start_time_of_day_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader(zserio_reader)
        self._start_weekday_in_month_ = nds.core.conditions.weekday_in_month.WeekdayInMonth.from_reader(zserio_reader)
        self._start_month_of_year_ = zserio_reader.read_bits(4)
        self._end_time_of_day_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader(zserio_reader)
        self._end_weekday_in_month_ = nds.core.conditions.weekday_in_month.WeekdayInMonth.from_reader(zserio_reader)
        self._end_month_of_year_ = zserio_reader.read_bits(4)

    def read_packed(self, zserio_context: DayLightSavingTime.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._utc_offset_ = zserio_context.utc_offset.read(zserio.array.SignedBitFieldArrayTraits(8), zserio_reader)

        if zserio_reader.read_bool():
            self._names_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_names()), zserio_reader, is_auto=True)
        else:
            self._names_ = None

        if zserio_reader.read_bool():
            self._abbreviation_names_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_abbreviation_names()), zserio_reader, is_auto=True)
        else:
            self._abbreviation_names_ = None

        self._start_time_of_day_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader_packed(zserio_context.start_time_of_day, zserio_reader)

        self._start_weekday_in_month_ = nds.core.conditions.weekday_in_month.WeekdayInMonth.from_reader_packed(zserio_context.start_weekday_in_month, zserio_reader)

        self._start_month_of_year_ = zserio_context.start_month_of_year.read(zserio.array.BitFieldArrayTraits(4), zserio_reader)

        self._end_time_of_day_ = nds.core.conditions.time_of_day.TimeOfDay.from_reader_packed(zserio_context.end_time_of_day, zserio_reader)

        self._end_weekday_in_month_ = nds.core.conditions.weekday_in_month.WeekdayInMonth.from_reader_packed(zserio_context.end_weekday_in_month, zserio_reader)

        self._end_month_of_year_ = zserio_context.end_month_of_year.read(zserio.array.BitFieldArrayTraits(4), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_signed_bits(self._utc_offset_, 8)
        if self.is_names_used():
            zserio_writer.write_bool(True)
            self._names_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_abbreviation_names_used():
            zserio_writer.write_bool(True)
            self._abbreviation_names_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        self._start_time_of_day_.write(zserio_writer)
        self._start_weekday_in_month_.write(zserio_writer)
        zserio_writer.write_bits(self._start_month_of_year_, 4)
        self._end_time_of_day_.write(zserio_writer)
        self._end_weekday_in_month_.write(zserio_writer)
        zserio_writer.write_bits(self._end_month_of_year_, 4)

    def write_packed(self, zserio_context: DayLightSavingTime.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.utc_offset.write(zserio.array.SignedBitFieldArrayTraits(8), zserio_writer, self._utc_offset_)

        if self.is_names_used():
            zserio_writer.write_bool(True)
            self._names_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_abbreviation_names_used():
            zserio_writer.write_bool(True)
            self._abbreviation_names_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        self._start_time_of_day_.write_packed(zserio_context.start_time_of_day, zserio_writer)

        self._start_weekday_in_month_.write_packed(zserio_context.start_weekday_in_month, zserio_writer)

        zserio_context.start_month_of_year.write(zserio.array.BitFieldArrayTraits(4), zserio_writer, self._start_month_of_year_)

        self._end_time_of_day_.write_packed(zserio_context.end_time_of_day, zserio_writer)

        self._end_weekday_in_month_.write_packed(zserio_context.end_weekday_in_month, zserio_writer)

        zserio_context.end_month_of_year.write(zserio.array.BitFieldArrayTraits(4), zserio_writer, self._end_month_of_year_)

    class ZserioPackingContext:
        def __init__(self):
            self._utc_offset_ = zserio.array.DeltaContext()
            self._start_time_of_day_ = nds.core.conditions.time_of_day.TimeOfDay.ZserioPackingContext()
            self._start_weekday_in_month_ = nds.core.conditions.weekday_in_month.WeekdayInMonth.ZserioPackingContext()
            self._start_month_of_year_ = zserio.array.DeltaContext()
            self._end_time_of_day_ = nds.core.conditions.time_of_day.TimeOfDay.ZserioPackingContext()
            self._end_weekday_in_month_ = nds.core.conditions.weekday_in_month.WeekdayInMonth.ZserioPackingContext()
            self._end_month_of_year_ = zserio.array.DeltaContext()

        @property
        def utc_offset(self):
            return self._utc_offset_

        @property
        def start_time_of_day(self):
            return self._start_time_of_day_

        @property
        def start_weekday_in_month(self):
            return self._start_weekday_in_month_

        @property
        def start_month_of_year(self):
            return self._start_month_of_year_

        @property
        def end_time_of_day(self):
            return self._end_time_of_day_

        @property
        def end_weekday_in_month(self):
            return self._end_weekday_in_month_

        @property
        def end_month_of_year(self):
            return self._end_month_of_year_

    class _ZserioElementFactory_names:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.rules.types.time_zone_name.TimeZoneName:
            del zserio_index
            return nds.rules.types.time_zone_name.TimeZoneName.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.rules.types.time_zone_name.TimeZoneName.ZserioPackingContext:
            return nds.rules.types.time_zone_name.TimeZoneName.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.rules.types.time_zone_name.TimeZoneName.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.rules.types.time_zone_name.TimeZoneName:
            del zserio_index
            return nds.rules.types.time_zone_name.TimeZoneName.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_abbreviation_names:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.rules.types.time_zone_name.TimeZoneName:
            del zserio_index
            return nds.rules.types.time_zone_name.TimeZoneName.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.rules.types.time_zone_name.TimeZoneName.ZserioPackingContext:
            return nds.rules.types.time_zone_name.TimeZoneName.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.rules.types.time_zone_name.TimeZoneName.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.rules.types.time_zone_name.TimeZoneName:
            del zserio_index
            return nds.rules.types.time_zone_name.TimeZoneName.from_reader_packed(zserio_context, zserio_reader)
