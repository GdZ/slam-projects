# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.buffers
import nds.core.geometry.coord_shift
import nds.core.geometry.geometry_layer_type
import nds.core.geometry.geometry_type
import nds.road.reference.types.road_id

class RoadShapesLayer:
    def __init__(
            self,
            type_: nds.core.geometry.geometry_layer_type.GeometryLayerType,
            has_ids_: bool,
            has_types_: bool,
            coord_shift_xy_: nds.core.geometry.coord_shift.CoordShift = nds.core.geometry.coord_shift.CoordShift(),
            coord_shift_z_: nds.core.geometry.coord_shift.CoordShift = nds.core.geometry.coord_shift.CoordShift(),
            num_elements_: int = int(),
            identifier_: typing.Optional[typing.List[nds.road.reference.types.road_id.RoadId]] = None,
            types_: typing.Optional[typing.List[nds.core.geometry.geometry_type.GeometryType]] = None,
            buffers_: typing.Union[nds.core.geometry.buffers.Buffers, None] = None) -> None:
        self._type_ = type_
        self._has_ids_ = has_ids_
        self._has_types_ = has_types_
        self._coord_shift_xy_ = coord_shift_xy_
        self._coord_shift_z_ = coord_shift_z_
        self._num_elements_ = num_elements_
        if identifier_ is None:
            self._identifier_ = None
        else:
            self._identifier_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_identifier()), identifier_)
        if types_ is None:
            self._types_ = None
        else:
            self._types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_types()), types_)
        self._buffers_ = buffers_

    @classmethod
    def from_reader(
            cls: typing.Type['RoadShapesLayer'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.core.geometry.geometry_layer_type.GeometryLayerType,
            has_ids_: bool,
            has_types_: bool) -> 'RoadShapesLayer':
        self = object.__new__(cls)
        self._type_ = type_
        self._has_ids_ = has_ids_
        self._has_types_ = has_types_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['RoadShapesLayer'],
            zserio_context: RoadShapesLayer.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.core.geometry.geometry_layer_type.GeometryLayerType,
            has_ids_: bool,
            has_types_: bool) -> 'RoadShapesLayer':
        self = object.__new__(cls)
        self._type_ = type_
        self._has_ids_ = has_ids_
        self._has_types_ = has_types_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, RoadShapesLayer):
            return (self._type_ == other._type_ and
                    self._has_ids_ == other._has_ids_ and
                    self._has_types_ == other._has_types_ and
                    (self._coord_shift_xy_ == other._coord_shift_xy_) and
                    (self._coord_shift_z_ == other._coord_shift_z_) and
                    (self._num_elements_ == other._num_elements_) and
                    (not other.is_identifier_used() if not self.is_identifier_used() else (self._identifier_ == other._identifier_)) and
                    (not other.is_types_used() if not self.is_types_used() else (self._types_ == other._types_)) and
                    (self._buffers_ == other._buffers_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_ids_)
        result = zserio.hashcode.calc_hashcode_bool(result, self._has_types_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_xy_)
        result = zserio.hashcode.calc_hashcode_int32(result, self._coord_shift_z_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_elements_)
        if self.is_identifier_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._identifier_)
        if self.is_types_used():
            result = zserio.hashcode.calc_hashcode_object(result, self._types_)
        result = zserio.hashcode.calc_hashcode_object(result, self._buffers_)

        return result

    @property
    def type(self) -> nds.core.geometry.geometry_layer_type.GeometryLayerType:
        return self._type_

    @property
    def has_ids(self) -> bool:
        return self._has_ids_

    @property
    def has_types(self) -> bool:
        return self._has_types_

    @property
    def coord_shift_xy(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_xy_

    @coord_shift_xy.setter
    def coord_shift_xy(self, coord_shift_xy_: nds.core.geometry.coord_shift.CoordShift) -> None:
        self._coord_shift_xy_ = coord_shift_xy_

    @property
    def coord_shift_z(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._coord_shift_z_

    @coord_shift_z.setter
    def coord_shift_z(self, coord_shift_z_: nds.core.geometry.coord_shift.CoordShift) -> None:
        self._coord_shift_z_ = coord_shift_z_

    @property
    def num_elements(self) -> int:
        return self._num_elements_

    @num_elements.setter
    def num_elements(self, num_elements_: int) -> None:
        self._num_elements_ = num_elements_

    @property
    def identifier(self) -> typing.Optional[typing.List[nds.road.reference.types.road_id.RoadId]]:
        return None if self._identifier_ is None else self._identifier_.raw_array

    @identifier.setter
    def identifier(self, identifier_: typing.Optional[typing.List[nds.road.reference.types.road_id.RoadId]]) -> None:
        if identifier_ is None:
            self._identifier_ = None
        else:
            self._identifier_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_identifier()), identifier_)

    def is_identifier_used(self) -> bool:
        return self._has_ids_

    def is_identifier_set(self) -> bool:
        return not self._identifier_ is None

    def reset_identifier(self) -> None:
        self._identifier_ = None

    @property
    def types(self) -> typing.Optional[typing.List[nds.core.geometry.geometry_type.GeometryType]]:
        return None if self._types_ is None else self._types_.raw_array

    @types.setter
    def types(self, types_: typing.Optional[typing.List[nds.core.geometry.geometry_type.GeometryType]]) -> None:
        if types_ is None:
            self._types_ = None
        else:
            self._types_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_types()), types_)

    def is_types_used(self) -> bool:
        return self._has_types_

    def is_types_set(self) -> bool:
        return not self._types_ is None

    def reset_types(self) -> None:
        self._types_ = None

    @property
    def buffers(self) -> typing.Union[nds.core.geometry.buffers.Buffers, None]:
        return self._buffers_

    @buffers.setter
    def buffers(self, buffers_: typing.Union[nds.core.geometry.buffers.Buffers, None]) -> None:
        self._buffers_ = buffers_

    def init_packing_context(self, zserio_context: RoadShapesLayer.ZserioPackingContext) -> None:
        zserio_context.coord_shift_xy.init(zserio.array.BitFieldArrayTraits(5), self._coord_shift_xy_)
        zserio_context.coord_shift_z.init(zserio.array.BitFieldArrayTraits(5), self._coord_shift_z_)
        zserio_context.num_elements.init(zserio.array.VarSizeArrayTraits(), self._num_elements_)
        self._buffers_.init_packing_context(zserio_context.buffers)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition += 5
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_elements_)
        if self.is_identifier_used():
            end_bitposition += self._identifier_.bitsizeof_packed(end_bitposition)
        if self.is_types_used():
            end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
            end_bitposition += self._types_.bitsizeof(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._buffers_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: RoadShapesLayer.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.coord_shift_xy.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._coord_shift_xy_)
        end_bitposition += zserio_context.coord_shift_z.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._coord_shift_z_)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio_context.num_elements.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_elements_)
        if self.is_identifier_used():
            end_bitposition += self._identifier_.bitsizeof_packed(end_bitposition)
        if self.is_types_used():
            end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
            end_bitposition += self._types_.bitsizeof(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += self._buffers_.bitsizeof_packed(zserio_context.buffers, end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition += 5
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_elements_)
        if self.is_identifier_used():
            end_bitposition = self._identifier_.initialize_offsets_packed(end_bitposition)
        if self.is_types_used():
            end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
            end_bitposition = self._types_.initialize_offsets(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._buffers_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: RoadShapesLayer.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.coord_shift_xy.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._coord_shift_xy_)
        end_bitposition += zserio_context.coord_shift_z.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._coord_shift_z_)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition += zserio_context.num_elements.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_elements_)
        if self.is_identifier_used():
            end_bitposition = self._identifier_.initialize_offsets_packed(end_bitposition)
        if self.is_types_used():
            end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
            end_bitposition = self._types_.initialize_offsets(end_bitposition)
        end_bitposition = zserio.bitposition.alignto(8, end_bitposition)
        end_bitposition = self._buffers_.initialize_offsets_packed(zserio_context.buffers, end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._coord_shift_xy_ = zserio_reader.read_bits(5)
        self._coord_shift_z_ = zserio_reader.read_bits(5)
        zserio_reader.alignto(8)
        self._num_elements_ = zserio_reader.read_varsize()
        if self.is_identifier_used():
            self._identifier_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_identifier()), zserio_reader, self._num_elements_)
        else:
            self._identifier_ = None
        if self.is_types_used():
            zserio_reader.alignto(8)
            self._types_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_types()), zserio_reader, self._num_elements_)
        else:
            self._types_ = None
        zserio_reader.alignto(8)
        self._buffers_ = nds.core.geometry.buffers.Buffers.from_reader(zserio_reader, self._type_, self._coord_shift_xy_, self._coord_shift_z_, self._num_elements_)

    def read_packed(self, zserio_context: RoadShapesLayer.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._coord_shift_xy_ = zserio_context.coord_shift_xy.read(zserio.array.BitFieldArrayTraits(5), zserio_reader)

        self._coord_shift_z_ = zserio_context.coord_shift_z.read(zserio.array.BitFieldArrayTraits(5), zserio_reader)

        zserio_reader.alignto(8)
        self._num_elements_ = zserio_context.num_elements.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        if self.is_identifier_used():
            self._identifier_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_identifier()), zserio_reader, self._num_elements_)
        else:
            self._identifier_ = None

        if self.is_types_used():
            zserio_reader.alignto(8)
            self._types_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_types()), zserio_reader, self._num_elements_)
        else:
            self._types_ = None

        zserio_reader.alignto(8)
        self._buffers_ = nds.core.geometry.buffers.Buffers.from_reader_packed(zserio_context.buffers, zserio_reader, self._type_, self._coord_shift_xy_, self._coord_shift_z_, self._num_elements_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._coord_shift_xy_, 5)

        zserio_writer.write_bits(self._coord_shift_z_, 5)

        zserio_writer.alignto(8)
        zserio_writer.write_varsize(self._num_elements_)

        if self.is_identifier_used():
            # check array length
            if len(self._identifier_) != (self._num_elements_):
                raise zserio.PythonRuntimeException("Wrong array length for field RoadShapesLayer.identifier: "
                                                    f"{len(self._identifier_)} != {self._num_elements_}!")
            self._identifier_.write_packed(zserio_writer)

        if self.is_types_used():
            zserio_writer.alignto(8)
            # check array length
            if len(self._types_) != (self._num_elements_):
                raise zserio.PythonRuntimeException("Wrong array length for field RoadShapesLayer.types: "
                                                    f"{len(self._types_)} != {self._num_elements_}!")
            self._types_.write(zserio_writer)

        zserio_writer.alignto(8)
        # check parameters
        if self._buffers_.type is not (self._type_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.type} != {self._type_}!")
        if self._buffers_.shift_xy != (self._coord_shift_xy_):
            raise zserio.PythonRuntimeException("Wrong parameter shiftXY for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.shift_xy} != {self._coord_shift_xy_}!")
        if self._buffers_.shift_z != (self._coord_shift_z_):
            raise zserio.PythonRuntimeException("Wrong parameter shiftZ for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.shift_z} != {self._coord_shift_z_}!")
        if self._buffers_.num_elements != (self._num_elements_):
            raise zserio.PythonRuntimeException("Wrong parameter numElements for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.num_elements} != {self._num_elements_}!")
        self._buffers_.write(zserio_writer)

    def write_packed(self, zserio_context: RoadShapesLayer.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.coord_shift_xy.write(zserio.array.BitFieldArrayTraits(5), zserio_writer, self._coord_shift_xy_)

        zserio_context.coord_shift_z.write(zserio.array.BitFieldArrayTraits(5), zserio_writer, self._coord_shift_z_)

        zserio_writer.alignto(8)
        zserio_context.num_elements.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_elements_)

        if self.is_identifier_used():
            # check array length
            if len(self._identifier_) != (self._num_elements_):
                raise zserio.PythonRuntimeException("Wrong array length for field RoadShapesLayer.identifier: "
                                                    f"{len(self._identifier_)} != {self._num_elements_}!")
            self._identifier_.write_packed(zserio_writer)

        if self.is_types_used():
            zserio_writer.alignto(8)
            # check array length
            if len(self._types_) != (self._num_elements_):
                raise zserio.PythonRuntimeException("Wrong array length for field RoadShapesLayer.types: "
                                                    f"{len(self._types_)} != {self._num_elements_}!")
            self._types_.write(zserio_writer)

        zserio_writer.alignto(8)
        # check parameters
        if self._buffers_.type is not (self._type_):
            raise zserio.PythonRuntimeException("Wrong parameter type for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.type} != {self._type_}!")
        if self._buffers_.shift_xy != (self._coord_shift_xy_):
            raise zserio.PythonRuntimeException("Wrong parameter shiftXY for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.shift_xy} != {self._coord_shift_xy_}!")
        if self._buffers_.shift_z != (self._coord_shift_z_):
            raise zserio.PythonRuntimeException("Wrong parameter shiftZ for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.shift_z} != {self._coord_shift_z_}!")
        if self._buffers_.num_elements != (self._num_elements_):
            raise zserio.PythonRuntimeException("Wrong parameter numElements for field RoadShapesLayer.buffers: "
                                                f"{self._buffers_.num_elements} != {self._num_elements_}!")
        self._buffers_.write_packed(zserio_context.buffers, zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._coord_shift_xy_ = zserio.array.DeltaContext()
            self._coord_shift_z_ = zserio.array.DeltaContext()
            self._num_elements_ = zserio.array.DeltaContext()
            self._buffers_ = nds.core.geometry.buffers.Buffers.ZserioPackingContext()

        @property
        def coord_shift_xy(self):
            return self._coord_shift_xy_

        @property
        def coord_shift_z(self):
            return self._coord_shift_z_

        @property
        def num_elements(self):
            return self._num_elements_

        @property
        def buffers(self):
            return self._buffers_

    class _ZserioElementFactory_identifier:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.road.reference.types.road_id.RoadId:
            del zserio_index
            return nds.road.reference.types.road_id.RoadId.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.road.reference.types.road_id.RoadId.ZserioPackingContext:
            return nds.road.reference.types.road_id.RoadId.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.road.reference.types.road_id.RoadId.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.road.reference.types.road_id.RoadId:
            del zserio_index
            return nds.road.reference.types.road_id.RoadId.from_reader_packed(zserio_context, zserio_reader)

    class _ZserioElementFactory_types:
        IS_OBJECT_PACKABLE = False

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.core.geometry.geometry_type.GeometryType:
            del zserio_index
            return nds.core.geometry.geometry_type.GeometryType.from_reader(zserio_reader)