/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_TYPES_CURVATURE_PATH_ROAD_H
#define NDS_ADAS_TYPES_CURVATURE_PATH_ROAD_H

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

#include <nds/adas/types/CurvaturePointList.h>
#include <nds/road/reference/types/DirectedRoadReference.h>

namespace nds
{
namespace adas
{
namespace types
{

class CurvaturePathRoad
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::road::reference::types::DirectedRoadReference::ZserioPackingContext& getFeatureReference()
        {
            return m_featureReference_;
        }

        ::nds::adas::types::CurvaturePointList::ZserioPackingContext& getCurvaturePoints()
        {
            return m_curvaturePoints_;
        }

    private:
        ::nds::road::reference::types::DirectedRoadReference::ZserioPackingContext m_featureReference_;
        ::nds::adas::types::CurvaturePointList::ZserioPackingContext m_curvaturePoints_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CurvaturePathRoad() noexcept :
            CurvaturePathRoad(allocator_type())
    {}

    explicit CurvaturePathRoad(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_featureReference = ::nds::road::reference::types::DirectedRoadReference,
            typename ZSERIO_T_curvaturePoints = ::nds::adas::types::CurvaturePointList,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_featureReference, CurvaturePathRoad, allocator_type> = 0>
    CurvaturePathRoad(
            ZSERIO_T_featureReference&& featureReference_,
            ZSERIO_T_curvaturePoints&& curvaturePoints_,
            const allocator_type& allocator = allocator_type()) :
            CurvaturePathRoad(allocator)
    {
        m_featureReference_ = ::std::forward<ZSERIO_T_featureReference>(featureReference_);
        m_curvaturePoints_ = ::std::forward<ZSERIO_T_curvaturePoints>(curvaturePoints_);
    }

    explicit CurvaturePathRoad(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit CurvaturePathRoad(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~CurvaturePathRoad() = default;

    CurvaturePathRoad(const CurvaturePathRoad&) = default;
    CurvaturePathRoad& operator=(const CurvaturePathRoad&) = default;

    CurvaturePathRoad(CurvaturePathRoad&&) = default;
    CurvaturePathRoad& operator=(CurvaturePathRoad&&) = default;

    CurvaturePathRoad(::zserio::PropagateAllocatorT,
            const CurvaturePathRoad& other, const allocator_type& allocator);

    const ::nds::road::reference::types::DirectedRoadReference& getFeatureReference() const;
    ::nds::road::reference::types::DirectedRoadReference& getFeatureReference();
    void setFeatureReference(const ::nds::road::reference::types::DirectedRoadReference& featureReference_);
    void setFeatureReference(::nds::road::reference::types::DirectedRoadReference&& featureReference_);

    const ::nds::adas::types::CurvaturePointList& getCurvaturePoints() const;
    ::nds::adas::types::CurvaturePointList& getCurvaturePoints();
    void setCurvaturePoints(const ::nds::adas::types::CurvaturePointList& curvaturePoints_);
    void setCurvaturePoints(::nds::adas::types::CurvaturePointList&& curvaturePoints_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CurvaturePathRoad& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::road::reference::types::DirectedRoadReference readFeatureReference(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::road::reference::types::DirectedRoadReference readFeatureReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::adas::types::CurvaturePointList readCurvaturePoints(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::adas::types::CurvaturePointList readCurvaturePoints(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::road::reference::types::DirectedRoadReference m_featureReference_;
    ::nds::adas::types::CurvaturePointList m_curvaturePoints_;
};

} // namespace types
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_TYPES_CURVATURE_PATH_ROAD_H
