# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class NormalSphere:
    def __init__(
            self,
            theta_: int = int(),
            phi_: int = int()) -> None:
        self._theta_ = theta_
        self._phi_ = phi_

    @classmethod
    def from_reader(
            cls: typing.Type['NormalSphere'],
            zserio_reader: zserio.BitStreamReader) -> 'NormalSphere':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['NormalSphere'],
            zserio_context: NormalSphere.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'NormalSphere':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NormalSphere):
            return ((self._theta_ == other._theta_) and
                    (self._phi_ == other._phi_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._theta_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._phi_)

        return result

    @property
    def theta(self) -> int:
        return self._theta_

    @theta.setter
    def theta(self, theta_: int) -> None:
        self._theta_ = theta_

    @property
    def phi(self) -> int:
        return self._phi_

    @phi.setter
    def phi(self, phi_: int) -> None:
        self._phi_ = phi_

    def init_packing_context(self, zserio_context: NormalSphere.ZserioPackingContext) -> None:
        zserio_context.theta.init(zserio.array.BitFieldArrayTraits(8), self._theta_)
        zserio_context.phi.init(zserio.array.BitFieldArrayTraits(8), self._phi_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += 8

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: NormalSphere.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.theta.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._theta_)
        end_bitposition += zserio_context.phi.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._phi_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += 8

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: NormalSphere.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.theta.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._theta_)
        end_bitposition += zserio_context.phi.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._phi_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._theta_ = zserio_reader.read_bits(8)
        self._phi_ = zserio_reader.read_bits(8)

    def read_packed(self, zserio_context: NormalSphere.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._theta_ = zserio_context.theta.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._phi_ = zserio_context.phi.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._theta_, 8)
        zserio_writer.write_bits(self._phi_, 8)

    def write_packed(self, zserio_context: NormalSphere.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.theta.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._theta_)

        zserio_context.phi.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._phi_)

    class ZserioPackingContext:
        def __init__(self):
            self._theta_ = zserio.array.DeltaContext()
            self._phi_ = zserio.array.DeltaContext()

        @property
        def theta(self):
            return self._theta_

        @property
        def phi(self):
            return self._phi_
