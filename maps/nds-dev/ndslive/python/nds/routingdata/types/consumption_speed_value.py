# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.speed_kmh
import nds.road.reference.types.percentage_indication

import nds.core.types.speed_undefined

class ConsumptionSpeedValue:
    def __init__(
            self,
            road_percentage_: nds.road.reference.types.percentage_indication.PercentageIndication = nds.road.reference.types.percentage_indication.PercentageIndication(),
            average_speed_: nds.core.types.speed_kmh.SpeedKmh = nds.core.types.speed_kmh.SpeedKmh()) -> None:
        self._road_percentage_ = road_percentage_
        self._average_speed_ = average_speed_

    @classmethod
    def from_reader(
            cls: typing.Type['ConsumptionSpeedValue'],
            zserio_reader: zserio.BitStreamReader) -> 'ConsumptionSpeedValue':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ConsumptionSpeedValue'],
            zserio_context: ConsumptionSpeedValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ConsumptionSpeedValue':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ConsumptionSpeedValue):
            return ((self._road_percentage_ == other._road_percentage_) and
                    (self._average_speed_ == other._average_speed_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_float32(result, self._road_percentage_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._average_speed_)

        return result

    @property
    def road_percentage(self) -> nds.road.reference.types.percentage_indication.PercentageIndication:
        return self._road_percentage_

    @road_percentage.setter
    def road_percentage(self, road_percentage_: nds.road.reference.types.percentage_indication.PercentageIndication) -> None:
        self._road_percentage_ = road_percentage_

    @property
    def average_speed(self) -> nds.core.types.speed_kmh.SpeedKmh:
        return self._average_speed_

    @average_speed.setter
    def average_speed(self, average_speed_: nds.core.types.speed_kmh.SpeedKmh) -> None:
        self._average_speed_ = average_speed_

    def init_packing_context(self, zserio_context: ConsumptionSpeedValue.ZserioPackingContext) -> None:
        zserio_context.average_speed.init(zserio.array.BitFieldArrayTraits(8), self._average_speed_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 16
        end_bitposition += 8

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ConsumptionSpeedValue.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 16
        end_bitposition += zserio_context.average_speed.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._average_speed_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 16
        end_bitposition += 8

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ConsumptionSpeedValue.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += 16
        end_bitposition += zserio_context.average_speed.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._average_speed_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._road_percentage_ = zserio_reader.read_float16()

        self._average_speed_ = zserio_reader.read_bits(8)
        # check constraint
        if not (self._average_speed_ > nds.core.types.speed_undefined.SPEED_UNDEFINED):
            raise zserio.PythonRuntimeException("Constraint violated for field ConsumptionSpeedValue.averageSpeed!")

    def read_packed(self, zserio_context: ConsumptionSpeedValue.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._road_percentage_ = zserio_reader.read_float16()

        self._average_speed_ = zserio_context.average_speed.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
        # check constraint
        if not (self._average_speed_ > nds.core.types.speed_undefined.SPEED_UNDEFINED):
            raise zserio.PythonRuntimeException("Constraint violated for field ConsumptionSpeedValue.averageSpeed!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_float16(self._road_percentage_)

        # check constraint
        if not (self._average_speed_ > nds.core.types.speed_undefined.SPEED_UNDEFINED):
            raise zserio.PythonRuntimeException("Constraint violated for field ConsumptionSpeedValue.averageSpeed!")
        zserio_writer.write_bits(self._average_speed_, 8)

    def write_packed(self, zserio_context: ConsumptionSpeedValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_float16(self._road_percentage_)

        # check constraint
        if not (self._average_speed_ > nds.core.types.speed_undefined.SPEED_UNDEFINED):
            raise zserio.PythonRuntimeException("Constraint violated for field ConsumptionSpeedValue.averageSpeed!")
        zserio_context.average_speed.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._average_speed_)

    class ZserioPackingContext:
        def __init__(self):
            self._average_speed_ = zserio.array.DeltaContext()

        @property
        def average_speed(self):
            return self._average_speed_