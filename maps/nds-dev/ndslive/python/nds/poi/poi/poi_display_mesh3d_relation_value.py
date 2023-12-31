# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.poi.poi.poi_display_mesh3d_relation_type
import nds.poi.poi.poi_entrance_and_exit_reference
import nds.poi.poi.poi_entrance_reference
import nds.poi.poi.poi_exit_reference
import nds.poi.reference.types.poi_reference

class PoiDisplayMesh3DRelationValue:
    def __init__(
            self,
            type_: nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType,
            *,
            poi_complete_: typing.Union[nds.poi.reference.types.poi_reference.PoiReference, None] = None,
            poi_entrance_: typing.Union[nds.poi.poi.poi_entrance_reference.PoiEntranceReference, None] = None,
            poi_exit_: typing.Union[nds.poi.poi.poi_exit_reference.PoiExitReference, None] = None,
            poi_entrance_and_exit_: typing.Union[nds.poi.poi.poi_entrance_and_exit_reference.PoiEntranceAndExitReference, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if poi_complete_ is not None:
            self._choice = poi_complete_
        if poi_entrance_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice PoiDisplayMesh3DRelationValue is ambiguous!")
            self._choice = poi_entrance_
        if poi_exit_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice PoiDisplayMesh3DRelationValue is ambiguous!")
            self._choice = poi_exit_
        if poi_entrance_and_exit_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice PoiDisplayMesh3DRelationValue is ambiguous!")
            self._choice = poi_entrance_and_exit_

    @classmethod
    def from_reader(
            cls: typing.Type['PoiDisplayMesh3DRelationValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType) -> 'PoiDisplayMesh3DRelationValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PoiDisplayMesh3DRelationValue'],
            zserio_context: PoiDisplayMesh3DRelationValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType) -> 'PoiDisplayMesh3DRelationValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PoiDisplayMesh3DRelationValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            result = zserio.hashcode.calc_hashcode_int32(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType:
        return self._type_

    @property
    def poi_complete(self) -> nds.poi.reference.types.poi_reference.PoiReference:
        return self._choice

    @poi_complete.setter
    def poi_complete(self, poi_complete_: nds.poi.reference.types.poi_reference.PoiReference) -> None:
        self._choice = poi_complete_

    @property
    def poi_entrance(self) -> nds.poi.poi.poi_entrance_reference.PoiEntranceReference:
        return self._choice

    @poi_entrance.setter
    def poi_entrance(self, poi_entrance_: nds.poi.poi.poi_entrance_reference.PoiEntranceReference) -> None:
        self._choice = poi_entrance_

    @property
    def poi_exit(self) -> nds.poi.poi.poi_exit_reference.PoiExitReference:
        return self._choice

    @poi_exit.setter
    def poi_exit(self, poi_exit_: nds.poi.poi.poi_exit_reference.PoiExitReference) -> None:
        self._choice = poi_exit_

    @property
    def poi_entrance_and_exit(self) -> nds.poi.poi.poi_entrance_and_exit_reference.PoiEntranceAndExitReference:
        return self._choice

    @poi_entrance_and_exit.setter
    def poi_entrance_and_exit(self, poi_entrance_and_exit_: nds.poi.poi.poi_entrance_and_exit_reference.PoiEntranceAndExitReference) -> None:
        self._choice = poi_entrance_and_exit_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            return self.CHOICE_POI_COMPLETE
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            return self.CHOICE_POI_ENTRANCE
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            return self.CHOICE_POI_EXIT
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            return self.CHOICE_POI_ENTRANCE_AND_EXIT
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: PoiDisplayMesh3DRelationValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            zserio_context.poi_complete.init(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            zserio_context.poi_entrance.init(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            zserio_context.poi_exit.init(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            zserio_context.poi_entrance_and_exit.init(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PoiDisplayMesh3DRelationValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            end_bitposition += zserio_context.poi_complete.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            end_bitposition += zserio_context.poi_entrance.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            end_bitposition += zserio_context.poi_exit.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            end_bitposition += zserio_context.poi_entrance_and_exit.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            end_bitposition += zserio.bitsizeof.bitsizeof_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PoiDisplayMesh3DRelationValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            end_bitposition += zserio_context.poi_complete.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            end_bitposition += zserio_context.poi_entrance.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            end_bitposition += zserio_context.poi_exit.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            end_bitposition += zserio_context.poi_entrance_and_exit.bitsizeof(zserio.array.VarUInt32ArrayTraits(), self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            self._choice = zserio_reader.read_varuint32()
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            self._choice = zserio_reader.read_varuint32()
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            self._choice = zserio_reader.read_varuint32()
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            self._choice = zserio_reader.read_varuint32()
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

    def read_packed(self, zserio_context: PoiDisplayMesh3DRelationValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            self._choice = zserio_context.poi_complete.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            self._choice = zserio_context.poi_entrance.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            self._choice = zserio_context.poi_exit.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            self._choice = zserio_context.poi_entrance_and_exit.read(zserio.array.VarUInt32ArrayTraits(), zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            zserio_writer.write_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            zserio_writer.write_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            zserio_writer.write_varuint32(self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            zserio_writer.write_varuint32(self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

    def write_packed(self, zserio_context: PoiDisplayMesh3DRelationValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.COMPLETE):
            zserio_context.poi_complete.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY):
            zserio_context.poi_entrance.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.EXIT):
            zserio_context.poi_exit.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._choice)
        elif selector == (nds.poi.poi.poi_display_mesh3d_relation_type.PoiDisplayMesh3DRelationType.ENTRY_AND_EXIT):
            zserio_context.poi_entrance_and_exit.write(zserio.array.VarUInt32ArrayTraits(), zserio_writer, self._choice)
        else:
            raise zserio.PythonRuntimeException("No match in choice PoiDisplayMesh3DRelationValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._poi_complete_ = zserio.array.DeltaContext()
            self._poi_entrance_ = zserio.array.DeltaContext()
            self._poi_exit_ = zserio.array.DeltaContext()
            self._poi_entrance_and_exit_ = zserio.array.DeltaContext()

        @property
        def poi_complete(self):
            return self._poi_complete_

        @property
        def poi_entrance(self):
            return self._poi_entrance_

        @property
        def poi_exit(self):
            return self._poi_exit_

        @property
        def poi_entrance_and_exit(self):
            return self._poi_entrance_and_exit_

    CHOICE_POI_COMPLETE = 0
    CHOICE_POI_ENTRANCE = 1
    CHOICE_POI_EXIT = 2
    CHOICE_POI_ENTRANCE_AND_EXIT = 3
    UNDEFINED_CHOICE = -1
