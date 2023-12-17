# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.system.types.layer_type
import nds.traffic.instantiations.traffic_indirect_lane_range_attribute_map_list
import nds.traffic.instantiations.traffic_indirect_lane_range_attribute_set_list
import nds.traffic.metadata.lane_traffic_layer_content

class LaneTrafficLayerIndirect:
    def __init__(
            self,
            content_: typing.Union[nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent, None] = None,
            lane_range_attribute_maps_: typing.Optional[nds.traffic.instantiations.traffic_indirect_lane_range_attribute_map_list.TrafficIndirectLaneRangeAttributeMapList] = None,
            lane_range_attribute_sets_: typing.Optional[nds.traffic.instantiations.traffic_indirect_lane_range_attribute_set_list.TrafficIndirectLaneRangeAttributeSetList] = None) -> None:
        self._content_ = content_
        self._lane_range_attribute_maps_ = lane_range_attribute_maps_
        self._lane_range_attribute_sets_ = lane_range_attribute_sets_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneTrafficLayerIndirect'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneTrafficLayerIndirect':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneTrafficLayerIndirect'],
            zserio_context: LaneTrafficLayerIndirect.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneTrafficLayerIndirect':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneTrafficLayerIndirect):
            return ((self._content_ == other._content_) and
                    (not other.is_lane_range_attribute_maps_used() if not self.is_lane_range_attribute_maps_used() else (self._lane_range_attribute_maps_ == other._lane_range_attribute_maps_)) and
                    (not other.is_lane_range_attribute_sets_used() if not self.is_lane_range_attribute_sets_used() else (self._lane_range_attribute_sets_ == other._lane_range_attribute_sets_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_lane_range_attribute_maps_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lane_range_attribute_maps_)
        if self.is_lane_range_attribute_sets_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lane_range_attribute_sets_)

        return result

    @property
    def content(self) -> typing.Union[nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def lane_range_attribute_maps(self) -> typing.Optional[nds.traffic.instantiations.traffic_indirect_lane_range_attribute_map_list.TrafficIndirectLaneRangeAttributeMapList]:
        return self._lane_range_attribute_maps_

    @lane_range_attribute_maps.setter
    def lane_range_attribute_maps(self, lane_range_attribute_maps_: typing.Optional[nds.traffic.instantiations.traffic_indirect_lane_range_attribute_map_list.TrafficIndirectLaneRangeAttributeMapList]) -> None:
        self._lane_range_attribute_maps_ = lane_range_attribute_maps_

    def is_lane_range_attribute_maps_used(self) -> bool:
        return (self._content_ & nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent.Values.LANE_RANGE_MAPS) == nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent.Values.LANE_RANGE_MAPS

    def is_lane_range_attribute_maps_set(self) -> bool:
        return not self._lane_range_attribute_maps_ is None

    def reset_lane_range_attribute_maps(self) -> None:
        self._lane_range_attribute_maps_ = None

    @property
    def lane_range_attribute_sets(self) -> typing.Optional[nds.traffic.instantiations.traffic_indirect_lane_range_attribute_set_list.TrafficIndirectLaneRangeAttributeSetList]:
        return self._lane_range_attribute_sets_

    @lane_range_attribute_sets.setter
    def lane_range_attribute_sets(self, lane_range_attribute_sets_: typing.Optional[nds.traffic.instantiations.traffic_indirect_lane_range_attribute_set_list.TrafficIndirectLaneRangeAttributeSetList]) -> None:
        self._lane_range_attribute_sets_ = lane_range_attribute_sets_

    def is_lane_range_attribute_sets_used(self) -> bool:
        return (self._content_ & nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent.Values.LANE_RANGE_SETS) == nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent.Values.LANE_RANGE_SETS

    def is_lane_range_attribute_sets_set(self) -> bool:
        return not self._lane_range_attribute_sets_ is None

    def reset_lane_range_attribute_sets(self) -> None:
        self._lane_range_attribute_sets_ = None

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.ATTRIBUTE

    def init_packing_context(self, zserio_context: LaneTrafficLayerIndirect.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_lane_range_attribute_maps_used():
            self._lane_range_attribute_maps_.init_packing_context(zserio_context.lane_range_attribute_maps)
        if self.is_lane_range_attribute_sets_used():
            self._lane_range_attribute_sets_.init_packing_context(zserio_context.lane_range_attribute_sets)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition += self._lane_range_attribute_maps_.bitsizeof(end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition += self._lane_range_attribute_sets_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneTrafficLayerIndirect.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition += self._lane_range_attribute_maps_.bitsizeof_packed(zserio_context.lane_range_attribute_maps, end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition += self._lane_range_attribute_sets_.bitsizeof_packed(zserio_context.lane_range_attribute_sets, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition = self._lane_range_attribute_maps_.initialize_offsets(end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition = self._lane_range_attribute_sets_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneTrafficLayerIndirect.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_lane_range_attribute_maps_used():
            end_bitposition = self._lane_range_attribute_maps_.initialize_offsets_packed(zserio_context.lane_range_attribute_maps, end_bitposition)
        if self.is_lane_range_attribute_sets_used():
            end_bitposition = self._lane_range_attribute_sets_.initialize_offsets_packed(zserio_context.lane_range_attribute_sets, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent.from_reader(zserio_reader)
        if self.is_lane_range_attribute_maps_used():
            self._lane_range_attribute_maps_ = nds.traffic.instantiations.traffic_indirect_lane_range_attribute_map_list.TrafficIndirectLaneRangeAttributeMapList.from_reader(zserio_reader, 0)
        else:
            self._lane_range_attribute_maps_ = None
        if self.is_lane_range_attribute_sets_used():
            self._lane_range_attribute_sets_ = nds.traffic.instantiations.traffic_indirect_lane_range_attribute_set_list.TrafficIndirectLaneRangeAttributeSetList.from_reader(zserio_reader, 0)
        else:
            self._lane_range_attribute_sets_ = None

    def read_packed(self, zserio_context: LaneTrafficLayerIndirect.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.traffic.metadata.lane_traffic_layer_content.LaneTrafficLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_lane_range_attribute_maps_used():
            self._lane_range_attribute_maps_ = nds.traffic.instantiations.traffic_indirect_lane_range_attribute_map_list.TrafficIndirectLaneRangeAttributeMapList.from_reader_packed(zserio_context.lane_range_attribute_maps, zserio_reader, 0)
        else:
            self._lane_range_attribute_maps_ = None

        if self.is_lane_range_attribute_sets_used():
            self._lane_range_attribute_sets_ = nds.traffic.instantiations.traffic_indirect_lane_range_attribute_set_list.TrafficIndirectLaneRangeAttributeSetList.from_reader_packed(zserio_context.lane_range_attribute_sets, zserio_reader, 0)
        else:
            self._lane_range_attribute_sets_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)

        if self.is_lane_range_attribute_maps_used():
            # check parameters
            if self._lane_range_attribute_maps_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneTrafficLayerIndirect.laneRangeAttributeMaps: "
                                                    f"{self._lane_range_attribute_maps_.coord_shift} != {0}!")
            self._lane_range_attribute_maps_.write(zserio_writer)

        if self.is_lane_range_attribute_sets_used():
            # check parameters
            if self._lane_range_attribute_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneTrafficLayerIndirect.laneRangeAttributeSets: "
                                                    f"{self._lane_range_attribute_sets_.coord_shift} != {0}!")
            self._lane_range_attribute_sets_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneTrafficLayerIndirect.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_lane_range_attribute_maps_used():
            # check parameters
            if self._lane_range_attribute_maps_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneTrafficLayerIndirect.laneRangeAttributeMaps: "
                                                    f"{self._lane_range_attribute_maps_.coord_shift} != {0}!")
            self._lane_range_attribute_maps_.write_packed(zserio_context.lane_range_attribute_maps, zserio_writer)

        if self.is_lane_range_attribute_sets_used():
            # check parameters
            if self._lane_range_attribute_sets_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field LaneTrafficLayerIndirect.laneRangeAttributeSets: "
                                                    f"{self._lane_range_attribute_sets_.coord_shift} != {0}!")
            self._lane_range_attribute_sets_.write_packed(zserio_context.lane_range_attribute_sets, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._lane_range_attribute_maps_ = nds.traffic.instantiations.traffic_indirect_lane_range_attribute_map_list.TrafficIndirectLaneRangeAttributeMapList.ZserioPackingContext()
            self._lane_range_attribute_sets_ = nds.traffic.instantiations.traffic_indirect_lane_range_attribute_set_list.TrafficIndirectLaneRangeAttributeSetList.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def lane_range_attribute_maps(self):
            return self._lane_range_attribute_maps_

        @property
        def lane_range_attribute_sets(self):
            return self._lane_range_attribute_sets_
