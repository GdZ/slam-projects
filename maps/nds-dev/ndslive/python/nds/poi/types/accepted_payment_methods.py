# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.poi.types.payment_method

class AcceptedPaymentMethods:
    def __init__(
            self,
            num_methods_: int = int(),
            methods_: typing.List[nds.poi.types.payment_method.PaymentMethod] = None) -> None:
        self._num_methods_ = num_methods_
        self._methods_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_methods()), methods_)

    @classmethod
    def from_reader(
            cls: typing.Type['AcceptedPaymentMethods'],
            zserio_reader: zserio.BitStreamReader) -> 'AcceptedPaymentMethods':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AcceptedPaymentMethods'],
            zserio_context: AcceptedPaymentMethods.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AcceptedPaymentMethods':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AcceptedPaymentMethods):
            return ((self._num_methods_ == other._num_methods_) and
                    (self._methods_ == other._methods_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_methods_)
        result = zserio.hashcode.calc_hashcode_object(result, self._methods_)

        return result

    @property
    def num_methods(self) -> int:
        return self._num_methods_

    @num_methods.setter
    def num_methods(self, num_methods_: int) -> None:
        self._num_methods_ = num_methods_

    @property
    def methods(self) -> typing.List[nds.poi.types.payment_method.PaymentMethod]:
        return self._methods_.raw_array

    @methods.setter
    def methods(self, methods_: typing.List[nds.poi.types.payment_method.PaymentMethod]) -> None:
        self._methods_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_methods()), methods_)

    def init_packing_context(self, zserio_context: AcceptedPaymentMethods.ZserioPackingContext) -> None:
        zserio_context.num_methods.init(zserio.array.BitFieldArrayTraits(8), self._num_methods_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += self._methods_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AcceptedPaymentMethods.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_methods.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_methods_)
        end_bitposition += self._methods_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition = self._methods_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AcceptedPaymentMethods.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_methods.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_methods_)
        end_bitposition = self._methods_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_methods_ = zserio_reader.read_bits(8)
        self._methods_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_methods()), zserio_reader, self._num_methods_)

    def read_packed(self, zserio_context: AcceptedPaymentMethods.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_methods_ = zserio_context.num_methods.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._methods_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_methods()), zserio_reader, self._num_methods_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._num_methods_, 8)

        # check array length
        if len(self._methods_) != (self._num_methods_):
            raise zserio.PythonRuntimeException("Wrong array length for field AcceptedPaymentMethods.methods: "
                                                f"{len(self._methods_)} != {self._num_methods_}!")
        self._methods_.write(zserio_writer)

    def write_packed(self, zserio_context: AcceptedPaymentMethods.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_methods.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_methods_)

        # check array length
        if len(self._methods_) != (self._num_methods_):
            raise zserio.PythonRuntimeException("Wrong array length for field AcceptedPaymentMethods.methods: "
                                                f"{len(self._methods_)} != {self._num_methods_}!")
        self._methods_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_methods_ = zserio.array.DeltaContext()

        @property
        def num_methods(self):
            return self._num_methods_

    class _ZserioElementFactory_methods:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.poi.types.payment_method.PaymentMethod:
            del zserio_index
            return nds.poi.types.payment_method.PaymentMethod.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.poi.types.payment_method.PaymentMethod.ZserioPackingContext:
            return nds.poi.types.payment_method.PaymentMethod.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.poi.types.payment_method.PaymentMethod.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.poi.types.payment_method.PaymentMethod:
            del zserio_index
            return nds.poi.types.payment_method.PaymentMethod.from_reader_packed(zserio_context, zserio_reader)
