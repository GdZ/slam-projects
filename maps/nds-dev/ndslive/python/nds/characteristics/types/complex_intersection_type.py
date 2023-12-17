# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class ComplexIntersectionType(zserio.Enum):
    STANDARD_INTERSECTION = 0
    CONTROLLED_ACCESS_INTERSECTION = 1
    COMBINED_INTERSECTION = 2

    @classmethod
    def from_name(cls: typing.Type['ComplexIntersectionType'], item_name: str) -> 'ComplexIntersectionType':
        if item_name == 'STANDARD_INTERSECTION':
            item = ComplexIntersectionType.STANDARD_INTERSECTION
        elif item_name == 'CONTROLLED_ACCESS_INTERSECTION':
            item = ComplexIntersectionType.CONTROLLED_ACCESS_INTERSECTION
        elif item_name == 'COMBINED_INTERSECTION':
            item = ComplexIntersectionType.COMBINED_INTERSECTION
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'ComplexIntersectionType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['ComplexIntersectionType'], reader: zserio.BitStreamReader) -> 'ComplexIntersectionType':
        return cls(reader.read_bits(2))

    @classmethod
    def from_reader_packed(cls: typing.Type['ComplexIntersectionType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'ComplexIntersectionType':
        return cls(delta_context.read(zserio.array.BitFieldArrayTraits(2),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(2),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 2

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(2),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self.value, 2)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(2), writer, self.value)
