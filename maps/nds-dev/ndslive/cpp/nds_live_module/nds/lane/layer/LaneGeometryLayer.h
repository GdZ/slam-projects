/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_LAYER_LANE_GEOMETRY_LAYER_H
#define NDS_LANE_LAYER_LANE_GEOMETRY_LAYER_H

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

#include <nds/core/geometry/GeometryLayerType.h>
#include <nds/lane/instantiations/BoundaryGeometryLayer.h>
#include <nds/lane/instantiations/CenterLineGeometryLayer.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace lane
{
namespace layer
{

class LaneGeometryLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::lane::instantiations::CenterLineGeometryLayer::ZserioPackingContext& getCenterLineGeometryLayer()
        {
            return m_centerLineGeometryLayer_;
        }

        ::nds::lane::instantiations::BoundaryGeometryLayer::ZserioPackingContext& getBoundaryGeometryLayer()
        {
            return m_boundaryGeometryLayer_;
        }

    private:
        ::nds::lane::instantiations::CenterLineGeometryLayer::ZserioPackingContext m_centerLineGeometryLayer_;
        ::nds::lane::instantiations::BoundaryGeometryLayer::ZserioPackingContext m_boundaryGeometryLayer_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneGeometryLayer() noexcept :
            LaneGeometryLayer(allocator_type())
    {}

    explicit LaneGeometryLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_centerLineGeometryLayer = ::nds::lane::instantiations::CenterLineGeometryLayer,
            typename ZSERIO_T_boundaryGeometryLayer = ::nds::lane::instantiations::BoundaryGeometryLayer,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_centerLineGeometryLayer, LaneGeometryLayer, allocator_type> = 0>
    LaneGeometryLayer(
            ZSERIO_T_centerLineGeometryLayer&& centerLineGeometryLayer_,
            ZSERIO_T_boundaryGeometryLayer&& boundaryGeometryLayer_,
            const allocator_type& allocator = allocator_type()) :
            LaneGeometryLayer(allocator)
    {
        m_centerLineGeometryLayer_ = ::std::forward<ZSERIO_T_centerLineGeometryLayer>(centerLineGeometryLayer_);
        m_boundaryGeometryLayer_ = ::std::forward<ZSERIO_T_boundaryGeometryLayer>(boundaryGeometryLayer_);
    }

    explicit LaneGeometryLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneGeometryLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneGeometryLayer() = default;

    LaneGeometryLayer(const LaneGeometryLayer& other);
    LaneGeometryLayer& operator=(const LaneGeometryLayer& other);

    LaneGeometryLayer(LaneGeometryLayer&& other);
    LaneGeometryLayer& operator=(LaneGeometryLayer&& other);

    LaneGeometryLayer(::zserio::PropagateAllocatorT,
            const LaneGeometryLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::lane::instantiations::CenterLineGeometryLayer& getCenterLineGeometryLayer() const;
    ::nds::lane::instantiations::CenterLineGeometryLayer& getCenterLineGeometryLayer();
    void setCenterLineGeometryLayer(const ::nds::lane::instantiations::CenterLineGeometryLayer& centerLineGeometryLayer_);
    void setCenterLineGeometryLayer(::nds::lane::instantiations::CenterLineGeometryLayer&& centerLineGeometryLayer_);

    const ::nds::lane::instantiations::BoundaryGeometryLayer& getBoundaryGeometryLayer() const;
    ::nds::lane::instantiations::BoundaryGeometryLayer& getBoundaryGeometryLayer();
    void setBoundaryGeometryLayer(const ::nds::lane::instantiations::BoundaryGeometryLayer& boundaryGeometryLayer_);
    void setBoundaryGeometryLayer(::nds::lane::instantiations::BoundaryGeometryLayer&& boundaryGeometryLayer_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneGeometryLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::instantiations::CenterLineGeometryLayer readCenterLineGeometryLayer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::instantiations::CenterLineGeometryLayer readCenterLineGeometryLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::lane::instantiations::BoundaryGeometryLayer readBoundaryGeometryLayer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::instantiations::BoundaryGeometryLayer readBoundaryGeometryLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::lane::instantiations::CenterLineGeometryLayer m_centerLineGeometryLayer_;
    ::nds::lane::instantiations::BoundaryGeometryLayer m_boundaryGeometryLayer_;
};

} // namespace layer
} // namespace lane
} // namespace nds

#endif // NDS_LANE_LAYER_LANE_GEOMETRY_LAYER_H
