# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class NameUsageType(zserio.Enum):
    DEFAULT_OFFICIAL_NAME = 0
    OFFICIAL_NAME = 1
    PREFERRED_ALTERNATE_NAME = 2
    ALTERNATE_NAME = 3

    @classmethod
    def from_name(cls: typing.Type['NameUsageType'], item_name: str) -> 'NameUsageType':
        if item_name == 'DEFAULT_OFFICIAL_NAME':
            item = NameUsageType.DEFAULT_OFFICIAL_NAME
        elif item_name == 'OFFICIAL_NAME':
            item = NameUsageType.OFFICIAL_NAME
        elif item_name == 'PREFERRED_ALTERNATE_NAME':
            item = NameUsageType.PREFERRED_ALTERNATE_NAME
        elif item_name == 'ALTERNATE_NAME':
            item = NameUsageType.ALTERNATE_NAME
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'NameUsageType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['NameUsageType'], reader: zserio.BitStreamReader) -> 'NameUsageType':
        return cls(reader.read_bits(4))

    @classmethod
    def from_reader_packed(cls: typing.Type['NameUsageType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'NameUsageType':
        return cls(delta_context.read(zserio.array.BitFieldArrayTraits(4),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(4),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 4

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(4),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self.value, 4)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(4), writer, self.value)
