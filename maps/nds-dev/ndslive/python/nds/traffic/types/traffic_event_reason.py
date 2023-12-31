# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TrafficEventReason(zserio.Enum):
    UNKNOWN = 0
    TRAFFIC_CONGESTION = 1
    ACCIDENT = 2
    ROADWORKS = 3
    NARROW_LANES = 4
    IMPASSIBILITY = 5
    SLIPPERY_ROAD = 6
    AQUAPLANING = 7
    FIRE = 8
    HAZARDOUS_DRIVING_CONDITIONS = 9
    OBJECTS_ON_THE_ROAD = 10
    ANIMALS_ON_ROADWAY = 11
    PEOPLE_ON_ROADWAY = 12
    BROKEN_DOWN_VEHICLES = 13
    VEHICLE_ON_WRONG_CARRIAGE_WAY_GHOSTDRIVER = 14
    RESCUE_RECOVERY_IN_PROGRESS = 15
    REGULATORY_MEASURE = 16
    EXTREME_WEATHER_CONDITIONS = 17
    VISIBILITY_REDUCED = 18
    PRECIPITATION = 19
    RECKLESS_PERSONS = 20
    OVERHEIGHT_WARNING_SYSTEM_TRIGGERED = 21
    TRAFFIC_REGULATIONS_CHANGED = 22
    MAJOR_EVENT = 23
    SERVICE_NOT_OPERATING = 24
    SERVICE_NOT_USABLE = 25
    SLOW_MOVING_VEHICLES = 26
    DANGEROUS_END_OF_QUEUE = 27
    RISK_OF_FIRE = 28
    TIME_DELAY = 29
    POLICE_CHECKPOINT = 30
    MALFUNCTIONING_ROADSIDE_EQUIPMENT = 31
    SERIOUS_ACCIDENT = 32
    EARLIER_ACCIDENT = 33
    ACCIDENT_REPORTED = 34
    ACCIDENT_INVESTIGATION_WORK = 35
    MULTI_VEHICLE_ACCIDENT = 36
    ACCIDENT_INVOLVING_LORRY = 37
    ACCIDENT_TRAFFIC_BEING_DIRECTED_AROUND = 38
    LONG_TERM_ROADWORKS = 39
    CONSTRUCTION_WORK = 40
    BRIDGE_MAINTENANCE_WORK = 41
    RESURFACING_WORK = 42
    MAJOR_ROADWORKS = 43
    ROAD_MAINTENANCE_WORKS = 44
    ROADWORKS_DURING_NIGHT = 45
    ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS = 46
    FLOODING = 47
    SNOW_ON_ROAD = 48
    ICE_ON_ROAD = 49
    BLACK_ICE_ON_ROAD = 50
    GRASS_FIRE = 51
    FOREST_FIRE = 52
    OVERTURNED_VEHICLE = 53
    BROKEN_DOWN_LORRY = 54
    VEHICLE_SPUN_AROUND = 55
    VEHICLE_ON_FIRE = 56
    GUSTY_WINDS = 57
    STRONG_WINDS = 58
    THUNDERSTORM = 59
    VISIBILITY_REDUCED_BY_FOG = 60
    VISIBILITY_REDUCED_BY_LOW_SUN_GLARE = 61
    SNOW = 62
    RAIN = 63
    HAIL = 64
    SPORTS_EVENT = 65
    TRAFFIC_CONTROL_SIGNALS_NOT_WORKING = 66
    TRAFFIC_CONTROL_SIGNALS_WORKING_INCORRECTLY = 67
    CLOSURE = 68

    @classmethod
    def from_name(cls: typing.Type['TrafficEventReason'], item_name: str) -> 'TrafficEventReason':
        if item_name == 'UNKNOWN':
            item = TrafficEventReason.UNKNOWN
        elif item_name == 'TRAFFIC_CONGESTION':
            item = TrafficEventReason.TRAFFIC_CONGESTION
        elif item_name == 'ACCIDENT':
            item = TrafficEventReason.ACCIDENT
        elif item_name == 'ROADWORKS':
            item = TrafficEventReason.ROADWORKS
        elif item_name == 'NARROW_LANES':
            item = TrafficEventReason.NARROW_LANES
        elif item_name == 'IMPASSIBILITY':
            item = TrafficEventReason.IMPASSIBILITY
        elif item_name == 'SLIPPERY_ROAD':
            item = TrafficEventReason.SLIPPERY_ROAD
        elif item_name == 'AQUAPLANING':
            item = TrafficEventReason.AQUAPLANING
        elif item_name == 'FIRE':
            item = TrafficEventReason.FIRE
        elif item_name == 'HAZARDOUS_DRIVING_CONDITIONS':
            item = TrafficEventReason.HAZARDOUS_DRIVING_CONDITIONS
        elif item_name == 'OBJECTS_ON_THE_ROAD':
            item = TrafficEventReason.OBJECTS_ON_THE_ROAD
        elif item_name == 'ANIMALS_ON_ROADWAY':
            item = TrafficEventReason.ANIMALS_ON_ROADWAY
        elif item_name == 'PEOPLE_ON_ROADWAY':
            item = TrafficEventReason.PEOPLE_ON_ROADWAY
        elif item_name == 'BROKEN_DOWN_VEHICLES':
            item = TrafficEventReason.BROKEN_DOWN_VEHICLES
        elif item_name == 'VEHICLE_ON_WRONG_CARRIAGE_WAY_GHOSTDRIVER':
            item = TrafficEventReason.VEHICLE_ON_WRONG_CARRIAGE_WAY_GHOSTDRIVER
        elif item_name == 'RESCUE_RECOVERY_IN_PROGRESS':
            item = TrafficEventReason.RESCUE_RECOVERY_IN_PROGRESS
        elif item_name == 'REGULATORY_MEASURE':
            item = TrafficEventReason.REGULATORY_MEASURE
        elif item_name == 'EXTREME_WEATHER_CONDITIONS':
            item = TrafficEventReason.EXTREME_WEATHER_CONDITIONS
        elif item_name == 'VISIBILITY_REDUCED':
            item = TrafficEventReason.VISIBILITY_REDUCED
        elif item_name == 'PRECIPITATION':
            item = TrafficEventReason.PRECIPITATION
        elif item_name == 'RECKLESS_PERSONS':
            item = TrafficEventReason.RECKLESS_PERSONS
        elif item_name == 'OVERHEIGHT_WARNING_SYSTEM_TRIGGERED':
            item = TrafficEventReason.OVERHEIGHT_WARNING_SYSTEM_TRIGGERED
        elif item_name == 'TRAFFIC_REGULATIONS_CHANGED':
            item = TrafficEventReason.TRAFFIC_REGULATIONS_CHANGED
        elif item_name == 'MAJOR_EVENT':
            item = TrafficEventReason.MAJOR_EVENT
        elif item_name == 'SERVICE_NOT_OPERATING':
            item = TrafficEventReason.SERVICE_NOT_OPERATING
        elif item_name == 'SERVICE_NOT_USABLE':
            item = TrafficEventReason.SERVICE_NOT_USABLE
        elif item_name == 'SLOW_MOVING_VEHICLES':
            item = TrafficEventReason.SLOW_MOVING_VEHICLES
        elif item_name == 'DANGEROUS_END_OF_QUEUE':
            item = TrafficEventReason.DANGEROUS_END_OF_QUEUE
        elif item_name == 'RISK_OF_FIRE':
            item = TrafficEventReason.RISK_OF_FIRE
        elif item_name == 'TIME_DELAY':
            item = TrafficEventReason.TIME_DELAY
        elif item_name == 'POLICE_CHECKPOINT':
            item = TrafficEventReason.POLICE_CHECKPOINT
        elif item_name == 'MALFUNCTIONING_ROADSIDE_EQUIPMENT':
            item = TrafficEventReason.MALFUNCTIONING_ROADSIDE_EQUIPMENT
        elif item_name == 'SERIOUS_ACCIDENT':
            item = TrafficEventReason.SERIOUS_ACCIDENT
        elif item_name == 'EARLIER_ACCIDENT':
            item = TrafficEventReason.EARLIER_ACCIDENT
        elif item_name == 'ACCIDENT_REPORTED':
            item = TrafficEventReason.ACCIDENT_REPORTED
        elif item_name == 'ACCIDENT_INVESTIGATION_WORK':
            item = TrafficEventReason.ACCIDENT_INVESTIGATION_WORK
        elif item_name == 'MULTI_VEHICLE_ACCIDENT':
            item = TrafficEventReason.MULTI_VEHICLE_ACCIDENT
        elif item_name == 'ACCIDENT_INVOLVING_LORRY':
            item = TrafficEventReason.ACCIDENT_INVOLVING_LORRY
        elif item_name == 'ACCIDENT_TRAFFIC_BEING_DIRECTED_AROUND':
            item = TrafficEventReason.ACCIDENT_TRAFFIC_BEING_DIRECTED_AROUND
        elif item_name == 'LONG_TERM_ROADWORKS':
            item = TrafficEventReason.LONG_TERM_ROADWORKS
        elif item_name == 'CONSTRUCTION_WORK':
            item = TrafficEventReason.CONSTRUCTION_WORK
        elif item_name == 'BRIDGE_MAINTENANCE_WORK':
            item = TrafficEventReason.BRIDGE_MAINTENANCE_WORK
        elif item_name == 'RESURFACING_WORK':
            item = TrafficEventReason.RESURFACING_WORK
        elif item_name == 'MAJOR_ROADWORKS':
            item = TrafficEventReason.MAJOR_ROADWORKS
        elif item_name == 'ROAD_MAINTENANCE_WORKS':
            item = TrafficEventReason.ROAD_MAINTENANCE_WORKS
        elif item_name == 'ROADWORKS_DURING_NIGHT':
            item = TrafficEventReason.ROADWORKS_DURING_NIGHT
        elif item_name == 'ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS':
            item = TrafficEventReason.ROADWORKS_SINGLE_LINE_TRAFFIC_ALTERNATE_DIRECTIONS
        elif item_name == 'FLOODING':
            item = TrafficEventReason.FLOODING
        elif item_name == 'SNOW_ON_ROAD':
            item = TrafficEventReason.SNOW_ON_ROAD
        elif item_name == 'ICE_ON_ROAD':
            item = TrafficEventReason.ICE_ON_ROAD
        elif item_name == 'BLACK_ICE_ON_ROAD':
            item = TrafficEventReason.BLACK_ICE_ON_ROAD
        elif item_name == 'GRASS_FIRE':
            item = TrafficEventReason.GRASS_FIRE
        elif item_name == 'FOREST_FIRE':
            item = TrafficEventReason.FOREST_FIRE
        elif item_name == 'OVERTURNED_VEHICLE':
            item = TrafficEventReason.OVERTURNED_VEHICLE
        elif item_name == 'BROKEN_DOWN_LORRY':
            item = TrafficEventReason.BROKEN_DOWN_LORRY
        elif item_name == 'VEHICLE_SPUN_AROUND':
            item = TrafficEventReason.VEHICLE_SPUN_AROUND
        elif item_name == 'VEHICLE_ON_FIRE':
            item = TrafficEventReason.VEHICLE_ON_FIRE
        elif item_name == 'GUSTY_WINDS':
            item = TrafficEventReason.GUSTY_WINDS
        elif item_name == 'STRONG_WINDS':
            item = TrafficEventReason.STRONG_WINDS
        elif item_name == 'THUNDERSTORM':
            item = TrafficEventReason.THUNDERSTORM
        elif item_name == 'VISIBILITY_REDUCED_BY_FOG':
            item = TrafficEventReason.VISIBILITY_REDUCED_BY_FOG
        elif item_name == 'VISIBILITY_REDUCED_BY_LOW_SUN_GLARE':
            item = TrafficEventReason.VISIBILITY_REDUCED_BY_LOW_SUN_GLARE
        elif item_name == 'SNOW':
            item = TrafficEventReason.SNOW
        elif item_name == 'RAIN':
            item = TrafficEventReason.RAIN
        elif item_name == 'HAIL':
            item = TrafficEventReason.HAIL
        elif item_name == 'SPORTS_EVENT':
            item = TrafficEventReason.SPORTS_EVENT
        elif item_name == 'TRAFFIC_CONTROL_SIGNALS_NOT_WORKING':
            item = TrafficEventReason.TRAFFIC_CONTROL_SIGNALS_NOT_WORKING
        elif item_name == 'TRAFFIC_CONTROL_SIGNALS_WORKING_INCORRECTLY':
            item = TrafficEventReason.TRAFFIC_CONTROL_SIGNALS_WORKING_INCORRECTLY
        elif item_name == 'CLOSURE':
            item = TrafficEventReason.CLOSURE
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'TrafficEventReason'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['TrafficEventReason'], reader: zserio.BitStreamReader) -> 'TrafficEventReason':
        return cls(reader.read_varuint16())

    @classmethod
    def from_reader_packed(cls: typing.Type['TrafficEventReason'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TrafficEventReason':
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
