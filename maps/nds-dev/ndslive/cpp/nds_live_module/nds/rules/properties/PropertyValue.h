/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_PROPERTIES_PROPERTY_VALUE_H
#define NDS_RULES_PROPERTIES_PROPERTY_VALUE_H

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
#include <zserio/AnyHolder.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/rules/properties/PropertyType.h>
#include <nds/rules/types/RoadworksType.h>
#include <nds/rules/types/SupplementaryWarningSignText.h>
#include <nds/rules/types/TrafficLightCycle.h>
#include <nds/rules/types/TrafficLightFaceList.h>
#include <nds/rules/types/TrafficLightLayout.h>
#include <nds/rules/types/TrafficLightTargetGroup.h>
#include <nds/rules/types/TrafficLightUsageType.h>
#include <nds/signs/warning/SupplementaryWarningSign.h>
#include <nds/signs/warning/VariableWarningSignProperties.h>

namespace nds
{
namespace rules
{
namespace properties
{

class PropertyValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_supplementaryWarningSign = 0,
        CHOICE_variableWarningSignProperties = 1,
        CHOICE_roadworksType = 2,
        CHOICE_trafficLightLayout = 3,
        CHOICE_trafficLightFaces = 4,
        CHOICE_trafficLightUsageType = 5,
        CHOICE_trafficLightTargetGroup = 6,
        CHOICE_trafficLightCycle = 7,
        CHOICE_supplementaryWarningSignText = 8,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSupplementaryWarningSign()
        {
            return m_supplementaryWarningSign_;
        }

        ::zserio::DeltaContext& getVariableWarningSignProperties()
        {
            return m_variableWarningSignProperties_;
        }

        ::zserio::DeltaContext& getRoadworksType()
        {
            return m_roadworksType_;
        }

        ::nds::rules::types::TrafficLightLayout::ZserioPackingContext& getTrafficLightLayout()
        {
            return m_trafficLightLayout_;
        }

        ::nds::rules::types::TrafficLightFaceList::ZserioPackingContext& getTrafficLightFaces()
        {
            return m_trafficLightFaces_;
        }

        ::zserio::DeltaContext& getTrafficLightUsageType()
        {
            return m_trafficLightUsageType_;
        }

        ::zserio::DeltaContext& getTrafficLightTargetGroup()
        {
            return m_trafficLightTargetGroup_;
        }

        ::nds::rules::types::TrafficLightCycle::ZserioPackingContext& getTrafficLightCycle()
        {
            return m_trafficLightCycle_;
        }

        ::nds::rules::types::SupplementaryWarningSignText::ZserioPackingContext& getSupplementaryWarningSignText()
        {
            return m_supplementaryWarningSignText_;
        }

    private:
        ::zserio::DeltaContext m_supplementaryWarningSign_;
        ::zserio::DeltaContext m_variableWarningSignProperties_;
        ::zserio::DeltaContext m_roadworksType_;
        ::nds::rules::types::TrafficLightLayout::ZserioPackingContext m_trafficLightLayout_;
        ::nds::rules::types::TrafficLightFaceList::ZserioPackingContext m_trafficLightFaces_;
        ::zserio::DeltaContext m_trafficLightUsageType_;
        ::zserio::DeltaContext m_trafficLightTargetGroup_;
        ::nds::rules::types::TrafficLightCycle::ZserioPackingContext m_trafficLightCycle_;
        ::nds::rules::types::SupplementaryWarningSignText::ZserioPackingContext m_supplementaryWarningSignText_;
    };

    PropertyValue() noexcept :
            PropertyValue(allocator_type())
    {}

    explicit PropertyValue(const allocator_type& allocator) noexcept;

    explicit PropertyValue(::zserio::BitStreamReader& in,
            ::nds::rules::properties::PropertyType type_, const allocator_type& allocator = allocator_type());
    explicit PropertyValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::rules::properties::PropertyType type_, const allocator_type& allocator = allocator_type());

    ~PropertyValue() = default;

    PropertyValue(const PropertyValue& other);
    PropertyValue& operator=(const PropertyValue& other);

    PropertyValue(PropertyValue&& other);
    PropertyValue& operator=(PropertyValue&& other);

    PropertyValue(::zserio::PropagateAllocatorT,
            const PropertyValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::rules::properties::PropertyType type_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::rules::properties::PropertyType getType() const;

    ::nds::signs::warning::SupplementaryWarningSign getSupplementaryWarningSign() const;
    void setSupplementaryWarningSign(::nds::signs::warning::SupplementaryWarningSign supplementaryWarningSign_);

    ::nds::signs::warning::VariableWarningSignProperties getVariableWarningSignProperties() const;
    void setVariableWarningSignProperties(::nds::signs::warning::VariableWarningSignProperties variableWarningSignProperties_);

    ::nds::rules::types::RoadworksType getRoadworksType() const;
    void setRoadworksType(::nds::rules::types::RoadworksType roadworksType_);

    const ::nds::rules::types::TrafficLightLayout& getTrafficLightLayout() const;
    ::nds::rules::types::TrafficLightLayout& getTrafficLightLayout();
    void setTrafficLightLayout(const ::nds::rules::types::TrafficLightLayout& trafficLightLayout_);
    void setTrafficLightLayout(::nds::rules::types::TrafficLightLayout&& trafficLightLayout_);

    const ::nds::rules::types::TrafficLightFaceList& getTrafficLightFaces() const;
    ::nds::rules::types::TrafficLightFaceList& getTrafficLightFaces();
    void setTrafficLightFaces(const ::nds::rules::types::TrafficLightFaceList& trafficLightFaces_);
    void setTrafficLightFaces(::nds::rules::types::TrafficLightFaceList&& trafficLightFaces_);

    ::nds::rules::types::TrafficLightUsageType getTrafficLightUsageType() const;
    void setTrafficLightUsageType(::nds::rules::types::TrafficLightUsageType trafficLightUsageType_);

    ::nds::rules::types::TrafficLightTargetGroup getTrafficLightTargetGroup() const;
    void setTrafficLightTargetGroup(::nds::rules::types::TrafficLightTargetGroup trafficLightTargetGroup_);

    const ::nds::rules::types::TrafficLightCycle& getTrafficLightCycle() const;
    ::nds::rules::types::TrafficLightCycle& getTrafficLightCycle();
    void setTrafficLightCycle(const ::nds::rules::types::TrafficLightCycle& trafficLightCycle_);
    void setTrafficLightCycle(::nds::rules::types::TrafficLightCycle&& trafficLightCycle_);

    const ::nds::rules::types::SupplementaryWarningSignText& getSupplementaryWarningSignText() const;
    ::nds::rules::types::SupplementaryWarningSignText& getSupplementaryWarningSignText();
    void setSupplementaryWarningSignText(const ::nds::rules::types::SupplementaryWarningSignText& supplementaryWarningSignText_);
    void setSupplementaryWarningSignText(::nds::rules::types::SupplementaryWarningSignText&& supplementaryWarningSignText_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PropertyValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::rules::properties::PropertyType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace properties
} // namespace rules
} // namespace nds

#endif // NDS_RULES_PROPERTIES_PROPERTY_VALUE_H
