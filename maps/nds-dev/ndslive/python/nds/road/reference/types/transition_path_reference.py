# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.road.reference.types.directed_road_reference

class TransitionPathReference:
    def __init__(
            self,
            num_roads_: int = int(),
            roads_: typing.List[nds.road.reference.types.directed_road_reference.DirectedRoadReference] = None) -> None:
        self._num_roads_ = num_roads_
        self._roads_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_roads()), roads_)

    @classmethod
    def from_reader(
            cls: typing.Type['TransitionPathReference'],
            zserio_reader: zserio.BitStreamReader) -> 'TransitionPathReference':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['TransitionPathReference'],
            zserio_context: TransitionPathReference.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'TransitionPathReference':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TransitionPathReference):
            return ((self._num_roads_ == other._num_roads_) and
                    (self._roads_ == other._roads_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_roads_)
        result = zserio.hashcode.calc_hashcode_object(result, self._roads_)

        return result

    @property
    def num_roads(self) -> int:
        return self._num_roads_

    @num_roads.setter
    def num_roads(self, num_roads_: int) -> None:
        self._num_roads_ = num_roads_

    @property
    def roads(self) -> typing.List[nds.road.reference.types.directed_road_reference.DirectedRoadReference]:
        return self._roads_.raw_array

    @roads.setter
    def roads(self, roads_: typing.List[nds.road.reference.types.directed_road_reference.DirectedRoadReference]) -> None:
        self._roads_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_roads()), roads_)

    def init_packing_context(self, zserio_context: TransitionPathReference.ZserioPackingContext) -> None:
        zserio_context.num_roads.init(zserio.array.BitFieldArrayTraits(8), self._num_roads_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += self._roads_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: TransitionPathReference.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_roads.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_roads_)
        end_bitposition += self._roads_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition = self._roads_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: TransitionPathReference.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_roads.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_roads_)
        end_bitposition = self._roads_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_roads_ = zserio_reader.read_bits(8)
        self._roads_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_roads()), zserio_reader, self._num_roads_)

    def read_packed(self, zserio_context: TransitionPathReference.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_roads_ = zserio_context.num_roads.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._roads_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_roads()), zserio_reader, self._num_roads_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._num_roads_, 8)

        # check array length
        if len(self._roads_) != (self._num_roads_):
            raise zserio.PythonRuntimeException("Wrong array length for field TransitionPathReference.roads: "
                                                f"{len(self._roads_)} != {self._num_roads_}!")
        self._roads_.write(zserio_writer)

    def write_packed(self, zserio_context: TransitionPathReference.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_roads.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_roads_)

        # check array length
        if len(self._roads_) != (self._num_roads_):
            raise zserio.PythonRuntimeException("Wrong array length for field TransitionPathReference.roads: "
                                                f"{len(self._roads_)} != {self._num_roads_}!")
        self._roads_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_roads_ = zserio.array.DeltaContext()

        @property
        def num_roads(self):
            return self._num_roads_

    class _ZserioElementFactory_roads:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.road.reference.types.directed_road_reference.DirectedRoadReference:
            del zserio_index
            return nds.road.reference.types.directed_road_reference.DirectedRoadReference.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.road.reference.types.directed_road_reference.DirectedRoadReference.ZserioPackingContext:
            return nds.road.reference.types.directed_road_reference.DirectedRoadReference.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.road.reference.types.directed_road_reference.DirectedRoadReference.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.road.reference.types.directed_road_reference.DirectedRoadReference:
            del zserio_index
            return nds.road.reference.types.directed_road_reference.DirectedRoadReference.from_reader_packed(zserio_context, zserio_reader)