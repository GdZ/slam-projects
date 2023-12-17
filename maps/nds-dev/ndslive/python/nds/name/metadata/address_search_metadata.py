# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.name.metadata.address_search_filter_options
import nds.name.types.address_format

class AddressSearchMetadata:
    def __init__(
            self,
            supported_filter_: typing.Union[nds.name.metadata.address_search_filter_options.AddressSearchFilterOptions, None] = None,
            address_formats_: typing.List[nds.name.types.address_format.AddressFormat] = None) -> None:
        self._supported_filter_ = supported_filter_
        self._address_formats_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), address_formats_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['AddressSearchMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'AddressSearchMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AddressSearchMetadata'],
            zserio_context: AddressSearchMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AddressSearchMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AddressSearchMetadata):
            return ((self._supported_filter_ == other._supported_filter_) and
                    (self._address_formats_ == other._address_formats_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._supported_filter_)
        result = zserio.hashcode.calc_hashcode_object(result, self._address_formats_)

        return result

    @property
    def supported_filter(self) -> typing.Union[nds.name.metadata.address_search_filter_options.AddressSearchFilterOptions, None]:
        return self._supported_filter_

    @supported_filter.setter
    def supported_filter(self, supported_filter_: typing.Union[nds.name.metadata.address_search_filter_options.AddressSearchFilterOptions, None]) -> None:
        self._supported_filter_ = supported_filter_

    @property
    def address_formats(self) -> typing.List[nds.name.types.address_format.AddressFormat]:
        return self._address_formats_.raw_array

    @address_formats.setter
    def address_formats(self, address_formats_: typing.List[nds.name.types.address_format.AddressFormat]) -> None:
        self._address_formats_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), address_formats_, is_auto=True)

    def init_packing_context(self, zserio_context: AddressSearchMetadata.ZserioPackingContext) -> None:
        self._supported_filter_.init_packing_context(zserio_context.supported_filter)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._supported_filter_.bitsizeof(end_bitposition)
        end_bitposition += self._address_formats_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AddressSearchMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._supported_filter_.bitsizeof_packed(zserio_context.supported_filter, end_bitposition)
        end_bitposition += self._address_formats_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._supported_filter_.initialize_offsets(end_bitposition)
        end_bitposition = self._address_formats_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AddressSearchMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._supported_filter_.initialize_offsets_packed(zserio_context.supported_filter, end_bitposition)
        end_bitposition = self._address_formats_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._supported_filter_ = nds.name.metadata.address_search_filter_options.AddressSearchFilterOptions.from_reader(zserio_reader)
        self._address_formats_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: AddressSearchMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._supported_filter_ = nds.name.metadata.address_search_filter_options.AddressSearchFilterOptions.from_reader_packed(zserio_context.supported_filter, zserio_reader)

        self._address_formats_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_address_formats()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._supported_filter_.write(zserio_writer)
        self._address_formats_.write(zserio_writer)

    def write_packed(self, zserio_context: AddressSearchMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._supported_filter_.write_packed(zserio_context.supported_filter, zserio_writer)

        self._address_formats_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._supported_filter_ = zserio.array.DeltaContext()

        @property
        def supported_filter(self):
            return self._supported_filter_

    class _ZserioElementFactory_address_formats:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.address_format.AddressFormat:
            del zserio_index
            return nds.name.types.address_format.AddressFormat.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.name.types.address_format.AddressFormat.ZserioPackingContext:
            return nds.name.types.address_format.AddressFormat.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.name.types.address_format.AddressFormat.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.address_format.AddressFormat:
            del zserio_index
            return nds.name.types.address_format.AddressFormat.from_reader_packed(zserio_context, zserio_reader)