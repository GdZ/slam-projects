/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_OCCUPANCY_COUNT_H
#define NDS_CORE_CONDITIONS_OCCUPANCY_COUNT_H

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
namespace conditions
{

enum class OccupancyCount : uint8_t
{
    TWO_PERSONS = UINT8_C(0),
    THREE_PERSONS = UINT8_C(1),
    FOUR_PERSONS = UINT8_C(2),
    FIVE_PERSONS = UINT8_C(3),
    SIX_PERSONS = UINT8_C(4),
    SEVEN_PERSONS = UINT8_C(5),
    EIGHT_PERSONS = UINT8_C(6)
};

} // namespace conditions
} // namespace core
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for OccupancyCount enumeration.
template <>
struct EnumTraits<::nds::core::conditions::OccupancyCount>
{
    static constexpr ::std::array<const char*, 7> names =
    {{
        "TWO_PERSONS",
        "THREE_PERSONS",
        "FOUR_PERSONS",
        "FIVE_PERSONS",
        "SIX_PERSONS",
        "SEVEN_PERSONS",
        "EIGHT_PERSONS"
    }};

    static constexpr ::std::array<::nds::core::conditions::OccupancyCount, 7> values =
    {{
        ::nds::core::conditions::OccupancyCount::TWO_PERSONS,
        ::nds::core::conditions::OccupancyCount::THREE_PERSONS,
        ::nds::core::conditions::OccupancyCount::FOUR_PERSONS,
        ::nds::core::conditions::OccupancyCount::FIVE_PERSONS,
        ::nds::core::conditions::OccupancyCount::SIX_PERSONS,
        ::nds::core::conditions::OccupancyCount::SEVEN_PERSONS,
        ::nds::core::conditions::OccupancyCount::EIGHT_PERSONS
    }};

    static constexpr const char* enumName = "OccupancyCount";
};

template <>
size_t enumToOrdinal<::nds::core::conditions::OccupancyCount>(::nds::core::conditions::OccupancyCount value);

template <>
::nds::core::conditions::OccupancyCount valueToEnum<::nds::core::conditions::OccupancyCount>(
        typename ::std::underlying_type<::nds::core::conditions::OccupancyCount>::type rawValue);

template <>
uint32_t enumHashCode<::nds::core::conditions::OccupancyCount>(::nds::core::conditions::OccupancyCount value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::core::conditions::OccupancyCount>(::zserio::DeltaContext& context, ::nds::core::conditions::OccupancyCount value);

template <>
size_t bitSizeOf<::nds::core::conditions::OccupancyCount>(::nds::core::conditions::OccupancyCount value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::core::conditions::OccupancyCount>(::zserio::DeltaContext& context, ::nds::core::conditions::OccupancyCount value);

template <>
size_t initializeOffsets<::nds::core::conditions::OccupancyCount>(size_t bitPosition, ::nds::core::conditions::OccupancyCount value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::core::conditions::OccupancyCount>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::core::conditions::OccupancyCount value);

template <>
::nds::core::conditions::OccupancyCount read<::nds::core::conditions::OccupancyCount>(::zserio::BitStreamReader& in);

template <>
::nds::core::conditions::OccupancyCount read<::nds::core::conditions::OccupancyCount, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::core::conditions::OccupancyCount>(::zserio::BitStreamWriter& out, ::nds::core::conditions::OccupancyCount value);

template <>
void write<::zserio::DeltaContext, ::nds::core::conditions::OccupancyCount>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::core::conditions::OccupancyCount value);

} // namespace zserio

#endif // NDS_CORE_CONDITIONS_OCCUPANCY_COUNT_H
