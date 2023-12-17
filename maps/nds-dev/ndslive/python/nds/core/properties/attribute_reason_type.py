# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class AttributeReasonType(zserio.Enum):
    DYNAMICALLY_CONTROLLED = 0
    POSTED = 1
    COUNTRY_DRIVING_RULES = 2

    @classmethod
    def from_name(cls: typing.Type['AttributeReasonType'], item_name: str) -> 'AttributeReasonType':
        if item_name == 'DYNAMICALLY_CONTROLLED':
            item = AttributeReasonType.DYNAMICALLY_CONTROLLED
        elif item_name == 'POSTED':
            item = AttributeReasonType.POSTED
        elif item_name == 'COUNTRY_DRIVING_RULES':
            item = AttributeReasonType.COUNTRY_DRIVING_RULES
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'AttributeReasonType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['AttributeReasonType'], reader: zserio.BitStreamReader) -> 'AttributeReasonType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['AttributeReasonType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'AttributeReasonType':
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
