# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.smart.path.smart_layer_path

class SmartLayerPathList:
    def __init__(
            self,
            num_paths_: int = int(),
            path_list_: typing.List[nds.smart.path.smart_layer_path.SmartLayerPath] = None) -> None:
        self._num_paths_ = num_paths_
        self._path_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_path_list()), path_list_)

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerPathList'],
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerPathList':
        self = object.__new__(cls)

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SmartLayerPathList'],
            zserio_context: SmartLayerPathList.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader) -> 'SmartLayerPathList':
        self = object.__new__(cls)

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerPathList):
            return ((self._num_paths_ == other._num_paths_) and
                    (self._path_list_ == other._path_list_))

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_int64(result, self._num_paths_)
        result = zserio.hashcode.calc_hashcode_object(result, self._path_list_)

        return result

    @property
    def num_paths(self) -> int:
        return self._num_paths_

    @num_paths.setter
    def num_paths(self, num_paths_: int) -> None:
        self._num_paths_ = num_paths_

    @property
    def path_list(self) -> typing.List[nds.smart.path.smart_layer_path.SmartLayerPath]:
        return self._path_list_.raw_array

    @path_list.setter
    def path_list(self, path_list_: typing.List[nds.smart.path.smart_layer_path.SmartLayerPath]) -> None:
        self._path_list_ = zserio.array.Array(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_path_list()), path_list_)

    def init_packing_context(self, zserio_context: SmartLayerPathList.ZserioPackingContext) -> None:
        zserio_context.num_paths.init(zserio.array.VarSizeArrayTraits(), self._num_paths_)

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_paths_)
        end_bitposition += self._path_list_.bitsizeof(end_bitposition)

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SmartLayerPathList.ZserioPackingContext, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_paths.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_paths_)
        end_bitposition += self._path_list_.bitsizeof_packed(end_bitposition)

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio.bitsizeof.bitsizeof_varsize(self._num_paths_)
        end_bitposition = self._path_list_.initialize_offsets(end_bitposition)

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SmartLayerPathList.ZserioPackingContext, bitposition: int) -> int:
        end_bitposition = bitposition
        end_bitposition += zserio_context.num_paths.bitsizeof(zserio.array.VarSizeArrayTraits(), self._num_paths_)
        end_bitposition = self._path_list_.initialize_offsets_packed(end_bitposition)

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_paths_ = zserio_reader.read_varsize()
        self._path_list_ = zserio.array.Array.from_reader(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_path_list()), zserio_reader, self._num_paths_)

    def read_packed(self, zserio_context: SmartLayerPathList.ZserioPackingContext, zserio_reader: zserio.BitStreamReader) -> None:
        self._num_paths_ = zserio_context.num_paths.read(zserio.array.VarSizeArrayTraits(), zserio_reader)

        self._path_list_ = zserio.array.Array.from_reader_packed(zserio.array.ObjectArrayTraits(self._ZserioElementFactory_path_list()), zserio_reader, self._num_paths_)

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_writer.write_varsize(self._num_paths_)

        # check array length
        if len(self._path_list_) != (self._num_paths_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerPathList.pathList: "
                                                f"{len(self._path_list_)} != {self._num_paths_}!")
        self._path_list_.write(zserio_writer)

    def write_packed(self, zserio_context: SmartLayerPathList.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        zserio_context.num_paths.write(zserio.array.VarSizeArrayTraits(), zserio_writer, self._num_paths_)

        # check array length
        if len(self._path_list_) != (self._num_paths_):
            raise zserio.PythonRuntimeException("Wrong array length for field SmartLayerPathList.pathList: "
                                                f"{len(self._path_list_)} != {self._num_paths_}!")
        self._path_list_.write_packed(zserio_writer)

    class ZserioPackingContext:
        def __init__(self):
            self._num_paths_ = zserio.array.DeltaContext()

        @property
        def num_paths(self):
            return self._num_paths_

    class _ZserioElementFactory_path_list:
        IS_OBJECT_PACKABLE = True

        @staticmethod
        def create(zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.path.smart_layer_path.SmartLayerPath:
            del zserio_index
            return nds.smart.path.smart_layer_path.SmartLayerPath.from_reader(zserio_reader)

        @staticmethod
        def create_packing_context() -> nds.smart.path.smart_layer_path.SmartLayerPath.ZserioPackingContext:
            return nds.smart.path.smart_layer_path.SmartLayerPath.ZserioPackingContext()

        @staticmethod
        def create_packed(zserio_context: nds.smart.path.smart_layer_path.SmartLayerPath.ZserioPackingContext,
                          zserio_reader: zserio.BitStreamReader, zserio_index: int) -> nds.smart.path.smart_layer_path.SmartLayerPath:
            del zserio_index
            return nds.smart.path.smart_layer_path.SmartLayerPath.from_reader_packed(zserio_context, zserio_reader)
