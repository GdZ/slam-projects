/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_TYPES_OBSTACLE_TYPE_H
#define NDS_LOCALIZATION_TYPES_OBSTACLE_TYPE_H

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
namespace localization
{
namespace types
{

enum class ObstacleType : uint8_t
{
    HORIZONTAL = UINT8_C(0),
    VERTICAL = UINT8_C(1)
};

} // namespace types
} // namespace localization
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for ObstacleType enumeration.
template <>
struct EnumTraits<::nds::localization::types::ObstacleType>
{
    static constexpr ::std::array<const char*, 2> names =
    {{
        "HORIZONTAL",
        "VERTICAL"
    }};

    static constexpr ::std::array<::nds::localization::types::ObstacleType, 2> values =
    {{
        ::nds::localization::types::ObstacleType::HORIZONTAL,
        ::nds::localization::types::ObstacleType::VERTICAL
    }};

    static constexpr const char* enumName = "ObstacleType";
};

template <>
size_t enumToOrdinal<::nds::localization::types::ObstacleType>(::nds::localization::types::ObstacleType value);

template <>
::nds::localization::types::ObstacleType valueToEnum<::nds::localization::types::ObstacleType>(
        typename ::std::underlying_type<::nds::localization::types::ObstacleType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::localization::types::ObstacleType>(::nds::localization::types::ObstacleType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::localization::types::ObstacleType>(::zserio::DeltaContext& context, ::nds::localization::types::ObstacleType value);

template <>
size_t bitSizeOf<::nds::localization::types::ObstacleType>(::nds::localization::types::ObstacleType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::localization::types::ObstacleType>(::zserio::DeltaContext& context, ::nds::localization::types::ObstacleType value);

template <>
size_t initializeOffsets<::nds::localization::types::ObstacleType>(size_t bitPosition, ::nds::localization::types::ObstacleType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::localization::types::ObstacleType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::localization::types::ObstacleType value);

template <>
::nds::localization::types::ObstacleType read<::nds::localization::types::ObstacleType>(::zserio::BitStreamReader& in);

template <>
::nds::localization::types::ObstacleType read<::nds::localization::types::ObstacleType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::localization::types::ObstacleType>(::zserio::BitStreamWriter& out, ::nds::localization::types::ObstacleType value);

template <>
void write<::zserio::DeltaContext, ::nds::localization::types::ObstacleType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::localization::types::ObstacleType value);

} // namespace zserio

#endif // NDS_LOCALIZATION_TYPES_OBSTACLE_TYPE_H
