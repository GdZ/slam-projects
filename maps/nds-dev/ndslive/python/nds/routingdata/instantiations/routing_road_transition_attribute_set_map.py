# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.attributemap.feature_iterator
import nds.core.attributemap.validity
import nds.core.geometry.coord_shift
import nds.road.reference.types.transition_reference
import nds.routingdata.instantiations.routing_road_transition_attribute_set

class RoutingRoadTransitionAttributeSetMap:
    def __init__(
            self,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift,
            attribute_set_: typing.Union[nds.routingdata.instantiations.routing_road_transition_attribute_set.RoutingRoadTransitionAttributeSet, None] = None,
            feature_: nds.core.attributemap.feature_iterator.FeatureIterator = nds.core.attributemap.feature_iterator.FeatureIterator(),
            references_: typing.List[nds.road.reference.types.transition_reference.TransitionReference] = None,
            validities_: typing.List[nds.core.attributemap.validity.Validity] = None) -> None:
        self._coord_shift_ = coord_shift_
        self._attribute_set_ = attribute_set_
        self._feature_ = feature_
        self._references_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_references()), references_)
        self._validities_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_validities(self)), validities_)

    @classmethod
    def from_reader(
            cls: typing.Type['RoutingRoadTransitionAttributeSetMap'],
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoutingRoadTransitionAttributeSetMap':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoutingRoadTransitionAttributeSetMap'],
            zserio_context: RoutingRoadTransitionAttributeSetMap.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            coord_shift_: nds.core.geometry.coord_shift.CoordShift) -> 'RoutingRoadTransitionAttributeSetMap':
        self = object.__new__(cls)
        self._coord_shift_ = coord_shift_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoutingRoadTransitionAttributeSetMap):
            return (self._coord_shift_ == other._coord_shift_ and
                    (self._attribute_set_ == other._attribute_set_) and
                    (self._feature_ == other._feature_) and
                    (self._references_ == other._references_) and
                    (self._validities_ == other._validities_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_)
        result = zserio.hashcode.calc_hashcode_object(result, self._attribute_set_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._feature_)
        result = zserio.hashcode.calc_hashcode_object(result, self._references_)
        result = zserio.hashcode.calc_hashcode_object(result, self._validities_)

        return result

    @property
    def coord_shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_

    @property
    def attribute_set(self) -> typing.Union[nds.routingdata.instantiations.routing_road_transition_attribute_set.RoutingRoadTransitionAttributeSet, None]:
        return self._attribute_set_

    @attribute_set.setter
    def attribute_set(self, attribute_set_: typing.Union[nds.routingdata.instantiations.routing_road_transition_attribute_set.RoutingRoadTransitionAttributeSet, None]) -> None:
        self._attribute_set_ = attribute_set_

    @property
    def feature(self) -> nds.core.attributemap.feature_iterator.FeatureIterator:
        return self._feature_

    @feature.setter
    def feature(self, feature_: nds.core.attributemap.feature_iterator.FeatureIterator) -> None:
        self._feature_ = feature_

    @property
    def references(self) -> typing.List[nds.road.reference.types.transition_reference.TransitionReference]:
        return self._references_.raw_array

    @references.setter
    def references(self, references_: typing.List[nds.road.reference.types.transition_reference.TransitionReference]) -> None:
        self._references_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_references()), references_)

    @property
    def validities(self) -> typing.List[nds.core.attributemap.validity.Validity]:
        return self._validities_.raw_array

    @validities.setter
    def validities(self, validities_: typing.List[nds.core.attributemap.validity.Validity]) -> None:
        self._validities_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_validities(self)), validities_)

    def init_packing_context(self, zserio_context: RoutingRoadTransitionAttributeSetMap.ZserioPackingContext) -> None:
        self._attribute_set_.init_packing_context(zserio_context.attribute_set)
        zserio_context.feature.init(zserio.array.VarSizeArrayTraits(), self._feature_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_set_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._feature_)
        end_bitposition += self._references_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._validities_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoutingRoadTransitionAttributeSetMap.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._attribute_set_.bitsizeof_packed(zserio_context.attribute_set, end_bitposition)
        end_bitposition += zserio_context.feature.bitsizeof(zserio.array.VarSizeArrayTraits(), self._feature_)
        end_bitposition += self._references_.bitsizeof_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._validities_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_set_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._feature_)
        end_bitposition = self._references_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._validities_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoutingRoadTransitionAttributeSetMap.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._attribute_set_.initialize_offsets_packed(zserio_context.attribute_set, end_bitposition)
        end_bitposition += zserio_context.feature.bitsizeof(zserio.array.VarSizeArrayTraits(), self._feature_)
        end_bitposition = self._references_.initialize_offsets_packed(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._validities_.initialize_offsets(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_set_ = nds.routingdata.instantiations.routing_road_transition_attribute_set.RoutingRoadTransitionAttributeSet.from_reader(zserio_reader)
        self._feature_ = zserio_reader.read_varsize()
        self._references_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_references()), zserio_reader, self._feature_)
        zserio_reader.alignto(8)
        self._validities_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_validities(self)), zserio_reader, self._feature_)

    def read_packed(self, zserio_context: RoutingRoadTransitionAttributeSetMap.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._attribute_set_ = nds.routingdata.instantiations.routing_road_transition_attribute_set.RoutingRoadTransitionAttributeSet.from_reader_packed(zserio_context.attribute_set, zserio_reader)

        self._feature_ = zserio_context.feature.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._references_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_references()), zserio_reader, self._feature_)

        zserio_reader.alignto(8)
        self._validities_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_validities(self)), zserio_reader, self._feature_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._attribute_set_.write(zserio_writer)

        zserio_writer.write_varsize(self._feature_)

        # check array length
        if len(self._references_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field RoutingRoadTransitionAttributeSetMap.references: "
                                                f"{len(self._references_)} != {self._feature_}!")
        self._references_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._validities_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field RoutingRoadTransitionAttributeSetMap.validities: "
                                                f"{len(self._validities_)} != {self._feature_}!")
        self._validities_.write(zserio_writer)

    def write_packed(self, zserio_context: RoutingRoadTransitionAttributeSetMap.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._attribute_set_.write_packed(zserio_context.attribute_set, zserio_writer)

        zserio_context.feature.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._feature_)

        # check array length
        if len(self._references_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field RoutingRoadTransitionAttributeSetMap.references: "
                                                f"{len(self._references_)} != {self._feature_}!")
        self._references_.write_packed(zserio_writer)

        zserio_writer.alignto(8)
        # check array length
        if len(self._validities_) != (self._feature_):
            raise zserio.PythonRuntimeException("Wrong array length for field RoutingRoadTransitionAttributeSetMap.validities: "
                                                f"{len(self._validities_)} != {self._feature_}!")
        self._validities_.write(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._attribute_set_ = nds.routingdata.instantiations.routing_road_transition_attribute_set.RoutingRoadTransitionAttributeSet.ZserioPackingContext()
            self._feature_ = zserio.array.DeltaContext()

        @property
        def attribute_set(self):
            return self._attribute_set_

        @property
        def feature(self):
            return self._feature_

    class _ZserioElementFactory_references:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.road.reference.types.transition_reference.TransitionReference:
            del zserio_index
            return nds.road.reference.types.transition_reference.TransitionReference.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.road.reference.types.transition_reference.TransitionReference.ZserioPackingContext:
            return nds.road.reference.types.transition_reference.TransitionReference.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.road.reference.types.transition_reference.TransitionReference.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.road.reference.types.transition_reference.TransitionReference:
            del zserio_index
            return nds.road.reference.types.transition_reference.TransitionReference.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_validities:
        IS_OBJECT_PACKABLE = False

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.attributemap.validity.Validity:
            del zserio_index
            return nds.core.attributemap.validity.Validity.from_reader(zserio_reader, self._owner._coord_shift_)
