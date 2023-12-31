# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map

class RulesIndirectLanePositionAttributeSetList:
    def __init__(
            self,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift,
            num_attribute_sets_: int = int(),
            sets_: typing.List[nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap] = None) -> None:
        self._coord_shift_ = coord_shift_
        self._num_attribute_sets_ = num_attribute_sets_
        self._sets_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sets(self)), sets_)

    @classmethod
    def from_reader(
            cls: typing.Type['RulesIndirectLanePositionAttributeSetList'],
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RulesIndirectLanePositionAttributeSetList':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RulesIndirectLanePositionAttributeSetList'],
            zserio_context: RulesIndirectLanePositionAttributeSetList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RulesIndirectLanePositionAttributeSetList':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RulesIndirectLanePositionAttributeSetList):
            return (self._coord_shift_ == other._coord_shift_ and
                    (self._num_attribute_sets_ == other._num_attribute_sets_) and
                    (self._sets_ == other._sets_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_attribute_sets_)
        result = zserio.hashcode.calc_hashcode_object(result, self._sets_)

        return result

    @property
    def coord_shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_

    @property
    def num_attribute_sets(self) -> int:
        return self._num_attribute_sets_

    @num_attribute_sets.setter
    def num_attribute_sets(self, num_attribute_sets_: int) -> None:
        self._num_attribute_sets_ = num_attribute_sets_

    @property
    def sets(self) -> typing.List[nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap]:
        return self._sets_.raw_array

    @sets.setter
    def sets(self, sets_: typing.List[nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap]) -> None:
        self._sets_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sets(self)), sets_)

    def init_packing_context(self, zserio_context: RulesIndirectLanePositionAttributeSetList.ZserioPackingContext) -> None:
        zserio_context.num_attribute_sets.init(zserio.array.VarSizeArrayTraits(), self._num_attribute_sets_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_attribute_sets_)
        end_bitposition += self._sets_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RulesIndirectLanePositionAttributeSetList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_attribute_sets.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_attribute_sets_)
        end_bitposition += self._sets_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_attribute_sets_)
        end_bitposition = self._sets_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RulesIndirectLanePositionAttributeSetList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_attribute_sets.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_attribute_sets_)
        end_bitposition = self._sets_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_attribute_sets_ = zserio_reader.read_varsize()
        self._sets_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sets(self)), zserio_reader, self._num_attribute_sets_)

    def read_packed(self, zserio_context: RulesIndirectLanePositionAttributeSetList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_attribute_sets_ = zserio_context.num_attribute_sets.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._sets_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_sets(self)), zserio_reader, self._num_attribute_sets_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_attribute_sets_)

        # check array length
        if len(self._sets_) != (self._num_attribute_sets_):
            raise zserio.PythonRuntimeException("Wrong array length for field RulesIndirectLanePositionAttributeSetList.sets: "
                                                f"{len(self._sets_)} != {self._num_attribute_sets_}!")
        self._sets_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: RulesIndirectLanePositionAttributeSetList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_attribute_sets.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_attribute_sets_)

        # check array length
        if len(self._sets_) != (self._num_attribute_sets_):
            raise zserio.PythonRuntimeException("Wrong array length for field RulesIndirectLanePositionAttributeSetList.sets: "
                                                f"{len(self._sets_)} != {self._num_attribute_sets_}!")
        self._sets_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_attribute_sets_ = zserio.array.DeltaContext()

        @property
        def num_attribute_sets(self):
            return self._num_attribute_sets_

    class _ZserioElementFactory_sets:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap:
            del zserio_index
            return nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap.from_reader(zserio_reader, self._owner._coord_shift_)

        @staticmethod
        def create_packing_context() -> nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap.ZserioPackingContext:
            return nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap:
            del zserio_index
            return nds.rules.instantiations.rules_indirect_lane_position_attribute_set_map.RulesIndirectLanePositionAttributeSetMap.from_reader_packed(zserio_context, zserio_reader, self._owner._coord_shift_)
