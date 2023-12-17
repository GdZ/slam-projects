# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.speech.phonetic_prefix_usage_type

class PhoneticPrefix:
    def __init__(
            self,
            usage_type_: typing.Union[nds.core.speech.phonetic_prefix_usage_type.PhoneticPrefixUsageType, None] = None,
            prefix_string_: str = str()) -> None:
        self._usage_type_ = usage_type_
        self._prefix_string_ = prefix_string_

    @classmethod
    def from_reader(
            cls: typing.Type['PhoneticPrefix'],
            zserio_reader: zserio.BitStreamReader) -> 'PhoneticPrefix':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PhoneticPrefix'],
            zserio_context: PhoneticPrefix.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'PhoneticPrefix':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PhoneticPrefix):
            return ((self._usage_type_ == other._usage_type_) and
                    (self._prefix_string_ == other._prefix_string_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._usage_type_)
        result = zserio.hashcode.calc_hashcode_string(result, self._prefix_string_)

        return result

    @property
    def usage_type(self) -> typing.Union[nds.core.speech.phonetic_prefix_usage_type.PhoneticPrefixUsageType, None]:
        return self._usage_type_

    @usage_type.setter
    def usage_type(self, usage_type_: typing.Union[nds.core.speech.phonetic_prefix_usage_type.PhoneticPrefixUsageType, None]) -> None:
        self._usage_type_ = usage_type_

    @property
    def prefix_string(self) -> str:
        return self._prefix_string_

    @prefix_string.setter
    def prefix_string(self, prefix_string_: str) -> None:
        self._prefix_string_ = prefix_string_

    def init_packing_context(self, zserio_context: PhoneticPrefix.ZserioPackingContext) -> None:
        self._usage_type_.init_packing_context(zserio_context.usage_type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._usage_type_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._prefix_string_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PhoneticPrefix.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._usage_type_.bitsizeof_packed(zserio_context.usage_type, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._prefix_string_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._usage_type_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._prefix_string_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PhoneticPrefix.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._usage_type_.initialize_offsets_packed(zserio_context.usage_type, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._prefix_string_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._usage_type_ = nds.core.speech.phonetic_prefix_usage_type.PhoneticPrefixUsageType.from_reader(zserio_reader)
        self._prefix_string_ = zserio_reader.read_string()

    def read_packed(self, zserio_context: PhoneticPrefix.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._usage_type_ = nds.core.speech.phonetic_prefix_usage_type.PhoneticPrefixUsageType.from_reader_packed(zserio_context.usage_type, zserio_reader)

        self._prefix_string_ = zserio_reader.read_string()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._usage_type_.write(zserio_writer)
        zserio_writer.write_string(self._prefix_string_)

    def write_packed(self, zserio_context: PhoneticPrefix.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._usage_type_.write_packed(zserio_context.usage_type, zserio_writer)

        zserio_writer.write_string(self._prefix_string_)

    class ZserioPackingContext:
        def __init__(self):
            self._usage_type_ = zserio.array.DeltaContext()

        @property
        def usage_type(self):
            return self._usage_type_