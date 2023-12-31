# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class DaysOfWeek:
    def __init__(
            self,
            is_sunday_: bool = bool(),
            is_monday_: bool = bool(),
            is_tuesday_: bool = bool(),
            is_wednesday_: bool = bool(),
            is_thursday_: bool = bool(),
            is_friday_: bool = bool(),
            is_saturday_: bool = bool(),
            is_inclusive_: bool = bool()) -> None:
        self._is_sunday_ = is_sunday_
        self._is_monday_ = is_monday_
        self._is_tuesday_ = is_tuesday_
        self._is_wednesday_ = is_wednesday_
        self._is_thursday_ = is_thursday_
        self._is_friday_ = is_friday_
        self._is_saturday_ = is_saturday_
        self._is_inclusive_ = is_inclusive_

    @classmethod
    def from_reader(
            cls: typing.Type['DaysOfWeek'],
            zserio_reader: zserio.BitStreamReader) -> 'DaysOfWeek':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DaysOfWeek):
            return ((self._is_sunday_ == other._is_sunday_) and
                    (self._is_monday_ == other._is_monday_) and
                    (self._is_tuesday_ == other._is_tuesday_) and
                    (self._is_wednesday_ == other._is_wednesday_) and
                    (self._is_thursday_ == other._is_thursday_) and
                    (self._is_friday_ == other._is_friday_) and
                    (self._is_saturday_ == other._is_saturday_) and
                    (self._is_inclusive_ == other._is_inclusive_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_sunday_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_monday_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_tuesday_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_wednesday_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_thursday_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_friday_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_saturday_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_inclusive_)

        return result

    @property
    def is_sunday(self) -> bool:
        return self._is_sunday_

    @is_sunday.setter
    def is_sunday(self, is_sunday_: bool) -> None:
        self._is_sunday_ = is_sunday_

    @property
    def is_monday(self) -> bool:
        return self._is_monday_

    @is_monday.setter
    def is_monday(self, is_monday_: bool) -> None:
        self._is_monday_ = is_monday_

    @property
    def is_tuesday(self) -> bool:
        return self._is_tuesday_

    @is_tuesday.setter
    def is_tuesday(self, is_tuesday_: bool) -> None:
        self._is_tuesday_ = is_tuesday_

    @property
    def is_wednesday(self) -> bool:
        return self._is_wednesday_

    @is_wednesday.setter
    def is_wednesday(self, is_wednesday_: bool) -> None:
        self._is_wednesday_ = is_wednesday_

    @property
    def is_thursday(self) -> bool:
        return self._is_thursday_

    @is_thursday.setter
    def is_thursday(self, is_thursday_: bool) -> None:
        self._is_thursday_ = is_thursday_

    @property
    def is_friday(self) -> bool:
        return self._is_friday_

    @is_friday.setter
    def is_friday(self, is_friday_: bool) -> None:
        self._is_friday_ = is_friday_

    @property
    def is_saturday(self) -> bool:
        return self._is_saturday_

    @is_saturday.setter
    def is_saturday(self, is_saturday_: bool) -> None:
        self._is_saturday_ = is_saturday_

    @property
    def is_inclusive(self) -> bool:
        return self._is_inclusive_

    @is_inclusive.setter
    def is_inclusive(self, is_inclusive_: bool) -> None:
        self._is_inclusive_ = is_inclusive_

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._is_sunday_ = zserio_reader.read_bool()
        self._is_monday_ = zserio_reader.read_bool()
        self._is_tuesday_ = zserio_reader.read_bool()
        self._is_wednesday_ = zserio_reader.read_bool()
        self._is_thursday_ = zserio_reader.read_bool()
        self._is_friday_ = zserio_reader.read_bool()
        self._is_saturday_ = zserio_reader.read_bool()
        self._is_inclusive_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._is_sunday_)
        zserio_writer.write_bool(self._is_monday_)
        zserio_writer.write_bool(self._is_tuesday_)
        zserio_writer.write_bool(self._is_wednesday_)
        zserio_writer.write_bool(self._is_thursday_)
        zserio_writer.write_bool(self._is_friday_)
        zserio_writer.write_bool(self._is_saturday_)
        zserio_writer.write_bool(self._is_inclusive_)
