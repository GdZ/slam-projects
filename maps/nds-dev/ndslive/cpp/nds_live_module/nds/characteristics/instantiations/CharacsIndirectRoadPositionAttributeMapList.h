/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_INDIRECT_ROAD_POSITION_ATTRIBUTE_MAP_LIST_H
#define NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_INDIRECT_ROAD_POSITION_ATTRIBUTE_MAP_LIST_H

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

#include <nds/characteristics/instantiations/CharacsIndirectRoadPositionAttributeMap.h>
#include <nds/characteristics/instantiations/CharacsRoadPositionAttributeMapListHeader.h>
#include <nds/core/geometry/CoordShift.h>

namespace nds
{
namespace characteristics
{
namespace instantiations
{

class CharacsIndirectRoadPositionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CharacsIndirectRoadPositionAttributeMapList() noexcept :
            CharacsIndirectRoadPositionAttributeMapList(allocator_type())
    {}

    explicit CharacsIndirectRoadPositionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>>
    CharacsIndirectRoadPositionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            CharacsIndirectRoadPositionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit CharacsIndirectRoadPositionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit CharacsIndirectRoadPositionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~CharacsIndirectRoadPositionAttributeMapList() = default;

    CharacsIndirectRoadPositionAttributeMapList(const CharacsIndirectRoadPositionAttributeMapList& other);
    CharacsIndirectRoadPositionAttributeMapList& operator=(const CharacsIndirectRoadPositionAttributeMapList& other);

    CharacsIndirectRoadPositionAttributeMapList(CharacsIndirectRoadPositionAttributeMapList&& other);
    CharacsIndirectRoadPositionAttributeMapList& operator=(CharacsIndirectRoadPositionAttributeMapList&& other);

    CharacsIndirectRoadPositionAttributeMapList(::zserio::PropagateAllocatorT,
            const CharacsIndirectRoadPositionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader& getHeader() const;
    ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader& header_);
    void setHeader(::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsIndirectRoadPositionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = CharacsIndirectRoadPositionAttributeMapList;

        static void initializeElement(CharacsIndirectRoadPositionAttributeMapList& owner,
                ::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = CharacsIndirectRoadPositionAttributeMapList;

        static void create(CharacsIndirectRoadPositionAttributeMapList& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(CharacsIndirectRoadPositionAttributeMapList& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>& array,
                ::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::characteristics::instantiations::CharacsIndirectRoadPositionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::characteristics::instantiations::CharacsRoadPositionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_INDIRECT_ROAD_POSITION_ATTRIBUTE_MAP_LIST_H
