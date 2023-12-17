# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.lane.reference.types.lane_group_id
import nds.lane.reference.types.lane_group_range_validity

class RegionLaneGroupRelationList:
    def __init__(
            self,
            num_relations_: int = int(),
            lane_group_ids_: typing.List[nds.lane.reference.types.lane_group_id.LaneGroupId] = None,
            lane_group_range_validity_: typing.List[nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity] = None) -> None:
        self._num_relations_ = num_relations_
        self._lane_group_ids_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_ids()), lane_group_ids_)
        self._lane_group_range_validity_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_range_validity()), lane_group_range_validity_)

    @classmethod
    def from_reader(
            cls: typing.Type['RegionLaneGroupRelationList'],
            zserio_reader: zserio.BitStreamReader) -> 'RegionLaneGroupRelationList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RegionLaneGroupRelationList'],
            zserio_context: RegionLaneGroupRelationList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RegionLaneGroupRelationList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RegionLaneGroupRelationList):
            return ((self._num_relations_ == other._num_relations_) and
                    (self._lane_group_ids_ == other._lane_group_ids_) and
                    (self._lane_group_range_validity_ == other._lane_group_range_validity_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_relations_)
        result = zserio.hashcode.calc_hashcode_object(result, self._lane_group_ids_)
        result = zserio.hashcode.calc_hashcode_object(result, self._lane_group_range_validity_)

        return result

    @property
    def num_relations(self) -> int:
        return self._num_relations_

    @num_relations.setter
    def num_relations(self, num_relations_: int) -> None:
        self._num_relations_ = num_relations_

    @property
    def lane_group_ids(self) -> typing.List[nds.lane.reference.types.lane_group_id.LaneGroupId]:
        return self._lane_group_ids_.raw_array

    @lane_group_ids.setter
    def lane_group_ids(self, lane_group_ids_: typing.List[nds.lane.reference.types.lane_group_id.LaneGroupId]) -> None:
        self._lane_group_ids_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_ids()), lane_group_ids_)

    @property
    def lane_group_range_validity(self) -> typing.List[nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity]:
        return self._lane_group_range_validity_.raw_array

    @lane_group_range_validity.setter
    def lane_group_range_validity(self, lane_group_range_validity_: typing.List[nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity]) -> None:
        self._lane_group_range_validity_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_range_validity()), lane_group_range_validity_)

    def init_packing_context(self, zserio_context: RegionLaneGroupRelationList.ZserioPackingContext) -> None:
        zserio_context.num_relations.init(zserio.array.VarSizeArrayTraits(), self._num_relations_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_relations_)
        end_bitposition += self._lane_group_ids_.bitsizeof(end_bitposition)
        end_bitposition += self._lane_group_range_validity_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RegionLaneGroupRelationList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_relations.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_relations_)
        end_bitposition += self._lane_group_ids_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._lane_group_range_validity_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_relations_)
        end_bitposition = self._lane_group_ids_.initialize_offsets(end_bitposition)
        end_bitposition = self._lane_group_range_validity_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RegionLaneGroupRelationList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_relations.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_relations_)
        end_bitposition = self._lane_group_ids_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._lane_group_range_validity_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_relations_ = zserio_reader.read_varsize()
        self._lane_group_ids_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_ids()), zserio_reader, self._num_relations_)
        self._lane_group_range_validity_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_range_validity()), zserio_reader, self._num_relations_)

    def read_packed(self, zserio_context: RegionLaneGroupRelationList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_relations_ = zserio_context.num_relations.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._lane_group_ids_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_ids()), zserio_reader, self._num_relations_)

        self._lane_group_range_validity_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_lane_group_range_validity()), zserio_reader, self._num_relations_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_relations_)

        # check array length
        if len(self._lane_group_ids_) != (self._num_relations_):
            raise zserio.PythonRuntimeException("Wrong array length for field RegionLaneGroupRelationList.laneGroupIds: "
                                                f"{len(self._lane_group_ids_)} != {self._num_relations_}!")
        self._lane_group_ids_.write(zserio_writer)

        # check array length
        if len(self._lane_group_range_validity_) != (self._num_relations_):
            raise zserio.PythonRuntimeException("Wrong array length for field RegionLaneGroupRelationList.laneGroupRangeValidity: "
                                                f"{len(self._lane_group_range_validity_)} != {self._num_relations_}!")
        self._lane_group_range_validity_.write(zserio_writer)

    def write_packed(self, zserio_context: RegionLaneGroupRelationList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_relations.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_relations_)

        # check array length
        if len(self._lane_group_ids_) != (self._num_relations_):
            raise zserio.PythonRuntimeException("Wrong array length for field RegionLaneGroupRelationList.laneGroupIds: "
                                                f"{len(self._lane_group_ids_)} != {self._num_relations_}!")
        self._lane_group_ids_.write_packed(zserio_writer)

        # check array length
        if len(self._lane_group_range_validity_) != (self._num_relations_):
            raise zserio.PythonRuntimeException("Wrong array length for field RegionLaneGroupRelationList.laneGroupRangeValidity: "
                                                f"{len(self._lane_group_range_validity_)} != {self._num_relations_}!")
        self._lane_group_range_validity_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_relations_ = zserio.array.DeltaContext()

        @property
        def num_relations(self):
            return self._num_relations_

    class _ZserioElementFactory_lane_group_ids:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_group_id.LaneGroupId:
            del zserio_index
            return nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.lane.reference.types.lane_group_id.LaneGroupId.ZserioPackingContext:
            return nds.lane.reference.types.lane_group_id.LaneGroupId.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.lane.reference.types.lane_group_id.LaneGroupId.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_group_id.LaneGroupId:
            del zserio_index
            return nds.lane.reference.types.lane_group_id.LaneGroupId.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_lane_group_range_validity:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity:
            del zserio_index
            return nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity.from_reader(zserio_reader, 0)

        @staticmethod
        def create_packing_context() -> nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity.ZserioPackingContext:
            return nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity:
            del zserio_index
            return nds.lane.reference.types.lane_group_range_validity.LaneGroupRangeValidity.from_reader_packed(zserio_context, zserio_reader, 0)