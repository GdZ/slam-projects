# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class Population(zserio.Enum):
    POPULATION_SMALL = 0
    POPULATION_5K = 1
    POPULATION_10K = 2
    POPULATION_50K = 3
    POPULATION_100K = 4
    POPULATION_500K = 5
    POPULATION_1M = 6
    POPULATION_5M = 7
    POPULATION_10M = 8
    POPULATION_15M = 9
    POPULATION_20M = 10
    POPULATION_25M = 11
    POPULATION_30M = 12
    POPULATION_35M = 13
    POPULATION_40M = 14

    @classmethod
    def from_name(cls: typing.Type['Population'], item_name: str) -> 'Population':
        if item_name == 'POPULATION_SMALL':
            item = Population.POPULATION_SMALL
        elif item_name == 'POPULATION_5K':
            item = Population.POPULATION_5K
        elif item_name == 'POPULATION_10K':
            item = Population.POPULATION_10K
        elif item_name == 'POPULATION_50K':
            item = Population.POPULATION_50K
        elif item_name == 'POPULATION_100K':
            item = Population.POPULATION_100K
        elif item_name == 'POPULATION_500K':
            item = Population.POPULATION_500K
        elif item_name == 'POPULATION_1M':
            item = Population.POPULATION_1M
        elif item_name == 'POPULATION_5M':
            item = Population.POPULATION_5M
        elif item_name == 'POPULATION_10M':
            item = Population.POPULATION_10M
        elif item_name == 'POPULATION_15M':
            item = Population.POPULATION_15M
        elif item_name == 'POPULATION_20M':
            item = Population.POPULATION_20M
        elif item_name == 'POPULATION_25M':
            item = Population.POPULATION_25M
        elif item_name == 'POPULATION_30M':
            item = Population.POPULATION_30M
        elif item_name == 'POPULATION_35M':
            item = Population.POPULATION_35M
        elif item_name == 'POPULATION_40M':
            item = Population.POPULATION_40M
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'Population'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['Population'], reader: zserio.BitStreamReader) -> 'Population':
        return cls(reader.read_bits(4))

    @classmethod
    def from_reader_packed(cls: typing.Type['Population'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'Population':
        return cls(delta_context.read(zserio.array.BitFieldArrayTraits(4),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(4),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 4

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(4),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self.value, 4)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(4), writer, self.value)