# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class Display3DStyleLayerContent:
    def __init__(
            self,
            has_textures_: bool = bool(),
            has_colors_: bool = bool()) -> None:
        self._has_textures_ = has_textures_
        self._has_colors_ = has_colors_

    @classmethod
    def from_reader(
            cls: typing.Type['Display3DStyleLayerContent'],
            zserio_reader: zserio.BitStreamReader) -> 'Display3DStyleLayerContent':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Display3DStyleLayerContent):
            return ((self._has_textures_ == other._has_textures_) and
                    (self._has_colors_ == other._has_colors_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_textures_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_colors_)

        return result

    @property
    def has_textures(self) -> bool:
        return self._has_textures_

    @has_textures.setter
    def has_textures(self, has_textures_: bool) -> None:
        self._has_textures_ = has_textures_

    @property
    def has_colors(self) -> bool:
        return self._has_colors_

    @has_colors.setter
    def has_colors(self, has_colors_: bool) -> None:
        self._has_colors_ = has_colors_

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._has_textures_ = zserio_reader.read_bool()
        self._has_colors_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._has_textures_)
        zserio_writer.write_bool(self._has_colors_)