# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.language.available_languages
import nds.core.types.road_type
import nds.instructions.instantiations.instructions_transition_attribute_metadata
import nds.instructions.metadata.road_instructions_layer_content

class RoadInstructionsLayerMetadata:
    def __init__(
            self,
            content_: typing.Union[nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent, None] = None,
            transition_metadata_: typing.Optional[nds.instructions.instantiations.instructions_transition_attribute_metadata.InstructionsTransitionAttributeMetadata] = None,
            covered_road_types_: typing.List[nds.core.types.road_type.RoadType] = None,
            global_image_references_: bool = bool(),
            available_languages_: typing.Union[nds.core.language.available_languages.AvailableLanguages, None] = None) -> None:
        self._content_ = content_
        self._transition_metadata_ = transition_metadata_
        self._covered_road_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), covered_road_types_, is_auto=True)
        self._global_image_references_ = global_image_references_
        self._available_languages_ = available_languages_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadInstructionsLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadInstructionsLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadInstructionsLayerMetadata'],
            zserio_context: RoadInstructionsLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadInstructionsLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadInstructionsLayerMetadata):
            return ((self._content_ == other._content_) and
                    (not other.is_transition_metadata_used() if not self.is_transition_metadata_used() else (self._transition_metadata_ == other._transition_metadata_)) and
                    (self._covered_road_types_ == other._covered_road_types_) and
                    (self._global_image_references_ == other._global_image_references_) and
                    (self._available_languages_ == other._available_languages_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_transition_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._transition_metadata_)
        result = zserio.hashcode.calc_hashcode_object(result, self._covered_road_types_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._global_image_references_)
        result = zserio.hashcode.calc_hashcode_object(result, self._available_languages_)

        return result

    @property
    def content(self) -> typing.Union[nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def transition_metadata(self) -> typing.Optional[nds.instructions.instantiations.instructions_transition_attribute_metadata.InstructionsTransitionAttributeMetadata]:
        return self._transition_metadata_

    @transition_metadata.setter
    def transition_metadata(self, transition_metadata_: typing.Optional[nds.instructions.instantiations.instructions_transition_attribute_metadata.InstructionsTransitionAttributeMetadata]) -> None:
        self._transition_metadata_ = transition_metadata_

    def is_transition_metadata_used(self) -> bool:
        return (self._content_ & nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent.Values.TRANSITION_MAPS) == nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent.Values.TRANSITION_MAPS or (self._content_ & nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent.Values.TRANSITION_SETS) == nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent.Values.TRANSITION_SETS

    def is_transition_metadata_set(self) -> bool:
        return not self._transition_metadata_ is None

    def reset_transition_metadata(self) -> None:
        self._transition_metadata_ = None

    @property
    def covered_road_types(self) -> typing.List[nds.core.types.road_type.RoadType]:
        return self._covered_road_types_.raw_array

    @covered_road_types.setter
    def covered_road_types(self, covered_road_types_: typing.List[nds.core.types.road_type.RoadType]) -> None:
        self._covered_road_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), covered_road_types_, is_auto=True)

    @property
    def global_image_references(self) -> bool:
        return self._global_image_references_

    @global_image_references.setter
    def global_image_references(self, global_image_references_: bool) -> None:
        self._global_image_references_ = global_image_references_

    @property
    def available_languages(self) -> typing.Union[nds.core.language.available_languages.AvailableLanguages, None]:
        return self._available_languages_

    @available_languages.setter
    def available_languages(self, available_languages_: typing.Union[nds.core.language.available_languages.AvailableLanguages, None]) -> None:
        self._available_languages_ = available_languages_

    def init_packing_context(self, zserio_context: RoadInstructionsLayerMetadata.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_transition_metadata_used():
            self._transition_metadata_.init_packing_context(zserio_context.transition_metadata)
        self._available_languages_.init_packing_context(zserio_context.available_languages)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_transition_metadata_used():
            end_bitposition += self._transition_metadata_.bitsizeof(end_bitposition)
        end_bitposition += self._covered_road_types_.bitsizeof(end_bitposition)
        end_bitposition += 1
        end_bitposition += self._available_languages_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadInstructionsLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_transition_metadata_used():
            end_bitposition += self._transition_metadata_.bitsizeof_packed(zserio_context.transition_metadata, end_bitposition)
        end_bitposition += self._covered_road_types_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        end_bitposition += self._available_languages_.bitsizeof_packed(zserio_context.available_languages, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_transition_metadata_used():
            end_bitposition = self._transition_metadata_.initialize_offsets(end_bitposition)
        end_bitposition = self._covered_road_types_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        end_bitposition = self._available_languages_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadInstructionsLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_transition_metadata_used():
            end_bitposition = self._transition_metadata_.initialize_offsets_packed(zserio_context.transition_metadata, end_bitposition)
        end_bitposition = self._covered_road_types_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        end_bitposition = self._available_languages_.initialize_offsets_packed(zserio_context.available_languages, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent.from_reader(zserio_reader)
        if self.is_transition_metadata_used():
            self._transition_metadata_ = nds.instructions.instantiations.instructions_transition_attribute_metadata.InstructionsTransitionAttributeMetadata.from_reader(zserio_reader)
        else:
            self._transition_metadata_ = None
        self._covered_road_types_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), zserio_reader, is_auto=True)
        self._global_image_references_ = zserio_reader.read_bool()
        self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.from_reader(zserio_reader)

    def read_packed(self, zserio_context: RoadInstructionsLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.instructions.metadata.road_instructions_layer_content.RoadInstructionsLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_transition_metadata_used():
            self._transition_metadata_ = nds.instructions.instantiations.instructions_transition_attribute_metadata.InstructionsTransitionAttributeMetadata.from_reader_packed(zserio_context.transition_metadata, zserio_reader)
        else:
            self._transition_metadata_ = None

        self._covered_road_types_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_covered_road_types()), zserio_reader, is_auto=True)

        self._global_image_references_ = zserio_reader.read_bool()

        self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.from_reader_packed(zserio_context.available_languages, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_transition_metadata_used():
            self._transition_metadata_.write(zserio_writer)
        self._covered_road_types_.write(zserio_writer)
        zserio_writer.write_bool(self._global_image_references_)
        self._available_languages_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadInstructionsLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_transition_metadata_used():
            self._transition_metadata_.write_packed(zserio_context.transition_metadata, zserio_writer)

        self._covered_road_types_.write_packed(zserio_writer)

        zserio_writer.write_bool(self._global_image_references_)

        self._available_languages_.write_packed(zserio_context.available_languages, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._transition_metadata_ = nds.instructions.instantiations.instructions_transition_attribute_metadata.InstructionsTransitionAttributeMetadata.ZserioPackingContext()
            self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def transition_metadata(self):
            return self._transition_metadata_

        @property
        def available_languages(self):
            return self._available_languages_

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