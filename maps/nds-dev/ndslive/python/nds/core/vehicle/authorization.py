# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class Authorization:
    def __init__(self) -> None:
        self._value = 0

    @classmethod
    def from_value(cls: typing.Type['Authorization'], value: int) -> 'Authorization':
        if value < 0 or value > 536870911:
            raise zserio.PythonRuntimeException(f"Value for bitmask 'Authorization' out of bounds: {value}!")

        instance = cls()
        instance._value = value
        return instance

    @classmethod
    def from_reader(cls: typing.Type['Authorization'], reader: zserio.BitStreamReader) -> 'Authorization':
        instance = cls()
        instance._value = reader.read_varuint32()
        return instance

    @classmethod
    def from_reader_packed(cls: typing.Type['Authorization'],
                           delta_context: zserio.array.DeltaContext,
                           reader: zserio.BitStreamReader) -> 'Authorization':
        instance = cls()
        instance._value = delta_context.read(zserio.array.VarUInt32ArrayTraits(),
                                             reader)
        return instance

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Authorization):
            return self._value == other._value

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._value)
        return result

    def __str__(self) -> str:
        result = ""

        if (self & Authorization.Values.RESIDENTIAL) == Authorization.Values.RESIDENTIAL:
            result += "RESIDENTIAL" if not result else " | RESIDENTIAL"
        if (self & Authorization.Values.AGRICULTURAL) == Authorization.Values.AGRICULTURAL:
            result += "AGRICULTURAL" if not result else " | AGRICULTURAL"
        if (self & Authorization.Values.FORESTRY) == Authorization.Values.FORESTRY:
            result += "FORESTRY" if not result else " | FORESTRY"
        if (self & Authorization.Values.MILITARY) == Authorization.Values.MILITARY:
            result += "MILITARY" if not result else " | MILITARY"
        if (self & Authorization.Values.FACILITY) == Authorization.Values.FACILITY:
            result += "FACILITY" if not result else " | FACILITY"
        if (self & Authorization.Values.EMPLOYEES) == Authorization.Values.EMPLOYEES:
            result += "EMPLOYEES" if not result else " | EMPLOYEES"
        if (self & Authorization.Values.DELIVERY) == Authorization.Values.DELIVERY:
            result += "DELIVERY" if not result else " | DELIVERY"
        if (self & Authorization.Values.DISABLED_PERSONS) == Authorization.Values.DISABLED_PERSONS:
            result += "DISABLED_PERSONS" if not result else " | DISABLED_PERSONS"
        if (self & Authorization.Values.SPECIAL_AUTHORIZATION) == Authorization.Values.SPECIAL_AUTHORIZATION:
            result += "SPECIAL_AUTHORIZATION" if not result else " | SPECIAL_AUTHORIZATION"
        if (self & Authorization.Values.FOREIGN_VEHICLE) == Authorization.Values.FOREIGN_VEHICLE:
            result += "FOREIGN_VEHICLE" if not result else " | FOREIGN_VEHICLE"
        if (self & Authorization.Values.LOCAL_VEHICLE) == Authorization.Values.LOCAL_VEHICLE:
            result += "LOCAL_VEHICLE" if not result else " | LOCAL_VEHICLE"
        if (self & Authorization.Values.FEE_PAID) == Authorization.Values.FEE_PAID:
            result += "FEE_PAID" if not result else " | FEE_PAID"
        if (self & Authorization.Values.REGISTERED_LICENSE_PLATE) == Authorization.Values.REGISTERED_LICENSE_PLATE:
            result += "REGISTERED_LICENSE_PLATE" if not result else " | REGISTERED_LICENSE_PLATE"

        return str(self._value) + "[" + result + "]"

    def __or__(self, other: 'Authorization') -> 'Authorization':
        return Authorization.from_value(self._value | other._value)

    def __and__(self, other: 'Authorization') -> 'Authorization':
        return Authorization.from_value(self._value & other._value)

    def __xor__(self, other: 'Authorization') -> 'Authorization':
        return Authorization.from_value(self._value ^ other._value)

    def __invert__(self) -> 'Authorization':
        return Authorization.from_value(~self._value & 536870911)

    @staticmethod
    def create_packing_context() -> zserio.array.DeltaContext:
        return zserio.array.DeltaContext()

    def init_packing_context(self, delta_context: zserio.array.DeltaContext) -> None:
        delta_context.init(zserio.array.VarUInt32ArrayTraits(), self._value)

    def bitsizeof(self, _bitposition: int = 0) -> int:
        return zserio.bitsizeof.bitsizeof_varuint32(self._value)

    def bitsizeof_packed(self, delta_context: zserio.array.DeltaContext, _bitposition: int) -> int:
        return delta_context.bitsizeof(zserio.array.VarUInt32ArrayTraits(),
                                       self._value)

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition + self.bitsizeof(bitposition)

    def initialize_offsets_packed(self, delta_context: zserio.array.DeltaContext, bitposition: int) -> int:
        return bitposition + self.bitsizeof_packed(delta_context, bitposition)

    def write(self, writer: zserio.BitStreamWriter) -> None:
        writer.write_varuint32(self._value)

    def write_packed(self, delta_context: zserio.array.DeltaContext, writer: zserio.BitStreamWriter) -> None:
        delta_context.write(zserio.array.VarUInt32ArrayTraits(),
                            writer, self._value)

    @property
    def value(self) -> int:
        return self._value

    class Values:
        RESIDENTIAL: 'Authorization' = None
        AGRICULTURAL: 'Authorization' = None
        FORESTRY: 'Authorization' = None
        MILITARY: 'Authorization' = None
        FACILITY: 'Authorization' = None
        EMPLOYEES: 'Authorization' = None
        DELIVERY: 'Authorization' = None
        DISABLED_PERSONS: 'Authorization' = None
        SPECIAL_AUTHORIZATION: 'Authorization' = None
        FOREIGN_VEHICLE: 'Authorization' = None
        LOCAL_VEHICLE: 'Authorization' = None
        FEE_PAID: 'Authorization' = None
        REGISTERED_LICENSE_PLATE: 'Authorization' = None

Authorization.Values.RESIDENTIAL = Authorization.from_value(1)
Authorization.Values.AGRICULTURAL = Authorization.from_value(2)
Authorization.Values.FORESTRY = Authorization.from_value(4)
Authorization.Values.MILITARY = Authorization.from_value(8)
Authorization.Values.FACILITY = Authorization.from_value(16)
Authorization.Values.EMPLOYEES = Authorization.from_value(32)
Authorization.Values.DELIVERY = Authorization.from_value(64)
Authorization.Values.DISABLED_PERSONS = Authorization.from_value(128)
Authorization.Values.SPECIAL_AUTHORIZATION = Authorization.from_value(256)
Authorization.Values.FOREIGN_VEHICLE = Authorization.from_value(512)
Authorization.Values.LOCAL_VEHICLE = Authorization.from_value(1024)
Authorization.Values.FEE_PAID = Authorization.from_value(2048)
Authorization.Values.REGISTERED_LICENSE_PLATE = Authorization.from_value(4096)