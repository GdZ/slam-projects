# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class SupplementaryWarningSign(zserio.Enum):
    LEFT_TURN = 0
    RIGHT_TURN = 1
    RIGHT = 2
    LEFT = 3
    FOR_DISTANCE = 4
    IN_DISTANCE = 5
    TIME_RANGE = 6
    ATTENTION = 7
    ALL_WAY_STOP = 8

    @classmethod
    def from_name(cls: typing.Type['SupplementaryWarningSign'], item_name: str) -> 'SupplementaryWarningSign':
        if item_name == 'LEFT_TURN':
            item = SupplementaryWarningSign.LEFT_TURN
        elif item_name == 'RIGHT_TURN':
            item = SupplementaryWarningSign.RIGHT_TURN
        elif item_name == 'RIGHT':
            item = SupplementaryWarningSign.RIGHT
        elif item_name == 'LEFT':
            item = SupplementaryWarningSign.LEFT
        elif item_name == 'FOR_DISTANCE':
            item = SupplementaryWarningSign.FOR_DISTANCE
        elif item_name == 'IN_DISTANCE':
            item = SupplementaryWarningSign.IN_DISTANCE
        elif item_name == 'TIME_RANGE':
            item = SupplementaryWarningSign.TIME_RANGE
        elif item_name == 'ATTENTION':
            item = SupplementaryWarningSign.ATTENTION
        elif item_name == 'ALL_WAY_STOP':
            item = SupplementaryWarningSign.ALL_WAY_STOP
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'SupplementaryWarningSign'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['SupplementaryWarningSign'], reader: zserio.BitStreamReader) -> 'SupplementaryWarningSign':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['SupplementaryWarningSign'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'SupplementaryWarningSign':
        return cls(delta_context.read(zserio.array.VarUInt16ArrayTraits(),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt16ArrayTraits(),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint16(self.value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt16ArrayTraits(),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint16(self.value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt16ArrayTraits(), writer, self.value)