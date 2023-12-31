# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class AttributeReasonPositionAvailability(zserio.Enum):
    NONE = 0
    POSITION_2D = 1
    POSITION_3D = 2

    @classmethod
    def from_name(cls: typing.Type['AttributeReasonPositionAvailability'], item_name: str) -> 'AttributeReasonPositionAvailability':
        if item_name == 'NONE':
            item = AttributeReasonPositionAvailability.NONE
        elif item_name == 'POSITION_2D':
            item = AttributeReasonPositionAvailability.POSITION_2D
        elif item_name == 'POSITION_3D':
            item = AttributeReasonPositionAvailability.POSITION_3D
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'AttributeReasonPositionAvailability'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['AttributeReasonPositionAvailability'], reader: zserio.BitStreamReader) -> 'AttributeReasonPositionAvailability':
        return cls(reader.read_bits(2))

    @classmethod
    def from_reader_packed(cls: typing.Type['AttributeReasonPositionAvailability'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'AttributeReasonPositionAvailability':
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
