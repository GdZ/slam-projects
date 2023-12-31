# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.language_code
import nds.poi.types.name_string_relation_type
import nds.poi.types.name_string_usage_type

class NameString:
    def __init__(
            self,
            name_string_: str = str(),
            language_code_: nds.core.types.language_code.LanguageCode = nds.core.types.language_code.LanguageCode(),
            name_string_relation_type_: typing.Union[nds.poi.types.name_string_relation_type.NameStringRelationType, None] = None,
            name_string_usage_type_: typing.Union[nds.poi.types.name_string_usage_type.NameStringUsageType, None] = None,
            ref_name_string_index_: typing.Optional[int] = None) -> None:
        self._name_string_ = name_string_
        self._language_code_ = language_code_
        self._name_string_relation_type_ = name_string_relation_type_
        self._name_string_usage_type_ = name_string_usage_type_
        self._ref_name_string_index_ = ref_name_string_index_

    @classmethod
    def from_reader(
            cls: typing.Type['NameString'],
            zserio_reader: zserio.BitStreamReader) -> 'NameString':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['NameString'],
            zserio_context: NameString.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'NameString':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NameString):
            return ((self._name_string_ == other._name_string_) and
                    (self._language_code_ == other._language_code_) and
                    (self._name_string_relation_type_ == other._name_string_relation_type_) and
                    (self._name_string_usage_type_ == other._name_string_usage_type_) and
                    (not other.is_ref_name_string_index_used() if not self.is_ref_name_string_index_used() else (self._ref_name_string_index_ == other._ref_name_string_index_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_string(result, self._name_string_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._language_code_)
        result = zserio.hashcode.calc_hashcode_object(result, self._name_string_relation_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._name_string_usage_type_)
        if self.is_ref_name_string_index_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._ref_name_string_index_)

        return result

    @property
    def name_string(self) -> str:
        return self._name_string_

    @name_string.setter
    def name_string(self, name_string_: str) -> None:
        self._name_string_ = name_string_

    @property
    def language_code(self) -> nds.core.types.language_code.LanguageCode:
        return self._language_code_

    @language_code.setter
    def language_code(self, language_code_: nds.core.types.language_code.LanguageCode) -> None:
        self._language_code_ = language_code_

    @property
    def name_string_relation_type(self) -> typing.Union[nds.poi.types.name_string_relation_type.NameStringRelationType, None]:
        return self._name_string_relation_type_

    @name_string_relation_type.setter
    def name_string_relation_type(self, name_string_relation_type_: typing.Union[nds.poi.types.name_string_relation_type.NameStringRelationType, None]) -> None:
        self._name_string_relation_type_ = name_string_relation_type_

    @property
    def name_string_usage_type(self) -> typing.Union[nds.poi.types.name_string_usage_type.NameStringUsageType, None]:
        return self._name_string_usage_type_

    @name_string_usage_type.setter
    def name_string_usage_type(self, name_string_usage_type_: typing.Union[nds.poi.types.name_string_usage_type.NameStringUsageType, None]) -> None:
        self._name_string_usage_type_ = name_string_usage_type_

    @property
    def ref_name_string_index(self) -> typing.Optional[int]:
        return self._ref_name_string_index_

    @ref_name_string_index.setter
    def ref_name_string_index(self, ref_name_string_index_: typing.Optional[int]) -> None:
        self._ref_name_string_index_ = ref_name_string_index_

    def is_ref_name_string_index_used(self) -> bool:
        return self._name_string_relation_type_ != nds.poi.types.name_string_relation_type.NameStringRelationType.NO_RELATION

    def is_ref_name_string_index_set(self) -> bool:
        return not self._ref_name_string_index_ is None

    def reset_ref_name_string_index(self) -> None:
        self._ref_name_string_index_ = None

    def init_packing_context(self, zserio_context: NameString.ZserioPackingContext) -> None:
        zserio_context.language_code.init(zserio.array.VarUInt16ArrayTraits(), self._language_code_)
        self._name_string_relation_type_.init_packing_context(zserio_context.name_string_relation_type)
        self._name_string_usage_type_.init_packing_context(zserio_context.name_string_usage_type)
        if self.is_ref_name_string_index_used():
            zserio_context.ref_name_string_index.init(zserio.array.BitFieldArrayTraits(8), self._ref_name_string_index_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_string_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._language_code_)
        end_bitposition += self._name_string_relation_type_.bitsizeof(end_bitposition)
        end_bitposition += self._name_string_usage_type_.bitsizeof(end_bitposition)
        if self.is_ref_name_string_index_used():
            end_bitposition += 8

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: NameString.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_string_)
        end_bitposition += zserio_context.language_code.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._language_code_)
        end_bitposition += self._name_string_relation_type_.bitsizeof_packed(zserio_context.name_string_relation_type, end_bitposition)
        end_bitposition += self._name_string_usage_type_.bitsizeof_packed(zserio_context.name_string_usage_type, end_bitposition)
        if self.is_ref_name_string_index_used():
            end_bitposition += zserio_context.ref_name_string_index.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._ref_name_string_index_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_string_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._language_code_)
        end_bitposition = self._name_string_relation_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._name_string_usage_type_.initialize_offsets(end_bitposition)
        if self.is_ref_name_string_index_used():
            end_bitposition += 8

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: NameString.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_string_)
        end_bitposition += zserio_context.language_code.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._language_code_)
        end_bitposition = self._name_string_relation_type_.initialize_offsets_packed(zserio_context.name_string_relation_type, end_bitposition)
        end_bitposition = self._name_string_usage_type_.initialize_offsets_packed(zserio_context.name_string_usage_type, end_bitposition)
        if self.is_ref_name_string_index_used():
            end_bitposition += zserio_context.ref_name_string_index.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._ref_name_string_index_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._name_string_ = zserio_reader.read_string()
        self._language_code_ = zserio_reader.read_varuint16()
        self._name_string_relation_type_ = nds.poi.types.name_string_relation_type.NameStringRelationType.from_reader(zserio_reader)
        self._name_string_usage_type_ = nds.poi.types.name_string_usage_type.NameStringUsageType.from_reader(zserio_reader)
        if self.is_ref_name_string_index_used():
            self._ref_name_string_index_ = zserio_reader.read_bits(8)
        else:
            self._ref_name_string_index_ = None

    def read_packed(self, zserio_context: NameString.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._name_string_ = zserio_reader.read_string()

        self._language_code_ = zserio_context.language_code.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._name_string_relation_type_ = nds.poi.types.name_string_relation_type.NameStringRelationType.from_reader_packed(zserio_context.name_string_relation_type, zserio_reader)

        self._name_string_usage_type_ = nds.poi.types.name_string_usage_type.NameStringUsageType.from_reader_packed(zserio_context.name_string_usage_type, zserio_reader)

        if self.is_ref_name_string_index_used():
            self._ref_name_string_index_ = zserio_context.ref_name_string_index.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
        else:
            self._ref_name_string_index_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_string(self._name_string_)
        zserio_writer.write_varuint16(self._language_code_)
        self._name_string_relation_type_.write(zserio_writer)
        self._name_string_usage_type_.write(zserio_writer)
        if self.is_ref_name_string_index_used():
            zserio_writer.write_bits(self._ref_name_string_index_, 8)

    def write_packed(self, zserio_context: NameString.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_string(self._name_string_)

        zserio_context.language_code.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._language_code_)

        self._name_string_relation_type_.write_packed(zserio_context.name_string_relation_type, zserio_writer)

        self._name_string_usage_type_.write_packed(zserio_context.name_string_usage_type, zserio_writer)

        if self.is_ref_name_string_index_used():
            zserio_context.ref_name_string_index.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._ref_name_string_index_)

    class ZserioPackingContext:
        def __init__(self):
            self._language_code_ = zserio.array.DeltaContext()
            self._name_string_relation_type_ = zserio.array.DeltaContext()
            self._name_string_usage_type_ = zserio.array.DeltaContext()
            self._ref_name_string_index_ = zserio.array.DeltaContext()

        @property
        def language_code(self):
            return self._language_code_

        @property
        def name_string_relation_type(self):
            return self._name_string_relation_type_

        @property
        def name_string_usage_type(self):
            return self._name_string_usage_type_

        @property
        def ref_name_string_index(self):
            return self._ref_name_string_index_
