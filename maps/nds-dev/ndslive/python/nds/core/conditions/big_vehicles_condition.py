# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.vehicle.big_vehicle_types

class BigVehiclesCondition:
    def __init__(
            self,
            big_vehicles_: typing.Union[nds.core.vehicle.big_vehicle_types.BigVehicleTypes, None] = None,
            is_inclusive_: bool = bool()) -> None:
        self._big_vehicles_ = big_vehicles_
        self._is_inclusive_ = is_inclusive_

    @classmethod
    def from_reader(
            cls: typing.Type['BigVehiclesCondition'],
            zserio_reader: zserio.BitStreamReader) -> 'BigVehiclesCondition':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['BigVehiclesCondition'],
            zserio_context: BigVehiclesCondition.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'BigVehiclesCondition':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, BigVehiclesCondition):
            return ((self._big_vehicles_ == other._big_vehicles_) and
                    (self._is_inclusive_ == other._is_inclusive_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._big_vehicles_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._is_inclusive_)

        return result

    @property
    def big_vehicles(self) -> typing.Union[nds.core.vehicle.big_vehicle_types.BigVehicleTypes, None]:
        return self._big_vehicles_

    @big_vehicles.setter
    def big_vehicles(self, big_vehicles_: typing.Union[nds.core.vehicle.big_vehicle_types.BigVehicleTypes, None]) -> None:
        self._big_vehicles_ = big_vehicles_

    @property
    def is_inclusive(self) -> bool:
        return self._is_inclusive_

    @is_inclusive.setter
    def is_inclusive(self, is_inclusive_: bool) -> None:
        self._is_inclusive_ = is_inclusive_

    def init_packing_context(self, zserio_context: BigVehiclesCondition.ZserioPackingContext) -> None:
        self._big_vehicles_.init_packing_context(zserio_context.big_vehicles)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._big_vehicles_.bitsizeof(end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: BigVehiclesCondition.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._big_vehicles_.bitsizeof_packed(zserio_context.big_vehicles, end_bitposition)
        end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._big_vehicles_.initialize_offsets(end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: BigVehiclesCondition.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._big_vehicles_.initialize_offsets_packed(zserio_context.big_vehicles, end_bitposition)
        end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._big_vehicles_ = nds.core.vehicle.big_vehicle_types.BigVehicleTypes.from_reader(zserio_reader)
        self._is_inclusive_ = zserio_reader.read_bool()

    def read_packed(self, zserio_context: BigVehiclesCondition.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._big_vehicles_ = nds.core.vehicle.big_vehicle_types.BigVehicleTypes.from_reader_packed(zserio_context.big_vehicles, zserio_reader)

        self._is_inclusive_ = zserio_reader.read_bool()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._big_vehicles_.write(zserio_writer)
        zserio_writer.write_bool(self._is_inclusive_)

    def write_packed(self, zserio_context: BigVehiclesCondition.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._big_vehicles_.write_packed(zserio_context.big_vehicles, zserio_writer)

        zserio_writer.write_bool(self._is_inclusive_)

    class ZserioPackingContext:
        def __init__(self):
            self._big_vehicles_ = zserio.array.DeltaContext()

        @property
        def big_vehicles(self):
            return self._big_vehicles_