/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTINGDATA_LAYER_LANE_ROUTING_LAYER_H
#define NDS_ROUTINGDATA_LAYER_LANE_ROUTING_LAYER_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/routingdata/instantiations/RoutingLaneRangeAttributeMapList.h>
#include <nds/routingdata/instantiations/RoutingLaneRangeAttributeSetList.h>
#include <nds/routingdata/instantiations/RoutingLaneTransitionAttributeMapList.h>
#include <nds/routingdata/instantiations/RoutingLaneTransitionAttributeSetList.h>
#include <nds/routingdata/metadata/LaneRoutingLayerContent.h>
#include <nds/routingdata/types/SpeedProfile.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace routingdata
{
namespace layer
{

class LaneRoutingLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList::ZserioPackingContext& getRoutingLaneRangeMaps()
        {
            return m_routingLaneRangeMaps_;
        }

        ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList::ZserioPackingContext& getRoutingTransitionMaps()
        {
            return m_routingTransitionMaps_;
        }

        ::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList::ZserioPackingContext& getRoutingLaneRangeSets()
        {
            return m_routingLaneRangeSets_;
        }

        ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList::ZserioPackingContext& getRoutingTransitionSets()
        {
            return m_routingTransitionSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList::ZserioPackingContext m_routingLaneRangeMaps_;
        ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList::ZserioPackingContext m_routingTransitionMaps_;
        ::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList::ZserioPackingContext m_routingLaneRangeSets_;
        ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList::ZserioPackingContext m_routingTransitionSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneRoutingLayer() noexcept :
            LaneRoutingLayer(allocator_type())
    {}

    explicit LaneRoutingLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_routingLaneRangeMaps = ::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList,
            typename ZSERIO_T_routingTransitionMaps = ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList,
            typename ZSERIO_T_routingLaneRangeSets = ::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList,
            typename ZSERIO_T_routingTransitionSets = ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList,
            typename ZSERIO_T_profiles = ::zserio::vector<::nds::routingdata::types::SpeedProfile>>
    LaneRoutingLayer(
            ::nds::routingdata::metadata::LaneRoutingLayerContent content_,
            ZSERIO_T_routingLaneRangeMaps&& routingLaneRangeMaps_,
            ZSERIO_T_routingTransitionMaps&& routingTransitionMaps_,
            ZSERIO_T_routingLaneRangeSets&& routingLaneRangeSets_,
            ZSERIO_T_routingTransitionSets&& routingTransitionSets_,
            ZSERIO_T_profiles&& profiles_,
            const allocator_type& allocator = allocator_type()) :
            LaneRoutingLayer(allocator)
    {
        m_content_ = content_;
        m_routingLaneRangeMaps_ = ::std::forward<ZSERIO_T_routingLaneRangeMaps>(routingLaneRangeMaps_);
        m_routingTransitionMaps_ = ::std::forward<ZSERIO_T_routingTransitionMaps>(routingTransitionMaps_);
        m_routingLaneRangeSets_ = ::std::forward<ZSERIO_T_routingLaneRangeSets>(routingLaneRangeSets_);
        m_routingTransitionSets_ = ::std::forward<ZSERIO_T_routingTransitionSets>(routingTransitionSets_);
        m_profiles_ = ::zserio::createOptionalArray<ZserioArrayType_profiles>(::std::forward<ZSERIO_T_profiles>(profiles_));
    }

    explicit LaneRoutingLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneRoutingLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneRoutingLayer() = default;

    LaneRoutingLayer(const LaneRoutingLayer& other);
    LaneRoutingLayer& operator=(const LaneRoutingLayer& other);

    LaneRoutingLayer(LaneRoutingLayer&& other);
    LaneRoutingLayer& operator=(LaneRoutingLayer&& other);

    LaneRoutingLayer(::zserio::PropagateAllocatorT,
            const LaneRoutingLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::routingdata::metadata::LaneRoutingLayerContent getContent() const;
    void setContent(::nds::routingdata::metadata::LaneRoutingLayerContent content_);

    const ::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList& getRoutingLaneRangeMaps() const;
    ::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList& getRoutingLaneRangeMaps();
    void setRoutingLaneRangeMaps(const ::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList& routingLaneRangeMaps_);
    void setRoutingLaneRangeMaps(::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList&& routingLaneRangeMaps_);
    bool isRoutingLaneRangeMapsUsed() const;
    bool isRoutingLaneRangeMapsSet() const;
    void resetRoutingLaneRangeMaps();

    const ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList& getRoutingTransitionMaps() const;
    ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList& getRoutingTransitionMaps();
    void setRoutingTransitionMaps(const ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList& routingTransitionMaps_);
    void setRoutingTransitionMaps(::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList&& routingTransitionMaps_);
    bool isRoutingTransitionMapsUsed() const;
    bool isRoutingTransitionMapsSet() const;
    void resetRoutingTransitionMaps();

    const ::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList& getRoutingLaneRangeSets() const;
    ::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList& getRoutingLaneRangeSets();
    void setRoutingLaneRangeSets(const ::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList& routingLaneRangeSets_);
    void setRoutingLaneRangeSets(::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList&& routingLaneRangeSets_);
    bool isRoutingLaneRangeSetsUsed() const;
    bool isRoutingLaneRangeSetsSet() const;
    void resetRoutingLaneRangeSets();

    const ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList& getRoutingTransitionSets() const;
    ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList& getRoutingTransitionSets();
    void setRoutingTransitionSets(const ::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList& routingTransitionSets_);
    void setRoutingTransitionSets(::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList&& routingTransitionSets_);
    bool isRoutingTransitionSetsUsed() const;
    bool isRoutingTransitionSetsSet() const;
    void resetRoutingTransitionSets();

    const ::zserio::vector<::nds::routingdata::types::SpeedProfile>& getProfiles() const;
    ::zserio::vector<::nds::routingdata::types::SpeedProfile>& getProfiles();
    void setProfiles(const ::zserio::vector<::nds::routingdata::types::SpeedProfile>& profiles_);
    void setProfiles(::zserio::vector<::nds::routingdata::types::SpeedProfile>&& profiles_);
    bool isProfilesUsed() const;
    bool isProfilesSet() const;
    void resetProfiles();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneRoutingLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_profiles
    {
    public:
        using OwnerType = LaneRoutingLayer;

        static void create(LaneRoutingLayer& owner,
                ::zserio::vector<::nds::routingdata::types::SpeedProfile>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(LaneRoutingLayer& owner,
                ::zserio::vector<::nds::routingdata::types::SpeedProfile>& array,
                ::nds::routingdata::types::SpeedProfile::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_profiles = ::zserio::Array<::zserio::vector<::nds::routingdata::types::SpeedProfile>, ::zserio::ObjectArrayTraits<::nds::routingdata::types::SpeedProfile, ZserioElementFactory_profiles>, ::zserio::ArrayType::AUTO>;

    ::nds::routingdata::metadata::LaneRoutingLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::routingdata::metadata::LaneRoutingLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList> readRoutingLaneRangeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList> readRoutingLaneRangeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList> readRoutingTransitionMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList> readRoutingTransitionMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList> readRoutingLaneRangeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList> readRoutingLaneRangeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList> readRoutingTransitionSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList> readRoutingTransitionSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_profiles> readProfiles(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_profiles> readProfiles(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::routingdata::metadata::LaneRoutingLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneRangeAttributeMapList> m_routingLaneRangeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneTransitionAttributeMapList> m_routingTransitionMaps_;
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneRangeAttributeSetList> m_routingLaneRangeSets_;
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingLaneTransitionAttributeSetList> m_routingTransitionSets_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_profiles> m_profiles_;
};

} // namespace layer
} // namespace routingdata
} // namespace nds

#endif // NDS_ROUTINGDATA_LAYER_LANE_ROUTING_LAYER_H
