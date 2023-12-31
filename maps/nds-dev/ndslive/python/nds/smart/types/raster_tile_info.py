# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.smart.types.raster_image_config_extern
import nds.smart.types.raster_image_lifetime

class RasterTileInfo:
    def __init__(
            self,
            lifetime_info_: typing.Union[nds.smart.types.raster_image_lifetime.RasterImageLifetime, None] = None,
            configurations_: typing.List[nds.smart.types.raster_image_config_extern.RasterImageConfigExtern] = None) -> None:
        self._lifetime_info_ = lifetime_info_
        self._configurations_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_configurations()), configurations_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['RasterTileInfo'],
            zserio_reader: zserio.BitStreamReader) -> 'RasterTileInfo':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RasterTileInfo'],
            zserio_context: RasterTileInfo.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RasterTileInfo':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RasterTileInfo):
            return ((self._lifetime_info_ == other._lifetime_info_) and
                    (self._configurations_ == other._configurations_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._lifetime_info_)
        result = zserio.hashcode.calc_hashcode_object(result, self._configurations_)

        return result

    @property
    def lifetime_info(self) -> typing.Union[nds.smart.types.raster_image_lifetime.RasterImageLifetime, None]:
        return self._lifetime_info_

    @lifetime_info.setter
    def lifetime_info(self, lifetime_info_: typing.Union[nds.smart.types.raster_image_lifetime.RasterImageLifetime, None]) -> None:
        self._lifetime_info_ = lifetime_info_

    @property
    def configurations(self) -> typing.List[nds.smart.types.raster_image_config_extern.RasterImageConfigExtern]:
        return self._configurations_.raw_array

    @configurations.setter
    def configurations(self, configurations_: typing.List[nds.smart.types.raster_image_config_extern.RasterImageConfigExtern]) -> None:
        self._configurations_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_configurations()), configurations_, is_auto=True)

    def init_packing_context(self, zserio_context: RasterTileInfo.ZserioPackingContext) -> None:
        self._lifetime_info_.init_packing_context(zserio_context.lifetime_info)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._lifetime_info_.bitsizeof(end_bitposition)
        end_bitposition += self._configurations_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RasterTileInfo.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._lifetime_info_.bitsizeof_packed(zserio_context.lifetime_info, end_bitposition)
        end_bitposition += self._configurations_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._lifetime_info_.initialize_offsets(end_bitposition)
        end_bitposition = self._configurations_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RasterTileInfo.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._lifetime_info_.initialize_offsets_packed(zserio_context.lifetime_info, end_bitposition)
        end_bitposition = self._configurations_.initialize_offsets(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._lifetime_info_ = nds.smart.types.raster_image_lifetime.RasterImageLifetime.from_reader(zserio_reader)
        self._configurations_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_configurations()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: RasterTileInfo.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._lifetime_info_ = nds.smart.types.raster_image_lifetime.RasterImageLifetime.from_reader_packed(zserio_context.lifetime_info, zserio_reader)

        self._configurations_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_configurations()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._lifetime_info_.write(zserio_writer)
        self._configurations_.write(zserio_writer)

    def write_packed(self, zserio_context: RasterTileInfo.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._lifetime_info_.write_packed(zserio_context.lifetime_info, zserio_writer)

        self._configurations_.write(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._lifetime_info_ = nds.smart.types.raster_image_lifetime.RasterImageLifetime.ZserioPackingContext()

        @property
        def lifetime_info(self):
            return self._lifetime_info_

    class _ZserioElementFactory_configurations:
        IS_OBJECT_PACKABLE = False

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.types.raster_image_config_extern.RasterImageConfigExtern:
            del zserio_index
            return nds.smart.types.raster_image_config_extern.RasterImageConfigExtern.from_reader(zserio_reader)
