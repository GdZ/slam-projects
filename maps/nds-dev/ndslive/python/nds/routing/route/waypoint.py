# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.core.geometry.position2d
import nds.core.location.road_location_id
import nds.core.location.road_location_path
import nds.core.types.time_with_zone
import nds.routing.types.waypoint_type

class Waypoint:
    def __init__(
            self,
            position_: typing.Union[nds.core.geometry.position2d.Position2D, None] = None,
            location_path_: typing.Optional[nds.core.location.road_location_path.RoadLocationPath] = None,
            location_id_: typing.Optional[nds.core.location.road_location_id.RoadLocationId] = None,
            right_side_: typing.Optional[bool] = None,
            type_: typing.Optional[nds.routing.types.waypoint_type.WaypointType] = None,
            departure_time_: typing.Optional[nds.core.types.time_with_zone.TimeWithZone] = None,
            arrival_time_: typing.Optional[nds.core.types.time_with_zone.TimeWithZone] = None) -> None:
        self._position_ = position_
        self._location_path_ = location_path_
        self._location_id_ = location_id_
        self._right_side_ = right_side_
        self._type_ = type_
        self._departure_time_ = departure_time_
        self._arrival_time_ = arrival_time_

    @classmethod
    def from_reader(
            cls: typing.Type['Waypoint'],
            zserio_reader: zserio.BitStreamReader) -> 'Waypoint':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Waypoint'],
            zserio_context: Waypoint.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Waypoint':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Waypoint):
            return ((self._position_ == other._position_) and
                    (not other.is_location_path_used() if not self.is_location_path_used() else (self._location_path_ == other._location_path_)) and
                    (not other.is_location_id_used() if not self.is_location_id_used() else (self._location_id_ == other._location_id_)) and
                    (not other.is_right_side_used() if not self.is_right_side_used() else (self._right_side_ == other._right_side_)) and
                    (not other.is_type_used() if not self.is_type_used() else (self._type_ == other._type_)) and
                    (not other.is_departure_time_used() if not self.is_departure_time_used() else (self._departure_time_ == other._departure_time_)) and
                    (not other.is_arrival_time_used() if not self.is_arrival_time_used() else (self._arrival_time_ == other._arrival_time_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._position_)
        if self.is_location_path_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._location_path_)
        if self.is_location_id_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._location_id_)
        if self.is_right_side_used():
            result = zserio.hashcode.calc_hashcode_bool(result, self._right_side_)
        if self.is_type_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_departure_time_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._departure_time_)
        if self.is_arrival_time_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._arrival_time_)

        return result

    @property
    def position(self) -> typing.Union[nds.core.geometry.position2d.Position2D, None]:
        return self._position_

    @position.setter
    def position(self, position_: typing.Union[nds.core.geometry.position2d.Position2D, None]) -> None:
        self._position_ = position_

    @property
    def location_path(self) -> typing.Optional[nds.core.location.road_location_path.RoadLocationPath]:
        return self._location_path_

    @location_path.setter
    def location_path(self, location_path_: typing.Optional[nds.core.location.road_location_path.RoadLocationPath]) -> None:
        self._location_path_ = location_path_

    def is_location_path_used(self) -> bool:
        return self.is_location_path_set()

    def is_location_path_set(self) -> bool:
        return not self._location_path_ is None

    def reset_location_path(self) -> None:
        self._location_path_ = None

    @property
    def location_id(self) -> typing.Optional[nds.core.location.road_location_id.RoadLocationId]:
        return self._location_id_

    @location_id.setter
    def location_id(self, location_id_: typing.Optional[nds.core.location.road_location_id.RoadLocationId]) -> None:
        self._location_id_ = location_id_

    def is_location_id_used(self) -> bool:
        return self.is_location_id_set()

    def is_location_id_set(self) -> bool:
        return not self._location_id_ is None

    def reset_location_id(self) -> None:
        self._location_id_ = None

    @property
    def right_side(self) -> typing.Optional[bool]:
        return self._right_side_

    @right_side.setter
    def right_side(self, right_side_: typing.Optional[bool]) -> None:
        self._right_side_ = right_side_

    def is_right_side_used(self) -> bool:
        return self.is_right_side_set()

    def is_right_side_set(self) -> bool:
        return not self._right_side_ is None

    def reset_right_side(self) -> None:
        self._right_side_ = None

    @property
    def type(self) -> typing.Optional[nds.routing.types.waypoint_type.WaypointType]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Optional[nds.routing.types.waypoint_type.WaypointType]) -> None:
        self._type_ = type_

    def is_type_used(self) -> bool:
        return self.is_type_set()

    def is_type_set(self) -> bool:
        return not self._type_ is None

    def reset_type(self) -> None:
        self._type_ = None

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

    def init_packing_context(self, zserio_context: Waypoint.ZserioPackingContext) -> None:
        self._position_.init_packing_context(zserio_context.position)
        if self.is_location_path_used():
            self._location_path_.init_packing_context(zserio_context.location_path)
        if self.is_location_id_used():
            self._location_id_.init_packing_context(zserio_context.location_id)
        if self.is_type_used():
            self._type_.init_packing_context(zserio_context.type)
        if self.is_departure_time_used():
            self._departure_time_.init_packing_context(zserio_context.departure_time)
        if self.is_arrival_time_used():
            self._arrival_time_.init_packing_context(zserio_context.arrival_time)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_location_path_used():
            end_bitposition += self._location_path_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_location_id_used():
            end_bitposition += self._location_id_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_right_side_used():
            end_bitposition += 1
        end_bitposition += 1
        if self.is_type_used():
            end_bitposition += self._type_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition += self._departure_time_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition += self._arrival_time_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Waypoint.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof_packed(zserio_context.position, end_bitposition)
        end_bitposition += 1
        if self.is_location_path_used():
            end_bitposition += self._location_path_.bitsizeof_packed(zserio_context.location_path, end_bitposition)
        end_bitposition += 1
        if self.is_location_id_used():
            end_bitposition += self._location_id_.bitsizeof_packed(zserio_context.location_id, end_bitposition)
        end_bitposition += 1
        if self.is_right_side_used():
            end_bitposition += 1
        end_bitposition += 1
        if self.is_type_used():
            end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition += self._departure_time_.bitsizeof_packed(zserio_context.departure_time, end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition += self._arrival_time_.bitsizeof_packed(zserio_context.arrival_time, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_location_path_used():
            end_bitposition = self._location_path_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_location_id_used():
            end_bitposition = self._location_id_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_right_side_used():
            end_bitposition += 1
        end_bitposition += 1
        if self.is_type_used():
            end_bitposition = self._type_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition = self._departure_time_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition = self._arrival_time_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Waypoint.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets_packed(zserio_context.position, end_bitposition)
        end_bitposition += 1
        if self.is_location_path_used():
            end_bitposition = self._location_path_.initialize_offsets_packed(zserio_context.location_path, end_bitposition)
        end_bitposition += 1
        if self.is_location_id_used():
            end_bitposition = self._location_id_.initialize_offsets_packed(zserio_context.location_id, end_bitposition)
        end_bitposition += 1
        if self.is_right_side_used():
            end_bitposition += 1
        end_bitposition += 1
        if self.is_type_used():
            end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        end_bitposition += 1
        if self.is_departure_time_used():
            end_bitposition = self._departure_time_.initialize_offsets_packed(zserio_context.departure_time, end_bitposition)
        end_bitposition += 1
        if self.is_arrival_time_used():
            end_bitposition = self._arrival_time_.initialize_offsets_packed(zserio_context.arrival_time, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position2d.Position2D.from_reader(zserio_reader, 0)
        if zserio_reader.read_bool():
            self._location_path_ = nds.core.location.road_location_path.RoadLocationPath.from_reader(zserio_reader)
        else:
            self._location_path_ = None
        if zserio_reader.read_bool():
            self._location_id_ = nds.core.location.road_location_id.RoadLocationId.from_reader(zserio_reader)
        else:
            self._location_id_ = None
        if zserio_reader.read_bool():
            self._right_side_ = zserio_reader.read_bool()
        else:
            self._right_side_ = None
        if zserio_reader.read_bool():
            self._type_ = nds.routing.types.waypoint_type.WaypointType.from_reader(zserio_reader)
        else:
            self._type_ = None
        if zserio_reader.read_bool():
            self._departure_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader(zserio_reader)
        else:
            self._departure_time_ = None
        if zserio_reader.read_bool():
            self._arrival_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader(zserio_reader)
        else:
            self._arrival_time_ = None

    def read_packed(self, zserio_context: Waypoint.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position2d.Position2D.from_reader_packed(zserio_context.position, zserio_reader, 0)

        if zserio_reader.read_bool():
            self._location_path_ = nds.core.location.road_location_path.RoadLocationPath.from_reader_packed(zserio_context.location_path, zserio_reader)
        else:
            self._location_path_ = None

        if zserio_reader.read_bool():
            self._location_id_ = nds.core.location.road_location_id.RoadLocationId.from_reader_packed(zserio_context.location_id, zserio_reader)
        else:
            self._location_id_ = None

        if zserio_reader.read_bool():
            self._right_side_ = zserio_reader.read_bool()
        else:
            self._right_side_ = None

        if zserio_reader.read_bool():
            self._type_ = nds.routing.types.waypoint_type.WaypointType.from_reader_packed(zserio_context.type, zserio_reader)
        else:
            self._type_ = None

        if zserio_reader.read_bool():
            self._departure_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader_packed(zserio_context.departure_time, zserio_reader)
        else:
            self._departure_time_ = None

        if zserio_reader.read_bool():
            self._arrival_time_ = nds.core.types.time_with_zone.TimeWithZone.from_reader_packed(zserio_context.arrival_time, zserio_reader)
        else:
            self._arrival_time_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field Waypoint.position: "
                                                f"{self._position_.shift} != {0}!")
        self._position_.write(zserio_writer)

        if self.is_location_path_used():
            zserio_writer.write_bool(True)
            self._location_path_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_location_id_used():
            zserio_writer.write_bool(True)
            self._location_id_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_right_side_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_bool(self._right_side_)
        else:
            zserio_writer.write_bool(False)

        if self.is_type_used():
            zserio_writer.write_bool(True)
            self._type_.write(zserio_writer)
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

    def write_packed(self, zserio_context: Waypoint.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field Waypoint.position: "
                                                f"{self._position_.shift} != {0}!")
        self._position_.write_packed(zserio_context.position, zserio_writer)

        if self.is_location_path_used():
            zserio_writer.write_bool(True)
            self._location_path_.write_packed(zserio_context.location_path, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_location_id_used():
            zserio_writer.write_bool(True)
            self._location_id_.write_packed(zserio_context.location_id, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_right_side_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_bool(self._right_side_)
        else:
            zserio_writer.write_bool(False)

        if self.is_type_used():
            zserio_writer.write_bool(True)
            self._type_.write_packed(zserio_context.type, zserio_writer)
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
            self._position_ = nds.core.geometry.position2d.Position2D.ZserioPackingContext()
            self._location_path_ = nds.core.location.road_location_path.RoadLocationPath.ZserioPackingContext()
            self._location_id_ = nds.core.location.road_location_id.RoadLocationId.ZserioPackingContext()
            self._type_ = zserio.array.DeltaContext()
            self._departure_time_ = nds.core.types.time_with_zone.TimeWithZone.ZserioPackingContext()
            self._arrival_time_ = nds.core.types.time_with_zone.TimeWithZone.ZserioPackingContext()

        @property
        def position(self):
            return self._position_

        @property
        def location_path(self):
            return self._location_path_

        @property
        def location_id(self):
            return self._location_id_

        @property
        def type(self):
            return self._type_

        @property
        def departure_time(self):
            return self._departure_time_

        @property
        def arrival_time(self):
            return self._arrival_time_
