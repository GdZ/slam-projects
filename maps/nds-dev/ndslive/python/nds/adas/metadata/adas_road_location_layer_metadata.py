# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.adas.instantiations.adas_road_attribute_metadata
import nds.adas.instantiations.adas_transition_attribute_metadata
import nds.adas.metadata.adas_road_location_layer_content
import nds.core.types.road_type

class AdasRoadLocationLayerMetadata:
    def __init__(
            self,
            content_: typing.Union[nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent, None] = None,
            road_location_attribute_metadata_: typing.Optional[nds.adas.instantiations.adas_road_attribute_metadata.AdasRoadAttributeMetadata] = None,
            road_location_transition_attribute_metadata_: typing.Optional[nds.adas.instantiations.adas_transition_attribute_metadata.AdasTransitionAttributeMetadata] = None,
            covered_road_types_: typing.List[nds.core.types.road_type.RoadType] = None) -> None:
        self._content_ = content_
        self._road_location_attribute_metadata_ = road_location_attribute_metadata_
        self._road_location_transition_attribute_metadata_ = road_location_transition_attribute_metadata_
        self._covered_road_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), covered_road_types_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['AdasRoadLocationLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'AdasRoadLocationLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AdasRoadLocationLayerMetadata'],
            zserio_context: AdasRoadLocationLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AdasRoadLocationLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AdasRoadLocationLayerMetadata):
            return ((self._content_ == other._content_) and
                    (not other.is_road_location_attribute_metadata_used() if not self.is_road_location_attribute_metadata_used() else (self._road_location_attribute_metadata_ == other._road_location_attribute_metadata_)) and
                    (not other.is_road_location_transition_attribute_metadata_used() if not self.is_road_location_transition_attribute_metadata_used() else (self._road_location_transition_attribute_metadata_ == other._road_location_transition_attribute_metadata_)) and
                    (self._covered_road_types_ == other._covered_road_types_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_road_location_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_attribute_metadata_)
        if self.is_road_location_transition_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_transition_attribute_metadata_)
        result = zserio.hashcode.calc_hashcode_object(result, self._covered_road_types_)

        return result

    @property
    def content(self) -> typing.Union[nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def road_location_attribute_metadata(self) -> typing.Optional[nds.adas.instantiations.adas_road_attribute_metadata.AdasRoadAttributeMetadata]:
        return self._road_location_attribute_metadata_

    @road_location_attribute_metadata.setter
    def road_location_attribute_metadata(self, road_location_attribute_metadata_: typing.Optional[nds.adas.instantiations.adas_road_attribute_metadata.AdasRoadAttributeMetadata]) -> None:
        self._road_location_attribute_metadata_ = road_location_attribute_metadata_

    def is_road_location_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS) == nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_MAPS or (self._content_ & nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS) == nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_SETS

    def is_road_location_attribute_metadata_set(self) -> bool:
        return not self._road_location_attribute_metadata_ is None

    def reset_road_location_attribute_metadata(self) -> None:
        self._road_location_attribute_metadata_ = None

    @property
    def road_location_transition_attribute_metadata(self) -> typing.Optional[nds.adas.instantiations.adas_transition_attribute_metadata.AdasTransitionAttributeMetadata]:
        return self._road_location_transition_attribute_metadata_

    @road_location_transition_attribute_metadata.setter
    def road_location_transition_attribute_metadata(self, road_location_transition_attribute_metadata_: typing.Optional[nds.adas.instantiations.adas_transition_attribute_metadata.AdasTransitionAttributeMetadata]) -> None:
        self._road_location_transition_attribute_metadata_ = road_location_transition_attribute_metadata_

    def is_road_location_transition_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS) == nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS or (self._content_ & nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS) == nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS

    def is_road_location_transition_attribute_metadata_set(self) -> bool:
        return not self._road_location_transition_attribute_metadata_ is None

    def reset_road_location_transition_attribute_metadata(self) -> None:
        self._road_location_transition_attribute_metadata_ = None

    @property
    def covered_road_types(self) -> typing.List[nds.core.types.road_type.RoadType]:
        return self._covered_road_types_.raw_array

    @covered_road_types.setter
    def covered_road_types(self, covered_road_types_: typing.List[nds.core.types.road_type.RoadType]) -> None:
        self._covered_road_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), covered_road_types_, is_auto=True)

    def init_packing_context(self, zserio_context: AdasRoadLocationLayerMetadata.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_road_location_attribute_metadata_used():
            self._road_location_attribute_metadata_.init_packing_context(zserio_context.road_location_attribute_metadata)
        if self.is_road_location_transition_attribute_metadata_used():
            self._road_location_transition_attribute_metadata_.init_packing_context(zserio_context.road_location_transition_attribute_metadata)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_road_location_attribute_metadata_used():
            end_bitposition += self._road_location_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_road_location_transition_attribute_metadata_used():
            end_bitposition += self._road_location_transition_attribute_metadata_.bitsizeof(end_bitposition)
        end_bitposition += self._covered_road_types_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AdasRoadLocationLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_road_location_attribute_metadata_used():
            end_bitposition += self._road_location_attribute_metadata_.bitsizeof_packed(zserio_context.road_location_attribute_metadata, end_bitposition)
        if self.is_road_location_transition_attribute_metadata_used():
            end_bitposition += self._road_location_transition_attribute_metadata_.bitsizeof_packed(zserio_context.road_location_transition_attribute_metadata, end_bitposition)
        end_bitposition += self._covered_road_types_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_road_location_attribute_metadata_used():
            end_bitposition = self._road_location_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_road_location_transition_attribute_metadata_used():
            end_bitposition = self._road_location_transition_attribute_metadata_.initialize_offsets(end_bitposition)
        end_bitposition = self._covered_road_types_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AdasRoadLocationLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_road_location_attribute_metadata_used():
            end_bitposition = self._road_location_attribute_metadata_.initialize_offsets_packed(zserio_context.road_location_attribute_metadata, end_bitposition)
        if self.is_road_location_transition_attribute_metadata_used():
            end_bitposition = self._road_location_transition_attribute_metadata_.initialize_offsets_packed(zserio_context.road_location_transition_attribute_metadata, end_bitposition)
        end_bitposition = self._covered_road_types_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.from_reader(zserio_reader)
        if self.is_road_location_attribute_metadata_used():
            self._road_location_attribute_metadata_ = nds.adas.instantiations.adas_road_attribute_metadata.AdasRoadAttributeMetadata.from_reader(zserio_reader)
        else:
            self._road_location_attribute_metadata_ = None
        if self.is_road_location_transition_attribute_metadata_used():
            self._road_location_transition_attribute_metadata_ = nds.adas.instantiations.adas_transition_attribute_metadata.AdasTransitionAttributeMetadata.from_reader(zserio_reader)
        else:
            self._road_location_transition_attribute_metadata_ = None
        self._covered_road_types_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: AdasRoadLocationLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.adas.metadata.adas_road_location_layer_content.AdasRoadLocationLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_road_location_attribute_metadata_used():
            self._road_location_attribute_metadata_ = nds.adas.instantiations.adas_road_attribute_metadata.AdasRoadAttributeMetadata.from_reader_packed(zserio_context.road_location_attribute_metadata, zserio_reader)
        else:
            self._road_location_attribute_metadata_ = None

        if self.is_road_location_transition_attribute_metadata_used():
            self._road_location_transition_attribute_metadata_ = nds.adas.instantiations.adas_transition_attribute_metadata.AdasTransitionAttributeMetadata.from_reader_packed(zserio_context.road_location_transition_attribute_metadata, zserio_reader)
        else:
            self._road_location_transition_attribute_metadata_ = None

        self._covered_road_types_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_road_location_attribute_metadata_used():
            self._road_location_attribute_metadata_.write(zserio_writer)
        if self.is_road_location_transition_attribute_metadata_used():
            self._road_location_transition_attribute_metadata_.write(zserio_writer)
        self._covered_road_types_.write(zserio_writer)

    def write_packed(self, zserio_context: AdasRoadLocationLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_road_location_attribute_metadata_used():
            self._road_location_attribute_metadata_.write_packed(zserio_context.road_location_attribute_metadata, zserio_writer)

        if self.is_road_location_transition_attribute_metadata_used():
            self._road_location_transition_attribute_metadata_.write_packed(zserio_context.road_location_transition_attribute_metadata, zserio_writer)

        self._covered_road_types_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._road_location_attribute_metadata_ = nds.adas.instantiations.adas_road_attribute_metadata.AdasRoadAttributeMetadata.ZserioPackingContext()
            self._road_location_transition_attribute_metadata_ = nds.adas.instantiations.adas_transition_attribute_metadata.AdasTransitionAttributeMetadata.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def road_location_attribute_metadata(self):
            return self._road_location_attribute_metadata_

        @property
        def road_location_transition_attribute_metadata(self):
            return self._road_location_transition_attribute_metadata_

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
