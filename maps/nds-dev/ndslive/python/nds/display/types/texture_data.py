# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.display.types.texture_section_array

class TextureData:
    def __init__(
            self,
            texture_data_: typing.Union[zserio.bitbuffer.BitBuffer, None] = None,
            texture_section_array_: typing.Union[nds.display.types.texture_section_array.TextureSectionArray, None] = None) -> None:
        self._texture_data_ = texture_data_
        self._texture_section_array_ = texture_section_array_

    @classmethod
    def from_reader(
            cls: typing.Type['TextureData'],
            zserio_reader: zserio.BitStreamReader) -> 'TextureData':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TextureData'],
            zserio_context: TextureData.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TextureData':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TextureData):
            return ((self._texture_data_ == other._texture_data_) and
                    (self._texture_section_array_ == other._texture_section_array_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._texture_data_)
        result = zserio.hashcode.calc_hashcode_object(result, self._texture_section_array_)

        return result

    @property
    def texture_data(self) -> typing.Union[zserio.bitbuffer.BitBuffer, None]:
        return self._texture_data_

    @texture_data.setter
    def texture_data(self, texture_data_: typing.Union[zserio.bitbuffer.BitBuffer, None]) -> None:
        self._texture_data_ = texture_data_

    @property
    def texture_section_array(self) -> typing.Union[nds.display.types.texture_section_array.TextureSectionArray, None]:
        return self._texture_section_array_

    @texture_section_array.setter
    def texture_section_array(self, texture_section_array_: typing.Union[nds.display.types.texture_section_array.TextureSectionArray, None]) -> None:
        self._texture_section_array_ = texture_section_array_

    def init_packing_context(self, zserio_context: TextureData.ZserioPackingContext) -> None:
        self._texture_section_array_.init_packing_context(zserio_context.texture_section_array)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_bitbuffer(self._texture_data_)
        end_bitposition += self._texture_section_array_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TextureData.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_bitbuffer(self._texture_data_)
        end_bitposition += self._texture_section_array_.bitsizeof_packed(zserio_context.texture_section_array, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_bitbuffer(self._texture_data_)
        end_bitposition = self._texture_section_array_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TextureData.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_bitbuffer(self._texture_data_)
        end_bitposition = self._texture_section_array_.initialize_offsets_packed(zserio_context.texture_section_array, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._texture_data_ = zserio_reader.read_bitbuffer()
        self._texture_section_array_ = nds.display.types.texture_section_array.TextureSectionArray.from_reader(zserio_reader)

    def read_packed(self, zserio_context: TextureData.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._texture_data_ = zserio_reader.read_bitbuffer()

        self._texture_section_array_ = nds.display.types.texture_section_array.TextureSectionArray.from_reader_packed(zserio_context.texture_section_array, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bitbuffer(self._texture_data_)
        self._texture_section_array_.write(zserio_writer)

    def write_packed(self, zserio_context: TextureData.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bitbuffer(self._texture_data_)

        self._texture_section_array_.write_packed(zserio_context.texture_section_array, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._texture_section_array_ = nds.display.types.texture_section_array.TextureSectionArray.ZserioPackingContext()

        @property
        def texture_section_array(self):
            return self._texture_section_array_
