# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class AddressFormatElementType(zserio.Enum):
    ROAD = 0
    HOUSE = 1
    ADMINISTRATIVE_HIERARCHY_ELEMENT = 2
    ROAD_NUMBER = 3
    ROUTE_NAME = 4

    @classmethod
    def from_name(cls: typing.Type['AddressFormatElementType'], item_name: str) -> 'AddressFormatElementType':
        if item_name == 'ROAD':
            item = AddressFormatElementType.ROAD
        elif item_name == 'HOUSE':
            item = AddressFormatElementType.HOUSE
        elif item_name == 'ADMINISTRATIVE_HIERARCHY_ELEMENT':
            item = AddressFormatElementType.ADMINISTRATIVE_HIERARCHY_ELEMENT
        elif item_name == 'ROAD_NUMBER':
            item = AddressFormatElementType.ROAD_NUMBER
        elif item_name == 'ROUTE_NAME':
            item = AddressFormatElementType.ROUTE_NAME
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'AddressFormatElementType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['AddressFormatElementType'], reader: zserio.BitStreamReader) -> 'AddressFormatElementType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['AddressFormatElementType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'AddressFormatElementType':
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