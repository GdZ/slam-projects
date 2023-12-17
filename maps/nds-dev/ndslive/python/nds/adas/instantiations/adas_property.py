# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.adas.properties.adas_property_type
import nds.adas.properties.adas_property_value

class AdasProperty:
    def __init__(
            self,
            property_type_code_: typing.Union[nds.adas.properties.adas_property_type.AdasPropertyType, None] = None,
            property_value_: typing.Union[nds.adas.properties.adas_property_value.AdasPropertyValue, None] = None) -> None:
        self._property_type_code_ = property_type_code_
        self._property_value_ = property_value_

    @classmethod
    def from_reader(
            cls: typing.Type['AdasProperty'],
            zserio_reader: zserio.BitStreamReader) -> 'AdasProperty':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AdasProperty'],
            zserio_context: AdasProperty.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AdasProperty':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AdasProperty):
            return ((self._property_type_code_ == other._property_type_code_) and
                    (self._property_value_ == other._property_value_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._property_type_code_)
        result = zserio.hashcode.calc_hashcode_object(result, self._property_value_)

        return result

    @property
    def property_type_code(self) -> typing.Union[nds.adas.properties.adas_property_type.AdasPropertyType, None]:
        return self._property_type_code_

    @property_type_code.setter
    def property_type_code(self, property_type_code_: typing.Union[nds.adas.properties.adas_property_type.AdasPropertyType, None]) -> None:
        self._property_type_code_ = property_type_code_

    @property
    def property_value(self) -> typing.Union[nds.adas.properties.adas_property_value.AdasPropertyValue, None]:
        return self._property_value_

    @property_value.setter
    def property_value(self, property_value_: typing.Union[nds.adas.properties.adas_property_value.AdasPropertyValue, None]) -> None:
        self._property_value_ = property_value_

    def init_packing_context(self, zserio_context: AdasProperty.ZserioPackingContext) -> None:
        self._property_type_code_.init_packing_context(zserio_context.property_type_code)
        self._property_value_.init_packing_context(zserio_context.property_value)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._property_type_code_.bitsizeof(end_bitposition)
        end_bitposition += self._property_value_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AdasProperty.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._property_type_code_.bitsizeof_packed(zserio_context.property_type_code, end_bitposition)
        end_bitposition += self._property_value_.bitsizeof_packed(zserio_context.property_value, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._property_type_code_.initialize_offsets(end_bitposition)
        end_bitposition = self._property_value_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AdasProperty.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._property_type_code_.initialize_offsets_packed(zserio_context.property_type_code, end_bitposition)
        end_bitposition = self._property_value_.initialize_offsets_packed(zserio_context.property_value, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._property_type_code_ = nds.adas.properties.adas_property_type.AdasPropertyType.from_reader(zserio_reader)
        self._property_value_ = nds.adas.properties.adas_property_value.AdasPropertyValue.from_reader(zserio_reader, self._property_type_code_)

    def read_packed(self, zserio_context: AdasProperty.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._property_type_code_ = nds.adas.properties.adas_property_type.AdasPropertyType.from_reader_packed(zserio_context.property_type_code, zserio_reader)

        self._property_value_ = nds.adas.properties.adas_property_value.AdasPropertyValue.from_reader_packed(zserio_context.property_value, zserio_reader, self._property_type_code_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._property_type_code_.write(zserio_writer)

        # check parameters
        if self._property_value_.type is not (self._property_type_code_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field AdasProperty.propertyValue: "
                                                f"{self._property_value_.type} != {self._property_type_code_}!")
        self._property_value_.write(zserio_writer)

    def write_packed(self, zserio_context: AdasProperty.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._property_type_code_.write_packed(zserio_context.property_type_code, zserio_writer)

        # check parameters
        if self._property_value_.type is not (self._property_type_code_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field AdasProperty.propertyValue: "
                                                f"{self._property_value_.type} != {self._property_type_code_}!")
        self._property_value_.write_packed(zserio_context.property_value, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._property_type_code_ = nds.adas.properties.adas_property_type.AdasPropertyType.ZserioPackingContext()
            self._property_value_ = nds.adas.properties.adas_property_value.AdasPropertyValue.ZserioPackingContext()

        @property
        def property_type_code(self):
            return self._property_type_code_

        @property
        def property_value(self):
            return self._property_value_
