# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.rules.types.license_plate_restriction_rule
import nds.rules.types.license_plate_restriction_type

class LicensePlateRestriction:
    def __init__(
            self,
            license_plate_restriction_type_: typing.Union[nds.rules.types.license_plate_restriction_type.LicensePlateRestrictionType, None] = None,
            license_plate_restriction_rule_: typing.Union[nds.rules.types.license_plate_restriction_rule.LicensePlateRestrictionRule, None] = None,
            license_plate_restriction_description_: str = str()) -> None:
        self._license_plate_restriction_type_ = license_plate_restriction_type_
        self._license_plate_restriction_rule_ = license_plate_restriction_rule_
        self._license_plate_restriction_description_ = license_plate_restriction_description_

    @classmethod
    def from_reader(
            cls: typing.Type['LicensePlateRestriction'],
            zserio_reader: zserio.BitStreamReader) -> 'LicensePlateRestriction':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['LicensePlateRestriction'],
            zserio_context: LicensePlateRestriction.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'LicensePlateRestriction':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, LicensePlateRestriction):
            return ((self._license_plate_restriction_type_ == other._license_plate_restriction_type_) and
                    (self._license_plate_restriction_rule_ == other._license_plate_restriction_rule_) and
                    (self._license_plate_restriction_description_ == other._license_plate_restriction_description_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._license_plate_restriction_type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._license_plate_restriction_rule_)
        result = zserio.hashcode.calc_hashcode_string(result, self._license_plate_restriction_description_)

        return result

    @property
    def license_plate_restriction_type(self) -> typing.Union[nds.rules.types.license_plate_restriction_type.LicensePlateRestrictionType, None]:
        return self._license_plate_restriction_type_

    @license_plate_restriction_type.setter
    def license_plate_restriction_type(self, license_plate_restriction_type_: typing.Union[nds.rules.types.license_plate_restriction_type.LicensePlateRestrictionType, None]) -> None:
        self._license_plate_restriction_type_ = license_plate_restriction_type_

    @property
    def license_plate_restriction_rule(self) -> typing.Union[nds.rules.types.license_plate_restriction_rule.LicensePlateRestrictionRule, None]:
        return self._license_plate_restriction_rule_

    @license_plate_restriction_rule.setter
    def license_plate_restriction_rule(self, license_plate_restriction_rule_: typing.Union[nds.rules.types.license_plate_restriction_rule.LicensePlateRestrictionRule, None]) -> None:
        self._license_plate_restriction_rule_ = license_plate_restriction_rule_

    @property
    def license_plate_restriction_description(self) -> str:
        return self._license_plate_restriction_description_

    @license_plate_restriction_description.setter
    def license_plate_restriction_description(self, license_plate_restriction_description_: str) -> None:
        self._license_plate_restriction_description_ = license_plate_restriction_description_

    def init_packing_context(self, zserio_context: LicensePlateRestriction.ZserioPackingContext) -> None:
        self._license_plate_restriction_type_.init_packing_context(zserio_context.license_plate_restriction_type)
        self._license_plate_restriction_rule_.init_packing_context(zserio_context.license_plate_restriction_rule)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._license_plate_restriction_type_.bitsizeof(end_bitposition)
        end_bitposition += self._license_plate_restriction_rule_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._license_plate_restriction_description_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: LicensePlateRestriction.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._license_plate_restriction_type_.bitsizeof_packed(zserio_context.license_plate_restriction_type, end_bitposition)
        end_bitposition += self._license_plate_restriction_rule_.bitsizeof_packed(zserio_context.license_plate_restriction_rule, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._license_plate_restriction_description_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._license_plate_restriction_type_.initialize_offsets(end_bitposition)
        end_bitposition = self._license_plate_restriction_rule_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._license_plate_restriction_description_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: LicensePlateRestriction.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._license_plate_restriction_type_.initialize_offsets_packed(zserio_context.license_plate_restriction_type, end_bitposition)
        end_bitposition = self._license_plate_restriction_rule_.initialize_offsets_packed(zserio_context.license_plate_restriction_rule, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_string(self._license_plate_restriction_description_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._license_plate_restriction_type_ = nds.rules.types.license_plate_restriction_type.LicensePlateRestrictionType.from_reader(zserio_reader)
        self._license_plate_restriction_rule_ = nds.rules.types.license_plate_restriction_rule.LicensePlateRestrictionRule.from_reader(zserio_reader)
        self._license_plate_restriction_description_ = zserio_reader.read_string()

    def read_packed(self, zserio_context: LicensePlateRestriction.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._license_plate_restriction_type_ = nds.rules.types.license_plate_restriction_type.LicensePlateRestrictionType.from_reader_packed(zserio_context.license_plate_restriction_type, zserio_reader)

        self._license_plate_restriction_rule_ = nds.rules.types.license_plate_restriction_rule.LicensePlateRestrictionRule.from_reader_packed(zserio_context.license_plate_restriction_rule, zserio_reader)

        self._license_plate_restriction_description_ = zserio_reader.read_string()

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._license_plate_restriction_type_.write(zserio_writer)
        self._license_plate_restriction_rule_.write(zserio_writer)
        zserio_writer.write_string(self._license_plate_restriction_description_)

    def write_packed(self, zserio_context: LicensePlateRestriction.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._license_plate_restriction_type_.write_packed(zserio_context.license_plate_restriction_type, zserio_writer)

        self._license_plate_restriction_rule_.write_packed(zserio_context.license_plate_restriction_rule, zserio_writer)

        zserio_writer.write_string(self._license_plate_restriction_description_)

    class ZserioPackingContext:
        def __init__(self):
            self._license_plate_restriction_type_ = zserio.array.DeltaContext()
            self._license_plate_restriction_rule_ = nds.rules.types.license_plate_restriction_rule.LicensePlateRestrictionRule.ZserioPackingContext()

        @property
        def license_plate_restriction_type(self):
            return self._license_plate_restriction_type_

        @property
        def license_plate_restriction_rule(self):
            return self._license_plate_restriction_rule_
