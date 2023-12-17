# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.smart.metadata.tile_service_capabilities

class TileServiceCapabilitiesResponse:
    def __init__(
            self,
            capabilities_: typing.Union[nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities, None] = None) -> None:
        self._capabilities_ = capabilities_

    @classmethod
    def from_reader(
            cls: typing.Type['TileServiceCapabilitiesResponse'],
            zserio_reader: zserio.BitStreamReader) -> 'TileServiceCapabilitiesResponse':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TileServiceCapabilitiesResponse'],
            zserio_context: TileServiceCapabilitiesResponse.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TileServiceCapabilitiesResponse':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TileServiceCapabilitiesResponse):
            return (self._capabilities_ == other._capabilities_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._capabilities_)

        return result

    @property
    def capabilities(self) -> typing.Union[nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities, None]:
        return self._capabilities_

    @capabilities.setter
    def capabilities(self, capabilities_: typing.Union[nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities, None]) -> None:
        self._capabilities_ = capabilities_

    def init_packing_context(self, zserio_context: TileServiceCapabilitiesResponse.ZserioPackingContext) -> None:
        self._capabilities_.init_packing_context(zserio_context.capabilities)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._capabilities_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TileServiceCapabilitiesResponse.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._capabilities_.bitsizeof_packed(zserio_context.capabilities, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._capabilities_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TileServiceCapabilitiesResponse.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._capabilities_.initialize_offsets_packed(zserio_context.capabilities, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._capabilities_ = nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities.from_reader(zserio_reader)

    def read_packed(self, zserio_context: TileServiceCapabilitiesResponse.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._capabilities_ = nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities.from_reader_packed(zserio_context.capabilities, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._capabilities_.write(zserio_writer)

    def write_packed(self, zserio_context: TileServiceCapabilitiesResponse.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._capabilities_.write_packed(zserio_context.capabilities, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._capabilities_ = zserio.array.DeltaContext()

        @property
        def capabilities(self):
            return self._capabilities_
