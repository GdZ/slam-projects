# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class ParkingSectionType(zserio.Enum):
    SELF = 0
    CUSTOMER = 1
    RENTAL = 2
    HOTEL = 3
    PRIVATE = 4
    VALET = 5
    AUTOMATED_VALET = 6
    AVP_DROP_OFF = 7
    AVP_PICK_UP = 8
    AVP_DROP_OFF_PICK_UP = 9

    @classmethod
    def from_name(cls: typing.Type['ParkingSectionType'], item_name: str) -> 'ParkingSectionType':
        if item_name == 'SELF':
            item = ParkingSectionType.SELF
        elif item_name == 'CUSTOMER':
            item = ParkingSectionType.CUSTOMER
        elif item_name == 'RENTAL':
            item = ParkingSectionType.RENTAL
        elif item_name == 'HOTEL':
            item = ParkingSectionType.HOTEL
        elif item_name == 'PRIVATE':
            item = ParkingSectionType.PRIVATE
        elif item_name == 'VALET':
            item = ParkingSectionType.VALET
        elif item_name == 'AUTOMATED_VALET':
            item = ParkingSectionType.AUTOMATED_VALET
        elif item_name == 'AVP_DROP_OFF':
            item = ParkingSectionType.AVP_DROP_OFF
        elif item_name == 'AVP_PICK_UP':
            item = ParkingSectionType.AVP_PICK_UP
        elif item_name == 'AVP_DROP_OFF_PICK_UP':
            item = ParkingSectionType.AVP_DROP_OFF_PICK_UP
        else:
            raise zserio.PythonRuntimeException(f"Enum item '{item_name}' doesn't exist in enum 'ParkingSectionType'!")

        return item

    @classmethod
    def from_reader(cls: typing.Type['ParkingSectionType'], reader: zserio.BitStreamReader) -> 'ParkingSectionType':
        return cls(reader.read_bits(8))

    @classmethod
    def from_reader_packed(cls: typing.Type['ParkingSectionType'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'ParkingSectionType':
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
