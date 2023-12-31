# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.display.details.attributes.display3d_mesh_attribute_type
import nds.display.details.types.additional3d_feature_class
import nds.display.details.types.original_point_heights

class Display3dMeshAttributeValue:
    def __init__(
            self,
            type_: nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType,
            *,
            additional3d_feature_class_: typing.Union[nds.display.details.types.additional3d_feature_class.Additional3dFeatureClass, None] = None,
            original_point_heights_: typing.Union[nds.display.details.types.original_point_heights.OriginalPointHeights, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if additional3d_feature_class_ is not None:
            self._choice = additional3d_feature_class_
        if original_point_heights_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice Display3dMeshAttributeValue is ambiguous!")
            self._choice = original_point_heights_

    @classmethod
    def from_reader(
            cls: typing.Type['Display3dMeshAttributeValue'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType) -> 'Display3dMeshAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['Display3dMeshAttributeValue'],
            zserio_context: Display3dMeshAttributeValue.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType) -> 'Display3dMeshAttributeValue':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, Display3dMeshAttributeValue):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType:
        return self._type_

    @property
    def additional3d_feature_class(self) -> typing.Union[nds.display.details.types.additional3d_feature_class.Additional3dFeatureClass, None]:
        return self._choice

    @additional3d_feature_class.setter
    def additional3d_feature_class(self, additional3d_feature_class_: typing.Union[nds.display.details.types.additional3d_feature_class.Additional3dFeatureClass, None]) -> None:
        self._choice = additional3d_feature_class_

    @property
    def original_point_heights(self) -> typing.Union[nds.display.details.types.original_point_heights.OriginalPointHeights, None]:
        return self._choice

    @original_point_heights.setter
    def original_point_heights(self, original_point_heights_: typing.Union[nds.display.details.types.original_point_heights.OriginalPointHeights, None]) -> None:
        self._choice = original_point_heights_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            return self.CHOICE_ADDITIONAL3D_FEATURE_CLASS
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            return self.CHOICE_ORIGINAL_POINT_HEIGHTS
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: Display3dMeshAttributeValue.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            self._choice.init_packing_context(zserio_context.additional3d_feature_class)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            self._choice.init_packing_context(zserio_context.original_point_heights)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: Display3dMeshAttributeValue.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.additional3d_feature_class, end_bitposition)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.original_point_heights, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: Display3dMeshAttributeValue.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.additional3d_feature_class, end_bitposition)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.original_point_heights, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            self._choice = nds.display.details.types.additional3d_feature_class.Additional3dFeatureClass.from_reader(zserio_reader)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            self._choice = nds.display.details.types.original_point_heights.OriginalPointHeights.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

    def read_packed(self, zserio_context: Display3dMeshAttributeValue.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            self._choice = nds.display.details.types.additional3d_feature_class.Additional3dFeatureClass.from_reader_packed(zserio_context.additional3d_feature_class, zserio_reader)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            self._choice = nds.display.details.types.original_point_heights.OriginalPointHeights.from_reader_packed(zserio_context.original_point_heights, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            self._choice.write(zserio_writer)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

    def write_packed(self, zserio_context: Display3dMeshAttributeValue.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ADDITIONAL_3D_FEATURE_CLASS):
            self._choice.write_packed(zserio_context.additional3d_feature_class, zserio_writer)
        elif selector == (nds.display.details.attributes.display3d_mesh_attribute_type.Display3dMeshAttributeType.ORIGINAL_POINT_HEIGHTS):
            self._choice.write_packed(zserio_context.original_point_heights, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice Display3dMeshAttributeValue!")

    class ZserioPackingContext:
        def __init__(self):
            self._additional3d_feature_class_ = zserio.array.DeltaContext()
            self._original_point_heights_ = nds.display.details.types.original_point_heights.OriginalPointHeights.ZserioPackingContext()

        @property
        def additional3d_feature_class(self):
            return self._additional3d_feature_class_

        @property
        def original_point_heights(self):
            return self._original_point_heights_

    CHOICE_ADDITIONAL3D_FEATURE_CLASS = 0
    CHOICE_ORIGINAL_POINT_HEIGHTS = 1
    UNDEFINED_CHOICE = -1
