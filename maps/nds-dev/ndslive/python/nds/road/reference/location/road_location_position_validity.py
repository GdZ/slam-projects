# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.core.location.road_location_id_position

class RoadLocationPositionValidity:
    def __init__(
            self,
            shift_: nds.core.geometry.coord_shift.CoordShift,
            num_positions_: int = int(),
            positions_: typing.List[nds.core.location.road_location_id_position.RoadLocationIdPosition] = None) -> None:
        self._shift_ = shift_
        self._num_positions_ = num_positions_
        self._positions_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), positions_)

    @classmethod
    def from_reader(
            cls: typing.Type['RoadLocationPositionValidity'],
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoadLocationPositionValidity':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadLocationPositionValidity'],
            zserio_context: RoadLocationPositionValidity.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoadLocationPositionValidity':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadLocationPositionValidity):
            return (self._shift_ == other._shift_ and
                    (self._num_positions_ == other._num_positions_) and
                    (self._positions_ == other._positions_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_positions_)
        result = zserio.hashcode.calc_hashcode_object(result, self._positions_)

        return result

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @property
    def num_positions(self) -> int:
        return self._num_positions_

    @num_positions.setter
    def num_positions(self, num_positions_: int) -> None:
        self._num_positions_ = num_positions_

    @property
    def positions(self) -> typing.List[nds.core.location.road_location_id_position.RoadLocationIdPosition]:
        return self._positions_.raw_array

    @positions.setter
    def positions(self, positions_: typing.List[nds.core.location.road_location_id_position.RoadLocationIdPosition]) -> None:
        self._positions_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), positions_)

    def init_packing_context(self, zserio_context: RoadLocationPositionValidity.ZserioPackingContext) -> None:
        zserio_context.num_positions.init(zserio.array.VarSizeArrayTraits(), self._num_positions_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_positions_)
        end_bitposition += self._positions_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadLocationPositionValidity.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_positions.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_positions_)
        end_bitposition += self._positions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_positions_)
        end_bitposition = self._positions_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadLocationPositionValidity.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_positions.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_positions_)
        end_bitposition = self._positions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_positions_ = zserio_reader.read_varsize()
        self._positions_ = zserio.array.Array.from_reader(zserio.array.VarUInt32ArrayTraits(), zserio_reader, self._num_positions_)

    def read_packed(self, zserio_context: RoadLocationPositionValidity.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_positions_ = zserio_context.num_positions.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._positions_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt32ArrayTraits(), zserio_reader, self._num_positions_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_positions_)

        # check array length
        if len(self._positions_) != (self._num_positions_):
            raise zserio.PythonRuntimeException("Wrong array length for field RoadLocationPositionValidity.positions: "
                                                f"{len(self._positions_)} != {self._num_positions_}!")
        self._positions_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadLocationPositionValidity.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_positions.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_positions_)

        # check array length
        if len(self._positions_) != (self._num_positions_):
            raise zserio.PythonRuntimeException("Wrong array length for field RoadLocationPositionValidity.positions: "
                                                f"{len(self._positions_)} != {self._num_positions_}!")
        self._positions_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_positions_ = zserio.array.DeltaContext()

        @property
        def num_positions(self):
            return self._num_positions_
