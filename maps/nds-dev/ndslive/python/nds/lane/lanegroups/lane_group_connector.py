# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.core.geometry.position3d
import nds.lane.reference.types.lane_group_id
import nds.lane.types.tile_border_indicator

class LaneGroupConnector:
    def __init__(
            self,
            on_border_: bool,
            position_: typing.Union[nds.core.geometry.position3d.Position3D, None] = None,
            connected_lane_group_id_: typing.Optional[nds.lane.reference.types.lane_group_id.LaneGroupId] = None,
            border_indicator_: typing.Optional[nds.lane.types.tile_border_indicator.TileBorderIndicator] = None) -> None:
        self._on_border_ = on_border_
        self._position_ = position_
        self._connected_lane_group_id_ = connected_lane_group_id_
        self._border_indicator_ = border_indicator_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneGroupConnector'],
            zserio_reader: zserio.BitStreamReader,
            on_border_: bool) -> 'LaneGroupConnector':
        self = object.__new__(cls)
        self._on_border_ = on_border_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneGroupConnector'],
            zserio_context: LaneGroupConnector.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            on_border_: bool) -> 'LaneGroupConnector':
        self = object.__new__(cls)
        self._on_border_ = on_border_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneGroupConnector):
            return (self._on_border_ == other._on_border_ and
                    (self._position_ == other._position_) and
                    (not other.is_connected_lane_group_id_used() if not self.is_connected_lane_group_id_used() else (self._connected_lane_group_id_ == other._connected_lane_group_id_)) and
                    (not other.is_border_indicator_used() if not self.is_border_indicator_used() else (self._border_indicator_ == other._border_indicator_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._on_border_)
        result = zserio.hashcode.calc_hashcode_object(result, self._position_)
        if self.is_connected_lane_group_id_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._connected_lane_group_id_)
        if self.is_border_indicator_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._border_indicator_)

        return result

    @property
    def on_border(self) -> bool:
        return self._on_border_

    @property
    def position(self) -> typing.Union[nds.core.geometry.position3d.Position3D, None]:
        return self._position_

    @position.setter
    def position(self, position_: typing.Union[nds.core.geometry.position3d.Position3D, None]) -> None:
        self._position_ = position_

    @property
    def connected_lane_group_id(self) -> typing.Optional[nds.lane.reference.types.lane_group_id.LaneGroupId]:
        return self._connected_lane_group_id_

    @connected_lane_group_id.setter
    def connected_lane_group_id(self, connected_lane_group_id_: typing.Optional[nds.lane.reference.types.lane_group_id.LaneGroupId]) -> None:
        self._connected_lane_group_id_ = connected_lane_group_id_

    def is_connected_lane_group_id_used(self) -> bool:
        return not self._on_border_

    def is_connected_lane_group_id_set(self) -> bool:
        return not self._connected_lane_group_id_ is None

    def reset_connected_lane_group_id(self) -> None:
        self._connected_lane_group_id_ = None

    @property
    def border_indicator(self) -> typing.Optional[nds.lane.types.tile_border_indicator.TileBorderIndicator]:
        return self._border_indicator_

    @border_indicator.setter
    def border_indicator(self, border_indicator_: typing.Optional[nds.lane.types.tile_border_indicator.TileBorderIndicator]) -> None:
        self._border_indicator_ = border_indicator_

    def is_border_indicator_used(self) -> bool:
        return self._on_border_

    def is_border_indicator_set(self) -> bool:
        return not self._border_indicator_ is None

    def reset_border_indicator(self) -> None:
        self._border_indicator_ = None

    def init_packing_context(self, zserio_context: LaneGroupConnector.ZserioPackingContext) -> None:
        self._position_.init_packing_context(zserio_context.position)
        if self.is_connected_lane_group_id_used():
            self._connected_lane_group_id_.init_packing_context(zserio_context.connected_lane_group_id)
        if self.is_border_indicator_used():
            self._border_indicator_.init_packing_context(zserio_context.border_indicator)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof(end_bitposition)
        if self.is_connected_lane_group_id_used():
            end_bitposition += self._connected_lane_group_id_.bitsizeof(end_bitposition)
        if self.is_border_indicator_used():
            end_bitposition += self._border_indicator_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneGroupConnector.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof_packed(zserio_context.position, end_bitposition)
        if self.is_connected_lane_group_id_used():
            end_bitposition += self._connected_lane_group_id_.bitsizeof_packed(zserio_context.connected_lane_group_id, end_bitposition)
        if self.is_border_indicator_used():
            end_bitposition += self._border_indicator_.bitsizeof_packed(zserio_context.border_indicator, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets(end_bitposition)
        if self.is_connected_lane_group_id_used():
            end_bitposition = self._connected_lane_group_id_.initialize_offsets(end_bitposition)
        if self.is_border_indicator_used():
            end_bitposition = self._border_indicator_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneGroupConnector.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets_packed(zserio_context.position, end_bitposition)
        if self.is_connected_lane_group_id_used():
            end_bitposition = self._connected_lane_group_id_.initialize_offsets_packed(zserio_context.connected_lane_group_id, end_bitposition)
        if self.is_border_indicator_used():
            end_bitposition = self._border_indicator_.initialize_offsets_packed(zserio_context.border_indicator, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position3d.Position3D.from_reader(zserio_reader, 0, 0)
        if self.is_connected_lane_group_id_used():
            self._connected_lane_group_id_ = nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader(zserio_reader)
        else:
            self._connected_lane_group_id_ = None
        if self.is_border_indicator_used():
            self._border_indicator_ = nds.lane.types.tile_border_indicator.TileBorderIndicator.from_reader(zserio_reader)
        else:
            self._border_indicator_ = None

    def read_packed(self, zserio_context: LaneGroupConnector.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position3d.Position3D.from_reader_packed(zserio_context.position, zserio_reader, 0, 0)

        if self.is_connected_lane_group_id_used():
            self._connected_lane_group_id_ = nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader_packed(zserio_context.connected_lane_group_id, zserio_reader)
        else:
            self._connected_lane_group_id_ = None

        if self.is_border_indicator_used():
            self._border_indicator_ = nds.lane.types.tile_border_indicator.TileBorderIndicator.from_reader_packed(zserio_context.border_indicator, zserio_reader)
        else:
            self._border_indicator_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift_xy != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shiftXY for field LaneGroupConnector.position: "
                                                f"{self._position_.shift_xy} != {0}!")
        if self._position_.shift_z != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shiftZ for field LaneGroupConnector.position: "
                                                f"{self._position_.shift_z} != {0}!")
        self._position_.write(zserio_writer)

        if self.is_connected_lane_group_id_used():
            self._connected_lane_group_id_.write(zserio_writer)

        if self.is_border_indicator_used():
            self._border_indicator_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneGroupConnector.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift_xy != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shiftXY for field LaneGroupConnector.position: "
                                                f"{self._position_.shift_xy} != {0}!")
        if self._position_.shift_z != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shiftZ for field LaneGroupConnector.position: "
                                                f"{self._position_.shift_z} != {0}!")
        self._position_.write_packed(zserio_context.position, zserio_writer)

        if self.is_connected_lane_group_id_used():
            self._connected_lane_group_id_.write_packed(zserio_context.connected_lane_group_id, zserio_writer)

        if self.is_border_indicator_used():
            self._border_indicator_.write_packed(zserio_context.border_indicator, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._position_ = nds.core.geometry.position3d.Position3D.ZserioPackingContext()
            self._connected_lane_group_id_ = nds.lane.reference.types.lane_group_id.LaneGroupId.ZserioPackingContext()
            self._border_indicator_ = zserio.array.DeltaContext()

        @property
        def position(self):
            return self._position_

        @property
        def connected_lane_group_id(self):
            return self._connected_lane_group_id_

        @property
        def border_indicator(self):
            return self._border_indicator_
