# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class MarkingBoundaryType(zserio.Enum):
    DASHED_LINE = 0
    SOLID_LINE = 1
    SHADED_AREA_BORDER = 2
    DASHED_BLOCKS = 3
    CROSSING_ALERT = 4
    UNKNOWN = 255

    @classmethod
    def from_name(cls: typing.Type['MarkingBoundaryType'], item_name: str) -> 'MarkingBoundaryType':
        if item_name == 'DASHED_LINE':
            item = MarkingBoundaryType.DASHED_LINE
        elif item_name == 'SOLID_LINE':
            item = MarkingBoundaryType.SOLID_LINE
        elif item_name == 'SHADED_AREA_BORDER':
            item = MarkingBoundaryType.SHADED_AREA_BORDER
        elif item_name == 'DASHED_BLOCKS':
            item = MarkingBoundaryType.DASHED_BLOCKS
        elif item_name == 'CROSSING_ALERT':
            item = MarkingBoundaryType.CROSSING_ALERT
        elif item_name == 'UNKNOWN':
            item = MarkingBoundaryType.UNKNOWN
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'MarkingBoundaryType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['MarkingBoundaryType'], reader: zserio.BitStreamReader) -> 'MarkingBoundaryType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['MarkingBoundaryType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'MarkingBoundaryType':
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
