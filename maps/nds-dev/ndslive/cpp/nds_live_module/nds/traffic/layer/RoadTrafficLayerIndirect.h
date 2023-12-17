/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_LAYER_ROAD_TRAFFIC_LAYER_INDIRECT_H
#define NDS_TRAFFIC_LAYER_ROAD_TRAFFIC_LAYER_INDIRECT_H

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
#include <nds/traffic/instantiations/TrafficIndirectRoadRangeAttributeMapList.h>
#include <nds/traffic/instantiations/TrafficIndirectRoadRangeAttributeSetList.h>
#include <nds/traffic/metadata/RoadTrafficLayerContent.h>

namespace nds
{
namespace traffic
{
namespace layer
{

class RoadTrafficLayerIndirect
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::zserio::DeltaContext& getShift()
        {
            return m_shift_;
        }

        ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList::ZserioPackingContext& getRoadRangeAttributeMaps()
        {
            return m_roadRangeAttributeMaps_;
        }

        ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList::ZserioPackingContext& getRoadRangeAttributeSets()
        {
            return m_roadRangeAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::zserio::DeltaContext m_shift_;
        ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList::ZserioPackingContext m_roadRangeAttributeMaps_;
        ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList::ZserioPackingContext m_roadRangeAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadTrafficLayerIndirect() noexcept :
            RoadTrafficLayerIndirect(allocator_type())
    {}

    explicit RoadTrafficLayerIndirect(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_roadRangeAttributeMaps = ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList,
            typename ZSERIO_T_roadRangeAttributeSets = ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList>
    RoadTrafficLayerIndirect(
            ::nds::traffic::metadata::RoadTrafficLayerContent content_,
            ::nds::core::geometry::CoordShift shift_,
            ZSERIO_T_roadRangeAttributeMaps&& roadRangeAttributeMaps_,
            ZSERIO_T_roadRangeAttributeSets&& roadRangeAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            RoadTrafficLayerIndirect(allocator)
    {
        m_content_ = content_;
        m_shift_ = shift_;
        m_roadRangeAttributeMaps_ = ::std::forward<ZSERIO_T_roadRangeAttributeMaps>(roadRangeAttributeMaps_);
        m_roadRangeAttributeSets_ = ::std::forward<ZSERIO_T_roadRangeAttributeSets>(roadRangeAttributeSets_);
    }

    explicit RoadTrafficLayerIndirect(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadTrafficLayerIndirect(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadTrafficLayerIndirect() = default;

    RoadTrafficLayerIndirect(const RoadTrafficLayerIndirect& other);
    RoadTrafficLayerIndirect& operator=(const RoadTrafficLayerIndirect& other);

    RoadTrafficLayerIndirect(RoadTrafficLayerIndirect&& other);
    RoadTrafficLayerIndirect& operator=(RoadTrafficLayerIndirect&& other);

    RoadTrafficLayerIndirect(::zserio::PropagateAllocatorT,
            const RoadTrafficLayerIndirect& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::traffic::metadata::RoadTrafficLayerContent getContent() const;
    void setContent(::nds::traffic::metadata::RoadTrafficLayerContent content_);

    ::nds::core::geometry::CoordShift getShift() const;
    void setShift(::nds::core::geometry::CoordShift shift_);

    const ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList& getRoadRangeAttributeMaps() const;
    ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList& getRoadRangeAttributeMaps();
    void setRoadRangeAttributeMaps(const ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList& roadRangeAttributeMaps_);
    void setRoadRangeAttributeMaps(::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList&& roadRangeAttributeMaps_);
    bool isRoadRangeAttributeMapsUsed() const;
    bool isRoadRangeAttributeMapsSet() const;
    void resetRoadRangeAttributeMaps();

    const ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList& getRoadRangeAttributeSets() const;
    ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList& getRoadRangeAttributeSets();
    void setRoadRangeAttributeSets(const ::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList& roadRangeAttributeSets_);
    void setRoadRangeAttributeSets(::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList&& roadRangeAttributeSets_);
    bool isRoadRangeAttributeSetsUsed() const;
    bool isRoadRangeAttributeSetsSet() const;
    void resetRoadRangeAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadTrafficLayerIndirect& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::traffic::metadata::RoadTrafficLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::traffic::metadata::RoadTrafficLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList> readRoadRangeAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList> readRoadRangeAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList> readRoadRangeAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList> readRoadRangeAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::traffic::metadata::RoadTrafficLayerContent m_content_;
    ::nds::core::geometry::CoordShift m_shift_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeMapList> m_roadRangeAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficIndirectRoadRangeAttributeSetList> m_roadRangeAttributeSets_;
};

} // namespace layer
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_LAYER_ROAD_TRAFFIC_LAYER_INDIRECT_H
