# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class SmartLayerMeshIndexContent:
    def __init__(
            self,
            has_headers_: bool = bool(),
            has_sizes_: bool = bool()) -> None:
        self._has_headers_ = has_headers_
        self._has_sizes_ = has_sizes_

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerMeshIndexContent'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerMeshIndexContent':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerMeshIndexContent):
            return ((self._has_headers_ == other._has_headers_) and
                    (self._has_sizes_ == other._has_sizes_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_headers_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_sizes_)

        return result

    @property
    def has_headers(self) -> bool:
        return self._has_headers_

    @has_headers.setter
    def has_headers(self, has_headers_: bool) -> None:
        self._has_headers_ = has_headers_

    @property
    def has_sizes(self) -> bool:
        return self._has_sizes_

    @has_sizes.setter
    def has_sizes(self, has_sizes_: bool) -> None:
        self._has_sizes_ = has_sizes_

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._has_headers_ = zserio_reader.read_bool()
        self._has_sizes_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._has_headers_)
        zserio_writer.write_bool(self._has_sizes_)