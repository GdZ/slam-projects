/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_TYPES_LOGICAL_BOUNDARY_TYPE_H
#define NDS_LANE_TYPES_LOGICAL_BOUNDARY_TYPE_H

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

enum class LogicalBoundaryType : uint8_t
{
    PURE_VIRTUAL = UINT8_C(0),
    GORE = UINT8_C(1),
    WALKING_AREA = UINT8_C(2),
    SHADED_AREA = UINT8_C(3),
    CLIFF = UINT8_C(4),
    END_OF_ROAD_SURFACE = UINT8_C(5),
    PARKING_AREA = UINT8_C(6),
    DRIVEWAY = UINT8_C(7),
    PUBLIC_TRANSPORT_WAITING_AREA = UINT8_C(8),
    CONSTRUCTION_AREA = UINT8_C(9),
    BICYCLE_AREA = UINT8_C(10)
};

} // namespace types
} // namespace lane
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for LogicalBoundaryType enumeration.
template <>
struct EnumTraits<::nds::lane::types::LogicalBoundaryType>
{
    static constexpr ::std::array<const char*, 11> names =
    {{
        "PURE_VIRTUAL",
        "GORE",
        "WALKING_AREA",
        "SHADED_AREA",
        "CLIFF",
        "END_OF_ROAD_SURFACE",
        "PARKING_AREA",
        "DRIVEWAY",
        "PUBLIC_TRANSPORT_WAITING_AREA",
        "CONSTRUCTION_AREA",
        "BICYCLE_AREA"
    }};

    static constexpr ::std::array<::nds::lane::types::LogicalBoundaryType, 11> values =
    {{
        ::nds::lane::types::LogicalBoundaryType::PURE_VIRTUAL,
        ::nds::lane::types::LogicalBoundaryType::GORE,
        ::nds::lane::types::LogicalBoundaryType::WALKING_AREA,
        ::nds::lane::types::LogicalBoundaryType::SHADED_AREA,
        ::nds::lane::types::LogicalBoundaryType::CLIFF,
        ::nds::lane::types::LogicalBoundaryType::END_OF_ROAD_SURFACE,
        ::nds::lane::types::LogicalBoundaryType::PARKING_AREA,
        ::nds::lane::types::LogicalBoundaryType::DRIVEWAY,
        ::nds::lane::types::LogicalBoundaryType::PUBLIC_TRANSPORT_WAITING_AREA,
        ::nds::lane::types::LogicalBoundaryType::CONSTRUCTION_AREA,
        ::nds::lane::types::LogicalBoundaryType::BICYCLE_AREA
    }};

    static constexpr const char* enumName = "LogicalBoundaryType";
};

template <>
size_t enumToOrdinal<::nds::lane::types::LogicalBoundaryType>(::nds::lane::types::LogicalBoundaryType value);

template <>
::nds::lane::types::LogicalBoundaryType valueToEnum<::nds::lane::types::LogicalBoundaryType>(
        typename ::std::underlying_type<::nds::lane::types::LogicalBoundaryType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::lane::types::LogicalBoundaryType>(::nds::lane::types::LogicalBoundaryType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::lane::types::LogicalBoundaryType>(::zserio::DeltaContext& context, ::nds::lane::types::LogicalBoundaryType value);

template <>
size_t bitSizeOf<::nds::lane::types::LogicalBoundaryType>(::nds::lane::types::LogicalBoundaryType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::lane::types::LogicalBoundaryType>(::zserio::DeltaContext& context, ::nds::lane::types::LogicalBoundaryType value);

template <>
size_t initializeOffsets<::nds::lane::types::LogicalBoundaryType>(size_t bitPosition, ::nds::lane::types::LogicalBoundaryType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::lane::types::LogicalBoundaryType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::lane::types::LogicalBoundaryType value);

template <>
::nds::lane::types::LogicalBoundaryType read<::nds::lane::types::LogicalBoundaryType>(::zserio::BitStreamReader& in);

template <>
::nds::lane::types::LogicalBoundaryType read<::nds::lane::types::LogicalBoundaryType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::lane::types::LogicalBoundaryType>(::zserio::BitStreamWriter& out, ::nds::lane::types::LogicalBoundaryType value);

template <>
void write<::zserio::DeltaContext, ::nds::lane::types::LogicalBoundaryType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::lane::types::LogicalBoundaryType value);

} // namespace zserio

#endif // NDS_LANE_TYPES_LOGICAL_BOUNDARY_TYPE_H
