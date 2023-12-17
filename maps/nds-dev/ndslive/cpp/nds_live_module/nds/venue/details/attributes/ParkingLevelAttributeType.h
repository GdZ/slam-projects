/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_LEVEL_ATTRIBUTE_TYPE_H
#define NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_LEVEL_ATTRIBUTE_TYPE_H

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
namespace venue
{
namespace details
{
namespace attributes
{

enum class ParkingLevelAttributeType : uint16_t
{
    PARKING_LEVEL_NAME = UINT16_C(0),
    PROHIBITED_ACCESS = UINT16_C(1),
    PARKING_LEVEL_SLOPE = UINT16_C(2)
};

} // namespace attributes
} // namespace details
} // namespace venue
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for ParkingLevelAttributeType enumeration.
template <>
struct EnumTraits<::nds::venue::details::attributes::ParkingLevelAttributeType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "PARKING_LEVEL_NAME",
        "PROHIBITED_ACCESS",
        "PARKING_LEVEL_SLOPE"
    }};

    static constexpr ::std::array<::nds::venue::details::attributes::ParkingLevelAttributeType, 3> values =
    {{
        ::nds::venue::details::attributes::ParkingLevelAttributeType::PARKING_LEVEL_NAME,
        ::nds::venue::details::attributes::ParkingLevelAttributeType::PROHIBITED_ACCESS,
        ::nds::venue::details::attributes::ParkingLevelAttributeType::PARKING_LEVEL_SLOPE
    }};

    static constexpr const char* enumName = "ParkingLevelAttributeType";
};

template <>
size_t enumToOrdinal<::nds::venue::details::attributes::ParkingLevelAttributeType>(::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
::nds::venue::details::attributes::ParkingLevelAttributeType valueToEnum<::nds::venue::details::attributes::ParkingLevelAttributeType>(
        typename ::std::underlying_type<::nds::venue::details::attributes::ParkingLevelAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::venue::details::attributes::ParkingLevelAttributeType>(::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::venue::details::attributes::ParkingLevelAttributeType>(::zserio::DeltaContext& context, ::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
size_t bitSizeOf<::nds::venue::details::attributes::ParkingLevelAttributeType>(::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::venue::details::attributes::ParkingLevelAttributeType>(::zserio::DeltaContext& context, ::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
size_t initializeOffsets<::nds::venue::details::attributes::ParkingLevelAttributeType>(size_t bitPosition, ::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::venue::details::attributes::ParkingLevelAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
::nds::venue::details::attributes::ParkingLevelAttributeType read<::nds::venue::details::attributes::ParkingLevelAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::venue::details::attributes::ParkingLevelAttributeType read<::nds::venue::details::attributes::ParkingLevelAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::venue::details::attributes::ParkingLevelAttributeType>(::zserio::BitStreamWriter& out, ::nds::venue::details::attributes::ParkingLevelAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::venue::details::attributes::ParkingLevelAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::venue::details::attributes::ParkingLevelAttributeType value);

} // namespace zserio

#endif // NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_LEVEL_ATTRIBUTE_TYPE_H
