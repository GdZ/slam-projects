# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.adas.instantiations.adas_property

class AdasPropertyList:
    def __init__(
            self,
            num_properties_: int = int(),
            property_: typing.Optional[typing.List[nds.adas.instantiations.adas_property.AdasProperty]] = None) -> None:
        self._num_properties_ = num_properties_
        if property_ is None:
            self._property_ = None
        else:
            self._property_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_property()), property_)

    @classmethod
    def from_reader(
            cls: typing.Type['AdasPropertyList'],
            zserio_reader: zserio.BitStreamReader) -> 'AdasPropertyList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AdasPropertyList'],
            zserio_context: AdasPropertyList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AdasPropertyList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AdasPropertyList):
            return ((self._num_properties_ == other._num_properties_) and
                    (not other.is_property_used() if not self.is_property_used() else (self._property_ == other._property_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_properties_)
        if self.is_property_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._property_)

        return result

    @property
    def num_properties(self) -> int:
        return self._num_properties_

    @num_properties.setter
    def num_properties(self, num_properties_: int) -> None:
        self._num_properties_ = num_properties_

    @property
    def property(self) -> typing.Optional[typing.List[nds.adas.instantiations.adas_property.AdasProperty]]:
        return None if self._property_ is None else self._property_.raw_array

    @property.setter
    def property(self, property_: typing.Optional[typing.List[nds.adas.instantiations.adas_property.AdasProperty]]) -> None:
        if property_ is None:
            self._property_ = None
        else:
            self._property_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_property()), property_)

    def is_property_used(self) -> bool:
        return self._num_properties_ > 0

    def is_property_set(self) -> bool:
        return not self._property_ is None

    def reset_property(self) -> None:
        self._property_ = None

    def init_packing_context(self, zserio_context: AdasPropertyList.ZserioPackingContext) -> None:
        zserio_context.num_properties.init(zserio.array.BitFieldArrayTraits(8), self._num_properties_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        if self.is_property_used():
            end_bitposition += self._property_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AdasPropertyList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_properties.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_properties_)
        if self.is_property_used():
            end_bitposition += self._property_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        if self.is_property_used():
            end_bitposition = self._property_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AdasPropertyList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_properties.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_properties_)
        if self.is_property_used():
            end_bitposition = self._property_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_properties_ = zserio_reader.read_bits(8)
        if self.is_property_used():
            self._property_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_property()), zserio_reader, self._num_properties_)
        else:
            self._property_ = None

    def read_packed(self, zserio_context: AdasPropertyList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_properties_ = zserio_context.num_properties.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        if self.is_property_used():
            self._property_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_property()), zserio_reader, self._num_properties_)
        else:
            self._property_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._num_properties_, 8)

        if self.is_property_used():
            # check array length
            if len(self._property_) != (self._num_properties_):
                raise zserio.PythonRuntimeException("Wrong array length for field AdasPropertyList.property: "
                                                    f"{len(self._property_)} != {self._num_properties_}!")
            self._property_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: AdasPropertyList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_properties.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_properties_)

        if self.is_property_used():
            # check array length
            if len(self._property_) != (self._num_properties_):
                raise zserio.PythonRuntimeException("Wrong array length for field AdasPropertyList.property: "
                                                    f"{len(self._property_)} != {self._num_properties_}!")
            self._property_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_properties_ = zserio.array.DeltaContext()

        @property
        def num_properties(self):
            return self._num_properties_

    class _ZserioElementFactory_property:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.adas.instantiations.adas_property.AdasProperty:
            del zserio_index
            return nds.adas.instantiations.adas_property.AdasProperty.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.adas.instantiations.adas_property.AdasProperty.ZserioPackingContext:
            return nds.adas.instantiations.adas_property.AdasProperty.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.adas.instantiations.adas_property.AdasProperty.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.adas.instantiations.adas_property.AdasProperty:
            del zserio_index
            return nds.adas.instantiations.adas_property.AdasProperty.from_reader_packed(zserio_context, zserio_reader)
