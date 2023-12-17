# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class PercentagePosition:
    def __init__(
            self,
            num_bits_: int = int(),
            position_: int = int()) -> None:
        self._num_bits_ = num_bits_
        self._position_ = position_

    @classmethod
    def from_reader(
            cls: typing.Type['PercentagePosition'],
            zserio_reader: zserio.BitStreamReader) -> 'PercentagePosition':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PercentagePosition'],
            zserio_context: PercentagePosition.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'PercentagePosition':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PercentagePosition):
            return ((self._num_bits_ == other._num_bits_) and
                    (self._position_ == other._position_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_bits_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._position_)

        return result

    @property
    def num_bits(self) -> int:
        return self._num_bits_

    @num_bits.setter
    def num_bits(self, num_bits_: int) -> None:
        self._num_bits_ = num_bits_

    @property
    def position(self) -> int:
        return self._position_

    @position.setter
    def position(self, position_: int) -> None:
        self._position_ = position_

    def percentage_value(self) -> float:
        return (self._position_ + 0.0) // ((1 << self._num_bits_) - 1)

    def init_packing_context(self, zserio_context: PercentagePosition.ZserioPackingContext) -> None:
        zserio_context.num_bits.init(zserio.array.BitFieldArrayTraits(5), self._num_bits_)
        zserio_context.position.init(zserio.array.BitFieldArrayTraits(self._num_bits_), self._position_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition += self._num_bits_

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PercentagePosition.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_bits.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._num_bits_)
        end_bitposition += zserio_context.position.bitsizeof(zserio.array.BitFieldArrayTraits(self._num_bits_), self._position_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition += self._num_bits_

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PercentagePosition.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_bits.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._num_bits_)
        end_bitposition += zserio_context.position.bitsizeof(zserio.array.BitFieldArrayTraits(self._num_bits_), self._position_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_bits_ = zserio_reader.read_bits(5)
        # check constraint
        if not (self._num_bits_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field PercentagePosition.numBits!")

        self._position_ = zserio_reader.read_bits(self._num_bits_)

    def read_packed(self, zserio_context: PercentagePosition.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_bits_ = zserio_context.num_bits.read(zserio.array.BitFieldArrayTraits(5), zserio_reader)
        # check constraint
        if not (self._num_bits_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field PercentagePosition.numBits!")

        self._position_ = zserio_context.position.read(zserio.array.BitFieldArrayTraits(self._num_bits_), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._num_bits_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field PercentagePosition.numBits!")
        zserio_writer.write_bits(self._num_bits_, 5)

        zserio_writer.write_bits(self._position_, self._num_bits_)

    def write_packed(self, zserio_context: PercentagePosition.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check constraint
        if not (self._num_bits_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field PercentagePosition.numBits!")
        zserio_context.num_bits.write(zserio.array.BitFieldArrayTraits(5), zserio_writer, self._num_bits_)

        zserio_context.position.write(zserio.array.BitFieldArrayTraits(self._num_bits_), zserio_writer, self._position_)

    class ZserioPackingContext:
        def __init__(self):
            self._num_bits_ = zserio.array.DeltaContext()
            self._position_ = zserio.array.DeltaContext()

        @property
        def num_bits(self):
            return self._num_bits_

        @property
        def position(self):
            return self._position_