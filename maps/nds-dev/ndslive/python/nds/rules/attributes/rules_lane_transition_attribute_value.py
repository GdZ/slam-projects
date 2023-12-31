# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.rules.attributes.rules_lane_transition_attribute_type
import nds.rules.types.preferred_u_turn
import nds.rules.types.prohibited_transition
import nds.rules.types.turn_on_red_allowed

class RulesLaneTransitionAttributeValue:
    def __init__(
            self,
            type_: nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType,
            *,
            turn_on_red_allowed_: typing.Union[nds.rules.types.turn_on_red_allowed.TurnOnRedAllowed, None] = None,
            prohibited_transition_: typing.Union[nds.rules.types.prohibited_transition.ProhibitedTransition, None] = None,
            preferred_u_turn_: typing.Union[nds.rules.types.preferred_u_turn.PreferredUTurn, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if turn_on_red_allowed_ is not None:
            self._choice = turn_on_red_allowed_
        if prohibited_transition_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RulesLaneTransitionAttributeValue is ambiguous!")
            self._choice = prohibited_transition_
        if preferred_u_turn_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RulesLaneTransitionAttributeValue is ambiguous!")
            self._choice = preferred_u_turn_

    @classmethod
    def from_reader(
            cls: typing.Type['RulesLaneTransitionAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType) -> 'RulesLaneTransitionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RulesLaneTransitionAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.TURN_ON_RED_ALLOWED):
            result = zserio.hashcode.calc_hashcode_bool(result, self._choice)
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PROHIBITED_TRANSITION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PREFERRED_U_TURN):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType:
        return self._type_

    @property
    def turn_on_red_allowed(self) -> nds.rules.types.turn_on_red_allowed.TurnOnRedAllowed:
        return self._choice

    @turn_on_red_allowed.setter
    def turn_on_red_allowed(self, turn_on_red_allowed_: nds.rules.types.turn_on_red_allowed.TurnOnRedAllowed) -> None:
        self._choice = turn_on_red_allowed_

    @property
    def prohibited_transition(self) -> typing.Union[nds.rules.types.prohibited_transition.ProhibitedTransition, None]:
        return self._choice

    @prohibited_transition.setter
    def prohibited_transition(self, prohibited_transition_: typing.Union[nds.rules.types.prohibited_transition.ProhibitedTransition, None]) -> None:
        self._choice = prohibited_transition_

    @property
    def preferred_u_turn(self) -> typing.Union[nds.rules.types.preferred_u_turn.PreferredUTurn, None]:
        return self._choice

    @preferred_u_turn.setter
    def preferred_u_turn(self, preferred_u_turn_: typing.Union[nds.rules.types.preferred_u_turn.PreferredUTurn, None]) -> None:
        self._choice = preferred_u_turn_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.TURN_ON_RED_ALLOWED):
            return self.CHOICE_TURN_ON_RED_ALLOWED
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PROHIBITED_TRANSITION):
            return self.CHOICE_PROHIBITED_TRANSITION
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PREFERRED_U_TURN):
            return self.CHOICE_PREFERRED_U_TURN
        else:
            return self.UNDEFINED_CHOICE

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.TURN_ON_RED_ALLOWED):
            end_bitposition += 1
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PROHIBITED_TRANSITION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PREFERRED_U_TURN):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice RulesLaneTransitionAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.TURN_ON_RED_ALLOWED):
            end_bitposition += 1
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PROHIBITED_TRANSITION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PREFERRED_U_TURN):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice RulesLaneTransitionAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.TURN_ON_RED_ALLOWED):
            self._choice = zserio_reader.read_bool()
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PROHIBITED_TRANSITION):
            self._choice = nds.rules.types.prohibited_transition.ProhibitedTransition.from_reader(zserio_reader)
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PREFERRED_U_TURN):
            self._choice = nds.rules.types.preferred_u_turn.PreferredUTurn.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice RulesLaneTransitionAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.TURN_ON_RED_ALLOWED):
            zserio_writer.write_bool(self._choice)
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PROHIBITED_TRANSITION):
            self._choice.write(zserio_writer)
        elif selector == (nds.rules.attributes.rules_lane_transition_attribute_type.RulesLaneTransitionAttributeType.PREFERRED_U_TURN):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice RulesLaneTransitionAttributeValue!")

    CHOICE_TURN_ON_RED_ALLOWED = 0
    CHOICE_PROHIBITED_TRANSITION = 1
    CHOICE_PREFERRED_U_TURN = 2
    UNDEFINED_CHOICE = -1
