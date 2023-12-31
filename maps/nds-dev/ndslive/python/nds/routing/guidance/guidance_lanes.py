# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routing.guidance.guidance_lane_marking

class GuidanceLanes:
    def __init__(
            self,
            num_lanes_: int = int(),
            active_: typing.List[bool] = None,
            markings_: typing.Optional[typing.List[nds.routing.guidance.guidance_lane_marking.GuidanceLaneMarking]] = None) -> None:
        self._num_lanes_ = num_lanes_
        self._active_ = zserio.array.Array(zserio.array.BoolArrayTraits(), active_)
        if markings_ is None:
            self._markings_ = None
        else:
            self._markings_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_markings()), markings_)

    @classmethod
    def from_reader(
            cls: typing.Type['GuidanceLanes'],
            zserio_reader: zserio.BitStreamReader) -> 'GuidanceLanes':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['GuidanceLanes'],
            zserio_context: GuidanceLanes.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'GuidanceLanes':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, GuidanceLanes):
            return ((self._num_lanes_ == other._num_lanes_) and
                    (self._active_ == other._active_) and
                    (not other.is_markings_used() if not self.is_markings_used() else (self._markings_ == other._markings_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_lanes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._active_)
        if self.is_markings_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._markings_)

        return result

    @property
    def num_lanes(self) -> int:
        return self._num_lanes_

    @num_lanes.setter
    def num_lanes(self, num_lanes_: int) -> None:
        self._num_lanes_ = num_lanes_

    @property
    def active(self) -> typing.List[bool]:
        return self._active_.raw_array

    @active.setter
    def active(self, active_: typing.List[bool]) -> None:
        self._active_ = zserio.array.Array(zserio.array.BoolArrayTraits(), active_)

    @property
    def markings(self) -> typing.Optional[typing.List[nds.routing.guidance.guidance_lane_marking.GuidanceLaneMarking]]:
        return None if self._markings_ is None else self._markings_.raw_array

    @markings.setter
    def markings(self, markings_: typing.Optional[typing.List[nds.routing.guidance.guidance_lane_marking.GuidanceLaneMarking]]) -> None:
        if markings_ is None:
            self._markings_ = None
        else:
            self._markings_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_markings()), markings_)

    def is_markings_used(self) -> bool:
        return self.is_markings_set()

    def is_markings_set(self) -> bool:
        return not self._markings_ is None

    def reset_markings(self) -> None:
        self._markings_ = None

    def init_packing_context(self, zserio_context: GuidanceLanes.ZserioPackingContext) -> None:
        zserio_context.num_lanes.init(zserio.array.BitFieldArrayTraits(8), self._num_lanes_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += self._active_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_markings_used():
            end_bitposition += self._markings_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: GuidanceLanes.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_lanes_)
        end_bitposition += self._active_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_markings_used():
            end_bitposition += self._markings_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition = self._active_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_markings_used():
            end_bitposition = self._markings_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: GuidanceLanes.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_lanes_)
        end_bitposition = self._active_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_markings_used():
            end_bitposition = self._markings_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_lanes_ = zserio_reader.read_bits(8)
        self._active_ = zserio.array.Array.from_reader(zserio.array.BoolArrayTraits(), zserio_reader, self._num_lanes_)
        if zserio_reader.read_bool():
            self._markings_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_markings()), zserio_reader, self._num_lanes_)
        else:
            self._markings_ = None

    def read_packed(self, zserio_context: GuidanceLanes.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_lanes_ = zserio_context.num_lanes.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._active_ = zserio.array.Array.from_reader(zserio.array.BoolArrayTraits(), zserio_reader, self._num_lanes_)

        if zserio_reader.read_bool():
            self._markings_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_markings()), zserio_reader, self._num_lanes_)
        else:
            self._markings_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._num_lanes_, 8)

        # check array length
        if len(self._active_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field GuidanceLanes.active: "
                                                f"{len(self._active_)} != {self._num_lanes_}!")
        self._active_.write(zserio_writer)

        if self.is_markings_used():
            zserio_writer.write_bool(True)
            # check array length
            if len(self._markings_) != (self._num_lanes_):
                raise zserio.PythonRuntimeException("Wrong array length for field GuidanceLanes.markings: "
                                                    f"{len(self._markings_)} != {self._num_lanes_}!")
            self._markings_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: GuidanceLanes.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_lanes.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_lanes_)

        # check array length
        if len(self._active_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field GuidanceLanes.active: "
                                                f"{len(self._active_)} != {self._num_lanes_}!")
        self._active_.write(zserio_writer)

        if self.is_markings_used():
            zserio_writer.write_bool(True)
            # check array length
            if len(self._markings_) != (self._num_lanes_):
                raise zserio.PythonRuntimeException("Wrong array length for field GuidanceLanes.markings: "
                                                    f"{len(self._markings_)} != {self._num_lanes_}!")
            self._markings_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._num_lanes_ = zserio.array.DeltaContext()

        @property
        def num_lanes(self):
            return self._num_lanes_

    class _ZserioElementFactory_markings:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routing.guidance.guidance_lane_marking.GuidanceLaneMarking:
            del zserio_index
            return nds.routing.guidance.guidance_lane_marking.GuidanceLaneMarking.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> zserio.array.DeltaContext:
            return zserio.array.DeltaContext()

        @staticmethod
        def create_packed(zserio_context: zserio.array.DeltaContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routing.guidance.guidance_lane_marking.GuidanceLaneMarking:
            del zserio_index
            return nds.routing.guidance.guidance_lane_marking.GuidanceLaneMarking.from_reader_packed(zserio_context, zserio_reader)
