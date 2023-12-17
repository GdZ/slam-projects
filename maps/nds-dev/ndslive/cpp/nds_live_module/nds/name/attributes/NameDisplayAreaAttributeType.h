/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_DISPLAY_AREA_ATTRIBUTE_TYPE_H
#define NDS_NAME_ATTRIBUTES_NAME_DISPLAY_AREA_ATTRIBUTE_TYPE_H

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
namespace name
{
namespace attributes
{

enum class NameDisplayAreaAttributeType : uint16_t
{
    ROAD_NAME = UINT16_C(0),
    BRIDGE_NAME = UINT16_C(1),
    TUNNEL_NAME = UINT16_C(2),
    AREA_LABEL_NAME = UINT16_C(3),
    BUILDING_NAME = UINT16_C(4),
    NATURE_AREA_NAME = UINT16_C(5),
    WATER_NAME = UINT16_C(6),
    ADMINISTRATIVE_AREA_NAME = UINT16_C(7),
    ADMINISTRATIVE_HIERARCHY = UINT16_C(8),
    SERVICE_AREA_NAME = UINT16_C(9),
    INTERSECTION_NAME = UINT16_C(10)
};

} // namespace attributes
} // namespace name
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for NameDisplayAreaAttributeType enumeration.
template <>
struct EnumTraits<::nds::name::attributes::NameDisplayAreaAttributeType>
{
    static constexpr ::std::array<const char*, 11> names =
    {{
        "ROAD_NAME",
        "BRIDGE_NAME",
        "TUNNEL_NAME",
        "AREA_LABEL_NAME",
        "BUILDING_NAME",
        "NATURE_AREA_NAME",
        "WATER_NAME",
        "ADMINISTRATIVE_AREA_NAME",
        "ADMINISTRATIVE_HIERARCHY",
        "SERVICE_AREA_NAME",
        "INTERSECTION_NAME"
    }};

    static constexpr ::std::array<::nds::name::attributes::NameDisplayAreaAttributeType, 11> values =
    {{
        ::nds::name::attributes::NameDisplayAreaAttributeType::ROAD_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::BRIDGE_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::TUNNEL_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::AREA_LABEL_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::BUILDING_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::NATURE_AREA_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::WATER_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::ADMINISTRATIVE_AREA_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::ADMINISTRATIVE_HIERARCHY,
        ::nds::name::attributes::NameDisplayAreaAttributeType::SERVICE_AREA_NAME,
        ::nds::name::attributes::NameDisplayAreaAttributeType::INTERSECTION_NAME
    }};

    static constexpr const char* enumName = "NameDisplayAreaAttributeType";
};

template <>
size_t enumToOrdinal<::nds::name::attributes::NameDisplayAreaAttributeType>(::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
::nds::name::attributes::NameDisplayAreaAttributeType valueToEnum<::nds::name::attributes::NameDisplayAreaAttributeType>(
        typename ::std::underlying_type<::nds::name::attributes::NameDisplayAreaAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::name::attributes::NameDisplayAreaAttributeType>(::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::name::attributes::NameDisplayAreaAttributeType>(::zserio::DeltaContext& context, ::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
size_t bitSizeOf<::nds::name::attributes::NameDisplayAreaAttributeType>(::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::name::attributes::NameDisplayAreaAttributeType>(::zserio::DeltaContext& context, ::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
size_t initializeOffsets<::nds::name::attributes::NameDisplayAreaAttributeType>(size_t bitPosition, ::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::name::attributes::NameDisplayAreaAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
::nds::name::attributes::NameDisplayAreaAttributeType read<::nds::name::attributes::NameDisplayAreaAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::name::attributes::NameDisplayAreaAttributeType read<::nds::name::attributes::NameDisplayAreaAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::name::attributes::NameDisplayAreaAttributeType>(::zserio::BitStreamWriter& out, ::nds::name::attributes::NameDisplayAreaAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::name::attributes::NameDisplayAreaAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::name::attributes::NameDisplayAreaAttributeType value);

} // namespace zserio

#endif // NDS_NAME_ATTRIBUTES_NAME_DISPLAY_AREA_ATTRIBUTE_TYPE_H