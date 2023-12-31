/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_TYPES_ROUTE_OPTION_TYPE_H
#define NDS_ROUTING_TYPES_ROUTE_OPTION_TYPE_H

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

enum class RouteOptionType : uint8_t
{
    SCENIC = UINT8_C(0),
    MOTORWAY = UINT8_C(1),
    AUTONOMOUS_DRIVING = UINT8_C(2),
    DIFFICULT_TURNS = UINT8_C(3),
    TUNNEL = UINT8_C(4),
    FERRY = UINT8_C(5),
    VIGNETTE = UINT8_C(6),
    TOLL = UINT8_C(7),
    HOV = UINT8_C(8),
    UNPAVED = UINT8_C(9),
    LOCAL_ROADS = UINT8_C(10),
    CHALLENGING = UINT8_C(11)
};

} // namespace types
} // namespace routing
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RouteOptionType enumeration.
template <>
struct EnumTraits<::nds::routing::types::RouteOptionType>
{
    static constexpr ::std::array<const char*, 12> names =
    {{
        "SCENIC",
        "MOTORWAY",
        "AUTONOMOUS_DRIVING",
        "DIFFICULT_TURNS",
        "TUNNEL",
        "FERRY",
        "VIGNETTE",
        "TOLL",
        "HOV",
        "UNPAVED",
        "LOCAL_ROADS",
        "CHALLENGING"
    }};

    static constexpr ::std::array<::nds::routing::types::RouteOptionType, 12> values =
    {{
        ::nds::routing::types::RouteOptionType::SCENIC,
        ::nds::routing::types::RouteOptionType::MOTORWAY,
        ::nds::routing::types::RouteOptionType::AUTONOMOUS_DRIVING,
        ::nds::routing::types::RouteOptionType::DIFFICULT_TURNS,
        ::nds::routing::types::RouteOptionType::TUNNEL,
        ::nds::routing::types::RouteOptionType::FERRY,
        ::nds::routing::types::RouteOptionType::VIGNETTE,
        ::nds::routing::types::RouteOptionType::TOLL,
        ::nds::routing::types::RouteOptionType::HOV,
        ::nds::routing::types::RouteOptionType::UNPAVED,
        ::nds::routing::types::RouteOptionType::LOCAL_ROADS,
        ::nds::routing::types::RouteOptionType::CHALLENGING
    }};

    static constexpr const char* enumName = "RouteOptionType";
};

template <>
size_t enumToOrdinal<::nds::routing::types::RouteOptionType>(::nds::routing::types::RouteOptionType value);

template <>
::nds::routing::types::RouteOptionType valueToEnum<::nds::routing::types::RouteOptionType>(
        typename ::std::underlying_type<::nds::routing::types::RouteOptionType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::routing::types::RouteOptionType>(::nds::routing::types::RouteOptionType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::routing::types::RouteOptionType>(::zserio::DeltaContext& context, ::nds::routing::types::RouteOptionType value);

template <>
size_t bitSizeOf<::nds::routing::types::RouteOptionType>(::nds::routing::types::RouteOptionType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::routing::types::RouteOptionType>(::zserio::DeltaContext& context, ::nds::routing::types::RouteOptionType value);

template <>
size_t initializeOffsets<::nds::routing::types::RouteOptionType>(size_t bitPosition, ::nds::routing::types::RouteOptionType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::routing::types::RouteOptionType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::routing::types::RouteOptionType value);

template <>
::nds::routing::types::RouteOptionType read<::nds::routing::types::RouteOptionType>(::zserio::BitStreamReader& in);

template <>
::nds::routing::types::RouteOptionType read<::nds::routing::types::RouteOptionType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::routing::types::RouteOptionType>(::zserio::BitStreamWriter& out, ::nds::routing::types::RouteOptionType value);

template <>
void write<::zserio::DeltaContext, ::nds::routing::types::RouteOptionType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::routing::types::RouteOptionType value);

} // namespace zserio

#endif // NDS_ROUTING_TYPES_ROUTE_OPTION_TYPE_H
