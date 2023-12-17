/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_LAYER_ROAD_SURFACE_LANDMARK_LAYER_H
#define NDS_LOCALIZATION_LAYER_ROAD_SURFACE_LANDMARK_LAYER_H

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
#include <nds/localization/instantiations/LandmarkRoadSurfaceAttributeMapList.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace localization
{
namespace layer
{

class RoadSurfaceLandmarkLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList::ZserioPackingContext& getRoadSurfaceAttributeMaps()
        {
            return m_roadSurfaceAttributeMaps_;
        }

    private:
        ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList::ZserioPackingContext m_roadSurfaceAttributeMaps_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadSurfaceLandmarkLayer() noexcept :
            RoadSurfaceLandmarkLayer(allocator_type())
    {}

    explicit RoadSurfaceLandmarkLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_roadSurfaceAttributeMaps = ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_roadSurfaceAttributeMaps, RoadSurfaceLandmarkLayer, allocator_type> = 0>
    explicit RoadSurfaceLandmarkLayer(
            ZSERIO_T_roadSurfaceAttributeMaps&& roadSurfaceAttributeMaps_,
            const allocator_type& allocator = allocator_type()) :
            RoadSurfaceLandmarkLayer(allocator)
    {
        m_roadSurfaceAttributeMaps_ = ::std::forward<ZSERIO_T_roadSurfaceAttributeMaps>(roadSurfaceAttributeMaps_);
    }

    explicit RoadSurfaceLandmarkLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadSurfaceLandmarkLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadSurfaceLandmarkLayer() = default;

    RoadSurfaceLandmarkLayer(const RoadSurfaceLandmarkLayer& other);
    RoadSurfaceLandmarkLayer& operator=(const RoadSurfaceLandmarkLayer& other);

    RoadSurfaceLandmarkLayer(RoadSurfaceLandmarkLayer&& other);
    RoadSurfaceLandmarkLayer& operator=(RoadSurfaceLandmarkLayer&& other);

    RoadSurfaceLandmarkLayer(::zserio::PropagateAllocatorT,
            const RoadSurfaceLandmarkLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList& getRoadSurfaceAttributeMaps() const;
    ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList& getRoadSurfaceAttributeMaps();
    void setRoadSurfaceAttributeMaps(const ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList& roadSurfaceAttributeMaps_);
    void setRoadSurfaceAttributeMaps(::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList&& roadSurfaceAttributeMaps_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadSurfaceLandmarkLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList readRoadSurfaceAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList readRoadSurfaceAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::localization::instantiations::LandmarkRoadSurfaceAttributeMapList m_roadSurfaceAttributeMaps_;
};

} // namespace layer
} // namespace localization
} // namespace nds

#endif // NDS_LOCALIZATION_LAYER_ROAD_SURFACE_LANDMARK_LAYER_H