# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.icons.num_pixels

class ImageRect:
    def __init__(
            self,
            x_top_left_pos_: nds.core.icons.num_pixels.NumPixels = nds.core.icons.num_pixels.NumPixels(),
            y_top_left_pos_: nds.core.icons.num_pixels.NumPixels = nds.core.icons.num_pixels.NumPixels(),
            pix_width_: nds.core.icons.num_pixels.NumPixels = nds.core.icons.num_pixels.NumPixels(),
            pix_height_: nds.core.icons.num_pixels.NumPixels = nds.core.icons.num_pixels.NumPixels()) -> None:
        self._x_top_left_pos_ = x_top_left_pos_
        self._y_top_left_pos_ = y_top_left_pos_
        self._pix_width_ = pix_width_
        self._pix_height_ = pix_height_

    @classmethod
    def from_reader(
            cls: typing.Type['ImageRect'],
            zserio_reader: zserio.BitStreamReader) -> 'ImageRect':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ImageRect'],
            zserio_context: ImageRect.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ImageRect':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ImageRect):
            return ((self._x_top_left_pos_ == other._x_top_left_pos_) and
                    (self._y_top_left_pos_ == other._y_top_left_pos_) and
                    (self._pix_width_ == other._pix_width_) and
                    (self._pix_height_ == other._pix_height_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._x_top_left_pos_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._y_top_left_pos_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._pix_width_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._pix_height_)

        return result

    @property
    def x_top_left_pos(self) -> nds.core.icons.num_pixels.NumPixels:
        return self._x_top_left_pos_

    @x_top_left_pos.setter
    def x_top_left_pos(self, x_top_left_pos_: nds.core.icons.num_pixels.NumPixels) -> None:
        self._x_top_left_pos_ = x_top_left_pos_

    @property
    def y_top_left_pos(self) -> nds.core.icons.num_pixels.NumPixels:
        return self._y_top_left_pos_

    @y_top_left_pos.setter
    def y_top_left_pos(self, y_top_left_pos_: nds.core.icons.num_pixels.NumPixels) -> None:
        self._y_top_left_pos_ = y_top_left_pos_

    @property
    def pix_width(self) -> nds.core.icons.num_pixels.NumPixels:
        return self._pix_width_

    @pix_width.setter
    def pix_width(self, pix_width_: nds.core.icons.num_pixels.NumPixels) -> None:
        self._pix_width_ = pix_width_

    @property
    def pix_height(self) -> nds.core.icons.num_pixels.NumPixels:
        return self._pix_height_

    @pix_height.setter
    def pix_height(self, pix_height_: nds.core.icons.num_pixels.NumPixels) -> None:
        self._pix_height_ = pix_height_

    def init_packing_context(self, zserio_context: ImageRect.ZserioPackingContext) -> None:
        zserio_context.x_top_left_pos.init(zserio.array.VarInt32ArrayTraits(), self._x_top_left_pos_)
        zserio_context.y_top_left_pos.init(zserio.array.VarInt32ArrayTraits(), self._y_top_left_pos_)
        zserio_context.pix_width.init(zserio.array.VarInt32ArrayTraits(), self._pix_width_)
        zserio_context.pix_height.init(zserio.array.VarInt32ArrayTraits(), self._pix_height_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._x_top_left_pos_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._y_top_left_pos_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._pix_width_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._pix_height_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ImageRect.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.x_top_left_pos.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._x_top_left_pos_)
        end_bitposition += zserio_context.y_top_left_pos.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._y_top_left_pos_)
        end_bitposition += zserio_context.pix_width.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._pix_width_)
        end_bitposition += zserio_context.pix_height.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._pix_height_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._x_top_left_pos_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._y_top_left_pos_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._pix_width_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._pix_height_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ImageRect.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.x_top_left_pos.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._x_top_left_pos_)
        end_bitposition += zserio_context.y_top_left_pos.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._y_top_left_pos_)
        end_bitposition += zserio_context.pix_width.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._pix_width_)
        end_bitposition += zserio_context.pix_height.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._pix_height_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._x_top_left_pos_ = zserio_reader.read_varint32()
        self._y_top_left_pos_ = zserio_reader.read_varint32()
        self._pix_width_ = zserio_reader.read_varint32()
        self._pix_height_ = zserio_reader.read_varint32()

    def read_packed(self, zserio_context: ImageRect.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._x_top_left_pos_ = zserio_context.x_top_left_pos.read(zserio.array.VarInt32ArrayTraits(), zserio_reader)

        self._y_top_left_pos_ = zserio_context.y_top_left_pos.read(zserio.array.VarInt32ArrayTraits(), zserio_reader)

        self._pix_width_ = zserio_context.pix_width.read(zserio.array.VarInt32ArrayTraits(), zserio_reader)

        self._pix_height_ = zserio_context.pix_height.read(zserio.array.VarInt32ArrayTraits(), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varint32(self._x_top_left_pos_)
        zserio_writer.write_varint32(self._y_top_left_pos_)
        zserio_writer.write_varint32(self._pix_width_)
        zserio_writer.write_varint32(self._pix_height_)

    def write_packed(self, zserio_context: ImageRect.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.x_top_left_pos.write(zserio.array.VarInt32ArrayTraits(), zserio_writer, self._x_top_left_pos_)

        zserio_context.y_top_left_pos.write(zserio.array.VarInt32ArrayTraits(), zserio_writer, self._y_top_left_pos_)

        zserio_context.pix_width.write(zserio.array.VarInt32ArrayTraits(), zserio_writer, self._pix_width_)

        zserio_context.pix_height.write(zserio.array.VarInt32ArrayTraits(), zserio_writer, self._pix_height_)

    class ZserioPackingContext:
        def __init__(self):
            self._x_top_left_pos_ = zserio.array.DeltaContext()
            self._y_top_left_pos_ = zserio.array.DeltaContext()
            self._pix_width_ = zserio.array.DeltaContext()
            self._pix_height_ = zserio.array.DeltaContext()

        @property
        def x_top_left_pos(self):
            return self._x_top_left_pos_

        @property
        def y_top_left_pos(self):
            return self._y_top_left_pos_

        @property
        def pix_width(self):
            return self._pix_width_

        @property
        def pix_height(self):
            return self._pix_height_