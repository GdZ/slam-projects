# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.display.reference.types.display_line_position_choice
import nds.display.reference.types.display_line_validity_type

class DisplayLinePositionValidity:
    def __init__(
            self,
            shift_: nds.core.geometry.coord_shift.CoordShift,
            type_: typing.Union[nds.display.reference.types.display_line_validity_type.DisplayLineValidityType, None] = None,
            num_positions_: typing.Optional[int] = None,
            positions_: typing.Optional[typing.List[nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice]] = None) -> None:
        self._shift_ = shift_
        self._type_ = type_
        self._num_positions_ = num_positions_
        if positions_ is None:
            self._positions_ = None
        else:
            self._positions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions(self)), positions_)

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayLinePositionValidity'],
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLinePositionValidity':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayLinePositionValidity'],
            zserio_context: DisplayLinePositionValidity.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLinePositionValidity':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLinePositionValidity):
            return (self._shift_ == other._shift_ and
                    (self._type_ == other._type_) and
                    (not other.is_num_positions_used() if not self.is_num_positions_used() else (self._num_positions_ == other._num_positions_)) and
                    (not other.is_positions_used() if not self.is_positions_used() else (self._positions_ == other._positions_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_num_positions_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._num_positions_)
        if self.is_positions_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._positions_)

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
    def num_positions(self) -> typing.Optional[int]:
        return self._num_positions_

    @num_positions.setter
    def num_positions(self, num_positions_: typing.Optional[int]) -> None:
        self._num_positions_ = num_positions_

    def is_num_positions_used(self) -> bool:
        return self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE

    def is_num_positions_set(self) -> bool:
        return not self._num_positions_ is None

    def reset_num_positions(self) -> None:
        self._num_positions_ = None

    @property
    def positions(self) -> typing.Optional[typing.List[nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice]]:
        return None if self._positions_ is None else self._positions_.raw_array

    @positions.setter
    def positions(self, positions_: typing.Optional[typing.List[nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice]]) -> None:
        if positions_ is None:
            self._positions_ = None
        else:
            self._positions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions(self)), positions_)

    def is_positions_used(self) -> bool:
        return self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE

    def is_positions_set(self) -> bool:
        return not self._positions_ is None

    def reset_positions(self) -> None:
        self._positions_ = None

    def init_packing_context(self, zserio_context: DisplayLinePositionValidity.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        if self.is_num_positions_used():
            zserio_context.num_positions.init(zserio.array.VarSizeArrayTraits(), self._num_positions_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        if self.is_num_positions_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_positions_)
        if self.is_positions_used():
            end_bitposition += self._positions_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayLinePositionValidity.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        if self.is_num_positions_used():
            end_bitposition += zserio_context.num_positions.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_positions_)
        if self.is_positions_used():
            end_bitposition += self._positions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        if self.is_num_positions_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_positions_)
        if self.is_positions_used():
            end_bitposition = self._positions_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayLinePositionValidity.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        if self.is_num_positions_used():
            end_bitposition += zserio_context.num_positions.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_positions_)
        if self.is_positions_used():
            end_bitposition = self._positions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.from_reader(zserio_reader)
        # check constraint
        if not (self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.type!")

        if self.is_num_positions_used():
            self._num_positions_ = zserio_reader.read_varsize()
            # check constraint
            if not (self._num_positions_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.numPositions!")
        else:
            self._num_positions_ = None

        if self.is_positions_used():
            self._positions_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions(self)), zserio_reader, self._num_positions_)
        else:
            self._positions_ = None

    def read_packed(self, zserio_context: DisplayLinePositionValidity.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.from_reader_packed(zserio_context.type, zserio_reader)
        # check constraint
        if not (self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.type!")

        if self.is_num_positions_used():
            self._num_positions_ = zserio_context.num_positions.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
            # check constraint
            if not (self._num_positions_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.numPositions!")
        else:
            self._num_positions_ = None

        if self.is_positions_used():
            self._positions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions(self)), zserio_reader, self._num_positions_)
        else:
            self._positions_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.type!")
        self._type_.write(zserio_writer)

        if self.is_num_positions_used():
            # check constraint
            if not (self._num_positions_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.numPositions!")
            zserio_writer.write_varsize(self._num_positions_)

        if self.is_positions_used():
            # check array length
            if len(self._positions_) != (self._num_positions_):
                raise zserio.PythonRuntimeException("Wrong array length for field DisplayLinePositionValidity.positions: "
                                                    f"{len(self._positions_)} != {self._num_positions_}!")
            self._positions_.write(zserio_writer)

    def write_packed(self, zserio_context: DisplayLinePositionValidity.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._type_ != nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.type!")
        self._type_.write_packed(zserio_context.type, zserio_writer)

        if self.is_num_positions_used():
            # check constraint
            if not (self._num_positions_ > 0):
                raise zserio.PythonRuntimeException("Constraint violated for field DisplayLinePositionValidity.numPositions!")
            zserio_context.num_positions.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_positions_)

        if self.is_positions_used():
            # check array length
            if len(self._positions_) != (self._num_positions_):
                raise zserio.PythonRuntimeException("Wrong array length for field DisplayLinePositionValidity.positions: "
                                                    f"{len(self._positions_)} != {self._num_positions_}!")
            self._positions_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._type_ = zserio.array.DeltaContext()
            self._num_positions_ = zserio.array.DeltaContext()

        @property
        def type(self):
            return self._type_

        @property
        def num_positions(self):
            return self._num_positions_

    class _ZserioElementFactory_positions:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice:
            del zserio_index
            return nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice.from_reader(zserio_reader, self._owner._type_, self._owner._shift_)

        @staticmethod
        def create_packing_context() -> nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice.ZserioPackingContext:
            return nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice:
            del zserio_index
            return nds.display.reference.types.display_line_position_choice.DisplayLinePositionChoice.from_reader_packed(zserio_context, zserio_reader, self._owner._type_, self._owner._shift_)
