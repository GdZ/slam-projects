# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.language.available_languages
import nds.core.types.scale_range_list
import nds.poi.metadata.poi_category

class PoiLayerMetadata:
    def __init__(
            self,
            categories_: typing.List[nds.poi.metadata.poi_category.PoiCategory] = None,
            scales_: typing.Union[nds.core.types.scale_range_list.ScaleRangeList, None] = None,
            available_languages_: typing.Union[nds.core.language.available_languages.AvailableLanguages, None] = None,
            global_icon_set_references_: bool = bool()) -> None:
        self._categories_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_categories()), categories_, is_auto=True)
        self._scales_ = scales_
        self._available_languages_ = available_languages_
        self._global_icon_set_references_ = global_icon_set_references_

    @classmethod
    def from_reader(
            cls: typing.Type['PoiLayerMetadata'],
            zserio_reader: zserio.BitStreamReader) -> 'PoiLayerMetadata':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PoiLayerMetadata'],
            zserio_context: PoiLayerMetadata.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'PoiLayerMetadata':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PoiLayerMetadata):
            return ((self._categories_ == other._categories_) and
                    (self._scales_ == other._scales_) and
                    (self._available_languages_ == other._available_languages_) and
                    (self._global_icon_set_references_ == other._global_icon_set_references_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._categories_)
        result = zserio.hashcode.calc_hashcode_object(result, self._scales_)
        result = zserio.hashcode.calc_hashcode_object(result, self._available_languages_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._global_icon_set_references_)

        return result

    @property
    def categories(self) -> typing.List[nds.poi.metadata.poi_category.PoiCategory]:
        return self._categories_.raw_array

    @categories.setter
    def categories(self, categories_: typing.List[nds.poi.metadata.poi_category.PoiCategory]) -> None:
        self._categories_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_categories()), categories_, is_auto=True)

    @property
    def scales(self) -> typing.Union[nds.core.types.scale_range_list.ScaleRangeList, None]:
        return self._scales_

    @scales.setter
    def scales(self, scales_: typing.Union[nds.core.types.scale_range_list.ScaleRangeList, None]) -> None:
        self._scales_ = scales_

    @property
    def available_languages(self) -> typing.Union[nds.core.language.available_languages.AvailableLanguages, None]:
        return self._available_languages_

    @available_languages.setter
    def available_languages(self, available_languages_: typing.Union[nds.core.language.available_languages.AvailableLanguages, None]) -> None:
        self._available_languages_ = available_languages_

    @property
    def global_icon_set_references(self) -> bool:
        return self._global_icon_set_references_

    @global_icon_set_references.setter
    def global_icon_set_references(self, global_icon_set_references_: bool) -> None:
        self._global_icon_set_references_ = global_icon_set_references_

    def init_packing_context(self, zserio_context: PoiLayerMetadata.ZserioPackingContext) -> None:
        self._scales_.init_packing_context(zserio_context.scales)
        self._available_languages_.init_packing_context(zserio_context.available_languages)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._categories_.bitsizeof(end_bitposition)
        end_bitposition += self._scales_.bitsizeof(end_bitposition)
        end_bitposition += self._available_languages_.bitsizeof(end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PoiLayerMetadata.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._categories_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._scales_.bitsizeof_packed(zserio_context.scales, end_bitposition)
        end_bitposition += self._available_languages_.bitsizeof_packed(zserio_context.available_languages, end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._categories_.initialize_offsets(end_bitposition)
        end_bitposition = self._scales_.initialize_offsets(end_bitposition)
        end_bitposition = self._available_languages_.initialize_offsets(end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PoiLayerMetadata.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._categories_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._scales_.initialize_offsets_packed(zserio_context.scales, end_bitposition)
        end_bitposition = self._available_languages_.initialize_offsets_packed(zserio_context.available_languages, end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._categories_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_categories()), zserio_reader, is_auto=True)
        self._scales_ = nds.core.types.scale_range_list.ScaleRangeList.from_reader(zserio_reader)
        self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.from_reader(zserio_reader)
        self._global_icon_set_references_ = zserio_reader.read_bool()

    def read_packed(self, zserio_context: PoiLayerMetadata.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._categories_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_categories()), zserio_reader, is_auto=True)

        self._scales_ = nds.core.types.scale_range_list.ScaleRangeList.from_reader_packed(zserio_context.scales, zserio_reader)

        self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.from_reader_packed(zserio_context.available_languages, zserio_reader)

        self._global_icon_set_references_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._categories_.write(zserio_writer)
        self._scales_.write(zserio_writer)
        self._available_languages_.write(zserio_writer)
        zserio_writer.write_bool(self._global_icon_set_references_)

    def write_packed(self, zserio_context: PoiLayerMetadata.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._categories_.write_packed(zserio_writer)

        self._scales_.write_packed(zserio_context.scales, zserio_writer)

        self._available_languages_.write_packed(zserio_context.available_languages, zserio_writer)

        zserio_writer.write_bool(self._global_icon_set_references_)

    class ZserioPackingContext:
        def __init__(self):
            self._scales_ = nds.core.types.scale_range_list.ScaleRangeList.ZserioPackingContext()
            self._available_languages_ = nds.core.language.available_languages.AvailableLanguages.ZserioPackingContext()

        @property
        def scales(self):
            return self._scales_

        @property
        def available_languages(self):
            return self._available_languages_

    class _ZserioElementFactory_categories:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.poi.metadata.poi_category.PoiCategory:
            del zserio_index
            return nds.poi.metadata.poi_category.PoiCategory.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.poi.metadata.poi_category.PoiCategory.ZserioPackingContext:
            return nds.poi.metadata.poi_category.PoiCategory.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.poi.metadata.poi_category.PoiCategory.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.poi.metadata.poi_category.PoiCategory:
            del zserio_index
            return nds.poi.metadata.poi_category.PoiCategory.from_reader_packed(zserio_context, zserio_reader)
