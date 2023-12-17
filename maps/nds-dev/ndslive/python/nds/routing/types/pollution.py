# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class Pollution:
    def __init__(
            self,
            carbon_dioxide_: int = int()) -> None:
        self._carbon_dioxide_ = carbon_dioxide_

    @classmethod
    def from_reader(
            cls: typing.Type['Pollution'],
            zserio_reader: zserio.BitStreamReader) -> 'Pollution':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Pollution'],
            zserio_context: Pollution.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Pollution':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Pollution):
            return (self._carbon_dioxide_ == other._carbon_dioxide_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._carbon_dioxide_)

        return result

    @property
    def carbon_dioxide(self) -> int:
        return self._carbon_dioxide_

    @carbon_dioxide.setter
    def carbon_dioxide(self, carbon_dioxide_: int) -> None:
        self._carbon_dioxide_ = carbon_dioxide_

    def init_packing_context(self, zserio_context: Pollution.ZserioPackingContext) -> None:
        zserio_context.carbon_dioxide.init(zserio.array.VarUIntArrayTraits(), self._carbon_dioxide_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._carbon_dioxide_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Pollution.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.carbon_dioxide.bitsizeof(zserio.array.VarUIntArrayTraits(), self._carbon_dioxide_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._carbon_dioxide_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Pollution.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.carbon_dioxide.bitsizeof(zserio.array.VarUIntArrayTraits(), self._carbon_dioxide_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._carbon_dioxide_ = zserio_reader.read_varuint()

    def read_packed(self, zserio_context: Pollution.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._carbon_dioxide_ = zserio_context.carbon_dioxide.read(zserio.array.VarUIntArrayTraits(), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint(self._carbon_dioxide_)

    def write_packed(self, zserio_context: Pollution.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.carbon_dioxide.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._carbon_dioxide_)

    class ZserioPackingContext:
        def __init__(self):
            self._carbon_dioxide_ = zserio.array.DeltaContext()

        @property
        def carbon_dioxide(self):
            return self._carbon_dioxide_