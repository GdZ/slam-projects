# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.display.types.display_area_type
import nds.display.types.render_surface_part

class RenderSurface:
    def __init__(
            self,
            num_index_bits_: int,
            area_type_: typing.Union[nds.display.types.display_area_type.DisplayAreaType, None] = None,
            render_surface_parts_: typing.List[nds.display.types.render_surface_part.RenderSurfacePart] = None) -> None:
        self._num_index_bits_ = num_index_bits_
        self._area_type_ = area_type_
        self._render_surface_parts_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_surface_parts(self)), render_surface_parts_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['RenderSurface'],
            zserio_reader: zserio.BitStreamReader,
            num_index_bits_: int) -> 'RenderSurface':
        self = object.__new__(cls)
        self._num_index_bits_ = num_index_bits_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RenderSurface'],
            zserio_context: RenderSurface.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            num_index_bits_: int) -> 'RenderSurface':
        self = object.__new__(cls)
        self._num_index_bits_ = num_index_bits_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RenderSurface):
            return (self._num_index_bits_ == other._num_index_bits_ and
                    (self._area_type_ == other._area_type_) and
                    (self._render_surface_parts_ == other._render_surface_parts_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_index_bits_)
        result = zserio.hashcode.calc_hashcode_object(result, self._area_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._render_surface_parts_)

        return result

    @property
    def num_index_bits(self) -> int:
        return self._num_index_bits_

    @property
    def area_type(self) -> typing.Union[nds.display.types.display_area_type.DisplayAreaType, None]:
        return self._area_type_

    @area_type.setter
    def area_type(self, area_type_: typing.Union[nds.display.types.display_area_type.DisplayAreaType, None]) -> None:
        self._area_type_ = area_type_

    @property
    def render_surface_parts(self) -> typing.List[nds.display.types.render_surface_part.RenderSurfacePart]:
        return self._render_surface_parts_.raw_array

    @render_surface_parts.setter
    def render_surface_parts(self, render_surface_parts_: typing.List[nds.display.types.render_surface_part.RenderSurfacePart]) -> None:
        self._render_surface_parts_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_surface_parts(self)), render_surface_parts_, is_auto=True)

    def init_packing_context(self, zserio_context: RenderSurface.ZserioPackingContext) -> None:
        self._area_type_.init_packing_context(zserio_context.area_type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._area_type_.bitsizeof(end_bitposition)
        end_bitposition += self._render_surface_parts_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RenderSurface.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._area_type_.bitsizeof_packed(zserio_context.area_type, end_bitposition)
        end_bitposition += self._render_surface_parts_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._area_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._render_surface_parts_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RenderSurface.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._area_type_.initialize_offsets_packed(zserio_context.area_type, end_bitposition)
        end_bitposition = self._render_surface_parts_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._area_type_ = nds.display.types.display_area_type.DisplayAreaType.from_reader(zserio_reader)

        self._render_surface_parts_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_surface_parts(self)), zserio_reader, is_auto=True)
        # check constraint
        if not (len(self._render_surface_parts_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field RenderSurface.renderSurfaceParts!")

    def read_packed(self, zserio_context: RenderSurface.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._area_type_ = nds.display.types.display_area_type.DisplayAreaType.from_reader_packed(zserio_context.area_type, zserio_reader)

        self._render_surface_parts_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_render_surface_parts(self)), zserio_reader, is_auto=True)
        # check constraint
        if not (len(self._render_surface_parts_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field RenderSurface.renderSurfaceParts!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._area_type_.write(zserio_writer)

        # check constraint
        if not (len(self._render_surface_parts_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field RenderSurface.renderSurfaceParts!")
        self._render_surface_parts_.write(zserio_writer)

    def write_packed(self, zserio_context: RenderSurface.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._area_type_.write_packed(zserio_context.area_type, zserio_writer)

        # check constraint
        if not (len(self._render_surface_parts_) > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field RenderSurface.renderSurfaceParts!")
        self._render_surface_parts_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._area_type_ = zserio.array.DeltaContext()

        @property
        def area_type(self):
            return self._area_type_

    class _ZserioElementFactory_render_surface_parts:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.render_surface_part.RenderSurfacePart:
            del zserio_index
            return nds.display.types.render_surface_part.RenderSurfacePart.from_reader(zserio_reader, self._owner._num_index_bits_)

        @staticmethod
        def create_packing_context() -> nds.display.types.render_surface_part.RenderSurfacePart.ZserioPackingContext:
            return nds.display.types.render_surface_part.RenderSurfacePart.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.display.types.render_surface_part.RenderSurfacePart.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.render_surface_part.RenderSurfacePart:
            del zserio_index
            return nds.display.types.render_surface_part.RenderSurfacePart.from_reader_packed(zserio_context, zserio_reader, self._owner._num_index_bits_)
