# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.conditions.condition_type_code

class ConditionTypeCodeCollection:
    def __init__(
            self,
            condition_type_code_: typing.List[nds.core.conditions.condition_type_code.ConditionTypeCode] = None) -> None:
        self._condition_type_code_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type_code()), condition_type_code_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['ConditionTypeCodeCollection'],
            zserio_reader: zserio.BitStreamReader) -> 'ConditionTypeCodeCollection':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ConditionTypeCodeCollection'],
            zserio_context: ConditionTypeCodeCollection.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ConditionTypeCodeCollection':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ConditionTypeCodeCollection):
            return (self._condition_type_code_ == other._condition_type_code_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._condition_type_code_)

        return result

    @property
    def condition_type_code(self) -> typing.List[nds.core.conditions.condition_type_code.ConditionTypeCode]:
        return self._condition_type_code_.raw_array

    @condition_type_code.setter
    def condition_type_code(self, condition_type_code_: typing.List[nds.core.conditions.condition_type_code.ConditionTypeCode]) -> None:
        self._condition_type_code_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type_code()), condition_type_code_, is_auto=True)

    def init_packing_context(self, zserio_context: ConditionTypeCodeCollection.ZserioPackingContext) -> None:
        del zserio_context

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._condition_type_code_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ConditionTypeCodeCollection.ZserioPackingContext, bitposition: int = 0) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition += self._condition_type_code_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._condition_type_code_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ConditionTypeCodeCollection.ZserioPackingContext, bitposition: int) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition = self._condition_type_code_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._condition_type_code_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type_code()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: ConditionTypeCodeCollection.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        del zserio_context

        self._condition_type_code_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type_code()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._condition_type_code_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: ConditionTypeCodeCollection.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        del zserio_context

        self._condition_type_code_.write_packed(zserio_writer)

    class ZserioPackingContext:
        pass

    class _ZserioElementFactory_condition_type_code:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.conditions.condition_type_code.ConditionTypeCode:
            del zserio_index
            return nds.core.conditions.condition_type_code.ConditionTypeCode.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> zserio.array.DeltaContext:
            return zserio.array.DeltaContext()

        @staticmethod
        def create_packed(zserio_context: zserio.array.DeltaContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.conditions.condition_type_code.ConditionTypeCode:
            del zserio_index
            return nds.core.conditions.condition_type_code.ConditionTypeCode.from_reader_packed(zserio_context, zserio_reader)