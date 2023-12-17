# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.parking.parking_range_relation_type
import nds.venue.reference.types.parking_row_id
import nds.venue.reference.types.parking_section_id

class ParkingRangeRelationValue:
    def __init__(
            self,
            type_: nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType,
            *,
            section_id_: typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None] = None,
            parking_row_id_: typing.Union[nds.venue.reference.types.parking_row_id.ParkingRowId, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if section_id_ is not None:
            self._choice = section_id_
        if parking_row_id_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingRangeRelationValue is ambiguous!")
            self._choice = parking_row_id_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingRangeRelationValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType) -> 'ParkingRangeRelationValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingRangeRelationValue'],
            zserio_context: ParkingRangeRelationValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType) -> 'ParkingRangeRelationValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingRangeRelationValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType:
        return self._type_

    @property
    def section_id(self) -> typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None]:
        return self._choice

    @section_id.setter
    def section_id(self, section_id_: typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None]) -> None:
        self._choice = section_id_

    @property
    def parking_row_id(self) -> typing.Union[nds.venue.reference.types.parking_row_id.ParkingRowId, None]:
        return self._choice

    @parking_row_id.setter
    def parking_row_id(self, parking_row_id_: typing.Union[nds.venue.reference.types.parking_row_id.ParkingRowId, None]) -> None:
        self._choice = parking_row_id_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            return self.CHOICE_SECTION_ID
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            return self.CHOICE_PARKING_ROW_ID
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: ParkingRangeRelationValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            self._choice.init_packing_context(zserio_context.section_id)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            self._choice.init_packing_context(zserio_context.parking_row_id)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingRangeRelationValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.section_id, end_bitposition)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.parking_row_id, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingRangeRelationValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.section_id, end_bitposition)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.parking_row_id, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            self._choice = nds.venue.reference.types.parking_section_id.ParkingSectionId.from_reader(zserio_reader)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            self._choice = nds.venue.reference.types.parking_row_id.ParkingRowId.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

    def read_packed(self, zserio_context: ParkingRangeRelationValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            self._choice = nds.venue.reference.types.parking_section_id.ParkingSectionId.from_reader_packed(zserio_context.section_id, zserio_reader)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            self._choice = nds.venue.reference.types.parking_row_id.ParkingRowId.from_reader_packed(zserio_context.parking_row_id, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

    def write_packed(self, zserio_context: ParkingRangeRelationValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.PART_OF_SECTION):
            self._choice.write_packed(zserio_context.section_id, zserio_writer)
        elif selector == (nds.venue.parking.parking_range_relation_type.ParkingRangeRelationType.ACCESS_PARKING_ROW):
            self._choice.write_packed(zserio_context.parking_row_id, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingRangeRelationValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._section_id_ = nds.venue.reference.types.parking_section_id.ParkingSectionId.ZserioPackingContext()
            self._parking_row_id_ = nds.venue.reference.types.parking_row_id.ParkingRowId.ZserioPackingContext()

        @property
        def section_id(self):
            return self._section_id_

        @property
        def parking_row_id(self):
            return self._parking_row_id_

    CHOICE_SECTION_ID = 0
    CHOICE_PARKING_ROW_ID = 1
    UNDEFINED_CHOICE = -1
