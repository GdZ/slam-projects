# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.search.types.character_index

class TextRange:
    def __init__(
            self,
            start_index_: nds.search.types.character_index.CharacterIndex = nds.search.types.character_index.CharacterIndex(),
            end_index_: nds.search.types.character_index.CharacterIndex = nds.search.types.character_index.CharacterIndex()) -> None:
        self._start_index_ = start_index_
        self._end_index_ = end_index_

    @classmethod
    def from_reader(
            cls: typing.Type['TextRange'],
            zserio_reader: zserio.BitStreamReader) -> 'TextRange':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TextRange'],
            zserio_context: TextRange.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TextRange':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TextRange):
            return ((self._start_index_ == other._start_index_) and
                    (self._end_index_ == other._end_index_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._start_index_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._end_index_)

        return result

    @property
    def start_index(self) -> nds.search.types.character_index.CharacterIndex:
        return self._start_index_

    @start_index.setter
    def start_index(self, start_index_: nds.search.types.character_index.CharacterIndex) -> None:
        self._start_index_ = start_index_

    @property
    def end_index(self) -> nds.search.types.character_index.CharacterIndex:
        return self._end_index_

    @end_index.setter
    def end_index(self, end_index_: nds.search.types.character_index.CharacterIndex) -> None:
        self._end_index_ = end_index_

    def init_packing_context(self, zserio_context: TextRange.ZserioPackingContext) -> None:
        zserio_context.start_index.init(zserio.array.VarUInt32ArrayTraits(), self._start_index_)
        zserio_context.end_index.init(zserio.array.VarUInt32ArrayTraits(), self._end_index_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._start_index_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._end_index_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TextRange.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.start_index.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._start_index_)
        end_bitposition += zserio_context.end_index.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._end_index_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._start_index_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._end_index_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TextRange.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.start_index.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._start_index_)
        end_bitposition += zserio_context.end_index.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._end_index_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_index_ = zserio_reader.read_varuint32()
        self._end_index_ = zserio_reader.read_varuint32()

    def read_packed(self, zserio_context: TextRange.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_index_ = zserio_context.start_index.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

        self._end_index_ = zserio_context.end_index.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint32(self._start_index_)
        zserio_writer.write_varuint32(self._end_index_)

    def write_packed(self, zserio_context: TextRange.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.start_index.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._start_index_)

        zserio_context.end_index.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._end_index_)

    class ZserioPackingContext:
        def __init__(self):
            self._start_index_ = zserio.array.DeltaContext()
            self._end_index_ = zserio.array.DeltaContext()

        @property
        def start_index(self):
            return self._start_index_

        @property
        def end_index(self):
            return self._end_index_
