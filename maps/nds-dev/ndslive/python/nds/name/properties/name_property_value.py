# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.properties.core_property_type
import nds.core.properties.core_property_value
import nds.name.properties.name_property_type
import nds.name.properties.property_type
import nds.name.properties.property_value

class NamePropertyValue:
    def __init__(
            self,
            type_: nds.name.properties.name_property_type.NamePropertyType,
            value_: typing.Optional[nds.name.properties.property_value.PropertyValue] = None,
            core_value_: typing.Optional[nds.core.properties.core_property_value.CorePropertyValue] = None) -> None:
        self._type_ = type_
        self._value_ = value_
        self._core_value_ = core_value_

    @classmethod
    def from_reader(
            cls: typing.Type['NamePropertyValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.name.properties.name_property_type.NamePropertyType) -> 'NamePropertyValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['NamePropertyValue'],
            zserio_context: NamePropertyValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.name.properties.name_property_type.NamePropertyType) -> 'NamePropertyValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NamePropertyValue):
            return (self._type_ == other._type_ and
                    (not other.is_value_used() if not self.is_value_used() else (self._value_ == other._value_)) and
                    (not other.is_core_value_used() if not self.is_core_value_used() else (self._core_value_ == other._core_value_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_value_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._value_)
        if self.is_core_value_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._core_value_)

        return result

    @property
    def type(self) -> nds.name.properties.name_property_type.NamePropertyType:
        return self._type_

    @property
    def value(self) -> typing.Optional[nds.name.properties.property_value.PropertyValue]:
        return self._value_

    @value.setter
    def value(self, value_: typing.Optional[nds.name.properties.property_value.PropertyValue]) -> None:
        self._value_ = value_

    def is_value_used(self) -> bool:
        return self._type_.type != nds.name.properties.property_type.PropertyType.CORE

    def is_value_set(self) -> bool:
        return not self._value_ is None

    def reset_value(self) -> None:
        self._value_ = None

    @property
    def core_value(self) -> typing.Optional[nds.core.properties.core_property_value.CorePropertyValue]:
        return self._core_value_

    @core_value.setter
    def core_value(self, core_value_: typing.Optional[nds.core.properties.core_property_value.CorePropertyValue]) -> None:
        self._core_value_ = core_value_

    def is_core_value_used(self) -> bool:
        return self._type_.type == nds.name.properties.property_type.PropertyType.CORE

    def is_core_value_set(self) -> bool:
        return not self._core_value_ is None

    def reset_core_value(self) -> None:
        self._core_value_ = None

    def init_packing_context(self, zserio_context: NamePropertyValue.ZserioPackingContext) -> None:
        if self.is_value_used():
            self._value_.init_packing_context(zserio_context.value)
        if self.is_core_value_used():
            self._core_value_.init_packing_context(zserio_context.core_value)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        if self.is_value_used():
            end_bitposition += self._value_.bitsizeof(end_bitposition)
        if self.is_core_value_used():
            end_bitposition += self._core_value_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: NamePropertyValue.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        if self.is_value_used():
            end_bitposition += self._value_.bitsizeof_packed(zserio_context.value, end_bitposition)
        if self.is_core_value_used():
            end_bitposition += self._core_value_.bitsizeof_packed(zserio_context.core_value, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        if self.is_value_used():
            end_bitposition = self._value_.initialize_offsets(end_bitposition)
        if self.is_core_value_used():
            end_bitposition = self._core_value_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: NamePropertyValue.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        if self.is_value_used():
            end_bitposition = self._value_.initialize_offsets_packed(zserio_context.value, end_bitposition)
        if self.is_core_value_used():
            end_bitposition = self._core_value_.initialize_offsets_packed(zserio_context.core_value, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        if self.is_value_used():
            self._value_ = nds.name.properties.property_value.PropertyValue.from_reader(zserio_reader, self._type_.type)
        else:
            self._value_ = None
        if self.is_core_value_used():
            self._core_value_ = nds.core.properties.core_property_value.CorePropertyValue.from_reader(zserio_reader, self._type_.core_type)
        else:
            self._core_value_ = None

    def read_packed(self, zserio_context: NamePropertyValue.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        if self.is_value_used():
            self._value_ = nds.name.properties.property_value.PropertyValue.from_reader_packed(zserio_context.value, zserio_reader, self._type_.type)
        else:
            self._value_ = None

        if self.is_core_value_used():
            self._core_value_ = nds.core.properties.core_property_value.CorePropertyValue.from_reader_packed(zserio_context.core_value, zserio_reader, self._type_.core_type)
        else:
            self._core_value_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        if self.is_value_used():
            # check parameters
            if self._value_.type is not (self._type_.type):
                raise zserio.PythonRuntimeException("Wrong parameter type for field NamePropertyValue.value: "
                                                    f"{self._value_.type} != {self._type_.type}!")
            self._value_.write(zserio_writer)

        if self.is_core_value_used():
            # check parameters
            if self._core_value_.type is not (self._type_.core_type):
                raise zserio.PythonRuntimeException("Wrong parameter type for field NamePropertyValue.coreValue: "
                                                    f"{self._core_value_.type} != {self._type_.core_type}!")
            self._core_value_.write(zserio_writer)

    def write_packed(self, zserio_context: NamePropertyValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        if self.is_value_used():
            # check parameters
            if self._value_.type is not (self._type_.type):
                raise zserio.PythonRuntimeException("Wrong parameter type for field NamePropertyValue.value: "
                                                    f"{self._value_.type} != {self._type_.type}!")
            self._value_.write_packed(zserio_context.value, zserio_writer)

        if self.is_core_value_used():
            # check parameters
            if self._core_value_.type is not (self._type_.core_type):
                raise zserio.PythonRuntimeException("Wrong parameter type for field NamePropertyValue.coreValue: "
                                                    f"{self._core_value_.type} != {self._type_.core_type}!")
            self._core_value_.write_packed(zserio_context.core_value, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._value_ = nds.name.properties.property_value.PropertyValue.ZserioPackingContext()
            self._core_value_ = nds.core.properties.core_property_value.CorePropertyValue.ZserioPackingContext()

        @property
        def value(self):
            return self._value_

        @property
        def core_value(self):
            return self._core_value_
