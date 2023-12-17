# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.tile_id
import nds.smart.types.data_layer_id
import nds.smart.types.data_layer_lifetime

class SmartLayerTileVersionRequest:
    def __init__(
            self,
            id_: typing.Union[nds.core.types.tile_id.TileId, None] = None,
            num_data_layers_: int = int(),
            layer_ids_: typing.List[nds.smart.types.data_layer_id.DataLayerId] = None,
            lifetime_info_: typing.List[nds.smart.types.data_layer_lifetime.DataLayerLifetime] = None) -> None:
        self._id_ = id_
        self._num_data_layers_ = num_data_layers_
        self._layer_ids_ = zserio.array.Array(zserio.array.VarUInt16ArrayTraits(), layer_ids_)
        self._lifetime_info_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lifetime_info()), lifetime_info_)

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerTileVersionRequest'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerTileVersionRequest':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SmartLayerTileVersionRequest'],
            zserio_context: SmartLayerTileVersionRequest.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerTileVersionRequest':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerTileVersionRequest):
            return ((self._id_ == other._id_) and
                    (self._num_data_layers_ == other._num_data_layers_) and
                    (self._layer_ids_ == other._layer_ids_) and
                    (self._lifetime_info_ == other._lifetime_info_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._id_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_data_layers_)
        result = zserio.hashcode.calc_hashcode_object(result, self._layer_ids_)
        result = zserio.hashcode.calc_hashcode_object(result, self._lifetime_info_)

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
    def layer_ids(self) -> typing.List[nds.smart.types.data_layer_id.DataLayerId]:
        return self._layer_ids_.raw_array

    @layer_ids.setter
    def layer_ids(self, layer_ids_: typing.List[nds.smart.types.data_layer_id.DataLayerId]) -> None:
        self._layer_ids_ = zserio.array.Array(zserio.array.VarUInt16ArrayTraits(), layer_ids_)

    @property
    def lifetime_info(self) -> typing.List[nds.smart.types.data_layer_lifetime.DataLayerLifetime]:
        return self._lifetime_info_.raw_array

    @lifetime_info.setter
    def lifetime_info(self, lifetime_info_: typing.List[nds.smart.types.data_layer_lifetime.DataLayerLifetime]) -> None:
        self._lifetime_info_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lifetime_info()), lifetime_info_)

    def init_packing_context(self, zserio_context: SmartLayerTileVersionRequest.ZserioPackingContext) -> None:
        self._id_.init_packing_context(zserio_context.id)
        zserio_context.num_data_layers.init(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_data_layers_)
        end_bitposition += self._layer_ids_.bitsizeof(end_bitposition)
        end_bitposition += self._lifetime_info_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SmartLayerTileVersionRequest.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._id_.bitsizeof_packed(zserio_context.id, end_bitposition)
        end_bitposition += zserio_context.num_data_layers.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)
        end_bitposition += self._layer_ids_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._lifetime_info_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_data_layers_)
        end_bitposition = self._layer_ids_.initialize_offsets(end_bitposition)
        end_bitposition = self._lifetime_info_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SmartLayerTileVersionRequest.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._id_.initialize_offsets_packed(zserio_context.id, end_bitposition)
        end_bitposition += zserio_context.num_data_layers.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)
        end_bitposition = self._layer_ids_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._lifetime_info_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.core.types.tile_id.TileId.from_reader(zserio_reader)
        self._num_data_layers_ = zserio_reader.read_varuint16()
        self._layer_ids_ = zserio.array.Array.from_reader(zserio.array.VarUInt16ArrayTraits(), zserio_reader, self._num_data_layers_)
        self._lifetime_info_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lifetime_info()), zserio_reader, self._num_data_layers_)

    def read_packed(self, zserio_context: SmartLayerTileVersionRequest.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = nds.core.types.tile_id.TileId.from_reader_packed(zserio_context.id, zserio_reader)

        self._num_data_layers_ = zserio_context.num_data_layers.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._layer_ids_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt16ArrayTraits(), zserio_reader, self._num_data_layers_)

        self._lifetime_info_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lifetime_info()), zserio_reader, self._num_data_layers_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write(zserio_writer)

        zserio_writer.write_varuint16(self._num_data_layers_)

        # check array length
        if len(self._layer_ids_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerTileVersionRequest.layerIds: "
                                                f"{len(self._layer_ids_)} != {self._num_data_layers_}!")
        self._layer_ids_.write(zserio_writer)

        # check array length
        if len(self._lifetime_info_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerTileVersionRequest.lifetimeInfo: "
                                                f"{len(self._lifetime_info_)} != {self._num_data_layers_}!")
        self._lifetime_info_.write(zserio_writer)

    def write_packed(self, zserio_context: SmartLayerTileVersionRequest.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._id_.write_packed(zserio_context.id, zserio_writer)

        zserio_context.num_data_layers.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_data_layers_)

        # check array length
        if len(self._layer_ids_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerTileVersionRequest.layerIds: "
                                                f"{len(self._layer_ids_)} != {self._num_data_layers_}!")
        self._layer_ids_.write_packed(zserio_writer)

        # check array length
        if len(self._lifetime_info_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerTileVersionRequest.lifetimeInfo: "
                                                f"{len(self._lifetime_info_)} != {self._num_data_layers_}!")
        self._lifetime_info_.write_packed(zserio_writer)

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

    class _ZserioElementFactory_lifetime_info:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.types.data_layer_lifetime.DataLayerLifetime:
            del zserio_index
            return nds.smart.types.data_layer_lifetime.DataLayerLifetime.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.smart.types.data_layer_lifetime.DataLayerLifetime.ZserioPackingContext:
            return nds.smart.types.data_layer_lifetime.DataLayerLifetime.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.smart.types.data_layer_lifetime.DataLayerLifetime.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.types.data_layer_lifetime.DataLayerLifetime:
            del zserio_index
            return nds.smart.types.data_layer_lifetime.DataLayerLifetime.from_reader_packed(zserio_context, zserio_reader)
