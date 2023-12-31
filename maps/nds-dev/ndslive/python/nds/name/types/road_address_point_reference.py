# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.road.reference.types.road_position_validity
import nds.road.reference.types.road_reference_indirect

class RoadAddressPointReference:
    def __init__(
            self,
            indirect_reference_: typing.Union[nds.road.reference.types.road_reference_indirect.RoadReferenceIndirect, None] = None,
            position_: typing.Union[nds.road.reference.types.road_position_validity.RoadPositionValidity, None] = None) -> None:
        self._indirect_reference_ = indirect_reference_
        self._position_ = position_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadAddressPointReference'],
            zserio_reader: zserio.BitStreamReader) -> 'RoadAddressPointReference':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadAddressPointReference'],
            zserio_context: RoadAddressPointReference.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RoadAddressPointReference':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadAddressPointReference):
            return ((self._indirect_reference_ == other._indirect_reference_) and
                    (self._position_ == other._position_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._indirect_reference_)
        result = zserio.hashcode.calc_hashcode_object(result, self._position_)

        return result

    @property
    def indirect_reference(self) -> typing.Union[nds.road.reference.types.road_reference_indirect.RoadReferenceIndirect, None]:
        return self._indirect_reference_

    @indirect_reference.setter
    def indirect_reference(self, indirect_reference_: typing.Union[nds.road.reference.types.road_reference_indirect.RoadReferenceIndirect, None]) -> None:
        self._indirect_reference_ = indirect_reference_

    @property
    def position(self) -> typing.Union[nds.road.reference.types.road_position_validity.RoadPositionValidity, None]:
        return self._position_

    @position.setter
    def position(self, position_: typing.Union[nds.road.reference.types.road_position_validity.RoadPositionValidity, None]) -> None:
        self._position_ = position_

    def init_packing_context(self, zserio_context: RoadAddressPointReference.ZserioPackingContext) -> None:
        self._indirect_reference_.init_packing_context(zserio_context.indirect_reference)
        self._position_.init_packing_context(zserio_context.position)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._indirect_reference_.bitsizeof(end_bitposition)
        end_bitposition += self._position_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadAddressPointReference.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._indirect_reference_.bitsizeof_packed(zserio_context.indirect_reference, end_bitposition)
        end_bitposition += self._position_.bitsizeof_packed(zserio_context.position, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._indirect_reference_.initialize_offsets(end_bitposition)
        end_bitposition = self._position_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadAddressPointReference.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._indirect_reference_.initialize_offsets_packed(zserio_context.indirect_reference, end_bitposition)
        end_bitposition = self._position_.initialize_offsets_packed(zserio_context.position, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._indirect_reference_ = nds.road.reference.types.road_reference_indirect.RoadReferenceIndirect.from_reader(zserio_reader)
        self._position_ = nds.road.reference.types.road_position_validity.RoadPositionValidity.from_reader(zserio_reader, 0)

    def read_packed(self, zserio_context: RoadAddressPointReference.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._indirect_reference_ = nds.road.reference.types.road_reference_indirect.RoadReferenceIndirect.from_reader_packed(zserio_context.indirect_reference, zserio_reader)

        self._position_ = nds.road.reference.types.road_position_validity.RoadPositionValidity.from_reader_packed(zserio_context.position, zserio_reader, 0)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._indirect_reference_.write(zserio_writer)

        # check parameters
        if self._position_.shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadAddressPointReference.position: "
                                                f"{self._position_.shift} != {0}!")
        self._position_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadAddressPointReference.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._indirect_reference_.write_packed(zserio_context.indirect_reference, zserio_writer)

        # check parameters
        if self._position_.shift != (0):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field RoadAddressPointReference.position: "
                                                f"{self._position_.shift} != {0}!")
        self._position_.write_packed(zserio_context.position, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._indirect_reference_ = nds.road.reference.types.road_reference_indirect.RoadReferenceIndirect.ZserioPackingContext()
            self._position_ = nds.road.reference.types.road_position_validity.RoadPositionValidity.ZserioPackingContext()

        @property
        def indirect_reference(self):
            return self._indirect_reference_

        @property
        def position(self):
            return self._position_
