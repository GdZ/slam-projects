/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.services;

public final class SmartRasterTileService
{
    public static abstract class SmartRasterTileServiceService implements zserio.runtime.service.ServiceInterface
    {
        public SmartRasterTileServiceService()
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
            methodMap.put(getRasterTileServiceCapabilities_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getRasterTileServiceCapabilitiesMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getImage_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getImageMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getTileMetadata_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getTileMetadataMethod(requestData, context);
                    }
                }
            );
            methodMap.put(getImageVersioned_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getImageVersionedMethod(requestData, context);
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
                        "nds.smart.services.SmartRasterTileService: Method '" + methodName + "' does not exist!");
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
                getRasterTileServiceCapabilities_METHOD_NAME,
                getImage_METHOD_NAME,
                getTileMetadata_METHOD_NAME,
                getImageVersioned_METHOD_NAME
            };
        }

        protected abstract nds.system.types.ModuleDefinition getServiceModuleDefinitionImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsSystemToken getServiceNodeSystemReferenceImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.smart.metadata.RasterTileServiceCapabilitiesResponse getRasterTileServiceCapabilitiesImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract byte[] getImageImpl(
                nds.smart.types.RasterTileImageRequest request, java.lang.Object context);

        protected abstract nds.smart.types.RasterTileInfo getTileMetadataImpl(
                nds.core.types.TileId request, java.lang.Object context);

        protected abstract byte[] getImageVersionedImpl(
                nds.smart.types.RasterTileImageVersionRequest request, java.lang.Object context);

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
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.smart.metadata.RasterTileServiceCapabilitiesResponse> getRasterTileServiceCapabilitiesMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.smart.metadata.RasterTileServiceCapabilitiesResponse response = getRasterTileServiceCapabilitiesImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        private zserio.runtime.service.RawServiceData getImageMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.smart.types.RasterTileImageRequest request =
                        new nds.smart.types.RasterTileImageRequest(reader);
                final byte[] response = getImageImpl(request, context);

                return new zserio.runtime.service.RawServiceData(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.smart.types.RasterTileInfo> getTileMetadataMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.TileId request =
                        new nds.core.types.TileId(reader);
                final nds.smart.types.RasterTileInfo response = getTileMetadataImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        private zserio.runtime.service.RawServiceData getImageVersionedMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.smart.types.RasterTileImageVersionRequest request =
                        new nds.smart.types.RasterTileImageVersionRequest(reader);
                final byte[] response = getImageVersionedImpl(request, context);

                return new zserio.runtime.service.RawServiceData(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        private interface Method
        {
            public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                    byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError;
        }

        private static final java.lang.String SERVICE_FULL_NAME = "nds.smart.services.SmartRasterTileService";

        private final java.util.Map<java.lang.String, Method> methodMap;
    }

    public static final class SmartRasterTileServiceClient
    {
        public SmartRasterTileServiceClient(zserio.runtime.service.ServiceClientInterface serviceClient)
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
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        public nds.system.types.NdsNodeLegalInfo getServiceNodeLegalInfoMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceNodeLegalInfoMethod(request, null);
        }

        public nds.smart.metadata.RasterTileServiceCapabilitiesResponse getRasterTileServiceCapabilitiesMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getRasterTileServiceCapabilities_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.smart.metadata.RasterTileServiceCapabilitiesResponse response =
                        new nds.smart.metadata.RasterTileServiceCapabilitiesResponse(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        public nds.smart.metadata.RasterTileServiceCapabilitiesResponse getRasterTileServiceCapabilitiesMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getRasterTileServiceCapabilitiesMethod(request, null);
        }

        public byte[] getImageMethod(
                nds.smart.types.RasterTileImageRequest request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getImage_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            return responseData;
        }

        public byte[] getImageMethod(
                nds.smart.types.RasterTileImageRequest request) throws zserio.runtime.ZserioError
        {
            return getImageMethod(request, null);
        }

        public nds.smart.types.RasterTileInfo getTileMetadataMethod(
                nds.core.types.TileId request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getTileMetadata_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.smart.types.RasterTileInfo response =
                        new nds.smart.types.RasterTileInfo(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("SmartRasterTileService: " + exception, exception);
            }
        }

        public nds.smart.types.RasterTileInfo getTileMetadataMethod(
                nds.core.types.TileId request) throws zserio.runtime.ZserioError
        {
            return getTileMetadataMethod(request, null);
        }

        public byte[] getImageVersionedMethod(
                nds.smart.types.RasterTileImageVersionRequest request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getImageVersioned_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            return responseData;
        }

        public byte[] getImageVersionedMethod(
                nds.smart.types.RasterTileImageVersionRequest request) throws zserio.runtime.ZserioError
        {
            return getImageVersionedMethod(request, null);
        }

        private final zserio.runtime.service.ServiceClientInterface serviceClient;
    }

    public static final String getServiceModuleDefinition_METHOD_NAME = "getServiceModuleDefinition";
    public static final String getServiceNodeSystemReference_METHOD_NAME = "getServiceNodeSystemReference";
    public static final String getServiceNodeLegalInfo_METHOD_NAME = "getServiceNodeLegalInfo";
    public static final String getRasterTileServiceCapabilities_METHOD_NAME = "getRasterTileServiceCapabilities";
    public static final String getImage_METHOD_NAME = "getImage";
    public static final String getTileMetadata_METHOD_NAME = "getTileMetadata";
    public static final String getImageVersioned_METHOD_NAME = "getImageVersioned";
}