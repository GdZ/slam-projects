# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.poly_mesh3d
import nds.display.types.mesh3d_render_configuration
import nds.display.types.mesh3d_render_layer_header
import nds.display.types.render_group

class Mesh3DRenderData:
    def __init__(
            self,
            mesh_: nds.core.geometry.poly_mesh3d.PolyMesh3D,
            header_: nds.display.types.mesh3d_render_layer_header.Mesh3DRenderLayerHeader,
            mesh3d_render_configuration_: typing.Union[nds.display.types.mesh3d_render_configuration.Mesh3DRenderConfiguration, None] = None,
            start_index_normals_: typing.Optional[int] = None,
            start_index_colors_: typing.Optional[int] = None,
            start_index_texture_coords_: typing.Optional[int] = None,
            start_index_texture_coords_additional_: typing.Optional[int] = None,
            render_groups_: typing.List[nds.display.types.render_group.RenderGroup] = None) -> None:
        self._mesh_ = mesh_
        self._header_ = header_
        self._mesh3d_render_configuration_ = mesh3d_render_configuration_
        self._start_index_normals_ = start_index_normals_
        self._start_index_colors_ = start_index_colors_
        self._start_index_texture_coords_ = start_index_texture_coords_
        self._start_index_texture_coords_additional_ = start_index_texture_coords_additional_
        self._render_groups_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_groups(self)), render_groups_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['Mesh3DRenderData'],
            zserio_reader: zserio.BitStreamReader,
            mesh_: nds.core.geometry.poly_mesh3d.PolyMesh3D,
            header_: nds.display.types.mesh3d_render_layer_header.Mesh3DRenderLayerHeader) -> 'Mesh3DRenderData':
        self = object.__new__(cls)
        self._mesh_ = mesh_
        self._header_ = header_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Mesh3DRenderData'],
            zserio_context: Mesh3DRenderData.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            mesh_: nds.core.geometry.poly_mesh3d.PolyMesh3D,
            header_: nds.display.types.mesh3d_render_layer_header.Mesh3DRenderLayerHeader) -> 'Mesh3DRenderData':
        self = object.__new__(cls)
        self._mesh_ = mesh_
        self._header_ = header_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Mesh3DRenderData):
            return (self._mesh_ == other._mesh_ and
                    self._header_ == other._header_ and
                    (self._mesh3d_render_configuration_ == other._mesh3d_render_configuration_) and
                    (not other.is_start_index_normals_used() if not self.is_start_index_normals_used() else (self._start_index_normals_ == other._start_index_normals_)) and
                    (not other.is_start_index_colors_used() if not self.is_start_index_colors_used() else (self._start_index_colors_ == other._start_index_colors_)) and
                    (not other.is_start_index_texture_coords_used() if not self.is_start_index_texture_coords_used() else (self._start_index_texture_coords_ == other._start_index_texture_coords_)) and
                    (not other.is_start_index_texture_coords_additional_used() if not self.is_start_index_texture_coords_additional_used() else (self._start_index_texture_coords_additional_ == other._start_index_texture_coords_additional_)) and
                    (self._render_groups_ == other._render_groups_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._mesh_)
        result = zserio.hashcode.calc_hashcode_object(result, self._header_)
        result = zserio.hashcode.calc_hashcode_object(result, self._mesh3d_render_configuration_)
        if self.is_start_index_normals_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._start_index_normals_)
        if self.is_start_index_colors_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._start_index_colors_)
        if self.is_start_index_texture_coords_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._start_index_texture_coords_)
        if self.is_start_index_texture_coords_additional_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._start_index_texture_coords_additional_)
        result = zserio.hashcode.calc_hashcode_object(result, self._render_groups_)

        return result

    @property
    def mesh(self) -> nds.core.geometry.poly_mesh3d.PolyMesh3D:
        return self._mesh_

    @property
    def header(self) -> nds.display.types.mesh3d_render_layer_header.Mesh3DRenderLayerHeader:
        return self._header_

    @property
    def mesh3d_render_configuration(self) -> typing.Union[nds.display.types.mesh3d_render_configuration.Mesh3DRenderConfiguration, None]:
        return self._mesh3d_render_configuration_

    @mesh3d_render_configuration.setter
    def mesh3d_render_configuration(self, mesh3d_render_configuration_: typing.Union[nds.display.types.mesh3d_render_configuration.Mesh3DRenderConfiguration, None]) -> None:
        self._mesh3d_render_configuration_ = mesh3d_render_configuration_

    @property
    def start_index_normals(self) -> typing.Optional[int]:
        return self._start_index_normals_

    @start_index_normals.setter
    def start_index_normals(self, start_index_normals_: typing.Optional[int]) -> None:
        self._start_index_normals_ = start_index_normals_

    def is_start_index_normals_used(self) -> bool:
        return self._mesh3d_render_configuration_.has_normals

    def is_start_index_normals_set(self) -> bool:
        return not self._start_index_normals_ is None

    def reset_start_index_normals(self) -> None:
        self._start_index_normals_ = None

    @property
    def start_index_colors(self) -> typing.Optional[int]:
        return self._start_index_colors_

    @start_index_colors.setter
    def start_index_colors(self, start_index_colors_: typing.Optional[int]) -> None:
        self._start_index_colors_ = start_index_colors_

    def is_start_index_colors_used(self) -> bool:
        return self._mesh3d_render_configuration_.uses_color_per_vertex()

    def is_start_index_colors_set(self) -> bool:
        return not self._start_index_colors_ is None

    def reset_start_index_colors(self) -> None:
        self._start_index_colors_ = None

    @property
    def start_index_texture_coords(self) -> typing.Optional[int]:
        return self._start_index_texture_coords_

    @start_index_texture_coords.setter
    def start_index_texture_coords(self, start_index_texture_coords_: typing.Optional[int]) -> None:
        self._start_index_texture_coords_ = start_index_texture_coords_

    def is_start_index_texture_coords_used(self) -> bool:
        return self._mesh3d_render_configuration_.has_texture_coords

    def is_start_index_texture_coords_set(self) -> bool:
        return not self._start_index_texture_coords_ is None

    def reset_start_index_texture_coords(self) -> None:
        self._start_index_texture_coords_ = None

    @property
    def start_index_texture_coords_additional(self) -> typing.Optional[int]:
        return self._start_index_texture_coords_additional_

    @start_index_texture_coords_additional.setter
    def start_index_texture_coords_additional(self, start_index_texture_coords_additional_: typing.Optional[int]) -> None:
        self._start_index_texture_coords_additional_ = start_index_texture_coords_additional_

    def is_start_index_texture_coords_additional_used(self) -> bool:
        return self._mesh3d_render_configuration_.has_texture_coords_additional

    def is_start_index_texture_coords_additional_set(self) -> bool:
        return not self._start_index_texture_coords_additional_ is None

    def reset_start_index_texture_coords_additional(self) -> None:
        self._start_index_texture_coords_additional_ = None

    @property
    def render_groups(self) -> typing.List[nds.display.types.render_group.RenderGroup]:
        return self._render_groups_.raw_array

    @render_groups.setter
    def render_groups(self, render_groups_: typing.List[nds.display.types.render_group.RenderGroup]) -> None:
        self._render_groups_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_groups(self)), render_groups_, is_auto=True)

    def init_packing_context(self, zserio_context: Mesh3DRenderData.ZserioPackingContext) -> None:
        self._mesh3d_render_configuration_.init_packing_context(zserio_context.mesh3d_render_configuration)
        if self.is_start_index_normals_used():
            zserio_context.start_index_normals.init(zserio.array.VarSizeArrayTraits(), self._start_index_normals_)
        if self.is_start_index_colors_used():
            zserio_context.start_index_colors.init(zserio.array.VarSizeArrayTraits(), self._start_index_colors_)
        if self.is_start_index_texture_coords_used():
            zserio_context.start_index_texture_coords.init(zserio.array.VarSizeArrayTraits(), self._start_index_texture_coords_)
        if self.is_start_index_texture_coords_additional_used():
            zserio_context.start_index_texture_coords_additional.init(zserio.array.VarSizeArrayTraits(), self._start_index_texture_coords_additional_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._mesh3d_render_configuration_.bitsizeof(end_bitposition)
        if self.is_start_index_normals_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_normals_)
        if self.is_start_index_colors_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_colors_)
        if self.is_start_index_texture_coords_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_texture_coords_)
        if self.is_start_index_texture_coords_additional_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_texture_coords_additional_)
        end_bitposition += self._render_groups_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Mesh3DRenderData.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._mesh3d_render_configuration_.bitsizeof_packed(zserio_context.mesh3d_render_configuration, end_bitposition)
        if self.is_start_index_normals_used():
            end_bitposition += zserio_context.start_index_normals.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_normals_)
        if self.is_start_index_colors_used():
            end_bitposition += zserio_context.start_index_colors.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_colors_)
        if self.is_start_index_texture_coords_used():
            end_bitposition += zserio_context.start_index_texture_coords.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_texture_coords_)
        if self.is_start_index_texture_coords_additional_used():
            end_bitposition += zserio_context.start_index_texture_coords_additional.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_texture_coords_additional_)
        end_bitposition += self._render_groups_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._mesh3d_render_configuration_.initialize_offsets(end_bitposition)
        if self.is_start_index_normals_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_normals_)
        if self.is_start_index_colors_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_colors_)
        if self.is_start_index_texture_coords_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_texture_coords_)
        if self.is_start_index_texture_coords_additional_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_texture_coords_additional_)
        end_bitposition = self._render_groups_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Mesh3DRenderData.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._mesh3d_render_configuration_.initialize_offsets_packed(zserio_context.mesh3d_render_configuration, end_bitposition)
        if self.is_start_index_normals_used():
            end_bitposition += zserio_context.start_index_normals.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_normals_)
        if self.is_start_index_colors_used():
            end_bitposition += zserio_context.start_index_colors.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_colors_)
        if self.is_start_index_texture_coords_used():
            end_bitposition += zserio_context.start_index_texture_coords.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_texture_coords_)
        if self.is_start_index_texture_coords_additional_used():
            end_bitposition += zserio_context.start_index_texture_coords_additional.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_texture_coords_additional_)
        end_bitposition = self._render_groups_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._mesh3d_render_configuration_ = nds.display.types.mesh3d_render_configuration.Mesh3DRenderConfiguration.from_reader(zserio_reader, self._header_)

        if self.is_start_index_normals_used():
            self._start_index_normals_ = zserio_reader.read_varsize()
        else:
            self._start_index_normals_ = None

        if self.is_start_index_colors_used():
            self._start_index_colors_ = zserio_reader.read_varsize()
        else:
            self._start_index_colors_ = None

        if self.is_start_index_texture_coords_used():
            self._start_index_texture_coords_ = zserio_reader.read_varsize()
        else:
            self._start_index_texture_coords_ = None

        if self.is_start_index_texture_coords_additional_used():
            self._start_index_texture_coords_additional_ = zserio_reader.read_varsize()
        else:
            self._start_index_texture_coords_additional_ = None

        self._render_groups_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_groups(self)), zserio_reader, is_auto=True)
        # check constraint
        if not (len(self._render_groups_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field Mesh3DRenderData.renderGroups!")

    def read_packed(self, zserio_context: Mesh3DRenderData.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._mesh3d_render_configuration_ = nds.display.types.mesh3d_render_configuration.Mesh3DRenderConfiguration.from_reader_packed(zserio_context.mesh3d_render_configuration, zserio_reader, self._header_)

        if self.is_start_index_normals_used():
            self._start_index_normals_ = zserio_context.start_index_normals.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        else:
            self._start_index_normals_ = None

        if self.is_start_index_colors_used():
            self._start_index_colors_ = zserio_context.start_index_colors.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        else:
            self._start_index_colors_ = None

        if self.is_start_index_texture_coords_used():
            self._start_index_texture_coords_ = zserio_context.start_index_texture_coords.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        else:
            self._start_index_texture_coords_ = None

        if self.is_start_index_texture_coords_additional_used():
            self._start_index_texture_coords_additional_ = zserio_context.start_index_texture_coords_additional.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        else:
            self._start_index_texture_coords_additional_ = None

        self._render_groups_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_groups(self)), zserio_reader, is_auto=True)
        # check constraint
        if not (len(self._render_groups_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field Mesh3DRenderData.renderGroups!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._mesh3d_render_configuration_.header is not (self._header_):
            raise zserio.PythonRuntimeException("Wrong parameter header for field Mesh3DRenderData.mesh3DRenderConfiguration: "
                                                f"{self._mesh3d_render_configuration_.header} != {self._header_}!")
        self._mesh3d_render_configuration_.write(zserio_writer)

        if self.is_start_index_normals_used():
            zserio_writer.write_varsize(self._start_index_normals_)

        if self.is_start_index_colors_used():
            zserio_writer.write_varsize(self._start_index_colors_)

        if self.is_start_index_texture_coords_used():
            zserio_writer.write_varsize(self._start_index_texture_coords_)

        if self.is_start_index_texture_coords_additional_used():
            zserio_writer.write_varsize(self._start_index_texture_coords_additional_)

        # check constraint
        if not (len(self._render_groups_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field Mesh3DRenderData.renderGroups!")
        self._render_groups_.write(zserio_writer)

    def write_packed(self, zserio_context: Mesh3DRenderData.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._mesh3d_render_configuration_.header is not (self._header_):
            raise zserio.PythonRuntimeException("Wrong parameter header for field Mesh3DRenderData.mesh3DRenderConfiguration: "
                                                f"{self._mesh3d_render_configuration_.header} != {self._header_}!")
        self._mesh3d_render_configuration_.write_packed(zserio_context.mesh3d_render_configuration, zserio_writer)

        if self.is_start_index_normals_used():
            zserio_context.start_index_normals.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._start_index_normals_)

        if self.is_start_index_colors_used():
            zserio_context.start_index_colors.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._start_index_colors_)

        if self.is_start_index_texture_coords_used():
            zserio_context.start_index_texture_coords.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._start_index_texture_coords_)

        if self.is_start_index_texture_coords_additional_used():
            zserio_context.start_index_texture_coords_additional.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._start_index_texture_coords_additional_)

        # check constraint
        if not (len(self._render_groups_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field Mesh3DRenderData.renderGroups!")
        self._render_groups_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._mesh3d_render_configuration_ = nds.display.types.mesh3d_render_configuration.Mesh3DRenderConfiguration.ZserioPackingContext()
            self._start_index_normals_ = zserio.array.DeltaContext()
            self._start_index_colors_ = zserio.array.DeltaContext()
            self._start_index_texture_coords_ = zserio.array.DeltaContext()
            self._start_index_texture_coords_additional_ = zserio.array.DeltaContext()

        @property
        def mesh3d_render_configuration(self):
            return self._mesh3d_render_configuration_

        @property
        def start_index_normals(self):
            return self._start_index_normals_

        @property
        def start_index_colors(self):
            return self._start_index_colors_

        @property
        def start_index_texture_coords(self):
            return self._start_index_texture_coords_

        @property
        def start_index_texture_coords_additional(self):
            return self._start_index_texture_coords_additional_

    class _ZserioElementFactory_render_groups:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.render_group.RenderGroup:
            del zserio_index
            return nds.display.types.render_group.RenderGroup.from_reader(zserio_reader, self._owner._mesh_, self._owner._mesh3d_render_configuration_)

        @staticmethod
        def create_packing_context() -> nds.display.types.render_group.RenderGroup.ZserioPackingContext:
            return nds.display.types.render_group.RenderGroup.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.display.types.render_group.RenderGroup.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.render_group.RenderGroup:
            del zserio_index
            return nds.display.types.render_group.RenderGroup.from_reader_packed(zserio_context, zserio_reader, self._owner._mesh_, self._owner._mesh3d_render_configuration_)