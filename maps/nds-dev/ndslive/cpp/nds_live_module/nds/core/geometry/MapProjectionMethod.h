/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_GEOMETRY_MAP_PROJECTION_METHOD_H
#define NDS_CORE_GEOMETRY_MAP_PROJECTION_METHOD_H

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
namespace core
{
namespace geometry
{

enum class MapProjectionMethod : uint8_t
{
    WGS_84_EPSG_4326 = UINT8_C(0),
    WEB_MERCATOR_EPSG_3857 = UINT8_C(1)
};

} // namespace geometry
} // namespace core
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for MapProjectionMethod enumeration.
template <>
struct EnumTraits<::nds::core::geometry::MapProjectionMethod>
{
    static constexpr ::std::array<const char*, 2> names =
    {{
        "WGS_84_EPSG_4326",
        "WEB_MERCATOR_EPSG_3857"
    }};

    static constexpr ::std::array<::nds::core::geometry::MapProjectionMethod, 2> values =
    {{
        ::nds::core::geometry::MapProjectionMethod::WGS_84_EPSG_4326,
        ::nds::core::geometry::MapProjectionMethod::WEB_MERCATOR_EPSG_3857
    }};

    static constexpr const char* enumName = "MapProjectionMethod";
};

template <>
size_t enumToOrdinal<::nds::core::geometry::MapProjectionMethod>(::nds::core::geometry::MapProjectionMethod value);

template <>
::nds::core::geometry::MapProjectionMethod valueToEnum<::nds::core::geometry::MapProjectionMethod>(
        typename ::std::underlying_type<::nds::core::geometry::MapProjectionMethod>::type rawValue);

template <>
uint32_t enumHashCode<::nds::core::geometry::MapProjectionMethod>(::nds::core::geometry::MapProjectionMethod value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::core::geometry::MapProjectionMethod>(::zserio::DeltaContext& context, ::nds::core::geometry::MapProjectionMethod value);

template <>
size_t bitSizeOf<::nds::core::geometry::MapProjectionMethod>(::nds::core::geometry::MapProjectionMethod value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::core::geometry::MapProjectionMethod>(::zserio::DeltaContext& context, ::nds::core::geometry::MapProjectionMethod value);

template <>
size_t initializeOffsets<::nds::core::geometry::MapProjectionMethod>(size_t bitPosition, ::nds::core::geometry::MapProjectionMethod value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::core::geometry::MapProjectionMethod>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::core::geometry::MapProjectionMethod value);

template <>
::nds::core::geometry::MapProjectionMethod read<::nds::core::geometry::MapProjectionMethod>(::zserio::BitStreamReader& in);

template <>
::nds::core::geometry::MapProjectionMethod read<::nds::core::geometry::MapProjectionMethod, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::core::geometry::MapProjectionMethod>(::zserio::BitStreamWriter& out, ::nds::core::geometry::MapProjectionMethod value);

template <>
void write<::zserio::DeltaContext, ::nds::core::geometry::MapProjectionMethod>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::core::geometry::MapProjectionMethod value);

} // namespace zserio

#endif // NDS_CORE_GEOMETRY_MAP_PROJECTION_METHOD_H
