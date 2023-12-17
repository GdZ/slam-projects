# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.instructions.instantiations.instructions_lane_transition_full_attribute

class InstructionsLaneTransitionAttributeSet:
    def __init__(
            self,
            num_entries_: int = int(),
            attributes_: typing.List[nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute] = None) -> None:
        self._num_entries_ = num_entries_
        self._attributes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attributes()), attributes_)

    @classmethod
    def from_reader(
            cls: typing.Type['InstructionsLaneTransitionAttributeSet'],
            zserio_reader: zserio.BitStreamReader) -> 'InstructionsLaneTransitionAttributeSet':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['InstructionsLaneTransitionAttributeSet'],
            zserio_context: InstructionsLaneTransitionAttributeSet.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'InstructionsLaneTransitionAttributeSet':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, InstructionsLaneTransitionAttributeSet):
            return ((self._num_entries_ == other._num_entries_) and
                    (self._attributes_ == other._attributes_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_entries_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attributes_)

        return result

    @property
    def num_entries(self) -> int:
        return self._num_entries_

    @num_entries.setter
    def num_entries(self, num_entries_: int) -> None:
        self._num_entries_ = num_entries_

    @property
    def attributes(self) -> typing.List[nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute]:
        return self._attributes_.raw_array

    @attributes.setter
    def attributes(self, attributes_: typing.List[nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute]) -> None:
        self._attributes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attributes()), attributes_)

    def init_packing_context(self, zserio_context: InstructionsLaneTransitionAttributeSet.ZserioPackingContext) -> None:
        zserio_context.num_entries.init(zserio.array.VarSizeArrayTraits(), self._num_entries_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_entries_)
        end_bitposition += self._attributes_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: InstructionsLaneTransitionAttributeSet.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_entries.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_entries_)
        end_bitposition += self._attributes_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_entries_)
        end_bitposition = self._attributes_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: InstructionsLaneTransitionAttributeSet.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_entries.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_entries_)
        end_bitposition = self._attributes_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_entries_ = zserio_reader.read_varsize()
        self._attributes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attributes()), zserio_reader, self._num_entries_)

    def read_packed(self, zserio_context: InstructionsLaneTransitionAttributeSet.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_entries_ = zserio_context.num_entries.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._attributes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attributes()), zserio_reader, self._num_entries_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_entries_)

        # check array length
        if len(self._attributes_) != (self._num_entries_):
            raise zserio.PythonRuntimeException("Wrong array length for field InstructionsLaneTransitionAttributeSet.attributes: "
                                                f"{len(self._attributes_)} != {self._num_entries_}!")
        self._attributes_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: InstructionsLaneTransitionAttributeSet.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_entries.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_entries_)

        # check array length
        if len(self._attributes_) != (self._num_entries_):
            raise zserio.PythonRuntimeException("Wrong array length for field InstructionsLaneTransitionAttributeSet.attributes: "
                                                f"{len(self._attributes_)} != {self._num_entries_}!")
        self._attributes_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_entries_ = zserio.array.DeltaContext()

        @property
        def num_entries(self):
            return self._num_entries_

    class _ZserioElementFactory_attributes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute:
            del zserio_index
            return nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute.ZserioPackingContext:
            return nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute:
            del zserio_index
            return nds.instructions.instantiations.instructions_lane_transition_full_attribute.InstructionsLaneTransitionFullAttribute.from_reader_packed(zserio_context, zserio_reader)
