# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.percentage_position
import nds.instructions.types.lane_instruction_scene

class LaneInstruction:
    def __init__(
            self,
            num_scenes_: int = int(),
            scenes_: typing.List[nds.instructions.types.lane_instruction_scene.LaneInstructionScene] = None,
            positions_: typing.List[nds.core.types.percentage_position.PercentagePosition] = None) -> None:
        self._num_scenes_ = num_scenes_
        self._scenes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scenes()), scenes_)
        self._positions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions()), positions_)

    @classmethod
    def from_reader(
            cls: typing.Type['LaneInstruction'],
            zserio_reader: zserio.BitStreamReader) -> 'LaneInstruction':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LaneInstruction'],
            zserio_context: LaneInstruction.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LaneInstruction':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LaneInstruction):
            return ((self._num_scenes_ == other._num_scenes_) and
                    (self._scenes_ == other._scenes_) and
                    (self._positions_ == other._positions_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_scenes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._scenes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._positions_)

        return result

    @property
    def num_scenes(self) -> int:
        return self._num_scenes_

    @num_scenes.setter
    def num_scenes(self, num_scenes_: int) -> None:
        self._num_scenes_ = num_scenes_

    @property
    def scenes(self) -> typing.List[nds.instructions.types.lane_instruction_scene.LaneInstructionScene]:
        return self._scenes_.raw_array

    @scenes.setter
    def scenes(self, scenes_: typing.List[nds.instructions.types.lane_instruction_scene.LaneInstructionScene]) -> None:
        self._scenes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scenes()), scenes_)

    @property
    def positions(self) -> typing.List[nds.core.types.percentage_position.PercentagePosition]:
        return self._positions_.raw_array

    @positions.setter
    def positions(self, positions_: typing.List[nds.core.types.percentage_position.PercentagePosition]) -> None:
        self._positions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions()), positions_)

    def init_packing_context(self, zserio_context: LaneInstruction.ZserioPackingContext) -> None:
        zserio_context.num_scenes.init(zserio.array.VarSizeArrayTraits(), self._num_scenes_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_scenes_)
        end_bitposition += self._scenes_.bitsizeof(end_bitposition)
        end_bitposition += self._positions_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LaneInstruction.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_scenes.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_scenes_)
        end_bitposition += self._scenes_.bitsizeof_packed(end_bitposition)
        end_bitposition += self._positions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_scenes_)
        end_bitposition = self._scenes_.initialize_offsets(end_bitposition)
        end_bitposition = self._positions_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LaneInstruction.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_scenes.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_scenes_)
        end_bitposition = self._scenes_.initialize_offsets_packed(end_bitposition)
        end_bitposition = self._positions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_scenes_ = zserio_reader.read_varsize()
        self._scenes_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scenes()), zserio_reader, self._num_scenes_)
        self._positions_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions()), zserio_reader, self._num_scenes_)

    def read_packed(self, zserio_context: LaneInstruction.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_scenes_ = zserio_context.num_scenes.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._scenes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_scenes()), zserio_reader, self._num_scenes_)

        self._positions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_positions()), zserio_reader, self._num_scenes_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_scenes_)

        # check array length
        if len(self._scenes_) != (self._num_scenes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneInstruction.scenes: "
                                                f"{len(self._scenes_)} != {self._num_scenes_}!")
        self._scenes_.write(zserio_writer)

        # check array length
        if len(self._positions_) != (self._num_scenes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneInstruction.positions: "
                                                f"{len(self._positions_)} != {self._num_scenes_}!")
        self._positions_.write(zserio_writer)

    def write_packed(self, zserio_context: LaneInstruction.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_scenes.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_scenes_)

        # check array length
        if len(self._scenes_) != (self._num_scenes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneInstruction.scenes: "
                                                f"{len(self._scenes_)} != {self._num_scenes_}!")
        self._scenes_.write_packed(zserio_writer)

        # check array length
        if len(self._positions_) != (self._num_scenes_):
            raise zserio.PythonRuntimeException("Wrong array length for field LaneInstruction.positions: "
                                                f"{len(self._positions_)} != {self._num_scenes_}!")
        self._positions_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_scenes_ = zserio.array.DeltaContext()

        @property
        def num_scenes(self):
            return self._num_scenes_

    class _ZserioElementFactory_scenes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.instructions.types.lane_instruction_scene.LaneInstructionScene:
            del zserio_index
            return nds.instructions.types.lane_instruction_scene.LaneInstructionScene.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.instructions.types.lane_instruction_scene.LaneInstructionScene.ZserioPackingContext:
            return nds.instructions.types.lane_instruction_scene.LaneInstructionScene.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.instructions.types.lane_instruction_scene.LaneInstructionScene.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.instructions.types.lane_instruction_scene.LaneInstructionScene:
            del zserio_index
            return nds.instructions.types.lane_instruction_scene.LaneInstructionScene.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_positions:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.types.percentage_position.PercentagePosition:
            del zserio_index
            return nds.core.types.percentage_position.PercentagePosition.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.types.percentage_position.PercentagePosition.ZserioPackingContext:
            return nds.core.types.percentage_position.PercentagePosition.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.types.percentage_position.PercentagePosition.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.types.percentage_position.PercentagePosition:
            del zserio_index
            return nds.core.types.percentage_position.PercentagePosition.from_reader_packed(zserio_context, zserio_reader)