# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.venue.details.instantiations.parking_facility_attribute_map
import nds.venue.details.instantiations.parking_facility_attribute_map_list_header

class ParkingFacilityAttributeMapList:
    def __init__(
            self,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift,
            num_maps_: int = int(),
            header_: typing.Union[nds.venue.details.instantiations.parking_facility_attribute_map_list_header.ParkingFacilityAttributeMapListHeader, None] = None,
            maps_: typing.List[nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap] = None) -> None:
        self._coord_shift_ = coord_shift_
        self._num_maps_ = num_maps_
        self._header_ = header_
        self._maps_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_maps(self)), maps_)

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingFacilityAttributeMapList'],
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'ParkingFacilityAttributeMapList':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingFacilityAttributeMapList'],
            zserio_context: ParkingFacilityAttributeMapList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'ParkingFacilityAttributeMapList':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingFacilityAttributeMapList):
            return (self._coord_shift_ == other._coord_shift_ and
                    (self._num_maps_ == other._num_maps_) and
                    (self._header_ == other._header_) and
                    (self._maps_ == other._maps_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_maps_)
        result = zserio.hashcode.calc_hashcode_object(result, self._header_)
        result = zserio.hashcode.calc_hashcode_object(result, self._maps_)

        return result

    @property
    def coord_shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_

    @property
    def num_maps(self) -> int:
        return self._num_maps_

    @num_maps.setter
    def num_maps(self, num_maps_: int) -> None:
        self._num_maps_ = num_maps_

    @property
    def header(self) -> typing.Union[nds.venue.details.instantiations.parking_facility_attribute_map_list_header.ParkingFacilityAttributeMapListHeader, None]:
        return self._header_

    @header.setter
    def header(self, header_: typing.Union[nds.venue.details.instantiations.parking_facility_attribute_map_list_header.ParkingFacilityAttributeMapListHeader, None]) -> None:
        self._header_ = header_

    @property
    def maps(self) -> typing.List[nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap]:
        return self._maps_.raw_array

    @maps.setter
    def maps(self, maps_: typing.List[nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap]) -> None:
        self._maps_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_maps(self)), maps_)

    def init_packing_context(self, zserio_context: ParkingFacilityAttributeMapList.ZserioPackingContext) -> None:
        zserio_context.num_maps.init(zserio.array.VarSizeArrayTraits(), self._num_maps_)
        self._header_.init_packing_context(zserio_context.header)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_maps_)
        end_bitposition += self._header_.bitsizeof(end_bitposition)
        end_bitposition += self._maps_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingFacilityAttributeMapList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_maps.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_maps_)
        end_bitposition += self._header_.bitsizeof_packed(zserio_context.header, end_bitposition)
        end_bitposition += self._maps_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_maps_)
        end_bitposition = self._header_.initialize_offsets(end_bitposition)
        end_bitposition = self._maps_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingFacilityAttributeMapList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_maps.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_maps_)
        end_bitposition = self._header_.initialize_offsets_packed(zserio_context.header, end_bitposition)
        end_bitposition = self._maps_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_maps_ = zserio_reader.read_varsize()
        self._header_ = nds.venue.details.instantiations.parking_facility_attribute_map_list_header.ParkingFacilityAttributeMapListHeader.from_reader(zserio_reader, self._num_maps_)
        self._maps_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_maps(self)), zserio_reader, self._num_maps_)

    def read_packed(self, zserio_context: ParkingFacilityAttributeMapList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_maps_ = zserio_context.num_maps.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._header_ = nds.venue.details.instantiations.parking_facility_attribute_map_list_header.ParkingFacilityAttributeMapListHeader.from_reader_packed(zserio_context.header, zserio_reader, self._num_maps_)

        self._maps_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_maps(self)), zserio_reader, self._num_maps_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_maps_)

        # check parameters
        if self._header_.num_maps != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong parameter numMaps for field ParkingFacilityAttributeMapList.header: "
                                                f"{self._header_.num_maps} != {self._num_maps_}!")
        self._header_.write(zserio_writer)

        # check array length
        if len(self._maps_) != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong array length for field ParkingFacilityAttributeMapList.maps: "
                                                f"{len(self._maps_)} != {self._num_maps_}!")
        self._maps_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: ParkingFacilityAttributeMapList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_maps.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_maps_)

        # check parameters
        if self._header_.num_maps != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong parameter numMaps for field ParkingFacilityAttributeMapList.header: "
                                                f"{self._header_.num_maps} != {self._num_maps_}!")
        self._header_.write_packed(zserio_context.header, zserio_writer)

        # check array length
        if len(self._maps_) != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong array length for field ParkingFacilityAttributeMapList.maps: "
                                                f"{len(self._maps_)} != {self._num_maps_}!")
        self._maps_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_maps_ = zserio.array.DeltaContext()
            self._header_ = nds.venue.details.instantiations.parking_facility_attribute_map_list_header.ParkingFacilityAttributeMapListHeader.ZserioPackingContext()

        @property
        def num_maps(self):
            return self._num_maps_

        @property
        def header(self):
            return self._header_

    class _ZserioElementFactory_maps:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap:
            del zserio_index
            return nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap.from_reader(zserio_reader, self._owner._coord_shift_)

        @staticmethod
        def create_packing_context() -> nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap.ZserioPackingContext:
            return nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap:
            del zserio_index
            return nds.venue.details.instantiations.parking_facility_attribute_map.ParkingFacilityAttributeMap.from_reader_packed(zserio_context, zserio_reader, self._owner._coord_shift_)
