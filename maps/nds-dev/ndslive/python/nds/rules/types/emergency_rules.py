# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class EmergencyRules:
    def __init__(
            self,
            build_emergency_corridor_: bool = bool(),
            change_lanes_: bool = bool(),
            slow_down_: bool = bool()) -> None:
        self._build_emergency_corridor_ = build_emergency_corridor_
        self._change_lanes_ = change_lanes_
        self._slow_down_ = slow_down_

    @classmethod
    def from_reader(
            cls: typing.Type['EmergencyRules'],
            zserio_reader: zserio.BitStreamReader) -> 'EmergencyRules':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, EmergencyRules):
            return ((self._build_emergency_corridor_ == other._build_emergency_corridor_) and
                    (self._change_lanes_ == other._change_lanes_) and
                    (self._slow_down_ == other._slow_down_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._build_emergency_corridor_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._change_lanes_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._slow_down_)

        return result

    @property
    def build_emergency_corridor(self) -> bool:
        return self._build_emergency_corridor_

    @build_emergency_corridor.setter
    def build_emergency_corridor(self, build_emergency_corridor_: bool) -> None:
        self._build_emergency_corridor_ = build_emergency_corridor_

    @property
    def change_lanes(self) -> bool:
        return self._change_lanes_

    @change_lanes.setter
    def change_lanes(self, change_lanes_: bool) -> None:
        self._change_lanes_ = change_lanes_

    @property
    def slow_down(self) -> bool:
        return self._slow_down_

    @slow_down.setter
    def slow_down(self, slow_down_: bool) -> None:
        self._slow_down_ = slow_down_

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._build_emergency_corridor_ = zserio_reader.read_bool()
        self._change_lanes_ = zserio_reader.read_bool()
        self._slow_down_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._build_emergency_corridor_)
        zserio_writer.write_bool(self._change_lanes_)
        zserio_writer.write_bool(self._slow_down_)
