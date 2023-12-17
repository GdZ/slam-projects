# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routing.metadata.range_projection_service_methods
import nds.routing.types.range_projection_type

class RangeProjectionServiceCapabilities:
    def __init__(
            self,
            implemented_methods_: typing.Union[nds.routing.metadata.range_projection_service_methods.RangeProjectionServiceMethods, None] = None,
            supported_range_projection_types_: typing.List[nds.routing.types.range_projection_type.RangeProjectionType] = None) -> None:
        self._implemented_methods_ = implemented_methods_
        self._supported_range_projection_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_supported_range_projection_types()), supported_range_projection_types_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['RangeProjectionServiceCapabilities'],
            zserio_reader: zserio.BitStreamReader) -> 'RangeProjectionServiceCapabilities':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RangeProjectionServiceCapabilities'],
            zserio_context: RangeProjectionServiceCapabilities.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RangeProjectionServiceCapabilities':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RangeProjectionServiceCapabilities):
            return ((self._implemented_methods_ == other._implemented_methods_) and
                    (self._supported_range_projection_types_ == other._supported_range_projection_types_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._implemented_methods_)
        result = zserio.hashcode.calc_hashcode_object(result, self._supported_range_projection_types_)

        return result

    @property
    def implemented_methods(self) -> typing.Union[nds.routing.metadata.range_projection_service_methods.RangeProjectionServiceMethods, None]:
        return self._implemented_methods_

    @implemented_methods.setter
    def implemented_methods(self, implemented_methods_: typing.Union[nds.routing.metadata.range_projection_service_methods.RangeProjectionServiceMethods, None]) -> None:
        self._implemented_methods_ = implemented_methods_

    @property
    def supported_range_projection_types(self) -> typing.List[nds.routing.types.range_projection_type.RangeProjectionType]:
        return self._supported_range_projection_types_.raw_array

    @supported_range_projection_types.setter
    def supported_range_projection_types(self, supported_range_projection_types_: typing.List[nds.routing.types.range_projection_type.RangeProjectionType]) -> None:
        self._supported_range_projection_types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_supported_range_projection_types()), supported_range_projection_types_, is_auto=True)

    def init_packing_context(self, zserio_context: RangeProjectionServiceCapabilities.ZserioPackingContext) -> None:
        self._implemented_methods_.init_packing_context(zserio_context.implemented_methods)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._implemented_methods_.bitsizeof(end_bitposition)
        end_bitposition += self._supported_range_projection_types_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RangeProjectionServiceCapabilities.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._implemented_methods_.bitsizeof_packed(zserio_context.implemented_methods, end_bitposition)
        end_bitposition += self._supported_range_projection_types_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._implemented_methods_.initialize_offsets(end_bitposition)
        end_bitposition = self._supported_range_projection_types_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RangeProjectionServiceCapabilities.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._implemented_methods_.initialize_offsets_packed(zserio_context.implemented_methods, end_bitposition)
        end_bitposition = self._supported_range_projection_types_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._implemented_methods_ = nds.routing.metadata.range_projection_service_methods.RangeProjectionServiceMethods.from_reader(zserio_reader)
        self._supported_range_projection_types_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_supported_range_projection_types()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: RangeProjectionServiceCapabilities.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._implemented_methods_ = nds.routing.metadata.range_projection_service_methods.RangeProjectionServiceMethods.from_reader_packed(zserio_context.implemented_methods, zserio_reader)

        self._supported_range_projection_types_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_supported_range_projection_types()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._implemented_methods_.write(zserio_writer)
        self._supported_range_projection_types_.write(zserio_writer)

    def write_packed(self, zserio_context: RangeProjectionServiceCapabilities.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._implemented_methods_.write_packed(zserio_context.implemented_methods, zserio_writer)

        self._supported_range_projection_types_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._implemented_methods_ = zserio.array.DeltaContext()

        @property
        def implemented_methods(self):
            return self._implemented_methods_

    class _ZserioElementFactory_supported_range_projection_types:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routing.types.range_projection_type.RangeProjectionType:
            del zserio_index
            return nds.routing.types.range_projection_type.RangeProjectionType.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> zserio.array.DeltaContext:
            return zserio.array.DeltaContext()

        @staticmethod
        def create_packed(zserio_context: zserio.array.DeltaContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routing.types.range_projection_type.RangeProjectionType:
            del zserio_index
            return nds.routing.types.range_projection_type.RangeProjectionType.from_reader_packed(zserio_context, zserio_reader)
