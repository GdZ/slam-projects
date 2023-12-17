# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.lane.reference.types.lane_position
import nds.lane.reference.types.lane_validity_direction
import nds.lane.reference.types.lanes_in_mask

class LaneGroupPositionValidity:
    def __init__(
            self,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift,
            num_lanes_: nds.lane.reference.types.lanes_in_mask.LanesInMask = nds.lane.reference.types.lanes_in_mask.LanesInMask(),
            lanes_: typing.List[nds.lane.reference.types.lane_position.LanePosition] = None,
            directions_: typing.List[nds.lane.reference.types.lane_validity_direction.LaneValidityDirection] = None) -> None:
        self._coord_shift_ = coord_shift_
        self._num_lanes_ = num_lanes_
        self._lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), lanes_)
        self._directions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), directions_)

    @classmethod
    def from_reader(
            cls: typing.Type['LaneGroupPositionValidity'],
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'LaneGroupPositionValidity':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneGroupPositionValidity'],
            zserio_context: LaneGroupPositionValidity.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'LaneGroupPositionValidity':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneGroupPositionValidity):
            return (self._coord_shift_ == other._coord_shift_ and
                    (self._num_lanes_ == other._num_lanes_) and
                    (self._lanes_ == other._lanes_) and
                    (self._directions_ == other._directions_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_lanes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._lanes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._directions_)

        return result

    @property
    def coord_shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_

    @property
    def num_lanes(self) -> nds.lane.reference.types.lanes_in_mask.LanesInMask:
        return self._num_lanes_

    @num_lanes.setter
    def num_lanes(self, num_lanes_: nds.lane.reference.types.lanes_in_mask.LanesInMask) -> None:
        self._num_lanes_ = num_lanes_

    @property
    def lanes(self) -> typing.List[nds.lane.reference.types.lane_position.LanePosition]:
        return self._lanes_.raw_array

    @lanes.setter
    def lanes(self, lanes_: typing.List[nds.lane.reference.types.lane_position.LanePosition]) -> None:
        self._lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), lanes_)

    @property
    def directions(self) -> typing.List[nds.lane.reference.types.lane_validity_direction.LaneValidityDirection]:
        return self._directions_.raw_array

    @directions.setter
    def directions(self, directions_: typing.List[nds.lane.reference.types.lane_validity_direction.LaneValidityDirection]) -> None:
        self._directions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), directions_)

    def init_packing_context(self, zserio_context: LaneGroupPositionValidity.ZserioPackingContext) -> None:
        zserio_context.num_lanes.init(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_lanes_)
        end_bitposition += self._lanes_.bitsizeof(end_bitposition)
        end_bitposition += self._directions_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneGroupPositionValidity.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)
        end_bitposition += self._lanes_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._directions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_lanes_)
        end_bitposition = self._lanes_.initialize_offsets(end_bitposition)
        end_bitposition = self._directions_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneGroupPositionValidity.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)
        end_bitposition = self._lanes_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._directions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_lanes_ = zserio_reader.read_varuint16()
        self._lanes_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), zserio_reader, self._num_lanes_)
        self._directions_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), zserio_reader, self._num_lanes_)

    def read_packed(self, zserio_context: LaneGroupPositionValidity.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_lanes_ = zserio_context.num_lanes.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._lanes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes()), zserio_reader, self._num_lanes_)

        self._directions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_directions()), zserio_reader, self._num_lanes_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._num_lanes_)

        # check array length
        if len(self._lanes_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupPositionValidity.lanes: "
                                                f"{len(self._lanes_)} != {self._num_lanes_}!")
        self._lanes_.write(zserio_writer)

        # check array length
        if len(self._directions_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupPositionValidity.directions: "
                                                f"{len(self._directions_)} != {self._num_lanes_}!")
        self._directions_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneGroupPositionValidity.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_lanes.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_lanes_)

        # check array length
        if len(self._lanes_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupPositionValidity.lanes: "
                                                f"{len(self._lanes_)} != {self._num_lanes_}!")
        self._lanes_.write_packed(zserio_writer)

        # check array length
        if len(self._directions_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupPositionValidity.directions: "
                                                f"{len(self._directions_)} != {self._num_lanes_}!")
        self._directions_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_lanes_ = zserio.array.DeltaContext()

        @property
        def num_lanes(self):
            return self._num_lanes_

    class _ZserioElementFactory_lanes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_position.LanePosition:
            del zserio_index
            return nds.lane.reference.types.lane_position.LanePosition.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.lane.reference.types.lane_position.LanePosition.ZserioPackingContext:
            return nds.lane.reference.types.lane_position.LanePosition.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.lane.reference.types.lane_position.LanePosition.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_position.LanePosition:
            del zserio_index
            return nds.lane.reference.types.lane_position.LanePosition.from_reader_packed(zserio_context, zserio_reader)

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
