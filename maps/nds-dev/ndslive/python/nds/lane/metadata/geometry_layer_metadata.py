# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.metadata.geometry_layer_type

class GeometryLayerMetadata:
    def __init__(
            self,
            layer_type_: typing.Union[nds.lane.metadata.geometry_layer_type.GeometryLayerType, None] = None) -> None:
        self._layer_type_ = layer_type_

    @classmethod
    def from_reader(
            cls: typing.Type['GeometryLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'GeometryLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['GeometryLayerMetadata'],
            zserio_context: GeometryLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'GeometryLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, GeometryLayerMetadata):
            return (self._layer_type_ == other._layer_type_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._layer_type_)

        return result

    @property
    def layer_type(self) -> typing.Union[nds.lane.metadata.geometry_layer_type.GeometryLayerType, None]:
        return self._layer_type_

    @layer_type.setter
    def layer_type(self, layer_type_: typing.Union[nds.lane.metadata.geometry_layer_type.GeometryLayerType, None]) -> None:
        self._layer_type_ = layer_type_

    def init_packing_context(self, zserio_context: GeometryLayerMetadata.ZserioPackingContext) -> None:
        self._layer_type_.init_packing_context(zserio_context.layer_type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._layer_type_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: GeometryLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._layer_type_.bitsizeof_packed(zserio_context.layer_type, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._layer_type_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: GeometryLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._layer_type_.initialize_offsets_packed(zserio_context.layer_type, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._layer_type_ = nds.lane.metadata.geometry_layer_type.GeometryLayerType.from_reader(zserio_reader)

    def read_packed(self, zserio_context: GeometryLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._layer_type_ = nds.lane.metadata.geometry_layer_type.GeometryLayerType.from_reader_packed(zserio_context.layer_type, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._layer_type_.write(zserio_writer)

    def write_packed(self, zserio_context: GeometryLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._layer_type_.write_packed(zserio_context.layer_type, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._layer_type_ = zserio.array.DeltaContext()

        @property
        def layer_type(self):
            return self._layer_type_