# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RegionValidityType(zserio.Enum):
    NUM_LANES = 0
    MIN_LANES = 1
    PAVED = 2
    TRAFFIC_ZONE = 3
    PRIORITY_ROAD_CLASS = 4
    BEGINNER = 5
    NO_MARKINGS = 6
    ROAD_MINIMUM_WIDTH = 7
    ROAD_MAXIMUM_WIDTH = 8
    HAS_STREET_LIGHTS = 9
    SHARED_ROAD_SURFACE_WITH_PEDESTRIANS = 10
    IN_BUSINESS_DISTRICT = 11

    @classmethod
    def from_name(cls: typing.Type['RegionValidityType'], item_name: str) -> 'RegionValidityType':
        if item_name == 'NUM_LANES':
            item = RegionValidityType.NUM_LANES
        elif item_name == 'MIN_LANES':
            item = RegionValidityType.MIN_LANES
        elif item_name == 'PAVED':
            item = RegionValidityType.PAVED
        elif item_name == 'TRAFFIC_ZONE':
            item = RegionValidityType.TRAFFIC_ZONE
        elif item_name == 'PRIORITY_ROAD_CLASS':
            item = RegionValidityType.PRIORITY_ROAD_CLASS
        elif item_name == 'BEGINNER':
            item = RegionValidityType.BEGINNER
        elif item_name == 'NO_MARKINGS':
            item = RegionValidityType.NO_MARKINGS
        elif item_name == 'ROAD_MINIMUM_WIDTH':
            item = RegionValidityType.ROAD_MINIMUM_WIDTH
        elif item_name == 'ROAD_MAXIMUM_WIDTH':
            item = RegionValidityType.ROAD_MAXIMUM_WIDTH
        elif item_name == 'HAS_STREET_LIGHTS':
            item = RegionValidityType.HAS_STREET_LIGHTS
        elif item_name == 'SHARED_ROAD_SURFACE_WITH_PEDESTRIANS':
            item = RegionValidityType.SHARED_ROAD_SURFACE_WITH_PEDESTRIANS
        elif item_name == 'IN_BUSINESS_DISTRICT':
            item = RegionValidityType.IN_BUSINESS_DISTRICT
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RegionValidityType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RegionValidityType'], reader: zserio.BitStreamReader) -> 'RegionValidityType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['RegionValidityType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RegionValidityType':
        return cls(delta_context.read(zserio.array.BitFieldArrayTraits(8),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(8),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 8

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(8),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self.value, 8)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(8), writer, self.value)
