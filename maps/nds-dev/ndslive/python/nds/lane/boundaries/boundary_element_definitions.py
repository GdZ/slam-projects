# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.boundaries.boundary_element

class BoundaryElementDefinitions:
    def __init__(
            self,
            boundary_element_list_: typing.List[nds.lane.boundaries.boundary_element.BoundaryElement] = None) -> None:
        self._boundary_element_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_boundary_element_list()), boundary_element_list_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['BoundaryElementDefinitions'],
            zserio_reader: zserio.BitStreamReader) -> 'BoundaryElementDefinitions':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['BoundaryElementDefinitions'],
            zserio_context: BoundaryElementDefinitions.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'BoundaryElementDefinitions':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, BoundaryElementDefinitions):
            return (self._boundary_element_list_ == other._boundary_element_list_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._boundary_element_list_)

        return result

    @property
    def boundary_element_list(self) -> typing.List[nds.lane.boundaries.boundary_element.BoundaryElement]:
        return self._boundary_element_list_.raw_array

    @boundary_element_list.setter
    def boundary_element_list(self, boundary_element_list_: typing.List[nds.lane.boundaries.boundary_element.BoundaryElement]) -> None:
        self._boundary_element_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_boundary_element_list()), boundary_element_list_, is_auto=True)

    def init_packing_context(self, zserio_context: BoundaryElementDefinitions.ZserioPackingContext) -> None:
        del zserio_context

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._boundary_element_list_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: BoundaryElementDefinitions.ZserioPackingContext, bitposition: int = 0) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition += self._boundary_element_list_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._boundary_element_list_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: BoundaryElementDefinitions.ZserioPackingContext, bitposition: int) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition = self._boundary_element_list_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._boundary_element_list_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_boundary_element_list()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: BoundaryElementDefinitions.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        del zserio_context

        self._boundary_element_list_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_boundary_element_list()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._boundary_element_list_.write(zserio_writer)

    def write_packed(self, zserio_context: BoundaryElementDefinitions.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        del zserio_context

        self._boundary_element_list_.write_packed(zserio_writer)

    class ZserioPackingContext:
        pass

    class _ZserioElementFactory_boundary_element_list:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.boundaries.boundary_element.BoundaryElement:
            del zserio_index
            return nds.lane.boundaries.boundary_element.BoundaryElement.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.lane.boundaries.boundary_element.BoundaryElement.ZserioPackingContext:
            return nds.lane.boundaries.boundary_element.BoundaryElement.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.lane.boundaries.boundary_element.BoundaryElement.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.boundaries.boundary_element.BoundaryElement:
            del zserio_index
            return nds.lane.boundaries.boundary_element.BoundaryElement.from_reader_packed(zserio_context, zserio_reader)
