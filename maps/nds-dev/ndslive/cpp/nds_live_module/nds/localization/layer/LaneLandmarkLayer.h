/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_LAYER_LANE_LANDMARK_LAYER_H
#define NDS_LOCALIZATION_LAYER_LANE_LANDMARK_LAYER_H

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
#include <nds/localization/instantiations/LandmarkLaneAttributeMapList.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace localization
{
namespace layer
{

class LaneLandmarkLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::localization::instantiations::LandmarkLaneAttributeMapList::ZserioPackingContext& getLaneAttributeMaps()
        {
            return m_laneAttributeMaps_;
        }

    private:
        ::nds::localization::instantiations::LandmarkLaneAttributeMapList::ZserioPackingContext m_laneAttributeMaps_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneLandmarkLayer() noexcept :
            LaneLandmarkLayer(allocator_type())
    {}

    explicit LaneLandmarkLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_laneAttributeMaps = ::nds::localization::instantiations::LandmarkLaneAttributeMapList,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_laneAttributeMaps, LaneLandmarkLayer, allocator_type> = 0>
    explicit LaneLandmarkLayer(
            ZSERIO_T_laneAttributeMaps&& laneAttributeMaps_,
            const allocator_type& allocator = allocator_type()) :
            LaneLandmarkLayer(allocator)
    {
        m_laneAttributeMaps_ = ::std::forward<ZSERIO_T_laneAttributeMaps>(laneAttributeMaps_);
    }

    explicit LaneLandmarkLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneLandmarkLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneLandmarkLayer() = default;

    LaneLandmarkLayer(const LaneLandmarkLayer& other);
    LaneLandmarkLayer& operator=(const LaneLandmarkLayer& other);

    LaneLandmarkLayer(LaneLandmarkLayer&& other);
    LaneLandmarkLayer& operator=(LaneLandmarkLayer&& other);

    LaneLandmarkLayer(::zserio::PropagateAllocatorT,
            const LaneLandmarkLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::localization::instantiations::LandmarkLaneAttributeMapList& getLaneAttributeMaps() const;
    ::nds::localization::instantiations::LandmarkLaneAttributeMapList& getLaneAttributeMaps();
    void setLaneAttributeMaps(const ::nds::localization::instantiations::LandmarkLaneAttributeMapList& laneAttributeMaps_);
    void setLaneAttributeMaps(::nds::localization::instantiations::LandmarkLaneAttributeMapList&& laneAttributeMaps_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneLandmarkLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::localization::instantiations::LandmarkLaneAttributeMapList readLaneAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::localization::instantiations::LandmarkLaneAttributeMapList readLaneAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::localization::instantiations::LandmarkLaneAttributeMapList m_laneAttributeMaps_;
};

} // namespace layer
} // namespace localization
} // namespace nds

#endif // NDS_LOCALIZATION_LAYER_LANE_LANDMARK_LAYER_H
