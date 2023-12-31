# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.smart.metadata.mesh_service_capabilities
import nds.smart.metadata.object_service_capabilities
import nds.smart.metadata.path_horizon_service_capabilities
import nds.smart.metadata.path_service_capabilities
import nds.smart.metadata.tile_service_capabilities
import nds.smart.types.smart_layer_type

class SmartLayerServiceCapabilities:
    def __init__(
            self,
            type_: nds.smart.types.smart_layer_type.SmartLayerType,
            *,
            tile_service_capabilities_: typing.Union[nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities, None] = None,
            object_service_capabilities_: typing.Union[nds.smart.metadata.object_service_capabilities.ObjectServiceCapabilities, None] = None,
            path_service_capabilities_: typing.Union[nds.smart.metadata.path_service_capabilities.PathServiceCapabilities, None] = None,
            mesh_service_capabilities_: typing.Union[nds.smart.metadata.mesh_service_capabilities.MeshServiceCapabilities, None] = None,
            path_horizon_service_capabilities_: typing.Union[nds.smart.metadata.path_horizon_service_capabilities.PathHorizonServiceCapabilities, None] = None) -> None:
        self._type_ = type_
        self._choice: typing.Any = None
        if tile_service_capabilities_ is not None:
            self._choice = tile_service_capabilities_
        if object_service_capabilities_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice SmartLayerServiceCapabilities is ambiguous!")
            self._choice = object_service_capabilities_
        if path_service_capabilities_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice SmartLayerServiceCapabilities is ambiguous!")
            self._choice = path_service_capabilities_
        if mesh_service_capabilities_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice SmartLayerServiceCapabilities is ambiguous!")
            self._choice = mesh_service_capabilities_
        if path_horizon_service_capabilities_ is not None:
            if self._choice != None:
                raise zserio.PythonRuntimeException("Calling constructor of choice SmartLayerServiceCapabilities is ambiguous!")
            self._choice = path_horizon_service_capabilities_

    @classmethod
    def from_reader(
            cls: typing.Type['SmartLayerServiceCapabilities'],
            zserio_reader: zserio.BitStreamReader,
            type_: nds.smart.types.smart_layer_type.SmartLayerType) -> 'SmartLayerServiceCapabilities':
        self = object.__new__(cls)
        self._type_ = type_

        self.read(zserio_reader)

        return self

    @classmethod
    def from_reader_packed(
            cls: typing.Type['SmartLayerServiceCapabilities'],
            zserio_context: SmartLayerServiceCapabilities.ZserioPackingContext,
            zserio_reader: zserio.BitStreamReader,
            type_: nds.smart.types.smart_layer_type.SmartLayerType) -> 'SmartLayerServiceCapabilities':
        self = object.__new__(cls)
        self._type_ = type_

        self.read_packed(zserio_context, zserio_reader)

        return self

    def __eq__(self, other: object) -> bool:
        if isinstance(other, SmartLayerServiceCapabilities):
            return (self._type_ == other._type_ and
                    self._choice == other._choice)

        return False

    def __hash__(self) -> int:
        result = zserio.hashcode.HASH_SEED
        result = zserio.hashcode.calc_hashcode_object(result, self._type_)
        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            result = zserio.hashcode.calc_hashcode_object(result, self._choice)
        else:
            pass

        return result

    @property
    def type(self) -> nds.smart.types.smart_layer_type.SmartLayerType:
        return self._type_

    @property
    def tile_service_capabilities(self) -> typing.Union[nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities, None]:
        return self._choice

    @tile_service_capabilities.setter
    def tile_service_capabilities(self, tile_service_capabilities_: typing.Union[nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities, None]) -> None:
        self._choice = tile_service_capabilities_

    @property
    def object_service_capabilities(self) -> typing.Union[nds.smart.metadata.object_service_capabilities.ObjectServiceCapabilities, None]:
        return self._choice

    @object_service_capabilities.setter
    def object_service_capabilities(self, object_service_capabilities_: typing.Union[nds.smart.metadata.object_service_capabilities.ObjectServiceCapabilities, None]) -> None:
        self._choice = object_service_capabilities_

    @property
    def path_service_capabilities(self) -> typing.Union[nds.smart.metadata.path_service_capabilities.PathServiceCapabilities, None]:
        return self._choice

    @path_service_capabilities.setter
    def path_service_capabilities(self, path_service_capabilities_: typing.Union[nds.smart.metadata.path_service_capabilities.PathServiceCapabilities, None]) -> None:
        self._choice = path_service_capabilities_

    @property
    def mesh_service_capabilities(self) -> typing.Union[nds.smart.metadata.mesh_service_capabilities.MeshServiceCapabilities, None]:
        return self._choice

    @mesh_service_capabilities.setter
    def mesh_service_capabilities(self, mesh_service_capabilities_: typing.Union[nds.smart.metadata.mesh_service_capabilities.MeshServiceCapabilities, None]) -> None:
        self._choice = mesh_service_capabilities_

    @property
    def path_horizon_service_capabilities(self) -> typing.Union[nds.smart.metadata.path_horizon_service_capabilities.PathHorizonServiceCapabilities, None]:
        return self._choice

    @path_horizon_service_capabilities.setter
    def path_horizon_service_capabilities(self, path_horizon_service_capabilities_: typing.Union[nds.smart.metadata.path_horizon_service_capabilities.PathHorizonServiceCapabilities, None]) -> None:
        self._choice = path_horizon_service_capabilities_

    @property
    def choice_tag(self) -> int:
        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            return self.CHOICE_TILE_SERVICE_CAPABILITIES
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            return self.CHOICE_OBJECT_SERVICE_CAPABILITIES
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            return self.CHOICE_PATH_SERVICE_CAPABILITIES
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            return self.CHOICE_MESH_SERVICE_CAPABILITIES
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            return self.CHOICE_PATH_HORIZON_SERVICE_CAPABILITIES
        else:
            return self.UNDEFINED_CHOICE

    def init_packing_context(self, zserio_context: SmartLayerServiceCapabilities.ZserioPackingContext) -> None:
        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            self._choice.init_packing_context(zserio_context.tile_service_capabilities)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            self._choice.init_packing_context(zserio_context.object_service_capabilities)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            self._choice.init_packing_context(zserio_context.path_service_capabilities)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            self._choice.init_packing_context(zserio_context.mesh_service_capabilities)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            self._choice.init_packing_context(zserio_context.path_horizon_service_capabilities)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

    def bitsizeof(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            end_bitposition += self._choice.bitsizeof(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

        return end_bitposition - bitposition

    def bitsizeof_packed(self, zserio_context: SmartLayerServiceCapabilities.ZserioPackingContext,
                         bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.tile_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.object_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.path_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.mesh_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            end_bitposition += self._choice.bitsizeof_packed(zserio_context.path_horizon_service_capabilities, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

        return end_bitposition - bitposition

    def initialize_offsets(self, bitposition: int = 0) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            end_bitposition = self._choice.initialize_offsets(end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

        return end_bitposition

    def initialize_offsets_packed(self, zserio_context: SmartLayerServiceCapabilities.ZserioPackingContext,
                                  bitposition: int) -> int:
        end_bitposition = bitposition

        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.tile_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.object_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.path_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.mesh_service_capabilities, end_bitposition)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            end_bitposition = self._choice.initialize_offsets_packed(zserio_context.path_horizon_service_capabilities, end_bitposition)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

        return end_bitposition

    def read(self, zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            self._choice = nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities.from_reader(zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            self._choice = nds.smart.metadata.object_service_capabilities.ObjectServiceCapabilities.from_reader(zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            self._choice = nds.smart.metadata.path_service_capabilities.PathServiceCapabilities.from_reader(zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            self._choice = nds.smart.metadata.mesh_service_capabilities.MeshServiceCapabilities.from_reader(zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            self._choice = nds.smart.metadata.path_horizon_service_capabilities.PathHorizonServiceCapabilities.from_reader(zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

    def read_packed(self, zserio_context: SmartLayerServiceCapabilities.ZserioPackingContext,
                    zserio_reader: zserio.BitStreamReader) -> None:
        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            self._choice = nds.smart.metadata.tile_service_capabilities.TileServiceCapabilities.from_reader_packed(zserio_context.tile_service_capabilities, zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            self._choice = nds.smart.metadata.object_service_capabilities.ObjectServiceCapabilities.from_reader_packed(zserio_context.object_service_capabilities, zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            self._choice = nds.smart.metadata.path_service_capabilities.PathServiceCapabilities.from_reader_packed(zserio_context.path_service_capabilities, zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            self._choice = nds.smart.metadata.mesh_service_capabilities.MeshServiceCapabilities.from_reader_packed(zserio_context.mesh_service_capabilities, zserio_reader)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            self._choice = nds.smart.metadata.path_horizon_service_capabilities.PathHorizonServiceCapabilities.from_reader_packed(zserio_context.path_horizon_service_capabilities, zserio_reader)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

    def write(self, zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            self._choice.write(zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            self._choice.write(zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            self._choice.write(zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            self._choice.write(zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            self._choice.write(zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

    def write_packed(self, zserio_context: SmartLayerServiceCapabilities.ZserioPackingContext,
                     zserio_writer: zserio.BitStreamWriter) -> None:
        selector = self._type_

        if selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_TILE):
            self._choice.write_packed(zserio_context.tile_service_capabilities, zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_OBJECT):
            self._choice.write_packed(zserio_context.object_service_capabilities, zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH):
            self._choice.write_packed(zserio_context.path_service_capabilities, zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_MESH):
            self._choice.write_packed(zserio_context.mesh_service_capabilities, zserio_writer)
        elif selector == (nds.smart.types.smart_layer_type.SmartLayerType.SMART_LAYER_PATH_HORIZON):
            self._choice.write_packed(zserio_context.path_horizon_service_capabilities, zserio_writer)
        else:
            raise zserio.PythonRuntimeException("No match in choice SmartLayerServiceCapabilities!")

    class ZserioPackingContext:
        def __init__(self):
            self._tile_service_capabilities_ = zserio.array.DeltaContext()
            self._object_service_capabilities_ = zserio.array.DeltaContext()
            self._path_service_capabilities_ = zserio.array.DeltaContext()
            self._mesh_service_capabilities_ = zserio.array.DeltaContext()
            self._path_horizon_service_capabilities_ = zserio.array.DeltaContext()

        @property
        def tile_service_capabilities(self):
            return self._tile_service_capabilities_

        @property
        def object_service_capabilities(self):
            return self._object_service_capabilities_

        @property
        def path_service_capabilities(self):
            return self._path_service_capabilities_

        @property
        def mesh_service_capabilities(self):
            return self._mesh_service_capabilities_

        @property
        def path_horizon_service_capabilities(self):
            return self._path_horizon_service_capabilities_

    CHOICE_TILE_SERVICE_CAPABILITIES = 0
    CHOICE_OBJECT_SERVICE_CAPABILITIES = 1
    CHOICE_PATH_SERVICE_CAPABILITIES = 2
    CHOICE_MESH_SERVICE_CAPABILITIES = 3
    CHOICE_PATH_HORIZON_SERVICE_CAPABILITIES = 4
    UNDEFINED_CHOICE = -1
