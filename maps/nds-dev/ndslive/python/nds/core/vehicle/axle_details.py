# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.vehicle.axle_weight
import nds.core.vehicle.num_axles

class AxleDetails:
    def __init__(
            self,
            num_axles_: nds.core.vehicle.num_axles.NumAxles = nds.core.vehicle.num_axles.NumAxles(),
            max_tandem_axle_weight_: nds.core.vehicle.axle_weight.AxleWeight = nds.core.vehicle.axle_weight.AxleWeight(),
            max_tridem_axle_weight_: nds.core.vehicle.axle_weight.AxleWeight = nds.core.vehicle.axle_weight.AxleWeight(),
            max_steering_axle_weight_: nds.core.vehicle.axle_weight.AxleWeight = nds.core.vehicle.axle_weight.AxleWeight()) -> None:
        self._num_axles_ = num_axles_
        self._max_tandem_axle_weight_ = max_tandem_axle_weight_
        self._max_tridem_axle_weight_ = max_tridem_axle_weight_
        self._max_steering_axle_weight_ = max_steering_axle_weight_

    @classmethod
    def from_reader(
            cls: typing.Type['AxleDetails'],
            zserio_reader: zserio.BitStreamReader) -> 'AxleDetails':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['AxleDetails'],
            zserio_context: AxleDetails.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'AxleDetails':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, AxleDetails):
            return ((self._num_axles_ == other._num_axles_) and
                    (self._max_tandem_axle_weight_ == other._max_tandem_axle_weight_) and
                    (self._max_tridem_axle_weight_ == other._max_tridem_axle_weight_) and
                    (self._max_steering_axle_weight_ == other._max_steering_axle_weight_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._num_axles_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._max_tandem_axle_weight_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._max_tridem_axle_weight_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._max_steering_axle_weight_)

        return result

    @property
    def num_axles(self) -> nds.core.vehicle.num_axles.NumAxles:
        return self._num_axles_

    @num_axles.setter
    def num_axles(self, num_axles_: nds.core.vehicle.num_axles.NumAxles) -> None:
        self._num_axles_ = num_axles_

    @property
    def max_tandem_axle_weight(self) -> nds.core.vehicle.axle_weight.AxleWeight:
        return self._max_tandem_axle_weight_

    @max_tandem_axle_weight.setter
    def max_tandem_axle_weight(self, max_tandem_axle_weight_: nds.core.vehicle.axle_weight.AxleWeight) -> None:
        self._max_tandem_axle_weight_ = max_tandem_axle_weight_

    @property
    def max_tridem_axle_weight(self) -> nds.core.vehicle.axle_weight.AxleWeight:
        return self._max_tridem_axle_weight_

    @max_tridem_axle_weight.setter
    def max_tridem_axle_weight(self, max_tridem_axle_weight_: nds.core.vehicle.axle_weight.AxleWeight) -> None:
        self._max_tridem_axle_weight_ = max_tridem_axle_weight_

    @property
    def max_steering_axle_weight(self) -> nds.core.vehicle.axle_weight.AxleWeight:
        return self._max_steering_axle_weight_

    @max_steering_axle_weight.setter
    def max_steering_axle_weight(self, max_steering_axle_weight_: nds.core.vehicle.axle_weight.AxleWeight) -> None:
        self._max_steering_axle_weight_ = max_steering_axle_weight_

    def init_packing_context(self, zserio_context: AxleDetails.ZserioPackingContext) -> None:
        zserio_context.num_axles.init(zserio.array.BitFieldArrayTraits(8), self._num_axles_)
        zserio_context.max_tandem_axle_weight.init(zserio.array.VarUInt32ArrayTraits(), self._max_tandem_axle_weight_)
        zserio_context.max_tridem_axle_weight.init(zserio.array.VarUInt32ArrayTraits(), self._max_tridem_axle_weight_)
        zserio_context.max_steering_axle_weight.init(zserio.array.VarUInt32ArrayTraits(), self._max_steering_axle_weight_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._max_tandem_axle_weight_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._max_tridem_axle_weight_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._max_steering_axle_weight_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: AxleDetails.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_axles.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_axles_)
        end_bitposition += zserio_context.max_tandem_axle_weight.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._max_tandem_axle_weight_)
        end_bitposition += zserio_context.max_tridem_axle_weight.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._max_tridem_axle_weight_)
        end_bitposition += zserio_context.max_steering_axle_weight.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._max_steering_axle_weight_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 8
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._max_tandem_axle_weight_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._max_tridem_axle_weight_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._max_steering_axle_weight_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: AxleDetails.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_axles.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._num_axles_)
        end_bitposition += zserio_context.max_tandem_axle_weight.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._max_tandem_axle_weight_)
        end_bitposition += zserio_context.max_tridem_axle_weight.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._max_tridem_axle_weight_)
        end_bitposition += zserio_context.max_steering_axle_weight.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._max_steering_axle_weight_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_axles_ = zserio_reader.read_bits(8)
        self._max_tandem_axle_weight_ = zserio_reader.read_varuint32()
        self._max_tridem_axle_weight_ = zserio_reader.read_varuint32()
        self._max_steering_axle_weight_ = zserio_reader.read_varuint32()

    def read_packed(self, zserio_context: AxleDetails.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_axles_ = zserio_context.num_axles.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)

        self._max_tandem_axle_weight_ = zserio_context.max_tandem_axle_weight.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

        self._max_tridem_axle_weight_ = zserio_context.max_tridem_axle_weight.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

        self._max_steering_axle_weight_ = zserio_context.max_steering_axle_weight.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._num_axles_, 8)
        zserio_writer.write_varuint32(self._max_tandem_axle_weight_)
        zserio_writer.write_varuint32(self._max_tridem_axle_weight_)
        zserio_writer.write_varuint32(self._max_steering_axle_weight_)

    def write_packed(self, zserio_context: AxleDetails.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_axles.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._num_axles_)

        zserio_context.max_tandem_axle_weight.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._max_tandem_axle_weight_)

        zserio_context.max_tridem_axle_weight.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._max_tridem_axle_weight_)

        zserio_context.max_steering_axle_weight.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._max_steering_axle_weight_)

    class ZserioPackingContext:
        def __init__(self):
            self._num_axles_ = zserio.array.DeltaContext()
            self._max_tandem_axle_weight_ = zserio.array.DeltaContext()
            self._max_tridem_axle_weight_ = zserio.array.DeltaContext()
            self._max_steering_axle_weight_ = zserio.array.DeltaContext()

        @property
        def num_axles(self):
            return self._num_axles_

        @property
        def max_tandem_axle_weight(self):
            return self._max_tandem_axle_weight_

        @property
        def max_tridem_axle_weight(self):
            return self._max_tridem_axle_weight_

        @property
        def max_steering_axle_weight(self):
            return self._max_steering_axle_weight_
