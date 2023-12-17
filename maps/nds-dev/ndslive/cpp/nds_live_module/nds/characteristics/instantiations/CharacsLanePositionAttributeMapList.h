/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_POSITION_ATTRIBUTE_MAP_LIST_H
#define NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_POSITION_ATTRIBUTE_MAP_LIST_H

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

#include <nds/characteristics/instantiations/CharacsLanePositionAttributeMap.h>
#include <nds/characteristics/instantiations/CharacsLanePositionAttributeMapListHeader.h>
#include <nds/core/geometry/CoordShift.h>

namespace nds
{
namespace characteristics
{
namespace instantiations
{

class CharacsLanePositionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CharacsLanePositionAttributeMapList() noexcept :
            CharacsLanePositionAttributeMapList(allocator_type())
    {}

    explicit CharacsLanePositionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>>
    CharacsLanePositionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            CharacsLanePositionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit CharacsLanePositionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit CharacsLanePositionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~CharacsLanePositionAttributeMapList() = default;

    CharacsLanePositionAttributeMapList(const CharacsLanePositionAttributeMapList& other);
    CharacsLanePositionAttributeMapList& operator=(const CharacsLanePositionAttributeMapList& other);

    CharacsLanePositionAttributeMapList(CharacsLanePositionAttributeMapList&& other);
    CharacsLanePositionAttributeMapList& operator=(CharacsLanePositionAttributeMapList&& other);

    CharacsLanePositionAttributeMapList(::zserio::PropagateAllocatorT,
            const CharacsLanePositionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader& getHeader() const;
    ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader& header_);
    void setHeader(::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsLanePositionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = CharacsLanePositionAttributeMapList;

        static void initializeElement(CharacsLanePositionAttributeMapList& owner,
                ::nds::characteristics::instantiations::CharacsLanePositionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = CharacsLanePositionAttributeMapList;

        static void create(CharacsLanePositionAttributeMapList& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(CharacsLanePositionAttributeMapList& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>& array,
                ::nds::characteristics::instantiations::CharacsLanePositionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::characteristics::instantiations::CharacsLanePositionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::characteristics::instantiations::CharacsLanePositionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_POSITION_ATTRIBUTE_MAP_LIST_H
