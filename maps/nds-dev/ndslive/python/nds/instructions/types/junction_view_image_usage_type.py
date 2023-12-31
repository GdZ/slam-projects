# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class JunctionViewImageUsageType:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['JunctionViewImageUsageType'], value: int) -> 'JunctionViewImageUsageType':
        if value < 0 or value > 536870911:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'JunctionViewImageUsageType' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['JunctionViewImageUsageType'], reader: zserio.BitStreamReader) -> 'JunctionViewImageUsageType':
        instance = cls()
        instance._value = reader.read_varuint32()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['JunctionViewImageUsageType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'JunctionViewImageUsageType':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt32ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, JunctionViewImageUsageType):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & JunctionViewImageUsageType.Values.DAY) == JunctionViewImageUsageType.Values.DAY:
            result += "DAY" if not result else " | DAY"
        if (self & JunctionViewImageUsageType.Values.NIGHT) == JunctionViewImageUsageType.Values.NIGHT:
            result += "NIGHT" if not result else " | NIGHT"
        if (self & JunctionViewImageUsageType.Values.SUNSHINE) == JunctionViewImageUsageType.Values.SUNSHINE:
            result += "SUNSHINE" if not result else " | SUNSHINE"
        if (self & JunctionViewImageUsageType.Values.RAIN) == JunctionViewImageUsageType.Values.RAIN:
            result += "RAIN" if not result else " | RAIN"
        if (self & JunctionViewImageUsageType.Values.SNOW) == JunctionViewImageUsageType.Values.SNOW:
            result += "SNOW" if not result else " | SNOW"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'JunctionViewImageUsageType') -> 'JunctionViewImageUsageType':
        return JunctionViewImageUsageType.from_value(self._value | other._value)

    def __and__(self, other: 'JunctionViewImageUsageType') -> 'JunctionViewImageUsageType':
        return JunctionViewImageUsageType.from_value(self._value & other._value)

    def __xor__(self, other: 'JunctionViewImageUsageType') -> 'JunctionViewImageUsageType':
        return JunctionViewImageUsageType.from_value(self._value ^ other._value)

    def __invert__(self) -> 'JunctionViewImageUsageType':
        return JunctionViewImageUsageType.from_value(~self._value & 536870911)

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
        DAY: 'JunctionViewImageUsageType' = None
        NIGHT: 'JunctionViewImageUsageType' = None
        SUNSHINE: 'JunctionViewImageUsageType' = None
        RAIN: 'JunctionViewImageUsageType' = None
        SNOW: 'JunctionViewImageUsageType' = None

JunctionViewImageUsageType.Values.DAY = JunctionViewImageUsageType.from_value(1)
JunctionViewImageUsageType.Values.NIGHT = JunctionViewImageUsageType.from_value(2)
JunctionViewImageUsageType.Values.SUNSHINE = JunctionViewImageUsageType.from_value(4)
JunctionViewImageUsageType.Values.RAIN = JunctionViewImageUsageType.from_value(8)
JunctionViewImageUsageType.Values.SNOW = JunctionViewImageUsageType.from_value(16)
