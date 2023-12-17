# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.core.geometry.ring2d

class RangeProjectionResponse:
    def __init__(
            self,
            shift_: nds.core.geometry.coord_shift.CoordShift = nds.core.geometry.coord_shift.CoordShift(),
            geometry_: typing.Union[nds.core.geometry.ring2d.Ring2D, None] = None) -> None:
        self._shift_ = shift_
        self._geometry_ = geometry_

    @classmethod
    def from_reader(
            cls: typing.Type['RangeProjectionResponse'],
            zserio_reader: zserio.BitStreamReader) -> 'RangeProjectionResponse':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RangeProjectionResponse'],
            zserio_context: RangeProjectionResponse.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RangeProjectionResponse':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RangeProjectionResponse):
            return ((self._shift_ == other._shift_) and
                    (self._geometry_ == other._geometry_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        result = zserio.hashcode.calc_hashcode_object(result, self._geometry_)

        return result

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @shift.setter
    def shift(self, shift_: nds.core.geometry.coord_shift.CoordShift) -> None:
        self._shift_ = shift_

    @property
    def geometry(self) -> typing.Union[nds.core.geometry.ring2d.Ring2D, None]:
        return self._geometry_

    @geometry.setter
    def geometry(self, geometry_: typing.Union[nds.core.geometry.ring2d.Ring2D, None]) -> None:
        self._geometry_ = geometry_

    def init_packing_context(self, zserio_context: RangeProjectionResponse.ZserioPackingContext) -> None:
        zserio_context.shift.init(zserio.array.BitFieldArrayTraits(5), self._shift_)
        self._geometry_.init_packing_context(zserio_context.geometry)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition += self._geometry_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RangeProjectionResponse.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        end_bitposition += self._geometry_.bitsizeof_packed(zserio_context.geometry, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition = self._geometry_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RangeProjectionResponse.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        end_bitposition = self._geometry_.initialize_offsets_packed(zserio_context.geometry, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._shift_ = zserio_reader.read_bits(5)
        self._geometry_ = nds.core.geometry.ring2d.Ring2D.from_reader(zserio_reader, self._shift_)

    def read_packed(self, zserio_context: RangeProjectionResponse.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._shift_ = zserio_context.shift.read(zserio.array.BitFieldArrayTraits(5), zserio_reader)

        self._geometry_ = nds.core.geometry.ring2d.Ring2D.from_reader_packed(zserio_context.geometry, zserio_reader, self._shift_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._shift_, 5)

        # check parameters
        if self._geometry_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RangeProjectionResponse.geometry: "
                                                f"{self._geometry_.shift} != {self._shift_}!")
        self._geometry_.write(zserio_writer)

    def write_packed(self, zserio_context: RangeProjectionResponse.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.shift.write(zserio.array.BitFieldArrayTraits(5), zserio_writer, self._shift_)

        # check parameters
        if self._geometry_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RangeProjectionResponse.geometry: "
                                                f"{self._geometry_.shift} != {self._shift_}!")
        self._geometry_.write_packed(zserio_context.geometry, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._shift_ = zserio.array.DeltaContext()
            self._geometry_ = nds.core.geometry.ring2d.Ring2D.ZserioPackingContext()

        @property
        def shift(self):
            return self._shift_

        @property
        def geometry(self):
            return self._geometry_