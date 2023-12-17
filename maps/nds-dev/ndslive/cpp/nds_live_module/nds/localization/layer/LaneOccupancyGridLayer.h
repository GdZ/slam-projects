/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_LAYER_LANE_OCCUPANCY_GRID_LAYER_H
#define NDS_LOCALIZATION_LAYER_LANE_OCCUPANCY_GRID_LAYER_H

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
#include <zserio/ArrayTraits.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/localization/instantiations/OccupancyGridLaneAttributeMapList.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace localization
{
namespace layer
{

class LaneOccupancyGridLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList::ZserioPackingContext& getLaneAttributeMaps()
        {
            return m_laneAttributeMaps_;
        }

    private:
        ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList::ZserioPackingContext m_laneAttributeMaps_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneOccupancyGridLayer() noexcept :
            LaneOccupancyGridLayer(allocator_type())
    {}

    explicit LaneOccupancyGridLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_laneAttributeMaps = ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_laneAttributeMaps, LaneOccupancyGridLayer, allocator_type> = 0>
    explicit LaneOccupancyGridLayer(
            ZSERIO_T_laneAttributeMaps&& laneAttributeMaps_,
            const allocator_type& allocator = allocator_type()) :
            LaneOccupancyGridLayer(allocator)
    {
        m_laneAttributeMaps_ = ::std::forward<ZSERIO_T_laneAttributeMaps>(laneAttributeMaps_);
    }

    explicit LaneOccupancyGridLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneOccupancyGridLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneOccupancyGridLayer() = default;

    LaneOccupancyGridLayer(const LaneOccupancyGridLayer& other);
    LaneOccupancyGridLayer& operator=(const LaneOccupancyGridLayer& other);

    LaneOccupancyGridLayer(LaneOccupancyGridLayer&& other);
    LaneOccupancyGridLayer& operator=(LaneOccupancyGridLayer&& other);

    LaneOccupancyGridLayer(::zserio::PropagateAllocatorT,
            const LaneOccupancyGridLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList& getLaneAttributeMaps() const;
    ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList& getLaneAttributeMaps();
    void setLaneAttributeMaps(const ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList& laneAttributeMaps_);
    void setLaneAttributeMaps(::nds::localization::instantiations::OccupancyGridLaneAttributeMapList&& laneAttributeMaps_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneOccupancyGridLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList readLaneAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList readLaneAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::localization::instantiations::OccupancyGridLaneAttributeMapList m_laneAttributeMaps_;
};

} // namespace layer
} // namespace localization
} // namespace nds

#endif // NDS_LOCALIZATION_LAYER_LANE_OCCUPANCY_GRID_LAYER_H
