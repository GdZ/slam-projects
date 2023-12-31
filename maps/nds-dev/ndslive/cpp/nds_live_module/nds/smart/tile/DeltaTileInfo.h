/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TILE_DELTA_TILE_INFO_H
#define NDS_SMART_TILE_DELTA_TILE_INFO_H

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
#include <nds/smart/tile/SourceLayerInfo.h>

namespace nds
{
namespace smart
{
namespace tile
{

class DeltaTileInfo
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::types::TileId::ZserioPackingContext& getTileId()
        {
            return m_tileId_;
        }

        ::nds::smart::tile::SourceLayerInfo::ZserioPackingContext& getSourceLayerInfo()
        {
            return m_sourceLayerInfo_;
        }

    private:
        ::nds::core::types::TileId::ZserioPackingContext m_tileId_;
        ::nds::smart::tile::SourceLayerInfo::ZserioPackingContext m_sourceLayerInfo_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DeltaTileInfo() noexcept :
            DeltaTileInfo(allocator_type())
    {}

    explicit DeltaTileInfo(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_tileId = ::nds::core::types::TileId,
            typename ZSERIO_T_sourceLayerInfo = ::nds::smart::tile::SourceLayerInfo,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_tileId, DeltaTileInfo, allocator_type> = 0>
    DeltaTileInfo(
            ZSERIO_T_tileId&& tileId_,
            ZSERIO_T_sourceLayerInfo&& sourceLayerInfo_,
            const allocator_type& allocator = allocator_type()) :
            DeltaTileInfo(allocator)
    {
        m_tileId_ = ::std::forward<ZSERIO_T_tileId>(tileId_);
        m_sourceLayerInfo_ = ::std::forward<ZSERIO_T_sourceLayerInfo>(sourceLayerInfo_);
    }

    explicit DeltaTileInfo(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DeltaTileInfo(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DeltaTileInfo() = default;

    DeltaTileInfo(const DeltaTileInfo&) = default;
    DeltaTileInfo& operator=(const DeltaTileInfo&) = default;

    DeltaTileInfo(DeltaTileInfo&&) = default;
    DeltaTileInfo& operator=(DeltaTileInfo&&) = default;

    DeltaTileInfo(::zserio::PropagateAllocatorT,
            const DeltaTileInfo& other, const allocator_type& allocator);

    const ::nds::core::types::TileId& getTileId() const;
    ::nds::core::types::TileId& getTileId();
    void setTileId(const ::nds::core::types::TileId& tileId_);
    void setTileId(::nds::core::types::TileId&& tileId_);

    const ::nds::smart::tile::SourceLayerInfo& getSourceLayerInfo() const;
    ::nds::smart::tile::SourceLayerInfo& getSourceLayerInfo();
    void setSourceLayerInfo(const ::nds::smart::tile::SourceLayerInfo& sourceLayerInfo_);
    void setSourceLayerInfo(::nds::smart::tile::SourceLayerInfo&& sourceLayerInfo_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DeltaTileInfo& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::TileId readTileId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::TileId readTileId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::smart::tile::SourceLayerInfo readSourceLayerInfo(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::smart::tile::SourceLayerInfo readSourceLayerInfo(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::types::TileId m_tileId_;
    ::nds::smart::tile::SourceLayerInfo m_sourceLayerInfo_;
};

} // namespace tile
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TILE_DELTA_TILE_INFO_H
