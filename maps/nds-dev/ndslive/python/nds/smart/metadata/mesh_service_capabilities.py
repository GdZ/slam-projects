# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class MeshServiceCapabilities:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['MeshServiceCapabilities'], value: int) -> 'MeshServiceCapabilities':
        if value < 0 or value > 65535:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'MeshServiceCapabilities' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['MeshServiceCapabilities'], reader: zserio.BitStreamReader) -> 'MeshServiceCapabilities':
        instance = cls()
        instance._value = reader.read_bits(16)
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['MeshServiceCapabilities'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'MeshServiceCapabilities':
        instance = cls()
        instance._value = delta_context.read(zserio.array.BitFieldArrayTraits(16),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, MeshServiceCapabilities):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & MeshServiceCapabilities.Values.GET_MESH_INDEX_BY_TILE_ID) == MeshServiceCapabilities.Values.GET_MESH_INDEX_BY_TILE_ID:
            result += "GET_MESH_INDEX_BY_TILE_ID" if not result else " | GET_MESH_INDEX_BY_TILE_ID"
        if (self & MeshServiceCapabilities.Values.GET_MESH_BY_ID) == MeshServiceCapabilities.Values.GET_MESH_BY_ID:
            result += "GET_MESH_BY_ID" if not result else " | GET_MESH_BY_ID"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'MeshServiceCapabilities') -> 'MeshServiceCapabilities':
        return MeshServiceCapabilities.from_value(self._value | other._value)

    def __and__(self, other: 'MeshServiceCapabilities') -> 'MeshServiceCapabilities':
        return MeshServiceCapabilities.from_value(self._value & other._value)

    def __xor__(self, other: 'MeshServiceCapabilities') -> 'MeshServiceCapabilities':
        return MeshServiceCapabilities.from_value(self._value ^ other._value)

    def __invert__(self) -> 'MeshServiceCapabilities':
        return MeshServiceCapabilities.from_value(~self._value & 65535)

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
        GET_MESH_INDEX_BY_TILE_ID: 'MeshServiceCapabilities' = None
        GET_MESH_BY_ID: 'MeshServiceCapabilities' = None

MeshServiceCapabilities.Values.GET_MESH_INDEX_BY_TILE_ID = MeshServiceCapabilities.from_value(1)
MeshServiceCapabilities.Values.GET_MESH_BY_ID = MeshServiceCapabilities.from_value(2)
