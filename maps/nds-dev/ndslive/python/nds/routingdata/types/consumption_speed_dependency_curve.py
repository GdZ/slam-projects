# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routingdata.types.consumption_speed_value

class ConsumptionSpeedDependencyCurve:
    def __init__(
            self,
            number_of_speed_values_along_road_: int = int(),
            consumption_speed_value_: typing.List[nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue] = None) -> None:
        self._number_of_speed_values_along_road_ = number_of_speed_values_along_road_
        self._consumption_speed_value_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_consumption_speed_value()), consumption_speed_value_)

    @classmethod
    def from_reader(
            cls: typing.Type['ConsumptionSpeedDependencyCurve'],
            zserio_reader: zserio.BitStreamReader) -> 'ConsumptionSpeedDependencyCurve':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ConsumptionSpeedDependencyCurve'],
            zserio_context: ConsumptionSpeedDependencyCurve.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ConsumptionSpeedDependencyCurve':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ConsumptionSpeedDependencyCurve):
            return ((self._number_of_speed_values_along_road_ == other._number_of_speed_values_along_road_) and
                    (self._consumption_speed_value_ == other._consumption_speed_value_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._number_of_speed_values_along_road_)
        result = zserio.hashcode.calc_hashcode_object(result, self._consumption_speed_value_)

        return result

    @property
    def number_of_speed_values_along_road(self) -> int:
        return self._number_of_speed_values_along_road_

    @number_of_speed_values_along_road.setter
    def number_of_speed_values_along_road(self, number_of_speed_values_along_road_: int) -> None:
        self._number_of_speed_values_along_road_ = number_of_speed_values_along_road_

    @property
    def consumption_speed_value(self) -> typing.List[nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue]:
        return self._consumption_speed_value_.raw_array

    @consumption_speed_value.setter
    def consumption_speed_value(self, consumption_speed_value_: typing.List[nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue]) -> None:
        self._consumption_speed_value_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_consumption_speed_value()), consumption_speed_value_)

    def init_packing_context(self, zserio_context: ConsumptionSpeedDependencyCurve.ZserioPackingContext) -> None:
        zserio_context.number_of_speed_values_along_road.init(zserio.array.BitFieldArrayTraits(8), self._number_of_speed_values_along_road_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += self._consumption_speed_value_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ConsumptionSpeedDependencyCurve.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.number_of_speed_values_along_road.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._number_of_speed_values_along_road_)
        end_bitposition += self._consumption_speed_value_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition = self._consumption_speed_value_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ConsumptionSpeedDependencyCurve.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.number_of_speed_values_along_road.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._number_of_speed_values_along_road_)
        end_bitposition = self._consumption_speed_value_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._number_of_speed_values_along_road_ = zserio_reader.read_bits(8)
        self._consumption_speed_value_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_consumption_speed_value()), zserio_reader, self._number_of_speed_values_along_road_)

    def read_packed(self, zserio_context: ConsumptionSpeedDependencyCurve.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._number_of_speed_values_along_road_ = zserio_context.number_of_speed_values_along_road.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._consumption_speed_value_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_consumption_speed_value()), zserio_reader, self._number_of_speed_values_along_road_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._number_of_speed_values_along_road_, 8)

        # check array length
        if len(self._consumption_speed_value_) != (self._number_of_speed_values_along_road_):
            raise zserio.PythonRuntimeException("Wrong array length for field ConsumptionSpeedDependencyCurve.consumptionSpeedValue: "
                                                f"{len(self._consumption_speed_value_)} != {self._number_of_speed_values_along_road_}!")
        self._consumption_speed_value_.write(zserio_writer)

    def write_packed(self, zserio_context: ConsumptionSpeedDependencyCurve.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.number_of_speed_values_along_road.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._number_of_speed_values_along_road_)

        # check array length
        if len(self._consumption_speed_value_) != (self._number_of_speed_values_along_road_):
            raise zserio.PythonRuntimeException("Wrong array length for field ConsumptionSpeedDependencyCurve.consumptionSpeedValue: "
                                                f"{len(self._consumption_speed_value_)} != {self._number_of_speed_values_along_road_}!")
        self._consumption_speed_value_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._number_of_speed_values_along_road_ = zserio.array.DeltaContext()

        @property
        def number_of_speed_values_along_road(self):
            return self._number_of_speed_values_along_road_

    class _ZserioElementFactory_consumption_speed_value:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue:
            del zserio_index
            return nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue.ZserioPackingContext:
            return nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue:
            del zserio_index
            return nds.routingdata.types.consumption_speed_value.ConsumptionSpeedValue.from_reader_packed(zserio_context, zserio_reader)