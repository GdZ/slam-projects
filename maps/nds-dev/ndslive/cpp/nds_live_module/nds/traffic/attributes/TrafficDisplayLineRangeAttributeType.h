/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_ATTRIBUTES_TRAFFIC_DISPLAY_LINE_RANGE_ATTRIBUTE_TYPE_H
#define NDS_TRAFFIC_ATTRIBUTES_TRAFFIC_DISPLAY_LINE_RANGE_ATTRIBUTE_TYPE_H

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
namespace traffic
{
namespace attributes
{

enum class TrafficDisplayLineRangeAttributeType : uint16_t
{
    TRAFFIC_EVENT = UINT16_C(0),
    TRAFFIC_FLOW = UINT16_C(1),
    CURRENT_ROAD_CONDITION = UINT16_C(2),
    PARKING_AVAILABILITY = UINT16_C(3)
};

} // namespace attributes
} // namespace traffic
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for TrafficDisplayLineRangeAttributeType enumeration.
template <>
struct EnumTraits<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "TRAFFIC_EVENT",
        "TRAFFIC_FLOW",
        "CURRENT_ROAD_CONDITION",
        "PARKING_AVAILABILITY"
    }};

    static constexpr ::std::array<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType, 4> values =
    {{
        ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType::TRAFFIC_EVENT,
        ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType::TRAFFIC_FLOW,
        ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType::CURRENT_ROAD_CONDITION,
        ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType::PARKING_AVAILABILITY
    }};

    static constexpr const char* enumName = "TrafficDisplayLineRangeAttributeType";
};

template <>
size_t enumToOrdinal<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType valueToEnum<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(
        typename ::std::underlying_type<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::zserio::DeltaContext& context, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
size_t bitSizeOf<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::zserio::DeltaContext& context, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
size_t initializeOffsets<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(size_t bitPosition, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType read<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType read<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::zserio::BitStreamWriter& out, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::traffic::attributes::TrafficDisplayLineRangeAttributeType value);

} // namespace zserio

#endif // NDS_TRAFFIC_ATTRIBUTES_TRAFFIC_DISPLAY_LINE_RANGE_ATTRIBUTE_TYPE_H