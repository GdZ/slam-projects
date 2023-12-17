/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_METADATA_ROAD_TRAFFIC_LAYER_INDIRECT_METADATA_H
#define NDS_TRAFFIC_METADATA_ROAD_TRAFFIC_LAYER_INDIRECT_METADATA_H

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

#include <nds/core/types/RoadType.h>
#include <nds/traffic/instantiations/TrafficRoadRangeAttributeMetadata.h>
#include <nds/traffic/instantiations/TrafficTransitionAttributeMetadata.h>
#include <nds/traffic/metadata/RoadTrafficLayerContent.h>

namespace nds
{
namespace traffic
{
namespace metadata
{

class RoadTrafficLayerIndirectMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata::ZserioPackingContext& getRoadRangeAttributeMetadata()
        {
            return m_roadRangeAttributeMetadata_;
        }

        ::nds::traffic::instantiations::TrafficTransitionAttributeMetadata::ZserioPackingContext& getTransitionAttributeMetadata()
        {
            return m_transitionAttributeMetadata_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata::ZserioPackingContext m_roadRangeAttributeMetadata_;
        ::nds::traffic::instantiations::TrafficTransitionAttributeMetadata::ZserioPackingContext m_transitionAttributeMetadata_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadTrafficLayerIndirectMetadata() noexcept :
            RoadTrafficLayerIndirectMetadata(allocator_type())
    {}

    explicit RoadTrafficLayerIndirectMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_roadRangeAttributeMetadata = ::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata,
            typename ZSERIO_T_transitionAttributeMetadata = ::nds::traffic::instantiations::TrafficTransitionAttributeMetadata,
            typename ZSERIO_T_coveredRoadTypes = ::zserio::vector<::nds::core::types::RoadType>>
    RoadTrafficLayerIndirectMetadata(
            ::nds::traffic::metadata::RoadTrafficLayerContent content_,
            ZSERIO_T_roadRangeAttributeMetadata&& roadRangeAttributeMetadata_,
            ZSERIO_T_transitionAttributeMetadata&& transitionAttributeMetadata_,
            ZSERIO_T_coveredRoadTypes&& coveredRoadTypes_,
            const allocator_type& allocator = allocator_type()) :
            RoadTrafficLayerIndirectMetadata(allocator)
    {
        m_content_ = content_;
        m_roadRangeAttributeMetadata_ = ::std::forward<ZSERIO_T_roadRangeAttributeMetadata>(roadRangeAttributeMetadata_);
        m_transitionAttributeMetadata_ = ::std::forward<ZSERIO_T_transitionAttributeMetadata>(transitionAttributeMetadata_);
        m_coveredRoadTypes_ = ZserioArrayType_coveredRoadTypes(::std::forward<ZSERIO_T_coveredRoadTypes>(coveredRoadTypes_));
    }

    explicit RoadTrafficLayerIndirectMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadTrafficLayerIndirectMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadTrafficLayerIndirectMetadata() = default;

    RoadTrafficLayerIndirectMetadata(const RoadTrafficLayerIndirectMetadata&) = default;
    RoadTrafficLayerIndirectMetadata& operator=(const RoadTrafficLayerIndirectMetadata&) = default;

    RoadTrafficLayerIndirectMetadata(RoadTrafficLayerIndirectMetadata&&) = default;
    RoadTrafficLayerIndirectMetadata& operator=(RoadTrafficLayerIndirectMetadata&&) = default;

    RoadTrafficLayerIndirectMetadata(::zserio::PropagateAllocatorT,
            const RoadTrafficLayerIndirectMetadata& other, const allocator_type& allocator);

    ::nds::traffic::metadata::RoadTrafficLayerContent getContent() const;
    void setContent(::nds::traffic::metadata::RoadTrafficLayerContent content_);

    const ::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata& getRoadRangeAttributeMetadata() const;
    ::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata& getRoadRangeAttributeMetadata();
    void setRoadRangeAttributeMetadata(const ::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata& roadRangeAttributeMetadata_);
    void setRoadRangeAttributeMetadata(::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata&& roadRangeAttributeMetadata_);
    bool isRoadRangeAttributeMetadataUsed() const;
    bool isRoadRangeAttributeMetadataSet() const;
    void resetRoadRangeAttributeMetadata();

    const ::nds::traffic::instantiations::TrafficTransitionAttributeMetadata& getTransitionAttributeMetadata() const;
    ::nds::traffic::instantiations::TrafficTransitionAttributeMetadata& getTransitionAttributeMetadata();
    void setTransitionAttributeMetadata(const ::nds::traffic::instantiations::TrafficTransitionAttributeMetadata& transitionAttributeMetadata_);
    void setTransitionAttributeMetadata(::nds::traffic::instantiations::TrafficTransitionAttributeMetadata&& transitionAttributeMetadata_);
    bool isTransitionAttributeMetadataUsed() const;
    bool isTransitionAttributeMetadataSet() const;
    void resetTransitionAttributeMetadata();

    const ::zserio::vector<::nds::core::types::RoadType>& getCoveredRoadTypes() const;
    ::zserio::vector<::nds::core::types::RoadType>& getCoveredRoadTypes();
    void setCoveredRoadTypes(const ::zserio::vector<::nds::core::types::RoadType>& coveredRoadTypes_);
    void setCoveredRoadTypes(::zserio::vector<::nds::core::types::RoadType>&& coveredRoadTypes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadTrafficLayerIndirectMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_coveredRoadTypes
    {
    public:
        using OwnerType = RoadTrafficLayerIndirectMetadata;

        static void create(RoadTrafficLayerIndirectMetadata& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RoadTrafficLayerIndirectMetadata& owner,
                ::zserio::vector<::nds::core::types::RoadType>& array,
                ::nds::core::types::RoadType::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_coveredRoadTypes = ::zserio::Array<::zserio::vector<::nds::core::types::RoadType>, ::zserio::ObjectArrayTraits<::nds::core::types::RoadType, ZserioElementFactory_coveredRoadTypes>, ::zserio::ArrayType::AUTO>;

    ::nds::traffic::metadata::RoadTrafficLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::traffic::metadata::RoadTrafficLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata> readRoadRangeAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata> readRoadRangeAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficTransitionAttributeMetadata> readTransitionAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficTransitionAttributeMetadata> readTransitionAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_coveredRoadTypes readCoveredRoadTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_coveredRoadTypes readCoveredRoadTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::traffic::metadata::RoadTrafficLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficRoadRangeAttributeMetadata> m_roadRangeAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficTransitionAttributeMetadata> m_transitionAttributeMetadata_;
    ZserioArrayType_coveredRoadTypes m_coveredRoadTypes_;
};

} // namespace metadata
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_METADATA_ROAD_TRAFFIC_LAYER_INDIRECT_METADATA_H
