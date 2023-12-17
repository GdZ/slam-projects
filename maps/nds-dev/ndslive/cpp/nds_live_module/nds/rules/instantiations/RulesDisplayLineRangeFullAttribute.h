/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_RANGE_FULL_ATTRIBUTE_H
#define NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_RANGE_FULL_ATTRIBUTE_H

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
#include <zserio/OptionalHolder.h>
#include <zserio/ArrayTraits.h>

#include <nds/core/attributemap/ConditionList.h>
#include <nds/rules/attributes/RulesDisplayLineRangeAttributeType.h>
#include <nds/rules/attributes/RulesDisplayLineRangeAttributeValue.h>
#include <nds/rules/instantiations/RulesPropertyList.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesDisplayLineRangeFullAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

        ::nds::rules::instantiations::RulesPropertyList::ZserioPackingContext& getProperties()
        {
            return m_properties_;
        }

        ::nds::core::attributemap::ConditionList::ZserioPackingContext& getConditions()
        {
            return m_conditions_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue::ZserioPackingContext m_attributeValue_;
        ::nds::rules::instantiations::RulesPropertyList::ZserioPackingContext m_properties_;
        ::nds::core::attributemap::ConditionList::ZserioPackingContext m_conditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesDisplayLineRangeFullAttribute() noexcept :
            RulesDisplayLineRangeFullAttribute(allocator_type())
    {}

    explicit RulesDisplayLineRangeFullAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue,
            typename ZSERIO_T_properties = ::nds::rules::instantiations::RulesPropertyList,
            typename ZSERIO_T_conditions = ::nds::core::attributemap::ConditionList>
    RulesDisplayLineRangeFullAttribute(
            ::nds::rules::attributes::RulesDisplayLineRangeAttributeType attributeTypeCode_,
            ZSERIO_T_attributeValue&& attributeValue_,
            ZSERIO_T_properties&& properties_,
            ZSERIO_T_conditions&& conditions_,
            const allocator_type& allocator = allocator_type()) :
            RulesDisplayLineRangeFullAttribute(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
        m_properties_ = ::std::forward<ZSERIO_T_properties>(properties_);
        m_conditions_ = ::std::forward<ZSERIO_T_conditions>(conditions_);
    }

    explicit RulesDisplayLineRangeFullAttribute(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RulesDisplayLineRangeFullAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RulesDisplayLineRangeFullAttribute() = default;

    RulesDisplayLineRangeFullAttribute(const RulesDisplayLineRangeFullAttribute& other);
    RulesDisplayLineRangeFullAttribute& operator=(const RulesDisplayLineRangeFullAttribute& other);

    RulesDisplayLineRangeFullAttribute(RulesDisplayLineRangeFullAttribute&& other);
    RulesDisplayLineRangeFullAttribute& operator=(RulesDisplayLineRangeFullAttribute&& other);

    RulesDisplayLineRangeFullAttribute(::zserio::PropagateAllocatorT,
            const RulesDisplayLineRangeFullAttribute& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::rules::attributes::RulesDisplayLineRangeAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::rules::attributes::RulesDisplayLineRangeAttributeType attributeTypeCode_);

    const ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue& getAttributeValue() const;
    ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue& attributeValue_);
    void setAttributeValue(::nds::rules::attributes::RulesDisplayLineRangeAttributeValue&& attributeValue_);

    const ::nds::rules::instantiations::RulesPropertyList& getProperties() const;
    ::nds::rules::instantiations::RulesPropertyList& getProperties();
    void setProperties(const ::nds::rules::instantiations::RulesPropertyList& properties_);
    void setProperties(::nds::rules::instantiations::RulesPropertyList&& properties_);
    bool isPropertiesUsed() const;
    bool isPropertiesSet() const;
    void resetProperties();

    const ::nds::core::attributemap::ConditionList& getConditions() const;
    ::nds::core::attributemap::ConditionList& getConditions();
    void setConditions(const ::nds::core::attributemap::ConditionList& conditions_);
    void setConditions(::nds::core::attributemap::ConditionList&& conditions_);
    bool isConditionsUsed() const;
    bool isConditionsSet() const;
    void resetConditions();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesDisplayLineRangeFullAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::rules::attributes::RulesDisplayLineRangeAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::rules::attributes::RulesDisplayLineRangeAttributeType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesPropertyList> readProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesPropertyList> readProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::rules::attributes::RulesDisplayLineRangeAttributeType m_attributeTypeCode_;
    ::nds::rules::attributes::RulesDisplayLineRangeAttributeValue m_attributeValue_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesPropertyList> m_properties_;
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> m_conditions_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_RANGE_FULL_ATTRIBUTE_H