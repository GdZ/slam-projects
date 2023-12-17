# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.vehicle.metadata.horizon_service_capabilities

class HorizonServiceCapabilitiesResponse:
    def __init__(
            self,
            capabilities_: typing.Union[nds.vehicle.metadata.horizon_service_capabilities.HorizonServiceCapabilities, None] = None) -> None:
        self._capabilities_ = capabilities_

    @classmethod
    def from_reader(
            cls: typing.Type['HorizonServiceCapabilitiesResponse'],
            zserio_reader: zserio.BitStreamReader) -> 'HorizonServiceCapabilitiesResponse':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['HorizonServiceCapabilitiesResponse'],
            zserio_context: HorizonServiceCapabilitiesResponse.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'HorizonServiceCapabilitiesResponse':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, HorizonServiceCapabilitiesResponse):
            return (self._capabilities_ == other._capabilities_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._capabilities_)

        return result

    @property
    def capabilities(self) -> typing.Union[nds.vehicle.metadata.horizon_service_capabilities.HorizonServiceCapabilities, None]:
        return self._capabilities_

    @capabilities.setter
    def capabilities(self, capabilities_: typing.Union[nds.vehicle.metadata.horizon_service_capabilities.HorizonServiceCapabilities, None]) -> None:
        self._capabilities_ = capabilities_

    def init_packing_context(self, zserio_context: HorizonServiceCapabilitiesResponse.ZserioPackingContext) -> None:
        self._capabilities_.init_packing_context(zserio_context.capabilities)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._capabilities_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: HorizonServiceCapabilitiesResponse.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._capabilities_.bitsizeof_packed(zserio_context.capabilities, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._capabilities_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: HorizonServiceCapabilitiesResponse.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._capabilities_.initialize_offsets_packed(zserio_context.capabilities, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._capabilities_ = nds.vehicle.metadata.horizon_service_capabilities.HorizonServiceCapabilities.from_reader(zserio_reader)

    def read_packed(self, zserio_context: HorizonServiceCapabilitiesResponse.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._capabilities_ = nds.vehicle.metadata.horizon_service_capabilities.HorizonServiceCapabilities.from_reader_packed(zserio_context.capabilities, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._capabilities_.write(zserio_writer)

    def write_packed(self, zserio_context: HorizonServiceCapabilitiesResponse.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._capabilities_.write_packed(zserio_context.capabilities, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._capabilities_ = zserio.array.DeltaContext()

        @property
        def capabilities(self):
            return self._capabilities_