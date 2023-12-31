# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.tile_id
import nds.smart.types.data_layer

class MultiDataLayerTileResponse:
    def __init__(
            self,
            id_: typing.Union[nds.core.types.tile_id.TileId, None] = None,
            num_data_layers_: int = int(),
            layers_: typing.List[nds.smart.types.data_layer.DataLayer] = None) -> None:
        self._id_ = id_
        self._num_data_layers_ = num_data_layers_
        self._layers_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layers()), layers_)

    @classmethod
    def from_reader(
            cls: typing.Type['MultiDataLayerTileResponse'],
            zserio_reader: zserio.BitStreamReader) -> 'MultiDataLayerTileResponse':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['MultiDataLayerTileResponse'],
            zserio_context: MultiDataLayerTileResponse.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'MultiDataLayerTileResponse':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, MultiDataLayerTileResponse):
            return ((self._id_ == other._id_) and
                    (self._num_data_layers_ == other._num_data_layers_) and
                    (self._layers_ == other._layers_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._id_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_data_layers_)
        result = zserio.hashcode.calc_hashcode_object(result, self._layers_)

        return result

    @property
    def id(self) -> typing.Union[nds.core.types.tile_id.TileId, None]:
        return self._id_

    @id.setter
    def id(self, id_: typing.Union[nds.core.types.tile_id.TileId, None]) -> None:
        self._id_ = id_

    @property
    def num_data_layers(self) -> int:
        return self._num_data_layers_

    @num_data_layers.setter
    def num_data_layers(self, num_data_layers_: int) -> None:
        self._num_data_layers_ = num_data_layers_

    @property
    def layers(self) -> typing.List[nds.smart.types.data_layer.DataLayer]:
        return self._layers_.raw_array

    @layers.setter
    def layers(self, layers_: typing.List[nds.smart.types.data_layer.DataLayer]) -> None:
        self._layers_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layers()), layers_)

    def init_packing_context(self, zserio_context: MultiDataLayerTileResponse.ZserioPackingContext) -> None:
        self._id_.init_packing_context(zserio_context.id)
        zserio_context.num_data_layers.init(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_data_layers_)
        end_bitposition += self._layers_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: MultiDataLayerTileResponse.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof_packed(zserio_context.id, end_bitposition)
        end_bitposition += zserio_context.num_data_layers.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)
        end_bitposition += self._layers_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_data_layers_)
        end_bitposition = self._layers_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: MultiDataLayerTileResponse.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets_packed(zserio_context.id, end_bitposition)
        end_bitposition += zserio_context.num_data_layers.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)
        end_bitposition = self._layers_.initialize_offsets(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.core.types.tile_id.TileId.from_reader(zserio_reader)
        self._num_data_layers_ = zserio_reader.read_varuint16()
        self._layers_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layers()), zserio_reader, self._num_data_layers_)

    def read_packed(self, zserio_context: MultiDataLayerTileResponse.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.core.types.tile_id.TileId.from_reader_packed(zserio_context.id, zserio_reader)

        self._num_data_layers_ = zserio_context.num_data_layers.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._layers_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layers()), zserio_reader, self._num_data_layers_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write(zserio_writer)

        zserio_writer.write_varuint16(self._num_data_layers_)

        # check array length
        if len(self._layers_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field MultiDataLayerTileResponse.layers: "
                                                f"{len(self._layers_)} != {self._num_data_layers_}!")
        self._layers_.write(zserio_writer)

    def write_packed(self, zserio_context: MultiDataLayerTileResponse.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write_packed(zserio_context.id, zserio_writer)

        zserio_context.num_data_layers.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_data_layers_)

        # check array length
        if len(self._layers_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field MultiDataLayerTileResponse.layers: "
                                                f"{len(self._layers_)} != {self._num_data_layers_}!")
        self._layers_.write(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = nds.core.types.tile_id.TileId.ZserioPackingContext()
            self._num_data_layers_ = zserio.array.DeltaContext()

        @property
        def id(self):
            return self._id_

        @property
        def num_data_layers(self):
            return self._num_data_layers_

    class _ZserioElementFactory_layers:
        IS_OBJECT_PACKABLE = False

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.types.data_layer.DataLayer:
            del zserio_index
            return nds.smart.types.data_layer.DataLayer.from_reader(zserio_reader)
