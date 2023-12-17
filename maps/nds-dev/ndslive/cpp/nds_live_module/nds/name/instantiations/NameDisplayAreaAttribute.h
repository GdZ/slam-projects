/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_INSTANTIATIONS_NAME_DISPLAY_AREA_ATTRIBUTE_H
#define NDS_NAME_INSTANTIATIONS_NAME_DISPLAY_AREA_ATTRIBUTE_H

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
#include <zserio/ArrayTraits.h>

#include <nds/name/attributes/NameDisplayAreaAttributeType.h>
#include <nds/name/attributes/NameDisplayAreaAttributeValue.h>

namespace nds
{
namespace name
{
namespace instantiations
{

class NameDisplayAreaAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::name::attributes::NameDisplayAreaAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::name::attributes::NameDisplayAreaAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NameDisplayAreaAttribute() noexcept :
            NameDisplayAreaAttribute(allocator_type())
    {}

    explicit NameDisplayAreaAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::name::attributes::NameDisplayAreaAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, NameDisplayAreaAttribute, allocator_type> = 0>
    explicit NameDisplayAreaAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            NameDisplayAreaAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit NameDisplayAreaAttribute(::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameDisplayAreaAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit NameDisplayAreaAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameDisplayAreaAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~NameDisplayAreaAttribute() = default;

    NameDisplayAreaAttribute(const NameDisplayAreaAttribute& other);
    NameDisplayAreaAttribute& operator=(const NameDisplayAreaAttribute& other);

    NameDisplayAreaAttribute(NameDisplayAreaAttribute&& other);
    NameDisplayAreaAttribute& operator=(NameDisplayAreaAttribute&& other);

    NameDisplayAreaAttribute(::zserio::PropagateAllocatorT,
            const NameDisplayAreaAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::name::attributes::NameDisplayAreaAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::name::attributes::NameDisplayAreaAttributeType getAttributeTypeCode() const;

    const ::nds::name::attributes::NameDisplayAreaAttributeValue& getAttributeValue() const;
    ::nds::name::attributes::NameDisplayAreaAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::name::attributes::NameDisplayAreaAttributeValue& attributeValue_);
    void setAttributeValue(::nds::name::attributes::NameDisplayAreaAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NameDisplayAreaAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::name::attributes::NameDisplayAreaAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::name::attributes::NameDisplayAreaAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::name::attributes::NameDisplayAreaAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::name::attributes::NameDisplayAreaAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace name
} // namespace nds

#endif // NDS_NAME_INSTANTIATIONS_NAME_DISPLAY_AREA_ATTRIBUTE_H
