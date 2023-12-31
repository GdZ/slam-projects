# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class MonthsOfYear:
    def __init__(
            self,
            january_: bool = bool(),
            february_: bool = bool(),
            march_: bool = bool(),
            april_: bool = bool(),
            may_: bool = bool(),
            june_: bool = bool(),
            july_: bool = bool(),
            august_: bool = bool(),
            september_: bool = bool(),
            october_: bool = bool(),
            november_: bool = bool(),
            december_: bool = bool(),
            is_inclusive_: bool = bool()) -> None:
        self._january_ = january_
        self._february_ = february_
        self._march_ = march_
        self._april_ = april_
        self._may_ = may_
        self._june_ = june_
        self._july_ = july_
        self._august_ = august_
        self._september_ = september_
        self._october_ = october_
        self._november_ = november_
        self._december_ = december_
        self._is_inclusive_ = is_inclusive_

    @classmethod
    def from_reader(
            cls: typing.Type['MonthsOfYear'],
            zserio_reader: zserio.BitStreamReader) -> 'MonthsOfYear':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, MonthsOfYear):
            return ((self._january_ == other._january_) and
                    (self._february_ == other._february_) and
                    (self._march_ == other._march_) and
                    (self._april_ == other._april_) and
                    (self._may_ == other._may_) and
                    (self._june_ == other._june_) and
                    (self._july_ == other._july_) and
                    (self._august_ == other._august_) and
                    (self._september_ == other._september_) and
                    (self._october_ == other._october_) and
                    (self._november_ == other._november_) and
                    (self._december_ == other._december_) and
                    (self._is_inclusive_ == other._is_inclusive_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._january_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._february_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._march_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._april_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._may_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._june_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._july_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._august_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._september_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._october_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._november_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._december_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_inclusive_)

        return result

    @property
    def january(self) -> bool:
        return self._january_

    @january.setter
    def january(self, january_: bool) -> None:
        self._january_ = january_

    @property
    def february(self) -> bool:
        return self._february_

    @february.setter
    def february(self, february_: bool) -> None:
        self._february_ = february_

    @property
    def march(self) -> bool:
        return self._march_

    @march.setter
    def march(self, march_: bool) -> None:
        self._march_ = march_

    @property
    def april(self) -> bool:
        return self._april_

    @april.setter
    def april(self, april_: bool) -> None:
        self._april_ = april_

    @property
    def may(self) -> bool:
        return self._may_

    @may.setter
    def may(self, may_: bool) -> None:
        self._may_ = may_

    @property
    def june(self) -> bool:
        return self._june_

    @june.setter
    def june(self, june_: bool) -> None:
        self._june_ = june_

    @property
    def july(self) -> bool:
        return self._july_

    @july.setter
    def july(self, july_: bool) -> None:
        self._july_ = july_

    @property
    def august(self) -> bool:
        return self._august_

    @august.setter
    def august(self, august_: bool) -> None:
        self._august_ = august_

    @property
    def september(self) -> bool:
        return self._september_

    @september.setter
    def september(self, september_: bool) -> None:
        self._september_ = september_

    @property
    def october(self) -> bool:
        return self._october_

    @october.setter
    def october(self, october_: bool) -> None:
        self._october_ = october_

    @property
    def november(self) -> bool:
        return self._november_

    @november.setter
    def november(self, november_: bool) -> None:
        self._november_ = november_

    @property
    def december(self) -> bool:
        return self._december_

    @december.setter
    def december(self, december_: bool) -> None:
        self._december_ = december_

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
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._january_ = zserio_reader.read_bool()
        self._february_ = zserio_reader.read_bool()
        self._march_ = zserio_reader.read_bool()
        self._april_ = zserio_reader.read_bool()
        self._may_ = zserio_reader.read_bool()
        self._june_ = zserio_reader.read_bool()
        self._july_ = zserio_reader.read_bool()
        self._august_ = zserio_reader.read_bool()
        self._september_ = zserio_reader.read_bool()
        self._october_ = zserio_reader.read_bool()
        self._november_ = zserio_reader.read_bool()
        self._december_ = zserio_reader.read_bool()
        self._is_inclusive_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._january_)
        zserio_writer.write_bool(self._february_)
        zserio_writer.write_bool(self._march_)
        zserio_writer.write_bool(self._april_)
        zserio_writer.write_bool(self._may_)
        zserio_writer.write_bool(self._june_)
        zserio_writer.write_bool(self._july_)
        zserio_writer.write_bool(self._august_)
        zserio_writer.write_bool(self._september_)
        zserio_writer.write_bool(self._october_)
        zserio_writer.write_bool(self._november_)
        zserio_writer.write_bool(self._december_)
        zserio_writer.write_bool(self._is_inclusive_)
