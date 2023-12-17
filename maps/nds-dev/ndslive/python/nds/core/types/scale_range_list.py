# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.scale_range

class ScaleRangeList:
    def __init__(
            self,
            num_entries_: int = int(),
            scales_: typing.List[nds.core.types.scale_range.ScaleRange] = None) -> None:
        self._num_entries_ = num_entries_
        self._scales_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scales()), scales_)

    @classmethod
    def from_reader(
            cls: typing.Type['ScaleRangeList'],
            zserio_reader: zserio.BitStreamReader) -> 'ScaleRangeList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ScaleRangeList'],
            zserio_context: ScaleRangeList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ScaleRangeList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ScaleRangeList):
            return ((self._num_entries_ == other._num_entries_) and
                    (self._scales_ == other._scales_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_entries_)
        result = zserio.hashcode.calc_hashcode_object(result, self._scales_)

        return result

    @property
    def num_entries(self) -> int:
        return self._num_entries_

    @num_entries.setter
    def num_entries(self, num_entries_: int) -> None:
        self._num_entries_ = num_entries_

    @property
    def scales(self) -> typing.List[nds.core.types.scale_range.ScaleRange]:
        return self._scales_.raw_array

    @scales.setter
    def scales(self, scales_: typing.List[nds.core.types.scale_range.ScaleRange]) -> None:
        self._scales_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scales()), scales_)

    def init_packing_context(self, zserio_context: ScaleRangeList.ZserioPackingContext) -> None:
        zserio_context.num_entries.init(zserio.array.VarSizeArrayTraits(), self._num_entries_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_entries_)
        end_bitposition += self._scales_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ScaleRangeList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_entries.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_entries_)
        end_bitposition += self._scales_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_entries_)
        end_bitposition = self._scales_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ScaleRangeList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_entries.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_entries_)
        end_bitposition = self._scales_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_entries_ = zserio_reader.read_varsize()
        # check constraint
        if not (self._num_entries_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ScaleRangeList.numEntries!")

        self._scales_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scales()), zserio_reader, self._num_entries_)

    def read_packed(self, zserio_context: ScaleRangeList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_entries_ = zserio_context.num_entries.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        # check constraint
        if not (self._num_entries_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ScaleRangeList.numEntries!")

        self._scales_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scales()), zserio_reader, self._num_entries_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._num_entries_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ScaleRangeList.numEntries!")
        zserio_writer.write_varsize(self._num_entries_)

        # check array length
        if len(self._scales_) != (self._num_entries_):
            raise zserio.PythonRuntimeException("Wrong array length for field ScaleRangeList.scales: "
                                                f"{len(self._scales_)} != {self._num_entries_}!")
        self._scales_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: ScaleRangeList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._num_entries_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ScaleRangeList.numEntries!")
        zserio_context.num_entries.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_entries_)

        # check array length
        if len(self._scales_) != (self._num_entries_):
            raise zserio.PythonRuntimeException("Wrong array length for field ScaleRangeList.scales: "
                                                f"{len(self._scales_)} != {self._num_entries_}!")
        self._scales_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_entries_ = zserio.array.DeltaContext()

        @property
        def num_entries(self):
            return self._num_entries_

    class _ZserioElementFactory_scales:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.types.scale_range.ScaleRange:
            del zserio_index
            return nds.core.types.scale_range.ScaleRange.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.types.scale_range.ScaleRange.ZserioPackingContext:
            return nds.core.types.scale_range.ScaleRange.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.types.scale_range.ScaleRange.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.types.scale_range.ScaleRange:
            del zserio_index
            return nds.core.types.scale_range.ScaleRange.from_reader_packed(zserio_context, zserio_reader)
