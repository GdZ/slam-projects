/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_TYPES_NAME_USAGE_TYPE_H
#define NDS_NAME_TYPES_NAME_USAGE_TYPE_H

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
namespace name
{
namespace types
{

enum class NameUsageType : uint8_t
{
    DEFAULT_OFFICIAL_NAME = UINT8_C(0),
    OFFICIAL_NAME = UINT8_C(1),
    PREFERRED_ALTERNATE_NAME = UINT8_C(2),
    ALTERNATE_NAME = UINT8_C(3)
};

} // namespace types
} // namespace name
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for NameUsageType enumeration.
template <>
struct EnumTraits<::nds::name::types::NameUsageType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "DEFAULT_OFFICIAL_NAME",
        "OFFICIAL_NAME",
        "PREFERRED_ALTERNATE_NAME",
        "ALTERNATE_NAME"
    }};

    static constexpr ::std::array<::nds::name::types::NameUsageType, 4> values =
    {{
        ::nds::name::types::NameUsageType::DEFAULT_OFFICIAL_NAME,
        ::nds::name::types::NameUsageType::OFFICIAL_NAME,
        ::nds::name::types::NameUsageType::PREFERRED_ALTERNATE_NAME,
        ::nds::name::types::NameUsageType::ALTERNATE_NAME
    }};

    static constexpr const char* enumName = "NameUsageType";
};

template <>
size_t enumToOrdinal<::nds::name::types::NameUsageType>(::nds::name::types::NameUsageType value);

template <>
::nds::name::types::NameUsageType valueToEnum<::nds::name::types::NameUsageType>(
        typename ::std::underlying_type<::nds::name::types::NameUsageType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::name::types::NameUsageType>(::nds::name::types::NameUsageType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::name::types::NameUsageType>(::zserio::DeltaContext& context, ::nds::name::types::NameUsageType value);

template <>
size_t bitSizeOf<::nds::name::types::NameUsageType>(::nds::name::types::NameUsageType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::name::types::NameUsageType>(::zserio::DeltaContext& context, ::nds::name::types::NameUsageType value);

template <>
size_t initializeOffsets<::nds::name::types::NameUsageType>(size_t bitPosition, ::nds::name::types::NameUsageType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::name::types::NameUsageType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::name::types::NameUsageType value);

template <>
::nds::name::types::NameUsageType read<::nds::name::types::NameUsageType>(::zserio::BitStreamReader& in);

template <>
::nds::name::types::NameUsageType read<::nds::name::types::NameUsageType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::name::types::NameUsageType>(::zserio::BitStreamWriter& out, ::nds::name::types::NameUsageType value);

template <>
void write<::zserio::DeltaContext, ::nds::name::types::NameUsageType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::name::types::NameUsageType value);

} // namespace zserio

#endif // NDS_NAME_TYPES_NAME_USAGE_TYPE_H
