# Automatically generated by Zserio Python extension version 2.12.0.
# Generator setup: writerCode, pubsubCode, serviceCode, sqlCode

from __future__ import annotations

import typing
import zserio

import nds.core.types.empty
import nds.search.services.geocoding_address
import nds.search.services.geocoding_position
import nds.search.services.geocoding_service_capabilities
import nds.system.types.module_definition
import nds.system.types.nds_system_token

class GeocodingService:
    class Service(zserio.ServiceInterface):
        def __init__(self) -> None:
            self._method_map = {
                self._METHOD_NAMES[0]: self._get_service_module_definition_method,
                self._METHOD_NAMES[1]: self._get_service_node_system_reference_method,
                self._METHOD_NAMES[2]: self._get_geocoding_service_capabilities_method,
                self._METHOD_NAMES[3]: self._geocode_method,
                self._METHOD_NAMES[4]: self._reverse_geocode_method
            }

        def call_method(self, method_name: str, request_data: bytes, context: typing.Any = None) -> zserio.ServiceData:
            method = self._method_map.get(method_name)
            if not method:
                raise zserio.ServiceException(f"nds.search.services.GeocodingService: Method '{method_name}' does not exist!")

            return method(request_data, context)

        @property
        def service_full_name(self) -> str:
            return self._SERVICE_FULL_NAME

        @property
        def method_names(self) -> typing.List:
            return self._METHOD_NAMES

        def _get_service_module_definition_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.module_definition.ModuleDefinition:
            raise NotImplementedError()

        def _get_service_node_system_reference_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.nds_system_token.NdsSystemToken:
            raise NotImplementedError()

        def _get_geocoding_service_capabilities_impl(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.search.services.geocoding_service_capabilities.GeocodingServiceCapabilities:
            raise NotImplementedError()

        def _geocode_impl(self, request: nds.search.services.geocoding_address.GeocodingAddress, context: typing.Any = None) -> nds.search.services.geocoding_position.GeocodingPosition:
            raise NotImplementedError()

        def _reverse_geocode_impl(self, request: nds.search.services.geocoding_position.GeocodingPosition, context: typing.Any = None) -> nds.search.services.geocoding_address.GeocodingAddress:
            raise NotImplementedError()

        def _get_service_module_definition_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_service_module_definition_impl(request, context))

        def _get_service_node_system_reference_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_service_node_system_reference_impl(request, context))

        def _get_geocoding_service_capabilities_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.core.types.empty.Empty.from_reader(reader)

            return zserio.service.ObjectServiceData(self._get_geocoding_service_capabilities_impl(request, context))

        def _geocode_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.search.services.geocoding_address.GeocodingAddress.from_reader(reader)

            return zserio.service.ObjectServiceData(self._geocode_impl(request, context))

        def _reverse_geocode_method(self, request_data: bytes, context: typing.Any) -> zserio.ServiceData:
            reader = zserio.BitStreamReader(request_data)
            request = nds.search.services.geocoding_position.GeocodingPosition.from_reader(reader)

            return zserio.service.ObjectServiceData(self._reverse_geocode_impl(request, context))

        _SERVICE_FULL_NAME = "nds.search.services.GeocodingService"
        _METHOD_NAMES = [
            "getServiceModuleDefinition",
            "getServiceNodeSystemReference",
            "getGeocodingServiceCapabilities",
            "geocode",
            "reverseGeocode"
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

        def get_service_node_system_reference(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.system.types.nds_system_token.NdsSystemToken:
            response_data = self._service_client.call_method("getServiceNodeSystemReference",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.system.types.nds_system_token.NdsSystemToken.from_reader(reader)

            return response

        def get_geocoding_service_capabilities(self, request: nds.core.types.empty.Empty, context: typing.Any = None) -> nds.search.services.geocoding_service_capabilities.GeocodingServiceCapabilities:
            response_data = self._service_client.call_method("getGeocodingServiceCapabilities",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.search.services.geocoding_service_capabilities.GeocodingServiceCapabilities.from_reader(reader)

            return response

        def geocode(self, request: nds.search.services.geocoding_address.GeocodingAddress, context: typing.Any = None) -> nds.search.services.geocoding_position.GeocodingPosition:
            response_data = self._service_client.call_method("geocode",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.search.services.geocoding_position.GeocodingPosition.from_reader(reader)

            return response

        def reverse_geocode(self, request: nds.search.services.geocoding_position.GeocodingPosition, context: typing.Any = None) -> nds.search.services.geocoding_address.GeocodingAddress:
            response_data = self._service_client.call_method("reverseGeocode",
                                                             zserio.service.ObjectServiceData(request), context)
            reader = zserio.BitStreamReader(response_data)
            response = nds.search.services.geocoding_address.GeocodingAddress.from_reader(reader)

            return response
