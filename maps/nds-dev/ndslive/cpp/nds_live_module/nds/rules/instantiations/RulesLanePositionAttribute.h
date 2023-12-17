/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_LANE_POSITION_ATTRIBUTE_H
#define NDS_RULES_INSTANTIATIONS_RULES_LANE_POSITION_ATTRIBUTE_H

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

#include <nds/rules/attributes/RulesLanePositionAttributeType.h>
#include <nds/rules/attributes/RulesLanePositionAttributeValue.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesLanePositionAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::rules::attributes::RulesLanePositionAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::rules::attributes::RulesLanePositionAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesLanePositionAttribute() noexcept :
            RulesLanePositionAttribute(allocator_type())
    {}

    explicit RulesLanePositionAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::rules::attributes::RulesLanePositionAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, RulesLanePositionAttribute, allocator_type> = 0>
    explicit RulesLanePositionAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            RulesLanePositionAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit RulesLanePositionAttribute(::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesLanePositionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit RulesLanePositionAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesLanePositionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~RulesLanePositionAttribute() = default;

    RulesLanePositionAttribute(const RulesLanePositionAttribute& other);
    RulesLanePositionAttribute& operator=(const RulesLanePositionAttribute& other);

    RulesLanePositionAttribute(RulesLanePositionAttribute&& other);
    RulesLanePositionAttribute& operator=(RulesLanePositionAttribute&& other);

    RulesLanePositionAttribute(::zserio::PropagateAllocatorT,
            const RulesLanePositionAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::rules::attributes::RulesLanePositionAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::rules::attributes::RulesLanePositionAttributeType getAttributeTypeCode() const;

    const ::nds::rules::attributes::RulesLanePositionAttributeValue& getAttributeValue() const;
    ::nds::rules::attributes::RulesLanePositionAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::rules::attributes::RulesLanePositionAttributeValue& attributeValue_);
    void setAttributeValue(::nds::rules::attributes::RulesLanePositionAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesLanePositionAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::attributes::RulesLanePositionAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::attributes::RulesLanePositionAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::rules::attributes::RulesLanePositionAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::rules::attributes::RulesLanePositionAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_LANE_POSITION_ATTRIBUTE_H