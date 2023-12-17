# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.language.language_name
import nds.core.types.language_code

class LanguageMapping:
    def __init__(
            self,
            language_code_: nds.core.types.language_code.LanguageCode = nds.core.types.language_code.LanguageCode(),
            iso_country_code_: str = str(),
            iso_language_code_: str = str(),
            iso_script_code_: str = str(),
            is_transliteration_of_: nds.core.types.language_code.LanguageCode = nds.core.types.language_code.LanguageCode(),
            is_diacritic_transliteration_of_: nds.core.types.language_code.LanguageCode = nds.core.types.language_code.LanguageCode(),
            language_names_: typing.List[nds.core.language.language_name.LanguageName] = None) -> None:
        self._language_code_ = language_code_
        self._iso_country_code_ = iso_country_code_
        self._iso_language_code_ = iso_language_code_
        self._iso_script_code_ = iso_script_code_
        self._is_transliteration_of_ = is_transliteration_of_
        self._is_diacritic_transliteration_of_ = is_diacritic_transliteration_of_
        self._language_names_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_language_names()), language_names_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['LanguageMapping'],
            zserio_reader: zserio.BitStreamReader) -> 'LanguageMapping':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LanguageMapping'],
            zserio_context: LanguageMapping.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LanguageMapping':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LanguageMapping):
            return ((self._language_code_ == other._language_code_) and
                    (self._iso_country_code_ == other._iso_country_code_) and
                    (self._iso_language_code_ == other._iso_language_code_) and
                    (self._iso_script_code_ == other._iso_script_code_) and
                    (self._is_transliteration_of_ == other._is_transliteration_of_) and
                    (self._is_diacritic_transliteration_of_ == other._is_diacritic_transliteration_of_) and
                    (self._language_names_ == other._language_names_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._language_code_)
        result = zserio.hashcode.calc_hashcode_string(result, self._iso_country_code_)
        result = zserio.hashcode.calc_hashcode_string(result, self._iso_language_code_)
        result = zserio.hashcode.calc_hashcode_string(result, self._iso_script_code_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._is_transliteration_of_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._is_diacritic_transliteration_of_)
        result = zserio.hashcode.calc_hashcode_object(result, self._language_names_)

        return result

    @property
    def language_code(self) -> nds.core.types.language_code.LanguageCode:
        return self._language_code_

    @language_code.setter
    def language_code(self, language_code_: nds.core.types.language_code.LanguageCode) -> None:
        self._language_code_ = language_code_

    @property
    def iso_country_code(self) -> str:
        return self._iso_country_code_

    @iso_country_code.setter
    def iso_country_code(self, iso_country_code_: str) -> None:
        self._iso_country_code_ = iso_country_code_

    @property
    def iso_language_code(self) -> str:
        return self._iso_language_code_

    @iso_language_code.setter
    def iso_language_code(self, iso_language_code_: str) -> None:
        self._iso_language_code_ = iso_language_code_

    @property
    def iso_script_code(self) -> str:
        return self._iso_script_code_

    @iso_script_code.setter
    def iso_script_code(self, iso_script_code_: str) -> None:
        self._iso_script_code_ = iso_script_code_

    @property
    def is_transliteration_of(self) -> nds.core.types.language_code.LanguageCode:
        return self._is_transliteration_of_

    @is_transliteration_of.setter
    def is_transliteration_of(self, is_transliteration_of_: nds.core.types.language_code.LanguageCode) -> None:
        self._is_transliteration_of_ = is_transliteration_of_

    @property
    def is_diacritic_transliteration_of(self) -> nds.core.types.language_code.LanguageCode:
        return self._is_diacritic_transliteration_of_

    @is_diacritic_transliteration_of.setter
    def is_diacritic_transliteration_of(self, is_diacritic_transliteration_of_: nds.core.types.language_code.LanguageCode) -> None:
        self._is_diacritic_transliteration_of_ = is_diacritic_transliteration_of_

    @property
    def language_names(self) -> typing.List[nds.core.language.language_name.LanguageName]:
        return self._language_names_.raw_array

    @language_names.setter
    def language_names(self, language_names_: typing.List[nds.core.language.language_name.LanguageName]) -> None:
        self._language_names_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_language_names()), language_names_, is_auto=True)

    def init_packing_context(self, zserio_context: LanguageMapping.ZserioPackingContext) -> None:
        zserio_context.language_code.init(zserio.array.VarUInt16ArrayTraits(), self._language_code_)
        zserio_context.is_transliteration_of.init(zserio.array.VarUInt16ArrayTraits(), self._is_transliteration_of_)
        zserio_context.is_diacritic_transliteration_of.init(zserio.array.VarUInt16ArrayTraits(), self._is_diacritic_transliteration_of_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_country_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_script_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._is_transliteration_of_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._is_diacritic_transliteration_of_)
        end_bitposition += self._language_names_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LanguageMapping.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.language_code.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_country_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_script_code_)
        end_bitposition += zserio_context.is_transliteration_of.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._is_transliteration_of_)
        end_bitposition += zserio_context.is_diacritic_transliteration_of.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._is_diacritic_transliteration_of_)
        end_bitposition += self._language_names_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_country_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_script_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._is_transliteration_of_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._is_diacritic_transliteration_of_)
        end_bitposition = self._language_names_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LanguageMapping.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.language_code.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_country_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_language_code_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._iso_script_code_)
        end_bitposition += zserio_context.is_transliteration_of.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._is_transliteration_of_)
        end_bitposition += zserio_context.is_diacritic_transliteration_of.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._is_diacritic_transliteration_of_)
        end_bitposition = self._language_names_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._language_code_ = zserio_reader.read_varuint16()
        self._iso_country_code_ = zserio_reader.read_string()
        self._iso_language_code_ = zserio_reader.read_string()
        self._iso_script_code_ = zserio_reader.read_string()
        self._is_transliteration_of_ = zserio_reader.read_varuint16()
        self._is_diacritic_transliteration_of_ = zserio_reader.read_varuint16()
        self._language_names_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_language_names()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: LanguageMapping.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._language_code_ = zserio_context.language_code.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._iso_country_code_ = zserio_reader.read_string()

        self._iso_language_code_ = zserio_reader.read_string()

        self._iso_script_code_ = zserio_reader.read_string()

        self._is_transliteration_of_ = zserio_context.is_transliteration_of.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._is_diacritic_transliteration_of_ = zserio_context.is_diacritic_transliteration_of.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._language_names_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_language_names()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._language_code_)
        zserio_writer.write_string(self._iso_country_code_)
        zserio_writer.write_string(self._iso_language_code_)
        zserio_writer.write_string(self._iso_script_code_)
        zserio_writer.write_varuint16(self._is_transliteration_of_)
        zserio_writer.write_varuint16(self._is_diacritic_transliteration_of_)
        self._language_names_.write(zserio_writer)

    def write_packed(self, zserio_context: LanguageMapping.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.language_code.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._language_code_)

        zserio_writer.write_string(self._iso_country_code_)

        zserio_writer.write_string(self._iso_language_code_)

        zserio_writer.write_string(self._iso_script_code_)

        zserio_context.is_transliteration_of.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._is_transliteration_of_)

        zserio_context.is_diacritic_transliteration_of.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._is_diacritic_transliteration_of_)

        self._language_names_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._language_code_ = zserio.array.DeltaContext()
            self._is_transliteration_of_ = zserio.array.DeltaContext()
            self._is_diacritic_transliteration_of_ = zserio.array.DeltaContext()

        @property
        def language_code(self):
            return self._language_code_

        @property
        def is_transliteration_of(self):
            return self._is_transliteration_of_

        @property
        def is_diacritic_transliteration_of(self):
            return self._is_diacritic_transliteration_of_

    class _ZserioElementFactory_language_names:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.language.language_name.LanguageName:
            del zserio_index
            return nds.core.language.language_name.LanguageName.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.language.language_name.LanguageName.ZserioPackingContext:
            return nds.core.language.language_name.LanguageName.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.language.language_name.LanguageName.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.language.language_name.LanguageName:
            del zserio_index
            return nds.core.language.language_name.LanguageName.from_reader_packed(zserio_context, zserio_reader)