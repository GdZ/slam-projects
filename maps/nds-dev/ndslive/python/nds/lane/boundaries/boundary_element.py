# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.lane.boundaries.boundary_element_details
import nds.lane.boundaries.boundary_element_id
import nds.lane.types.boundary_element_type

class BoundaryElement:
    def __init__(
            self,
            id_: nds.lane.boundaries.boundary_element_id.BoundaryElementId = nds.lane.boundaries.boundary_element_id.BoundaryElementId(),
            type_: typing.Union[nds.lane.types.boundary_element_type.BoundaryElementType, None] = None,
            details_: typing.Union[nds.lane.boundaries.boundary_element_details.BoundaryElementDetails, None] = None) -> None:
        self._id_ = id_
        self._type_ = type_
        self._details_ = details_

    @classmethod
    def from_reader(
            cls: typing.Type['BoundaryElement'],
            zserio_reader: zserio.BitStreamReader) -> 'BoundaryElement':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['BoundaryElement'],
            zserio_context: BoundaryElement.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'BoundaryElement':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, BoundaryElement):
            return ((self._id_ == other._id_) and
                    (self._type_ == other._type_) and
                    (self._details_ == other._details_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._id_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._details_)

        return result

    @property
    def id(self) -> nds.lane.boundaries.boundary_element_id.BoundaryElementId:
        return self._id_

    @id.setter
    def id(self, id_: nds.lane.boundaries.boundary_element_id.BoundaryElementId) -> None:
        self._id_ = id_

    @property
    def type(self) -> typing.Union[nds.lane.types.boundary_element_type.BoundaryElementType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.lane.types.boundary_element_type.BoundaryElementType, None]) -> None:
        self._type_ = type_

    @property
    def details(self) -> typing.Union[nds.lane.boundaries.boundary_element_details.BoundaryElementDetails, None]:
        return self._details_

    @details.setter
    def details(self, details_: typing.Union[nds.lane.boundaries.boundary_element_details.BoundaryElementDetails, None]) -> None:
        self._details_ = details_

    def init_packing_context(self, zserio_context: BoundaryElement.ZserioPackingContext) -> None:
        zserio_context.id.init(zserio.array.VarUInt16ArrayTraits(), self._id_)
        self._type_.init_packing_context(zserio_context.type)
        self._details_.init_packing_context(zserio_context.details)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._id_)
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        end_bitposition += self._details_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: BoundaryElement.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._id_)
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        end_bitposition += self._details_.bitsizeof_packed(zserio_context.details, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._id_)
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        end_bitposition = self._details_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: BoundaryElement.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._id_)
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        end_bitposition = self._details_.initialize_offsets_packed(zserio_context.details, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_reader.read_varuint16()
        self._type_ = nds.lane.types.boundary_element_type.BoundaryElementType.from_reader(zserio_reader)
        self._details_ = nds.lane.boundaries.boundary_element_details.BoundaryElementDetails.from_reader(zserio_reader, self._type_)

    def read_packed(self, zserio_context: BoundaryElement.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._id_ = zserio_context.id.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._type_ = nds.lane.types.boundary_element_type.BoundaryElementType.from_reader_packed(zserio_context.type, zserio_reader)

        self._details_ = nds.lane.boundaries.boundary_element_details.BoundaryElementDetails.from_reader_packed(zserio_context.details, zserio_reader, self._type_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._id_)

        self._type_.write(zserio_writer)

        # check parameters
        if self._details_.type is not (self._type_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field BoundaryElement.details: "
                                                f"{self._details_.type} != {self._type_}!")
        self._details_.write(zserio_writer)

    def write_packed(self, zserio_context: BoundaryElement.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.id.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._id_)

        self._type_.write_packed(zserio_context.type, zserio_writer)

        # check parameters
        if self._details_.type is not (self._type_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field BoundaryElement.details: "
                                                f"{self._details_.type} != {self._type_}!")
        self._details_.write_packed(zserio_context.details, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = zserio.array.DeltaContext()
            self._type_ = zserio.array.DeltaContext()
            self._details_ = nds.lane.boundaries.boundary_element_details.BoundaryElementDetails.ZserioPackingContext()

        @property
        def id(self):
            return self._id_

        @property
        def type(self):
            return self._type_

        @property
        def details(self):
            return self._details_
