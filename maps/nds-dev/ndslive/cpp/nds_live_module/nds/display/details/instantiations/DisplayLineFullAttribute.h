/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_FULL_ATTRIBUTE_H
#define NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_FULL_ATTRIBUTE_H

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
#include <nds/display/details/attributes/DisplayLineAttributeType.h>
#include <nds/display/details/attributes/DisplayLineAttributeValue.h>
#include <nds/display/details/instantiations/DisplayPropertyList.h>

namespace nds
{
namespace display
{
namespace details
{
namespace instantiations
{

class DisplayLineFullAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::nds::display::details::attributes::DisplayLineAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

        ::nds::display::details::instantiations::DisplayPropertyList::ZserioPackingContext& getProperties()
        {
            return m_properties_;
        }

        ::nds::core::attributemap::ConditionList::ZserioPackingContext& getConditions()
        {
            return m_conditions_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::nds::display::details::attributes::DisplayLineAttributeValue::ZserioPackingContext m_attributeValue_;
        ::nds::display::details::instantiations::DisplayPropertyList::ZserioPackingContext m_properties_;
        ::nds::core::attributemap::ConditionList::ZserioPackingContext m_conditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayLineFullAttribute() noexcept :
            DisplayLineFullAttribute(allocator_type())
    {}

    explicit DisplayLineFullAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::display::details::attributes::DisplayLineAttributeValue,
            typename ZSERIO_T_properties = ::nds::display::details::instantiations::DisplayPropertyList,
            typename ZSERIO_T_conditions = ::nds::core::attributemap::ConditionList>
    DisplayLineFullAttribute(
            ::nds::display::details::attributes::DisplayLineAttributeType attributeTypeCode_,
            ZSERIO_T_attributeValue&& attributeValue_,
            ZSERIO_T_properties&& properties_,
            ZSERIO_T_conditions&& conditions_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLineFullAttribute(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
        m_properties_ = ::std::forward<ZSERIO_T_properties>(properties_);
        m_conditions_ = ::std::forward<ZSERIO_T_conditions>(conditions_);
    }

    explicit DisplayLineFullAttribute(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayLineFullAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayLineFullAttribute() = default;

    DisplayLineFullAttribute(const DisplayLineFullAttribute& other);
    DisplayLineFullAttribute& operator=(const DisplayLineFullAttribute& other);

    DisplayLineFullAttribute(DisplayLineFullAttribute&& other);
    DisplayLineFullAttribute& operator=(DisplayLineFullAttribute&& other);

    DisplayLineFullAttribute(::zserio::PropagateAllocatorT,
            const DisplayLineFullAttribute& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::display::details::attributes::DisplayLineAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::display::details::attributes::DisplayLineAttributeType attributeTypeCode_);

    const ::nds::display::details::attributes::DisplayLineAttributeValue& getAttributeValue() const;
    ::nds::display::details::attributes::DisplayLineAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::display::details::attributes::DisplayLineAttributeValue& attributeValue_);
    void setAttributeValue(::nds::display::details::attributes::DisplayLineAttributeValue&& attributeValue_);

    const ::nds::display::details::instantiations::DisplayPropertyList& getProperties() const;
    ::nds::display::details::instantiations::DisplayPropertyList& getProperties();
    void setProperties(const ::nds::display::details::instantiations::DisplayPropertyList& properties_);
    void setProperties(::nds::display::details::instantiations::DisplayPropertyList&& properties_);
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

    bool operator==(const DisplayLineFullAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::display::details::attributes::DisplayLineAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::display::details::attributes::DisplayLineAttributeType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::display::details::attributes::DisplayLineAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::display::details::attributes::DisplayLineAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::DisplayPropertyList> readProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::DisplayPropertyList> readProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::display::details::attributes::DisplayLineAttributeType m_attributeTypeCode_;
    ::nds::display::details::attributes::DisplayLineAttributeValue m_attributeValue_;
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::DisplayPropertyList> m_properties_;
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> m_conditions_;
};

} // namespace instantiations
} // namespace details
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_FULL_ATTRIBUTE_H