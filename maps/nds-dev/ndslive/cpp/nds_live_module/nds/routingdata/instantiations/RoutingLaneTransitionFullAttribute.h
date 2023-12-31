/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTINGDATA_INSTANTIATIONS_ROUTING_LANE_TRANSITION_FULL_ATTRIBUTE_H
#define NDS_ROUTINGDATA_INSTANTIATIONS_ROUTING_LANE_TRANSITION_FULL_ATTRIBUTE_H

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
#include <nds/routingdata/attributes/RoutingLaneTransitionAttributeType.h>
#include <nds/routingdata/attributes/RoutingLaneTransitionAttributeValue.h>
#include <nds/routingdata/instantiations/RoutingPropertyList.h>

namespace nds
{
namespace routingdata
{
namespace instantiations
{

class RoutingLaneTransitionFullAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

        ::nds::routingdata::instantiations::RoutingPropertyList::ZserioPackingContext& getProperties()
        {
            return m_properties_;
        }

        ::nds::core::attributemap::ConditionList::ZserioPackingContext& getConditions()
        {
            return m_conditions_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue::ZserioPackingContext m_attributeValue_;
        ::nds::routingdata::instantiations::RoutingPropertyList::ZserioPackingContext m_properties_;
        ::nds::core::attributemap::ConditionList::ZserioPackingContext m_conditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoutingLaneTransitionFullAttribute() noexcept :
            RoutingLaneTransitionFullAttribute(allocator_type())
    {}

    explicit RoutingLaneTransitionFullAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue,
            typename ZSERIO_T_properties = ::nds::routingdata::instantiations::RoutingPropertyList,
            typename ZSERIO_T_conditions = ::nds::core::attributemap::ConditionList>
    RoutingLaneTransitionFullAttribute(
            ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType attributeTypeCode_,
            ZSERIO_T_attributeValue&& attributeValue_,
            ZSERIO_T_properties&& properties_,
            ZSERIO_T_conditions&& conditions_,
            const allocator_type& allocator = allocator_type()) :
            RoutingLaneTransitionFullAttribute(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
        m_properties_ = ::std::forward<ZSERIO_T_properties>(properties_);
        m_conditions_ = ::std::forward<ZSERIO_T_conditions>(conditions_);
    }

    explicit RoutingLaneTransitionFullAttribute(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoutingLaneTransitionFullAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoutingLaneTransitionFullAttribute() = default;

    RoutingLaneTransitionFullAttribute(const RoutingLaneTransitionFullAttribute& other);
    RoutingLaneTransitionFullAttribute& operator=(const RoutingLaneTransitionFullAttribute& other);

    RoutingLaneTransitionFullAttribute(RoutingLaneTransitionFullAttribute&& other);
    RoutingLaneTransitionFullAttribute& operator=(RoutingLaneTransitionFullAttribute&& other);

    RoutingLaneTransitionFullAttribute(::zserio::PropagateAllocatorT,
            const RoutingLaneTransitionFullAttribute& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::routingdata::attributes::RoutingLaneTransitionAttributeType attributeTypeCode_);

    const ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue& getAttributeValue() const;
    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue& attributeValue_);
    void setAttributeValue(::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue&& attributeValue_);

    const ::nds::routingdata::instantiations::RoutingPropertyList& getProperties() const;
    ::nds::routingdata::instantiations::RoutingPropertyList& getProperties();
    void setProperties(const ::nds::routingdata::instantiations::RoutingPropertyList& properties_);
    void setProperties(::nds::routingdata::instantiations::RoutingPropertyList&& properties_);
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

    bool operator==(const RoutingLaneTransitionFullAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingPropertyList> readProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingPropertyList> readProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType m_attributeTypeCode_;
    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeValue m_attributeValue_;
    ::zserio::InplaceOptionalHolder<::nds::routingdata::instantiations::RoutingPropertyList> m_properties_;
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> m_conditions_;
};

} // namespace instantiations
} // namespace routingdata
} // namespace nds

#endif // NDS_ROUTINGDATA_INSTANTIATIONS_ROUTING_LANE_TRANSITION_FULL_ATTRIBUTE_H
