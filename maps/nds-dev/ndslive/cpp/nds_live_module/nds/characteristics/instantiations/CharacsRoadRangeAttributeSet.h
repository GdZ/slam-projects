/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_ROAD_RANGE_ATTRIBUTE_SET_H
#define NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_ROAD_RANGE_ATTRIBUTE_SET_H

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

#include <nds/characteristics/instantiations/CharacsRoadRangeFullAttribute.h>

namespace nds
{
namespace characteristics
{
namespace instantiations
{

class CharacsRoadRangeAttributeSet
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumEntries()
        {
            return m_numEntries_;
        }

    private:
        ::zserio::DeltaContext m_numEntries_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CharacsRoadRangeAttributeSet() noexcept :
            CharacsRoadRangeAttributeSet(allocator_type())
    {}

    explicit CharacsRoadRangeAttributeSet(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributes = ::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>>
    CharacsRoadRangeAttributeSet(
            uint32_t numEntries_,
            ZSERIO_T_attributes&& attributes_,
            const allocator_type& allocator = allocator_type()) :
            CharacsRoadRangeAttributeSet(allocator)
    {
        m_numEntries_ = numEntries_;
        m_attributes_ = ZserioArrayType_attributes(::std::forward<ZSERIO_T_attributes>(attributes_));
    }

    explicit CharacsRoadRangeAttributeSet(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit CharacsRoadRangeAttributeSet(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~CharacsRoadRangeAttributeSet() = default;

    CharacsRoadRangeAttributeSet(const CharacsRoadRangeAttributeSet&) = default;
    CharacsRoadRangeAttributeSet& operator=(const CharacsRoadRangeAttributeSet&) = default;

    CharacsRoadRangeAttributeSet(CharacsRoadRangeAttributeSet&&) = default;
    CharacsRoadRangeAttributeSet& operator=(CharacsRoadRangeAttributeSet&&) = default;

    CharacsRoadRangeAttributeSet(::zserio::PropagateAllocatorT,
            const CharacsRoadRangeAttributeSet& other, const allocator_type& allocator);

    void initializeChildren();

    uint32_t getNumEntries() const;
    void setNumEntries(uint32_t numEntries_);

    const ::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>& getAttributes() const;
    ::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>& getAttributes();
    void setAttributes(const ::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>& attributes_);
    void setAttributes(::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>&& attributes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsRoadRangeAttributeSet& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_attributes
    {
    public:
        using OwnerType = CharacsRoadRangeAttributeSet;

        static void initializeElement(CharacsRoadRangeAttributeSet& owner,
                ::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute& element, size_t index);
    };

    class ZserioElementFactory_attributes
    {
    public:
        using OwnerType = CharacsRoadRangeAttributeSet;

        static void create(CharacsRoadRangeAttributeSet& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(CharacsRoadRangeAttributeSet& owner,
                ::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>& array,
                ::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_attributes = ::zserio::Array<::zserio::vector<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute>, ::zserio::ObjectArrayTraits<::nds::characteristics::instantiations::CharacsRoadRangeFullAttribute, ZserioElementFactory_attributes>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributes>;

    uint32_t readNumEntries(::zserio::BitStreamReader& in);
    uint32_t readNumEntries(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_attributes readAttributes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_attributes readAttributes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint32_t m_numEntries_;
    ZserioArrayType_attributes m_attributes_;
};

} // namespace instantiations
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_ROAD_RANGE_ATTRIBUTE_SET_H
