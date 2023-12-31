/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_ATTRIBUTES_TRAFFIC_DISPLAY_LINE_RANGE_ATTRIBUTE_VALUE_H
#define NDS_TRAFFIC_ATTRIBUTES_TRAFFIC_DISPLAY_LINE_RANGE_ATTRIBUTE_VALUE_H

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

#include <nds/traffic/attributes/TrafficDisplayLineRangeAttributeType.h>
#include <nds/traffic/types/CurrentRoadCondition.h>
#include <nds/traffic/types/ParkingAvailability.h>
#include <nds/traffic/types/TrafficEvent.h>
#include <nds/traffic/types/TrafficFlow.h>

namespace nds
{
namespace traffic
{
namespace attributes
{

class TrafficDisplayLineRangeAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_trafficEvent = 0,
        CHOICE_trafficFlow = 1,
        CHOICE_currentRoadCondition = 2,
        CHOICE_parkingAvailability = 3,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::traffic::types::TrafficEvent::ZserioPackingContext& getTrafficEvent()
        {
            return m_trafficEvent_;
        }

        ::zserio::DeltaContext& getTrafficFlow()
        {
            return m_trafficFlow_;
        }

    private:
        ::nds::traffic::types::TrafficEvent::ZserioPackingContext m_trafficEvent_;
        ::zserio::DeltaContext m_trafficFlow_;
    };

    TrafficDisplayLineRangeAttributeValue() noexcept :
            TrafficDisplayLineRangeAttributeValue(allocator_type())
    {}

    explicit TrafficDisplayLineRangeAttributeValue(const allocator_type& allocator) noexcept;

    explicit TrafficDisplayLineRangeAttributeValue(::zserio::BitStreamReader& in,
            ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit TrafficDisplayLineRangeAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType type_, const allocator_type& allocator = allocator_type());

    ~TrafficDisplayLineRangeAttributeValue() = default;

    TrafficDisplayLineRangeAttributeValue(const TrafficDisplayLineRangeAttributeValue& other);
    TrafficDisplayLineRangeAttributeValue& operator=(const TrafficDisplayLineRangeAttributeValue& other);

    TrafficDisplayLineRangeAttributeValue(TrafficDisplayLineRangeAttributeValue&& other);
    TrafficDisplayLineRangeAttributeValue& operator=(TrafficDisplayLineRangeAttributeValue&& other);

    TrafficDisplayLineRangeAttributeValue(::zserio::PropagateAllocatorT,
            const TrafficDisplayLineRangeAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType getType() const;

    const ::nds::traffic::types::TrafficEvent& getTrafficEvent() const;
    ::nds::traffic::types::TrafficEvent& getTrafficEvent();
    void setTrafficEvent(const ::nds::traffic::types::TrafficEvent& trafficEvent_);
    void setTrafficEvent(::nds::traffic::types::TrafficEvent&& trafficEvent_);

    ::nds::traffic::types::TrafficFlow getTrafficFlow() const;
    void setTrafficFlow(::nds::traffic::types::TrafficFlow trafficFlow_);

    const ::nds::traffic::types::CurrentRoadCondition& getCurrentRoadCondition() const;
    ::nds::traffic::types::CurrentRoadCondition& getCurrentRoadCondition();
    void setCurrentRoadCondition(const ::nds::traffic::types::CurrentRoadCondition& currentRoadCondition_);
    void setCurrentRoadCondition(::nds::traffic::types::CurrentRoadCondition&& currentRoadCondition_);

    ::nds::traffic::types::ParkingAvailability getParkingAvailability() const;
    void setParkingAvailability(::nds::traffic::types::ParkingAvailability parkingAvailability_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TrafficDisplayLineRangeAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_ATTRIBUTES_TRAFFIC_DISPLAY_LINE_RANGE_ATTRIBUTE_VALUE_H
