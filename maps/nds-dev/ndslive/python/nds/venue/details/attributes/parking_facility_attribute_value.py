# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.details.attributes.parking_facility_attribute_type
import nds.venue.details.types.parking_facility_size
import nds.venue.details.types.prohibited_access

class ParkingFacilityAttributeValue:
    def __init__(
            self,
            type_: nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType,
            *,
            size_: typing.Union[nds.venue.details.types.parking_facility_size.ParkingFacilitySize, None] = None,
            prohibited_access_: typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if size_ is not None:
            self._choice = size_
        if prohibited_access_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingFacilityAttributeValue is ambiguous!")
            self._choice = prohibited_access_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingFacilityAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType) -> 'ParkingFacilityAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingFacilityAttributeValue'],
            zserio_context: ParkingFacilityAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType) -> 'ParkingFacilityAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingFacilityAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType:
        return self._type_

    @property
    def size(self) -> nds.venue.details.types.parking_facility_size.ParkingFacilitySize:
        return self._choice

    @size.setter
    def size(self, size_: nds.venue.details.types.parking_facility_size.ParkingFacilitySize) -> None:
        self._choice = size_

    @property
    def prohibited_access(self) -> typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None]:
        return self._choice

    @prohibited_access.setter
    def prohibited_access(self, prohibited_access_: typing.Union[nds.venue.details.types.prohibited_access.ProhibitedAccess, None]) -> None:
        self._choice = prohibited_access_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            return self.CHOICE_SIZE
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            return self.CHOICE_PROHIBITED_ACCESS
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: ParkingFacilityAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            zserio_context.size.init(zserio.array.VarUInt16ArrayTraits(), self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            pass
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingFacilityAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            end_bitposition += zserio_context.size.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingFacilityAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            end_bitposition += zserio_context.size.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            self._choice = zserio_reader.read_varuint16()
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            self._choice = nds.venue.details.types.prohibited_access.ProhibitedAccess.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

    def read_packed(self, zserio_context: ParkingFacilityAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            self._choice = zserio_context.size.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            self._choice = nds.venue.details.types.prohibited_access.ProhibitedAccess.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            zserio_writer.write_varuint16(self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

    def write_packed(self, zserio_context: ParkingFacilityAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PARKING_FACILITY_SIZE):
            zserio_context.size.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.PROHIBITED_ACCESS):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingFacilityAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._size_ = zserio.array.DeltaContext()

        @property
        def size(self):
            return self._size_

    CHOICE_SIZE = 0
    CHOICE_PROHIBITED_ACCESS = 1
    UNDEFINED_CHOICE = -1
