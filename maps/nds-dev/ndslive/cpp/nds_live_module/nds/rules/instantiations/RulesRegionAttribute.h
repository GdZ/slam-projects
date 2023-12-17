/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_REGION_ATTRIBUTE_H
#define NDS_RULES_INSTANTIATIONS_RULES_REGION_ATTRIBUTE_H

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

#include <nds/rules/attributes/RulesRegionAttributeType.h>
#include <nds/rules/attributes/RulesRegionAttributeValue.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesRegionAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::rules::attributes::RulesRegionAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::rules::attributes::RulesRegionAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesRegionAttribute() noexcept :
            RulesRegionAttribute(allocator_type())
    {}

    explicit RulesRegionAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::rules::attributes::RulesRegionAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, RulesRegionAttribute, allocator_type> = 0>
    explicit RulesRegionAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            RulesRegionAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit RulesRegionAttribute(::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesRegionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit RulesRegionAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesRegionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~RulesRegionAttribute() = default;

    RulesRegionAttribute(const RulesRegionAttribute& other);
    RulesRegionAttribute& operator=(const RulesRegionAttribute& other);

    RulesRegionAttribute(RulesRegionAttribute&& other);
    RulesRegionAttribute& operator=(RulesRegionAttribute&& other);

    RulesRegionAttribute(::zserio::PropagateAllocatorT,
            const RulesRegionAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::rules::attributes::RulesRegionAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::rules::attributes::RulesRegionAttributeType getAttributeTypeCode() const;

    const ::nds::rules::attributes::RulesRegionAttributeValue& getAttributeValue() const;
    ::nds::rules::attributes::RulesRegionAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::rules::attributes::RulesRegionAttributeValue& attributeValue_);
    void setAttributeValue(::nds::rules::attributes::RulesRegionAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesRegionAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::attributes::RulesRegionAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::attributes::RulesRegionAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::rules::attributes::RulesRegionAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::rules::attributes::RulesRegionAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_REGION_ATTRIBUTE_H