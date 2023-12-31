# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class AdasAccuracy(zserio.Enum):
    UNKNOWN = 0
    LOW = 1
    MIDDLE = 2
    HIGH = 3

    @classmethod
    def from_name(cls: typing.Type['AdasAccuracy'], item_name: str) -> 'AdasAccuracy':
        if item_name == 'UNKNOWN':
            item = AdasAccuracy.UNKNOWN
        elif item_name == 'LOW':
            item = AdasAccuracy.LOW
        elif item_name == 'MIDDLE':
            item = AdasAccuracy.MIDDLE
        elif item_name == 'HIGH':
            item = AdasAccuracy.HIGH
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'AdasAccuracy'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['AdasAccuracy'], reader: zserio.BitStreamReader) -> 'AdasAccuracy':
        return cls(reader.read_bits(2))

    @classmethod
    def from_reader_packed(cls: typing.Type['AdasAccuracy'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'AdasAccuracy':
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
