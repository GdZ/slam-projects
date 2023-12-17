# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.display.reference.types.display_line_range_choice
import nds.display.reference.types.display_line_validity_type

class DisplayLineRangeValidity:
    def __init__(
            self,
            shift_: nds.core.geometry.coord_shift.CoordShift,
            type_: typing.Union[nds.display.reference.types.display_line_validity_type.DisplayLineValidityType, None] = None,
            num_ranges_: typing.Optional[int] = None,
            ranges_: typing.Optional[typing.List[nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice]] = None) -> None:
        self._shift_ = shift_
        self._type_ = type_
        self._num_ranges_ = num_ranges_
        if ranges_ is None:
            self._ranges_ = None
        else:
            self._ranges_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_ranges(self)), ranges_)

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayLineRangeValidity'],
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLineRangeValidity':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayLineRangeValidity'],
            zserio_context: DisplayLineRangeValidity.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLineRangeValidity':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLineRangeValidity):
            return (self._shift_ == other._shift_ and
                    (self._type_ == other._type_) and
                    (not other.is_num_ranges_used() if not self.is_num_ranges_used() else (self._num_ranges_ == other._num_ranges_)) and
                    (not other.is_ranges_used() if not self.is_ranges_used() else (self._ranges_ == other._ranges_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_num_ranges_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._num_ranges_)
        if self.is_ranges_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._ranges_)

        return result

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @property
    def type(self) -> typing.Union[nds.display.reference.types.display_line_validity_type.DisplayLineValidityType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.display.reference.types.display_line_validity_type.DisplayLineValidityType, None]) -> None:
        self._type_ = type_

    @property
    def num_ranges(self) -> typing.Optional[int]:
        return self._num_ranges_

    @num_ranges.setter
    def num_ranges(self, num_ranges_: typing.Optional[int]) -> None:
        self._num_ranges_ = num_ranges_

    def is_num_ranges_used(self) -> bool:
        return self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE

    def is_num_ranges_set(self) -> bool:
        return not self._num_ranges_ is None

    def reset_num_ranges(self) -> None:
        self._num_ranges_ = None

    @property
    def ranges(self) -> typing.Optional[typing.List[nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice]]:
        return None if self._ranges_ is None else self._ranges_.raw_array

    @ranges.setter
    def ranges(self, ranges_: typing.Optional[typing.List[nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice]]) -> None:
        if ranges_ is None:
            self._ranges_ = None
        else:
            self._ranges_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_ranges(self)), ranges_)

    def is_ranges_used(self) -> bool:
        return self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE

    def is_ranges_set(self) -> bool:
        return not self._ranges_ is None

    def reset_ranges(self) -> None:
        self._ranges_ = None

    def init_packing_context(self, zserio_context: DisplayLineRangeValidity.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        if self.is_num_ranges_used():
            zserio_context.num_ranges.init(zserio.array.VarSizeArrayTraits(), self._num_ranges_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_ranges_)
        if self.is_ranges_used():
            end_bitposition += self._ranges_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayLineRangeValidity.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio_context.num_ranges.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_ranges_)
        if self.is_ranges_used():
            end_bitposition += self._ranges_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_ranges_)
        if self.is_ranges_used():
            end_bitposition = self._ranges_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayLineRangeValidity.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio_context.num_ranges.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_ranges_)
        if self.is_ranges_used():
            end_bitposition = self._ranges_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.from_reader(zserio_reader)

        if self.is_num_ranges_used():
            self._num_ranges_ = zserio_reader.read_varsize()
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLineRangeValidity.numRanges!")
        else:
            self._num_ranges_ = None

        if self.is_ranges_used():
            self._ranges_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_ranges(self)), zserio_reader, self._num_ranges_)
        else:
            self._ranges_ = None

    def read_packed(self, zserio_context: DisplayLineRangeValidity.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.from_reader_packed(zserio_context.type, zserio_reader)

        if self.is_num_ranges_used():
            self._num_ranges_ = zserio_context.num_ranges.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLineRangeValidity.numRanges!")
        else:
            self._num_ranges_ = None

        if self.is_ranges_used():
            self._ranges_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_ranges(self)), zserio_reader, self._num_ranges_)
        else:
            self._ranges_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write(zserio_writer)

        if self.is_num_ranges_used():
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLineRangeValidity.numRanges!")
            zserio_writer.write_varsize(self._num_ranges_)

        if self.is_ranges_used():
            # check array length
            if len(self._ranges_) != (self._num_ranges_):
                raise zserio.PythonRuntimeException("Wrong array length for field DisplayLineRangeValidity.ranges: "
                                                    f"{len(self._ranges_)} != {self._num_ranges_}!")
            self._ranges_.write(zserio_writer)

    def write_packed(self, zserio_context: DisplayLineRangeValidity.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write_packed(zserio_context.type, zserio_writer)

        if self.is_num_ranges_used():
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLineRangeValidity.numRanges!")
            zserio_context.num_ranges.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_ranges_)

        if self.is_ranges_used():
            # check array length
            if len(self._ranges_) != (self._num_ranges_):
                raise zserio.PythonRuntimeException("Wrong array length for field DisplayLineRangeValidity.ranges: "
                                                    f"{len(self._ranges_)} != {self._num_ranges_}!")
            self._ranges_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._type_ = zserio.array.DeltaContext()
            self._num_ranges_ = zserio.array.DeltaContext()

        @property
        def type(self):
            return self._type_

        @property
        def num_ranges(self):
            return self._num_ranges_

    class _ZserioElementFactory_ranges:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice:
            del zserio_index
            return nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice.from_reader(zserio_reader, self._owner._type_, self._owner._shift_)

        @staticmethod
        def create_packing_context() -> nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice.ZserioPackingContext:
            return nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice:
            del zserio_index
            return nds.display.reference.types.display_line_range_choice.DisplayLineRangeChoice.from_reader_packed(zserio_context, zserio_reader, self._owner._type_, self._owner._shift_)