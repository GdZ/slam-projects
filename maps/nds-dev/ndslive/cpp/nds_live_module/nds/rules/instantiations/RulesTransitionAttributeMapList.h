/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_TRANSITION_ATTRIBUTE_MAP_LIST_H
#define NDS_RULES_INSTANTIATIONS_RULES_TRANSITION_ATTRIBUTE_MAP_LIST_H

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
#include <nds/rules/instantiations/RulesTransitionAttributeMap.h>
#include <nds/rules/instantiations/RulesTransitionAttributeMapListHeader.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesTransitionAttributeMapList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumMaps()
        {
            return m_numMaps_;
        }

        ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

    private:
        ::zserio::DeltaContext m_numMaps_;
        ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader::ZserioPackingContext m_header_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesTransitionAttributeMapList() noexcept :
            RulesTransitionAttributeMapList(allocator_type())
    {}

    explicit RulesTransitionAttributeMapList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader,
            typename ZSERIO_T_maps = ::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>>
    RulesTransitionAttributeMapList(
            uint32_t numMaps_,
            ZSERIO_T_header&& header_,
            ZSERIO_T_maps&& maps_,
            const allocator_type& allocator = allocator_type()) :
            RulesTransitionAttributeMapList(allocator)
    {
        m_numMaps_ = numMaps_;
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_maps_ = ZserioArrayType_maps(::std::forward<ZSERIO_T_maps>(maps_));
    }

    explicit RulesTransitionAttributeMapList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit RulesTransitionAttributeMapList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~RulesTransitionAttributeMapList() = default;

    RulesTransitionAttributeMapList(const RulesTransitionAttributeMapList& other);
    RulesTransitionAttributeMapList& operator=(const RulesTransitionAttributeMapList& other);

    RulesTransitionAttributeMapList(RulesTransitionAttributeMapList&& other);
    RulesTransitionAttributeMapList& operator=(RulesTransitionAttributeMapList&& other);

    RulesTransitionAttributeMapList(::zserio::PropagateAllocatorT,
            const RulesTransitionAttributeMapList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumMaps() const;
    void setNumMaps(uint32_t numMaps_);

    const ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader& getHeader() const;
    ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader& getHeader();
    void setHeader(const ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader& header_);
    void setHeader(::nds::rules::instantiations::RulesTransitionAttributeMapListHeader&& header_);

    const ::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>& getMaps() const;
    ::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>& getMaps();
    void setMaps(const ::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>& maps_);
    void setMaps(::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>&& maps_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesTransitionAttributeMapList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_maps
    {
    public:
        using OwnerType = RulesTransitionAttributeMapList;

        static void initializeElement(RulesTransitionAttributeMapList& owner,
                ::nds::rules::instantiations::RulesTransitionAttributeMap& element, size_t index);
    };

    class ZserioElementFactory_maps
    {
    public:
        using OwnerType = RulesTransitionAttributeMapList;

        static void create(RulesTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesTransitionAttributeMapList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>& array,
                ::nds::rules::instantiations::RulesTransitionAttributeMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_maps = ::zserio::Array<::zserio::vector<::nds::rules::instantiations::RulesTransitionAttributeMap>, ::zserio::ObjectArrayTraits<::nds::rules::instantiations::RulesTransitionAttributeMap, ZserioElementFactory_maps>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_maps>;

    uint32_t readNumMaps(::zserio::BitStreamReader& in);
    uint32_t readNumMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_maps readMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_maps readMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numMaps_;
    ::nds::rules::instantiations::RulesTransitionAttributeMapListHeader m_header_;
    ZserioArrayType_maps m_maps_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_TRANSITION_ATTRIBUTE_MAP_LIST_H
