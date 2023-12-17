# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.lanegroups.lane_group_connector
import nds.lane.lanes.lane
import nds.lane.types.lane_layout_type

class ArtificialRoadLaneGroup:
    def __init__(
            self,
            has_boundary_geometry_: bool,
            start_on_border_: bool = bool(),
            end_on_border_: bool = bool(),
            start_connector_: typing.Union[nds.lane.lanegroups.lane_group_connector.LaneGroupConnector, None] = None,
            end_connector_: typing.Union[nds.lane.lanegroups.lane_group_connector.LaneGroupConnector, None] = None,
            lanes_: typing.List[nds.lane.lanes.lane.Lane] = None) -> None:
        self._has_boundary_geometry_ = has_boundary_geometry_
        self._start_on_border_ = start_on_border_
        self._end_on_border_ = end_on_border_
        self._start_connector_ = start_connector_
        self._end_connector_ = end_connector_
        self._lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes(self)), lanes_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['ArtificialRoadLaneGroup'],
            zserio_reader: zserio.BitStreamReader,
            has_boundary_geometry_: bool) -> 'ArtificialRoadLaneGroup':
        self = object.__new__(cls)
        self._has_boundary_geometry_ = has_boundary_geometry_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ArtificialRoadLaneGroup'],
            zserio_context: ArtificialRoadLaneGroup.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            has_boundary_geometry_: bool) -> 'ArtificialRoadLaneGroup':
        self = object.__new__(cls)
        self._has_boundary_geometry_ = has_boundary_geometry_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ArtificialRoadLaneGroup):
            return (self._has_boundary_geometry_ == other._has_boundary_geometry_ and
                    (self._start_on_border_ == other._start_on_border_) and
                    (self._end_on_border_ == other._end_on_border_) and
                    (self._start_connector_ == other._start_connector_) and
                    (self._end_connector_ == other._end_connector_) and
                    (self._lanes_ == other._lanes_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_boundary_geometry_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._start_on_border_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._end_on_border_)
        result = zserio.hashcode.calc_hashcode_object(result, self._start_connector_)
        result = zserio.hashcode.calc_hashcode_object(result, self._end_connector_)
        result = zserio.hashcode.calc_hashcode_object(result, self._lanes_)

        return result

    @property
    def has_boundary_geometry(self) -> bool:
        return self._has_boundary_geometry_

    @property
    def start_on_border(self) -> bool:
        return self._start_on_border_

    @start_on_border.setter
    def start_on_border(self, start_on_border_: bool) -> None:
        self._start_on_border_ = start_on_border_

    @property
    def end_on_border(self) -> bool:
        return self._end_on_border_

    @end_on_border.setter
    def end_on_border(self, end_on_border_: bool) -> None:
        self._end_on_border_ = end_on_border_

    @property
    def start_connector(self) -> typing.Union[nds.lane.lanegroups.lane_group_connector.LaneGroupConnector, None]:
        return self._start_connector_

    @start_connector.setter
    def start_connector(self, start_connector_: typing.Union[nds.lane.lanegroups.lane_group_connector.LaneGroupConnector, None]) -> None:
        self._start_connector_ = start_connector_

    @property
    def end_connector(self) -> typing.Union[nds.lane.lanegroups.lane_group_connector.LaneGroupConnector, None]:
        return self._end_connector_

    @end_connector.setter
    def end_connector(self, end_connector_: typing.Union[nds.lane.lanegroups.lane_group_connector.LaneGroupConnector, None]) -> None:
        self._end_connector_ = end_connector_

    @property
    def lanes(self) -> typing.List[nds.lane.lanes.lane.Lane]:
        return self._lanes_.raw_array

    @lanes.setter
    def lanes(self, lanes_: typing.List[nds.lane.lanes.lane.Lane]) -> None:
        self._lanes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes(self)), lanes_, is_auto=True)

    def init_packing_context(self, zserio_context: ArtificialRoadLaneGroup.ZserioPackingContext) -> None:
        self._start_connector_.init_packing_context(zserio_context.start_connector)
        self._end_connector_.init_packing_context(zserio_context.end_connector)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += self._start_connector_.bitsizeof(end_bitposition)
        end_bitposition += self._end_connector_.bitsizeof(end_bitposition)
        end_bitposition += self._lanes_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ArtificialRoadLaneGroup.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += self._start_connector_.bitsizeof_packed(zserio_context.start_connector, end_bitposition)
        end_bitposition += self._end_connector_.bitsizeof_packed(zserio_context.end_connector, end_bitposition)
        end_bitposition += self._lanes_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition = self._start_connector_.initialize_offsets(end_bitposition)
        end_bitposition = self._end_connector_.initialize_offsets(end_bitposition)
        end_bitposition = self._lanes_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ArtificialRoadLaneGroup.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition = self._start_connector_.initialize_offsets_packed(zserio_context.start_connector, end_bitposition)
        end_bitposition = self._end_connector_.initialize_offsets_packed(zserio_context.end_connector, end_bitposition)
        end_bitposition = self._lanes_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_on_border_ = zserio_reader.read_bool()
        self._end_on_border_ = zserio_reader.read_bool()
        self._start_connector_ = nds.lane.lanegroups.lane_group_connector.LaneGroupConnector.from_reader(zserio_reader, self._start_on_border_)
        self._end_connector_ = nds.lane.lanegroups.lane_group_connector.LaneGroupConnector.from_reader(zserio_reader, self._end_on_border_)
        self._lanes_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes(self)), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: ArtificialRoadLaneGroup.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._start_on_border_ = zserio_reader.read_bool()

        self._end_on_border_ = zserio_reader.read_bool()

        self._start_connector_ = nds.lane.lanegroups.lane_group_connector.LaneGroupConnector.from_reader_packed(zserio_context.start_connector, zserio_reader, self._start_on_border_)

        self._end_connector_ = nds.lane.lanegroups.lane_group_connector.LaneGroupConnector.from_reader_packed(zserio_context.end_connector, zserio_reader, self._end_on_border_)

        self._lanes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lanes(self)), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._start_on_border_)

        zserio_writer.write_bool(self._end_on_border_)

        # check parameters
        if self._start_connector_.on_border != (self._start_on_border_):
            raise zserio.PythonRuntimeException("Wrong parameter onBorder for field ArtificialRoadLaneGroup.startConnector: "
                                                f"{self._start_connector_.on_border} != {self._start_on_border_}!")
        self._start_connector_.write(zserio_writer)

        # check parameters
        if self._end_connector_.on_border != (self._end_on_border_):
            raise zserio.PythonRuntimeException("Wrong parameter onBorder for field ArtificialRoadLaneGroup.endConnector: "
                                                f"{self._end_connector_.on_border} != {self._end_on_border_}!")
        self._end_connector_.write(zserio_writer)

        self._lanes_.write(zserio_writer)

    def write_packed(self, zserio_context: ArtificialRoadLaneGroup.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._start_on_border_)

        zserio_writer.write_bool(self._end_on_border_)

        # check parameters
        if self._start_connector_.on_border != (self._start_on_border_):
            raise zserio.PythonRuntimeException("Wrong parameter onBorder for field ArtificialRoadLaneGroup.startConnector: "
                                                f"{self._start_connector_.on_border} != {self._start_on_border_}!")
        self._start_connector_.write_packed(zserio_context.start_connector, zserio_writer)

        # check parameters
        if self._end_connector_.on_border != (self._end_on_border_):
            raise zserio.PythonRuntimeException("Wrong parameter onBorder for field ArtificialRoadLaneGroup.endConnector: "
                                                f"{self._end_connector_.on_border} != {self._end_on_border_}!")
        self._end_connector_.write_packed(zserio_context.end_connector, zserio_writer)

        self._lanes_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._start_connector_ = nds.lane.lanegroups.lane_group_connector.LaneGroupConnector.ZserioPackingContext()
            self._end_connector_ = nds.lane.lanegroups.lane_group_connector.LaneGroupConnector.ZserioPackingContext()

        @property
        def start_connector(self):
            return self._start_connector_

        @property
        def end_connector(self):
            return self._end_connector_

    class _ZserioElementFactory_lanes:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.lanes.lane.Lane:
            del zserio_index
            return nds.lane.lanes.lane.Lane.from_reader(zserio_reader, nds.lane.types.lane_layout_type.LaneLayoutType.ORDERED, self._owner._has_boundary_geometry_)

        @staticmethod
        def create_packing_context() -> nds.lane.lanes.lane.Lane.ZserioPackingContext:
            return nds.lane.lanes.lane.Lane.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.lane.lanes.lane.Lane.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.lanes.lane.Lane:
            del zserio_index
            return nds.lane.lanes.lane.Lane.from_reader_packed(zserio_context, zserio_reader, nds.lane.types.lane_layout_type.LaneLayoutType.ORDERED, self._owner._has_boundary_geometry_)