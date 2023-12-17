/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_TYPES_TRAFFIC_EVENT_ADVICE_H
#define NDS_TRAFFIC_TYPES_TRAFFIC_EVENT_ADVICE_H

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
namespace types
{

enum class TrafficEventAdvice : uint16_t
{
    GIVE_WAY_TO_VEHICLE_FROM_BEHIND = UINT16_C(0)
};

} // namespace types
} // namespace traffic
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for TrafficEventAdvice enumeration.
template <>
struct EnumTraits<::nds::traffic::types::TrafficEventAdvice>
{
    static constexpr ::std::array<const char*, 1> names =
    {{
        "GIVE_WAY_TO_VEHICLE_FROM_BEHIND"
    }};

    static constexpr ::std::array<::nds::traffic::types::TrafficEventAdvice, 1> values =
    {{
        ::nds::traffic::types::TrafficEventAdvice::GIVE_WAY_TO_VEHICLE_FROM_BEHIND
    }};

    static constexpr const char* enumName = "TrafficEventAdvice";
};

template <>
size_t enumToOrdinal<::nds::traffic::types::TrafficEventAdvice>(::nds::traffic::types::TrafficEventAdvice value);

template <>
::nds::traffic::types::TrafficEventAdvice valueToEnum<::nds::traffic::types::TrafficEventAdvice>(
        typename ::std::underlying_type<::nds::traffic::types::TrafficEventAdvice>::type rawValue);

template <>
uint32_t enumHashCode<::nds::traffic::types::TrafficEventAdvice>(::nds::traffic::types::TrafficEventAdvice value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::traffic::types::TrafficEventAdvice>(::zserio::DeltaContext& context, ::nds::traffic::types::TrafficEventAdvice value);

template <>
size_t bitSizeOf<::nds::traffic::types::TrafficEventAdvice>(::nds::traffic::types::TrafficEventAdvice value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::traffic::types::TrafficEventAdvice>(::zserio::DeltaContext& context, ::nds::traffic::types::TrafficEventAdvice value);

template <>
size_t initializeOffsets<::nds::traffic::types::TrafficEventAdvice>(size_t bitPosition, ::nds::traffic::types::TrafficEventAdvice value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::traffic::types::TrafficEventAdvice>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::traffic::types::TrafficEventAdvice value);

template <>
::nds::traffic::types::TrafficEventAdvice read<::nds::traffic::types::TrafficEventAdvice>(::zserio::BitStreamReader& in);

template <>
::nds::traffic::types::TrafficEventAdvice read<::nds::traffic::types::TrafficEventAdvice, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::traffic::types::TrafficEventAdvice>(::zserio::BitStreamWriter& out, ::nds::traffic::types::TrafficEventAdvice value);

template <>
void write<::zserio::DeltaContext, ::nds::traffic::types::TrafficEventAdvice>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::traffic::types::TrafficEventAdvice value);

} // namespace zserio

#endif // NDS_TRAFFIC_TYPES_TRAFFIC_EVENT_ADVICE_H
