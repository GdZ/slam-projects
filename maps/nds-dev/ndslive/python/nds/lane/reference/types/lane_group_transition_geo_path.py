# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.reference.types.lane_group_reference_indirect
import nds.lane.reference.types.lane_group_transition

class LaneGroupTransitionGeoPath:
    def __init__(
            self,
            start_transition_: typing.Union[nds.lane.reference.types.lane_group_transition.LaneGroupTransition, None] = None,
            transition_path_: typing.Union[nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect, None] = None) -> None:
        self._start_transition_ = start_transition_
        self._transition_path_ = transition_path_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneGroupTransitionGeoPath'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneGroupTransitionGeoPath':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneGroupTransitionGeoPath'],
            zserio_context: LaneGroupTransitionGeoPath.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneGroupTransitionGeoPath':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneGroupTransitionGeoPath):
            return ((self._start_transition_ == other._start_transition_) and
                    (self._transition_path_ == other._transition_path_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._start_transition_)
        result = zserio.hashcode.calc_hashcode_object(result, self._transition_path_)

        return result

    @property
    def start_transition(self) -> typing.Union[nds.lane.reference.types.lane_group_transition.LaneGroupTransition, None]:
        return self._start_transition_

    @start_transition.setter
    def start_transition(self, start_transition_: typing.Union[nds.lane.reference.types.lane_group_transition.LaneGroupTransition, None]) -> None:
        self._start_transition_ = start_transition_

    @property
    def transition_path(self) -> typing.Union[nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect, None]:
        return self._transition_path_

    @transition_path.setter
    def transition_path(self, transition_path_: typing.Union[nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect, None]) -> None:
        self._transition_path_ = transition_path_

    def init_packing_context(self, zserio_context: LaneGroupTransitionGeoPath.ZserioPackingContext) -> None:
        self._start_transition_.init_packing_context(zserio_context.start_transition)
        self._transition_path_.init_packing_context(zserio_context.transition_path)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_transition_.bitsizeof(end_bitposition)
        end_bitposition += self._transition_path_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneGroupTransitionGeoPath.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._start_transition_.bitsizeof_packed(zserio_context.start_transition, end_bitposition)
        end_bitposition += self._transition_path_.bitsizeof_packed(zserio_context.transition_path, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_transition_.initialize_offsets(end_bitposition)
        end_bitposition = self._transition_path_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneGroupTransitionGeoPath.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._start_transition_.initialize_offsets_packed(zserio_context.start_transition, end_bitposition)
        end_bitposition = self._transition_path_.initialize_offsets_packed(zserio_context.transition_path, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_transition_ = nds.lane.reference.types.lane_group_transition.LaneGroupTransition.from_reader(zserio_reader)
        self._transition_path_ = nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect.from_reader(zserio_reader)

    def read_packed(self, zserio_context: LaneGroupTransitionGeoPath.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_transition_ = nds.lane.reference.types.lane_group_transition.LaneGroupTransition.from_reader_packed(zserio_context.start_transition, zserio_reader)

        self._transition_path_ = nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect.from_reader_packed(zserio_context.transition_path, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._start_transition_.write(zserio_writer)
        self._transition_path_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneGroupTransitionGeoPath.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._start_transition_.write_packed(zserio_context.start_transition, zserio_writer)

        self._transition_path_.write_packed(zserio_context.transition_path, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._start_transition_ = nds.lane.reference.types.lane_group_transition.LaneGroupTransition.ZserioPackingContext()
            self._transition_path_ = nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect.ZserioPackingContext()

        @property
        def start_transition(self):
            return self._start_transition_

        @property
        def transition_path(self):
            return self._transition_path_
