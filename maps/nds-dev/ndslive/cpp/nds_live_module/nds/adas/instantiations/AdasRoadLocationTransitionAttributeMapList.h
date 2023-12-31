/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_LOCATION_TRANSITION_ATTRIBUTE_MAP_LIST_H
#define NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_LOCATION_TRANSITION_ATTRIBUTE_MAP_LIST_H

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

#include <nds/adas/instantiations/AdasRoadLocationTransitionAttributeMap.h>
#include <nds/adas/instantiations/AdasTransitionAttributeMapListHeader.h>
#include <nds/core/geometry/CoordShift.h>

namespace nds
{
namespace adas
{
namespace instantiations
{

class AdasRoadLocationTransitionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AdasRoadLocationTransitionAttributeMapList() noexcept :
            AdasRoadLocationTransitionAttributeMapList(allocator_type())
    {}

    explicit AdasRoadLocationTransitionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>>
    AdasRoadLocationTransitionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            AdasRoadLocationTransitionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit AdasRoadLocationTransitionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit AdasRoadLocationTransitionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~AdasRoadLocationTransitionAttributeMapList() = default;

    AdasRoadLocationTransitionAttributeMapList(const AdasRoadLocationTransitionAttributeMapList& other);
    AdasRoadLocationTransitionAttributeMapList& operator=(const AdasRoadLocationTransitionAttributeMapList& other);

    AdasRoadLocationTransitionAttributeMapList(AdasRoadLocationTransitionAttributeMapList&& other);
    AdasRoadLocationTransitionAttributeMapList& operator=(AdasRoadLocationTransitionAttributeMapList&& other);

    AdasRoadLocationTransitionAttributeMapList(::zserio::PropagateAllocatorT,
            const AdasRoadLocationTransitionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader& getHeader() const;
    ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader& header_);
    void setHeader(::nds::adas::instantiations::AdasTransitionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdasRoadLocationTransitionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = AdasRoadLocationTransitionAttributeMapList;

        static void initializeElement(AdasRoadLocationTransitionAttributeMapList& owner,
                ::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = AdasRoadLocationTransitionAttributeMapList;

        static void create(AdasRoadLocationTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasRoadLocationTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>& array,
                ::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::adas::instantiations::AdasRoadLocationTransitionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::adas::instantiations::AdasTransitionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_LOCATION_TRANSITION_ATTRIBUTE_MAP_LIST_H
