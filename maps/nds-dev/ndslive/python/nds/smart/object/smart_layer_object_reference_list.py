# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.spatial_extent
import nds.smart.object.smart_layer_object_reference

class SmartLayerObjectReferenceList:
    def __init__(
            self,
            num_objects_: int = int(),
            list_: typing.List[nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference] = None,
            extent_: typing.Optional[typing.List[nds.core.geometry.spatial_extent.SpatialExtent]] = None) -> None:
        self._num_objects_ = num_objects_
        self._list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_list()), list_)
        if extent_ is None:
            self._extent_ = None
        else:
            self._extent_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_extent()), extent_)

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerObjectReferenceList'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerObjectReferenceList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SmartLayerObjectReferenceList'],
            zserio_context: SmartLayerObjectReferenceList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerObjectReferenceList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerObjectReferenceList):
            return ((self._num_objects_ == other._num_objects_) and
                    (self._list_ == other._list_) and
                    (not other.is_extent_used() if not self.is_extent_used() else (self._extent_ == other._extent_)))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_objects_)
        result = zserio.hashcode.calc_hashcode_object(result, self._list_)
        if self.is_extent_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._extent_)

        return result

    @property
    def num_objects(self) -> int:
        return self._num_objects_

    @num_objects.setter
    def num_objects(self, num_objects_: int) -> None:
        self._num_objects_ = num_objects_

    @property
    def list(self) -> typing.List[nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference]:
        return self._list_.raw_array

    @list.setter
    def list(self, list_: typing.List[nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference]) -> None:
        self._list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_list()), list_)

    @property
    def extent(self) -> typing.Optional[typing.List[nds.core.geometry.spatial_extent.SpatialExtent]]:
        return None if self._extent_ is None else self._extent_.raw_array

    @extent.setter
    def extent(self, extent_: typing.Optional[typing.List[nds.core.geometry.spatial_extent.SpatialExtent]]) -> None:
        if extent_ is None:
            self._extent_ = None
        else:
            self._extent_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_extent()), extent_)

    def is_extent_used(self) -> bool:
        return self.is_extent_set()

    def is_extent_set(self) -> bool:
        return not self._extent_ is None

    def reset_extent(self) -> None:
        self._extent_ = None

    def init_packing_context(self, zserio_context: SmartLayerObjectReferenceList.ZserioPackingContext) -> None:
        zserio_context.num_objects.init(zserio.array.VarSizeArrayTraits(), self._num_objects_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_objects_)
        end_bitposition += self._list_.bitsizeof(end_bitposition)
        end_bitposition += 1
        if self.is_extent_used():
            end_bitposition += self._extent_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SmartLayerObjectReferenceList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_objects.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_objects_)
        end_bitposition += self._list_.bitsizeof_packed(end_bitposition)
        end_bitposition += 1
        if self.is_extent_used():
            end_bitposition += self._extent_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_objects_)
        end_bitposition = self._list_.initialize_offsets(end_bitposition)
        end_bitposition += 1
        if self.is_extent_used():
            end_bitposition = self._extent_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SmartLayerObjectReferenceList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_objects.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_objects_)
        end_bitposition = self._list_.initialize_offsets_packed(end_bitposition)
        end_bitposition += 1
        if self.is_extent_used():
            end_bitposition = self._extent_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_objects_ = zserio_reader.read_varsize()
        self._list_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_list()), zserio_reader, self._num_objects_)
        if zserio_reader.read_bool():
            self._extent_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_extent()), zserio_reader, self._num_objects_)
        else:
            self._extent_ = None

    def read_packed(self, zserio_context: SmartLayerObjectReferenceList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_objects_ = zserio_context.num_objects.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._list_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_list()), zserio_reader, self._num_objects_)

        if zserio_reader.read_bool():
            self._extent_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_extent()), zserio_reader, self._num_objects_)
        else:
            self._extent_ = None

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_objects_)

        # check array length
        if len(self._list_) != (self._num_objects_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerObjectReferenceList.list: "
                                                f"{len(self._list_)} != {self._num_objects_}!")
        self._list_.write(zserio_writer)

        if self.is_extent_used():
            zserio_writer.write_bool(True)
            # check array length
            if len(self._extent_) != (self._num_objects_):
                raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerObjectReferenceList.extent: "
                                                    f"{len(self._extent_)} != {self._num_objects_}!")
            self._extent_.write(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    def write_packed(self, zserio_context: SmartLayerObjectReferenceList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_objects.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_objects_)

        # check array length
        if len(self._list_) != (self._num_objects_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerObjectReferenceList.list: "
                                                f"{len(self._list_)} != {self._num_objects_}!")
        self._list_.write_packed(zserio_writer)

        if self.is_extent_used():
            zserio_writer.write_bool(True)
            # check array length
            if len(self._extent_) != (self._num_objects_):
                raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerObjectReferenceList.extent: "
                                                    f"{len(self._extent_)} != {self._num_objects_}!")
            self._extent_.write_packed(zserio_writer)
        else:
            zserio_writer.write_bool(False)

    class ZserioPackingContext:
        def __init__(self):
            self._num_objects_ = zserio.array.DeltaContext()

        @property
        def num_objects(self):
            return self._num_objects_

    class _ZserioElementFactory_list:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference:
            del zserio_index
            return nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference.ZserioPackingContext:
            return nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference:
            del zserio_index
            return nds.smart.object.smart_layer_object_reference.SmartLayerObjectReference.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_extent:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.geometry.spatial_extent.SpatialExtent:
            del zserio_index
            return nds.core.geometry.spatial_extent.SpatialExtent.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.core.geometry.spatial_extent.SpatialExtent.ZserioPackingContext:
            return nds.core.geometry.spatial_extent.SpatialExtent.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.core.geometry.spatial_extent.SpatialExtent.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.geometry.spatial_extent.SpatialExtent:
            del zserio_index
            return nds.core.geometry.spatial_extent.SpatialExtent.from_reader_packed(zserio_context, zserio_reader)
