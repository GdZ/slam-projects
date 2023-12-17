# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RulesRoadRangeAttributeType(zserio.Enum):
    PROHIBITED_PASSAGE = 0
    OVERTAKING_PROHIBITION = 1
    SPEED_LIMIT_METRIC = 2
    SPEED_LIMIT_IMPERIAL = 3
    MINIMUM_SPEED_METRIC = 4
    MINIMUM_SPEED_IMPERIAL = 5
    ADVISORY_SPEED_LIMIT_METRIC = 6
    ADVISORY_SPEED_LIMIT_IMPERIAL = 7
    TRAFFIC_ENFORCEMENT_ZONE = 8
    NON_DEFAULT_DRIVING_SIDE = 9
    TRAFFIC_ZONE = 10
    ADR_TUNNEL_CATEGORY = 11
    LICENSE_PLATE_RESTRICTION = 12
    SEASONAL_CLOSED = 13
    PROHIBITED_PARKING = 14
    PROHIBITED_STOPPING = 15
    DONT_STOP_ZONE = 16
    AUTOMATED_DRIVING_CLEARANCE = 17
    ROADWORKS = 18

    @classmethod
    def from_name(cls: typing.Type['RulesRoadRangeAttributeType'], item_name: str) -> 'RulesRoadRangeAttributeType':
        if item_name == 'PROHIBITED_PASSAGE':
            item = RulesRoadRangeAttributeType.PROHIBITED_PASSAGE
        elif item_name == 'OVERTAKING_PROHIBITION':
            item = RulesRoadRangeAttributeType.OVERTAKING_PROHIBITION
        elif item_name == 'SPEED_LIMIT_METRIC':
            item = RulesRoadRangeAttributeType.SPEED_LIMIT_METRIC
        elif item_name == 'SPEED_LIMIT_IMPERIAL':
            item = RulesRoadRangeAttributeType.SPEED_LIMIT_IMPERIAL
        elif item_name == 'MINIMUM_SPEED_METRIC':
            item = RulesRoadRangeAttributeType.MINIMUM_SPEED_METRIC
        elif item_name == 'MINIMUM_SPEED_IMPERIAL':
            item = RulesRoadRangeAttributeType.MINIMUM_SPEED_IMPERIAL
        elif item_name == 'ADVISORY_SPEED_LIMIT_METRIC':
            item = RulesRoadRangeAttributeType.ADVISORY_SPEED_LIMIT_METRIC
        elif item_name == 'ADVISORY_SPEED_LIMIT_IMPERIAL':
            item = RulesRoadRangeAttributeType.ADVISORY_SPEED_LIMIT_IMPERIAL
        elif item_name == 'TRAFFIC_ENFORCEMENT_ZONE':
            item = RulesRoadRangeAttributeType.TRAFFIC_ENFORCEMENT_ZONE
        elif item_name == 'NON_DEFAULT_DRIVING_SIDE':
            item = RulesRoadRangeAttributeType.NON_DEFAULT_DRIVING_SIDE
        elif item_name == 'TRAFFIC_ZONE':
            item = RulesRoadRangeAttributeType.TRAFFIC_ZONE
        elif item_name == 'ADR_TUNNEL_CATEGORY':
            item = RulesRoadRangeAttributeType.ADR_TUNNEL_CATEGORY
        elif item_name == 'LICENSE_PLATE_RESTRICTION':
            item = RulesRoadRangeAttributeType.LICENSE_PLATE_RESTRICTION
        elif item_name == 'SEASONAL_CLOSED':
            item = RulesRoadRangeAttributeType.SEASONAL_CLOSED
        elif item_name == 'PROHIBITED_PARKING':
            item = RulesRoadRangeAttributeType.PROHIBITED_PARKING
        elif item_name == 'PROHIBITED_STOPPING':
            item = RulesRoadRangeAttributeType.PROHIBITED_STOPPING
        elif item_name == 'DONT_STOP_ZONE':
            item = RulesRoadRangeAttributeType.DONT_STOP_ZONE
        elif item_name == 'AUTOMATED_DRIVING_CLEARANCE':
            item = RulesRoadRangeAttributeType.AUTOMATED_DRIVING_CLEARANCE
        elif item_name == 'ROADWORKS':
            item = RulesRoadRangeAttributeType.ROADWORKS
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RulesRoadRangeAttributeType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RulesRoadRangeAttributeType'], reader: zserio.BitStreamReader) -> 'RulesRoadRangeAttributeType':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['RulesRoadRangeAttributeType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RulesRoadRangeAttributeType':
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
