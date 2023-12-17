# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.parking.parking_level_connector
import nds.venue.parking.parking_section
import nds.venue.reference.types.parking_level_id

class ParkingLevel:
    def __init__(
            self,
            id_: typing.Union[nds.venue.reference.types.parking_level_id.ParkingLevelId, None] = None,
            sections_: typing.List[nds.venue.parking.parking_section.ParkingSection] = None,
            connected_levels_: typing.Optional[typing.List[nds.venue.parking.parking_level_connector.ParkingLevelConnector]] = None) -> None:
        self._id_ = id_
        self._sections_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sections()), sections_, is_auto=True)
        if connected_levels_ is None:
            self._connected_levels_ = None
        else:
            self._connected_levels_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_levels()), connected_levels_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingLevel'],
            zserio_reader: zserio.BitStreamReader) -> 'ParkingLevel':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingLevel'],
            zserio_context: ParkingLevel.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ParkingLevel':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingLevel):
            return ((self._id_ == other._id_) and
                    (self._sections_ == other._sections_) and
                    (not other.is_connected_levels_used() if not self.is_connected_levels_used() else (self._connected_levels_ == other._connected_levels_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._sections_)
        if self.is_connected_levels_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._connected_levels_)

        return result

    @property
    def id(self) -> typing.Union[nds.venue.reference.types.parking_level_id.ParkingLevelId, None]:
        return self._id_

    @id.setter
    def id(self, id_: typing.Union[nds.venue.reference.types.parking_level_id.ParkingLevelId, None]) -> None:
        self._id_ = id_

    @property
    def sections(self) -> typing.List[nds.venue.parking.parking_section.ParkingSection]:
        return self._sections_.raw_array

    @sections.setter
    def sections(self, sections_: typing.List[nds.venue.parking.parking_section.ParkingSection]) -> None:
        self._sections_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sections()), sections_, is_auto=True)

    @property
    def connected_levels(self) -> typing.Optional[typing.List[nds.venue.parking.parking_level_connector.ParkingLevelConnector]]:
        return None if self._connected_levels_ is None else self._connected_levels_.raw_array

    @connected_levels.setter
    def connected_levels(self, connected_levels_: typing.Optional[typing.List[nds.venue.parking.parking_level_connector.ParkingLevelConnector]]) -> None:
        if connected_levels_ is None:
            self._connected_levels_ = None
        else:
            self._connected_levels_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_levels()), connected_levels_, is_auto=True)

    def is_connected_levels_used(self) -> bool:
        return self.is_connected_levels_set()

    def is_connected_levels_set(self) -> bool:
        return not self._connected_levels_ is None

    def reset_connected_levels(self) -> None:
        self._connected_levels_ = None

    def init_packing_context(self, zserio_context: ParkingLevel.ZserioPackingContext) -> None:
        self._id_.init_packing_context(zserio_context.id)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof(end_bitposition)
        end_bitposition += self._sections_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_connected_levels_used():
            end_bitposition += self._connected_levels_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingLevel.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof_packed(zserio_context.id, end_bitposition)
        end_bitposition += self._sections_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        if self.is_connected_levels_used():
            end_bitposition += self._connected_levels_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets(end_bitposition)
        end_bitposition = self._sections_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_connected_levels_used():
            end_bitposition = self._connected_levels_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingLevel.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets_packed(zserio_context.id, end_bitposition)
        end_bitposition = self._sections_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        if self.is_connected_levels_used():
            end_bitposition = self._connected_levels_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.venue.reference.types.parking_level_id.ParkingLevelId.from_reader(zserio_reader)
        self._sections_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sections()), zserio_reader, is_auto=True)
        if zserio_reader.read_bool():
            self._connected_levels_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_levels()), zserio_reader, is_auto=True)
        else:
            self._connected_levels_ = None

    def read_packed(self, zserio_context: ParkingLevel.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.venue.reference.types.parking_level_id.ParkingLevelId.from_reader_packed(zserio_context.id, zserio_reader)

        self._sections_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sections()), zserio_reader, is_auto=True)

        if zserio_reader.read_bool():
            self._connected_levels_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_connected_levels()), zserio_reader, is_auto=True)
        else:
            self._connected_levels_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write(zserio_writer)
        self._sections_.write(zserio_writer)
        if self.is_connected_levels_used():
            zserio_writer.write_bool(True)
            self._connected_levels_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: ParkingLevel.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write_packed(zserio_context.id, zserio_writer)

        self._sections_.write_packed(zserio_writer)

        if self.is_connected_levels_used():
            zserio_writer.write_bool(True)
            self._connected_levels_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = nds.venue.reference.types.parking_level_id.ParkingLevelId.ZserioPackingContext()

        @property
        def id(self):
            return self._id_

    class _ZserioElementFactory_sections:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_section.ParkingSection:
            del zserio_index
            return nds.venue.parking.parking_section.ParkingSection.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.venue.parking.parking_section.ParkingSection.ZserioPackingContext:
            return nds.venue.parking.parking_section.ParkingSection.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.venue.parking.parking_section.ParkingSection.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_section.ParkingSection:
            del zserio_index
            return nds.venue.parking.parking_section.ParkingSection.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_connected_levels:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_level_connector.ParkingLevelConnector:
            del zserio_index
            return nds.venue.parking.parking_level_connector.ParkingLevelConnector.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.venue.parking.parking_level_connector.ParkingLevelConnector.ZserioPackingContext:
            return nds.venue.parking.parking_level_connector.ParkingLevelConnector.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.venue.parking.parking_level_connector.ParkingLevelConnector.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.parking.parking_level_connector.ParkingLevelConnector:
            del zserio_index
            return nds.venue.parking.parking_level_connector.ParkingLevelConnector.from_reader_packed(zserio_context, zserio_reader)
