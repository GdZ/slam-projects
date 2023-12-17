/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_TYPES_SYSTEM_OF_MEASUREMENT_H
#define NDS_RULES_TYPES_SYSTEM_OF_MEASUREMENT_H

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

enum class SystemOfMeasurement : uint8_t
{
    IMPERIAL = UINT8_C(0),
    METRIC = UINT8_C(1)
};

} // namespace types
} // namespace rules
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for SystemOfMeasurement enumeration.
template <>
struct EnumTraits<::nds::rules::types::SystemOfMeasurement>
{
    static constexpr ::std::array<const char*, 2> names =
    {{
        "IMPERIAL",
        "METRIC"
    }};

    static constexpr ::std::array<::nds::rules::types::SystemOfMeasurement, 2> values =
    {{
        ::nds::rules::types::SystemOfMeasurement::IMPERIAL,
        ::nds::rules::types::SystemOfMeasurement::METRIC
    }};

    static constexpr const char* enumName = "SystemOfMeasurement";
};

template <>
size_t enumToOrdinal<::nds::rules::types::SystemOfMeasurement>(::nds::rules::types::SystemOfMeasurement value);

template <>
::nds::rules::types::SystemOfMeasurement valueToEnum<::nds::rules::types::SystemOfMeasurement>(
        typename ::std::underlying_type<::nds::rules::types::SystemOfMeasurement>::type rawValue);

template <>
uint32_t enumHashCode<::nds::rules::types::SystemOfMeasurement>(::nds::rules::types::SystemOfMeasurement value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::rules::types::SystemOfMeasurement>(::zserio::DeltaContext& context, ::nds::rules::types::SystemOfMeasurement value);

template <>
size_t bitSizeOf<::nds::rules::types::SystemOfMeasurement>(::nds::rules::types::SystemOfMeasurement value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::rules::types::SystemOfMeasurement>(::zserio::DeltaContext& context, ::nds::rules::types::SystemOfMeasurement value);

template <>
size_t initializeOffsets<::nds::rules::types::SystemOfMeasurement>(size_t bitPosition, ::nds::rules::types::SystemOfMeasurement value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::rules::types::SystemOfMeasurement>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::rules::types::SystemOfMeasurement value);

template <>
::nds::rules::types::SystemOfMeasurement read<::nds::rules::types::SystemOfMeasurement>(::zserio::BitStreamReader& in);

template <>
::nds::rules::types::SystemOfMeasurement read<::nds::rules::types::SystemOfMeasurement, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::rules::types::SystemOfMeasurement>(::zserio::BitStreamWriter& out, ::nds::rules::types::SystemOfMeasurement value);

template <>
void write<::zserio::DeltaContext, ::nds::rules::types::SystemOfMeasurement>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::rules::types::SystemOfMeasurement value);

} // namespace zserio

#endif // NDS_RULES_TYPES_SYSTEM_OF_MEASUREMENT_H