# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.characteristics.instantiations.characs_display_line_position_attribute_metadata
import nds.characteristics.instantiations.characs_display_line_range_attribute_metadata
import nds.characteristics.metadata.display_line_characs_layer_content
import nds.characteristics.metadata.road_location_provider_details

class DisplayLineCharacteristicsLayerMetadata:
    def __init__(
            self,
            content_: typing.Union[nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent, None] = None,
            display_line_range_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_metadata.CharacsDisplayLineRangeAttributeMetadata] = None,
            display_line_position_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_metadata.CharacsDisplayLinePositionAttributeMetadata] = None,
            road_location_provider_details_: typing.Optional[nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails] = None) -> None:
        self._content_ = content_
        self._display_line_range_attribute_metadata_ = display_line_range_attribute_metadata_
        self._display_line_position_attribute_metadata_ = display_line_position_attribute_metadata_
        self._road_location_provider_details_ = road_location_provider_details_

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayLineCharacteristicsLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'DisplayLineCharacteristicsLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayLineCharacteristicsLayerMetadata'],
            zserio_context: DisplayLineCharacteristicsLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DisplayLineCharacteristicsLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLineCharacteristicsLayerMetadata):
            return ((self._content_ == other._content_) and
                    (not other.is_display_line_range_attribute_metadata_used() if not self.is_display_line_range_attribute_metadata_used() else (self._display_line_range_attribute_metadata_ == other._display_line_range_attribute_metadata_)) and
                    (not other.is_display_line_position_attribute_metadata_used() if not self.is_display_line_position_attribute_metadata_used() else (self._display_line_position_attribute_metadata_ == other._display_line_position_attribute_metadata_)) and
                    (not other.is_road_location_provider_details_used() if not self.is_road_location_provider_details_used() else (self._road_location_provider_details_ == other._road_location_provider_details_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_display_line_range_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._display_line_range_attribute_metadata_)
        if self.is_display_line_position_attribute_metadata_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._display_line_position_attribute_metadata_)
        if self.is_road_location_provider_details_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_provider_details_)

        return result

    @property
    def content(self) -> typing.Union[nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def display_line_range_attribute_metadata(self) -> typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_metadata.CharacsDisplayLineRangeAttributeMetadata]:
        return self._display_line_range_attribute_metadata_

    @display_line_range_attribute_metadata.setter
    def display_line_range_attribute_metadata(self, display_line_range_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_metadata.CharacsDisplayLineRangeAttributeMetadata]) -> None:
        self._display_line_range_attribute_metadata_ = display_line_range_attribute_metadata_

    def is_display_line_range_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS or (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS

    def is_display_line_range_attribute_metadata_set(self) -> bool:
        return not self._display_line_range_attribute_metadata_ is None

    def reset_display_line_range_attribute_metadata(self) -> None:
        self._display_line_range_attribute_metadata_ = None

    @property
    def display_line_position_attribute_metadata(self) -> typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_metadata.CharacsDisplayLinePositionAttributeMetadata]:
        return self._display_line_position_attribute_metadata_

    @display_line_position_attribute_metadata.setter
    def display_line_position_attribute_metadata(self, display_line_position_attribute_metadata_: typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_metadata.CharacsDisplayLinePositionAttributeMetadata]) -> None:
        self._display_line_position_attribute_metadata_ = display_line_position_attribute_metadata_

    def is_display_line_position_attribute_metadata_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS or (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS

    def is_display_line_position_attribute_metadata_set(self) -> bool:
        return not self._display_line_position_attribute_metadata_ is None

    def reset_display_line_position_attribute_metadata(self) -> None:
        self._display_line_position_attribute_metadata_ = None

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

    def init_packing_context(self, zserio_context: DisplayLineCharacteristicsLayerMetadata.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_display_line_range_attribute_metadata_used():
            self._display_line_range_attribute_metadata_.init_packing_context(zserio_context.display_line_range_attribute_metadata)
        if self.is_display_line_position_attribute_metadata_used():
            self._display_line_position_attribute_metadata_.init_packing_context(zserio_context.display_line_position_attribute_metadata)
        if self.is_road_location_provider_details_used():
            self._road_location_provider_details_.init_packing_context(zserio_context.road_location_provider_details)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_display_line_range_attribute_metadata_used():
            end_bitposition += self._display_line_range_attribute_metadata_.bitsizeof(end_bitposition)
        if self.is_display_line_position_attribute_metadata_used():
            end_bitposition += self._display_line_position_attribute_metadata_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition += self._road_location_provider_details_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayLineCharacteristicsLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_display_line_range_attribute_metadata_used():
            end_bitposition += self._display_line_range_attribute_metadata_.bitsizeof_packed(zserio_context.display_line_range_attribute_metadata, end_bitposition)
        if self.is_display_line_position_attribute_metadata_used():
            end_bitposition += self._display_line_position_attribute_metadata_.bitsizeof_packed(zserio_context.display_line_position_attribute_metadata, end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition += self._road_location_provider_details_.bitsizeof_packed(zserio_context.road_location_provider_details, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_display_line_range_attribute_metadata_used():
            end_bitposition = self._display_line_range_attribute_metadata_.initialize_offsets(end_bitposition)
        if self.is_display_line_position_attribute_metadata_used():
            end_bitposition = self._display_line_position_attribute_metadata_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition = self._road_location_provider_details_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayLineCharacteristicsLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_display_line_range_attribute_metadata_used():
            end_bitposition = self._display_line_range_attribute_metadata_.initialize_offsets_packed(zserio_context.display_line_range_attribute_metadata, end_bitposition)
        if self.is_display_line_position_attribute_metadata_used():
            end_bitposition = self._display_line_position_attribute_metadata_.initialize_offsets_packed(zserio_context.display_line_position_attribute_metadata, end_bitposition)
        end_bitposition += 1
        if self.is_road_location_provider_details_used():
            end_bitposition = self._road_location_provider_details_.initialize_offsets_packed(zserio_context.road_location_provider_details, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.from_reader(zserio_reader)
        if self.is_display_line_range_attribute_metadata_used():
            self._display_line_range_attribute_metadata_ = nds.characteristics.instantiations.characs_display_line_range_attribute_metadata.CharacsDisplayLineRangeAttributeMetadata.from_reader(zserio_reader)
        else:
            self._display_line_range_attribute_metadata_ = None
        if self.is_display_line_position_attribute_metadata_used():
            self._display_line_position_attribute_metadata_ = nds.characteristics.instantiations.characs_display_line_position_attribute_metadata.CharacsDisplayLinePositionAttributeMetadata.from_reader(zserio_reader)
        else:
            self._display_line_position_attribute_metadata_ = None
        if zserio_reader.read_bool():
            self._road_location_provider_details_ = nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails.from_reader(zserio_reader)
        else:
            self._road_location_provider_details_ = None

    def read_packed(self, zserio_context: DisplayLineCharacteristicsLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_display_line_range_attribute_metadata_used():
            self._display_line_range_attribute_metadata_ = nds.characteristics.instantiations.characs_display_line_range_attribute_metadata.CharacsDisplayLineRangeAttributeMetadata.from_reader_packed(zserio_context.display_line_range_attribute_metadata, zserio_reader)
        else:
            self._display_line_range_attribute_metadata_ = None

        if self.is_display_line_position_attribute_metadata_used():
            self._display_line_position_attribute_metadata_ = nds.characteristics.instantiations.characs_display_line_position_attribute_metadata.CharacsDisplayLinePositionAttributeMetadata.from_reader_packed(zserio_context.display_line_position_attribute_metadata, zserio_reader)
        else:
            self._display_line_position_attribute_metadata_ = None

        if zserio_reader.read_bool():
            self._road_location_provider_details_ = nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails.from_reader_packed(zserio_context.road_location_provider_details, zserio_reader)
        else:
            self._road_location_provider_details_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_display_line_range_attribute_metadata_used():
            self._display_line_range_attribute_metadata_.write(zserio_writer)
        if self.is_display_line_position_attribute_metadata_used():
            self._display_line_position_attribute_metadata_.write(zserio_writer)
        if self.is_road_location_provider_details_used():
            zserio_writer.write_bool(True)
            self._road_location_provider_details_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: DisplayLineCharacteristicsLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_display_line_range_attribute_metadata_used():
            self._display_line_range_attribute_metadata_.write_packed(zserio_context.display_line_range_attribute_metadata, zserio_writer)

        if self.is_display_line_position_attribute_metadata_used():
            self._display_line_position_attribute_metadata_.write_packed(zserio_context.display_line_position_attribute_metadata, zserio_writer)

        if self.is_road_location_provider_details_used():
            zserio_writer.write_bool(True)
            self._road_location_provider_details_.write_packed(zserio_context.road_location_provider_details, zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._display_line_range_attribute_metadata_ = nds.characteristics.instantiations.characs_display_line_range_attribute_metadata.CharacsDisplayLineRangeAttributeMetadata.ZserioPackingContext()
            self._display_line_position_attribute_metadata_ = nds.characteristics.instantiations.characs_display_line_position_attribute_metadata.CharacsDisplayLinePositionAttributeMetadata.ZserioPackingContext()
            self._road_location_provider_details_ = nds.characteristics.metadata.road_location_provider_details.RoadLocationProviderDetails.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def display_line_range_attribute_metadata(self):
            return self._display_line_range_attribute_metadata_

        @property
        def display_line_position_attribute_metadata(self):
            return self._display_line_position_attribute_metadata_

        @property
        def road_location_provider_details(self):
            return self._road_location_provider_details_
