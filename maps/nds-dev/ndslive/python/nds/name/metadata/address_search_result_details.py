# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.name.instantiations.name_road_range_full_attribute
import nds.name.metadata.address_search_result_details_content
import nds.name.types.address_format_id
import nds.name.types.administrative_hierarchy_element

class AddressSearchResultDetails:
    def __init__(
            self,
            content_: typing.Union[nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent, None] = None,
            name_attributes_: typing.Optional[typing.List[nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute]] = None,
            admin_elements_: typing.Optional[typing.List[nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement]] = None,
            address_format_id_: typing.Optional[nds.name.types.address_format_id.AddressFormatId] = None) -> None:
        self._content_ = content_
        if name_attributes_ is None:
            self._name_attributes_ = None
        else:
            self._name_attributes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_attributes()), name_attributes_, is_auto=True)
        if admin_elements_ is None:
            self._admin_elements_ = None
        else:
            self._admin_elements_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_elements()), admin_elements_, is_auto=True)
        self._address_format_id_ = address_format_id_

    @classmethod
    def from_reader(
            cls: typing.Type['AddressSearchResultDetails'],
            zserio_reader: zserio.BitStreamReader) -> 'AddressSearchResultDetails':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AddressSearchResultDetails'],
            zserio_context: AddressSearchResultDetails.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AddressSearchResultDetails':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AddressSearchResultDetails):
            return ((self._content_ == other._content_) and
                    (not other.is_name_attributes_used() if not self.is_name_attributes_used() else (self._name_attributes_ == other._name_attributes_)) and
                    (not other.is_admin_elements_used() if not self.is_admin_elements_used() else (self._admin_elements_ == other._admin_elements_)) and
                    (not other.is_address_format_id_used() if not self.is_address_format_id_used() else (self._address_format_id_ == other._address_format_id_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._content_)
        if self.is_name_attributes_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._name_attributes_)
        if self.is_admin_elements_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._admin_elements_)
        if self.is_address_format_id_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._address_format_id_)

        return result

    @property
    def content(self) -> typing.Union[nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent, None]:
        return self._content_

    @content.setter
    def content(self, content_: typing.Union[nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent, None]) -> None:
        self._content_ = content_

    @property
    def name_attributes(self) -> typing.Optional[typing.List[nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute]]:
        return None if self._name_attributes_ is None else self._name_attributes_.raw_array

    @name_attributes.setter
    def name_attributes(self, name_attributes_: typing.Optional[typing.List[nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute]]) -> None:
        if name_attributes_ is None:
            self._name_attributes_ = None
        else:
            self._name_attributes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_attributes()), name_attributes_, is_auto=True)

    def is_name_attributes_used(self) -> bool:
        return (self._content_ & nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.Values.ATTRIBUTES) == nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.Values.ATTRIBUTES

    def is_name_attributes_set(self) -> bool:
        return not self._name_attributes_ is None

    def reset_name_attributes(self) -> None:
        self._name_attributes_ = None

    @property
    def admin_elements(self) -> typing.Optional[typing.List[nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement]]:
        return None if self._admin_elements_ is None else self._admin_elements_.raw_array

    @admin_elements.setter
    def admin_elements(self, admin_elements_: typing.Optional[typing.List[nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement]]) -> None:
        if admin_elements_ is None:
            self._admin_elements_ = None
        else:
            self._admin_elements_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_elements()), admin_elements_, is_auto=True)

    def is_admin_elements_used(self) -> bool:
        return (self._content_ & nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.Values.ADMINISTRATIVE_HIERARCHY) == nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.Values.ADMINISTRATIVE_HIERARCHY

    def is_admin_elements_set(self) -> bool:
        return not self._admin_elements_ is None

    def reset_admin_elements(self) -> None:
        self._admin_elements_ = None

    @property
    def address_format_id(self) -> typing.Optional[nds.name.types.address_format_id.AddressFormatId]:
        return self._address_format_id_

    @address_format_id.setter
    def address_format_id(self, address_format_id_: typing.Optional[nds.name.types.address_format_id.AddressFormatId]) -> None:
        self._address_format_id_ = address_format_id_

    def is_address_format_id_used(self) -> bool:
        return (self._content_ & nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.Values.ADDRESS_FORMAT_ID) == nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.Values.ADDRESS_FORMAT_ID

    def is_address_format_id_set(self) -> bool:
        return not self._address_format_id_ is None

    def reset_address_format_id(self) -> None:
        self._address_format_id_ = None

    def init_packing_context(self, zserio_context: AddressSearchResultDetails.ZserioPackingContext) -> None:
        self._content_.init_packing_context(zserio_context.content)
        if self.is_address_format_id_used():
            zserio_context.address_format_id.init(zserio.array.VarUInt16ArrayTraits(), self._address_format_id_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof(end_bitposition)
        if self.is_name_attributes_used():
            end_bitposition += self._name_attributes_.bitsizeof(end_bitposition)
        if self.is_admin_elements_used():
            end_bitposition += self._admin_elements_.bitsizeof(end_bitposition)
        if self.is_address_format_id_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._address_format_id_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AddressSearchResultDetails.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._content_.bitsizeof_packed(zserio_context.content, end_bitposition)
        if self.is_name_attributes_used():
            end_bitposition += self._name_attributes_.bitsizeof_packed(end_bitposition)
        if self.is_admin_elements_used():
            end_bitposition += self._admin_elements_.bitsizeof_packed(end_bitposition)
        if self.is_address_format_id_used():
            end_bitposition += zserio_context.address_format_id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._address_format_id_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets(end_bitposition)
        if self.is_name_attributes_used():
            end_bitposition = self._name_attributes_.initialize_offsets(end_bitposition)
        if self.is_admin_elements_used():
            end_bitposition = self._admin_elements_.initialize_offsets(end_bitposition)
        if self.is_address_format_id_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._address_format_id_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AddressSearchResultDetails.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._content_.initialize_offsets_packed(zserio_context.content, end_bitposition)
        if self.is_name_attributes_used():
            end_bitposition = self._name_attributes_.initialize_offsets_packed(end_bitposition)
        if self.is_admin_elements_used():
            end_bitposition = self._admin_elements_.initialize_offsets_packed(end_bitposition)
        if self.is_address_format_id_used():
            end_bitposition += zserio_context.address_format_id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._address_format_id_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.from_reader(zserio_reader)
        if self.is_name_attributes_used():
            self._name_attributes_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_attributes()), zserio_reader, is_auto=True)
        else:
            self._name_attributes_ = None
        if self.is_admin_elements_used():
            self._admin_elements_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_elements()), zserio_reader, is_auto=True)
        else:
            self._admin_elements_ = None
        if self.is_address_format_id_used():
            self._address_format_id_ = zserio_reader.read_varuint16()
        else:
            self._address_format_id_ = None

    def read_packed(self, zserio_context: AddressSearchResultDetails.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._content_ = nds.name.metadata.address_search_result_details_content.AddressSearchResultDetailsContent.from_reader_packed(zserio_context.content, zserio_reader)

        if self.is_name_attributes_used():
            self._name_attributes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_name_attributes()), zserio_reader, is_auto=True)
        else:
            self._name_attributes_ = None

        if self.is_admin_elements_used():
            self._admin_elements_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_admin_elements()), zserio_reader, is_auto=True)
        else:
            self._admin_elements_ = None

        if self.is_address_format_id_used():
            self._address_format_id_ = zserio_context.address_format_id.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)
        else:
            self._address_format_id_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write(zserio_writer)
        if self.is_name_attributes_used():
            self._name_attributes_.write(zserio_writer)
        if self.is_admin_elements_used():
            self._admin_elements_.write(zserio_writer)
        if self.is_address_format_id_used():
            zserio_writer.write_varuint16(self._address_format_id_)

    def write_packed(self, zserio_context: AddressSearchResultDetails.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._content_.write_packed(zserio_context.content, zserio_writer)

        if self.is_name_attributes_used():
            self._name_attributes_.write_packed(zserio_writer)

        if self.is_admin_elements_used():
            self._admin_elements_.write_packed(zserio_writer)

        if self.is_address_format_id_used():
            zserio_context.address_format_id.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._address_format_id_)

    class ZserioPackingContext:
        def __init__(self):
            self._content_ = zserio.array.DeltaContext()
            self._address_format_id_ = zserio.array.DeltaContext()

        @property
        def content(self):
            return self._content_

        @property
        def address_format_id(self):
            return self._address_format_id_

    class _ZserioElementFactory_name_attributes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute:
            del zserio_index
            return nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute.ZserioPackingContext:
            return nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute:
            del zserio_index
            return nds.name.instantiations.name_road_range_full_attribute.NameRoadRangeFullAttribute.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_admin_elements:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement:
            del zserio_index
            return nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.ZserioPackingContext:
            return nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement:
            del zserio_index
            return nds.name.types.administrative_hierarchy_element.AdministrativeHierarchyElement.from_reader_packed(zserio_context, zserio_reader)
