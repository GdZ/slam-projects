/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_METADATA_FEATURE_LAYER_TYPE_H
#define NDS_ROAD_METADATA_FEATURE_LAYER_TYPE_H

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
namespace road
{
namespace metadata
{

enum class FeatureLayerType : uint8_t
{
    ROADS_INTERSECTIONS = UINT8_C(1)
};

} // namespace metadata
} // namespace road
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for FeatureLayerType enumeration.
template <>
struct EnumTraits<::nds::road::metadata::FeatureLayerType>
{
    static constexpr ::std::array<const char*, 1> names =
    {{
        "ROADS_INTERSECTIONS"
    }};

    static constexpr ::std::array<::nds::road::metadata::FeatureLayerType, 1> values =
    {{
        ::nds::road::metadata::FeatureLayerType::ROADS_INTERSECTIONS
    }};

    static constexpr const char* enumName = "FeatureLayerType";
};

template <>
size_t enumToOrdinal<::nds::road::metadata::FeatureLayerType>(::nds::road::metadata::FeatureLayerType value);

template <>
::nds::road::metadata::FeatureLayerType valueToEnum<::nds::road::metadata::FeatureLayerType>(
        typename ::std::underlying_type<::nds::road::metadata::FeatureLayerType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::road::metadata::FeatureLayerType>(::nds::road::metadata::FeatureLayerType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::road::metadata::FeatureLayerType>(::zserio::DeltaContext& context, ::nds::road::metadata::FeatureLayerType value);

template <>
size_t bitSizeOf<::nds::road::metadata::FeatureLayerType>(::nds::road::metadata::FeatureLayerType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::road::metadata::FeatureLayerType>(::zserio::DeltaContext& context, ::nds::road::metadata::FeatureLayerType value);

template <>
size_t initializeOffsets<::nds::road::metadata::FeatureLayerType>(size_t bitPosition, ::nds::road::metadata::FeatureLayerType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::road::metadata::FeatureLayerType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::road::metadata::FeatureLayerType value);

template <>
::nds::road::metadata::FeatureLayerType read<::nds::road::metadata::FeatureLayerType>(::zserio::BitStreamReader& in);

template <>
::nds::road::metadata::FeatureLayerType read<::nds::road::metadata::FeatureLayerType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::road::metadata::FeatureLayerType>(::zserio::BitStreamWriter& out, ::nds::road::metadata::FeatureLayerType value);

template <>
void write<::zserio::DeltaContext, ::nds::road::metadata::FeatureLayerType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::road::metadata::FeatureLayerType value);

} // namespace zserio

#endif // NDS_ROAD_METADATA_FEATURE_LAYER_TYPE_H
