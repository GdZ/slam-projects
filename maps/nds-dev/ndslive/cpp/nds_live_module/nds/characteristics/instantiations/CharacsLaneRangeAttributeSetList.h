/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_RANGE_ATTRIBUTE_SET_LIST_H
#define NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_RANGE_ATTRIBUTE_SET_LIST_H

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

#include <nds/characteristics/instantiations/CharacsLaneRangeAttributeSetMap.h>
#include <nds/core/geometry/CoordShift.h>

namespace nds
{
namespace characteristics
{
namespace instantiations
{

class CharacsLaneRangeAttributeSetList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumAttributeSets()
        {
            return m_numAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_numAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CharacsLaneRangeAttributeSetList() noexcept :
            CharacsLaneRangeAttributeSetList(allocator_type())
    {}

    explicit CharacsLaneRangeAttributeSetList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_sets = ::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>>
    CharacsLaneRangeAttributeSetList(
            uint32_t numAttributeSets_,
            ZSERIO_T_sets&& sets_,
            const allocator_type& allocator = allocator_type()) :
            CharacsLaneRangeAttributeSetList(allocator)
    {
        m_numAttributeSets_ = numAttributeSets_;
        m_sets_ = ZserioArrayType_sets(::std::forward<ZSERIO_T_sets>(sets_));
    }

    explicit CharacsLaneRangeAttributeSetList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit CharacsLaneRangeAttributeSetList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~CharacsLaneRangeAttributeSetList() = default;

    CharacsLaneRangeAttributeSetList(const CharacsLaneRangeAttributeSetList& other);
    CharacsLaneRangeAttributeSetList& operator=(const CharacsLaneRangeAttributeSetList& other);

    CharacsLaneRangeAttributeSetList(CharacsLaneRangeAttributeSetList&& other);
    CharacsLaneRangeAttributeSetList& operator=(CharacsLaneRangeAttributeSetList&& other);

    CharacsLaneRangeAttributeSetList(::zserio::PropagateAllocatorT,
            const CharacsLaneRangeAttributeSetList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumAttributeSets() const;
    void setNumAttributeSets(uint32_t numAttributeSets_);

    const ::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>& getSets() const;
    ::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>& getSets();
    void setSets(const ::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>& sets_);
    void setSets(::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>&& sets_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsLaneRangeAttributeSetList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_sets
    {
    public:
        using OwnerType = CharacsLaneRangeAttributeSetList;

        static void initializeElement(CharacsLaneRangeAttributeSetList& owner,
                ::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap& element, size_t index);
    };

    class ZserioElementFactory_sets
    {
    public:
        using OwnerType = CharacsLaneRangeAttributeSetList;

        static void create(CharacsLaneRangeAttributeSetList& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(CharacsLaneRangeAttributeSetList& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>& array,
                ::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_sets = ::zserio::Array<::zserio::vector<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap>, ::zserio::ObjectArrayTraits<::nds::characteristics::instantiations::CharacsLaneRangeAttributeSetMap, ZserioElementFactory_sets>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_sets>;

    uint32_t readNumAttributeSets(::zserio::BitStreamReader& in);
    uint32_t readNumAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_sets readSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_sets readSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    uint32_t m_numAttributeSets_;
    ZserioArrayType_sets m_sets_;
};

} // namespace instantiations
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_RANGE_ATTRIBUTE_SET_LIST_H
