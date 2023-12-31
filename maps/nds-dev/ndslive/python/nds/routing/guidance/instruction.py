# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.routing.guidance.guidance_lanes
import nds.routing.guidance.guidance_name
import nds.routing.types.ext_guidance_code
import nds.routing.types.guidance_code

class Instruction:
    def __init__(
            self,
            target_index_: int = int(),
            activation_distance_: int = int(),
            guidance_code_: typing.Union[nds.routing.types.guidance_code.GuidanceCode, None] = None,
            ext_guidance_code_: typing.Optional[nds.routing.types.ext_guidance_code.ExtGuidanceCode] = None,
            roundabout_exit_number_: typing.Optional[int] = None,
            target_name_: typing.Optional[nds.routing.guidance.guidance_name.GuidanceName] = None,
            towards_name_: typing.Optional[nds.routing.guidance.guidance_name.GuidanceName] = None,
            lanes_: typing.Optional[nds.routing.guidance.guidance_lanes.GuidanceLanes] = None) -> None:
        self._target_index_ = target_index_
        self._activation_distance_ = activation_distance_
        self._guidance_code_ = guidance_code_
        self._ext_guidance_code_ = ext_guidance_code_
        self._roundabout_exit_number_ = roundabout_exit_number_
        self._target_name_ = target_name_
        self._towards_name_ = towards_name_
        self._lanes_ = lanes_

    @classmethod
    def from_reader(
            cls: typing.Type['Instruction'],
            zserio_reader: zserio.BitStreamReader) -> 'Instruction':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Instruction'],
            zserio_context: Instruction.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'Instruction':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Instruction):
            return ((self._target_index_ == other._target_index_) and
                    (self._activation_distance_ == other._activation_distance_) and
                    (self._guidance_code_ == other._guidance_code_) and
                    (not other.is_ext_guidance_code_used() if not self.is_ext_guidance_code_used() else (self._ext_guidance_code_ == other._ext_guidance_code_)) and
                    (not other.is_roundabout_exit_number_used() if not self.is_roundabout_exit_number_used() else (self._roundabout_exit_number_ == other._roundabout_exit_number_)) and
                    (not other.is_target_name_used() if not self.is_target_name_used() else (self._target_name_ == other._target_name_)) and
                    (not other.is_towards_name_used() if not self.is_towards_name_used() else (self._towards_name_ == other._towards_name_)) and
                    (not other.is_lanes_used() if not self.is_lanes_used() else (self._lanes_ == other._lanes_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._target_index_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._activation_distance_)
        result = zserio.hashcode.calc_hashcode_object(result, self._guidance_code_)
        if self.is_ext_guidance_code_used():
            result = zserio.hashcode.calc_hashcode_string(result, self._ext_guidance_code_)
        if self.is_roundabout_exit_number_used():
            result = zserio.hashcode.calc_hashcode_int32(result, self._roundabout_exit_number_)
        if self.is_target_name_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._target_name_)
        if self.is_towards_name_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._towards_name_)
        if self.is_lanes_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._lanes_)

        return result

    @property
    def target_index(self) -> int:
        return self._target_index_

    @target_index.setter
    def target_index(self, target_index_: int) -> None:
        self._target_index_ = target_index_

    @property
    def activation_distance(self) -> int:
        return self._activation_distance_

    @activation_distance.setter
    def activation_distance(self, activation_distance_: int) -> None:
        self._activation_distance_ = activation_distance_

    @property
    def guidance_code(self) -> typing.Union[nds.routing.types.guidance_code.GuidanceCode, None]:
        return self._guidance_code_

    @guidance_code.setter
    def guidance_code(self, guidance_code_: typing.Union[nds.routing.types.guidance_code.GuidanceCode, None]) -> None:
        self._guidance_code_ = guidance_code_

    @property
    def ext_guidance_code(self) -> typing.Optional[nds.routing.types.ext_guidance_code.ExtGuidanceCode]:
        return self._ext_guidance_code_

    @ext_guidance_code.setter
    def ext_guidance_code(self, ext_guidance_code_: typing.Optional[nds.routing.types.ext_guidance_code.ExtGuidanceCode]) -> None:
        self._ext_guidance_code_ = ext_guidance_code_

    def is_ext_guidance_code_used(self) -> bool:
        return self.is_ext_guidance_code_set()

    def is_ext_guidance_code_set(self) -> bool:
        return not self._ext_guidance_code_ is None

    def reset_ext_guidance_code(self) -> None:
        self._ext_guidance_code_ = None

    @property
    def roundabout_exit_number(self) -> typing.Optional[int]:
        return self._roundabout_exit_number_

    @roundabout_exit_number.setter
    def roundabout_exit_number(self, roundabout_exit_number_: typing.Optional[int]) -> None:
        self._roundabout_exit_number_ = roundabout_exit_number_

    def is_roundabout_exit_number_used(self) -> bool:
        return self._guidance_code_ == nds.routing.types.guidance_code.GuidanceCode.ROUNDABOUT or self._guidance_code_ == nds.routing.types.guidance_code.GuidanceCode.ROUNDABOUT_REVERSED

    def is_roundabout_exit_number_set(self) -> bool:
        return not self._roundabout_exit_number_ is None

    def reset_roundabout_exit_number(self) -> None:
        self._roundabout_exit_number_ = None

    @property
    def target_name(self) -> typing.Optional[nds.routing.guidance.guidance_name.GuidanceName]:
        return self._target_name_

    @target_name.setter
    def target_name(self, target_name_: typing.Optional[nds.routing.guidance.guidance_name.GuidanceName]) -> None:
        self._target_name_ = target_name_

    def is_target_name_used(self) -> bool:
        return self.is_target_name_set()

    def is_target_name_set(self) -> bool:
        return not self._target_name_ is None

    def reset_target_name(self) -> None:
        self._target_name_ = None

    @property
    def towards_name(self) -> typing.Optional[nds.routing.guidance.guidance_name.GuidanceName]:
        return self._towards_name_

    @towards_name.setter
    def towards_name(self, towards_name_: typing.Optional[nds.routing.guidance.guidance_name.GuidanceName]) -> None:
        self._towards_name_ = towards_name_

    def is_towards_name_used(self) -> bool:
        return self.is_towards_name_set()

    def is_towards_name_set(self) -> bool:
        return not self._towards_name_ is None

    def reset_towards_name(self) -> None:
        self._towards_name_ = None

    @property
    def lanes(self) -> typing.Optional[nds.routing.guidance.guidance_lanes.GuidanceLanes]:
        return self._lanes_

    @lanes.setter
    def lanes(self, lanes_: typing.Optional[nds.routing.guidance.guidance_lanes.GuidanceLanes]) -> None:
        self._lanes_ = lanes_

    def is_lanes_used(self) -> bool:
        return self.is_lanes_set()

    def is_lanes_set(self) -> bool:
        return not self._lanes_ is None

    def reset_lanes(self) -> None:
        self._lanes_ = None

    def init_packing_context(self, zserio_context: Instruction.ZserioPackingContext) -> None:
        zserio_context.target_index.init(zserio.array.VarUIntArrayTraits(), self._target_index_)
        zserio_context.activation_distance.init(zserio.array.VarUIntArrayTraits(), self._activation_distance_)
        self._guidance_code_.init_packing_context(zserio_context.guidance_code)
        if self.is_roundabout_exit_number_used():
            zserio_context.roundabout_exit_number.init(zserio.array.BitFieldArrayTraits(8), self._roundabout_exit_number_)
        if self.is_target_name_used():
            self._target_name_.init_packing_context(zserio_context.target_name)
        if self.is_towards_name_used():
            self._towards_name_.init_packing_context(zserio_context.towards_name)
        if self.is_lanes_used():
            self._lanes_.init_packing_context(zserio_context.lanes)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._target_index_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._activation_distance_)
        end_bitposition += self._guidance_code_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_ext_guidance_code_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._ext_guidance_code_)
        if self.is_roundabout_exit_number_used():
            end_bitposition += 8
        end_bitposition += 1
        if self.is_target_name_used():
            end_bitposition += self._target_name_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_towards_name_used():
            end_bitposition += self._towards_name_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_lanes_used():
            end_bitposition += self._lanes_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Instruction.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.target_index.bitsizeof(zserio.array.VarUIntArrayTraits(), self._target_index_)
        end_bitposition += zserio_context.activation_distance.bitsizeof(zserio.array.VarUIntArrayTraits(), self._activation_distance_)
        end_bitposition += self._guidance_code_.bitsizeof_packed(zserio_context.guidance_code, end_bitposition)
        end_bitposition += 1
        if self.is_ext_guidance_code_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._ext_guidance_code_)
        if self.is_roundabout_exit_number_used():
            end_bitposition += zserio_context.roundabout_exit_number.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._roundabout_exit_number_)
        end_bitposition += 1
        if self.is_target_name_used():
            end_bitposition += self._target_name_.bitsizeof_packed(zserio_context.target_name, end_bitposition)
        end_bitposition += 1
        if self.is_towards_name_used():
            end_bitposition += self._towards_name_.bitsizeof_packed(zserio_context.towards_name, end_bitposition)
        end_bitposition += 1
        if self.is_lanes_used():
            end_bitposition += self._lanes_.bitsizeof_packed(zserio_context.lanes, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._target_index_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._activation_distance_)
        end_bitposition = self._guidance_code_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_ext_guidance_code_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._ext_guidance_code_)
        if self.is_roundabout_exit_number_used():
            end_bitposition += 8
        end_bitposition += 1
        if self.is_target_name_used():
            end_bitposition = self._target_name_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_towards_name_used():
            end_bitposition = self._towards_name_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_lanes_used():
            end_bitposition = self._lanes_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Instruction.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.target_index.bitsizeof(zserio.array.VarUIntArrayTraits(), self._target_index_)
        end_bitposition += zserio_context.activation_distance.bitsizeof(zserio.array.VarUIntArrayTraits(), self._activation_distance_)
        end_bitposition = self._guidance_code_.initialize_offsets_packed(zserio_context.guidance_code, end_bitposition)
        end_bitposition += 1
        if self.is_ext_guidance_code_used():
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._ext_guidance_code_)
        if self.is_roundabout_exit_number_used():
            end_bitposition += zserio_context.roundabout_exit_number.bitsizeof(zserio.array.BitFieldArrayTraits(8), self._roundabout_exit_number_)
        end_bitposition += 1
        if self.is_target_name_used():
            end_bitposition = self._target_name_.initialize_offsets_packed(zserio_context.target_name, end_bitposition)
        end_bitposition += 1
        if self.is_towards_name_used():
            end_bitposition = self._towards_name_.initialize_offsets_packed(zserio_context.towards_name, end_bitposition)
        end_bitposition += 1
        if self.is_lanes_used():
            end_bitposition = self._lanes_.initialize_offsets_packed(zserio_context.lanes, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._target_index_ = zserio_reader.read_varuint()
        self._activation_distance_ = zserio_reader.read_varuint()
        self._guidance_code_ = nds.routing.types.guidance_code.GuidanceCode.from_reader(zserio_reader)
        if zserio_reader.read_bool():
            self._ext_guidance_code_ = zserio_reader.read_string()
        else:
            self._ext_guidance_code_ = None
        if self.is_roundabout_exit_number_used():
            self._roundabout_exit_number_ = zserio_reader.read_bits(8)
        else:
            self._roundabout_exit_number_ = None
        if zserio_reader.read_bool():
            self._target_name_ = nds.routing.guidance.guidance_name.GuidanceName.from_reader(zserio_reader)
        else:
            self._target_name_ = None
        if zserio_reader.read_bool():
            self._towards_name_ = nds.routing.guidance.guidance_name.GuidanceName.from_reader(zserio_reader)
        else:
            self._towards_name_ = None
        if zserio_reader.read_bool():
            self._lanes_ = nds.routing.guidance.guidance_lanes.GuidanceLanes.from_reader(zserio_reader)
        else:
            self._lanes_ = None

    def read_packed(self, zserio_context: Instruction.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._target_index_ = zserio_context.target_index.read(zserio.array.VarUIntArrayTraits(), zserio_reader)

        self._activation_distance_ = zserio_context.activation_distance.read(zserio.array.VarUIntArrayTraits(), zserio_reader)

        self._guidance_code_ = nds.routing.types.guidance_code.GuidanceCode.from_reader_packed(zserio_context.guidance_code, zserio_reader)

        if zserio_reader.read_bool():
            self._ext_guidance_code_ = zserio_reader.read_string()
        else:
            self._ext_guidance_code_ = None

        if self.is_roundabout_exit_number_used():
            self._roundabout_exit_number_ = zserio_context.roundabout_exit_number.read(zserio.array.BitFieldArrayTraits(8), zserio_reader)
        else:
            self._roundabout_exit_number_ = None

        if zserio_reader.read_bool():
            self._target_name_ = nds.routing.guidance.guidance_name.GuidanceName.from_reader_packed(zserio_context.target_name, zserio_reader)
        else:
            self._target_name_ = None

        if zserio_reader.read_bool():
            self._towards_name_ = nds.routing.guidance.guidance_name.GuidanceName.from_reader_packed(zserio_context.towards_name, zserio_reader)
        else:
            self._towards_name_ = None

        if zserio_reader.read_bool():
            self._lanes_ = nds.routing.guidance.guidance_lanes.GuidanceLanes.from_reader_packed(zserio_context.lanes, zserio_reader)
        else:
            self._lanes_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint(self._target_index_)
        zserio_writer.write_varuint(self._activation_distance_)
        self._guidance_code_.write(zserio_writer)
        if self.is_ext_guidance_code_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_string(self._ext_guidance_code_)
        else:
            zserio_writer.write_bool(False)
        if self.is_roundabout_exit_number_used():
            zserio_writer.write_bits(self._roundabout_exit_number_, 8)
        if self.is_target_name_used():
            zserio_writer.write_bool(True)
            self._target_name_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_towards_name_used():
            zserio_writer.write_bool(True)
            self._towards_name_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)
        if self.is_lanes_used():
            zserio_writer.write_bool(True)
            self._lanes_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: Instruction.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.target_index.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._target_index_)

        zserio_context.activation_distance.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._activation_distance_)

        self._guidance_code_.write_packed(zserio_context.guidance_code, zserio_writer)

        if self.is_ext_guidance_code_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_string(self._ext_guidance_code_)
        else:
            zserio_writer.write_bool(False)

        if self.is_roundabout_exit_number_used():
            zserio_context.roundabout_exit_number.write(zserio.array.BitFieldArrayTraits(8), zserio_writer, self._roundabout_exit_number_)

        if self.is_target_name_used():
            zserio_writer.write_bool(True)
            self._target_name_.write_packed(zserio_context.target_name, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_towards_name_used():
            zserio_writer.write_bool(True)
            self._towards_name_.write_packed(zserio_context.towards_name, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_lanes_used():
            zserio_writer.write_bool(True)
            self._lanes_.write_packed(zserio_context.lanes, zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._target_index_ = zserio.array.DeltaContext()
            self._activation_distance_ = zserio.array.DeltaContext()
            self._guidance_code_ = zserio.array.DeltaContext()
            self._roundabout_exit_number_ = zserio.array.DeltaContext()
            self._target_name_ = nds.routing.guidance.guidance_name.GuidanceName.ZserioPackingContext()
            self._towards_name_ = nds.routing.guidance.guidance_name.GuidanceName.ZserioPackingContext()
            self._lanes_ = nds.routing.guidance.guidance_lanes.GuidanceLanes.ZserioPackingContext()

        @property
        def target_index(self):
            return self._target_index_

        @property
        def activation_distance(self):
            return self._activation_distance_

        @property
        def guidance_code(self):
            return self._guidance_code_

        @property
        def roundabout_exit_number(self):
            return self._roundabout_exit_number_

        @property
        def target_name(self):
            return self._target_name_

        @property
        def towards_name(self):
            return self._towards_name_

        @property
        def lanes(self):
            return self._lanes_
