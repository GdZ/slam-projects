/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_LAYER_ROAD_SURFACE_LAYER_H
#define NDS_LANE_LAYER_ROAD_SURFACE_LAYER_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

#include <nds/core/geometry/GeometryLayerType.h>
#include <nds/lane/instantiations/RoadSurfaceLineGeometryLayer.h>
#include <nds/lane/instantiations/RoadSurfacePolygonGeometryLayer.h>
#include <nds/lane/roadsurface/RoadSurfaceLaneGroupRelation.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace lane
{
namespace layer
{

class RoadSurfaceLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer::ZserioPackingContext& getRoadSurfacePolygonLayer()
        {
            return m_roadSurfacePolygonLayer_;
        }

        ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer::ZserioPackingContext& getRoadSurfaceLinesLayer()
        {
            return m_roadSurfaceLinesLayer_;
        }

    private:
        ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer::ZserioPackingContext m_roadSurfacePolygonLayer_;
        ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer::ZserioPackingContext m_roadSurfaceLinesLayer_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadSurfaceLayer() noexcept :
            RoadSurfaceLayer(allocator_type())
    {}

    explicit RoadSurfaceLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_roadSurfacePolygonLayer = ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer,
            typename ZSERIO_T_roadSurfaceLinesLayer = ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer,
            typename ZSERIO_T_lanegroupRelations = ::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_roadSurfacePolygonLayer, RoadSurfaceLayer, allocator_type> = 0>
    RoadSurfaceLayer(
            ZSERIO_T_roadSurfacePolygonLayer&& roadSurfacePolygonLayer_,
            ZSERIO_T_roadSurfaceLinesLayer&& roadSurfaceLinesLayer_,
            ZSERIO_T_lanegroupRelations&& lanegroupRelations_,
            const allocator_type& allocator = allocator_type()) :
            RoadSurfaceLayer(allocator)
    {
        m_roadSurfacePolygonLayer_ = ::std::forward<ZSERIO_T_roadSurfacePolygonLayer>(roadSurfacePolygonLayer_);
        m_roadSurfaceLinesLayer_ = ::std::forward<ZSERIO_T_roadSurfaceLinesLayer>(roadSurfaceLinesLayer_);
        m_lanegroupRelations_ = ZserioArrayType_lanegroupRelations(::std::forward<ZSERIO_T_lanegroupRelations>(lanegroupRelations_));
    }

    explicit RoadSurfaceLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadSurfaceLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadSurfaceLayer() = default;

    RoadSurfaceLayer(const RoadSurfaceLayer& other);
    RoadSurfaceLayer& operator=(const RoadSurfaceLayer& other);

    RoadSurfaceLayer(RoadSurfaceLayer&& other);
    RoadSurfaceLayer& operator=(RoadSurfaceLayer&& other);

    RoadSurfaceLayer(::zserio::PropagateAllocatorT,
            const RoadSurfaceLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer& getRoadSurfacePolygonLayer() const;
    ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer& getRoadSurfacePolygonLayer();
    void setRoadSurfacePolygonLayer(const ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer& roadSurfacePolygonLayer_);
    void setRoadSurfacePolygonLayer(::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer&& roadSurfacePolygonLayer_);

    const ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer& getRoadSurfaceLinesLayer() const;
    ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer& getRoadSurfaceLinesLayer();
    void setRoadSurfaceLinesLayer(const ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer& roadSurfaceLinesLayer_);
    void setRoadSurfaceLinesLayer(::nds::lane::instantiations::RoadSurfaceLineGeometryLayer&& roadSurfaceLinesLayer_);

    const ::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>& getLanegroupRelations() const;
    ::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>& getLanegroupRelations();
    void setLanegroupRelations(const ::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>& lanegroupRelations_);
    void setLanegroupRelations(::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>&& lanegroupRelations_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadSurfaceLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_lanegroupRelations
    {
    public:
        using OwnerType = RoadSurfaceLayer;

        static void create(RoadSurfaceLayer& owner,
                ::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RoadSurfaceLayer& owner,
                ::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>& array,
                ::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_lanegroupRelations = ::zserio::Array<::zserio::vector<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation>, ::zserio::ObjectArrayTraits<::nds::lane::roadsurface::RoadSurfaceLaneGroupRelation, ZserioElementFactory_lanegroupRelations>, ::zserio::ArrayType::AUTO>;

    ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer readRoadSurfacePolygonLayer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer readRoadSurfacePolygonLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer readRoadSurfaceLinesLayer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer readRoadSurfaceLinesLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_lanegroupRelations readLanegroupRelations(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_lanegroupRelations readLanegroupRelations(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::lane::instantiations::RoadSurfacePolygonGeometryLayer m_roadSurfacePolygonLayer_;
    ::nds::lane::instantiations::RoadSurfaceLineGeometryLayer m_roadSurfaceLinesLayer_;
    ZserioArrayType_lanegroupRelations m_lanegroupRelations_;
};

} // namespace layer
} // namespace lane
} // namespace nds

#endif // NDS_LANE_LAYER_ROAD_SURFACE_LAYER_H
