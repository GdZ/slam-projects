# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.vehicle.authorization

class AuthorizationCondition:
    def __init__(
            self,
            authorization_: typing.Union[nds.core.vehicle.authorization.Authorization, None] = None,
            is_inclusive_: bool = bool()) -> None:
        self._authorization_ = authorization_
        self._is_inclusive_ = is_inclusive_

    @classmethod
    def from_reader(
            cls: typing.Type['AuthorizationCondition'],
            zserio_reader: zserio.BitStreamReader) -> 'AuthorizationCondition':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AuthorizationCondition'],
            zserio_context: AuthorizationCondition.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AuthorizationCondition':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AuthorizationCondition):
            return ((self._authorization_ == other._authorization_) and
                    (self._is_inclusive_ == other._is_inclusive_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._authorization_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_inclusive_)

        return result

    @property
    def authorization(self) -> typing.Union[nds.core.vehicle.authorization.Authorization, None]:
        return self._authorization_

    @authorization.setter
    def authorization(self, authorization_: typing.Union[nds.core.vehicle.authorization.Authorization, None]) -> None:
        self._authorization_ = authorization_

    @property
    def is_inclusive(self) -> bool:
        return self._is_inclusive_

    @is_inclusive.setter
    def is_inclusive(self, is_inclusive_: bool) -> None:
        self._is_inclusive_ = is_inclusive_

    def init_packing_context(self, zserio_context: AuthorizationCondition.ZserioPackingContext) -> None:
        self._authorization_.init_packing_context(zserio_context.authorization)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._authorization_.bitsizeof(end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AuthorizationCondition.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._authorization_.bitsizeof_packed(zserio_context.authorization, end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._authorization_.initialize_offsets(end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AuthorizationCondition.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._authorization_.initialize_offsets_packed(zserio_context.authorization, end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._authorization_ = nds.core.vehicle.authorization.Authorization.from_reader(zserio_reader)
        self._is_inclusive_ = zserio_reader.read_bool()

    def read_packed(self, zserio_context: AuthorizationCondition.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._authorization_ = nds.core.vehicle.authorization.Authorization.from_reader_packed(zserio_context.authorization, zserio_reader)

        self._is_inclusive_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._authorization_.write(zserio_writer)
        zserio_writer.write_bool(self._is_inclusive_)

    def write_packed(self, zserio_context: AuthorizationCondition.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._authorization_.write_packed(zserio_context.authorization, zserio_writer)

        zserio_writer.write_bool(self._is_inclusive_)

    class ZserioPackingContext:
        def __init__(self):
            self._authorization_ = zserio.array.DeltaContext()

        @property
        def authorization(self):
            return self._authorization_
