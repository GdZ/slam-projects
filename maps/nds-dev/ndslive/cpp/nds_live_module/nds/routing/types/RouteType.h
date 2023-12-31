/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_TYPES_ROUTE_TYPE_H
#define NDS_ROUTING_TYPES_ROUTE_TYPE_H

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

enum class RouteType : uint8_t
{
    FASTEST = UINT8_C(0),
    SHORTEST = UINT8_C(1),
    ECO = UINT8_C(2),
    GREEN = UINT8_C(3)
};

} // namespace types
} // namespace routing
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RouteType enumeration.
template <>
struct EnumTraits<::nds::routing::types::RouteType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "FASTEST",
        "SHORTEST",
        "ECO",
        "GREEN"
    }};

    static constexpr ::std::array<::nds::routing::types::RouteType, 4> values =
    {{
        ::nds::routing::types::RouteType::FASTEST,
        ::nds::routing::types::RouteType::SHORTEST,
        ::nds::routing::types::RouteType::ECO,
        ::nds::routing::types::RouteType::GREEN
    }};

    static constexpr const char* enumName = "RouteType";
};

template <>
size_t enumToOrdinal<::nds::routing::types::RouteType>(::nds::routing::types::RouteType value);

template <>
::nds::routing::types::RouteType valueToEnum<::nds::routing::types::RouteType>(
        typename ::std::underlying_type<::nds::routing::types::RouteType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::routing::types::RouteType>(::nds::routing::types::RouteType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::routing::types::RouteType>(::zserio::DeltaContext& context, ::nds::routing::types::RouteType value);

template <>
size_t bitSizeOf<::nds::routing::types::RouteType>(::nds::routing::types::RouteType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::routing::types::RouteType>(::zserio::DeltaContext& context, ::nds::routing::types::RouteType value);

template <>
size_t initializeOffsets<::nds::routing::types::RouteType>(size_t bitPosition, ::nds::routing::types::RouteType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::routing::types::RouteType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::routing::types::RouteType value);

template <>
::nds::routing::types::RouteType read<::nds::routing::types::RouteType>(::zserio::BitStreamReader& in);

template <>
::nds::routing::types::RouteType read<::nds::routing::types::RouteType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::routing::types::RouteType>(::zserio::BitStreamWriter& out, ::nds::routing::types::RouteType value);

template <>
void write<::zserio::DeltaContext, ::nds::routing::types::RouteType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::routing::types::RouteType value);

} // namespace zserio

#endif // NDS_ROUTING_TYPES_ROUTE_TYPE_H
