# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.registry.node.node_information

class NodeList:
    def __init__(
            self,
            num_nodes_: int = int(),
            nodes_: typing.List[nds.registry.node.node_information.NodeInformation] = None) -> None:
        self._num_nodes_ = num_nodes_
        self._nodes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_nodes()), nodes_)

    @classmethod
    def from_reader(
            cls: typing.Type['NodeList'],
            zserio_reader: zserio.BitStreamReader) -> 'NodeList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['NodeList'],
            zserio_context: NodeList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'NodeList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, NodeList):
            return ((self._num_nodes_ == other._num_nodes_) and
                    (self._nodes_ == other._nodes_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_nodes_)
        result = zserio.hashcode.calc_hashcode_object(result, self._nodes_)

        return result

    @property
    def num_nodes(self) -> int:
        return self._num_nodes_

    @num_nodes.setter
    def num_nodes(self, num_nodes_: int) -> None:
        self._num_nodes_ = num_nodes_

    @property
    def nodes(self) -> typing.List[nds.registry.node.node_information.NodeInformation]:
        return self._nodes_.raw_array

    @nodes.setter
    def nodes(self, nodes_: typing.List[nds.registry.node.node_information.NodeInformation]) -> None:
        self._nodes_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_nodes()), nodes_)

    def init_packing_context(self, zserio_context: NodeList.ZserioPackingContext) -> None:
        zserio_context.num_nodes.init(zserio.array.VarUIntArrayTraits(), self._num_nodes_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._num_nodes_)
        end_bitposition += self._nodes_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: NodeList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_nodes.bitsizeof(zserio.array.VarUIntArrayTraits(), self._num_nodes_)
        end_bitposition += self._nodes_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varuint(self._num_nodes_)
        end_bitposition = self._nodes_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: NodeList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_nodes.bitsizeof(zserio.array.VarUIntArrayTraits(), self._num_nodes_)
        end_bitposition = self._nodes_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_nodes_ = zserio_reader.read_varuint()
        self._nodes_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_nodes()), zserio_reader, self._num_nodes_)

    def read_packed(self, zserio_context: NodeList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_nodes_ = zserio_context.num_nodes.read(zserio.array.VarUIntArrayTraits(), zserio_reader)

        self._nodes_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_nodes()), zserio_reader, self._num_nodes_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varuint(self._num_nodes_)

        # check array length
        if len(self._nodes_) != (self._num_nodes_):
            raise zserio.PythonRuntimeException("Wrong array length for field NodeList.nodes: "
                                                f"{len(self._nodes_)} != {self._num_nodes_}!")
        self._nodes_.write(zserio_writer)

    def write_packed(self, zserio_context: NodeList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_nodes.write(zserio.array.VarUIntArrayTraits(), zserio_writer, self._num_nodes_)

        # check array length
        if len(self._nodes_) != (self._num_nodes_):
            raise zserio.PythonRuntimeException("Wrong array length for field NodeList.nodes: "
                                                f"{len(self._nodes_)} != {self._num_nodes_}!")
        self._nodes_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_nodes_ = zserio.array.DeltaContext()

        @property
        def num_nodes(self):
            return self._num_nodes_

    class _ZserioElementFactory_nodes:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.registry.node.node_information.NodeInformation:
            del zserio_index
            return nds.registry.node.node_information.NodeInformation.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.registry.node.node_information.NodeInformation.ZserioPackingContext:
            return nds.registry.node.node_information.NodeInformation.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.registry.node.node_information.NodeInformation.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.registry.node.node_information.NodeInformation:
            del zserio_index
            return nds.registry.node.node_information.NodeInformation.from_reader_packed(zserio_context, zserio_reader)
