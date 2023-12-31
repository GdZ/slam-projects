/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_SERVICES_GEOCODING_SERVICE_H
#define NDS_SEARCH_SERVICES_GEOCODING_SERVICE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <array>
#include <zserio/Types.h>
#include <zserio/IService.h>
#include <zserio/AllocatorHolder.h>
#include <zserio/ServiceException.h>
#include <zserio/ArrayTraits.h>

#include <nds/core/types/Empty.h>
#include <nds/search/services/GeocodingAddress.h>
#include <nds/search/services/GeocodingPosition.h>
#include <nds/search/services/GeocodingServiceCapabilities.h>
#include <nds/system/types/ModuleDefinition.h>
#include <nds/system/types/NdsSystemToken.h>

namespace nds
{
namespace search
{
namespace services
{

namespace GeocodingService
{

class Service :
        public ::zserio::IService,
        public ::zserio::AllocatorHolder<::std::allocator<uint8_t>>
{
public:
    explicit Service(const allocator_type& allocator = allocator_type());
    ~Service() override = default;

    Service(const Service&) = delete;
    Service& operator=(const Service&) = delete;

    Service(Service&&) = default;
    Service& operator=(Service&&) = delete;

    ::zserio::IServiceDataPtr callMethod(
            ::zserio::StringView methodName, ::zserio::Span<const uint8_t> requestData,
            void* context) override;

    static ::zserio::StringView serviceFullName() noexcept;
    static const ::std::array<::zserio::StringView, 5>& methodNames() noexcept;

private:
    virtual ::nds::system::types::ModuleDefinition getServiceModuleDefinitionImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::system::types::NdsSystemToken getServiceNodeSystemReferenceImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::search::services::GeocodingServiceCapabilities getGeocodingServiceCapabilitiesImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::search::services::GeocodingPosition geocodeImpl(const ::nds::search::services::GeocodingAddress& request, void* context) = 0;
    virtual ::nds::search::services::GeocodingAddress reverseGeocodeImpl(const ::nds::search::services::GeocodingPosition& request, void* context) = 0;

    ::zserio::IServiceDataPtr getServiceModuleDefinitionMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getServiceNodeSystemReferenceMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getGeocodingServiceCapabilitiesMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr geocodeMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr reverseGeocodeMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
};

class Client : public ::zserio::AllocatorHolder<::std::allocator<uint8_t>>
{
public:
    explicit Client(::zserio::IServiceClient& service, const allocator_type& allocator = allocator_type());
    ~Client() = default;

    Client(const Client&) = delete;
    Client& operator=(const Client&) = delete;

    Client(Client&&) = default;
    Client& operator=(Client&&) = delete;

    ::nds::system::types::ModuleDefinition getServiceModuleDefinitionMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::system::types::NdsSystemToken getServiceNodeSystemReferenceMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::search::services::GeocodingServiceCapabilities getGeocodingServiceCapabilitiesMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::search::services::GeocodingPosition geocodeMethod(const ::nds::search::services::GeocodingAddress& request, void* context = nullptr);

    ::nds::search::services::GeocodingAddress reverseGeocodeMethod(const ::nds::search::services::GeocodingPosition& request, void* context = nullptr);

private:
    ::zserio::IServiceClient& m_service;
};

} // namespace GeocodingService

} // namespace services
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_SERVICES_GEOCODING_SERVICE_H
