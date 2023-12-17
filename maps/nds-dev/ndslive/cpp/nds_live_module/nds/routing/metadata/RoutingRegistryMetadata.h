/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_METADATA_ROUTING_REGISTRY_METADATA_H
#define NDS_ROUTING_METADATA_ROUTING_REGISTRY_METADATA_H

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

#include <nds/core/language/AvailableLanguages.h>
#include <nds/routing/metadata/RoutingServiceCapabilities.h>
#include <nds/routing/metadata/RoutingServiceType.h>

namespace nds
{
namespace routing
{
namespace metadata
{

class RoutingRegistryMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getRoutingServiceType()
        {
            return m_routingServiceType_;
        }

        ::nds::routing::metadata::RoutingServiceCapabilities::ZserioPackingContext& getCapabilities()
        {
            return m_capabilities_;
        }

        ::nds::core::language::AvailableLanguages::ZserioPackingContext& getAvailableLanguages()
        {
            return m_availableLanguages_;
        }

    private:
        ::zserio::DeltaContext m_routingServiceType_;
        ::nds::routing::metadata::RoutingServiceCapabilities::ZserioPackingContext m_capabilities_;
        ::nds::core::language::AvailableLanguages::ZserioPackingContext m_availableLanguages_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoutingRegistryMetadata() noexcept :
            RoutingRegistryMetadata(allocator_type())
    {}

    explicit RoutingRegistryMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_capabilities = ::nds::routing::metadata::RoutingServiceCapabilities,
            typename ZSERIO_T_availableLanguages = ::nds::core::language::AvailableLanguages>
    RoutingRegistryMetadata(
            ::nds::routing::metadata::RoutingServiceType routingServiceType_,
            ZSERIO_T_capabilities&& capabilities_,
            ZSERIO_T_availableLanguages&& availableLanguages_,
            const allocator_type& allocator = allocator_type()) :
            RoutingRegistryMetadata(allocator)
    {
        m_routingServiceType_ = routingServiceType_;
        m_capabilities_ = ::std::forward<ZSERIO_T_capabilities>(capabilities_);
        m_availableLanguages_ = ::std::forward<ZSERIO_T_availableLanguages>(availableLanguages_);
    }

    explicit RoutingRegistryMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoutingRegistryMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoutingRegistryMetadata() = default;

    RoutingRegistryMetadata(const RoutingRegistryMetadata& other);
    RoutingRegistryMetadata& operator=(const RoutingRegistryMetadata& other);

    RoutingRegistryMetadata(RoutingRegistryMetadata&& other);
    RoutingRegistryMetadata& operator=(RoutingRegistryMetadata&& other);

    RoutingRegistryMetadata(::zserio::PropagateAllocatorT,
            const RoutingRegistryMetadata& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::routing::metadata::RoutingServiceType getRoutingServiceType() const;
    void setRoutingServiceType(::nds::routing::metadata::RoutingServiceType routingServiceType_);

    const ::nds::routing::metadata::RoutingServiceCapabilities& getCapabilities() const;
    ::nds::routing::metadata::RoutingServiceCapabilities& getCapabilities();
    void setCapabilities(const ::nds::routing::metadata::RoutingServiceCapabilities& capabilities_);
    void setCapabilities(::nds::routing::metadata::RoutingServiceCapabilities&& capabilities_);

    const ::nds::core::language::AvailableLanguages& getAvailableLanguages() const;
    ::nds::core::language::AvailableLanguages& getAvailableLanguages();
    void setAvailableLanguages(const ::nds::core::language::AvailableLanguages& availableLanguages_);
    void setAvailableLanguages(::nds::core::language::AvailableLanguages&& availableLanguages_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoutingRegistryMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::routing::metadata::RoutingServiceType readRoutingServiceType(::zserio::BitStreamReader& in);
    ::nds::routing::metadata::RoutingServiceType readRoutingServiceType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::routing::metadata::RoutingServiceCapabilities readCapabilities(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::routing::metadata::RoutingServiceCapabilities readCapabilities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::routing::metadata::RoutingServiceType m_routingServiceType_;
    ::nds::routing::metadata::RoutingServiceCapabilities m_capabilities_;
    ::nds::core::language::AvailableLanguages m_availableLanguages_;
};

} // namespace metadata
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_METADATA_ROUTING_REGISTRY_METADATA_H