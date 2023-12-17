/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_LANE_RANGE_ATTRIBUTE_MAP_LIST_H
#define NDS_RULES_INSTANTIATIONS_RULES_LANE_RANGE_ATTRIBUTE_MAP_LIST_H

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
#include <nds/rules/instantiations/RulesLaneRangeAttributeMap.h>
#include <nds/rules/instantiations/RulesLaneRangeAttributeMapListHeader.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesLaneRangeAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesLaneRangeAttributeMapList() noexcept :
            RulesLaneRangeAttributeMapList(allocator_type())
    {}

    explicit RulesLaneRangeAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>>
    RulesLaneRangeAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            RulesLaneRangeAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit RulesLaneRangeAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit RulesLaneRangeAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~RulesLaneRangeAttributeMapList() = default;

    RulesLaneRangeAttributeMapList(const RulesLaneRangeAttributeMapList& other);
    RulesLaneRangeAttributeMapList& operator=(const RulesLaneRangeAttributeMapList& other);

    RulesLaneRangeAttributeMapList(RulesLaneRangeAttributeMapList&& other);
    RulesLaneRangeAttributeMapList& operator=(RulesLaneRangeAttributeMapList&& other);

    RulesLaneRangeAttributeMapList(::zserio::PropagateAllocatorT,
            const RulesLaneRangeAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader& getHeader() const;
    ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader& header_);
    void setHeader(::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesLaneRangeAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = RulesLaneRangeAttributeMapList;

        static void initializeElement(RulesLaneRangeAttributeMapList& owner,
                ::nds::rules::instantiations::RulesLaneRangeAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = RulesLaneRangeAttributeMapList;

        static void create(RulesLaneRangeAttributeMapList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesLaneRangeAttributeMapList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>& array,
                ::nds::rules::instantiations::RulesLaneRangeAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::rules::instantiations::RulesLaneRangeAttributeMap>, ::zserio::ObjectArrayTraits<::nds::rules::instantiations::RulesLaneRangeAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::rules::instantiations::RulesLaneRangeAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_LANE_RANGE_ATTRIBUTE_MAP_LIST_H