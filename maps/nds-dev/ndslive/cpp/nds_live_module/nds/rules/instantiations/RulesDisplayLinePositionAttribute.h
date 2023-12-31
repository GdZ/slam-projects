/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_H
#define NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_H

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

#include <nds/rules/attributes/RulesDisplayLinePositionAttributeType.h>
#include <nds/rules/attributes/RulesDisplayLinePositionAttributeValue.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesDisplayLinePositionAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesDisplayLinePositionAttribute() noexcept :
            RulesDisplayLinePositionAttribute(allocator_type())
    {}

    explicit RulesDisplayLinePositionAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, RulesDisplayLinePositionAttribute, allocator_type> = 0>
    explicit RulesDisplayLinePositionAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            RulesDisplayLinePositionAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit RulesDisplayLinePositionAttribute(::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesDisplayLinePositionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit RulesDisplayLinePositionAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesDisplayLinePositionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~RulesDisplayLinePositionAttribute() = default;

    RulesDisplayLinePositionAttribute(const RulesDisplayLinePositionAttribute& other);
    RulesDisplayLinePositionAttribute& operator=(const RulesDisplayLinePositionAttribute& other);

    RulesDisplayLinePositionAttribute(RulesDisplayLinePositionAttribute&& other);
    RulesDisplayLinePositionAttribute& operator=(RulesDisplayLinePositionAttribute&& other);

    RulesDisplayLinePositionAttribute(::zserio::PropagateAllocatorT,
            const RulesDisplayLinePositionAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::rules::attributes::RulesDisplayLinePositionAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::rules::attributes::RulesDisplayLinePositionAttributeType getAttributeTypeCode() const;

    const ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue& getAttributeValue() const;
    ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue& attributeValue_);
    void setAttributeValue(::nds::rules::attributes::RulesDisplayLinePositionAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesDisplayLinePositionAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::rules::attributes::RulesDisplayLinePositionAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::rules::attributes::RulesDisplayLinePositionAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_H
