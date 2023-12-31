# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.empty
import nds.core.types.tile_id
import nds.smart.mesh.smart_layer_mesh
import nds.smart.mesh.smart_mesh_id
import nds.smart.mesh.smart_mesh_index
import nds.smart.metadata.mesh_service_capabilities_response
import nds.smart.metadata.smart_layer_definition
import nds.system.types.module_definition
import nds.system.types.nds_node_legal_info
import nds.system.types.nds_system_token

class SmartLayerMeshService:
    class Service(zserio.ServiceInterface):
        def __init__(self) -> None:
            self._method_map = {
                self._METHOD_NAMES[0]: self._get_service_module_definition_method,
                self._METHOD_NAMES[1]: self._get_service_definition_method,
                self._METHOD_NAMES[2]: self._get_service_node_system_reference_method,
                self._METHOD_NAMES[3]: self._get_service_node_legal_info_method,
                self._METHOD_NAMES[4]: self._get_mesh_service_capabilities_method,
                self._METHOD_NAMES[5]: self._get_mesh_index_by_tile_id_method,
                self._METHOD_NAMES[6]: self._get_mesh_by_id_method
            }

        def call_method(self, method_name: str, request_data: bytes, context: typing.Any = None) -> zserio.ServiceData:
            method = self._method_map.get(method_name)
            if not method:
                raise zserio.ServiceException(f"nds.smart.services.SmartLayerMeshService: Method '{method_name}' does not exist!")

            return method(request_data, context)

        @property
        def service_full_name(self) -> str:
            return self._SERVICE_FULL_NAME

        @property
        def method_names(self) -> typing.List:
            return self._METHOD_NAMES

        def _get_service_module_definition_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.module_definition.ModuleDefinition:
            raise NotImplementedError()

        def _get_service_definition_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.smart.metadata.smart_layer_definition.SmartLayerDefinition:
            raise NotImplementedError()

        def _get_service_node_system_reference_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.nds_system_token.NdsSystemToken:
            raise NotImplementedError()

        def _get_service_node_legal_info_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.nds_node_legal_info.NdsNodeLegalInfo:
            raise NotImplementedError()

        def _get_mesh_service_capabilities_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.smart.metadata.mesh_service_capabilities_response.MeshServiceCapabilitiesResponse:
            raise NotImplementedError()

        def _get_mesh_index_by_tile_id_impl(self, request: nds.core.types.tile_id.TileId, context: typing.Any = None) -> nds.smart.mesh.smart_mesh_index.SmartMeshIndex:
            raise NotImplementedError()

        def _get_mesh_by_id_impl(self, request: nds.smart.mesh.smart_mesh_id.SmartMeshId, context: typing.Any = None) -> nds.smart.mesh.smart_layer_mesh.SmartLayerMesh:
            raise NotImplementedError()

        def _get_service_module_definition_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_service_module_definition_impl(request, context))

        def _get_service_definition_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_service_definition_impl(request, context))

        def _get_service_node_system_reference_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_service_node_system_reference_impl(request, context))

        def _get_service_node_legal_info_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_service_node_legal_info_impl(request, context))

        def _get_mesh_service_capabilities_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_mesh_service_capabilities_impl(request, context))

        def _get_mesh_index_by_tile_id_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.tile_id.TileId.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_mesh_index_by_tile_id_impl(request, context))

        def _get_mesh_by_id_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.smart.mesh.smart_mesh_id.SmartMeshId.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_mesh_by_id_impl(request, context))

        _SERVICE_FULL_NAME = "nds.smart.services.SmartLayerMeshService"
        _METHOD_NAMES = [
            "getServiceModuleDefinition",
            "getServiceDefinition",
            "getServiceNodeSystemReference",
            "getServiceNodeLegalInfo",
            "getMeshServiceCapabilities",
            "getMeshIndexByTileId",
            "getMeshById"
        ]

    class Client:
        def __init__(self, service_client: zserio.ServiceClientInterface) -> None:
            self._service_client = service_client

        def get_service_module_definition(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.module_definition.ModuleDefinition:
            response_data = self._service_client.call_method("getServiceModuleDefinition",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.system.types.module_definition.ModuleDefinition.from_reader(reader)

            return response

        def get_service_definition(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.smart.metadata.smart_layer_definition.SmartLayerDefinition:
            response_data = self._service_client.call_method("getServiceDefinition",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.smart.metadata.smart_layer_definition.SmartLayerDefinition.from_reader(reader)

            return response

        def get_service_node_system_reference(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.nds_system_token.NdsSystemToken:
            response_data = self._service_client.call_method("getServiceNodeSystemReference",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.system.types.nds_system_token.NdsSystemToken.from_reader(reader)

            return response

        def get_service_node_legal_info(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.nds_node_legal_info.NdsNodeLegalInfo:
            response_data = self._service_client.call_method("getServiceNodeLegalInfo",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.system.types.nds_node_legal_info.NdsNodeLegalInfo.from_reader(reader)

            return response

        def get_mesh_service_capabilities(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.smart.metadata.mesh_service_capabilities_response.MeshServiceCapabilitiesResponse:
            response_data = self._service_client.call_method("getMeshServiceCapabilities",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.smart.metadata.mesh_service_capabilities_response.MeshServiceCapabilitiesResponse.from_reader(reader)

            return response

        def get_mesh_index_by_tile_id(self, request: nds.core.types.tile_id.TileId, context: typing.Any = None) -> nds.smart.mesh.smart_mesh_index.SmartMeshIndex:
            response_data = self._service_client.call_method("getMeshIndexByTileId",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.smart.mesh.smart_mesh_index.SmartMeshIndex.from_reader(reader)

            return response

        def get_mesh_by_id(self, request: nds.smart.mesh.smart_mesh_id.SmartMeshId, context: typing.Any = None) -> nds.smart.mesh.smart_layer_mesh.SmartLayerMesh:
            response_data = self._service_client.call_method("getMeshById",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.smart.mesh.smart_layer_mesh.SmartLayerMesh.from_reader(reader)

            return response
