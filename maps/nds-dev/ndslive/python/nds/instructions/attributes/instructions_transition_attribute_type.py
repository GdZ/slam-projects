# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class InstructionsTransitionAttributeType(zserio.Enum):
    SIGNPOST_IMAGE = 0
    SIGNPOST_INSTRUCTION = 1
    LANE_INSTRUCTION = 2
    JUNCTION_VIEW = 3

    @classmethod
    def from_name(cls: typing.Type['InstructionsTransitionAttributeType'], item_name: str) -> 'InstructionsTransitionAttributeType':
        if item_name == 'SIGNPOST_IMAGE':
            item = InstructionsTransitionAttributeType.SIGNPOST_IMAGE
        elif item_name == 'SIGNPOST_INSTRUCTION':
            item = InstructionsTransitionAttributeType.SIGNPOST_INSTRUCTION
        elif item_name == 'LANE_INSTRUCTION':
            item = InstructionsTransitionAttributeType.LANE_INSTRUCTION
        elif item_name == 'JUNCTION_VIEW':
            item = InstructionsTransitionAttributeType.JUNCTION_VIEW
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'InstructionsTransitionAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['InstructionsTransitionAttributeType'], reader: zserio.BitStreamReader) -> 'InstructionsTransitionAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['InstructionsTransitionAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'InstructionsTransitionAttributeType':
        return cls(delta_context.read(zserio.array.VarUInt16ArrayTraits(),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt16ArrayTraits(),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint16(self.value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt16ArrayTraits(),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint16(self.value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt16ArrayTraits(), writer, self.value)
