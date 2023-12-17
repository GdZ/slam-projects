/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.services;

public final class SmartLayerPathHorizonService
{
    public static abstract class SmartLayerPathHorizonServiceService implements zserio.runtime.service.ServiceInterface
    {
        public SmartLayerPathHorizonServiceService()
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
            methodMap.put(getServiceDefinition_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getServiceDefinitionMethod(requestData, context);
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
            methodMap.put(getPathHorizonServiceCapabilities_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getPathHorizonServiceCapabilitiesMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getHorizonDataForPath_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getHorizonDataForPathMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getHorizonDataForPose_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getHorizonDataForPoseMethod(requestData, context);
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
                        "nds.smart.services.SmartLayerPathHorizonService: Method '" + methodName + "' does not exist!");
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
                getServiceDefinition_METHOD_NAME,
                getServiceNodeSystemReference_METHOD_NAME,
                getServiceNodeLegalInfo_METHOD_NAME,
                getPathHorizonServiceCapabilities_METHOD_NAME,
                getHorizonDataForPath_METHOD_NAME,
                getHorizonDataForPose_METHOD_NAME
            };
        }

        protected abstract nds.system.types.ModuleDefinition getServiceModuleDefinitionImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.smart.metadata.SmartLayerDefinition getServiceDefinitionImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsSystemToken getServiceNodeSystemReferenceImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.smart.metadata.PathHorizonServiceCapabilitiesResponse getPathHorizonServiceCapabilitiesImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.smart.path.SmartLayerPath getHorizonDataForPathImpl(
                nds.core.location.RoadLocationPath request, java.lang.Object context);

        protected abstract nds.smart.path.SmartLayerPath getHorizonDataForPoseImpl(
                nds.smart.path.SmartLayerPosePathRequest request, java.lang.Object context);

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
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.smart.metadata.SmartLayerDefinition> getServiceDefinitionMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.smart.metadata.SmartLayerDefinition response = getServiceDefinitionImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.smart.metadata.PathHorizonServiceCapabilitiesResponse> getPathHorizonServiceCapabilitiesMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.smart.metadata.PathHorizonServiceCapabilitiesResponse response = getPathHorizonServiceCapabilitiesImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.smart.path.SmartLayerPath> getHorizonDataForPathMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.location.RoadLocationPath request =
                        new nds.core.location.RoadLocationPath(reader);
                final nds.smart.path.SmartLayerPath response = getHorizonDataForPathImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.smart.path.SmartLayerPath> getHorizonDataForPoseMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.smart.path.SmartLayerPosePathRequest request =
                        new nds.smart.path.SmartLayerPosePathRequest(reader);
                final nds.smart.path.SmartLayerPath response = getHorizonDataForPoseImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        private interface Method
        {
            public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                    byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError;
        }

        private static final java.lang.String SERVICE_FULL_NAME = "nds.smart.services.SmartLayerPathHorizonService";

        private final java.util.Map<java.lang.String, Method> methodMap;
    }

    public static final class SmartLayerPathHorizonServiceClient
    {
        public SmartLayerPathHorizonServiceClient(zserio.runtime.service.ServiceClientInterface serviceClient)
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
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        public nds.system.types.ModuleDefinition getServiceModuleDefinitionMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceModuleDefinitionMethod(request, null);
        }

        public nds.smart.metadata.SmartLayerDefinition getServiceDefinitionMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getServiceDefinition_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.smart.metadata.SmartLayerDefinition response =
                        new nds.smart.metadata.SmartLayerDefinition(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        public nds.smart.metadata.SmartLayerDefinition getServiceDefinitionMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceDefinitionMethod(request, null);
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
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        public nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceNodeLegalInfoMethod(request, null);
        }

        public nds.smart.metadata.PathHorizonServiceCapabilitiesResponse getPathHorizonServiceCapabilitiesMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getPathHorizonServiceCapabilities_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.smart.metadata.PathHorizonServiceCapabilitiesResponse response =
                        new nds.smart.metadata.PathHorizonServiceCapabilitiesResponse(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        public nds.smart.metadata.PathHorizonServiceCapabilitiesResponse getPathHorizonServiceCapabilitiesMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getPathHorizonServiceCapabilitiesMethod(request, null);
        }

        public nds.smart.path.SmartLayerPath getHorizonDataForPathMethod(
                nds.core.location.RoadLocationPath request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getHorizonDataForPath_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.smart.path.SmartLayerPath response =
                        new nds.smart.path.SmartLayerPath(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        public nds.smart.path.SmartLayerPath getHorizonDataForPathMethod(
                nds.core.location.RoadLocationPath request) throws zserio.runtime.ZserioError
        {
            return getHorizonDataForPathMethod(request, null);
        }

        public nds.smart.path.SmartLayerPath getHorizonDataForPoseMethod(
                nds.smart.path.SmartLayerPosePathRequest request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getHorizonDataForPose_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.smart.path.SmartLayerPath response =
                        new nds.smart.path.SmartLayerPath(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartLayerPathHorizonService: " + exception, exception);
            }
        }

        public nds.smart.path.SmartLayerPath getHorizonDataForPoseMethod(
                nds.smart.path.SmartLayerPosePathRequest request) throws zserio.runtime.ZserioError
        {
            return getHorizonDataForPoseMethod(request, null);
        }

        private final zserio.runtime.service.ServiceClientInterface serviceClient;
    }

    public static final String getServiceModuleDefinition_METHOD_NAME = "getServiceModuleDefinition";
    public static final String getServiceDefinition_METHOD_NAME = "getServiceDefinition";
    public static final String getServiceNodeSystemReference_METHOD_NAME = "getServiceNodeSystemReference";
    public static final String getServiceNodeLegalInfo_METHOD_NAME = "getServiceNodeLegalInfo";
    public static final String getPathHorizonServiceCapabilities_METHOD_NAME = "getPathHorizonServiceCapabilities";
    public static final String getHorizonDataForPath_METHOD_NAME = "getHorizonDataForPath";
    public static final String getHorizonDataForPose_METHOD_NAME = "getHorizonDataForPose";
}