/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_POI_POI_ROAD_POSITION_RELATION_TYPE_H
#define NDS_POI_POI_POI_ROAD_POSITION_RELATION_TYPE_H

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
namespace poi
{
namespace poi
{

enum class PoiRoadPositionRelationType : uint8_t
{
    ENTRY = UINT8_C(0),
    EXIT = UINT8_C(1),
    ENTRY_AND_EXIT = UINT8_C(2)
};

} // namespace poi
} // namespace poi
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for PoiRoadPositionRelationType enumeration.
template <>
struct EnumTraits<::nds::poi::poi::PoiRoadPositionRelationType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "ENTRY",
        "EXIT",
        "ENTRY_AND_EXIT"
    }};

    static constexpr ::std::array<::nds::poi::poi::PoiRoadPositionRelationType, 3> values =
    {{
        ::nds::poi::poi::PoiRoadPositionRelationType::ENTRY,
        ::nds::poi::poi::PoiRoadPositionRelationType::EXIT,
        ::nds::poi::poi::PoiRoadPositionRelationType::ENTRY_AND_EXIT
    }};

    static constexpr const char* enumName = "PoiRoadPositionRelationType";
};

template <>
size_t enumToOrdinal<::nds::poi::poi::PoiRoadPositionRelationType>(::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
::nds::poi::poi::PoiRoadPositionRelationType valueToEnum<::nds::poi::poi::PoiRoadPositionRelationType>(
        typename ::std::underlying_type<::nds::poi::poi::PoiRoadPositionRelationType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::poi::poi::PoiRoadPositionRelationType>(::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::poi::poi::PoiRoadPositionRelationType>(::zserio::DeltaContext& context, ::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
size_t bitSizeOf<::nds::poi::poi::PoiRoadPositionRelationType>(::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::poi::poi::PoiRoadPositionRelationType>(::zserio::DeltaContext& context, ::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
size_t initializeOffsets<::nds::poi::poi::PoiRoadPositionRelationType>(size_t bitPosition, ::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::poi::poi::PoiRoadPositionRelationType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
::nds::poi::poi::PoiRoadPositionRelationType read<::nds::poi::poi::PoiRoadPositionRelationType>(::zserio::BitStreamReader& in);

template <>
::nds::poi::poi::PoiRoadPositionRelationType read<::nds::poi::poi::PoiRoadPositionRelationType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::poi::poi::PoiRoadPositionRelationType>(::zserio::BitStreamWriter& out, ::nds::poi::poi::PoiRoadPositionRelationType value);

template <>
void write<::zserio::DeltaContext, ::nds::poi::poi::PoiRoadPositionRelationType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::poi::poi::PoiRoadPositionRelationType value);

} // namespace zserio

#endif // NDS_POI_POI_POI_ROAD_POSITION_RELATION_TYPE_H