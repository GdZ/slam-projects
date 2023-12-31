# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class GeometryLayerType(zserio.Enum):
    POSITION_2D = 0
    POSITION_3D = 1
    LINE_2D = 2
    LINE_3D = 3
    POLYGON_2D = 4
    POLYGON_3D = 5
    MESH_3D = 6
    SIMPLE_POLYGON_2D = 7
    SIMPLE_POLYGON_SET_2D = 8

    @classmethod
    def from_name(cls: typing.Type['GeometryLayerType'], item_name: str) -> 'GeometryLayerType':
        if item_name == 'POSITION_2D':
            item = GeometryLayerType.POSITION_2D
        elif item_name == 'POSITION_3D':
            item = GeometryLayerType.POSITION_3D
        elif item_name == 'LINE_2D':
            item = GeometryLayerType.LINE_2D
        elif item_name == 'LINE_3D':
            item = GeometryLayerType.LINE_3D
        elif item_name == 'POLYGON_2D':
            item = GeometryLayerType.POLYGON_2D
        elif item_name == 'POLYGON_3D':
            item = GeometryLayerType.POLYGON_3D
        elif item_name == 'MESH_3D':
            item = GeometryLayerType.MESH_3D
        elif item_name == 'SIMPLE_POLYGON_2D':
            item = GeometryLayerType.SIMPLE_POLYGON_2D
        elif item_name == 'SIMPLE_POLYGON_SET_2D':
            item = GeometryLayerType.SIMPLE_POLYGON_SET_2D
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'GeometryLayerType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['GeometryLayerType'], reader: zserio.BitStreamReader) -> 'GeometryLayerType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['GeometryLayerType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'GeometryLayerType':
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
