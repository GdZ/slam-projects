/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_ROADSURFACE_ROAD_SURFACE_POLYGON_PHYSICAL_TYPE_H
#define NDS_LANE_ROADSURFACE_ROAD_SURFACE_POLYGON_PHYSICAL_TYPE_H

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

enum class RoadSurfacePolygonPhysicalType : uint32_t
{
    UNKNOWN = UINT32_C(0),
    PAVED = UINT32_C(1),
    UNPAVED = UINT32_C(2),
    GRAVEL = UINT32_C(3),
    MANHOLE = UINT32_C(4),
    POTHOLE = UINT32_C(5),
    DITCH = UINT32_C(6)
};

} // namespace roadsurface
} // namespace lane
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RoadSurfacePolygonPhysicalType enumeration.
template <>
struct EnumTraits<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>
{
    static constexpr ::std::array<const char*, 7> names =
    {{
        "UNKNOWN",
        "PAVED",
        "UNPAVED",
        "GRAVEL",
        "MANHOLE",
        "POTHOLE",
        "DITCH"
    }};

    static constexpr ::std::array<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType, 7> values =
    {{
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType::UNKNOWN,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType::PAVED,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType::UNPAVED,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType::GRAVEL,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType::MANHOLE,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType::POTHOLE,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType::DITCH
    }};

    static constexpr const char* enumName = "RoadSurfacePolygonPhysicalType";
};

template <>
size_t enumToOrdinal<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType valueToEnum<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(
        typename ::std::underlying_type<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::zserio::DeltaContext& context, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
size_t bitSizeOf<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::zserio::DeltaContext& context, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
size_t initializeOffsets<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(size_t bitPosition, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType read<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::zserio::BitStreamReader& in);

template <>
::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType read<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::zserio::BitStreamWriter& out, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

template <>
void write<::zserio::DeltaContext, ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::lane::roadsurface::RoadSurfacePolygonPhysicalType value);

} // namespace zserio

#endif // NDS_LANE_ROADSURFACE_ROAD_SURFACE_POLYGON_PHYSICAL_TYPE_H
