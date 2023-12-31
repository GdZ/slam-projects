# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.bounding_box2d
import nds.core.geometry.bounding_polygon2d
import nds.core.geometry.coord_shift

class SpatialExtent:
    def __init__(
            self,
            bounding_box_: typing.Union[nds.core.geometry.bounding_box2d.BoundingBox2D, None] = None,
            bounding_polygon_: typing.Optional[nds.core.geometry.bounding_polygon2d.BoundingPolygon2D] = None) -> None:
        self._bounding_box_ = bounding_box_
        self._bounding_polygon_ = bounding_polygon_

    @classmethod
    def from_reader(
            cls: typing.Type['SpatialExtent'],
            zserio_reader: zserio.BitStreamReader) -> 'SpatialExtent':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SpatialExtent'],
            zserio_context: SpatialExtent.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SpatialExtent':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SpatialExtent):
            return ((self._bounding_box_ == other._bounding_box_) and
                    (not other.is_bounding_polygon_used() if not self.is_bounding_polygon_used() else (self._bounding_polygon_ == other._bounding_polygon_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._bounding_box_)
        if self.is_bounding_polygon_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._bounding_polygon_)

        return result

    @property
    def bounding_box(self) -> typing.Union[nds.core.geometry.bounding_box2d.BoundingBox2D, None]:
        return self._bounding_box_

    @bounding_box.setter
    def bounding_box(self, bounding_box_: typing.Union[nds.core.geometry.bounding_box2d.BoundingBox2D, None]) -> None:
        self._bounding_box_ = bounding_box_

    @property
    def bounding_polygon(self) -> typing.Optional[nds.core.geometry.bounding_polygon2d.BoundingPolygon2D]:
        return self._bounding_polygon_

    @bounding_polygon.setter
    def bounding_polygon(self, bounding_polygon_: typing.Optional[nds.core.geometry.bounding_polygon2d.BoundingPolygon2D]) -> None:
        self._bounding_polygon_ = bounding_polygon_

    def is_bounding_polygon_used(self) -> bool:
        return self.is_bounding_polygon_set()

    def is_bounding_polygon_set(self) -> bool:
        return not self._bounding_polygon_ is None

    def reset_bounding_polygon(self) -> None:
        self._bounding_polygon_ = None

    def init_packing_context(self, zserio_context: SpatialExtent.ZserioPackingContext) -> None:
        self._bounding_box_.init_packing_context(zserio_context.bounding_box)
        if self.is_bounding_polygon_used():
            self._bounding_polygon_.init_packing_context(zserio_context.bounding_polygon)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._bounding_box_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_bounding_polygon_used():
            end_bitposition += self._bounding_polygon_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SpatialExtent.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._bounding_box_.bitsizeof_packed(zserio_context.bounding_box, end_bitposition)
        end_bitposition += 1
        if self.is_bounding_polygon_used():
            end_bitposition += self._bounding_polygon_.bitsizeof_packed(zserio_context.bounding_polygon, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._bounding_box_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_bounding_polygon_used():
            end_bitposition = self._bounding_polygon_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SpatialExtent.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._bounding_box_.initialize_offsets_packed(zserio_context.bounding_box, end_bitposition)
        end_bitposition += 1
        if self.is_bounding_polygon_used():
            end_bitposition = self._bounding_polygon_.initialize_offsets_packed(zserio_context.bounding_polygon, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._bounding_box_ = nds.core.geometry.bounding_box2d.BoundingBox2D.from_reader(zserio_reader)
        if zserio_reader.read_bool():
            self._bounding_polygon_ = nds.core.geometry.bounding_polygon2d.BoundingPolygon2D.from_reader(zserio_reader, 0)
        else:
            self._bounding_polygon_ = None

    def read_packed(self, zserio_context: SpatialExtent.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._bounding_box_ = nds.core.geometry.bounding_box2d.BoundingBox2D.from_reader_packed(zserio_context.bounding_box, zserio_reader)

        if zserio_reader.read_bool():
            self._bounding_polygon_ = nds.core.geometry.bounding_polygon2d.BoundingPolygon2D.from_reader_packed(zserio_context.bounding_polygon, zserio_reader, 0)
        else:
            self._bounding_polygon_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._bounding_box_.write(zserio_writer)

        if self.is_bounding_polygon_used():
            zserio_writer.write_bool(True)
            # check parameters
            if self._bounding_polygon_.shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field SpatialExtent.boundingPolygon: "
                                                    f"{self._bounding_polygon_.shift} != {0}!")
            self._bounding_polygon_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: SpatialExtent.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._bounding_box_.write_packed(zserio_context.bounding_box, zserio_writer)

        if self.is_bounding_polygon_used():
            zserio_writer.write_bool(True)
            # check parameters
            if self._bounding_polygon_.shift != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field SpatialExtent.boundingPolygon: "
                                                    f"{self._bounding_polygon_.shift} != {0}!")
            self._bounding_polygon_.write_packed(zserio_context.bounding_polygon, zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._bounding_box_ = nds.core.geometry.bounding_box2d.BoundingBox2D.ZserioPackingContext()
            self._bounding_polygon_ = nds.core.geometry.bounding_polygon2d.BoundingPolygon2D.ZserioPackingContext()

        @property
        def bounding_box(self):
            return self._bounding_box_

        @property
        def bounding_polygon(self):
            return self._bounding_polygon_
