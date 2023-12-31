# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.smart.types.data_layer_lifetime_info
import nds.smart.types.data_layer_lifetime_type

class DataLayerLifetime:
    def __init__(
            self,
            lifetime_: typing.Union[nds.smart.types.data_layer_lifetime_type.DataLayerLifetimeType, None] = None,
            layer_lifetime_info_: typing.Union[nds.smart.types.data_layer_lifetime_info.DataLayerLifetimeInfo, None] = None) -> None:
        self._lifetime_ = lifetime_
        self._layer_lifetime_info_ = layer_lifetime_info_

    @classmethod
    def from_reader(
            cls: typing.Type['DataLayerLifetime'],
            zserio_reader: zserio.BitStreamReader) -> 'DataLayerLifetime':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DataLayerLifetime'],
            zserio_context: DataLayerLifetime.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DataLayerLifetime':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DataLayerLifetime):
            return ((self._lifetime_ == other._lifetime_) and
                    (self._layer_lifetime_info_ == other._layer_lifetime_info_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._lifetime_)
        result = zserio.hashcode.calc_hashcode_object(result, self._layer_lifetime_info_)

        return result

    @property
    def lifetime(self) -> typing.Union[nds.smart.types.data_layer_lifetime_type.DataLayerLifetimeType, None]:
        return self._lifetime_

    @lifetime.setter
    def lifetime(self, lifetime_: typing.Union[nds.smart.types.data_layer_lifetime_type.DataLayerLifetimeType, None]) -> None:
        self._lifetime_ = lifetime_

    @property
    def layer_lifetime_info(self) -> typing.Union[nds.smart.types.data_layer_lifetime_info.DataLayerLifetimeInfo, None]:
        return self._layer_lifetime_info_

    @layer_lifetime_info.setter
    def layer_lifetime_info(self, layer_lifetime_info_: typing.Union[nds.smart.types.data_layer_lifetime_info.DataLayerLifetimeInfo, None]) -> None:
        self._layer_lifetime_info_ = layer_lifetime_info_

    def init_packing_context(self, zserio_context: DataLayerLifetime.ZserioPackingContext) -> None:
        self._lifetime_.init_packing_context(zserio_context.lifetime)
        self._layer_lifetime_info_.init_packing_context(zserio_context.layer_lifetime_info)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._lifetime_.bitsizeof(end_bitposition)
        end_bitposition += self._layer_lifetime_info_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DataLayerLifetime.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._lifetime_.bitsizeof_packed(zserio_context.lifetime, end_bitposition)
        end_bitposition += self._layer_lifetime_info_.bitsizeof_packed(zserio_context.layer_lifetime_info, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._lifetime_.initialize_offsets(end_bitposition)
        end_bitposition = self._layer_lifetime_info_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DataLayerLifetime.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._lifetime_.initialize_offsets_packed(zserio_context.lifetime, end_bitposition)
        end_bitposition = self._layer_lifetime_info_.initialize_offsets_packed(zserio_context.layer_lifetime_info, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._lifetime_ = nds.smart.types.data_layer_lifetime_type.DataLayerLifetimeType.from_reader(zserio_reader)
        self._layer_lifetime_info_ = nds.smart.types.data_layer_lifetime_info.DataLayerLifetimeInfo.from_reader(zserio_reader, self._lifetime_)

    def read_packed(self, zserio_context: DataLayerLifetime.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._lifetime_ = nds.smart.types.data_layer_lifetime_type.DataLayerLifetimeType.from_reader_packed(zserio_context.lifetime, zserio_reader)

        self._layer_lifetime_info_ = nds.smart.types.data_layer_lifetime_info.DataLayerLifetimeInfo.from_reader_packed(zserio_context.layer_lifetime_info, zserio_reader, self._lifetime_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._lifetime_.write(zserio_writer)

        # check parameters
        if self._layer_lifetime_info_.lifetime is not (self._lifetime_):
            raise zserio.PythonRuntimeException("Wrong parameter lifetime for field DataLayerLifetime.layerLifetimeInfo: "
                                                f"{self._layer_lifetime_info_.lifetime} != {self._lifetime_}!")
        self._layer_lifetime_info_.write(zserio_writer)

    def write_packed(self, zserio_context: DataLayerLifetime.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._lifetime_.write_packed(zserio_context.lifetime, zserio_writer)

        # check parameters
        if self._layer_lifetime_info_.lifetime is not (self._lifetime_):
            raise zserio.PythonRuntimeException("Wrong parameter lifetime for field DataLayerLifetime.layerLifetimeInfo: "
                                                f"{self._layer_lifetime_info_.lifetime} != {self._lifetime_}!")
        self._layer_lifetime_info_.write_packed(zserio_context.layer_lifetime_info, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._lifetime_ = zserio.array.DeltaContext()
            self._layer_lifetime_info_ = nds.smart.types.data_layer_lifetime_info.DataLayerLifetimeInfo.ZserioPackingContext()

        @property
        def lifetime(self):
            return self._lifetime_

        @property
        def layer_lifetime_info(self):
            return self._layer_lifetime_info_
