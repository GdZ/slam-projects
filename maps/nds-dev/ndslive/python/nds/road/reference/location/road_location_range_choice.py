# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.location.road_location_id_range
import nds.road.reference.location.road_location_range_validity_type

class RoadLocationRangeChoice:
    def __init__(
            self,
            type_: nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType,
            *,
            range_: typing.Union[nds.core.location.road_location_id_range.RoadLocationIdRange, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if range_ is not None:
            self._choice = range_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadLocationRangeChoice'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType) -> 'RoadLocationRangeChoice':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadLocationRangeChoice'],
            zserio_context: RoadLocationRangeChoice.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType) -> 'RoadLocationRangeChoice':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadLocationRangeChoice):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType:
        return self._type_

    @property
    def range(self) -> typing.Union[nds.core.location.road_location_id_range.RoadLocationIdRange, None]:
        return self._choice

    @range.setter
    def range(self, range_: typing.Union[nds.core.location.road_location_id_range.RoadLocationIdRange, None]) -> None:
        self._choice = range_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            return self.UNDEFINED_CHOICE
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            return self.CHOICE_RANGE
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: RoadLocationRangeChoice.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            self._choice.init_packing_context(zserio_context.range)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadLocationRangeChoice.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.range, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadLocationRangeChoice.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.range, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            self._choice = nds.core.location.road_location_id_range.RoadLocationIdRange.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

    def read_packed(self, zserio_context: RoadLocationRangeChoice.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            self._choice = nds.core.location.road_location_id_range.RoadLocationIdRange.from_reader_packed(zserio_context.range, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

    def write_packed(self, zserio_context: RoadLocationRangeChoice.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.location.road_location_range_validity_type.RoadLocationRangeValidityType.RANGE):
            self._choice.write_packed(zserio_context.range, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadLocationRangeChoice!")

    class ZserioPackingContext:
        def __init__(self):
            self._range_ = nds.core.location.road_location_id_range.RoadLocationIdRange.ZserioPackingContext()

        @property
        def range(self):
            return self._range_

    CHOICE_RANGE = 0
    UNDEFINED_CHOICE = -1
