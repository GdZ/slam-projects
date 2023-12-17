# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.packaging.packaging_details
import nds.smart.types.data_layer_id
import nds.smart.types.data_layer_lifetime

class SmartLayerHeader:
    def __init__(
            self,
            num_data_layers_: int = int(),
            available_layers_: typing.List[nds.smart.types.data_layer_id.DataLayerId] = None,
            layer_lifetime_: typing.List[nds.smart.types.data_layer_lifetime.DataLayerLifetime] = None,
            packaging_details_: typing.List[nds.core.packaging.packaging_details.PackagingDetails] = None) -> None:
        self._num_data_layers_ = num_data_layers_
        self._available_layers_ = zserio.array.Array(zserio.array.VarUInt16ArrayTraits(), available_layers_)
        self._layer_lifetime_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layer_lifetime()), layer_lifetime_)
        self._packaging_details_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_packaging_details()), packaging_details_)

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerHeader'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerHeader':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SmartLayerHeader'],
            zserio_context: SmartLayerHeader.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerHeader':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerHeader):
            return ((self._num_data_layers_ == other._num_data_layers_) and
                    (self._available_layers_ == other._available_layers_) and
                    (self._layer_lifetime_ == other._layer_lifetime_) and
                    (self._packaging_details_ == other._packaging_details_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_data_layers_)
        result = zserio.hashcode.calc_hashcode_object(result, self._available_layers_)
        result = zserio.hashcode.calc_hashcode_object(result, self._layer_lifetime_)
        result = zserio.hashcode.calc_hashcode_object(result, self._packaging_details_)

        return result

    @property
    def num_data_layers(self) -> int:
        return self._num_data_layers_

    @num_data_layers.setter
    def num_data_layers(self, num_data_layers_: int) -> None:
        self._num_data_layers_ = num_data_layers_

    @property
    def available_layers(self) -> typing.List[nds.smart.types.data_layer_id.DataLayerId]:
        return self._available_layers_.raw_array

    @available_layers.setter
    def available_layers(self, available_layers_: typing.List[nds.smart.types.data_layer_id.DataLayerId]) -> None:
        self._available_layers_ = zserio.array.Array(zserio.array.VarUInt16ArrayTraits(), available_layers_)

    @property
    def layer_lifetime(self) -> typing.List[nds.smart.types.data_layer_lifetime.DataLayerLifetime]:
        return self._layer_lifetime_.raw_array

    @layer_lifetime.setter
    def layer_lifetime(self, layer_lifetime_: typing.List[nds.smart.types.data_layer_lifetime.DataLayerLifetime]) -> None:
        self._layer_lifetime_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layer_lifetime()), layer_lifetime_)

    @property
    def packaging_details(self) -> typing.List[nds.core.packaging.packaging_details.PackagingDetails]:
        return self._packaging_details_.raw_array

    @packaging_details.setter
    def packaging_details(self, packaging_details_: typing.List[nds.core.packaging.packaging_details.PackagingDetails]) -> None:
        self._packaging_details_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_packaging_details()), packaging_details_)

    def init_packing_context(self, zserio_context: SmartLayerHeader.ZserioPackingContext) -> None:
        zserio_context.num_data_layers.init(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_data_layers_)
        end_bitposition += self._available_layers_.bitsizeof(end_bitposition)
        end_bitposition += self._layer_lifetime_.bitsizeof(end_bitposition)
        end_bitposition += self._packaging_details_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SmartLayerHeader.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_data_layers.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)
        end_bitposition += self._available_layers_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._layer_lifetime_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._packaging_details_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_data_layers_)
        end_bitposition = self._available_layers_.initialize_offsets(end_bitposition)
        end_bitposition = self._layer_lifetime_.initialize_offsets(end_bitposition)
        end_bitposition = self._packaging_details_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SmartLayerHeader.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_data_layers.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_data_layers_)
        end_bitposition = self._available_layers_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._layer_lifetime_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._packaging_details_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_data_layers_ = zserio_reader.read_varuint16()
        self._available_layers_ = zserio.array.Array.from_reader(zserio.array.VarUInt16ArrayTraits(), zserio_reader, self._num_data_layers_)
        self._layer_lifetime_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layer_lifetime()), zserio_reader, self._num_data_layers_)
        self._packaging_details_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_packaging_details()), zserio_reader, self._num_data_layers_)

    def read_packed(self, zserio_context: SmartLayerHeader.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_data_layers_ = zserio_context.num_data_layers.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._available_layers_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt16ArrayTraits(), zserio_reader, self._num_data_layers_)

        self._layer_lifetime_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_layer_lifetime()), zserio_reader, self._num_data_layers_)

        self._packaging_details_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_packaging_details()), zserio_reader, self._num_data_layers_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._num_data_layers_)

        # check array length
        if len(self._available_layers_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerHeader.availableLayers: "
                                                f"{len(self._available_layers_)} != {self._num_data_layers_}!")
        self._available_layers_.write(zserio_writer)

        # check array length
        if len(self._layer_lifetime_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerHeader.layerLifetime: "
                                                f"{len(self._layer_lifetime_)} != {self._num_data_layers_}!")
        self._layer_lifetime_.write(zserio_writer)

        # check array length
        if len(self._packaging_details_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerHeader.packagingDetails: "
                                                f"{len(self._packaging_details_)} != {self._num_data_layers_}!")
        self._packaging_details_.write(zserio_writer)

    def write_packed(self, zserio_context: SmartLayerHeader.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_data_layers.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_data_layers_)

        # check array length
        if len(self._available_layers_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerHeader.availableLayers: "
                                                f"{len(self._available_layers_)} != {self._num_data_layers_}!")
        self._available_layers_.write_packed(zserio_writer)

        # check array length
        if len(self._layer_lifetime_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerHeader.layerLifetime: "
                                                f"{len(self._layer_lifetime_)} != {self._num_data_layers_}!")
        self._layer_lifetime_.write_packed(zserio_writer)

        # check array length
        if len(self._packaging_details_) != (self._num_data_layers_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerHeader.packagingDetails: "
                                                f"{len(self._packaging_details_)} != {self._num_data_layers_}!")
        self._packaging_details_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_data_layers_ = zserio.array.DeltaContext()

        @property
        def num_data_layers(self):
            return self._num_data_layers_

    class _ZserioElementFactory_layer_lifetime:
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

    class _ZserioElementFactory_packaging_details:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.packaging.packaging_details.PackagingDetails:
            del zserio_index
            return nds.core.packaging.packaging_details.PackagingDetails.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.packaging.packaging_details.PackagingDetails.ZserioPackingContext:
            return nds.core.packaging.packaging_details.PackagingDetails.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.packaging.packaging_details.PackagingDetails.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.packaging.packaging_details.PackagingDetails:
            del zserio_index
            return nds.core.packaging.packaging_details.PackagingDetails.from_reader_packed(zserio_context, zserio_reader)