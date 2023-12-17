# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.poi.attributes.poi_attribute_type
import nds.poi.attributes.poi_attribute_value

class PoiAttribute:
    def __init__(
            self,
            attribute_type_code_: nds.poi.attributes.poi_attribute_type.PoiAttributeType,
            attribute_value_: typing.Union[nds.poi.attributes.poi_attribute_value.PoiAttributeValue, None] = None) -> None:
        self._attribute_type_code_ = attribute_type_code_
        self._attribute_value_ = attribute_value_

    @classmethod
    def from_reader(
            cls: typing.Type['PoiAttribute'],
            zserio_reader: zserio.BitStreamReader,
            attribute_type_code_: nds.poi.attributes.poi_attribute_type.PoiAttributeType) -> 'PoiAttribute':
        self = object.__new__(cls)
        self._attribute_type_code_ = attribute_type_code_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PoiAttribute'],
            zserio_context: PoiAttribute.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            attribute_type_code_: nds.poi.attributes.poi_attribute_type.PoiAttributeType) -> 'PoiAttribute':
        self = object.__new__(cls)
        self._attribute_type_code_ = attribute_type_code_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PoiAttribute):
            return (self._attribute_type_code_ == other._attribute_type_code_ and
                    (self._attribute_value_ == other._attribute_value_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_type_code_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_value_)

        return result

    @property
    def attribute_type_code(self) -> nds.poi.attributes.poi_attribute_type.PoiAttributeType:
        return self._attribute_type_code_

    @property
    def attribute_value(self) -> typing.Union[nds.poi.attributes.poi_attribute_value.PoiAttributeValue, None]:
        return self._attribute_value_

    @attribute_value.setter
    def attribute_value(self, attribute_value_: typing.Union[nds.poi.attributes.poi_attribute_value.PoiAttributeValue, None]) -> None:
        self._attribute_value_ = attribute_value_

    def init_packing_context(self, zserio_context: PoiAttribute.ZserioPackingContext) -> None:
        self._attribute_value_.init_packing_context(zserio_context.attribute_value)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_value_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PoiAttribute.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_value_.bitsizeof_packed(zserio_context.attribute_value, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_value_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PoiAttribute.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_value_.initialize_offsets_packed(zserio_context.attribute_value, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_value_ = nds.poi.attributes.poi_attribute_value.PoiAttributeValue.from_reader(zserio_reader, self._attribute_type_code_)

    def read_packed(self, zserio_context: PoiAttribute.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_value_ = nds.poi.attributes.poi_attribute_value.PoiAttributeValue.from_reader_packed(zserio_context.attribute_value, zserio_reader, self._attribute_type_code_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._attribute_value_.type is not (self._attribute_type_code_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field PoiAttribute.attributeValue: "
                                                f"{self._attribute_value_.type} != {self._attribute_type_code_}!")
        self._attribute_value_.write(zserio_writer)

    def write_packed(self, zserio_context: PoiAttribute.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._attribute_value_.type is not (self._attribute_type_code_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field PoiAttribute.attributeValue: "
                                                f"{self._attribute_value_.type} != {self._attribute_type_code_}!")
        self._attribute_value_.write_packed(zserio_context.attribute_value, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._attribute_value_ = nds.poi.attributes.poi_attribute_value.PoiAttributeValue.ZserioPackingContext()

        @property
        def attribute_value(self):
            return self._attribute_value_
