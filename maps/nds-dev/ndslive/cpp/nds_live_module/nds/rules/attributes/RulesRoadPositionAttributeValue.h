/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_ATTRIBUTES_RULES_ROAD_POSITION_ATTRIBUTE_VALUE_H
#define NDS_RULES_ATTRIBUTES_RULES_ROAD_POSITION_ATTRIBUTE_VALUE_H

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

#include <nds/rules/attributes/RulesRoadPositionAttributeType.h>
#include <nds/rules/types/MovableWarningSign.h>
#include <nds/rules/types/TrafficEnforcementCamera.h>
#include <nds/rules/types/TrafficLights.h>
#include <nds/signs/warning/WarningSign.h>

namespace nds
{
namespace rules
{
namespace attributes
{

class RulesRoadPositionAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_trafficLights = 0,
        CHOICE_trafficEnforcementCamera = 1,
        CHOICE_movableWarningSign = 2,
        CHOICE_warningSign = 3,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getTrafficEnforcementCamera()
        {
            return m_trafficEnforcementCamera_;
        }

        ::zserio::DeltaContext& getMovableWarningSign()
        {
            return m_movableWarningSign_;
        }

        ::zserio::DeltaContext& getWarningSign()
        {
            return m_warningSign_;
        }

    private:
        ::zserio::DeltaContext m_trafficEnforcementCamera_;
        ::zserio::DeltaContext m_movableWarningSign_;
        ::zserio::DeltaContext m_warningSign_;
    };

    RulesRoadPositionAttributeValue() noexcept :
            RulesRoadPositionAttributeValue(allocator_type())
    {}

    explicit RulesRoadPositionAttributeValue(const allocator_type& allocator) noexcept;

    explicit RulesRoadPositionAttributeValue(::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesRoadPositionAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit RulesRoadPositionAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::rules::attributes::RulesRoadPositionAttributeType type_, const allocator_type& allocator = allocator_type());

    ~RulesRoadPositionAttributeValue() = default;

    RulesRoadPositionAttributeValue(const RulesRoadPositionAttributeValue& other);
    RulesRoadPositionAttributeValue& operator=(const RulesRoadPositionAttributeValue& other);

    RulesRoadPositionAttributeValue(RulesRoadPositionAttributeValue&& other);
    RulesRoadPositionAttributeValue& operator=(RulesRoadPositionAttributeValue&& other);

    RulesRoadPositionAttributeValue(::zserio::PropagateAllocatorT,
            const RulesRoadPositionAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::rules::attributes::RulesRoadPositionAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::rules::attributes::RulesRoadPositionAttributeType getType() const;

    const ::nds::rules::types::TrafficLights& getTrafficLights() const;
    ::nds::rules::types::TrafficLights& getTrafficLights();
    void setTrafficLights(const ::nds::rules::types::TrafficLights& trafficLights_);
    void setTrafficLights(::nds::rules::types::TrafficLights&& trafficLights_);

    ::nds::rules::types::TrafficEnforcementCamera getTrafficEnforcementCamera() const;
    void setTrafficEnforcementCamera(::nds::rules::types::TrafficEnforcementCamera trafficEnforcementCamera_);

    ::nds::rules::types::MovableWarningSign getMovableWarningSign() const;
    void setMovableWarningSign(::nds::rules::types::MovableWarningSign movableWarningSign_);

    ::nds::signs::warning::WarningSign getWarningSign() const;
    void setWarningSign(::nds::signs::warning::WarningSign warningSign_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesRoadPositionAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::rules::attributes::RulesRoadPositionAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace rules
} // namespace nds

#endif // NDS_RULES_ATTRIBUTES_RULES_ROAD_POSITION_ATTRIBUTE_VALUE_H
