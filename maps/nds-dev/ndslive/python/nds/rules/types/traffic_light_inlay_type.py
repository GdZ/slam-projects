# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TrafficLightInlayType(zserio.Enum):
    UNKNOWN = 0
    NONE = 1
    ARROW_UP = 2
    ARROW_DOWN = 3
    ARROW_LEFT = 4
    ARROW_UP_LEFT = 5
    ARROW_DOWN_LEFT = 6
    ARROW_RIGHT = 7
    ARROW_UP_RIGHT = 8
    ARROW_DOWN_RIGHT = 9
    ARROW_U_TURN = 10
    ARROW_LEFT_RIGHT = 11
    ARROW_STRAIGHT_LEFT = 12
    ARROW_STRAIGHT_RIGHT = 13
    ARROW_STRAIGHT_LEFT_RIGHT = 14
    PEDESTRIAN = 15
    BICYCLE = 16
    PEDESTRIAN_BICYCLE = 17
    HAND = 18
    TRAM = 19
    BUS = 20
    COUNTDOWN = 21
    BAR_HORIZONTAL = 22
    BAR_STRAIGHT = 23
    BAR_LEFT = 24
    BAR_RIGHT = 25
    BAR_DOUBLE_STRAIGHT = 26
    TRIANGLE = 27
    CIRCLE = 28
    PLUS = 29
    CROSS = 30
    CIRCLE_RING = 31
    CIRCLE_MATRIX = 32
    LETTER = 33
    TEXT = 34
    NUMBERS = 35
    OTHER = 36

    @classmethod
    def from_name(cls: typing.Type['TrafficLightInlayType'], item_name: str) -> 'TrafficLightInlayType':
        if item_name == 'UNKNOWN':
            item = TrafficLightInlayType.UNKNOWN
        elif item_name == 'NONE':
            item = TrafficLightInlayType.NONE
        elif item_name == 'ARROW_UP':
            item = TrafficLightInlayType.ARROW_UP
        elif item_name == 'ARROW_DOWN':
            item = TrafficLightInlayType.ARROW_DOWN
        elif item_name == 'ARROW_LEFT':
            item = TrafficLightInlayType.ARROW_LEFT
        elif item_name == 'ARROW_UP_LEFT':
            item = TrafficLightInlayType.ARROW_UP_LEFT
        elif item_name == 'ARROW_DOWN_LEFT':
            item = TrafficLightInlayType.ARROW_DOWN_LEFT
        elif item_name == 'ARROW_RIGHT':
            item = TrafficLightInlayType.ARROW_RIGHT
        elif item_name == 'ARROW_UP_RIGHT':
            item = TrafficLightInlayType.ARROW_UP_RIGHT
        elif item_name == 'ARROW_DOWN_RIGHT':
            item = TrafficLightInlayType.ARROW_DOWN_RIGHT
        elif item_name == 'ARROW_U_TURN':
            item = TrafficLightInlayType.ARROW_U_TURN
        elif item_name == 'ARROW_LEFT_RIGHT':
            item = TrafficLightInlayType.ARROW_LEFT_RIGHT
        elif item_name == 'ARROW_STRAIGHT_LEFT':
            item = TrafficLightInlayType.ARROW_STRAIGHT_LEFT
        elif item_name == 'ARROW_STRAIGHT_RIGHT':
            item = TrafficLightInlayType.ARROW_STRAIGHT_RIGHT
        elif item_name == 'ARROW_STRAIGHT_LEFT_RIGHT':
            item = TrafficLightInlayType.ARROW_STRAIGHT_LEFT_RIGHT
        elif item_name == 'PEDESTRIAN':
            item = TrafficLightInlayType.PEDESTRIAN
        elif item_name == 'BICYCLE':
            item = TrafficLightInlayType.BICYCLE
        elif item_name == 'PEDESTRIAN_BICYCLE':
            item = TrafficLightInlayType.PEDESTRIAN_BICYCLE
        elif item_name == 'HAND':
            item = TrafficLightInlayType.HAND
        elif item_name == 'TRAM':
            item = TrafficLightInlayType.TRAM
        elif item_name == 'BUS':
            item = TrafficLightInlayType.BUS
        elif item_name == 'COUNTDOWN':
            item = TrafficLightInlayType.COUNTDOWN
        elif item_name == 'BAR_HORIZONTAL':
            item = TrafficLightInlayType.BAR_HORIZONTAL
        elif item_name == 'BAR_STRAIGHT':
            item = TrafficLightInlayType.BAR_STRAIGHT
        elif item_name == 'BAR_LEFT':
            item = TrafficLightInlayType.BAR_LEFT
        elif item_name == 'BAR_RIGHT':
            item = TrafficLightInlayType.BAR_RIGHT
        elif item_name == 'BAR_DOUBLE_STRAIGHT':
            item = TrafficLightInlayType.BAR_DOUBLE_STRAIGHT
        elif item_name == 'TRIANGLE':
            item = TrafficLightInlayType.TRIANGLE
        elif item_name == 'CIRCLE':
            item = TrafficLightInlayType.CIRCLE
        elif item_name == 'PLUS':
            item = TrafficLightInlayType.PLUS
        elif item_name == 'CROSS':
            item = TrafficLightInlayType.CROSS
        elif item_name == 'CIRCLE_RING':
            item = TrafficLightInlayType.CIRCLE_RING
        elif item_name == 'CIRCLE_MATRIX':
            item = TrafficLightInlayType.CIRCLE_MATRIX
        elif item_name == 'LETTER':
            item = TrafficLightInlayType.LETTER
        elif item_name == 'TEXT':
            item = TrafficLightInlayType.TEXT
        elif item_name == 'NUMBERS':
            item = TrafficLightInlayType.NUMBERS
        elif item_name == 'OTHER':
            item = TrafficLightInlayType.OTHER
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'TrafficLightInlayType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['TrafficLightInlayType'], reader: zserio.BitStreamReader) -> 'TrafficLightInlayType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['TrafficLightInlayType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TrafficLightInlayType':
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
