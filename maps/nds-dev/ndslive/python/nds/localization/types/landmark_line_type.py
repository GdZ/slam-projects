# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class LandmarkLineType(zserio.Enum):
    GUARDRAIL_POST = 0
    LIGHT_POLE = 1
    DELINEATOR_POST = 2
    REFLECTOR_POST = 3
    GANTRY_POLE = 4
    SIGNPOST_POLE = 5
    POLE_UNKNOWN = 6
    CURB = 7
    WALL_FLAT = 8
    WALL_TUNNEL = 9
    BARRIER_JERSEY = 10
    BARRIER_SOUND = 11
    BARRIER_CABLE = 12
    GUARDRAIL = 13
    FENCE = 14
    CLIFF = 15
    DITCH = 16

    @classmethod
    def from_name(cls: typing.Type['LandmarkLineType'], item_name: str) -> 'LandmarkLineType':
        if item_name == 'GUARDRAIL_POST':
            item = LandmarkLineType.GUARDRAIL_POST
        elif item_name == 'LIGHT_POLE':
            item = LandmarkLineType.LIGHT_POLE
        elif item_name == 'DELINEATOR_POST':
            item = LandmarkLineType.DELINEATOR_POST
        elif item_name == 'REFLECTOR_POST':
            item = LandmarkLineType.REFLECTOR_POST
        elif item_name == 'GANTRY_POLE':
            item = LandmarkLineType.GANTRY_POLE
        elif item_name == 'SIGNPOST_POLE':
            item = LandmarkLineType.SIGNPOST_POLE
        elif item_name == 'POLE_UNKNOWN':
            item = LandmarkLineType.POLE_UNKNOWN
        elif item_name == 'CURB':
            item = LandmarkLineType.CURB
        elif item_name == 'WALL_FLAT':
            item = LandmarkLineType.WALL_FLAT
        elif item_name == 'WALL_TUNNEL':
            item = LandmarkLineType.WALL_TUNNEL
        elif item_name == 'BARRIER_JERSEY':
            item = LandmarkLineType.BARRIER_JERSEY
        elif item_name == 'BARRIER_SOUND':
            item = LandmarkLineType.BARRIER_SOUND
        elif item_name == 'BARRIER_CABLE':
            item = LandmarkLineType.BARRIER_CABLE
        elif item_name == 'GUARDRAIL':
            item = LandmarkLineType.GUARDRAIL
        elif item_name == 'FENCE':
            item = LandmarkLineType.FENCE
        elif item_name == 'CLIFF':
            item = LandmarkLineType.CLIFF
        elif item_name == 'DITCH':
            item = LandmarkLineType.DITCH
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'LandmarkLineType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['LandmarkLineType'], reader: zserio.BitStreamReader) -> 'LandmarkLineType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['LandmarkLineType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'LandmarkLineType':
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
