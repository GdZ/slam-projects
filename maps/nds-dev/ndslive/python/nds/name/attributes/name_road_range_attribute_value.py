# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.name.attributes.name_road_range_attribute_type
import nds.name.types.administrative_hierarchy
import nds.name.types.bridge_name
import nds.name.types.house_number_range
import nds.name.types.intersection_name
import nds.name.types.road_name
import nds.name.types.road_number
import nds.name.types.route_name
import nds.name.types.service_area_name
import nds.name.types.tunnel_name

class NameRoadRangeAttributeValue:
    def __init__(
            self,
            type_: nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType,
            *,
            road_name_: typing.Union[nds.name.types.road_name.RoadName, None] = None,
            bridge_name_: typing.Union[nds.name.types.bridge_name.BridgeName, None] = None,
            tunnel_name_: typing.Union[nds.name.types.tunnel_name.TunnelName, None] = None,
            route_name_: typing.Union[nds.name.types.route_name.RouteName, None] = None,
            road_number_: typing.Union[nds.name.types.road_number.RoadNumber, None] = None,
            administrative_hierarchy_: typing.Union[nds.name.types.administrative_hierarchy.AdministrativeHierarchy, None] = None,
            house_number_range_: typing.Union[nds.name.types.house_number_range.HouseNumberRange, None] = None,
            service_area_name_: typing.Union[nds.name.types.service_area_name.ServiceAreaName, None] = None,
            intersection_name_: typing.Union[nds.name.types.intersection_name.IntersectionName, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if road_name_ is not None:
            self._choice = road_name_
        if bridge_name_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = bridge_name_
        if tunnel_name_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = tunnel_name_
        if route_name_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = route_name_
        if road_number_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = road_number_
        if administrative_hierarchy_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = administrative_hierarchy_
        if house_number_range_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = house_number_range_
        if service_area_name_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = service_area_name_
        if intersection_name_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice NameRoadRangeAttributeValue is ambiguous!")
            self._choice = intersection_name_

    @classmethod
    def from_reader(
            cls: typing.Type['NameRoadRangeAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType) -> 'NameRoadRangeAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['NameRoadRangeAttributeValue'],
            zserio_context: NameRoadRangeAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType) -> 'NameRoadRangeAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NameRoadRangeAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            result = zserio.hashcode.calc_hashcode_string(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType:
        return self._type_

    @property
    def road_name(self) -> nds.name.types.road_name.RoadName:
        return self._choice

    @road_name.setter
    def road_name(self, road_name_: nds.name.types.road_name.RoadName) -> None:
        self._choice = road_name_

    @property
    def bridge_name(self) -> nds.name.types.bridge_name.BridgeName:
        return self._choice

    @bridge_name.setter
    def bridge_name(self, bridge_name_: nds.name.types.bridge_name.BridgeName) -> None:
        self._choice = bridge_name_

    @property
    def tunnel_name(self) -> nds.name.types.tunnel_name.TunnelName:
        return self._choice

    @tunnel_name.setter
    def tunnel_name(self, tunnel_name_: nds.name.types.tunnel_name.TunnelName) -> None:
        self._choice = tunnel_name_

    @property
    def route_name(self) -> nds.name.types.route_name.RouteName:
        return self._choice

    @route_name.setter
    def route_name(self, route_name_: nds.name.types.route_name.RouteName) -> None:
        self._choice = route_name_

    @property
    def road_number(self) -> nds.name.types.road_number.RoadNumber:
        return self._choice

    @road_number.setter
    def road_number(self, road_number_: nds.name.types.road_number.RoadNumber) -> None:
        self._choice = road_number_

    @property
    def administrative_hierarchy(self) -> typing.Union[nds.name.types.administrative_hierarchy.AdministrativeHierarchy, None]:
        return self._choice

    @administrative_hierarchy.setter
    def administrative_hierarchy(self, administrative_hierarchy_: typing.Union[nds.name.types.administrative_hierarchy.AdministrativeHierarchy, None]) -> None:
        self._choice = administrative_hierarchy_

    @property
    def house_number_range(self) -> typing.Union[nds.name.types.house_number_range.HouseNumberRange, None]:
        return self._choice

    @house_number_range.setter
    def house_number_range(self, house_number_range_: typing.Union[nds.name.types.house_number_range.HouseNumberRange, None]) -> None:
        self._choice = house_number_range_

    @property
    def service_area_name(self) -> nds.name.types.service_area_name.ServiceAreaName:
        return self._choice

    @service_area_name.setter
    def service_area_name(self, service_area_name_: nds.name.types.service_area_name.ServiceAreaName) -> None:
        self._choice = service_area_name_

    @property
    def intersection_name(self) -> nds.name.types.intersection_name.IntersectionName:
        return self._choice

    @intersection_name.setter
    def intersection_name(self, intersection_name_: nds.name.types.intersection_name.IntersectionName) -> None:
        self._choice = intersection_name_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            return self.CHOICE_ROAD_NAME
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            return self.CHOICE_BRIDGE_NAME
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            return self.CHOICE_TUNNEL_NAME
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            return self.CHOICE_ROUTE_NAME
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            return self.CHOICE_ROAD_NUMBER
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            return self.CHOICE_ADMINISTRATIVE_HIERARCHY
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            return self.CHOICE_HOUSE_NUMBER_RANGE
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            return self.CHOICE_SERVICE_AREA_NAME
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            return self.CHOICE_INTERSECTION_NAME
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: NameRoadRangeAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            pass
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            pass
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            pass
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            pass
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            pass
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            self._choice.init_packing_context(zserio_context.administrative_hierarchy)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            self._choice.init_packing_context(zserio_context.house_number_range)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            pass
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            pass
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: NameRoadRangeAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.administrative_hierarchy, end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.house_number_range, end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: NameRoadRangeAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.administrative_hierarchy, end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.house_number_range, end_bitposition)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            end_bitposition += zserio.bitsizeof.bitsizeof_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            self._choice = nds.name.types.administrative_hierarchy.AdministrativeHierarchy.from_reader(zserio_reader)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            self._choice = nds.name.types.house_number_range.HouseNumberRange.from_reader(zserio_reader)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            self._choice = zserio_reader.read_string()
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

    def read_packed(self, zserio_context: NameRoadRangeAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            self._choice = nds.name.types.administrative_hierarchy.AdministrativeHierarchy.from_reader_packed(zserio_context.administrative_hierarchy, zserio_reader)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            self._choice = nds.name.types.house_number_range.HouseNumberRange.from_reader_packed(zserio_context.house_number_range, zserio_reader)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            self._choice = zserio_reader.read_string()
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            self._choice = zserio_reader.read_string()
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            self._choice.write(zserio_writer)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            self._choice.write(zserio_writer)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            zserio_writer.write_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

    def write_packed(self, zserio_context: NameRoadRangeAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.BRIDGE_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.TUNNEL_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROUTE_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ROAD_NUMBER):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.ADMINISTRATIVE_HIERARCHY):
            self._choice.write_packed(zserio_context.administrative_hierarchy, zserio_writer)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.HOUSE_NUMBER_RANGE):
            self._choice.write_packed(zserio_context.house_number_range, zserio_writer)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.SERVICE_AREA_NAME):
            zserio_writer.write_string(self._choice)
        elif selector == (nds.name.attributes.name_road_range_attribute_type.NameRoadRangeAttributeType.INTERSECTION_NAME):
            zserio_writer.write_string(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice NameRoadRangeAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._administrative_hierarchy_ = nds.name.types.administrative_hierarchy.AdministrativeHierarchy.ZserioPackingContext()
            self._house_number_range_ = nds.name.types.house_number_range.HouseNumberRange.ZserioPackingContext()

        @property
        def administrative_hierarchy(self):
            return self._administrative_hierarchy_

        @property
        def house_number_range(self):
            return self._house_number_range_

    CHOICE_ROAD_NAME = 0
    CHOICE_BRIDGE_NAME = 1
    CHOICE_TUNNEL_NAME = 2
    CHOICE_ROUTE_NAME = 3
    CHOICE_ROAD_NUMBER = 4
    CHOICE_ADMINISTRATIVE_HIERARCHY = 5
    CHOICE_HOUSE_NUMBER_RANGE = 6
    CHOICE_SERVICE_AREA_NAME = 7
    CHOICE_INTERSECTION_NAME = 8
    UNDEFINED_CHOICE = -1
