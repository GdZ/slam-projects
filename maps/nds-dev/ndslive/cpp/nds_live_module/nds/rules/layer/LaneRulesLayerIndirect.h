/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_LAYER_LANE_RULES_LAYER_INDIRECT_H
#define NDS_RULES_LAYER_LANE_RULES_LAYER_INDIRECT_H

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
#include <nds/rules/instantiations/RulesIndirectLanePositionAttributeMapList.h>
#include <nds/rules/instantiations/RulesIndirectLanePositionAttributeSetList.h>
#include <nds/rules/instantiations/RulesIndirectLaneRangeAttributeMapList.h>
#include <nds/rules/instantiations/RulesIndirectLaneRangeAttributeSetList.h>
#include <nds/rules/metadata/LaneRulesLayerContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace rules
{
namespace layer
{

class LaneRulesLayerIndirect
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList::ZserioPackingContext& getLaneRangeAttributeMaps()
        {
            return m_laneRangeAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList::ZserioPackingContext& getLanePositionAttributeMaps()
        {
            return m_lanePositionAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList::ZserioPackingContext& getLaneRangeAttributeSets()
        {
            return m_laneRangeAttributeSets_;
        }

        ::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList::ZserioPackingContext& getLanePositionAttributeSets()
        {
            return m_lanePositionAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList::ZserioPackingContext m_laneRangeAttributeMaps_;
        ::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList::ZserioPackingContext m_lanePositionAttributeMaps_;
        ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList::ZserioPackingContext m_laneRangeAttributeSets_;
        ::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList::ZserioPackingContext m_lanePositionAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneRulesLayerIndirect() noexcept :
            LaneRulesLayerIndirect(allocator_type())
    {}

    explicit LaneRulesLayerIndirect(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_laneRangeAttributeMaps = ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList,
            typename ZSERIO_T_lanePositionAttributeMaps = ::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList,
            typename ZSERIO_T_laneRangeAttributeSets = ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList,
            typename ZSERIO_T_lanePositionAttributeSets = ::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList>
    LaneRulesLayerIndirect(
            ::nds::rules::metadata::LaneRulesLayerContent content_,
            ZSERIO_T_laneRangeAttributeMaps&& laneRangeAttributeMaps_,
            ZSERIO_T_lanePositionAttributeMaps&& lanePositionAttributeMaps_,
            ZSERIO_T_laneRangeAttributeSets&& laneRangeAttributeSets_,
            ZSERIO_T_lanePositionAttributeSets&& lanePositionAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            LaneRulesLayerIndirect(allocator)
    {
        m_content_ = content_;
        m_laneRangeAttributeMaps_ = ::std::forward<ZSERIO_T_laneRangeAttributeMaps>(laneRangeAttributeMaps_);
        m_lanePositionAttributeMaps_ = ::std::forward<ZSERIO_T_lanePositionAttributeMaps>(lanePositionAttributeMaps_);
        m_laneRangeAttributeSets_ = ::std::forward<ZSERIO_T_laneRangeAttributeSets>(laneRangeAttributeSets_);
        m_lanePositionAttributeSets_ = ::std::forward<ZSERIO_T_lanePositionAttributeSets>(lanePositionAttributeSets_);
    }

    explicit LaneRulesLayerIndirect(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneRulesLayerIndirect(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneRulesLayerIndirect() = default;

    LaneRulesLayerIndirect(const LaneRulesLayerIndirect& other);
    LaneRulesLayerIndirect& operator=(const LaneRulesLayerIndirect& other);

    LaneRulesLayerIndirect(LaneRulesLayerIndirect&& other);
    LaneRulesLayerIndirect& operator=(LaneRulesLayerIndirect&& other);

    LaneRulesLayerIndirect(::zserio::PropagateAllocatorT,
            const LaneRulesLayerIndirect& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::rules::metadata::LaneRulesLayerContent getContent() const;
    void setContent(::nds::rules::metadata::LaneRulesLayerContent content_);

    const ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList& getLaneRangeAttributeMaps() const;
    ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList& getLaneRangeAttributeMaps();
    void setLaneRangeAttributeMaps(const ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList& laneRangeAttributeMaps_);
    void setLaneRangeAttributeMaps(::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList&& laneRangeAttributeMaps_);
    bool isLaneRangeAttributeMapsUsed() const;
    bool isLaneRangeAttributeMapsSet() const;
    void resetLaneRangeAttributeMaps();

    const ::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList& getLanePositionAttributeMaps() const;
    ::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList& getLanePositionAttributeMaps();
    void setLanePositionAttributeMaps(const ::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList& lanePositionAttributeMaps_);
    void setLanePositionAttributeMaps(::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList&& lanePositionAttributeMaps_);
    bool isLanePositionAttributeMapsUsed() const;
    bool isLanePositionAttributeMapsSet() const;
    void resetLanePositionAttributeMaps();

    const ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList& getLaneRangeAttributeSets() const;
    ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList& getLaneRangeAttributeSets();
    void setLaneRangeAttributeSets(const ::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList& laneRangeAttributeSets_);
    void setLaneRangeAttributeSets(::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList&& laneRangeAttributeSets_);
    bool isLaneRangeAttributeSetsUsed() const;
    bool isLaneRangeAttributeSetsSet() const;
    void resetLaneRangeAttributeSets();

    const ::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList& getLanePositionAttributeSets() const;
    ::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList& getLanePositionAttributeSets();
    void setLanePositionAttributeSets(const ::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList& lanePositionAttributeSets_);
    void setLanePositionAttributeSets(::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList&& lanePositionAttributeSets_);
    bool isLanePositionAttributeSetsUsed() const;
    bool isLanePositionAttributeSetsSet() const;
    void resetLanePositionAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneRulesLayerIndirect& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::metadata::LaneRulesLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::rules::metadata::LaneRulesLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList> readLaneRangeAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList> readLaneRangeAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList> readLanePositionAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList> readLanePositionAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList> readLaneRangeAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList> readLaneRangeAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList> readLanePositionAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList> readLanePositionAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::rules::metadata::LaneRulesLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLaneRangeAttributeMapList> m_laneRangeAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLanePositionAttributeMapList> m_lanePositionAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLaneRangeAttributeSetList> m_laneRangeAttributeSets_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesIndirectLanePositionAttributeSetList> m_lanePositionAttributeSets_;
};

} // namespace layer
} // namespace rules
} // namespace nds

#endif // NDS_RULES_LAYER_LANE_RULES_LAYER_INDIRECT_H