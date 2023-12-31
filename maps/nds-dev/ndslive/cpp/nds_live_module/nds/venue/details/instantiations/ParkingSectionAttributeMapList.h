/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_SECTION_ATTRIBUTE_MAP_LIST_H
#define NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_SECTION_ATTRIBUTE_MAP_LIST_H

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
#include <nds/venue/details/instantiations/ParkingSectionAttributeMap.h>
#include <nds/venue/details/instantiations/ParkingSectionAttributeMapListHeader.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace instantiations
{

class ParkingSectionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingSectionAttributeMapList() noexcept :
            ParkingSectionAttributeMapList(allocator_type())
    {}

    explicit ParkingSectionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>>
    ParkingSectionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            ParkingSectionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit ParkingSectionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit ParkingSectionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~ParkingSectionAttributeMapList() = default;

    ParkingSectionAttributeMapList(const ParkingSectionAttributeMapList& other);
    ParkingSectionAttributeMapList& operator=(const ParkingSectionAttributeMapList& other);

    ParkingSectionAttributeMapList(ParkingSectionAttributeMapList&& other);
    ParkingSectionAttributeMapList& operator=(ParkingSectionAttributeMapList&& other);

    ParkingSectionAttributeMapList(::zserio::PropagateAllocatorT,
            const ParkingSectionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader& getHeader() const;
    ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader& header_);
    void setHeader(::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingSectionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = ParkingSectionAttributeMapList;

        static void initializeElement(ParkingSectionAttributeMapList& owner,
                ::nds::venue::details::instantiations::ParkingSectionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = ParkingSectionAttributeMapList;

        static void create(ParkingSectionAttributeMapList& owner,
                ::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(ParkingSectionAttributeMapList& owner,
                ::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>& array,
                ::nds::venue::details::instantiations::ParkingSectionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::venue::details::instantiations::ParkingSectionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::venue::details::instantiations::ParkingSectionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::venue::details::instantiations::ParkingSectionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_SECTION_ATTRIBUTE_MAP_LIST_H
