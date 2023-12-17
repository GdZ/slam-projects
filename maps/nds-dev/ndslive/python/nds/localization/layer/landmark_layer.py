# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.geometry_layer_type
import nds.localization.instantiations.landmark_line_geometry_layer
import nds.localization.instantiations.landmark_mesh_geometry_layer
import nds.localization.instantiations.landmark_polygon_geometry_layer
import nds.localization.layer.landmark_layer_header
import nds.system.types.layer_type

class LandmarkLayer:
    def __init__(
            self,
            header_: typing.Union[nds.localization.layer.landmark_layer_header.LandmarkLayerHeader, None] = None,
            line_geometry_layer_: typing.Optional[nds.localization.instantiations.landmark_line_geometry_layer.LandmarkLineGeometryLayer] = None,
            polygon_geometry_layer_: typing.Optional[nds.localization.instantiations.landmark_polygon_geometry_layer.LandmarkPolygonGeometryLayer] = None,
            mesh_geometry_layer_: typing.Optional[nds.localization.instantiations.landmark_mesh_geometry_layer.LandmarkMeshGeometryLayer] = None) -> None:
        self._header_ = header_
        self._line_geometry_layer_ = line_geometry_layer_
        self._polygon_geometry_layer_ = polygon_geometry_layer_
        self._mesh_geometry_layer_ = mesh_geometry_layer_

    @classmethod
    def from_reader(
            cls: typing.Type['LandmarkLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'LandmarkLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LandmarkLayer'],
            zserio_context: LandmarkLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LandmarkLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LandmarkLayer):
            return ((self._header_ == other._header_) and
                    (not other.is_line_geometry_layer_used() if not self.is_line_geometry_layer_used() else (self._line_geometry_layer_ == other._line_geometry_layer_)) and
                    (not other.is_polygon_geometry_layer_used() if not self.is_polygon_geometry_layer_used() else (self._polygon_geometry_layer_ == other._polygon_geometry_layer_)) and
                    (not other.is_mesh_geometry_layer_used() if not self.is_mesh_geometry_layer_used() else (self._mesh_geometry_layer_ == other._mesh_geometry_layer_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._header_)
        if self.is_line_geometry_layer_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._line_geometry_layer_)
        if self.is_polygon_geometry_layer_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._polygon_geometry_layer_)
        if self.is_mesh_geometry_layer_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._mesh_geometry_layer_)

        return result

    @property
    def header(self) -> typing.Union[nds.localization.layer.landmark_layer_header.LandmarkLayerHeader, None]:
        return self._header_

    @header.setter
    def header(self, header_: typing.Union[nds.localization.layer.landmark_layer_header.LandmarkLayerHeader, None]) -> None:
        self._header_ = header_

    @property
    def line_geometry_layer(self) -> typing.Optional[nds.localization.instantiations.landmark_line_geometry_layer.LandmarkLineGeometryLayer]:
        return self._line_geometry_layer_

    @line_geometry_layer.setter
    def line_geometry_layer(self, line_geometry_layer_: typing.Optional[nds.localization.instantiations.landmark_line_geometry_layer.LandmarkLineGeometryLayer]) -> None:
        self._line_geometry_layer_ = line_geometry_layer_

    def is_line_geometry_layer_used(self) -> bool:
        return len(self._header_.available_line_types) > 0

    def is_line_geometry_layer_set(self) -> bool:
        return not self._line_geometry_layer_ is None

    def reset_line_geometry_layer(self) -> None:
        self._line_geometry_layer_ = None

    @property
    def polygon_geometry_layer(self) -> typing.Optional[nds.localization.instantiations.landmark_polygon_geometry_layer.LandmarkPolygonGeometryLayer]:
        return self._polygon_geometry_layer_

    @polygon_geometry_layer.setter
    def polygon_geometry_layer(self, polygon_geometry_layer_: typing.Optional[nds.localization.instantiations.landmark_polygon_geometry_layer.LandmarkPolygonGeometryLayer]) -> None:
        self._polygon_geometry_layer_ = polygon_geometry_layer_

    def is_polygon_geometry_layer_used(self) -> bool:
        return len(self._header_.available_polygon_types) > 0

    def is_polygon_geometry_layer_set(self) -> bool:
        return not self._polygon_geometry_layer_ is None

    def reset_polygon_geometry_layer(self) -> None:
        self._polygon_geometry_layer_ = None

    @property
    def mesh_geometry_layer(self) -> typing.Optional[nds.localization.instantiations.landmark_mesh_geometry_layer.LandmarkMeshGeometryLayer]:
        return self._mesh_geometry_layer_

    @mesh_geometry_layer.setter
    def mesh_geometry_layer(self, mesh_geometry_layer_: typing.Optional[nds.localization.instantiations.landmark_mesh_geometry_layer.LandmarkMeshGeometryLayer]) -> None:
        self._mesh_geometry_layer_ = mesh_geometry_layer_

    def is_mesh_geometry_layer_used(self) -> bool:
        return len(self._header_.available_mesh_types) > 0

    def is_mesh_geometry_layer_set(self) -> bool:
        return not self._mesh_geometry_layer_ is None

    def reset_mesh_geometry_layer(self) -> None:
        self._mesh_geometry_layer_ = None

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.GEOMETRY

    def init_packing_context(self, zserio_context: LandmarkLayer.ZserioPackingContext) -> None:
        self._header_.init_packing_context(zserio_context.header)
        if self.is_line_geometry_layer_used():
            self._line_geometry_layer_.init_packing_context(zserio_context.line_geometry_layer)
        if self.is_polygon_geometry_layer_used():
            self._polygon_geometry_layer_.init_packing_context(zserio_context.polygon_geometry_layer)
        if self.is_mesh_geometry_layer_used():
            self._mesh_geometry_layer_.init_packing_context(zserio_context.mesh_geometry_layer)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._header_.bitsizeof(end_bitposition)
        if self.is_line_geometry_layer_used():
            end_bitposition += self._line_geometry_layer_.bitsizeof(end_bitposition)
        if self.is_polygon_geometry_layer_used():
            end_bitposition += self._polygon_geometry_layer_.bitsizeof(end_bitposition)
        if self.is_mesh_geometry_layer_used():
            end_bitposition += self._mesh_geometry_layer_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LandmarkLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._header_.bitsizeof_packed(zserio_context.header, end_bitposition)
        if self.is_line_geometry_layer_used():
            end_bitposition += self._line_geometry_layer_.bitsizeof_packed(zserio_context.line_geometry_layer, end_bitposition)
        if self.is_polygon_geometry_layer_used():
            end_bitposition += self._polygon_geometry_layer_.bitsizeof_packed(zserio_context.polygon_geometry_layer, end_bitposition)
        if self.is_mesh_geometry_layer_used():
            end_bitposition += self._mesh_geometry_layer_.bitsizeof_packed(zserio_context.mesh_geometry_layer, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._header_.initialize_offsets(end_bitposition)
        if self.is_line_geometry_layer_used():
            end_bitposition = self._line_geometry_layer_.initialize_offsets(end_bitposition)
        if self.is_polygon_geometry_layer_used():
            end_bitposition = self._polygon_geometry_layer_.initialize_offsets(end_bitposition)
        if self.is_mesh_geometry_layer_used():
            end_bitposition = self._mesh_geometry_layer_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LandmarkLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._header_.initialize_offsets_packed(zserio_context.header, end_bitposition)
        if self.is_line_geometry_layer_used():
            end_bitposition = self._line_geometry_layer_.initialize_offsets_packed(zserio_context.line_geometry_layer, end_bitposition)
        if self.is_polygon_geometry_layer_used():
            end_bitposition = self._polygon_geometry_layer_.initialize_offsets_packed(zserio_context.polygon_geometry_layer, end_bitposition)
        if self.is_mesh_geometry_layer_used():
            end_bitposition = self._mesh_geometry_layer_.initialize_offsets_packed(zserio_context.mesh_geometry_layer, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._header_ = nds.localization.layer.landmark_layer_header.LandmarkLayerHeader.from_reader(zserio_reader)
        # check constraint
        if not ((len(self._header_.available_line_types) > 0) or (len(self._header_.available_polygon_types) > 0) or (len(self._header_.available_mesh_types) > 0)):
            raise zserio.PythonRuntimeException("Constraint violated for field LandmarkLayer.header!")

        if self.is_line_geometry_layer_used():
            self._line_geometry_layer_ = nds.localization.instantiations.landmark_line_geometry_layer.LandmarkLineGeometryLayer.from_reader(zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_3D, (self._header_.has_relations or self._header_.has_details), True)
        else:
            self._line_geometry_layer_ = None

        if self.is_polygon_geometry_layer_used():
            self._polygon_geometry_layer_ = nds.localization.instantiations.landmark_polygon_geometry_layer.LandmarkPolygonGeometryLayer.from_reader(zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.POLYGON_3D, (self._header_.has_relations or self._header_.has_details), True)
        else:
            self._polygon_geometry_layer_ = None

        if self.is_mesh_geometry_layer_used():
            self._mesh_geometry_layer_ = nds.localization.instantiations.landmark_mesh_geometry_layer.LandmarkMeshGeometryLayer.from_reader(zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.MESH_3D, (self._header_.has_relations or self._header_.has_details), True)
        else:
            self._mesh_geometry_layer_ = None

    def read_packed(self, zserio_context: LandmarkLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._header_ = nds.localization.layer.landmark_layer_header.LandmarkLayerHeader.from_reader_packed(zserio_context.header, zserio_reader)
        # check constraint
        if not ((len(self._header_.available_line_types) > 0) or (len(self._header_.available_polygon_types) > 0) or (len(self._header_.available_mesh_types) > 0)):
            raise zserio.PythonRuntimeException("Constraint violated for field LandmarkLayer.header!")

        if self.is_line_geometry_layer_used():
            self._line_geometry_layer_ = nds.localization.instantiations.landmark_line_geometry_layer.LandmarkLineGeometryLayer.from_reader_packed(zserio_context.line_geometry_layer, zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_3D, (self._header_.has_relations or self._header_.has_details), True)
        else:
            self._line_geometry_layer_ = None

        if self.is_polygon_geometry_layer_used():
            self._polygon_geometry_layer_ = nds.localization.instantiations.landmark_polygon_geometry_layer.LandmarkPolygonGeometryLayer.from_reader_packed(zserio_context.polygon_geometry_layer, zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.POLYGON_3D, (self._header_.has_relations or self._header_.has_details), True)
        else:
            self._polygon_geometry_layer_ = None

        if self.is_mesh_geometry_layer_used():
            self._mesh_geometry_layer_ = nds.localization.instantiations.landmark_mesh_geometry_layer.LandmarkMeshGeometryLayer.from_reader_packed(zserio_context.mesh_geometry_layer, zserio_reader, nds.core.geometry.geometry_layer_type.GeometryLayerType.MESH_3D, (self._header_.has_relations or self._header_.has_details), True)
        else:
            self._mesh_geometry_layer_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not ((len(self._header_.available_line_types) > 0) or (len(self._header_.available_polygon_types) > 0) or (len(self._header_.available_mesh_types) > 0)):
            raise zserio.PythonRuntimeException("Constraint violated for field LandmarkLayer.header!")
        self._header_.write(zserio_writer)

        if self.is_line_geometry_layer_used():
            # check parameters
            if self._line_geometry_layer_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_3D):
                raise zserio.PythonRuntimeException("Wrong parameter type for field LandmarkLayer.lineGeometryLayer: "
                                                    f"{self._line_geometry_layer_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_3D}!")
            if self._line_geometry_layer_.has_ids != ((self._header_.has_relations or self._header_.has_details)):
                raise zserio.PythonRuntimeException("Wrong parameter hasIds for field LandmarkLayer.lineGeometryLayer: "
                                                    f"{self._line_geometry_layer_.has_ids} != {(self._header_.has_relations or self._header_.has_details)}!")
            if self._line_geometry_layer_.has_types != (True):
                raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field LandmarkLayer.lineGeometryLayer: "
                                                    f"{self._line_geometry_layer_.has_types} != {True}!")
            self._line_geometry_layer_.write(zserio_writer)

        if self.is_polygon_geometry_layer_used():
            # check parameters
            if self._polygon_geometry_layer_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.POLYGON_3D):
                raise zserio.PythonRuntimeException("Wrong parameter type for field LandmarkLayer.polygonGeometryLayer: "
                                                    f"{self._polygon_geometry_layer_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.POLYGON_3D}!")
            if self._polygon_geometry_layer_.has_ids != ((self._header_.has_relations or self._header_.has_details)):
                raise zserio.PythonRuntimeException("Wrong parameter hasIds for field LandmarkLayer.polygonGeometryLayer: "
                                                    f"{self._polygon_geometry_layer_.has_ids} != {(self._header_.has_relations or self._header_.has_details)}!")
            if self._polygon_geometry_layer_.has_types != (True):
                raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field LandmarkLayer.polygonGeometryLayer: "
                                                    f"{self._polygon_geometry_layer_.has_types} != {True}!")
            self._polygon_geometry_layer_.write(zserio_writer)

        if self.is_mesh_geometry_layer_used():
            # check parameters
            if self._mesh_geometry_layer_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.MESH_3D):
                raise zserio.PythonRuntimeException("Wrong parameter type for field LandmarkLayer.meshGeometryLayer: "
                                                    f"{self._mesh_geometry_layer_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.MESH_3D}!")
            if self._mesh_geometry_layer_.has_ids != ((self._header_.has_relations or self._header_.has_details)):
                raise zserio.PythonRuntimeException("Wrong parameter hasIds for field LandmarkLayer.meshGeometryLayer: "
                                                    f"{self._mesh_geometry_layer_.has_ids} != {(self._header_.has_relations or self._header_.has_details)}!")
            if self._mesh_geometry_layer_.has_types != (True):
                raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field LandmarkLayer.meshGeometryLayer: "
                                                    f"{self._mesh_geometry_layer_.has_types} != {True}!")
            self._mesh_geometry_layer_.write(zserio_writer)

    def write_packed(self, zserio_context: LandmarkLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not ((len(self._header_.available_line_types) > 0) or (len(self._header_.available_polygon_types) > 0) or (len(self._header_.available_mesh_types) > 0)):
            raise zserio.PythonRuntimeException("Constraint violated for field LandmarkLayer.header!")
        self._header_.write_packed(zserio_context.header, zserio_writer)

        if self.is_line_geometry_layer_used():
            # check parameters
            if self._line_geometry_layer_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_3D):
                raise zserio.PythonRuntimeException("Wrong parameter type for field LandmarkLayer.lineGeometryLayer: "
                                                    f"{self._line_geometry_layer_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.LINE_3D}!")
            if self._line_geometry_layer_.has_ids != ((self._header_.has_relations or self._header_.has_details)):
                raise zserio.PythonRuntimeException("Wrong parameter hasIds for field LandmarkLayer.lineGeometryLayer: "
                                                    f"{self._line_geometry_layer_.has_ids} != {(self._header_.has_relations or self._header_.has_details)}!")
            if self._line_geometry_layer_.has_types != (True):
                raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field LandmarkLayer.lineGeometryLayer: "
                                                    f"{self._line_geometry_layer_.has_types} != {True}!")
            self._line_geometry_layer_.write_packed(zserio_context.line_geometry_layer, zserio_writer)

        if self.is_polygon_geometry_layer_used():
            # check parameters
            if self._polygon_geometry_layer_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.POLYGON_3D):
                raise zserio.PythonRuntimeException("Wrong parameter type for field LandmarkLayer.polygonGeometryLayer: "
                                                    f"{self._polygon_geometry_layer_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.POLYGON_3D}!")
            if self._polygon_geometry_layer_.has_ids != ((self._header_.has_relations or self._header_.has_details)):
                raise zserio.PythonRuntimeException("Wrong parameter hasIds for field LandmarkLayer.polygonGeometryLayer: "
                                                    f"{self._polygon_geometry_layer_.has_ids} != {(self._header_.has_relations or self._header_.has_details)}!")
            if self._polygon_geometry_layer_.has_types != (True):
                raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field LandmarkLayer.polygonGeometryLayer: "
                                                    f"{self._polygon_geometry_layer_.has_types} != {True}!")
            self._polygon_geometry_layer_.write_packed(zserio_context.polygon_geometry_layer, zserio_writer)

        if self.is_mesh_geometry_layer_used():
            # check parameters
            if self._mesh_geometry_layer_.type is not (nds.core.geometry.geometry_layer_type.GeometryLayerType.MESH_3D):
                raise zserio.PythonRuntimeException("Wrong parameter type for field LandmarkLayer.meshGeometryLayer: "
                                                    f"{self._mesh_geometry_layer_.type} != {nds.core.geometry.geometry_layer_type.GeometryLayerType.MESH_3D}!")
            if self._mesh_geometry_layer_.has_ids != ((self._header_.has_relations or self._header_.has_details)):
                raise zserio.PythonRuntimeException("Wrong parameter hasIds for field LandmarkLayer.meshGeometryLayer: "
                                                    f"{self._mesh_geometry_layer_.has_ids} != {(self._header_.has_relations or self._header_.has_details)}!")
            if self._mesh_geometry_layer_.has_types != (True):
                raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field LandmarkLayer.meshGeometryLayer: "
                                                    f"{self._mesh_geometry_layer_.has_types} != {True}!")
            self._mesh_geometry_layer_.write_packed(zserio_context.mesh_geometry_layer, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._header_ = nds.localization.layer.landmark_layer_header.LandmarkLayerHeader.ZserioPackingContext()
            self._line_geometry_layer_ = nds.localization.instantiations.landmark_line_geometry_layer.LandmarkLineGeometryLayer.ZserioPackingContext()
            self._polygon_geometry_layer_ = nds.localization.instantiations.landmark_polygon_geometry_layer.LandmarkPolygonGeometryLayer.ZserioPackingContext()
            self._mesh_geometry_layer_ = nds.localization.instantiations.landmark_mesh_geometry_layer.LandmarkMeshGeometryLayer.ZserioPackingContext()

        @property
        def header(self):
            return self._header_

        @property
        def line_geometry_layer(self):
            return self._line_geometry_layer_

        @property
        def polygon_geometry_layer(self):
            return self._polygon_geometry_layer_

        @property
        def mesh_geometry_layer(self):
            return self._mesh_geometry_layer_