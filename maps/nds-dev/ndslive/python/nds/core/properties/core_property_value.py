# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.icons.icon_set_reference
import nds.core.icons.icon_set_reference_with_heading
import nds.core.properties.attribute_age
import nds.core.properties.attribute_confidence
import nds.core.properties.attribute_reason
import nds.core.properties.attribute_source_type
import nds.core.properties.core_property_type
import nds.core.properties.toll_payment_method

class CorePropertyValue:
    def __init__(
            self,
            type_: nds.core.properties.core_property_type.CorePropertyType,
            *,
            reason_: typing.Union[nds.core.properties.attribute_reason.AttributeReason, None] = None,
            confidence_: typing.Union[nds.core.properties.attribute_confidence.AttributeConfidence, None] = None,
            age_: typing.Union[nds.core.properties.attribute_age.AttributeAge, None] = None,
            source_: typing.Union[nds.core.properties.attribute_source_type.AttributeSourceType, None] = None,
            icon_set_reference_: typing.Union[nds.core.icons.icon_set_reference.IconSetReference, None] = None,
            icon_set_reference_with_heading_: typing.Union[nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading, None] = None,
            global_icon_set_reference_: typing.Union[nds.core.icons.icon_set_reference.IconSetReference, None] = None,
            global_icon_set_reference_with_heading_: typing.Union[nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading, None] = None,
            toll_payment_method_: typing.Union[typing.List[nds.core.properties.toll_payment_method.TollPaymentMethod], None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if reason_ is not None:
            self._choice = reason_
        if confidence_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = confidence_
        if age_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = age_
        if source_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = source_
        if icon_set_reference_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = icon_set_reference_
        if icon_set_reference_with_heading_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = icon_set_reference_with_heading_
        if global_icon_set_reference_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = global_icon_set_reference_
        if global_icon_set_reference_with_heading_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = global_icon_set_reference_with_heading_
        if toll_payment_method_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice CorePropertyValue is ambiguous!")
            self._choice = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_toll_payment_method()), toll_payment_method_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['CorePropertyValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.core.properties.core_property_type.CorePropertyType) -> 'CorePropertyValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['CorePropertyValue'],
            zserio_context: CorePropertyValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.core.properties.core_property_type.CorePropertyType) -> 'CorePropertyValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, CorePropertyValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            result = zserio.hashcode.calc_hashcode_int64(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            result = zserio.hashcode.calc_hashcode_int64(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.core.properties.core_property_type.CorePropertyType:
        return self._type_

    @property
    def reason(self) -> typing.Union[nds.core.properties.attribute_reason.AttributeReason, None]:
        return self._choice

    @reason.setter
    def reason(self, reason_: typing.Union[nds.core.properties.attribute_reason.AttributeReason, None]) -> None:
        self._choice = reason_

    @property
    def confidence(self) -> nds.core.properties.attribute_confidence.AttributeConfidence:
        return self._choice

    @confidence.setter
    def confidence(self, confidence_: nds.core.properties.attribute_confidence.AttributeConfidence) -> None:
        self._choice = confidence_

    @property
    def age(self) -> typing.Union[nds.core.properties.attribute_age.AttributeAge, None]:
        return self._choice

    @age.setter
    def age(self, age_: typing.Union[nds.core.properties.attribute_age.AttributeAge, None]) -> None:
        self._choice = age_

    @property
    def source(self) -> typing.Union[nds.core.properties.attribute_source_type.AttributeSourceType, None]:
        return self._choice

    @source.setter
    def source(self, source_: typing.Union[nds.core.properties.attribute_source_type.AttributeSourceType, None]) -> None:
        self._choice = source_

    @property
    def icon_set_reference(self) -> nds.core.icons.icon_set_reference.IconSetReference:
        return self._choice

    @icon_set_reference.setter
    def icon_set_reference(self, icon_set_reference_: nds.core.icons.icon_set_reference.IconSetReference) -> None:
        self._choice = icon_set_reference_

    @property
    def icon_set_reference_with_heading(self) -> typing.Union[nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading, None]:
        return self._choice

    @icon_set_reference_with_heading.setter
    def icon_set_reference_with_heading(self, icon_set_reference_with_heading_: typing.Union[nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading, None]) -> None:
        self._choice = icon_set_reference_with_heading_

    @property
    def global_icon_set_reference(self) -> nds.core.icons.icon_set_reference.IconSetReference:
        return self._choice

    @global_icon_set_reference.setter
    def global_icon_set_reference(self, global_icon_set_reference_: nds.core.icons.icon_set_reference.IconSetReference) -> None:
        self._choice = global_icon_set_reference_

    @property
    def global_icon_set_reference_with_heading(self) -> typing.Union[nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading, None]:
        return self._choice

    @global_icon_set_reference_with_heading.setter
    def global_icon_set_reference_with_heading(self, global_icon_set_reference_with_heading_: typing.Union[nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading, None]) -> None:
        self._choice = global_icon_set_reference_with_heading_

    @property
    def toll_payment_method(self) -> typing.List[nds.core.properties.toll_payment_method.TollPaymentMethod]:
        return self._choice.raw_array

    @toll_payment_method.setter
    def toll_payment_method(self, toll_payment_method_: typing.List[nds.core.properties.toll_payment_method.TollPaymentMethod]) -> None:
        self._choice = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_toll_payment_method()), toll_payment_method_, is_auto=True)

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            return self.CHOICE_REASON
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            return self.UNDEFINED_CHOICE
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            return self.UNDEFINED_CHOICE
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            return self.CHOICE_CONFIDENCE
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            return self.CHOICE_AGE
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            return self.CHOICE_SOURCE
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            return self.CHOICE_ICON_SET_REFERENCE
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            return self.CHOICE_ICON_SET_REFERENCE_WITH_HEADING
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            return self.CHOICE_GLOBAL_ICON_SET_REFERENCE
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            return self.CHOICE_GLOBAL_ICON_SET_REFERENCE_WITH_HEADING
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            return self.CHOICE_TOLL_PAYMENT_METHOD
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: CorePropertyValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            self._choice.init_packing_context(zserio_context.reason)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            zserio_context.confidence.init(zserio.array.BitFieldArrayTraits(8), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            self._choice.init_packing_context(zserio_context.age)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            self._choice.init_packing_context(zserio_context.source)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            zserio_context.icon_set_reference.init(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            self._choice.init_packing_context(zserio_context.icon_set_reference_with_heading)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            zserio_context.global_icon_set_reference.init(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            self._choice.init_packing_context(zserio_context.global_icon_set_reference_with_heading)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            pass
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            end_bitposition += 8
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: CorePropertyValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.reason, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            end_bitposition += zserio_context.confidence.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.age, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.source, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            end_bitposition += zserio_context.icon_set_reference.bitsizeof(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.icon_set_reference_with_heading, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            end_bitposition += zserio_context.global_icon_set_reference.bitsizeof(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.global_icon_set_reference_with_heading, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            end_bitposition += self._choice.bitsizeof_packed(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            end_bitposition += 8
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: CorePropertyValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.reason, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            end_bitposition += zserio_context.confidence.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.age, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.source, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            end_bitposition += zserio_context.icon_set_reference.bitsizeof(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.icon_set_reference_with_heading, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            end_bitposition += zserio_context.global_icon_set_reference.bitsizeof(zserio.array.VarUIntArrayTraits(), self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.global_icon_set_reference_with_heading, end_bitposition)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            end_bitposition = self._choice.initialize_offsets_packed(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            self._choice = nds.core.properties.attribute_reason.AttributeReason.from_reader(zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            self._choice = zserio_reader.read_bits(8)
            # check constraint
            if not (self._choice <= 100):
                raise zserio.PythonRuntimeException("Constraint violated for field CorePropertyValue.confidence!")
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            self._choice = nds.core.properties.attribute_age.AttributeAge.from_reader(zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            self._choice = nds.core.properties.attribute_source_type.AttributeSourceType.from_reader(zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            self._choice = zserio_reader.read_varuint()
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            self._choice = nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading.from_reader(zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            self._choice = zserio_reader.read_varuint()
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            self._choice = nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading.from_reader(zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            self._choice = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_toll_payment_method()), zserio_reader, is_auto=True)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

    def read_packed(self, zserio_context: CorePropertyValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            self._choice = nds.core.properties.attribute_reason.AttributeReason.from_reader_packed(zserio_context.reason, zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            self._choice = zserio_context.confidence.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
            # check constraint
            if not (self._choice <= 100):
                raise zserio.PythonRuntimeException("Constraint violated for field CorePropertyValue.confidence!")
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            self._choice = nds.core.properties.attribute_age.AttributeAge.from_reader_packed(zserio_context.age, zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            self._choice = nds.core.properties.attribute_source_type.AttributeSourceType.from_reader_packed(zserio_context.source, zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            self._choice = zserio_context.icon_set_reference.read(zserio.array.VarUIntArrayTraits(), zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            self._choice = nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading.from_reader_packed(zserio_context.icon_set_reference_with_heading, zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            self._choice = zserio_context.global_icon_set_reference.read(zserio.array.VarUIntArrayTraits(), zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            self._choice = nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading.from_reader_packed(zserio_context.global_icon_set_reference_with_heading, zserio_reader)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            self._choice = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_toll_payment_method()), zserio_reader, is_auto=True)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            self._choice.write(zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            # check constraint
            if not (self._choice <= 100):
                raise zserio.PythonRuntimeException("Constraint violated for field CorePropertyValue.confidence!")
            zserio_writer.write_bits(self._choice, 8)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            self._choice.write(zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            self._choice.write(zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            zserio_writer.write_varuint(self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            self._choice.write(zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            zserio_writer.write_varuint(self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            self._choice.write(zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

    def write_packed(self, zserio_context: CorePropertyValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_REASON):
            self._choice.write_packed(zserio_context.reason, zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.METRIC_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.IMPERIAL_UNIT):
            pass
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_CONFIDENCE):
            # check constraint
            if not (self._choice <= 100):
                raise zserio.PythonRuntimeException("Constraint violated for field CorePropertyValue.confidence!")
            zserio_context.confidence.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_AGE):
            self._choice.write_packed(zserio_context.age, zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ATTRIBUTE_SOURCE):
            self._choice.write_packed(zserio_context.source, zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE):
            zserio_context.icon_set_reference.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.ICON_SET_REFERENCE_WITH_HEADING):
            self._choice.write_packed(zserio_context.icon_set_reference_with_heading, zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE):
            zserio_context.global_icon_set_reference.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.GLOBAL_ICON_SET_REFERENCE_WITH_HEADING):
            self._choice.write_packed(zserio_context.global_icon_set_reference_with_heading, zserio_writer)
        elif selector == (nds.core.properties.core_property_type.CorePropertyType.TOLL_PAYMENT):
            self._choice.write_packed(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice CorePropertyValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._reason_ = nds.core.properties.attribute_reason.AttributeReason.ZserioPackingContext()
            self._confidence_ = zserio.array.DeltaContext()
            self._age_ = nds.core.properties.attribute_age.AttributeAge.ZserioPackingContext()
            self._source_ = zserio.array.DeltaContext()
            self._icon_set_reference_ = zserio.array.DeltaContext()
            self._icon_set_reference_with_heading_ = nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading.ZserioPackingContext()
            self._global_icon_set_reference_ = zserio.array.DeltaContext()
            self._global_icon_set_reference_with_heading_ = nds.core.icons.icon_set_reference_with_heading.IconSetReferenceWithHeading.ZserioPackingContext()

        @property
        def reason(self):
            return self._reason_

        @property
        def confidence(self):
            return self._confidence_

        @property
        def age(self):
            return self._age_

        @property
        def source(self):
            return self._source_

        @property
        def icon_set_reference(self):
            return self._icon_set_reference_

        @property
        def icon_set_reference_with_heading(self):
            return self._icon_set_reference_with_heading_

        @property
        def global_icon_set_reference(self):
            return self._global_icon_set_reference_

        @property
        def global_icon_set_reference_with_heading(self):
            return self._global_icon_set_reference_with_heading_

    class _ZserioElementFactory_toll_payment_method:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.properties.toll_payment_method.TollPaymentMethod:
            del zserio_index
            return nds.core.properties.toll_payment_method.TollPaymentMethod.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.properties.toll_payment_method.TollPaymentMethod.ZserioPackingContext:
            return nds.core.properties.toll_payment_method.TollPaymentMethod.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.properties.toll_payment_method.TollPaymentMethod.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.properties.toll_payment_method.TollPaymentMethod:
            del zserio_index
            return nds.core.properties.toll_payment_method.TollPaymentMethod.from_reader_packed(zserio_context, zserio_reader)

    CHOICE_REASON = 0
    CHOICE_CONFIDENCE = 1
    CHOICE_AGE = 2
    CHOICE_SOURCE = 3
    CHOICE_ICON_SET_REFERENCE = 4
    CHOICE_ICON_SET_REFERENCE_WITH_HEADING = 5
    CHOICE_GLOBAL_ICON_SET_REFERENCE = 6
    CHOICE_GLOBAL_ICON_SET_REFERENCE_WITH_HEADING = 7
    CHOICE_TOLL_PAYMENT_METHOD = 8
    UNDEFINED_CHOICE = -1
