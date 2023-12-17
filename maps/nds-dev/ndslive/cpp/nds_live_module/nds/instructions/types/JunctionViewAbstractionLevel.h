/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_TYPES_JUNCTION_VIEW_ABSTRACTION_LEVEL_H
#define NDS_INSTRUCTIONS_TYPES_JUNCTION_VIEW_ABSTRACTION_LEVEL_H

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
namespace instructions
{
namespace types
{

enum class JunctionViewAbstractionLevel : uint8_t
{
    MIXED = UINT8_C(0),
    LOW = UINT8_C(1),
    MEDIUM = UINT8_C(2),
    HIGH = UINT8_C(3)
};

} // namespace types
} // namespace instructions
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for JunctionViewAbstractionLevel enumeration.
template <>
struct EnumTraits<::nds::instructions::types::JunctionViewAbstractionLevel>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "MIXED",
        "LOW",
        "MEDIUM",
        "HIGH"
    }};

    static constexpr ::std::array<::nds::instructions::types::JunctionViewAbstractionLevel, 4> values =
    {{
        ::nds::instructions::types::JunctionViewAbstractionLevel::MIXED,
        ::nds::instructions::types::JunctionViewAbstractionLevel::LOW,
        ::nds::instructions::types::JunctionViewAbstractionLevel::MEDIUM,
        ::nds::instructions::types::JunctionViewAbstractionLevel::HIGH
    }};

    static constexpr const char* enumName = "JunctionViewAbstractionLevel";
};

template <>
size_t enumToOrdinal<::nds::instructions::types::JunctionViewAbstractionLevel>(::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
::nds::instructions::types::JunctionViewAbstractionLevel valueToEnum<::nds::instructions::types::JunctionViewAbstractionLevel>(
        typename ::std::underlying_type<::nds::instructions::types::JunctionViewAbstractionLevel>::type rawValue);

template <>
uint32_t enumHashCode<::nds::instructions::types::JunctionViewAbstractionLevel>(::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::instructions::types::JunctionViewAbstractionLevel>(::zserio::DeltaContext& context, ::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
size_t bitSizeOf<::nds::instructions::types::JunctionViewAbstractionLevel>(::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::instructions::types::JunctionViewAbstractionLevel>(::zserio::DeltaContext& context, ::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
size_t initializeOffsets<::nds::instructions::types::JunctionViewAbstractionLevel>(size_t bitPosition, ::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::instructions::types::JunctionViewAbstractionLevel>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
::nds::instructions::types::JunctionViewAbstractionLevel read<::nds::instructions::types::JunctionViewAbstractionLevel>(::zserio::BitStreamReader& in);

template <>
::nds::instructions::types::JunctionViewAbstractionLevel read<::nds::instructions::types::JunctionViewAbstractionLevel, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::instructions::types::JunctionViewAbstractionLevel>(::zserio::BitStreamWriter& out, ::nds::instructions::types::JunctionViewAbstractionLevel value);

template <>
void write<::zserio::DeltaContext, ::nds::instructions::types::JunctionViewAbstractionLevel>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::instructions::types::JunctionViewAbstractionLevel value);

} // namespace zserio

#endif // NDS_INSTRUCTIONS_TYPES_JUNCTION_VIEW_ABSTRACTION_LEVEL_H