# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.time_with_zone
import nds.routing.types.route_point_type
import nds.routing.types.waypoint_type

class RoutePoint:
    def __init__(
            self,
            type_: typing.Union[nds.routing.types.route_point_type.RoutePointType, None] = None,
            waypoint_type_: typing.Optional[nds.routing.types.waypoint_type.WaypointType] = None,
            departure_time_: typing.Optional[nds.core.types.time_with_zone.TimeWithZone] = None,
            arrival_time_: typing.Optional[nds.core.types.time_with_zone.TimeWithZone] = None) -> None:
        self._type_ = type_
        self._waypoint_type_ = waypoint_type_
        self._departure_time_ = departure_time_
        self._arrival_time_ = arrival_time_

    @classmethod
    def from_reader(
            cls: typing.Type['RoutePoint'],
            zserio_reader: zserio.BitStreamReader) -> 'RoutePoint':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoutePoint'],
            zserio_context: RoutePoint.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoutePoint':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoutePoint):
            return ((self._type_ == other._type_) and
                    (not other.is_waypoint_type_used() if not self.is_waypoint_type_used() else (self._waypoint_type_ == other._waypoint_type_)) and
                    (not other.is_departure_time_used() if not self.is_departure_time_used() else (self._departure_time_ == other._departure_time_)) and
                    (not other.is_arrival_time_used() if not self.is_arrival_time_used() else (self._arrival_time_ == other._arrival_time_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_waypoint_type_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._waypoint_type_)
        if self.is_departure_time_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._departure_time_)
        if self.is_arrival_time_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._arrival_time_)

        return result

    @property
    def type(self) -> typing.Union[nds.routing.types.route_point_type.RoutePointType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.routing.types.route_point_type.RoutePointType, None]) -> None:
        self._type_ = type_

    @property
    def waypoint_type(self) -> typing.Optional[nds.routing.types.waypoint_type.WaypointType]:
        return self._waypoint_type_

    @waypoint_type.setter
    def waypoint_type(self, waypoint_type_: typing.Optional[nds.routing.types.waypoint_type.WaypointType]) -> None:
        self._waypoint_type_ = waypoint_type_

    def is_waypoint_type_used(self) -> bool:
        return self.is_waypoint_type_set()

    def is_waypoint_type_set(self) -> bool:
        return not self._waypoint_type_ is None

    def reset_waypoint_type(self) -> None:
        self._waypoint_type_ = None

    @property
    def departure_time(self) -> typing.Optional[nds.core.types.time_with_zone.TimeWithZone]:
        return self._departure_time_

    @departure_time.setter
    def departure_time(self, departure_time_: typing.Optional[nds.core.types.time_with_zone.TimeWithZone]) -> None:
        self._departure_time_ = departure_time_

    def is_departure_time_used(self) -> bool:
        return self.is_departure_time_set()

    def is_departure_time_set(self) -> bool:
        return not self._departure_time_ is None

    def reset_departure_time(self) -> None:
        self._departure_time_ = None

    @property
    def arrival_time(self) -> typing.Optional[nds.core.types.time_with_zone.TimeWithZone]:
        return self._arrival_time_

    @arrival_time.setter
    def arrival_time(self, arrival_time_: typing.Optional[nds.core.types.time_with_zone.TimeWithZone]) -> None:
        self._arrival_time_ = arrival_time_

    def is_arrival_time_used(self) -> bool:
        return self.is_arrival_time_set()

    def is_arrival_time_set(self) -> bool:
        return not self._arrival_time_ is None

    def reset_arrival_time(self) -> None:
        self._arrival_time_ = None

    def init_packing_context(self, zserio_context: RoutePoint.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        if self.is_waypoint_type_used():
            self._waypoint_type_.init_packing_context(zserio_context.waypoint_type)
        if self.is_departure_time_used():
            self._departure_time_.init_packing_context(zserio_context.departure_time)
        if self.is_arrival_time_used():
            self._arrival_time_.init_packing_context(zserio_context.arrival_time)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_waypoint_type_used():
            end_bitposition += self._waypoint_type_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition += self._departure_time_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition += self._arrival_time_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoutePoint.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        end_bitposition += 1
        if self.is_waypoint_type_used():
            end_bitposition += self._waypoint_type_.bitsizeof_packed(zserio_context.waypoint_type, end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition += self._departure_time_.bitsizeof_packed(zserio_context.departure_time, end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition += self._arrival_time_.bitsizeof_packed(zserio_context.arrival_time, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_waypoint_type_used():
            end_bitposition = self._waypoint_type_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition = self._departure_time_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition = self._arrival_time_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoutePoint.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        end_bitposition += 1
        if self.is_waypoint_type_used():
            end_bitposition = self._waypoint_type_.initialize_offsets_packed(zserio_context.waypoint_type, end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition = self._departure_time_.initialize_offsets_packed(zserio_context.departure_time, end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition = self._arrival_time_.initialize_offsets_packed(zserio_context.arrival_time, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.routing.types.route_point_type.RoutePointType.from_reader(zserio_reader)
        if zserio_reader.read_bool():
            self._waypoint_type_ = nds.routing.types.waypoint_type.WaypointType.from_reader(zserio_reader)
        else:
            self._waypoint_type_ = None
        if zserio_reader.read_bool():
            self._departure_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader(zserio_reader)
        else:
            self._departure_time_ = None
        if zserio_reader.read_bool():
            self._arrival_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader(zserio_reader)
        else:
            self._arrival_time_ = None

    def read_packed(self, zserio_context: RoutePoint.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.routing.types.route_point_type.RoutePointType.from_reader_packed(zserio_context.type, zserio_reader)

        if zserio_reader.read_bool():
            self._waypoint_type_ = nds.routing.types.waypoint_type.WaypointType.from_reader_packed(zserio_context.waypoint_type, zserio_reader)
        else:
            self._waypoint_type_ = None

        if zserio_reader.read_bool():
            self._departure_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader_packed(zserio_context.departure_time, zserio_reader)
        else:
            self._departure_time_ = None

        if zserio_reader.read_bool():
            self._arrival_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader_packed(zserio_context.arrival_time, zserio_reader)
        else:
            self._arrival_time_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write(zserio_writer)
        if self.is_waypoint_type_used():
            zserio_writer.write_bool(True)
            self._waypoint_type_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_departure_time_used():
            zserio_writer.write_bool(True)
            self._departure_time_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_arrival_time_used():
            zserio_writer.write_bool(True)
            self._arrival_time_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: RoutePoint.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write_packed(zserio_context.type, zserio_writer)

        if self.is_waypoint_type_used():
            zserio_writer.write_bool(True)
            self._waypoint_type_.write_packed(zserio_context.waypoint_type, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_departure_time_used():
            zserio_writer.write_bool(True)
            self._departure_time_.write_packed(zserio_context.departure_time, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_arrival_time_used():
            zserio_writer.write_bool(True)
            self._arrival_time_.write_packed(zserio_context.arrival_time, zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._type_ = zserio.array.DeltaContext()
            self._waypoint_type_ = zserio.array.DeltaContext()
            self._departure_time_ = nds.core.types.time_with_zone.TimeWithZone.ZserioPackingContext()
            self._arrival_time_ = nds.core.types.time_with_zone.TimeWithZone.ZserioPackingContext()

        @property
        def type(self):
            return self._type_

        @property
        def waypoint_type(self):
            return self._waypoint_type_

        @property
        def departure_time(self):
            return self._departure_time_

        @property
        def arrival_time(self):
            return self._arrival_time_
