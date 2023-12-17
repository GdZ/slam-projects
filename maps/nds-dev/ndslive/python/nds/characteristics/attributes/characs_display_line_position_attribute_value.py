# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.characteristics.attributes.characs_display_line_position_attribute_type
import nds.characteristics.types.stationary_object_type
import nds.characteristics.types.stop_line
import nds.characteristics.types.waiting_line

class CharacsDisplayLinePositionAttributeValue:
    def __init__(
            self,
            type_: nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType,
            *,
            stop_line_: typing.Union[nds.characteristics.types.stop_line.StopLine, None] = None,
            waiting_line_: typing.Union[nds.characteristics.types.waiting_line.WaitingLine, None] = None,
            stationary_object_type_: typing.Union[nds.characteristics.types.stationary_object_type.StationaryObjectType, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if stop_line_ is not None:
            self._choice = stop_line_
        if waiting_line_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CharacsDisplayLinePositionAttributeValue is ambiguous!")
            self._choice = waiting_line_
        if stationary_object_type_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CharacsDisplayLinePositionAttributeValue is ambiguous!")
            self._choice = stationary_object_type_

    @classmethod
    def from_reader(
            cls: typing.Type['CharacsDisplayLinePositionAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType) -> 'CharacsDisplayLinePositionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['CharacsDisplayLinePositionAttributeValue'],
            zserio_context: CharacsDisplayLinePositionAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType) -> 'CharacsDisplayLinePositionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, CharacsDisplayLinePositionAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType:
        return self._type_

    @property
    def stop_line(self) -> typing.Union[nds.characteristics.types.stop_line.StopLine, None]:
        return self._choice

    @stop_line.setter
    def stop_line(self, stop_line_: typing.Union[nds.characteristics.types.stop_line.StopLine, None]) -> None:
        self._choice = stop_line_

    @property
    def waiting_line(self) -> typing.Union[nds.characteristics.types.waiting_line.WaitingLine, None]:
        return self._choice

    @waiting_line.setter
    def waiting_line(self, waiting_line_: typing.Union[nds.characteristics.types.waiting_line.WaitingLine, None]) -> None:
        self._choice = waiting_line_

    @property
    def stationary_object_type(self) -> typing.Union[nds.characteristics.types.stationary_object_type.StationaryObjectType, None]:
        return self._choice

    @stationary_object_type.setter
    def stationary_object_type(self, stationary_object_type_: typing.Union[nds.characteristics.types.stationary_object_type.StationaryObjectType, None]) -> None:
        self._choice = stationary_object_type_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            return self.CHOICE_STOP_LINE
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            return self.CHOICE_WAITING_LINE
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            return self.CHOICE_STATIONARY_OBJECT_TYPE
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: CharacsDisplayLinePositionAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            pass
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            pass
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            self._choice.init_packing_context(zserio_context.stationary_object_type)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: CharacsDisplayLinePositionAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.stationary_object_type, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: CharacsDisplayLinePositionAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.stationary_object_type, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            self._choice = nds.characteristics.types.stop_line.StopLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            self._choice = nds.characteristics.types.waiting_line.WaitingLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            self._choice = nds.characteristics.types.stationary_object_type.StationaryObjectType.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

    def read_packed(self, zserio_context: CharacsDisplayLinePositionAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            self._choice = nds.characteristics.types.stop_line.StopLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            self._choice = nds.characteristics.types.waiting_line.WaitingLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            self._choice = nds.characteristics.types.stationary_object_type.StationaryObjectType.from_reader_packed(zserio_context.stationary_object_type, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

    def write_packed(self, zserio_context: CharacsDisplayLinePositionAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STOP_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.WAITING_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_display_line_position_attribute_type.CharacsDisplayLinePositionAttributeType.STATION):
            self._choice.write_packed(zserio_context.stationary_object_type, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsDisplayLinePositionAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._stationary_object_type_ = zserio.array.DeltaContext()

        @property
        def stationary_object_type(self):
            return self._stationary_object_type_

    CHOICE_STOP_LINE = 0
    CHOICE_WAITING_LINE = 1
    CHOICE_STATIONARY_OBJECT_TYPE = 2
    UNDEFINED_CHOICE = -1
