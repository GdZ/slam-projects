# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class PropertyType(zserio.Enum):
    CORE = 0
    LANGUAGE_CODE = 1
    USAGE_TYPE = 2
    DETAIL_TYPE = 3
    PREFERRED_NAME = 4
    ADDRESS_ONLY = 5
    ROAD_NAME_ID = 6
    NOT_ADDRESS_RELEVANT = 7
    ADDRESS_FORMAT_ID = 8
    ROAD_NUMBER_PREFIX = 9
    ROAD_NUMBER_SUFFIX = 10
    ROAD_ADDRESS_POINT = 11
    LANE_ADDRESS_POINT = 12
    HOUSE_POSITION = 13
    PHONETIC_TRANSCRIPTION = 14
    PREFER_ROAD_NAME_OVER_ROAD_NUMBER = 15

    @classmethod
    def from_name(cls: typing.Type['PropertyType'], item_name: str) -> 'PropertyType':
        if item_name == 'CORE':
            item = PropertyType.CORE
        elif item_name == 'LANGUAGE_CODE':
            item = PropertyType.LANGUAGE_CODE
        elif item_name == 'USAGE_TYPE':
            item = PropertyType.USAGE_TYPE
        elif item_name == 'DETAIL_TYPE':
            item = PropertyType.DETAIL_TYPE
        elif item_name == 'PREFERRED_NAME':
            item = PropertyType.PREFERRED_NAME
        elif item_name == 'ADDRESS_ONLY':
            item = PropertyType.ADDRESS_ONLY
        elif item_name == 'ROAD_NAME_ID':
            item = PropertyType.ROAD_NAME_ID
        elif item_name == 'NOT_ADDRESS_RELEVANT':
            item = PropertyType.NOT_ADDRESS_RELEVANT
        elif item_name == 'ADDRESS_FORMAT_ID':
            item = PropertyType.ADDRESS_FORMAT_ID
        elif item_name == 'ROAD_NUMBER_PREFIX':
            item = PropertyType.ROAD_NUMBER_PREFIX
        elif item_name == 'ROAD_NUMBER_SUFFIX':
            item = PropertyType.ROAD_NUMBER_SUFFIX
        elif item_name == 'ROAD_ADDRESS_POINT':
            item = PropertyType.ROAD_ADDRESS_POINT
        elif item_name == 'LANE_ADDRESS_POINT':
            item = PropertyType.LANE_ADDRESS_POINT
        elif item_name == 'HOUSE_POSITION':
            item = PropertyType.HOUSE_POSITION
        elif item_name == 'PHONETIC_TRANSCRIPTION':
            item = PropertyType.PHONETIC_TRANSCRIPTION
        elif item_name == 'PREFER_ROAD_NAME_OVER_ROAD_NUMBER':
            item = PropertyType.PREFER_ROAD_NAME_OVER_ROAD_NUMBER
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'PropertyType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['PropertyType'], reader: zserio.BitStreamReader) -> 'PropertyType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['PropertyType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'PropertyType':
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
