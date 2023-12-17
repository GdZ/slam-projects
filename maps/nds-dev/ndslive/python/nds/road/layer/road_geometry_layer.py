# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.geometry_layer_type
import nds.road.instantiations.road_shapes_layer
import nds.system.types.layer_type

class RoadGeometryLayer:
    def __init__(
            self,
            road_shapes_: typing.Union[nds.road.instantiations.road_shapes_layer.RoadShapesLayer, None] = None) -> None:
        self._road_shapes_ = road_shapes_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadGeometryLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadGeometryLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadGeometryLayer'],
            zserio_context: RoadGeometryLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadGeometryLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadGeometryLayer):
            return (self._road_shapes_ == other._road_shapes_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._road_shapes_)

        return result

    @property
    def road_shapes(self) -> typing.Union[nds.road.instantiations.road_shapes_layer.RoadShapesLayer, None]:
        return self._road_shapes_

    @road_shapes.setter
    def road_shapes(self, road_shapes_: typing.Union[nds.road.instantiations.road_shapes_layer.RoadShapesLayer, None]) -> None:
        self._road_shapes_ = road_shapes_

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.GEOMETRY

    def init_packing_context(self, zserio_context: RoadGeometryLayer.ZserioPackingContext) -> None:
        self._road_shapes_.init_packing_context(zserio_context.road_shapes)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._road_shapes_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadGeometryLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._road_shapes_.bitsizeof_packed(zserio_context.road_shapes, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._road_shapes_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadGeometryLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._road_shapes_.initialize_offsets_packed(zserio_context.road_shapes, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._road_shapes_ = nds.road.instantiations.road_shapes_layer.RoadShapesLayer.from_reader(zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_2D, True, False)

    def read_packed(self, zserio_context: RoadGeometryLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._road_shapes_ = nds.road.instantiations.road_shapes_layer.RoadShapesLayer.from_reader_packed(zserio_context.road_shapes, zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_2D, True, False)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._road_shapes_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_2D):
            raise zserio.PythonRuntimeException("Wrong parameter type for field RoadGeometryLayer.roadShapes: "
                                                f"{self._road_shapes_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_2D}!")
        if self._road_shapes_.has_ids != (True):
            raise zserio.PythonRuntimeException("Wrong parameter hasIds for field RoadGeometryLayer.roadShapes: "
                                                f"{self._road_shapes_.has_ids} != {True}!")
        if self._road_shapes_.has_types != (False):
            raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field RoadGeometryLayer.roadShapes: "
                                                f"{self._road_shapes_.has_types} != {False}!")
        self._road_shapes_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadGeometryLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._road_shapes_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_2D):
            raise zserio.PythonRuntimeException("Wrong parameter type for field RoadGeometryLayer.roadShapes: "
                                                f"{self._road_shapes_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_2D}!")
        if self._road_shapes_.has_ids != (True):
            raise zserio.PythonRuntimeException("Wrong parameter hasIds for field RoadGeometryLayer.roadShapes: "
                                                f"{self._road_shapes_.has_ids} != {True}!")
        if self._road_shapes_.has_types != (False):
            raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field RoadGeometryLayer.roadShapes: "
                                                f"{self._road_shapes_.has_types} != {False}!")
        self._road_shapes_.write_packed(zserio_context.road_shapes, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._road_shapes_ = nds.road.instantiations.road_shapes_layer.RoadShapesLayer.ZserioPackingContext()

        @property
        def road_shapes(self):
            return self._road_shapes_