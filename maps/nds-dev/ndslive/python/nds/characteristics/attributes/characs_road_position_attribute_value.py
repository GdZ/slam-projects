# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.characteristics.attributes.characs_road_position_attribute_type
import nds.characteristics.types.stationary_object_type
import nds.characteristics.types.stop_line
import nds.characteristics.types.waiting_line
import nds.core.geometry.coord_shift
import nds.core.geometry.line2d

class CharacsRoadPositionAttributeValue:
    def __init__(
            self,
            type_: nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType,
            *,
            stop_line_: typing.Union[nds.characteristics.types.stop_line.StopLine, None] = None,
            waiting_line_: typing.Union[nds.characteristics.types.waiting_line.WaitingLine, None] = None,
            stationary_object_type_: typing.Union[nds.characteristics.types.stationary_object_type.StationaryObjectType, None] = None,
            slow_road_user_crossing_: typing.Union[nds.core.geometry.line2d.Line2D, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if stop_line_ is not None:
            self._choice = stop_line_
        if waiting_line_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CharacsRoadPositionAttributeValue is ambiguous!")
            self._choice = waiting_line_
        if stationary_object_type_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CharacsRoadPositionAttributeValue is ambiguous!")
            self._choice = stationary_object_type_
        if slow_road_user_crossing_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CharacsRoadPositionAttributeValue is ambiguous!")
            self._choice = slow_road_user_crossing_

    @classmethod
    def from_reader(
            cls: typing.Type['CharacsRoadPositionAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType) -> 'CharacsRoadPositionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['CharacsRoadPositionAttributeValue'],
            zserio_context: CharacsRoadPositionAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType) -> 'CharacsRoadPositionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, CharacsRoadPositionAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType:
        return self._type_

    @property
    def stop_line(self) -> typing.Union[nds.characteristics.types.stop_line.StopLine, None]:
        return self._choice

    @stop_line.setter
    def stop_line(self, stop_line_: typing.Union[nds.characteristics.types.stop_line.StopLine, None]) -> None:
        self._choice = stop_line_

    @property
    def waiting_line(self) -> typing.Union[nds.characteristics.types.waiting_line.WaitingLine, None]:
        return self._choice

    @waiting_line.setter
    def waiting_line(self, waiting_line_: typing.Union[nds.characteristics.types.waiting_line.WaitingLine, None]) -> None:
        self._choice = waiting_line_

    @property
    def stationary_object_type(self) -> typing.Union[nds.characteristics.types.stationary_object_type.StationaryObjectType, None]:
        return self._choice

    @stationary_object_type.setter
    def stationary_object_type(self, stationary_object_type_: typing.Union[nds.characteristics.types.stationary_object_type.StationaryObjectType, None]) -> None:
        self._choice = stationary_object_type_

    @property
    def slow_road_user_crossing(self) -> typing.Union[nds.core.geometry.line2d.Line2D, None]:
        return self._choice

    @slow_road_user_crossing.setter
    def slow_road_user_crossing(self, slow_road_user_crossing_: typing.Union[nds.core.geometry.line2d.Line2D, None]) -> None:
        self._choice = slow_road_user_crossing_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            return self.CHOICE_STOP_LINE
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            return self.CHOICE_WAITING_LINE
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            return self.CHOICE_STATIONARY_OBJECT_TYPE
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            return self.CHOICE_SLOW_ROAD_USER_CROSSING
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: CharacsRoadPositionAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            pass
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            pass
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            self._choice.init_packing_context(zserio_context.stationary_object_type)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            self._choice.init_packing_context(zserio_context.slow_road_user_crossing)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: CharacsRoadPositionAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.stationary_object_type, end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.slow_road_user_crossing, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: CharacsRoadPositionAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.stationary_object_type, end_bitposition)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.slow_road_user_crossing, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            self._choice = nds.characteristics.types.stop_line.StopLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            self._choice = nds.characteristics.types.waiting_line.WaitingLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            self._choice = nds.characteristics.types.stationary_object_type.StationaryObjectType.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            self._choice = nds.core.geometry.line2d.Line2D.from_reader(zserio_reader, 0)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

    def read_packed(self, zserio_context: CharacsRoadPositionAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            self._choice = nds.characteristics.types.stop_line.StopLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            self._choice = nds.characteristics.types.waiting_line.WaitingLine.from_reader(zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            self._choice = nds.characteristics.types.stationary_object_type.StationaryObjectType.from_reader_packed(zserio_context.stationary_object_type, zserio_reader)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            self._choice = nds.core.geometry.line2d.Line2D.from_reader_packed(zserio_context.slow_road_user_crossing, zserio_reader, 0)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            # check parameters
            if self._choice.shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field CharacsRoadPositionAttributeValue.slowRoadUserCrossing: "
                                                    f"{self._choice.shift} != {0}!")
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

    def write_packed(self, zserio_context: CharacsRoadPositionAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STOP_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.WAITING_LINE):
            self._choice.write(zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.STATION):
            self._choice.write_packed(zserio_context.stationary_object_type, zserio_writer)
        elif selector == (nds.characteristics.attributes.characs_road_position_attribute_type.CharacsRoadPositionAttributeType.SLOW_ROAD_USER_CROSSING):
            # check parameters
            if self._choice.shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field CharacsRoadPositionAttributeValue.slowRoadUserCrossing: "
                                                    f"{self._choice.shift} != {0}!")
            self._choice.write_packed(zserio_context.slow_road_user_crossing, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsRoadPositionAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._stationary_object_type_ = zserio.array.DeltaContext()
            self._slow_road_user_crossing_ = nds.core.geometry.line2d.Line2D.ZserioPackingContext()

        @property
        def stationary_object_type(self):
            return self._stationary_object_type_

        @property
        def slow_road_user_crossing(self):
            return self._slow_road_user_crossing_

    CHOICE_STOP_LINE = 0
    CHOICE_WAITING_LINE = 1
    CHOICE_STATIONARY_OBJECT_TYPE = 2
    CHOICE_SLOW_ROAD_USER_CROSSING = 3
    UNDEFINED_CHOICE = -1