# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.characteristics.instantiations.characs_road_position_attribute_metadata
import nds.characteristics.instantiations.characs_road_range_attribute_metadata
import nds.characteristics.instantiations.characs_transition_attribute_metadata
import nds.characteristics.metadata.road_characs_layer_content
import nds.characteristics.metadata.road_location_provider_details
import nds.core.types.road_type

class RoadCharacteristicsLayerMetadata:
    def __init__(
            self,
            content_: typing.Union[nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent, None] = None,
            road_range_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_road_range_attribute_metadata.CharacsRoadRangeAttributeMetadata] = None,
            road_position_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_road_position_attribute_metadata.CharacsRoadPositionAttributeMetadata] = None,
            covered_road_types_: typing.List[nds.core.types.road_type.RoadType] = None,
            road_location_provider_details_: typing.Optional[nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails] = None,
            transition_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_transition_attribute_metadata.CharacsTransitionAttributeMetadata] = None) -> None:
        self._content_ = content_
        self._road_range_attribute_metadata_ = road_range_attribute_metadata_
        self._road_position_attribute_metadata_ = road_position_attribute_metadata_
        self._covered_road_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), covered_road_types_, is_auto=True)
        self._road_location_provider_details_ = road_location_provider_details_
        self._transition_attribute_metadata_ = transition_attribute_metadata_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadCharacteristicsLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadCharacteristicsLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadCharacteristicsLayerMetadata'],
            zserio_context: RoadCharacteristicsLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadCharacteristicsLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadCharacteristicsLayerMetadata):
            return ((self._content_ == other._content_) and
                    (not other.is_road_range_attribute_metadata_used() if not self.is_road_range_attribute_metadata_used() else (self._road_range_attribute_metadata_ == other._road_range_attribute_metadata_)) and
                    (not other.is_road_position_attribute_metadata_used() if not self.is_road_position_attribute_metadata_used() else (self._road_position_attribute_metadata_ == other._road_position_attribute_metadata_)) and
                    (self._covered_road_types_ == other._covered_road_types_) and
                    (not other.is_road_location_provider_details_used() if not self.is_road_location_provider_details_used() else (self._road_location_provider_details_ == other._road_location_provider_details_)) and
                    (not other.is_transition_attribute_metadata_used() if not self.is_transition_attribute_metadata_used() else (self._transition_attribute_metadata_ == other._transition_attribute_metadata_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_road_range_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_range_attribute_metadata_)
        if self.is_road_position_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_position_attribute_metadata_)
        result = zserio.hashcode.calc_hashcode_object(result, self._covered_road_types_)
        if self.is_road_location_provider_details_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_provider_details_)
        if self.is_transition_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._transition_attribute_metadata_)

        return result

    @property
    def content(self) -> typing.Union[nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def road_range_attribute_metadata(self) -> typing.Optional[nds.characteristics.instantiations.characs_road_range_attribute_metadata.CharacsRoadRangeAttributeMetadata]:
        return self._road_range_attribute_metadata_

    @road_range_attribute_metadata.setter
    def road_range_attribute_metadata(self, road_range_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_road_range_attribute_metadata.CharacsRoadRangeAttributeMetadata]) -> None:
        self._road_range_attribute_metadata_ = road_range_attribute_metadata_

    def is_road_range_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS) == nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_RANGE_MAPS or (self._content_ & nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS) == nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_RANGE_SETS

    def is_road_range_attribute_metadata_set(self) -> bool:
        return not self._road_range_attribute_metadata_ is None

    def reset_road_range_attribute_metadata(self) -> None:
        self._road_range_attribute_metadata_ = None

    @property
    def road_position_attribute_metadata(self) -> typing.Optional[nds.characteristics.instantiations.characs_road_position_attribute_metadata.CharacsRoadPositionAttributeMetadata]:
        return self._road_position_attribute_metadata_

    @road_position_attribute_metadata.setter
    def road_position_attribute_metadata(self, road_position_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_road_position_attribute_metadata.CharacsRoadPositionAttributeMetadata]) -> None:
        self._road_position_attribute_metadata_ = road_position_attribute_metadata_

    def is_road_position_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS) == nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_POSITION_MAPS or (self._content_ & nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS) == nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.ROAD_POSITION_SETS

    def is_road_position_attribute_metadata_set(self) -> bool:
        return not self._road_position_attribute_metadata_ is None

    def reset_road_position_attribute_metadata(self) -> None:
        self._road_position_attribute_metadata_ = None

    @property
    def covered_road_types(self) -> typing.List[nds.core.types.road_type.RoadType]:
        return self._covered_road_types_.raw_array

    @covered_road_types.setter
    def covered_road_types(self, covered_road_types_: typing.List[nds.core.types.road_type.RoadType]) -> None:
        self._covered_road_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), covered_road_types_, is_auto=True)

    @property
    def road_location_provider_details(self) -> typing.Optional[nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails]:
        return self._road_location_provider_details_

    @road_location_provider_details.setter
    def road_location_provider_details(self, road_location_provider_details_: typing.Optional[nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails]) -> None:
        self._road_location_provider_details_ = road_location_provider_details_

    def is_road_location_provider_details_used(self) -> bool:
        return self.is_road_location_provider_details_set()

    def is_road_location_provider_details_set(self) -> bool:
        return not self._road_location_provider_details_ is None

    def reset_road_location_provider_details(self) -> None:
        self._road_location_provider_details_ = None

    @property
    def transition_attribute_metadata(self) -> typing.Optional[nds.characteristics.instantiations.characs_transition_attribute_metadata.CharacsTransitionAttributeMetadata]:
        return self._transition_attribute_metadata_

    @transition_attribute_metadata.setter
    def transition_attribute_metadata(self, transition_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_transition_attribute_metadata.CharacsTransitionAttributeMetadata]) -> None:
        self._transition_attribute_metadata_ = transition_attribute_metadata_

    def is_transition_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.TRANSITION_MAPS) == nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.TRANSITION_MAPS or (self._content_ & nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.TRANSITION_SETS) == nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.Values.TRANSITION_SETS

    def is_transition_attribute_metadata_set(self) -> bool:
        return not self._transition_attribute_metadata_ is None

    def reset_transition_attribute_metadata(self) -> None:
        self._transition_attribute_metadata_ = None

    def init_packing_context(self, zserio_context: RoadCharacteristicsLayerMetadata.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_road_range_attribute_metadata_used():
            self._road_range_attribute_metadata_.init_packing_context(zserio_context.road_range_attribute_metadata)
        if self.is_road_position_attribute_metadata_used():
            self._road_position_attribute_metadata_.init_packing_context(zserio_context.road_position_attribute_metadata)
        if self.is_road_location_provider_details_used():
            self._road_location_provider_details_.init_packing_context(zserio_context.road_location_provider_details)
        if self.is_transition_attribute_metadata_used():
            self._transition_attribute_metadata_.init_packing_context(zserio_context.transition_attribute_metadata)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_road_range_attribute_metadata_used():
            end_bitposition += self._road_range_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_road_position_attribute_metadata_used():
            end_bitposition += self._road_position_attribute_metadata_.bitsizeof(end_bitposition)
        end_bitposition += self._covered_road_types_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition += self._road_location_provider_details_.bitsizeof(end_bitposition)
        if self.is_transition_attribute_metadata_used():
            end_bitposition += self._transition_attribute_metadata_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadCharacteristicsLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_road_range_attribute_metadata_used():
            end_bitposition += self._road_range_attribute_metadata_.bitsizeof_packed(zserio_context.road_range_attribute_metadata, end_bitposition)
        if self.is_road_position_attribute_metadata_used():
            end_bitposition += self._road_position_attribute_metadata_.bitsizeof_packed(zserio_context.road_position_attribute_metadata, end_bitposition)
        end_bitposition += self._covered_road_types_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition += self._road_location_provider_details_.bitsizeof_packed(zserio_context.road_location_provider_details, end_bitposition)
        if self.is_transition_attribute_metadata_used():
            end_bitposition += self._transition_attribute_metadata_.bitsizeof_packed(zserio_context.transition_attribute_metadata, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_road_range_attribute_metadata_used():
            end_bitposition = self._road_range_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_road_position_attribute_metadata_used():
            end_bitposition = self._road_position_attribute_metadata_.initialize_offsets(end_bitposition)
        end_bitposition = self._covered_road_types_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition = self._road_location_provider_details_.initialize_offsets(end_bitposition)
        if self.is_transition_attribute_metadata_used():
            end_bitposition = self._transition_attribute_metadata_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadCharacteristicsLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_road_range_attribute_metadata_used():
            end_bitposition = self._road_range_attribute_metadata_.initialize_offsets_packed(zserio_context.road_range_attribute_metadata, end_bitposition)
        if self.is_road_position_attribute_metadata_used():
            end_bitposition = self._road_position_attribute_metadata_.initialize_offsets_packed(zserio_context.road_position_attribute_metadata, end_bitposition)
        end_bitposition = self._covered_road_types_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition = self._road_location_provider_details_.initialize_offsets_packed(zserio_context.road_location_provider_details, end_bitposition)
        if self.is_transition_attribute_metadata_used():
            end_bitposition = self._transition_attribute_metadata_.initialize_offsets_packed(zserio_context.transition_attribute_metadata, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.from_reader(zserio_reader)
        if self.is_road_range_attribute_metadata_used():
            self._road_range_attribute_metadata_ = nds.characteristics.instantiations.characs_road_range_attribute_metadata.CharacsRoadRangeAttributeMetadata.from_reader(zserio_reader)
        else:
            self._road_range_attribute_metadata_ = None
        if self.is_road_position_attribute_metadata_used():
            self._road_position_attribute_metadata_ = nds.characteristics.instantiations.characs_road_position_attribute_metadata.CharacsRoadPositionAttributeMetadata.from_reader(zserio_reader)
        else:
            self._road_position_attribute_metadata_ = None
        self._covered_road_types_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), zserio_reader, is_auto=True)
        if zserio_reader.read_bool():
            self._road_location_provider_details_ = nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails.from_reader(zserio_reader)
        else:
            self._road_location_provider_details_ = None
        if self.is_transition_attribute_metadata_used():
            self._transition_attribute_metadata_ = nds.characteristics.instantiations.characs_transition_attribute_metadata.CharacsTransitionAttributeMetadata.from_reader(zserio_reader)
        else:
            self._transition_attribute_metadata_ = None

    def read_packed(self, zserio_context: RoadCharacteristicsLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.characteristics.metadata.road_characs_layer_content.RoadCharacsLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_road_range_attribute_metadata_used():
            self._road_range_attribute_metadata_ = nds.characteristics.instantiations.characs_road_range_attribute_metadata.CharacsRoadRangeAttributeMetadata.from_reader_packed(zserio_context.road_range_attribute_metadata, zserio_reader)
        else:
            self._road_range_attribute_metadata_ = None

        if self.is_road_position_attribute_metadata_used():
            self._road_position_attribute_metadata_ = nds.characteristics.instantiations.characs_road_position_attribute_metadata.CharacsRoadPositionAttributeMetadata.from_reader_packed(zserio_context.road_position_attribute_metadata, zserio_reader)
        else:
            self._road_position_attribute_metadata_ = None

        self._covered_road_types_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), zserio_reader, is_auto=True)

        if zserio_reader.read_bool():
            self._road_location_provider_details_ = nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails.from_reader_packed(zserio_context.road_location_provider_details, zserio_reader)
        else:
            self._road_location_provider_details_ = None

        if self.is_transition_attribute_metadata_used():
            self._transition_attribute_metadata_ = nds.characteristics.instantiations.characs_transition_attribute_metadata.CharacsTransitionAttributeMetadata.from_reader_packed(zserio_context.transition_attribute_metadata, zserio_reader)
        else:
            self._transition_attribute_metadata_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_road_range_attribute_metadata_used():
            self._road_range_attribute_metadata_.write(zserio_writer)
        if self.is_road_position_attribute_metadata_used():
            self._road_position_attribute_metadata_.write(zserio_writer)
        self._covered_road_types_.write(zserio_writer)
        if self.is_road_location_provider_details_used():
            zserio_writer.write_bool(True)
            self._road_location_provider_details_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_transition_attribute_metadata_used():
            self._transition_attribute_metadata_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadCharacteristicsLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_road_range_attribute_metadata_used():
            self._road_range_attribute_metadata_.write_packed(zserio_context.road_range_attribute_metadata, zserio_writer)

        if self.is_road_position_attribute_metadata_used():
            self._road_position_attribute_metadata_.write_packed(zserio_context.road_position_attribute_metadata, zserio_writer)

        self._covered_road_types_.write_packed(zserio_writer)

        if self.is_road_location_provider_details_used():
            zserio_writer.write_bool(True)
            self._road_location_provider_details_.write_packed(zserio_context.road_location_provider_details, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_transition_attribute_metadata_used():
            self._transition_attribute_metadata_.write_packed(zserio_context.transition_attribute_metadata, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._road_range_attribute_metadata_ = nds.characteristics.instantiations.characs_road_range_attribute_metadata.CharacsRoadRangeAttributeMetadata.ZserioPackingContext()
            self._road_position_attribute_metadata_ = nds.characteristics.instantiations.characs_road_position_attribute_metadata.CharacsRoadPositionAttributeMetadata.ZserioPackingContext()
            self._road_location_provider_details_ = nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails.ZserioPackingContext()
            self._transition_attribute_metadata_ = nds.characteristics.instantiations.characs_transition_attribute_metadata.CharacsTransitionAttributeMetadata.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def road_range_attribute_metadata(self):
            return self._road_range_attribute_metadata_

        @property
        def road_position_attribute_metadata(self):
            return self._road_position_attribute_metadata_

        @property
        def road_location_provider_details(self):
            return self._road_location_provider_details_

        @property
        def transition_attribute_metadata(self):
            return self._transition_attribute_metadata_

    class _ZserioElementFactory_covered_road_types:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.types.road_type.RoadType:
            del zserio_index
            return nds.core.types.road_type.RoadType.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.types.road_type.RoadType.ZserioPackingContext:
            return nds.core.types.road_type.RoadType.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.types.road_type.RoadType.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.types.road_type.RoadType:
            del zserio_index
            return nds.core.types.road_type.RoadType.from_reader_packed(zserio_context, zserio_reader)
