# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class NameDisplayAreaAttributeType(zserio.Enum):
    ROAD_NAME = 0
    BRIDGE_NAME = 1
    TUNNEL_NAME = 2
    AREA_LABEL_NAME = 3
    BUILDING_NAME = 4
    NATURE_AREA_NAME = 5
    WATER_NAME = 6
    ADMINISTRATIVE_AREA_NAME = 7
    ADMINISTRATIVE_HIERARCHY = 8
    SERVICE_AREA_NAME = 9
    INTERSECTION_NAME = 10

    @classmethod
    def from_name(cls: typing.Type['NameDisplayAreaAttributeType'], item_name: str) -> 'NameDisplayAreaAttributeType':
        if item_name == 'ROAD_NAME':
            item = NameDisplayAreaAttributeType.ROAD_NAME
        elif item_name == 'BRIDGE_NAME':
            item = NameDisplayAreaAttributeType.BRIDGE_NAME
        elif item_name == 'TUNNEL_NAME':
            item = NameDisplayAreaAttributeType.TUNNEL_NAME
        elif item_name == 'AREA_LABEL_NAME':
            item = NameDisplayAreaAttributeType.AREA_LABEL_NAME
        elif item_name == 'BUILDING_NAME':
            item = NameDisplayAreaAttributeType.BUILDING_NAME
        elif item_name == 'NATURE_AREA_NAME':
            item = NameDisplayAreaAttributeType.NATURE_AREA_NAME
        elif item_name == 'WATER_NAME':
            item = NameDisplayAreaAttributeType.WATER_NAME
        elif item_name == 'ADMINISTRATIVE_AREA_NAME':
            item = NameDisplayAreaAttributeType.ADMINISTRATIVE_AREA_NAME
        elif item_name == 'ADMINISTRATIVE_HIERARCHY':
            item = NameDisplayAreaAttributeType.ADMINISTRATIVE_HIERARCHY
        elif item_name == 'SERVICE_AREA_NAME':
            item = NameDisplayAreaAttributeType.SERVICE_AREA_NAME
        elif item_name == 'INTERSECTION_NAME':
            item = NameDisplayAreaAttributeType.INTERSECTION_NAME
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'NameDisplayAreaAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['NameDisplayAreaAttributeType'], reader: zserio.BitStreamReader) -> 'NameDisplayAreaAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['NameDisplayAreaAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'NameDisplayAreaAttributeType':
        return cls(delta_context.read(zserio.array.VarUInt16ArrayTraits(),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt16ArrayTraits(),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint16(self.value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt16ArrayTraits(),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint16(self.value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt16ArrayTraits(), writer, self.value)
