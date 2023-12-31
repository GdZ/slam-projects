/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_LAYER_LANE_TRAFFIC_LAYER_H
#define NDS_TRAFFIC_LAYER_LANE_TRAFFIC_LAYER_H

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
#include <zserio/ArrayTraits.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/system/types/LayerType.h>
#include <nds/traffic/instantiations/TrafficLaneRangeAttributeMapList.h>
#include <nds/traffic/instantiations/TrafficLaneRangeAttributeSetList.h>
#include <nds/traffic/metadata/LaneTrafficLayerContent.h>

namespace nds
{
namespace traffic
{
namespace layer
{

class LaneTrafficLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList::ZserioPackingContext& getLaneRangeAttributeMaps()
        {
            return m_laneRangeAttributeMaps_;
        }

        ::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList::ZserioPackingContext& getLaneRangeAttributeSets()
        {
            return m_laneRangeAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList::ZserioPackingContext m_laneRangeAttributeMaps_;
        ::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList::ZserioPackingContext m_laneRangeAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneTrafficLayer() noexcept :
            LaneTrafficLayer(allocator_type())
    {}

    explicit LaneTrafficLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_laneRangeAttributeMaps = ::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList,
            typename ZSERIO_T_laneRangeAttributeSets = ::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList>
    LaneTrafficLayer(
            ::nds::traffic::metadata::LaneTrafficLayerContent content_,
            ZSERIO_T_laneRangeAttributeMaps&& laneRangeAttributeMaps_,
            ZSERIO_T_laneRangeAttributeSets&& laneRangeAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            LaneTrafficLayer(allocator)
    {
        m_content_ = content_;
        m_laneRangeAttributeMaps_ = ::std::forward<ZSERIO_T_laneRangeAttributeMaps>(laneRangeAttributeMaps_);
        m_laneRangeAttributeSets_ = ::std::forward<ZSERIO_T_laneRangeAttributeSets>(laneRangeAttributeSets_);
    }

    explicit LaneTrafficLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneTrafficLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneTrafficLayer() = default;

    LaneTrafficLayer(const LaneTrafficLayer& other);
    LaneTrafficLayer& operator=(const LaneTrafficLayer& other);

    LaneTrafficLayer(LaneTrafficLayer&& other);
    LaneTrafficLayer& operator=(LaneTrafficLayer&& other);

    LaneTrafficLayer(::zserio::PropagateAllocatorT,
            const LaneTrafficLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::traffic::metadata::LaneTrafficLayerContent getContent() const;
    void setContent(::nds::traffic::metadata::LaneTrafficLayerContent content_);

    const ::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList& getLaneRangeAttributeMaps() const;
    ::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList& getLaneRangeAttributeMaps();
    void setLaneRangeAttributeMaps(const ::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList& laneRangeAttributeMaps_);
    void setLaneRangeAttributeMaps(::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList&& laneRangeAttributeMaps_);
    bool isLaneRangeAttributeMapsUsed() const;
    bool isLaneRangeAttributeMapsSet() const;
    void resetLaneRangeAttributeMaps();

    const ::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList& getLaneRangeAttributeSets() const;
    ::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList& getLaneRangeAttributeSets();
    void setLaneRangeAttributeSets(const ::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList& laneRangeAttributeSets_);
    void setLaneRangeAttributeSets(::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList&& laneRangeAttributeSets_);
    bool isLaneRangeAttributeSetsUsed() const;
    bool isLaneRangeAttributeSetsSet() const;
    void resetLaneRangeAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneTrafficLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::traffic::metadata::LaneTrafficLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::traffic::metadata::LaneTrafficLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList> readLaneRangeAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList> readLaneRangeAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList> readLaneRangeAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList> readLaneRangeAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::traffic::metadata::LaneTrafficLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeMapList> m_laneRangeAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficLaneRangeAttributeSetList> m_laneRangeAttributeSets_;
};

} // namespace layer
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_LAYER_LANE_TRAFFIC_LAYER_H
