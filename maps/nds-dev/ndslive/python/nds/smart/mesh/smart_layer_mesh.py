# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.smart.mesh.smart_mesh_id
import nds.smart.tile.smart_layer_tile

class SmartLayerMesh:
    def __init__(
            self,
            mesh_id_: typing.Union[nds.smart.mesh.smart_mesh_id.SmartMeshId, None] = None,
            num_tiles_: int = int(),
            tile_list_: typing.List[nds.smart.tile.smart_layer_tile.SmartLayerTile] = None) -> None:
        self._mesh_id_ = mesh_id_
        self._num_tiles_ = num_tiles_
        self._tile_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_tile_list()), tile_list_)

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerMesh'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerMesh':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SmartLayerMesh'],
            zserio_context: SmartLayerMesh.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerMesh':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerMesh):
            return ((self._mesh_id_ == other._mesh_id_) and
                    (self._num_tiles_ == other._num_tiles_) and
                    (self._tile_list_ == other._tile_list_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._mesh_id_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_tiles_)
        result = zserio.hashcode.calc_hashcode_object(result, self._tile_list_)

        return result

    @property
    def mesh_id(self) -> typing.Union[nds.smart.mesh.smart_mesh_id.SmartMeshId, None]:
        return self._mesh_id_

    @mesh_id.setter
    def mesh_id(self, mesh_id_: typing.Union[nds.smart.mesh.smart_mesh_id.SmartMeshId, None]) -> None:
        self._mesh_id_ = mesh_id_

    @property
    def num_tiles(self) -> int:
        return self._num_tiles_

    @num_tiles.setter
    def num_tiles(self, num_tiles_: int) -> None:
        self._num_tiles_ = num_tiles_

    @property
    def tile_list(self) -> typing.List[nds.smart.tile.smart_layer_tile.SmartLayerTile]:
        return self._tile_list_.raw_array

    @tile_list.setter
    def tile_list(self, tile_list_: typing.List[nds.smart.tile.smart_layer_tile.SmartLayerTile]) -> None:
        self._tile_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_tile_list()), tile_list_)

    def init_packing_context(self, zserio_context: SmartLayerMesh.ZserioPackingContext) -> None:
        self._mesh_id_.init_packing_context(zserio_context.mesh_id)
        zserio_context.num_tiles.init(zserio.array.BitFieldArrayTraits(16), self._num_tiles_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._mesh_id_.bitsizeof(end_bitposition)
        end_bitposition += 16
        end_bitposition += self._tile_list_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SmartLayerMesh.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._mesh_id_.bitsizeof_packed(zserio_context.mesh_id, end_bitposition)
        end_bitposition += zserio_context.num_tiles.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._num_tiles_)
        end_bitposition += self._tile_list_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._mesh_id_.initialize_offsets(end_bitposition)
        end_bitposition += 16
        end_bitposition = self._tile_list_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SmartLayerMesh.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._mesh_id_.initialize_offsets_packed(zserio_context.mesh_id, end_bitposition)
        end_bitposition += zserio_context.num_tiles.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._num_tiles_)
        end_bitposition = self._tile_list_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._mesh_id_ = nds.smart.mesh.smart_mesh_id.SmartMeshId.from_reader(zserio_reader)

        self._num_tiles_ = zserio_reader.read_bits(16)
        # check constraint
        if not (self._num_tiles_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field SmartLayerMesh.numTiles!")

        self._tile_list_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_tile_list()), zserio_reader, self._num_tiles_)

    def read_packed(self, zserio_context: SmartLayerMesh.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._mesh_id_ = nds.smart.mesh.smart_mesh_id.SmartMeshId.from_reader_packed(zserio_context.mesh_id, zserio_reader)

        self._num_tiles_ = zserio_context.num_tiles.read(zserio.array.BitFieldArrayTraits(16), zserio_reader)
        # check constraint
        if not (self._num_tiles_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field SmartLayerMesh.numTiles!")

        self._tile_list_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_tile_list()), zserio_reader, self._num_tiles_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._mesh_id_.write(zserio_writer)

        # check constraint
        if not (self._num_tiles_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field SmartLayerMesh.numTiles!")
        zserio_writer.write_bits(self._num_tiles_, 16)

        # check array length
        if len(self._tile_list_) != (self._num_tiles_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerMesh.tileList: "
                                                f"{len(self._tile_list_)} != {self._num_tiles_}!")
        self._tile_list_.write(zserio_writer)

    def write_packed(self, zserio_context: SmartLayerMesh.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._mesh_id_.write_packed(zserio_context.mesh_id, zserio_writer)

        # check constraint
        if not (self._num_tiles_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field SmartLayerMesh.numTiles!")
        zserio_context.num_tiles.write(zserio.array.BitFieldArrayTraits(16), zserio_writer, self._num_tiles_)

        # check array length
        if len(self._tile_list_) != (self._num_tiles_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerMesh.tileList: "
                                                f"{len(self._tile_list_)} != {self._num_tiles_}!")
        self._tile_list_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._mesh_id_ = nds.smart.mesh.smart_mesh_id.SmartMeshId.ZserioPackingContext()
            self._num_tiles_ = zserio.array.DeltaContext()

        @property
        def mesh_id(self):
            return self._mesh_id_

        @property
        def num_tiles(self):
            return self._num_tiles_

    class _ZserioElementFactory_tile_list:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.tile.smart_layer_tile.SmartLayerTile:
            del zserio_index
            return nds.smart.tile.smart_layer_tile.SmartLayerTile.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.smart.tile.smart_layer_tile.SmartLayerTile.ZserioPackingContext:
            return nds.smart.tile.smart_layer_tile.SmartLayerTile.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.smart.tile.smart_layer_tile.SmartLayerTile.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.tile.smart_layer_tile.SmartLayerTile:
            del zserio_index
            return nds.smart.tile.smart_layer_tile.SmartLayerTile.from_reader_packed(zserio_context, zserio_reader)
