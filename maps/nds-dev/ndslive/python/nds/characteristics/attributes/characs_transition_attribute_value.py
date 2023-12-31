# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.characteristics.attributes.characs_transition_attribute_type
import nds.characteristics.types.intersection_type

class CharacsTransitionAttributeValue:
    def __init__(
            self,
            type_: nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType,
            *,
            intersection_type_: typing.Union[nds.characteristics.types.intersection_type.IntersectionType, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if intersection_type_ is not None:
            self._choice = intersection_type_

    @classmethod
    def from_reader(
            cls: typing.Type['CharacsTransitionAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType) -> 'CharacsTransitionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['CharacsTransitionAttributeValue'],
            zserio_context: CharacsTransitionAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType) -> 'CharacsTransitionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, CharacsTransitionAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType:
        return self._type_

    @property
    def intersection_type(self) -> typing.Union[nds.characteristics.types.intersection_type.IntersectionType, None]:
        return self._choice

    @intersection_type.setter
    def intersection_type(self, intersection_type_: typing.Union[nds.characteristics.types.intersection_type.IntersectionType, None]) -> None:
        self._choice = intersection_type_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            return self.CHOICE_INTERSECTION_TYPE
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: CharacsTransitionAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            self._choice.init_packing_context(zserio_context.intersection_type)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: CharacsTransitionAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.intersection_type, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: CharacsTransitionAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.intersection_type, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            self._choice = nds.characteristics.types.intersection_type.IntersectionType.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

    def read_packed(self, zserio_context: CharacsTransitionAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            self._choice = nds.characteristics.types.intersection_type.IntersectionType.from_reader_packed(zserio_context.intersection_type, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

    def write_packed(self, zserio_context: CharacsTransitionAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.characteristics.attributes.characs_transition_attribute_type.CharacsTransitionAttributeType.INTERSECTION_TYPE):
            self._choice.write_packed(zserio_context.intersection_type, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CharacsTransitionAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._intersection_type_ = zserio.array.DeltaContext()

        @property
        def intersection_type(self):
            return self._intersection_type_

    CHOICE_INTERSECTION_TYPE = 0
    UNDEFINED_CHOICE = -1
