# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.seconds
import nds.routingdata.attributes.routing_lane_transition_attribute_type
import nds.routingdata.types.lane_transition_angle
import nds.routingdata.types.special_transition_code
import nds.routingdata.types.speed_variation

class RoutingLaneTransitionAttributeValue:
    def __init__(
            self,
            type_: nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType,
            *,
            special_transition_code_: typing.Union[nds.routingdata.types.special_transition_code.SpecialTransitionCode, None] = None,
            speed_variation_: typing.Union[nds.routingdata.types.speed_variation.SpeedVariation, None] = None,
            transition_duration_: typing.Union[nds.core.types.seconds.Seconds, None] = None,
            transition_angle_: typing.Union[nds.routingdata.types.lane_transition_angle.LaneTransitionAngle, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if special_transition_code_ is not None:
            self._choice = special_transition_code_
        if speed_variation_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoutingLaneTransitionAttributeValue is ambiguous!")
            self._choice = speed_variation_
        if transition_duration_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoutingLaneTransitionAttributeValue is ambiguous!")
            self._choice = transition_duration_
        if transition_angle_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoutingLaneTransitionAttributeValue is ambiguous!")
            self._choice = transition_angle_

    @classmethod
    def from_reader(
            cls: typing.Type['RoutingLaneTransitionAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType) -> 'RoutingLaneTransitionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoutingLaneTransitionAttributeValue'],
            zserio_context: RoutingLaneTransitionAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType) -> 'RoutingLaneTransitionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoutingLaneTransitionAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            result = zserio.hashcode.calc_hashcode_int64(result, self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType:
        return self._type_

    @property
    def special_transition_code(self) -> typing.Union[nds.routingdata.types.special_transition_code.SpecialTransitionCode, None]:
        return self._choice

    @special_transition_code.setter
    def special_transition_code(self, special_transition_code_: typing.Union[nds.routingdata.types.special_transition_code.SpecialTransitionCode, None]) -> None:
        self._choice = special_transition_code_

    @property
    def speed_variation(self) -> nds.routingdata.types.speed_variation.SpeedVariation:
        return self._choice

    @speed_variation.setter
    def speed_variation(self, speed_variation_: nds.routingdata.types.speed_variation.SpeedVariation) -> None:
        self._choice = speed_variation_

    @property
    def transition_duration(self) -> nds.core.types.seconds.Seconds:
        return self._choice

    @transition_duration.setter
    def transition_duration(self, transition_duration_: nds.core.types.seconds.Seconds) -> None:
        self._choice = transition_duration_

    @property
    def transition_angle(self) -> nds.routingdata.types.lane_transition_angle.LaneTransitionAngle:
        return self._choice

    @transition_angle.setter
    def transition_angle(self, transition_angle_: nds.routingdata.types.lane_transition_angle.LaneTransitionAngle) -> None:
        self._choice = transition_angle_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            return self.CHOICE_SPECIAL_TRANSITION_CODE
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            return self.CHOICE_SPEED_VARIATION
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            return self.CHOICE_TRANSITION_DURATION
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            return self.CHOICE_TRANSITION_ANGLE
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: RoutingLaneTransitionAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            self._choice.init_packing_context(zserio_context.special_transition_code)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            zserio_context.speed_variation.init(zserio.array.BitFieldArrayTraits(8), self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            zserio_context.transition_duration.init(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            zserio_context.transition_angle.init(zserio.array.BitFieldArrayTraits(8), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            end_bitposition += 8
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            end_bitposition += 8
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoutingLaneTransitionAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.special_transition_code, end_bitposition)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            end_bitposition += zserio_context.speed_variation.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            end_bitposition += zserio_context.transition_duration.bitsizeof(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            end_bitposition += zserio_context.transition_angle.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            end_bitposition += 8
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            end_bitposition += 8
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoutingLaneTransitionAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.special_transition_code, end_bitposition)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            end_bitposition += zserio_context.speed_variation.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            end_bitposition += zserio_context.transition_duration.bitsizeof(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            end_bitposition += zserio_context.transition_angle.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            self._choice = nds.routingdata.types.special_transition_code.SpecialTransitionCode.from_reader(zserio_reader)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            self._choice = zserio_reader.read_bits(8)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            self._choice = zserio_reader.read_varuint()
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            self._choice = zserio_reader.read_bits(8)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

    def read_packed(self, zserio_context: RoutingLaneTransitionAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            self._choice = nds.routingdata.types.special_transition_code.SpecialTransitionCode.from_reader_packed(zserio_context.special_transition_code, zserio_reader)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            self._choice = zserio_context.speed_variation.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            self._choice = zserio_context.transition_duration.read(zserio.array.VarUIntArrayTraits(), zserio_reader)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            self._choice = zserio_context.transition_angle.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            self._choice.write(zserio_writer)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            zserio_writer.write_bits(self._choice, 8)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            zserio_writer.write_varuint(self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            zserio_writer.write_bits(self._choice, 8)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

    def write_packed(self, zserio_context: RoutingLaneTransitionAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.SPECIAL_TRANSITION_CODE):
            self._choice.write_packed(zserio_context.special_transition_code, zserio_writer)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.CONSUMPTION_SPEED_VARIATION):
            zserio_context.speed_variation.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_DURATION):
            zserio_context.transition_duration.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.routingdata.attributes.routing_lane_transition_attribute_type.RoutingLaneTransitionAttributeType.TRANSITION_ANGLE):
            zserio_context.transition_angle.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoutingLaneTransitionAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._special_transition_code_ = zserio.array.DeltaContext()
            self._speed_variation_ = zserio.array.DeltaContext()
            self._transition_duration_ = zserio.array.DeltaContext()
            self._transition_angle_ = zserio.array.DeltaContext()

        @property
        def special_transition_code(self):
            return self._special_transition_code_

        @property
        def speed_variation(self):
            return self._speed_variation_

        @property
        def transition_duration(self):
            return self._transition_duration_

        @property
        def transition_angle(self):
            return self._transition_angle_

    CHOICE_SPECIAL_TRANSITION_CODE = 0
    CHOICE_SPEED_VARIATION = 1
    CHOICE_TRANSITION_DURATION = 2
    CHOICE_TRANSITION_ANGLE = 3
    UNDEFINED_CHOICE = -1