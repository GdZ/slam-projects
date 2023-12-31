# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.scale_range_id
import nds.poi.reference.types.poi_category_id
import nds.poi.reference.types.poi_standard_category
import nds.poi.types.category_icon_set_reference
import nds.poi.types.name_string_collection

class PoiCategory:
    def __init__(
            self,
            category_id_: nds.poi.reference.types.poi_category_id.PoiCategoryId = nds.poi.reference.types.poi_category_id.PoiCategoryId(),
            standard_category_: typing.Union[nds.poi.reference.types.poi_standard_category.PoiStandardCategory, None] = None,
            category_name_string_collection_: typing.Union[nds.poi.types.name_string_collection.NameStringCollection, None] = None,
            selection_entry_: bool = bool(),
            show_in_search_tree_: bool = bool(),
            is_brand_: bool = bool(),
            is_collective_: bool = bool(),
            icon_set_reference_: typing.Optional[nds.poi.types.category_icon_set_reference.CategoryIconSetReference] = None,
            scale_range_ids_: typing.Optional[typing.List[nds.core.types.scale_range_id.ScaleRangeId]] = None,
            activation_radius_: typing.Optional[int] = None,
            parents_: typing.Optional[typing.List[nds.poi.reference.types.poi_category_id.PoiCategoryId]] = None,
            children_: typing.Optional[typing.List[nds.poi.reference.types.poi_category_id.PoiCategoryId]] = None) -> None:
        self._category_id_ = category_id_
        self._standard_category_ = standard_category_
        self._category_name_string_collection_ = category_name_string_collection_
        self._selection_entry_ = selection_entry_
        self._show_in_search_tree_ = show_in_search_tree_
        self._is_brand_ = is_brand_
        self._is_collective_ = is_collective_
        self._icon_set_reference_ = icon_set_reference_
        if scale_range_ids_ is None:
            self._scale_range_ids_ = None
        else:
            self._scale_range_ids_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), scale_range_ids_, is_auto=True)
        self._activation_radius_ = activation_radius_
        if parents_ is None:
            self._parents_ = None
        else:
            self._parents_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), parents_, is_auto=True)
        if children_ is None:
            self._children_ = None
        else:
            self._children_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), children_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['PoiCategory'],
            zserio_reader: zserio.BitStreamReader) -> 'PoiCategory':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PoiCategory'],
            zserio_context: PoiCategory.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'PoiCategory':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PoiCategory):
            return ((self._category_id_ == other._category_id_) and
                    (self._standard_category_ == other._standard_category_) and
                    (self._category_name_string_collection_ == other._category_name_string_collection_) and
                    (self._selection_entry_ == other._selection_entry_) and
                    (self._show_in_search_tree_ == other._show_in_search_tree_) and
                    (self._is_brand_ == other._is_brand_) and
                    (self._is_collective_ == other._is_collective_) and
                    (not other.is_icon_set_reference_used() if not self.is_icon_set_reference_used() else (self._icon_set_reference_ == other._icon_set_reference_)) and
                    (not other.is_scale_range_ids_used() if not self.is_scale_range_ids_used() else (self._scale_range_ids_ == other._scale_range_ids_)) and
                    (not other.is_activation_radius_used() if not self.is_activation_radius_used() else (self._activation_radius_ == other._activation_radius_)) and
                    (not other.is_parents_used() if not self.is_parents_used() else (self._parents_ == other._parents_)) and
                    (not other.is_children_used() if not self.is_children_used() else (self._children_ == other._children_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._category_id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._standard_category_)
        result = zserio.hashcode.calc_hashcode_object(result, self._category_name_string_collection_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._selection_entry_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._show_in_search_tree_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_brand_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_collective_)
        if self.is_icon_set_reference_used():
            result = zserio.hashcode.calc_hashcode_int64(result, self._icon_set_reference_)
        if self.is_scale_range_ids_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._scale_range_ids_)
        if self.is_activation_radius_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._activation_radius_)
        if self.is_parents_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._parents_)
        if self.is_children_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._children_)

        return result

    @property
    def category_id(self) -> nds.poi.reference.types.poi_category_id.PoiCategoryId:
        return self._category_id_

    @category_id.setter
    def category_id(self, category_id_: nds.poi.reference.types.poi_category_id.PoiCategoryId) -> None:
        self._category_id_ = category_id_

    @property
    def standard_category(self) -> typing.Union[nds.poi.reference.types.poi_standard_category.PoiStandardCategory, None]:
        return self._standard_category_

    @standard_category.setter
    def standard_category(self, standard_category_: typing.Union[nds.poi.reference.types.poi_standard_category.PoiStandardCategory, None]) -> None:
        self._standard_category_ = standard_category_

    @property
    def category_name_string_collection(self) -> typing.Union[nds.poi.types.name_string_collection.NameStringCollection, None]:
        return self._category_name_string_collection_

    @category_name_string_collection.setter
    def category_name_string_collection(self, category_name_string_collection_: typing.Union[nds.poi.types.name_string_collection.NameStringCollection, None]) -> None:
        self._category_name_string_collection_ = category_name_string_collection_

    @property
    def selection_entry(self) -> bool:
        return self._selection_entry_

    @selection_entry.setter
    def selection_entry(self, selection_entry_: bool) -> None:
        self._selection_entry_ = selection_entry_

    @property
    def show_in_search_tree(self) -> bool:
        return self._show_in_search_tree_

    @show_in_search_tree.setter
    def show_in_search_tree(self, show_in_search_tree_: bool) -> None:
        self._show_in_search_tree_ = show_in_search_tree_

    @property
    def is_brand(self) -> bool:
        return self._is_brand_

    @is_brand.setter
    def is_brand(self, is_brand_: bool) -> None:
        self._is_brand_ = is_brand_

    @property
    def is_collective(self) -> bool:
        return self._is_collective_

    @is_collective.setter
    def is_collective(self, is_collective_: bool) -> None:
        self._is_collective_ = is_collective_

    @property
    def icon_set_reference(self) -> typing.Optional[nds.poi.types.category_icon_set_reference.CategoryIconSetReference]:
        return self._icon_set_reference_

    @icon_set_reference.setter
    def icon_set_reference(self, icon_set_reference_: typing.Optional[nds.poi.types.category_icon_set_reference.CategoryIconSetReference]) -> None:
        self._icon_set_reference_ = icon_set_reference_

    def is_icon_set_reference_used(self) -> bool:
        return self.is_icon_set_reference_set()

    def is_icon_set_reference_set(self) -> bool:
        return not self._icon_set_reference_ is None

    def reset_icon_set_reference(self) -> None:
        self._icon_set_reference_ = None

    @property
    def scale_range_ids(self) -> typing.Optional[typing.List[nds.core.types.scale_range_id.ScaleRangeId]]:
        return None if self._scale_range_ids_ is None else self._scale_range_ids_.raw_array

    @scale_range_ids.setter
    def scale_range_ids(self, scale_range_ids_: typing.Optional[typing.List[nds.core.types.scale_range_id.ScaleRangeId]]) -> None:
        if scale_range_ids_ is None:
            self._scale_range_ids_ = None
        else:
            self._scale_range_ids_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), scale_range_ids_, is_auto=True)

    def is_scale_range_ids_used(self) -> bool:
        return self.is_scale_range_ids_set()

    def is_scale_range_ids_set(self) -> bool:
        return not self._scale_range_ids_ is None

    def reset_scale_range_ids(self) -> None:
        self._scale_range_ids_ = None

    @property
    def activation_radius(self) -> typing.Optional[int]:
        return self._activation_radius_

    @activation_radius.setter
    def activation_radius(self, activation_radius_: typing.Optional[int]) -> None:
        self._activation_radius_ = activation_radius_

    def is_activation_radius_used(self) -> bool:
        return self.is_activation_radius_set()

    def is_activation_radius_set(self) -> bool:
        return not self._activation_radius_ is None

    def reset_activation_radius(self) -> None:
        self._activation_radius_ = None

    @property
    def parents(self) -> typing.Optional[typing.List[nds.poi.reference.types.poi_category_id.PoiCategoryId]]:
        return None if self._parents_ is None else self._parents_.raw_array

    @parents.setter
    def parents(self, parents_: typing.Optional[typing.List[nds.poi.reference.types.poi_category_id.PoiCategoryId]]) -> None:
        if parents_ is None:
            self._parents_ = None
        else:
            self._parents_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), parents_, is_auto=True)

    def is_parents_used(self) -> bool:
        return self.is_parents_set()

    def is_parents_set(self) -> bool:
        return not self._parents_ is None

    def reset_parents(self) -> None:
        self._parents_ = None

    @property
    def children(self) -> typing.Optional[typing.List[nds.poi.reference.types.poi_category_id.PoiCategoryId]]:
        return None if self._children_ is None else self._children_.raw_array

    @children.setter
    def children(self, children_: typing.Optional[typing.List[nds.poi.reference.types.poi_category_id.PoiCategoryId]]) -> None:
        if children_ is None:
            self._children_ = None
        else:
            self._children_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), children_, is_auto=True)

    def is_children_used(self) -> bool:
        return self.is_children_set()

    def is_children_set(self) -> bool:
        return not self._children_ is None

    def reset_children(self) -> None:
        self._children_ = None

    def init_packing_context(self, zserio_context: PoiCategory.ZserioPackingContext) -> None:
        zserio_context.category_id.init(zserio.array.VarUInt32ArrayTraits(), self._category_id_)
        self._standard_category_.init_packing_context(zserio_context.standard_category)
        self._category_name_string_collection_.init_packing_context(zserio_context.category_name_string_collection)
        if self.is_icon_set_reference_used():
            zserio_context.icon_set_reference.init(zserio.array.VarUIntArrayTraits(), self._icon_set_reference_)
        if self.is_activation_radius_used():
            zserio_context.activation_radius.init(zserio.array.BitFieldArrayTraits(16), self._activation_radius_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._category_id_)
        end_bitposition += self._standard_category_.bitsizeof(end_bitposition)
        end_bitposition += self._category_name_string_collection_.bitsizeof(end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        if self.is_icon_set_reference_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._icon_set_reference_)
        end_bitposition += 1
        if self.is_scale_range_ids_used():
            end_bitposition += self._scale_range_ids_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_activation_radius_used():
            end_bitposition += 16
        end_bitposition += 1
        if self.is_parents_used():
            end_bitposition += self._parents_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_children_used():
            end_bitposition += self._children_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PoiCategory.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.category_id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._category_id_)
        end_bitposition += self._standard_category_.bitsizeof_packed(zserio_context.standard_category, end_bitposition)
        end_bitposition += self._category_name_string_collection_.bitsizeof_packed(zserio_context.category_name_string_collection, end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        if self.is_icon_set_reference_used():
            end_bitposition += zserio_context.icon_set_reference.bitsizeof(zserio.array.VarUIntArrayTraits(), self._icon_set_reference_)
        end_bitposition += 1
        if self.is_scale_range_ids_used():
            end_bitposition += self._scale_range_ids_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        if self.is_activation_radius_used():
            end_bitposition += zserio_context.activation_radius.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._activation_radius_)
        end_bitposition += 1
        if self.is_parents_used():
            end_bitposition += self._parents_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        if self.is_children_used():
            end_bitposition += self._children_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._category_id_)
        end_bitposition = self._standard_category_.initialize_offsets(end_bitposition)
        end_bitposition = self._category_name_string_collection_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        if self.is_icon_set_reference_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._icon_set_reference_)
        end_bitposition += 1
        if self.is_scale_range_ids_used():
            end_bitposition = self._scale_range_ids_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_activation_radius_used():
            end_bitposition += 16
        end_bitposition += 1
        if self.is_parents_used():
            end_bitposition = self._parents_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_children_used():
            end_bitposition = self._children_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PoiCategory.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.category_id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._category_id_)
        end_bitposition = self._standard_category_.initialize_offsets_packed(zserio_context.standard_category, end_bitposition)
        end_bitposition = self._category_name_string_collection_.initialize_offsets_packed(zserio_context.category_name_string_collection, end_bitposition)
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        end_bitposition += 1
        if self.is_icon_set_reference_used():
            end_bitposition += zserio_context.icon_set_reference.bitsizeof(zserio.array.VarUIntArrayTraits(), self._icon_set_reference_)
        end_bitposition += 1
        if self.is_scale_range_ids_used():
            end_bitposition = self._scale_range_ids_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        if self.is_activation_radius_used():
            end_bitposition += zserio_context.activation_radius.bitsizeof(zserio.array.BitFieldArrayTraits(16), self._activation_radius_)
        end_bitposition += 1
        if self.is_parents_used():
            end_bitposition = self._parents_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        if self.is_children_used():
            end_bitposition = self._children_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._category_id_ = zserio_reader.read_varuint32()
        self._standard_category_ = nds.poi.reference.types.poi_standard_category.PoiStandardCategory.from_reader(zserio_reader)
        self._category_name_string_collection_ = nds.poi.types.name_string_collection.NameStringCollection.from_reader(zserio_reader)
        self._selection_entry_ = zserio_reader.read_bool()
        self._show_in_search_tree_ = zserio_reader.read_bool()
        self._is_brand_ = zserio_reader.read_bool()
        self._is_collective_ = zserio_reader.read_bool()
        if zserio_reader.read_bool():
            self._icon_set_reference_ = zserio_reader.read_varuint()
        else:
            self._icon_set_reference_ = None
        if zserio_reader.read_bool():
            self._scale_range_ids_ = zserio.array.Array.from_reader(zserio.array.VarUInt32ArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._scale_range_ids_ = None
        if zserio_reader.read_bool():
            self._activation_radius_ = zserio_reader.read_bits(16)
        else:
            self._activation_radius_ = None
        if zserio_reader.read_bool():
            self._parents_ = zserio.array.Array.from_reader(zserio.array.VarUInt32ArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._parents_ = None
        if zserio_reader.read_bool():
            self._children_ = zserio.array.Array.from_reader(zserio.array.VarUInt32ArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._children_ = None

    def read_packed(self, zserio_context: PoiCategory.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._category_id_ = zserio_context.category_id.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

        self._standard_category_ = nds.poi.reference.types.poi_standard_category.PoiStandardCategory.from_reader_packed(zserio_context.standard_category, zserio_reader)

        self._category_name_string_collection_ = nds.poi.types.name_string_collection.NameStringCollection.from_reader_packed(zserio_context.category_name_string_collection, zserio_reader)

        self._selection_entry_ = zserio_reader.read_bool()

        self._show_in_search_tree_ = zserio_reader.read_bool()

        self._is_brand_ = zserio_reader.read_bool()

        self._is_collective_ = zserio_reader.read_bool()

        if zserio_reader.read_bool():
            self._icon_set_reference_ = zserio_context.icon_set_reference.read(zserio.array.VarUIntArrayTraits(), zserio_reader)
        else:
            self._icon_set_reference_ = None

        if zserio_reader.read_bool():
            self._scale_range_ids_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt32ArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._scale_range_ids_ = None

        if zserio_reader.read_bool():
            self._activation_radius_ = zserio_context.activation_radius.read(zserio.array.BitFieldArrayTraits(16), zserio_reader)
        else:
            self._activation_radius_ = None

        if zserio_reader.read_bool():
            self._parents_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt32ArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._parents_ = None

        if zserio_reader.read_bool():
            self._children_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt32ArrayTraits(), zserio_reader, is_auto=True)
        else:
            self._children_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint32(self._category_id_)
        self._standard_category_.write(zserio_writer)
        self._category_name_string_collection_.write(zserio_writer)
        zserio_writer.write_bool(self._selection_entry_)
        zserio_writer.write_bool(self._show_in_search_tree_)
        zserio_writer.write_bool(self._is_brand_)
        zserio_writer.write_bool(self._is_collective_)
        if self.is_icon_set_reference_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_varuint(self._icon_set_reference_)
        else:
            zserio_writer.write_bool(False)
        if self.is_scale_range_ids_used():
            zserio_writer.write_bool(True)
            self._scale_range_ids_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_activation_radius_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_bits(self._activation_radius_, 16)
        else:
            zserio_writer.write_bool(False)
        if self.is_parents_used():
            zserio_writer.write_bool(True)
            self._parents_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_children_used():
            zserio_writer.write_bool(True)
            self._children_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: PoiCategory.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.category_id.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._category_id_)

        self._standard_category_.write_packed(zserio_context.standard_category, zserio_writer)

        self._category_name_string_collection_.write_packed(zserio_context.category_name_string_collection, zserio_writer)

        zserio_writer.write_bool(self._selection_entry_)

        zserio_writer.write_bool(self._show_in_search_tree_)

        zserio_writer.write_bool(self._is_brand_)

        zserio_writer.write_bool(self._is_collective_)

        if self.is_icon_set_reference_used():
            zserio_writer.write_bool(True)
            zserio_context.icon_set_reference.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._icon_set_reference_)
        else:
            zserio_writer.write_bool(False)

        if self.is_scale_range_ids_used():
            zserio_writer.write_bool(True)
            self._scale_range_ids_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_activation_radius_used():
            zserio_writer.write_bool(True)
            zserio_context.activation_radius.write(zserio.array.BitFieldArrayTraits(16), zserio_writer, self._activation_radius_)
        else:
            zserio_writer.write_bool(False)

        if self.is_parents_used():
            zserio_writer.write_bool(True)
            self._parents_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_children_used():
            zserio_writer.write_bool(True)
            self._children_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._category_id_ = zserio.array.DeltaContext()
            self._standard_category_ = zserio.array.DeltaContext()
            self._category_name_string_collection_ = nds.poi.types.name_string_collection.NameStringCollection.ZserioPackingContext()
            self._icon_set_reference_ = zserio.array.DeltaContext()
            self._activation_radius_ = zserio.array.DeltaContext()

        @property
        def category_id(self):
            return self._category_id_

        @property
        def standard_category(self):
            return self._standard_category_

        @property
        def category_name_string_collection(self):
            return self._category_name_string_collection_

        @property
        def icon_set_reference(self):
            return self._icon_set_reference_

        @property
        def activation_radius(self):
            return self._activation_radius_
