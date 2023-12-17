# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.location.location_geometry
import nds.core.location.location_segment

class RoadLocationPath:
    def __init__(
            self,
            path_geometry_: typing.Union[nds.core.location.location_geometry.LocationGeometry, None] = None,
            location_path_segments_: typing.List[nds.core.location.location_segment.LocationSegment] = None) -> None:
        self._path_geometry_ = path_geometry_
        self._location_path_segments_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_location_path_segments(self)), location_path_segments_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['RoadLocationPath'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadLocationPath':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadLocationPath'],
            zserio_context: RoadLocationPath.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadLocationPath':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadLocationPath):
            return ((self._path_geometry_ == other._path_geometry_) and
                    (self._location_path_segments_ == other._location_path_segments_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._path_geometry_)
        result = zserio.hashcode.calc_hashcode_object(result, self._location_path_segments_)

        return result

    @property
    def path_geometry(self) -> typing.Union[nds.core.location.location_geometry.LocationGeometry, None]:
        return self._path_geometry_

    @path_geometry.setter
    def path_geometry(self, path_geometry_: typing.Union[nds.core.location.location_geometry.LocationGeometry, None]) -> None:
        self._path_geometry_ = path_geometry_

    @property
    def location_path_segments(self) -> typing.List[nds.core.location.location_segment.LocationSegment]:
        return self._location_path_segments_.raw_array

    @location_path_segments.setter
    def location_path_segments(self, location_path_segments_: typing.List[nds.core.location.location_segment.LocationSegment]) -> None:
        self._location_path_segments_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_location_path_segments(self)), location_path_segments_, is_auto=True)

    def init_packing_context(self, zserio_context: RoadLocationPath.ZserioPackingContext) -> None:
        self._path_geometry_.init_packing_context(zserio_context.path_geometry)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._path_geometry_.bitsizeof(end_bitposition)
        end_bitposition += self._location_path_segments_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadLocationPath.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._path_geometry_.bitsizeof_packed(zserio_context.path_geometry, end_bitposition)
        end_bitposition += self._location_path_segments_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._path_geometry_.initialize_offsets(end_bitposition)
        end_bitposition = self._location_path_segments_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadLocationPath.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._path_geometry_.initialize_offsets_packed(zserio_context.path_geometry, end_bitposition)
        end_bitposition = self._location_path_segments_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._path_geometry_ = nds.core.location.location_geometry.LocationGeometry.from_reader(zserio_reader)
        self._location_path_segments_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_location_path_segments(self)), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: RoadLocationPath.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._path_geometry_ = nds.core.location.location_geometry.LocationGeometry.from_reader_packed(zserio_context.path_geometry, zserio_reader)

        self._location_path_segments_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_location_path_segments(self)), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._path_geometry_.write(zserio_writer)
        self._location_path_segments_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: RoadLocationPath.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._path_geometry_.write_packed(zserio_context.path_geometry, zserio_writer)

        self._location_path_segments_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._path_geometry_ = nds.core.location.location_geometry.LocationGeometry.ZserioPackingContext()

        @property
        def path_geometry(self):
            return self._path_geometry_

    class _ZserioElementFactory_location_path_segments:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.location.location_segment.LocationSegment:
            del zserio_index
            return nds.core.location.location_segment.LocationSegment.from_reader(zserio_reader, self._owner._path_geometry_)

        @staticmethod
        def create_packing_context() -> nds.core.location.location_segment.LocationSegment.ZserioPackingContext:
            return nds.core.location.location_segment.LocationSegment.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.core.location.location_segment.LocationSegment.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.location.location_segment.LocationSegment:
            del zserio_index
            return nds.core.location.location_segment.LocationSegment.from_reader_packed(zserio_context, zserio_reader, self._owner._path_geometry_)
