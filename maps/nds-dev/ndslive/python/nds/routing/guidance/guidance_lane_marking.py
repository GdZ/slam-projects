# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class GuidanceLaneMarking:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['GuidanceLaneMarking'], value: int) -> 'GuidanceLaneMarking':
        if value < 0 or value > 144115188075855871:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'GuidanceLaneMarking' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['GuidanceLaneMarking'], reader: zserio.BitStreamReader) -> 'GuidanceLaneMarking':
        instance = cls()
        instance._value = reader.read_varuint64()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['GuidanceLaneMarking'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'GuidanceLaneMarking':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt64ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, GuidanceLaneMarking):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & GuidanceLaneMarking.Values.ARROW_STRAIGHT) == GuidanceLaneMarking.Values.ARROW_STRAIGHT:
            result += "ARROW_STRAIGHT" if not result else " | ARROW_STRAIGHT"
        if (self & GuidanceLaneMarking.Values.ARROW_LEFT) == GuidanceLaneMarking.Values.ARROW_LEFT:
            result += "ARROW_LEFT" if not result else " | ARROW_LEFT"
        if (self & GuidanceLaneMarking.Values.ARROW_RIGHT) == GuidanceLaneMarking.Values.ARROW_RIGHT:
            result += "ARROW_RIGHT" if not result else " | ARROW_RIGHT"
        if (self & GuidanceLaneMarking.Values.ARROW_SLIGHT_LEFT) == GuidanceLaneMarking.Values.ARROW_SLIGHT_LEFT:
            result += "ARROW_SLIGHT_LEFT" if not result else " | ARROW_SLIGHT_LEFT"
        if (self & GuidanceLaneMarking.Values.ARROW_SLIGHT_RIGHT) == GuidanceLaneMarking.Values.ARROW_SLIGHT_RIGHT:
            result += "ARROW_SLIGHT_RIGHT" if not result else " | ARROW_SLIGHT_RIGHT"
        if (self & GuidanceLaneMarking.Values.ARROW_SHARP_RIGHT) == GuidanceLaneMarking.Values.ARROW_SHARP_RIGHT:
            result += "ARROW_SHARP_RIGHT" if not result else " | ARROW_SHARP_RIGHT"
        if (self & GuidanceLaneMarking.Values.ARROW_SHARP_LEFT) == GuidanceLaneMarking.Values.ARROW_SHARP_LEFT:
            result += "ARROW_SHARP_LEFT" if not result else " | ARROW_SHARP_LEFT"
        if (self & GuidanceLaneMarking.Values.ARROW_U_TURN_LEFT) == GuidanceLaneMarking.Values.ARROW_U_TURN_LEFT:
            result += "ARROW_U_TURN_LEFT" if not result else " | ARROW_U_TURN_LEFT"
        if (self & GuidanceLaneMarking.Values.ARROW_U_TURN_RIGHT) == GuidanceLaneMarking.Values.ARROW_U_TURN_RIGHT:
            result += "ARROW_U_TURN_RIGHT" if not result else " | ARROW_U_TURN_RIGHT"
        if not result and self._value == 0:
            result += "NONE"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'GuidanceLaneMarking') -> 'GuidanceLaneMarking':
        return GuidanceLaneMarking.from_value(self._value | other._value)

    def __and__(self, other: 'GuidanceLaneMarking') -> 'GuidanceLaneMarking':
        return GuidanceLaneMarking.from_value(self._value & other._value)

    def __xor__(self, other: 'GuidanceLaneMarking') -> 'GuidanceLaneMarking':
        return GuidanceLaneMarking.from_value(self._value ^ other._value)

    def __invert__(self) -> 'GuidanceLaneMarking':
        return GuidanceLaneMarking.from_value(~self._value & 144115188075855871)

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt64ArrayTraits(), self._value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint64(self._value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt64ArrayTraits(),
                                       self._value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint64(self._value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt64ArrayTraits(),
                            writer, self._value)

    @property
    def value(self) -> int:
        return self._value

    class Values:
        NONE: 'GuidanceLaneMarking' = None
        ARROW_STRAIGHT: 'GuidanceLaneMarking' = None
        ARROW_LEFT: 'GuidanceLaneMarking' = None
        ARROW_RIGHT: 'GuidanceLaneMarking' = None
        ARROW_SLIGHT_LEFT: 'GuidanceLaneMarking' = None
        ARROW_SLIGHT_RIGHT: 'GuidanceLaneMarking' = None
        ARROW_SHARP_RIGHT: 'GuidanceLaneMarking' = None
        ARROW_SHARP_LEFT: 'GuidanceLaneMarking' = None
        ARROW_U_TURN_LEFT: 'GuidanceLaneMarking' = None
        ARROW_U_TURN_RIGHT: 'GuidanceLaneMarking' = None

GuidanceLaneMarking.Values.NONE = GuidanceLaneMarking.from_value(0)
GuidanceLaneMarking.Values.ARROW_STRAIGHT = GuidanceLaneMarking.from_value(2)
GuidanceLaneMarking.Values.ARROW_LEFT = GuidanceLaneMarking.from_value(4)
GuidanceLaneMarking.Values.ARROW_RIGHT = GuidanceLaneMarking.from_value(8)
GuidanceLaneMarking.Values.ARROW_SLIGHT_LEFT = GuidanceLaneMarking.from_value(16)
GuidanceLaneMarking.Values.ARROW_SLIGHT_RIGHT = GuidanceLaneMarking.from_value(32)
GuidanceLaneMarking.Values.ARROW_SHARP_RIGHT = GuidanceLaneMarking.from_value(64)
GuidanceLaneMarking.Values.ARROW_SHARP_LEFT = GuidanceLaneMarking.from_value(128)
GuidanceLaneMarking.Values.ARROW_U_TURN_LEFT = GuidanceLaneMarking.from_value(256)
GuidanceLaneMarking.Values.ARROW_U_TURN_RIGHT = GuidanceLaneMarking.from_value(512)
