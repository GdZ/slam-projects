# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.parking.parking_row
import nds.venue.parking.parking_section_connector
import nds.venue.reference.types.parking_section_id

class ParkingSection:
    def __init__(
            self,
            id_: typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None] = None,
            rows_: typing.List[nds.venue.parking.parking_row.ParkingRow] = None,
            connected_sections_: typing.Optional[typing.List[nds.venue.parking.parking_section_connector.ParkingSectionConnector]] = None) -> None:
        self._id_ = id_
        self._rows_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_rows()), rows_, is_auto=True)
        if connected_sections_ is None:
            self._connected_sections_ = None
        else:
            self._connected_sections_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_sections()), connected_sections_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingSection'],
            zserio_reader: zserio.BitStreamReader) -> 'ParkingSection':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingSection'],
            zserio_context: ParkingSection.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ParkingSection':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingSection):
            return ((self._id_ == other._id_) and
                    (self._rows_ == other._rows_) and
                    (not other.is_connected_sections_used() if not self.is_connected_sections_used() else (self._connected_sections_ == other._connected_sections_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._rows_)
        if self.is_connected_sections_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._connected_sections_)

        return result

    @property
    def id(self) -> typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None]:
        return self._id_

    @id.setter
    def id(self, id_: typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None]) -> None:
        self._id_ = id_

    @property
    def rows(self) -> typing.List[nds.venue.parking.parking_row.ParkingRow]:
        return self._rows_.raw_array

    @rows.setter
    def rows(self, rows_: typing.List[nds.venue.parking.parking_row.ParkingRow]) -> None:
        self._rows_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_rows()), rows_, is_auto=True)

    @property
    def connected_sections(self) -> typing.Optional[typing.List[nds.venue.parking.parking_section_connector.ParkingSectionConnector]]:
        return None if self._connected_sections_ is None else self._connected_sections_.raw_array

    @connected_sections.setter
    def connected_sections(self, connected_sections_: typing.Optional[typing.List[nds.venue.parking.parking_section_connector.ParkingSectionConnector]]) -> None:
        if connected_sections_ is None:
            self._connected_sections_ = None
        else:
            self._connected_sections_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_sections()), connected_sections_, is_auto=True)

    def is_connected_sections_used(self) -> bool:
        return self.is_connected_sections_set()

    def is_connected_sections_set(self) -> bool:
        return not self._connected_sections_ is None

    def reset_connected_sections(self) -> None:
        self._connected_sections_ = None

    def init_packing_context(self, zserio_context: ParkingSection.ZserioPackingContext) -> None:
        self._id_.init_packing_context(zserio_context.id)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof(end_bitposition)
        end_bitposition += self._rows_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_connected_sections_used():
            end_bitposition += self._connected_sections_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingSection.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof_packed(zserio_context.id, end_bitposition)
        end_bitposition += self._rows_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        if self.is_connected_sections_used():
            end_bitposition += self._connected_sections_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets(end_bitposition)
        end_bitposition = self._rows_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_connected_sections_used():
            end_bitposition = self._connected_sections_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingSection.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets_packed(zserio_context.id, end_bitposition)
        end_bitposition = self._rows_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        if self.is_connected_sections_used():
            end_bitposition = self._connected_sections_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.venue.reference.types.parking_section_id.ParkingSectionId.from_reader(zserio_reader)
        self._rows_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_rows()), zserio_reader, is_auto=True)
        if zserio_reader.read_bool():
            self._connected_sections_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_sections()), zserio_reader, is_auto=True)
        else:
            self._connected_sections_ = None

    def read_packed(self, zserio_context: ParkingSection.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.venue.reference.types.parking_section_id.ParkingSectionId.from_reader_packed(zserio_context.id, zserio_reader)

        self._rows_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_rows()), zserio_reader, is_auto=True)

        if zserio_reader.read_bool():
            self._connected_sections_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_sections()), zserio_reader, is_auto=True)
        else:
            self._connected_sections_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write(zserio_writer)
        self._rows_.write(zserio_writer)
        if self.is_connected_sections_used():
            zserio_writer.write_bool(True)
            self._connected_sections_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: ParkingSection.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write_packed(zserio_context.id, zserio_writer)

        self._rows_.write_packed(zserio_writer)

        if self.is_connected_sections_used():
            zserio_writer.write_bool(True)
            self._connected_sections_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = nds.venue.reference.types.parking_section_id.ParkingSectionId.ZserioPackingContext()

        @property
        def id(self):
            return self._id_

    class _ZserioElementFactory_rows:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_row.ParkingRow:
            del zserio_index
            return nds.venue.parking.parking_row.ParkingRow.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.venue.parking.parking_row.ParkingRow.ZserioPackingContext:
            return nds.venue.parking.parking_row.ParkingRow.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.venue.parking.parking_row.ParkingRow.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_row.ParkingRow:
            del zserio_index
            return nds.venue.parking.parking_row.ParkingRow.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_connected_sections:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_section_connector.ParkingSectionConnector:
            del zserio_index
            return nds.venue.parking.parking_section_connector.ParkingSectionConnector.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.venue.parking.parking_section_connector.ParkingSectionConnector.ZserioPackingContext:
            return nds.venue.parking.parking_section_connector.ParkingSectionConnector.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.venue.parking.parking_section_connector.ParkingSectionConnector.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_section_connector.ParkingSectionConnector:
            del zserio_index
            return nds.venue.parking.parking_section_connector.ParkingSectionConnector.from_reader_packed(zserio_context, zserio_reader)
