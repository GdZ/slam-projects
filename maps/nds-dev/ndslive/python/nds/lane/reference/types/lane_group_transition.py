# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.reference.types.lane_group_id
import nds.lane.reference.types.lane_id
import nds.lane.reference.types.lanes_in_transition

class LaneGroupTransition:
    def __init__(
            self,
            lane_group_id_: typing.Union[nds.lane.reference.types.lane_group_id.LaneGroupId, None] = None,
            num_lanes_: nds.lane.reference.types.lanes_in_transition.LanesInTransition = nds.lane.reference.types.lanes_in_transition.LanesInTransition(),
            transition_lanes_: typing.List[nds.lane.reference.types.lane_id.LaneId] = None) -> None:
        self._lane_group_id_ = lane_group_id_
        self._num_lanes_ = num_lanes_
        self._transition_lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transition_lanes()), transition_lanes_)

    @classmethod
    def from_reader(
            cls: typing.Type['LaneGroupTransition'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneGroupTransition':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneGroupTransition'],
            zserio_context: LaneGroupTransition.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneGroupTransition':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneGroupTransition):
            return ((self._lane_group_id_ == other._lane_group_id_) and
                    (self._num_lanes_ == other._num_lanes_) and
                    (self._transition_lanes_ == other._transition_lanes_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._lane_group_id_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_lanes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._transition_lanes_)

        return result

    @property
    def lane_group_id(self) -> typing.Union[nds.lane.reference.types.lane_group_id.LaneGroupId, None]:
        return self._lane_group_id_

    @lane_group_id.setter
    def lane_group_id(self, lane_group_id_: typing.Union[nds.lane.reference.types.lane_group_id.LaneGroupId, None]) -> None:
        self._lane_group_id_ = lane_group_id_

    @property
    def num_lanes(self) -> nds.lane.reference.types.lanes_in_transition.LanesInTransition:
        return self._num_lanes_

    @num_lanes.setter
    def num_lanes(self, num_lanes_: nds.lane.reference.types.lanes_in_transition.LanesInTransition) -> None:
        self._num_lanes_ = num_lanes_

    @property
    def transition_lanes(self) -> typing.List[nds.lane.reference.types.lane_id.LaneId]:
        return self._transition_lanes_.raw_array

    @transition_lanes.setter
    def transition_lanes(self, transition_lanes_: typing.List[nds.lane.reference.types.lane_id.LaneId]) -> None:
        self._transition_lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transition_lanes()), transition_lanes_)

    def init_packing_context(self, zserio_context: LaneGroupTransition.ZserioPackingContext) -> None:
        self._lane_group_id_.init_packing_context(zserio_context.lane_group_id)
        zserio_context.num_lanes.init(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._lane_group_id_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_lanes_)
        end_bitposition += self._transition_lanes_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneGroupTransition.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._lane_group_id_.bitsizeof_packed(zserio_context.lane_group_id, end_bitposition)
        end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)
        end_bitposition += self._transition_lanes_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._lane_group_id_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_lanes_)
        end_bitposition = self._transition_lanes_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneGroupTransition.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._lane_group_id_.initialize_offsets_packed(zserio_context.lane_group_id, end_bitposition)
        end_bitposition += zserio_context.num_lanes.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_lanes_)
        end_bitposition = self._transition_lanes_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._lane_group_id_ = nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader(zserio_reader)
        self._num_lanes_ = zserio_reader.read_varuint16()
        self._transition_lanes_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transition_lanes()), zserio_reader, self._num_lanes_)

    def read_packed(self, zserio_context: LaneGroupTransition.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._lane_group_id_ = nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader_packed(zserio_context.lane_group_id, zserio_reader)

        self._num_lanes_ = zserio_context.num_lanes.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._transition_lanes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transition_lanes()), zserio_reader, self._num_lanes_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._lane_group_id_.write(zserio_writer)

        zserio_writer.write_varuint16(self._num_lanes_)

        # check array length
        if len(self._transition_lanes_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupTransition.transitionLanes: "
                                                f"{len(self._transition_lanes_)} != {self._num_lanes_}!")
        self._transition_lanes_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneGroupTransition.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._lane_group_id_.write_packed(zserio_context.lane_group_id, zserio_writer)

        zserio_context.num_lanes.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_lanes_)

        # check array length
        if len(self._transition_lanes_) != (self._num_lanes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneGroupTransition.transitionLanes: "
                                                f"{len(self._transition_lanes_)} != {self._num_lanes_}!")
        self._transition_lanes_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._lane_group_id_ = nds.lane.reference.types.lane_group_id.LaneGroupId.ZserioPackingContext()
            self._num_lanes_ = zserio.array.DeltaContext()

        @property
        def lane_group_id(self):
            return self._lane_group_id_

        @property
        def num_lanes(self):
            return self._num_lanes_

    class _ZserioElementFactory_transition_lanes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_id.LaneId:
            del zserio_index
            return nds.lane.reference.types.lane_id.LaneId.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.lane.reference.types.lane_id.LaneId.ZserioPackingContext:
            return nds.lane.reference.types.lane_id.LaneId.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.lane.reference.types.lane_id.LaneId.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_id.LaneId:
            del zserio_index
            return nds.lane.reference.types.lane_id.LaneId.from_reader_packed(zserio_context, zserio_reader)
