# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class GuidanceNameStringRelationType(zserio.Enum):
    SYNONYM = 0
    TRANSLITERATION = 1
    EXONYM = 2
    ALTERNATE_SPELLING = 3
    ABBREVIATION = 4

    @classmethod
    def from_name(cls: typing.Type['GuidanceNameStringRelationType'], item_name: str) -> 'GuidanceNameStringRelationType':
        if item_name == 'SYNONYM':
            item = GuidanceNameStringRelationType.SYNONYM
        elif item_name == 'TRANSLITERATION':
            item = GuidanceNameStringRelationType.TRANSLITERATION
        elif item_name == 'EXONYM':
            item = GuidanceNameStringRelationType.EXONYM
        elif item_name == 'ALTERNATE_SPELLING':
            item = GuidanceNameStringRelationType.ALTERNATE_SPELLING
        elif item_name == 'ABBREVIATION':
            item = GuidanceNameStringRelationType.ABBREVIATION
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'GuidanceNameStringRelationType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['GuidanceNameStringRelationType'], reader: zserio.BitStreamReader) -> 'GuidanceNameStringRelationType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['GuidanceNameStringRelationType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'GuidanceNameStringRelationType':
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