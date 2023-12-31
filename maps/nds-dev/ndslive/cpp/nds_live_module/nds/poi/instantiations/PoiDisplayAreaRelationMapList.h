/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_INSTANTIATIONS_POI_DISPLAY_AREA_RELATION_MAP_LIST_H
#define NDS_POI_INSTANTIATIONS_POI_DISPLAY_AREA_RELATION_MAP_LIST_H

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
#include <nds/poi/instantiations/PoiDisplayAreaRelationMap.h>
#include <nds/poi/instantiations/PoiDisplayAreaRelationMapListHeader.h>

namespace nds
{
namespace poi
{
namespace instantiations
{

class PoiDisplayAreaRelationMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiDisplayAreaRelationMapList() noexcept :
            PoiDisplayAreaRelationMapList(allocator_type())
    {}

    explicit PoiDisplayAreaRelationMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>>
    PoiDisplayAreaRelationMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            PoiDisplayAreaRelationMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit PoiDisplayAreaRelationMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit PoiDisplayAreaRelationMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~PoiDisplayAreaRelationMapList() = default;

    PoiDisplayAreaRelationMapList(const PoiDisplayAreaRelationMapList& other);
    PoiDisplayAreaRelationMapList& operator=(const PoiDisplayAreaRelationMapList& other);

    PoiDisplayAreaRelationMapList(PoiDisplayAreaRelationMapList&& other);
    PoiDisplayAreaRelationMapList& operator=(PoiDisplayAreaRelationMapList&& other);

    PoiDisplayAreaRelationMapList(::zserio::PropagateAllocatorT,
            const PoiDisplayAreaRelationMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader& getHeader() const;
    ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader& getHeader();
    void setHeader(const ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader& header_);
    void setHeader(::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader&& header_);

    const ::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>& getMaps() const;
    ::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>& maps_);
    void setMaps(::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiDisplayAreaRelationMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = PoiDisplayAreaRelationMapList;

        static void initializeElement(PoiDisplayAreaRelationMapList& owner,
                ::nds::poi::instantiations::PoiDisplayAreaRelationMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = PoiDisplayAreaRelationMapList;

        static void create(PoiDisplayAreaRelationMapList& owner,
                ::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiDisplayAreaRelationMapList& owner,
                ::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>& array,
                ::nds::poi::instantiations::PoiDisplayAreaRelationMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::poi::instantiations::PoiDisplayAreaRelationMap>, ::zserio::ObjectArrayTraits<::nds::poi::instantiations::PoiDisplayAreaRelationMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::poi::instantiations::PoiDisplayAreaRelationMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace poi
} // namespace nds

#endif // NDS_POI_INSTANTIATIONS_POI_DISPLAY_AREA_RELATION_MAP_LIST_H
