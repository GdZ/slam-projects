# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.localization.properties.property_type

class PropertyValue:
    def __init__(
            self,
            type_: nds.localization.properties.property_type.PropertyType) -> None:
        self._type_ = type_
        self._choice: typing.Any = None

    @classmethod
    def from_reader(
            cls: typing.Type['PropertyValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.localization.properties.property_type.PropertyType) -> 'PropertyValue':
        del zserio_reader

        return cls(type_)

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PropertyValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)

        return result

    @property
    def type(self) -> nds.localization.properties.property_type.PropertyType:
        return self._type_

    @property
    def choice_tag(self) -> int:
        return self.UNDEFINED_CHOICE

    def bitsizeof(self, bitposition: int = 0) -> int:
        del bitposition

        return 0

    def initialize_offsets(self, bitposition: int = 0) -> int:
        return bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        del zserio_reader

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        del zserio_writer

    UNDEFINED_CHOICE = -1
