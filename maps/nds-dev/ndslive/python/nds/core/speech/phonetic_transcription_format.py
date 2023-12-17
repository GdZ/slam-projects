# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class PhoneticTranscriptionFormat(zserio.Enum):
    IPA = 0
    STARREC_SAMPA = 1
    X_SAMPA = 2
    LH_PLUS = 3
    NT_SAMPA = 4
    SVOX_PA = 5
    LH_PLUS_V24 = 6
    I_FLYTEC = 7
    JEITA = 8

    @classmethod
    def from_name(cls: typing.Type['PhoneticTranscriptionFormat'], item_name: str) -> 'PhoneticTranscriptionFormat':
        if item_name == 'IPA':
            item = PhoneticTranscriptionFormat.IPA
        elif item_name == 'STARREC_SAMPA':
            item = PhoneticTranscriptionFormat.STARREC_SAMPA
        elif item_name == 'X_SAMPA':
            item = PhoneticTranscriptionFormat.X_SAMPA
        elif item_name == 'LH_PLUS':
            item = PhoneticTranscriptionFormat.LH_PLUS
        elif item_name == 'NT_SAMPA':
            item = PhoneticTranscriptionFormat.NT_SAMPA
        elif item_name == 'SVOX_PA':
            item = PhoneticTranscriptionFormat.SVOX_PA
        elif item_name == 'LH_PLUS_V24':
            item = PhoneticTranscriptionFormat.LH_PLUS_V24
        elif item_name == 'I_FLYTEC':
            item = PhoneticTranscriptionFormat.I_FLYTEC
        elif item_name == 'JEITA':
            item = PhoneticTranscriptionFormat.JEITA
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'PhoneticTranscriptionFormat'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['PhoneticTranscriptionFormat'], reader: zserio.BitStreamReader) -> 'PhoneticTranscriptionFormat':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['PhoneticTranscriptionFormat'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'PhoneticTranscriptionFormat':
        return cls(delta_context.read(zserio.array.BitFieldArrayTraits(8),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(8),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 8

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(8),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self.value, 8)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(8), writer, self.value)
