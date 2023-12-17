# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.localization.instantiations.landmark_road_surface_attribute_map_list
import nds.system.types.layer_type

class RoadSurfaceLandmarkLayer:
    def __init__(
            self,
            road_surface_attribute_maps_: typing.Union[nds.localization.instantiations.landmark_road_surface_attribute_map_list.LandmarkRoadSurfaceAttributeMapList, None] = None) -> None:
        self._road_surface_attribute_maps_ = road_surface_attribute_maps_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadSurfaceLandmarkLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadSurfaceLandmarkLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadSurfaceLandmarkLayer'],
            zserio_context: RoadSurfaceLandmarkLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadSurfaceLandmarkLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadSurfaceLandmarkLayer):
            return (self._road_surface_attribute_maps_ == other._road_surface_attribute_maps_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._road_surface_attribute_maps_)

        return result

    @property
    def road_surface_attribute_maps(self) -> typing.Union[nds.localization.instantiations.landmark_road_surface_attribute_map_list.LandmarkRoadSurfaceAttributeMapList, None]:
        return self._road_surface_attribute_maps_

    @road_surface_attribute_maps.setter
    def road_surface_attribute_maps(self, road_surface_attribute_maps_: typing.Union[nds.localization.instantiations.landmark_road_surface_attribute_map_list.LandmarkRoadSurfaceAttributeMapList, None]) -> None:
        self._road_surface_attribute_maps_ = road_surface_attribute_maps_

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.RELATION

    def init_packing_context(self, zserio_context: RoadSurfaceLandmarkLayer.ZserioPackingContext) -> None:
        self._road_surface_attribute_maps_.init_packing_context(zserio_context.road_surface_attribute_maps)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._road_surface_attribute_maps_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadSurfaceLandmarkLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._road_surface_attribute_maps_.bitsizeof_packed(zserio_context.road_surface_attribute_maps, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._road_surface_attribute_maps_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadSurfaceLandmarkLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._road_surface_attribute_maps_.initialize_offsets_packed(zserio_context.road_surface_attribute_maps, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._road_surface_attribute_maps_ = nds.localization.instantiations.landmark_road_surface_attribute_map_list.LandmarkRoadSurfaceAttributeMapList.from_reader(zserio_reader, 0)

    def read_packed(self, zserio_context: RoadSurfaceLandmarkLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._road_surface_attribute_maps_ = nds.localization.instantiations.landmark_road_surface_attribute_map_list.LandmarkRoadSurfaceAttributeMapList.from_reader_packed(zserio_context.road_surface_attribute_maps, zserio_reader, 0)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._road_surface_attribute_maps_.coord_shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadSurfaceLandmarkLayer.roadSurfaceAttributeMaps: "
                                                f"{self._road_surface_attribute_maps_.coord_shift} != {0}!")
        self._road_surface_attribute_maps_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadSurfaceLandmarkLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._road_surface_attribute_maps_.coord_shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter coordShift for field RoadSurfaceLandmarkLayer.roadSurfaceAttributeMaps: "
                                                f"{self._road_surface_attribute_maps_.coord_shift} != {0}!")
        self._road_surface_attribute_maps_.write_packed(zserio_context.road_surface_attribute_maps, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._road_surface_attribute_maps_ = nds.localization.instantiations.landmark_road_surface_attribute_map_list.LandmarkRoadSurfaceAttributeMapList.ZserioPackingContext()

        @property
        def road_surface_attribute_maps(self):
            return self._road_surface_attribute_maps_
