# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.adas.types.comfortable_speed_point

class ComfortableSpeedPointList:
    def __init__(
            self,
            num_of_values_: int = int(),
            speed_points_: typing.List[nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint] = None) -> None:
        self._num_of_values_ = num_of_values_
        self._speed_points_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_speed_points()), speed_points_)

    @classmethod
    def from_reader(
            cls: typing.Type['ComfortableSpeedPointList'],
            zserio_reader: zserio.BitStreamReader) -> 'ComfortableSpeedPointList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ComfortableSpeedPointList'],
            zserio_context: ComfortableSpeedPointList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ComfortableSpeedPointList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ComfortableSpeedPointList):
            return ((self._num_of_values_ == other._num_of_values_) and
                    (self._speed_points_ == other._speed_points_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_of_values_)
        result = zserio.hashcode.calc_hashcode_object(result, self._speed_points_)

        return result

    @property
    def num_of_values(self) -> int:
        return self._num_of_values_

    @num_of_values.setter
    def num_of_values(self, num_of_values_: int) -> None:
        self._num_of_values_ = num_of_values_

    @property
    def speed_points(self) -> typing.List[nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint]:
        return self._speed_points_.raw_array

    @speed_points.setter
    def speed_points(self, speed_points_: typing.List[nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint]) -> None:
        self._speed_points_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_speed_points()), speed_points_)

    def init_packing_context(self, zserio_context: ComfortableSpeedPointList.ZserioPackingContext) -> None:
        zserio_context.num_of_values.init(zserio.array.VarUInt16ArrayTraits(), self._num_of_values_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_of_values_)
        end_bitposition += self._speed_points_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ComfortableSpeedPointList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_of_values.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_of_values_)
        end_bitposition += self._speed_points_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_of_values_)
        end_bitposition = self._speed_points_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ComfortableSpeedPointList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_of_values.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_of_values_)
        end_bitposition = self._speed_points_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_of_values_ = zserio_reader.read_varuint16()
        self._speed_points_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_speed_points()), zserio_reader, self._num_of_values_)

    def read_packed(self, zserio_context: ComfortableSpeedPointList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_of_values_ = zserio_context.num_of_values.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._speed_points_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_speed_points()), zserio_reader, self._num_of_values_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._num_of_values_)

        # check array length
        if len(self._speed_points_) != (self._num_of_values_):
            raise zserio.PythonRuntimeException("Wrong array length for field ComfortableSpeedPointList.speedPoints: "
                                                f"{len(self._speed_points_)} != {self._num_of_values_}!")
        self._speed_points_.write(zserio_writer)

    def write_packed(self, zserio_context: ComfortableSpeedPointList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_of_values.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_of_values_)

        # check array length
        if len(self._speed_points_) != (self._num_of_values_):
            raise zserio.PythonRuntimeException("Wrong array length for field ComfortableSpeedPointList.speedPoints: "
                                                f"{len(self._speed_points_)} != {self._num_of_values_}!")
        self._speed_points_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_of_values_ = zserio.array.DeltaContext()

        @property
        def num_of_values(self):
            return self._num_of_values_

    class _ZserioElementFactory_speed_points:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint:
            del zserio_index
            return nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint.ZserioPackingContext:
            return nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint:
            del zserio_index
            return nds.adas.types.comfortable_speed_point.ComfortableSpeedPoint.from_reader_packed(zserio_context, zserio_reader)
