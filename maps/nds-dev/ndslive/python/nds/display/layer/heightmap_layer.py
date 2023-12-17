# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.display.instantiations.height_map_grid_layer
import nds.system.types.layer_type

class HeightmapLayer:
    def __init__(
            self,
            has_ids_: bool = bool(),
            complete_tile_: bool = bool(),
            heightmaps_: typing.Union[nds.display.instantiations.height_map_grid_layer.HeightMapGridLayer, None] = None) -> None:
        self._has_ids_ = has_ids_
        self._complete_tile_ = complete_tile_
        self._heightmaps_ = heightmaps_

    @classmethod
    def from_reader(
            cls: typing.Type['HeightmapLayer'],
            zserio_reader: zserio.BitStreamReader) -> 'HeightmapLayer':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['HeightmapLayer'],
            zserio_context: HeightmapLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'HeightmapLayer':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, HeightmapLayer):
            return ((self._has_ids_ == other._has_ids_) and
                    (self._complete_tile_ == other._complete_tile_) and
                    (self._heightmaps_ == other._heightmaps_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_ids_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._complete_tile_)
        result = zserio.hashcode.calc_hashcode_object(result, self._heightmaps_)

        return result

    @property
    def has_ids(self) -> bool:
        return self._has_ids_

    @has_ids.setter
    def has_ids(self, has_ids_: bool) -> None:
        self._has_ids_ = has_ids_

    @property
    def complete_tile(self) -> bool:
        return self._complete_tile_

    @complete_tile.setter
    def complete_tile(self, complete_tile_: bool) -> None:
        self._complete_tile_ = complete_tile_

    @property
    def heightmaps(self) -> typing.Union[nds.display.instantiations.height_map_grid_layer.HeightMapGridLayer, None]:
        return self._heightmaps_

    @heightmaps.setter
    def heightmaps(self, heightmaps_: typing.Union[nds.display.instantiations.height_map_grid_layer.HeightMapGridLayer, None]) -> None:
        self._heightmaps_ = heightmaps_

    def get_layer_type(self) -> nds.system.types.layer_type.LayerType:
        return nds.system.types.layer_type.LayerType.FEATURE

    def init_packing_context(self, zserio_context: HeightmapLayer.ZserioPackingContext) -> None:
        self._heightmaps_.init_packing_context(zserio_context.heightmaps)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += self._heightmaps_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: HeightmapLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += self._heightmaps_.bitsizeof_packed(zserio_context.heightmaps, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition = self._heightmaps_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: HeightmapLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition = self._heightmaps_.initialize_offsets_packed(zserio_context.heightmaps, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._has_ids_ = zserio_reader.read_bool()
        self._complete_tile_ = zserio_reader.read_bool()
        self._heightmaps_ = nds.display.instantiations.height_map_grid_layer.HeightMapGridLayer.from_reader(zserio_reader, self._has_ids_, False)

    def read_packed(self, zserio_context: HeightmapLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._has_ids_ = zserio_reader.read_bool()

        self._complete_tile_ = zserio_reader.read_bool()

        self._heightmaps_ = nds.display.instantiations.height_map_grid_layer.HeightMapGridLayer.from_reader_packed(zserio_context.heightmaps, zserio_reader, self._has_ids_, False)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._has_ids_)

        zserio_writer.write_bool(self._complete_tile_)

        # check parameters
        if self._heightmaps_.has_ids != (self._has_ids_):
            raise zserio.PythonRuntimeException("Wrong parameter hasIds for field HeightmapLayer.heightmaps: "
                                                f"{self._heightmaps_.has_ids} != {self._has_ids_}!")
        if self._heightmaps_.has_types != (False):
            raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field HeightmapLayer.heightmaps: "
                                                f"{self._heightmaps_.has_types} != {False}!")
        self._heightmaps_.write(zserio_writer)

    def write_packed(self, zserio_context: HeightmapLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._has_ids_)

        zserio_writer.write_bool(self._complete_tile_)

        # check parameters
        if self._heightmaps_.has_ids != (self._has_ids_):
            raise zserio.PythonRuntimeException("Wrong parameter hasIds for field HeightmapLayer.heightmaps: "
                                                f"{self._heightmaps_.has_ids} != {self._has_ids_}!")
        if self._heightmaps_.has_types != (False):
            raise zserio.PythonRuntimeException("Wrong parameter hasTypes for field HeightmapLayer.heightmaps: "
                                                f"{self._heightmaps_.has_types} != {False}!")
        self._heightmaps_.write_packed(zserio_context.heightmaps, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._heightmaps_ = nds.display.instantiations.height_map_grid_layer.HeightMapGridLayer.ZserioPackingContext()

        @property
        def heightmaps(self):
            return self._heightmaps_