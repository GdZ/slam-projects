# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class NameDisplayLineRangeAttributeType(zserio.Enum):
    ROAD_NAME = 0
    BRIDGE_NAME = 1
    TUNNEL_NAME = 2
    ROUTE_NAME = 3
    ROAD_NUMBER = 4
    ADMINISTRATIVE_HIERARCHY = 5
    LINE_LABEL_NAME = 6
    WATER_NAME = 7
    PUBLIC_TRANSPORT_NAME = 8
    BORDER_NAME = 9
    SERVICE_AREA_NAME = 10
    INTERSECTION_NAME = 11

    @classmethod
    def from_name(cls: typing.Type['NameDisplayLineRangeAttributeType'], item_name: str) -> 'NameDisplayLineRangeAttributeType':
        if item_name == 'ROAD_NAME':
            item = NameDisplayLineRangeAttributeType.ROAD_NAME
        elif item_name == 'BRIDGE_NAME':
            item = NameDisplayLineRangeAttributeType.BRIDGE_NAME
        elif item_name == 'TUNNEL_NAME':
            item = NameDisplayLineRangeAttributeType.TUNNEL_NAME
        elif item_name == 'ROUTE_NAME':
            item = NameDisplayLineRangeAttributeType.ROUTE_NAME
        elif item_name == 'ROAD_NUMBER':
            item = NameDisplayLineRangeAttributeType.ROAD_NUMBER
        elif item_name == 'ADMINISTRATIVE_HIERARCHY':
            item = NameDisplayLineRangeAttributeType.ADMINISTRATIVE_HIERARCHY
        elif item_name == 'LINE_LABEL_NAME':
            item = NameDisplayLineRangeAttributeType.LINE_LABEL_NAME
        elif item_name == 'WATER_NAME':
            item = NameDisplayLineRangeAttributeType.WATER_NAME
        elif item_name == 'PUBLIC_TRANSPORT_NAME':
            item = NameDisplayLineRangeAttributeType.PUBLIC_TRANSPORT_NAME
        elif item_name == 'BORDER_NAME':
            item = NameDisplayLineRangeAttributeType.BORDER_NAME
        elif item_name == 'SERVICE_AREA_NAME':
            item = NameDisplayLineRangeAttributeType.SERVICE_AREA_NAME
        elif item_name == 'INTERSECTION_NAME':
            item = NameDisplayLineRangeAttributeType.INTERSECTION_NAME
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'NameDisplayLineRangeAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['NameDisplayLineRangeAttributeType'], reader: zserio.BitStreamReader) -> 'NameDisplayLineRangeAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['NameDisplayLineRangeAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'NameDisplayLineRangeAttributeType':
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
