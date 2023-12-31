# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.localization.attributes.occupancy_grid_relation_attribute_type
import nds.localization.types.occupancy_grid_id

class OccupancyGridRelationAttributeValue:
    def __init__(
            self,
            type_: nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType,
            *,
            id_: typing.Union[nds.localization.types.occupancy_grid_id.OccupancyGridId, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if id_ is not None:
            self._choice = id_

    @classmethod
    def from_reader(
            cls: typing.Type['OccupancyGridRelationAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType) -> 'OccupancyGridRelationAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['OccupancyGridRelationAttributeValue'],
            zserio_context: OccupancyGridRelationAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType) -> 'OccupancyGridRelationAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, OccupancyGridRelationAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType:
        return self._type_

    @property
    def id(self) -> nds.localization.types.occupancy_grid_id.OccupancyGridId:
        return self._choice

    @id.setter
    def id(self, id_: nds.localization.types.occupancy_grid_id.OccupancyGridId) -> None:
        self._choice = id_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            return self.CHOICE_ID
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: OccupancyGridRelationAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            zserio_context.id.init(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: OccupancyGridRelationAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: OccupancyGridRelationAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            end_bitposition += zserio_context.id.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            self._choice = zserio_reader.read_varuint32()
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

    def read_packed(self, zserio_context: OccupancyGridRelationAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            self._choice = zserio_context.id.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            zserio_writer.write_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

    def write_packed(self, zserio_context: OccupancyGridRelationAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.localization.attributes.occupancy_grid_relation_attribute_type.OccupancyGridRelationAttributeType.OCCUPANCY_GRID_VISIBILITY):
            zserio_context.id.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice OccupancyGridRelationAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._id_ = zserio.array.DeltaContext()

        @property
        def id(self):
            return self._id_

    CHOICE_ID = 0
    UNDEFINED_CHOICE = -1
