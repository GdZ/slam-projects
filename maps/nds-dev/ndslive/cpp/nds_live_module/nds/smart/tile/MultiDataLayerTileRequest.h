/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_TILE_MULTI_DATA_LAYER_TILE_REQUEST_H
#define NDS_SMART_TILE_MULTI_DATA_LAYER_TILE_REQUEST_H

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

#include <nds/core/types/TileId.h>
#include <nds/smart/types/DataLayerId.h>
#include <nds/smart/types/DataLayerLifetime.h>

namespace nds
{
namespace smart
{
namespace tile
{

class MultiDataLayerTileRequest
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::types::TileId::ZserioPackingContext& getId()
        {
            return m_id_;
        }

        ::zserio::DeltaContext& getNumDataLayers()
        {
            return m_numDataLayers_;
        }

    private:
        ::nds::core::types::TileId::ZserioPackingContext m_id_;
        ::zserio::DeltaContext m_numDataLayers_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    MultiDataLayerTileRequest() noexcept :
            MultiDataLayerTileRequest(allocator_type())
    {}

    explicit MultiDataLayerTileRequest(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_id = ::nds::core::types::TileId,
            typename ZSERIO_T_layerIds = ::zserio::vector<::nds::smart::types::DataLayerId>,
            typename ZSERIO_T_lifetimeInfo = ::zserio::vector<::nds::smart::types::DataLayerLifetime>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_id, MultiDataLayerTileRequest, allocator_type> = 0>
    MultiDataLayerTileRequest(
            ZSERIO_T_id&& id_,
            uint16_t numDataLayers_,
            ZSERIO_T_layerIds&& layerIds_,
            ZSERIO_T_lifetimeInfo&& lifetimeInfo_,
            const allocator_type& allocator = allocator_type()) :
            MultiDataLayerTileRequest(allocator)
    {
        m_id_ = ::std::forward<ZSERIO_T_id>(id_);
        m_numDataLayers_ = numDataLayers_;
        m_layerIds_ = ZserioArrayType_layerIds(::std::forward<ZSERIO_T_layerIds>(layerIds_));
        m_lifetimeInfo_ = ZserioArrayType_lifetimeInfo(::std::forward<ZSERIO_T_lifetimeInfo>(lifetimeInfo_));
    }

    explicit MultiDataLayerTileRequest(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit MultiDataLayerTileRequest(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~MultiDataLayerTileRequest() = default;

    MultiDataLayerTileRequest(const MultiDataLayerTileRequest&) = default;
    MultiDataLayerTileRequest& operator=(const MultiDataLayerTileRequest&) = default;

    MultiDataLayerTileRequest(MultiDataLayerTileRequest&&) = default;
    MultiDataLayerTileRequest& operator=(MultiDataLayerTileRequest&&) = default;

    MultiDataLayerTileRequest(::zserio::PropagateAllocatorT,
            const MultiDataLayerTileRequest& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::core::types::TileId& getId() const;
    ::nds::core::types::TileId& getId();
    void setId(const ::nds::core::types::TileId& id_);
    void setId(::nds::core::types::TileId&& id_);

    uint16_t getNumDataLayers() const;
    void setNumDataLayers(uint16_t numDataLayers_);

    const ::zserio::vector<::nds::smart::types::DataLayerId>& getLayerIds() const;
    ::zserio::vector<::nds::smart::types::DataLayerId>& getLayerIds();
    void setLayerIds(const ::zserio::vector<::nds::smart::types::DataLayerId>& layerIds_);
    void setLayerIds(::zserio::vector<::nds::smart::types::DataLayerId>&& layerIds_);

    const ::zserio::vector<::nds::smart::types::DataLayerLifetime>& getLifetimeInfo() const;
    ::zserio::vector<::nds::smart::types::DataLayerLifetime>& getLifetimeInfo();
    void setLifetimeInfo(const ::zserio::vector<::nds::smart::types::DataLayerLifetime>& lifetimeInfo_);
    void setLifetimeInfo(::zserio::vector<::nds::smart::types::DataLayerLifetime>&& lifetimeInfo_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const MultiDataLayerTileRequest& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_lifetimeInfo
    {
    public:
        using OwnerType = MultiDataLayerTileRequest;

        static void initializeElement(MultiDataLayerTileRequest& owner,
                ::nds::smart::types::DataLayerLifetime& element, size_t index);
    };

    class ZserioElementFactory_lifetimeInfo
    {
    public:
        using OwnerType = MultiDataLayerTileRequest;

        static void create(MultiDataLayerTileRequest& owner,
                ::zserio::vector<::nds::smart::types::DataLayerLifetime>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(MultiDataLayerTileRequest& owner,
                ::zserio::vector<::nds::smart::types::DataLayerLifetime>& array,
                ::nds::smart::types::DataLayerLifetime::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_layerIds = ::zserio::Array<::zserio::vector<::nds::smart::types::DataLayerId>, ::zserio::VarIntNNArrayTraits<::nds::smart::types::DataLayerId>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_lifetimeInfo = ::zserio::Array<::zserio::vector<::nds::smart::types::DataLayerLifetime>, ::zserio::ObjectArrayTraits<::nds::smart::types::DataLayerLifetime, ZserioElementFactory_lifetimeInfo>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_lifetimeInfo>;

    ::nds::core::types::TileId readId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::TileId readId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    uint16_t readNumDataLayers(::zserio::BitStreamReader& in);
    uint16_t readNumDataLayers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_layerIds readLayerIds(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_layerIds readLayerIds(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_lifetimeInfo readLifetimeInfo(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_lifetimeInfo readLifetimeInfo(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::types::TileId m_id_;
    uint16_t m_numDataLayers_;
    ZserioArrayType_layerIds m_layerIds_;
    ZserioArrayType_lifetimeInfo m_lifetimeInfo_;
};

} // namespace tile
} // namespace smart
} // namespace nds

#endif // NDS_SMART_TILE_MULTI_DATA_LAYER_TILE_REQUEST_H
