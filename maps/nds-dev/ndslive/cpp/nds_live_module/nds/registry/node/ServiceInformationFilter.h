/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_REGISTRY_NODE_SERVICE_INFORMATION_FILTER_H
#define NDS_REGISTRY_NODE_SERVICE_INFORMATION_FILTER_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <zserio/DeltaContext.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/registry/node/ServicePriority.h>
#include <nds/system/types/ModuleDefinition.h>
#include <nds/system/types/ModuleService.h>

namespace nds
{
namespace registry
{
namespace node
{

class ServiceInformationFilter
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getMinServicePriority()
        {
            return m_minServicePriority_;
        }

        ::zserio::DeltaContext& getMaxServicePriority()
        {
            return m_maxServicePriority_;
        }

    private:
        ::zserio::DeltaContext m_minServicePriority_;
        ::zserio::DeltaContext m_maxServicePriority_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ServiceInformationFilter() noexcept :
            ServiceInformationFilter(allocator_type())
    {}

    explicit ServiceInformationFilter(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_moduleDefinition = ::nds::system::types::ModuleDefinition,
            typename ZSERIO_T_moduleService = ::nds::system::types::ModuleService,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_moduleDefinition, ServiceInformationFilter, allocator_type> = 0>
    ServiceInformationFilter(
            ZSERIO_T_moduleDefinition&& moduleDefinition_,
            ZSERIO_T_moduleService&& moduleService_,
            ::nds::registry::node::ServicePriority minServicePriority_,
            ::nds::registry::node::ServicePriority maxServicePriority_,
            const allocator_type& allocator = allocator_type()) :
            ServiceInformationFilter(allocator)
    {
        m_moduleDefinition_ = ::std::forward<ZSERIO_T_moduleDefinition>(moduleDefinition_);
        m_moduleService_ = ::std::forward<ZSERIO_T_moduleService>(moduleService_);
        m_minServicePriority_ = minServicePriority_;
        m_maxServicePriority_ = maxServicePriority_;
    }

    explicit ServiceInformationFilter(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ServiceInformationFilter(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ServiceInformationFilter() = default;

    ServiceInformationFilter(const ServiceInformationFilter&) = default;
    ServiceInformationFilter& operator=(const ServiceInformationFilter&) = default;

    ServiceInformationFilter(ServiceInformationFilter&&) = default;
    ServiceInformationFilter& operator=(ServiceInformationFilter&&) = default;

    ServiceInformationFilter(::zserio::PropagateAllocatorT,
            const ServiceInformationFilter& other, const allocator_type& allocator);

    const ::nds::system::types::ModuleDefinition& getModuleDefinition() const;
    ::nds::system::types::ModuleDefinition& getModuleDefinition();
    void setModuleDefinition(const ::nds::system::types::ModuleDefinition& moduleDefinition_);
    void setModuleDefinition(::nds::system::types::ModuleDefinition&& moduleDefinition_);

    const ::nds::system::types::ModuleService& getModuleService() const;
    ::nds::system::types::ModuleService& getModuleService();
    void setModuleService(const ::nds::system::types::ModuleService& moduleService_);
    void setModuleService(::nds::system::types::ModuleService&& moduleService_);

    ::nds::registry::node::ServicePriority getMinServicePriority() const;
    void setMinServicePriority(::nds::registry::node::ServicePriority minServicePriority_);

    ::nds::registry::node::ServicePriority getMaxServicePriority() const;
    void setMaxServicePriority(::nds::registry::node::ServicePriority maxServicePriority_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ServiceInformationFilter& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::system::types::ModuleDefinition readModuleDefinition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::system::types::ModuleService readModuleService(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::registry::node::ServicePriority readMinServicePriority(::zserio::BitStreamReader& in);
    ::nds::registry::node::ServicePriority readMinServicePriority(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::registry::node::ServicePriority readMaxServicePriority(::zserio::BitStreamReader& in);
    ::nds::registry::node::ServicePriority readMaxServicePriority(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::system::types::ModuleDefinition m_moduleDefinition_;
    ::nds::system::types::ModuleService m_moduleService_;
    ::nds::registry::node::ServicePriority m_minServicePriority_;
    ::nds::registry::node::ServicePriority m_maxServicePriority_;
};

} // namespace node
} // namespace registry
} // namespace nds

#endif // NDS_REGISTRY_NODE_SERVICE_INFORMATION_FILTER_H
