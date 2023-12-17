/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_METADATA_TILE_SERVICE_CAPABILITIES_RESPONSE_H
#define NDS_SMART_METADATA_TILE_SERVICE_CAPABILITIES_RESPONSE_H

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

#include <nds/smart/metadata/TileServiceCapabilities.h>

namespace nds
{
namespace smart
{
namespace metadata
{

class TileServiceCapabilitiesResponse
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getCapabilities()
        {
            return m_capabilities_;
        }

    private:
        ::zserio::DeltaContext m_capabilities_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TileServiceCapabilitiesResponse() noexcept :
            TileServiceCapabilitiesResponse(allocator_type())
    {}

    explicit TileServiceCapabilitiesResponse(const allocator_type& allocator) noexcept;

    explicit TileServiceCapabilitiesResponse(
            ::nds::smart::metadata::TileServiceCapabilities capabilities_,
            const allocator_type& allocator = allocator_type()) :
            TileServiceCapabilitiesResponse(allocator)
    {
        m_capabilities_ = capabilities_;
    }

    explicit TileServiceCapabilitiesResponse(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TileServiceCapabilitiesResponse(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TileServiceCapabilitiesResponse() = default;

    TileServiceCapabilitiesResponse(const TileServiceCapabilitiesResponse&) = default;
    TileServiceCapabilitiesResponse& operator=(const TileServiceCapabilitiesResponse&) = default;

    TileServiceCapabilitiesResponse(TileServiceCapabilitiesResponse&&) = default;
    TileServiceCapabilitiesResponse& operator=(TileServiceCapabilitiesResponse&&) = default;

    TileServiceCapabilitiesResponse(::zserio::PropagateAllocatorT,
            const TileServiceCapabilitiesResponse& other, const allocator_type& allocator);

    ::nds::smart::metadata::TileServiceCapabilities getCapabilities() const;
    void setCapabilities(::nds::smart::metadata::TileServiceCapabilities capabilities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TileServiceCapabilitiesResponse& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::smart::metadata::TileServiceCapabilities readCapabilities(::zserio::BitStreamReader& in);
    ::nds::smart::metadata::TileServiceCapabilities readCapabilities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::smart::metadata::TileServiceCapabilities m_capabilities_;
};

} // namespace metadata
} // namespace smart
} // namespace nds

#endif // NDS_SMART_METADATA_TILE_SERVICE_CAPABILITIES_RESPONSE_H
