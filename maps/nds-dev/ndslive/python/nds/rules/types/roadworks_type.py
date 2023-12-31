# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RoadworksType(zserio.Enum):
    LONG_TERM_ROADWORKS = 0
    CONSTRUCTION_WORK = 1
    BRIDGE_MAINTENANCE_WORK = 2
    RESURFACING_WORK = 3
    MAJOR_ROADWORKS = 4
    MAINTENANCE_ROADWORKS = 5
    ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS = 6

    @classmethod
    def from_name(cls: typing.Type['RoadworksType'], item_name: str) -> 'RoadworksType':
        if item_name == 'LONG_TERM_ROADWORKS':
            item = RoadworksType.LONG_TERM_ROADWORKS
        elif item_name == 'CONSTRUCTION_WORK':
            item = RoadworksType.CONSTRUCTION_WORK
        elif item_name == 'BRIDGE_MAINTENANCE_WORK':
            item = RoadworksType.BRIDGE_MAINTENANCE_WORK
        elif item_name == 'RESURFACING_WORK':
            item = RoadworksType.RESURFACING_WORK
        elif item_name == 'MAJOR_ROADWORKS':
            item = RoadworksType.MAJOR_ROADWORKS
        elif item_name == 'MAINTENANCE_ROADWORKS':
            item = RoadworksType.MAINTENANCE_ROADWORKS
        elif item_name == 'ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS':
            item = RoadworksType.ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RoadworksType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RoadworksType'], reader: zserio.BitStreamReader) -> 'RoadworksType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['RoadworksType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RoadworksType':
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
