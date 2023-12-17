/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_LANE_RANGE_ATTRIBUTE_TYPE_H
#define NDS_NAME_ATTRIBUTES_NAME_LANE_RANGE_ATTRIBUTE_TYPE_H

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

enum class NameLaneRangeAttributeType : uint16_t
{
    ROAD_NAME = UINT16_C(0),
    BRIDGE_NAME = UINT16_C(1),
    TUNNEL_NAME = UINT16_C(2),
    ROUTE_NAME = UINT16_C(3),
    ROAD_NUMBER = UINT16_C(4),
    ADMINISTRATIVE_HIERARCHY = UINT16_C(5),
    HOUSE_NUMBER_RANGE = UINT16_C(6),
    SERVICE_AREA_NAME = UINT16_C(7),
    INTERSECTION_NAME = UINT16_C(8)
};

} // namespace attributes
} // namespace name
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for NameLaneRangeAttributeType enumeration.
template <>
struct EnumTraits<::nds::name::attributes::NameLaneRangeAttributeType>
{
    static constexpr ::std::array<const char*, 9> names =
    {{
        "ROAD_NAME",
        "BRIDGE_NAME",
        "TUNNEL_NAME",
        "ROUTE_NAME",
        "ROAD_NUMBER",
        "ADMINISTRATIVE_HIERARCHY",
        "HOUSE_NUMBER_RANGE",
        "SERVICE_AREA_NAME",
        "INTERSECTION_NAME"
    }};

    static constexpr ::std::array<::nds::name::attributes::NameLaneRangeAttributeType, 9> values =
    {{
        ::nds::name::attributes::NameLaneRangeAttributeType::ROAD_NAME,
        ::nds::name::attributes::NameLaneRangeAttributeType::BRIDGE_NAME,
        ::nds::name::attributes::NameLaneRangeAttributeType::TUNNEL_NAME,
        ::nds::name::attributes::NameLaneRangeAttributeType::ROUTE_NAME,
        ::nds::name::attributes::NameLaneRangeAttributeType::ROAD_NUMBER,
        ::nds::name::attributes::NameLaneRangeAttributeType::ADMINISTRATIVE_HIERARCHY,
        ::nds::name::attributes::NameLaneRangeAttributeType::HOUSE_NUMBER_RANGE,
        ::nds::name::attributes::NameLaneRangeAttributeType::SERVICE_AREA_NAME,
        ::nds::name::attributes::NameLaneRangeAttributeType::INTERSECTION_NAME
    }};

    static constexpr const char* enumName = "NameLaneRangeAttributeType";
};

template <>
size_t enumToOrdinal<::nds::name::attributes::NameLaneRangeAttributeType>(::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
::nds::name::attributes::NameLaneRangeAttributeType valueToEnum<::nds::name::attributes::NameLaneRangeAttributeType>(
        typename ::std::underlying_type<::nds::name::attributes::NameLaneRangeAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::name::attributes::NameLaneRangeAttributeType>(::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::name::attributes::NameLaneRangeAttributeType>(::zserio::DeltaContext& context, ::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
size_t bitSizeOf<::nds::name::attributes::NameLaneRangeAttributeType>(::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::name::attributes::NameLaneRangeAttributeType>(::zserio::DeltaContext& context, ::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
size_t initializeOffsets<::nds::name::attributes::NameLaneRangeAttributeType>(size_t bitPosition, ::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::name::attributes::NameLaneRangeAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
::nds::name::attributes::NameLaneRangeAttributeType read<::nds::name::attributes::NameLaneRangeAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::name::attributes::NameLaneRangeAttributeType read<::nds::name::attributes::NameLaneRangeAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::name::attributes::NameLaneRangeAttributeType>(::zserio::BitStreamWriter& out, ::nds::name::attributes::NameLaneRangeAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::name::attributes::NameLaneRangeAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::name::attributes::NameLaneRangeAttributeType value);

} // namespace zserio

#endif // NDS_NAME_ATTRIBUTES_NAME_LANE_RANGE_ATTRIBUTE_TYPE_H
