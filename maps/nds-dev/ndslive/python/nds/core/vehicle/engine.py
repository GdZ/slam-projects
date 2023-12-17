# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.vehicle.energy_type
import nds.core.vehicle.vehicle_euro_emission_class

class Engine:
    def __init__(
            self,
            energy_type_: typing.Union[nds.core.vehicle.energy_type.EnergyType, None] = None,
            euro_emission_class_: typing.Union[nds.core.vehicle.vehicle_euro_emission_class.VehicleEuroEmissionClass, None] = None) -> None:
        self._energy_type_ = energy_type_
        self._euro_emission_class_ = euro_emission_class_

    @classmethod
    def from_reader(
            cls: typing.Type['Engine'],
            zserio_reader: zserio.BitStreamReader) -> 'Engine':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Engine'],
            zserio_context: Engine.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Engine':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Engine):
            return ((self._energy_type_ == other._energy_type_) and
                    (self._euro_emission_class_ == other._euro_emission_class_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._energy_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._euro_emission_class_)

        return result

    @property
    def energy_type(self) -> typing.Union[nds.core.vehicle.energy_type.EnergyType, None]:
        return self._energy_type_

    @energy_type.setter
    def energy_type(self, energy_type_: typing.Union[nds.core.vehicle.energy_type.EnergyType, None]) -> None:
        self._energy_type_ = energy_type_

    @property
    def euro_emission_class(self) -> typing.Union[nds.core.vehicle.vehicle_euro_emission_class.VehicleEuroEmissionClass, None]:
        return self._euro_emission_class_

    @euro_emission_class.setter
    def euro_emission_class(self, euro_emission_class_: typing.Union[nds.core.vehicle.vehicle_euro_emission_class.VehicleEuroEmissionClass, None]) -> None:
        self._euro_emission_class_ = euro_emission_class_

    def init_packing_context(self, zserio_context: Engine.ZserioPackingContext) -> None:
        self._energy_type_.init_packing_context(zserio_context.energy_type)
        self._euro_emission_class_.init_packing_context(zserio_context.euro_emission_class)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._energy_type_.bitsizeof(end_bitposition)
        end_bitposition += self._euro_emission_class_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Engine.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._energy_type_.bitsizeof_packed(zserio_context.energy_type, end_bitposition)
        end_bitposition += self._euro_emission_class_.bitsizeof_packed(zserio_context.euro_emission_class, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._energy_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._euro_emission_class_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Engine.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._energy_type_.initialize_offsets_packed(zserio_context.energy_type, end_bitposition)
        end_bitposition = self._euro_emission_class_.initialize_offsets_packed(zserio_context.euro_emission_class, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._energy_type_ = nds.core.vehicle.energy_type.EnergyType.from_reader(zserio_reader)
        self._euro_emission_class_ = nds.core.vehicle.vehicle_euro_emission_class.VehicleEuroEmissionClass.from_reader(zserio_reader)

    def read_packed(self, zserio_context: Engine.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._energy_type_ = nds.core.vehicle.energy_type.EnergyType.from_reader_packed(zserio_context.energy_type, zserio_reader)

        self._euro_emission_class_ = nds.core.vehicle.vehicle_euro_emission_class.VehicleEuroEmissionClass.from_reader_packed(zserio_context.euro_emission_class, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._energy_type_.write(zserio_writer)
        self._euro_emission_class_.write(zserio_writer)

    def write_packed(self, zserio_context: Engine.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._energy_type_.write_packed(zserio_context.energy_type, zserio_writer)

        self._euro_emission_class_.write_packed(zserio_context.euro_emission_class, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._energy_type_ = zserio.array.DeltaContext()
            self._euro_emission_class_ = zserio.array.DeltaContext()

        @property
        def energy_type(self):
            return self._energy_type_

        @property
        def euro_emission_class(self):
            return self._euro_emission_class_