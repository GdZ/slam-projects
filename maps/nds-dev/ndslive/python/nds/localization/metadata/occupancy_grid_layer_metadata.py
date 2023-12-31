# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.grid.grid_cell_size

class OccupancyGridLayerMetadata:
    def __init__(
            self,
            cell_size_: nds.core.grid.grid_cell_size.GridCellSize = nds.core.grid.grid_cell_size.GridCellSize(),
            has_relations_: bool = bool()) -> None:
        self._cell_size_ = cell_size_
        self._has_relations_ = has_relations_

    @classmethod
    def from_reader(
            cls: typing.Type['OccupancyGridLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'OccupancyGridLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['OccupancyGridLayerMetadata'],
            zserio_context: OccupancyGridLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'OccupancyGridLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, OccupancyGridLayerMetadata):
            return ((self._cell_size_ == other._cell_size_) and
                    (self._has_relations_ == other._has_relations_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._cell_size_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_relations_)

        return result

    @property
    def cell_size(self) -> nds.core.grid.grid_cell_size.GridCellSize:
        return self._cell_size_

    @cell_size.setter
    def cell_size(self, cell_size_: nds.core.grid.grid_cell_size.GridCellSize) -> None:
        self._cell_size_ = cell_size_

    @property
    def has_relations(self) -> bool:
        return self._has_relations_

    @has_relations.setter
    def has_relations(self, has_relations_: bool) -> None:
        self._has_relations_ = has_relations_

    def init_packing_context(self, zserio_context: OccupancyGridLayerMetadata.ZserioPackingContext) -> None:
        zserio_context.cell_size.init(zserio.array.VarSizeArrayTraits(), self._cell_size_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._cell_size_)
        end_bitposition += 1

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: OccupancyGridLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.cell_size.bitsizeof(zserio.array.VarSizeArrayTraits(), self._cell_size_)
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._cell_size_)
        end_bitposition += 1

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: OccupancyGridLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.cell_size.bitsizeof(zserio.array.VarSizeArrayTraits(), self._cell_size_)
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._cell_size_ = zserio_reader.read_varsize()
        self._has_relations_ = zserio_reader.read_bool()

    def read_packed(self, zserio_context: OccupancyGridLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._cell_size_ = zserio_context.cell_size.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._has_relations_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._cell_size_)
        zserio_writer.write_bool(self._has_relations_)

    def write_packed(self, zserio_context: OccupancyGridLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.cell_size.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._cell_size_)

        zserio_writer.write_bool(self._has_relations_)

    class ZserioPackingContext:
        def __init__(self):
            self._cell_size_ = zserio.array.DeltaContext()

        @property
        def cell_size(self):
            return self._cell_size_
