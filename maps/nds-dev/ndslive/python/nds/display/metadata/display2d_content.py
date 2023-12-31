# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class Display2DContent:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['Display2DContent'], value: int) -> 'Display2DContent':
        if value < 0 or value > 536870911:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'Display2DContent' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['Display2DContent'], reader: zserio.BitStreamReader) -> 'Display2DContent':
        instance = cls()
        instance._value = reader.read_varuint32()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['Display2DContent'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'Display2DContent':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt32ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Display2DContent):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & Display2DContent.Values.POINTS) == Display2DContent.Values.POINTS:
            result += "POINTS" if not result else " | POINTS"
        if (self & Display2DContent.Values.LINES) == Display2DContent.Values.LINES:
            result += "LINES" if not result else " | LINES"
        if (self & Display2DContent.Values.AREAS) == Display2DContent.Values.AREAS:
            result += "AREAS" if not result else " | AREAS"
        if (self & Display2DContent.Values.AREA_TYPE_RELATIONS) == Display2DContent.Values.AREA_TYPE_RELATIONS:
            result += "AREA_TYPE_RELATIONS" if not result else " | AREA_TYPE_RELATIONS"
        if (self & Display2DContent.Values.LINE_TYPE_RELATIONS) == Display2DContent.Values.LINE_TYPE_RELATIONS:
            result += "LINE_TYPE_RELATIONS" if not result else " | LINE_TYPE_RELATIONS"
        if (self & Display2DContent.Values.POINT_TYPE_RELATIONS) == Display2DContent.Values.POINT_TYPE_RELATIONS:
            result += "POINT_TYPE_RELATIONS" if not result else " | POINT_TYPE_RELATIONS"
        if (self & Display2DContent.Values.SIMPLE_AREAS) == Display2DContent.Values.SIMPLE_AREAS:
            result += "SIMPLE_AREAS" if not result else " | SIMPLE_AREAS"
        if (self & Display2DContent.Values.SIMPLE_AREA_SETS) == Display2DContent.Values.SIMPLE_AREA_SETS:
            result += "SIMPLE_AREA_SETS" if not result else " | SIMPLE_AREA_SETS"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'Display2DContent') -> 'Display2DContent':
        return Display2DContent.from_value(self._value | other._value)

    def __and__(self, other: 'Display2DContent') -> 'Display2DContent':
        return Display2DContent.from_value(self._value & other._value)

    def __xor__(self, other: 'Display2DContent') -> 'Display2DContent':
        return Display2DContent.from_value(self._value ^ other._value)

    def __invert__(self) -> 'Display2DContent':
        return Display2DContent.from_value(~self._value & 536870911)

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
        POINTS: 'Display2DContent' = None
        LINES: 'Display2DContent' = None
        AREAS: 'Display2DContent' = None
        AREA_TYPE_RELATIONS: 'Display2DContent' = None
        LINE_TYPE_RELATIONS: 'Display2DContent' = None
        POINT_TYPE_RELATIONS: 'Display2DContent' = None
        SIMPLE_AREAS: 'Display2DContent' = None
        SIMPLE_AREA_SETS: 'Display2DContent' = None

Display2DContent.Values.POINTS = Display2DContent.from_value(1)
Display2DContent.Values.LINES = Display2DContent.from_value(2)
Display2DContent.Values.AREAS = Display2DContent.from_value(4)
Display2DContent.Values.AREA_TYPE_RELATIONS = Display2DContent.from_value(8)
Display2DContent.Values.LINE_TYPE_RELATIONS = Display2DContent.from_value(16)
Display2DContent.Values.POINT_TYPE_RELATIONS = Display2DContent.from_value(32)
Display2DContent.Values.SIMPLE_AREAS = Display2DContent.from_value(64)
Display2DContent.Values.SIMPLE_AREA_SETS = Display2DContent.from_value(128)
