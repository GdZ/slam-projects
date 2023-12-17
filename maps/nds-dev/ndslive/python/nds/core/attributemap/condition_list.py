# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.attributemap.condition

class ConditionList:
    def __init__(
            self,
            num_conditions_: int = int(),
            condition_list_: typing.List[nds.core.attributemap.condition.Condition] = None) -> None:
        self._num_conditions_ = num_conditions_
        self._condition_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_list()), condition_list_)

    @classmethod
    def from_reader(
            cls: typing.Type['ConditionList'],
            zserio_reader: zserio.BitStreamReader) -> 'ConditionList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ConditionList'],
            zserio_context: ConditionList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ConditionList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ConditionList):
            return ((self._num_conditions_ == other._num_conditions_) and
                    (self._condition_list_ == other._condition_list_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_conditions_)
        result = zserio.hashcode.calc_hashcode_object(result, self._condition_list_)

        return result

    @property
    def num_conditions(self) -> int:
        return self._num_conditions_

    @num_conditions.setter
    def num_conditions(self, num_conditions_: int) -> None:
        self._num_conditions_ = num_conditions_

    @property
    def condition_list(self) -> typing.List[nds.core.attributemap.condition.Condition]:
        return self._condition_list_.raw_array

    @condition_list.setter
    def condition_list(self, condition_list_: typing.List[nds.core.attributemap.condition.Condition]) -> None:
        self._condition_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_list()), condition_list_)

    def init_packing_context(self, zserio_context: ConditionList.ZserioPackingContext) -> None:
        zserio_context.num_conditions.init(zserio.array.BitFieldArrayTraits(8), self._num_conditions_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += self._condition_list_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ConditionList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_conditions.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_conditions_)
        end_bitposition += self._condition_list_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition = self._condition_list_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ConditionList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_conditions.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_conditions_)
        end_bitposition = self._condition_list_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_conditions_ = zserio_reader.read_bits(8)
        self._condition_list_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_list()), zserio_reader, self._num_conditions_)

    def read_packed(self, zserio_context: ConditionList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_conditions_ = zserio_context.num_conditions.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._condition_list_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_list()), zserio_reader, self._num_conditions_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._num_conditions_, 8)

        # check array length
        if len(self._condition_list_) != (self._num_conditions_):
            raise zserio.PythonRuntimeException("Wrong array length for field ConditionList.conditionList: "
                                                f"{len(self._condition_list_)} != {self._num_conditions_}!")
        self._condition_list_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: ConditionList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_conditions.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_conditions_)

        # check array length
        if len(self._condition_list_) != (self._num_conditions_):
            raise zserio.PythonRuntimeException("Wrong array length for field ConditionList.conditionList: "
                                                f"{len(self._condition_list_)} != {self._num_conditions_}!")
        self._condition_list_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_conditions_ = zserio.array.DeltaContext()

        @property
        def num_conditions(self):
            return self._num_conditions_

    class _ZserioElementFactory_condition_list:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.condition.Condition:
            del zserio_index
            return nds.core.attributemap.condition.Condition.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.attributemap.condition.Condition.ZserioPackingContext:
            return nds.core.attributemap.condition.Condition.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.attributemap.condition.Condition.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.condition.Condition:
            del zserio_index
            return nds.core.attributemap.condition.Condition.from_reader_packed(zserio_context, zserio_reader)