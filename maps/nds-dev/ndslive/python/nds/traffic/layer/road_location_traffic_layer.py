# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.system.types.layer_type
import nds.traffic.instantiations.traffic_road_location_range_attribute_map_list
import nds.traffic.instantiations.traffic_road_location_range_attribute_set_list
import nds.traffic.instantiations.traffic_road_location_transition_attribute_map_list
import nds.traffic.instantiations.traffic_road_location_transition_attribute_set_list
import nds.traffic.metadata.road_location_traffic_layer_content

class RoadLocationTrafficLayer:
    def __init__(
            self,
            content_: typing.Union[nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent, None] = None,
            shift_: nds.core.geometry.coord_shift.CoordShift = nds.core.geometry.coord_shift.CoordShift(),
            road_location_range_attribute_maps_: typing.Optional[nds.traffic.instantiations.traffic_road_location_range_attribute_map_list.TrafficRoadLocationRangeAttributeMapList] = None,
            road_location_transition_attribute_maps_: typing.Optional[nds.traffic.instantiations.traffic_road_location_transition_attribute_map_list.TrafficRoadLocationTransitionAttributeMapList] = None,
            road_location_range_attribute_sets_: typing.Optional[nds.traffic.instantiations.traffic_road_location_range_attribute_set_list.TrafficRoadLocationRangeAttributeSetList] = None,
            road_location_transition_attribute_sets_: typing.Optional[nds.traffic.instantiations.traffic_road_location_transition_attribute_set_list.TrafficRoadLocationTransitionAttributeSetList] = None) -> None:
        self._content_ = content_
        self._shift_ = shift_
        self._road_location_range_attribute_maps_ = road_location_range_attribute_maps_
        self._road_location_transition_attribute_maps_ = road_location_transition_attribute_maps_
        self._road_location_range_attribute_sets_ = road_location_range_attribute_sets_
        self._road_location_transition_attribute_sets_ = road_location_transition_attribute_sets_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadLocationTrafficLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadLocationTrafficLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadLocationTrafficLayer'],
            zserio_context: RoadLocationTrafficLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadLocationTrafficLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadLocationTrafficLayer):
            return ((self._content_ == other._content_) and
                    (self._shift_ == other._shift_) and
                    (not other.is_road_location_range_attribute_maps_used() if not self.is_road_location_range_attribute_maps_used() else (self._road_location_range_attribute_maps_ == other._road_location_range_attribute_maps_)) and
                    (not other.is_road_location_transition_attribute_maps_used() if not self.is_road_location_transition_attribute_maps_used() else (self._road_location_transition_attribute_maps_ == other._road_location_transition_attribute_maps_)) and
                    (not other.is_road_location_range_attribute_sets_used() if not self.is_road_location_range_attribute_sets_used() else (self._road_location_range_attribute_sets_ == other._road_location_range_attribute_sets_)) and
                    (not other.is_road_location_transition_attribute_sets_used() if not self.is_road_location_transition_attribute_sets_used() else (self._road_location_transition_attribute_sets_ == other._road_location_transition_attribute_sets_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        if self.is_road_location_range_attribute_maps_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_range_attribute_maps_)
        if self.is_road_location_transition_attribute_maps_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_transition_attribute_maps_)
        if self.is_road_location_range_attribute_sets_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_range_attribute_sets_)
        if self.is_road_location_transition_attribute_sets_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._road_location_transition_attribute_sets_)

        return result

    @property
    def content(self) -> typing.Union[nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @shift.setter
    def shift(self, shift_: nds.core.geometry.coord_shift.CoordShift) -> None:
        self._shift_ = shift_

    @property
    def road_location_range_attribute_maps(self) -> typing.Optional[nds.traffic.instantiations.traffic_road_location_range_attribute_map_list.TrafficRoadLocationRangeAttributeMapList]:
        return self._road_location_range_attribute_maps_

    @road_location_range_attribute_maps.setter
    def road_location_range_attribute_maps(self, road_location_range_attribute_maps_: typing.Optional[nds.traffic.instantiations.traffic_road_location_range_attribute_map_list.TrafficRoadLocationRangeAttributeMapList]) -> None:
        self._road_location_range_attribute_maps_ = road_location_range_attribute_maps_

    def is_road_location_range_attribute_maps_used(self) -> bool:
        return (self._content_ & nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_MAPS) == nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_MAPS

    def is_road_location_range_attribute_maps_set(self) -> bool:
        return not self._road_location_range_attribute_maps_ is None

    def reset_road_location_range_attribute_maps(self) -> None:
        self._road_location_range_attribute_maps_ = None

    @property
    def road_location_transition_attribute_maps(self) -> typing.Optional[nds.traffic.instantiations.traffic_road_location_transition_attribute_map_list.TrafficRoadLocationTransitionAttributeMapList]:
        return self._road_location_transition_attribute_maps_

    @road_location_transition_attribute_maps.setter
    def road_location_transition_attribute_maps(self, road_location_transition_attribute_maps_: typing.Optional[nds.traffic.instantiations.traffic_road_location_transition_attribute_map_list.TrafficRoadLocationTransitionAttributeMapList]) -> None:
        self._road_location_transition_attribute_maps_ = road_location_transition_attribute_maps_

    def is_road_location_transition_attribute_maps_used(self) -> bool:
        return (self._content_ & nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS) == nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_TRANSITION_MAPS

    def is_road_location_transition_attribute_maps_set(self) -> bool:
        return not self._road_location_transition_attribute_maps_ is None

    def reset_road_location_transition_attribute_maps(self) -> None:
        self._road_location_transition_attribute_maps_ = None

    @property
    def road_location_range_attribute_sets(self) -> typing.Optional[nds.traffic.instantiations.traffic_road_location_range_attribute_set_list.TrafficRoadLocationRangeAttributeSetList]:
        return self._road_location_range_attribute_sets_

    @road_location_range_attribute_sets.setter
    def road_location_range_attribute_sets(self, road_location_range_attribute_sets_: typing.Optional[nds.traffic.instantiations.traffic_road_location_range_attribute_set_list.TrafficRoadLocationRangeAttributeSetList]) -> None:
        self._road_location_range_attribute_sets_ = road_location_range_attribute_sets_

    def is_road_location_range_attribute_sets_used(self) -> bool:
        return (self._content_ & nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_SETS) == nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_SETS

    def is_road_location_range_attribute_sets_set(self) -> bool:
        return not self._road_location_range_attribute_sets_ is None

    def reset_road_location_range_attribute_sets(self) -> None:
        self._road_location_range_attribute_sets_ = None

    @property
    def road_location_transition_attribute_sets(self) -> typing.Optional[nds.traffic.instantiations.traffic_road_location_transition_attribute_set_list.TrafficRoadLocationTransitionAttributeSetList]:
        return self._road_location_transition_attribute_sets_

    @road_location_transition_attribute_sets.setter
    def road_location_transition_attribute_sets(self, road_location_transition_attribute_sets_: typing.Optional[nds.traffic.instantiations.traffic_road_location_transition_attribute_set_list.TrafficRoadLocationTransitionAttributeSetList]) -> None:
        self._road_location_transition_attribute_sets_ = road_location_transition_attribute_sets_

    def is_road_location_transition_attribute_sets_used(self) -> bool:
        return (self._content_ & nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS) == nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.Values.ROAD_LOCATION_TRANSITION_SETS

    def is_road_location_transition_attribute_sets_set(self) -> bool:
        return not self._road_location_transition_attribute_sets_ is None

    def reset_road_location_transition_attribute_sets(self) -> None:
        self._road_location_transition_attribute_sets_ = None

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.ATTRIBUTE

    def init_packing_context(self, zserio_context: RoadLocationTrafficLayer.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        zserio_context.shift.init(zserio.array.BitFieldArrayTraits(5), self._shift_)
        if self.is_road_location_range_attribute_maps_used():
            self._road_location_range_attribute_maps_.init_packing_context(zserio_context.road_location_range_attribute_maps)
        if self.is_road_location_transition_attribute_maps_used():
            self._road_location_transition_attribute_maps_.init_packing_context(zserio_context.road_location_transition_attribute_maps)
        if self.is_road_location_range_attribute_sets_used():
            self._road_location_range_attribute_sets_.init_packing_context(zserio_context.road_location_range_attribute_sets)
        if self.is_road_location_transition_attribute_sets_used():
            self._road_location_transition_attribute_sets_.init_packing_context(zserio_context.road_location_transition_attribute_sets)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        end_bitposition += 5
        if self.is_road_location_range_attribute_maps_used():
            end_bitposition += self._road_location_range_attribute_maps_.bitsizeof(end_bitposition)
        if self.is_road_location_transition_attribute_maps_used():
            end_bitposition += self._road_location_transition_attribute_maps_.bitsizeof(end_bitposition)
        if self.is_road_location_range_attribute_sets_used():
            end_bitposition += self._road_location_range_attribute_sets_.bitsizeof(end_bitposition)
        if self.is_road_location_transition_attribute_sets_used():
            end_bitposition += self._road_location_transition_attribute_sets_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadLocationTrafficLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        if self.is_road_location_range_attribute_maps_used():
            end_bitposition += self._road_location_range_attribute_maps_.bitsizeof_packed(zserio_context.road_location_range_attribute_maps, end_bitposition)
        if self.is_road_location_transition_attribute_maps_used():
            end_bitposition += self._road_location_transition_attribute_maps_.bitsizeof_packed(zserio_context.road_location_transition_attribute_maps, end_bitposition)
        if self.is_road_location_range_attribute_sets_used():
            end_bitposition += self._road_location_range_attribute_sets_.bitsizeof_packed(zserio_context.road_location_range_attribute_sets, end_bitposition)
        if self.is_road_location_transition_attribute_sets_used():
            end_bitposition += self._road_location_transition_attribute_sets_.bitsizeof_packed(zserio_context.road_location_transition_attribute_sets, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        end_bitposition += 5
        if self.is_road_location_range_attribute_maps_used():
            end_bitposition = self._road_location_range_attribute_maps_.initialize_offsets(end_bitposition)
        if self.is_road_location_transition_attribute_maps_used():
            end_bitposition = self._road_location_transition_attribute_maps_.initialize_offsets(end_bitposition)
        if self.is_road_location_range_attribute_sets_used():
            end_bitposition = self._road_location_range_attribute_sets_.initialize_offsets(end_bitposition)
        if self.is_road_location_transition_attribute_sets_used():
            end_bitposition = self._road_location_transition_attribute_sets_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadLocationTrafficLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        if self.is_road_location_range_attribute_maps_used():
            end_bitposition = self._road_location_range_attribute_maps_.initialize_offsets_packed(zserio_context.road_location_range_attribute_maps, end_bitposition)
        if self.is_road_location_transition_attribute_maps_used():
            end_bitposition = self._road_location_transition_attribute_maps_.initialize_offsets_packed(zserio_context.road_location_transition_attribute_maps, end_bitposition)
        if self.is_road_location_range_attribute_sets_used():
            end_bitposition = self._road_location_range_attribute_sets_.initialize_offsets_packed(zserio_context.road_location_range_attribute_sets, end_bitposition)
        if self.is_road_location_transition_attribute_sets_used():
            end_bitposition = self._road_location_transition_attribute_sets_.initialize_offsets_packed(zserio_context.road_location_transition_attribute_sets, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.from_reader(zserio_reader)
        self._shift_ = zserio_reader.read_bits(5)
        if self.is_road_location_range_attribute_maps_used():
            self._road_location_range_attribute_maps_ = nds.traffic.instantiations.traffic_road_location_range_attribute_map_list.TrafficRoadLocationRangeAttributeMapList.from_reader(zserio_reader, self._shift_)
        else:
            self._road_location_range_attribute_maps_ = None
        if self.is_road_location_transition_attribute_maps_used():
            self._road_location_transition_attribute_maps_ = nds.traffic.instantiations.traffic_road_location_transition_attribute_map_list.TrafficRoadLocationTransitionAttributeMapList.from_reader(zserio_reader, self._shift_)
        else:
            self._road_location_transition_attribute_maps_ = None
        if self.is_road_location_range_attribute_sets_used():
            self._road_location_range_attribute_sets_ = nds.traffic.instantiations.traffic_road_location_range_attribute_set_list.TrafficRoadLocationRangeAttributeSetList.from_reader(zserio_reader, self._shift_)
        else:
            self._road_location_range_attribute_sets_ = None
        if self.is_road_location_transition_attribute_sets_used():
            self._road_location_transition_attribute_sets_ = nds.traffic.instantiations.traffic_road_location_transition_attribute_set_list.TrafficRoadLocationTransitionAttributeSetList.from_reader(zserio_reader, self._shift_)
        else:
            self._road_location_transition_attribute_sets_ = None

    def read_packed(self, zserio_context: RoadLocationTrafficLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.traffic.metadata.road_location_traffic_layer_content.RoadLocationTrafficLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        self._shift_ = zserio_context.shift.read(zserio.array.BitFieldArrayTraits(5), zserio_reader)

        if self.is_road_location_range_attribute_maps_used():
            self._road_location_range_attribute_maps_ = nds.traffic.instantiations.traffic_road_location_range_attribute_map_list.TrafficRoadLocationRangeAttributeMapList.from_reader_packed(zserio_context.road_location_range_attribute_maps, zserio_reader, self._shift_)
        else:
            self._road_location_range_attribute_maps_ = None

        if self.is_road_location_transition_attribute_maps_used():
            self._road_location_transition_attribute_maps_ = nds.traffic.instantiations.traffic_road_location_transition_attribute_map_list.TrafficRoadLocationTransitionAttributeMapList.from_reader_packed(zserio_context.road_location_transition_attribute_maps, zserio_reader, self._shift_)
        else:
            self._road_location_transition_attribute_maps_ = None

        if self.is_road_location_range_attribute_sets_used():
            self._road_location_range_attribute_sets_ = nds.traffic.instantiations.traffic_road_location_range_attribute_set_list.TrafficRoadLocationRangeAttributeSetList.from_reader_packed(zserio_context.road_location_range_attribute_sets, zserio_reader, self._shift_)
        else:
            self._road_location_range_attribute_sets_ = None

        if self.is_road_location_transition_attribute_sets_used():
            self._road_location_transition_attribute_sets_ = nds.traffic.instantiations.traffic_road_location_transition_attribute_set_list.TrafficRoadLocationTransitionAttributeSetList.from_reader_packed(zserio_context.road_location_transition_attribute_sets, zserio_reader, self._shift_)
        else:
            self._road_location_transition_attribute_sets_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)

        zserio_writer.write_bits(self._shift_, 5)

        if self.is_road_location_range_attribute_maps_used():
            # check parameters
            if self._road_location_range_attribute_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationRangeAttributeMaps: "
                                                    f"{self._road_location_range_attribute_maps_.coord_shift} != {self._shift_}!")
            self._road_location_range_attribute_maps_.write(zserio_writer)

        if self.is_road_location_transition_attribute_maps_used():
            # check parameters
            if self._road_location_transition_attribute_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationTransitionAttributeMaps: "
                                                    f"{self._road_location_transition_attribute_maps_.coord_shift} != {self._shift_}!")
            self._road_location_transition_attribute_maps_.write(zserio_writer)

        if self.is_road_location_range_attribute_sets_used():
            # check parameters
            if self._road_location_range_attribute_sets_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationRangeAttributeSets: "
                                                    f"{self._road_location_range_attribute_sets_.coord_shift} != {self._shift_}!")
            self._road_location_range_attribute_sets_.write(zserio_writer)

        if self.is_road_location_transition_attribute_sets_used():
            # check parameters
            if self._road_location_transition_attribute_sets_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationTransitionAttributeSets: "
                                                    f"{self._road_location_transition_attribute_sets_.coord_shift} != {self._shift_}!")
            self._road_location_transition_attribute_sets_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadLocationTrafficLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        zserio_context.shift.write(zserio.array.BitFieldArrayTraits(5), zserio_writer, self._shift_)

        if self.is_road_location_range_attribute_maps_used():
            # check parameters
            if self._road_location_range_attribute_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationRangeAttributeMaps: "
                                                    f"{self._road_location_range_attribute_maps_.coord_shift} != {self._shift_}!")
            self._road_location_range_attribute_maps_.write_packed(zserio_context.road_location_range_attribute_maps, zserio_writer)

        if self.is_road_location_transition_attribute_maps_used():
            # check parameters
            if self._road_location_transition_attribute_maps_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationTransitionAttributeMaps: "
                                                    f"{self._road_location_transition_attribute_maps_.coord_shift} != {self._shift_}!")
            self._road_location_transition_attribute_maps_.write_packed(zserio_context.road_location_transition_attribute_maps, zserio_writer)

        if self.is_road_location_range_attribute_sets_used():
            # check parameters
            if self._road_location_range_attribute_sets_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationRangeAttributeSets: "
                                                    f"{self._road_location_range_attribute_sets_.coord_shift} != {self._shift_}!")
            self._road_location_range_attribute_sets_.write_packed(zserio_context.road_location_range_attribute_sets, zserio_writer)

        if self.is_road_location_transition_attribute_sets_used():
            # check parameters
            if self._road_location_transition_attribute_sets_.coord_shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadLocationTrafficLayer.roadLocationTransitionAttributeSets: "
                                                    f"{self._road_location_transition_attribute_sets_.coord_shift} != {self._shift_}!")
            self._road_location_transition_attribute_sets_.write_packed(zserio_context.road_location_transition_attribute_sets, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._shift_ = zserio.array.DeltaContext()
            self._road_location_range_attribute_maps_ = nds.traffic.instantiations.traffic_road_location_range_attribute_map_list.TrafficRoadLocationRangeAttributeMapList.ZserioPackingContext()
            self._road_location_transition_attribute_maps_ = nds.traffic.instantiations.traffic_road_location_transition_attribute_map_list.TrafficRoadLocationTransitionAttributeMapList.ZserioPackingContext()
            self._road_location_range_attribute_sets_ = nds.traffic.instantiations.traffic_road_location_range_attribute_set_list.TrafficRoadLocationRangeAttributeSetList.ZserioPackingContext()
            self._road_location_transition_attribute_sets_ = nds.traffic.instantiations.traffic_road_location_transition_attribute_set_list.TrafficRoadLocationTransitionAttributeSetList.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def shift(self):
            return self._shift_

        @property
        def road_location_range_attribute_maps(self):
            return self._road_location_range_attribute_maps_

        @property
        def road_location_transition_attribute_maps(self):
            return self._road_location_transition_attribute_maps_

        @property
        def road_location_range_attribute_sets(self):
            return self._road_location_range_attribute_sets_

        @property
        def road_location_transition_attribute_sets(self):
            return self._road_location_transition_attribute_sets_
