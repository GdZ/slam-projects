/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_POINT_ATTRIBUTE_SET_H
#define NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_POINT_ATTRIBUTE_SET_H

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

#include <nds/display/details/instantiations/DisplayPointFullAttribute.h>

namespace nds
{
namespace display
{
namespace details
{
namespace instantiations
{

class DisplayPointAttributeSet
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

    DisplayPointAttributeSet() noexcept :
            DisplayPointAttributeSet(allocator_type())
    {}

    explicit DisplayPointAttributeSet(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributes = ::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>>
    DisplayPointAttributeSet(
            uint32_t numEntries_,
            ZSERIO_T_attributes&& attributes_,
            const allocator_type& allocator = allocator_type()) :
            DisplayPointAttributeSet(allocator)
    {
        m_numEntries_ = numEntries_;
        m_attributes_ = ZserioArrayType_attributes(::std::forward<ZSERIO_T_attributes>(attributes_));
    }

    explicit DisplayPointAttributeSet(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayPointAttributeSet(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayPointAttributeSet() = default;

    DisplayPointAttributeSet(const DisplayPointAttributeSet&) = default;
    DisplayPointAttributeSet& operator=(const DisplayPointAttributeSet&) = default;

    DisplayPointAttributeSet(DisplayPointAttributeSet&&) = default;
    DisplayPointAttributeSet& operator=(DisplayPointAttributeSet&&) = default;

    DisplayPointAttributeSet(::zserio::PropagateAllocatorT,
            const DisplayPointAttributeSet& other, const allocator_type& allocator);

    void initializeChildren();

    uint32_t getNumEntries() const;
    void setNumEntries(uint32_t numEntries_);

    const ::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>& getAttributes() const;
    ::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>& getAttributes();
    void setAttributes(const ::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>& attributes_);
    void setAttributes(::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>&& attributes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayPointAttributeSet& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_attributes
    {
    public:
        using OwnerType = DisplayPointAttributeSet;

        static void initializeElement(DisplayPointAttributeSet& owner,
                ::nds::display::details::instantiations::DisplayPointFullAttribute& element, size_t index);
    };

    class ZserioElementFactory_attributes
    {
    public:
        using OwnerType = DisplayPointAttributeSet;

        static void create(DisplayPointAttributeSet& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayPointAttributeSet& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>& array,
                ::nds::display::details::instantiations::DisplayPointFullAttribute::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_attributes = ::zserio::Array<::zserio::vector<::nds::display::details::instantiations::DisplayPointFullAttribute>, ::zserio::ObjectArrayTraits<::nds::display::details::instantiations::DisplayPointFullAttribute, ZserioElementFactory_attributes>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributes>;

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
} // namespace details
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_POINT_ATTRIBUTE_SET_H
