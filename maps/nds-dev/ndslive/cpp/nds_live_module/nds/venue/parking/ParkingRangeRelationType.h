/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_PARKING_PARKING_RANGE_RELATION_TYPE_H
#define NDS_VENUE_PARKING_PARKING_RANGE_RELATION_TYPE_H

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
namespace venue
{
namespace parking
{

enum class ParkingRangeRelationType : uint8_t
{
    PART_OF_SECTION = UINT8_C(0),
    ACCESS_PARKING_ROW = UINT8_C(1)
};

} // namespace parking
} // namespace venue
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for ParkingRangeRelationType enumeration.
template <>
struct EnumTraits<::nds::venue::parking::ParkingRangeRelationType>
{
    static constexpr ::std::array<const char*, 2> names =
    {{
        "PART_OF_SECTION",
        "ACCESS_PARKING_ROW"
    }};

    static constexpr ::std::array<::nds::venue::parking::ParkingRangeRelationType, 2> values =
    {{
        ::nds::venue::parking::ParkingRangeRelationType::PART_OF_SECTION,
        ::nds::venue::parking::ParkingRangeRelationType::ACCESS_PARKING_ROW
    }};

    static constexpr const char* enumName = "ParkingRangeRelationType";
};

template <>
size_t enumToOrdinal<::nds::venue::parking::ParkingRangeRelationType>(::nds::venue::parking::ParkingRangeRelationType value);

template <>
::nds::venue::parking::ParkingRangeRelationType valueToEnum<::nds::venue::parking::ParkingRangeRelationType>(
        typename ::std::underlying_type<::nds::venue::parking::ParkingRangeRelationType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::venue::parking::ParkingRangeRelationType>(::nds::venue::parking::ParkingRangeRelationType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::venue::parking::ParkingRangeRelationType>(::zserio::DeltaContext& context, ::nds::venue::parking::ParkingRangeRelationType value);

template <>
size_t bitSizeOf<::nds::venue::parking::ParkingRangeRelationType>(::nds::venue::parking::ParkingRangeRelationType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::venue::parking::ParkingRangeRelationType>(::zserio::DeltaContext& context, ::nds::venue::parking::ParkingRangeRelationType value);

template <>
size_t initializeOffsets<::nds::venue::parking::ParkingRangeRelationType>(size_t bitPosition, ::nds::venue::parking::ParkingRangeRelationType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::venue::parking::ParkingRangeRelationType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::venue::parking::ParkingRangeRelationType value);

template <>
::nds::venue::parking::ParkingRangeRelationType read<::nds::venue::parking::ParkingRangeRelationType>(::zserio::BitStreamReader& in);

template <>
::nds::venue::parking::ParkingRangeRelationType read<::nds::venue::parking::ParkingRangeRelationType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::venue::parking::ParkingRangeRelationType>(::zserio::BitStreamWriter& out, ::nds::venue::parking::ParkingRangeRelationType value);

template <>
void write<::zserio::DeltaContext, ::nds::venue::parking::ParkingRangeRelationType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::venue::parking::ParkingRangeRelationType value);

} // namespace zserio

#endif // NDS_VENUE_PARKING_PARKING_RANGE_RELATION_TYPE_H
