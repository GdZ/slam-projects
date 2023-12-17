/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_SERVICES_GEOCODING_SERVICE_CAPABILITIES_H
#define NDS_SEARCH_SERVICES_GEOCODING_SERVICE_CAPABILITIES_H

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

#include <nds/search/services/GeocodingServiceMethods.h>

namespace nds
{
namespace search
{
namespace services
{

class GeocodingServiceCapabilities
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getImplementedMethods()
        {
            return m_implementedMethods_;
        }

    private:
        ::zserio::DeltaContext m_implementedMethods_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    GeocodingServiceCapabilities() noexcept :
            GeocodingServiceCapabilities(allocator_type())
    {}

    explicit GeocodingServiceCapabilities(const allocator_type& allocator) noexcept;

    explicit GeocodingServiceCapabilities(
            ::nds::search::services::GeocodingServiceMethods implementedMethods_,
            const allocator_type& allocator = allocator_type()) :
            GeocodingServiceCapabilities(allocator)
    {
        m_implementedMethods_ = implementedMethods_;
    }

    explicit GeocodingServiceCapabilities(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit GeocodingServiceCapabilities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~GeocodingServiceCapabilities() = default;

    GeocodingServiceCapabilities(const GeocodingServiceCapabilities&) = default;
    GeocodingServiceCapabilities& operator=(const GeocodingServiceCapabilities&) = default;

    GeocodingServiceCapabilities(GeocodingServiceCapabilities&&) = default;
    GeocodingServiceCapabilities& operator=(GeocodingServiceCapabilities&&) = default;

    GeocodingServiceCapabilities(::zserio::PropagateAllocatorT,
            const GeocodingServiceCapabilities& other, const allocator_type& allocator);

    ::nds::search::services::GeocodingServiceMethods getImplementedMethods() const;
    void setImplementedMethods(::nds::search::services::GeocodingServiceMethods implementedMethods_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const GeocodingServiceCapabilities& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::search::services::GeocodingServiceMethods readImplementedMethods(::zserio::BitStreamReader& in);
    ::nds::search::services::GeocodingServiceMethods readImplementedMethods(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::search::services::GeocodingServiceMethods m_implementedMethods_;
};

} // namespace services
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_SERVICES_GEOCODING_SERVICE_CAPABILITIES_H