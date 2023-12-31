# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class HorizonServiceCapabilities:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['HorizonServiceCapabilities'], value: int) -> 'HorizonServiceCapabilities':
        if value < 0 or value > 4294967295:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'HorizonServiceCapabilities' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['HorizonServiceCapabilities'], reader: zserio.BitStreamReader) -> 'HorizonServiceCapabilities':
        instance = cls()
        instance._value = reader.read_bits(32)
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['HorizonServiceCapabilities'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'HorizonServiceCapabilities':
        instance = cls()
        instance._value = delta_context.read(zserio.array.BitFieldArrayTraits(32),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, HorizonServiceCapabilities):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & HorizonServiceCapabilities.Values.CALCULATE_HORIZON) == HorizonServiceCapabilities.Values.CALCULATE_HORIZON:
            result += "CALCULATE_HORIZON" if not result else " | CALCULATE_HORIZON"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'HorizonServiceCapabilities') -> 'HorizonServiceCapabilities':
        return HorizonServiceCapabilities.from_value(self._value | other._value)

    def __and__(self, other: 'HorizonServiceCapabilities') -> 'HorizonServiceCapabilities':
        return HorizonServiceCapabilities.from_value(self._value & other._value)

    def __xor__(self, other: 'HorizonServiceCapabilities') -> 'HorizonServiceCapabilities':
        return HorizonServiceCapabilities.from_value(self._value ^ other._value)

    def __invert__(self) -> 'HorizonServiceCapabilities':
        return HorizonServiceCapabilities.from_value(~self._value & 4294967295)

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(32), self._value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 32

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(32),
                                       self._value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self._value, 32)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(32),
                            writer, self._value)

    @property
    def value(self) -> int:
        return self._value

    class Values:
        CALCULATE_HORIZON: 'HorizonServiceCapabilities' = None

HorizonServiceCapabilities.Values.CALCULATE_HORIZON = HorizonServiceCapabilities.from_value(1)
