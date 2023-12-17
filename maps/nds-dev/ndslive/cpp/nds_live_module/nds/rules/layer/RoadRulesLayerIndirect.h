/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_LAYER_ROAD_RULES_LAYER_INDIRECT_H
#define NDS_RULES_LAYER_ROAD_RULES_LAYER_INDIRECT_H

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
#include <nds/rules/instantiations/RulesIndirectRoadPositionAttributeMapList.h>
#include <nds/rules/instantiations/RulesIndirectRoadPositionAttributeSetList.h>
#include <nds/rules/instantiations/RulesIndirectRoadRangeAttributeMapList.h>
#include <nds/rules/instantiations/RulesIndirectRoadRangeAttributeSetList.h>
#include <nds/rules/metadata/RoadRulesLayerContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace rules
{
namespace layer
{

class RoadRulesLayerIndirect
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

        ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList::ZserioPackingContext& getRoadRangeAttributeMaps()
        {
            return m_roadRangeAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList::ZserioPackingContext& getRoadPositionAttributeMaps()
        {
            return m_roadPositionAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList::ZserioPackingContext& getRoadRangeAttributeSets()
        {
            return m_roadRangeAttributeSets_;
        }

        ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList::ZserioPackingContext& getRoadPositionAttributeSets()
        {
            return m_roadPositionAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::zserio::DeltaContext m_shift_;
        ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList::ZserioPackingContext m_roadRangeAttributeMaps_;
        ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList::ZserioPackingContext m_roadPositionAttributeMaps_;
        ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList::ZserioPackingContext m_roadRangeAttributeSets_;
        ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList::ZserioPackingContext m_roadPositionAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadRulesLayerIndirect() noexcept :
            RoadRulesLayerIndirect(allocator_type())
    {}

    explicit RoadRulesLayerIndirect(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_roadRangeAttributeMaps = ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList,
            typename ZSERIO_T_roadPositionAttributeMaps = ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList,
            typename ZSERIO_T_roadRangeAttributeSets = ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList,
            typename ZSERIO_T_roadPositionAttributeSets = ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList>
    RoadRulesLayerIndirect(
            ::nds::rules::metadata::RoadRulesLayerContent content_,
            ::nds::core::geometry::CoordShift shift_,
            ZSERIO_T_roadRangeAttributeMaps&& roadRangeAttributeMaps_,
            ZSERIO_T_roadPositionAttributeMaps&& roadPositionAttributeMaps_,
            ZSERIO_T_roadRangeAttributeSets&& roadRangeAttributeSets_,
            ZSERIO_T_roadPositionAttributeSets&& roadPositionAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            RoadRulesLayerIndirect(allocator)
    {
        m_content_ = content_;
        m_shift_ = shift_;
        m_roadRangeAttributeMaps_ = ::std::forward<ZSERIO_T_roadRangeAttributeMaps>(roadRangeAttributeMaps_);
        m_roadPositionAttributeMaps_ = ::std::forward<ZSERIO_T_roadPositionAttributeMaps>(roadPositionAttributeMaps_);
        m_roadRangeAttributeSets_ = ::std::forward<ZSERIO_T_roadRangeAttributeSets>(roadRangeAttributeSets_);
        m_roadPositionAttributeSets_ = ::std::forward<ZSERIO_T_roadPositionAttributeSets>(roadPositionAttributeSets_);
    }

    explicit RoadRulesLayerIndirect(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadRulesLayerIndirect(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadRulesLayerIndirect() = default;

    RoadRulesLayerIndirect(const RoadRulesLayerIndirect& other);
    RoadRulesLayerIndirect& operator=(const RoadRulesLayerIndirect& other);

    RoadRulesLayerIndirect(RoadRulesLayerIndirect&& other);
    RoadRulesLayerIndirect& operator=(RoadRulesLayerIndirect&& other);

    RoadRulesLayerIndirect(::zserio::PropagateAllocatorT,
            const RoadRulesLayerIndirect& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::rules::metadata::RoadRulesLayerContent getContent() const;
    void setContent(::nds::rules::metadata::RoadRulesLayerContent content_);

    ::nds::core::geometry::CoordShift getShift() const;
    void setShift(::nds::core::geometry::CoordShift shift_);

    const ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList& getRoadRangeAttributeMaps() const;
    ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList& getRoadRangeAttributeMaps();
    void setRoadRangeAttributeMaps(const ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList& roadRangeAttributeMaps_);
    void setRoadRangeAttributeMaps(::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList&& roadRangeAttributeMaps_);
    bool isRoadRangeAttributeMapsUsed() const;
    bool isRoadRangeAttributeMapsSet() const;
    void resetRoadRangeAttributeMaps();

    const ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList& getRoadPositionAttributeMaps() const;
    ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList& getRoadPositionAttributeMaps();
    void setRoadPositionAttributeMaps(const ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList& roadPositionAttributeMaps_);
    void setRoadPositionAttributeMaps(::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList&& roadPositionAttributeMaps_);
    bool isRoadPositionAttributeMapsUsed() const;
    bool isRoadPositionAttributeMapsSet() const;
    void resetRoadPositionAttributeMaps();

    const ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList& getRoadRangeAttributeSets() const;
    ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList& getRoadRangeAttributeSets();
    void setRoadRangeAttributeSets(const ::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList& roadRangeAttributeSets_);
    void setRoadRangeAttributeSets(::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList&& roadRangeAttributeSets_);
    bool isRoadRangeAttributeSetsUsed() const;
    bool isRoadRangeAttributeSetsSet() const;
    void resetRoadRangeAttributeSets();

    const ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList& getRoadPositionAttributeSets() const;
    ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList& getRoadPositionAttributeSets();
    void setRoadPositionAttributeSets(const ::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList& roadPositionAttributeSets_);
    void setRoadPositionAttributeSets(::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList&& roadPositionAttributeSets_);
    bool isRoadPositionAttributeSetsUsed() const;
    bool isRoadPositionAttributeSetsSet() const;
    void resetRoadPositionAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadRulesLayerIndirect& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::metadata::RoadRulesLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::rules::metadata::RoadRulesLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList> readRoadRangeAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList> readRoadRangeAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList> readRoadPositionAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList> readRoadPositionAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList> readRoadRangeAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList> readRoadRangeAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList> readRoadPositionAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList> readRoadPositionAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::rules::metadata::RoadRulesLayerContent m_content_;
    ::nds::core::geometry::CoordShift m_shift_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadRangeAttributeMapList> m_roadRangeAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadPositionAttributeMapList> m_roadPositionAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadRangeAttributeSetList> m_roadRangeAttributeSets_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectRoadPositionAttributeSetList> m_roadPositionAttributeSets_;
};

} // namespace layer
} // namespace rules
} // namespace nds

#endif // NDS_RULES_LAYER_ROAD_RULES_LAYER_INDIRECT_H
