# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.speech.phonetic_transcription
import nds.core.speech.phonetic_transcription_format

class PhoneticTranscriptionList:
    def __init__(
            self,
            format_: typing.Union[nds.core.speech.phonetic_transcription_format.PhoneticTranscriptionFormat, None] = None,
            transcriptions_: typing.List[nds.core.speech.phonetic_transcription.PhoneticTranscription] = None) -> None:
        self._format_ = format_
        self._transcriptions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transcriptions()), transcriptions_, is_auto=True)

    @classmethod
    def from_reader(
            cls: typing.Type['PhoneticTranscriptionList'],
            zserio_reader: zserio.BitStreamReader) -> 'PhoneticTranscriptionList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PhoneticTranscriptionList'],
            zserio_context: PhoneticTranscriptionList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'PhoneticTranscriptionList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PhoneticTranscriptionList):
            return ((self._format_ == other._format_) and
                    (self._transcriptions_ == other._transcriptions_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._format_)
        result = zserio.hashcode.calc_hashcode_object(result, self._transcriptions_)

        return result

    @property
    def format(self) -> typing.Union[nds.core.speech.phonetic_transcription_format.PhoneticTranscriptionFormat, None]:
        return self._format_

    @format.setter
    def format(self, format_: typing.Union[nds.core.speech.phonetic_transcription_format.PhoneticTranscriptionFormat, None]) -> None:
        self._format_ = format_

    @property
    def transcriptions(self) -> typing.List[nds.core.speech.phonetic_transcription.PhoneticTranscription]:
        return self._transcriptions_.raw_array

    @transcriptions.setter
    def transcriptions(self, transcriptions_: typing.List[nds.core.speech.phonetic_transcription.PhoneticTranscription]) -> None:
        self._transcriptions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transcriptions()), transcriptions_, is_auto=True)

    def init_packing_context(self, zserio_context: PhoneticTranscriptionList.ZserioPackingContext) -> None:
        self._format_.init_packing_context(zserio_context.format)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._format_.bitsizeof(end_bitposition)
        end_bitposition += self._transcriptions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PhoneticTranscriptionList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._format_.bitsizeof_packed(zserio_context.format, end_bitposition)
        end_bitposition += self._transcriptions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._format_.initialize_offsets(end_bitposition)
        end_bitposition = self._transcriptions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PhoneticTranscriptionList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._format_.initialize_offsets_packed(zserio_context.format, end_bitposition)
        end_bitposition = self._transcriptions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._format_ = nds.core.speech.phonetic_transcription_format.PhoneticTranscriptionFormat.from_reader(zserio_reader)
        self._transcriptions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transcriptions()), zserio_reader, is_auto=True)

    def read_packed(self, zserio_context: PhoneticTranscriptionList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._format_ = nds.core.speech.phonetic_transcription_format.PhoneticTranscriptionFormat.from_reader_packed(zserio_context.format, zserio_reader)

        self._transcriptions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_transcriptions()), zserio_reader, is_auto=True)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._format_.write(zserio_writer)
        self._transcriptions_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: PhoneticTranscriptionList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._format_.write_packed(zserio_context.format, zserio_writer)

        self._transcriptions_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._format_ = zserio.array.DeltaContext()

        @property
        def format(self):
            return self._format_

    class _ZserioElementFactory_transcriptions:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.speech.phonetic_transcription.PhoneticTranscription:
            del zserio_index
            return nds.core.speech.phonetic_transcription.PhoneticTranscription.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.speech.phonetic_transcription.PhoneticTranscription.ZserioPackingContext:
            return nds.core.speech.phonetic_transcription.PhoneticTranscription.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.speech.phonetic_transcription.PhoneticTranscription.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.speech.phonetic_transcription.PhoneticTranscription:
            del zserio_index
            return nds.core.speech.phonetic_transcription.PhoneticTranscription.from_reader_packed(zserio_context, zserio_reader)
