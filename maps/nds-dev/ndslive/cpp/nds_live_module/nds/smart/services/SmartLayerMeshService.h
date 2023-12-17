/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_SERVICES_SMART_LAYER_MESH_SERVICE_H
#define NDS_SMART_SERVICES_SMART_LAYER_MESH_SERVICE_H

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
#include <nds/core/types/TileId.h>
#include <nds/smart/mesh/SmartLayerMesh.h>
#include <nds/smart/mesh/SmartMeshId.h>
#include <nds/smart/mesh/SmartMeshIndex.h>
#include <nds/smart/metadata/MeshServiceCapabilitiesResponse.h>
#include <nds/smart/metadata/SmartLayerDefinition.h>
#include <nds/system/types/ModuleDefinition.h>
#include <nds/system/types/NdsNodeLegalInfo.h>
#include <nds/system/types/NdsSystemToken.h>

namespace nds
{
namespace smart
{
namespace services
{

namespace SmartLayerMeshService
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
    static const ::std::array<::zserio::StringView, 7>& methodNames() noexcept;

private:
    virtual ::nds::system::types::ModuleDefinition getServiceModuleDefinitionImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::smart::metadata::SmartLayerDefinition getServiceDefinitionImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::system::types::NdsSystemToken getServiceNodeSystemReferenceImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::system::types::NdsNodeLegalInfo getServiceNodeLegalInfoImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::smart::metadata::MeshServiceCapabilitiesResponse getMeshServiceCapabilitiesImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::smart::mesh::SmartMeshIndex getMeshIndexByTileIdImpl(const ::nds::core::types::TileId& request, void* context) = 0;
    virtual ::nds::smart::mesh::SmartLayerMesh getMeshByIdImpl(const ::nds::smart::mesh::SmartMeshId& request, void* context) = 0;

    ::zserio::IServiceDataPtr getServiceModuleDefinitionMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getServiceDefinitionMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getServiceNodeSystemReferenceMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getServiceNodeLegalInfoMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getMeshServiceCapabilitiesMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getMeshIndexByTileIdMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getMeshByIdMethod(
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

    ::nds::smart::metadata::MeshServiceCapabilitiesResponse getMeshServiceCapabilitiesMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::smart::mesh::SmartMeshIndex getMeshIndexByTileIdMethod(const ::nds::core::types::TileId& request, void* context = nullptr);

    ::nds::smart::mesh::SmartLayerMesh getMeshByIdMethod(const ::nds::smart::mesh::SmartMeshId& request, void* context = nullptr);

private:
    ::zserio::IServiceClient& m_service;
};

} // namespace SmartLayerMeshService

} // namespace services
} // namespace smart
} // namespace nds

#endif // NDS_SMART_SERVICES_SMART_LAYER_MESH_SERVICE_H
