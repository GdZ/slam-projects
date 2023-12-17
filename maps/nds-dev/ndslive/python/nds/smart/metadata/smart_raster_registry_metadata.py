# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.smart.metadata.raster_registry_metadata_extern

class SmartRasterRegistryMetadata:
    def __init__(
            self,
            metadata_extern_: typing.Union[nds.smart.metadata.raster_registry_metadata_extern.RasterRegistryMetadataExtern, None] = None) -> None:
        self._metadata_extern_ = metadata_extern_

    @classmethod
    def from_reader(
            cls: typing.Type['SmartRasterRegistryMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartRasterRegistryMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartRasterRegistryMetadata):
            return (self._metadata_extern_ == other._metadata_extern_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._metadata_extern_)

        return result

    @property
    def metadata_extern(self) -> typing.Union[nds.smart.metadata.raster_registry_metadata_extern.RasterRegistryMetadataExtern, None]:
        return self._metadata_extern_

    @metadata_extern.setter
    def metadata_extern(self, metadata_extern_: typing.Union[nds.smart.metadata.raster_registry_metadata_extern.RasterRegistryMetadataExtern, None]) -> None:
        self._metadata_extern_ = metadata_extern_

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._metadata_extern_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._metadata_extern_.initialize_offsets(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._metadata_extern_ = nds.smart.metadata.raster_registry_metadata_extern.RasterRegistryMetadataExtern.from_reader(zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._metadata_extern_.write(zserio_writer)
