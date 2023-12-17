/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTINGDATA_ATTRIBUTES_ROUTING_ROAD_TRANSITION_ATTRIBUTE_TYPE_H
#define NDS_ROUTINGDATA_ATTRIBUTES_ROUTING_ROAD_TRANSITION_ATTRIBUTE_TYPE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <array>

#include <zserio/Enums.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/DeltaContext.h>
#include <zserio/BitSizeOfCalculator.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>

namespace nds
{
namespace routingdata
{
namespace attributes
{

enum class RoutingRoadTransitionAttributeType : uint16_t
{
    SPECIAL_TRANSITION_CODE = UINT16_C(0),
    CONSUMPTION_SPEED_VARIATION = UINT16_C(1),
    TRANSITION_DURATION = UINT16_C(2)
};

} // namespace attributes
} // namespace routingdata
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RoutingRoadTransitionAttributeType enumeration.
template <>
struct EnumTraits<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "SPECIAL_TRANSITION_CODE",
        "CONSUMPTION_SPEED_VARIATION",
        "TRANSITION_DURATION"
    }};

    static constexpr ::std::array<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType, 3> values =
    {{
        ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType::SPECIAL_TRANSITION_CODE,
        ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType::CONSUMPTION_SPEED_VARIATION,
        ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType::TRANSITION_DURATION
    }};

    static constexpr const char* enumName = "RoutingRoadTransitionAttributeType";
};

template <>
size_t enumToOrdinal<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
::nds::routingdata::attributes::RoutingRoadTransitionAttributeType valueToEnum<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(
        typename ::std::underlying_type<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
size_t bitSizeOf<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
size_t initializeOffsets<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(size_t bitPosition, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
::nds::routingdata::attributes::RoutingRoadTransitionAttributeType read<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::routingdata::attributes::RoutingRoadTransitionAttributeType read<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::zserio::BitStreamWriter& out, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::routingdata::attributes::RoutingRoadTransitionAttributeType value);

} // namespace zserio

#endif // NDS_ROUTINGDATA_ATTRIBUTES_ROUTING_ROAD_TRANSITION_ATTRIBUTE_TYPE_H