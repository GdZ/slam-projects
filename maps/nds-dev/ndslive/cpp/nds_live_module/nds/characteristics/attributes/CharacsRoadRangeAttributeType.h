/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_ROAD_RANGE_ATTRIBUTE_TYPE_H
#define NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_ROAD_RANGE_ATTRIBUTE_TYPE_H

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
namespace characteristics
{
namespace attributes
{

enum class CharacsRoadRangeAttributeType : uint16_t
{
    COMPLETE_CARPOOL_ROAD = UINT16_C(0),
    PARTIAL_CARPOOL_ROAD = UINT16_C(1),
    PHYSICAL_WIDTH_METRIC = UINT16_C(2),
    TYPE_OF_PAVEMENT = UINT16_C(3),
    FERRY_TYPE = UINT16_C(4),
    DIVIDER_TYPE = UINT16_C(5),
    GRADE_TYPE = UINT16_C(6),
    STUBBLE = UINT16_C(7),
    RAILWAY_CROSSING = UINT16_C(8),
    PEDESTRIAN_CROSSING = UINT16_C(9),
    TRAFFIC_CALMING = UINT16_C(10),
    MOVABLE_BRIDGE = UINT16_C(11),
    SUPERELEVATION = UINT16_C(12),
    ROAD_MEDIAN = UINT16_C(13),
    HAS_SIDEWALK = UINT16_C(14),
    FRICTION = UINT16_C(15),
    STATION_PLAZA_TYPE = UINT16_C(16),
    MIDDLE_DIVIDER_TYPE = UINT16_C(17),
    AVERAGE_SPEED = UINT16_C(18),
    FUNCTIONAL_ROAD_CLASS = UINT16_C(19),
    PRIORITY_ROAD_CLASS = UINT16_C(20),
    ROAD_TYPE = UINT16_C(21),
    MULTI_DIGITIZED_ROAD_REFERENCE = UINT16_C(22),
    NUM_LANES = UINT16_C(23),
    COMPLEX_INTERSECTION_TYPE = UINT16_C(24),
    START_OR_DESTINATION_ROAD_ONLY = UINT16_C(25),
    ROAD_LOCATION_ID = UINT16_C(26),
    HAS_STREET_LIGHTS = UINT16_C(27),
    SHARED_ROAD_SURFACE_WITH_PEDESTRIANS = UINT16_C(28),
    IN_BUSINESS_DISTRICT = UINT16_C(29),
    GLOBAL_SOURCE_ID = UINT16_C(30)
};

} // namespace attributes
} // namespace characteristics
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for CharacsRoadRangeAttributeType enumeration.
template <>
struct EnumTraits<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>
{
    static constexpr ::std::array<const char*, 31> names =
    {{
        "COMPLETE_CARPOOL_ROAD",
        "PARTIAL_CARPOOL_ROAD",
        "PHYSICAL_WIDTH_METRIC",
        "TYPE_OF_PAVEMENT",
        "FERRY_TYPE",
        "DIVIDER_TYPE",
        "GRADE_TYPE",
        "STUBBLE",
        "RAILWAY_CROSSING",
        "PEDESTRIAN_CROSSING",
        "TRAFFIC_CALMING",
        "MOVABLE_BRIDGE",
        "SUPERELEVATION",
        "ROAD_MEDIAN",
        "HAS_SIDEWALK",
        "FRICTION",
        "STATION_PLAZA_TYPE",
        "MIDDLE_DIVIDER_TYPE",
        "AVERAGE_SPEED",
        "FUNCTIONAL_ROAD_CLASS",
        "PRIORITY_ROAD_CLASS",
        "ROAD_TYPE",
        "MULTI_DIGITIZED_ROAD_REFERENCE",
        "NUM_LANES",
        "COMPLEX_INTERSECTION_TYPE",
        "START_OR_DESTINATION_ROAD_ONLY",
        "ROAD_LOCATION_ID",
        "HAS_STREET_LIGHTS",
        "SHARED_ROAD_SURFACE_WITH_PEDESTRIANS",
        "IN_BUSINESS_DISTRICT",
        "GLOBAL_SOURCE_ID"
    }};

    static constexpr ::std::array<::nds::characteristics::attributes::CharacsRoadRangeAttributeType, 31> values =
    {{
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::COMPLETE_CARPOOL_ROAD,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::PARTIAL_CARPOOL_ROAD,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::PHYSICAL_WIDTH_METRIC,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::TYPE_OF_PAVEMENT,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::FERRY_TYPE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::DIVIDER_TYPE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::GRADE_TYPE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::STUBBLE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::RAILWAY_CROSSING,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::PEDESTRIAN_CROSSING,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::TRAFFIC_CALMING,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::MOVABLE_BRIDGE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::SUPERELEVATION,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::ROAD_MEDIAN,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::HAS_SIDEWALK,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::FRICTION,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::STATION_PLAZA_TYPE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::MIDDLE_DIVIDER_TYPE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::AVERAGE_SPEED,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::FUNCTIONAL_ROAD_CLASS,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::PRIORITY_ROAD_CLASS,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::ROAD_TYPE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::MULTI_DIGITIZED_ROAD_REFERENCE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::NUM_LANES,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::COMPLEX_INTERSECTION_TYPE,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::START_OR_DESTINATION_ROAD_ONLY,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::ROAD_LOCATION_ID,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::HAS_STREET_LIGHTS,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::SHARED_ROAD_SURFACE_WITH_PEDESTRIANS,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::IN_BUSINESS_DISTRICT,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType::GLOBAL_SOURCE_ID
    }};

    static constexpr const char* enumName = "CharacsRoadRangeAttributeType";
};

template <>
size_t enumToOrdinal<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
::nds::characteristics::attributes::CharacsRoadRangeAttributeType valueToEnum<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(
        typename ::std::underlying_type<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::zserio::DeltaContext& context, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
size_t bitSizeOf<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::zserio::DeltaContext& context, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
size_t initializeOffsets<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(size_t bitPosition, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
::nds::characteristics::attributes::CharacsRoadRangeAttributeType read<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::characteristics::attributes::CharacsRoadRangeAttributeType read<::nds::characteristics::attributes::CharacsRoadRangeAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::zserio::BitStreamWriter& out, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsRoadRangeAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::characteristics::attributes::CharacsRoadRangeAttributeType value);

} // namespace zserio

#endif // NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_ROAD_RANGE_ATTRIBUTE_TYPE_H