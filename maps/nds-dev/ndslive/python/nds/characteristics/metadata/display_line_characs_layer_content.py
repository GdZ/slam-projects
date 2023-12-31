# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class DisplayLineCharacsLayerContent:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['DisplayLineCharacsLayerContent'], value: int) -> 'DisplayLineCharacsLayerContent':
        if value < 0 or value > 536870911:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'DisplayLineCharacsLayerContent' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['DisplayLineCharacsLayerContent'], reader: zserio.BitStreamReader) -> 'DisplayLineCharacsLayerContent':
        instance = cls()
        instance._value = reader.read_varuint32()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['DisplayLineCharacsLayerContent'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'DisplayLineCharacsLayerContent':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt32ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLineCharacsLayerContent):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS) == DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS:
            result += "DISPLAY_LINE_RANGE_MAPS" if not result else " | DISPLAY_LINE_RANGE_MAPS"
        if (self & DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS) == DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS:
            result += "DISPLAY_LINE_RANGE_SETS" if not result else " | DISPLAY_LINE_RANGE_SETS"
        if (self & DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS) == DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS:
            result += "DISPLAY_LINE_POSITION_MAPS" if not result else " | DISPLAY_LINE_POSITION_MAPS"
        if (self & DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS) == DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS:
            result += "DISPLAY_LINE_POSITION_SETS" if not result else " | DISPLAY_LINE_POSITION_SETS"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'DisplayLineCharacsLayerContent') -> 'DisplayLineCharacsLayerContent':
        return DisplayLineCharacsLayerContent.from_value(self._value | other._value)

    def __and__(self, other: 'DisplayLineCharacsLayerContent') -> 'DisplayLineCharacsLayerContent':
        return DisplayLineCharacsLayerContent.from_value(self._value & other._value)

    def __xor__(self, other: 'DisplayLineCharacsLayerContent') -> 'DisplayLineCharacsLayerContent':
        return DisplayLineCharacsLayerContent.from_value(self._value ^ other._value)

    def __invert__(self) -> 'DisplayLineCharacsLayerContent':
        return DisplayLineCharacsLayerContent.from_value(~self._value & 536870911)

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt32ArrayTraits(), self._value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint32(self._value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt32ArrayTraits(),
                                       self._value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint32(self._value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt32ArrayTraits(),
                            writer, self._value)

    @property
    def value(self) -> int:
        return self._value

    class Values:
        DISPLAY_LINE_RANGE_MAPS: 'DisplayLineCharacsLayerContent' = None
        DISPLAY_LINE_RANGE_SETS: 'DisplayLineCharacsLayerContent' = None
        DISPLAY_LINE_POSITION_MAPS: 'DisplayLineCharacsLayerContent' = None
        DISPLAY_LINE_POSITION_SETS: 'DisplayLineCharacsLayerContent' = None

DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_MAPS = DisplayLineCharacsLayerContent.from_value(1)
DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_RANGE_SETS = DisplayLineCharacsLayerContent.from_value(2)
DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_MAPS = DisplayLineCharacsLayerContent.from_value(4)
DisplayLineCharacsLayerContent.Values.DISPLAY_LINE_POSITION_SETS = DisplayLineCharacsLayerContent.from_value(8)
