# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

class VehicleLightConditions:
    def __init__(
            self,
            always_required_: bool = bool(),
            after_sunset_: typing.Optional[bool] = None,
            with_windshield_wipers_: typing.Optional[bool] = None,
            low_visibility_: typing.Optional[bool] = None) -> None:
        self._always_required_ = always_required_
        self._after_sunset_ = after_sunset_
        self._with_windshield_wipers_ = with_windshield_wipers_
        self._low_visibility_ = low_visibility_

    @classmethod
    def from_reader(
            cls: typing.Type['VehicleLightConditions'],
            zserio_reader: zserio.BitStreamReader) -> 'VehicleLightConditions':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, VehicleLightConditions):
            return ((self._always_required_ == other._always_required_) and
                    (not other.is_after_sunset_used() if not self.is_after_sunset_used() else (self._after_sunset_ == other._after_sunset_)) and
                    (not other.is_with_windshield_wipers_used() if not self.is_with_windshield_wipers_used() else (self._with_windshield_wipers_ == other._with_windshield_wipers_)) and
                    (not other.is_low_visibility_used() if not self.is_low_visibility_used() else (self._low_visibility_ == other._low_visibility_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_bool(result, self._always_required_)
        if self.is_after_sunset_used():
            result = zserio.hashcode.calc_hashcode_bool(result, self._after_sunset_)
        if self.is_with_windshield_wipers_used():
            result = zserio.hashcode.calc_hashcode_bool(result, self._with_windshield_wipers_)
        if self.is_low_visibility_used():
            result = zserio.hashcode.calc_hashcode_bool(result, self._low_visibility_)

        return result

    @property
    def always_required(self) -> bool:
        return self._always_required_

    @always_required.setter
    def always_required(self, always_required_: bool) -> None:
        self._always_required_ = always_required_

    @property
    def after_sunset(self) -> typing.Optional[bool]:
        return self._after_sunset_

    @after_sunset.setter
    def after_sunset(self, after_sunset_: typing.Optional[bool]) -> None:
        self._after_sunset_ = after_sunset_

    def is_after_sunset_used(self) -> bool:
        return not self._always_required_

    def is_after_sunset_set(self) -> bool:
        return not self._after_sunset_ is None

    def reset_after_sunset(self) -> None:
        self._after_sunset_ = None

    @property
    def with_windshield_wipers(self) -> typing.Optional[bool]:
        return self._with_windshield_wipers_

    @with_windshield_wipers.setter
    def with_windshield_wipers(self, with_windshield_wipers_: typing.Optional[bool]) -> None:
        self._with_windshield_wipers_ = with_windshield_wipers_

    def is_with_windshield_wipers_used(self) -> bool:
        return not self._always_required_

    def is_with_windshield_wipers_set(self) -> bool:
        return not self._with_windshield_wipers_ is None

    def reset_with_windshield_wipers(self) -> None:
        self._with_windshield_wipers_ = None

    @property
    def low_visibility(self) -> typing.Optional[bool]:
        return self._low_visibility_

    @low_visibility.setter
    def low_visibility(self, low_visibility_: typing.Optional[bool]) -> None:
        self._low_visibility_ = low_visibility_

    def is_low_visibility_used(self) -> bool:
        return not self._always_required_

    def is_low_visibility_set(self) -> bool:
        return not self._low_visibility_ is None

    def reset_low_visibility(self) -> None:
        self._low_visibility_ = None

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_after_sunset_used():
            end_bitposition += 1
        if self.is_with_windshield_wipers_used():
            end_bitposition += 1
        if self.is_low_visibility_used():
            end_bitposition += 1

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 1
        if self.is_after_sunset_used():
            end_bitposition += 1
        if self.is_with_windshield_wipers_used():
            end_bitposition += 1
        if self.is_low_visibility_used():
            end_bitposition += 1

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._always_required_ = zserio_reader.read_bool()
        if self.is_after_sunset_used():
            self._after_sunset_ = zserio_reader.read_bool()
        else:
            self._after_sunset_ = None
        if self.is_with_windshield_wipers_used():
            self._with_windshield_wipers_ = zserio_reader.read_bool()
        else:
            self._with_windshield_wipers_ = None
        if self.is_low_visibility_used():
            self._low_visibility_ = zserio_reader.read_bool()
        else:
            self._low_visibility_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bool(self._always_required_)
        if self.is_after_sunset_used():
            zserio_writer.write_bool(self._after_sunset_)
        if self.is_with_windshield_wipers_used():
            zserio_writer.write_bool(self._with_windshield_wipers_)
        if self.is_low_visibility_used():
            zserio_writer.write_bool(self._low_visibility_)
