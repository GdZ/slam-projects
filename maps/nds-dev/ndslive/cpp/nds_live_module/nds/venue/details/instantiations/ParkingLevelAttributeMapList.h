/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_LEVEL_ATTRIBUTE_MAP_LIST_H
#define NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_LEVEL_ATTRIBUTE_MAP_LIST_H

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
#include <nds/venue/details/instantiations/ParkingLevelAttributeMap.h>
#include <nds/venue/details/instantiations/ParkingLevelAttributeMapListHeader.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace instantiations
{

class ParkingLevelAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingLevelAttributeMapList() noexcept :
            ParkingLevelAttributeMapList(allocator_type())
    {}

    explicit ParkingLevelAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>>
    ParkingLevelAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            ParkingLevelAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit ParkingLevelAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit ParkingLevelAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~ParkingLevelAttributeMapList() = default;

    ParkingLevelAttributeMapList(const ParkingLevelAttributeMapList& other);
    ParkingLevelAttributeMapList& operator=(const ParkingLevelAttributeMapList& other);

    ParkingLevelAttributeMapList(ParkingLevelAttributeMapList&& other);
    ParkingLevelAttributeMapList& operator=(ParkingLevelAttributeMapList&& other);

    ParkingLevelAttributeMapList(::zserio::PropagateAllocatorT,
            const ParkingLevelAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader& getHeader() const;
    ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader& header_);
    void setHeader(::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingLevelAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = ParkingLevelAttributeMapList;

        static void initializeElement(ParkingLevelAttributeMapList& owner,
                ::nds::venue::details::instantiations::ParkingLevelAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = ParkingLevelAttributeMapList;

        static void create(ParkingLevelAttributeMapList& owner,
                ::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(ParkingLevelAttributeMapList& owner,
                ::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>& array,
                ::nds::venue::details::instantiations::ParkingLevelAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::venue::details::instantiations::ParkingLevelAttributeMap>, ::zserio::ObjectArrayTraits<::nds::venue::details::instantiations::ParkingLevelAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::venue::details::instantiations::ParkingLevelAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_LEVEL_ATTRIBUTE_MAP_LIST_H
