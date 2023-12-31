# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.name.instantiations.name_lane_position_attribute_map_list
import nds.name.instantiations.name_lane_position_attribute_set_list
import nds.name.instantiations.name_lane_range_attribute_map_list
import nds.name.instantiations.name_lane_range_attribute_set_list
import nds.name.metadata.lane_name_layer_content
import nds.name.types.address_format
import nds.name.types.administrative_hierarchy_element
import nds.system.types.layer_type

class LaneNameLayer:
    def __init__(
            self,
            content_: typing.Union[nds.name.metadata.lane_name_layer_content.LaneNameLayerContent, None] = None,
            lane_range_attribute_maps_: typing.Optional[nds.name.instantiations.name_lane_range_attribute_map_list.NameLaneRangeAttributeMapList] = None,
            lane_position_attribute_maps_: typing.Optional[nds.name.instantiations.name_lane_position_attribute_map_list.NameLanePositionAttributeMapList] = None,
            lane_range_attribute_sets_: typing.Optional[nds.name.instantiations.name_lane_range_attribute_set_list.NameLaneRangeAttributeSetList] = None,
            lane_position_attribute_sets_: typing.Optional[nds.name.instantiations.name_lane_position_attribute_set_list.NameLanePositionAttributeSetList] = None,
            admin_hierarchy_element_definitions_: typing.Optional[typing.List[nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement]] = None,
            address_formats_: typing.Optional[typing.List[nds.name.types.address_format.AddressFormat]] = None) -> None:
        self._content_ = content_
        self._lane_range_attribute_maps_ = lane_range_attribute_maps_
        self._lane_position_attribute_maps_ = lane_position_attribute_maps_
        self._lane_range_attribute_sets_ = lane_range_attribute_sets_
        self._lane_position_attribute_sets_ = lane_position_attribute_sets_
        if admin_hierarchy_element_definitions_ is None:
            self._admin_hierarchy_element_definitions_ = None
        else:
            self._admin_hierarchy_element_definitions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_hierarchy_element_definitions()), admin_hierarchy_element_definitions_, is_auto=True)
        if address_formats_ is None:
            self._address_formats_ = None
        else:
            self._address_formats_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), address_formats_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['LaneNameLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneNameLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneNameLayer'],
            zserio_context: LaneNameLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneNameLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneNameLayer):
            return ((self._content_ == other._content_) and
                    (not other.is_lane_range_attribute_maps_used() if not self.is_lane_range_attribute_maps_used() else (self._lane_range_attribute_maps_ == other._lane_range_attribute_maps_)) and
                    (not other.is_lane_position_attribute_maps_used() if not self.is_lane_position_attribute_maps_used() else (self._lane_position_attribute_maps_ == other._lane_position_attribute_maps_)) and
                    (not other.is_lane_range_attribute_sets_used() if not self.is_lane_range_attribute_sets_used() else (self._lane_range_attribute_sets_ == other._lane_range_attribute_sets_)) and
                    (not other.is_lane_position_attribute_sets_used() if not self.is_lane_position_attribute_sets_used() else (self._lane_position_attribute_sets_ == other._lane_position_attribute_sets_)) and
                    (not other.is_admin_hierarchy_element_definitions_used() if not self.is_admin_hierarchy_element_definitions_used() else (self._admin_hierarchy_element_definitions_ == other._admin_hierarchy_element_definitions_)) and
                    (not other.is_address_formats_used() if not self.is_address_formats_used() else (self._address_formats_ == other._address_formats_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_lane_range_attribute_maps_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lane_range_attribute_maps_)
        if self.is_lane_position_attribute_maps_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lane_position_attribute_maps_)
        if self.is_lane_range_attribute_sets_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lane_range_attribute_sets_)
        if self.is_lane_position_attribute_sets_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lane_position_attribute_sets_)
        if self.is_admin_hierarchy_element_definitions_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._admin_hierarchy_element_definitions_)
        if self.is_address_formats_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._address_formats_)

        return result

    @property
    def content(self) -> typing.Union[nds.name.metadata.lane_name_layer_content.LaneNameLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.name.metadata.lane_name_layer_content.LaneNameLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def lane_range_attribute_maps(self) -> typing.Optional[nds.name.instantiations.name_lane_range_attribute_map_list.NameLaneRangeAttributeMapList]:
        return self._lane_range_attribute_maps_

    @lane_range_attribute_maps.setter
    def lane_range_attribute_maps(self, lane_range_attribute_maps_: typing.Optional[nds.name.instantiations.name_lane_range_attribute_map_list.NameLaneRangeAttributeMapList]) -> None:
        self._lane_range_attribute_maps_ = lane_range_attribute_maps_

    def is_lane_range_attribute_maps_used(self) -> bool:
        return (self._content_ & nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_RANGE_MAPS) == nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_RANGE_MAPS

    def is_lane_range_attribute_maps_set(self) -> bool:
        return not self._lane_range_attribute_maps_ is None

    def reset_lane_range_attribute_maps(self) -> None:
        self._lane_range_attribute_maps_ = None

    @property
    def lane_position_attribute_maps(self) -> typing.Optional[nds.name.instantiations.name_lane_position_attribute_map_list.NameLanePositionAttributeMapList]:
        return self._lane_position_attribute_maps_

    @lane_position_attribute_maps.setter
    def lane_position_attribute_maps(self, lane_position_attribute_maps_: typing.Optional[nds.name.instantiations.name_lane_position_attribute_map_list.NameLanePositionAttributeMapList]) -> None:
        self._lane_position_attribute_maps_ = lane_position_attribute_maps_

    def is_lane_position_attribute_maps_used(self) -> bool:
        return (self._content_ & nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_POSITION_MAPS) == nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_POSITION_MAPS

    def is_lane_position_attribute_maps_set(self) -> bool:
        return not self._lane_position_attribute_maps_ is None

    def reset_lane_position_attribute_maps(self) -> None:
        self._lane_position_attribute_maps_ = None

    @property
    def lane_range_attribute_sets(self) -> typing.Optional[nds.name.instantiations.name_lane_range_attribute_set_list.NameLaneRangeAttributeSetList]:
        return self._lane_range_attribute_sets_

    @lane_range_attribute_sets.setter
    def lane_range_attribute_sets(self, lane_range_attribute_sets_: typing.Optional[nds.name.instantiations.name_lane_range_attribute_set_list.NameLaneRangeAttributeSetList]) -> None:
        self._lane_range_attribute_sets_ = lane_range_attribute_sets_

    def is_lane_range_attribute_sets_used(self) -> bool:
        return (self._content_ & nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_RANGE_SETS) == nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_RANGE_SETS

    def is_lane_range_attribute_sets_set(self) -> bool:
        return not self._lane_range_attribute_sets_ is None

    def reset_lane_range_attribute_sets(self) -> None:
        self._lane_range_attribute_sets_ = None

    @property
    def lane_position_attribute_sets(self) -> typing.Optional[nds.name.instantiations.name_lane_position_attribute_set_list.NameLanePositionAttributeSetList]:
        return self._lane_position_attribute_sets_

    @lane_position_attribute_sets.setter
    def lane_position_attribute_sets(self, lane_position_attribute_sets_: typing.Optional[nds.name.instantiations.name_lane_position_attribute_set_list.NameLanePositionAttributeSetList]) -> None:
        self._lane_position_attribute_sets_ = lane_position_attribute_sets_

    def is_lane_position_attribute_sets_used(self) -> bool:
        return (self._content_ & nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_POSITION_SETS) == nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.LANE_POSITION_SETS

    def is_lane_position_attribute_sets_set(self) -> bool:
        return not self._lane_position_attribute_sets_ is None

    def reset_lane_position_attribute_sets(self) -> None:
        self._lane_position_attribute_sets_ = None

    @property
    def admin_hierarchy_element_definitions(self) -> typing.Optional[typing.List[nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement]]:
        return None if self._admin_hierarchy_element_definitions_ is None else self._admin_hierarchy_element_definitions_.raw_array

    @admin_hierarchy_element_definitions.setter
    def admin_hierarchy_element_definitions(self, admin_hierarchy_element_definitions_: typing.Optional[typing.List[nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement]]) -> None:
        if admin_hierarchy_element_definitions_ is None:
            self._admin_hierarchy_element_definitions_ = None
        else:
            self._admin_hierarchy_element_definitions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_hierarchy_element_definitions()), admin_hierarchy_element_definitions_, is_auto=True)

    def is_admin_hierarchy_element_definitions_used(self) -> bool:
        return (self._content_ & nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.ADMIN_HIERARCHY) == nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.ADMIN_HIERARCHY

    def is_admin_hierarchy_element_definitions_set(self) -> bool:
        return not self._admin_hierarchy_element_definitions_ is None

    def reset_admin_hierarchy_element_definitions(self) -> None:
        self._admin_hierarchy_element_definitions_ = None

    @property
    def address_formats(self) -> typing.Optional[typing.List[nds.name.types.address_format.AddressFormat]]:
        return None if self._address_formats_ is None else self._address_formats_.raw_array

    @address_formats.setter
    def address_formats(self, address_formats_: typing.Optional[typing.List[nds.name.types.address_format.AddressFormat]]) -> None:
        if address_formats_ is None:
            self._address_formats_ = None
        else:
            self._address_formats_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), address_formats_, is_auto=True)

    def is_address_formats_used(self) -> bool:
        return (self._content_ & nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.ADDRESS_FORMAT) == nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.Values.ADDRESS_FORMAT

    def is_address_formats_set(self) -> bool:
        return not self._address_formats_ is None

    def reset_address_formats(self) -> None:
        self._address_formats_ = None

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.ATTRIBUTE

    def init_packing_context(self, zserio_context: LaneNameLayer.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_lane_range_attribute_maps_used():
            self._lane_range_attribute_maps_.init_packing_context(zserio_context.lane_range_attribute_maps)
        if self.is_lane_position_attribute_maps_used():
            self._lane_position_attribute_maps_.init_packing_context(zserio_context.lane_position_attribute_maps)
        if self.is_lane_range_attribute_sets_used():
            self._lane_range_attribute_sets_.init_packing_context(zserio_context.lane_range_attribute_sets)
        if self.is_lane_position_attribute_sets_used():
            self._lane_position_attribute_sets_.init_packing_context(zserio_context.lane_position_attribute_sets)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition += self._lane_range_attribute_maps_.bitsizeof(end_bitposition)
        if self.is_lane_position_attribute_maps_used():
            end_bitposition += self._lane_position_attribute_maps_.bitsizeof(end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition += self._lane_range_attribute_sets_.bitsizeof(end_bitposition)
        if self.is_lane_position_attribute_sets_used():
            end_bitposition += self._lane_position_attribute_sets_.bitsizeof(end_bitposition)
        if self.is_admin_hierarchy_element_definitions_used():
            end_bitposition += self._admin_hierarchy_element_definitions_.bitsizeof(end_bitposition)
        if self.is_address_formats_used():
            end_bitposition += self._address_formats_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneNameLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition += self._lane_range_attribute_maps_.bitsizeof_packed(zserio_context.lane_range_attribute_maps, end_bitposition)
        if self.is_lane_position_attribute_maps_used():
            end_bitposition += self._lane_position_attribute_maps_.bitsizeof_packed(zserio_context.lane_position_attribute_maps, end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition += self._lane_range_attribute_sets_.bitsizeof_packed(zserio_context.lane_range_attribute_sets, end_bitposition)
        if self.is_lane_position_attribute_sets_used():
            end_bitposition += self._lane_position_attribute_sets_.bitsizeof_packed(zserio_context.lane_position_attribute_sets, end_bitposition)
        if self.is_admin_hierarchy_element_definitions_used():
            end_bitposition += self._admin_hierarchy_element_definitions_.bitsizeof_packed(end_bitposition)
        if self.is_address_formats_used():
            end_bitposition += self._address_formats_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition = self._lane_range_attribute_maps_.initialize_offsets(end_bitposition)
        if self.is_lane_position_attribute_maps_used():
            end_bitposition = self._lane_position_attribute_maps_.initialize_offsets(end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition = self._lane_range_attribute_sets_.initialize_offsets(end_bitposition)
        if self.is_lane_position_attribute_sets_used():
            end_bitposition = self._lane_position_attribute_sets_.initialize_offsets(end_bitposition)
        if self.is_admin_hierarchy_element_definitions_used():
            end_bitposition = self._admin_hierarchy_element_definitions_.initialize_offsets(end_bitposition)
        if self.is_address_formats_used():
            end_bitposition = self._address_formats_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneNameLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition = self._lane_range_attribute_maps_.initialize_offsets_packed(zserio_context.lane_range_attribute_maps, end_bitposition)
        if self.is_lane_position_attribute_maps_used():
            end_bitposition = self._lane_position_attribute_maps_.initialize_offsets_packed(zserio_context.lane_position_attribute_maps, end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition = self._lane_range_attribute_sets_.initialize_offsets_packed(zserio_context.lane_range_attribute_sets, end_bitposition)
        if self.is_lane_position_attribute_sets_used():
            end_bitposition = self._lane_position_attribute_sets_.initialize_offsets_packed(zserio_context.lane_position_attribute_sets, end_bitposition)
        if self.is_admin_hierarchy_element_definitions_used():
            end_bitposition = self._admin_hierarchy_element_definitions_.initialize_offsets_packed(end_bitposition)
        if self.is_address_formats_used():
            end_bitposition = self._address_formats_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.from_reader(zserio_reader)
        if self.is_lane_range_attribute_maps_used():
            self._lane_range_attribute_maps_ = nds.name.instantiations.name_lane_range_attribute_map_list.NameLaneRangeAttributeMapList.from_reader(zserio_reader, 0)
        else:
            self._lane_range_attribute_maps_ = None
        if self.is_lane_position_attribute_maps_used():
            self._lane_position_attribute_maps_ = nds.name.instantiations.name_lane_position_attribute_map_list.NameLanePositionAttributeMapList.from_reader(zserio_reader, 0)
        else:
            self._lane_position_attribute_maps_ = None
        if self.is_lane_range_attribute_sets_used():
            self._lane_range_attribute_sets_ = nds.name.instantiations.name_lane_range_attribute_set_list.NameLaneRangeAttributeSetList.from_reader(zserio_reader, 0)
        else:
            self._lane_range_attribute_sets_ = None
        if self.is_lane_position_attribute_sets_used():
            self._lane_position_attribute_sets_ = nds.name.instantiations.name_lane_position_attribute_set_list.NameLanePositionAttributeSetList.from_reader(zserio_reader, 0)
        else:
            self._lane_position_attribute_sets_ = None
        if self.is_admin_hierarchy_element_definitions_used():
            self._admin_hierarchy_element_definitions_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_hierarchy_element_definitions()), zserio_reader, is_auto=True)
        else:
            self._admin_hierarchy_element_definitions_ = None
        if self.is_address_formats_used():
            self._address_formats_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), zserio_reader, is_auto=True)
        else:
            self._address_formats_ = None

    def read_packed(self, zserio_context: LaneNameLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.name.metadata.lane_name_layer_content.LaneNameLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_lane_range_attribute_maps_used():
            self._lane_range_attribute_maps_ = nds.name.instantiations.name_lane_range_attribute_map_list.NameLaneRangeAttributeMapList.from_reader_packed(zserio_context.lane_range_attribute_maps, zserio_reader, 0)
        else:
            self._lane_range_attribute_maps_ = None

        if self.is_lane_position_attribute_maps_used():
            self._lane_position_attribute_maps_ = nds.name.instantiations.name_lane_position_attribute_map_list.NameLanePositionAttributeMapList.from_reader_packed(zserio_context.lane_position_attribute_maps, zserio_reader, 0)
        else:
            self._lane_position_attribute_maps_ = None

        if self.is_lane_range_attribute_sets_used():
            self._lane_range_attribute_sets_ = nds.name.instantiations.name_lane_range_attribute_set_list.NameLaneRangeAttributeSetList.from_reader_packed(zserio_context.lane_range_attribute_sets, zserio_reader, 0)
        else:
            self._lane_range_attribute_sets_ = None

        if self.is_lane_position_attribute_sets_used():
            self._lane_position_attribute_sets_ = nds.name.instantiations.name_lane_position_attribute_set_list.NameLanePositionAttributeSetList.from_reader_packed(zserio_context.lane_position_attribute_sets, zserio_reader, 0)
        else:
            self._lane_position_attribute_sets_ = None

        if self.is_admin_hierarchy_element_definitions_used():
            self._admin_hierarchy_element_definitions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_hierarchy_element_definitions()), zserio_reader, is_auto=True)
        else:
            self._admin_hierarchy_element_definitions_ = None

        if self.is_address_formats_used():
            self._address_formats_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), zserio_reader, is_auto=True)
        else:
            self._address_formats_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)

        if self.is_lane_range_attribute_maps_used():
            # check parameters
            if self._lane_range_attribute_maps_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.laneRangeAttributeMaps: "
                                                    f"{self._lane_range_attribute_maps_.coord_shift} != {0}!")
            self._lane_range_attribute_maps_.write(zserio_writer)

        if self.is_lane_position_attribute_maps_used():
            # check parameters
            if self._lane_position_attribute_maps_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.lanePositionAttributeMaps: "
                                                    f"{self._lane_position_attribute_maps_.coord_shift} != {0}!")
            self._lane_position_attribute_maps_.write(zserio_writer)

        if self.is_lane_range_attribute_sets_used():
            # check parameters
            if self._lane_range_attribute_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.laneRangeAttributeSets: "
                                                    f"{self._lane_range_attribute_sets_.coord_shift} != {0}!")
            self._lane_range_attribute_sets_.write(zserio_writer)

        if self.is_lane_position_attribute_sets_used():
            # check parameters
            if self._lane_position_attribute_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.lanePositionAttributeSets: "
                                                    f"{self._lane_position_attribute_sets_.coord_shift} != {0}!")
            self._lane_position_attribute_sets_.write(zserio_writer)

        if self.is_admin_hierarchy_element_definitions_used():
            self._admin_hierarchy_element_definitions_.write(zserio_writer)

        if self.is_address_formats_used():
            self._address_formats_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneNameLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_lane_range_attribute_maps_used():
            # check parameters
            if self._lane_range_attribute_maps_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.laneRangeAttributeMaps: "
                                                    f"{self._lane_range_attribute_maps_.coord_shift} != {0}!")
            self._lane_range_attribute_maps_.write_packed(zserio_context.lane_range_attribute_maps, zserio_writer)

        if self.is_lane_position_attribute_maps_used():
            # check parameters
            if self._lane_position_attribute_maps_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.lanePositionAttributeMaps: "
                                                    f"{self._lane_position_attribute_maps_.coord_shift} != {0}!")
            self._lane_position_attribute_maps_.write_packed(zserio_context.lane_position_attribute_maps, zserio_writer)

        if self.is_lane_range_attribute_sets_used():
            # check parameters
            if self._lane_range_attribute_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.laneRangeAttributeSets: "
                                                    f"{self._lane_range_attribute_sets_.coord_shift} != {0}!")
            self._lane_range_attribute_sets_.write_packed(zserio_context.lane_range_attribute_sets, zserio_writer)

        if self.is_lane_position_attribute_sets_used():
            # check parameters
            if self._lane_position_attribute_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneNameLayer.lanePositionAttributeSets: "
                                                    f"{self._lane_position_attribute_sets_.coord_shift} != {0}!")
            self._lane_position_attribute_sets_.write_packed(zserio_context.lane_position_attribute_sets, zserio_writer)

        if self.is_admin_hierarchy_element_definitions_used():
            self._admin_hierarchy_element_definitions_.write_packed(zserio_writer)

        if self.is_address_formats_used():
            self._address_formats_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._lane_range_attribute_maps_ = nds.name.instantiations.name_lane_range_attribute_map_list.NameLaneRangeAttributeMapList.ZserioPackingContext()
            self._lane_position_attribute_maps_ = nds.name.instantiations.name_lane_position_attribute_map_list.NameLanePositionAttributeMapList.ZserioPackingContext()
            self._lane_range_attribute_sets_ = nds.name.instantiations.name_lane_range_attribute_set_list.NameLaneRangeAttributeSetList.ZserioPackingContext()
            self._lane_position_attribute_sets_ = nds.name.instantiations.name_lane_position_attribute_set_list.NameLanePositionAttributeSetList.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def lane_range_attribute_maps(self):
            return self._lane_range_attribute_maps_

        @property
        def lane_position_attribute_maps(self):
            return self._lane_position_attribute_maps_

        @property
        def lane_range_attribute_sets(self):
            return self._lane_range_attribute_sets_

        @property
        def lane_position_attribute_sets(self):
            return self._lane_position_attribute_sets_

    class _ZserioElementFactory_admin_hierarchy_element_definitions:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement:
            del zserio_index
            return nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.ZserioPackingContext:
            return nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement:
            del zserio_index
            return nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_address_formats:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.address_format.AddressFormat:
            del zserio_index
            return nds.name.types.address_format.AddressFormat.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.name.types.address_format.AddressFormat.ZserioPackingContext:
            return nds.name.types.address_format.AddressFormat.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.name.types.address_format.AddressFormat.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.address_format.AddressFormat:
            del zserio_index
            return nds.name.types.address_format.AddressFormat.from_reader_packed(zserio_context, zserio_reader)
