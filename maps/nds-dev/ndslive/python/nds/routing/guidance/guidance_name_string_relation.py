# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routing.guidance.guidance_name_string_relation_type

class GuidanceNameStringRelation:
    def __init__(
            self,
            num_names_: int,
            relation_type_: typing.Union[nds.routing.guidance.guidance_name_string_relation_type.GuidanceNameStringRelationType, None] = None,
            related_guidance_name_string_index_: int = int()) -> None:
        self._num_names_ = num_names_
        self._relation_type_ = relation_type_
        self._related_guidance_name_string_index_ = related_guidance_name_string_index_

    @classmethod
    def from_reader(
            cls: typing.Type['GuidanceNameStringRelation'],
            zserio_reader: zserio.BitStreamReader,
            num_names_: int) -> 'GuidanceNameStringRelation':
        self = object.__new__(cls)
        self._num_names_ = num_names_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['GuidanceNameStringRelation'],
            zserio_context: GuidanceNameStringRelation.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            num_names_: int) -> 'GuidanceNameStringRelation':
        self = object.__new__(cls)
        self._num_names_ = num_names_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, GuidanceNameStringRelation):
            return (self._num_names_ == other._num_names_ and
                    (self._relation_type_ == other._relation_type_) and
                    (self._related_guidance_name_string_index_ == other._related_guidance_name_string_index_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_names_)
        result = zserio.hashcode.calc_hashcode_object(result, self._relation_type_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._related_guidance_name_string_index_)

        return result

    @property
    def num_names(self) -> int:
        return self._num_names_

    @property
    def relation_type(self) -> typing.Union[nds.routing.guidance.guidance_name_string_relation_type.GuidanceNameStringRelationType, None]:
        return self._relation_type_

    @relation_type.setter
    def relation_type(self, relation_type_: typing.Union[nds.routing.guidance.guidance_name_string_relation_type.GuidanceNameStringRelationType, None]) -> None:
        self._relation_type_ = relation_type_

    @property
    def related_guidance_name_string_index(self) -> int:
        return self._related_guidance_name_string_index_

    @related_guidance_name_string_index.setter
    def related_guidance_name_string_index(self, related_guidance_name_string_index_: int) -> None:
        self._related_guidance_name_string_index_ = related_guidance_name_string_index_

    def init_packing_context(self, zserio_context: GuidanceNameStringRelation.ZserioPackingContext) -> None:
        self._relation_type_.init_packing_context(zserio_context.relation_type)
        zserio_context.related_guidance_name_string_index.init(zserio.array.BitFieldArrayTraits(8), self._related_guidance_name_string_index_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._relation_type_.bitsizeof(end_bitposition)
        end_bitposition += 8

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: GuidanceNameStringRelation.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._relation_type_.bitsizeof_packed(zserio_context.relation_type, end_bitposition)
        end_bitposition += zserio_context.related_guidance_name_string_index.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._related_guidance_name_string_index_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._relation_type_.initialize_offsets(end_bitposition)
        end_bitposition += 8

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: GuidanceNameStringRelation.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._relation_type_.initialize_offsets_packed(zserio_context.relation_type, end_bitposition)
        end_bitposition += zserio_context.related_guidance_name_string_index.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._related_guidance_name_string_index_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._relation_type_ = nds.routing.guidance.guidance_name_string_relation_type.GuidanceNameStringRelationType.from_reader(zserio_reader)

        self._related_guidance_name_string_index_ = zserio_reader.read_bits(8)
        # check constraint
        if not (self._related_guidance_name_string_index_ < self._num_names_):
            raise zserio.PythonRuntimeException("Constraint violated for field GuidanceNameStringRelation.relatedGuidanceNameStringIndex!")

    def read_packed(self, zserio_context: GuidanceNameStringRelation.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._relation_type_ = nds.routing.guidance.guidance_name_string_relation_type.GuidanceNameStringRelationType.from_reader_packed(zserio_context.relation_type, zserio_reader)

        self._related_guidance_name_string_index_ = zserio_context.related_guidance_name_string_index.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
        # check constraint
        if not (self._related_guidance_name_string_index_ < self._num_names_):
            raise zserio.PythonRuntimeException("Constraint violated for field GuidanceNameStringRelation.relatedGuidanceNameStringIndex!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._relation_type_.write(zserio_writer)

        # check constraint
        if not (self._related_guidance_name_string_index_ < self._num_names_):
            raise zserio.PythonRuntimeException("Constraint violated for field GuidanceNameStringRelation.relatedGuidanceNameStringIndex!")
        zserio_writer.write_bits(self._related_guidance_name_string_index_, 8)

    def write_packed(self, zserio_context: GuidanceNameStringRelation.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._relation_type_.write_packed(zserio_context.relation_type, zserio_writer)

        # check constraint
        if not (self._related_guidance_name_string_index_ < self._num_names_):
            raise zserio.PythonRuntimeException("Constraint violated for field GuidanceNameStringRelation.relatedGuidanceNameStringIndex!")
        zserio_context.related_guidance_name_string_index.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._related_guidance_name_string_index_)

    class ZserioPackingContext:
        def __init__(self):
            self._relation_type_ = zserio.array.DeltaContext()
            self._related_guidance_name_string_index_ = zserio.array.DeltaContext()

        @property
        def relation_type(self):
            return self._relation_type_

        @property
        def related_guidance_name_string_index(self):
            return self._related_guidance_name_string_index_
