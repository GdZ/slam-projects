# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.instantiations.parking_position_relation_metadata
import nds.venue.instantiations.parking_range_relation_metadata
import nds.venue.instantiations.parking_relation_metadata
import nds.venue.metadata.parking_facility_relation_layer_content

class ParkingFacilityRelationLayerMetadata:
    def __init__(
            self,
            content_: typing.Union[nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent, None] = None,
            parking_road_surface_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata] = None,
            parking_range_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_range_relation_metadata.ParkingRangeRelationMetadata] = None,
            parking_position_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_position_relation_metadata.ParkingPositionRelationMetadata] = None,
            parking_poi_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata] = None) -> None:
        self._content_ = content_
        self._parking_road_surface_relation_metadata_ = parking_road_surface_relation_metadata_
        self._parking_range_relation_metadata_ = parking_range_relation_metadata_
        self._parking_position_relation_metadata_ = parking_position_relation_metadata_
        self._parking_poi_relation_metadata_ = parking_poi_relation_metadata_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingFacilityRelationLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityRelationLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingFacilityRelationLayerMetadata'],
            zserio_context: ParkingFacilityRelationLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityRelationLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingFacilityRelationLayerMetadata):
            return ((self._content_ == other._content_) and
                    (not other.is_parking_road_surface_relation_metadata_used() if not self.is_parking_road_surface_relation_metadata_used() else (self._parking_road_surface_relation_metadata_ == other._parking_road_surface_relation_metadata_)) and
                    (not other.is_parking_range_relation_metadata_used() if not self.is_parking_range_relation_metadata_used() else (self._parking_range_relation_metadata_ == other._parking_range_relation_metadata_)) and
                    (not other.is_parking_position_relation_metadata_used() if not self.is_parking_position_relation_metadata_used() else (self._parking_position_relation_metadata_ == other._parking_position_relation_metadata_)) and
                    (not other.is_parking_poi_relation_metadata_used() if not self.is_parking_poi_relation_metadata_used() else (self._parking_poi_relation_metadata_ == other._parking_poi_relation_metadata_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_parking_road_surface_relation_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_road_surface_relation_metadata_)
        if self.is_parking_range_relation_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_range_relation_metadata_)
        if self.is_parking_position_relation_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_position_relation_metadata_)
        if self.is_parking_poi_relation_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_poi_relation_metadata_)

        return result

    @property
    def content(self) -> typing.Union[nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def parking_road_surface_relation_metadata(self) -> typing.Optional[nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata]:
        return self._parking_road_surface_relation_metadata_

    @parking_road_surface_relation_metadata.setter
    def parking_road_surface_relation_metadata(self, parking_road_surface_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata]) -> None:
        self._parking_road_surface_relation_metadata_ = parking_road_surface_relation_metadata_

    def is_parking_road_surface_relation_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.ROAD_SURFACE_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.ROAD_SURFACE_MAPS

    def is_parking_road_surface_relation_metadata_set(self) -> bool:
        return not self._parking_road_surface_relation_metadata_ is None

    def reset_parking_road_surface_relation_metadata(self) -> None:
        self._parking_road_surface_relation_metadata_ = None

    @property
    def parking_range_relation_metadata(self) -> typing.Optional[nds.venue.instantiations.parking_range_relation_metadata.ParkingRangeRelationMetadata]:
        return self._parking_range_relation_metadata_

    @parking_range_relation_metadata.setter
    def parking_range_relation_metadata(self, parking_range_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_range_relation_metadata.ParkingRangeRelationMetadata]) -> None:
        self._parking_range_relation_metadata_ = parking_range_relation_metadata_

    def is_parking_range_relation_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_RANGE_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_RANGE_MAPS

    def is_parking_range_relation_metadata_set(self) -> bool:
        return not self._parking_range_relation_metadata_ is None

    def reset_parking_range_relation_metadata(self) -> None:
        self._parking_range_relation_metadata_ = None

    @property
    def parking_position_relation_metadata(self) -> typing.Optional[nds.venue.instantiations.parking_position_relation_metadata.ParkingPositionRelationMetadata]:
        return self._parking_position_relation_metadata_

    @parking_position_relation_metadata.setter
    def parking_position_relation_metadata(self, parking_position_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_position_relation_metadata.ParkingPositionRelationMetadata]) -> None:
        self._parking_position_relation_metadata_ = parking_position_relation_metadata_

    def is_parking_position_relation_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_POSITION_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_POSITION_MAPS

    def is_parking_position_relation_metadata_set(self) -> bool:
        return not self._parking_position_relation_metadata_ is None

    def reset_parking_position_relation_metadata(self) -> None:
        self._parking_position_relation_metadata_ = None

    @property
    def parking_poi_relation_metadata(self) -> typing.Optional[nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata]:
        return self._parking_poi_relation_metadata_

    @parking_poi_relation_metadata.setter
    def parking_poi_relation_metadata(self, parking_poi_relation_metadata_: typing.Optional[nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata]) -> None:
        self._parking_poi_relation_metadata_ = parking_poi_relation_metadata_

    def is_parking_poi_relation_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.POI_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.POI_MAPS

    def is_parking_poi_relation_metadata_set(self) -> bool:
        return not self._parking_poi_relation_metadata_ is None

    def reset_parking_poi_relation_metadata(self) -> None:
        self._parking_poi_relation_metadata_ = None

    def init_packing_context(self, zserio_context: ParkingFacilityRelationLayerMetadata.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_parking_road_surface_relation_metadata_used():
            self._parking_road_surface_relation_metadata_.init_packing_context(zserio_context.parking_road_surface_relation_metadata)
        if self.is_parking_range_relation_metadata_used():
            self._parking_range_relation_metadata_.init_packing_context(zserio_context.parking_range_relation_metadata)
        if self.is_parking_position_relation_metadata_used():
            self._parking_position_relation_metadata_.init_packing_context(zserio_context.parking_position_relation_metadata)
        if self.is_parking_poi_relation_metadata_used():
            self._parking_poi_relation_metadata_.init_packing_context(zserio_context.parking_poi_relation_metadata)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_parking_road_surface_relation_metadata_used():
            end_bitposition += self._parking_road_surface_relation_metadata_.bitsizeof(end_bitposition)
        if self.is_parking_range_relation_metadata_used():
            end_bitposition += self._parking_range_relation_metadata_.bitsizeof(end_bitposition)
        if self.is_parking_position_relation_metadata_used():
            end_bitposition += self._parking_position_relation_metadata_.bitsizeof(end_bitposition)
        if self.is_parking_poi_relation_metadata_used():
            end_bitposition += self._parking_poi_relation_metadata_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingFacilityRelationLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_parking_road_surface_relation_metadata_used():
            end_bitposition += self._parking_road_surface_relation_metadata_.bitsizeof_packed(zserio_context.parking_road_surface_relation_metadata, end_bitposition)
        if self.is_parking_range_relation_metadata_used():
            end_bitposition += self._parking_range_relation_metadata_.bitsizeof_packed(zserio_context.parking_range_relation_metadata, end_bitposition)
        if self.is_parking_position_relation_metadata_used():
            end_bitposition += self._parking_position_relation_metadata_.bitsizeof_packed(zserio_context.parking_position_relation_metadata, end_bitposition)
        if self.is_parking_poi_relation_metadata_used():
            end_bitposition += self._parking_poi_relation_metadata_.bitsizeof_packed(zserio_context.parking_poi_relation_metadata, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_parking_road_surface_relation_metadata_used():
            end_bitposition = self._parking_road_surface_relation_metadata_.initialize_offsets(end_bitposition)
        if self.is_parking_range_relation_metadata_used():
            end_bitposition = self._parking_range_relation_metadata_.initialize_offsets(end_bitposition)
        if self.is_parking_position_relation_metadata_used():
            end_bitposition = self._parking_position_relation_metadata_.initialize_offsets(end_bitposition)
        if self.is_parking_poi_relation_metadata_used():
            end_bitposition = self._parking_poi_relation_metadata_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingFacilityRelationLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_parking_road_surface_relation_metadata_used():
            end_bitposition = self._parking_road_surface_relation_metadata_.initialize_offsets_packed(zserio_context.parking_road_surface_relation_metadata, end_bitposition)
        if self.is_parking_range_relation_metadata_used():
            end_bitposition = self._parking_range_relation_metadata_.initialize_offsets_packed(zserio_context.parking_range_relation_metadata, end_bitposition)
        if self.is_parking_position_relation_metadata_used():
            end_bitposition = self._parking_position_relation_metadata_.initialize_offsets_packed(zserio_context.parking_position_relation_metadata, end_bitposition)
        if self.is_parking_poi_relation_metadata_used():
            end_bitposition = self._parking_poi_relation_metadata_.initialize_offsets_packed(zserio_context.parking_poi_relation_metadata, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.from_reader(zserio_reader)
        if self.is_parking_road_surface_relation_metadata_used():
            self._parking_road_surface_relation_metadata_ = nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata.from_reader(zserio_reader)
        else:
            self._parking_road_surface_relation_metadata_ = None
        if self.is_parking_range_relation_metadata_used():
            self._parking_range_relation_metadata_ = nds.venue.instantiations.parking_range_relation_metadata.ParkingRangeRelationMetadata.from_reader(zserio_reader)
        else:
            self._parking_range_relation_metadata_ = None
        if self.is_parking_position_relation_metadata_used():
            self._parking_position_relation_metadata_ = nds.venue.instantiations.parking_position_relation_metadata.ParkingPositionRelationMetadata.from_reader(zserio_reader)
        else:
            self._parking_position_relation_metadata_ = None
        if self.is_parking_poi_relation_metadata_used():
            self._parking_poi_relation_metadata_ = nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata.from_reader(zserio_reader)
        else:
            self._parking_poi_relation_metadata_ = None

    def read_packed(self, zserio_context: ParkingFacilityRelationLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_parking_road_surface_relation_metadata_used():
            self._parking_road_surface_relation_metadata_ = nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata.from_reader_packed(zserio_context.parking_road_surface_relation_metadata, zserio_reader)
        else:
            self._parking_road_surface_relation_metadata_ = None

        if self.is_parking_range_relation_metadata_used():
            self._parking_range_relation_metadata_ = nds.venue.instantiations.parking_range_relation_metadata.ParkingRangeRelationMetadata.from_reader_packed(zserio_context.parking_range_relation_metadata, zserio_reader)
        else:
            self._parking_range_relation_metadata_ = None

        if self.is_parking_position_relation_metadata_used():
            self._parking_position_relation_metadata_ = nds.venue.instantiations.parking_position_relation_metadata.ParkingPositionRelationMetadata.from_reader_packed(zserio_context.parking_position_relation_metadata, zserio_reader)
        else:
            self._parking_position_relation_metadata_ = None

        if self.is_parking_poi_relation_metadata_used():
            self._parking_poi_relation_metadata_ = nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata.from_reader_packed(zserio_context.parking_poi_relation_metadata, zserio_reader)
        else:
            self._parking_poi_relation_metadata_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_parking_road_surface_relation_metadata_used():
            self._parking_road_surface_relation_metadata_.write(zserio_writer)
        if self.is_parking_range_relation_metadata_used():
            self._parking_range_relation_metadata_.write(zserio_writer)
        if self.is_parking_position_relation_metadata_used():
            self._parking_position_relation_metadata_.write(zserio_writer)
        if self.is_parking_poi_relation_metadata_used():
            self._parking_poi_relation_metadata_.write(zserio_writer)

    def write_packed(self, zserio_context: ParkingFacilityRelationLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_parking_road_surface_relation_metadata_used():
            self._parking_road_surface_relation_metadata_.write_packed(zserio_context.parking_road_surface_relation_metadata, zserio_writer)

        if self.is_parking_range_relation_metadata_used():
            self._parking_range_relation_metadata_.write_packed(zserio_context.parking_range_relation_metadata, zserio_writer)

        if self.is_parking_position_relation_metadata_used():
            self._parking_position_relation_metadata_.write_packed(zserio_context.parking_position_relation_metadata, zserio_writer)

        if self.is_parking_poi_relation_metadata_used():
            self._parking_poi_relation_metadata_.write_packed(zserio_context.parking_poi_relation_metadata, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._parking_road_surface_relation_metadata_ = nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata.ZserioPackingContext()
            self._parking_range_relation_metadata_ = nds.venue.instantiations.parking_range_relation_metadata.ParkingRangeRelationMetadata.ZserioPackingContext()
            self._parking_position_relation_metadata_ = nds.venue.instantiations.parking_position_relation_metadata.ParkingPositionRelationMetadata.ZserioPackingContext()
            self._parking_poi_relation_metadata_ = nds.venue.instantiations.parking_relation_metadata.ParkingRelationMetadata.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def parking_road_surface_relation_metadata(self):
            return self._parking_road_surface_relation_metadata_

        @property
        def parking_range_relation_metadata(self):
            return self._parking_range_relation_metadata_

        @property
        def parking_position_relation_metadata(self):
            return self._parking_position_relation_metadata_

        @property
        def parking_poi_relation_metadata(self):
            return self._parking_poi_relation_metadata_
