# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.poi.types.access_point_level
import nds.poi.types.access_point_method

class AccessPointDetails:
    def __init__(
            self,
            access_point_method_: typing.Union[nds.poi.types.access_point_method.AccessPointMethod, None] = None,
            access_point_level_: typing.Union[nds.poi.types.access_point_level.AccessPointLevel, None] = None) -> None:
        self._access_point_method_ = access_point_method_
        self._access_point_level_ = access_point_level_

    @classmethod
    def from_reader(
            cls: typing.Type['AccessPointDetails'],
            zserio_reader: zserio.BitStreamReader) -> 'AccessPointDetails':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AccessPointDetails'],
            zserio_context: AccessPointDetails.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AccessPointDetails':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AccessPointDetails):
            return ((self._access_point_method_ == other._access_point_method_) and
                    (self._access_point_level_ == other._access_point_level_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._access_point_method_)
        result = zserio.hashcode.calc_hashcode_object(result, self._access_point_level_)

        return result

    @property
    def access_point_method(self) -> typing.Union[nds.poi.types.access_point_method.AccessPointMethod, None]:
        return self._access_point_method_

    @access_point_method.setter
    def access_point_method(self, access_point_method_: typing.Union[nds.poi.types.access_point_method.AccessPointMethod, None]) -> None:
        self._access_point_method_ = access_point_method_

    @property
    def access_point_level(self) -> typing.Union[nds.poi.types.access_point_level.AccessPointLevel, None]:
        return self._access_point_level_

    @access_point_level.setter
    def access_point_level(self, access_point_level_: typing.Union[nds.poi.types.access_point_level.AccessPointLevel, None]) -> None:
        self._access_point_level_ = access_point_level_

    def init_packing_context(self, zserio_context: AccessPointDetails.ZserioPackingContext) -> None:
        self._access_point_method_.init_packing_context(zserio_context.access_point_method)
        self._access_point_level_.init_packing_context(zserio_context.access_point_level)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._access_point_method_.bitsizeof(end_bitposition)
        end_bitposition += self._access_point_level_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AccessPointDetails.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._access_point_method_.bitsizeof_packed(zserio_context.access_point_method, end_bitposition)
        end_bitposition += self._access_point_level_.bitsizeof_packed(zserio_context.access_point_level, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._access_point_method_.initialize_offsets(end_bitposition)
        end_bitposition = self._access_point_level_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AccessPointDetails.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._access_point_method_.initialize_offsets_packed(zserio_context.access_point_method, end_bitposition)
        end_bitposition = self._access_point_level_.initialize_offsets_packed(zserio_context.access_point_level, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._access_point_method_ = nds.poi.types.access_point_method.AccessPointMethod.from_reader(zserio_reader)
        self._access_point_level_ = nds.poi.types.access_point_level.AccessPointLevel.from_reader(zserio_reader)

    def read_packed(self, zserio_context: AccessPointDetails.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._access_point_method_ = nds.poi.types.access_point_method.AccessPointMethod.from_reader_packed(zserio_context.access_point_method, zserio_reader)

        self._access_point_level_ = nds.poi.types.access_point_level.AccessPointLevel.from_reader_packed(zserio_context.access_point_level, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._access_point_method_.write(zserio_writer)
        self._access_point_level_.write(zserio_writer)

    def write_packed(self, zserio_context: AccessPointDetails.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._access_point_method_.write_packed(zserio_context.access_point_method, zserio_writer)

        self._access_point_level_.write_packed(zserio_context.access_point_level, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._access_point_method_ = zserio.array.DeltaContext()
            self._access_point_level_ = zserio.array.DeltaContext()

        @property
        def access_point_method(self):
            return self._access_point_method_

        @property
        def access_point_level(self):
            return self._access_point_level_
