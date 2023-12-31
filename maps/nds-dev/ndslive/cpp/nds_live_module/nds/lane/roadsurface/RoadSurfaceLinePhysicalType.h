/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_ROADSURFACE_ROAD_SURFACE_LINE_PHYSICAL_TYPE_H
#define NDS_LANE_ROADSURFACE_ROAD_SURFACE_LINE_PHYSICAL_TYPE_H

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
namespace lane
{
namespace roadsurface
{

enum class RoadSurfaceLinePhysicalType : uint32_t
{
    UNKNOWN = UINT32_C(0),
    PAVED = UINT32_C(1),
    RAIL = UINT32_C(2),
    CURB = UINT32_C(3)
};

} // namespace roadsurface
} // namespace lane
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RoadSurfaceLinePhysicalType enumeration.
template <>
struct EnumTraits<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "UNKNOWN",
        "PAVED",
        "RAIL",
        "CURB"
    }};

    static constexpr ::std::array<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType, 4> values =
    {{
        ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType::UNKNOWN,
        ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType::PAVED,
        ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType::RAIL,
        ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType::CURB
    }};

    static constexpr const char* enumName = "RoadSurfaceLinePhysicalType";
};

template <>
size_t enumToOrdinal<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
::nds::lane::roadsurface::RoadSurfaceLinePhysicalType valueToEnum<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(
        typename ::std::underlying_type<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::zserio::DeltaContext& context, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
size_t bitSizeOf<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::zserio::DeltaContext& context, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
size_t initializeOffsets<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(size_t bitPosition, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
::nds::lane::roadsurface::RoadSurfaceLinePhysicalType read<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::zserio::BitStreamReader& in);

template <>
::nds::lane::roadsurface::RoadSurfaceLinePhysicalType read<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::zserio::BitStreamWriter& out, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

template <>
void write<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::lane::roadsurface::RoadSurfaceLinePhysicalType value);

} // namespace zserio

#endif // NDS_LANE_ROADSURFACE_ROAD_SURFACE_LINE_PHYSICAL_TYPE_H
