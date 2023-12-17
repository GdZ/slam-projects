/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_TYPES_CUISINE_H
#define NDS_POI_TYPES_CUISINE_H

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
namespace types
{

enum class Cuisine : uint8_t
{
    OTHER = UINT8_C(0),
    CUSTOM = UINT8_C(1),
    AFGHAN = UINT8_C(2),
    AFRICAN = UINT8_C(3),
    AMERICAN = UINT8_C(4),
    ARAB = UINT8_C(5),
    ARGENTINIAN = UINT8_C(6),
    ASIAN = UINT8_C(7),
    AUSTRALIAN = UINT8_C(8),
    BAIANA = UINT8_C(9),
    BALKAN = UINT8_C(10),
    BASQUE = UINT8_C(11),
    BELARUSIAN = UINT8_C(12),
    BOLIVIAN = UINT8_C(13),
    BRAZILIAN = UINT8_C(14),
    CANTONESE = UINT8_C(15),
    CARIBBEAN = UINT8_C(16),
    CHINESE = UINT8_C(17),
    CROATIAN = UINT8_C(18),
    CZECH = UINT8_C(19),
    DANISH = UINT8_C(20),
    FILIPINO = UINT8_C(21),
    FRENCH = UINT8_C(22),
    GAUCHO = UINT8_C(23),
    GEORGIAN = UINT8_C(24),
    GERMAN = UINT8_C(25),
    GREEK = UINT8_C(26),
    HAWAIIAN = UINT8_C(27),
    HUNGARIAN = UINT8_C(28),
    INDIAN = UINT8_C(29),
    INDONESIAN = UINT8_C(30),
    INTERNATIONAL = UINT8_C(31),
    IRANIAN = UINT8_C(32),
    ITALIAN = UINT8_C(33),
    JAPANESE = UINT8_C(34),
    JEWISH = UINT8_C(35),
    KOREAN = UINT8_C(36),
    LATIN_AMERICAN = UINT8_C(37),
    LEBANESE = UINT8_C(38),
    MALAYSIAN = UINT8_C(39),
    MALAGASY = UINT8_C(40),
    MEDITERRANEAN = UINT8_C(41),
    MEXICAN = UINT8_C(42),
    PAKISTANI = UINT8_C(43),
    PERUVIAN = UINT8_C(44),
    POLISH = UINT8_C(45),
    PORTUGUESE = UINT8_C(46),
    REGIONAL = UINT8_C(47),
    RUSSIAN = UINT8_C(48),
    SCOTTISH = UINT8_C(49),
    SPANISH = UINT8_C(50),
    THAI = UINT8_C(51),
    TURKISH = UINT8_C(52),
    VIETNAMESE = UINT8_C(53),
    WESTERN = UINT8_C(54)
};

} // namespace types
} // namespace poi
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for Cuisine enumeration.
template <>
struct EnumTraits<::nds::poi::types::Cuisine>
{
    static constexpr ::std::array<const char*, 55> names =
    {{
        "OTHER",
        "CUSTOM",
        "AFGHAN",
        "AFRICAN",
        "AMERICAN",
        "ARAB",
        "ARGENTINIAN",
        "ASIAN",
        "AUSTRALIAN",
        "BAIANA",
        "BALKAN",
        "BASQUE",
        "BELARUSIAN",
        "BOLIVIAN",
        "BRAZILIAN",
        "CANTONESE",
        "CARIBBEAN",
        "CHINESE",
        "CROATIAN",
        "CZECH",
        "DANISH",
        "FILIPINO",
        "FRENCH",
        "GAUCHO",
        "GEORGIAN",
        "GERMAN",
        "GREEK",
        "HAWAIIAN",
        "HUNGARIAN",
        "INDIAN",
        "INDONESIAN",
        "INTERNATIONAL",
        "IRANIAN",
        "ITALIAN",
        "JAPANESE",
        "JEWISH",
        "KOREAN",
        "LATIN_AMERICAN",
        "LEBANESE",
        "MALAYSIAN",
        "MALAGASY",
        "MEDITERRANEAN",
        "MEXICAN",
        "PAKISTANI",
        "PERUVIAN",
        "POLISH",
        "PORTUGUESE",
        "REGIONAL",
        "RUSSIAN",
        "SCOTTISH",
        "SPANISH",
        "THAI",
        "TURKISH",
        "VIETNAMESE",
        "WESTERN"
    }};

    static constexpr ::std::array<::nds::poi::types::Cuisine, 55> values =
    {{
        ::nds::poi::types::Cuisine::OTHER,
        ::nds::poi::types::Cuisine::CUSTOM,
        ::nds::poi::types::Cuisine::AFGHAN,
        ::nds::poi::types::Cuisine::AFRICAN,
        ::nds::poi::types::Cuisine::AMERICAN,
        ::nds::poi::types::Cuisine::ARAB,
        ::nds::poi::types::Cuisine::ARGENTINIAN,
        ::nds::poi::types::Cuisine::ASIAN,
        ::nds::poi::types::Cuisine::AUSTRALIAN,
        ::nds::poi::types::Cuisine::BAIANA,
        ::nds::poi::types::Cuisine::BALKAN,
        ::nds::poi::types::Cuisine::BASQUE,
        ::nds::poi::types::Cuisine::BELARUSIAN,
        ::nds::poi::types::Cuisine::BOLIVIAN,
        ::nds::poi::types::Cuisine::BRAZILIAN,
        ::nds::poi::types::Cuisine::CANTONESE,
        ::nds::poi::types::Cuisine::CARIBBEAN,
        ::nds::poi::types::Cuisine::CHINESE,
        ::nds::poi::types::Cuisine::CROATIAN,
        ::nds::poi::types::Cuisine::CZECH,
        ::nds::poi::types::Cuisine::DANISH,
        ::nds::poi::types::Cuisine::FILIPINO,
        ::nds::poi::types::Cuisine::FRENCH,
        ::nds::poi::types::Cuisine::GAUCHO,
        ::nds::poi::types::Cuisine::GEORGIAN,
        ::nds::poi::types::Cuisine::GERMAN,
        ::nds::poi::types::Cuisine::GREEK,
        ::nds::poi::types::Cuisine::HAWAIIAN,
        ::nds::poi::types::Cuisine::HUNGARIAN,
        ::nds::poi::types::Cuisine::INDIAN,
        ::nds::poi::types::Cuisine::INDONESIAN,
        ::nds::poi::types::Cuisine::INTERNATIONAL,
        ::nds::poi::types::Cuisine::IRANIAN,
        ::nds::poi::types::Cuisine::ITALIAN,
        ::nds::poi::types::Cuisine::JAPANESE,
        ::nds::poi::types::Cuisine::JEWISH,
        ::nds::poi::types::Cuisine::KOREAN,
        ::nds::poi::types::Cuisine::LATIN_AMERICAN,
        ::nds::poi::types::Cuisine::LEBANESE,
        ::nds::poi::types::Cuisine::MALAYSIAN,
        ::nds::poi::types::Cuisine::MALAGASY,
        ::nds::poi::types::Cuisine::MEDITERRANEAN,
        ::nds::poi::types::Cuisine::MEXICAN,
        ::nds::poi::types::Cuisine::PAKISTANI,
        ::nds::poi::types::Cuisine::PERUVIAN,
        ::nds::poi::types::Cuisine::POLISH,
        ::nds::poi::types::Cuisine::PORTUGUESE,
        ::nds::poi::types::Cuisine::REGIONAL,
        ::nds::poi::types::Cuisine::RUSSIAN,
        ::nds::poi::types::Cuisine::SCOTTISH,
        ::nds::poi::types::Cuisine::SPANISH,
        ::nds::poi::types::Cuisine::THAI,
        ::nds::poi::types::Cuisine::TURKISH,
        ::nds::poi::types::Cuisine::VIETNAMESE,
        ::nds::poi::types::Cuisine::WESTERN
    }};

    static constexpr const char* enumName = "Cuisine";
};

template <>
size_t enumToOrdinal<::nds::poi::types::Cuisine>(::nds::poi::types::Cuisine value);

template <>
::nds::poi::types::Cuisine valueToEnum<::nds::poi::types::Cuisine>(
        typename ::std::underlying_type<::nds::poi::types::Cuisine>::type rawValue);

template <>
uint32_t enumHashCode<::nds::poi::types::Cuisine>(::nds::poi::types::Cuisine value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::poi::types::Cuisine>(::zserio::DeltaContext& context, ::nds::poi::types::Cuisine value);

template <>
size_t bitSizeOf<::nds::poi::types::Cuisine>(::nds::poi::types::Cuisine value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::poi::types::Cuisine>(::zserio::DeltaContext& context, ::nds::poi::types::Cuisine value);

template <>
size_t initializeOffsets<::nds::poi::types::Cuisine>(size_t bitPosition, ::nds::poi::types::Cuisine value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::poi::types::Cuisine>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::poi::types::Cuisine value);

template <>
::nds::poi::types::Cuisine read<::nds::poi::types::Cuisine>(::zserio::BitStreamReader& in);

template <>
::nds::poi::types::Cuisine read<::nds::poi::types::Cuisine, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::poi::types::Cuisine>(::zserio::BitStreamWriter& out, ::nds::poi::types::Cuisine value);

template <>
void write<::zserio::DeltaContext, ::nds::poi::types::Cuisine>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::poi::types::Cuisine value);

} // namespace zserio

#endif // NDS_POI_TYPES_CUISINE_H