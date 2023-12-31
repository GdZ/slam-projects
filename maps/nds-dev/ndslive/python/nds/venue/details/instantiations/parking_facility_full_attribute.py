# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.attributemap.condition_list
import nds.venue.details.attributes.parking_facility_attribute_type
import nds.venue.details.attributes.parking_facility_attribute_value
import nds.venue.details.instantiations.venue_property_list

class ParkingFacilityFullAttribute:
    def __init__(
            self,
            attribute_type_code_: typing.Union[nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType, None] = None,
            attribute_value_: typing.Union[nds.venue.details.attributes.parking_facility_attribute_value.ParkingFacilityAttributeValue, None] = None,
            properties_: typing.Optional[nds.venue.details.instantiations.venue_property_list.VenuePropertyList] = None,
            conditions_: typing.Optional[nds.core.attributemap.condition_list.ConditionList] = None) -> None:
        self._attribute_type_code_ = attribute_type_code_
        self._attribute_value_ = attribute_value_
        self._properties_ = properties_
        self._conditions_ = conditions_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingFacilityFullAttribute'],
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityFullAttribute':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingFacilityFullAttribute'],
            zserio_context: ParkingFacilityFullAttribute.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ParkingFacilityFullAttribute':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingFacilityFullAttribute):
            return ((self._attribute_type_code_ == other._attribute_type_code_) and
                    (self._attribute_value_ == other._attribute_value_) and
                    (not other.is_properties_used() if not self.is_properties_used() else (self._properties_ == other._properties_)) and
                    (not other.is_conditions_used() if not self.is_conditions_used() else (self._conditions_ == other._conditions_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_type_code_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_value_)
        if self.is_properties_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._properties_)
        if self.is_conditions_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._conditions_)

        return result

    @property
    def attribute_type_code(self) -> typing.Union[nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType, None]:
        return self._attribute_type_code_

    @attribute_type_code.setter
    def attribute_type_code(self, attribute_type_code_: typing.Union[nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType, None]) -> None:
        self._attribute_type_code_ = attribute_type_code_

    @property
    def attribute_value(self) -> typing.Union[nds.venue.details.attributes.parking_facility_attribute_value.ParkingFacilityAttributeValue, None]:
        return self._attribute_value_

    @attribute_value.setter
    def attribute_value(self, attribute_value_: typing.Union[nds.venue.details.attributes.parking_facility_attribute_value.ParkingFacilityAttributeValue, None]) -> None:
        self._attribute_value_ = attribute_value_

    @property
    def properties(self) -> typing.Optional[nds.venue.details.instantiations.venue_property_list.VenuePropertyList]:
        return self._properties_

    @properties.setter
    def properties(self, properties_: typing.Optional[nds.venue.details.instantiations.venue_property_list.VenuePropertyList]) -> None:
        self._properties_ = properties_

    def is_properties_used(self) -> bool:
        return self.is_properties_set()

    def is_properties_set(self) -> bool:
        return not self._properties_ is None

    def reset_properties(self) -> None:
        self._properties_ = None

    @property
    def conditions(self) -> typing.Optional[nds.core.attributemap.condition_list.ConditionList]:
        return self._conditions_

    @conditions.setter
    def conditions(self, conditions_: typing.Optional[nds.core.attributemap.condition_list.ConditionList]) -> None:
        self._conditions_ = conditions_

    def is_conditions_used(self) -> bool:
        return self.is_conditions_set()

    def is_conditions_set(self) -> bool:
        return not self._conditions_ is None

    def reset_conditions(self) -> None:
        self._conditions_ = None

    def init_packing_context(self, zserio_context: ParkingFacilityFullAttribute.ZserioPackingContext) -> None:
        self._attribute_type_code_.init_packing_context(zserio_context.attribute_type_code)
        self._attribute_value_.init_packing_context(zserio_context.attribute_value)
        if self.is_properties_used():
            self._properties_.init_packing_context(zserio_context.properties)
        if self.is_conditions_used():
            self._conditions_.init_packing_context(zserio_context.conditions)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_type_code_.bitsizeof(end_bitposition)
        end_bitposition += self._attribute_value_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_properties_used():
            end_bitposition += self._properties_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_conditions_used():
            end_bitposition += self._conditions_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingFacilityFullAttribute.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_type_code_.bitsizeof_packed(zserio_context.attribute_type_code, end_bitposition)
        end_bitposition += self._attribute_value_.bitsizeof_packed(zserio_context.attribute_value, end_bitposition)
        end_bitposition += 1
        if self.is_properties_used():
            end_bitposition += self._properties_.bitsizeof_packed(zserio_context.properties, end_bitposition)
        end_bitposition += 1
        if self.is_conditions_used():
            end_bitposition += self._conditions_.bitsizeof_packed(zserio_context.conditions, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_type_code_.initialize_offsets(end_bitposition)
        end_bitposition = self._attribute_value_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_properties_used():
            end_bitposition = self._properties_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_conditions_used():
            end_bitposition = self._conditions_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingFacilityFullAttribute.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_type_code_.initialize_offsets_packed(zserio_context.attribute_type_code, end_bitposition)
        end_bitposition = self._attribute_value_.initialize_offsets_packed(zserio_context.attribute_value, end_bitposition)
        end_bitposition += 1
        if self.is_properties_used():
            end_bitposition = self._properties_.initialize_offsets_packed(zserio_context.properties, end_bitposition)
        end_bitposition += 1
        if self.is_conditions_used():
            end_bitposition = self._conditions_.initialize_offsets_packed(zserio_context.conditions, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_type_code_ = nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.from_reader(zserio_reader)
        self._attribute_value_ = nds.venue.details.attributes.parking_facility_attribute_value.ParkingFacilityAttributeValue.from_reader(zserio_reader, self._attribute_type_code_)
        if zserio_reader.read_bool():
            self._properties_ = nds.venue.details.instantiations.venue_property_list.VenuePropertyList.from_reader(zserio_reader)
        else:
            self._properties_ = None
        if zserio_reader.read_bool():
            self._conditions_ = nds.core.attributemap.condition_list.ConditionList.from_reader(zserio_reader)
        else:
            self._conditions_ = None

    def read_packed(self, zserio_context: ParkingFacilityFullAttribute.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_type_code_ = nds.venue.details.attributes.parking_facility_attribute_type.ParkingFacilityAttributeType.from_reader_packed(zserio_context.attribute_type_code, zserio_reader)

        self._attribute_value_ = nds.venue.details.attributes.parking_facility_attribute_value.ParkingFacilityAttributeValue.from_reader_packed(zserio_context.attribute_value, zserio_reader, self._attribute_type_code_)

        if zserio_reader.read_bool():
            self._properties_ = nds.venue.details.instantiations.venue_property_list.VenuePropertyList.from_reader_packed(zserio_context.properties, zserio_reader)
        else:
            self._properties_ = None

        if zserio_reader.read_bool():
            self._conditions_ = nds.core.attributemap.condition_list.ConditionList.from_reader_packed(zserio_context.conditions, zserio_reader)
        else:
            self._conditions_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._attribute_type_code_.write(zserio_writer)

        # check parameters
        if self._attribute_value_.type is not (self._attribute_type_code_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field ParkingFacilityFullAttribute.attributeValue: "
                                                f"{self._attribute_value_.type} != {self._attribute_type_code_}!")
        self._attribute_value_.write(zserio_writer)

        if self.is_properties_used():
            zserio_writer.write_bool(True)
            self._properties_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_conditions_used():
            zserio_writer.write_bool(True)
            self._conditions_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: ParkingFacilityFullAttribute.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._attribute_type_code_.write_packed(zserio_context.attribute_type_code, zserio_writer)

        # check parameters
        if self._attribute_value_.type is not (self._attribute_type_code_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field ParkingFacilityFullAttribute.attributeValue: "
                                                f"{self._attribute_value_.type} != {self._attribute_type_code_}!")
        self._attribute_value_.write_packed(zserio_context.attribute_value, zserio_writer)

        if self.is_properties_used():
            zserio_writer.write_bool(True)
            self._properties_.write_packed(zserio_context.properties, zserio_writer)
        else:
            zserio_writer.write_bool(False)

        if self.is_conditions_used():
            zserio_writer.write_bool(True)
            self._conditions_.write_packed(zserio_context.conditions, zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._attribute_type_code_ = zserio.array.DeltaContext()
            self._attribute_value_ = nds.venue.details.attributes.parking_facility_attribute_value.ParkingFacilityAttributeValue.ZserioPackingContext()
            self._properties_ = nds.venue.details.instantiations.venue_property_list.VenuePropertyList.ZserioPackingContext()
            self._conditions_ = nds.core.attributemap.condition_list.ConditionList.ZserioPackingContext()

        @property
        def attribute_type_code(self):
            return self._attribute_type_code_

        @property
        def attribute_value(self):
            return self._attribute_value_

        @property
        def properties(self):
            return self._properties_

        @property
        def conditions(self):
            return self._conditions_
