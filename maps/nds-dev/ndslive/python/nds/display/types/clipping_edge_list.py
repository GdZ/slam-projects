# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.geometry.coord_shift
import nds.display.types.clipping_edge

class ClippingEdgeList:
    def __init__(
            self,
            shift_: nds.core.geometry.coord_shift.CoordShift = nds.core.geometry.coord_shift.CoordShift(),
            num_edges_: int = int(),
            edges_: typing.List[nds.display.types.clipping_edge.ClippingEdge] = None) -> None:
        self._shift_ = shift_
        self._num_edges_ = num_edges_
        self._edges_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_edges(self)), edges_)

    @classmethod
    def from_reader(
            cls: typing.Type['ClippingEdgeList'],
            zserio_reader: zserio.BitStreamReader) -> 'ClippingEdgeList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['ClippingEdgeList'],
            zserio_context: ClippingEdgeList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'ClippingEdgeList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, ClippingEdgeList):
            return ((self._shift_ == other._shift_) and
                    (self._num_edges_ == other._num_edges_) and
                    (self._edges_ == other._edges_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int32(result, self._shift_)
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_edges_)
        result = zserio.hashcode.calc_hashcode_object(result, self._edges_)

        return result

    @property
    def shift(self) -> nds.core.geometry.coord_shift.CoordShift:
        return self._shift_

    @shift.setter
    def shift(self, shift_: nds.core.geometry.coord_shift.CoordShift) -> None:
        self._shift_ = shift_

    @property
    def num_edges(self) -> int:
        return self._num_edges_

    @num_edges.setter
    def num_edges(self, num_edges_: int) -> None:
        self._num_edges_ = num_edges_

    @property
    def edges(self) -> typing.List[nds.display.types.clipping_edge.ClippingEdge]:
        return self._edges_.raw_array

    @edges.setter
    def edges(self, edges_: typing.List[nds.display.types.clipping_edge.ClippingEdge]) -> None:
        self._edges_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_edges(self)), edges_)

    def init_packing_context(self, zserio_context: ClippingEdgeList.ZserioPackingContext) -> None:
        zserio_context.shift.init(zserio.array.BitFieldArrayTraits(5), self._shift_)
        zserio_context.num_edges.init(zserio.array.VarSizeArrayTraits(), self._num_edges_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_edges_)
        end_bitposition += self._edges_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: ClippingEdgeList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        end_bitposition += zserio_context.num_edges.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_edges_)
        end_bitposition += self._edges_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += 5
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_edges_)
        end_bitposition = self._edges_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: ClippingEdgeList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.shift.bitsizeof(zserio.array.BitFieldArrayTraits(5), self._shift_)
        end_bitposition += zserio_context.num_edges.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_edges_)
        end_bitposition = self._edges_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._shift_ = zserio_reader.read_bits(5)

        self._num_edges_ = zserio_reader.read_varsize()
        # check constraint
        if not (self._num_edges_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ClippingEdgeList.numEdges!")

        self._edges_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_edges(self)), zserio_reader, self._num_edges_)

    def read_packed(self, zserio_context: ClippingEdgeList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._shift_ = zserio_context.shift.read(zserio.array.BitFieldArrayTraits(5), zserio_reader)

        self._num_edges_ = zserio_context.num_edges.read(zserio.array.VarSizeArrayTraits(), zserio_reader)
        # check constraint
        if not (self._num_edges_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ClippingEdgeList.numEdges!")

        self._edges_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_edges(self)), zserio_reader, self._num_edges_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_bits(self._shift_, 5)

        # check constraint
        if not (self._num_edges_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ClippingEdgeList.numEdges!")
        zserio_writer.write_varsize(self._num_edges_)

        # check array length
        if len(self._edges_) != (self._num_edges_):
            raise zserio.PythonRuntimeException("Wrong array length for field ClippingEdgeList.edges: "
                                                f"{len(self._edges_)} != {self._num_edges_}!")
        self._edges_.write(zserio_writer)

    def write_packed(self, zserio_context: ClippingEdgeList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.shift.write(zserio.array.BitFieldArrayTraits(5), zserio_writer, self._shift_)

        # check constraint
        if not (self._num_edges_ > 0):
            raise zserio.PythonRuntimeException("Constraint violated for field ClippingEdgeList.numEdges!")
        zserio_context.num_edges.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_edges_)

        # check array length
        if len(self._edges_) != (self._num_edges_):
            raise zserio.PythonRuntimeException("Wrong array length for field ClippingEdgeList.edges: "
                                                f"{len(self._edges_)} != {self._num_edges_}!")
        self._edges_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._shift_ = zserio.array.DeltaContext()
            self._num_edges_ = zserio.array.DeltaContext()

        @property
        def shift(self):
            return self._shift_

        @property
        def num_edges(self):
            return self._num_edges_

    class _ZserioElementFactory_edges:
        IS_OBJECT_PACKABLE = True

        def __init__(self, owner):
            self._owner = owner

        def create(self, zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.clipping_edge.ClippingEdge:
            del zserio_index
            return nds.display.types.clipping_edge.ClippingEdge.from_reader(zserio_reader, self._owner._shift_)

        @staticmethod
        def create_packing_context() -> nds.display.types.clipping_edge.ClippingEdge.ZserioPackingContext:
            return nds.display.types.clipping_edge.ClippingEdge.ZserioPackingContext()

        def create_packed(self, zserio_context: nds.display.types.clipping_edge.ClippingEdge.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.display.types.clipping_edge.ClippingEdge:
            del zserio_index
            return nds.display.types.clipping_edge.ClippingEdge.from_reader_packed(zserio_context, zserio_reader, self._owner._shift_)
