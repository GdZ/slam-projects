# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.characteristics.instantiations.characs_display_line_position_attribute_map_list
import nds.characteristics.instantiations.characs_display_line_position_attribute_set_list
import nds.characteristics.instantiations.characs_display_line_range_attribute_map_list
import nds.characteristics.instantiations.characs_display_line_range_attribute_set_list
import nds.characteristics.metadata.display_line_characs_layer_content
import nds.core.geometry.coord_shift
import nds.system.types.layer_type

class DisplayLineCharacteristicsLayer:
    def __init__(
            self,
            content_: typing.Union[nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent, None] = None,
            shift_: nds.core.geometry.coord_shift.CoordShift = nds.core.geometry.coord_shift.CoordShift(),
            characs_display_line_range_maps_: typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_map_list.CharacsDisplayLineRangeAttributeMapList] = None,
            characs_display_line_position_maps_: typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_map_list.CharacsDisplayLinePositionAttributeMapList] = None,
            characs_display_line_range_sets_: typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_set_list.CharacsDisplayLineRangeAttributeSetList] = None,
            characs_display_line_position_sets_: typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_set_list.CharacsDisplayLinePositionAttributeSetList] = None) -> None:
        self._content_ = content_
        self._shift_ = shift_
        self._characs_display_line_range_maps_ = characs_display_line_range_maps_
        self._characs_display_line_position_maps_ = characs_display_line_position_maps_
        self._characs_display_line_range_sets_ = characs_display_line_range_sets_
        self._characs_display_line_position_sets_ = characs_display_line_position_sets_

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayLineCharacteristicsLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'DisplayLineCharacteristicsLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayLineCharacteristicsLayer'],
            zserio_context: DisplayLineCharacteristicsLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DisplayLineCharacteristicsLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLineCharacteristicsLayer):
            return ((self._content_ == other._content_) and
                    (self._shift_ == other._shift_) and
                    (not other.is_characs_display_line_range_maps_used() if not self.is_characs_display_line_range_maps_used() else (self._characs_display_line_range_maps_ == other._characs_display_line_range_maps_)) and
                    (not other.is_characs_display_line_position_maps_used() if not self.is_characs_display_line_position_maps_used() else (self._characs_display_line_position_maps_ == other._characs_display_line_position_maps_)) and
                    (not other.is_characs_display_line_range_sets_used() if not self.is_characs_display_line_range_sets_used() else (self._characs_display_line_range_sets_ == other._characs_display_line_range_sets_)) and
                    (not other.is_characs_display_line_position_sets_used() if not self.is_characs_display_line_position_sets_used() else (self._characs_display_line_position_sets_ == other._characs_display_line_position_sets_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        if self.is_characs_display_line_range_maps_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._characs_display_line_range_maps_)
        if self.is_characs_display_line_position_maps_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._characs_display_line_position_maps_)
        if self.is_characs_display_line_range_sets_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._characs_display_line_range_sets_)
        if self.is_characs_display_line_position_sets_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._characs_display_line_position_sets_)

        return result

    @property
    def content(self) -> typing.Union[nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @shift.setter
    def shift(self, shift_: nds.core.geometry.coord_shift.CoordShift) -> None:
        self._shift_ = shift_

    @property
    def characs_display_line_range_maps(self) -> typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_map_list.CharacsDisplayLineRangeAttributeMapList]:
        return self._characs_display_line_range_maps_

    @characs_display_line_range_maps.setter
    def characs_display_line_range_maps(self, characs_display_line_range_maps_: typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_map_list.CharacsDisplayLineRangeAttributeMapList]) -> None:
        self._characs_display_line_range_maps_ = characs_display_line_range_maps_

    def is_characs_display_line_range_maps_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS

    def is_characs_display_line_range_maps_set(self) -> bool:
        return not self._characs_display_line_range_maps_ is None

    def reset_characs_display_line_range_maps(self) -> None:
        self._characs_display_line_range_maps_ = None

    @property
    def characs_display_line_position_maps(self) -> typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_map_list.CharacsDisplayLinePositionAttributeMapList]:
        return self._characs_display_line_position_maps_

    @characs_display_line_position_maps.setter
    def characs_display_line_position_maps(self, characs_display_line_position_maps_: typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_map_list.CharacsDisplayLinePositionAttributeMapList]) -> None:
        self._characs_display_line_position_maps_ = characs_display_line_position_maps_

    def is_characs_display_line_position_maps_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS

    def is_characs_display_line_position_maps_set(self) -> bool:
        return not self._characs_display_line_position_maps_ is None

    def reset_characs_display_line_position_maps(self) -> None:
        self._characs_display_line_position_maps_ = None

    @property
    def characs_display_line_range_sets(self) -> typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_set_list.CharacsDisplayLineRangeAttributeSetList]:
        return self._characs_display_line_range_sets_

    @characs_display_line_range_sets.setter
    def characs_display_line_range_sets(self, characs_display_line_range_sets_: typing.Optional[nds.characteristics.instantiations.characs_display_line_range_attribute_set_list.CharacsDisplayLineRangeAttributeSetList]) -> None:
        self._characs_display_line_range_sets_ = characs_display_line_range_sets_

    def is_characs_display_line_range_sets_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS

    def is_characs_display_line_range_sets_set(self) -> bool:
        return not self._characs_display_line_range_sets_ is None

    def reset_characs_display_line_range_sets(self) -> None:
        self._characs_display_line_range_sets_ = None

    @property
    def characs_display_line_position_sets(self) -> typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_set_list.CharacsDisplayLinePositionAttributeSetList]:
        return self._characs_display_line_position_sets_

    @characs_display_line_position_sets.setter
    def characs_display_line_position_sets(self, characs_display_line_position_sets_: typing.Optional[nds.characteristics.instantiations.characs_display_line_position_attribute_set_list.CharacsDisplayLinePositionAttributeSetList]) -> None:
        self._characs_display_line_position_sets_ = characs_display_line_position_sets_

    def is_characs_display_line_position_sets_used(self) -> bool:
        return (self._content_ & nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS) == nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS

    def is_characs_display_line_position_sets_set(self) -> bool:
        return not self._characs_display_line_position_sets_ is None

    def reset_characs_display_line_position_sets(self) -> None:
        self._characs_display_line_position_sets_ = None

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.ATTRIBUTE

    def init_packing_context(self, zserio_context: DisplayLineCharacteristicsLayer.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        zserio_context.shift.init(zserio.array.BitFieldArrayTraits(5), self._shift_)
        if self.is_characs_display_line_range_maps_used():
            self._characs_display_line_range_maps_.init_packing_context(zserio_context.characs_display_line_range_maps)
        if self.is_characs_display_line_position_maps_used():
            self._characs_display_line_position_maps_.init_packing_context(zserio_context.characs_display_line_position_maps)
        if self.is_characs_display_line_range_sets_used():
            self._characs_display_line_range_sets_.init_packing_context(zserio_context.characs_display_line_range_sets)
        if self.is_characs_display_line_position_sets_used():
            self._characs_display_line_position_sets_.init_packing_context(zserio_context.characs_display_line_position_sets)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        end_bitposition += 5
        if self.is_characs_display_line_range_maps_used():
            end_bitposition += self._characs_display_line_range_maps_.bitsizeof(end_bitposition)
        if self.is_characs_display_line_position_maps_used():
            end_bitposition += self._characs_display_line_position_maps_.bitsizeof(end_bitposition)
        if self.is_characs_display_line_range_sets_used():
            end_bitposition += self._characs_display_line_range_sets_.bitsizeof(end_bitposition)
        if self.is_characs_display_line_position_sets_used():
            end_bitposition += self._characs_display_line_position_sets_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayLineCharacteristicsLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        if self.is_characs_display_line_range_maps_used():
            end_bitposition += self._characs_display_line_range_maps_.bitsizeof_packed(zserio_context.characs_display_line_range_maps, end_bitposition)
        if self.is_characs_display_line_position_maps_used():
            end_bitposition += self._characs_display_line_position_maps_.bitsizeof_packed(zserio_context.characs_display_line_position_maps, end_bitposition)
        if self.is_characs_display_line_range_sets_used():
            end_bitposition += self._characs_display_line_range_sets_.bitsizeof_packed(zserio_context.characs_display_line_range_sets, end_bitposition)
        if self.is_characs_display_line_position_sets_used():
            end_bitposition += self._characs_display_line_position_sets_.bitsizeof_packed(zserio_context.characs_display_line_position_sets, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        end_bitposition += 5
        if self.is_characs_display_line_range_maps_used():
            end_bitposition = self._characs_display_line_range_maps_.initialize_offsets(end_bitposition)
        if self.is_characs_display_line_position_maps_used():
            end_bitposition = self._characs_display_line_position_maps_.initialize_offsets(end_bitposition)
        if self.is_characs_display_line_range_sets_used():
            end_bitposition = self._characs_display_line_range_sets_.initialize_offsets(end_bitposition)
        if self.is_characs_display_line_position_sets_used():
            end_bitposition = self._characs_display_line_position_sets_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayLineCharacteristicsLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        if self.is_characs_display_line_range_maps_used():
            end_bitposition = self._characs_display_line_range_maps_.initialize_offsets_packed(zserio_context.characs_display_line_range_maps, end_bitposition)
        if self.is_characs_display_line_position_maps_used():
            end_bitposition = self._characs_display_line_position_maps_.initialize_offsets_packed(zserio_context.characs_display_line_position_maps, end_bitposition)
        if self.is_characs_display_line_range_sets_used():
            end_bitposition = self._characs_display_line_range_sets_.initialize_offsets_packed(zserio_context.characs_display_line_range_sets, end_bitposition)
        if self.is_characs_display_line_position_sets_used():
            end_bitposition = self._characs_display_line_position_sets_.initialize_offsets_packed(zserio_context.characs_display_line_position_sets, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.from_reader(zserio_reader)
        self._shift_ = zserio_reader.read_bits(5)
        if self.is_characs_display_line_range_maps_used():
            self._characs_display_line_range_maps_ = nds.characteristics.instantiations.characs_display_line_range_attribute_map_list.CharacsDisplayLineRangeAttributeMapList.from_reader(zserio_reader, self._shift_)
        else:
            self._characs_display_line_range_maps_ = None
        if self.is_characs_display_line_position_maps_used():
            self._characs_display_line_position_maps_ = nds.characteristics.instantiations.characs_display_line_position_attribute_map_list.CharacsDisplayLinePositionAttributeMapList.from_reader(zserio_reader, self._shift_)
        else:
            self._characs_display_line_position_maps_ = None
        if self.is_characs_display_line_range_sets_used():
            self._characs_display_line_range_sets_ = nds.characteristics.instantiations.characs_display_line_range_attribute_set_list.CharacsDisplayLineRangeAttributeSetList.from_reader(zserio_reader, self._shift_)
        else:
            self._characs_display_line_range_sets_ = None
        if self.is_characs_display_line_position_sets_used():
            self._characs_display_line_position_sets_ = nds.characteristics.instantiations.characs_display_line_position_attribute_set_list.CharacsDisplayLinePositionAttributeSetList.from_reader(zserio_reader, 0)
        else:
            self._characs_display_line_position_sets_ = None

    def read_packed(self, zserio_context: DisplayLineCharacteristicsLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.characteristics.metadata.display_line_characs_layer_content.DisplayLineCharacsLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        self._shift_ = zserio_context.shift.read(zserio.array.BitFieldArrayTraits(5), zserio_reader)

        if self.is_characs_display_line_range_maps_used():
            self._characs_display_line_range_maps_ = nds.characteristics.instantiations.characs_display_line_range_attribute_map_list.CharacsDisplayLineRangeAttributeMapList.from_reader_packed(zserio_context.characs_display_line_range_maps, zserio_reader, self._shift_)
        else:
            self._characs_display_line_range_maps_ = None

        if self.is_characs_display_line_position_maps_used():
            self._characs_display_line_position_maps_ = nds.characteristics.instantiations.characs_display_line_position_attribute_map_list.CharacsDisplayLinePositionAttributeMapList.from_reader_packed(zserio_context.characs_display_line_position_maps, zserio_reader, self._shift_)
        else:
            self._characs_display_line_position_maps_ = None

        if self.is_characs_display_line_range_sets_used():
            self._characs_display_line_range_sets_ = nds.characteristics.instantiations.characs_display_line_range_attribute_set_list.CharacsDisplayLineRangeAttributeSetList.from_reader_packed(zserio_context.characs_display_line_range_sets, zserio_reader, self._shift_)
        else:
            self._characs_display_line_range_sets_ = None

        if self.is_characs_display_line_position_sets_used():
            self._characs_display_line_position_sets_ = nds.characteristics.instantiations.characs_display_line_position_attribute_set_list.CharacsDisplayLinePositionAttributeSetList.from_reader_packed(zserio_context.characs_display_line_position_sets, zserio_reader, 0)
        else:
            self._characs_display_line_position_sets_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)

        zserio_writer.write_bits(self._shift_, 5)

        if self.is_characs_display_line_range_maps_used():
            # check parameters
            if self._characs_display_line_range_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLineRangeMaps: "
                                                    f"{self._characs_display_line_range_maps_.coord_shift} != {self._shift_}!")
            self._characs_display_line_range_maps_.write(zserio_writer)

        if self.is_characs_display_line_position_maps_used():
            # check parameters
            if self._characs_display_line_position_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLinePositionMaps: "
                                                    f"{self._characs_display_line_position_maps_.coord_shift} != {self._shift_}!")
            self._characs_display_line_position_maps_.write(zserio_writer)

        if self.is_characs_display_line_range_sets_used():
            # check parameters
            if self._characs_display_line_range_sets_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLineRangeSets: "
                                                    f"{self._characs_display_line_range_sets_.coord_shift} != {self._shift_}!")
            self._characs_display_line_range_sets_.write(zserio_writer)

        if self.is_characs_display_line_position_sets_used():
            # check parameters
            if self._characs_display_line_position_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLinePositionSets: "
                                                    f"{self._characs_display_line_position_sets_.coord_shift} != {0}!")
            self._characs_display_line_position_sets_.write(zserio_writer)

    def write_packed(self, zserio_context: DisplayLineCharacteristicsLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        zserio_context.shift.write(zserio.array.BitFieldArrayTraits(5), zserio_writer, self._shift_)

        if self.is_characs_display_line_range_maps_used():
            # check parameters
            if self._characs_display_line_range_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLineRangeMaps: "
                                                    f"{self._characs_display_line_range_maps_.coord_shift} != {self._shift_}!")
            self._characs_display_line_range_maps_.write_packed(zserio_context.characs_display_line_range_maps, zserio_writer)

        if self.is_characs_display_line_position_maps_used():
            # check parameters
            if self._characs_display_line_position_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLinePositionMaps: "
                                                    f"{self._characs_display_line_position_maps_.coord_shift} != {self._shift_}!")
            self._characs_display_line_position_maps_.write_packed(zserio_context.characs_display_line_position_maps, zserio_writer)

        if self.is_characs_display_line_range_sets_used():
            # check parameters
            if self._characs_display_line_range_sets_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLineRangeSets: "
                                                    f"{self._characs_display_line_range_sets_.coord_shift} != {self._shift_}!")
            self._characs_display_line_range_sets_.write_packed(zserio_context.characs_display_line_range_sets, zserio_writer)

        if self.is_characs_display_line_position_sets_used():
            # check parameters
            if self._characs_display_line_position_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field DisplayLineCharacteristicsLayer.characsDisplayLinePositionSets: "
                                                    f"{self._characs_display_line_position_sets_.coord_shift} != {0}!")
            self._characs_display_line_position_sets_.write_packed(zserio_context.characs_display_line_position_sets, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._shift_ = zserio.array.DeltaContext()
            self._characs_display_line_range_maps_ = nds.characteristics.instantiations.characs_display_line_range_attribute_map_list.CharacsDisplayLineRangeAttributeMapList.ZserioPackingContext()
            self._characs_display_line_position_maps_ = nds.characteristics.instantiations.characs_display_line_position_attribute_map_list.CharacsDisplayLinePositionAttributeMapList.ZserioPackingContext()
            self._characs_display_line_range_sets_ = nds.characteristics.instantiations.characs_display_line_range_attribute_set_list.CharacsDisplayLineRangeAttributeSetList.ZserioPackingContext()
            self._characs_display_line_position_sets_ = nds.characteristics.instantiations.characs_display_line_position_attribute_set_list.CharacsDisplayLinePositionAttributeSetList.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def shift(self):
            return self._shift_

        @property
        def characs_display_line_range_maps(self):
            return self._characs_display_line_range_maps_

        @property
        def characs_display_line_position_maps(self):
            return self._characs_display_line_position_maps_

        @property
        def characs_display_line_range_sets(self):
            return self._characs_display_line_range_sets_

        @property
        def characs_display_line_position_sets(self):
            return self._characs_display_line_position_sets_
