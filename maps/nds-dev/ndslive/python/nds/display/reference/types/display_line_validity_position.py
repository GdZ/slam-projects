# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.core.geometry.position2d
import nds.display.reference.types.percentage_indication

class DisplayLineValidityPosition:
    def __init__(
            self,
            shift_: nds.core.geometry.coord_shift.CoordShift,
            position_: typing.Union[nds.core.geometry.position2d.Position2D, None] = None,
            position_indication_: typing.Optional[nds.display.reference.types.percentage_indication.PercentageIndication] = None) -> None:
        self._shift_ = shift_
        self._position_ = position_
        self._position_indication_ = position_indication_

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayLineValidityPosition'],
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLineValidityPosition':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayLineValidityPosition'],
            zserio_context: DisplayLineValidityPosition.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayLineValidityPosition':
        self = object.__new__(cls)
        self._shift_ = shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayLineValidityPosition):
            return (self._shift_ == other._shift_ and
                    (self._position_ == other._position_) and
                    (not other.is_position_indication_used() if not self.is_position_indication_used() else (self._position_indication_ == other._position_indication_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        result = zserio.hashcode.calc_hashcode_object(result, self._position_)
        if self.is_position_indication_used():
            result = zserio.hashcode.calc_hashcode_float32(result, self._position_indication_)

        return result

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @property
    def position(self) -> typing.Union[nds.core.geometry.position2d.Position2D, None]:
        return self._position_

    @position.setter
    def position(self, position_: typing.Union[nds.core.geometry.position2d.Position2D, None]) -> None:
        self._position_ = position_

    @property
    def position_indication(self) -> typing.Optional[nds.display.reference.types.percentage_indication.PercentageIndication]:
        return self._position_indication_

    @position_indication.setter
    def position_indication(self, position_indication_: typing.Optional[nds.display.reference.types.percentage_indication.PercentageIndication]) -> None:
        self._position_indication_ = position_indication_

    def is_position_indication_used(self) -> bool:
        return self.is_position_indication_set()

    def is_position_indication_set(self) -> bool:
        return not self._position_indication_ is None

    def reset_position_indication(self) -> None:
        self._position_indication_ = None

    def init_packing_context(self, zserio_context: DisplayLineValidityPosition.ZserioPackingContext) -> None:
        self._position_.init_packing_context(zserio_context.position)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_position_indication_used():
            end_bitposition += 16

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayLineValidityPosition.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._position_.bitsizeof_packed(zserio_context.position, end_bitposition)
        end_bitposition += 1
        if self.is_position_indication_used():
            end_bitposition += 16

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_position_indication_used():
            end_bitposition += 16

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayLineValidityPosition.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._position_.initialize_offsets_packed(zserio_context.position, end_bitposition)
        end_bitposition += 1
        if self.is_position_indication_used():
            end_bitposition += 16

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position2d.Position2D.from_reader(zserio_reader, self._shift_)
        if zserio_reader.read_bool():
            self._position_indication_ = zserio_reader.read_float16()
        else:
            self._position_indication_ = None

    def read_packed(self, zserio_context: DisplayLineValidityPosition.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._position_ = nds.core.geometry.position2d.Position2D.from_reader_packed(zserio_context.position, zserio_reader, self._shift_)

        if zserio_reader.read_bool():
            self._position_indication_ = zserio_reader.read_float16()
        else:
            self._position_indication_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLineValidityPosition.position: "
                                                f"{self._position_.shift} != {self._shift_}!")
        self._position_.write(zserio_writer)

        if self.is_position_indication_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_float16(self._position_indication_)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: DisplayLineValidityPosition.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        # check parameters
        if self._position_.shift != (self._shift_):
            raise zserio.PythonRuntimeException("Wrong parameter shift for field DisplayLineValidityPosition.position: "
                                                f"{self._position_.shift} != {self._shift_}!")
        self._position_.write_packed(zserio_context.position, zserio_writer)

        if self.is_position_indication_used():
            zserio_writer.write_bool(True)
            zserio_writer.write_float16(self._position_indication_)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._position_ = nds.core.geometry.position2d.Position2D.ZserioPackingContext()

        @property
        def position(self):
            return self._position_
