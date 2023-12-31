# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.attributemap.condition_type_code_collection
import nds.name.attributes.name_lane_range_attribute_type

class NameLaneRangeAttributeMapListHeader:
    def __init__(
            self,
            num_maps_: int,
            attribute_type_code_: typing.List[nds.name.attributes.name_lane_range_attribute_type.NameLaneRangeAttributeType] = None,
            condition_type_: typing.List[nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection] = None) -> None:
        self._num_maps_ = num_maps_
        self._attribute_type_code_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_type_code()), attribute_type_code_)
        self._condition_type_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type()), condition_type_)

    @classmethod
    def from_reader(
            cls: typing.Type['NameLaneRangeAttributeMapListHeader'],
            zserio_reader: zserio.BitStreamReader,
            num_maps_: int) -> 'NameLaneRangeAttributeMapListHeader':
        self = object.__new__(cls)
        self._num_maps_ = num_maps_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['NameLaneRangeAttributeMapListHeader'],
            zserio_context: NameLaneRangeAttributeMapListHeader.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            num_maps_: int) -> 'NameLaneRangeAttributeMapListHeader':
        self = object.__new__(cls)
        self._num_maps_ = num_maps_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NameLaneRangeAttributeMapListHeader):
            return (self._num_maps_ == other._num_maps_ and
                    (self._attribute_type_code_ == other._attribute_type_code_) and
                    (self._condition_type_ == other._condition_type_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_maps_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_type_code_)
        result = zserio.hashcode.calc_hashcode_object(result, self._condition_type_)

        return result

    @property
    def num_maps(self) -> int:
        return self._num_maps_

    @property
    def attribute_type_code(self) -> typing.List[nds.name.attributes.name_lane_range_attribute_type.NameLaneRangeAttributeType]:
        return self._attribute_type_code_.raw_array

    @attribute_type_code.setter
    def attribute_type_code(self, attribute_type_code_: typing.List[nds.name.attributes.name_lane_range_attribute_type.NameLaneRangeAttributeType]) -> None:
        self._attribute_type_code_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_type_code()), attribute_type_code_)

    @property
    def condition_type(self) -> typing.List[nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection]:
        return self._condition_type_.raw_array

    @condition_type.setter
    def condition_type(self, condition_type_: typing.List[nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection]) -> None:
        self._condition_type_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type()), condition_type_)

    def init_packing_context(self, zserio_context: NameLaneRangeAttributeMapListHeader.ZserioPackingContext) -> None:
        del zserio_context

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_type_code_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._condition_type_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: NameLaneRangeAttributeMapListHeader.ZserioPackingContext, bitposition: int = 0) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition += self._attribute_type_code_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._condition_type_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_type_code_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._condition_type_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: NameLaneRangeAttributeMapListHeader.ZserioPackingContext, bitposition: int) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition = self._attribute_type_code_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._condition_type_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_type_code_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_type_code()), zserio_reader, self._num_maps_)
        self._condition_type_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type()), zserio_reader, self._num_maps_)

    def read_packed(self, zserio_context: NameLaneRangeAttributeMapListHeader.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        del zserio_context

        self._attribute_type_code_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_type_code()), zserio_reader, self._num_maps_)

        self._condition_type_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_condition_type()), zserio_reader, self._num_maps_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check array length
        if len(self._attribute_type_code_) != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong array length for field NameLaneRangeAttributeMapListHeader.attributeTypeCode: "
                                                f"{len(self._attribute_type_code_)} != {self._num_maps_}!")
        self._attribute_type_code_.write_packed(zserio_writer)

        # check array length
        if len(self._condition_type_) != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong array length for field NameLaneRangeAttributeMapListHeader.conditionType: "
                                                f"{len(self._condition_type_)} != {self._num_maps_}!")
        self._condition_type_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: NameLaneRangeAttributeMapListHeader.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        del zserio_context

        # check array length
        if len(self._attribute_type_code_) != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong array length for field NameLaneRangeAttributeMapListHeader.attributeTypeCode: "
                                                f"{len(self._attribute_type_code_)} != {self._num_maps_}!")
        self._attribute_type_code_.write_packed(zserio_writer)

        # check array length
        if len(self._condition_type_) != (self._num_maps_):
            raise zserio.PythonRuntimeException("Wrong array length for field NameLaneRangeAttributeMapListHeader.conditionType: "
                                                f"{len(self._condition_type_)} != {self._num_maps_}!")
        self._condition_type_.write_packed(zserio_writer)

    class ZserioPackingContext:
        pass

    class _ZserioElementFactory_attribute_type_code:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.attributes.name_lane_range_attribute_type.NameLaneRangeAttributeType:
            del zserio_index
            return nds.name.attributes.name_lane_range_attribute_type.NameLaneRangeAttributeType.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> zserio.array.DeltaContext:
            return zserio.array.DeltaContext()

        @staticmethod
        def create_packed(zserio_context: zserio.array.DeltaContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.attributes.name_lane_range_attribute_type.NameLaneRangeAttributeType:
            del zserio_index
            return nds.name.attributes.name_lane_range_attribute_type.NameLaneRangeAttributeType.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_condition_type:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection:
            del zserio_index
            return nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.ZserioPackingContext:
            return nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection:
            del zserio_index
            return nds.core.attributemap.condition_type_code_collection.ConditionTypeCodeCollection.from_reader_packed(zserio_context, zserio_reader)
