/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_METADATA_FEATURE_LAYER_METADATA_H
#define NDS_ROAD_METADATA_FEATURE_LAYER_METADATA_H

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

#include <nds/core/types/RoadType.h>
#include <nds/road/metadata/FeatureLayerType.h>

namespace nds
{
namespace road
{
namespace metadata
{

class FeatureLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLayerType()
        {
            return m_layerType_;
        }

    private:
        ::zserio::DeltaContext m_layerType_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    FeatureLayerMetadata() noexcept :
            FeatureLayerMetadata(allocator_type())
    {}

    explicit FeatureLayerMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_includedRoadTypes = ::zserio::vector<::nds::core::types::RoadType>>
    FeatureLayerMetadata(
            ::nds::road::metadata::FeatureLayerType layerType_,
            ZSERIO_T_includedRoadTypes&& includedRoadTypes_,
            const allocator_type& allocator = allocator_type()) :
            FeatureLayerMetadata(allocator)
    {
        m_layerType_ = layerType_;
        m_includedRoadTypes_ = ZserioArrayType_includedRoadTypes(::std::forward<ZSERIO_T_includedRoadTypes>(includedRoadTypes_));
    }

    explicit FeatureLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit FeatureLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~FeatureLayerMetadata() = default;

    FeatureLayerMetadata(const FeatureLayerMetadata&) = default;
    FeatureLayerMetadata& operator=(const FeatureLayerMetadata&) = default;

    FeatureLayerMetadata(FeatureLayerMetadata&&) = default;
    FeatureLayerMetadata& operator=(FeatureLayerMetadata&&) = default;

    FeatureLayerMetadata(::zserio::PropagateAllocatorT,
            const FeatureLayerMetadata& other, const allocator_type& allocator);

    ::nds::road::metadata::FeatureLayerType getLayerType() const;
    void setLayerType(::nds::road::metadata::FeatureLayerType layerType_);

    const ::zserio::vector<::nds::core::types::RoadType>& getIncludedRoadTypes() const;
    ::zserio::vector<::nds::core::types::RoadType>& getIncludedRoadTypes();
    void setIncludedRoadTypes(const ::zserio::vector<::nds::core::types::RoadType>& includedRoadTypes_);
    void setIncludedRoadTypes(::zserio::vector<::nds::core::types::RoadType>&& includedRoadTypes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const FeatureLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_includedRoadTypes
    {
    public:
        using OwnerType = FeatureLayerMetadata;

        static void create(FeatureLayerMetadata& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(FeatureLayerMetadata& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::nds::core::types::RoadType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_includedRoadTypes = ::zserio::Array<::zserio::vector<::nds::core::types::RoadType>, ::zserio::ObjectArrayTraits<::nds::core::types::RoadType, ZserioElementFactory_includedRoadTypes>, ::zserio::ArrayType::AUTO>;

    ::nds::road::metadata::FeatureLayerType readLayerType(::zserio::BitStreamReader& in);
    ::nds::road::metadata::FeatureLayerType readLayerType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_includedRoadTypes readIncludedRoadTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_includedRoadTypes readIncludedRoadTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::road::metadata::FeatureLayerType m_layerType_;
    ZserioArrayType_includedRoadTypes m_includedRoadTypes_;
};

} // namespace metadata
} // namespace road
} // namespace nds

#endif // NDS_ROAD_METADATA_FEATURE_LAYER_METADATA_H