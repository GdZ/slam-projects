/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_PATH_SMART_LAYER_PATH_SEGMENT_H
#define NDS_SMART_PATH_SMART_LAYER_PATH_SEGMENT_H

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
#include <zserio/Vector.h>

#include <nds/core/types/PackedTileId.h>
#include <nds/smart/types/DataLayer.h>
#include <nds/smart/types/SmartLayerHeader.h>

namespace nds
{
namespace smart
{
namespace path
{

class SmartLayerPathSegment
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getTileId()
        {
            return m_tileId_;
        }

    private:
        ::zserio::DeltaContext m_tileId_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    SmartLayerPathSegment() noexcept :
            SmartLayerPathSegment(allocator_type())
    {}

    explicit SmartLayerPathSegment(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_layers = ::zserio::vector<::nds::smart::types::DataLayer>>
    SmartLayerPathSegment(
            ::nds::core::types::PackedTileId tileId_,
            bool completeTileContent_,
            ZSERIO_T_layers&& layers_,
            const allocator_type& allocator = allocator_type()) :
            SmartLayerPathSegment(allocator)
    {
        m_tileId_ = tileId_;
        m_completeTileContent_ = completeTileContent_;
        m_layers_ = ZserioArrayType_layers(::std::forward<ZSERIO_T_layers>(layers_));
    }

    explicit SmartLayerPathSegment(::zserio::BitStreamReader& in,
            ::nds::smart::types::SmartLayerHeader& header_, const allocator_type& allocator = allocator_type());
    explicit SmartLayerPathSegment(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::smart::types::SmartLayerHeader& header_, const allocator_type& allocator = allocator_type());

    ~SmartLayerPathSegment() = default;

    SmartLayerPathSegment(const SmartLayerPathSegment& other);
    SmartLayerPathSegment& operator=(const SmartLayerPathSegment& other);

    SmartLayerPathSegment(SmartLayerPathSegment&& other);
    SmartLayerPathSegment& operator=(SmartLayerPathSegment&& other);

    SmartLayerPathSegment(::zserio::PropagateAllocatorT,
            const SmartLayerPathSegment& other, const allocator_type& allocator);

    void initialize(
            ::nds::smart::types::SmartLayerHeader& header_);
    bool isInitialized() const;

    ::nds::smart::types::SmartLayerHeader& getHeader();
    const ::nds::smart::types::SmartLayerHeader& getHeader() const;

    ::nds::core::types::PackedTileId getTileId() const;
    void setTileId(::nds::core::types::PackedTileId tileId_);

    bool getCompleteTileContent() const;
    void setCompleteTileContent(bool completeTileContent_);

    const ::zserio::vector<::nds::smart::types::DataLayer>& getLayers() const;
    ::zserio::vector<::nds::smart::types::DataLayer>& getLayers();
    void setLayers(const ::zserio::vector<::nds::smart::types::DataLayer>& layers_);
    void setLayers(::zserio::vector<::nds::smart::types::DataLayer>&& layers_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SmartLayerPathSegment& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_layers
    {
    public:
        using OwnerType = SmartLayerPathSegment;

        static void create(SmartLayerPathSegment& owner,
                ::zserio::vector<::nds::smart::types::DataLayer>& array,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_layers = ::zserio::Array<::zserio::vector<::nds::smart::types::DataLayer>, ::zserio::ObjectArrayTraits<::nds::smart::types::DataLayer, ZserioElementFactory_layers>, ::zserio::ArrayType::NORMAL>;

    ::nds::core::types::PackedTileId readTileId(::zserio::BitStreamReader& in);
    ::nds::core::types::PackedTileId readTileId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readCompleteTileContent(::zserio::BitStreamReader& in);
    ZserioArrayType_layers readLayers(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::smart::types::SmartLayerHeader* m_header_;
    bool m_isInitialized;
    ::nds::core::types::PackedTileId m_tileId_;
    bool m_completeTileContent_;
    ZserioArrayType_layers m_layers_;
};

} // namespace path
} // namespace smart
} // namespace nds

#endif // NDS_SMART_PATH_SMART_LAYER_PATH_SEGMENT_H
