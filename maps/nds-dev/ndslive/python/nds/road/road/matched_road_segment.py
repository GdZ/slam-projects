# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.road.reference.types.directed_road_reference

class MatchedRoadSegment:
    def __init__(
            self,
            matched_roads_: typing.List[nds.road.reference.types.directed_road_reference.DirectedRoadReference] = None) -> None:
        self._matched_roads_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_matched_roads()), matched_roads_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['MatchedRoadSegment'],
            zserio_reader: zserio.BitStreamReader) -> 'MatchedRoadSegment':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['MatchedRoadSegment'],
            zserio_context: MatchedRoadSegment.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'MatchedRoadSegment':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, MatchedRoadSegment):
            return (self._matched_roads_ == other._matched_roads_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._matched_roads_)

        return result

    @property
    def matched_roads(self) -> typing.List[nds.road.reference.types.directed_road_reference.DirectedRoadReference]:
        return self._matched_roads_.raw_array

    @matched_roads.setter
    def matched_roads(self, matched_roads_: typing.List[nds.road.reference.types.directed_road_reference.DirectedRoadReference]) -> None:
        self._matched_roads_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_matched_roads()), matched_roads_, is_auto=True)

    def init_packing_context(self, zserio_context: MatchedRoadSegment.ZserioPackingContext) -> None:
        del zserio_context

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._matched_roads_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: MatchedRoadSegment.ZserioPackingContext, bitposition: int = 0) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition += self._matched_roads_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._matched_roads_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: MatchedRoadSegment.ZserioPackingContext, bitposition: int) -> int:
        del zserio_context

        end_bitposition = bitposition
        end_bitposition = self._matched_roads_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._matched_roads_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_matched_roads()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: MatchedRoadSegment.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        del zserio_context

        self._matched_roads_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_matched_roads()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._matched_roads_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: MatchedRoadSegment.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        del zserio_context

        self._matched_roads_.write_packed(zserio_writer)

    class ZserioPackingContext:
        pass

    class _ZserioElementFactory_matched_roads:
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
