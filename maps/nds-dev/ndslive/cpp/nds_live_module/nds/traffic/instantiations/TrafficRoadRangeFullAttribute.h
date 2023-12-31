/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_ROAD_RANGE_FULL_ATTRIBUTE_H
#define NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_ROAD_RANGE_FULL_ATTRIBUTE_H

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
#include <nds/traffic/attributes/TrafficRoadRangeAttributeType.h>
#include <nds/traffic/attributes/TrafficRoadRangeAttributeValue.h>
#include <nds/traffic/instantiations/TrafficPropertyList.h>

namespace nds
{
namespace traffic
{
namespace instantiations
{

class TrafficRoadRangeFullAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::nds::traffic::attributes::TrafficRoadRangeAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

        ::nds::traffic::instantiations::TrafficPropertyList::ZserioPackingContext& getProperties()
        {
            return m_properties_;
        }

        ::nds::core::attributemap::ConditionList::ZserioPackingContext& getConditions()
        {
            return m_conditions_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::nds::traffic::attributes::TrafficRoadRangeAttributeValue::ZserioPackingContext m_attributeValue_;
        ::nds::traffic::instantiations::TrafficPropertyList::ZserioPackingContext m_properties_;
        ::nds::core::attributemap::ConditionList::ZserioPackingContext m_conditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TrafficRoadRangeFullAttribute() noexcept :
            TrafficRoadRangeFullAttribute(allocator_type())
    {}

    explicit TrafficRoadRangeFullAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::traffic::attributes::TrafficRoadRangeAttributeValue,
            typename ZSERIO_T_properties = ::nds::traffic::instantiations::TrafficPropertyList,
            typename ZSERIO_T_conditions = ::nds::core::attributemap::ConditionList>
    TrafficRoadRangeFullAttribute(
            ::nds::traffic::attributes::TrafficRoadRangeAttributeType attributeTypeCode_,
            ZSERIO_T_attributeValue&& attributeValue_,
            ZSERIO_T_properties&& properties_,
            ZSERIO_T_conditions&& conditions_,
            const allocator_type& allocator = allocator_type()) :
            TrafficRoadRangeFullAttribute(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
        m_properties_ = ::std::forward<ZSERIO_T_properties>(properties_);
        m_conditions_ = ::std::forward<ZSERIO_T_conditions>(conditions_);
    }

    explicit TrafficRoadRangeFullAttribute(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TrafficRoadRangeFullAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TrafficRoadRangeFullAttribute() = default;

    TrafficRoadRangeFullAttribute(const TrafficRoadRangeFullAttribute& other);
    TrafficRoadRangeFullAttribute& operator=(const TrafficRoadRangeFullAttribute& other);

    TrafficRoadRangeFullAttribute(TrafficRoadRangeFullAttribute&& other);
    TrafficRoadRangeFullAttribute& operator=(TrafficRoadRangeFullAttribute&& other);

    TrafficRoadRangeFullAttribute(::zserio::PropagateAllocatorT,
            const TrafficRoadRangeFullAttribute& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::traffic::attributes::TrafficRoadRangeAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::traffic::attributes::TrafficRoadRangeAttributeType attributeTypeCode_);

    const ::nds::traffic::attributes::TrafficRoadRangeAttributeValue& getAttributeValue() const;
    ::nds::traffic::attributes::TrafficRoadRangeAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::traffic::attributes::TrafficRoadRangeAttributeValue& attributeValue_);
    void setAttributeValue(::nds::traffic::attributes::TrafficRoadRangeAttributeValue&& attributeValue_);

    const ::nds::traffic::instantiations::TrafficPropertyList& getProperties() const;
    ::nds::traffic::instantiations::TrafficPropertyList& getProperties();
    void setProperties(const ::nds::traffic::instantiations::TrafficPropertyList& properties_);
    void setProperties(::nds::traffic::instantiations::TrafficPropertyList&& properties_);
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

    bool operator==(const TrafficRoadRangeFullAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::traffic::attributes::TrafficRoadRangeAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::traffic::attributes::TrafficRoadRangeAttributeType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::traffic::attributes::TrafficRoadRangeAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::traffic::attributes::TrafficRoadRangeAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficPropertyList> readProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficPropertyList> readProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::traffic::attributes::TrafficRoadRangeAttributeType m_attributeTypeCode_;
    ::nds::traffic::attributes::TrafficRoadRangeAttributeValue m_attributeValue_;
    ::zserio::InplaceOptionalHolder<::nds::traffic::instantiations::TrafficPropertyList> m_properties_;
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> m_conditions_;
};

} // namespace instantiations
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_ROAD_RANGE_FULL_ATTRIBUTE_H
