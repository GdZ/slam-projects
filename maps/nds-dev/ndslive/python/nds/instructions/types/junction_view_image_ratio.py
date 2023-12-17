# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.icons.num_pixels

class JunctionViewImageRatio:
    def __init__(
            self,
            width_: nds.core.icons.num_pixels.NumPixels = nds.core.icons.num_pixels.NumPixels(),
            height_: nds.core.icons.num_pixels.NumPixels = nds.core.icons.num_pixels.NumPixels()) -> None:
        self._width_ = width_
        self._height_ = height_

    @classmethod
    def from_reader(
            cls: typing.Type['JunctionViewImageRatio'],
            zserio_reader: zserio.BitStreamReader) -> 'JunctionViewImageRatio':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['JunctionViewImageRatio'],
            zserio_context: JunctionViewImageRatio.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'JunctionViewImageRatio':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, JunctionViewImageRatio):
            return ((self._width_ == other._width_) and
                    (self._height_ == other._height_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._width_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._height_)

        return result

    @property
    def width(self) -> nds.core.icons.num_pixels.NumPixels:
        return self._width_

    @width.setter
    def width(self, width_: nds.core.icons.num_pixels.NumPixels) -> None:
        self._width_ = width_

    @property
    def height(self) -> nds.core.icons.num_pixels.NumPixels:
        return self._height_

    @height.setter
    def height(self, height_: nds.core.icons.num_pixels.NumPixels) -> None:
        self._height_ = height_

    def init_packing_context(self, zserio_context: JunctionViewImageRatio.ZserioPackingContext) -> None:
        zserio_context.width.init(zserio.array.VarInt32ArrayTraits(), self._width_)
        zserio_context.height.init(zserio.array.VarInt32ArrayTraits(), self._height_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._width_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._height_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: JunctionViewImageRatio.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.width.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._width_)
        end_bitposition += zserio_context.height.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._height_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._width_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._height_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: JunctionViewImageRatio.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.width.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._width_)
        end_bitposition += zserio_context.height.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._height_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._width_ = zserio_reader.read_varint32()
        self._height_ = zserio_reader.read_varint32()

    def read_packed(self, zserio_context: JunctionViewImageRatio.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._width_ = zserio_context.width.read(zserio.array.VarInt32ArrayTraits(), zserio_reader)

        self._height_ = zserio_context.height.read(zserio.array.VarInt32ArrayTraits(), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varint32(self._width_)
        zserio_writer.write_varint32(self._height_)

    def write_packed(self, zserio_context: JunctionViewImageRatio.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.width.write(zserio.array.VarInt32ArrayTraits(), zserio_writer, self._width_)

        zserio_context.height.write(zserio.array.VarInt32ArrayTraits(), zserio_writer, self._height_)

    class ZserioPackingContext:
        def __init__(self):
            self._width_ = zserio.array.DeltaContext()
            self._height_ = zserio.array.DeltaContext()

        @property
        def width(self):
            return self._width_

        @property
        def height(self):
            return self._height_
