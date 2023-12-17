# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routing.types.route_option_type

class RouteOptions:
    def __init__(
            self,
            avoid_: bool = True,
            weight_: typing.Optional[int] = None,
            type_: typing.Union[nds.routing.types.route_option_type.RouteOptionType, None] = None) -> None:
        self._avoid_ = avoid_
        self._weight_ = weight_
        self._type_ = type_

    @classmethod
    def from_reader(
            cls: typing.Type['RouteOptions'],
            zserio_reader: zserio.BitStreamReader) -> 'RouteOptions':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RouteOptions'],
            zserio_context: RouteOptions.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'RouteOptions':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RouteOptions):
            return ((self._avoid_ == other._avoid_) and
                    (not other.is_weight_used() if not self.is_weight_used() else (self._weight_ == other._weight_)) and
                    (self._type_ == other._type_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._avoid_)
        if self.is_weight_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._weight_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)

        return result

    @property
    def avoid(self) -> bool:
        return self._avoid_

    @avoid.setter
    def avoid(self, avoid_: bool) -> None:
        self._avoid_ = avoid_

    @property
    def weight(self) -> typing.Optional[int]:
        return self._weight_

    @weight.setter
    def weight(self, weight_: typing.Optional[int]) -> None:
        self._weight_ = weight_

    def is_weight_used(self) -> bool:
        return self.is_weight_set()

    def is_weight_set(self) -> bool:
        return not self._weight_ is None

    def reset_weight(self) -> None:
        self._weight_ = None

    @property
    def type(self) -> typing.Union[nds.routing.types.route_option_type.RouteOptionType, None]:
        return self._type_

    @type.setter
    def type(self, type_: typing.Union[nds.routing.types.route_option_type.RouteOptionType, None]) -> None:
        self._type_ = type_

    def init_packing_context(self, zserio_context: RouteOptions.ZserioPackingContext) -> None:
        if self.is_weight_used():
            zserio_context.weight.init(zserio.array.BitFieldArrayTraits(8), self._weight_)
        self._type_.init_packing_context(zserio_context.type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_weight_used():
            end_bitposition += 8
        end_bitposition += self._type_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RouteOptions.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_weight_used():
            end_bitposition += zserio_context.weight.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._weight_)
        end_bitposition += self._type_.bitsizeof_packed(zserio_context.type, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_weight_used():
            end_bitposition += 8
        end_bitposition = self._type_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RouteOptions.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        end_bitposition += 1
        if self.is_weight_used():
            end_bitposition += zserio_context.weight.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._weight_)
        end_bitposition = self._type_.initialize_offsets_packed(zserio_context.type, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._avoid_ = zserio_reader.read_bool()

        if zserio_reader.read_bool():
            self._weight_ = zserio_reader.read_bits(8)
            # check constraint
            if not (self._weight_ <= 100 and self._weight_ != 0):
                raise zserio.PythonRuntimeException("Constraint violated for field RouteOptions.weight!")
        else:
            self._weight_ = None

        self._type_ = nds.routing.types.route_option_type.RouteOptionType.from_reader(zserio_reader)

    def read_packed(self, zserio_context: RouteOptions.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._avoid_ = zserio_reader.read_bool()

        if zserio_reader.read_bool():
            self._weight_ = zserio_context.weight.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
            # check constraint
            if not (self._weight_ <= 100 and self._weight_ != 0):
                raise zserio.PythonRuntimeException("Constraint violated for field RouteOptions.weight!")
        else:
            self._weight_ = None

        self._type_ = nds.routing.types.route_option_type.RouteOptionType.from_reader_packed(zserio_context.type, zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._avoid_)

        if self.is_weight_used():
            zserio_writer.write_bool(True)
            # check constraint
            if not (self._weight_ <= 100 and self._weight_ != 0):
                raise zserio.PythonRuntimeException("Constraint violated for field RouteOptions.weight!")
            zserio_writer.write_bits(self._weight_, 8)
        else:
            zserio_writer.write_bool(False)

        self._type_.write(zserio_writer)

    def write_packed(self, zserio_context: RouteOptions.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._avoid_)

        if self.is_weight_used():
            zserio_writer.write_bool(True)
            # check constraint
            if not (self._weight_ <= 100 and self._weight_ != 0):
                raise zserio.PythonRuntimeException("Constraint violated for field RouteOptions.weight!")
            zserio_context.weight.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._weight_)
        else:
            zserio_writer.write_bool(False)

        self._type_.write_packed(zserio_context.type, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._weight_ = zserio.array.DeltaContext()
            self._type_ = zserio.array.DeltaContext()

        @property
        def weight(self):
            return self._weight_

        @property
        def type(self):
            return self._type_