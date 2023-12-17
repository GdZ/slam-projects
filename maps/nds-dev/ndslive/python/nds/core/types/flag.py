# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class Flag:
    @classmethod
    def from_reader(
            cls: typing.Type['Flag'],
            zserio_reader: zserio.BitStreamReader) -> 'Flag':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        return isinstance(other, Flag)

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED

        return result

    def bitsizeof(self, bitposition: int = 0) -> int:
        del bitposition

        return 0

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        del zserio_reader

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        del zserio_writer
