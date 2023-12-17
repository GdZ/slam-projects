# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.vehicle.big_vehicle_types
import nds.core.vehicle.emergency_military_detail_types
import nds.core.vehicle.frequently_used_vehicle_types
import nds.core.vehicle.public_service_vehicle_types
import nds.core.vehicle.slow_road_user_types

class VehicleTypeInformation:
    def __init__(
            self,
            frequently_used_vehicles_: typing.Union[nds.core.vehicle.frequently_used_vehicle_types.FrequentlyUsedVehicleTypes, None] = None,
            big_vehicles_: typing.Union[nds.core.vehicle.big_vehicle_types.BigVehicleTypes, None] = None,
            public_service_vehicles_: typing.Union[nds.core.vehicle.public_service_vehicle_types.PublicServiceVehicleTypes, None] = None,
            slow_road_users_: typing.Union[nds.core.vehicle.slow_road_user_types.SlowRoadUserTypes, None] = None,
            emergency_military_details_: typing.Union[nds.core.vehicle.emergency_military_detail_types.EmergencyMilitaryDetailTypes, None] = None) -> None:
        self._frequently_used_vehicles_ = frequently_used_vehicles_
        self._big_vehicles_ = big_vehicles_
        self._public_service_vehicles_ = public_service_vehicles_
        self._slow_road_users_ = slow_road_users_
        self._emergency_military_details_ = emergency_military_details_

    @classmethod
    def from_reader(
            cls: typing.Type['VehicleTypeInformation'],
            zserio_reader: zserio.BitStreamReader) -> 'VehicleTypeInformation':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['VehicleTypeInformation'],
            zserio_context: VehicleTypeInformation.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'VehicleTypeInformation':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, VehicleTypeInformation):
            return ((self._frequently_used_vehicles_ == other._frequently_used_vehicles_) and
                    (self._big_vehicles_ == other._big_vehicles_) and
                    (self._public_service_vehicles_ == other._public_service_vehicles_) and
                    (self._slow_road_users_ == other._slow_road_users_) and
                    (self._emergency_military_details_ == other._emergency_military_details_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._frequently_used_vehicles_)
        result = zserio.hashcode.calc_hashcode_object(result, self._big_vehicles_)
        result = zserio.hashcode.calc_hashcode_object(result, self._public_service_vehicles_)
        result = zserio.hashcode.calc_hashcode_object(result, self._slow_road_users_)
        result = zserio.hashcode.calc_hashcode_object(result, self._emergency_military_details_)

        return result

    @property
    def frequently_used_vehicles(self) -> typing.Union[nds.core.vehicle.frequently_used_vehicle_types.FrequentlyUsedVehicleTypes, None]:
        return self._frequently_used_vehicles_

    @frequently_used_vehicles.setter
    def frequently_used_vehicles(self, frequently_used_vehicles_: typing.Union[nds.core.vehicle.frequently_used_vehicle_types.FrequentlyUsedVehicleTypes, None]) -> None:
        self._frequently_used_vehicles_ = frequently_used_vehicles_

    @property
    def big_vehicles(self) -> typing.Union[nds.core.vehicle.big_vehicle_types.BigVehicleTypes, None]:
        return self._big_vehicles_

    @big_vehicles.setter
    def big_vehicles(self, big_vehicles_: typing.Union[nds.core.vehicle.big_vehicle_types.BigVehicleTypes, None]) -> None:
        self._big_vehicles_ = big_vehicles_

    @property
    def public_service_vehicles(self) -> typing.Union[nds.core.vehicle.public_service_vehicle_types.PublicServiceVehicleTypes, None]:
        return self._public_service_vehicles_

    @public_service_vehicles.setter
    def public_service_vehicles(self, public_service_vehicles_: typing.Union[nds.core.vehicle.public_service_vehicle_types.PublicServiceVehicleTypes, None]) -> None:
        self._public_service_vehicles_ = public_service_vehicles_

    @property
    def slow_road_users(self) -> typing.Union[nds.core.vehicle.slow_road_user_types.SlowRoadUserTypes, None]:
        return self._slow_road_users_

    @slow_road_users.setter
    def slow_road_users(self, slow_road_users_: typing.Union[nds.core.vehicle.slow_road_user_types.SlowRoadUserTypes, None]) -> None:
        self._slow_road_users_ = slow_road_users_

    @property
    def emergency_military_details(self) -> typing.Union[nds.core.vehicle.emergency_military_detail_types.EmergencyMilitaryDetailTypes, None]:
        return self._emergency_military_details_

    @emergency_military_details.setter
    def emergency_military_details(self, emergency_military_details_: typing.Union[nds.core.vehicle.emergency_military_detail_types.EmergencyMilitaryDetailTypes, None]) -> None:
        self._emergency_military_details_ = emergency_military_details_

    def init_packing_context(self, zserio_context: VehicleTypeInformation.ZserioPackingContext) -> None:
        self._frequently_used_vehicles_.init_packing_context(zserio_context.frequently_used_vehicles)
        self._big_vehicles_.init_packing_context(zserio_context.big_vehicles)
        self._public_service_vehicles_.init_packing_context(zserio_context.public_service_vehicles)
        self._slow_road_users_.init_packing_context(zserio_context.slow_road_users)
        self._emergency_military_details_.init_packing_context(zserio_context.emergency_military_details)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._frequently_used_vehicles_.bitsizeof(end_bitposition)
        end_bitposition += self._big_vehicles_.bitsizeof(end_bitposition)
        end_bitposition += self._public_service_vehicles_.bitsizeof(end_bitposition)
        end_bitposition += self._slow_road_users_.bitsizeof(end_bitposition)
        end_bitposition += self._emergency_military_details_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: VehicleTypeInformation.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._frequently_used_vehicles_.bitsizeof_packed(zserio_context.frequently_used_vehicles, end_bitposition)
        end_bitposition += self._big_vehicles_.bitsizeof_packed(zserio_context.big_vehicles, end_bitposition)
        end_bitposition += self._public_service_vehicles_.bitsizeof_packed(zserio_context.public_service_vehicles, end_bitposition)
        end_bitposition += self._slow_road_users_.bitsizeof_packed(zserio_context.slow_road_users, end_bitposition)
        end_bitposition += self._emergency_military_details_.bitsizeof_packed(zserio_context.emergency_military_details, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._frequently_used_vehicles_.initialize_offsets(end_bitposition)
        end_bitposition = self._big_vehicles_.initialize_offsets(end_bitposition)
        end_bitposition = self._public_service_vehicles_.initialize_offsets(end_bitposition)
        end_bitposition = self._slow_road_users_.initialize_offsets(end_bitposition)
        end_bitposition = self._emergency_military_details_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: VehicleTypeInformation.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._frequently_used_vehicles_.initialize_offsets_packed(zserio_context.frequently_used_vehicles, end_bitposition)
        end_bitposition = self._big_vehicles_.initialize_offsets_packed(zserio_context.big_vehicles, end_bitposition)
        end_bitposition = self._public_service_vehicles_.initialize_offsets_packed(zserio_context.public_service_vehicles, end_bitposition)
        end_bitposition = self._slow_road_users_.initialize_offsets_packed(zserio_context.slow_road_users, end_bitposition)
        end_bitposition = self._emergency_military_details_.initialize_offsets_packed(zserio_context.emergency_military_details, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._frequently_used_vehicles_ = nds.core.vehicle.frequently_used_vehicle_types.FrequentlyUsedVehicleTypes.from_reader(zserio_reader)
        self._big_vehicles_ = nds.core.vehicle.big_vehicle_types.BigVehicleTypes.from_reader(zserio_reader)
        self._public_service_vehicles_ = nds.core.vehicle.public_service_vehicle_types.PublicServiceVehicleTypes.from_reader(zserio_reader)
        self._slow_road_users_ = nds.core.vehicle.slow_road_user_types.SlowRoadUserTypes.from_reader(zserio_reader)
        self._emergency_military_details_ = nds.core.vehicle.emergency_military_detail_types.EmergencyMilitaryDetailTypes.from_reader(zserio_reader)

    def read_packed(self, zserio_context: VehicleTypeInformation.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._frequently_used_vehicles_ = nds.core.vehicle.frequently_used_vehicle_types.FrequentlyUsedVehicleTypes.from_reader_packed(zserio_context.frequently_used_vehicles, zserio_reader)

        self._big_vehicles_ = nds.core.vehicle.big_vehicle_types.BigVehicleTypes.from_reader_packed(zserio_context.big_vehicles, zserio_reader)

        self._public_service_vehicles_ = nds.core.vehicle.public_service_vehicle_types.PublicServiceVehicleTypes.from_reader_packed(zserio_context.public_service_vehicles, zserio_reader)

        self._slow_road_users_ = nds.core.vehicle.slow_road_user_types.SlowRoadUserTypes.from_reader_packed(zserio_context.slow_road_users, zserio_reader)

        self._emergency_military_details_ = nds.core.vehicle.emergency_military_detail_types.EmergencyMilitaryDetailTypes.from_reader_packed(zserio_context.emergency_military_details, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._frequently_used_vehicles_.write(zserio_writer)
        self._big_vehicles_.write(zserio_writer)
        self._public_service_vehicles_.write(zserio_writer)
        self._slow_road_users_.write(zserio_writer)
        self._emergency_military_details_.write(zserio_writer)

    def write_packed(self, zserio_context: VehicleTypeInformation.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._frequently_used_vehicles_.write_packed(zserio_context.frequently_used_vehicles, zserio_writer)

        self._big_vehicles_.write_packed(zserio_context.big_vehicles, zserio_writer)

        self._public_service_vehicles_.write_packed(zserio_context.public_service_vehicles, zserio_writer)

        self._slow_road_users_.write_packed(zserio_context.slow_road_users, zserio_writer)

        self._emergency_military_details_.write_packed(zserio_context.emergency_military_details, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._frequently_used_vehicles_ = zserio.array.DeltaContext()
            self._big_vehicles_ = zserio.array.DeltaContext()
            self._public_service_vehicles_ = zserio.array.DeltaContext()
            self._slow_road_users_ = zserio.array.DeltaContext()
            self._emergency_military_details_ = zserio.array.DeltaContext()

        @property
        def frequently_used_vehicles(self):
            return self._frequently_used_vehicles_

        @property
        def big_vehicles(self):
            return self._big_vehicles_

        @property
        def public_service_vehicles(self):
            return self._public_service_vehicles_

        @property
        def slow_road_users(self):
            return self._slow_road_users_

        @property
        def emergency_military_details(self):
            return self._emergency_military_details_