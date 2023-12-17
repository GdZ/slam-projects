# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.location.road_location_id
import nds.smart.path.smart_layer_location_id_path_segment
import nds.smart.types.smart_layer_header

class SmartLayerLocationIdPath:
    def __init__(
            self,
            header_: typing.Union[nds.smart.types.smart_layer_header.SmartLayerHeader, None] = None,
            location_id_: typing.Union[nds.core.location.road_location_id.RoadLocationId, None] = None,
            segments_: typing.List[nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment] = None) -> None:
        self._header_ = header_
        self._location_id_ = location_id_
        self._segments_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_segments(self)), segments_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerLocationIdPath'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerLocationIdPath':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SmartLayerLocationIdPath'],
            zserio_context: SmartLayerLocationIdPath.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerLocationIdPath':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerLocationIdPath):
            return ((self._header_ == other._header_) and
                    (self._location_id_ == other._location_id_) and
                    (self._segments_ == other._segments_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._header_)
        result = zserio.hashcode.calc_hashcode_object(result, self._location_id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._segments_)

        return result

    @property
    def header(self) -> typing.Union[nds.smart.types.smart_layer_header.SmartLayerHeader, None]:
        return self._header_

    @header.setter
    def header(self, header_: typing.Union[nds.smart.types.smart_layer_header.SmartLayerHeader, None]) -> None:
        self._header_ = header_

    @property
    def location_id(self) -> typing.Union[nds.core.location.road_location_id.RoadLocationId, None]:
        return self._location_id_

    @location_id.setter
    def location_id(self, location_id_: typing.Union[nds.core.location.road_location_id.RoadLocationId, None]) -> None:
        self._location_id_ = location_id_

    @property
    def segments(self) -> typing.List[nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment]:
        return self._segments_.raw_array

    @segments.setter
    def segments(self, segments_: typing.List[nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment]) -> None:
        self._segments_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_segments(self)), segments_, is_auto=True)

    def init_packing_context(self, zserio_context: SmartLayerLocationIdPath.ZserioPackingContext) -> None:
        self._header_.init_packing_context(zserio_context.header)
        self._location_id_.init_packing_context(zserio_context.location_id)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._header_.bitsizeof(end_bitposition)
        end_bitposition += self._location_id_.bitsizeof(end_bitposition)
        end_bitposition += self._segments_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SmartLayerLocationIdPath.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._header_.bitsizeof_packed(zserio_context.header, end_bitposition)
        end_bitposition += self._location_id_.bitsizeof_packed(zserio_context.location_id, end_bitposition)
        end_bitposition += self._segments_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._header_.initialize_offsets(end_bitposition)
        end_bitposition = self._location_id_.initialize_offsets(end_bitposition)
        end_bitposition = self._segments_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SmartLayerLocationIdPath.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._header_.initialize_offsets_packed(zserio_context.header, end_bitposition)
        end_bitposition = self._location_id_.initialize_offsets_packed(zserio_context.location_id, end_bitposition)
        end_bitposition = self._segments_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._header_ = nds.smart.types.smart_layer_header.SmartLayerHeader.from_reader(zserio_reader)
        self._location_id_ = nds.core.location.road_location_id.RoadLocationId.from_reader(zserio_reader)
        self._segments_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_segments(self)), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: SmartLayerLocationIdPath.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._header_ = nds.smart.types.smart_layer_header.SmartLayerHeader.from_reader_packed(zserio_context.header, zserio_reader)

        self._location_id_ = nds.core.location.road_location_id.RoadLocationId.from_reader_packed(zserio_context.location_id, zserio_reader)

        self._segments_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_segments(self)), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._header_.write(zserio_writer)
        self._location_id_.write(zserio_writer)
        self._segments_.write(zserio_writer)

    def write_packed(self, zserio_context: SmartLayerLocationIdPath.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._header_.write_packed(zserio_context.header, zserio_writer)

        self._location_id_.write_packed(zserio_context.location_id, zserio_writer)

        self._segments_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._header_ = nds.smart.types.smart_layer_header.SmartLayerHeader.ZserioPackingContext()
            self._location_id_ = nds.core.location.road_location_id.RoadLocationId.ZserioPackingContext()

        @property
        def header(self):
            return self._header_

        @property
        def location_id(self):
            return self._location_id_

    class _ZserioElementFactory_segments:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment:
            del zserio_index
            return nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment.from_reader(zserio_reader, self._owner._header_)

        @staticmethod
        def create_packing_context() -> nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment.ZserioPackingContext:
            return nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment:
            del zserio_index
            return nds.smart.path.smart_layer_location_id_path_segment.SmartLayerLocationIdPathSegment.from_reader_packed(zserio_context, zserio_reader, self._owner._header_)