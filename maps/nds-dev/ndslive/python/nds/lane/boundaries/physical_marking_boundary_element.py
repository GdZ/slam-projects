# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.boundaries.boundary_width
import nds.lane.types.physical_boundary_material
import nds.lane.types.physical_marking_boundary_type

class PhysicalMarkingBoundaryElement:
    def __init__(
            self,
            type_: typing.Union[nds.lane.types.physical_marking_boundary_type.PhysicalMarkingBoundaryType, None] = None,
            material_: typing.Union[nds.lane.types.physical_boundary_material.PhysicalBoundaryMaterial, None] = None,
            width_: nds.lane.boundaries.boundary_width.BoundaryWidth = nds.lane.boundaries.boundary_width.BoundaryWidth()) -> None:
        self._type_ = type_
        self._material_ = material_
        self._width_ = width_

    @classmethod
    def from_reader(
            cls: typing.Type['PhysicalMarkingBoundaryElement'],
            zserio_reader: zserio.BitStreamReader) -> 'PhysicalMarkingBoundaryElement':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PhysicalMarkingBoundaryElement'],
            zserio_context: PhysicalMarkingBoundaryElement.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'PhysicalMarkingBoundaryElement':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PhysicalMarkingBoundaryElement):
            return ((self._type_ == other._type_) and
                    (self._material_ == other._material_) and
                    (self._width_ == other._width_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._material_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._width_)

        return result

    @property
    def type(self) -> typing.Union[nds.lane.types.physical_marking_boundary_type.PhysicalMarkingBoundaryType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.lane.types.physical_marking_boundary_type.PhysicalMarkingBoundaryType, None]) -> None:
        self._type_ = type_

    @property
    def material(self) -> typing.Union[nds.lane.types.physical_boundary_material.PhysicalBoundaryMaterial, None]:
        return self._material_

    @material.setter
    def material(self, material_: typing.Union[nds.lane.types.physical_boundary_material.PhysicalBoundaryMaterial, None]) -> None:
        self._material_ = material_

    @property
    def width(self) -> nds.lane.boundaries.boundary_width.BoundaryWidth:
        return self._width_

    @width.setter
    def width(self, width_: nds.lane.boundaries.boundary_width.BoundaryWidth) -> None:
        self._width_ = width_

    def init_packing_context(self, zserio_context: PhysicalMarkingBoundaryElement.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        self._material_.init_packing_context(zserio_context.material)
        zserio_context.width.init(zserio.array.VarUInt32ArrayTraits(), self._width_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        end_bitposition += self._material_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._width_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PhysicalMarkingBoundaryElement.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        end_bitposition += self._material_.bitsizeof_packed(zserio_context.material, end_bitposition)
        end_bitposition += zserio_context.width.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._width_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        end_bitposition = self._material_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._width_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PhysicalMarkingBoundaryElement.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        end_bitposition = self._material_.initialize_offsets_packed(zserio_context.material, end_bitposition)
        end_bitposition += zserio_context.width.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._width_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.lane.types.physical_marking_boundary_type.PhysicalMarkingBoundaryType.from_reader(zserio_reader)
        self._material_ = nds.lane.types.physical_boundary_material.PhysicalBoundaryMaterial.from_reader(zserio_reader)
        self._width_ = zserio_reader.read_varuint32()

    def read_packed(self, zserio_context: PhysicalMarkingBoundaryElement.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.lane.types.physical_marking_boundary_type.PhysicalMarkingBoundaryType.from_reader_packed(zserio_context.type, zserio_reader)

        self._material_ = nds.lane.types.physical_boundary_material.PhysicalBoundaryMaterial.from_reader_packed(zserio_context.material, zserio_reader)

        self._width_ = zserio_context.width.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write(zserio_writer)
        self._material_.write(zserio_writer)
        zserio_writer.write_varuint32(self._width_)

    def write_packed(self, zserio_context: PhysicalMarkingBoundaryElement.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write_packed(zserio_context.type, zserio_writer)

        self._material_.write_packed(zserio_context.material, zserio_writer)

        zserio_context.width.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._width_)

    class ZserioPackingContext:
        def __init__(self):
            self._type_ = zserio.array.DeltaContext()
            self._material_ = zserio.array.DeltaContext()
            self._width_ = zserio.array.DeltaContext()

        @property
        def type(self):
            return self._type_

        @property
        def material(self):
            return self._material_

        @property
        def width(self):
            return self._width_