# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.venue.parking.parking_position_relation_type
import nds.venue.parking.road_network_access
import nds.venue.parking.road_network_access_lane_reference
import nds.venue.parking.road_network_access_road_reference
import nds.venue.reference.types.parking_section_id
import nds.venue.reference.types.parking_spot_id

class ParkingPositionRelationValue:
    def __init__(
            self,
            type_: nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType,
            *,
            section_id_: typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None] = None,
            parking_spot_id_: typing.Union[nds.venue.reference.types.parking_spot_id.ParkingSpotId, None] = None,
            outside_road_reference_: typing.Union[nds.venue.parking.road_network_access_road_reference.RoadNetworkAccessRoadReference, None] = None,
            outside_lane_reference_: typing.Union[nds.venue.parking.road_network_access_lane_reference.RoadNetworkAccessLaneReference, None] = None,
            road_network_access_: typing.Union[nds.venue.parking.road_network_access.RoadNetworkAccess, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if section_id_ is not None:
            self._choice = section_id_
        if parking_spot_id_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingPositionRelationValue is ambiguous!")
            self._choice = parking_spot_id_
        if outside_road_reference_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingPositionRelationValue is ambiguous!")
            self._choice = outside_road_reference_
        if outside_lane_reference_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingPositionRelationValue is ambiguous!")
            self._choice = outside_lane_reference_
        if road_network_access_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice ParkingPositionRelationValue is ambiguous!")
            self._choice = road_network_access_

    @classmethod
    def from_reader(
            cls: typing.Type['ParkingPositionRelationValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType) -> 'ParkingPositionRelationValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ParkingPositionRelationValue'],
            zserio_context: ParkingPositionRelationValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType) -> 'ParkingPositionRelationValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ParkingPositionRelationValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType:
        return self._type_

    @property
    def section_id(self) -> typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None]:
        return self._choice

    @section_id.setter
    def section_id(self, section_id_: typing.Union[nds.venue.reference.types.parking_section_id.ParkingSectionId, None]) -> None:
        self._choice = section_id_

    @property
    def parking_spot_id(self) -> typing.Union[nds.venue.reference.types.parking_spot_id.ParkingSpotId, None]:
        return self._choice

    @parking_spot_id.setter
    def parking_spot_id(self, parking_spot_id_: typing.Union[nds.venue.reference.types.parking_spot_id.ParkingSpotId, None]) -> None:
        self._choice = parking_spot_id_

    @property
    def outside_road_reference(self) -> typing.Union[nds.venue.parking.road_network_access_road_reference.RoadNetworkAccessRoadReference, None]:
        return self._choice

    @outside_road_reference.setter
    def outside_road_reference(self, outside_road_reference_: typing.Union[nds.venue.parking.road_network_access_road_reference.RoadNetworkAccessRoadReference, None]) -> None:
        self._choice = outside_road_reference_

    @property
    def outside_lane_reference(self) -> typing.Union[nds.venue.parking.road_network_access_lane_reference.RoadNetworkAccessLaneReference, None]:
        return self._choice

    @outside_lane_reference.setter
    def outside_lane_reference(self, outside_lane_reference_: typing.Union[nds.venue.parking.road_network_access_lane_reference.RoadNetworkAccessLaneReference, None]) -> None:
        self._choice = outside_lane_reference_

    @property
    def road_network_access(self) -> typing.Union[nds.venue.parking.road_network_access.RoadNetworkAccess, None]:
        return self._choice

    @road_network_access.setter
    def road_network_access(self, road_network_access_: typing.Union[nds.venue.parking.road_network_access.RoadNetworkAccess, None]) -> None:
        self._choice = road_network_access_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            return self.CHOICE_SECTION_ID
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            return self.CHOICE_PARKING_SPOT_ID
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            return self.CHOICE_OUTSIDE_ROAD_REFERENCE
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            return self.CHOICE_OUTSIDE_LANE_REFERENCE
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            return self.CHOICE_ROAD_NETWORK_ACCESS
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: ParkingPositionRelationValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            self._choice.init_packing_context(zserio_context.section_id)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            self._choice.init_packing_context(zserio_context.parking_spot_id)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            self._choice.init_packing_context(zserio_context.outside_road_reference)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            self._choice.init_packing_context(zserio_context.outside_lane_reference)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            self._choice.init_packing_context(zserio_context.road_network_access)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ParkingPositionRelationValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.section_id, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.parking_spot_id, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.outside_road_reference, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.outside_lane_reference, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.road_network_access, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ParkingPositionRelationValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.section_id, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.parking_spot_id, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.outside_road_reference, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.outside_lane_reference, end_bitposition)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.road_network_access, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            self._choice = nds.venue.reference.types.parking_section_id.ParkingSectionId.from_reader(zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            self._choice = nds.venue.reference.types.parking_spot_id.ParkingSpotId.from_reader(zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            self._choice = nds.venue.parking.road_network_access_road_reference.RoadNetworkAccessRoadReference.from_reader(zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            self._choice = nds.venue.parking.road_network_access_lane_reference.RoadNetworkAccessLaneReference.from_reader(zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            self._choice = nds.venue.parking.road_network_access.RoadNetworkAccess.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

    def read_packed(self, zserio_context: ParkingPositionRelationValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            self._choice = nds.venue.reference.types.parking_section_id.ParkingSectionId.from_reader_packed(zserio_context.section_id, zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            self._choice = nds.venue.reference.types.parking_spot_id.ParkingSpotId.from_reader_packed(zserio_context.parking_spot_id, zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            self._choice = nds.venue.parking.road_network_access_road_reference.RoadNetworkAccessRoadReference.from_reader_packed(zserio_context.outside_road_reference, zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            self._choice = nds.venue.parking.road_network_access_lane_reference.RoadNetworkAccessLaneReference.from_reader_packed(zserio_context.outside_lane_reference, zserio_reader)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            self._choice = nds.venue.parking.road_network_access.RoadNetworkAccess.from_reader_packed(zserio_context.road_network_access, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            self._choice.write(zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

    def write_packed(self, zserio_context: ParkingPositionRelationValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.PART_OF_SECTION):
            self._choice.write_packed(zserio_context.section_id, zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ACCESS_PARKING_SPOT):
            self._choice.write_packed(zserio_context.parking_spot_id, zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_ROAD_REFERENCE):
            self._choice.write_packed(zserio_context.outside_road_reference, zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS_LANE_REFERENCE):
            self._choice.write_packed(zserio_context.outside_lane_reference, zserio_writer)
        elif selector == (nds.venue.parking.parking_position_relation_type.ParkingPositionRelationType.ROAD_NETWORK_ACCESS):
            self._choice.write_packed(zserio_context.road_network_access, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice ParkingPositionRelationValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._section_id_ = nds.venue.reference.types.parking_section_id.ParkingSectionId.ZserioPackingContext()
            self._parking_spot_id_ = nds.venue.reference.types.parking_spot_id.ParkingSpotId.ZserioPackingContext()
            self._outside_road_reference_ = nds.venue.parking.road_network_access_road_reference.RoadNetworkAccessRoadReference.ZserioPackingContext()
            self._outside_lane_reference_ = nds.venue.parking.road_network_access_lane_reference.RoadNetworkAccessLaneReference.ZserioPackingContext()
            self._road_network_access_ = nds.venue.parking.road_network_access.RoadNetworkAccess.ZserioPackingContext()

        @property
        def section_id(self):
            return self._section_id_

        @property
        def parking_spot_id(self):
            return self._parking_spot_id_

        @property
        def outside_road_reference(self):
            return self._outside_road_reference_

        @property
        def outside_lane_reference(self):
            return self._outside_lane_reference_

        @property
        def road_network_access(self):
            return self._road_network_access_

    CHOICE_SECTION_ID = 0
    CHOICE_PARKING_SPOT_ID = 1
    CHOICE_OUTSIDE_ROAD_REFERENCE = 2
    CHOICE_OUTSIDE_LANE_REFERENCE = 3
    CHOICE_ROAD_NETWORK_ACCESS = 4
    UNDEFINED_CHOICE = -1