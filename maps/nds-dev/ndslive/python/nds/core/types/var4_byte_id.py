# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class Var4ByteId:
    def __init__(
            self,
            id_: int = int()) -> None:
        self._id_ = id_

    @classmethod
    def from_reader(
            cls: typing.Type['Var4ByteId'],
            zserio_reader: zserio.BitStreamReader) -> 'Var4ByteId':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Var4ByteId'],
            zserio_context: Var4ByteId.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Var4ByteId':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Var4ByteId):
            return (self._id_ == other._id_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._id_)

        return result

    @property
    def id(self) -> int:
        return self._id_

    @id.setter
    def id(self, id_: int) -> None:
        self._id_ = id_

    def is_unknown(self) -> bool:
        return (True) if ((self._id_ == 0)) else (False)

    def init_packing_context(self, zserio_context: Var4ByteId.ZserioPackingContext) -> None:
        zserio_context.id.init(zserio.array.VarUInt32ArrayTraits(), self._id_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._id_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Var4ByteId.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._id_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._id_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Var4ByteId.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._id_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_reader.read_varuint32()
        # check constraint
        if not (self._id_ <= 268435455):
            raise zserio.PythonRuntimeException("Constraint violated for field Var4ByteId.id!")

    def read_packed(self, zserio_context: Var4ByteId.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_context.id.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        # check constraint
        if not (self._id_ <= 268435455):
            raise zserio.PythonRuntimeException("Constraint violated for field Var4ByteId.id!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._id_ <= 268435455):
            raise zserio.PythonRuntimeException("Constraint violated for field Var4ByteId.id!")
        zserio_writer.write_varuint32(self._id_)

    def write_packed(self, zserio_context: Var4ByteId.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._id_ <= 268435455):
            raise zserio.PythonRuntimeException("Constraint violated for field Var4ByteId.id!")
        zserio_context.id.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._id_)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = zserio.array.DeltaContext()

        @property
        def id(self):
            return self._id_
