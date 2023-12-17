# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class CharacsLaneRangeAttributeType(zserio.Enum):
    LANE_TYPE = 0
    PHYSICAL_WIDTH_METRIC = 1
    TYPE_OF_PAVEMENT = 2
    GRADE_TYPE = 3
    RAILWAY_CROSSING = 4
    PEDESTRIAN_CROSSING = 5
    DIVIDER_TYPE = 6
    SUPERELEVATION = 7
    AVERAGE_SPEED = 8
    FUNCTIONAL_ROAD_CLASS = 9
    PRIORITY_ROAD_CLASS = 10
    STATION_PLAZA_TYPE = 11
    TRAFFIC_CALMING = 12
    MOVABLE_BRIDGE = 13
    ROAD_MEDIAN = 14
    HAS_SIDEWALK = 15
    FRICTION = 16
    LANE_WIDTH_STATE = 17
    COMPLEX_INTERSECTION_TYPE = 18
    START_OR_DESTINATION_ROAD_ONLY = 19
    ROAD_LOCATION_ID = 20
    HAS_STREET_LIGHTS = 21
    SHARED_ROAD_SURFACE_WITH_PEDESTRIANS = 22
    IN_BUSINESS_DISTRICT = 23
    FERRY_TYPE = 24
    STUBBLE = 25
    MIDDLE_DIVIDER_TYPE = 26
    MULTI_DIGITIZED_LANE_GROUP_REFERENCE = 27
    GLOBAL_SOURCE_ID = 28

    @classmethod
    def from_name(cls: typing.Type['CharacsLaneRangeAttributeType'], item_name: str) -> 'CharacsLaneRangeAttributeType':
        if item_name == 'LANE_TYPE':
            item = CharacsLaneRangeAttributeType.LANE_TYPE
        elif item_name == 'PHYSICAL_WIDTH_METRIC':
            item = CharacsLaneRangeAttributeType.PHYSICAL_WIDTH_METRIC
        elif item_name == 'TYPE_OF_PAVEMENT':
            item = CharacsLaneRangeAttributeType.TYPE_OF_PAVEMENT
        elif item_name == 'GRADE_TYPE':
            item = CharacsLaneRangeAttributeType.GRADE_TYPE
        elif item_name == 'RAILWAY_CROSSING':
            item = CharacsLaneRangeAttributeType.RAILWAY_CROSSING
        elif item_name == 'PEDESTRIAN_CROSSING':
            item = CharacsLaneRangeAttributeType.PEDESTRIAN_CROSSING
        elif item_name == 'DIVIDER_TYPE':
            item = CharacsLaneRangeAttributeType.DIVIDER_TYPE
        elif item_name == 'SUPERELEVATION':
            item = CharacsLaneRangeAttributeType.SUPERELEVATION
        elif item_name == 'AVERAGE_SPEED':
            item = CharacsLaneRangeAttributeType.AVERAGE_SPEED
        elif item_name == 'FUNCTIONAL_ROAD_CLASS':
            item = CharacsLaneRangeAttributeType.FUNCTIONAL_ROAD_CLASS
        elif item_name == 'PRIORITY_ROAD_CLASS':
            item = CharacsLaneRangeAttributeType.PRIORITY_ROAD_CLASS
        elif item_name == 'STATION_PLAZA_TYPE':
            item = CharacsLaneRangeAttributeType.STATION_PLAZA_TYPE
        elif item_name == 'TRAFFIC_CALMING':
            item = CharacsLaneRangeAttributeType.TRAFFIC_CALMING
        elif item_name == 'MOVABLE_BRIDGE':
            item = CharacsLaneRangeAttributeType.MOVABLE_BRIDGE
        elif item_name == 'ROAD_MEDIAN':
            item = CharacsLaneRangeAttributeType.ROAD_MEDIAN
        elif item_name == 'HAS_SIDEWALK':
            item = CharacsLaneRangeAttributeType.HAS_SIDEWALK
        elif item_name == 'FRICTION':
            item = CharacsLaneRangeAttributeType.FRICTION
        elif item_name == 'LANE_WIDTH_STATE':
            item = CharacsLaneRangeAttributeType.LANE_WIDTH_STATE
        elif item_name == 'COMPLEX_INTERSECTION_TYPE':
            item = CharacsLaneRangeAttributeType.COMPLEX_INTERSECTION_TYPE
        elif item_name == 'START_OR_DESTINATION_ROAD_ONLY':
            item = CharacsLaneRangeAttributeType.START_OR_DESTINATION_ROAD_ONLY
        elif item_name == 'ROAD_LOCATION_ID':
            item = CharacsLaneRangeAttributeType.ROAD_LOCATION_ID
        elif item_name == 'HAS_STREET_LIGHTS':
            item = CharacsLaneRangeAttributeType.HAS_STREET_LIGHTS
        elif item_name == 'SHARED_ROAD_SURFACE_WITH_PEDESTRIANS':
            item = CharacsLaneRangeAttributeType.SHARED_ROAD_SURFACE_WITH_PEDESTRIANS
        elif item_name == 'IN_BUSINESS_DISTRICT':
            item = CharacsLaneRangeAttributeType.IN_BUSINESS_DISTRICT
        elif item_name == 'FERRY_TYPE':
            item = CharacsLaneRangeAttributeType.FERRY_TYPE
        elif item_name == 'STUBBLE':
            item = CharacsLaneRangeAttributeType.STUBBLE
        elif item_name == 'MIDDLE_DIVIDER_TYPE':
            item = CharacsLaneRangeAttributeType.MIDDLE_DIVIDER_TYPE
        elif item_name == 'MULTI_DIGITIZED_LANE_GROUP_REFERENCE':
            item = CharacsLaneRangeAttributeType.MULTI_DIGITIZED_LANE_GROUP_REFERENCE
        elif item_name == 'GLOBAL_SOURCE_ID':
            item = CharacsLaneRangeAttributeType.GLOBAL_SOURCE_ID
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'CharacsLaneRangeAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['CharacsLaneRangeAttributeType'], reader: zserio.BitStreamReader) -> 'CharacsLaneRangeAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['CharacsLaneRangeAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'CharacsLaneRangeAttributeType':
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
