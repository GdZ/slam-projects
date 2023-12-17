/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_TYPES_ADAS_ACCURACY_H
#define NDS_ADAS_TYPES_ADAS_ACCURACY_H

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
namespace adas
{
namespace types
{

enum class AdasAccuracy : uint8_t
{
    UNKNOWN = UINT8_C(0),
    LOW = UINT8_C(1),
    MIDDLE = UINT8_C(2),
    HIGH = UINT8_C(3)
};

} // namespace types
} // namespace adas
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for AdasAccuracy enumeration.
template <>
struct EnumTraits<::nds::adas::types::AdasAccuracy>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "UNKNOWN",
        "LOW",
        "MIDDLE",
        "HIGH"
    }};

    static constexpr ::std::array<::nds::adas::types::AdasAccuracy, 4> values =
    {{
        ::nds::adas::types::AdasAccuracy::UNKNOWN,
        ::nds::adas::types::AdasAccuracy::LOW,
        ::nds::adas::types::AdasAccuracy::MIDDLE,
        ::nds::adas::types::AdasAccuracy::HIGH
    }};

    static constexpr const char* enumName = "AdasAccuracy";
};

template <>
size_t enumToOrdinal<::nds::adas::types::AdasAccuracy>(::nds::adas::types::AdasAccuracy value);

template <>
::nds::adas::types::AdasAccuracy valueToEnum<::nds::adas::types::AdasAccuracy>(
        typename ::std::underlying_type<::nds::adas::types::AdasAccuracy>::type rawValue);

template <>
uint32_t enumHashCode<::nds::adas::types::AdasAccuracy>(::nds::adas::types::AdasAccuracy value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::adas::types::AdasAccuracy>(::zserio::DeltaContext& context, ::nds::adas::types::AdasAccuracy value);

template <>
size_t bitSizeOf<::nds::adas::types::AdasAccuracy>(::nds::adas::types::AdasAccuracy value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::adas::types::AdasAccuracy>(::zserio::DeltaContext& context, ::nds::adas::types::AdasAccuracy value);

template <>
size_t initializeOffsets<::nds::adas::types::AdasAccuracy>(size_t bitPosition, ::nds::adas::types::AdasAccuracy value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::adas::types::AdasAccuracy>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::adas::types::AdasAccuracy value);

template <>
::nds::adas::types::AdasAccuracy read<::nds::adas::types::AdasAccuracy>(::zserio::BitStreamReader& in);

template <>
::nds::adas::types::AdasAccuracy read<::nds::adas::types::AdasAccuracy, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::adas::types::AdasAccuracy>(::zserio::BitStreamWriter& out, ::nds::adas::types::AdasAccuracy value);

template <>
void write<::zserio::DeltaContext, ::nds::adas::types::AdasAccuracy>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::adas::types::AdasAccuracy value);

} // namespace zserio

#endif // NDS_ADAS_TYPES_ADAS_ACCURACY_H