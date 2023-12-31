# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.index_buffer
import nds.core.geometry.index_type
import nds.core.geometry.poly_mesh3d_type

class PolyMesh3D:
    def __init__(
            self,
            ib_: nds.core.geometry.index_buffer.IndexBuffer,
            type_: nds.core.geometry.poly_mesh3d_type.PolyMesh3DType,
            index_type_: typing.Union[nds.core.geometry.index_type.IndexType, None] = None,
            start_index_: int = int(),
            num_positions_: int = int()) -> None:
        self._ib_ = ib_
        self._type_ = type_
        self._index_type_ = index_type_
        self._start_index_ = start_index_
        self._num_positions_ = num_positions_

    @classmethod
    def from_reader(
            cls: typing.Type['PolyMesh3D'],
            zserio_reader: zserio.BitStreamReader,
            ib_: nds.core.geometry.index_buffer.IndexBuffer,
            type_: nds.core.geometry.poly_mesh3d_type.PolyMesh3DType) -> 'PolyMesh3D':
        self = object.__new__(cls)
        self._ib_ = ib_
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['PolyMesh3D'],
            zserio_context: PolyMesh3D.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            ib_: nds.core.geometry.index_buffer.IndexBuffer,
            type_: nds.core.geometry.poly_mesh3d_type.PolyMesh3DType) -> 'PolyMesh3D':
        self = object.__new__(cls)
        self._ib_ = ib_
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, PolyMesh3D):
            return (self._ib_ == other._ib_ and
                    self._type_ == other._type_ and
                    (self._index_type_ == other._index_type_) and
                    (self._start_index_ == other._start_index_) and
                    (self._num_positions_ == other._num_positions_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._ib_)
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        result = zserio.hashcode.calc_hashcode_object(result, self._index_type_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._start_index_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_positions_)

        return result

    @property
    def ib(self) -> nds.core.geometry.index_buffer.IndexBuffer:
        return self._ib_

    @property
    def type(self) -> nds.core.geometry.poly_mesh3d_type.PolyMesh3DType:
        return self._type_

    @property
    def index_type(self) -> typing.Union[nds.core.geometry.index_type.IndexType, None]:
        return self._index_type_

    @index_type.setter
    def index_type(self, index_type_: typing.Union[nds.core.geometry.index_type.IndexType, None]) -> None:
        self._index_type_ = index_type_

    @property
    def start_index(self) -> int:
        return self._start_index_

    @start_index.setter
    def start_index(self, start_index_: int) -> None:
        self._start_index_ = start_index_

    @property
    def num_positions(self) -> int:
        return self._num_positions_

    @num_positions.setter
    def num_positions(self, num_positions_: int) -> None:
        self._num_positions_ = num_positions_

    def is_planar(self) -> bool:
        return (True) if ((self._type_ == nds.core.geometry.poly_mesh3d_type.PolyMesh3DType.POLYGON)) else (False)

    def init_packing_context(self, zserio_context: PolyMesh3D.ZserioPackingContext) -> None:
        self._index_type_.init_packing_context(zserio_context.index_type)
        zserio_context.start_index.init(zserio.array.VarSizeArrayTraits(), self._start_index_)
        zserio_context.num_positions.init(zserio.array.VarSizeArrayTraits(), self._num_positions_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._index_type_.bitsizeof(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_positions_)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: PolyMesh3D.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += self._index_type_.bitsizeof_packed(zserio_context.index_type, end_bitposition)
        end_bitposition += zserio_context.start_index.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_)
        end_bitposition += zserio_context.num_positions.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_positions_)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition = self._index_type_.initialize_offsets(end_bitposition)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._start_index_)
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_positions_)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: PolyMesh3D.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition = self._index_type_.initialize_offsets_packed(zserio_context.index_type, end_bitposition)
        end_bitposition += zserio_context.start_index.bitsizeof(zserio.array.VarSizeArrayTraits(), self._start_index_)
        end_bitposition += zserio_context.num_positions.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_positions_)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._index_type_ = nds.core.geometry.index_type.IndexType.from_reader(zserio_reader)

        self._start_index_ = zserio_reader.read_varsize()

        self._num_positions_ = zserio_reader.read_varsize()
        # check constraint
        if not ((self._start_index_ + self._num_positions_) <= self._ib_.num_entries):
            raise zserio.PythonRuntimeException("Constraint violated for field PolyMesh3D.numPositions!")

    def read_packed(self, zserio_context: PolyMesh3D.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._index_type_ = nds.core.geometry.index_type.IndexType.from_reader_packed(zserio_context.index_type, zserio_reader)

        self._start_index_ = zserio_context.start_index.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._num_positions_ = zserio_context.num_positions.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        # check constraint
        if not ((self._start_index_ + self._num_positions_) <= self._ib_.num_entries):
            raise zserio.PythonRuntimeException("Constraint violated for field PolyMesh3D.numPositions!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        self._index_type_.write(zserio_writer)

        zserio_writer.write_varsize(self._start_index_)

        # check constraint
        if not ((self._start_index_ + self._num_positions_) <= self._ib_.num_entries):
            raise zserio.PythonRuntimeException("Constraint violated for field PolyMesh3D.numPositions!")
        zserio_writer.write_varsize(self._num_positions_)

    def write_packed(self, zserio_context: PolyMesh3D.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        self._index_type_.write_packed(zserio_context.index_type, zserio_writer)

        zserio_context.start_index.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._start_index_)

        # check constraint
        if not ((self._start_index_ + self._num_positions_) <= self._ib_.num_entries):
            raise zserio.PythonRuntimeException("Constraint violated for field PolyMesh3D.numPositions!")
        zserio_context.num_positions.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_positions_)

    class ZserioPackingContext:
        def __init__(self):
            self._index_type_ = zserio.array.DeltaContext()
            self._start_index_ = zserio.array.DeltaContext()
            self._num_positions_ = zserio.array.DeltaContext()

        @property
        def index_type(self):
            return self._index_type_

        @property
        def start_index(self):
            return self._start_index_

        @property
        def num_positions(self):
            return self._num_positions_
