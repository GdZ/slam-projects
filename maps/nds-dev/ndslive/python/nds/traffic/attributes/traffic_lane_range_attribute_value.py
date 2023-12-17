# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.traffic.attributes.traffic_lane_range_attribute_type
import nds.traffic.types.current_road_condition
import nds.traffic.types.parking_availability
import nds.traffic.types.traffic_event
import nds.traffic.types.traffic_flow

class TrafficLaneRangeAttributeValue:
    def __init__(
            self,
            type_: nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType,
            *,
            traffic_event_: typing.Union[nds.traffic.types.traffic_event.TrafficEvent, None] = None,
            traffic_flow_: typing.Union[nds.traffic.types.traffic_flow.TrafficFlow, None] = None,
            current_road_condition_: typing.Union[nds.traffic.types.current_road_condition.CurrentRoadCondition, None] = None,
            parking_availability_: typing.Union[nds.traffic.types.parking_availability.ParkingAvailability, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if traffic_event_ is not None:
            self._choice = traffic_event_
        if traffic_flow_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice TrafficLaneRangeAttributeValue is ambiguous!")
            self._choice = traffic_flow_
        if current_road_condition_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice TrafficLaneRangeAttributeValue is ambiguous!")
            self._choice = current_road_condition_
        if parking_availability_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice TrafficLaneRangeAttributeValue is ambiguous!")
            self._choice = parking_availability_

    @classmethod
    def from_reader(
            cls: typing.Type['TrafficLaneRangeAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType) -> 'TrafficLaneRangeAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TrafficLaneRangeAttributeValue'],
            zserio_context: TrafficLaneRangeAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType) -> 'TrafficLaneRangeAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TrafficLaneRangeAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            result = zserio.hashcode.calc_hashcode_bool(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType:
        return self._type_

    @property
    def traffic_event(self) -> typing.Union[nds.traffic.types.traffic_event.TrafficEvent, None]:
        return self._choice

    @traffic_event.setter
    def traffic_event(self, traffic_event_: typing.Union[nds.traffic.types.traffic_event.TrafficEvent, None]) -> None:
        self._choice = traffic_event_

    @property
    def traffic_flow(self) -> typing.Union[nds.traffic.types.traffic_flow.TrafficFlow, None]:
        return self._choice

    @traffic_flow.setter
    def traffic_flow(self, traffic_flow_: typing.Union[nds.traffic.types.traffic_flow.TrafficFlow, None]) -> None:
        self._choice = traffic_flow_

    @property
    def current_road_condition(self) -> typing.Union[nds.traffic.types.current_road_condition.CurrentRoadCondition, None]:
        return self._choice

    @current_road_condition.setter
    def current_road_condition(self, current_road_condition_: typing.Union[nds.traffic.types.current_road_condition.CurrentRoadCondition, None]) -> None:
        self._choice = current_road_condition_

    @property
    def parking_availability(self) -> nds.traffic.types.parking_availability.ParkingAvailability:
        return self._choice

    @parking_availability.setter
    def parking_availability(self, parking_availability_: nds.traffic.types.parking_availability.ParkingAvailability) -> None:
        self._choice = parking_availability_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            return self.CHOICE_TRAFFIC_EVENT
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            return self.CHOICE_TRAFFIC_FLOW
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            return self.CHOICE_CURRENT_ROAD_CONDITION
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            return self.CHOICE_PARKING_AVAILABILITY
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: TrafficLaneRangeAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            self._choice.init_packing_context(zserio_context.traffic_event)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            self._choice.init_packing_context(zserio_context.traffic_flow)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            pass
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            pass
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            end_bitposition += 1
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TrafficLaneRangeAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.traffic_event, end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.traffic_flow, end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            end_bitposition += 1
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            end_bitposition += 1
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TrafficLaneRangeAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.traffic_event, end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.traffic_flow, end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            end_bitposition += 1
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            self._choice = nds.traffic.types.traffic_event.TrafficEvent.from_reader(zserio_reader)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            self._choice = nds.traffic.types.traffic_flow.TrafficFlow.from_reader(zserio_reader)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            self._choice = nds.traffic.types.current_road_condition.CurrentRoadCondition.from_reader(zserio_reader)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            self._choice = zserio_reader.read_bool()
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

    def read_packed(self, zserio_context: TrafficLaneRangeAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            self._choice = nds.traffic.types.traffic_event.TrafficEvent.from_reader_packed(zserio_context.traffic_event, zserio_reader)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            self._choice = nds.traffic.types.traffic_flow.TrafficFlow.from_reader_packed(zserio_context.traffic_flow, zserio_reader)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            self._choice = nds.traffic.types.current_road_condition.CurrentRoadCondition.from_reader(zserio_reader)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            self._choice = zserio_reader.read_bool()
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            self._choice.write(zserio_writer)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            self._choice.write(zserio_writer)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            self._choice.write(zserio_writer)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            zserio_writer.write_bool(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

    def write_packed(self, zserio_context: TrafficLaneRangeAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_EVENT):
            self._choice.write_packed(zserio_context.traffic_event, zserio_writer)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.TRAFFIC_FLOW):
            self._choice.write_packed(zserio_context.traffic_flow, zserio_writer)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.CURRENT_ROAD_CONDITION):
            self._choice.write(zserio_writer)
        elif selector == (nds.traffic.attributes.traffic_lane_range_attribute_type.TrafficLaneRangeAttributeType.PARKING_AVAILABILITY):
            zserio_writer.write_bool(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice TrafficLaneRangeAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._traffic_event_ = nds.traffic.types.traffic_event.TrafficEvent.ZserioPackingContext()
            self._traffic_flow_ = zserio.array.DeltaContext()

        @property
        def traffic_event(self):
            return self._traffic_event_

        @property
        def traffic_flow(self):
            return self._traffic_flow_

    CHOICE_TRAFFIC_EVENT = 0
    CHOICE_TRAFFIC_FLOW = 1
    CHOICE_CURRENT_ROAD_CONDITION = 2
    CHOICE_PARKING_AVAILABILITY = 3
    UNDEFINED_CHOICE = -1
