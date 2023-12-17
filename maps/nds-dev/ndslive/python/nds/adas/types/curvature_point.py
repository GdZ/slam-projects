# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.adas.types.adas_geometry_position
import nds.adas.types.curvature

class CurvaturePoint:
    def __init__(
            self,
            point_: nds.adas.types.adas_geometry_position.AdasGeometryPosition = nds.adas.types.adas_geometry_position.AdasGeometryPosition(),
            curvature_: nds.adas.types.curvature.Curvature = nds.adas.types.curvature.Curvature()) -> None:
        self._point_ = point_
        self._curvature_ = curvature_

    @classmethod
    def from_reader(
            cls: typing.Type['CurvaturePoint'],
            zserio_reader: zserio.BitStreamReader) -> 'CurvaturePoint':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['CurvaturePoint'],
            zserio_context: CurvaturePoint.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'CurvaturePoint':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, CurvaturePoint):
            return ((self._point_ == other._point_) and
                    (self._curvature_ == other._curvature_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._point_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._curvature_)

        return result

    @property
    def point(self) -> nds.adas.types.adas_geometry_position.AdasGeometryPosition:
        return self._point_

    @point.setter
    def point(self, point_: nds.adas.types.adas_geometry_position.AdasGeometryPosition) -> None:
        self._point_ = point_

    @property
    def curvature(self) -> nds.adas.types.curvature.Curvature:
        return self._curvature_

    @curvature.setter
    def curvature(self, curvature_: nds.adas.types.curvature.Curvature) -> None:
        self._curvature_ = curvature_

    def init_packing_context(self, zserio_context: CurvaturePoint.ZserioPackingContext) -> None:
        zserio_context.point.init(zserio.array.VarSizeArrayTraits(), self._point_)
        zserio_context.curvature.init(zserio.array.BitFieldArrayTraits(10), self._curvature_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._point_)
        end_bitposition += 10

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: CurvaturePoint.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.point.bitsizeof(zserio.array.VarSizeArrayTraits(), self._point_)
        end_bitposition += zserio_context.curvature.bitsizeof(zserio.array.BitFieldArrayTraits(10), self._curvature_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._point_)
        end_bitposition += 10

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: CurvaturePoint.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.point.bitsizeof(zserio.array.VarSizeArrayTraits(), self._point_)
        end_bitposition += zserio_context.curvature.bitsizeof(zserio.array.BitFieldArrayTraits(10), self._curvature_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._point_ = zserio_reader.read_varsize()
        self._curvature_ = zserio_reader.read_bits(10)

    def read_packed(self, zserio_context: CurvaturePoint.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._point_ = zserio_context.point.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._curvature_ = zserio_context.curvature.read(zserio.array.BitFieldArrayTraits(10), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._point_)
        zserio_writer.write_bits(self._curvature_, 10)

    def write_packed(self, zserio_context: CurvaturePoint.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.point.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._point_)

        zserio_context.curvature.write(zserio.array.BitFieldArrayTraits(10), zserio_writer, self._curvature_)

    class ZserioPackingContext:
        def __init__(self):
            self._point_ = zserio.array.DeltaContext()
            self._curvature_ = zserio.array.DeltaContext()

        @property
        def point(self):
            return self._point_

        @property
        def curvature(self):
            return self._curvature_
