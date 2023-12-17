# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.properties.core_property_type
import nds.routingdata.properties.property_type

class RoutingPropertyType:
    def __init__(
            self,
            type_: typing.Union[nds.routingdata.properties.property_type.PropertyType, None] = None,
            core_type_: typing.Optional[nds.core.properties.core_property_type.CorePropertyType] = None) -> None:
        self._type_ = type_
        self._core_type_ = core_type_

    @classmethod
    def from_reader(
            cls: typing.Type['RoutingPropertyType'],
            zserio_reader: zserio.BitStreamReader) -> 'RoutingPropertyType':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoutingPropertyType'],
            zserio_context: RoutingPropertyType.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoutingPropertyType':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoutingPropertyType):
            return ((self._type_ == other._type_) and
                    (not other.is_core_type_used() if not self.is_core_type_used() else (self._core_type_ == other._core_type_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_core_type_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._core_type_)

        return result

    @property
    def type(self) -> typing.Union[nds.routingdata.properties.property_type.PropertyType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.routingdata.properties.property_type.PropertyType, None]) -> None:
        self._type_ = type_

    @property
    def core_type(self) -> typing.Optional[nds.core.properties.core_property_type.CorePropertyType]:
        return self._core_type_

    @core_type.setter
    def core_type(self, core_type_: typing.Optional[nds.core.properties.core_property_type.CorePropertyType]) -> None:
        self._core_type_ = core_type_

    def is_core_type_used(self) -> bool:
        return self._type_ == nds.routingdata.properties.property_type.PropertyType.CORE

    def is_core_type_set(self) -> bool:
        return not self._core_type_ is None

    def reset_core_type(self) -> None:
        self._core_type_ = None

    def init_packing_context(self, zserio_context: RoutingPropertyType.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        if self.is_core_type_used():
            self._core_type_.init_packing_context(zserio_context.core_type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        if self.is_core_type_used():
            end_bitposition += self._core_type_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoutingPropertyType.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        if self.is_core_type_used():
            end_bitposition += self._core_type_.bitsizeof_packed(zserio_context.core_type, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        if self.is_core_type_used():
            end_bitposition = self._core_type_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoutingPropertyType.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        if self.is_core_type_used():
            end_bitposition = self._core_type_.initialize_offsets_packed(zserio_context.core_type, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.routingdata.properties.property_type.PropertyType.from_reader(zserio_reader)
        if self.is_core_type_used():
            self._core_type_ = nds.core.properties.core_property_type.CorePropertyType.from_reader(zserio_reader)
        else:
            self._core_type_ = None

    def read_packed(self, zserio_context: RoutingPropertyType.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.routingdata.properties.property_type.PropertyType.from_reader_packed(zserio_context.type, zserio_reader)

        if self.is_core_type_used():
            self._core_type_ = nds.core.properties.core_property_type.CorePropertyType.from_reader_packed(zserio_context.core_type, zserio_reader)
        else:
            self._core_type_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write(zserio_writer)
        if self.is_core_type_used():
            self._core_type_.write(zserio_writer)

    def write_packed(self, zserio_context: RoutingPropertyType.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write_packed(zserio_context.type, zserio_writer)

        if self.is_core_type_used():
            self._core_type_.write_packed(zserio_context.core_type, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._type_ = zserio.array.DeltaContext()
            self._core_type_ = zserio.array.DeltaContext()

        @property
        def type(self):
            return self._type_

        @property
        def core_type(self):
            return self._core_type_
