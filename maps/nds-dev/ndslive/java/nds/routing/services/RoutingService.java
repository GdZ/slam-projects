/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.routing.services;

public final class RoutingService
{
    public static abstract class RoutingServiceService implements zserio.runtime.service.ServiceInterface
    {
        public RoutingServiceService()
        {
            methodMap = new java.util.HashMap<java.lang.String, Method>();
            methodMap.put(getServiceModuleDefinition_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getServiceModuleDefinitionMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getServiceNodeSystemReference_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getServiceNodeSystemReferenceMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getRouteServiceCapabilities_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getRouteServiceCapabilitiesMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getServiceNodeLegalInfo_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getServiceNodeLegalInfoMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getRoute_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getRouteMethod(requestData, context);
                    }
                }
            );
        }

        @Override
        public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> callMethod(
                java.lang.String methodName, byte[] requestData, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final Method method = methodMap.get(methodName);
            if (method == null)
            {
                throw new zserio.runtime.service.ServiceException(
                        "nds.routing.services.RoutingService: Method '" + methodName + "' does not exist!");
            }
            return method.invoke(requestData, context);
        }

        public static java.lang.String serviceFullName()
        {
            return SERVICE_FULL_NAME;
        }

        public static java.lang.String[] methodNames()
        {
            return new java.lang.String[]
            {
                getServiceModuleDefinition_METHOD_NAME,
                getServiceNodeSystemReference_METHOD_NAME,
                getRouteServiceCapabilities_METHOD_NAME,
                getServiceNodeLegalInfo_METHOD_NAME,
                getRoute_METHOD_NAME
            };
        }

        protected abstract nds.system.types.ModuleDefinition getServiceModuleDefinitionImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsSystemToken getServiceNodeSystemReferenceImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.routing.metadata.RouteServiceCapabilities getRouteServiceCapabilitiesImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.routing.services.RoutingServiceResponse getRouteImpl(
                nds.routing.services.RoutingServiceRequest request, java.lang.Object context);

        private zserio.runtime.service.ObjectServiceData<nds.system.types.ModuleDefinition> getServiceModuleDefinitionMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.system.types.ModuleDefinition response = getServiceModuleDefinitionImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.system.types.NdsSystemToken> getServiceNodeSystemReferenceMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.system.types.NdsSystemToken response = getServiceNodeSystemReferenceImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.routing.metadata.RouteServiceCapabilities> getRouteServiceCapabilitiesMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.routing.metadata.RouteServiceCapabilities response = getRouteServiceCapabilitiesImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.system.types.NdsNodeLegalInfo> getServiceNodeLegalInfoMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.system.types.NdsNodeLegalInfo response = getServiceNodeLegalInfoImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.routing.services.RoutingServiceResponse> getRouteMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.routing.services.RoutingServiceRequest request =
                        new nds.routing.services.RoutingServiceRequest(reader);
                final nds.routing.services.RoutingServiceResponse response = getRouteImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        private interface Method
        {
            public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                    byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError;
        }

        private static final java.lang.String SERVICE_FULL_NAME = "nds.routing.services.RoutingService";

        private final java.util.Map<java.lang.String, Method> methodMap;
    }

    public static final class RoutingServiceClient
    {
        public RoutingServiceClient(zserio.runtime.service.ServiceClientInterface serviceClient)
        {
            this.serviceClient = serviceClient;
        }

        public nds.system.types.ModuleDefinition getServiceModuleDefinitionMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getServiceModuleDefinition_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.system.types.ModuleDefinition response =
                        new nds.system.types.ModuleDefinition(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        public nds.system.types.ModuleDefinition getServiceModuleDefinitionMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceModuleDefinitionMethod(request, null);
        }

        public nds.system.types.NdsSystemToken getServiceNodeSystemReferenceMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getServiceNodeSystemReference_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.system.types.NdsSystemToken response =
                        new nds.system.types.NdsSystemToken(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        public nds.system.types.NdsSystemToken getServiceNodeSystemReferenceMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceNodeSystemReferenceMethod(request, null);
        }

        public nds.routing.metadata.RouteServiceCapabilities getRouteServiceCapabilitiesMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getRouteServiceCapabilities_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.routing.metadata.RouteServiceCapabilities response =
                        new nds.routing.metadata.RouteServiceCapabilities(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        public nds.routing.metadata.RouteServiceCapabilities getRouteServiceCapabilitiesMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getRouteServiceCapabilitiesMethod(request, null);
        }

        public nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getServiceNodeLegalInfo_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.system.types.NdsNodeLegalInfo response =
                        new nds.system.types.NdsNodeLegalInfo(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        public nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceNodeLegalInfoMethod(request, null);
        }

        public nds.routing.services.RoutingServiceResponse getRouteMethod(
                nds.routing.services.RoutingServiceRequest request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getRoute_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.routing.services.RoutingServiceResponse response =
                        new nds.routing.services.RoutingServiceResponse(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("RoutingService: " + exception, exception);
            }
        }

        public nds.routing.services.RoutingServiceResponse getRouteMethod(
                nds.routing.services.RoutingServiceRequest request) throws zserio.runtime.ZserioError
        {
            return getRouteMethod(request, null);
        }

        private final zserio.runtime.service.ServiceClientInterface serviceClient;
    }

    public static final String getServiceModuleDefinition_METHOD_NAME = "getServiceModuleDefinition";
    public static final String getServiceNodeSystemReference_METHOD_NAME = "getServiceNodeSystemReference";
    public static final String getRouteServiceCapabilities_METHOD_NAME = "getRouteServiceCapabilities";
    public static final String getServiceNodeLegalInfo_METHOD_NAME = "getServiceNodeLegalInfo";
    public static final String getRoute_METHOD_NAME = "getRoute";
}
