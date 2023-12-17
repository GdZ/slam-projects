# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class DaysOfMonth:
    def __init__(
            self,
            is_day1_: bool = bool(),
            is_day2_: bool = bool(),
            is_day3_: bool = bool(),
            is_day4_: bool = bool(),
            is_day5_: bool = bool(),
            is_day6_: bool = bool(),
            is_day7_: bool = bool(),
            is_day8_: bool = bool(),
            is_day9_: bool = bool(),
            is_day10_: bool = bool(),
            is_day11_: bool = bool(),
            is_day12_: bool = bool(),
            is_day13_: bool = bool(),
            is_day14_: bool = bool(),
            is_day15_: bool = bool(),
            is_day16_: bool = bool(),
            is_day17_: bool = bool(),
            is_day18_: bool = bool(),
            is_day19_: bool = bool(),
            is_day20_: bool = bool(),
            is_day21_: bool = bool(),
            is_day22_: bool = bool(),
            is_day23_: bool = bool(),
            is_day24_: bool = bool(),
            is_day25_: bool = bool(),
            is_day26_: bool = bool(),
            is_day27_: bool = bool(),
            is_day28_: bool = bool(),
            is_day29_: bool = bool(),
            is_day30_: bool = bool(),
            is_day31_: bool = bool(),
            is_inclusive_: bool = bool()) -> None:
        self._is_day1_ = is_day1_
        self._is_day2_ = is_day2_
        self._is_day3_ = is_day3_
        self._is_day4_ = is_day4_
        self._is_day5_ = is_day5_
        self._is_day6_ = is_day6_
        self._is_day7_ = is_day7_
        self._is_day8_ = is_day8_
        self._is_day9_ = is_day9_
        self._is_day10_ = is_day10_
        self._is_day11_ = is_day11_
        self._is_day12_ = is_day12_
        self._is_day13_ = is_day13_
        self._is_day14_ = is_day14_
        self._is_day15_ = is_day15_
        self._is_day16_ = is_day16_
        self._is_day17_ = is_day17_
        self._is_day18_ = is_day18_
        self._is_day19_ = is_day19_
        self._is_day20_ = is_day20_
        self._is_day21_ = is_day21_
        self._is_day22_ = is_day22_
        self._is_day23_ = is_day23_
        self._is_day24_ = is_day24_
        self._is_day25_ = is_day25_
        self._is_day26_ = is_day26_
        self._is_day27_ = is_day27_
        self._is_day28_ = is_day28_
        self._is_day29_ = is_day29_
        self._is_day30_ = is_day30_
        self._is_day31_ = is_day31_
        self._is_inclusive_ = is_inclusive_

    @classmethod
    def from_reader(
            cls: typing.Type['DaysOfMonth'],
            zserio_reader: zserio.BitStreamReader) -> 'DaysOfMonth':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DaysOfMonth):
            return ((self._is_day1_ == other._is_day1_) and
                    (self._is_day2_ == other._is_day2_) and
                    (self._is_day3_ == other._is_day3_) and
                    (self._is_day4_ == other._is_day4_) and
                    (self._is_day5_ == other._is_day5_) and
                    (self._is_day6_ == other._is_day6_) and
                    (self._is_day7_ == other._is_day7_) and
                    (self._is_day8_ == other._is_day8_) and
                    (self._is_day9_ == other._is_day9_) and
                    (self._is_day10_ == other._is_day10_) and
                    (self._is_day11_ == other._is_day11_) and
                    (self._is_day12_ == other._is_day12_) and
                    (self._is_day13_ == other._is_day13_) and
                    (self._is_day14_ == other._is_day14_) and
                    (self._is_day15_ == other._is_day15_) and
                    (self._is_day16_ == other._is_day16_) and
                    (self._is_day17_ == other._is_day17_) and
                    (self._is_day18_ == other._is_day18_) and
                    (self._is_day19_ == other._is_day19_) and
                    (self._is_day20_ == other._is_day20_) and
                    (self._is_day21_ == other._is_day21_) and
                    (self._is_day22_ == other._is_day22_) and
                    (self._is_day23_ == other._is_day23_) and
                    (self._is_day24_ == other._is_day24_) and
                    (self._is_day25_ == other._is_day25_) and
                    (self._is_day26_ == other._is_day26_) and
                    (self._is_day27_ == other._is_day27_) and
                    (self._is_day28_ == other._is_day28_) and
                    (self._is_day29_ == other._is_day29_) and
                    (self._is_day30_ == other._is_day30_) and
                    (self._is_day31_ == other._is_day31_) and
                    (self._is_inclusive_ == other._is_inclusive_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day1_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day2_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day3_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day4_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day5_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day6_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day7_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day8_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day9_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day10_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day11_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day12_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day13_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day14_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day15_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day16_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day17_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day18_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day19_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day20_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day21_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day22_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day23_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day24_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day25_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day26_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day27_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day28_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day29_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day30_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_day31_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_inclusive_)

        return result

    @property
    def is_day1(self) -> bool:
        return self._is_day1_

    @is_day1.setter
    def is_day1(self, is_day1_: bool) -> None:
        self._is_day1_ = is_day1_

    @property
    def is_day2(self) -> bool:
        return self._is_day2_

    @is_day2.setter
    def is_day2(self, is_day2_: bool) -> None:
        self._is_day2_ = is_day2_

    @property
    def is_day3(self) -> bool:
        return self._is_day3_

    @is_day3.setter
    def is_day3(self, is_day3_: bool) -> None:
        self._is_day3_ = is_day3_

    @property
    def is_day4(self) -> bool:
        return self._is_day4_

    @is_day4.setter
    def is_day4(self, is_day4_: bool) -> None:
        self._is_day4_ = is_day4_

    @property
    def is_day5(self) -> bool:
        return self._is_day5_

    @is_day5.setter
    def is_day5(self, is_day5_: bool) -> None:
        self._is_day5_ = is_day5_

    @property
    def is_day6(self) -> bool:
        return self._is_day6_

    @is_day6.setter
    def is_day6(self, is_day6_: bool) -> None:
        self._is_day6_ = is_day6_

    @property
    def is_day7(self) -> bool:
        return self._is_day7_

    @is_day7.setter
    def is_day7(self, is_day7_: bool) -> None:
        self._is_day7_ = is_day7_

    @property
    def is_day8(self) -> bool:
        return self._is_day8_

    @is_day8.setter
    def is_day8(self, is_day8_: bool) -> None:
        self._is_day8_ = is_day8_

    @property
    def is_day9(self) -> bool:
        return self._is_day9_

    @is_day9.setter
    def is_day9(self, is_day9_: bool) -> None:
        self._is_day9_ = is_day9_

    @property
    def is_day10(self) -> bool:
        return self._is_day10_

    @is_day10.setter
    def is_day10(self, is_day10_: bool) -> None:
        self._is_day10_ = is_day10_

    @property
    def is_day11(self) -> bool:
        return self._is_day11_

    @is_day11.setter
    def is_day11(self, is_day11_: bool) -> None:
        self._is_day11_ = is_day11_

    @property
    def is_day12(self) -> bool:
        return self._is_day12_

    @is_day12.setter
    def is_day12(self, is_day12_: bool) -> None:
        self._is_day12_ = is_day12_

    @property
    def is_day13(self) -> bool:
        return self._is_day13_

    @is_day13.setter
    def is_day13(self, is_day13_: bool) -> None:
        self._is_day13_ = is_day13_

    @property
    def is_day14(self) -> bool:
        return self._is_day14_

    @is_day14.setter
    def is_day14(self, is_day14_: bool) -> None:
        self._is_day14_ = is_day14_

    @property
    def is_day15(self) -> bool:
        return self._is_day15_

    @is_day15.setter
    def is_day15(self, is_day15_: bool) -> None:
        self._is_day15_ = is_day15_

    @property
    def is_day16(self) -> bool:
        return self._is_day16_

    @is_day16.setter
    def is_day16(self, is_day16_: bool) -> None:
        self._is_day16_ = is_day16_

    @property
    def is_day17(self) -> bool:
        return self._is_day17_

    @is_day17.setter
    def is_day17(self, is_day17_: bool) -> None:
        self._is_day17_ = is_day17_

    @property
    def is_day18(self) -> bool:
        return self._is_day18_

    @is_day18.setter
    def is_day18(self, is_day18_: bool) -> None:
        self._is_day18_ = is_day18_

    @property
    def is_day19(self) -> bool:
        return self._is_day19_

    @is_day19.setter
    def is_day19(self, is_day19_: bool) -> None:
        self._is_day19_ = is_day19_

    @property
    def is_day20(self) -> bool:
        return self._is_day20_

    @is_day20.setter
    def is_day20(self, is_day20_: bool) -> None:
        self._is_day20_ = is_day20_

    @property
    def is_day21(self) -> bool:
        return self._is_day21_

    @is_day21.setter
    def is_day21(self, is_day21_: bool) -> None:
        self._is_day21_ = is_day21_

    @property
    def is_day22(self) -> bool:
        return self._is_day22_

    @is_day22.setter
    def is_day22(self, is_day22_: bool) -> None:
        self._is_day22_ = is_day22_

    @property
    def is_day23(self) -> bool:
        return self._is_day23_

    @is_day23.setter
    def is_day23(self, is_day23_: bool) -> None:
        self._is_day23_ = is_day23_

    @property
    def is_day24(self) -> bool:
        return self._is_day24_

    @is_day24.setter
    def is_day24(self, is_day24_: bool) -> None:
        self._is_day24_ = is_day24_

    @property
    def is_day25(self) -> bool:
        return self._is_day25_

    @is_day25.setter
    def is_day25(self, is_day25_: bool) -> None:
        self._is_day25_ = is_day25_

    @property
    def is_day26(self) -> bool:
        return self._is_day26_

    @is_day26.setter
    def is_day26(self, is_day26_: bool) -> None:
        self._is_day26_ = is_day26_

    @property
    def is_day27(self) -> bool:
        return self._is_day27_

    @is_day27.setter
    def is_day27(self, is_day27_: bool) -> None:
        self._is_day27_ = is_day27_

    @property
    def is_day28(self) -> bool:
        return self._is_day28_

    @is_day28.setter
    def is_day28(self, is_day28_: bool) -> None:
        self._is_day28_ = is_day28_

    @property
    def is_day29(self) -> bool:
        return self._is_day29_

    @is_day29.setter
    def is_day29(self, is_day29_: bool) -> None:
        self._is_day29_ = is_day29_

    @property
    def is_day30(self) -> bool:
        return self._is_day30_

    @is_day30.setter
    def is_day30(self, is_day30_: bool) -> None:
        self._is_day30_ = is_day30_

    @property
    def is_day31(self) -> bool:
        return self._is_day31_

    @is_day31.setter
    def is_day31(self, is_day31_: bool) -> None:
        self._is_day31_ = is_day31_

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
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._is_day1_ = zserio_reader.read_bool()
        self._is_day2_ = zserio_reader.read_bool()
        self._is_day3_ = zserio_reader.read_bool()
        self._is_day4_ = zserio_reader.read_bool()
        self._is_day5_ = zserio_reader.read_bool()
        self._is_day6_ = zserio_reader.read_bool()
        self._is_day7_ = zserio_reader.read_bool()
        self._is_day8_ = zserio_reader.read_bool()
        self._is_day9_ = zserio_reader.read_bool()
        self._is_day10_ = zserio_reader.read_bool()
        self._is_day11_ = zserio_reader.read_bool()
        self._is_day12_ = zserio_reader.read_bool()
        self._is_day13_ = zserio_reader.read_bool()
        self._is_day14_ = zserio_reader.read_bool()
        self._is_day15_ = zserio_reader.read_bool()
        self._is_day16_ = zserio_reader.read_bool()
        self._is_day17_ = zserio_reader.read_bool()
        self._is_day18_ = zserio_reader.read_bool()
        self._is_day19_ = zserio_reader.read_bool()
        self._is_day20_ = zserio_reader.read_bool()
        self._is_day21_ = zserio_reader.read_bool()
        self._is_day22_ = zserio_reader.read_bool()
        self._is_day23_ = zserio_reader.read_bool()
        self._is_day24_ = zserio_reader.read_bool()
        self._is_day25_ = zserio_reader.read_bool()
        self._is_day26_ = zserio_reader.read_bool()
        self._is_day27_ = zserio_reader.read_bool()
        self._is_day28_ = zserio_reader.read_bool()
        self._is_day29_ = zserio_reader.read_bool()
        self._is_day30_ = zserio_reader.read_bool()
        self._is_day31_ = zserio_reader.read_bool()
        self._is_inclusive_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._is_day1_)
        zserio_writer.write_bool(self._is_day2_)
        zserio_writer.write_bool(self._is_day3_)
        zserio_writer.write_bool(self._is_day4_)
        zserio_writer.write_bool(self._is_day5_)
        zserio_writer.write_bool(self._is_day6_)
        zserio_writer.write_bool(self._is_day7_)
        zserio_writer.write_bool(self._is_day8_)
        zserio_writer.write_bool(self._is_day9_)
        zserio_writer.write_bool(self._is_day10_)
        zserio_writer.write_bool(self._is_day11_)
        zserio_writer.write_bool(self._is_day12_)
        zserio_writer.write_bool(self._is_day13_)
        zserio_writer.write_bool(self._is_day14_)
        zserio_writer.write_bool(self._is_day15_)
        zserio_writer.write_bool(self._is_day16_)
        zserio_writer.write_bool(self._is_day17_)
        zserio_writer.write_bool(self._is_day18_)
        zserio_writer.write_bool(self._is_day19_)
        zserio_writer.write_bool(self._is_day20_)
        zserio_writer.write_bool(self._is_day21_)
        zserio_writer.write_bool(self._is_day22_)
        zserio_writer.write_bool(self._is_day23_)
        zserio_writer.write_bool(self._is_day24_)
        zserio_writer.write_bool(self._is_day25_)
        zserio_writer.write_bool(self._is_day26_)
        zserio_writer.write_bool(self._is_day27_)
        zserio_writer.write_bool(self._is_day28_)
        zserio_writer.write_bool(self._is_day29_)
        zserio_writer.write_bool(self._is_day30_)
        zserio_writer.write_bool(self._is_day31_)
        zserio_writer.write_bool(self._is_inclusive_)
