# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.reference.types.parking_spot_id

class ParkingSpot:
    def __init__(
            self,
            id_: typing.Union[nds.venue.reference.types.parking_spot_id.ParkingSpotId, None] = None) -> None:
        self._id_ = id_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingSpot'],
            zserio_reader: zserio.BitStreamReader) -> 'ParkingSpot':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingSpot'],
            zserio_context: ParkingSpot.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ParkingSpot':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingSpot):
            return (self._id_ == other._id_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._id_)

        return result

    @property
    def id(self) -> typing.Union[nds.venue.reference.types.parking_spot_id.ParkingSpotId, None]:
        return self._id_

    @id.setter
    def id(self, id_: typing.Union[nds.venue.reference.types.parking_spot_id.ParkingSpotId, None]) -> None:
        self._id_ = id_

    def init_packing_context(self, zserio_context: ParkingSpot.ZserioPackingContext) -> None:
        self._id_.init_packing_context(zserio_context.id)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingSpot.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof_packed(zserio_context.id, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingSpot.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets_packed(zserio_context.id, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.venue.reference.types.parking_spot_id.ParkingSpotId.from_reader(zserio_reader)

    def read_packed(self, zserio_context: ParkingSpot.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.venue.reference.types.parking_spot_id.ParkingSpotId.from_reader_packed(zserio_context.id, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write(zserio_writer)

    def write_packed(self, zserio_context: ParkingSpot.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write_packed(zserio_context.id, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = nds.venue.reference.types.parking_spot_id.ParkingSpotId.ZserioPackingContext()

        @property
        def id(self):
            return self._id_