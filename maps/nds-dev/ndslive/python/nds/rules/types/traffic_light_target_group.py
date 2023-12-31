# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TrafficLightTargetGroup:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['TrafficLightTargetGroup'], value: int) -> 'TrafficLightTargetGroup':
        if value < 0 or value > 32767:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'TrafficLightTargetGroup' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['TrafficLightTargetGroup'], reader: zserio.BitStreamReader) -> 'TrafficLightTargetGroup':
        instance = cls()
        instance._value = reader.read_varuint16()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['TrafficLightTargetGroup'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TrafficLightTargetGroup':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt16ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TrafficLightTargetGroup):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & TrafficLightTargetGroup.Values.VEHICLE) == TrafficLightTargetGroup.Values.VEHICLE:
            result += "VEHICLE" if not result else " | VEHICLE"
        if (self & TrafficLightTargetGroup.Values.PEDESTRIAN) == TrafficLightTargetGroup.Values.PEDESTRIAN:
            result += "PEDESTRIAN" if not result else " | PEDESTRIAN"
        if (self & TrafficLightTargetGroup.Values.BICYCLE) == TrafficLightTargetGroup.Values.BICYCLE:
            result += "BICYCLE" if not result else " | BICYCLE"
        if (self & TrafficLightTargetGroup.Values.PUBLIC_TRANSPORT) == TrafficLightTargetGroup.Values.PUBLIC_TRANSPORT:
            result += "PUBLIC_TRANSPORT" if not result else " | PUBLIC_TRANSPORT"
        if (self & TrafficLightTargetGroup.Values.RAILWAY) == TrafficLightTargetGroup.Values.RAILWAY:
            result += "RAILWAY" if not result else " | RAILWAY"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'TrafficLightTargetGroup') -> 'TrafficLightTargetGroup':
        return TrafficLightTargetGroup.from_value(self._value | other._value)

    def __and__(self, other: 'TrafficLightTargetGroup') -> 'TrafficLightTargetGroup':
        return TrafficLightTargetGroup.from_value(self._value & other._value)

    def __xor__(self, other: 'TrafficLightTargetGroup') -> 'TrafficLightTargetGroup':
        return TrafficLightTargetGroup.from_value(self._value ^ other._value)

    def __invert__(self) -> 'TrafficLightTargetGroup':
        return TrafficLightTargetGroup.from_value(~self._value & 32767)

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt16ArrayTraits(), self._value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint16(self._value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt16ArrayTraits(),
                                       self._value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint16(self._value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt16ArrayTraits(),
                            writer, self._value)

    @property
    def value(self) -> int:
        return self._value

    class Values:
        VEHICLE: 'TrafficLightTargetGroup' = None
        PEDESTRIAN: 'TrafficLightTargetGroup' = None
        BICYCLE: 'TrafficLightTargetGroup' = None
        PUBLIC_TRANSPORT: 'TrafficLightTargetGroup' = None
        RAILWAY: 'TrafficLightTargetGroup' = None

TrafficLightTargetGroup.Values.VEHICLE = TrafficLightTargetGroup.from_value(1)
TrafficLightTargetGroup.Values.PEDESTRIAN = TrafficLightTargetGroup.from_value(2)
TrafficLightTargetGroup.Values.BICYCLE = TrafficLightTargetGroup.from_value(4)
TrafficLightTargetGroup.Values.PUBLIC_TRANSPORT = TrafficLightTargetGroup.from_value(8)
TrafficLightTargetGroup.Values.RAILWAY = TrafficLightTargetGroup.from_value(16)
