# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RoadCharacter(zserio.Enum):
    URBAN = 0
    SERVICE_AREA = 1
    PARKING = 2
    COVERED = 3
    MOTORWAY = 4
    EXPRESSWAY = 5
    FERRY = 6
    TUNNEL = 7
    BRIDGE = 8
    MULTI_DIGITIZED = 9
    COMPLEX_INTERSECTION = 10
    IS_ELEVATED_ROAD = 11
    OVERPASS = 12
    UNDERPASS = 13
    RACE_TRACK = 14
    INSIDE_CITY_LIMITS = 15
    PEDESTRIAN_ZONE = 16
    CONTROLLED_ACCESS = 17
    PHYSICALLY_SEPARATED = 18
    TRACKS_ON_ROAD = 19
    BICYCLE_PATH = 20
    BUS_ROAD = 21
    HORSE_WAY = 22
    TAXI_ROAD = 23
    EMERGENCY_ROAD = 24
    TRUCK_ESCAPE_RAMP = 25
    EXPRESS_ROAD = 26
    STATION_PLAZA = 27
    HAS_SHOULDER_LANE = 28
    TOLL_ROAD = 29
    MAIN_ROAD = 30
    U_TURN_ROAD = 31

    @classmethod
    def from_name(cls: typing.Type['RoadCharacter'], item_name: str) -> 'RoadCharacter':
        if item_name == 'URBAN':
            item = RoadCharacter.URBAN
        elif item_name == 'SERVICE_AREA':
            item = RoadCharacter.SERVICE_AREA
        elif item_name == 'PARKING':
            item = RoadCharacter.PARKING
        elif item_name == 'COVERED':
            item = RoadCharacter.COVERED
        elif item_name == 'MOTORWAY':
            item = RoadCharacter.MOTORWAY
        elif item_name == 'EXPRESSWAY':
            item = RoadCharacter.EXPRESSWAY
        elif item_name == 'FERRY':
            item = RoadCharacter.FERRY
        elif item_name == 'TUNNEL':
            item = RoadCharacter.TUNNEL
        elif item_name == 'BRIDGE':
            item = RoadCharacter.BRIDGE
        elif item_name == 'MULTI_DIGITIZED':
            item = RoadCharacter.MULTI_DIGITIZED
        elif item_name == 'COMPLEX_INTERSECTION':
            item = RoadCharacter.COMPLEX_INTERSECTION
        elif item_name == 'IS_ELEVATED_ROAD':
            item = RoadCharacter.IS_ELEVATED_ROAD
        elif item_name == 'OVERPASS':
            item = RoadCharacter.OVERPASS
        elif item_name == 'UNDERPASS':
            item = RoadCharacter.UNDERPASS
        elif item_name == 'RACE_TRACK':
            item = RoadCharacter.RACE_TRACK
        elif item_name == 'INSIDE_CITY_LIMITS':
            item = RoadCharacter.INSIDE_CITY_LIMITS
        elif item_name == 'PEDESTRIAN_ZONE':
            item = RoadCharacter.PEDESTRIAN_ZONE
        elif item_name == 'CONTROLLED_ACCESS':
            item = RoadCharacter.CONTROLLED_ACCESS
        elif item_name == 'PHYSICALLY_SEPARATED':
            item = RoadCharacter.PHYSICALLY_SEPARATED
        elif item_name == 'TRACKS_ON_ROAD':
            item = RoadCharacter.TRACKS_ON_ROAD
        elif item_name == 'BICYCLE_PATH':
            item = RoadCharacter.BICYCLE_PATH
        elif item_name == 'BUS_ROAD':
            item = RoadCharacter.BUS_ROAD
        elif item_name == 'HORSE_WAY':
            item = RoadCharacter.HORSE_WAY
        elif item_name == 'TAXI_ROAD':
            item = RoadCharacter.TAXI_ROAD
        elif item_name == 'EMERGENCY_ROAD':
            item = RoadCharacter.EMERGENCY_ROAD
        elif item_name == 'TRUCK_ESCAPE_RAMP':
            item = RoadCharacter.TRUCK_ESCAPE_RAMP
        elif item_name == 'EXPRESS_ROAD':
            item = RoadCharacter.EXPRESS_ROAD
        elif item_name == 'STATION_PLAZA':
            item = RoadCharacter.STATION_PLAZA
        elif item_name == 'HAS_SHOULDER_LANE':
            item = RoadCharacter.HAS_SHOULDER_LANE
        elif item_name == 'TOLL_ROAD':
            item = RoadCharacter.TOLL_ROAD
        elif item_name == 'MAIN_ROAD':
            item = RoadCharacter.MAIN_ROAD
        elif item_name == 'U_TURN_ROAD':
            item = RoadCharacter.U_TURN_ROAD
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RoadCharacter'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RoadCharacter'], reader: zserio.BitStreamReader) -> 'RoadCharacter':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['RoadCharacter'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RoadCharacter':
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