/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_ROADSURFACE_ROAD_SURFACE_LINE_MARKING_H
#define NDS_LANE_ROADSURFACE_ROAD_SURFACE_LINE_MARKING_H

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

#include <nds/lane/reference/types/MarkingColor.h>
#include <nds/lane/roadsurface/MarkingWidth.h>
#include <nds/lane/roadsurface/RoadSurfaceLineMarkingType.h>
#include <nds/lane/types/MarkingMaterial.h>

namespace nds
{
namespace lane
{
namespace roadsurface
{

class RoadSurfaceLineMarking
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getMarkingType()
        {
            return m_markingType_;
        }

        ::zserio::DeltaContext& getMarkingColor()
        {
            return m_markingColor_;
        }

        ::zserio::DeltaContext& getMarkingMaterial()
        {
            return m_markingMaterial_;
        }

        ::zserio::DeltaContext& getMarkingWidth()
        {
            return m_markingWidth_;
        }

    private:
        ::zserio::DeltaContext m_markingType_;
        ::zserio::DeltaContext m_markingColor_;
        ::zserio::DeltaContext m_markingMaterial_;
        ::zserio::DeltaContext m_markingWidth_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadSurfaceLineMarking() noexcept :
            RoadSurfaceLineMarking(allocator_type())
    {}

    explicit RoadSurfaceLineMarking(const allocator_type& allocator) noexcept;

    RoadSurfaceLineMarking(
            ::nds::lane::roadsurface::RoadSurfaceLineMarkingType markingType_,
            ::nds::lane::reference::types::MarkingColor markingColor_,
            ::nds::lane::types::MarkingMaterial markingMaterial_,
            ::nds::lane::roadsurface::MarkingWidth markingWidth_,
            const allocator_type& allocator = allocator_type()) :
            RoadSurfaceLineMarking(allocator)
    {
        m_markingType_ = markingType_;
        m_markingColor_ = markingColor_;
        m_markingMaterial_ = markingMaterial_;
        m_markingWidth_ = markingWidth_;
    }

    explicit RoadSurfaceLineMarking(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadSurfaceLineMarking(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadSurfaceLineMarking() = default;

    RoadSurfaceLineMarking(const RoadSurfaceLineMarking&) = default;
    RoadSurfaceLineMarking& operator=(const RoadSurfaceLineMarking&) = default;

    RoadSurfaceLineMarking(RoadSurfaceLineMarking&&) = default;
    RoadSurfaceLineMarking& operator=(RoadSurfaceLineMarking&&) = default;

    RoadSurfaceLineMarking(::zserio::PropagateAllocatorT,
            const RoadSurfaceLineMarking& other, const allocator_type& allocator);

    ::nds::lane::roadsurface::RoadSurfaceLineMarkingType getMarkingType() const;
    void setMarkingType(::nds::lane::roadsurface::RoadSurfaceLineMarkingType markingType_);

    ::nds::lane::reference::types::MarkingColor getMarkingColor() const;
    void setMarkingColor(::nds::lane::reference::types::MarkingColor markingColor_);

    ::nds::lane::types::MarkingMaterial getMarkingMaterial() const;
    void setMarkingMaterial(::nds::lane::types::MarkingMaterial markingMaterial_);

    ::nds::lane::roadsurface::MarkingWidth getMarkingWidth() const;
    void setMarkingWidth(::nds::lane::roadsurface::MarkingWidth markingWidth_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadSurfaceLineMarking& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::roadsurface::RoadSurfaceLineMarkingType readMarkingType(::zserio::BitStreamReader& in);
    ::nds::lane::roadsurface::RoadSurfaceLineMarkingType readMarkingType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::reference::types::MarkingColor readMarkingColor(::zserio::BitStreamReader& in);
    ::nds::lane::reference::types::MarkingColor readMarkingColor(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::types::MarkingMaterial readMarkingMaterial(::zserio::BitStreamReader& in);
    ::nds::lane::types::MarkingMaterial readMarkingMaterial(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::roadsurface::MarkingWidth readMarkingWidth(::zserio::BitStreamReader& in);
    ::nds::lane::roadsurface::MarkingWidth readMarkingWidth(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::lane::roadsurface::RoadSurfaceLineMarkingType m_markingType_;
    ::nds::lane::reference::types::MarkingColor m_markingColor_;
    ::nds::lane::types::MarkingMaterial m_markingMaterial_;
    ::nds::lane::roadsurface::MarkingWidth m_markingWidth_;
};

} // namespace roadsurface
} // namespace lane
} // namespace nds

#endif // NDS_LANE_ROADSURFACE_ROAD_SURFACE_LINE_MARKING_H
