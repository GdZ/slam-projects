# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.attributemap.condition_type_code_collection
import nds.display.details.attributes.display_line_attribute_type
import nds.display.details.properties.display_property_type

class DisplayLineAttributeMetadata:
    def __init__(
            self,
            available_attributes_: typing.List[nds.display.details.attributes.display_line_attribute_type.DisplayLineAttributeType] = None,
            available_properties_: typing.List[nds.display.details.properties.display_property_type.DisplayPropertyType] = None,
            available_conditions_: typing.Union[nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection, None] = None) -> None:
        self._available_attributes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_attributes()), available_attributes_, is_auto=True)
        self._available_properties_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_properties()), available_properties_, is_auto=True)
        self._available_conditions_ = available_conditions_

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayLineAttributeMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'DisplayLineAttributeMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayLineAttributeMetadata'],
            zserio_context: DisplayLineAttributeMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DisplayLineAttributeMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLineAttributeMetadata):
            return ((self._available_attributes_ == other._available_attributes_) and
                    (self._available_properties_ == other._available_properties_) and
                    (self._available_conditions_ == other._available_conditions_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._available_attributes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._available_properties_)
        result = zserio.hashcode.calc_hashcode_object(result, self._available_conditions_)

        return result

    @property
    def available_attributes(self) -> typing.List[nds.display.details.attributes.display_line_attribute_type.DisplayLineAttributeType]:
        return self._available_attributes_.raw_array

    @available_attributes.setter
    def available_attributes(self, available_attributes_: typing.List[nds.display.details.attributes.display_line_attribute_type.DisplayLineAttributeType]) -> None:
        self._available_attributes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_attributes()), available_attributes_, is_auto=True)

    @property
    def available_properties(self) -> typing.List[nds.display.details.properties.display_property_type.DisplayPropertyType]:
        return self._available_properties_.raw_array

    @available_properties.setter
    def available_properties(self, available_properties_: typing.List[nds.display.details.properties.display_property_type.DisplayPropertyType]) -> None:
        self._available_properties_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_properties()), available_properties_, is_auto=True)

    @property
    def available_conditions(self) -> typing.Union[nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection, None]:
        return self._available_conditions_

    @available_conditions.setter
    def available_conditions(self, available_conditions_: typing.Union[nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection, None]) -> None:
        self._available_conditions_ = available_conditions_

    def init_packing_context(self, zserio_context: DisplayLineAttributeMetadata.ZserioPackingContext) -> None:
        self._available_conditions_.init_packing_context(zserio_context.available_conditions)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._available_attributes_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._available_properties_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._available_conditions_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayLineAttributeMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._available_attributes_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._available_properties_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._available_conditions_.bitsizeof_packed(zserio_context.available_conditions, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._available_attributes_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._available_properties_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._available_conditions_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayLineAttributeMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._available_attributes_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._available_properties_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._available_conditions_.initialize_offsets_packed(zserio_context.available_conditions, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._available_attributes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_attributes()), zserio_reader, is_auto=True)
        self._available_properties_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_properties()), zserio_reader, is_auto=True)
        self._available_conditions_ = nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.from_reader(zserio_reader)

    def read_packed(self, zserio_context: DisplayLineAttributeMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._available_attributes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_attributes()), zserio_reader, is_auto=True)

        self._available_properties_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_available_properties()), zserio_reader, is_auto=True)

        self._available_conditions_ = nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.from_reader_packed(zserio_context.available_conditions, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._available_attributes_.write_packed(zserio_writer)
        self._available_properties_.write_packed(zserio_writer)
        self._available_conditions_.write(zserio_writer)

    def write_packed(self, zserio_context: DisplayLineAttributeMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._available_attributes_.write_packed(zserio_writer)

        self._available_properties_.write_packed(zserio_writer)

        self._available_conditions_.write_packed(zserio_context.available_conditions, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._available_conditions_ = nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.ZserioPackingContext()

        @property
        def available_conditions(self):
            return self._available_conditions_

    class _ZserioElementFactory_available_attributes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.attributes.display_line_attribute_type.DisplayLineAttributeType:
            del zserio_index
            return nds.display.details.attributes.display_line_attribute_type.DisplayLineAttributeType.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> zserio.array.DeltaContext:
            return zserio.array.DeltaContext()

        @staticmethod
        def create_packed(zserio_context: zserio.array.DeltaContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.attributes.display_line_attribute_type.DisplayLineAttributeType:
            del zserio_index
            return nds.display.details.attributes.display_line_attribute_type.DisplayLineAttributeType.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_available_properties:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.properties.display_property_type.DisplayPropertyType:
            del zserio_index
            return nds.display.details.properties.display_property_type.DisplayPropertyType.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.display.details.properties.display_property_type.DisplayPropertyType.ZserioPackingContext:
            return nds.display.details.properties.display_property_type.DisplayPropertyType.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.display.details.properties.display_property_type.DisplayPropertyType.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.properties.display_property_type.DisplayPropertyType:
            del zserio_index
            return nds.display.details.properties.display_property_type.DisplayPropertyType.from_reader_packed(zserio_context, zserio_reader)
