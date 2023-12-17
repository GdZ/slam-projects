# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class TileServiceCapabilities:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['TileServiceCapabilities'], value: int) -> 'TileServiceCapabilities':
        if value < 0 or value > 65535:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'TileServiceCapabilities' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['TileServiceCapabilities'], reader: zserio.BitStreamReader) -> 'TileServiceCapabilities':
        instance = cls()
        instance._value = reader.read_bits(16)
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['TileServiceCapabilities'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'TileServiceCapabilities':
        instance = cls()
        instance._value = delta_context.read(zserio.array.BitFieldArrayTraits(16),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, TileServiceCapabilities):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & TileServiceCapabilities.Values.GET_LAYER_BY_TILE_ID) == TileServiceCapabilities.Values.GET_LAYER_BY_TILE_ID:
            result += "GET_LAYER_BY_TILE_ID" if not result else " | GET_LAYER_BY_TILE_ID"
        if (self & TileServiceCapabilities.Values.GET_LAYER_BY_TILE_ID_LIST) == TileServiceCapabilities.Values.GET_LAYER_BY_TILE_ID_LIST:
            result += "GET_LAYER_BY_TILE_ID_LIST" if not result else " | GET_LAYER_BY_TILE_ID_LIST"
        if (self & TileServiceCapabilities.Values.GET_HEADER_ONLY_BY_TILE_ID) == TileServiceCapabilities.Values.GET_HEADER_ONLY_BY_TILE_ID:
            result += "GET_HEADER_ONLY_BY_TILE_ID" if not result else " | GET_HEADER_ONLY_BY_TILE_ID"
        if (self & TileServiceCapabilities.Values.GET_HEADER_ONLY_BY_TILE_ID_LIST) == TileServiceCapabilities.Values.GET_HEADER_ONLY_BY_TILE_ID_LIST:
            result += "GET_HEADER_ONLY_BY_TILE_ID_LIST" if not result else " | GET_HEADER_ONLY_BY_TILE_ID_LIST"
        if (self & TileServiceCapabilities.Values.GET_HEADER_ONLY_LIST_IN_TILE) == TileServiceCapabilities.Values.GET_HEADER_ONLY_LIST_IN_TILE:
            result += "GET_HEADER_ONLY_LIST_IN_TILE" if not result else " | GET_HEADER_ONLY_LIST_IN_TILE"
        if (self & TileServiceCapabilities.Values.TOPIC_NDS_SMART_TILE_UPDATE) == TileServiceCapabilities.Values.TOPIC_NDS_SMART_TILE_UPDATE:
            result += "TOPIC_NDS_SMART_TILE_UPDATE" if not result else " | TOPIC_NDS_SMART_TILE_UPDATE"
        if (self & TileServiceCapabilities.Values.GET_DELTA_LAYER_BY_TILE_ID) == TileServiceCapabilities.Values.GET_DELTA_LAYER_BY_TILE_ID:
            result += "GET_DELTA_LAYER_BY_TILE_ID" if not result else " | GET_DELTA_LAYER_BY_TILE_ID"
        if (self & TileServiceCapabilities.Values.GET_DELTA_LAYER_BY_TILE_ID_LIST) == TileServiceCapabilities.Values.GET_DELTA_LAYER_BY_TILE_ID_LIST:
            result += "GET_DELTA_LAYER_BY_TILE_ID_LIST" if not result else " | GET_DELTA_LAYER_BY_TILE_ID_LIST"
        if (self & TileServiceCapabilities.Values.GET_LAYER_BY_TILE_VERSION) == TileServiceCapabilities.Values.GET_LAYER_BY_TILE_VERSION:
            result += "GET_LAYER_BY_TILE_VERSION" if not result else " | GET_LAYER_BY_TILE_VERSION"
        if (self & TileServiceCapabilities.Values.GET_LAYER_BY_TILE_VERSION_LIST) == TileServiceCapabilities.Values.GET_LAYER_BY_TILE_VERSION_LIST:
            result += "GET_LAYER_BY_TILE_VERSION_LIST" if not result else " | GET_LAYER_BY_TILE_VERSION_LIST"
        if (self & TileServiceCapabilities.Values.GET_SINGLE_DATA_LAYER_BY_TILE_ID) == TileServiceCapabilities.Values.GET_SINGLE_DATA_LAYER_BY_TILE_ID:
            result += "GET_SINGLE_DATA_LAYER_BY_TILE_ID" if not result else " | GET_SINGLE_DATA_LAYER_BY_TILE_ID"
        if (self & TileServiceCapabilities.Values.GET_DATA_LAYER_LIST_BY_TILE_ID_LIST) == TileServiceCapabilities.Values.GET_DATA_LAYER_LIST_BY_TILE_ID_LIST:
            result += "GET_DATA_LAYER_LIST_BY_TILE_ID_LIST" if not result else " | GET_DATA_LAYER_LIST_BY_TILE_ID_LIST"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'TileServiceCapabilities') -> 'TileServiceCapabilities':
        return TileServiceCapabilities.from_value(self._value | other._value)

    def __and__(self, other: 'TileServiceCapabilities') -> 'TileServiceCapabilities':
        return TileServiceCapabilities.from_value(self._value & other._value)

    def __xor__(self, other: 'TileServiceCapabilities') -> 'TileServiceCapabilities':
        return TileServiceCapabilities.from_value(self._value ^ other._value)

    def __invert__(self) -> 'TileServiceCapabilities':
        return TileServiceCapabilities.from_value(~self._value & 65535)

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.BitFieldArrayTraits(16), self._value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return 16

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.BitFieldArrayTraits(16),
                                       self._value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_bits(self._value, 16)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.BitFieldArrayTraits(16),
                            writer, self._value)

    @property
    def value(self) -> int:
        return self._value

    class Values:
        GET_LAYER_BY_TILE_ID: 'TileServiceCapabilities' = None
        GET_LAYER_BY_TILE_ID_LIST: 'TileServiceCapabilities' = None
        GET_HEADER_ONLY_BY_TILE_ID: 'TileServiceCapabilities' = None
        GET_HEADER_ONLY_BY_TILE_ID_LIST: 'TileServiceCapabilities' = None
        GET_HEADER_ONLY_LIST_IN_TILE: 'TileServiceCapabilities' = None
        TOPIC_NDS_SMART_TILE_UPDATE: 'TileServiceCapabilities' = None
        GET_DELTA_LAYER_BY_TILE_ID: 'TileServiceCapabilities' = None
        GET_DELTA_LAYER_BY_TILE_ID_LIST: 'TileServiceCapabilities' = None
        GET_LAYER_BY_TILE_VERSION: 'TileServiceCapabilities' = None
        GET_LAYER_BY_TILE_VERSION_LIST: 'TileServiceCapabilities' = None
        GET_SINGLE_DATA_LAYER_BY_TILE_ID: 'TileServiceCapabilities' = None
        GET_DATA_LAYER_LIST_BY_TILE_ID_LIST: 'TileServiceCapabilities' = None

TileServiceCapabilities.Values.GET_LAYER_BY_TILE_ID = TileServiceCapabilities.from_value(1)
TileServiceCapabilities.Values.GET_LAYER_BY_TILE_ID_LIST = TileServiceCapabilities.from_value(2)
TileServiceCapabilities.Values.GET_HEADER_ONLY_BY_TILE_ID = TileServiceCapabilities.from_value(4)
TileServiceCapabilities.Values.GET_HEADER_ONLY_BY_TILE_ID_LIST = TileServiceCapabilities.from_value(8)
TileServiceCapabilities.Values.GET_HEADER_ONLY_LIST_IN_TILE = TileServiceCapabilities.from_value(16)
TileServiceCapabilities.Values.TOPIC_NDS_SMART_TILE_UPDATE = TileServiceCapabilities.from_value(32)
TileServiceCapabilities.Values.GET_DELTA_LAYER_BY_TILE_ID = TileServiceCapabilities.from_value(64)
TileServiceCapabilities.Values.GET_DELTA_LAYER_BY_TILE_ID_LIST = TileServiceCapabilities.from_value(128)
TileServiceCapabilities.Values.GET_LAYER_BY_TILE_VERSION = TileServiceCapabilities.from_value(256)
TileServiceCapabilities.Values.GET_LAYER_BY_TILE_VERSION_LIST = TileServiceCapabilities.from_value(512)
TileServiceCapabilities.Values.GET_SINGLE_DATA_LAYER_BY_TILE_ID = TileServiceCapabilities.from_value(1024)
TileServiceCapabilities.Values.GET_DATA_LAYER_LIST_BY_TILE_ID_LIST = TileServiceCapabilities.from_value(2048)