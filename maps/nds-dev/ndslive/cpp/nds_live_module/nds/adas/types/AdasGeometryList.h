/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_TYPES_ADAS_GEOMETRY_LIST_H
#define NDS_ADAS_TYPES_ADAS_GEOMETRY_LIST_H

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
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/Line2D.h>
#include <nds/road/reference/types/RoadId.h>

namespace nds
{
namespace adas
{
namespace types
{

class AdasGeometryList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumRoadReferences()
        {
            return m_numRoadReferences_;
        }

    private:
        ::zserio::DeltaContext m_numRoadReferences_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AdasGeometryList() noexcept :
            AdasGeometryList(allocator_type())
    {}

    explicit AdasGeometryList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_road = ::zserio::vector<::nds::road::reference::types::RoadId>,
            typename ZSERIO_T_adasGeometry = ::zserio::vector<::nds::core::geometry::Line2D>>
    AdasGeometryList(
            uint32_t numRoadReferences_,
            ZSERIO_T_road&& road_,
            ZSERIO_T_adasGeometry&& adasGeometry_,
            const allocator_type& allocator = allocator_type()) :
            AdasGeometryList(allocator)
    {
        m_numRoadReferences_ = numRoadReferences_;
        m_road_ = ZserioArrayType_road(::std::forward<ZSERIO_T_road>(road_));
        m_adasGeometry_ = ZserioArrayType_adasGeometry(::std::forward<ZSERIO_T_adasGeometry>(adasGeometry_));
    }

    explicit AdasGeometryList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());
    explicit AdasGeometryList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());

    ~AdasGeometryList() = default;

    AdasGeometryList(const AdasGeometryList& other);
    AdasGeometryList& operator=(const AdasGeometryList& other);

    AdasGeometryList(AdasGeometryList&& other);
    AdasGeometryList& operator=(AdasGeometryList&& other);

    AdasGeometryList(::zserio::PropagateAllocatorT,
            const AdasGeometryList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift shift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getShift() const;

    uint32_t getNumRoadReferences() const;
    void setNumRoadReferences(uint32_t numRoadReferences_);

    const ::zserio::vector<::nds::road::reference::types::RoadId>& getRoad() const;
    ::zserio::vector<::nds::road::reference::types::RoadId>& getRoad();
    void setRoad(const ::zserio::vector<::nds::road::reference::types::RoadId>& road_);
    void setRoad(::zserio::vector<::nds::road::reference::types::RoadId>&& road_);

    const ::zserio::vector<::nds::core::geometry::Line2D>& getAdasGeometry() const;
    ::zserio::vector<::nds::core::geometry::Line2D>& getAdasGeometry();
    void setAdasGeometry(const ::zserio::vector<::nds::core::geometry::Line2D>& adasGeometry_);
    void setAdasGeometry(::zserio::vector<::nds::core::geometry::Line2D>&& adasGeometry_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdasGeometryList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_road
    {
    public:
        using OwnerType = AdasGeometryList;

        static void create(AdasGeometryList& owner,
                ::zserio::vector<::nds::road::reference::types::RoadId>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasGeometryList& owner,
                ::zserio::vector<::nds::road::reference::types::RoadId>& array,
                ::nds::road::reference::types::RoadId::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_adasGeometry
    {
    public:
        using OwnerType = AdasGeometryList;

        static void initializeElement(AdasGeometryList& owner,
                ::nds::core::geometry::Line2D& element, size_t index);
    };

    class ZserioElementFactory_adasGeometry
    {
    public:
        using OwnerType = AdasGeometryList;

        static void create(AdasGeometryList& owner,
                ::zserio::vector<::nds::core::geometry::Line2D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasGeometryList& owner,
                ::zserio::vector<::nds::core::geometry::Line2D>& array,
                ::nds::core::geometry::Line2D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_road = ::zserio::Array<::zserio::vector<::nds::road::reference::types::RoadId>, ::zserio::ObjectArrayTraits<::nds::road::reference::types::RoadId, ZserioElementFactory_road>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_adasGeometry = ::zserio::Array<::zserio::vector<::nds::core::geometry::Line2D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::Line2D, ZserioElementFactory_adasGeometry>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_adasGeometry>;

    uint32_t readNumRoadReferences(::zserio::BitStreamReader& in);
    uint32_t readNumRoadReferences(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_road readRoad(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_road readRoad(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_adasGeometry readAdasGeometry(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_adasGeometry readAdasGeometry(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_shift_;
    bool m_isInitialized;
    uint32_t m_numRoadReferences_;
    ZserioArrayType_road m_road_;
    ZserioArrayType_adasGeometry m_adasGeometry_;
};

} // namespace types
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_TYPES_ADAS_GEOMETRY_LIST_H
