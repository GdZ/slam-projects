/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_LAYER_LANE_RULES_LAYER_H
#define NDS_RULES_LAYER_LANE_RULES_LAYER_H

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
#include <nds/rules/instantiations/RulesLanePositionAttributeMapList.h>
#include <nds/rules/instantiations/RulesLanePositionAttributeSetList.h>
#include <nds/rules/instantiations/RulesLaneRangeAttributeMapList.h>
#include <nds/rules/instantiations/RulesLaneRangeAttributeSetList.h>
#include <nds/rules/instantiations/RulesLaneTransitionAttributeMapList.h>
#include <nds/rules/instantiations/RulesLaneTransitionAttributeSetList.h>
#include <nds/rules/metadata/LaneRulesLayerContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace rules
{
namespace layer
{

class LaneRulesLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::rules::instantiations::RulesLaneRangeAttributeMapList::ZserioPackingContext& getLaneRangeAttributeMaps()
        {
            return m_laneRangeAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesLanePositionAttributeMapList::ZserioPackingContext& getLanePositionAttributeMaps()
        {
            return m_lanePositionAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesLaneTransitionAttributeMapList::ZserioPackingContext& getLaneTransitionAttributeMaps()
        {
            return m_laneTransitionAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesLaneRangeAttributeSetList::ZserioPackingContext& getLaneRangeAttributeSets()
        {
            return m_laneRangeAttributeSets_;
        }

        ::nds::rules::instantiations::RulesLanePositionAttributeSetList::ZserioPackingContext& getLanePositionAttributeSets()
        {
            return m_lanePositionAttributeSets_;
        }

        ::nds::rules::instantiations::RulesLaneTransitionAttributeSetList::ZserioPackingContext& getLaneTransitionAttributeSets()
        {
            return m_laneTransitionAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::rules::instantiations::RulesLaneRangeAttributeMapList::ZserioPackingContext m_laneRangeAttributeMaps_;
        ::nds::rules::instantiations::RulesLanePositionAttributeMapList::ZserioPackingContext m_lanePositionAttributeMaps_;
        ::nds::rules::instantiations::RulesLaneTransitionAttributeMapList::ZserioPackingContext m_laneTransitionAttributeMaps_;
        ::nds::rules::instantiations::RulesLaneRangeAttributeSetList::ZserioPackingContext m_laneRangeAttributeSets_;
        ::nds::rules::instantiations::RulesLanePositionAttributeSetList::ZserioPackingContext m_lanePositionAttributeSets_;
        ::nds::rules::instantiations::RulesLaneTransitionAttributeSetList::ZserioPackingContext m_laneTransitionAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneRulesLayer() noexcept :
            LaneRulesLayer(allocator_type())
    {}

    explicit LaneRulesLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_laneRangeAttributeMaps = ::nds::rules::instantiations::RulesLaneRangeAttributeMapList,
            typename ZSERIO_T_lanePositionAttributeMaps = ::nds::rules::instantiations::RulesLanePositionAttributeMapList,
            typename ZSERIO_T_laneTransitionAttributeMaps = ::nds::rules::instantiations::RulesLaneTransitionAttributeMapList,
            typename ZSERIO_T_laneRangeAttributeSets = ::nds::rules::instantiations::RulesLaneRangeAttributeSetList,
            typename ZSERIO_T_lanePositionAttributeSets = ::nds::rules::instantiations::RulesLanePositionAttributeSetList,
            typename ZSERIO_T_laneTransitionAttributeSets = ::nds::rules::instantiations::RulesLaneTransitionAttributeSetList>
    LaneRulesLayer(
            ::nds::rules::metadata::LaneRulesLayerContent content_,
            ZSERIO_T_laneRangeAttributeMaps&& laneRangeAttributeMaps_,
            ZSERIO_T_lanePositionAttributeMaps&& lanePositionAttributeMaps_,
            ZSERIO_T_laneTransitionAttributeMaps&& laneTransitionAttributeMaps_,
            ZSERIO_T_laneRangeAttributeSets&& laneRangeAttributeSets_,
            ZSERIO_T_lanePositionAttributeSets&& lanePositionAttributeSets_,
            ZSERIO_T_laneTransitionAttributeSets&& laneTransitionAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            LaneRulesLayer(allocator)
    {
        m_content_ = content_;
        m_laneRangeAttributeMaps_ = ::std::forward<ZSERIO_T_laneRangeAttributeMaps>(laneRangeAttributeMaps_);
        m_lanePositionAttributeMaps_ = ::std::forward<ZSERIO_T_lanePositionAttributeMaps>(lanePositionAttributeMaps_);
        m_laneTransitionAttributeMaps_ = ::std::forward<ZSERIO_T_laneTransitionAttributeMaps>(laneTransitionAttributeMaps_);
        m_laneRangeAttributeSets_ = ::std::forward<ZSERIO_T_laneRangeAttributeSets>(laneRangeAttributeSets_);
        m_lanePositionAttributeSets_ = ::std::forward<ZSERIO_T_lanePositionAttributeSets>(lanePositionAttributeSets_);
        m_laneTransitionAttributeSets_ = ::std::forward<ZSERIO_T_laneTransitionAttributeSets>(laneTransitionAttributeSets_);
    }

    explicit LaneRulesLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneRulesLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneRulesLayer() = default;

    LaneRulesLayer(const LaneRulesLayer& other);
    LaneRulesLayer& operator=(const LaneRulesLayer& other);

    LaneRulesLayer(LaneRulesLayer&& other);
    LaneRulesLayer& operator=(LaneRulesLayer&& other);

    LaneRulesLayer(::zserio::PropagateAllocatorT,
            const LaneRulesLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::rules::metadata::LaneRulesLayerContent getContent() const;
    void setContent(::nds::rules::metadata::LaneRulesLayerContent content_);

    const ::nds::rules::instantiations::RulesLaneRangeAttributeMapList& getLaneRangeAttributeMaps() const;
    ::nds::rules::instantiations::RulesLaneRangeAttributeMapList& getLaneRangeAttributeMaps();
    void setLaneRangeAttributeMaps(const ::nds::rules::instantiations::RulesLaneRangeAttributeMapList& laneRangeAttributeMaps_);
    void setLaneRangeAttributeMaps(::nds::rules::instantiations::RulesLaneRangeAttributeMapList&& laneRangeAttributeMaps_);
    bool isLaneRangeAttributeMapsUsed() const;
    bool isLaneRangeAttributeMapsSet() const;
    void resetLaneRangeAttributeMaps();

    const ::nds::rules::instantiations::RulesLanePositionAttributeMapList& getLanePositionAttributeMaps() const;
    ::nds::rules::instantiations::RulesLanePositionAttributeMapList& getLanePositionAttributeMaps();
    void setLanePositionAttributeMaps(const ::nds::rules::instantiations::RulesLanePositionAttributeMapList& lanePositionAttributeMaps_);
    void setLanePositionAttributeMaps(::nds::rules::instantiations::RulesLanePositionAttributeMapList&& lanePositionAttributeMaps_);
    bool isLanePositionAttributeMapsUsed() const;
    bool isLanePositionAttributeMapsSet() const;
    void resetLanePositionAttributeMaps();

    const ::nds::rules::instantiations::RulesLaneTransitionAttributeMapList& getLaneTransitionAttributeMaps() const;
    ::nds::rules::instantiations::RulesLaneTransitionAttributeMapList& getLaneTransitionAttributeMaps();
    void setLaneTransitionAttributeMaps(const ::nds::rules::instantiations::RulesLaneTransitionAttributeMapList& laneTransitionAttributeMaps_);
    void setLaneTransitionAttributeMaps(::nds::rules::instantiations::RulesLaneTransitionAttributeMapList&& laneTransitionAttributeMaps_);
    bool isLaneTransitionAttributeMapsUsed() const;
    bool isLaneTransitionAttributeMapsSet() const;
    void resetLaneTransitionAttributeMaps();

    const ::nds::rules::instantiations::RulesLaneRangeAttributeSetList& getLaneRangeAttributeSets() const;
    ::nds::rules::instantiations::RulesLaneRangeAttributeSetList& getLaneRangeAttributeSets();
    void setLaneRangeAttributeSets(const ::nds::rules::instantiations::RulesLaneRangeAttributeSetList& laneRangeAttributeSets_);
    void setLaneRangeAttributeSets(::nds::rules::instantiations::RulesLaneRangeAttributeSetList&& laneRangeAttributeSets_);
    bool isLaneRangeAttributeSetsUsed() const;
    bool isLaneRangeAttributeSetsSet() const;
    void resetLaneRangeAttributeSets();

    const ::nds::rules::instantiations::RulesLanePositionAttributeSetList& getLanePositionAttributeSets() const;
    ::nds::rules::instantiations::RulesLanePositionAttributeSetList& getLanePositionAttributeSets();
    void setLanePositionAttributeSets(const ::nds::rules::instantiations::RulesLanePositionAttributeSetList& lanePositionAttributeSets_);
    void setLanePositionAttributeSets(::nds::rules::instantiations::RulesLanePositionAttributeSetList&& lanePositionAttributeSets_);
    bool isLanePositionAttributeSetsUsed() const;
    bool isLanePositionAttributeSetsSet() const;
    void resetLanePositionAttributeSets();

    const ::nds::rules::instantiations::RulesLaneTransitionAttributeSetList& getLaneTransitionAttributeSets() const;
    ::nds::rules::instantiations::RulesLaneTransitionAttributeSetList& getLaneTransitionAttributeSets();
    void setLaneTransitionAttributeSets(const ::nds::rules::instantiations::RulesLaneTransitionAttributeSetList& laneTransitionAttributeSets_);
    void setLaneTransitionAttributeSets(::nds::rules::instantiations::RulesLaneTransitionAttributeSetList&& laneTransitionAttributeSets_);
    bool isLaneTransitionAttributeSetsUsed() const;
    bool isLaneTransitionAttributeSetsSet() const;
    void resetLaneTransitionAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneRulesLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::metadata::LaneRulesLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::rules::metadata::LaneRulesLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneRangeAttributeMapList> readLaneRangeAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneRangeAttributeMapList> readLaneRangeAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLanePositionAttributeMapList> readLanePositionAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLanePositionAttributeMapList> readLanePositionAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneTransitionAttributeMapList> readLaneTransitionAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneTransitionAttributeMapList> readLaneTransitionAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneRangeAttributeSetList> readLaneRangeAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneRangeAttributeSetList> readLaneRangeAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLanePositionAttributeSetList> readLanePositionAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLanePositionAttributeSetList> readLanePositionAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneTransitionAttributeSetList> readLaneTransitionAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneTransitionAttributeSetList> readLaneTransitionAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::rules::metadata::LaneRulesLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneRangeAttributeMapList> m_laneRangeAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLanePositionAttributeMapList> m_lanePositionAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneTransitionAttributeMapList> m_laneTransitionAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneRangeAttributeSetList> m_laneRangeAttributeSets_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLanePositionAttributeSetList> m_lanePositionAttributeSets_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesLaneTransitionAttributeSetList> m_laneTransitionAttributeSets_;
};

} // namespace layer
} // namespace rules
} // namespace nds

#endif // NDS_RULES_LAYER_LANE_RULES_LAYER_H
