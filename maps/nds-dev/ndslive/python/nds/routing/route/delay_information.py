# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.seconds
import nds.routing.route.delay_reason_type

class DelayInformation:
    def __init__(
            self,
            delay_: nds.core.types.seconds.Seconds = nds.core.types.seconds.Seconds(),
            reason_type_: typing.Union[nds.routing.route.delay_reason_type.DelayReasonType, None] = None,
            reason_: typing.Optional[str] = None) -> None:
        self._delay_ = delay_
        self._reason_type_ = reason_type_
        self._reason_ = reason_

    @classmethod
    def from_reader(
            cls: typing.Type['DelayInformation'],
            zserio_reader: zserio.BitStreamReader) -> 'DelayInformation':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DelayInformation'],
            zserio_context: DelayInformation.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'DelayInformation':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DelayInformation):
            return ((self._delay_ == other._delay_) and
                    (self._reason_type_ == other._reason_type_) and
                    (not other.is_reason_used() if not self.is_reason_used() else (self._reason_ == other._reason_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._delay_)
        result = zserio.hashcode.calc_hashcode_object(result, self._reason_type_)
        if self.is_reason_used():
            result = zserio.hashcode.calc_hashcode_string(result, self._reason_)

        return result

    @property
    def delay(self) -> nds.core.types.seconds.Seconds:
        return self._delay_

    @delay.setter
    def delay(self, delay_: nds.core.types.seconds.Seconds) -> None:
        self._delay_ = delay_

    @property
    def reason_type(self) -> typing.Union[nds.routing.route.delay_reason_type.DelayReasonType, None]:
        return self._reason_type_

    @reason_type.setter
    def reason_type(self, reason_type_: typing.Union[nds.routing.route.delay_reason_type.DelayReasonType, None]) -> None:
        self._reason_type_ = reason_type_

    @property
    def reason(self) -> typing.Optional[str]:
        return self._reason_

    @reason.setter
    def reason(self, reason_: typing.Optional[str]) -> None:
        self._reason_ = reason_

    def is_reason_used(self) -> bool:
        return self.is_reason_set()

    def is_reason_set(self) -> bool:
        return not self._reason_ is None

    def reset_reason(self) -> None:
        self._reason_ = None

    def init_packing_context(self, zserio_context: DelayInformation.ZserioPackingContext) -> None:
        zserio_context.delay.init(zserio.array.VarUIntArrayTraits(), self._delay_)
        self._reason_type_.init_packing_context(zserio_context.reason_type)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._delay_)
        end_bitposition += self._reason_type_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_reason_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._reason_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DelayInformation.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.delay.bitsizeof(zserio.array.VarUIntArrayTraits(), self._delay_)
        end_bitposition += self._reason_type_.bitsizeof_packed(zserio_context.reason_type, end_bitposition)
        end_bitposition += 1
        if self.is_reason_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._reason_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._delay_)
        end_bitposition = self._reason_type_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_reason_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._reason_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DelayInformation.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.delay.bitsizeof(zserio.array.VarUIntArrayTraits(), self._delay_)
        end_bitposition = self._reason_type_.initialize_offsets_packed(zserio_context.reason_type, end_bitposition)
        end_bitposition += 1
        if self.is_reason_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._reason_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._delay_ = zserio_reader.read_varuint()
        self._reason_type_ = nds.routing.route.delay_reason_type.DelayReasonType.from_reader(zserio_reader)
        if zserio_reader.read_bool():
            self._reason_ = zserio_reader.read_string()
        else:
            self._reason_ = None

    def read_packed(self, zserio_context: DelayInformation.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._delay_ = zserio_context.delay.read(zserio.array.VarUIntArrayTraits(), zserio_reader)

        self._reason_type_ = nds.routing.route.delay_reason_type.DelayReasonType.from_reader_packed(zserio_context.reason_type, zserio_reader)

        if zserio_reader.read_bool():
            self._reason_ = zserio_reader.read_string()
        else:
            self._reason_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint(self._delay_)
        self._reason_type_.write(zserio_writer)
        if self.is_reason_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_string(self._reason_)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: DelayInformation.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.delay.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._delay_)

        self._reason_type_.write_packed(zserio_context.reason_type, zserio_writer)

        if self.is_reason_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_string(self._reason_)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._delay_ = zserio.array.DeltaContext()
            self._reason_type_ = zserio.array.DeltaContext()

        @property
        def delay(self):
            return self._delay_

        @property
        def reason_type(self):
            return self._reason_type_
