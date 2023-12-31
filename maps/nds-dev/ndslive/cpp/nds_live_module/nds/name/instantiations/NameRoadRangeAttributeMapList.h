/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_INSTANTIATIONS_NAME_ROAD_RANGE_ATTRIBUTE_MAP_LIST_H
#define NDS_NAME_INSTANTIATIONS_NAME_ROAD_RANGE_ATTRIBUTE_MAP_LIST_H

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
#include <nds/name/instantiations/NameRoadRangeAttributeMap.h>
#include <nds/name/instantiations/NameRoadRangeAttributeMapListHeader.h>

namespace nds
{
namespace name
{
namespace instantiations
{

class NameRoadRangeAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NameRoadRangeAttributeMapList() noexcept :
            NameRoadRangeAttributeMapList(allocator_type())
    {}

    explicit NameRoadRangeAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>>
    NameRoadRangeAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            NameRoadRangeAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit NameRoadRangeAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit NameRoadRangeAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~NameRoadRangeAttributeMapList() = default;

    NameRoadRangeAttributeMapList(const NameRoadRangeAttributeMapList& other);
    NameRoadRangeAttributeMapList& operator=(const NameRoadRangeAttributeMapList& other);

    NameRoadRangeAttributeMapList(NameRoadRangeAttributeMapList&& other);
    NameRoadRangeAttributeMapList& operator=(NameRoadRangeAttributeMapList&& other);

    NameRoadRangeAttributeMapList(::zserio::PropagateAllocatorT,
            const NameRoadRangeAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader& getHeader() const;
    ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader& header_);
    void setHeader(::nds::name::instantiations::NameRoadRangeAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NameRoadRangeAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = NameRoadRangeAttributeMapList;

        static void initializeElement(NameRoadRangeAttributeMapList& owner,
                ::nds::name::instantiations::NameRoadRangeAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = NameRoadRangeAttributeMapList;

        static void create(NameRoadRangeAttributeMapList& owner,
                ::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(NameRoadRangeAttributeMapList& owner,
                ::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>& array,
                ::nds::name::instantiations::NameRoadRangeAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::name::instantiations::NameRoadRangeAttributeMap>, ::zserio::ObjectArrayTraits<::nds::name::instantiations::NameRoadRangeAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::name::instantiations::NameRoadRangeAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace name
} // namespace nds

#endif // NDS_NAME_INSTANTIATIONS_NAME_ROAD_RANGE_ATTRIBUTE_MAP_LIST_H
