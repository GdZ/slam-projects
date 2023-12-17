# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.delta_elevation
import nds.display.details.attributes.display_point_attribute_type
import nds.display.details.types.drawing_order
import nds.display.details.types.elevation_level
import nds.display.details.types.population

class DisplayPointAttributeValue:
    def __init__(
            self,
            type_: nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType,
            *,
            population_: typing.Union[nds.display.details.types.population.Population, None] = None,
            drawing_order_: typing.Union[nds.display.details.types.drawing_order.DrawingOrder, None] = None,
            elevation_delta_: typing.Union[nds.core.geometry.delta_elevation.DeltaElevation, None] = None,
            elevation_level_: typing.Union[nds.display.details.types.elevation_level.ElevationLevel, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if population_ is not None:
            self._choice = population_
        if drawing_order_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice DisplayPointAttributeValue is ambiguous!")
            self._choice = drawing_order_
        if elevation_delta_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice DisplayPointAttributeValue is ambiguous!")
            self._choice = elevation_delta_
        if elevation_level_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice DisplayPointAttributeValue is ambiguous!")
            self._choice = elevation_level_

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayPointAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType) -> 'DisplayPointAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayPointAttributeValue'],
            zserio_context: DisplayPointAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType) -> 'DisplayPointAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayPointAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType:
        return self._type_

    @property
    def population(self) -> typing.Union[nds.display.details.types.population.Population, None]:
        return self._choice

    @population.setter
    def population(self, population_: typing.Union[nds.display.details.types.population.Population, None]) -> None:
        self._choice = population_

    @property
    def drawing_order(self) -> typing.Union[nds.display.details.types.drawing_order.DrawingOrder, None]:
        return self._choice

    @drawing_order.setter
    def drawing_order(self, drawing_order_: typing.Union[nds.display.details.types.drawing_order.DrawingOrder, None]) -> None:
        self._choice = drawing_order_

    @property
    def elevation_delta(self) -> nds.core.geometry.delta_elevation.DeltaElevation:
        return self._choice

    @elevation_delta.setter
    def elevation_delta(self, elevation_delta_: nds.core.geometry.delta_elevation.DeltaElevation) -> None:
        self._choice = elevation_delta_

    @property
    def elevation_level(self) -> nds.display.details.types.elevation_level.ElevationLevel:
        return self._choice

    @elevation_level.setter
    def elevation_level(self, elevation_level_: nds.display.details.types.elevation_level.ElevationLevel) -> None:
        self._choice = elevation_level_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            return self.CHOICE_POPULATION
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            return self.CHOICE_DRAWING_ORDER
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            return self.CHOICE_ELEVATION_DELTA
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            return self.CHOICE_ELEVATION_LEVEL
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: DisplayPointAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            self._choice.init_packing_context(zserio_context.population)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            self._choice.init_packing_context(zserio_context.drawing_order)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            zserio_context.elevation_delta.init(zserio.array.VarInt32ArrayTraits(), self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            zserio_context.elevation_level.init(zserio.array.SignedBitFieldArrayTraits(8), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            end_bitposition += 8
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayPointAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.population, end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.drawing_order, end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            end_bitposition += zserio_context.elevation_delta.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            end_bitposition += zserio_context.elevation_level.bitsizeof(zserio.array.SignedBitFieldArrayTraits(8), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            end_bitposition += zserio.bitsizeof.bitsizeof_varint32(self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            end_bitposition += 8
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayPointAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.population, end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.drawing_order, end_bitposition)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            end_bitposition += zserio_context.elevation_delta.bitsizeof(zserio.array.VarInt32ArrayTraits(), self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            end_bitposition += zserio_context.elevation_level.bitsizeof(zserio.array.SignedBitFieldArrayTraits(8), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            self._choice = nds.display.details.types.population.Population.from_reader(zserio_reader)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            self._choice = nds.display.details.types.drawing_order.DrawingOrder.from_reader(zserio_reader)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            self._choice = zserio_reader.read_varint32()
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            self._choice = zserio_reader.read_signed_bits(8)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

    def read_packed(self, zserio_context: DisplayPointAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            self._choice = nds.display.details.types.population.Population.from_reader_packed(zserio_context.population, zserio_reader)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            self._choice = nds.display.details.types.drawing_order.DrawingOrder.from_reader_packed(zserio_context.drawing_order, zserio_reader)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            self._choice = zserio_context.elevation_delta.read(zserio.array.VarInt32ArrayTraits(), zserio_reader)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            self._choice = zserio_context.elevation_level.read(zserio.array.SignedBitFieldArrayTraits(8), zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            self._choice.write(zserio_writer)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            self._choice.write(zserio_writer)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            zserio_writer.write_varint32(self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            zserio_writer.write_signed_bits(self._choice, 8)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

    def write_packed(self, zserio_context: DisplayPointAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.POPULATION):
            self._choice.write_packed(zserio_context.population, zserio_writer)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.DRAWING_ORDER):
            self._choice.write_packed(zserio_context.drawing_order, zserio_writer)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_DELTA):
            zserio_context.elevation_delta.write(zserio.array.VarInt32ArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.ELEVATION_LEVEL):
            zserio_context.elevation_level.write(zserio.array.SignedBitFieldArrayTraits(8), zserio_writer, self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice DisplayPointAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._population_ = zserio.array.DeltaContext()
            self._drawing_order_ = nds.display.details.types.drawing_order.DrawingOrder.ZserioPackingContext()
            self._elevation_delta_ = zserio.array.DeltaContext()
            self._elevation_level_ = zserio.array.DeltaContext()

        @property
        def population(self):
            return self._population_

        @property
        def drawing_order(self):
            return self._drawing_order_

        @property
        def elevation_delta(self):
            return self._elevation_delta_

        @property
        def elevation_level(self):
            return self._elevation_level_

    CHOICE_POPULATION = 0
    CHOICE_DRAWING_ORDER = 1
    CHOICE_ELEVATION_DELTA = 2
    CHOICE_ELEVATION_LEVEL = 3
    UNDEFINED_CHOICE = -1