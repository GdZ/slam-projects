# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.details.attributes.parking_level_attribute_type
import nds.venue.details.types.parking_level_name
import nds.venue.details.types.parking_level_slope
import nds.venue.details.types.prohibited_access

class ParkingLevelAttributeValue:
    def __init__(
            self,
            type_: nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType,
            *,
            parking_level_name_: typing.Union[nds.venue.details.types.parking_level_name.ParkingLevelName, None] = None,
            prohibited_access_: typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None] = None,
            slope_: typing.Union[nds.venue.details.types.parking_level_slope.ParkingLevelSlope, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if parking_level_name_ is not None:
            self._choice = parking_level_name_
        if prohibited_access_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingLevelAttributeValue is ambiguous!")
            self._choice = prohibited_access_
        if slope_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingLevelAttributeValue is ambiguous!")
            self._choice = slope_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingLevelAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType) -> 'ParkingLevelAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingLevelAttributeValue'],
            zserio_context: ParkingLevelAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType) -> 'ParkingLevelAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingLevelAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType:
        return self._type_

    @property
    def parking_level_name(self) -> nds.venue.details.types.parking_level_name.ParkingLevelName:
        return self._choice

    @parking_level_name.setter
    def parking_level_name(self, parking_level_name_: nds.venue.details.types.parking_level_name.ParkingLevelName) -> None:
        self._choice = parking_level_name_

    @property
    def prohibited_access(self) -> typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None]:
        return self._choice

    @prohibited_access.setter
    def prohibited_access(self, prohibited_access_: typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None]) -> None:
        self._choice = prohibited_access_

    @property
    def slope(self) -> nds.venue.details.types.parking_level_slope.ParkingLevelSlope:
        return self._choice

    @slope.setter
    def slope(self, slope_: nds.venue.details.types.parking_level_slope.ParkingLevelSlope) -> None:
        self._choice = slope_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            return self.CHOICE_PARKING_LEVEL_NAME
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            return self.CHOICE_PROHIBITED_ACCESS
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            return self.CHOICE_SLOPE
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: ParkingLevelAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            pass
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            pass
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            zserio_context.slope.init(zserio.array.VarUInt16ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingLevelAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            end_bitposition += zserio_context.slope.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingLevelAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            end_bitposition += zserio_context.slope.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            self._choice = nds.venue.details.types.prohibited_access.ProhibitedAccess.from_reader(zserio_reader)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            self._choice = zserio_reader.read_varuint16()
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

    def read_packed(self, zserio_context: ParkingLevelAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            self._choice = nds.venue.details.types.prohibited_access.ProhibitedAccess.from_reader(zserio_reader)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            self._choice = zserio_context.slope.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            zserio_writer.write_varuint16(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

    def write_packed(self, zserio_context: ParkingLevelAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PROHIBITED_ACCESS):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.details.attributes.parking_level_attribute_type.ParkingLevelAttributeType.PARKING_LEVEL_SLOPE):
            zserio_context.slope.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingLevelAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._slope_ = zserio.array.DeltaContext()

        @property
        def slope(self):
            return self._slope_

    CHOICE_PARKING_LEVEL_NAME = 0
    CHOICE_PROHIBITED_ACCESS = 1
    CHOICE_SLOPE = 2
    UNDEFINED_CHOICE = -1