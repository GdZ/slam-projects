# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.display.details.instantiations.display_area_attribute_metadata
import nds.display.details.instantiations.display_line_attribute_metadata
import nds.display.details.instantiations.display_point_attribute_metadata
import nds.display.details.metadata.display_attribute_layer_content

class DisplayAttributeLayerMetadata:
    def __init__(
            self,
            content_: typing.Union[nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent, None] = None,
            display_area_attribute_metadata_: typing.Optional[nds.display.details.instantiations.display_area_attribute_metadata.DisplayAreaAttributeMetadata] = None,
            display_line_attribute_metadata_: typing.Optional[nds.display.details.instantiations.display_line_attribute_metadata.DisplayLineAttributeMetadata] = None,
            display_point_attribute_metadata_: typing.Optional[nds.display.details.instantiations.display_point_attribute_metadata.DisplayPointAttributeMetadata] = None) -> None:
        self._content_ = content_
        self._display_area_attribute_metadata_ = display_area_attribute_metadata_
        self._display_line_attribute_metadata_ = display_line_attribute_metadata_
        self._display_point_attribute_metadata_ = display_point_attribute_metadata_

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayAttributeLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'DisplayAttributeLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayAttributeLayerMetadata'],
            zserio_context: DisplayAttributeLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DisplayAttributeLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayAttributeLayerMetadata):
            return ((self._content_ == other._content_) and
                    (not other.is_display_area_attribute_metadata_used() if not self.is_display_area_attribute_metadata_used() else (self._display_area_attribute_metadata_ == other._display_area_attribute_metadata_)) and
                    (not other.is_display_line_attribute_metadata_used() if not self.is_display_line_attribute_metadata_used() else (self._display_line_attribute_metadata_ == other._display_line_attribute_metadata_)) and
                    (not other.is_display_point_attribute_metadata_used() if not self.is_display_point_attribute_metadata_used() else (self._display_point_attribute_metadata_ == other._display_point_attribute_metadata_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_display_area_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._display_area_attribute_metadata_)
        if self.is_display_line_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._display_line_attribute_metadata_)
        if self.is_display_point_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._display_point_attribute_metadata_)

        return result

    @property
    def content(self) -> typing.Union[nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def display_area_attribute_metadata(self) -> typing.Optional[nds.display.details.instantiations.display_area_attribute_metadata.DisplayAreaAttributeMetadata]:
        return self._display_area_attribute_metadata_

    @display_area_attribute_metadata.setter
    def display_area_attribute_metadata(self, display_area_attribute_metadata_: typing.Optional[nds.display.details.instantiations.display_area_attribute_metadata.DisplayAreaAttributeMetadata]) -> None:
        self._display_area_attribute_metadata_ = display_area_attribute_metadata_

    def is_display_area_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS) == nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_AREA_MAPS or (self._content_ & nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS) == nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_AREA_SETS

    def is_display_area_attribute_metadata_set(self) -> bool:
        return not self._display_area_attribute_metadata_ is None

    def reset_display_area_attribute_metadata(self) -> None:
        self._display_area_attribute_metadata_ = None

    @property
    def display_line_attribute_metadata(self) -> typing.Optional[nds.display.details.instantiations.display_line_attribute_metadata.DisplayLineAttributeMetadata]:
        return self._display_line_attribute_metadata_

    @display_line_attribute_metadata.setter
    def display_line_attribute_metadata(self, display_line_attribute_metadata_: typing.Optional[nds.display.details.instantiations.display_line_attribute_metadata.DisplayLineAttributeMetadata]) -> None:
        self._display_line_attribute_metadata_ = display_line_attribute_metadata_

    def is_display_line_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS) == nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_LINE_MAPS or (self._content_ & nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS) == nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_LINE_SETS

    def is_display_line_attribute_metadata_set(self) -> bool:
        return not self._display_line_attribute_metadata_ is None

    def reset_display_line_attribute_metadata(self) -> None:
        self._display_line_attribute_metadata_ = None

    @property
    def display_point_attribute_metadata(self) -> typing.Optional[nds.display.details.instantiations.display_point_attribute_metadata.DisplayPointAttributeMetadata]:
        return self._display_point_attribute_metadata_

    @display_point_attribute_metadata.setter
    def display_point_attribute_metadata(self, display_point_attribute_metadata_: typing.Optional[nds.display.details.instantiations.display_point_attribute_metadata.DisplayPointAttributeMetadata]) -> None:
        self._display_point_attribute_metadata_ = display_point_attribute_metadata_

    def is_display_point_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS) == nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_POINT_MAPS or (self._content_ & nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS) == nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.Values.DISPLAY_POINT_SETS

    def is_display_point_attribute_metadata_set(self) -> bool:
        return not self._display_point_attribute_metadata_ is None

    def reset_display_point_attribute_metadata(self) -> None:
        self._display_point_attribute_metadata_ = None

    def init_packing_context(self, zserio_context: DisplayAttributeLayerMetadata.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_display_area_attribute_metadata_used():
            self._display_area_attribute_metadata_.init_packing_context(zserio_context.display_area_attribute_metadata)
        if self.is_display_line_attribute_metadata_used():
            self._display_line_attribute_metadata_.init_packing_context(zserio_context.display_line_attribute_metadata)
        if self.is_display_point_attribute_metadata_used():
            self._display_point_attribute_metadata_.init_packing_context(zserio_context.display_point_attribute_metadata)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_display_area_attribute_metadata_used():
            end_bitposition += self._display_area_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_display_line_attribute_metadata_used():
            end_bitposition += self._display_line_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_display_point_attribute_metadata_used():
            end_bitposition += self._display_point_attribute_metadata_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayAttributeLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_display_area_attribute_metadata_used():
            end_bitposition += self._display_area_attribute_metadata_.bitsizeof_packed(zserio_context.display_area_attribute_metadata, end_bitposition)
        if self.is_display_line_attribute_metadata_used():
            end_bitposition += self._display_line_attribute_metadata_.bitsizeof_packed(zserio_context.display_line_attribute_metadata, end_bitposition)
        if self.is_display_point_attribute_metadata_used():
            end_bitposition += self._display_point_attribute_metadata_.bitsizeof_packed(zserio_context.display_point_attribute_metadata, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_display_area_attribute_metadata_used():
            end_bitposition = self._display_area_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_display_line_attribute_metadata_used():
            end_bitposition = self._display_line_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_display_point_attribute_metadata_used():
            end_bitposition = self._display_point_attribute_metadata_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayAttributeLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_display_area_attribute_metadata_used():
            end_bitposition = self._display_area_attribute_metadata_.initialize_offsets_packed(zserio_context.display_area_attribute_metadata, end_bitposition)
        if self.is_display_line_attribute_metadata_used():
            end_bitposition = self._display_line_attribute_metadata_.initialize_offsets_packed(zserio_context.display_line_attribute_metadata, end_bitposition)
        if self.is_display_point_attribute_metadata_used():
            end_bitposition = self._display_point_attribute_metadata_.initialize_offsets_packed(zserio_context.display_point_attribute_metadata, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.from_reader(zserio_reader)
        if self.is_display_area_attribute_metadata_used():
            self._display_area_attribute_metadata_ = nds.display.details.instantiations.display_area_attribute_metadata.DisplayAreaAttributeMetadata.from_reader(zserio_reader)
        else:
            self._display_area_attribute_metadata_ = None
        if self.is_display_line_attribute_metadata_used():
            self._display_line_attribute_metadata_ = nds.display.details.instantiations.display_line_attribute_metadata.DisplayLineAttributeMetadata.from_reader(zserio_reader)
        else:
            self._display_line_attribute_metadata_ = None
        if self.is_display_point_attribute_metadata_used():
            self._display_point_attribute_metadata_ = nds.display.details.instantiations.display_point_attribute_metadata.DisplayPointAttributeMetadata.from_reader(zserio_reader)
        else:
            self._display_point_attribute_metadata_ = None

    def read_packed(self, zserio_context: DisplayAttributeLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.display.details.metadata.display_attribute_layer_content.DisplayAttributeLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_display_area_attribute_metadata_used():
            self._display_area_attribute_metadata_ = nds.display.details.instantiations.display_area_attribute_metadata.DisplayAreaAttributeMetadata.from_reader_packed(zserio_context.display_area_attribute_metadata, zserio_reader)
        else:
            self._display_area_attribute_metadata_ = None

        if self.is_display_line_attribute_metadata_used():
            self._display_line_attribute_metadata_ = nds.display.details.instantiations.display_line_attribute_metadata.DisplayLineAttributeMetadata.from_reader_packed(zserio_context.display_line_attribute_metadata, zserio_reader)
        else:
            self._display_line_attribute_metadata_ = None

        if self.is_display_point_attribute_metadata_used():
            self._display_point_attribute_metadata_ = nds.display.details.instantiations.display_point_attribute_metadata.DisplayPointAttributeMetadata.from_reader_packed(zserio_context.display_point_attribute_metadata, zserio_reader)
        else:
            self._display_point_attribute_metadata_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_display_area_attribute_metadata_used():
            self._display_area_attribute_metadata_.write(zserio_writer)
        if self.is_display_line_attribute_metadata_used():
            self._display_line_attribute_metadata_.write(zserio_writer)
        if self.is_display_point_attribute_metadata_used():
            self._display_point_attribute_metadata_.write(zserio_writer)

    def write_packed(self, zserio_context: DisplayAttributeLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_display_area_attribute_metadata_used():
            self._display_area_attribute_metadata_.write_packed(zserio_context.display_area_attribute_metadata, zserio_writer)

        if self.is_display_line_attribute_metadata_used():
            self._display_line_attribute_metadata_.write_packed(zserio_context.display_line_attribute_metadata, zserio_writer)

        if self.is_display_point_attribute_metadata_used():
            self._display_point_attribute_metadata_.write_packed(zserio_context.display_point_attribute_metadata, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._display_area_attribute_metadata_ = nds.display.details.instantiations.display_area_attribute_metadata.DisplayAreaAttributeMetadata.ZserioPackingContext()
            self._display_line_attribute_metadata_ = nds.display.details.instantiations.display_line_attribute_metadata.DisplayLineAttributeMetadata.ZserioPackingContext()
            self._display_point_attribute_metadata_ = nds.display.details.instantiations.display_point_attribute_metadata.DisplayPointAttributeMetadata.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def display_area_attribute_metadata(self):
            return self._display_area_attribute_metadata_

        @property
        def display_line_attribute_metadata(self):
            return self._display_line_attribute_metadata_

        @property
        def display_point_attribute_metadata(self):
            return self._display_point_attribute_metadata_
