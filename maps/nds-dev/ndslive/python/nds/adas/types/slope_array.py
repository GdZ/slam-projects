# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.adas.types.slope_point

class SlopeArray:
    def __init__(
            self,
            num_of_values_: int = int(),
            slope_point_: typing.List[nds.adas.types.slope_point.SlopePoint] = None) -> None:
        self._num_of_values_ = num_of_values_
        self._slope_point_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_slope_point()), slope_point_)

    @classmethod
    def from_reader(
            cls: typing.Type['SlopeArray'],
            zserio_reader: zserio.BitStreamReader) -> 'SlopeArray':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SlopeArray'],
            zserio_context: SlopeArray.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SlopeArray':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SlopeArray):
            return ((self._num_of_values_ == other._num_of_values_) and
                    (self._slope_point_ == other._slope_point_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_of_values_)
        result = zserio.hashcode.calc_hashcode_object(result, self._slope_point_)

        return result

    @property
    def num_of_values(self) -> int:
        return self._num_of_values_

    @num_of_values.setter
    def num_of_values(self, num_of_values_: int) -> None:
        self._num_of_values_ = num_of_values_

    @property
    def slope_point(self) -> typing.List[nds.adas.types.slope_point.SlopePoint]:
        return self._slope_point_.raw_array

    @slope_point.setter
    def slope_point(self, slope_point_: typing.List[nds.adas.types.slope_point.SlopePoint]) -> None:
        self._slope_point_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_slope_point()), slope_point_)

    def init_packing_context(self, zserio_context: SlopeArray.ZserioPackingContext) -> None:
        zserio_context.num_of_values.init(zserio.array.VarUInt16ArrayTraits(), self._num_of_values_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_of_values_)
        end_bitposition += self._slope_point_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SlopeArray.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_of_values.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_of_values_)
        end_bitposition += self._slope_point_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._num_of_values_)
        end_bitposition = self._slope_point_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SlopeArray.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_of_values.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._num_of_values_)
        end_bitposition = self._slope_point_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_of_values_ = zserio_reader.read_varuint16()
        self._slope_point_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_slope_point()), zserio_reader, self._num_of_values_)

    def read_packed(self, zserio_context: SlopeArray.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_of_values_ = zserio_context.num_of_values.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._slope_point_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_slope_point()), zserio_reader, self._num_of_values_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._num_of_values_)

        # check array length
        if len(self._slope_point_) != (self._num_of_values_):
            raise zserio.PythonRuntimeException("Wrong array length for field SlopeArray.slopePoint: "
                                                f"{len(self._slope_point_)} != {self._num_of_values_}!")
        self._slope_point_.write(zserio_writer)

    def write_packed(self, zserio_context: SlopeArray.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_of_values.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._num_of_values_)

        # check array length
        if len(self._slope_point_) != (self._num_of_values_):
            raise zserio.PythonRuntimeException("Wrong array length for field SlopeArray.slopePoint: "
                                                f"{len(self._slope_point_)} != {self._num_of_values_}!")
        self._slope_point_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_of_values_ = zserio.array.DeltaContext()

        @property
        def num_of_values(self):
            return self._num_of_values_

    class _ZserioElementFactory_slope_point:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.adas.types.slope_point.SlopePoint:
            del zserio_index
            return nds.adas.types.slope_point.SlopePoint.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.adas.types.slope_point.SlopePoint.ZserioPackingContext:
            return nds.adas.types.slope_point.SlopePoint.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.adas.types.slope_point.SlopePoint.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.adas.types.slope_point.SlopePoint:
            del zserio_index
            return nds.adas.types.slope_point.SlopePoint.from_reader_packed(zserio_context, zserio_reader)
