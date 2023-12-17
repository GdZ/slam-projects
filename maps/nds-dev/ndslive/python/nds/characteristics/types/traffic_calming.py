# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TrafficCalming(zserio.Enum):
    OTHER = 0
    SPEED_BUMP = 1
    SPEED_HUMP = 2
    SPEED_CUSHION = 3
    SPEED_TABLE = 4

    @classmethod
    def from_name(cls: typing.Type['TrafficCalming'], item_name: str) -> 'TrafficCalming':
        if item_name == 'OTHER':
            item = TrafficCalming.OTHER
        elif item_name == 'SPEED_BUMP':
            item = TrafficCalming.SPEED_BUMP
        elif item_name == 'SPEED_HUMP':
            item = TrafficCalming.SPEED_HUMP
        elif item_name == 'SPEED_CUSHION':
            item = TrafficCalming.SPEED_CUSHION
        elif item_name == 'SPEED_TABLE':
            item = TrafficCalming.SPEED_TABLE
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'TrafficCalming'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['TrafficCalming'], reader: zserio.BitStreamReader) -> 'TrafficCalming':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['TrafficCalming'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TrafficCalming':
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
