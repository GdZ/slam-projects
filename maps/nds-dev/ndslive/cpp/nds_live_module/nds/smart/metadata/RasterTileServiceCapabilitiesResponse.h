/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_METADATA_RASTER_TILE_SERVICE_CAPABILITIES_RESPONSE_H
#define NDS_SMART_METADATA_RASTER_TILE_SERVICE_CAPABILITIES_RESPONSE_H

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

#include <nds/smart/metadata/RasterTileServiceCapabilities.h>

namespace nds
{
namespace smart
{
namespace metadata
{

class RasterTileServiceCapabilitiesResponse
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

    RasterTileServiceCapabilitiesResponse() noexcept :
            RasterTileServiceCapabilitiesResponse(allocator_type())
    {}

    explicit RasterTileServiceCapabilitiesResponse(const allocator_type& allocator) noexcept;

    explicit RasterTileServiceCapabilitiesResponse(
            ::nds::smart::metadata::RasterTileServiceCapabilities capabilities_,
            const allocator_type& allocator = allocator_type()) :
            RasterTileServiceCapabilitiesResponse(allocator)
    {
        m_capabilities_ = capabilities_;
    }

    explicit RasterTileServiceCapabilitiesResponse(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RasterTileServiceCapabilitiesResponse(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RasterTileServiceCapabilitiesResponse() = default;

    RasterTileServiceCapabilitiesResponse(const RasterTileServiceCapabilitiesResponse&) = default;
    RasterTileServiceCapabilitiesResponse& operator=(const RasterTileServiceCapabilitiesResponse&) = default;

    RasterTileServiceCapabilitiesResponse(RasterTileServiceCapabilitiesResponse&&) = default;
    RasterTileServiceCapabilitiesResponse& operator=(RasterTileServiceCapabilitiesResponse&&) = default;

    RasterTileServiceCapabilitiesResponse(::zserio::PropagateAllocatorT,
            const RasterTileServiceCapabilitiesResponse& other, const allocator_type& allocator);

    ::nds::smart::metadata::RasterTileServiceCapabilities getCapabilities() const;
    void setCapabilities(::nds::smart::metadata::RasterTileServiceCapabilities capabilities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RasterTileServiceCapabilitiesResponse& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::smart::metadata::RasterTileServiceCapabilities readCapabilities(::zserio::BitStreamReader& in);
    ::nds::smart::metadata::RasterTileServiceCapabilities readCapabilities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::smart::metadata::RasterTileServiceCapabilities m_capabilities_;
};

} // namespace metadata
} // namespace smart
} // namespace nds

#endif // NDS_SMART_METADATA_RASTER_TILE_SERVICE_CAPABILITIES_RESPONSE_H
