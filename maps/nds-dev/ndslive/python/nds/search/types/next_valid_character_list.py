# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class NextValidCharacterList:
    def __init__(
            self,
            nvc_: str = str()) -> None:
        self._nvc_ = nvc_

    @classmethod
    def from_reader(
            cls: typing.Type['NextValidCharacterList'],
            zserio_reader: zserio.BitStreamReader) -> 'NextValidCharacterList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NextValidCharacterList):
            return (self._nvc_ == other._nvc_)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_string(result, self._nvc_)

        return result

    @property
    def nvc(self) -> str:
        return self._nvc_

    @nvc.setter
    def nvc(self, nvc_: str) -> None:
        self._nvc_ = nvc_

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._nvc_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._nvc_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._nvc_ = zserio_reader.read_string()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_string(self._nvc_)
