# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.parking.road_network_access_type
import nds.venue.reference.types.parking_facility_id

class RoadNetworkAccess:
    def __init__(
            self,
            facility_id_: typing.Union[nds.venue.reference.types.parking_facility_id.ParkingFacilityId, None] = None,
            type_: typing.Union[nds.venue.parking.road_network_access_type.RoadNetworkAccessType, None] = None) -> None:
        self._facility_id_ = facility_id_
        self._type_ = type_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadNetworkAccess'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadNetworkAccess':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadNetworkAccess'],
            zserio_context: RoadNetworkAccess.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadNetworkAccess':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadNetworkAccess):
            return ((self._facility_id_ == other._facility_id_) and
                    (self._type_ == other._type_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._facility_id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)

        return result

    @property
    def facility_id(self) -> typing.Union[nds.venue.reference.types.parking_facility_id.ParkingFacilityId, None]:
        return self._facility_id_

    @facility_id.setter
    def facility_id(self, facility_id_: typing.Union[nds.venue.reference.types.parking_facility_id.ParkingFacilityId, None]) -> None:
        self._facility_id_ = facility_id_

    @property
    def type(self) -> typing.Union[nds.venue.parking.road_network_access_type.RoadNetworkAccessType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.venue.parking.road_network_access_type.RoadNetworkAccessType, None]) -> None:
        self._type_ = type_

    def init_packing_context(self, zserio_context: RoadNetworkAccess.ZserioPackingContext) -> None:
        self._facility_id_.init_packing_context(zserio_context.facility_id)
        self._type_.init_packing_context(zserio_context.type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._facility_id_.bitsizeof(end_bitposition)
        end_bitposition += self._type_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadNetworkAccess.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._facility_id_.bitsizeof_packed(zserio_context.facility_id, end_bitposition)
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._facility_id_.initialize_offsets(end_bitposition)
        end_bitposition = self._type_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadNetworkAccess.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._facility_id_.initialize_offsets_packed(zserio_context.facility_id, end_bitposition)
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._facility_id_ = nds.venue.reference.types.parking_facility_id.ParkingFacilityId.from_reader(zserio_reader)
        self._type_ = nds.venue.parking.road_network_access_type.RoadNetworkAccessType.from_reader(zserio_reader)

    def read_packed(self, zserio_context: RoadNetworkAccess.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._facility_id_ = nds.venue.reference.types.parking_facility_id.ParkingFacilityId.from_reader_packed(zserio_context.facility_id, zserio_reader)

        self._type_ = nds.venue.parking.road_network_access_type.RoadNetworkAccessType.from_reader_packed(zserio_context.type, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._facility_id_.write(zserio_writer)
        self._type_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadNetworkAccess.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._facility_id_.write_packed(zserio_context.facility_id, zserio_writer)

        self._type_.write_packed(zserio_context.type, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._facility_id_ = nds.venue.reference.types.parking_facility_id.ParkingFacilityId.ZserioPackingContext()
            self._type_ = zserio.array.DeltaContext()

        @property
        def facility_id(self):
            return self._facility_id_

        @property
        def type(self):
            return self._type_
