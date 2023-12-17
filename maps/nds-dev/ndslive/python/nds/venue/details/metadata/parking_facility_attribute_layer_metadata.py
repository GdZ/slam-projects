# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.details.instantiations.parking_facility_attribute_metadata
import nds.venue.details.instantiations.parking_level_attribute_metadata
import nds.venue.details.instantiations.parking_row_attribute_metadata
import nds.venue.details.instantiations.parking_section_attribute_metadata
import nds.venue.details.instantiations.parking_spot_attribute_metadata
import nds.venue.details.metadata.parking_facility_attribute_layer_content

class ParkingFacilityAttributeLayerMetadata:
    def __init__(
            self,
            content_: typing.Union[nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent, None] = None,
            parking_facility_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_facility_attribute_metadata.ParkingFacilityAttributeMetadata] = None,
            parking_level_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_level_attribute_metadata.ParkingLevelAttributeMetadata] = None,
            parking_section_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_section_attribute_metadata.ParkingSectionAttributeMetadata] = None,
            parking_row_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_row_attribute_metadata.ParkingRowAttributeMetadata] = None,
            parking_spot_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_spot_attribute_metadata.ParkingSpotAttributeMetadata] = None) -> None:
        self._content_ = content_
        self._parking_facility_attribute_metadata_ = parking_facility_attribute_metadata_
        self._parking_level_attribute_metadata_ = parking_level_attribute_metadata_
        self._parking_section_attribute_metadata_ = parking_section_attribute_metadata_
        self._parking_row_attribute_metadata_ = parking_row_attribute_metadata_
        self._parking_spot_attribute_metadata_ = parking_spot_attribute_metadata_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingFacilityAttributeLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityAttributeLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingFacilityAttributeLayerMetadata'],
            zserio_context: ParkingFacilityAttributeLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityAttributeLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingFacilityAttributeLayerMetadata):
            return ((self._content_ == other._content_) and
                    (not other.is_parking_facility_attribute_metadata_used() if not self.is_parking_facility_attribute_metadata_used() else (self._parking_facility_attribute_metadata_ == other._parking_facility_attribute_metadata_)) and
                    (not other.is_parking_level_attribute_metadata_used() if not self.is_parking_level_attribute_metadata_used() else (self._parking_level_attribute_metadata_ == other._parking_level_attribute_metadata_)) and
                    (not other.is_parking_section_attribute_metadata_used() if not self.is_parking_section_attribute_metadata_used() else (self._parking_section_attribute_metadata_ == other._parking_section_attribute_metadata_)) and
                    (not other.is_parking_row_attribute_metadata_used() if not self.is_parking_row_attribute_metadata_used() else (self._parking_row_attribute_metadata_ == other._parking_row_attribute_metadata_)) and
                    (not other.is_parking_spot_attribute_metadata_used() if not self.is_parking_spot_attribute_metadata_used() else (self._parking_spot_attribute_metadata_ == other._parking_spot_attribute_metadata_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_parking_facility_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_facility_attribute_metadata_)
        if self.is_parking_level_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_level_attribute_metadata_)
        if self.is_parking_section_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_section_attribute_metadata_)
        if self.is_parking_row_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_row_attribute_metadata_)
        if self.is_parking_spot_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_spot_attribute_metadata_)

        return result

    @property
    def content(self) -> typing.Union[nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def parking_facility_attribute_metadata(self) -> typing.Optional[nds.venue.details.instantiations.parking_facility_attribute_metadata.ParkingFacilityAttributeMetadata]:
        return self._parking_facility_attribute_metadata_

    @parking_facility_attribute_metadata.setter
    def parking_facility_attribute_metadata(self, parking_facility_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_facility_attribute_metadata.ParkingFacilityAttributeMetadata]) -> None:
        self._parking_facility_attribute_metadata_ = parking_facility_attribute_metadata_

    def is_parking_facility_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_MAPS or (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_FACILITY_SETS

    def is_parking_facility_attribute_metadata_set(self) -> bool:
        return not self._parking_facility_attribute_metadata_ is None

    def reset_parking_facility_attribute_metadata(self) -> None:
        self._parking_facility_attribute_metadata_ = None

    @property
    def parking_level_attribute_metadata(self) -> typing.Optional[nds.venue.details.instantiations.parking_level_attribute_metadata.ParkingLevelAttributeMetadata]:
        return self._parking_level_attribute_metadata_

    @parking_level_attribute_metadata.setter
    def parking_level_attribute_metadata(self, parking_level_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_level_attribute_metadata.ParkingLevelAttributeMetadata]) -> None:
        self._parking_level_attribute_metadata_ = parking_level_attribute_metadata_

    def is_parking_level_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_MAPS or (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_LEVEL_SETS

    def is_parking_level_attribute_metadata_set(self) -> bool:
        return not self._parking_level_attribute_metadata_ is None

    def reset_parking_level_attribute_metadata(self) -> None:
        self._parking_level_attribute_metadata_ = None

    @property
    def parking_section_attribute_metadata(self) -> typing.Optional[nds.venue.details.instantiations.parking_section_attribute_metadata.ParkingSectionAttributeMetadata]:
        return self._parking_section_attribute_metadata_

    @parking_section_attribute_metadata.setter
    def parking_section_attribute_metadata(self, parking_section_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_section_attribute_metadata.ParkingSectionAttributeMetadata]) -> None:
        self._parking_section_attribute_metadata_ = parking_section_attribute_metadata_

    def is_parking_section_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_MAPS or (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SECTION_SETS

    def is_parking_section_attribute_metadata_set(self) -> bool:
        return not self._parking_section_attribute_metadata_ is None

    def reset_parking_section_attribute_metadata(self) -> None:
        self._parking_section_attribute_metadata_ = None

    @property
    def parking_row_attribute_metadata(self) -> typing.Optional[nds.venue.details.instantiations.parking_row_attribute_metadata.ParkingRowAttributeMetadata]:
        return self._parking_row_attribute_metadata_

    @parking_row_attribute_metadata.setter
    def parking_row_attribute_metadata(self, parking_row_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_row_attribute_metadata.ParkingRowAttributeMetadata]) -> None:
        self._parking_row_attribute_metadata_ = parking_row_attribute_metadata_

    def is_parking_row_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_MAPS or (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_ROW_SETS

    def is_parking_row_attribute_metadata_set(self) -> bool:
        return not self._parking_row_attribute_metadata_ is None

    def reset_parking_row_attribute_metadata(self) -> None:
        self._parking_row_attribute_metadata_ = None

    @property
    def parking_spot_attribute_metadata(self) -> typing.Optional[nds.venue.details.instantiations.parking_spot_attribute_metadata.ParkingSpotAttributeMetadata]:
        return self._parking_spot_attribute_metadata_

    @parking_spot_attribute_metadata.setter
    def parking_spot_attribute_metadata(self, parking_spot_attribute_metadata_: typing.Optional[nds.venue.details.instantiations.parking_spot_attribute_metadata.ParkingSpotAttributeMetadata]) -> None:
        self._parking_spot_attribute_metadata_ = parking_spot_attribute_metadata_

    def is_parking_spot_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_MAPS or (self._content_ & nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS) == nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.Values.PARKING_SPOT_SETS

    def is_parking_spot_attribute_metadata_set(self) -> bool:
        return not self._parking_spot_attribute_metadata_ is None

    def reset_parking_spot_attribute_metadata(self) -> None:
        self._parking_spot_attribute_metadata_ = None

    def init_packing_context(self, zserio_context: ParkingFacilityAttributeLayerMetadata.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_parking_facility_attribute_metadata_used():
            self._parking_facility_attribute_metadata_.init_packing_context(zserio_context.parking_facility_attribute_metadata)
        if self.is_parking_level_attribute_metadata_used():
            self._parking_level_attribute_metadata_.init_packing_context(zserio_context.parking_level_attribute_metadata)
        if self.is_parking_section_attribute_metadata_used():
            self._parking_section_attribute_metadata_.init_packing_context(zserio_context.parking_section_attribute_metadata)
        if self.is_parking_row_attribute_metadata_used():
            self._parking_row_attribute_metadata_.init_packing_context(zserio_context.parking_row_attribute_metadata)
        if self.is_parking_spot_attribute_metadata_used():
            self._parking_spot_attribute_metadata_.init_packing_context(zserio_context.parking_spot_attribute_metadata)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_parking_facility_attribute_metadata_used():
            end_bitposition += self._parking_facility_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_parking_level_attribute_metadata_used():
            end_bitposition += self._parking_level_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_parking_section_attribute_metadata_used():
            end_bitposition += self._parking_section_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_parking_row_attribute_metadata_used():
            end_bitposition += self._parking_row_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_parking_spot_attribute_metadata_used():
            end_bitposition += self._parking_spot_attribute_metadata_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingFacilityAttributeLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_parking_facility_attribute_metadata_used():
            end_bitposition += self._parking_facility_attribute_metadata_.bitsizeof_packed(zserio_context.parking_facility_attribute_metadata, end_bitposition)
        if self.is_parking_level_attribute_metadata_used():
            end_bitposition += self._parking_level_attribute_metadata_.bitsizeof_packed(zserio_context.parking_level_attribute_metadata, end_bitposition)
        if self.is_parking_section_attribute_metadata_used():
            end_bitposition += self._parking_section_attribute_metadata_.bitsizeof_packed(zserio_context.parking_section_attribute_metadata, end_bitposition)
        if self.is_parking_row_attribute_metadata_used():
            end_bitposition += self._parking_row_attribute_metadata_.bitsizeof_packed(zserio_context.parking_row_attribute_metadata, end_bitposition)
        if self.is_parking_spot_attribute_metadata_used():
            end_bitposition += self._parking_spot_attribute_metadata_.bitsizeof_packed(zserio_context.parking_spot_attribute_metadata, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_parking_facility_attribute_metadata_used():
            end_bitposition = self._parking_facility_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_parking_level_attribute_metadata_used():
            end_bitposition = self._parking_level_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_parking_section_attribute_metadata_used():
            end_bitposition = self._parking_section_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_parking_row_attribute_metadata_used():
            end_bitposition = self._parking_row_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_parking_spot_attribute_metadata_used():
            end_bitposition = self._parking_spot_attribute_metadata_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingFacilityAttributeLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_parking_facility_attribute_metadata_used():
            end_bitposition = self._parking_facility_attribute_metadata_.initialize_offsets_packed(zserio_context.parking_facility_attribute_metadata, end_bitposition)
        if self.is_parking_level_attribute_metadata_used():
            end_bitposition = self._parking_level_attribute_metadata_.initialize_offsets_packed(zserio_context.parking_level_attribute_metadata, end_bitposition)
        if self.is_parking_section_attribute_metadata_used():
            end_bitposition = self._parking_section_attribute_metadata_.initialize_offsets_packed(zserio_context.parking_section_attribute_metadata, end_bitposition)
        if self.is_parking_row_attribute_metadata_used():
            end_bitposition = self._parking_row_attribute_metadata_.initialize_offsets_packed(zserio_context.parking_row_attribute_metadata, end_bitposition)
        if self.is_parking_spot_attribute_metadata_used():
            end_bitposition = self._parking_spot_attribute_metadata_.initialize_offsets_packed(zserio_context.parking_spot_attribute_metadata, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.from_reader(zserio_reader)
        if self.is_parking_facility_attribute_metadata_used():
            self._parking_facility_attribute_metadata_ = nds.venue.details.instantiations.parking_facility_attribute_metadata.ParkingFacilityAttributeMetadata.from_reader(zserio_reader)
        else:
            self._parking_facility_attribute_metadata_ = None
        if self.is_parking_level_attribute_metadata_used():
            self._parking_level_attribute_metadata_ = nds.venue.details.instantiations.parking_level_attribute_metadata.ParkingLevelAttributeMetadata.from_reader(zserio_reader)
        else:
            self._parking_level_attribute_metadata_ = None
        if self.is_parking_section_attribute_metadata_used():
            self._parking_section_attribute_metadata_ = nds.venue.details.instantiations.parking_section_attribute_metadata.ParkingSectionAttributeMetadata.from_reader(zserio_reader)
        else:
            self._parking_section_attribute_metadata_ = None
        if self.is_parking_row_attribute_metadata_used():
            self._parking_row_attribute_metadata_ = nds.venue.details.instantiations.parking_row_attribute_metadata.ParkingRowAttributeMetadata.from_reader(zserio_reader)
        else:
            self._parking_row_attribute_metadata_ = None
        if self.is_parking_spot_attribute_metadata_used():
            self._parking_spot_attribute_metadata_ = nds.venue.details.instantiations.parking_spot_attribute_metadata.ParkingSpotAttributeMetadata.from_reader(zserio_reader)
        else:
            self._parking_spot_attribute_metadata_ = None

    def read_packed(self, zserio_context: ParkingFacilityAttributeLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.venue.details.metadata.parking_facility_attribute_layer_content.ParkingFacilityAttributeLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_parking_facility_attribute_metadata_used():
            self._parking_facility_attribute_metadata_ = nds.venue.details.instantiations.parking_facility_attribute_metadata.ParkingFacilityAttributeMetadata.from_reader_packed(zserio_context.parking_facility_attribute_metadata, zserio_reader)
        else:
            self._parking_facility_attribute_metadata_ = None

        if self.is_parking_level_attribute_metadata_used():
            self._parking_level_attribute_metadata_ = nds.venue.details.instantiations.parking_level_attribute_metadata.ParkingLevelAttributeMetadata.from_reader_packed(zserio_context.parking_level_attribute_metadata, zserio_reader)
        else:
            self._parking_level_attribute_metadata_ = None

        if self.is_parking_section_attribute_metadata_used():
            self._parking_section_attribute_metadata_ = nds.venue.details.instantiations.parking_section_attribute_metadata.ParkingSectionAttributeMetadata.from_reader_packed(zserio_context.parking_section_attribute_metadata, zserio_reader)
        else:
            self._parking_section_attribute_metadata_ = None

        if self.is_parking_row_attribute_metadata_used():
            self._parking_row_attribute_metadata_ = nds.venue.details.instantiations.parking_row_attribute_metadata.ParkingRowAttributeMetadata.from_reader_packed(zserio_context.parking_row_attribute_metadata, zserio_reader)
        else:
            self._parking_row_attribute_metadata_ = None

        if self.is_parking_spot_attribute_metadata_used():
            self._parking_spot_attribute_metadata_ = nds.venue.details.instantiations.parking_spot_attribute_metadata.ParkingSpotAttributeMetadata.from_reader_packed(zserio_context.parking_spot_attribute_metadata, zserio_reader)
        else:
            self._parking_spot_attribute_metadata_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_parking_facility_attribute_metadata_used():
            self._parking_facility_attribute_metadata_.write(zserio_writer)
        if self.is_parking_level_attribute_metadata_used():
            self._parking_level_attribute_metadata_.write(zserio_writer)
        if self.is_parking_section_attribute_metadata_used():
            self._parking_section_attribute_metadata_.write(zserio_writer)
        if self.is_parking_row_attribute_metadata_used():
            self._parking_row_attribute_metadata_.write(zserio_writer)
        if self.is_parking_spot_attribute_metadata_used():
            self._parking_spot_attribute_metadata_.write(zserio_writer)

    def write_packed(self, zserio_context: ParkingFacilityAttributeLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_parking_facility_attribute_metadata_used():
            self._parking_facility_attribute_metadata_.write_packed(zserio_context.parking_facility_attribute_metadata, zserio_writer)

        if self.is_parking_level_attribute_metadata_used():
            self._parking_level_attribute_metadata_.write_packed(zserio_context.parking_level_attribute_metadata, zserio_writer)

        if self.is_parking_section_attribute_metadata_used():
            self._parking_section_attribute_metadata_.write_packed(zserio_context.parking_section_attribute_metadata, zserio_writer)

        if self.is_parking_row_attribute_metadata_used():
            self._parking_row_attribute_metadata_.write_packed(zserio_context.parking_row_attribute_metadata, zserio_writer)

        if self.is_parking_spot_attribute_metadata_used():
            self._parking_spot_attribute_metadata_.write_packed(zserio_context.parking_spot_attribute_metadata, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._parking_facility_attribute_metadata_ = nds.venue.details.instantiations.parking_facility_attribute_metadata.ParkingFacilityAttributeMetadata.ZserioPackingContext()
            self._parking_level_attribute_metadata_ = nds.venue.details.instantiations.parking_level_attribute_metadata.ParkingLevelAttributeMetadata.ZserioPackingContext()
            self._parking_section_attribute_metadata_ = nds.venue.details.instantiations.parking_section_attribute_metadata.ParkingSectionAttributeMetadata.ZserioPackingContext()
            self._parking_row_attribute_metadata_ = nds.venue.details.instantiations.parking_row_attribute_metadata.ParkingRowAttributeMetadata.ZserioPackingContext()
            self._parking_spot_attribute_metadata_ = nds.venue.details.instantiations.parking_spot_attribute_metadata.ParkingSpotAttributeMetadata.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def parking_facility_attribute_metadata(self):
            return self._parking_facility_attribute_metadata_

        @property
        def parking_level_attribute_metadata(self):
            return self._parking_level_attribute_metadata_

        @property
        def parking_section_attribute_metadata(self):
            return self._parking_section_attribute_metadata_

        @property
        def parking_row_attribute_metadata(self):
            return self._parking_row_attribute_metadata_

        @property
        def parking_spot_attribute_metadata(self):
            return self._parking_spot_attribute_metadata_
