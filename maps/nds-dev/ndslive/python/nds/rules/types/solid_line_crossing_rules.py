# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class SolidLineCrossingRules:
    def __init__(
            self,
            during_emergencies_: bool = bool(),
            enter_shoulder_lane_: bool = bool(),
            enter_bus_lane_: bool = bool(),
            overtake_slow_traffic_: bool = bool(),
            enter_premises_or_side_roads_: bool = bool(),
            avoid_obstacles_: bool = bool()) -> None:
        self._during_emergencies_ = during_emergencies_
        self._enter_shoulder_lane_ = enter_shoulder_lane_
        self._enter_bus_lane_ = enter_bus_lane_
        self._overtake_slow_traffic_ = overtake_slow_traffic_
        self._enter_premises_or_side_roads_ = enter_premises_or_side_roads_
        self._avoid_obstacles_ = avoid_obstacles_

    @classmethod
    def from_reader(
            cls: typing.Type['SolidLineCrossingRules'],
            zserio_reader: zserio.BitStreamReader) -> 'SolidLineCrossingRules':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SolidLineCrossingRules):
            return ((self._during_emergencies_ == other._during_emergencies_) and
                    (self._enter_shoulder_lane_ == other._enter_shoulder_lane_) and
                    (self._enter_bus_lane_ == other._enter_bus_lane_) and
                    (self._overtake_slow_traffic_ == other._overtake_slow_traffic_) and
                    (self._enter_premises_or_side_roads_ == other._enter_premises_or_side_roads_) and
                    (self._avoid_obstacles_ == other._avoid_obstacles_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._during_emergencies_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._enter_shoulder_lane_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._enter_bus_lane_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._overtake_slow_traffic_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._enter_premises_or_side_roads_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._avoid_obstacles_)

        return result

    @property
    def during_emergencies(self) -> bool:
        return self._during_emergencies_

    @during_emergencies.setter
    def during_emergencies(self, during_emergencies_: bool) -> None:
        self._during_emergencies_ = during_emergencies_

    @property
    def enter_shoulder_lane(self) -> bool:
        return self._enter_shoulder_lane_

    @enter_shoulder_lane.setter
    def enter_shoulder_lane(self, enter_shoulder_lane_: bool) -> None:
        self._enter_shoulder_lane_ = enter_shoulder_lane_

    @property
    def enter_bus_lane(self) -> bool:
        return self._enter_bus_lane_

    @enter_bus_lane.setter
    def enter_bus_lane(self, enter_bus_lane_: bool) -> None:
        self._enter_bus_lane_ = enter_bus_lane_

    @property
    def overtake_slow_traffic(self) -> bool:
        return self._overtake_slow_traffic_

    @overtake_slow_traffic.setter
    def overtake_slow_traffic(self, overtake_slow_traffic_: bool) -> None:
        self._overtake_slow_traffic_ = overtake_slow_traffic_

    @property
    def enter_premises_or_side_roads(self) -> bool:
        return self._enter_premises_or_side_roads_

    @enter_premises_or_side_roads.setter
    def enter_premises_or_side_roads(self, enter_premises_or_side_roads_: bool) -> None:
        self._enter_premises_or_side_roads_ = enter_premises_or_side_roads_

    @property
    def avoid_obstacles(self) -> bool:
        return self._avoid_obstacles_

    @avoid_obstacles.setter
    def avoid_obstacles(self, avoid_obstacles_: bool) -> None:
        self._avoid_obstacles_ = avoid_obstacles_

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._during_emergencies_ = zserio_reader.read_bool()
        self._enter_shoulder_lane_ = zserio_reader.read_bool()
        self._enter_bus_lane_ = zserio_reader.read_bool()
        self._overtake_slow_traffic_ = zserio_reader.read_bool()
        self._enter_premises_or_side_roads_ = zserio_reader.read_bool()
        self._avoid_obstacles_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._during_emergencies_)
        zserio_writer.write_bool(self._enter_shoulder_lane_)
        zserio_writer.write_bool(self._enter_bus_lane_)
        zserio_writer.write_bool(self._overtake_slow_traffic_)
        zserio_writer.write_bool(self._enter_premises_or_side_roads_)
        zserio_writer.write_bool(self._avoid_obstacles_)
