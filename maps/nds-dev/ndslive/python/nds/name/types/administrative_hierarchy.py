# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.name.types.admin_hierarchy_element_id

class AdministrativeHierarchy:
    def __init__(
            self,
            num_elements_: int = int(),
            admin_elements_: typing.List[nds.name.types.admin_hierarchy_element_id.AdminHierarchyElementId] = None) -> None:
        self._num_elements_ = num_elements_
        self._admin_elements_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), admin_elements_)

    @classmethod
    def from_reader(
            cls: typing.Type['AdministrativeHierarchy'],
            zserio_reader: zserio.BitStreamReader) -> 'AdministrativeHierarchy':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AdministrativeHierarchy'],
            zserio_context: AdministrativeHierarchy.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AdministrativeHierarchy':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AdministrativeHierarchy):
            return ((self._num_elements_ == other._num_elements_) and
                    (self._admin_elements_ == other._admin_elements_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_elements_)
        result = zserio.hashcode.calc_hashcode_object(result, self._admin_elements_)

        return result

    @property
    def num_elements(self) -> int:
        return self._num_elements_

    @num_elements.setter
    def num_elements(self, num_elements_: int) -> None:
        self._num_elements_ = num_elements_

    @property
    def admin_elements(self) -> typing.List[nds.name.types.admin_hierarchy_element_id.AdminHierarchyElementId]:
        return self._admin_elements_.raw_array

    @admin_elements.setter
    def admin_elements(self, admin_elements_: typing.List[nds.name.types.admin_hierarchy_element_id.AdminHierarchyElementId]) -> None:
        self._admin_elements_ = zserio.array.Array(zserio.array.VarUInt32ArrayTraits(), admin_elements_)

    def init_packing_context(self, zserio_context: AdministrativeHierarchy.ZserioPackingContext) -> None:
        zserio_context.num_elements.init(zserio.array.VarSizeArrayTraits(), self._num_elements_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_elements_)
        end_bitposition += self._admin_elements_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AdministrativeHierarchy.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_elements.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_elements_)
        end_bitposition += self._admin_elements_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_elements_)
        end_bitposition = self._admin_elements_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AdministrativeHierarchy.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_elements.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_elements_)
        end_bitposition = self._admin_elements_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_elements_ = zserio_reader.read_varsize()
        self._admin_elements_ = zserio.array.Array.from_reader(zserio.array.VarUInt32ArrayTraits(), zserio_reader, self._num_elements_)

    def read_packed(self, zserio_context: AdministrativeHierarchy.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_elements_ = zserio_context.num_elements.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._admin_elements_ = zserio.array.Array.from_reader_packed(zserio.array.VarUInt32ArrayTraits(), zserio_reader, self._num_elements_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_elements_)

        # check array length
        if len(self._admin_elements_) != (self._num_elements_):
            raise zserio.PythonRuntimeException("Wrong array length for field AdministrativeHierarchy.adminElements: "
                                                f"{len(self._admin_elements_)} != {self._num_elements_}!")
        self._admin_elements_.write(zserio_writer)

    def write_packed(self, zserio_context: AdministrativeHierarchy.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_elements.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_elements_)

        # check array length
        if len(self._admin_elements_) != (self._num_elements_):
            raise zserio.PythonRuntimeException("Wrong array length for field AdministrativeHierarchy.adminElements: "
                                                f"{len(self._admin_elements_)} != {self._num_elements_}!")
        self._admin_elements_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_elements_ = zserio.array.DeltaContext()

        @property
        def num_elements(self):
            return self._num_elements_
