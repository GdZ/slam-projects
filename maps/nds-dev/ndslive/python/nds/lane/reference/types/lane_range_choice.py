# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.lane.reference.types.lane_geometry_range
import nds.lane.reference.types.lane_geometry_range_offset
import nds.lane.reference.types.lane_length_range
import nds.lane.reference.types.lane_percentage_range
import nds.lane.reference.types.lane_validity_range
import nds.lane.reference.types.lane_validity_type

class LaneRangeChoice:
    def __init__(
            self,
            type_: nds.lane.reference.types.lane_validity_type.LaneValidityType,
            *,
            validity_range_: typing.Union[nds.lane.reference.types.lane_validity_range.LaneValidityRange, None] = None,
            length_range_: typing.Union[nds.lane.reference.types.lane_length_range.LaneLengthRange, None] = None,
            geometry_range_: typing.Union[nds.lane.reference.types.lane_geometry_range.LaneGeometryRange, None] = None,
            geometry_range_offset_: typing.Union[nds.lane.reference.types.lane_geometry_range_offset.LaneGeometryRangeOffset, None] = None,
            percentage_range_: typing.Union[nds.lane.reference.types.lane_percentage_range.LanePercentageRange, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if validity_range_ is not None:
            self._choice = validity_range_
        if length_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice LaneRangeChoice is ambiguous!")
            self._choice = length_range_
        if geometry_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice LaneRangeChoice is ambiguous!")
            self._choice = geometry_range_
        if geometry_range_offset_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice LaneRangeChoice is ambiguous!")
            self._choice = geometry_range_offset_
        if percentage_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice LaneRangeChoice is ambiguous!")
            self._choice = percentage_range_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneRangeChoice'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.lane.reference.types.lane_validity_type.LaneValidityType) -> 'LaneRangeChoice':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneRangeChoice'],
            zserio_context: LaneRangeChoice.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.lane.reference.types.lane_validity_type.LaneValidityType) -> 'LaneRangeChoice':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneRangeChoice):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.lane.reference.types.lane_validity_type.LaneValidityType:
        return self._type_

    @property
    def validity_range(self) -> typing.Union[nds.lane.reference.types.lane_validity_range.LaneValidityRange, None]:
        return self._choice

    @validity_range.setter
    def validity_range(self, validity_range_: typing.Union[nds.lane.reference.types.lane_validity_range.LaneValidityRange, None]) -> None:
        self._choice = validity_range_

    @property
    def length_range(self) -> typing.Union[nds.lane.reference.types.lane_length_range.LaneLengthRange, None]:
        return self._choice

    @length_range.setter
    def length_range(self, length_range_: typing.Union[nds.lane.reference.types.lane_length_range.LaneLengthRange, None]) -> None:
        self._choice = length_range_

    @property
    def geometry_range(self) -> typing.Union[nds.lane.reference.types.lane_geometry_range.LaneGeometryRange, None]:
        return self._choice

    @geometry_range.setter
    def geometry_range(self, geometry_range_: typing.Union[nds.lane.reference.types.lane_geometry_range.LaneGeometryRange, None]) -> None:
        self._choice = geometry_range_

    @property
    def geometry_range_offset(self) -> typing.Union[nds.lane.reference.types.lane_geometry_range_offset.LaneGeometryRangeOffset, None]:
        return self._choice

    @geometry_range_offset.setter
    def geometry_range_offset(self, geometry_range_offset_: typing.Union[nds.lane.reference.types.lane_geometry_range_offset.LaneGeometryRangeOffset, None]) -> None:
        self._choice = geometry_range_offset_

    @property
    def percentage_range(self) -> typing.Union[nds.lane.reference.types.lane_percentage_range.LanePercentageRange, None]:
        return self._choice

    @percentage_range.setter
    def percentage_range(self, percentage_range_: typing.Union[nds.lane.reference.types.lane_percentage_range.LanePercentageRange, None]) -> None:
        self._choice = percentage_range_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            return self.UNDEFINED_CHOICE
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            return self.UNDEFINED_CHOICE
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            return self.CHOICE_VALIDITY_RANGE
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            return self.CHOICE_LENGTH_RANGE
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            return self.CHOICE_GEOMETRY_RANGE
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            return self.CHOICE_GEOMETRY_RANGE_OFFSET
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            return self.CHOICE_PERCENTAGE_RANGE
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: LaneRangeChoice.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            self._choice.init_packing_context(zserio_context.validity_range)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            self._choice.init_packing_context(zserio_context.length_range)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            self._choice.init_packing_context(zserio_context.geometry_range)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            self._choice.init_packing_context(zserio_context.geometry_range_offset)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            self._choice.init_packing_context(zserio_context.percentage_range)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneRangeChoice.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.validity_range, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.length_range, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.geometry_range, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.geometry_range_offset, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.percentage_range, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneRangeChoice.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.validity_range, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.length_range, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.geometry_range, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.geometry_range_offset, end_bitposition)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.percentage_range, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            self._choice = nds.lane.reference.types.lane_validity_range.LaneValidityRange.from_reader(zserio_reader)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            self._choice = nds.lane.reference.types.lane_length_range.LaneLengthRange.from_reader(zserio_reader)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            self._choice = nds.lane.reference.types.lane_geometry_range.LaneGeometryRange.from_reader(zserio_reader)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            self._choice = nds.lane.reference.types.lane_geometry_range_offset.LaneGeometryRangeOffset.from_reader(zserio_reader, 0, 0)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            self._choice = nds.lane.reference.types.lane_percentage_range.LanePercentageRange.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

    def read_packed(self, zserio_context: LaneRangeChoice.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            self._choice = nds.lane.reference.types.lane_validity_range.LaneValidityRange.from_reader_packed(zserio_context.validity_range, zserio_reader)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            self._choice = nds.lane.reference.types.lane_length_range.LaneLengthRange.from_reader_packed(zserio_context.length_range, zserio_reader)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            self._choice = nds.lane.reference.types.lane_geometry_range.LaneGeometryRange.from_reader_packed(zserio_context.geometry_range, zserio_reader)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            self._choice = nds.lane.reference.types.lane_geometry_range_offset.LaneGeometryRangeOffset.from_reader_packed(zserio_context.geometry_range_offset, zserio_reader, 0, 0)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            self._choice = nds.lane.reference.types.lane_percentage_range.LanePercentageRange.from_reader_packed(zserio_context.percentage_range, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            self._choice.write(zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            self._choice.write(zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            self._choice.write(zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            # check parameters
            if self._choice.shift_xy != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shiftXY for field LaneRangeChoice.geometryRangeOffset: "
                                                    f"{self._choice.shift_xy} != {0}!")
            if self._choice.shift_z != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shiftZ for field LaneRangeChoice.geometryRangeOffset: "
                                                    f"{self._choice.shift_z} != {0}!")
            self._choice.write(zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

    def write_packed(self, zserio_context: LaneRangeChoice.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.NONE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.COMPLETE):
            pass
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.POSITION):
            self._choice.write_packed(zserio_context.validity_range, zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.LENGTH):
            self._choice.write_packed(zserio_context.length_range, zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY):
            self._choice.write_packed(zserio_context.geometry_range, zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.GEOMETRY_OFFSET):
            # check parameters
            if self._choice.shift_xy != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shiftXY for field LaneRangeChoice.geometryRangeOffset: "
                                                    f"{self._choice.shift_xy} != {0}!")
            if self._choice.shift_z != (0):
                raise zserio.PythonRuntimeException("Wrong parameter shiftZ for field LaneRangeChoice.geometryRangeOffset: "
                                                    f"{self._choice.shift_z} != {0}!")
            self._choice.write_packed(zserio_context.geometry_range_offset, zserio_writer)
        elif selector == (nds.lane.reference.types.lane_validity_type.LaneValidityType.PERCENTAGE):
            self._choice.write_packed(zserio_context.percentage_range, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice LaneRangeChoice!")

    class ZserioPackingContext:
        def __init__(self):
            self._validity_range_ = nds.lane.reference.types.lane_validity_range.LaneValidityRange.ZserioPackingContext()
            self._length_range_ = nds.lane.reference.types.lane_length_range.LaneLengthRange.ZserioPackingContext()
            self._geometry_range_ = nds.lane.reference.types.lane_geometry_range.LaneGeometryRange.ZserioPackingContext()
            self._geometry_range_offset_ = nds.lane.reference.types.lane_geometry_range_offset.LaneGeometryRangeOffset.ZserioPackingContext()
            self._percentage_range_ = nds.lane.reference.types.lane_percentage_range.LanePercentageRange.ZserioPackingContext()

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
        def geometry_range_offset(self):
            return self._geometry_range_offset_

        @property
        def percentage_range(self):
            return self._percentage_range_

    CHOICE_VALIDITY_RANGE = 0
    CHOICE_LENGTH_RANGE = 1
    CHOICE_GEOMETRY_RANGE = 2
    CHOICE_GEOMETRY_RANGE_OFFSET = 3
    CHOICE_PERCENTAGE_RANGE = 4
    UNDEFINED_CHOICE = -1