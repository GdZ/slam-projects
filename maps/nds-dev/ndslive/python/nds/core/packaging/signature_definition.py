# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.packaging.hash_type
import nds.core.packaging.signature_id
import nds.core.packaging.signature_size
import nds.core.packaging.signature_type

class SignatureDefinition:
    def __init__(
            self,
            id_: nds.core.packaging.signature_id.SignatureId = nds.core.packaging.signature_id.SignatureId(),
            type_: nds.core.packaging.signature_type.SignatureType = nds.core.packaging.signature_type.SignatureType(),
            size_: nds.core.packaging.signature_size.SignatureSize = nds.core.packaging.signature_size.SignatureSize(),
            hash_type_: nds.core.packaging.hash_type.HashType = nds.core.packaging.hash_type.HashType(),
            name_: str = str(),
            key_uri_: str = str()) -> None:
        self._id_ = id_
        self._type_ = type_
        self._size_ = size_
        self._hash_type_ = hash_type_
        self._name_ = name_
        self._key_uri_ = key_uri_

    @classmethod
    def from_reader(
            cls: typing.Type['SignatureDefinition'],
            zserio_reader: zserio.BitStreamReader) -> 'SignatureDefinition':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SignatureDefinition'],
            zserio_context: SignatureDefinition.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SignatureDefinition':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SignatureDefinition):
            return ((self._id_ == other._id_) and
                    (self._type_ == other._type_) and
                    (self._size_ == other._size_) and
                    (self._hash_type_ == other._hash_type_) and
                    (self._name_ == other._name_) and
                    (self._key_uri_ == other._key_uri_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._id_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._type_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._size_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._hash_type_)
        result = zserio.hashcode.calc_hashcode_string(result, self._name_)
        result = zserio.hashcode.calc_hashcode_string(result, self._key_uri_)

        return result

    @property
    def id(self) -> nds.core.packaging.signature_id.SignatureId:
        return self._id_

    @id.setter
    def id(self, id_: nds.core.packaging.signature_id.SignatureId) -> None:
        self._id_ = id_

    @property
    def type(self) -> nds.core.packaging.signature_type.SignatureType:
        return self._type_

    @type.setter
    def type(self, type_: nds.core.packaging.signature_type.SignatureType) -> None:
        self._type_ = type_

    @property
    def size(self) -> nds.core.packaging.signature_size.SignatureSize:
        return self._size_

    @size.setter
    def size(self, size_: nds.core.packaging.signature_size.SignatureSize) -> None:
        self._size_ = size_

    @property
    def hash_type(self) -> nds.core.packaging.hash_type.HashType:
        return self._hash_type_

    @hash_type.setter
    def hash_type(self, hash_type_: nds.core.packaging.hash_type.HashType) -> None:
        self._hash_type_ = hash_type_

    @property
    def name(self) -> str:
        return self._name_

    @name.setter
    def name(self, name_: str) -> None:
        self._name_ = name_

    @property
    def key_uri(self) -> str:
        return self._key_uri_

    @key_uri.setter
    def key_uri(self, key_uri_: str) -> None:
        self._key_uri_ = key_uri_

    def init_packing_context(self, zserio_context: SignatureDefinition.ZserioPackingContext) -> None:
        zserio_context.id.init(zserio.array.VarUInt16ArrayTraits(), self._id_)
        zserio_context.type.init(zserio.array.VarUInt16ArrayTraits(), self._type_)
        zserio_context.size.init(zserio.array.VarUInt32ArrayTraits(), self._size_)
        zserio_context.hash_type.init(zserio.array.VarUInt16ArrayTraits(), self._hash_type_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._id_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._type_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._size_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._hash_type_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._key_uri_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SignatureDefinition.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._id_)
        end_bitposition += zserio_context.type.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._type_)
        end_bitposition += zserio_context.size.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._size_)
        end_bitposition += zserio_context.hash_type.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._hash_type_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._key_uri_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._id_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._type_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._size_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._hash_type_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._key_uri_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SignatureDefinition.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._id_)
        end_bitposition += zserio_context.type.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._type_)
        end_bitposition += zserio_context.size.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._size_)
        end_bitposition += zserio_context.hash_type.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._hash_type_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._name_)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._key_uri_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_reader.read_varuint16()
        self._type_ = zserio_reader.read_varuint16()
        self._size_ = zserio_reader.read_varuint32()
        self._hash_type_ = zserio_reader.read_varuint16()
        self._name_ = zserio_reader.read_string()
        self._key_uri_ = zserio_reader.read_string()

    def read_packed(self, zserio_context: SignatureDefinition.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_context.id.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._type_ = zserio_context.type.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._size_ = zserio_context.size.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

        self._hash_type_ = zserio_context.hash_type.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._name_ = zserio_reader.read_string()

        self._key_uri_ = zserio_reader.read_string()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._id_)
        zserio_writer.write_varuint16(self._type_)
        zserio_writer.write_varuint32(self._size_)
        zserio_writer.write_varuint16(self._hash_type_)
        zserio_writer.write_string(self._name_)
        zserio_writer.write_string(self._key_uri_)

    def write_packed(self, zserio_context: SignatureDefinition.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.id.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._id_)

        zserio_context.type.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._type_)

        zserio_context.size.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._size_)

        zserio_context.hash_type.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._hash_type_)

        zserio_writer.write_string(self._name_)

        zserio_writer.write_string(self._key_uri_)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = zserio.array.DeltaContext()
            self._type_ = zserio.array.DeltaContext()
            self._size_ = zserio.array.DeltaContext()
            self._hash_type_ = zserio.array.DeltaContext()

        @property
        def id(self):
            return self._id_

        @property
        def type(self):
            return self._type_

        @property
        def size(self):
            return self._size_

        @property
        def hash_type(self):
            return self._hash_type_
