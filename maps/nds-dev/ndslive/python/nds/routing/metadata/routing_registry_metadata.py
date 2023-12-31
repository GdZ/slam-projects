# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.language.available_languages
import nds.routing.metadata.routing_service_capabilities
import nds.routing.metadata.routing_service_type

class RoutingRegistryMetadata:
    def __init__(
            self,
            routing_service_type_: typing.Union[nds.routing.metadata.routing_service_type.RoutingServiceType, None] = None,
            capabilities_: typing.Union[nds.routing.metadata.routing_service_capabilities.RoutingServiceCapabilities, None] = None,
            available_languages_: typing.Union[nds.core.language.available_languages.AvailableLanguages, None] = None) -> None:
        self._routing_service_type_ = routing_service_type_
        self._capabilities_ = capabilities_
        self._available_languages_ = available_languages_

    @classmethod
    def from_reader(
            cls: typing.Type['RoutingRegistryMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'RoutingRegistryMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoutingRegistryMetadata'],
            zserio_context: RoutingRegistryMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoutingRegistryMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoutingRegistryMetadata):
            return ((self._routing_service_type_ == other._routing_service_type_) and
                    (self._capabilities_ == other._capabilities_) and
                    (self._available_languages_ == other._available_languages_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._routing_service_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._capabilities_)
        result = zserio.hashcode.calc_hashcode_object(result, self._available_languages_)

        return result

    @property
    def routing_service_type(self) -> typing.Union[nds.routing.metadata.routing_service_type.RoutingServiceType, None]:
        return self._routing_service_type_

    @routing_service_type.setter
    def routing_service_type(self, routing_service_type_: typing.Union[nds.routing.metadata.routing_service_type.RoutingServiceType, None]) -> None:
        self._routing_service_type_ = routing_service_type_

    @property
    def capabilities(self) -> typing.Union[nds.routing.metadata.routing_service_capabilities.RoutingServiceCapabilities, None]:
        return self._capabilities_

    @capabilities.setter
    def capabilities(self, capabilities_: typing.Union[nds.routing.metadata.routing_service_capabilities.RoutingServiceCapabilities, None]) -> None:
        self._capabilities_ = capabilities_

    @property
    def available_languages(self) -> typing.Union[nds.core.language.available_languages.AvailableLanguages, None]:
        return self._available_languages_

    @available_languages.setter
    def available_languages(self, available_languages_: typing.Union[nds.core.language.available_languages.AvailableLanguages, None]) -> None:
        self._available_languages_ = available_languages_

    def init_packing_context(self, zserio_context: RoutingRegistryMetadata.ZserioPackingContext) -> None:
        self._routing_service_type_.init_packing_context(zserio_context.routing_service_type)
        self._capabilities_.init_packing_context(zserio_context.capabilities)
        self._available_languages_.init_packing_context(zserio_context.available_languages)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._routing_service_type_.bitsizeof(end_bitposition)
        end_bitposition += self._capabilities_.bitsizeof(end_bitposition)
        end_bitposition += self._available_languages_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoutingRegistryMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._routing_service_type_.bitsizeof_packed(zserio_context.routing_service_type, end_bitposition)
        end_bitposition += self._capabilities_.bitsizeof_packed(zserio_context.capabilities, end_bitposition)
        end_bitposition += self._available_languages_.bitsizeof_packed(zserio_context.available_languages, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._routing_service_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._capabilities_.initialize_offsets(end_bitposition)
        end_bitposition = self._available_languages_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoutingRegistryMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._routing_service_type_.initialize_offsets_packed(zserio_context.routing_service_type, end_bitposition)
        end_bitposition = self._capabilities_.initialize_offsets_packed(zserio_context.capabilities, end_bitposition)
        end_bitposition = self._available_languages_.initialize_offsets_packed(zserio_context.available_languages, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._routing_service_type_ = nds.routing.metadata.routing_service_type.RoutingServiceType.from_reader(zserio_reader)
        self._capabilities_ = nds.routing.metadata.routing_service_capabilities.RoutingServiceCapabilities.from_reader(zserio_reader, self._routing_service_type_)
        self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.from_reader(zserio_reader)

    def read_packed(self, zserio_context: RoutingRegistryMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._routing_service_type_ = nds.routing.metadata.routing_service_type.RoutingServiceType.from_reader_packed(zserio_context.routing_service_type, zserio_reader)

        self._capabilities_ = nds.routing.metadata.routing_service_capabilities.RoutingServiceCapabilities.from_reader_packed(zserio_context.capabilities, zserio_reader, self._routing_service_type_)

        self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.from_reader_packed(zserio_context.available_languages, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._routing_service_type_.write(zserio_writer)

        # check parameters
        if self._capabilities_.type is not (self._routing_service_type_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field RoutingRegistryMetadata.capabilities: "
                                                f"{self._capabilities_.type} != {self._routing_service_type_}!")
        self._capabilities_.write(zserio_writer)

        self._available_languages_.write(zserio_writer)

    def write_packed(self, zserio_context: RoutingRegistryMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._routing_service_type_.write_packed(zserio_context.routing_service_type, zserio_writer)

        # check parameters
        if self._capabilities_.type is not (self._routing_service_type_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field RoutingRegistryMetadata.capabilities: "
                                                f"{self._capabilities_.type} != {self._routing_service_type_}!")
        self._capabilities_.write_packed(zserio_context.capabilities, zserio_writer)

        self._available_languages_.write_packed(zserio_context.available_languages, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._routing_service_type_ = zserio.array.DeltaContext()
            self._capabilities_ = nds.routing.metadata.routing_service_capabilities.RoutingServiceCapabilities.ZserioPackingContext()
            self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.ZserioPackingContext()

        @property
        def routing_service_type(self):
            return self._routing_service_type_

        @property
        def capabilities(self):
            return self._capabilities_

        @property
        def available_languages(self):
            return self._available_languages_
