# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.reference.types.lane_group_id
import nds.lane.reference.types.lane_group_reference_indirect

class MultiDigitizedLaneGroupReference:
    def __init__(
            self,
            is_direct_reference_: bool = bool(),
            counterpart_reference_: typing.Optional[nds.lane.reference.types.lane_group_id.LaneGroupId] = None,
            counterpart_reference_indirect_: typing.Optional[nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect] = None) -> None:
        self._is_direct_reference_ = is_direct_reference_
        self._counterpart_reference_ = counterpart_reference_
        self._counterpart_reference_indirect_ = counterpart_reference_indirect_

    @classmethod
    def from_reader(
            cls: typing.Type['MultiDigitizedLaneGroupReference'],
            zserio_reader: zserio.BitStreamReader) -> 'MultiDigitizedLaneGroupReference':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['MultiDigitizedLaneGroupReference'],
            zserio_context: MultiDigitizedLaneGroupReference.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'MultiDigitizedLaneGroupReference':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, MultiDigitizedLaneGroupReference):
            return ((self._is_direct_reference_ == other._is_direct_reference_) and
                    (not other.is_counterpart_reference_used() if not self.is_counterpart_reference_used() else (self._counterpart_reference_ == other._counterpart_reference_)) and
                    (not other.is_counterpart_reference_indirect_used() if not self.is_counterpart_reference_indirect_used() else (self._counterpart_reference_indirect_ == other._counterpart_reference_indirect_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_direct_reference_)
        if self.is_counterpart_reference_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._counterpart_reference_)
        if self.is_counterpart_reference_indirect_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._counterpart_reference_indirect_)

        return result

    @property
    def is_direct_reference(self) -> bool:
        return self._is_direct_reference_

    @is_direct_reference.setter
    def is_direct_reference(self, is_direct_reference_: bool) -> None:
        self._is_direct_reference_ = is_direct_reference_

    @property
    def counterpart_reference(self) -> typing.Optional[nds.lane.reference.types.lane_group_id.LaneGroupId]:
        return self._counterpart_reference_

    @counterpart_reference.setter
    def counterpart_reference(self, counterpart_reference_: typing.Optional[nds.lane.reference.types.lane_group_id.LaneGroupId]) -> None:
        self._counterpart_reference_ = counterpart_reference_

    def is_counterpart_reference_used(self) -> bool:
        return self._is_direct_reference_

    def is_counterpart_reference_set(self) -> bool:
        return not self._counterpart_reference_ is None

    def reset_counterpart_reference(self) -> None:
        self._counterpart_reference_ = None

    @property
    def counterpart_reference_indirect(self) -> typing.Optional[nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect]:
        return self._counterpart_reference_indirect_

    @counterpart_reference_indirect.setter
    def counterpart_reference_indirect(self, counterpart_reference_indirect_: typing.Optional[nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect]) -> None:
        self._counterpart_reference_indirect_ = counterpart_reference_indirect_

    def is_counterpart_reference_indirect_used(self) -> bool:
        return not self._is_direct_reference_

    def is_counterpart_reference_indirect_set(self) -> bool:
        return not self._counterpart_reference_indirect_ is None

    def reset_counterpart_reference_indirect(self) -> None:
        self._counterpart_reference_indirect_ = None

    def init_packing_context(self, zserio_context: MultiDigitizedLaneGroupReference.ZserioPackingContext) -> None:
        if self.is_counterpart_reference_used():
            self._counterpart_reference_.init_packing_context(zserio_context.counterpart_reference)
        if self.is_counterpart_reference_indirect_used():
            self._counterpart_reference_indirect_.init_packing_context(zserio_context.counterpart_reference_indirect)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_counterpart_reference_used():
            end_bitposition += self._counterpart_reference_.bitsizeof(end_bitposition)
        if self.is_counterpart_reference_indirect_used():
            end_bitposition += self._counterpart_reference_indirect_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: MultiDigitizedLaneGroupReference.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_counterpart_reference_used():
            end_bitposition += self._counterpart_reference_.bitsizeof_packed(zserio_context.counterpart_reference, end_bitposition)
        if self.is_counterpart_reference_indirect_used():
            end_bitposition += self._counterpart_reference_indirect_.bitsizeof_packed(zserio_context.counterpart_reference_indirect, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_counterpart_reference_used():
            end_bitposition = self._counterpart_reference_.initialize_offsets(end_bitposition)
        if self.is_counterpart_reference_indirect_used():
            end_bitposition = self._counterpart_reference_indirect_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: MultiDigitizedLaneGroupReference.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_counterpart_reference_used():
            end_bitposition = self._counterpart_reference_.initialize_offsets_packed(zserio_context.counterpart_reference, end_bitposition)
        if self.is_counterpart_reference_indirect_used():
            end_bitposition = self._counterpart_reference_indirect_.initialize_offsets_packed(zserio_context.counterpart_reference_indirect, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._is_direct_reference_ = zserio_reader.read_bool()
        if self.is_counterpart_reference_used():
            self._counterpart_reference_ = nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader(zserio_reader)
        else:
            self._counterpart_reference_ = None
        if self.is_counterpart_reference_indirect_used():
            self._counterpart_reference_indirect_ = nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect.from_reader(zserio_reader)
        else:
            self._counterpart_reference_indirect_ = None

    def read_packed(self, zserio_context: MultiDigitizedLaneGroupReference.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._is_direct_reference_ = zserio_reader.read_bool()

        if self.is_counterpart_reference_used():
            self._counterpart_reference_ = nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader_packed(zserio_context.counterpart_reference, zserio_reader)
        else:
            self._counterpart_reference_ = None

        if self.is_counterpart_reference_indirect_used():
            self._counterpart_reference_indirect_ = nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect.from_reader_packed(zserio_context.counterpart_reference_indirect, zserio_reader)
        else:
            self._counterpart_reference_indirect_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._is_direct_reference_)
        if self.is_counterpart_reference_used():
            self._counterpart_reference_.write(zserio_writer)
        if self.is_counterpart_reference_indirect_used():
            self._counterpart_reference_indirect_.write(zserio_writer)

    def write_packed(self, zserio_context: MultiDigitizedLaneGroupReference.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._is_direct_reference_)

        if self.is_counterpart_reference_used():
            self._counterpart_reference_.write_packed(zserio_context.counterpart_reference, zserio_writer)

        if self.is_counterpart_reference_indirect_used():
            self._counterpart_reference_indirect_.write_packed(zserio_context.counterpart_reference_indirect, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._counterpart_reference_ = nds.lane.reference.types.lane_group_id.LaneGroupId.ZserioPackingContext()
            self._counterpart_reference_indirect_ = nds.lane.reference.types.lane_group_reference_indirect.LaneGroupReferenceIndirect.ZserioPackingContext()

        @property
        def counterpart_reference(self):
            return self._counterpart_reference_

        @property
        def counterpart_reference_indirect(self):
            return self._counterpart_reference_indirect_