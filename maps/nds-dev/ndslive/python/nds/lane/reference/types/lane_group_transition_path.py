# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.reference.types.lane_group_transition

class LaneGroupTransitionPath:
    def __init__(
            self,
            num_lane_groups_: int = int(),
            lane_group_transition_: typing.List[nds.lane.reference.types.lane_group_transition.LaneGroupTransition] = None) -> None:
        self._num_lane_groups_ = num_lane_groups_
        self._lane_group_transition_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_transition()), lane_group_transition_)

    @classmethod
    def from_reader(
            cls: typing.Type['LaneGroupTransitionPath'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneGroupTransitionPath':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneGroupTransitionPath'],
            zserio_context: LaneGroupTransitionPath.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneGroupTransitionPath':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneGroupTransitionPath):
            return ((self._num_lane_groups_ == other._num_lane_groups_) and
                    (self._lane_group_transition_ == other._lane_group_transition_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_lane_groups_)
        result = zserio.hashcode.calc_hashcode_object(result, self._lane_group_transition_)

        return result

    @property
    def num_lane_groups(self) -> int:
        return self._num_lane_groups_

    @num_lane_groups.setter
    def num_lane_groups(self, num_lane_groups_: int) -> None:
        self._num_lane_groups_ = num_lane_groups_

    @property
    def lane_group_transition(self) -> typing.List[nds.lane.reference.types.lane_group_transition.LaneGroupTransition]:
        return self._lane_group_transition_.raw_array

    @lane_group_transition.setter
    def lane_group_transition(self, lane_group_transition_: typing.List[nds.lane.reference.types.lane_group_transition.LaneGroupTransition]) -> None:
        self._lane_group_transition_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_transition()), lane_group_transition_)

    def init_packing_context(self, zserio_context: LaneGroupTransitionPath.ZserioPackingContext) -> None:
        zserio_context.num_lane_groups.init(zserio.array.BitFieldArrayTraits(8), self._num_lane_groups_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += self._lane_group_transition_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneGroupTransitionPath.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_lane_groups.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_lane_groups_)
        end_bitposition += self._lane_group_transition_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition = self._lane_group_transition_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneGroupTransitionPath.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_lane_groups.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_lane_groups_)
        end_bitposition = self._lane_group_transition_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_lane_groups_ = zserio_reader.read_bits(8)
        self._lane_group_transition_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_transition()), zserio_reader, self._num_lane_groups_)

    def read_packed(self, zserio_context: LaneGroupTransitionPath.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_lane_groups_ = zserio_context.num_lane_groups.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._lane_group_transition_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_transition()), zserio_reader, self._num_lane_groups_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._num_lane_groups_, 8)

        # check array length
        if len(self._lane_group_transition_) != (self._num_lane_groups_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupTransitionPath.laneGroupTransition: "
                                                f"{len(self._lane_group_transition_)} != {self._num_lane_groups_}!")
        self._lane_group_transition_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneGroupTransitionPath.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_lane_groups.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_lane_groups_)

        # check array length
        if len(self._lane_group_transition_) != (self._num_lane_groups_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupTransitionPath.laneGroupTransition: "
                                                f"{len(self._lane_group_transition_)} != {self._num_lane_groups_}!")
        self._lane_group_transition_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_lane_groups_ = zserio.array.DeltaContext()

        @property
        def num_lane_groups(self):
            return self._num_lane_groups_

    class _ZserioElementFactory_lane_group_transition:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_group_transition.LaneGroupTransition:
            del zserio_index
            return nds.lane.reference.types.lane_group_transition.LaneGroupTransition.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.lane.reference.types.lane_group_transition.LaneGroupTransition.ZserioPackingContext:
            return nds.lane.reference.types.lane_group_transition.LaneGroupTransition.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.lane.reference.types.lane_group_transition.LaneGroupTransition.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_group_transition.LaneGroupTransition:
            del zserio_index
            return nds.lane.reference.types.lane_group_transition.LaneGroupTransition.from_reader_packed(zserio_context, zserio_reader)
