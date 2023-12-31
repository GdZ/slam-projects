/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_TYPES_ROUTE_POINT_TYPE_H
#define NDS_ROUTING_TYPES_ROUTE_POINT_TYPE_H

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

enum class RoutePointType : uint8_t
{
    DECISION = UINT8_C(0),
    MANEUVER = UINT8_C(1),
    RECONSTRUCTION = UINT8_C(2)
};

} // namespace types
} // namespace routing
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RoutePointType enumeration.
template <>
struct EnumTraits<::nds::routing::types::RoutePointType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "DECISION",
        "MANEUVER",
        "RECONSTRUCTION"
    }};

    static constexpr ::std::array<::nds::routing::types::RoutePointType, 3> values =
    {{
        ::nds::routing::types::RoutePointType::DECISION,
        ::nds::routing::types::RoutePointType::MANEUVER,
        ::nds::routing::types::RoutePointType::RECONSTRUCTION
    }};

    static constexpr const char* enumName = "RoutePointType";
};

template <>
size_t enumToOrdinal<::nds::routing::types::RoutePointType>(::nds::routing::types::RoutePointType value);

template <>
::nds::routing::types::RoutePointType valueToEnum<::nds::routing::types::RoutePointType>(
        typename ::std::underlying_type<::nds::routing::types::RoutePointType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::routing::types::RoutePointType>(::nds::routing::types::RoutePointType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::routing::types::RoutePointType>(::zserio::DeltaContext& context, ::nds::routing::types::RoutePointType value);

template <>
size_t bitSizeOf<::nds::routing::types::RoutePointType>(::nds::routing::types::RoutePointType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::routing::types::RoutePointType>(::zserio::DeltaContext& context, ::nds::routing::types::RoutePointType value);

template <>
size_t initializeOffsets<::nds::routing::types::RoutePointType>(size_t bitPosition, ::nds::routing::types::RoutePointType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::routing::types::RoutePointType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::routing::types::RoutePointType value);

template <>
::nds::routing::types::RoutePointType read<::nds::routing::types::RoutePointType>(::zserio::BitStreamReader& in);

template <>
::nds::routing::types::RoutePointType read<::nds::routing::types::RoutePointType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::routing::types::RoutePointType>(::zserio::BitStreamWriter& out, ::nds::routing::types::RoutePointType value);

template <>
void write<::zserio::DeltaContext, ::nds::routing::types::RoutePointType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::routing::types::RoutePointType value);

} // namespace zserio

#endif // NDS_ROUTING_TYPES_ROUTE_POINT_TYPE_H
