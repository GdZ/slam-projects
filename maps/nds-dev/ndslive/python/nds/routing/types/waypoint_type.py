# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class WaypointType(zserio.Enum):
    DESTINATION = 0
    ORIGIN = 1
    STOPOVER = 2
    VIA_POINT = 3
    EV_RECHARGE = 4
    REFUEL = 5
    REST_STOP = 6
    HOME = 7
    WORK = 8
    USER = 9
    DESTINATION_FINAL = 10

    @classmethod
    def from_name(cls: typing.Type['WaypointType'], item_name: str) -> 'WaypointType':
        if item_name == 'DESTINATION':
            item = WaypointType.DESTINATION
        elif item_name == 'ORIGIN':
            item = WaypointType.ORIGIN
        elif item_name == 'STOPOVER':
            item = WaypointType.STOPOVER
        elif item_name == 'VIA_POINT':
            item = WaypointType.VIA_POINT
        elif item_name == 'EV_RECHARGE':
            item = WaypointType.EV_RECHARGE
        elif item_name == 'REFUEL':
            item = WaypointType.REFUEL
        elif item_name == 'REST_STOP':
            item = WaypointType.REST_STOP
        elif item_name == 'HOME':
            item = WaypointType.HOME
        elif item_name == 'WORK':
            item = WaypointType.WORK
        elif item_name == 'USER':
            item = WaypointType.USER
        elif item_name == 'DESTINATION_FINAL':
            item = WaypointType.DESTINATION_FINAL
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'WaypointType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['WaypointType'], reader: zserio.BitStreamReader) -> 'WaypointType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['WaypointType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'WaypointType':
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
