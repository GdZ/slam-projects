/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_REGION_ATTRIBUTE_MAP_LIST_H
#define NDS_RULES_INSTANTIATIONS_RULES_REGION_ATTRIBUTE_MAP_LIST_H

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
#include <nds/rules/instantiations/RulesRegionAttributeMap.h>
#include <nds/rules/instantiations/RulesRegionAttributeMapListHeader.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesRegionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::rules::instantiations::RulesRegionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::rules::instantiations::RulesRegionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesRegionAttributeMapList() noexcept :
            RulesRegionAttributeMapList(allocator_type())
    {}

    explicit RulesRegionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::rules::instantiations::RulesRegionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>>
    RulesRegionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            RulesRegionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit RulesRegionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit RulesRegionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~RulesRegionAttributeMapList() = default;

    RulesRegionAttributeMapList(const RulesRegionAttributeMapList& other);
    RulesRegionAttributeMapList& operator=(const RulesRegionAttributeMapList& other);

    RulesRegionAttributeMapList(RulesRegionAttributeMapList&& other);
    RulesRegionAttributeMapList& operator=(RulesRegionAttributeMapList&& other);

    RulesRegionAttributeMapList(::zserio::PropagateAllocatorT,
            const RulesRegionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::rules::instantiations::RulesRegionAttributeMapListHeader& getHeader() const;
    ::nds::rules::instantiations::RulesRegionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::rules::instantiations::RulesRegionAttributeMapListHeader& header_);
    void setHeader(::nds::rules::instantiations::RulesRegionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesRegionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = RulesRegionAttributeMapList;

        static void initializeElement(RulesRegionAttributeMapList& owner,
                ::nds::rules::instantiations::RulesRegionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = RulesRegionAttributeMapList;

        static void create(RulesRegionAttributeMapList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesRegionAttributeMapList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>& array,
                ::nds::rules::instantiations::RulesRegionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::rules::instantiations::RulesRegionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::rules::instantiations::RulesRegionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::rules::instantiations::RulesRegionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::instantiations::RulesRegionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::rules::instantiations::RulesRegionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_REGION_ATTRIBUTE_MAP_LIST_H
