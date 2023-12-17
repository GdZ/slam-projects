# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TrafficEnforcementCameraType(zserio.Enum):
    FIXED_SPEED = 0
    MOBILE_SPEED = 1
    REDLIGHT = 2
    TOLLROAD = 3
    PECCANCY = 4
    SPECIAL_LANE = 5
    FIXED_SPEED_AND_RED_LIGHT = 6
    BUS_LANE = 7
    FAKE = 8
    PARKING_VIOLATION = 9
    TRAFFIC_ENFORCEMENT_ZONE_ENTRY = 10
    TRAFFIC_ENFORCEMENT_ZONE_EXIT = 11
    MARKING_VIOLATION = 12
    TRAFFIC_INFORMATION_COLLECTION = 13
    BUS_LANE_AND_FIXED_SPEED = 14
    SHOULDER_LANE = 15
    MERGING_TRAFFIC = 16
    RAMP_METERING = 17
    NON_MOTORIZED_VEHICLE = 18
    YIELD_TO_PEDESTRIANS = 19
    ILLEGAL_LANE_OCCUPATION = 20
    PHONE_USAGE = 21
    SEAT_BELT = 22
    HORN_USAGE = 23
    ILLEGAL_LAMP_USAGE = 24
    OTHER = 31

    @classmethod
    def from_name(cls: typing.Type['TrafficEnforcementCameraType'], item_name: str) -> 'TrafficEnforcementCameraType':
        if item_name == 'FIXED_SPEED':
            item = TrafficEnforcementCameraType.FIXED_SPEED
        elif item_name == 'MOBILE_SPEED':
            item = TrafficEnforcementCameraType.MOBILE_SPEED
        elif item_name == 'REDLIGHT':
            item = TrafficEnforcementCameraType.REDLIGHT
        elif item_name == 'TOLLROAD':
            item = TrafficEnforcementCameraType.TOLLROAD
        elif item_name == 'PECCANCY':
            item = TrafficEnforcementCameraType.PECCANCY
        elif item_name == 'SPECIAL_LANE':
            item = TrafficEnforcementCameraType.SPECIAL_LANE
        elif item_name == 'FIXED_SPEED_AND_RED_LIGHT':
            item = TrafficEnforcementCameraType.FIXED_SPEED_AND_RED_LIGHT
        elif item_name == 'BUS_LANE':
            item = TrafficEnforcementCameraType.BUS_LANE
        elif item_name == 'FAKE':
            item = TrafficEnforcementCameraType.FAKE
        elif item_name == 'PARKING_VIOLATION':
            item = TrafficEnforcementCameraType.PARKING_VIOLATION
        elif item_name == 'TRAFFIC_ENFORCEMENT_ZONE_ENTRY':
            item = TrafficEnforcementCameraType.TRAFFIC_ENFORCEMENT_ZONE_ENTRY
        elif item_name == 'TRAFFIC_ENFORCEMENT_ZONE_EXIT':
            item = TrafficEnforcementCameraType.TRAFFIC_ENFORCEMENT_ZONE_EXIT
        elif item_name == 'MARKING_VIOLATION':
            item = TrafficEnforcementCameraType.MARKING_VIOLATION
        elif item_name == 'TRAFFIC_INFORMATION_COLLECTION':
            item = TrafficEnforcementCameraType.TRAFFIC_INFORMATION_COLLECTION
        elif item_name == 'BUS_LANE_AND_FIXED_SPEED':
            item = TrafficEnforcementCameraType.BUS_LANE_AND_FIXED_SPEED
        elif item_name == 'SHOULDER_LANE':
            item = TrafficEnforcementCameraType.SHOULDER_LANE
        elif item_name == 'MERGING_TRAFFIC':
            item = TrafficEnforcementCameraType.MERGING_TRAFFIC
        elif item_name == 'RAMP_METERING':
            item = TrafficEnforcementCameraType.RAMP_METERING
        elif item_name == 'NON_MOTORIZED_VEHICLE':
            item = TrafficEnforcementCameraType.NON_MOTORIZED_VEHICLE
        elif item_name == 'YIELD_TO_PEDESTRIANS':
            item = TrafficEnforcementCameraType.YIELD_TO_PEDESTRIANS
        elif item_name == 'ILLEGAL_LANE_OCCUPATION':
            item = TrafficEnforcementCameraType.ILLEGAL_LANE_OCCUPATION
        elif item_name == 'PHONE_USAGE':
            item = TrafficEnforcementCameraType.PHONE_USAGE
        elif item_name == 'SEAT_BELT':
            item = TrafficEnforcementCameraType.SEAT_BELT
        elif item_name == 'HORN_USAGE':
            item = TrafficEnforcementCameraType.HORN_USAGE
        elif item_name == 'ILLEGAL_LAMP_USAGE':
            item = TrafficEnforcementCameraType.ILLEGAL_LAMP_USAGE
        elif item_name == 'OTHER':
            item = TrafficEnforcementCameraType.OTHER
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'TrafficEnforcementCameraType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['TrafficEnforcementCameraType'], reader: zserio.BitStreamReader) -> 'TrafficEnforcementCameraType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['TrafficEnforcementCameraType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TrafficEnforcementCameraType':
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
