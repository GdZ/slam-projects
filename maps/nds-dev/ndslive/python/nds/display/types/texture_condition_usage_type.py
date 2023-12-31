# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TextureConditionUsageType:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['TextureConditionUsageType'], value: int) -> 'TextureConditionUsageType':
        if value < 0 or value > 144115188075855871:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'TextureConditionUsageType' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['TextureConditionUsageType'], reader: zserio.BitStreamReader) -> 'TextureConditionUsageType':
        instance = cls()
        instance._value = reader.read_varuint64()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['TextureConditionUsageType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TextureConditionUsageType':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt64ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TextureConditionUsageType):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & TextureConditionUsageType.Values.TIME_DAY) == TextureConditionUsageType.Values.TIME_DAY:
            result += "TIME_DAY" if not result else " | TIME_DAY"
        if (self & TextureConditionUsageType.Values.TIME_NIGHT) == TextureConditionUsageType.Values.TIME_NIGHT:
            result += "TIME_NIGHT" if not result else " | TIME_NIGHT"
        if (self & TextureConditionUsageType.Values.WEATHER_RAINY) == TextureConditionUsageType.Values.WEATHER_RAINY:
            result += "WEATHER_RAINY" if not result else " | WEATHER_RAINY"
        if (self & TextureConditionUsageType.Values.WEATHER_CLOUDY) == TextureConditionUsageType.Values.WEATHER_CLOUDY:
            result += "WEATHER_CLOUDY" if not result else " | WEATHER_CLOUDY"
        if (self & TextureConditionUsageType.Values.WEATHER_SUNNY) == TextureConditionUsageType.Values.WEATHER_SUNNY:
            result += "WEATHER_SUNNY" if not result else " | WEATHER_SUNNY"
        if (self & TextureConditionUsageType.Values.WEATHER_SNOWY) == TextureConditionUsageType.Values.WEATHER_SNOWY:
            result += "WEATHER_SNOWY" if not result else " | WEATHER_SNOWY"
        if (self & TextureConditionUsageType.Values.SEASONAL_WINTER) == TextureConditionUsageType.Values.SEASONAL_WINTER:
            result += "SEASONAL_WINTER" if not result else " | SEASONAL_WINTER"
        if (self & TextureConditionUsageType.Values.SEASONAL_SPRING) == TextureConditionUsageType.Values.SEASONAL_SPRING:
            result += "SEASONAL_SPRING" if not result else " | SEASONAL_SPRING"
        if (self & TextureConditionUsageType.Values.SEASONAL_SUMMER) == TextureConditionUsageType.Values.SEASONAL_SUMMER:
            result += "SEASONAL_SUMMER" if not result else " | SEASONAL_SUMMER"
        if (self & TextureConditionUsageType.Values.SEASONAL_FALL) == TextureConditionUsageType.Values.SEASONAL_FALL:
            result += "SEASONAL_FALL" if not result else " | SEASONAL_FALL"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'TextureConditionUsageType') -> 'TextureConditionUsageType':
        return TextureConditionUsageType.from_value(self._value | other._value)

    def __and__(self, other: 'TextureConditionUsageType') -> 'TextureConditionUsageType':
        return TextureConditionUsageType.from_value(self._value & other._value)

    def __xor__(self, other: 'TextureConditionUsageType') -> 'TextureConditionUsageType':
        return TextureConditionUsageType.from_value(self._value ^ other._value)

    def __invert__(self) -> 'TextureConditionUsageType':
        return TextureConditionUsageType.from_value(~self._value & 144115188075855871)

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
        TIME_DAY: 'TextureConditionUsageType' = None
        TIME_NIGHT: 'TextureConditionUsageType' = None
        WEATHER_RAINY: 'TextureConditionUsageType' = None
        WEATHER_CLOUDY: 'TextureConditionUsageType' = None
        WEATHER_SUNNY: 'TextureConditionUsageType' = None
        WEATHER_SNOWY: 'TextureConditionUsageType' = None
        SEASONAL_WINTER: 'TextureConditionUsageType' = None
        SEASONAL_SPRING: 'TextureConditionUsageType' = None
        SEASONAL_SUMMER: 'TextureConditionUsageType' = None
        SEASONAL_FALL: 'TextureConditionUsageType' = None

TextureConditionUsageType.Values.TIME_DAY = TextureConditionUsageType.from_value(1)
TextureConditionUsageType.Values.TIME_NIGHT = TextureConditionUsageType.from_value(2)
TextureConditionUsageType.Values.WEATHER_RAINY = TextureConditionUsageType.from_value(4)
TextureConditionUsageType.Values.WEATHER_CLOUDY = TextureConditionUsageType.from_value(8)
TextureConditionUsageType.Values.WEATHER_SUNNY = TextureConditionUsageType.from_value(16)
TextureConditionUsageType.Values.WEATHER_SNOWY = TextureConditionUsageType.from_value(32)
TextureConditionUsageType.Values.SEASONAL_WINTER = TextureConditionUsageType.from_value(64)
TextureConditionUsageType.Values.SEASONAL_SPRING = TextureConditionUsageType.from_value(128)
TextureConditionUsageType.Values.SEASONAL_SUMMER = TextureConditionUsageType.from_value(256)
TextureConditionUsageType.Values.SEASONAL_FALL = TextureConditionUsageType.from_value(512)
