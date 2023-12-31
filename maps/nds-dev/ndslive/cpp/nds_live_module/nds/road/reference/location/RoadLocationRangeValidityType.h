/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_REFERENCE_LOCATION_ROAD_LOCATION_RANGE_VALIDITY_TYPE_H
#define NDS_ROAD_REFERENCE_LOCATION_ROAD_LOCATION_RANGE_VALIDITY_TYPE_H

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
namespace road
{
namespace reference
{
namespace location
{

enum class RoadLocationRangeValidityType : uint8_t
{
    COMPLETE = UINT8_C(0),
    RANGE = UINT8_C(1)
};

} // namespace location
} // namespace reference
} // namespace road
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RoadLocationRangeValidityType enumeration.
template <>
struct EnumTraits<::nds::road::reference::location::RoadLocationRangeValidityType>
{
    static constexpr ::std::array<const char*, 2> names =
    {{
        "COMPLETE",
        "RANGE"
    }};

    static constexpr ::std::array<::nds::road::reference::location::RoadLocationRangeValidityType, 2> values =
    {{
        ::nds::road::reference::location::RoadLocationRangeValidityType::COMPLETE,
        ::nds::road::reference::location::RoadLocationRangeValidityType::RANGE
    }};

    static constexpr const char* enumName = "RoadLocationRangeValidityType";
};

template <>
size_t enumToOrdinal<::nds::road::reference::location::RoadLocationRangeValidityType>(::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
::nds::road::reference::location::RoadLocationRangeValidityType valueToEnum<::nds::road::reference::location::RoadLocationRangeValidityType>(
        typename ::std::underlying_type<::nds::road::reference::location::RoadLocationRangeValidityType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::road::reference::location::RoadLocationRangeValidityType>(::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::road::reference::location::RoadLocationRangeValidityType>(::zserio::DeltaContext& context, ::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
size_t bitSizeOf<::nds::road::reference::location::RoadLocationRangeValidityType>(::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::road::reference::location::RoadLocationRangeValidityType>(::zserio::DeltaContext& context, ::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
size_t initializeOffsets<::nds::road::reference::location::RoadLocationRangeValidityType>(size_t bitPosition, ::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::road::reference::location::RoadLocationRangeValidityType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
::nds::road::reference::location::RoadLocationRangeValidityType read<::nds::road::reference::location::RoadLocationRangeValidityType>(::zserio::BitStreamReader& in);

template <>
::nds::road::reference::location::RoadLocationRangeValidityType read<::nds::road::reference::location::RoadLocationRangeValidityType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::road::reference::location::RoadLocationRangeValidityType>(::zserio::BitStreamWriter& out, ::nds::road::reference::location::RoadLocationRangeValidityType value);

template <>
void write<::zserio::DeltaContext, ::nds::road::reference::location::RoadLocationRangeValidityType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::road::reference::location::RoadLocationRangeValidityType value);

} // namespace zserio

#endif // NDS_ROAD_REFERENCE_LOCATION_ROAD_LOCATION_RANGE_VALIDITY_TYPE_H
