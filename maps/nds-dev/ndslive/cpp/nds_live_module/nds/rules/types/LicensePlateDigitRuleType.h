/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_TYPES_LICENSE_PLATE_DIGIT_RULE_TYPE_H
#define NDS_RULES_TYPES_LICENSE_PLATE_DIGIT_RULE_TYPE_H

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
namespace rules
{
namespace types
{

enum class LicensePlateDigitRuleType : uint8_t
{
    ODD_NUMBER = UINT8_C(0),
    EVEN_NUMBER = UINT8_C(1),
    SPECIAL_DIGIT = UINT8_C(2)
};

} // namespace types
} // namespace rules
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for LicensePlateDigitRuleType enumeration.
template <>
struct EnumTraits<::nds::rules::types::LicensePlateDigitRuleType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "ODD_NUMBER",
        "EVEN_NUMBER",
        "SPECIAL_DIGIT"
    }};

    static constexpr ::std::array<::nds::rules::types::LicensePlateDigitRuleType, 3> values =
    {{
        ::nds::rules::types::LicensePlateDigitRuleType::ODD_NUMBER,
        ::nds::rules::types::LicensePlateDigitRuleType::EVEN_NUMBER,
        ::nds::rules::types::LicensePlateDigitRuleType::SPECIAL_DIGIT
    }};

    static constexpr const char* enumName = "LicensePlateDigitRuleType";
};

template <>
size_t enumToOrdinal<::nds::rules::types::LicensePlateDigitRuleType>(::nds::rules::types::LicensePlateDigitRuleType value);

template <>
::nds::rules::types::LicensePlateDigitRuleType valueToEnum<::nds::rules::types::LicensePlateDigitRuleType>(
        typename ::std::underlying_type<::nds::rules::types::LicensePlateDigitRuleType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::rules::types::LicensePlateDigitRuleType>(::nds::rules::types::LicensePlateDigitRuleType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::rules::types::LicensePlateDigitRuleType>(::zserio::DeltaContext& context, ::nds::rules::types::LicensePlateDigitRuleType value);

template <>
size_t bitSizeOf<::nds::rules::types::LicensePlateDigitRuleType>(::nds::rules::types::LicensePlateDigitRuleType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::rules::types::LicensePlateDigitRuleType>(::zserio::DeltaContext& context, ::nds::rules::types::LicensePlateDigitRuleType value);

template <>
size_t initializeOffsets<::nds::rules::types::LicensePlateDigitRuleType>(size_t bitPosition, ::nds::rules::types::LicensePlateDigitRuleType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::rules::types::LicensePlateDigitRuleType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::rules::types::LicensePlateDigitRuleType value);

template <>
::nds::rules::types::LicensePlateDigitRuleType read<::nds::rules::types::LicensePlateDigitRuleType>(::zserio::BitStreamReader& in);

template <>
::nds::rules::types::LicensePlateDigitRuleType read<::nds::rules::types::LicensePlateDigitRuleType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::rules::types::LicensePlateDigitRuleType>(::zserio::BitStreamWriter& out, ::nds::rules::types::LicensePlateDigitRuleType value);

template <>
void write<::zserio::DeltaContext, ::nds::rules::types::LicensePlateDigitRuleType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::rules::types::LicensePlateDigitRuleType value);

} // namespace zserio

#endif // NDS_RULES_TYPES_LICENSE_PLATE_DIGIT_RULE_TYPE_H