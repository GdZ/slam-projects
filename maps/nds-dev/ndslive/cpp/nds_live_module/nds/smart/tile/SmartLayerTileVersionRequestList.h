/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TILE_SMART_LAYER_TILE_VERSION_REQUEST_LIST_H
#define NDS_SMART_TILE_SMART_LAYER_TILE_VERSION_REQUEST_LIST_H

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

#include <nds/smart/tile/SmartLayerTileVersionRequest.h>

namespace nds
{
namespace smart
{
namespace tile
{

class SmartLayerTileVersionRequestList
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

    SmartLayerTileVersionRequestList() noexcept :
            SmartLayerTileVersionRequestList(allocator_type())
    {}

    explicit SmartLayerTileVersionRequestList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_tileVersionRequests = ::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>>
    SmartLayerTileVersionRequestList(
            uint32_t numTiles_,
            ZSERIO_T_tileVersionRequests&& tileVersionRequests_,
            const allocator_type& allocator = allocator_type()) :
            SmartLayerTileVersionRequestList(allocator)
    {
        m_numTiles_ = numTiles_;
        m_tileVersionRequests_ = ZserioArrayType_tileVersionRequests(::std::forward<ZSERIO_T_tileVersionRequests>(tileVersionRequests_));
    }

    explicit SmartLayerTileVersionRequestList(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit SmartLayerTileVersionRequestList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~SmartLayerTileVersionRequestList() = default;

    SmartLayerTileVersionRequestList(const SmartLayerTileVersionRequestList&) = default;
    SmartLayerTileVersionRequestList& operator=(const SmartLayerTileVersionRequestList&) = default;

    SmartLayerTileVersionRequestList(SmartLayerTileVersionRequestList&&) = default;
    SmartLayerTileVersionRequestList& operator=(SmartLayerTileVersionRequestList&&) = default;

    SmartLayerTileVersionRequestList(::zserio::PropagateAllocatorT,
            const SmartLayerTileVersionRequestList& other, const allocator_type& allocator);

    void initializeChildren();

    uint32_t getNumTiles() const;
    void setNumTiles(uint32_t numTiles_);

    const ::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>& getTileVersionRequests() const;
    ::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>& getTileVersionRequests();
    void setTileVersionRequests(const ::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>& tileVersionRequests_);
    void setTileVersionRequests(::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>&& tileVersionRequests_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SmartLayerTileVersionRequestList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_tileVersionRequests
    {
    public:
        using OwnerType = SmartLayerTileVersionRequestList;

        static void initializeElement(SmartLayerTileVersionRequestList& owner,
                ::nds::smart::tile::SmartLayerTileVersionRequest& element, size_t index);
    };

    class ZserioElementFactory_tileVersionRequests
    {
    public:
        using OwnerType = SmartLayerTileVersionRequestList;

        static void create(SmartLayerTileVersionRequestList& owner,
                ::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(SmartLayerTileVersionRequestList& owner,
                ::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>& array,
                ::nds::smart::tile::SmartLayerTileVersionRequest::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_tileVersionRequests = ::zserio::Array<::zserio::vector<::nds::smart::tile::SmartLayerTileVersionRequest>, ::zserio::ObjectArrayTraits<::nds::smart::tile::SmartLayerTileVersionRequest, ZserioElementFactory_tileVersionRequests>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_tileVersionRequests>;

    uint32_t readNumTiles(::zserio::BitStreamReader& in);
    uint32_t readNumTiles(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_tileVersionRequests readTileVersionRequests(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_tileVersionRequests readTileVersionRequests(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint32_t m_numTiles_;
    ZserioArrayType_tileVersionRequests m_tileVersionRequests_;
};

} // namespace tile
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TILE_SMART_LAYER_TILE_VERSION_REQUEST_LIST_H