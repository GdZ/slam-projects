# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.name.attributes.name_lane_position_attribute_type
import nds.name.types.house_number
import nds.name.types.toll_station_name

class NameLanePositionAttributeValue:
    def __init__(
            self,
            type_: nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType,
            *,
            house_number_: typing.Union[nds.name.types.house_number.HouseNumber, None] = None,
            toll_station_name_: typing.Union[nds.name.types.toll_station_name.TollStationName, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if house_number_ is not None:
            self._choice = house_number_
        if toll_station_name_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameLanePositionAttributeValue is ambiguous!")
            self._choice = toll_station_name_

    @classmethod
    def from_reader(
            cls: typing.Type['NameLanePositionAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType) -> 'NameLanePositionAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NameLanePositionAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.HOUSE_NUMBER):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.TOLL_STATION_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType:
        return self._type_

    @property
    def house_number(self) -> nds.name.types.house_number.HouseNumber:
        return self._choice

    @house_number.setter
    def house_number(self, house_number_: nds.name.types.house_number.HouseNumber) -> None:
        self._choice = house_number_

    @property
    def toll_station_name(self) -> nds.name.types.toll_station_name.TollStationName:
        return self._choice

    @toll_station_name.setter
    def toll_station_name(self, toll_station_name_: nds.name.types.toll_station_name.TollStationName) -> None:
        self._choice = toll_station_name_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.HOUSE_NUMBER):
            return self.CHOICE_HOUSE_NUMBER
        elif selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.TOLL_STATION_NAME):
            return self.CHOICE_TOLL_STATION_NAME
        else:
            return self.UNDEFINED_CHOICE

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.HOUSE_NUMBER):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.TOLL_STATION_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameLanePositionAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.HOUSE_NUMBER):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.TOLL_STATION_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameLanePositionAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.HOUSE_NUMBER):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.TOLL_STATION_NAME):
            self._choice = zserio_reader.read_string()
        else:
            raise zserio.PythonRuntimeException("No match in choice NameLanePositionAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.HOUSE_NUMBER):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_lane_position_attribute_type.NameLanePositionAttributeType.TOLL_STATION_NAME):
            zserio_writer.write_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameLanePositionAttributeValue!")

    CHOICE_HOUSE_NUMBER = 0
    CHOICE_TOLL_STATION_NAME = 1
    UNDEFINED_CHOICE = -1
