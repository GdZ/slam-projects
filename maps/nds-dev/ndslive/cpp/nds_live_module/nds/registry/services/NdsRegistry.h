/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_REGISTRY_SERVICES_NDS_REGISTRY_H
#define NDS_REGISTRY_SERVICES_NDS_REGISTRY_H

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
#include <nds/registry/node/NodeInformation.h>
#include <nds/registry/node/NodeList.h>
#include <nds/registry/node/NodeSearchFilter.h>
#include <nds/registry/services/RegistryServiceCapabilitiesResponse.h>
#include <nds/system/types/ModuleDefinition.h>
#include <nds/system/types/NdsNodeToken.h>
#include <nds/system/types/NdsSystemToken.h>

namespace nds
{
namespace registry
{
namespace services
{

namespace NdsRegistry
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
    virtual ::nds::system::types::ModuleDefinition getRegistryModuleDefinitionImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::registry::services::RegistryServiceCapabilitiesResponse getRegistryServiceCapabilitiesImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::registry::node::NodeList getAllNodesAllSystemsImpl(const ::nds::core::types::Empty& request, void* context) = 0;
    virtual ::nds::registry::node::NodeList getAllNodesImpl(const ::nds::system::types::NdsSystemToken& request, void* context) = 0;
    virtual ::nds::registry::node::NodeList searchNodesImpl(const ::nds::registry::node::NodeSearchFilter& request, void* context) = 0;
    virtual ::nds::core::types::Empty registerNodeImpl(const ::nds::registry::node::NodeInformation& request, void* context) = 0;
    virtual ::nds::core::types::Empty unregisterNodeImpl(const ::nds::system::types::NdsNodeToken& request, void* context) = 0;

    ::zserio::IServiceDataPtr getRegistryModuleDefinitionMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getRegistryServiceCapabilitiesMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getAllNodesAllSystemsMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr getAllNodesMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr searchNodesMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr registerNodeMethod(
            ::zserio::Span<const uint8_t> requestData, void* context);
    ::zserio::IServiceDataPtr unregisterNodeMethod(
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

    ::nds::system::types::ModuleDefinition getRegistryModuleDefinitionMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::registry::services::RegistryServiceCapabilitiesResponse getRegistryServiceCapabilitiesMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::registry::node::NodeList getAllNodesAllSystemsMethod(const ::nds::core::types::Empty& request, void* context = nullptr);

    ::nds::registry::node::NodeList getAllNodesMethod(const ::nds::system::types::NdsSystemToken& request, void* context = nullptr);

    ::nds::registry::node::NodeList searchNodesMethod(const ::nds::registry::node::NodeSearchFilter& request, void* context = nullptr);

    ::nds::core::types::Empty registerNodeMethod(const ::nds::registry::node::NodeInformation& request, void* context = nullptr);

    ::nds::core::types::Empty unregisterNodeMethod(const ::nds::system::types::NdsNodeToken& request, void* context = nullptr);

private:
    ::zserio::IServiceClient& m_service;
};

} // namespace NdsRegistry

} // namespace services
} // namespace registry
} // namespace nds

#endif // NDS_REGISTRY_SERVICES_NDS_REGISTRY_H
