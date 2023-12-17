# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class ParkingFacilityRelationLayerContent:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['ParkingFacilityRelationLayerContent'], value: int) -> 'ParkingFacilityRelationLayerContent':
        if value < 0 or value > 536870911:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'ParkingFacilityRelationLayerContent' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['ParkingFacilityRelationLayerContent'], reader: zserio.BitStreamReader) -> 'ParkingFacilityRelationLayerContent':
        instance = cls()
        instance._value = reader.read_varuint32()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['ParkingFacilityRelationLayerContent'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'ParkingFacilityRelationLayerContent':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt32ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingFacilityRelationLayerContent):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & ParkingFacilityRelationLayerContent.Values.LANE_RANGE_MAPS) == ParkingFacilityRelationLayerContent.Values.LANE_RANGE_MAPS:
            result += "LANE_RANGE_MAPS" if not result else " | LANE_RANGE_MAPS"
        if (self & ParkingFacilityRelationLayerContent.Values.LANE_POSITION_MAPS) == ParkingFacilityRelationLayerContent.Values.LANE_POSITION_MAPS:
            result += "LANE_POSITION_MAPS" if not result else " | LANE_POSITION_MAPS"
        if (self & ParkingFacilityRelationLayerContent.Values.ROAD_SURFACE_MAPS) == ParkingFacilityRelationLayerContent.Values.ROAD_SURFACE_MAPS:
            result += "ROAD_SURFACE_MAPS" if not result else " | ROAD_SURFACE_MAPS"
        if (self & ParkingFacilityRelationLayerContent.Values.POI_MAPS) == ParkingFacilityRelationLayerContent.Values.POI_MAPS:
            result += "POI_MAPS" if not result else " | POI_MAPS"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'ParkingFacilityRelationLayerContent') -> 'ParkingFacilityRelationLayerContent':
        return ParkingFacilityRelationLayerContent.from_value(self._value | other._value)

    def __and__(self, other: 'ParkingFacilityRelationLayerContent') -> 'ParkingFacilityRelationLayerContent':
        return ParkingFacilityRelationLayerContent.from_value(self._value & other._value)

    def __xor__(self, other: 'ParkingFacilityRelationLayerContent') -> 'ParkingFacilityRelationLayerContent':
        return ParkingFacilityRelationLayerContent.from_value(self._value ^ other._value)

    def __invert__(self) -> 'ParkingFacilityRelationLayerContent':
        return ParkingFacilityRelationLayerContent.from_value(~self._value & 536870911)

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
        LANE_RANGE_MAPS: 'ParkingFacilityRelationLayerContent' = None
        LANE_POSITION_MAPS: 'ParkingFacilityRelationLayerContent' = None
        ROAD_SURFACE_MAPS: 'ParkingFacilityRelationLayerContent' = None
        POI_MAPS: 'ParkingFacilityRelationLayerContent' = None

ParkingFacilityRelationLayerContent.Values.LANE_RANGE_MAPS = ParkingFacilityRelationLayerContent.from_value(1)
ParkingFacilityRelationLayerContent.Values.LANE_POSITION_MAPS = ParkingFacilityRelationLayerContent.from_value(2)
ParkingFacilityRelationLayerContent.Values.ROAD_SURFACE_MAPS = ParkingFacilityRelationLayerContent.from_value(4)
ParkingFacilityRelationLayerContent.Values.POI_MAPS = ParkingFacilityRelationLayerContent.from_value(8)
