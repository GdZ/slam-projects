# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routingdata.types.speed_profile_id

class SpeedProfile:
    def __init__(
            self,
            id_: nds.routingdata.types.speed_profile_id.SpeedProfileId = nds.routingdata.types.speed_profile_id.SpeedProfileId(),
            values_: typing.List[int] = None) -> None:
        self._id_ = id_
        self._values_ = zserio.array.Array(zserio.array.VarUInt16ArrayTraits(), values_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['SpeedProfile'],
            zserio_reader: zserio.BitStreamReader) -> 'SpeedProfile':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SpeedProfile'],
            zserio_context: SpeedProfile.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SpeedProfile':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SpeedProfile):
            return ((self._id_ == other._id_) and
                    (self._values_ == other._values_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._values_)

        return result

    @property
    def id(self) -> nds.routingdata.types.speed_profile_id.SpeedProfileId:
        return self._id_

    @id.setter
    def id(self, id_: nds.routingdata.types.speed_profile_id.SpeedProfileId) -> None:
        self._id_ = id_

    @property
    def values(self) -> typing.List[int]:
        return self._values_.raw_array

    @values.setter
    def values(self, values_: typing.List[int]) -> None:
        self._values_ = zserio.array.Array(zserio.array.VarUInt16ArrayTraits(), values_, is_auto=True)

    def init_packing_context(self, zserio_context: SpeedProfile.ZserioPackingContext) -> None:
        zserio_context.id.init(zserio.array.VarUInt16ArrayTraits(), self._id_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._id_)
        end_bitposition += self._values_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SpeedProfile.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._id_)
        end_bitposition += self._values_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._id_)
        end_bitposition = self._values_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SpeedProfile.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._id_)
        end_bitposition = self._values_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_reader.read_varuint16()
        self._values_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt16ArrayTraits(), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: SpeedProfile.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_context.id.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._values_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt16ArrayTraits(), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._id_)
        self._values_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: SpeedProfile.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.id.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._id_)

        self._values_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = zserio.array.DeltaContext()

        @property
        def id(self):
            return self._id_