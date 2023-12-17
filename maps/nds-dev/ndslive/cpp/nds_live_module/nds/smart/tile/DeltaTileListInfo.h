/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TILE_DELTA_TILE_LIST_INFO_H
#define NDS_SMART_TILE_DELTA_TILE_LIST_INFO_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/types/PackedTileId.h>
#include <nds/smart/tile/SourceLayerInfo.h>

namespace nds
{
namespace smart
{
namespace tile
{

class DeltaTileListInfo
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumTiles()
        {
            return m_numTiles_;
        }

    private:
        ::zserio::DeltaContext m_numTiles_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DeltaTileListInfo() noexcept :
            DeltaTileListInfo(allocator_type())
    {}

    explicit DeltaTileListInfo(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_tileIds = ::zserio::vector<::nds::core::types::PackedTileId>,
            typename ZSERIO_T_headers = ::zserio::vector<::nds::smart::tile::SourceLayerInfo>>
    DeltaTileListInfo(
            uint32_t numTiles_,
            ZSERIO_T_tileIds&& tileIds_,
            ZSERIO_T_headers&& headers_,
            const allocator_type& allocator = allocator_type()) :
            DeltaTileListInfo(allocator)
    {
        m_numTiles_ = numTiles_;
        m_tileIds_ = ZserioArrayType_tileIds(::std::forward<ZSERIO_T_tileIds>(tileIds_));
        m_headers_ = ZserioArrayType_headers(::std::forward<ZSERIO_T_headers>(headers_));
    }

    explicit DeltaTileListInfo(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DeltaTileListInfo(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DeltaTileListInfo() = default;

    DeltaTileListInfo(const DeltaTileListInfo&) = default;
    DeltaTileListInfo& operator=(const DeltaTileListInfo&) = default;

    DeltaTileListInfo(DeltaTileListInfo&&) = default;
    DeltaTileListInfo& operator=(DeltaTileListInfo&&) = default;

    DeltaTileListInfo(::zserio::PropagateAllocatorT,
            const DeltaTileListInfo& other, const allocator_type& allocator);

    uint32_t getNumTiles() const;
    void setNumTiles(uint32_t numTiles_);

    const ::zserio::vector<::nds::core::types::PackedTileId>& getTileIds() const;
    ::zserio::vector<::nds::core::types::PackedTileId>& getTileIds();
    void setTileIds(const ::zserio::vector<::nds::core::types::PackedTileId>& tileIds_);
    void setTileIds(::zserio::vector<::nds::core::types::PackedTileId>&& tileIds_);

    const ::zserio::vector<::nds::smart::tile::SourceLayerInfo>& getHeaders() const;
    ::zserio::vector<::nds::smart::tile::SourceLayerInfo>& getHeaders();
    void setHeaders(const ::zserio::vector<::nds::smart::tile::SourceLayerInfo>& headers_);
    void setHeaders(::zserio::vector<::nds::smart::tile::SourceLayerInfo>&& headers_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DeltaTileListInfo& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_headers
    {
    public:
        using OwnerType = DeltaTileListInfo;

        static void create(DeltaTileListInfo& owner,
                ::zserio::vector<::nds::smart::tile::SourceLayerInfo>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DeltaTileListInfo& owner,
                ::zserio::vector<::nds::smart::tile::SourceLayerInfo>& array,
                ::nds::smart::tile::SourceLayerInfo::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_tileIds = ::zserio::Array<::zserio::vector<::nds::core::types::PackedTileId>, ::zserio::StdIntArrayTraits<::nds::core::types::PackedTileId>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_headers = ::zserio::Array<::zserio::vector<::nds::smart::tile::SourceLayerInfo>, ::zserio::ObjectArrayTraits<::nds::smart::tile::SourceLayerInfo, ZserioElementFactory_headers>, ::zserio::ArrayType::NORMAL>;

    uint32_t readNumTiles(::zserio::BitStreamReader& in);
    uint32_t readNumTiles(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_tileIds readTileIds(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_tileIds readTileIds(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_headers readHeaders(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_headers readHeaders(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint32_t m_numTiles_;
    ZserioArrayType_tileIds m_tileIds_;
    ZserioArrayType_headers m_headers_;
};

} // namespace tile
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TILE_DELTA_TILE_LIST_INFO_H
