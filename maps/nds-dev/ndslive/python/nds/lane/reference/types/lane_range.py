# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.reference.types.lane_range_choice
import nds.lane.reference.types.lane_validity_type

class LaneRange:
    def __init__(
            self,
            type_: typing.Union[nds.lane.reference.types.lane_validity_type.LaneValidityType, None] = None,
            num_ranges_: typing.Optional[int] = None,
            range_: typing.Optional[typing.List[nds.lane.reference.types.lane_range_choice.LaneRangeChoice]] = None) -> None:
        self._type_ = type_
        self._num_ranges_ = num_ranges_
        if range_ is None:
            self._range_ = None
        else:
            self._range_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_range(self)), range_)

    @classmethod
    def from_reader(
            cls: typing.Type['LaneRange'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneRange':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneRange'],
            zserio_context: LaneRange.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneRange':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneRange):
            return ((self._type_ == other._type_) and
                    (not other.is_num_ranges_used() if not self.is_num_ranges_used() else (self._num_ranges_ == other._num_ranges_)) and
                    (not other.is_range_used() if not self.is_range_used() else (self._range_ == other._range_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_num_ranges_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._num_ranges_)
        if self.is_range_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._range_)

        return result

    @property
    def type(self) -> typing.Union[nds.lane.reference.types.lane_validity_type.LaneValidityType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.lane.reference.types.lane_validity_type.LaneValidityType, None]) -> None:
        self._type_ = type_

    @property
    def num_ranges(self) -> typing.Optional[int]:
        return self._num_ranges_

    @num_ranges.setter
    def num_ranges(self, num_ranges_: typing.Optional[int]) -> None:
        self._num_ranges_ = num_ranges_

    def is_num_ranges_used(self) -> bool:
        return self._type_ != nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE and self._type_ != nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE

    def is_num_ranges_set(self) -> bool:
        return not self._num_ranges_ is None

    def reset_num_ranges(self) -> None:
        self._num_ranges_ = None

    @property
    def range(self) -> typing.Optional[typing.List[nds.lane.reference.types.lane_range_choice.LaneRangeChoice]]:
        return None if self._range_ is None else self._range_.raw_array

    @range.setter
    def range(self, range_: typing.Optional[typing.List[nds.lane.reference.types.lane_range_choice.LaneRangeChoice]]) -> None:
        if range_ is None:
            self._range_ = None
        else:
            self._range_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_range(self)), range_)

    def is_range_used(self) -> bool:
        return self._type_ != nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE and self._type_ != nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE

    def is_range_set(self) -> bool:
        return not self._range_ is None

    def reset_range(self) -> None:
        self._range_ = None

    def init_packing_context(self, zserio_context: LaneRange.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        if self.is_num_ranges_used():
            zserio_context.num_ranges.init(zserio.array.VarSizeArrayTraits(), self._num_ranges_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_ranges_)
        if self.is_range_used():
            end_bitposition += self._range_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneRange.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio_context.num_ranges.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_ranges_)
        if self.is_range_used():
            end_bitposition += self._range_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_ranges_)
        if self.is_range_used():
            end_bitposition = self._range_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneRange.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        if self.is_num_ranges_used():
            end_bitposition += zserio_context.num_ranges.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_ranges_)
        if self.is_range_used():
            end_bitposition = self._range_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.lane.reference.types.lane_validity_type.LaneValidityType.from_reader(zserio_reader)

        if self.is_num_ranges_used():
            self._num_ranges_ = zserio_reader.read_varsize()
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field LaneRange.numRanges!")
        else:
            self._num_ranges_ = None

        if self.is_range_used():
            self._range_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_range(self)), zserio_reader, self._num_ranges_)
        else:
            self._range_ = None

    def read_packed(self, zserio_context: LaneRange.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.lane.reference.types.lane_validity_type.LaneValidityType.from_reader_packed(zserio_context.type, zserio_reader)

        if self.is_num_ranges_used():
            self._num_ranges_ = zserio_context.num_ranges.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field LaneRange.numRanges!")
        else:
            self._num_ranges_ = None

        if self.is_range_used():
            self._range_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_range(self)), zserio_reader, self._num_ranges_)
        else:
            self._range_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write(zserio_writer)

        if self.is_num_ranges_used():
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field LaneRange.numRanges!")
            zserio_writer.write_varsize(self._num_ranges_)

        if self.is_range_used():
            # check array length
            if len(self._range_) != (self._num_ranges_):
                raise zserio.PythonRuntimeException("Wrong array length for field LaneRange.range: "
                                                    f"{len(self._range_)} != {self._num_ranges_}!")
            self._range_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneRange.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write_packed(zserio_context.type, zserio_writer)

        if self.is_num_ranges_used():
            # check constraint
            if not (self._num_ranges_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field LaneRange.numRanges!")
            zserio_context.num_ranges.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_ranges_)

        if self.is_range_used():
            # check array length
            if len(self._range_) != (self._num_ranges_):
                raise zserio.PythonRuntimeException("Wrong array length for field LaneRange.range: "
                                                    f"{len(self._range_)} != {self._num_ranges_}!")
            self._range_.write_packed(zserio_writer)

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

    class _ZserioElementFactory_range:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_range_choice.LaneRangeChoice:
            del zserio_index
            return nds.lane.reference.types.lane_range_choice.LaneRangeChoice.from_reader(zserio_reader, self._owner._type_)

        @staticmethod
        def create_packing_context() -> nds.lane.reference.types.lane_range_choice.LaneRangeChoice.ZserioPackingContext:
            return nds.lane.reference.types.lane_range_choice.LaneRangeChoice.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.lane.reference.types.lane_range_choice.LaneRangeChoice.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_range_choice.LaneRangeChoice:
            del zserio_index
            return nds.lane.reference.types.lane_range_choice.LaneRangeChoice.from_reader_packed(zserio_context, zserio_reader, self._owner._type_)
