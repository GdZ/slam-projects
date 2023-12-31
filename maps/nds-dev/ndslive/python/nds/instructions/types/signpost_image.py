# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.percentage_position
import nds.instructions.types.sign_post_image_reference

class SignpostImage:
    def __init__(
            self,
            id_: nds.instructions.types.sign_post_image_reference.SignPostImageReference = nds.instructions.types.sign_post_image_reference.SignPostImageReference(),
            position_: typing.Union[nds.core.types.percentage_position.PercentagePosition, None] = None) -> None:
        self._id_ = id_
        self._position_ = position_

    @classmethod
    def from_reader(
            cls: typing.Type['SignpostImage'],
            zserio_reader: zserio.BitStreamReader) -> 'SignpostImage':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SignpostImage'],
            zserio_context: SignpostImage.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SignpostImage':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SignpostImage):
            return ((self._id_ == other._id_) and
                    (self._position_ == other._position_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._position_)

        return result

    @property
    def id(self) -> nds.instructions.types.sign_post_image_reference.SignPostImageReference:
        return self._id_

    @id.setter
    def id(self, id_: nds.instructions.types.sign_post_image_reference.SignPostImageReference) -> None:
        self._id_ = id_

    @property
    def position(self) -> typing.Union[nds.core.types.percentage_position.PercentagePosition, None]:
        return self._position_

    @position.setter
    def position(self, position_: typing.Union[nds.core.types.percentage_position.PercentagePosition, None]) -> None:
        self._position_ = position_

    def init_packing_context(self, zserio_context: SignpostImage.ZserioPackingContext) -> None:
        zserio_context.id.init(zserio.array.VarUIntArrayTraits(), self._id_)
        self._position_.init_packing_context(zserio_context.position)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._id_)
        end_bitposition += self._position_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SignpostImage.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUIntArrayTraits(), self._id_)
        end_bitposition += self._position_.bitsizeof_packed(zserio_context.position, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._id_)
        end_bitposition = self._position_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SignpostImage.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUIntArrayTraits(), self._id_)
        end_bitposition = self._position_.initialize_offsets_packed(zserio_context.position, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_reader.read_varuint()
        self._position_ = nds.core.types.percentage_position.PercentagePosition.from_reader(zserio_reader)

    def read_packed(self, zserio_context: SignpostImage.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_context.id.read(zserio.array.VarUIntArrayTraits(), zserio_reader)

        self._position_ = nds.core.types.percentage_position.PercentagePosition.from_reader_packed(zserio_context.position, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint(self._id_)
        self._position_.write(zserio_writer)

    def write_packed(self, zserio_context: SignpostImage.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.id.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._id_)

        self._position_.write_packed(zserio_context.position, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = zserio.array.DeltaContext()
            self._position_ = nds.core.types.percentage_position.PercentagePosition.ZserioPackingContext()

        @property
        def id(self):
            return self._id_

        @property
        def position(self):
            return self._position_
