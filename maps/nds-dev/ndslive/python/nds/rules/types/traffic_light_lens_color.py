# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TrafficLightLensColor(zserio.Enum):
    UNKNOWN = 0
    RED = 1
    AMBER = 2
    GREEN = 3
    WHITE = 4
    BLUE = 5
    OTHER_COLOR = 6

    @classmethod
    def from_name(cls: typing.Type['TrafficLightLensColor'], item_name: str) -> 'TrafficLightLensColor':
        if item_name == 'UNKNOWN':
            item = TrafficLightLensColor.UNKNOWN
        elif item_name == 'RED':
            item = TrafficLightLensColor.RED
        elif item_name == 'AMBER':
            item = TrafficLightLensColor.AMBER
        elif item_name == 'GREEN':
            item = TrafficLightLensColor.GREEN
        elif item_name == 'WHITE':
            item = TrafficLightLensColor.WHITE
        elif item_name == 'BLUE':
            item = TrafficLightLensColor.BLUE
        elif item_name == 'OTHER_COLOR':
            item = TrafficLightLensColor.OTHER_COLOR
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'TrafficLightLensColor'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['TrafficLightLensColor'], reader: zserio.BitStreamReader) -> 'TrafficLightLensColor':
        return cls(reader.read_bits(3))

    @classmethod
    def from_reader_packed(cls: typing.Type['TrafficLightLensColor'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TrafficLightLensColor':
        return cls(delta_context.read(zserio.array.BitFieldArrayTraits(3),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(3),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 3

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(3),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self.value, 3)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(3), writer, self.value)
