# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class StationStopType(zserio.Enum):
    NO_STOP = 0
    SLOW_DOWN = 1
    STOP = 2

    @classmethod
    def from_name(cls: typing.Type['StationStopType'], item_name: str) -> 'StationStopType':
        if item_name == 'NO_STOP':
            item = StationStopType.NO_STOP
        elif item_name == 'SLOW_DOWN':
            item = StationStopType.SLOW_DOWN
        elif item_name == 'STOP':
            item = StationStopType.STOP
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'StationStopType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['StationStopType'], reader: zserio.BitStreamReader) -> 'StationStopType':
        return cls(reader.read_bits(4))

    @classmethod
    def from_reader_packed(cls: typing.Type['StationStopType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'StationStopType':
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