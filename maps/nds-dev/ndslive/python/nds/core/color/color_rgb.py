# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class ColorRgb:
    def __init__(
            self,
            red_: int = int(),
            green_: int = int(),
            blue_: int = int()) -> None:
        self._red_ = red_
        self._green_ = green_
        self._blue_ = blue_

    @classmethod
    def from_reader(
            cls: typing.Type['ColorRgb'],
            zserio_reader: zserio.BitStreamReader) -> 'ColorRgb':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ColorRgb'],
            zserio_context: ColorRgb.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ColorRgb':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ColorRgb):
            return ((self._red_ == other._red_) and
                    (self._green_ == other._green_) and
                    (self._blue_ == other._blue_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._red_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._green_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._blue_)

        return result

    @property
    def red(self) -> int:
        return self._red_

    @red.setter
    def red(self, red_: int) -> None:
        self._red_ = red_

    @property
    def green(self) -> int:
        return self._green_

    @green.setter
    def green(self, green_: int) -> None:
        self._green_ = green_

    @property
    def blue(self) -> int:
        return self._blue_

    @blue.setter
    def blue(self, blue_: int) -> None:
        self._blue_ = blue_

    def init_packing_context(self, zserio_context: ColorRgb.ZserioPackingContext) -> None:
        zserio_context.red.init(zserio.array.BitFieldArrayTraits(8), self._red_)
        zserio_context.green.init(zserio.array.BitFieldArrayTraits(8), self._green_)
        zserio_context.blue.init(zserio.array.BitFieldArrayTraits(8), self._blue_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += 8
        end_bitposition += 8

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ColorRgb.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.red.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._red_)
        end_bitposition += zserio_context.green.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._green_)
        end_bitposition += zserio_context.blue.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._blue_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += 8
        end_bitposition += 8

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ColorRgb.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.red.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._red_)
        end_bitposition += zserio_context.green.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._green_)
        end_bitposition += zserio_context.blue.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._blue_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._red_ = zserio_reader.read_bits(8)
        self._green_ = zserio_reader.read_bits(8)
        self._blue_ = zserio_reader.read_bits(8)

    def read_packed(self, zserio_context: ColorRgb.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._red_ = zserio_context.red.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._green_ = zserio_context.green.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._blue_ = zserio_context.blue.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._red_, 8)
        zserio_writer.write_bits(self._green_, 8)
        zserio_writer.write_bits(self._blue_, 8)

    def write_packed(self, zserio_context: ColorRgb.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.red.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._red_)

        zserio_context.green.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._green_)

        zserio_context.blue.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._blue_)

    class ZserioPackingContext:
        def __init__(self):
            self._red_ = zserio.array.DeltaContext()
            self._green_ = zserio.array.DeltaContext()
            self._blue_ = zserio.array.DeltaContext()

        @property
        def red(self):
            return self._red_

        @property
        def green(self):
            return self._green_

        @property
        def blue(self):
            return self._blue_
