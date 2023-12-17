/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_ATTRIBUTE_SET_LIST_H
#define NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_ATTRIBUTE_SET_LIST_H

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
#include <nds/display/details/instantiations/DisplayLineAttributeSetMap.h>

namespace nds
{
namespace display
{
namespace details
{
namespace instantiations
{

class DisplayLineAttributeSetList
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

    DisplayLineAttributeSetList() noexcept :
            DisplayLineAttributeSetList(allocator_type())
    {}

    explicit DisplayLineAttributeSetList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_sets = ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>>
    DisplayLineAttributeSetList(
            uint32_t numAttributeSets_,
            ZSERIO_T_sets&& sets_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLineAttributeSetList(allocator)
    {
        m_numAttributeSets_ = numAttributeSets_;
        m_sets_ = ZserioArrayType_sets(::std::forward<ZSERIO_T_sets>(sets_));
    }

    explicit DisplayLineAttributeSetList(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit DisplayLineAttributeSetList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~DisplayLineAttributeSetList() = default;

    DisplayLineAttributeSetList(const DisplayLineAttributeSetList& other);
    DisplayLineAttributeSetList& operator=(const DisplayLineAttributeSetList& other);

    DisplayLineAttributeSetList(DisplayLineAttributeSetList&& other);
    DisplayLineAttributeSetList& operator=(DisplayLineAttributeSetList&& other);

    DisplayLineAttributeSetList(::zserio::PropagateAllocatorT,
            const DisplayLineAttributeSetList& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    uint32_t getNumAttributeSets() const;
    void setNumAttributeSets(uint32_t numAttributeSets_);

    const ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>& getSets() const;
    ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>& getSets();
    void setSets(const ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>& sets_);
    void setSets(::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>&& sets_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayLineAttributeSetList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_sets
    {
    public:
        using OwnerType = DisplayLineAttributeSetList;

        static void initializeElement(DisplayLineAttributeSetList& owner,
                ::nds::display::details::instantiations::DisplayLineAttributeSetMap& element, size_t index);
    };

    class ZserioElementFactory_sets
    {
    public:
        using OwnerType = DisplayLineAttributeSetList;

        static void create(DisplayLineAttributeSetList& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayLineAttributeSetList& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>& array,
                ::nds::display::details::instantiations::DisplayLineAttributeSetMap::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_sets = ::zserio::Array<::zserio::vector<::nds::display::details::instantiations::DisplayLineAttributeSetMap>, ::zserio::ObjectArrayTraits<::nds::display::details::instantiations::DisplayLineAttributeSetMap, ZserioElementFactory_sets>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_sets>;

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
} // namespace details
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_ATTRIBUTE_SET_LIST_H