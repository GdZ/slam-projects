# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RulesRoadPositionAttributeType(zserio.Enum):
    TRAFFIC_LIGHTS = 0
    TRAFFIC_ENFORCEMENT_CAMERA = 1
    WARNING_SIGN = 2
    MOVABLE_WARNING_SIGN = 3

    @classmethod
    def from_name(cls: typing.Type['RulesRoadPositionAttributeType'], item_name: str) -> 'RulesRoadPositionAttributeType':
        if item_name == 'TRAFFIC_LIGHTS':
            item = RulesRoadPositionAttributeType.TRAFFIC_LIGHTS
        elif item_name == 'TRAFFIC_ENFORCEMENT_CAMERA':
            item = RulesRoadPositionAttributeType.TRAFFIC_ENFORCEMENT_CAMERA
        elif item_name == 'WARNING_SIGN':
            item = RulesRoadPositionAttributeType.WARNING_SIGN
        elif item_name == 'MOVABLE_WARNING_SIGN':
            item = RulesRoadPositionAttributeType.MOVABLE_WARNING_SIGN
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RulesRoadPositionAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RulesRoadPositionAttributeType'], reader: zserio.BitStreamReader) -> 'RulesRoadPositionAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['RulesRoadPositionAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RulesRoadPositionAttributeType':
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
