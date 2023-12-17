# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.adas.types.adas_geometry_position
import nds.adas.types.comfortable_speed

class ComfortableSpeedPoint:
    def __init__(
            self,
            position_: nds.adas.types.adas_geometry_position.AdasGeometryPosition = nds.adas.types.adas_geometry_position.AdasGeometryPosition(),
            comfortable_speed_: nds.adas.types.comfortable_speed.ComfortableSpeed = nds.adas.types.comfortable_speed.ComfortableSpeed()) -> None:
        self._position_ = position_
        self._comfortable_speed_ = comfortable_speed_

    @classmethod
    def from_reader(
            cls: typing.Type['ComfortableSpeedPoint'],
            zserio_reader: zserio.BitStreamReader) -> 'ComfortableSpeedPoint':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ComfortableSpeedPoint'],
            zserio_context: ComfortableSpeedPoint.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ComfortableSpeedPoint':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ComfortableSpeedPoint):
            return ((self._position_ == other._position_) and
                    (self._comfortable_speed_ == other._comfortable_speed_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._position_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._comfortable_speed_)

        return result

    @property
    def position(self) -> nds.adas.types.adas_geometry_position.AdasGeometryPosition:
        return self._position_

    @position.setter
    def position(self, position_: nds.adas.types.adas_geometry_position.AdasGeometryPosition) -> None:
        self._position_ = position_

    @property
    def comfortable_speed(self) -> nds.adas.types.comfortable_speed.ComfortableSpeed:
        return self._comfortable_speed_

    @comfortable_speed.setter
    def comfortable_speed(self, comfortable_speed_: nds.adas.types.comfortable_speed.ComfortableSpeed) -> None:
        self._comfortable_speed_ = comfortable_speed_

    def init_packing_context(self, zserio_context: ComfortableSpeedPoint.ZserioPackingContext) -> None:
        zserio_context.position.init(zserio.array.VarSizeArrayTraits(), self._position_)
        zserio_context.comfortable_speed.init(zserio.array.BitFieldArrayTraits(8), self._comfortable_speed_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._position_)
        end_bitposition += 8

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ComfortableSpeedPoint.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.position.bitsizeof(zserio.array.VarSizeArrayTraits(), self._position_)
        end_bitposition += zserio_context.comfortable_speed.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._comfortable_speed_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._position_)
        end_bitposition += 8

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ComfortableSpeedPoint.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.position.bitsizeof(zserio.array.VarSizeArrayTraits(), self._position_)
        end_bitposition += zserio_context.comfortable_speed.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._comfortable_speed_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = zserio_reader.read_varsize()
        self._comfortable_speed_ = zserio_reader.read_bits(8)

    def read_packed(self, zserio_context: ComfortableSpeedPoint.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = zserio_context.position.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._comfortable_speed_ = zserio_context.comfortable_speed.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._position_)
        zserio_writer.write_bits(self._comfortable_speed_, 8)

    def write_packed(self, zserio_context: ComfortableSpeedPoint.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.position.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._position_)

        zserio_context.comfortable_speed.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._comfortable_speed_)

    class ZserioPackingContext:
        def __init__(self):
            self._position_ = zserio.array.DeltaContext()
            self._comfortable_speed_ = zserio.array.DeltaContext()

        @property
        def position(self):
            return self._position_

        @property
        def comfortable_speed(self):
            return self._comfortable_speed_