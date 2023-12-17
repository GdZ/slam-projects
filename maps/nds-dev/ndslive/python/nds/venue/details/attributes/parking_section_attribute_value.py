# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.details.attributes.parking_section_attribute_type
import nds.venue.details.types.parking_section_type
import nds.venue.details.types.prohibited_access

class ParkingSectionAttributeValue:
    def __init__(
            self,
            type_: nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType,
            *,
            parking_section_type_: typing.Union[nds.venue.details.types.parking_section_type.ParkingSectionType, None] = None,
            prohibited_access_: typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if parking_section_type_ is not None:
            self._choice = parking_section_type_
        if prohibited_access_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingSectionAttributeValue is ambiguous!")
            self._choice = prohibited_access_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingSectionAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType) -> 'ParkingSectionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingSectionAttributeValue'],
            zserio_context: ParkingSectionAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType) -> 'ParkingSectionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingSectionAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType:
        return self._type_

    @property
    def parking_section_type(self) -> typing.Union[nds.venue.details.types.parking_section_type.ParkingSectionType, None]:
        return self._choice

    @parking_section_type.setter
    def parking_section_type(self, parking_section_type_: typing.Union[nds.venue.details.types.parking_section_type.ParkingSectionType, None]) -> None:
        self._choice = parking_section_type_

    @property
    def prohibited_access(self) -> typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None]:
        return self._choice

    @prohibited_access.setter
    def prohibited_access(self, prohibited_access_: typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None]) -> None:
        self._choice = prohibited_access_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            return self.CHOICE_PARKING_SECTION_TYPE
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            return self.CHOICE_PROHIBITED_ACCESS
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: ParkingSectionAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            self._choice.init_packing_context(zserio_context.parking_section_type)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            pass
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingSectionAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.parking_section_type, end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingSectionAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.parking_section_type, end_bitposition)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            self._choice = nds.venue.details.types.parking_section_type.ParkingSectionType.from_reader(zserio_reader)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            self._choice = nds.venue.details.types.prohibited_access.ProhibitedAccess.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

    def read_packed(self, zserio_context: ParkingSectionAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            self._choice = nds.venue.details.types.parking_section_type.ParkingSectionType.from_reader_packed(zserio_context.parking_section_type, zserio_reader)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            self._choice = nds.venue.details.types.prohibited_access.ProhibitedAccess.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

    def write_packed(self, zserio_context: ParkingSectionAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PARKING_SECTION_TYPE):
            self._choice.write_packed(zserio_context.parking_section_type, zserio_writer)
        elif selector == (nds.venue.details.attributes.parking_section_attribute_type.ParkingSectionAttributeType.PROHIBITED_ACCESS):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingSectionAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._parking_section_type_ = zserio.array.DeltaContext()

        @property
        def parking_section_type(self):
            return self._parking_section_type_

    CHOICE_PARKING_SECTION_TYPE = 0
    CHOICE_PROHIBITED_ACCESS = 1
    UNDEFINED_CHOICE = -1