/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTINGDATA_ATTRIBUTES_ROUTING_LANE_TRANSITION_ATTRIBUTE_VALUE_H
#define NDS_ROUTINGDATA_ATTRIBUTES_ROUTING_LANE_TRANSITION_ATTRIBUTE_VALUE_H

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

#include <nds/core/types/Seconds.h>
#include <nds/routingdata/attributes/RoutingLaneTransitionAttributeType.h>
#include <nds/routingdata/types/LaneTransitionAngle.h>
#include <nds/routingdata/types/SpecialTransitionCode.h>
#include <nds/routingdata/types/SpeedVariation.h>

namespace nds
{
namespace routingdata
{
namespace attributes
{

class RoutingLaneTransitionAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_specialTransitionCode = 0,
        CHOICE_speedVariation = 1,
        CHOICE_transitionDuration = 2,
        CHOICE_transitionAngle = 3,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSpecialTransitionCode()
        {
            return m_specialTransitionCode_;
        }

        ::zserio::DeltaContext& getSpeedVariation()
        {
            return m_speedVariation_;
        }

        ::zserio::DeltaContext& getTransitionDuration()
        {
            return m_transitionDuration_;
        }

        ::zserio::DeltaContext& getTransitionAngle()
        {
            return m_transitionAngle_;
        }

    private:
        ::zserio::DeltaContext m_specialTransitionCode_;
        ::zserio::DeltaContext m_speedVariation_;
        ::zserio::DeltaContext m_transitionDuration_;
        ::zserio::DeltaContext m_transitionAngle_;
    };

    RoutingLaneTransitionAttributeValue() noexcept :
            RoutingLaneTransitionAttributeValue(allocator_type())
    {}

    explicit RoutingLaneTransitionAttributeValue(const allocator_type& allocator) noexcept;

    explicit RoutingLaneTransitionAttributeValue(::zserio::BitStreamReader& in,
            ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit RoutingLaneTransitionAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType type_, const allocator_type& allocator = allocator_type());

    ~RoutingLaneTransitionAttributeValue() = default;

    RoutingLaneTransitionAttributeValue(const RoutingLaneTransitionAttributeValue& other);
    RoutingLaneTransitionAttributeValue& operator=(const RoutingLaneTransitionAttributeValue& other);

    RoutingLaneTransitionAttributeValue(RoutingLaneTransitionAttributeValue&& other);
    RoutingLaneTransitionAttributeValue& operator=(RoutingLaneTransitionAttributeValue&& other);

    RoutingLaneTransitionAttributeValue(::zserio::PropagateAllocatorT,
            const RoutingLaneTransitionAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType getType() const;

    ::nds::routingdata::types::SpecialTransitionCode getSpecialTransitionCode() const;
    void setSpecialTransitionCode(::nds::routingdata::types::SpecialTransitionCode specialTransitionCode_);

    ::nds::routingdata::types::SpeedVariation getSpeedVariation() const;
    void setSpeedVariation(::nds::routingdata::types::SpeedVariation speedVariation_);

    ::nds::core::types::Seconds getTransitionDuration() const;
    void setTransitionDuration(::nds::core::types::Seconds transitionDuration_);

    ::nds::routingdata::types::LaneTransitionAngle getTransitionAngle() const;
    void setTransitionAngle(::nds::routingdata::types::LaneTransitionAngle transitionAngle_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoutingLaneTransitionAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::routingdata::attributes::RoutingLaneTransitionAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace routingdata
} // namespace nds

#endif // NDS_ROUTINGDATA_ATTRIBUTES_ROUTING_LANE_TRANSITION_ATTRIBUTE_VALUE_H
