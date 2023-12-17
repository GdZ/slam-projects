/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_ATTRIBUTES_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_TYPE_H
#define NDS_RULES_ATTRIBUTES_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_TYPE_H

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
namespace rules
{
namespace attributes
{

enum class RulesDisplayLinePositionAttributeType : uint16_t
{
    TRAFFIC_LIGHTS = UINT16_C(0),
    TRAFFIC_ENFORCEMENT_CAMERA = UINT16_C(1),
    WARNING_SIGN = UINT16_C(2),
    MOVABLE_WARNING_SIGN = UINT16_C(3)
};

} // namespace attributes
} // namespace rules
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RulesDisplayLinePositionAttributeType enumeration.
template <>
struct EnumTraits<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "TRAFFIC_LIGHTS",
        "TRAFFIC_ENFORCEMENT_CAMERA",
        "WARNING_SIGN",
        "MOVABLE_WARNING_SIGN"
    }};

    static constexpr ::std::array<::nds::rules::attributes::RulesDisplayLinePositionAttributeType, 4> values =
    {{
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeType::TRAFFIC_LIGHTS,
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeType::TRAFFIC_ENFORCEMENT_CAMERA,
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeType::WARNING_SIGN,
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeType::MOVABLE_WARNING_SIGN
    }};

    static constexpr const char* enumName = "RulesDisplayLinePositionAttributeType";
};

template <>
size_t enumToOrdinal<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
::nds::rules::attributes::RulesDisplayLinePositionAttributeType valueToEnum<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(
        typename ::std::underlying_type<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::zserio::DeltaContext& context, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
size_t bitSizeOf<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::zserio::DeltaContext& context, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
size_t initializeOffsets<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(size_t bitPosition, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
::nds::rules::attributes::RulesDisplayLinePositionAttributeType read<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::rules::attributes::RulesDisplayLinePositionAttributeType read<::nds::rules::attributes::RulesDisplayLinePositionAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::zserio::BitStreamWriter& out, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::rules::attributes::RulesDisplayLinePositionAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::rules::attributes::RulesDisplayLinePositionAttributeType value);

} // namespace zserio

#endif // NDS_RULES_ATTRIBUTES_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_TYPE_H
