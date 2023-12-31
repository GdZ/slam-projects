# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class DrawingOrder:
    def __init__(
            self,
            primary_drawing_order_: int = int(),
            secondary_drawing_order_: int = int()) -> None:
        self._primary_drawing_order_ = primary_drawing_order_
        self._secondary_drawing_order_ = secondary_drawing_order_

    @classmethod
    def from_reader(
            cls: typing.Type['DrawingOrder'],
            zserio_reader: zserio.BitStreamReader) -> 'DrawingOrder':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DrawingOrder'],
            zserio_context: DrawingOrder.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DrawingOrder':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DrawingOrder):
            return ((self._primary_drawing_order_ == other._primary_drawing_order_) and
                    (self._secondary_drawing_order_ == other._secondary_drawing_order_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._primary_drawing_order_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._secondary_drawing_order_)

        return result

    @property
    def primary_drawing_order(self) -> int:
        return self._primary_drawing_order_

    @primary_drawing_order.setter
    def primary_drawing_order(self, primary_drawing_order_: int) -> None:
        self._primary_drawing_order_ = primary_drawing_order_

    @property
    def secondary_drawing_order(self) -> int:
        return self._secondary_drawing_order_

    @secondary_drawing_order.setter
    def secondary_drawing_order(self, secondary_drawing_order_: int) -> None:
        self._secondary_drawing_order_ = secondary_drawing_order_

    def init_packing_context(self, zserio_context: DrawingOrder.ZserioPackingContext) -> None:
        zserio_context.primary_drawing_order.init(zserio.array.VarUInt16ArrayTraits(), self._primary_drawing_order_)
        zserio_context.secondary_drawing_order.init(zserio.array.VarUInt16ArrayTraits(), self._secondary_drawing_order_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._primary_drawing_order_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._secondary_drawing_order_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DrawingOrder.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.primary_drawing_order.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._primary_drawing_order_)
        end_bitposition += zserio_context.secondary_drawing_order.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._secondary_drawing_order_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._primary_drawing_order_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint16(self._secondary_drawing_order_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DrawingOrder.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.primary_drawing_order.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._primary_drawing_order_)
        end_bitposition += zserio_context.secondary_drawing_order.bitsizeof(zserio.array.VarUInt16ArrayTraits(), self._secondary_drawing_order_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._primary_drawing_order_ = zserio_reader.read_varuint16()
        self._secondary_drawing_order_ = zserio_reader.read_varuint16()

    def read_packed(self, zserio_context: DrawingOrder.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._primary_drawing_order_ = zserio_context.primary_drawing_order.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

        self._secondary_drawing_order_ = zserio_context.secondary_drawing_order.read(zserio.array.VarUInt16ArrayTraits(), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint16(self._primary_drawing_order_)
        zserio_writer.write_varuint16(self._secondary_drawing_order_)

    def write_packed(self, zserio_context: DrawingOrder.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.primary_drawing_order.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._primary_drawing_order_)

        zserio_context.secondary_drawing_order.write(zserio.array.VarUInt16ArrayTraits(), zserio_writer, self._secondary_drawing_order_)

    class ZserioPackingContext:
        def __init__(self):
            self._primary_drawing_order_ = zserio.array.DeltaContext()
            self._secondary_drawing_order_ = zserio.array.DeltaContext()

        @property
        def primary_drawing_order(self):
            return self._primary_drawing_order_

        @property
        def secondary_drawing_order(self):
            return self._secondary_drawing_order_
