# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class MarkingMaterial(zserio.Enum):
    UNKNOWN = 0
    VIBRATION_MARKINGS = 1
    PAINTED_VIBRATION_DIVIDER = 2
    PAINTED = 3

    @classmethod
    def from_name(cls: typing.Type['MarkingMaterial'], item_name: str) -> 'MarkingMaterial':
        if item_name == 'UNKNOWN':
            item = MarkingMaterial.UNKNOWN
        elif item_name == 'VIBRATION_MARKINGS':
            item = MarkingMaterial.VIBRATION_MARKINGS
        elif item_name == 'PAINTED_VIBRATION_DIVIDER':
            item = MarkingMaterial.PAINTED_VIBRATION_DIVIDER
        elif item_name == 'PAINTED':
            item = MarkingMaterial.PAINTED
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'MarkingMaterial'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['MarkingMaterial'], reader: zserio.BitStreamReader) -> 'MarkingMaterial':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['MarkingMaterial'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'MarkingMaterial':
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
