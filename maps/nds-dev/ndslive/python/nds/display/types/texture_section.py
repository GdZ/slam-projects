# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TextureSection:
    def __init__(
            self,
            top_: int = int(),
            left_: int = int(),
            height_: int = int(),
            width_: int = int()) -> None:
        self._top_ = top_
        self._left_ = left_
        self._height_ = height_
        self._width_ = width_

    @classmethod
    def from_reader(
            cls: typing.Type['TextureSection'],
            zserio_reader: zserio.BitStreamReader) -> 'TextureSection':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TextureSection'],
            zserio_context: TextureSection.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TextureSection':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TextureSection):
            return ((self._top_ == other._top_) and
                    (self._left_ == other._left_) and
                    (self._height_ == other._height_) and
                    (self._width_ == other._width_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._top_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._left_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._height_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._width_)

        return result

    @property
    def top(self) -> int:
        return self._top_

    @top.setter
    def top(self, top_: int) -> None:
        self._top_ = top_

    @property
    def left(self) -> int:
        return self._left_

    @left.setter
    def left(self, left_: int) -> None:
        self._left_ = left_

    @property
    def height(self) -> int:
        return self._height_

    @height.setter
    def height(self, height_: int) -> None:
        self._height_ = height_

    @property
    def width(self) -> int:
        return self._width_

    @width.setter
    def width(self, width_: int) -> None:
        self._width_ = width_

    def init_packing_context(self, zserio_context: TextureSection.ZserioPackingContext) -> None:
        zserio_context.top.init(zserio.array.BitFieldArrayTraits(16), self._top_)
        zserio_context.left.init(zserio.array.BitFieldArrayTraits(16), self._left_)
        zserio_context.height.init(zserio.array.BitFieldArrayTraits(16), self._height_)
        zserio_context.width.init(zserio.array.BitFieldArrayTraits(16), self._width_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 16
        end_bitposition += 16
        end_bitposition += 16
        end_bitposition += 16

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TextureSection.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.top.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._top_)
        end_bitposition += zserio_context.left.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._left_)
        end_bitposition += zserio_context.height.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._height_)
        end_bitposition += zserio_context.width.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._width_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 16
        end_bitposition += 16
        end_bitposition += 16
        end_bitposition += 16

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TextureSection.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.top.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._top_)
        end_bitposition += zserio_context.left.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._left_)
        end_bitposition += zserio_context.height.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._height_)
        end_bitposition += zserio_context.width.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._width_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._top_ = zserio_reader.read_bits(16)
        self._left_ = zserio_reader.read_bits(16)
        self._height_ = zserio_reader.read_bits(16)
        self._width_ = zserio_reader.read_bits(16)

    def read_packed(self, zserio_context: TextureSection.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._top_ = zserio_context.top.read(zserio.array.BitFieldArrayTraits(16), zserio_reader)

        self._left_ = zserio_context.left.read(zserio.array.BitFieldArrayTraits(16), zserio_reader)

        self._height_ = zserio_context.height.read(zserio.array.BitFieldArrayTraits(16), zserio_reader)

        self._width_ = zserio_context.width.read(zserio.array.BitFieldArrayTraits(16), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._top_, 16)
        zserio_writer.write_bits(self._left_, 16)
        zserio_writer.write_bits(self._height_, 16)
        zserio_writer.write_bits(self._width_, 16)

    def write_packed(self, zserio_context: TextureSection.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.top.write(zserio.array.BitFieldArrayTraits(16), zserio_writer, self._top_)

        zserio_context.left.write(zserio.array.BitFieldArrayTraits(16), zserio_writer, self._left_)

        zserio_context.height.write(zserio.array.BitFieldArrayTraits(16), zserio_writer, self._height_)

        zserio_context.width.write(zserio.array.BitFieldArrayTraits(16), zserio_writer, self._width_)

    class ZserioPackingContext:
        def __init__(self):
            self._top_ = zserio.array.DeltaContext()
            self._left_ = zserio.array.DeltaContext()
            self._height_ = zserio.array.DeltaContext()
            self._width_ = zserio.array.DeltaContext()

        @property
        def top(self):
            return self._top_

        @property
        def left(self):
            return self._left_

        @property
        def height(self):
            return self._height_

        @property
        def width(self):
            return self._width_