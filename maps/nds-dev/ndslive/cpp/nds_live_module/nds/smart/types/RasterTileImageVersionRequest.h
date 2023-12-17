/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TYPES_RASTER_TILE_IMAGE_VERSION_REQUEST_H
#define NDS_SMART_TYPES_RASTER_TILE_IMAGE_VERSION_REQUEST_H

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

#include <nds/core/types/TileId.h>
#include <nds/smart/types/RasterImageConfigBase64.h>
#include <nds/smart/types/RasterImageLifetime.h>

namespace nds
{
namespace smart
{
namespace types
{

class RasterTileImageVersionRequest
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::types::TileId::ZserioPackingContext& getTileId()
        {
            return m_tileId_;
        }

        ::nds::smart::types::RasterImageLifetime::ZserioPackingContext& getLifetimeInfo()
        {
            return m_lifetimeInfo_;
        }

    private:
        ::nds::core::types::TileId::ZserioPackingContext m_tileId_;
        ::nds::smart::types::RasterImageLifetime::ZserioPackingContext m_lifetimeInfo_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RasterTileImageVersionRequest() noexcept :
            RasterTileImageVersionRequest(allocator_type())
    {}

    explicit RasterTileImageVersionRequest(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_tileId = ::nds::core::types::TileId,
            typename ZSERIO_T_configuration = ::nds::smart::types::RasterImageConfigBase64,
            typename ZSERIO_T_lifetimeInfo = ::nds::smart::types::RasterImageLifetime,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_tileId, RasterTileImageVersionRequest, allocator_type> = 0>
    RasterTileImageVersionRequest(
            ZSERIO_T_tileId&& tileId_,
            ZSERIO_T_configuration&& configuration_,
            ZSERIO_T_lifetimeInfo&& lifetimeInfo_,
            const allocator_type& allocator = allocator_type()) :
            RasterTileImageVersionRequest(allocator)
    {
        m_tileId_ = ::std::forward<ZSERIO_T_tileId>(tileId_);
        m_configuration_ = ::std::forward<ZSERIO_T_configuration>(configuration_);
        m_lifetimeInfo_ = ::std::forward<ZSERIO_T_lifetimeInfo>(lifetimeInfo_);
    }

    explicit RasterTileImageVersionRequest(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RasterTileImageVersionRequest(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RasterTileImageVersionRequest() = default;

    RasterTileImageVersionRequest(const RasterTileImageVersionRequest&) = default;
    RasterTileImageVersionRequest& operator=(const RasterTileImageVersionRequest&) = default;

    RasterTileImageVersionRequest(RasterTileImageVersionRequest&&) = default;
    RasterTileImageVersionRequest& operator=(RasterTileImageVersionRequest&&) = default;

    RasterTileImageVersionRequest(::zserio::PropagateAllocatorT,
            const RasterTileImageVersionRequest& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::core::types::TileId& getTileId() const;
    ::nds::core::types::TileId& getTileId();
    void setTileId(const ::nds::core::types::TileId& tileId_);
    void setTileId(::nds::core::types::TileId&& tileId_);

    const ::nds::smart::types::RasterImageConfigBase64& getConfiguration() const;
    ::nds::smart::types::RasterImageConfigBase64& getConfiguration();
    void setConfiguration(const ::nds::smart::types::RasterImageConfigBase64& configuration_);
    void setConfiguration(::nds::smart::types::RasterImageConfigBase64&& configuration_);

    const ::nds::smart::types::RasterImageLifetime& getLifetimeInfo() const;
    ::nds::smart::types::RasterImageLifetime& getLifetimeInfo();
    void setLifetimeInfo(const ::nds::smart::types::RasterImageLifetime& lifetimeInfo_);
    void setLifetimeInfo(::nds::smart::types::RasterImageLifetime&& lifetimeInfo_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RasterTileImageVersionRequest& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::TileId readTileId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::TileId readTileId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::smart::types::RasterImageConfigBase64 readConfiguration(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::smart::types::RasterImageLifetime readLifetimeInfo(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::smart::types::RasterImageLifetime readLifetimeInfo(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::types::TileId m_tileId_;
    ::nds::smart::types::RasterImageConfigBase64 m_configuration_;
    ::nds::smart::types::RasterImageLifetime m_lifetimeInfo_;
};

} // namespace types
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TYPES_RASTER_TILE_IMAGE_VERSION_REQUEST_H
