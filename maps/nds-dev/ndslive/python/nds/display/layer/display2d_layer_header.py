# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.scale_denominator
import nds.display.metadata.display2d_content
import nds.display.types.sublevel_scale_denominator

class Display2DLayerHeader:
    def __init__(
            self,
            content_: typing.Union[nds.display.metadata.display2d_content.Display2DContent, None] = None,
            has_clipping_edge_list_: bool = bool(),
            has_scale_sublevels_: bool = bool(),
            min_scale_denominator_: nds.core.types.scale_denominator.ScaleDenominator = nds.core.types.scale_denominator.ScaleDenominator(),
            max_scale_denominator_: nds.core.types.scale_denominator.ScaleDenominator = nds.core.types.scale_denominator.ScaleDenominator(),
            num_sublevels_: typing.Optional[int] = None,
            subscales_: typing.Optional[typing.List[nds.display.types.sublevel_scale_denominator.SublevelScaleDenominator]] = None) -> None:
        self._content_ = content_
        self._has_clipping_edge_list_ = has_clipping_edge_list_
        self._has_scale_sublevels_ = has_scale_sublevels_
        self._min_scale_denominator_ = min_scale_denominator_
        self._max_scale_denominator_ = max_scale_denominator_
        self._num_sublevels_ = num_sublevels_
        if subscales_ is None:
            self._subscales_ = None
        else:
            self._subscales_ = zserio.array.Array(zserio.array.BitFieldArrayTraits(32), subscales_)

    @classmethod
    def from_reader(
            cls: typing.Type['Display2DLayerHeader'],
            zserio_reader: zserio.BitStreamReader) -> 'Display2DLayerHeader':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Display2DLayerHeader'],
            zserio_context: Display2DLayerHeader.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Display2DLayerHeader':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Display2DLayerHeader):
            return ((self._content_ == other._content_) and
                    (self._has_clipping_edge_list_ == other._has_clipping_edge_list_) and
                    (self._has_scale_sublevels_ == other._has_scale_sublevels_) and
                    (self._min_scale_denominator_ == other._min_scale_denominator_) and
                    (self._max_scale_denominator_ == other._max_scale_denominator_) and
                    (not other.is_num_sublevels_used() if not self.is_num_sublevels_used() else (self._num_sublevels_ == other._num_sublevels_)) and
                    (not other.is_subscales_used() if not self.is_subscales_used() else (self._subscales_ == other._subscales_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_clipping_edge_list_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_scale_sublevels_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._min_scale_denominator_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._max_scale_denominator_)
        if self.is_num_sublevels_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._num_sublevels_)
        if self.is_subscales_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._subscales_)

        return result

    @property
    def content(self) -> typing.Union[nds.display.metadata.display2d_content.Display2DContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.display.metadata.display2d_content.Display2DContent, None]) -> None:
        self._content_ = content_

    @property
    def has_clipping_edge_list(self) -> bool:
        return self._has_clipping_edge_list_

    @has_clipping_edge_list.setter
    def has_clipping_edge_list(self, has_clipping_edge_list_: bool) -> None:
        self._has_clipping_edge_list_ = has_clipping_edge_list_

    @property
    def has_scale_sublevels(self) -> bool:
        return self._has_scale_sublevels_

    @has_scale_sublevels.setter
    def has_scale_sublevels(self, has_scale_sublevels_: bool) -> None:
        self._has_scale_sublevels_ = has_scale_sublevels_

    @property
    def min_scale_denominator(self) -> nds.core.types.scale_denominator.ScaleDenominator:
        return self._min_scale_denominator_

    @min_scale_denominator.setter
    def min_scale_denominator(self, min_scale_denominator_: nds.core.types.scale_denominator.ScaleDenominator) -> None:
        self._min_scale_denominator_ = min_scale_denominator_

    @property
    def max_scale_denominator(self) -> nds.core.types.scale_denominator.ScaleDenominator:
        return self._max_scale_denominator_

    @max_scale_denominator.setter
    def max_scale_denominator(self, max_scale_denominator_: nds.core.types.scale_denominator.ScaleDenominator) -> None:
        self._max_scale_denominator_ = max_scale_denominator_

    @property
    def num_sublevels(self) -> typing.Optional[int]:
        return self._num_sublevels_

    @num_sublevels.setter
    def num_sublevels(self, num_sublevels_: typing.Optional[int]) -> None:
        self._num_sublevels_ = num_sublevels_

    def is_num_sublevels_used(self) -> bool:
        return self._has_scale_sublevels_

    def is_num_sublevels_set(self) -> bool:
        return not self._num_sublevels_ is None

    def reset_num_sublevels(self) -> None:
        self._num_sublevels_ = None

    @property
    def subscales(self) -> typing.Optional[typing.List[nds.display.types.sublevel_scale_denominator.SublevelScaleDenominator]]:
        return None if self._subscales_ is None else self._subscales_.raw_array

    @subscales.setter
    def subscales(self, subscales_: typing.Optional[typing.List[nds.display.types.sublevel_scale_denominator.SublevelScaleDenominator]]) -> None:
        if subscales_ is None:
            self._subscales_ = None
        else:
            self._subscales_ = zserio.array.Array(zserio.array.BitFieldArrayTraits(32), subscales_)

    def is_subscales_used(self) -> bool:
        return self._has_scale_sublevels_

    def is_subscales_set(self) -> bool:
        return not self._subscales_ is None

    def reset_subscales(self) -> None:
        self._subscales_ = None

    def init_packing_context(self, zserio_context: Display2DLayerHeader.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        zserio_context.min_scale_denominator.init(zserio.array.BitFieldArrayTraits(32), self._min_scale_denominator_)
        zserio_context.max_scale_denominator.init(zserio.array.BitFieldArrayTraits(32), self._max_scale_denominator_)
        if self.is_num_sublevels_used():
            zserio_context.num_sublevels.init(zserio.array.BitFieldArrayTraits(8), self._num_sublevels_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 32
        end_bitposition += 32
        if self.is_num_sublevels_used():
            end_bitposition += 8
        if self.is_subscales_used():
            end_bitposition += self._subscales_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Display2DLayerHeader.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += zserio_context.min_scale_denominator.bitsizeof(zserio.array.BitFieldArrayTraits(32), self._min_scale_denominator_)
        end_bitposition += zserio_context.max_scale_denominator.bitsizeof(zserio.array.BitFieldArrayTraits(32), self._max_scale_denominator_)
        if self.is_num_sublevels_used():
            end_bitposition += zserio_context.num_sublevels.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_sublevels_)
        if self.is_subscales_used():
            end_bitposition += self._subscales_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 32
        end_bitposition += 32
        if self.is_num_sublevels_used():
            end_bitposition += 8
        if self.is_subscales_used():
            end_bitposition = self._subscales_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Display2DLayerHeader.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += zserio_context.min_scale_denominator.bitsizeof(zserio.array.BitFieldArrayTraits(32), self._min_scale_denominator_)
        end_bitposition += zserio_context.max_scale_denominator.bitsizeof(zserio.array.BitFieldArrayTraits(32), self._max_scale_denominator_)
        if self.is_num_sublevels_used():
            end_bitposition += zserio_context.num_sublevels.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_sublevels_)
        if self.is_subscales_used():
            end_bitposition = self._subscales_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.display.metadata.display2d_content.Display2DContent.from_reader(zserio_reader)
        self._has_clipping_edge_list_ = zserio_reader.read_bool()
        self._has_scale_sublevels_ = zserio_reader.read_bool()
        self._min_scale_denominator_ = zserio_reader.read_bits(32)
        self._max_scale_denominator_ = zserio_reader.read_bits(32)
        if self.is_num_sublevels_used():
            self._num_sublevels_ = zserio_reader.read_bits(8)
        else:
            self._num_sublevels_ = None
        if self.is_subscales_used():
            self._subscales_ = zserio.array.Array.from_reader(zserio.array.BitFieldArrayTraits(32), zserio_reader, self._num_sublevels_)
        else:
            self._subscales_ = None

    def read_packed(self, zserio_context: Display2DLayerHeader.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.display.metadata.display2d_content.Display2DContent.from_reader_packed(zserio_context.content, zserio_reader)

        self._has_clipping_edge_list_ = zserio_reader.read_bool()

        self._has_scale_sublevels_ = zserio_reader.read_bool()

        self._min_scale_denominator_ = zserio_context.min_scale_denominator.read(zserio.array.BitFieldArrayTraits(32), zserio_reader)

        self._max_scale_denominator_ = zserio_context.max_scale_denominator.read(zserio.array.BitFieldArrayTraits(32), zserio_reader)

        if self.is_num_sublevels_used():
            self._num_sublevels_ = zserio_context.num_sublevels.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
        else:
            self._num_sublevels_ = None

        if self.is_subscales_used():
            self._subscales_ = zserio.array.Array.from_reader_packed(zserio.array.BitFieldArrayTraits(32), zserio_reader, self._num_sublevels_)
        else:
            self._subscales_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)

        zserio_writer.write_bool(self._has_clipping_edge_list_)

        zserio_writer.write_bool(self._has_scale_sublevels_)

        zserio_writer.write_bits(self._min_scale_denominator_, 32)

        zserio_writer.write_bits(self._max_scale_denominator_, 32)

        if self.is_num_sublevels_used():
            zserio_writer.write_bits(self._num_sublevels_, 8)

        if self.is_subscales_used():
            # check array length
            if len(self._subscales_) != (self._num_sublevels_):
                raise zserio.PythonRuntimeException("Wrong array length for field Display2DLayerHeader.subscales: "
                                                    f"{len(self._subscales_)} != {self._num_sublevels_}!")
            self._subscales_.write(zserio_writer)

    def write_packed(self, zserio_context: Display2DLayerHeader.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        zserio_writer.write_bool(self._has_clipping_edge_list_)

        zserio_writer.write_bool(self._has_scale_sublevels_)

        zserio_context.min_scale_denominator.write(zserio.array.BitFieldArrayTraits(32), zserio_writer, self._min_scale_denominator_)

        zserio_context.max_scale_denominator.write(zserio.array.BitFieldArrayTraits(32), zserio_writer, self._max_scale_denominator_)

        if self.is_num_sublevels_used():
            zserio_context.num_sublevels.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_sublevels_)

        if self.is_subscales_used():
            # check array length
            if len(self._subscales_) != (self._num_sublevels_):
                raise zserio.PythonRuntimeException("Wrong array length for field Display2DLayerHeader.subscales: "
                                                    f"{len(self._subscales_)} != {self._num_sublevels_}!")
            self._subscales_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._min_scale_denominator_ = zserio.array.DeltaContext()
            self._max_scale_denominator_ = zserio.array.DeltaContext()
            self._num_sublevels_ = zserio.array.DeltaContext()

        @property
        def content(self):
            return self._content_

        @property
        def min_scale_denominator(self):
            return self._min_scale_denominator_

        @property
        def max_scale_denominator(self):
            return self._max_scale_denominator_

        @property
        def num_sublevels(self):
            return self._num_sublevels_
