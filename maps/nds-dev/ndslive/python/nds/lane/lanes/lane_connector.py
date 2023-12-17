# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.lanes.lane_connection_type
import nds.lane.lanes.lane_split_merge_priority
import nds.lane.reference.types.directed_lane_reference

class LaneConnector:
    def __init__(
            self,
            type_: typing.Union[nds.lane.lanes.lane_connection_type.LaneConnectionType, None] = None,
            priority_: typing.Union[nds.lane.lanes.lane_split_merge_priority.LaneSplitMergePriority, None] = nds.lane.lanes.lane_split_merge_priority.LaneSplitMergePriority.MAJOR,
            connected_lane_id_: typing.Optional[nds.lane.reference.types.directed_lane_reference.DirectedLaneReference] = None) -> None:
        self._type_ = type_
        self._priority_ = priority_
        self._connected_lane_id_ = connected_lane_id_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneConnector'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneConnector':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneConnector'],
            zserio_context: LaneConnector.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneConnector':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneConnector):
            return ((self._type_ == other._type_) and
                    (self._priority_ == other._priority_) and
                    (not other.is_connected_lane_id_used() if not self.is_connected_lane_id_used() else (self._connected_lane_id_ == other._connected_lane_id_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._priority_)
        if self.is_connected_lane_id_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._connected_lane_id_)

        return result

    @property
    def type(self) -> typing.Union[nds.lane.lanes.lane_connection_type.LaneConnectionType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.lane.lanes.lane_connection_type.LaneConnectionType, None]) -> None:
        self._type_ = type_

    @property
    def priority(self) -> typing.Union[nds.lane.lanes.lane_split_merge_priority.LaneSplitMergePriority, None]:
        return self._priority_

    @priority.setter
    def priority(self, priority_: typing.Union[nds.lane.lanes.lane_split_merge_priority.LaneSplitMergePriority, None]) -> None:
        self._priority_ = priority_

    @property
    def connected_lane_id(self) -> typing.Optional[nds.lane.reference.types.directed_lane_reference.DirectedLaneReference]:
        return self._connected_lane_id_

    @connected_lane_id.setter
    def connected_lane_id(self, connected_lane_id_: typing.Optional[nds.lane.reference.types.directed_lane_reference.DirectedLaneReference]) -> None:
        self._connected_lane_id_ = connected_lane_id_

    def is_connected_lane_id_used(self) -> bool:
        return self._type_ == nds.lane.lanes.lane_connection_type.LaneConnectionType.BY_IDENTIFIER

    def is_connected_lane_id_set(self) -> bool:
        return not self._connected_lane_id_ is None

    def reset_connected_lane_id(self) -> None:
        self._connected_lane_id_ = None

    def init_packing_context(self, zserio_context: LaneConnector.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        self._priority_.init_packing_context(zserio_context.priority)
        if self.is_connected_lane_id_used():
            self._connected_lane_id_.init_packing_context(zserio_context.connected_lane_id)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        end_bitposition += self._priority_.bitsizeof(end_bitposition)
        if self.is_connected_lane_id_used():
            end_bitposition += self._connected_lane_id_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneConnector.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        end_bitposition += self._priority_.bitsizeof_packed(zserio_context.priority, end_bitposition)
        if self.is_connected_lane_id_used():
            end_bitposition += self._connected_lane_id_.bitsizeof_packed(zserio_context.connected_lane_id, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        end_bitposition = self._priority_.initialize_offsets(end_bitposition)
        if self.is_connected_lane_id_used():
            end_bitposition = self._connected_lane_id_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneConnector.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        end_bitposition = self._priority_.initialize_offsets_packed(zserio_context.priority, end_bitposition)
        if self.is_connected_lane_id_used():
            end_bitposition = self._connected_lane_id_.initialize_offsets_packed(zserio_context.connected_lane_id, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.lane.lanes.lane_connection_type.LaneConnectionType.from_reader(zserio_reader)
        self._priority_ = nds.lane.lanes.lane_split_merge_priority.LaneSplitMergePriority.from_reader(zserio_reader)
        if self.is_connected_lane_id_used():
            self._connected_lane_id_ = nds.lane.reference.types.directed_lane_reference.DirectedLaneReference.from_reader(zserio_reader)
        else:
            self._connected_lane_id_ = None

    def read_packed(self, zserio_context: LaneConnector.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.lane.lanes.lane_connection_type.LaneConnectionType.from_reader_packed(zserio_context.type, zserio_reader)

        self._priority_ = nds.lane.lanes.lane_split_merge_priority.LaneSplitMergePriority.from_reader_packed(zserio_context.priority, zserio_reader)

        if self.is_connected_lane_id_used():
            self._connected_lane_id_ = nds.lane.reference.types.directed_lane_reference.DirectedLaneReference.from_reader_packed(zserio_context.connected_lane_id, zserio_reader)
        else:
            self._connected_lane_id_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write(zserio_writer)
        self._priority_.write(zserio_writer)
        if self.is_connected_lane_id_used():
            self._connected_lane_id_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneConnector.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write_packed(zserio_context.type, zserio_writer)

        self._priority_.write_packed(zserio_context.priority, zserio_writer)

        if self.is_connected_lane_id_used():
            self._connected_lane_id_.write_packed(zserio_context.connected_lane_id, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._type_ = zserio.array.DeltaContext()
            self._priority_ = zserio.array.DeltaContext()
            self._connected_lane_id_ = nds.lane.reference.types.directed_lane_reference.DirectedLaneReference.ZserioPackingContext()

        @property
        def type(self):
            return self._type_

        @property
        def priority(self):
            return self._priority_

        @property
        def connected_lane_id(self):
            return self._connected_lane_id_
