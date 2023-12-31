# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class RoadSurfacePolygonLogicalType(zserio.Enum):
    UNKNOWN = 0
    CROSSWALK = 1
    BICYCLE_CROSSING = 2
    INTERSECTION = 3
    MARKING_POLYGON = 4
    GORE = 5
    WALKING_AREA = 6
    DRIVEWAY = 7
    ROUNDABOUT = 8
    PEDESTRIAN_WAITING_AREA = 9
    BICYCLE_WAITING_AREA = 10
    PARKING = 11
    CONSTRUCTION_AREA = 12
    BUS_STOP = 13
    TRAM_STOP = 14
    TRAM_CROSSING = 15
    TRAM_TRACK = 16
    NO_STOP_ZONE = 17
    DRIVABLE = 18
    NON_DRIVABLE = 19
    UNDESIRABLE = 20

    @classmethod
    def from_name(cls: typing.Type['RoadSurfacePolygonLogicalType'], item_name: str) -> 'RoadSurfacePolygonLogicalType':
        if item_name == 'UNKNOWN':
            item = RoadSurfacePolygonLogicalType.UNKNOWN
        elif item_name == 'CROSSWALK':
            item = RoadSurfacePolygonLogicalType.CROSSWALK
        elif item_name == 'BICYCLE_CROSSING':
            item = RoadSurfacePolygonLogicalType.BICYCLE_CROSSING
        elif item_name == 'INTERSECTION':
            item = RoadSurfacePolygonLogicalType.INTERSECTION
        elif item_name == 'MARKING_POLYGON':
            item = RoadSurfacePolygonLogicalType.MARKING_POLYGON
        elif item_name == 'GORE':
            item = RoadSurfacePolygonLogicalType.GORE
        elif item_name == 'WALKING_AREA':
            item = RoadSurfacePolygonLogicalType.WALKING_AREA
        elif item_name == 'DRIVEWAY':
            item = RoadSurfacePolygonLogicalType.DRIVEWAY
        elif item_name == 'ROUNDABOUT':
            item = RoadSurfacePolygonLogicalType.ROUNDABOUT
        elif item_name == 'PEDESTRIAN_WAITING_AREA':
            item = RoadSurfacePolygonLogicalType.PEDESTRIAN_WAITING_AREA
        elif item_name == 'BICYCLE_WAITING_AREA':
            item = RoadSurfacePolygonLogicalType.BICYCLE_WAITING_AREA
        elif item_name == 'PARKING':
            item = RoadSurfacePolygonLogicalType.PARKING
        elif item_name == 'CONSTRUCTION_AREA':
            item = RoadSurfacePolygonLogicalType.CONSTRUCTION_AREA
        elif item_name == 'BUS_STOP':
            item = RoadSurfacePolygonLogicalType.BUS_STOP
        elif item_name == 'TRAM_STOP':
            item = RoadSurfacePolygonLogicalType.TRAM_STOP
        elif item_name == 'TRAM_CROSSING':
            item = RoadSurfacePolygonLogicalType.TRAM_CROSSING
        elif item_name == 'TRAM_TRACK':
            item = RoadSurfacePolygonLogicalType.TRAM_TRACK
        elif item_name == 'NO_STOP_ZONE':
            item = RoadSurfacePolygonLogicalType.NO_STOP_ZONE
        elif item_name == 'DRIVABLE':
            item = RoadSurfacePolygonLogicalType.DRIVABLE
        elif item_name == 'NON_DRIVABLE':
            item = RoadSurfacePolygonLogicalType.NON_DRIVABLE
        elif item_name == 'UNDESIRABLE':
            item = RoadSurfacePolygonLogicalType.UNDESIRABLE
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'RoadSurfacePolygonLogicalType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['RoadSurfacePolygonLogicalType'], reader: zserio.BitStreamReader) -> 'RoadSurfacePolygonLogicalType':
        return cls(reader.read_varuint32())

    @classmethod
    def from_reader_packed(cls: typing.Type['RoadSurfacePolygonLogicalType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'RoadSurfacePolygonLogicalType':
        return cls(delta_context.read(zserio.array.VarUInt32ArrayTraits(),
                                      reader))

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self.value)
        return result

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt32ArrayTraits(),
                           self.value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint32(self.value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt32ArrayTraits(),
                                       self.value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint32(self.value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt32ArrayTraits(), writer, self.value)
