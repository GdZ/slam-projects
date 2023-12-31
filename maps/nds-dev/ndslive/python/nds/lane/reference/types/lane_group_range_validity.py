# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.lane.reference.types.lane_group_range
import nds.lane.reference.types.lane_range
import nds.lane.reference.types.lane_validity_direction
import nds.lane.reference.types.lanes_in_mask

class LaneGroupRangeValidity:
    def __init__(
            self,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift,
            complete_group_: bool = bool(),
            complete_group_range_: typing.Optional[nds.lane.reference.types.lane_group_range.LaneGroupRange] = None,
            num_lanes_: typing.Optional[nds.lane.reference.types.lanes_in_mask.LanesInMask] = None,
            lanes_: typing.Optional[typing.List[nds.lane.reference.types.lane_range.LaneRange]] = None,
            directions_: typing.Optional[typing.List[nds.lane.reference.types.lane_validity_direction.LaneValidityDirection]] = None) -> None:
        self._coord_shift_ = coord_shift_
        self._complete_group_ = complete_group_
        self._complete_group_range_ = complete_group_range_
        self._num_lanes_ = num_lanes_
        if lanes_ is None:
            self._lanes_ = None
        else:
            self._lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), lanes_)
        if directions_ is None:
            self._directions_ = None
        else:
            self._directions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), directions_)

    @classmethod
    def from_reader(
            cls: typing.Type['LaneGroupRangeValidity'],
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'LaneGroupRangeValidity':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneGroupRangeValidity'],
            zserio_context: LaneGroupRangeValidity.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'LaneGroupRangeValidity':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneGroupRangeValidity):
            return (self._coord_shift_ == other._coord_shift_ and
                    (self._complete_group_ == other._complete_group_) and
                    (not other.is_complete_group_range_used() if not self.is_complete_group_range_used() else (self._complete_group_range_ == other._complete_group_range_)) and
                    (not other.is_num_lanes_used() if not self.is_num_lanes_used() else (self._num_lanes_ == other._num_lanes_)) and
                    (not other.is_lanes_used() if not self.is_lanes_used() else (self._lanes_ == other._lanes_)) and
                    (not other.is_directions_used() if not self.is_directions_used() else (self._directions_ == other._directions_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._complete_group_)
        if self.is_complete_group_range_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._complete_group_range_)
        if self.is_num_lanes_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._num_lanes_)
        if self.is_lanes_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lanes_)
        if self.is_directions_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._directions_)

        return result

    @property
    def coord_shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_

    @property
    def complete_group(self) -> bool:
        return self._complete_group_

    @complete_group.setter
    def complete_group(self, complete_group_: bool) -> None:
        self._complete_group_ = complete_group_

    @property
    def complete_group_range(self) -> typing.Optional[nds.lane.reference.types.lane_group_range.LaneGroupRange]:
        return self._complete_group_range_

    @complete_group_range.setter
    def complete_group_range(self, complete_group_range_: typing.Optional[nds.lane.reference.types.lane_group_range.LaneGroupRange]) -> None:
        self._complete_group_range_ = complete_group_range_

    def is_complete_group_range_used(self) -> bool:
        return self._complete_group_

    def is_complete_group_range_set(self) -> bool:
        return not self._complete_group_range_ is None

    def reset_complete_group_range(self) -> None:
        self._complete_group_range_ = None

    @property
    def num_lanes(self) -> typing.Optional[nds.lane.reference.types.lanes_in_mask.LanesInMask]:
        return self._num_lanes_

    @num_lanes.setter
    def num_lanes(self, num_lanes_: typing.Optional[nds.lane.reference.types.lanes_in_mask.LanesInMask]) -> None:
        self._num_lanes_ = num_lanes_

    def is_num_lanes_used(self) -> bool:
        return not self._complete_group_

    def is_num_lanes_set(self) -> bool:
        return not self._num_lanes_ is None

    def reset_num_lanes(self) -> None:
        self._num_lanes_ = None

    @property
    def lanes(self) -> typing.Optional[typing.List[nds.lane.reference.types.lane_range.LaneRange]]:
        return None if self._lanes_ is None else self._lanes_.raw_array

    @lanes.setter
    def lanes(self, lanes_: typing.Optional[typing.List[nds.lane.reference.types.lane_range.LaneRange]]) -> None:
        if lanes_ is None:
            self._lanes_ = None
        else:
            self._lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), lanes_)

    def is_lanes_used(self) -> bool:
        return not self._complete_group_

    def is_lanes_set(self) -> bool:
        return not self._lanes_ is None

    def reset_lanes(self) -> None:
        self._lanes_ = None

    @property
    def directions(self) -> typing.Optional[typing.List[nds.lane.reference.types.lane_validity_direction.LaneValidityDirection]]:
        return None if self._directions_ is None else self._directions_.raw_array

    @directions.setter
    def directions(self, directions_: typing.Optional[typing.List[nds.lane.reference.types.lane_validity_direction.LaneValidityDirection]]) -> None:
        if directions_ is None:
            self._directions_ = None
        else:
            self._directions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), directions_)

    def is_directions_used(self) -> bool:
        return not self._complete_group_

    def is_directions_set(self) -> bool:
        return not self._directions_ is None

    def reset_directions(self) -> None:
        self._directions_ = None

    def init_packing_context(self, zserio_context: LaneGroupRangeValidity.ZserioPackingContext) -> None:
        if self.is_complete_group_range_used():
            self._complete_group_range_.init_packing_context(zserio_context.complete_group_range)
        if self.is_num_lanes_used():
            zserio_context.num_lanes.init(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_complete_group_range_used():
            end_bitposition += self._complete_group_range_.bitsizeof(end_bitposition)
        if self.is_num_lanes_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_lanes_)
        if self.is_lanes_used():
            end_bitposition += self._lanes_.bitsizeof(end_bitposition)
        if self.is_directions_used():
            end_bitposition += self._directions_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneGroupRangeValidity.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_complete_group_range_used():
            end_bitposition += self._complete_group_range_.bitsizeof_packed(zserio_context.complete_group_range, end_bitposition)
        if self.is_num_lanes_used():
            end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)
        if self.is_lanes_used():
            end_bitposition += self._lanes_.bitsizeof_packed(end_bitposition)
        if self.is_directions_used():
            end_bitposition += self._directions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_complete_group_range_used():
            end_bitposition = self._complete_group_range_.initialize_offsets(end_bitposition)
        if self.is_num_lanes_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_lanes_)
        if self.is_lanes_used():
            end_bitposition = self._lanes_.initialize_offsets(end_bitposition)
        if self.is_directions_used():
            end_bitposition = self._directions_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneGroupRangeValidity.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_complete_group_range_used():
            end_bitposition = self._complete_group_range_.initialize_offsets_packed(zserio_context.complete_group_range, end_bitposition)
        if self.is_num_lanes_used():
            end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)
        if self.is_lanes_used():
            end_bitposition = self._lanes_.initialize_offsets_packed(end_bitposition)
        if self.is_directions_used():
            end_bitposition = self._directions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._complete_group_ = zserio_reader.read_bool()
        if self.is_complete_group_range_used():
            self._complete_group_range_ = nds.lane.reference.types.lane_group_range.LaneGroupRange.from_reader(zserio_reader)
        else:
            self._complete_group_range_ = None
        if self.is_num_lanes_used():
            self._num_lanes_ = zserio_reader.read_varuint16()
        else:
            self._num_lanes_ = None
        if self.is_lanes_used():
            self._lanes_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), zserio_reader, self._num_lanes_)
        else:
            self._lanes_ = None
        if self.is_directions_used():
            self._directions_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), zserio_reader, self._num_lanes_)
        else:
            self._directions_ = None

    def read_packed(self, zserio_context: LaneGroupRangeValidity.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._complete_group_ = zserio_reader.read_bool()

        if self.is_complete_group_range_used():
            self._complete_group_range_ = nds.lane.reference.types.lane_group_range.LaneGroupRange.from_reader_packed(zserio_context.complete_group_range, zserio_reader)
        else:
            self._complete_group_range_ = None

        if self.is_num_lanes_used():
            self._num_lanes_ = zserio_context.num_lanes.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)
        else:
            self._num_lanes_ = None

        if self.is_lanes_used():
            self._lanes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), zserio_reader, self._num_lanes_)
        else:
            self._lanes_ = None

        if self.is_directions_used():
            self._directions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), zserio_reader, self._num_lanes_)
        else:
            self._directions_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._complete_group_)

        if self.is_complete_group_range_used():
            self._complete_group_range_.write(zserio_writer)

        if self.is_num_lanes_used():
            zserio_writer.write_varuint16(self._num_lanes_)

        if self.is_lanes_used():
            # check array length
            if len(self._lanes_) != (self._num_lanes_):
                raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupRangeValidity.lanes: "
                                                    f"{len(self._lanes_)} != {self._num_lanes_}!")
            self._lanes_.write(zserio_writer)

        if self.is_directions_used():
            # check array length
            if len(self._directions_) != (self._num_lanes_):
                raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupRangeValidity.directions: "
                                                    f"{len(self._directions_)} != {self._num_lanes_}!")
            self._directions_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneGroupRangeValidity.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._complete_group_)

        if self.is_complete_group_range_used():
            self._complete_group_range_.write_packed(zserio_context.complete_group_range, zserio_writer)

        if self.is_num_lanes_used():
            zserio_context.num_lanes.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_lanes_)

        if self.is_lanes_used():
            # check array length
            if len(self._lanes_) != (self._num_lanes_):
                raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupRangeValidity.lanes: "
                                                    f"{len(self._lanes_)} != {self._num_lanes_}!")
            self._lanes_.write_packed(zserio_writer)

        if self.is_directions_used():
            # check array length
            if len(self._directions_) != (self._num_lanes_):
                raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupRangeValidity.directions: "
                                                    f"{len(self._directions_)} != {self._num_lanes_}!")
            self._directions_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._complete_group_range_ = nds.lane.reference.types.lane_group_range.LaneGroupRange.ZserioPackingContext()
            self._num_lanes_ = zserio.array.DeltaContext()

        @property
        def complete_group_range(self):
            return self._complete_group_range_

        @property
        def num_lanes(self):
            return self._num_lanes_

    class _ZserioElementFactory_lanes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_range.LaneRange:
            del zserio_index
            return nds.lane.reference.types.lane_range.LaneRange.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.lane.reference.types.lane_range.LaneRange.ZserioPackingContext:
            return nds.lane.reference.types.lane_range.LaneRange.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.lane.reference.types.lane_range.LaneRange.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_range.LaneRange:
            del zserio_index
            return nds.lane.reference.types.lane_range.LaneRange.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_directions:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_validity_direction.LaneValidityDirection:
            del zserio_index
            return nds.lane.reference.types.lane_validity_direction.LaneValidityDirection.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> zserio.array.DeltaContext:
            return zserio.array.DeltaContext()

        @staticmethod
        def create_packed(zserio_context: zserio.array.DeltaContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_validity_direction.LaneValidityDirection:
            del zserio_index
            return nds.lane.reference.types.lane_validity_direction.LaneValidityDirection.from_reader_packed(zserio_context, zserio_reader)
