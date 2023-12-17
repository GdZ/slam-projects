# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.display.reference.types.curved_label_positioning_hint
import nds.display.reference.types.display_line_geometry_offset_position
import nds.display.reference.types.display_line_geometry_position
import nds.display.reference.types.display_line_percentage_position
import nds.display.reference.types.display_line_validity_position
import nds.display.reference.types.display_line_validity_type

class DisplayLinePositionChoice:
    def __init__(
            self,
            type_: nds.display.reference.types.display_line_validity_type.DisplayLineValidityType,
            shift_: nds.core.geometry.coord_shift.CoordShift,
            *,
            validity_position_: typing.Union[nds.display.reference.types.display_line_validity_position.DisplayLineValidityPosition, None] = None,
            geometry_position_: typing.Union[nds.display.reference.types.display_line_geometry_position.DisplayLineGeometryPosition, None] = None,
            geometry_offset_position_: typing.Union[nds.display.reference.types.display_line_geometry_offset_position.DisplayLineGeometryOffsetPosition, None] = None,
            percentage_position_: typing.Union[nds.display.reference.types.display_line_percentage_position.DisplayLinePercentagePosition, None] = None,
            curved_label_positioning_hint_: typing.Union[nds.display.reference.types.curved_label_positioning_hint.CurvedLabelPositioningHint, None] = None) -> None:
        self._type_ = type_
        self._shift_ = shift_
        self._choice: typing.Any = None
        if validity_position_ is not None:
            self._choice = validity_position_
        if geometry_position_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice DisplayLinePositionChoice is ambiguous!")
            self._choice = geometry_position_
        if geometry_offset_position_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice DisplayLinePositionChoice is ambiguous!")
            self._choice = geometry_offset_position_
        if percentage_position_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice DisplayLinePositionChoice is ambiguous!")
            self._choice = percentage_position_
        if curved_label_positioning_hint_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice DisplayLinePositionChoice is ambiguous!")
            self._choice = curved_label_positioning_hint_

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayLinePositionChoice'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.display.reference.types.display_line_validity_type.DisplayLineValidityType,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLinePositionChoice':
        self = object.__new__(cls)
        self._type_ = type_
        self._shift_ = shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayLinePositionChoice'],
            zserio_context: DisplayLinePositionChoice.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.display.reference.types.display_line_validity_type.DisplayLineValidityType,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLinePositionChoice':
        self = object.__new__(cls)
        self._type_ = type_
        self._shift_ = shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLinePositionChoice):
            return (self._type_ == other._type_ and
                    self._shift_ == other._shift_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            result = zserio.hashcode.calc_hashcode_int64(result, self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.display.reference.types.display_line_validity_type.DisplayLineValidityType:
        return self._type_

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @property
    def validity_position(self) -> typing.Union[nds.display.reference.types.display_line_validity_position.DisplayLineValidityPosition, None]:
        return self._choice

    @validity_position.setter
    def validity_position(self, validity_position_: typing.Union[nds.display.reference.types.display_line_validity_position.DisplayLineValidityPosition, None]) -> None:
        self._choice = validity_position_

    @property
    def geometry_position(self) -> nds.display.reference.types.display_line_geometry_position.DisplayLineGeometryPosition:
        return self._choice

    @geometry_position.setter
    def geometry_position(self, geometry_position_: nds.display.reference.types.display_line_geometry_position.DisplayLineGeometryPosition) -> None:
        self._choice = geometry_position_

    @property
    def geometry_offset_position(self) -> typing.Union[nds.display.reference.types.display_line_geometry_offset_position.DisplayLineGeometryOffsetPosition, None]:
        return self._choice

    @geometry_offset_position.setter
    def geometry_offset_position(self, geometry_offset_position_: typing.Union[nds.display.reference.types.display_line_geometry_offset_position.DisplayLineGeometryOffsetPosition, None]) -> None:
        self._choice = geometry_offset_position_

    @property
    def percentage_position(self) -> typing.Union[nds.display.reference.types.display_line_percentage_position.DisplayLinePercentagePosition, None]:
        return self._choice

    @percentage_position.setter
    def percentage_position(self, percentage_position_: typing.Union[nds.display.reference.types.display_line_percentage_position.DisplayLinePercentagePosition, None]) -> None:
        self._choice = percentage_position_

    @property
    def curved_label_positioning_hint(self) -> typing.Union[nds.display.reference.types.curved_label_positioning_hint.CurvedLabelPositioningHint, None]:
        return self._choice

    @curved_label_positioning_hint.setter
    def curved_label_positioning_hint(self, curved_label_positioning_hint_: typing.Union[nds.display.reference.types.curved_label_positioning_hint.CurvedLabelPositioningHint, None]) -> None:
        self._choice = curved_label_positioning_hint_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            return self.UNDEFINED_CHOICE
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            return self.CHOICE_VALIDITY_POSITION
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            return self.CHOICE_GEOMETRY_POSITION
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            return self.CHOICE_GEOMETRY_OFFSET_POSITION
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            return self.CHOICE_PERCENTAGE_POSITION
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            return self.CHOICE_CURVED_LABEL_POSITIONING_HINT
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: DisplayLinePositionChoice.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            self._choice.init_packing_context(zserio_context.validity_position)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            zserio_context.geometry_position.init(zserio.array.VarSizeArrayTraits(), self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            self._choice.init_packing_context(zserio_context.geometry_offset_position)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            self._choice.init_packing_context(zserio_context.percentage_position)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            self._choice.init_packing_context(zserio_context.curved_label_positioning_hint)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayLinePositionChoice.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.validity_position, end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            end_bitposition += zserio_context.geometry_position.bitsizeof(zserio.array.VarSizeArrayTraits(), self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.geometry_offset_position, end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.percentage_position, end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.curved_label_positioning_hint, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayLinePositionChoice.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.validity_position, end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            end_bitposition += zserio_context.geometry_position.bitsizeof(zserio.array.VarSizeArrayTraits(), self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.geometry_offset_position, end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.percentage_position, end_bitposition)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.curved_label_positioning_hint, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            self._choice = nds.display.reference.types.display_line_validity_position.DisplayLineValidityPosition.from_reader(zserio_reader, self._shift_)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            self._choice = zserio_reader.read_varsize()
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            self._choice = nds.display.reference.types.display_line_geometry_offset_position.DisplayLineGeometryOffsetPosition.from_reader(zserio_reader, self._shift_)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            self._choice = nds.display.reference.types.display_line_percentage_position.DisplayLinePercentagePosition.from_reader(zserio_reader)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            self._choice = nds.display.reference.types.curved_label_positioning_hint.CurvedLabelPositioningHint.from_reader(zserio_reader, self._shift_)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

    def read_packed(self, zserio_context: DisplayLinePositionChoice.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            self._choice = nds.display.reference.types.display_line_validity_position.DisplayLineValidityPosition.from_reader_packed(zserio_context.validity_position, zserio_reader, self._shift_)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            self._choice = zserio_context.geometry_position.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            self._choice = nds.display.reference.types.display_line_geometry_offset_position.DisplayLineGeometryOffsetPosition.from_reader_packed(zserio_context.geometry_offset_position, zserio_reader, self._shift_)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            self._choice = nds.display.reference.types.display_line_percentage_position.DisplayLinePercentagePosition.from_reader_packed(zserio_context.percentage_position, zserio_reader)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            self._choice = nds.display.reference.types.curved_label_positioning_hint.CurvedLabelPositioningHint.from_reader_packed(zserio_context.curved_label_positioning_hint, zserio_reader, self._shift_)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLinePositionChoice.validityPosition: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write(zserio_writer)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            zserio_writer.write_varsize(self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLinePositionChoice.geometryOffsetPosition: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write(zserio_writer)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            self._choice.write(zserio_writer)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLinePositionChoice.curvedLabelPositioningHint: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

    def write_packed(self, zserio_context: DisplayLinePositionChoice.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.COMPLETE):
            pass
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.POSITION):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLinePositionChoice.validityPosition: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write_packed(zserio_context.validity_position, zserio_writer)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY):
            zserio_context.geometry_position.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.GEOMETRY_OFFSET):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLinePositionChoice.geometryOffsetPosition: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write_packed(zserio_context.geometry_offset_position, zserio_writer)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.PERCENTAGE):
            self._choice.write_packed(zserio_context.percentage_position, zserio_writer)
        elif selector == (nds.display.reference.types.display_line_validity_type.DisplayLineValidityType.CURVED_LABEL_POSITIONING_HINT):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLinePositionChoice.curvedLabelPositioningHint: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write_packed(zserio_context.curved_label_positioning_hint, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayLinePositionChoice!")

    class ZserioPackingContext:
        def __init__(self):
            self._validity_position_ = nds.display.reference.types.display_line_validity_position.DisplayLineValidityPosition.ZserioPackingContext()
            self._geometry_position_ = zserio.array.DeltaContext()
            self._geometry_offset_position_ = nds.display.reference.types.display_line_geometry_offset_position.DisplayLineGeometryOffsetPosition.ZserioPackingContext()
            self._percentage_position_ = nds.display.reference.types.display_line_percentage_position.DisplayLinePercentagePosition.ZserioPackingContext()
            self._curved_label_positioning_hint_ = nds.display.reference.types.curved_label_positioning_hint.CurvedLabelPositioningHint.ZserioPackingContext()

        @property
        def validity_position(self):
            return self._validity_position_

        @property
        def geometry_position(self):
            return self._geometry_position_

        @property
        def geometry_offset_position(self):
            return self._geometry_offset_position_

        @property
        def percentage_position(self):
            return self._percentage_position_

        @property
        def curved_label_positioning_hint(self):
            return self._curved_label_positioning_hint_

    CHOICE_VALIDITY_POSITION = 0
    CHOICE_GEOMETRY_POSITION = 1
    CHOICE_GEOMETRY_OFFSET_POSITION = 2
    CHOICE_PERCENTAGE_POSITION = 3
    CHOICE_CURVED_LABEL_POSITIONING_HINT = 4
    UNDEFINED_CHOICE = -1