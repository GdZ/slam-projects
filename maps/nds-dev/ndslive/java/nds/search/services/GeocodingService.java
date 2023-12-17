/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.search.services;

public final class GeocodingService
{
    public static abstract class GeocodingServiceService implements zserio.runtime.service.ServiceInterface
    {
        public GeocodingServiceService()
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
            methodMap.put(getGeocodingServiceCapabilities_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return getGeocodingServiceCapabilitiesMethod(requestData, context);
                    }
                }
            );
            methodMap.put(geocode_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return geocodeMethod(requestData, context);
                    }
                }
            );
            methodMap.put(reverseGeocode_METHOD_NAME,
                new Method()
                {
                    @Override
                    public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                            byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
                    {
                        return reverseGeocodeMethod(requestData, context);
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
                        "nds.search.services.GeocodingService: Method '" + methodName + "' does not exist!");
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
                getGeocodingServiceCapabilities_METHOD_NAME,
                geocode_METHOD_NAME,
                reverseGeocode_METHOD_NAME
            };
        }

        protected abstract nds.system.types.ModuleDefinition getServiceModuleDefinitionImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.system.types.NdsSystemToken getServiceNodeSystemReferenceImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.search.services.GeocodingServiceCapabilities getGeocodingServiceCapabilitiesImpl(
                nds.core.types.Empty request, java.lang.Object context);

        protected abstract nds.search.services.GeocodingPosition geocodeImpl(
                nds.search.services.GeocodingAddress request, java.lang.Object context);

        protected abstract nds.search.services.GeocodingAddress reverseGeocodeImpl(
                nds.search.services.GeocodingPosition request, java.lang.Object context);

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
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.search.services.GeocodingServiceCapabilities> getGeocodingServiceCapabilitiesMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.core.types.Empty request =
                        new nds.core.types.Empty(reader);
                final nds.search.services.GeocodingServiceCapabilities response = getGeocodingServiceCapabilitiesImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.search.services.GeocodingPosition> geocodeMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.search.services.GeocodingAddress request =
                        new nds.search.services.GeocodingAddress(reader);
                final nds.search.services.GeocodingPosition response = geocodeImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        private zserio.runtime.service.ObjectServiceData<nds.search.services.GeocodingAddress> reverseGeocodeMethod(
                byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError
        {
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(requestData);
                final nds.search.services.GeocodingPosition request =
                        new nds.search.services.GeocodingPosition(reader);
                final nds.search.services.GeocodingAddress response = reverseGeocodeImpl(request, context);

                return new zserio.runtime.service.ObjectServiceData<>(response);
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        private interface Method
        {
            public zserio.runtime.service.ServiceData<? extends zserio.runtime.io.Writer> invoke(
                    byte[] requestData, java.lang.Object context) throws zserio.runtime.ZserioError;
        }

        private static final java.lang.String SERVICE_FULL_NAME = "nds.search.services.GeocodingService";

        private final java.util.Map<java.lang.String, Method> methodMap;
    }

    public static final class GeocodingServiceClient
    {
        public GeocodingServiceClient(zserio.runtime.service.ServiceClientInterface serviceClient)
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
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
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
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        public nds.system.types.NdsSystemToken getServiceNodeSystemReferenceMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getServiceNodeSystemReferenceMethod(request, null);
        }

        public nds.search.services.GeocodingServiceCapabilities getGeocodingServiceCapabilitiesMethod(
                nds.core.types.Empty request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(getGeocodingServiceCapabilities_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.search.services.GeocodingServiceCapabilities response =
                        new nds.search.services.GeocodingServiceCapabilities(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        public nds.search.services.GeocodingServiceCapabilities getGeocodingServiceCapabilitiesMethod(
                nds.core.types.Empty request) throws zserio.runtime.ZserioError
        {
            return getGeocodingServiceCapabilitiesMethod(request, null);
        }

        public nds.search.services.GeocodingPosition geocodeMethod(
                nds.search.services.GeocodingAddress request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(geocode_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.search.services.GeocodingPosition response =
                        new nds.search.services.GeocodingPosition(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        public nds.search.services.GeocodingPosition geocodeMethod(
                nds.search.services.GeocodingAddress request) throws zserio.runtime.ZserioError
        {
            return geocodeMethod(request, null);
        }

        public nds.search.services.GeocodingAddress reverseGeocodeMethod(
                nds.search.services.GeocodingPosition request, java.lang.Object context)
                throws zserio.runtime.ZserioError
        {
            final byte[] responseData = serviceClient.callMethod(reverseGeocode_METHOD_NAME,
                    new zserio.runtime.service.ObjectServiceData<>(request), context);
            try
            {
                final zserio.runtime.io.ByteArrayBitStreamReader reader =
                        new zserio.runtime.io.ByteArrayBitStreamReader(responseData);
                final nds.search.services.GeocodingAddress response =
                        new nds.search.services.GeocodingAddress(reader);
                return response;
            }
            catch (java.io.IOException exception)
            {
                throw new zserio.runtime.ZserioError("GeocodingService: " + exception, exception);
            }
        }

        public nds.search.services.GeocodingAddress reverseGeocodeMethod(
                nds.search.services.GeocodingPosition request) throws zserio.runtime.ZserioError
        {
            return reverseGeocodeMethod(request, null);
        }

        private final zserio.runtime.service.ServiceClientInterface serviceClient;
    }

    public static final String getServiceModuleDefinition_METHOD_NAME = "getServiceModuleDefinition";
    public static final String getServiceNodeSystemReference_METHOD_NAME = "getServiceNodeSystemReference";
    public static final String getGeocodingServiceCapabilities_METHOD_NAME = "getGeocodingServiceCapabilities";
    public static final String geocode_METHOD_NAME = "geocode";
    public static final String reverseGeocode_METHOD_NAME = "reverseGeocode";
}