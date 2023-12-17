# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.location.road_location_id
import nds.core.types.length_centimeters

class RoadLocationAssignment:
    def __init__(
            self,
            location_id_: typing.Union[nds.core.location.road_location_id.RoadLocationId, None] = None,
            same_direction_as_source_: bool = bool(),
            complete_location_: bool = bool(),
            start_on_location_: typing.Optional[nds.core.types.length_centimeters.LengthCentimeters] = None,
            end_on_location_: typing.Optional[nds.core.types.length_centimeters.LengthCentimeters] = None) -> None:
        self._location_id_ = location_id_
        self._same_direction_as_source_ = same_direction_as_source_
        self._complete_location_ = complete_location_
        self._start_on_location_ = start_on_location_
        self._end_on_location_ = end_on_location_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadLocationAssignment'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadLocationAssignment':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadLocationAssignment'],
            zserio_context: RoadLocationAssignment.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadLocationAssignment':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadLocationAssignment):
            return ((self._location_id_ == other._location_id_) and
                    (self._same_direction_as_source_ == other._same_direction_as_source_) and
                    (self._complete_location_ == other._complete_location_) and
                    (not other.is_start_on_location_used() if not self.is_start_on_location_used() else (self._start_on_location_ == other._start_on_location_)) and
                    (not other.is_end_on_location_used() if not self.is_end_on_location_used() else (self._end_on_location_ == other._end_on_location_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._location_id_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._same_direction_as_source_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._complete_location_)
        if self.is_start_on_location_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._start_on_location_)
        if self.is_end_on_location_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._end_on_location_)

        return result

    @property
    def location_id(self) -> typing.Union[nds.core.location.road_location_id.RoadLocationId, None]:
        return self._location_id_

    @location_id.setter
    def location_id(self, location_id_: typing.Union[nds.core.location.road_location_id.RoadLocationId, None]) -> None:
        self._location_id_ = location_id_

    @property
    def same_direction_as_source(self) -> bool:
        return self._same_direction_as_source_

    @same_direction_as_source.setter
    def same_direction_as_source(self, same_direction_as_source_: bool) -> None:
        self._same_direction_as_source_ = same_direction_as_source_

    @property
    def complete_location(self) -> bool:
        return self._complete_location_

    @complete_location.setter
    def complete_location(self, complete_location_: bool) -> None:
        self._complete_location_ = complete_location_

    @property
    def start_on_location(self) -> typing.Optional[nds.core.types.length_centimeters.LengthCentimeters]:
        return self._start_on_location_

    @start_on_location.setter
    def start_on_location(self, start_on_location_: typing.Optional[nds.core.types.length_centimeters.LengthCentimeters]) -> None:
        self._start_on_location_ = start_on_location_

    def is_start_on_location_used(self) -> bool:
        return not self._complete_location_

    def is_start_on_location_set(self) -> bool:
        return not self._start_on_location_ is None

    def reset_start_on_location(self) -> None:
        self._start_on_location_ = None

    @property
    def end_on_location(self) -> typing.Optional[nds.core.types.length_centimeters.LengthCentimeters]:
        return self._end_on_location_

    @end_on_location.setter
    def end_on_location(self, end_on_location_: typing.Optional[nds.core.types.length_centimeters.LengthCentimeters]) -> None:
        self._end_on_location_ = end_on_location_

    def is_end_on_location_used(self) -> bool:
        return not self._complete_location_

    def is_end_on_location_set(self) -> bool:
        return not self._end_on_location_ is None

    def reset_end_on_location(self) -> None:
        self._end_on_location_ = None

    def init_packing_context(self, zserio_context: RoadLocationAssignment.ZserioPackingContext) -> None:
        self._location_id_.init_packing_context(zserio_context.location_id)
        if self.is_start_on_location_used():
            zserio_context.start_on_location.init(zserio.array.VarUInt32ArrayTraits(), self._start_on_location_)
        if self.is_end_on_location_used():
            zserio_context.end_on_location.init(zserio.array.VarUInt32ArrayTraits(), self._end_on_location_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._location_id_.bitsizeof(end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        if self.is_start_on_location_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._start_on_location_)
        if self.is_end_on_location_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._end_on_location_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadLocationAssignment.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._location_id_.bitsizeof_packed(zserio_context.location_id, end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        if self.is_start_on_location_used():
            end_bitposition += zserio_context.start_on_location.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._start_on_location_)
        if self.is_end_on_location_used():
            end_bitposition += zserio_context.end_on_location.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._end_on_location_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._location_id_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        if self.is_start_on_location_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._start_on_location_)
        if self.is_end_on_location_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._end_on_location_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadLocationAssignment.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._location_id_.initialize_offsets_packed(zserio_context.location_id, end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        if self.is_start_on_location_used():
            end_bitposition += zserio_context.start_on_location.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._start_on_location_)
        if self.is_end_on_location_used():
            end_bitposition += zserio_context.end_on_location.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._end_on_location_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._location_id_ = nds.core.location.road_location_id.RoadLocationId.from_reader(zserio_reader)

        self._same_direction_as_source_ = zserio_reader.read_bool()

        self._complete_location_ = zserio_reader.read_bool()

        if self.is_start_on_location_used():
            self._start_on_location_ = zserio_reader.read_varuint32()
        else:
            self._start_on_location_ = None

        if self.is_end_on_location_used():
            self._end_on_location_ = zserio_reader.read_varuint32()
            # check constraint
            if not (self._end_on_location_ >= self._start_on_location_):
                raise zserio.PythonRuntimeException("Constraint violated for field RoadLocationAssignment.endOnLocation!")
        else:
            self._end_on_location_ = None

    def read_packed(self, zserio_context: RoadLocationAssignment.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._location_id_ = nds.core.location.road_location_id.RoadLocationId.from_reader_packed(zserio_context.location_id, zserio_reader)

        self._same_direction_as_source_ = zserio_reader.read_bool()

        self._complete_location_ = zserio_reader.read_bool()

        if self.is_start_on_location_used():
            self._start_on_location_ = zserio_context.start_on_location.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        else:
            self._start_on_location_ = None

        if self.is_end_on_location_used():
            self._end_on_location_ = zserio_context.end_on_location.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
            # check constraint
            if not (self._end_on_location_ >= self._start_on_location_):
                raise zserio.PythonRuntimeException("Constraint violated for field RoadLocationAssignment.endOnLocation!")
        else:
            self._end_on_location_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._location_id_.write(zserio_writer)

        zserio_writer.write_bool(self._same_direction_as_source_)

        zserio_writer.write_bool(self._complete_location_)

        if self.is_start_on_location_used():
            zserio_writer.write_varuint32(self._start_on_location_)

        if self.is_end_on_location_used():
            # check constraint
            if not (self._end_on_location_ >= self._start_on_location_):
                raise zserio.PythonRuntimeException("Constraint violated for field RoadLocationAssignment.endOnLocation!")
            zserio_writer.write_varuint32(self._end_on_location_)

    def write_packed(self, zserio_context: RoadLocationAssignment.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._location_id_.write_packed(zserio_context.location_id, zserio_writer)

        zserio_writer.write_bool(self._same_direction_as_source_)

        zserio_writer.write_bool(self._complete_location_)

        if self.is_start_on_location_used():
            zserio_context.start_on_location.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._start_on_location_)

        if self.is_end_on_location_used():
            # check constraint
            if not (self._end_on_location_ >= self._start_on_location_):
                raise zserio.PythonRuntimeException("Constraint violated for field RoadLocationAssignment.endOnLocation!")
            zserio_context.end_on_location.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._end_on_location_)

    class ZserioPackingContext:
        def __init__(self):
            self._location_id_ = nds.core.location.road_location_id.RoadLocationId.ZserioPackingContext()
            self._start_on_location_ = zserio.array.DeltaContext()
            self._end_on_location_ = zserio.array.DeltaContext()

        @property
        def location_id(self):
            return self._location_id_

        @property
        def start_on_location(self):
            return self._start_on_location_

        @property
        def end_on_location(self):
            return self._end_on_location_