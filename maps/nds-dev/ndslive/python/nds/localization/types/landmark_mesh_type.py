# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class LandmarkMeshType(zserio.Enum):
    TRAFFIC_LIGHT_BOX = 0
    BOX = 1
    PILLAR = 2
    STREET_LIGHTS = 3
    WALL = 4
    ACCESS_BOOTH = 5
    TICKET_MACHINE = 6
    BUILDING_CEILING_BEAM = 7
    BUILDING_COLUMN = 8
    BUILDING_CONNECTING_RAMP = 9
    BUILDING_STAIRS = 10

    @classmethod
    def from_name(cls: typing.Type['LandmarkMeshType'], item_name: str) -> 'LandmarkMeshType':
        if item_name == 'TRAFFIC_LIGHT_BOX':
            item = LandmarkMeshType.TRAFFIC_LIGHT_BOX
        elif item_name == 'BOX':
            item = LandmarkMeshType.BOX
        elif item_name == 'PILLAR':
            item = LandmarkMeshType.PILLAR
        elif item_name == 'STREET_LIGHTS':
            item = LandmarkMeshType.STREET_LIGHTS
        elif item_name == 'WALL':
            item = LandmarkMeshType.WALL
        elif item_name == 'ACCESS_BOOTH':
            item = LandmarkMeshType.ACCESS_BOOTH
        elif item_name == 'TICKET_MACHINE':
            item = LandmarkMeshType.TICKET_MACHINE
        elif item_name == 'BUILDING_CEILING_BEAM':
            item = LandmarkMeshType.BUILDING_CEILING_BEAM
        elif item_name == 'BUILDING_COLUMN':
            item = LandmarkMeshType.BUILDING_COLUMN
        elif item_name == 'BUILDING_CONNECTING_RAMP':
            item = LandmarkMeshType.BUILDING_CONNECTING_RAMP
        elif item_name == 'BUILDING_STAIRS':
            item = LandmarkMeshType.BUILDING_STAIRS
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'LandmarkMeshType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['LandmarkMeshType'], reader: zserio.BitStreamReader) -> 'LandmarkMeshType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['LandmarkMeshType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'LandmarkMeshType':
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
