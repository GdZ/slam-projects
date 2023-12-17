/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_TYPES_WAYPOINT_TYPE_H
#define NDS_ROUTING_TYPES_WAYPOINT_TYPE_H

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
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>

namespace nds
{
namespace routing
{
namespace types
{

enum class WaypointType : uint8_t
{
    DESTINATION = UINT8_C(0),
    ORIGIN = UINT8_C(1),
    STOPOVER = UINT8_C(2),
    VIA_POINT = UINT8_C(3),
    EV_RECHARGE = UINT8_C(4),
    REFUEL = UINT8_C(5),
    REST_STOP = UINT8_C(6),
    HOME = UINT8_C(7),
    WORK = UINT8_C(8),
    USER = UINT8_C(9),
    DESTINATION_FINAL = UINT8_C(10)
};

} // namespace types
} // namespace routing
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for WaypointType enumeration.
template <>
struct EnumTraits<::nds::routing::types::WaypointType>
{
    static constexpr ::std::array<const char*, 11> names =
    {{
        "DESTINATION",
        "ORIGIN",
        "STOPOVER",
        "VIA_POINT",
        "EV_RECHARGE",
        "REFUEL",
        "REST_STOP",
        "HOME",
        "WORK",
        "USER",
        "DESTINATION_FINAL"
    }};

    static constexpr ::std::array<::nds::routing::types::WaypointType, 11> values =
    {{
        ::nds::routing::types::WaypointType::DESTINATION,
        ::nds::routing::types::WaypointType::ORIGIN,
        ::nds::routing::types::WaypointType::STOPOVER,
        ::nds::routing::types::WaypointType::VIA_POINT,
        ::nds::routing::types::WaypointType::EV_RECHARGE,
        ::nds::routing::types::WaypointType::REFUEL,
        ::nds::routing::types::WaypointType::REST_STOP,
        ::nds::routing::types::WaypointType::HOME,
        ::nds::routing::types::WaypointType::WORK,
        ::nds::routing::types::WaypointType::USER,
        ::nds::routing::types::WaypointType::DESTINATION_FINAL
    }};

    static constexpr const char* enumName = "WaypointType";
};

template <>
size_t enumToOrdinal<::nds::routing::types::WaypointType>(::nds::routing::types::WaypointType value);

template <>
::nds::routing::types::WaypointType valueToEnum<::nds::routing::types::WaypointType>(
        typename ::std::underlying_type<::nds::routing::types::WaypointType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::routing::types::WaypointType>(::nds::routing::types::WaypointType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::routing::types::WaypointType>(::zserio::DeltaContext& context, ::nds::routing::types::WaypointType value);

template <>
size_t bitSizeOf<::nds::routing::types::WaypointType>(::nds::routing::types::WaypointType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::routing::types::WaypointType>(::zserio::DeltaContext& context, ::nds::routing::types::WaypointType value);

template <>
size_t initializeOffsets<::nds::routing::types::WaypointType>(size_t bitPosition, ::nds::routing::types::WaypointType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::routing::types::WaypointType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::routing::types::WaypointType value);

template <>
::nds::routing::types::WaypointType read<::nds::routing::types::WaypointType>(::zserio::BitStreamReader& in);

template <>
::nds::routing::types::WaypointType read<::nds::routing::types::WaypointType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::routing::types::WaypointType>(::zserio::BitStreamWriter& out, ::nds::routing::types::WaypointType value);

template <>
void write<::zserio::DeltaContext, ::nds::routing::types::WaypointType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::routing::types::WaypointType value);

} // namespace zserio

#endif // NDS_ROUTING_TYPES_WAYPOINT_TYPE_H
