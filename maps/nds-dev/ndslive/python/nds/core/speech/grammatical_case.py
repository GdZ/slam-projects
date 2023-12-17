# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class GrammaticalCase(zserio.Enum):
    NO_GRAMMATICAL_CASE = 0
    ABESSIVE_CASE = 1
    ABLATIVE_CASE = 2
    ABSOLUTIVE_CASE = 3
    ADESSIVE_CASE = 4
    ACCUSATIVE_CASE = 5
    ALLATIVE_CASE = 6
    CAUSAL_CASE = 7
    COMITATIVE_CASE = 8
    DATIVE_CASE = 9
    DELATIVE_CASE = 10
    DELIMITATIVE_CASE = 11
    DIRECTIONAL_CASE = 12
    DISTRIBUTIVE_TEMPORAL_CASE = 13
    ELATIVE_CASE = 14
    EQUATIVE_CASE = 15
    ERGATIVE_CASE = 16
    ESSIVE_CASE = 17
    FINAL_CASE = 18
    GENITIVE_CASE = 19
    ILLATIVE_CASE = 20
    INESSIVE_CASE = 21
    INSTRUCTIVE_CASE = 22
    INSTRUMENTAL_CASE = 23
    LOCATIVE_CASE = 24
    MODAL_CASE = 25
    MULTIPLICATIVE_CASE = 26
    NOMINATIVE_CASE = 27
    OBLIQUE_CASE = 28
    PARTITIVE_CASE = 29
    PERLATIVE_CASE = 30
    POSSESSIVE_CASE = 31
    POSTPOSITIONAL_CASE = 32
    PREPOSITIONAL_CASE = 33
    PROLATIVE_CASE = 34
    SUBLATIVE_CASE = 35
    SUPERESSIVE_CASE = 36
    TEMPORAL_CASE = 37
    TERMINATIVE_CASE = 38
    TRANSLATIVE_CASE = 39
    VOCATIVE_CASE = 40

    @classmethod
    def from_name(cls: typing.Type['GrammaticalCase'], item_name: str) -> 'GrammaticalCase':
        if item_name == 'NO_GRAMMATICAL_CASE':
            item = GrammaticalCase.NO_GRAMMATICAL_CASE
        elif item_name == 'ABESSIVE_CASE':
            item = GrammaticalCase.ABESSIVE_CASE
        elif item_name == 'ABLATIVE_CASE':
            item = GrammaticalCase.ABLATIVE_CASE
        elif item_name == 'ABSOLUTIVE_CASE':
            item = GrammaticalCase.ABSOLUTIVE_CASE
        elif item_name == 'ADESSIVE_CASE':
            item = GrammaticalCase.ADESSIVE_CASE
        elif item_name == 'ACCUSATIVE_CASE':
            item = GrammaticalCase.ACCUSATIVE_CASE
        elif item_name == 'ALLATIVE_CASE':
            item = GrammaticalCase.ALLATIVE_CASE
        elif item_name == 'CAUSAL_CASE':
            item = GrammaticalCase.CAUSAL_CASE
        elif item_name == 'COMITATIVE_CASE':
            item = GrammaticalCase.COMITATIVE_CASE
        elif item_name == 'DATIVE_CASE':
            item = GrammaticalCase.DATIVE_CASE
        elif item_name == 'DELATIVE_CASE':
            item = GrammaticalCase.DELATIVE_CASE
        elif item_name == 'DELIMITATIVE_CASE':
            item = GrammaticalCase.DELIMITATIVE_CASE
        elif item_name == 'DIRECTIONAL_CASE':
            item = GrammaticalCase.DIRECTIONAL_CASE
        elif item_name == 'DISTRIBUTIVE_TEMPORAL_CASE':
            item = GrammaticalCase.DISTRIBUTIVE_TEMPORAL_CASE
        elif item_name == 'ELATIVE_CASE':
            item = GrammaticalCase.ELATIVE_CASE
        elif item_name == 'EQUATIVE_CASE':
            item = GrammaticalCase.EQUATIVE_CASE
        elif item_name == 'ERGATIVE_CASE':
            item = GrammaticalCase.ERGATIVE_CASE
        elif item_name == 'ESSIVE_CASE':
            item = GrammaticalCase.ESSIVE_CASE
        elif item_name == 'FINAL_CASE':
            item = GrammaticalCase.FINAL_CASE
        elif item_name == 'GENITIVE_CASE':
            item = GrammaticalCase.GENITIVE_CASE
        elif item_name == 'ILLATIVE_CASE':
            item = GrammaticalCase.ILLATIVE_CASE
        elif item_name == 'INESSIVE_CASE':
            item = GrammaticalCase.INESSIVE_CASE
        elif item_name == 'INSTRUCTIVE_CASE':
            item = GrammaticalCase.INSTRUCTIVE_CASE
        elif item_name == 'INSTRUMENTAL_CASE':
            item = GrammaticalCase.INSTRUMENTAL_CASE
        elif item_name == 'LOCATIVE_CASE':
            item = GrammaticalCase.LOCATIVE_CASE
        elif item_name == 'MODAL_CASE':
            item = GrammaticalCase.MODAL_CASE
        elif item_name == 'MULTIPLICATIVE_CASE':
            item = GrammaticalCase.MULTIPLICATIVE_CASE
        elif item_name == 'NOMINATIVE_CASE':
            item = GrammaticalCase.NOMINATIVE_CASE
        elif item_name == 'OBLIQUE_CASE':
            item = GrammaticalCase.OBLIQUE_CASE
        elif item_name == 'PARTITIVE_CASE':
            item = GrammaticalCase.PARTITIVE_CASE
        elif item_name == 'PERLATIVE_CASE':
            item = GrammaticalCase.PERLATIVE_CASE
        elif item_name == 'POSSESSIVE_CASE':
            item = GrammaticalCase.POSSESSIVE_CASE
        elif item_name == 'POSTPOSITIONAL_CASE':
            item = GrammaticalCase.POSTPOSITIONAL_CASE
        elif item_name == 'PREPOSITIONAL_CASE':
            item = GrammaticalCase.PREPOSITIONAL_CASE
        elif item_name == 'PROLATIVE_CASE':
            item = GrammaticalCase.PROLATIVE_CASE
        elif item_name == 'SUBLATIVE_CASE':
            item = GrammaticalCase.SUBLATIVE_CASE
        elif item_name == 'SUPERESSIVE_CASE':
            item = GrammaticalCase.SUPERESSIVE_CASE
        elif item_name == 'TEMPORAL_CASE':
            item = GrammaticalCase.TEMPORAL_CASE
        elif item_name == 'TERMINATIVE_CASE':
            item = GrammaticalCase.TERMINATIVE_CASE
        elif item_name == 'TRANSLATIVE_CASE':
            item = GrammaticalCase.TRANSLATIVE_CASE
        elif item_name == 'VOCATIVE_CASE':
            item = GrammaticalCase.VOCATIVE_CASE
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'GrammaticalCase'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['GrammaticalCase'], reader: zserio.BitStreamReader) -> 'GrammaticalCase':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['GrammaticalCase'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'GrammaticalCase':
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