# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class LaneLayoutType(zserio.Enum):
    ORDERED = 0
    UNORDERED = 1

    @classmethod
    def from_name(cls: typing.Type['LaneLayoutType'], item_name: str) -> 'LaneLayoutType':
        if item_name == 'ORDERED':
            item = LaneLayoutType.ORDERED
        elif item_name == 'UNORDERED':
            item = LaneLayoutType.UNORDERED
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'LaneLayoutType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['LaneLayoutType'], reader: zserio.BitStreamReader) -> 'LaneLayoutType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['LaneLayoutType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'LaneLayoutType':
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
