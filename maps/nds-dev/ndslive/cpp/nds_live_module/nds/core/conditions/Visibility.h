/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_VISIBILITY_H
#define NDS_CORE_CONDITIONS_VISIBILITY_H

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
namespace core
{
namespace conditions
{

enum class Visibility : uint8_t
{
    CLEAR = UINT8_C(0),
    LESS_THAN_5M = UINT8_C(1),
    LESS_THAN_25M = UINT8_C(2),
    LESS_THAN_50M = UINT8_C(3),
    LESS_THAN_100M = UINT8_C(4)
};

} // namespace conditions
} // namespace core
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for Visibility enumeration.
template <>
struct EnumTraits<::nds::core::conditions::Visibility>
{
    static constexpr ::std::array<const char*, 5> names =
    {{
        "CLEAR",
        "LESS_THAN_5M",
        "LESS_THAN_25M",
        "LESS_THAN_50M",
        "LESS_THAN_100M"
    }};

    static constexpr ::std::array<::nds::core::conditions::Visibility, 5> values =
    {{
        ::nds::core::conditions::Visibility::CLEAR,
        ::nds::core::conditions::Visibility::LESS_THAN_5M,
        ::nds::core::conditions::Visibility::LESS_THAN_25M,
        ::nds::core::conditions::Visibility::LESS_THAN_50M,
        ::nds::core::conditions::Visibility::LESS_THAN_100M
    }};

    static constexpr const char* enumName = "Visibility";
};

template <>
size_t enumToOrdinal<::nds::core::conditions::Visibility>(::nds::core::conditions::Visibility value);

template <>
::nds::core::conditions::Visibility valueToEnum<::nds::core::conditions::Visibility>(
        typename ::std::underlying_type<::nds::core::conditions::Visibility>::type rawValue);

template <>
uint32_t enumHashCode<::nds::core::conditions::Visibility>(::nds::core::conditions::Visibility value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::core::conditions::Visibility>(::zserio::DeltaContext& context, ::nds::core::conditions::Visibility value);

template <>
size_t bitSizeOf<::nds::core::conditions::Visibility>(::nds::core::conditions::Visibility value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::core::conditions::Visibility>(::zserio::DeltaContext& context, ::nds::core::conditions::Visibility value);

template <>
size_t initializeOffsets<::nds::core::conditions::Visibility>(size_t bitPosition, ::nds::core::conditions::Visibility value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::core::conditions::Visibility>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::core::conditions::Visibility value);

template <>
::nds::core::conditions::Visibility read<::nds::core::conditions::Visibility>(::zserio::BitStreamReader& in);

template <>
::nds::core::conditions::Visibility read<::nds::core::conditions::Visibility, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::core::conditions::Visibility>(::zserio::BitStreamWriter& out, ::nds::core::conditions::Visibility value);

template <>
void write<::zserio::DeltaContext, ::nds::core::conditions::Visibility>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::core::conditions::Visibility value);

} // namespace zserio

#endif // NDS_CORE_CONDITIONS_VISIBILITY_H
