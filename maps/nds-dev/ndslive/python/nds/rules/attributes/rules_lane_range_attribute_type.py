# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RulesLaneRangeAttributeType(zserio.Enum):
    PROHIBITED_PASSAGE = 0
    OVERTAKING_PROHIBITION = 1
    SPEED_LIMIT_METRIC = 2
    SPEED_LIMIT_IMPERIAL = 3
    MINIMUM_SPEED_METRIC = 4
    MINIMUM_SPEED_IMPERIAL = 5
    ADVISORY_SPEED_LIMIT_METRIC = 6
    ADVISORY_SPEED_LIMIT_IMPERIAL = 7
    TRAFFIC_ENFORCEMENT_ZONE = 8
    TRAFFIC_ZONE = 9
    SEASONAL_CLOSED = 10
    DONT_STOP_ZONE = 11
    PROHIBITED_PARKING = 12
    PROHIBITED_STOPPING = 13
    AUTOMATED_DRIVING_CLEARANCE = 14
    ROADWORKS = 15
    LANE_RIGHT_OF_WAY_REGULATION = 16
    LANE_TRAFFIC_PRIORITY = 17

    @classmethod
    def from_name(cls: typing.Type['RulesLaneRangeAttributeType'], item_name: str) -> 'RulesLaneRangeAttributeType':
        if item_name == 'PROHIBITED_PASSAGE':
            item = RulesLaneRangeAttributeType.PROHIBITED_PASSAGE
        elif item_name == 'OVERTAKING_PROHIBITION':
            item = RulesLaneRangeAttributeType.OVERTAKING_PROHIBITION
        elif item_name == 'SPEED_LIMIT_METRIC':
            item = RulesLaneRangeAttributeType.SPEED_LIMIT_METRIC
        elif item_name == 'SPEED_LIMIT_IMPERIAL':
            item = RulesLaneRangeAttributeType.SPEED_LIMIT_IMPERIAL
        elif item_name == 'MINIMUM_SPEED_METRIC':
            item = RulesLaneRangeAttributeType.MINIMUM_SPEED_METRIC
        elif item_name == 'MINIMUM_SPEED_IMPERIAL':
            item = RulesLaneRangeAttributeType.MINIMUM_SPEED_IMPERIAL
        elif item_name == 'ADVISORY_SPEED_LIMIT_METRIC':
            item = RulesLaneRangeAttributeType.ADVISORY_SPEED_LIMIT_METRIC
        elif item_name == 'ADVISORY_SPEED_LIMIT_IMPERIAL':
            item = RulesLaneRangeAttributeType.ADVISORY_SPEED_LIMIT_IMPERIAL
        elif item_name == 'TRAFFIC_ENFORCEMENT_ZONE':
            item = RulesLaneRangeAttributeType.TRAFFIC_ENFORCEMENT_ZONE
        elif item_name == 'TRAFFIC_ZONE':
            item = RulesLaneRangeAttributeType.TRAFFIC_ZONE
        elif item_name == 'SEASONAL_CLOSED':
            item = RulesLaneRangeAttributeType.SEASONAL_CLOSED
        elif item_name == 'DONT_STOP_ZONE':
            item = RulesLaneRangeAttributeType.DONT_STOP_ZONE
        elif item_name == 'PROHIBITED_PARKING':
            item = RulesLaneRangeAttributeType.PROHIBITED_PARKING
        elif item_name == 'PROHIBITED_STOPPING':
            item = RulesLaneRangeAttributeType.PROHIBITED_STOPPING
        elif item_name == 'AUTOMATED_DRIVING_CLEARANCE':
            item = RulesLaneRangeAttributeType.AUTOMATED_DRIVING_CLEARANCE
        elif item_name == 'ROADWORKS':
            item = RulesLaneRangeAttributeType.ROADWORKS
        elif item_name == 'LANE_RIGHT_OF_WAY_REGULATION':
            item = RulesLaneRangeAttributeType.LANE_RIGHT_OF_WAY_REGULATION
        elif item_name == 'LANE_TRAFFIC_PRIORITY':
            item = RulesLaneRangeAttributeType.LANE_TRAFFIC_PRIORITY
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RulesLaneRangeAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RulesLaneRangeAttributeType'], reader: zserio.BitStreamReader) -> 'RulesLaneRangeAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['RulesLaneRangeAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RulesLaneRangeAttributeType':
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
