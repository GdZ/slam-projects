# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.road.reference.types.road_geometry_offset_range
import nds.road.reference.types.road_geometry_range
import nds.road.reference.types.road_length_extent
import nds.road.reference.types.road_length_range
import nds.road.reference.types.road_percentage_range
import nds.road.reference.types.road_validity_range
import nds.road.reference.types.road_validity_type

class RoadRangeChoice:
    def __init__(
            self,
            type_: nds.road.reference.types.road_validity_type.RoadValidityType,
            shift_: nds.core.geometry.coord_shift.CoordShift,
            *,
            validity_range_: typing.Union[nds.road.reference.types.road_validity_range.RoadValidityRange, None] = None,
            length_range_: typing.Union[nds.road.reference.types.road_length_range.RoadLengthRange, None] = None,
            geometry_range_: typing.Union[nds.road.reference.types.road_geometry_range.RoadGeometryRange, None] = None,
            geometry_offset_range_: typing.Union[nds.road.reference.types.road_geometry_offset_range.RoadGeometryOffsetRange, None] = None,
            percentage_range_: typing.Union[nds.road.reference.types.road_percentage_range.RoadPercentageRange, None] = None,
            road_length_extent_: typing.Union[nds.road.reference.types.road_length_extent.RoadLengthExtent, None] = None) -> None:
        self._type_ = type_
        self._shift_ = shift_
        self._choice: typing.Any = None
        if validity_range_ is not None:
            self._choice = validity_range_
        if length_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoadRangeChoice is ambiguous!")
            self._choice = length_range_
        if geometry_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoadRangeChoice is ambiguous!")
            self._choice = geometry_range_
        if geometry_offset_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoadRangeChoice is ambiguous!")
            self._choice = geometry_offset_range_
        if percentage_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoadRangeChoice is ambiguous!")
            self._choice = percentage_range_
        if road_length_extent_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice RoadRangeChoice is ambiguous!")
            self._choice = road_length_extent_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadRangeChoice'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.road.reference.types.road_validity_type.RoadValidityType,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoadRangeChoice':
        self = object.__new__(cls)
        self._type_ = type_
        self._shift_ = shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadRangeChoice'],
            zserio_context: RoadRangeChoice.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.road.reference.types.road_validity_type.RoadValidityType,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoadRangeChoice':
        self = object.__new__(cls)
        self._type_ = type_
        self._shift_ = shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadRangeChoice):
            return (self._type_ == other._type_ and
                    self._shift_ == other._shift_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.road.reference.types.road_validity_type.RoadValidityType:
        return self._type_

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @property
    def validity_range(self) -> typing.Union[nds.road.reference.types.road_validity_range.RoadValidityRange, None]:
        return self._choice

    @validity_range.setter
    def validity_range(self, validity_range_: typing.Union[nds.road.reference.types.road_validity_range.RoadValidityRange, None]) -> None:
        self._choice = validity_range_

    @property
    def length_range(self) -> typing.Union[nds.road.reference.types.road_length_range.RoadLengthRange, None]:
        return self._choice

    @length_range.setter
    def length_range(self, length_range_: typing.Union[nds.road.reference.types.road_length_range.RoadLengthRange, None]) -> None:
        self._choice = length_range_

    @property
    def geometry_range(self) -> typing.Union[nds.road.reference.types.road_geometry_range.RoadGeometryRange, None]:
        return self._choice

    @geometry_range.setter
    def geometry_range(self, geometry_range_: typing.Union[nds.road.reference.types.road_geometry_range.RoadGeometryRange, None]) -> None:
        self._choice = geometry_range_

    @property
    def geometry_offset_range(self) -> typing.Union[nds.road.reference.types.road_geometry_offset_range.RoadGeometryOffsetRange, None]:
        return self._choice

    @geometry_offset_range.setter
    def geometry_offset_range(self, geometry_offset_range_: typing.Union[nds.road.reference.types.road_geometry_offset_range.RoadGeometryOffsetRange, None]) -> None:
        self._choice = geometry_offset_range_

    @property
    def percentage_range(self) -> typing.Union[nds.road.reference.types.road_percentage_range.RoadPercentageRange, None]:
        return self._choice

    @percentage_range.setter
    def percentage_range(self, percentage_range_: typing.Union[nds.road.reference.types.road_percentage_range.RoadPercentageRange, None]) -> None:
        self._choice = percentage_range_

    @property
    def road_length_extent(self) -> nds.road.reference.types.road_length_extent.RoadLengthExtent:
        return self._choice

    @road_length_extent.setter
    def road_length_extent(self, road_length_extent_: nds.road.reference.types.road_length_extent.RoadLengthExtent) -> None:
        self._choice = road_length_extent_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            return self.UNDEFINED_CHOICE
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            return self.CHOICE_VALIDITY_RANGE
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            return self.CHOICE_LENGTH_RANGE
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            return self.CHOICE_GEOMETRY_RANGE
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            return self.CHOICE_GEOMETRY_OFFSET_RANGE
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            return self.CHOICE_PERCENTAGE_RANGE
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            return self.CHOICE_ROAD_LENGTH_EXTENT
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: RoadRangeChoice.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            self._choice.init_packing_context(zserio_context.validity_range)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            self._choice.init_packing_context(zserio_context.length_range)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            self._choice.init_packing_context(zserio_context.geometry_range)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            self._choice.init_packing_context(zserio_context.geometry_offset_range)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            self._choice.init_packing_context(zserio_context.percentage_range)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            zserio_context.road_length_extent.init(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadRangeChoice.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.validity_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.length_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.geometry_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.geometry_offset_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.percentage_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            end_bitposition += zserio_context.road_length_extent.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadRangeChoice.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.validity_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.length_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.geometry_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.geometry_offset_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.percentage_range, end_bitposition)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            end_bitposition += zserio_context.road_length_extent.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            self._choice = nds.road.reference.types.road_validity_range.RoadValidityRange.from_reader(zserio_reader, self._shift_)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            self._choice = nds.road.reference.types.road_length_range.RoadLengthRange.from_reader(zserio_reader)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            self._choice = nds.road.reference.types.road_geometry_range.RoadGeometryRange.from_reader(zserio_reader)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            self._choice = nds.road.reference.types.road_geometry_offset_range.RoadGeometryOffsetRange.from_reader(zserio_reader, self._shift_)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            self._choice = nds.road.reference.types.road_percentage_range.RoadPercentageRange.from_reader(zserio_reader)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            self._choice = zserio_reader.read_varuint32()
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

    def read_packed(self, zserio_context: RoadRangeChoice.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            self._choice = nds.road.reference.types.road_validity_range.RoadValidityRange.from_reader_packed(zserio_context.validity_range, zserio_reader, self._shift_)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            self._choice = nds.road.reference.types.road_length_range.RoadLengthRange.from_reader_packed(zserio_context.length_range, zserio_reader)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            self._choice = nds.road.reference.types.road_geometry_range.RoadGeometryRange.from_reader_packed(zserio_context.geometry_range, zserio_reader)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            self._choice = nds.road.reference.types.road_geometry_offset_range.RoadGeometryOffsetRange.from_reader_packed(zserio_context.geometry_offset_range, zserio_reader, self._shift_)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            self._choice = nds.road.reference.types.road_percentage_range.RoadPercentageRange.from_reader_packed(zserio_context.percentage_range, zserio_reader)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            self._choice = zserio_context.road_length_extent.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadRangeChoice.validityRange: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write(zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            self._choice.write(zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            self._choice.write(zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadRangeChoice.geometryOffsetRange: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write(zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            self._choice.write(zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            zserio_writer.write_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

    def write_packed(self, zserio_context: RoadRangeChoice.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.road.reference.types.road_validity_type.RoadValidityType.COMPLETE):
            pass
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.POSITION):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadRangeChoice.validityRange: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write_packed(zserio_context.validity_range, zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.LENGTH):
            self._choice.write_packed(zserio_context.length_range, zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY):
            self._choice.write_packed(zserio_context.geometry_range, zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.GEOMETRY_OFFSET):
            # check parameters
            if self._choice.shift != (self._shift_):
                raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadRangeChoice.geometryOffsetRange: "
                                                    f"{self._choice.shift} != {self._shift_}!")
            self._choice.write_packed(zserio_context.geometry_offset_range, zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.PERCENTAGE):
            self._choice.write_packed(zserio_context.percentage_range, zserio_writer)
        elif selector == (nds.road.reference.types.road_validity_type.RoadValidityType.EXTENT):
            zserio_context.road_length_extent.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice RoadRangeChoice!")

    class ZserioPackingContext:
        def __init__(self):
            self._validity_range_ = nds.road.reference.types.road_validity_range.RoadValidityRange.ZserioPackingContext()
            self._length_range_ = nds.road.reference.types.road_length_range.RoadLengthRange.ZserioPackingContext()
            self._geometry_range_ = nds.road.reference.types.road_geometry_range.RoadGeometryRange.ZserioPackingContext()
            self._geometry_offset_range_ = nds.road.reference.types.road_geometry_offset_range.RoadGeometryOffsetRange.ZserioPackingContext()
            self._percentage_range_ = nds.road.reference.types.road_percentage_range.RoadPercentageRange.ZserioPackingContext()
            self._road_length_extent_ = zserio.array.DeltaContext()

        @property
        def validity_range(self):
            return self._validity_range_

        @property
        def length_range(self):
            return self._length_range_

        @property
        def geometry_range(self):
            return self._geometry_range_

        @property
        def geometry_offset_range(self):
            return self._geometry_offset_range_

        @property
        def percentage_range(self):
            return self._percentage_range_

        @property
        def road_length_extent(self):
            return self._road_length_extent_

    CHOICE_VALIDITY_RANGE = 0
    CHOICE_LENGTH_RANGE = 1
    CHOICE_GEOMETRY_RANGE = 2
    CHOICE_GEOMETRY_OFFSET_RANGE = 3
    CHOICE_PERCENTAGE_RANGE = 4
    CHOICE_ROAD_LENGTH_EXTENT = 5
    UNDEFINED_CHOICE = -1
