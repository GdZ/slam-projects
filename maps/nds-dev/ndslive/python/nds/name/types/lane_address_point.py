# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.name.types.address_point_type
import nds.name.types.lane_address_point_reference

class LaneAddressPoint:
    def __init__(
            self,
            type_: typing.Union[nds.name.types.address_point_type.AddressPointType, None] = None,
            access_positions_: typing.Optional[typing.List[nds.name.types.lane_address_point_reference.LaneAddressPointReference]] = None,
            postal_position_: typing.Optional[nds.name.types.lane_address_point_reference.LaneAddressPointReference] = None) -> None:
        self._type_ = type_
        if access_positions_ is None:
            self._access_positions_ = None
        else:
            self._access_positions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_access_positions()), access_positions_, is_auto=True)
        self._postal_position_ = postal_position_

    @classmethod
    def from_reader(
            cls: typing.Type['LaneAddressPoint'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneAddressPoint':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneAddressPoint'],
            zserio_context: LaneAddressPoint.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneAddressPoint':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneAddressPoint):
            return ((self._type_ == other._type_) and
                    (not other.is_access_positions_used() if not self.is_access_positions_used() else (self._access_positions_ == other._access_positions_)) and
                    (not other.is_postal_position_used() if not self.is_postal_position_used() else (self._postal_position_ == other._postal_position_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        if self.is_access_positions_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._access_positions_)
        if self.is_postal_position_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._postal_position_)

        return result

    @property
    def type(self) -> typing.Union[nds.name.types.address_point_type.AddressPointType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.name.types.address_point_type.AddressPointType, None]) -> None:
        self._type_ = type_

    @property
    def access_positions(self) -> typing.Optional[typing.List[nds.name.types.lane_address_point_reference.LaneAddressPointReference]]:
        return None if self._access_positions_ is None else self._access_positions_.raw_array

    @access_positions.setter
    def access_positions(self, access_positions_: typing.Optional[typing.List[nds.name.types.lane_address_point_reference.LaneAddressPointReference]]) -> None:
        if access_positions_ is None:
            self._access_positions_ = None
        else:
            self._access_positions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_access_positions()), access_positions_, is_auto=True)

    def is_access_positions_used(self) -> bool:
        return self._type_ == nds.name.types.address_point_type.AddressPointType.POSTAL_POSITION

    def is_access_positions_set(self) -> bool:
        return not self._access_positions_ is None

    def reset_access_positions(self) -> None:
        self._access_positions_ = None

    @property
    def postal_position(self) -> typing.Optional[nds.name.types.lane_address_point_reference.LaneAddressPointReference]:
        return self._postal_position_

    @postal_position.setter
    def postal_position(self, postal_position_: typing.Optional[nds.name.types.lane_address_point_reference.LaneAddressPointReference]) -> None:
        self._postal_position_ = postal_position_

    def is_postal_position_used(self) -> bool:
        return self._type_ == nds.name.types.address_point_type.AddressPointType.ACCESS_POSITION

    def is_postal_position_set(self) -> bool:
        return not self._postal_position_ is None

    def reset_postal_position(self) -> None:
        self._postal_position_ = None

    def init_packing_context(self, zserio_context: LaneAddressPoint.ZserioPackingContext) -> None:
        self._type_.init_packing_context(zserio_context.type)
        if self.is_postal_position_used():
            self._postal_position_.init_packing_context(zserio_context.postal_position)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof(end_bitposition)
        if self.is_access_positions_used():
            end_bitposition += self._access_positions_.bitsizeof(end_bitposition)
        if self.is_postal_position_used():
            end_bitposition += self._postal_position_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneAddressPoint.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)
        if self.is_access_positions_used():
            end_bitposition += self._access_positions_.bitsizeof_packed(end_bitposition)
        if self.is_postal_position_used():
            end_bitposition += self._postal_position_.bitsizeof_packed(zserio_context.postal_position, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets(end_bitposition)
        if self.is_access_positions_used():
            end_bitposition = self._access_positions_.initialize_offsets(end_bitposition)
        if self.is_postal_position_used():
            end_bitposition = self._postal_position_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneAddressPoint.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)
        if self.is_access_positions_used():
            end_bitposition = self._access_positions_.initialize_offsets_packed(end_bitposition)
        if self.is_postal_position_used():
            end_bitposition = self._postal_position_.initialize_offsets_packed(zserio_context.postal_position, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.name.types.address_point_type.AddressPointType.from_reader(zserio_reader)
        if self.is_access_positions_used():
            self._access_positions_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_access_positions()), zserio_reader, is_auto=True)
        else:
            self._access_positions_ = None
        if self.is_postal_position_used():
            self._postal_position_ = nds.name.types.lane_address_point_reference.LaneAddressPointReference.from_reader(zserio_reader)
        else:
            self._postal_position_ = None

    def read_packed(self, zserio_context: LaneAddressPoint.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._type_ = nds.name.types.address_point_type.AddressPointType.from_reader_packed(zserio_context.type, zserio_reader)

        if self.is_access_positions_used():
            self._access_positions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_access_positions()), zserio_reader, is_auto=True)
        else:
            self._access_positions_ = None

        if self.is_postal_position_used():
            self._postal_position_ = nds.name.types.lane_address_point_reference.LaneAddressPointReference.from_reader_packed(zserio_context.postal_position, zserio_reader)
        else:
            self._postal_position_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write(zserio_writer)
        if self.is_access_positions_used():
            self._access_positions_.write(zserio_writer)
        if self.is_postal_position_used():
            self._postal_position_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneAddressPoint.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._type_.write_packed(zserio_context.type, zserio_writer)

        if self.is_access_positions_used():
            self._access_positions_.write_packed(zserio_writer)

        if self.is_postal_position_used():
            self._postal_position_.write_packed(zserio_context.postal_position, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._type_ = zserio.array.DeltaContext()
            self._postal_position_ = nds.name.types.lane_address_point_reference.LaneAddressPointReference.ZserioPackingContext()

        @property
        def type(self):
            return self._type_

        @property
        def postal_position(self):
            return self._postal_position_

    class _ZserioElementFactory_access_positions:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.lane_address_point_reference.LaneAddressPointReference:
            del zserio_index
            return nds.name.types.lane_address_point_reference.LaneAddressPointReference.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.name.types.lane_address_point_reference.LaneAddressPointReference.ZserioPackingContext:
            return nds.name.types.lane_address_point_reference.LaneAddressPointReference.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.name.types.lane_address_point_reference.LaneAddressPointReference.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.name.types.lane_address_point_reference.LaneAddressPointReference:
            del zserio_index
            return nds.name.types.lane_address_point_reference.LaneAddressPointReference.from_reader_packed(zserio_context, zserio_reader)
