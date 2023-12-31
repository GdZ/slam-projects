/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_SERVICES_SMART_LAYER_PATH_SERVICE_H
#define NDS_SMART_SERVICES_SMART_LAYER_PATH_SERVICE_H

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

#include <nds/core/location/RoadLocationId.h>
#include <nds/core/types/Empty.h>
#include <nds/core/types/TileId.h>
#include <nds/core/types/TileIdList.h>
#include <nds/smart/metadata/PathServiceCapabilitiesResponse.h>
#include <nds/smart/metadata/SmartLayerDefinition.h>
#include <nds/smart/path/SmartLayerLocationIdPath.h>
#include <nds/smart/path/SmartLayerPath.h>
#include <nds/smart/path/SmartLayerPathList.h>
#include <nds/smart/path/SmartLayerPathReference.h>
#include <nds/smart/tile/SmartLayerTileHeaderList.h>
#include <nds/smart/types/SmartLayerHeader.h>
#include <nds/system/types/ModuleDefinition.h>
#include <nds/system/types/NdsNodeLegalInfo.h>
#include <nds/system/types/NdsSystemToken.h>

namespace nds
{
namespace smart
{
namespace services
{

namespace SmartLayerPathService
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
    static const ::std::array<::zserio::StringView, 10>& methodNames() noexcept;

private:
    virtual ::nds::system::types::ModuleDefinition getServiceModuleDefinitionImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::smart::metadata::SmartLayerDefinition getServiceDefinitionImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::system::types::NdsSystemToken getServiceNodeSystemReferenceImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::system::types::NdsNodeLegalInfo getServiceNodeLegalInfoImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::smart::metadata::PathServiceCapabilitiesResponse getPathServiceCapabilitiesImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::smart::path::SmartLayerPath getDataAlongPathImpl(const ::nds::smart::path::SmartLayerPathReference& request, void* context) = 0;
    virtual ::nds::smart::path::SmartLayerLocationIdPath getDataAlongLocationIdImpl(const ::nds::core::location::RoadLocationId& request, void* context) = 0;
    virtual ::nds::smart::path::SmartLayerPathList getPathsInTileImpl(const ::nds::core::types::TileIdList& request, void* context) = 0;
    virtual ::nds::smart::types::SmartLayerHeader getHeaderOnlyByPathImpl(const ::nds::smart::path::SmartLayerPathReference& request, void* context) = 0;
    virtual ::nds::smart::tile::SmartLayerTileHeaderList getHeaderOnlyListInTileImpl(const ::nds::core::types::TileId& request, void* context) = 0;

    ::zserio::IServiceDataPtr getServiceModuleDefinitionMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getServiceDefinitionMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getServiceNodeSystemReferenceMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getServiceNodeLegalInfoMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getPathServiceCapabilitiesMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getDataAlongPathMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getDataAlongLocationIdMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getPathsInTileMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getHeaderOnlyByPathMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getHeaderOnlyListInTileMethod(
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

    ::nds::smart::metadata::SmartLayerDefinition getServiceDefinitionMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::system::types::NdsSystemToken getServiceNodeSystemReferenceMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::system::types::NdsNodeLegalInfo getServiceNodeLegalInfoMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::smart::metadata::PathServiceCapabilitiesResponse getPathServiceCapabilitiesMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::smart::path::SmartLayerPath getDataAlongPathMethod(const ::nds::smart::path::SmartLayerPathReference& request, void* context = nullptr);

    ::nds::smart::path::SmartLayerLocationIdPath getDataAlongLocationIdMethod(const ::nds::core::location::RoadLocationId& request, void* context = nullptr);

    ::nds::smart::path::SmartLayerPathList getPathsInTileMethod(const ::nds::core::types::TileIdList& request, void* context = nullptr);

    ::nds::smart::types::SmartLayerHeader getHeaderOnlyByPathMethod(const ::nds::smart::path::SmartLayerPathReference& request, void* context = nullptr);

    ::nds::smart::tile::SmartLayerTileHeaderList getHeaderOnlyListInTileMethod(const ::nds::core::types::TileId& request, void* context = nullptr);

private:
    ::zserio::IServiceClient& m_service;
};

} // namespace SmartLayerPathService

} // namespace services
} // namespace smart
} // namespace nds

#endif // NDS_SMART_SERVICES_SMART_LAYER_PATH_SERVICE_H
