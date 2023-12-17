/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_TYPES_LANDMARK_SIGN_TYPE_H
#define NDS_LOCALIZATION_TYPES_LANDMARK_SIGN_TYPE_H

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

enum class LandmarkSignType : uint8_t
{
    DETAILED_SHAPE = UINT8_C(0),
    TRIANGLE_TIP_UP = UINT8_C(1),
    TRIANGLE_TIP_DOWN = UINT8_C(2),
    RECTANGLE = UINT8_C(3),
    ROUND = UINT8_C(4),
    OCTAGON = UINT8_C(5),
    DIAMOND = UINT8_C(6),
    CROSSBUCK = UINT8_C(7),
    ELLIPSE = UINT8_C(8),
    UNKNOWN = UINT8_C(9)
};

} // namespace types
} // namespace localization
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for LandmarkSignType enumeration.
template <>
struct EnumTraits<::nds::localization::types::LandmarkSignType>
{
    static constexpr ::std::array<const char*, 10> names =
    {{
        "DETAILED_SHAPE",
        "TRIANGLE_TIP_UP",
        "TRIANGLE_TIP_DOWN",
        "RECTANGLE",
        "ROUND",
        "OCTAGON",
        "DIAMOND",
        "CROSSBUCK",
        "ELLIPSE",
        "UNKNOWN"
    }};

    static constexpr ::std::array<::nds::localization::types::LandmarkSignType, 10> values =
    {{
        ::nds::localization::types::LandmarkSignType::DETAILED_SHAPE,
        ::nds::localization::types::LandmarkSignType::TRIANGLE_TIP_UP,
        ::nds::localization::types::LandmarkSignType::TRIANGLE_TIP_DOWN,
        ::nds::localization::types::LandmarkSignType::RECTANGLE,
        ::nds::localization::types::LandmarkSignType::ROUND,
        ::nds::localization::types::LandmarkSignType::OCTAGON,
        ::nds::localization::types::LandmarkSignType::DIAMOND,
        ::nds::localization::types::LandmarkSignType::CROSSBUCK,
        ::nds::localization::types::LandmarkSignType::ELLIPSE,
        ::nds::localization::types::LandmarkSignType::UNKNOWN
    }};

    static constexpr const char* enumName = "LandmarkSignType";
};

template <>
size_t enumToOrdinal<::nds::localization::types::LandmarkSignType>(::nds::localization::types::LandmarkSignType value);

template <>
::nds::localization::types::LandmarkSignType valueToEnum<::nds::localization::types::LandmarkSignType>(
        typename ::std::underlying_type<::nds::localization::types::LandmarkSignType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::localization::types::LandmarkSignType>(::nds::localization::types::LandmarkSignType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::localization::types::LandmarkSignType>(::zserio::DeltaContext& context, ::nds::localization::types::LandmarkSignType value);

template <>
size_t bitSizeOf<::nds::localization::types::LandmarkSignType>(::nds::localization::types::LandmarkSignType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::localization::types::LandmarkSignType>(::zserio::DeltaContext& context, ::nds::localization::types::LandmarkSignType value);

template <>
size_t initializeOffsets<::nds::localization::types::LandmarkSignType>(size_t bitPosition, ::nds::localization::types::LandmarkSignType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::localization::types::LandmarkSignType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::localization::types::LandmarkSignType value);

template <>
::nds::localization::types::LandmarkSignType read<::nds::localization::types::LandmarkSignType>(::zserio::BitStreamReader& in);

template <>
::nds::localization::types::LandmarkSignType read<::nds::localization::types::LandmarkSignType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::localization::types::LandmarkSignType>(::zserio::BitStreamWriter& out, ::nds::localization::types::LandmarkSignType value);

template <>
void write<::zserio::DeltaContext, ::nds::localization::types::LandmarkSignType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::localization::types::LandmarkSignType value);

} // namespace zserio

#endif // NDS_LOCALIZATION_TYPES_LANDMARK_SIGN_TYPE_H