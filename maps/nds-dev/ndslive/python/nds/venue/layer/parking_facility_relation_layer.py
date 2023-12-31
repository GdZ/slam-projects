# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.system.types.layer_type
import nds.venue.instantiations.parking_lane_position_relation_map_list
import nds.venue.instantiations.parking_lane_range_relation_map_list
import nds.venue.instantiations.parking_poi_relation_map_list
import nds.venue.instantiations.parking_road_surface_relation_map_list
import nds.venue.metadata.parking_facility_relation_layer_content

class ParkingFacilityRelationLayer:
    def __init__(
            self,
            content_: typing.Union[nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent, None] = None,
            parking_lane_range_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_lane_range_relation_map_list.ParkingLaneRangeRelationMapList] = None,
            parking_lane_position_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_lane_position_relation_map_list.ParkingLanePositionRelationMapList] = None,
            parking_road_surface_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_road_surface_relation_map_list.ParkingRoadSurfaceRelationMapList] = None,
            parking_poi_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_poi_relation_map_list.ParkingPoiRelationMapList] = None) -> None:
        self._content_ = content_
        self._parking_lane_range_relation_map_list_ = parking_lane_range_relation_map_list_
        self._parking_lane_position_relation_map_list_ = parking_lane_position_relation_map_list_
        self._parking_road_surface_relation_map_list_ = parking_road_surface_relation_map_list_
        self._parking_poi_relation_map_list_ = parking_poi_relation_map_list_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingFacilityRelationLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityRelationLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingFacilityRelationLayer'],
            zserio_context: ParkingFacilityRelationLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityRelationLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingFacilityRelationLayer):
            return ((self._content_ == other._content_) and
                    (not other.is_parking_lane_range_relation_map_list_used() if not self.is_parking_lane_range_relation_map_list_used() else (self._parking_lane_range_relation_map_list_ == other._parking_lane_range_relation_map_list_)) and
                    (not other.is_parking_lane_position_relation_map_list_used() if not self.is_parking_lane_position_relation_map_list_used() else (self._parking_lane_position_relation_map_list_ == other._parking_lane_position_relation_map_list_)) and
                    (not other.is_parking_road_surface_relation_map_list_used() if not self.is_parking_road_surface_relation_map_list_used() else (self._parking_road_surface_relation_map_list_ == other._parking_road_surface_relation_map_list_)) and
                    (not other.is_parking_poi_relation_map_list_used() if not self.is_parking_poi_relation_map_list_used() else (self._parking_poi_relation_map_list_ == other._parking_poi_relation_map_list_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_parking_lane_range_relation_map_list_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_lane_range_relation_map_list_)
        if self.is_parking_lane_position_relation_map_list_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_lane_position_relation_map_list_)
        if self.is_parking_road_surface_relation_map_list_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_road_surface_relation_map_list_)
        if self.is_parking_poi_relation_map_list_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parking_poi_relation_map_list_)

        return result

    @property
    def content(self) -> typing.Union[nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent, None]) -> None:
        self._content_ = content_

    @property
    def parking_lane_range_relation_map_list(self) -> typing.Optional[nds.venue.instantiations.parking_lane_range_relation_map_list.ParkingLaneRangeRelationMapList]:
        return self._parking_lane_range_relation_map_list_

    @parking_lane_range_relation_map_list.setter
    def parking_lane_range_relation_map_list(self, parking_lane_range_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_lane_range_relation_map_list.ParkingLaneRangeRelationMapList]) -> None:
        self._parking_lane_range_relation_map_list_ = parking_lane_range_relation_map_list_

    def is_parking_lane_range_relation_map_list_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_RANGE_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_RANGE_MAPS

    def is_parking_lane_range_relation_map_list_set(self) -> bool:
        return not self._parking_lane_range_relation_map_list_ is None

    def reset_parking_lane_range_relation_map_list(self) -> None:
        self._parking_lane_range_relation_map_list_ = None

    @property
    def parking_lane_position_relation_map_list(self) -> typing.Optional[nds.venue.instantiations.parking_lane_position_relation_map_list.ParkingLanePositionRelationMapList]:
        return self._parking_lane_position_relation_map_list_

    @parking_lane_position_relation_map_list.setter
    def parking_lane_position_relation_map_list(self, parking_lane_position_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_lane_position_relation_map_list.ParkingLanePositionRelationMapList]) -> None:
        self._parking_lane_position_relation_map_list_ = parking_lane_position_relation_map_list_

    def is_parking_lane_position_relation_map_list_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_POSITION_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.LANE_POSITION_MAPS

    def is_parking_lane_position_relation_map_list_set(self) -> bool:
        return not self._parking_lane_position_relation_map_list_ is None

    def reset_parking_lane_position_relation_map_list(self) -> None:
        self._parking_lane_position_relation_map_list_ = None

    @property
    def parking_road_surface_relation_map_list(self) -> typing.Optional[nds.venue.instantiations.parking_road_surface_relation_map_list.ParkingRoadSurfaceRelationMapList]:
        return self._parking_road_surface_relation_map_list_

    @parking_road_surface_relation_map_list.setter
    def parking_road_surface_relation_map_list(self, parking_road_surface_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_road_surface_relation_map_list.ParkingRoadSurfaceRelationMapList]) -> None:
        self._parking_road_surface_relation_map_list_ = parking_road_surface_relation_map_list_

    def is_parking_road_surface_relation_map_list_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.ROAD_SURFACE_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.ROAD_SURFACE_MAPS

    def is_parking_road_surface_relation_map_list_set(self) -> bool:
        return not self._parking_road_surface_relation_map_list_ is None

    def reset_parking_road_surface_relation_map_list(self) -> None:
        self._parking_road_surface_relation_map_list_ = None

    @property
    def parking_poi_relation_map_list(self) -> typing.Optional[nds.venue.instantiations.parking_poi_relation_map_list.ParkingPoiRelationMapList]:
        return self._parking_poi_relation_map_list_

    @parking_poi_relation_map_list.setter
    def parking_poi_relation_map_list(self, parking_poi_relation_map_list_: typing.Optional[nds.venue.instantiations.parking_poi_relation_map_list.ParkingPoiRelationMapList]) -> None:
        self._parking_poi_relation_map_list_ = parking_poi_relation_map_list_

    def is_parking_poi_relation_map_list_used(self) -> bool:
        return (self._content_ & nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.POI_MAPS) == nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.Values.POI_MAPS

    def is_parking_poi_relation_map_list_set(self) -> bool:
        return not self._parking_poi_relation_map_list_ is None

    def reset_parking_poi_relation_map_list(self) -> None:
        self._parking_poi_relation_map_list_ = None

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.RELATION

    def init_packing_context(self, zserio_context: ParkingFacilityRelationLayer.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_parking_lane_range_relation_map_list_used():
            self._parking_lane_range_relation_map_list_.init_packing_context(zserio_context.parking_lane_range_relation_map_list)
        if self.is_parking_lane_position_relation_map_list_used():
            self._parking_lane_position_relation_map_list_.init_packing_context(zserio_context.parking_lane_position_relation_map_list)
        if self.is_parking_road_surface_relation_map_list_used():
            self._parking_road_surface_relation_map_list_.init_packing_context(zserio_context.parking_road_surface_relation_map_list)
        if self.is_parking_poi_relation_map_list_used():
            self._parking_poi_relation_map_list_.init_packing_context(zserio_context.parking_poi_relation_map_list)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_parking_lane_range_relation_map_list_used():
            end_bitposition += self._parking_lane_range_relation_map_list_.bitsizeof(end_bitposition)
        if self.is_parking_lane_position_relation_map_list_used():
            end_bitposition += self._parking_lane_position_relation_map_list_.bitsizeof(end_bitposition)
        if self.is_parking_road_surface_relation_map_list_used():
            end_bitposition += self._parking_road_surface_relation_map_list_.bitsizeof(end_bitposition)
        if self.is_parking_poi_relation_map_list_used():
            end_bitposition += self._parking_poi_relation_map_list_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingFacilityRelationLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_parking_lane_range_relation_map_list_used():
            end_bitposition += self._parking_lane_range_relation_map_list_.bitsizeof_packed(zserio_context.parking_lane_range_relation_map_list, end_bitposition)
        if self.is_parking_lane_position_relation_map_list_used():
            end_bitposition += self._parking_lane_position_relation_map_list_.bitsizeof_packed(zserio_context.parking_lane_position_relation_map_list, end_bitposition)
        if self.is_parking_road_surface_relation_map_list_used():
            end_bitposition += self._parking_road_surface_relation_map_list_.bitsizeof_packed(zserio_context.parking_road_surface_relation_map_list, end_bitposition)
        if self.is_parking_poi_relation_map_list_used():
            end_bitposition += self._parking_poi_relation_map_list_.bitsizeof_packed(zserio_context.parking_poi_relation_map_list, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_parking_lane_range_relation_map_list_used():
            end_bitposition = self._parking_lane_range_relation_map_list_.initialize_offsets(end_bitposition)
        if self.is_parking_lane_position_relation_map_list_used():
            end_bitposition = self._parking_lane_position_relation_map_list_.initialize_offsets(end_bitposition)
        if self.is_parking_road_surface_relation_map_list_used():
            end_bitposition = self._parking_road_surface_relation_map_list_.initialize_offsets(end_bitposition)
        if self.is_parking_poi_relation_map_list_used():
            end_bitposition = self._parking_poi_relation_map_list_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingFacilityRelationLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_parking_lane_range_relation_map_list_used():
            end_bitposition = self._parking_lane_range_relation_map_list_.initialize_offsets_packed(zserio_context.parking_lane_range_relation_map_list, end_bitposition)
        if self.is_parking_lane_position_relation_map_list_used():
            end_bitposition = self._parking_lane_position_relation_map_list_.initialize_offsets_packed(zserio_context.parking_lane_position_relation_map_list, end_bitposition)
        if self.is_parking_road_surface_relation_map_list_used():
            end_bitposition = self._parking_road_surface_relation_map_list_.initialize_offsets_packed(zserio_context.parking_road_surface_relation_map_list, end_bitposition)
        if self.is_parking_poi_relation_map_list_used():
            end_bitposition = self._parking_poi_relation_map_list_.initialize_offsets_packed(zserio_context.parking_poi_relation_map_list, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.from_reader(zserio_reader)
        if self.is_parking_lane_range_relation_map_list_used():
            self._parking_lane_range_relation_map_list_ = nds.venue.instantiations.parking_lane_range_relation_map_list.ParkingLaneRangeRelationMapList.from_reader(zserio_reader, 0)
        else:
            self._parking_lane_range_relation_map_list_ = None
        if self.is_parking_lane_position_relation_map_list_used():
            self._parking_lane_position_relation_map_list_ = nds.venue.instantiations.parking_lane_position_relation_map_list.ParkingLanePositionRelationMapList.from_reader(zserio_reader, 0)
        else:
            self._parking_lane_position_relation_map_list_ = None
        if self.is_parking_road_surface_relation_map_list_used():
            self._parking_road_surface_relation_map_list_ = nds.venue.instantiations.parking_road_surface_relation_map_list.ParkingRoadSurfaceRelationMapList.from_reader(zserio_reader, 0)
        else:
            self._parking_road_surface_relation_map_list_ = None
        if self.is_parking_poi_relation_map_list_used():
            self._parking_poi_relation_map_list_ = nds.venue.instantiations.parking_poi_relation_map_list.ParkingPoiRelationMapList.from_reader(zserio_reader, 0)
        else:
            self._parking_poi_relation_map_list_ = None

    def read_packed(self, zserio_context: ParkingFacilityRelationLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.venue.metadata.parking_facility_relation_layer_content.ParkingFacilityRelationLayerContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_parking_lane_range_relation_map_list_used():
            self._parking_lane_range_relation_map_list_ = nds.venue.instantiations.parking_lane_range_relation_map_list.ParkingLaneRangeRelationMapList.from_reader_packed(zserio_context.parking_lane_range_relation_map_list, zserio_reader, 0)
        else:
            self._parking_lane_range_relation_map_list_ = None

        if self.is_parking_lane_position_relation_map_list_used():
            self._parking_lane_position_relation_map_list_ = nds.venue.instantiations.parking_lane_position_relation_map_list.ParkingLanePositionRelationMapList.from_reader_packed(zserio_context.parking_lane_position_relation_map_list, zserio_reader, 0)
        else:
            self._parking_lane_position_relation_map_list_ = None

        if self.is_parking_road_surface_relation_map_list_used():
            self._parking_road_surface_relation_map_list_ = nds.venue.instantiations.parking_road_surface_relation_map_list.ParkingRoadSurfaceRelationMapList.from_reader_packed(zserio_context.parking_road_surface_relation_map_list, zserio_reader, 0)
        else:
            self._parking_road_surface_relation_map_list_ = None

        if self.is_parking_poi_relation_map_list_used():
            self._parking_poi_relation_map_list_ = nds.venue.instantiations.parking_poi_relation_map_list.ParkingPoiRelationMapList.from_reader_packed(zserio_context.parking_poi_relation_map_list, zserio_reader, 0)
        else:
            self._parking_poi_relation_map_list_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)

        if self.is_parking_lane_range_relation_map_list_used():
            # check parameters
            if self._parking_lane_range_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingLaneRangeRelationMapList: "
                                                    f"{self._parking_lane_range_relation_map_list_.coord_shift} != {0}!")
            self._parking_lane_range_relation_map_list_.write(zserio_writer)

        if self.is_parking_lane_position_relation_map_list_used():
            # check parameters
            if self._parking_lane_position_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingLanePositionRelationMapList: "
                                                    f"{self._parking_lane_position_relation_map_list_.coord_shift} != {0}!")
            self._parking_lane_position_relation_map_list_.write(zserio_writer)

        if self.is_parking_road_surface_relation_map_list_used():
            # check parameters
            if self._parking_road_surface_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingRoadSurfaceRelationMapList: "
                                                    f"{self._parking_road_surface_relation_map_list_.coord_shift} != {0}!")
            self._parking_road_surface_relation_map_list_.write(zserio_writer)

        if self.is_parking_poi_relation_map_list_used():
            # check parameters
            if self._parking_poi_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingPoiRelationMapList: "
                                                    f"{self._parking_poi_relation_map_list_.coord_shift} != {0}!")
            self._parking_poi_relation_map_list_.write(zserio_writer)

    def write_packed(self, zserio_context: ParkingFacilityRelationLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_parking_lane_range_relation_map_list_used():
            # check parameters
            if self._parking_lane_range_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingLaneRangeRelationMapList: "
                                                    f"{self._parking_lane_range_relation_map_list_.coord_shift} != {0}!")
            self._parking_lane_range_relation_map_list_.write_packed(zserio_context.parking_lane_range_relation_map_list, zserio_writer)

        if self.is_parking_lane_position_relation_map_list_used():
            # check parameters
            if self._parking_lane_position_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingLanePositionRelationMapList: "
                                                    f"{self._parking_lane_position_relation_map_list_.coord_shift} != {0}!")
            self._parking_lane_position_relation_map_list_.write_packed(zserio_context.parking_lane_position_relation_map_list, zserio_writer)

        if self.is_parking_road_surface_relation_map_list_used():
            # check parameters
            if self._parking_road_surface_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingRoadSurfaceRelationMapList: "
                                                    f"{self._parking_road_surface_relation_map_list_.coord_shift} != {0}!")
            self._parking_road_surface_relation_map_list_.write_packed(zserio_context.parking_road_surface_relation_map_list, zserio_writer)

        if self.is_parking_poi_relation_map_list_used():
            # check parameters
            if self._parking_poi_relation_map_list_.coord_shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter coordShift for field ParkingFacilityRelationLayer.parkingPoiRelationMapList: "
                                                    f"{self._parking_poi_relation_map_list_.coord_shift} != {0}!")
            self._parking_poi_relation_map_list_.write_packed(zserio_context.parking_poi_relation_map_list, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._parking_lane_range_relation_map_list_ = nds.venue.instantiations.parking_lane_range_relation_map_list.ParkingLaneRangeRelationMapList.ZserioPackingContext()
            self._parking_lane_position_relation_map_list_ = nds.venue.instantiations.parking_lane_position_relation_map_list.ParkingLanePositionRelationMapList.ZserioPackingContext()
            self._parking_road_surface_relation_map_list_ = nds.venue.instantiations.parking_road_surface_relation_map_list.ParkingRoadSurfaceRelationMapList.ZserioPackingContext()
            self._parking_poi_relation_map_list_ = nds.venue.instantiations.parking_poi_relation_map_list.ParkingPoiRelationMapList.ZserioPackingContext()

        @property
        def content(self):
            return self._content_

        @property
        def parking_lane_range_relation_map_list(self):
            return self._parking_lane_range_relation_map_list_

        @property
        def parking_lane_position_relation_map_list(self):
            return self._parking_lane_position_relation_map_list_

        @property
        def parking_road_surface_relation_map_list(self):
            return self._parking_road_surface_relation_map_list_

        @property
        def parking_poi_relation_map_list(self):
            return self._parking_poi_relation_map_list_
