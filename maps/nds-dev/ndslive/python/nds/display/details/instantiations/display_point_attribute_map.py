# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.attributemap.attribute_iterator
import nds.core.attributemap.condition_list
import nds.core.attributemap.feature_iterator
import nds.core.attributemap.validity
import nds.core.geometry.coord_shift
import nds.display.details.attributes.display_point_attribute_type
import nds.display.details.instantiations.display_point_attribute
import nds.display.details.instantiations.display_property_list
import nds.display.reference.types.display_point_id

class DisplayPointAttributeMap:
    def __init__(
            self,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift,
            attribute_type_code_: typing.Union[nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType, None] = None,
            feature_: nds.core.attributemap.feature_iterator.FeatureIterator = nds.core.attributemap.feature_iterator.FeatureIterator(),
            feature_references_: typing.List[nds.display.reference.types.display_point_id.DisplayPointId] = None,
            feature_validities_: typing.List[nds.core.attributemap.validity.Validity] = None,
            feature_value_ptr_: typing.List[nds.core.attributemap.attribute_iterator.AttributeIterator] = None,
            attribute_: nds.core.attributemap.attribute_iterator.AttributeIterator = nds.core.attributemap.attribute_iterator.AttributeIterator(),
            attribute_values_: typing.List[nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute] = None,
            attribute_properties_: typing.List[nds.display.details.instantiations.display_property_list.DisplayPropertyList] = None,
            attribute_conditions_: typing.List[nds.core.attributemap.condition_list.ConditionList] = None) -> None:
        self._coord_shift_ = coord_shift_
        self._attribute_type_code_ = attribute_type_code_
        self._feature_ = feature_
        self._feature_references_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_references()), feature_references_)
        self._feature_validities_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_validities(self)), feature_validities_)
        self._feature_value_ptr_ = zserio.array.Array(zserio.array.VarSizeArrayTraits(), feature_value_ptr_)
        self._attribute_ = attribute_
        self._attribute_values_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_values(self)), attribute_values_)
        self._attribute_properties_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_properties()), attribute_properties_)
        self._attribute_conditions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_conditions()), attribute_conditions_)

    @classmethod
    def from_reader(
            cls: typing.Type['DisplayPointAttributeMap'],
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayPointAttributeMap':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['DisplayPointAttributeMap'],
            zserio_context: DisplayPointAttributeMap.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'DisplayPointAttributeMap':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, DisplayPointAttributeMap):
            return (self._coord_shift_ == other._coord_shift_ and
                    (self._attribute_type_code_ == other._attribute_type_code_) and
                    (self._feature_ == other._feature_) and
                    (self._feature_references_ == other._feature_references_) and
                    (self._feature_validities_ == other._feature_validities_) and
                    (self._feature_value_ptr_ == other._feature_value_ptr_) and
                    (self._attribute_ == other._attribute_) and
                    (self._attribute_values_ == other._attribute_values_) and
                    (self._attribute_properties_ == other._attribute_properties_) and
                    (self._attribute_conditions_ == other._attribute_conditions_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_type_code_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._feature_)
        result = zserio.hashcode.calc_hashcode_object(result, self._feature_references_)
        result = zserio.hashcode.calc_hashcode_object(result, self._feature_validities_)
        result = zserio.hashcode.calc_hashcode_object(result, self._feature_value_ptr_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._attribute_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_values_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_properties_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_conditions_)

        return result

    @property
    def coord_shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_

    @property
    def attribute_type_code(self) -> typing.Union[nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType, None]:
        return self._attribute_type_code_

    @attribute_type_code.setter
    def attribute_type_code(self, attribute_type_code_: typing.Union[nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType, None]) -> None:
        self._attribute_type_code_ = attribute_type_code_

    @property
    def feature(self) -> nds.core.attributemap.feature_iterator.FeatureIterator:
        return self._feature_

    @feature.setter
    def feature(self, feature_: nds.core.attributemap.feature_iterator.FeatureIterator) -> None:
        self._feature_ = feature_

    @property
    def feature_references(self) -> typing.List[nds.display.reference.types.display_point_id.DisplayPointId]:
        return self._feature_references_.raw_array

    @feature_references.setter
    def feature_references(self, feature_references_: typing.List[nds.display.reference.types.display_point_id.DisplayPointId]) -> None:
        self._feature_references_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_references()), feature_references_)

    @property
    def feature_validities(self) -> typing.List[nds.core.attributemap.validity.Validity]:
        return self._feature_validities_.raw_array

    @feature_validities.setter
    def feature_validities(self, feature_validities_: typing.List[nds.core.attributemap.validity.Validity]) -> None:
        self._feature_validities_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_validities(self)), feature_validities_)

    @property
    def feature_value_ptr(self) -> typing.List[nds.core.attributemap.attribute_iterator.AttributeIterator]:
        return self._feature_value_ptr_.raw_array

    @feature_value_ptr.setter
    def feature_value_ptr(self, feature_value_ptr_: typing.List[nds.core.attributemap.attribute_iterator.AttributeIterator]) -> None:
        self._feature_value_ptr_ = zserio.array.Array(zserio.array.VarSizeArrayTraits(), feature_value_ptr_)

    @property
    def attribute(self) -> nds.core.attributemap.attribute_iterator.AttributeIterator:
        return self._attribute_

    @attribute.setter
    def attribute(self, attribute_: nds.core.attributemap.attribute_iterator.AttributeIterator) -> None:
        self._attribute_ = attribute_

    @property
    def attribute_values(self) -> typing.List[nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute]:
        return self._attribute_values_.raw_array

    @attribute_values.setter
    def attribute_values(self, attribute_values_: typing.List[nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute]) -> None:
        self._attribute_values_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_values(self)), attribute_values_)

    @property
    def attribute_properties(self) -> typing.List[nds.display.details.instantiations.display_property_list.DisplayPropertyList]:
        return self._attribute_properties_.raw_array

    @attribute_properties.setter
    def attribute_properties(self, attribute_properties_: typing.List[nds.display.details.instantiations.display_property_list.DisplayPropertyList]) -> None:
        self._attribute_properties_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_properties()), attribute_properties_)

    @property
    def attribute_conditions(self) -> typing.List[nds.core.attributemap.condition_list.ConditionList]:
        return self._attribute_conditions_.raw_array

    @attribute_conditions.setter
    def attribute_conditions(self, attribute_conditions_: typing.List[nds.core.attributemap.condition_list.ConditionList]) -> None:
        self._attribute_conditions_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_conditions()), attribute_conditions_)

    def init_packing_context(self, zserio_context: DisplayPointAttributeMap.ZserioPackingContext) -> None:
        self._attribute_type_code_.init_packing_context(zserio_context.attribute_type_code)
        zserio_context.feature.init(zserio.array.VarSizeArrayTraits(), self._feature_)
        zserio_context.attribute.init(zserio.array.VarSizeArrayTraits(), self._attribute_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_type_code_.bitsizeof(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._feature_)
        end_bitposition += self._feature_references_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._feature_validities_.bitsizeof(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._feature_value_ptr_.bitsizeof_packed(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._attribute_)
        end_bitposition += self._attribute_values_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._attribute_properties_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._attribute_conditions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: DisplayPointAttributeMap.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_type_code_.bitsizeof_packed(zserio_context.attribute_type_code, end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio_context.feature.bitsizeof(zserio.array.VarSizeArrayTraits(), self._feature_)
        end_bitposition += self._feature_references_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._feature_validities_.bitsizeof(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._feature_value_ptr_.bitsizeof_packed(end_bitposition)
        end_bitposition += zserio_context.attribute.bitsizeof(zserio.array.VarSizeArrayTraits(), self._attribute_)
        end_bitposition += self._attribute_values_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._attribute_properties_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._attribute_conditions_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_type_code_.initialize_offsets(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._feature_)
        end_bitposition = self._feature_references_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._feature_validities_.initialize_offsets(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._feature_value_ptr_.initialize_offsets_packed(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._attribute_)
        end_bitposition = self._attribute_values_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._attribute_properties_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._attribute_conditions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: DisplayPointAttributeMap.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_type_code_.initialize_offsets_packed(zserio_context.attribute_type_code, end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio_context.feature.bitsizeof(zserio.array.VarSizeArrayTraits(), self._feature_)
        end_bitposition = self._feature_references_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._feature_validities_.initialize_offsets(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._feature_value_ptr_.initialize_offsets_packed(end_bitposition)
        end_bitposition += zserio_context.attribute.bitsizeof(zserio.array.VarSizeArrayTraits(), self._attribute_)
        end_bitposition = self._attribute_values_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._attribute_properties_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._attribute_conditions_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_type_code_ = nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.from_reader(zserio_reader)
        zserio_reader.alignto(8)
        self._feature_ = zserio_reader.read_varsize()
        self._feature_references_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_references()), zserio_reader, self._feature_)
        zserio_reader.alignto(8)
        self._feature_validities_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_validities(self)), zserio_reader, self._feature_)
        zserio_reader.alignto(8)
        self._feature_value_ptr_ = zserio.array.Array.from_reader_packed(zserio.array.VarSizeArrayTraits(), zserio_reader, self._feature_)
        self._attribute_ = zserio_reader.read_varsize()
        self._attribute_values_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_values(self)), zserio_reader, self._attribute_)
        zserio_reader.alignto(8)
        self._attribute_properties_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_properties()), zserio_reader, self._attribute_)
        zserio_reader.alignto(8)
        self._attribute_conditions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_conditions()), zserio_reader, self._attribute_)

    def read_packed(self, zserio_context: DisplayPointAttributeMap.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_type_code_ = nds.display.details.attributes.display_point_attribute_type.DisplayPointAttributeType.from_reader_packed(zserio_context.attribute_type_code, zserio_reader)

        zserio_reader.alignto(8)
        self._feature_ = zserio_context.feature.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._feature_references_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_references()), zserio_reader, self._feature_)

        zserio_reader.alignto(8)
        self._feature_validities_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_feature_validities(self)), zserio_reader, self._feature_)

        zserio_reader.alignto(8)
        self._feature_value_ptr_ = zserio.array.Array.from_reader_packed(zserio.array.VarSizeArrayTraits(), zserio_reader, self._feature_)

        self._attribute_ = zserio_context.attribute.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._attribute_values_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_values(self)), zserio_reader, self._attribute_)

        zserio_reader.alignto(8)
        self._attribute_properties_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_properties()), zserio_reader, self._attribute_)

        zserio_reader.alignto(8)
        self._attribute_conditions_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_attribute_conditions()), zserio_reader, self._attribute_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._attribute_type_code_.write(zserio_writer)

        zserio_writer.alignto(8)
        zserio_writer.write_varsize(self._feature_)

        # check array length
        if len(self._feature_references_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.featureReferences: "
                                                f"{len(self._feature_references_)} != {self._feature_}!")
        self._feature_references_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._feature_validities_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.featureValidities: "
                                                f"{len(self._feature_validities_)} != {self._feature_}!")
        self._feature_validities_.write(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._feature_value_ptr_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.featureValuePtr: "
                                                f"{len(self._feature_value_ptr_)} != {self._feature_}!")
        self._feature_value_ptr_.write_packed(zserio_writer)

        zserio_writer.write_varsize(self._attribute_)

        # check array length
        if len(self._attribute_values_) != (self._attribute_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.attributeValues: "
                                                f"{len(self._attribute_values_)} != {self._attribute_}!")
        self._attribute_values_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._attribute_properties_) != (self._attribute_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.attributeProperties: "
                                                f"{len(self._attribute_properties_)} != {self._attribute_}!")
        self._attribute_properties_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._attribute_conditions_) != (self._attribute_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.attributeConditions: "
                                                f"{len(self._attribute_conditions_)} != {self._attribute_}!")
        self._attribute_conditions_.write_packed(zserio_writer)

    def write_packed(self, zserio_context: DisplayPointAttributeMap.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._attribute_type_code_.write_packed(zserio_context.attribute_type_code, zserio_writer)

        zserio_writer.alignto(8)
        zserio_context.feature.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._feature_)

        # check array length
        if len(self._feature_references_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.featureReferences: "
                                                f"{len(self._feature_references_)} != {self._feature_}!")
        self._feature_references_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._feature_validities_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.featureValidities: "
                                                f"{len(self._feature_validities_)} != {self._feature_}!")
        self._feature_validities_.write(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._feature_value_ptr_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.featureValuePtr: "
                                                f"{len(self._feature_value_ptr_)} != {self._feature_}!")
        self._feature_value_ptr_.write_packed(zserio_writer)

        zserio_context.attribute.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._attribute_)

        # check array length
        if len(self._attribute_values_) != (self._attribute_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.attributeValues: "
                                                f"{len(self._attribute_values_)} != {self._attribute_}!")
        self._attribute_values_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._attribute_properties_) != (self._attribute_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.attributeProperties: "
                                                f"{len(self._attribute_properties_)} != {self._attribute_}!")
        self._attribute_properties_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._attribute_conditions_) != (self._attribute_):
            raise zserio.PythonRuntimeException("Wrong array length for field DisplayPointAttributeMap.attributeConditions: "
                                                f"{len(self._attribute_conditions_)} != {self._attribute_}!")
        self._attribute_conditions_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._attribute_type_code_ = zserio.array.DeltaContext()
            self._feature_ = zserio.array.DeltaContext()
            self._attribute_ = zserio.array.DeltaContext()

        @property
        def attribute_type_code(self):
            return self._attribute_type_code_

        @property
        def feature(self):
            return self._feature_

        @property
        def attribute(self):
            return self._attribute_

    class _ZserioElementFactory_feature_references:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.reference.types.display_point_id.DisplayPointId:
            del zserio_index
            return nds.display.reference.types.display_point_id.DisplayPointId.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.display.reference.types.display_point_id.DisplayPointId.ZserioPackingContext:
            return nds.display.reference.types.display_point_id.DisplayPointId.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.display.reference.types.display_point_id.DisplayPointId.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.reference.types.display_point_id.DisplayPointId:
            del zserio_index
            return nds.display.reference.types.display_point_id.DisplayPointId.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_feature_validities:
        IS_OBJECT_PACKABLE = False

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.validity.Validity:
            del zserio_index
            return nds.core.attributemap.validity.Validity.from_reader(zserio_reader, self._owner._coord_shift_)

    class _ZserioElementFactory_attribute_values:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute:
            del zserio_index
            return nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute.from_reader(zserio_reader, self._owner._attribute_type_code_)

        @staticmethod
        def create_packing_context() -> nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute.ZserioPackingContext:
            return nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute:
            del zserio_index
            return nds.display.details.instantiations.display_point_attribute.DisplayPointAttribute.from_reader_packed(zserio_context, zserio_reader, self._owner._attribute_type_code_)

    class _ZserioElementFactory_attribute_properties:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.instantiations.display_property_list.DisplayPropertyList:
            del zserio_index
            return nds.display.details.instantiations.display_property_list.DisplayPropertyList.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.display.details.instantiations.display_property_list.DisplayPropertyList.ZserioPackingContext:
            return nds.display.details.instantiations.display_property_list.DisplayPropertyList.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.display.details.instantiations.display_property_list.DisplayPropertyList.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.details.instantiations.display_property_list.DisplayPropertyList:
            del zserio_index
            return nds.display.details.instantiations.display_property_list.DisplayPropertyList.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_attribute_conditions:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.condition_list.ConditionList:
            del zserio_index
            return nds.core.attributemap.condition_list.ConditionList.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.attributemap.condition_list.ConditionList.ZserioPackingContext:
            return nds.core.attributemap.condition_list.ConditionList.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.attributemap.condition_list.ConditionList.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.condition_list.ConditionList:
            del zserio_index
            return nds.core.attributemap.condition_list.ConditionList.from_reader_packed(zserio_context, zserio_reader)