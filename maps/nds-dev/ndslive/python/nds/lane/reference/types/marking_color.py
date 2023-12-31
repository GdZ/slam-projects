# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class MarkingColor(zserio.Enum):
    UNKNOWN = 0
    WHITE = 1
    LIGHT_GRAY = 2
    GRAY = 3
    DARK_GRAY = 4
    BLACK = 5
    RED = 6
    YELLOW = 7
    GREEN = 8
    CYAN = 9
    BLUE = 10
    ORANGE = 11
    PURPLE = 12

    @classmethod
    def from_name(cls: typing.Type['MarkingColor'], item_name: str) -> 'MarkingColor':
        if item_name == 'UNKNOWN':
            item = MarkingColor.UNKNOWN
        elif item_name == 'WHITE':
            item = MarkingColor.WHITE
        elif item_name == 'LIGHT_GRAY':
            item = MarkingColor.LIGHT_GRAY
        elif item_name == 'GRAY':
            item = MarkingColor.GRAY
        elif item_name == 'DARK_GRAY':
            item = MarkingColor.DARK_GRAY
        elif item_name == 'BLACK':
            item = MarkingColor.BLACK
        elif item_name == 'RED':
            item = MarkingColor.RED
        elif item_name == 'YELLOW':
            item = MarkingColor.YELLOW
        elif item_name == 'GREEN':
            item = MarkingColor.GREEN
        elif item_name == 'CYAN':
            item = MarkingColor.CYAN
        elif item_name == 'BLUE':
            item = MarkingColor.BLUE
        elif item_name == 'ORANGE':
            item = MarkingColor.ORANGE
        elif item_name == 'PURPLE':
            item = MarkingColor.PURPLE
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'MarkingColor'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['MarkingColor'], reader: zserio.BitStreamReader) -> 'MarkingColor':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['MarkingColor'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'MarkingColor':
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
