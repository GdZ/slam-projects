# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RulesLaneTransitionAttributeType(zserio.Enum):
    TURN_ON_RED_ALLOWED = 0
    PROHIBITED_TRANSITION = 1
    PREFERRED_U_TURN = 2

    @classmethod
    def from_name(cls: typing.Type['RulesLaneTransitionAttributeType'], item_name: str) -> 'RulesLaneTransitionAttributeType':
        if item_name == 'TURN_ON_RED_ALLOWED':
            item = RulesLaneTransitionAttributeType.TURN_ON_RED_ALLOWED
        elif item_name == 'PROHIBITED_TRANSITION':
            item = RulesLaneTransitionAttributeType.PROHIBITED_TRANSITION
        elif item_name == 'PREFERRED_U_TURN':
            item = RulesLaneTransitionAttributeType.PREFERRED_U_TURN
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RulesLaneTransitionAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RulesLaneTransitionAttributeType'], reader: zserio.BitStreamReader) -> 'RulesLaneTransitionAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['RulesLaneTransitionAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RulesLaneTransitionAttributeType':
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
