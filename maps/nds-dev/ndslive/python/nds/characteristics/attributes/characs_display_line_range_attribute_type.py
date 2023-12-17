# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class CharacsDisplayLineRangeAttributeType(zserio.Enum):
    ROAD_TYPE = 0
    PHYSICAL_WIDTH_METRIC = 1
    TYPE_OF_PAVEMENT = 2
    AVERAGE_SPEED = 3
    FUNCTIONAL_ROAD_CLASS = 4
    PRIORITY_ROAD_CLASS = 5
    STATION_PLAZA_TYPE = 6
    MOVABLE_BRIDGE = 7
    HAS_SIDEWALK = 8
    COMPLEX_INTERSECTION_TYPE = 9
    ROAD_LOCATION_ID = 10
    HAS_STREET_LIGHTS = 11
    SHARED_ROAD_SURFACE_WITH_PEDESTRIANS = 12
    IN_BUSINESS_DISTRICT = 13
    COMPLETE_CARPOOL_ROAD = 14
    PARTIAL_CARPOOL_ROAD = 15
    FERRY_TYPE = 16
    GLOBAL_SOURCE_ID = 17

    @classmethod
    def from_name(cls: typing.Type['CharacsDisplayLineRangeAttributeType'], item_name: str) -> 'CharacsDisplayLineRangeAttributeType':
        if item_name == 'ROAD_TYPE':
            item = CharacsDisplayLineRangeAttributeType.ROAD_TYPE
        elif item_name == 'PHYSICAL_WIDTH_METRIC':
            item = CharacsDisplayLineRangeAttributeType.PHYSICAL_WIDTH_METRIC
        elif item_name == 'TYPE_OF_PAVEMENT':
            item = CharacsDisplayLineRangeAttributeType.TYPE_OF_PAVEMENT
        elif item_name == 'AVERAGE_SPEED':
            item = CharacsDisplayLineRangeAttributeType.AVERAGE_SPEED
        elif item_name == 'FUNCTIONAL_ROAD_CLASS':
            item = CharacsDisplayLineRangeAttributeType.FUNCTIONAL_ROAD_CLASS
        elif item_name == 'PRIORITY_ROAD_CLASS':
            item = CharacsDisplayLineRangeAttributeType.PRIORITY_ROAD_CLASS
        elif item_name == 'STATION_PLAZA_TYPE':
            item = CharacsDisplayLineRangeAttributeType.STATION_PLAZA_TYPE
        elif item_name == 'MOVABLE_BRIDGE':
            item = CharacsDisplayLineRangeAttributeType.MOVABLE_BRIDGE
        elif item_name == 'HAS_SIDEWALK':
            item = CharacsDisplayLineRangeAttributeType.HAS_SIDEWALK
        elif item_name == 'COMPLEX_INTERSECTION_TYPE':
            item = CharacsDisplayLineRangeAttributeType.COMPLEX_INTERSECTION_TYPE
        elif item_name == 'ROAD_LOCATION_ID':
            item = CharacsDisplayLineRangeAttributeType.ROAD_LOCATION_ID
        elif item_name == 'HAS_STREET_LIGHTS':
            item = CharacsDisplayLineRangeAttributeType.HAS_STREET_LIGHTS
        elif item_name == 'SHARED_ROAD_SURFACE_WITH_PEDESTRIANS':
            item = CharacsDisplayLineRangeAttributeType.SHARED_ROAD_SURFACE_WITH_PEDESTRIANS
        elif item_name == 'IN_BUSINESS_DISTRICT':
            item = CharacsDisplayLineRangeAttributeType.IN_BUSINESS_DISTRICT
        elif item_name == 'COMPLETE_CARPOOL_ROAD':
            item = CharacsDisplayLineRangeAttributeType.COMPLETE_CARPOOL_ROAD
        elif item_name == 'PARTIAL_CARPOOL_ROAD':
            item = CharacsDisplayLineRangeAttributeType.PARTIAL_CARPOOL_ROAD
        elif item_name == 'FERRY_TYPE':
            item = CharacsDisplayLineRangeAttributeType.FERRY_TYPE
        elif item_name == 'GLOBAL_SOURCE_ID':
            item = CharacsDisplayLineRangeAttributeType.GLOBAL_SOURCE_ID
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'CharacsDisplayLineRangeAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['CharacsDisplayLineRangeAttributeType'], reader: zserio.BitStreamReader) -> 'CharacsDisplayLineRangeAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['CharacsDisplayLineRangeAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'CharacsDisplayLineRangeAttributeType':
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
