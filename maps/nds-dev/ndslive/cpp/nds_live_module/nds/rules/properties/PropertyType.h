/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_PROPERTIES_PROPERTY_TYPE_H
#define NDS_RULES_PROPERTIES_PROPERTY_TYPE_H

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
namespace properties
{

enum class PropertyType : uint16_t
{
    CORE = UINT16_C(0),
    SUPPLEMENTARY_WARNING_SIGN = UINT16_C(1),
    VARIABLE_WARNING_SIGN_PROPERTIES = UINT16_C(2),
    ROADWORKS_TYPE = UINT16_C(3),
    TRAFFIC_LIGHTS_LAYOUT = UINT16_C(4),
    TRAFFIC_LIGHTS_FACES = UINT16_C(5),
    TRAFFIC_LIGHTS_USAGE_TYPE = UINT16_C(6),
    TRAFFIC_LIGHTS_TARGET_GROUP = UINT16_C(7),
    TRAFFIC_LIGHTS_CYCLE = UINT16_C(8),
    SUPPLEMENTARY_WARNING_SIGN_TEXT = UINT16_C(9)
};

} // namespace properties
} // namespace rules
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for PropertyType enumeration.
template <>
struct EnumTraits<::nds::rules::properties::PropertyType>
{
    static constexpr ::std::array<const char*, 10> names =
    {{
        "CORE",
        "SUPPLEMENTARY_WARNING_SIGN",
        "VARIABLE_WARNING_SIGN_PROPERTIES",
        "ROADWORKS_TYPE",
        "TRAFFIC_LIGHTS_LAYOUT",
        "TRAFFIC_LIGHTS_FACES",
        "TRAFFIC_LIGHTS_USAGE_TYPE",
        "TRAFFIC_LIGHTS_TARGET_GROUP",
        "TRAFFIC_LIGHTS_CYCLE",
        "SUPPLEMENTARY_WARNING_SIGN_TEXT"
    }};

    static constexpr ::std::array<::nds::rules::properties::PropertyType, 10> values =
    {{
        ::nds::rules::properties::PropertyType::CORE,
        ::nds::rules::properties::PropertyType::SUPPLEMENTARY_WARNING_SIGN,
        ::nds::rules::properties::PropertyType::VARIABLE_WARNING_SIGN_PROPERTIES,
        ::nds::rules::properties::PropertyType::ROADWORKS_TYPE,
        ::nds::rules::properties::PropertyType::TRAFFIC_LIGHTS_LAYOUT,
        ::nds::rules::properties::PropertyType::TRAFFIC_LIGHTS_FACES,
        ::nds::rules::properties::PropertyType::TRAFFIC_LIGHTS_USAGE_TYPE,
        ::nds::rules::properties::PropertyType::TRAFFIC_LIGHTS_TARGET_GROUP,
        ::nds::rules::properties::PropertyType::TRAFFIC_LIGHTS_CYCLE,
        ::nds::rules::properties::PropertyType::SUPPLEMENTARY_WARNING_SIGN_TEXT
    }};

    static constexpr const char* enumName = "PropertyType";
};

template <>
size_t enumToOrdinal<::nds::rules::properties::PropertyType>(::nds::rules::properties::PropertyType value);

template <>
::nds::rules::properties::PropertyType valueToEnum<::nds::rules::properties::PropertyType>(
        typename ::std::underlying_type<::nds::rules::properties::PropertyType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::rules::properties::PropertyType>(::nds::rules::properties::PropertyType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::rules::properties::PropertyType>(::zserio::DeltaContext& context, ::nds::rules::properties::PropertyType value);

template <>
size_t bitSizeOf<::nds::rules::properties::PropertyType>(::nds::rules::properties::PropertyType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::rules::properties::PropertyType>(::zserio::DeltaContext& context, ::nds::rules::properties::PropertyType value);

template <>
size_t initializeOffsets<::nds::rules::properties::PropertyType>(size_t bitPosition, ::nds::rules::properties::PropertyType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::rules::properties::PropertyType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::rules::properties::PropertyType value);

template <>
::nds::rules::properties::PropertyType read<::nds::rules::properties::PropertyType>(::zserio::BitStreamReader& in);

template <>
::nds::rules::properties::PropertyType read<::nds::rules::properties::PropertyType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::rules::properties::PropertyType>(::zserio::BitStreamWriter& out, ::nds::rules::properties::PropertyType value);

template <>
void write<::zserio::DeltaContext, ::nds::rules::properties::PropertyType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::rules::properties::PropertyType value);

} // namespace zserio

#endif // NDS_RULES_PROPERTIES_PROPERTY_TYPE_H
