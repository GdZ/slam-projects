/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.vehicle.services;

public final class VehicleHorizonService
{
    public static abstract class VehicleHorizonServiceService implements zserio.runtime.service.ServiceInterface
    {
        public VehicleHorizonServiceService()
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
            methodMap.put(getHorizonServiceCapabilities_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getHorizonServiceCapabilitiesMethod(requestData, context);
                    }
                }
            );
            methodMap.put(calculateHorizon_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return calculateHorizonMethod(requestData, context);
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
                        "nds.vehicle.services.VehicleHorizonService: Method '" + methodName + "' does not exist!");
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
                getServiceNodeLegalInfo_METHOD_NAME,
                getHorizonServiceCapabilities_METHOD_NAME,
                calculateHorizon_METHOD_NAME
            };
        }

        protected abstract nds.system.types.ModuleDefinition getServiceModuleDefinitionImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsSystemToken getServiceNodeSystemReferenceImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.vehicle.metadata.HorizonServiceCapabilitiesResponse getHorizonServiceCapabilitiesImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.vehicle.types.Horizon calculateHorizonImpl(
                nds.vehicle.services.HorizonRequest request, java.lang.Object context);

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
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.vehicle.metadata.HorizonServiceCapabilitiesResponse> getHorizonServiceCapabilitiesMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.vehicle.metadata.HorizonServiceCapabilitiesResponse response = getHorizonServiceCapabilitiesImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.vehicle.types.Horizon> calculateHorizonMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.vehicle.services.HorizonRequest request =
                        new nds.vehicle.services.HorizonRequest(reader);
                final nds.vehicle.types.Horizon response = calculateHorizonImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
            }
        }

        private interface Method
        {
            public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                    byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError;
        }

        private static final java.lang.String SERVICE_FULL_NAME = "nds.vehicle.services.VehicleHorizonService";

        private final java.util.Map<java.lang.String, Method> methodMap;
    }

    public static final class VehicleHorizonServiceClient
    {
        public VehicleHorizonServiceClient(zserio.runtime.service.ServiceClientInterface serviceClient)
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
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
            }
        }

        public nds.system.types.NdsSystemToken getServiceNodeSystemReferenceMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceNodeSystemReferenceMethod(request, null);
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
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
            }
        }

        public nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceNodeLegalInfoMethod(request, null);
        }

        public nds.vehicle.metadata.HorizonServiceCapabilitiesResponse getHorizonServiceCapabilitiesMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getHorizonServiceCapabilities_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.vehicle.metadata.HorizonServiceCapabilitiesResponse response =
                        new nds.vehicle.metadata.HorizonServiceCapabilitiesResponse(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
            }
        }

        public nds.vehicle.metadata.HorizonServiceCapabilitiesResponse getHorizonServiceCapabilitiesMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getHorizonServiceCapabilitiesMethod(request, null);
        }

        public nds.vehicle.types.Horizon calculateHorizonMethod(
                nds.vehicle.services.HorizonRequest request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(calculateHorizon_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.vehicle.types.Horizon response =
                        new nds.vehicle.types.Horizon(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("VehicleHorizonService: " + exception, exception);
            }
        }

        public nds.vehicle.types.Horizon calculateHorizonMethod(
                nds.vehicle.services.HorizonRequest request) throws zserio.runtime.ZserioError
        {
            return calculateHorizonMethod(request, null);
        }

        private final zserio.runtime.service.ServiceClientInterface serviceClient;
    }

    public static final String getServiceModuleDefinition_METHOD_NAME = "getServiceModuleDefinition";
    public static final String getServiceNodeSystemReference_METHOD_NAME = "getServiceNodeSystemReference";
    public static final String getServiceNodeLegalInfo_METHOD_NAME = "getServiceNodeLegalInfo";
    public static final String getHorizonServiceCapabilities_METHOD_NAME = "getHorizonServiceCapabilities";
    public static final String calculateHorizon_METHOD_NAME = "calculateHorizon";
}
