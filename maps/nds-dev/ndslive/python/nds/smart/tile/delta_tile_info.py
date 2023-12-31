# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.tile_id
import nds.smart.tile.source_layer_info

class DeltaTileInfo:
    def __init__(
            self,
            tile_id_: typing.Union[nds.core.types.tile_id.TileId, None] = None,
            source_layer_info_: typing.Union[nds.smart.tile.source_layer_info.SourceLayerInfo, None] = None) -> None:
        self._tile_id_ = tile_id_
        self._source_layer_info_ = source_layer_info_

    @classmethod
    def from_reader(
            cls: typing.Type['DeltaTileInfo'],
            zserio_reader: zserio.BitStreamReader) -> 'DeltaTileInfo':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DeltaTileInfo'],
            zserio_context: DeltaTileInfo.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DeltaTileInfo':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DeltaTileInfo):
            return ((self._tile_id_ == other._tile_id_) and
                    (self._source_layer_info_ == other._source_layer_info_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._tile_id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._source_layer_info_)

        return result

    @property
    def tile_id(self) -> typing.Union[nds.core.types.tile_id.TileId, None]:
        return self._tile_id_

    @tile_id.setter
    def tile_id(self, tile_id_: typing.Union[nds.core.types.tile_id.TileId, None]) -> None:
        self._tile_id_ = tile_id_

    @property
    def source_layer_info(self) -> typing.Union[nds.smart.tile.source_layer_info.SourceLayerInfo, None]:
        return self._source_layer_info_

    @source_layer_info.setter
    def source_layer_info(self, source_layer_info_: typing.Union[nds.smart.tile.source_layer_info.SourceLayerInfo, None]) -> None:
        self._source_layer_info_ = source_layer_info_

    def init_packing_context(self, zserio_context: DeltaTileInfo.ZserioPackingContext) -> None:
        self._tile_id_.init_packing_context(zserio_context.tile_id)
        self._source_layer_info_.init_packing_context(zserio_context.source_layer_info)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._tile_id_.bitsizeof(end_bitposition)
        end_bitposition += self._source_layer_info_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DeltaTileInfo.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._tile_id_.bitsizeof_packed(zserio_context.tile_id, end_bitposition)
        end_bitposition += self._source_layer_info_.bitsizeof_packed(zserio_context.source_layer_info, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._tile_id_.initialize_offsets(end_bitposition)
        end_bitposition = self._source_layer_info_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DeltaTileInfo.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._tile_id_.initialize_offsets_packed(zserio_context.tile_id, end_bitposition)
        end_bitposition = self._source_layer_info_.initialize_offsets_packed(zserio_context.source_layer_info, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._tile_id_ = nds.core.types.tile_id.TileId.from_reader(zserio_reader)
        self._source_layer_info_ = nds.smart.tile.source_layer_info.SourceLayerInfo.from_reader(zserio_reader)

    def read_packed(self, zserio_context: DeltaTileInfo.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._tile_id_ = nds.core.types.tile_id.TileId.from_reader_packed(zserio_context.tile_id, zserio_reader)

        self._source_layer_info_ = nds.smart.tile.source_layer_info.SourceLayerInfo.from_reader_packed(zserio_context.source_layer_info, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._tile_id_.write(zserio_writer)
        self._source_layer_info_.write(zserio_writer)

    def write_packed(self, zserio_context: DeltaTileInfo.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._tile_id_.write_packed(zserio_context.tile_id, zserio_writer)

        self._source_layer_info_.write_packed(zserio_context.source_layer_info, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._tile_id_ = nds.core.types.tile_id.TileId.ZserioPackingContext()
            self._source_layer_info_ = nds.smart.tile.source_layer_info.SourceLayerInfo.ZserioPackingContext()

        @property
        def tile_id(self):
            return self._tile_id_

        @property
        def source_layer_info(self):
            return self._source_layer_info_
