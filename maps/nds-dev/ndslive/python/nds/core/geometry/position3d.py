# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.core.geometry.elevation
import nds.core.geometry.latitude
import nds.core.geometry.longitude

class Position3D:
    def __init__(
            self,
            shift_xy_: nds.core.geometry.coord_shift.CoordShift,
            shift_z_: nds.core.geometry.coord_shift.CoordShift,
            longitude_: int = int(),
            latitude_: int = int(),
            elevation_: int = int()) -> None:
        self._shift_xy_ = shift_xy_
        self._shift_z_ = shift_z_
        self._longitude_ = longitude_
        self._latitude_ = latitude_
        self._elevation_ = elevation_

    @classmethod
    def from_reader(
            cls: typing.Type['Position3D'],
            zserio_reader: zserio.BitStreamReader,
            shift_xy_: nds.core.geometry.coord_shift.CoordShift,
            shift_z_: nds.core.geometry.coord_shift.CoordShift) -> 'Position3D':
        self = object.__new__(cls)
        self._shift_xy_ = shift_xy_
        self._shift_z_ = shift_z_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Position3D'],
            zserio_context: Position3D.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            shift_xy_: nds.core.geometry.coord_shift.CoordShift,
            shift_z_: nds.core.geometry.coord_shift.CoordShift) -> 'Position3D':
        self = object.__new__(cls)
        self._shift_xy_ = shift_xy_
        self._shift_z_ = shift_z_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Position3D):
            return (self._shift_xy_ == other._shift_xy_ and
                    self._shift_z_ == other._shift_z_ and
                    (self._longitude_ == other._longitude_) and
                    (self._latitude_ == other._latitude_) and
                    (self._elevation_ == other._elevation_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_xy_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_z_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._longitude_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._latitude_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._elevation_)

        return result

    @property
    def shift_xy(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_xy_

    @property
    def shift_z(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_z_

    @property
    def longitude(self) -> int:
        return self._longitude_

    @longitude.setter
    def longitude(self, longitude_: int) -> None:
        self._longitude_ = longitude_

    @property
    def latitude(self) -> int:
        return self._latitude_

    @latitude.setter
    def latitude(self, latitude_: int) -> None:
        self._latitude_ = latitude_

    @property
    def elevation(self) -> int:
        return self._elevation_

    @elevation.setter
    def elevation(self, elevation_: int) -> None:
        self._elevation_ = elevation_

    def lon(self) -> nds.core.geometry.longitude.Longitude:
        return self._longitude_ << self._shift_xy_

    def lat(self) -> nds.core.geometry.latitude.Latitude:
        return self._latitude_ << self._shift_xy_

    def ele(self) -> nds.core.geometry.elevation.Elevation:
        return self._elevation_ << self._shift_z_

    def init_packing_context(self, zserio_context: Position3D.ZserioPackingContext) -> None:
        zserio_context.longitude.init(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), self._longitude_)
        zserio_context.latitude.init(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), self._latitude_)
        zserio_context.elevation.init(zserio.array.SignedBitFieldArrayTraits(31 - self._shift_z_ + 1), self._elevation_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += (31 - self._shift_xy_) + 1
        end_bitposition += (31 - self._shift_xy_) + 1
        end_bitposition += 31 - self._shift_z_ + 1

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Position3D.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.longitude.bitsizeof(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), self._longitude_)
        end_bitposition += zserio_context.latitude.bitsizeof(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), self._latitude_)
        end_bitposition += zserio_context.elevation.bitsizeof(zserio.array.SignedBitFieldArrayTraits(31 - self._shift_z_ + 1), self._elevation_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += (31 - self._shift_xy_) + 1
        end_bitposition += (31 - self._shift_xy_) + 1
        end_bitposition += 31 - self._shift_z_ + 1

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Position3D.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.longitude.bitsizeof(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), self._longitude_)
        end_bitposition += zserio_context.latitude.bitsizeof(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), self._latitude_)
        end_bitposition += zserio_context.elevation.bitsizeof(zserio.array.SignedBitFieldArrayTraits(31 - self._shift_z_ + 1), self._elevation_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._longitude_ = zserio_reader.read_signed_bits((31 - self._shift_xy_) + 1)
        self._latitude_ = zserio_reader.read_signed_bits((31 - self._shift_xy_) + 1)
        self._elevation_ = zserio_reader.read_signed_bits(31 - self._shift_z_ + 1)

    def read_packed(self, zserio_context: Position3D.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._longitude_ = zserio_context.longitude.read(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), zserio_reader)

        self._latitude_ = zserio_context.latitude.read(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), zserio_reader)

        self._elevation_ = zserio_context.elevation.read(zserio.array.SignedBitFieldArrayTraits(31 - self._shift_z_ + 1), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_signed_bits(self._longitude_, (31 - self._shift_xy_) + 1)
        zserio_writer.write_signed_bits(self._latitude_, (31 - self._shift_xy_) + 1)
        zserio_writer.write_signed_bits(self._elevation_, 31 - self._shift_z_ + 1)

    def write_packed(self, zserio_context: Position3D.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.longitude.write(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), zserio_writer, self._longitude_)

        zserio_context.latitude.write(zserio.array.SignedBitFieldArrayTraits((31 - self._shift_xy_) + 1), zserio_writer, self._latitude_)

        zserio_context.elevation.write(zserio.array.SignedBitFieldArrayTraits(31 - self._shift_z_ + 1), zserio_writer, self._elevation_)

    class ZserioPackingContext:
        def __init__(self):
            self._longitude_ = zserio.array.DeltaContext()
            self._latitude_ = zserio.array.DeltaContext()
            self._elevation_ = zserio.array.DeltaContext()

        @property
        def longitude(self):
            return self._longitude_

        @property
        def latitude(self):
            return self._latitude_

        @property
        def elevation(self):
            return self._elevation_
