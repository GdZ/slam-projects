/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_METADATA_LANE_TRAFFIC_LAYER_INDIRECT_METADATA_H
#define NDS_TRAFFIC_METADATA_LANE_TRAFFIC_LAYER_INDIRECT_METADATA_H

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
#include <zserio/OptionalHolder.h>
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

#include <nds/core/types/LaneType.h>
#include <nds/traffic/instantiations/TrafficLaneRangeAttributeMetadata.h>
#include <nds/traffic/metadata/LaneTrafficLayerContent.h>

namespace nds
{
namespace traffic
{
namespace metadata
{

class LaneTrafficLayerIndirectMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata::ZserioPackingContext& getLaneRangeAttributeMetadata()
        {
            return m_laneRangeAttributeMetadata_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata::ZserioPackingContext m_laneRangeAttributeMetadata_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneTrafficLayerIndirectMetadata() noexcept :
            LaneTrafficLayerIndirectMetadata(allocator_type())
    {}

    explicit LaneTrafficLayerIndirectMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_laneRangeAttributeMetadata = ::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata,
            typename ZSERIO_T_coveredLaneTypes = ::zserio::vector<::nds::core::types::LaneType>>
    LaneTrafficLayerIndirectMetadata(
            ::nds::traffic::metadata::LaneTrafficLayerContent content_,
            ZSERIO_T_laneRangeAttributeMetadata&& laneRangeAttributeMetadata_,
            ZSERIO_T_coveredLaneTypes&& coveredLaneTypes_,
            const allocator_type& allocator = allocator_type()) :
            LaneTrafficLayerIndirectMetadata(allocator)
    {
        m_content_ = content_;
        m_laneRangeAttributeMetadata_ = ::std::forward<ZSERIO_T_laneRangeAttributeMetadata>(laneRangeAttributeMetadata_);
        m_coveredLaneTypes_ = ZserioArrayType_coveredLaneTypes(::std::forward<ZSERIO_T_coveredLaneTypes>(coveredLaneTypes_));
    }

    explicit LaneTrafficLayerIndirectMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneTrafficLayerIndirectMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneTrafficLayerIndirectMetadata() = default;

    LaneTrafficLayerIndirectMetadata(const LaneTrafficLayerIndirectMetadata&) = default;
    LaneTrafficLayerIndirectMetadata& operator=(const LaneTrafficLayerIndirectMetadata&) = default;

    LaneTrafficLayerIndirectMetadata(LaneTrafficLayerIndirectMetadata&&) = default;
    LaneTrafficLayerIndirectMetadata& operator=(LaneTrafficLayerIndirectMetadata&&) = default;

    LaneTrafficLayerIndirectMetadata(::zserio::PropagateAllocatorT,
            const LaneTrafficLayerIndirectMetadata& other, const allocator_type& allocator);

    ::nds::traffic::metadata::LaneTrafficLayerContent getContent() const;
    void setContent(::nds::traffic::metadata::LaneTrafficLayerContent content_);

    const ::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata& getLaneRangeAttributeMetadata() const;
    ::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata& getLaneRangeAttributeMetadata();
    void setLaneRangeAttributeMetadata(const ::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata& laneRangeAttributeMetadata_);
    void setLaneRangeAttributeMetadata(::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata&& laneRangeAttributeMetadata_);
    bool isLaneRangeAttributeMetadataUsed() const;
    bool isLaneRangeAttributeMetadataSet() const;
    void resetLaneRangeAttributeMetadata();

    const ::zserio::vector<::nds::core::types::LaneType>& getCoveredLaneTypes() const;
    ::zserio::vector<::nds::core::types::LaneType>& getCoveredLaneTypes();
    void setCoveredLaneTypes(const ::zserio::vector<::nds::core::types::LaneType>& coveredLaneTypes_);
    void setCoveredLaneTypes(::zserio::vector<::nds::core::types::LaneType>&& coveredLaneTypes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneTrafficLayerIndirectMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_coveredLaneTypes
    {
    public:
        using OwnerType = LaneTrafficLayerIndirectMetadata;

        static void create(LaneTrafficLayerIndirectMetadata& owner,
                ::zserio::vector<::nds::core::types::LaneType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(LaneTrafficLayerIndirectMetadata& owner,
                ::zserio::vector<::nds::core::types::LaneType>& array,
                ::nds::core::types::LaneType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_coveredLaneTypes = ::zserio::Array<::zserio::vector<::nds::core::types::LaneType>, ::zserio::ObjectArrayTraits<::nds::core::types::LaneType, ZserioElementFactory_coveredLaneTypes>, ::zserio::ArrayType::AUTO>;

    ::nds::traffic::metadata::LaneTrafficLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::traffic::metadata::LaneTrafficLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata> readLaneRangeAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata> readLaneRangeAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_coveredLaneTypes readCoveredLaneTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_coveredLaneTypes readCoveredLaneTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::traffic::metadata::LaneTrafficLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeMetadata> m_laneRangeAttributeMetadata_;
    ZserioArrayType_coveredLaneTypes m_coveredLaneTypes_;
};

} // namespace metadata
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_METADATA_LANE_TRAFFIC_LAYER_INDIRECT_METADATA_H
