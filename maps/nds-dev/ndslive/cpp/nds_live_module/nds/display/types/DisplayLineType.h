/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_DISPLAY_LINE_TYPE_H
#define NDS_DISPLAY_TYPES_DISPLAY_LINE_TYPE_H

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
namespace display
{
namespace types
{

enum class DisplayLineType : uint16_t
{
    DISPLAY_LINE = UINT16_C(0),
    LINE_ROAD = UINT16_C(1),
    LINE_BLOCK_DETAIL = UINT16_C(2),
    LINE_BUILDING_DETAIL = UINT16_C(3),
    LINE_PUBLIC_TRANSPORT = UINT16_C(4),
    LINE_RAILWAY = UINT16_C(5),
    LINE_RAILWAY_LONG_DISTANCE = UINT16_C(6),
    LINE_RAILWAY_REGIONAL = UINT16_C(7),
    LINE_RAILWAY_LOCAL = UINT16_C(8),
    LINE_SUBWAY = UINT16_C(9),
    LINE_TRAM = UINT16_C(10),
    LINE_MONORAIL = UINT16_C(11),
    LINE_BUS = UINT16_C(12),
    LINE_WATER = UINT16_C(13),
    LINE_CREEK = UINT16_C(14),
    LINE_DRAIN = UINT16_C(15),
    LINE_RIVER = UINT16_C(16),
    LINE_WADI = UINT16_C(17),
    LINE_CANAL = UINT16_C(18),
    LINE_BORDER = UINT16_C(19),
    LINE_BORDER_COUNTRY = UINT16_C(20),
    LINE_BORDER_SUB_COUNTRY_SET = UINT16_C(21),
    LINE_BORDER_SUB_COUNTRY = UINT16_C(22),
    LINE_BORDER_COUNTY = UINT16_C(23),
    LINE_BORDER_MUNICIPALITY = UINT16_C(24),
    LINE_BORDER_MUNICIPALITY_SUBDIVISION = UINT16_C(25),
    LINE_BORDER_NEIGHBORHOOD = UINT16_C(26),
    LINE_BORDER_CITY_BLOCK = UINT16_C(27),
    LINE_BORDER_NON_ADMIN = UINT16_C(28),
    LINE_BORDER_PHONE = UINT16_C(29),
    LINE_BORDER_POSTAL = UINT16_C(30),
    LINE_BORDER_POLICE = UINT16_C(31),
    LINE_BORDER_SCHOOL = UINT16_C(32),
    LINE_TIME_ZONE = UINT16_C(33),
    LINE_BORDER_DISPUTED = UINT16_C(34),
    LINE_BORDER_DISPUTED_COUNTRY = UINT16_C(35),
    LINE_BORDER_DISPUTED_SUB_COUNTRY = UINT16_C(36),
    LINE_BORDER_TREATY_LINE = UINT16_C(37),
    LINE_BORDER_TREATY_LINE_COUNTRY = UINT16_C(38),
    LINE_BORDER_TREATY_LINE_SUB_COUNTRY = UINT16_C(39),
    LINE_SEA_BORDER_COUNTRY = UINT16_C(40),
    LINE_SEA_BORDER_SUB_COUNTRY = UINT16_C(41),
    LINE_BORDER_SPECIAL_ADMIN_REGION = UINT16_C(42),
    LINE_SEA_BORDER_SUB_COUNTRY_SET = UINT16_C(43)
};

} // namespace types
} // namespace display
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for DisplayLineType enumeration.
template <>
struct EnumTraits<::nds::display::types::DisplayLineType>
{
    static constexpr ::std::array<const char*, 44> names =
    {{
        "DISPLAY_LINE",
        "LINE_ROAD",
        "LINE_BLOCK_DETAIL",
        "LINE_BUILDING_DETAIL",
        "LINE_PUBLIC_TRANSPORT",
        "LINE_RAILWAY",
        "LINE_RAILWAY_LONG_DISTANCE",
        "LINE_RAILWAY_REGIONAL",
        "LINE_RAILWAY_LOCAL",
        "LINE_SUBWAY",
        "LINE_TRAM",
        "LINE_MONORAIL",
        "LINE_BUS",
        "LINE_WATER",
        "LINE_CREEK",
        "LINE_DRAIN",
        "LINE_RIVER",
        "LINE_WADI",
        "LINE_CANAL",
        "LINE_BORDER",
        "LINE_BORDER_COUNTRY",
        "LINE_BORDER_SUB_COUNTRY_SET",
        "LINE_BORDER_SUB_COUNTRY",
        "LINE_BORDER_COUNTY",
        "LINE_BORDER_MUNICIPALITY",
        "LINE_BORDER_MUNICIPALITY_SUBDIVISION",
        "LINE_BORDER_NEIGHBORHOOD",
        "LINE_BORDER_CITY_BLOCK",
        "LINE_BORDER_NON_ADMIN",
        "LINE_BORDER_PHONE",
        "LINE_BORDER_POSTAL",
        "LINE_BORDER_POLICE",
        "LINE_BORDER_SCHOOL",
        "LINE_TIME_ZONE",
        "LINE_BORDER_DISPUTED",
        "LINE_BORDER_DISPUTED_COUNTRY",
        "LINE_BORDER_DISPUTED_SUB_COUNTRY",
        "LINE_BORDER_TREATY_LINE",
        "LINE_BORDER_TREATY_LINE_COUNTRY",
        "LINE_BORDER_TREATY_LINE_SUB_COUNTRY",
        "LINE_SEA_BORDER_COUNTRY",
        "LINE_SEA_BORDER_SUB_COUNTRY",
        "LINE_BORDER_SPECIAL_ADMIN_REGION",
        "LINE_SEA_BORDER_SUB_COUNTRY_SET"
    }};

    static constexpr ::std::array<::nds::display::types::DisplayLineType, 44> values =
    {{
        ::nds::display::types::DisplayLineType::DISPLAY_LINE,
        ::nds::display::types::DisplayLineType::LINE_ROAD,
        ::nds::display::types::DisplayLineType::LINE_BLOCK_DETAIL,
        ::nds::display::types::DisplayLineType::LINE_BUILDING_DETAIL,
        ::nds::display::types::DisplayLineType::LINE_PUBLIC_TRANSPORT,
        ::nds::display::types::DisplayLineType::LINE_RAILWAY,
        ::nds::display::types::DisplayLineType::LINE_RAILWAY_LONG_DISTANCE,
        ::nds::display::types::DisplayLineType::LINE_RAILWAY_REGIONAL,
        ::nds::display::types::DisplayLineType::LINE_RAILWAY_LOCAL,
        ::nds::display::types::DisplayLineType::LINE_SUBWAY,
        ::nds::display::types::DisplayLineType::LINE_TRAM,
        ::nds::display::types::DisplayLineType::LINE_MONORAIL,
        ::nds::display::types::DisplayLineType::LINE_BUS,
        ::nds::display::types::DisplayLineType::LINE_WATER,
        ::nds::display::types::DisplayLineType::LINE_CREEK,
        ::nds::display::types::DisplayLineType::LINE_DRAIN,
        ::nds::display::types::DisplayLineType::LINE_RIVER,
        ::nds::display::types::DisplayLineType::LINE_WADI,
        ::nds::display::types::DisplayLineType::LINE_CANAL,
        ::nds::display::types::DisplayLineType::LINE_BORDER,
        ::nds::display::types::DisplayLineType::LINE_BORDER_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_SUB_COUNTRY_SET,
        ::nds::display::types::DisplayLineType::LINE_BORDER_SUB_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_COUNTY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_MUNICIPALITY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_MUNICIPALITY_SUBDIVISION,
        ::nds::display::types::DisplayLineType::LINE_BORDER_NEIGHBORHOOD,
        ::nds::display::types::DisplayLineType::LINE_BORDER_CITY_BLOCK,
        ::nds::display::types::DisplayLineType::LINE_BORDER_NON_ADMIN,
        ::nds::display::types::DisplayLineType::LINE_BORDER_PHONE,
        ::nds::display::types::DisplayLineType::LINE_BORDER_POSTAL,
        ::nds::display::types::DisplayLineType::LINE_BORDER_POLICE,
        ::nds::display::types::DisplayLineType::LINE_BORDER_SCHOOL,
        ::nds::display::types::DisplayLineType::LINE_TIME_ZONE,
        ::nds::display::types::DisplayLineType::LINE_BORDER_DISPUTED,
        ::nds::display::types::DisplayLineType::LINE_BORDER_DISPUTED_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_DISPUTED_SUB_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_TREATY_LINE,
        ::nds::display::types::DisplayLineType::LINE_BORDER_TREATY_LINE_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_TREATY_LINE_SUB_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_SEA_BORDER_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_SEA_BORDER_SUB_COUNTRY,
        ::nds::display::types::DisplayLineType::LINE_BORDER_SPECIAL_ADMIN_REGION,
        ::nds::display::types::DisplayLineType::LINE_SEA_BORDER_SUB_COUNTRY_SET
    }};

    static constexpr const char* enumName = "DisplayLineType";
};

template <>
size_t enumToOrdinal<::nds::display::types::DisplayLineType>(::nds::display::types::DisplayLineType value);

template <>
::nds::display::types::DisplayLineType valueToEnum<::nds::display::types::DisplayLineType>(
        typename ::std::underlying_type<::nds::display::types::DisplayLineType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::display::types::DisplayLineType>(::nds::display::types::DisplayLineType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::display::types::DisplayLineType>(::zserio::DeltaContext& context, ::nds::display::types::DisplayLineType value);

template <>
size_t bitSizeOf<::nds::display::types::DisplayLineType>(::nds::display::types::DisplayLineType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::display::types::DisplayLineType>(::zserio::DeltaContext& context, ::nds::display::types::DisplayLineType value);

template <>
size_t initializeOffsets<::nds::display::types::DisplayLineType>(size_t bitPosition, ::nds::display::types::DisplayLineType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::display::types::DisplayLineType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::display::types::DisplayLineType value);

template <>
::nds::display::types::DisplayLineType read<::nds::display::types::DisplayLineType>(::zserio::BitStreamReader& in);

template <>
::nds::display::types::DisplayLineType read<::nds::display::types::DisplayLineType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::display::types::DisplayLineType>(::zserio::BitStreamWriter& out, ::nds::display::types::DisplayLineType value);

template <>
void write<::zserio::DeltaContext, ::nds::display::types::DisplayLineType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::display::types::DisplayLineType value);

} // namespace zserio

#endif // NDS_DISPLAY_TYPES_DISPLAY_LINE_TYPE_H