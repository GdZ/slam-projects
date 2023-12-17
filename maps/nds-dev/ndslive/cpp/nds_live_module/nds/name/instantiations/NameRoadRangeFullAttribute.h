/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_INSTANTIATIONS_NAME_ROAD_RANGE_FULL_ATTRIBUTE_H
#define NDS_NAME_INSTANTIATIONS_NAME_ROAD_RANGE_FULL_ATTRIBUTE_H

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
#include <nds/name/attributes/NameRoadRangeAttributeType.h>
#include <nds/name/attributes/NameRoadRangeAttributeValue.h>
#include <nds/name/instantiations/NamePropertyList.h>

namespace nds
{
namespace name
{
namespace instantiations
{

class NameRoadRangeFullAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::nds::name::attributes::NameRoadRangeAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

        ::nds::name::instantiations::NamePropertyList::ZserioPackingContext& getProperties()
        {
            return m_properties_;
        }

        ::nds::core::attributemap::ConditionList::ZserioPackingContext& getConditions()
        {
            return m_conditions_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::nds::name::attributes::NameRoadRangeAttributeValue::ZserioPackingContext m_attributeValue_;
        ::nds::name::instantiations::NamePropertyList::ZserioPackingContext m_properties_;
        ::nds::core::attributemap::ConditionList::ZserioPackingContext m_conditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NameRoadRangeFullAttribute() noexcept :
            NameRoadRangeFullAttribute(allocator_type())
    {}

    explicit NameRoadRangeFullAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::name::attributes::NameRoadRangeAttributeValue,
            typename ZSERIO_T_properties = ::nds::name::instantiations::NamePropertyList,
            typename ZSERIO_T_conditions = ::nds::core::attributemap::ConditionList>
    NameRoadRangeFullAttribute(
            ::nds::name::attributes::NameRoadRangeAttributeType attributeTypeCode_,
            ZSERIO_T_attributeValue&& attributeValue_,
            ZSERIO_T_properties&& properties_,
            ZSERIO_T_conditions&& conditions_,
            const allocator_type& allocator = allocator_type()) :
            NameRoadRangeFullAttribute(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
        m_properties_ = ::std::forward<ZSERIO_T_properties>(properties_);
        m_conditions_ = ::std::forward<ZSERIO_T_conditions>(conditions_);
    }

    explicit NameRoadRangeFullAttribute(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit NameRoadRangeFullAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~NameRoadRangeFullAttribute() = default;

    NameRoadRangeFullAttribute(const NameRoadRangeFullAttribute& other);
    NameRoadRangeFullAttribute& operator=(const NameRoadRangeFullAttribute& other);

    NameRoadRangeFullAttribute(NameRoadRangeFullAttribute&& other);
    NameRoadRangeFullAttribute& operator=(NameRoadRangeFullAttribute&& other);

    NameRoadRangeFullAttribute(::zserio::PropagateAllocatorT,
            const NameRoadRangeFullAttribute& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::name::attributes::NameRoadRangeAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::name::attributes::NameRoadRangeAttributeType attributeTypeCode_);

    const ::nds::name::attributes::NameRoadRangeAttributeValue& getAttributeValue() const;
    ::nds::name::attributes::NameRoadRangeAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::name::attributes::NameRoadRangeAttributeValue& attributeValue_);
    void setAttributeValue(::nds::name::attributes::NameRoadRangeAttributeValue&& attributeValue_);

    const ::nds::name::instantiations::NamePropertyList& getProperties() const;
    ::nds::name::instantiations::NamePropertyList& getProperties();
    void setProperties(const ::nds::name::instantiations::NamePropertyList& properties_);
    void setProperties(::nds::name::instantiations::NamePropertyList&& properties_);
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

    bool operator==(const NameRoadRangeFullAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::name::attributes::NameRoadRangeAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::name::attributes::NameRoadRangeAttributeType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::name::attributes::NameRoadRangeAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::name::attributes::NameRoadRangeAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NamePropertyList> readProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NamePropertyList> readProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::name::attributes::NameRoadRangeAttributeType m_attributeTypeCode_;
    ::nds::name::attributes::NameRoadRangeAttributeValue m_attributeValue_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NamePropertyList> m_properties_;
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> m_conditions_;
};

} // namespace instantiations
} // namespace name
} // namespace nds

#endif // NDS_NAME_INSTANTIATIONS_NAME_ROAD_RANGE_FULL_ATTRIBUTE_H