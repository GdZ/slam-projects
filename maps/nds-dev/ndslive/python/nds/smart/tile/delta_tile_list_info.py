# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.packed_tile_id
import nds.smart.tile.source_layer_info

class DeltaTileListInfo:
    def __init__(
            self,
            num_tiles_: int = int(),
            tile_ids_: typing.List[nds.core.types.packed_tile_id.PackedTileId] = None,
            headers_: typing.List[nds.smart.tile.source_layer_info.SourceLayerInfo] = None) -> None:
        self._num_tiles_ = num_tiles_
        self._tile_ids_ = zserio.array.Array(zserio.array.SignedBitFieldArrayTraits(32), tile_ids_)
        self._headers_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_headers()), headers_)

    @classmethod
    def from_reader(
            cls: typing.Type['DeltaTileListInfo'],
            zserio_reader: zserio.BitStreamReader) -> 'DeltaTileListInfo':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DeltaTileListInfo'],
            zserio_context: DeltaTileListInfo.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DeltaTileListInfo':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DeltaTileListInfo):
            return ((self._num_tiles_ == other._num_tiles_) and
                    (self._tile_ids_ == other._tile_ids_) and
                    (self._headers_ == other._headers_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_tiles_)
        result = zserio.hashcode.calc_hashcode_object(result, self._tile_ids_)
        result = zserio.hashcode.calc_hashcode_object(result, self._headers_)

        return result

    @property
    def num_tiles(self) -> int:
        return self._num_tiles_

    @num_tiles.setter
    def num_tiles(self, num_tiles_: int) -> None:
        self._num_tiles_ = num_tiles_

    @property
    def tile_ids(self) -> typing.List[nds.core.types.packed_tile_id.PackedTileId]:
        return self._tile_ids_.raw_array

    @tile_ids.setter
    def tile_ids(self, tile_ids_: typing.List[nds.core.types.packed_tile_id.PackedTileId]) -> None:
        self._tile_ids_ = zserio.array.Array(zserio.array.SignedBitFieldArrayTraits(32), tile_ids_)

    @property
    def headers(self) -> typing.List[nds.smart.tile.source_layer_info.SourceLayerInfo]:
        return self._headers_.raw_array

    @headers.setter
    def headers(self, headers_: typing.List[nds.smart.tile.source_layer_info.SourceLayerInfo]) -> None:
        self._headers_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_headers()), headers_)

    def init_packing_context(self, zserio_context: DeltaTileListInfo.ZserioPackingContext) -> None:
        zserio_context.num_tiles.init(zserio.array.VarSizeArrayTraits(), self._num_tiles_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_tiles_)
        end_bitposition += self._tile_ids_.bitsizeof(end_bitposition)
        end_bitposition += self._headers_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DeltaTileListInfo.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_tiles.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_tiles_)
        end_bitposition += self._tile_ids_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._headers_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_tiles_)
        end_bitposition = self._tile_ids_.initialize_offsets(end_bitposition)
        end_bitposition = self._headers_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DeltaTileListInfo.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_tiles.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_tiles_)
        end_bitposition = self._tile_ids_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._headers_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_tiles_ = zserio_reader.read_varsize()
        self._tile_ids_ = zserio.array.Array.from_reader(zserio.array.SignedBitFieldArrayTraits(32), zserio_reader, self._num_tiles_)
        self._headers_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_headers()), zserio_reader, self._num_tiles_)

    def read_packed(self, zserio_context: DeltaTileListInfo.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_tiles_ = zserio_context.num_tiles.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._tile_ids_ = zserio.array.Array.from_reader_packed(zserio.array.SignedBitFieldArrayTraits(32), zserio_reader, self._num_tiles_)

        self._headers_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_headers()), zserio_reader, self._num_tiles_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_tiles_)

        # check array length
        if len(self._tile_ids_) != (self._num_tiles_):
            raise zserio.PythonRuntimeException("Wrong array length for field DeltaTileListInfo.tileIds: "
                                                f"{len(self._tile_ids_)} != {self._num_tiles_}!")
        self._tile_ids_.write(zserio_writer)

        # check array length
        if len(self._headers_) != (self._num_tiles_):
            raise zserio.PythonRuntimeException("Wrong array length for field DeltaTileListInfo.headers: "
                                                f"{len(self._headers_)} != {self._num_tiles_}!")
        self._headers_.write(zserio_writer)

    def write_packed(self, zserio_context: DeltaTileListInfo.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_tiles.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_tiles_)

        # check array length
        if len(self._tile_ids_) != (self._num_tiles_):
            raise zserio.PythonRuntimeException("Wrong array length for field DeltaTileListInfo.tileIds: "
                                                f"{len(self._tile_ids_)} != {self._num_tiles_}!")
        self._tile_ids_.write_packed(zserio_writer)

        # check array length
        if len(self._headers_) != (self._num_tiles_):
            raise zserio.PythonRuntimeException("Wrong array length for field DeltaTileListInfo.headers: "
                                                f"{len(self._headers_)} != {self._num_tiles_}!")
        self._headers_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_tiles_ = zserio.array.DeltaContext()

        @property
        def num_tiles(self):
            return self._num_tiles_

    class _ZserioElementFactory_headers:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.tile.source_layer_info.SourceLayerInfo:
            del zserio_index
            return nds.smart.tile.source_layer_info.SourceLayerInfo.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.smart.tile.source_layer_info.SourceLayerInfo.ZserioPackingContext:
            return nds.smart.tile.source_layer_info.SourceLayerInfo.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.smart.tile.source_layer_info.SourceLayerInfo.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.tile.source_layer_info.SourceLayerInfo:
            del zserio_index
            return nds.smart.tile.source_layer_info.SourceLayerInfo.from_reader_packed(zserio_context, zserio_reader)
