/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_TYPES_PHYSICAL_DIVIDER_BOUNDARY_TYPE_H
#define NDS_LANE_TYPES_PHYSICAL_DIVIDER_BOUNDARY_TYPE_H

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
namespace lane
{
namespace types
{

enum class PhysicalDividerBoundaryType : uint8_t
{
    CURB = UINT8_C(0),
    WALL_FLAT = UINT8_C(1),
    WALL_TUNNEL = UINT8_C(2),
    BARRIER_JERSEY = UINT8_C(3),
    BARRIER_SOUND = UINT8_C(4),
    BARRIER_CABLE = UINT8_C(5),
    GUARDRAIL = UINT8_C(6),
    FENCE = UINT8_C(7),
    DITCH = UINT8_C(8),
    UNKNOWN = UINT8_C(255)
};

} // namespace types
} // namespace lane
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for PhysicalDividerBoundaryType enumeration.
template <>
struct EnumTraits<::nds::lane::types::PhysicalDividerBoundaryType>
{
    static constexpr ::std::array<const char*, 10> names =
    {{
        "CURB",
        "WALL_FLAT",
        "WALL_TUNNEL",
        "BARRIER_JERSEY",
        "BARRIER_SOUND",
        "BARRIER_CABLE",
        "GUARDRAIL",
        "FENCE",
        "DITCH",
        "UNKNOWN"
    }};

    static constexpr ::std::array<::nds::lane::types::PhysicalDividerBoundaryType, 10> values =
    {{
        ::nds::lane::types::PhysicalDividerBoundaryType::CURB,
        ::nds::lane::types::PhysicalDividerBoundaryType::WALL_FLAT,
        ::nds::lane::types::PhysicalDividerBoundaryType::WALL_TUNNEL,
        ::nds::lane::types::PhysicalDividerBoundaryType::BARRIER_JERSEY,
        ::nds::lane::types::PhysicalDividerBoundaryType::BARRIER_SOUND,
        ::nds::lane::types::PhysicalDividerBoundaryType::BARRIER_CABLE,
        ::nds::lane::types::PhysicalDividerBoundaryType::GUARDRAIL,
        ::nds::lane::types::PhysicalDividerBoundaryType::FENCE,
        ::nds::lane::types::PhysicalDividerBoundaryType::DITCH,
        ::nds::lane::types::PhysicalDividerBoundaryType::UNKNOWN
    }};

    static constexpr const char* enumName = "PhysicalDividerBoundaryType";
};

template <>
size_t enumToOrdinal<::nds::lane::types::PhysicalDividerBoundaryType>(::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
::nds::lane::types::PhysicalDividerBoundaryType valueToEnum<::nds::lane::types::PhysicalDividerBoundaryType>(
        typename ::std::underlying_type<::nds::lane::types::PhysicalDividerBoundaryType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::lane::types::PhysicalDividerBoundaryType>(::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::lane::types::PhysicalDividerBoundaryType>(::zserio::DeltaContext& context, ::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
size_t bitSizeOf<::nds::lane::types::PhysicalDividerBoundaryType>(::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::lane::types::PhysicalDividerBoundaryType>(::zserio::DeltaContext& context, ::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
size_t initializeOffsets<::nds::lane::types::PhysicalDividerBoundaryType>(size_t bitPosition, ::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::lane::types::PhysicalDividerBoundaryType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
::nds::lane::types::PhysicalDividerBoundaryType read<::nds::lane::types::PhysicalDividerBoundaryType>(::zserio::BitStreamReader& in);

template <>
::nds::lane::types::PhysicalDividerBoundaryType read<::nds::lane::types::PhysicalDividerBoundaryType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::lane::types::PhysicalDividerBoundaryType>(::zserio::BitStreamWriter& out, ::nds::lane::types::PhysicalDividerBoundaryType value);

template <>
void write<::zserio::DeltaContext, ::nds::lane::types::PhysicalDividerBoundaryType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::lane::types::PhysicalDividerBoundaryType value);

} // namespace zserio

#endif // NDS_LANE_TYPES_PHYSICAL_DIVIDER_BOUNDARY_TYPE_H
