/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_TYPES_RAILWAY_CROSSING_H
#define NDS_CHARACTERISTICS_TYPES_RAILWAY_CROSSING_H

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
namespace characteristics
{
namespace types
{

enum class RailwayCrossing : uint8_t
{
    RAILROAD_CROSSING_WITH_GATES = UINT8_C(1),
    RAILROAD_CROSSING_WITHOUT_GATES = UINT8_C(2),
    RAILROAD_CROSSING_UNKNOWN = UINT8_C(3)
};

} // namespace types
} // namespace characteristics
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for RailwayCrossing enumeration.
template <>
struct EnumTraits<::nds::characteristics::types::RailwayCrossing>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "RAILROAD_CROSSING_WITH_GATES",
        "RAILROAD_CROSSING_WITHOUT_GATES",
        "RAILROAD_CROSSING_UNKNOWN"
    }};

    static constexpr ::std::array<::nds::characteristics::types::RailwayCrossing, 3> values =
    {{
        ::nds::characteristics::types::RailwayCrossing::RAILROAD_CROSSING_WITH_GATES,
        ::nds::characteristics::types::RailwayCrossing::RAILROAD_CROSSING_WITHOUT_GATES,
        ::nds::characteristics::types::RailwayCrossing::RAILROAD_CROSSING_UNKNOWN
    }};

    static constexpr const char* enumName = "RailwayCrossing";
};

template <>
size_t enumToOrdinal<::nds::characteristics::types::RailwayCrossing>(::nds::characteristics::types::RailwayCrossing value);

template <>
::nds::characteristics::types::RailwayCrossing valueToEnum<::nds::characteristics::types::RailwayCrossing>(
        typename ::std::underlying_type<::nds::characteristics::types::RailwayCrossing>::type rawValue);

template <>
uint32_t enumHashCode<::nds::characteristics::types::RailwayCrossing>(::nds::characteristics::types::RailwayCrossing value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::characteristics::types::RailwayCrossing>(::zserio::DeltaContext& context, ::nds::characteristics::types::RailwayCrossing value);

template <>
size_t bitSizeOf<::nds::characteristics::types::RailwayCrossing>(::nds::characteristics::types::RailwayCrossing value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::characteristics::types::RailwayCrossing>(::zserio::DeltaContext& context, ::nds::characteristics::types::RailwayCrossing value);

template <>
size_t initializeOffsets<::nds::characteristics::types::RailwayCrossing>(size_t bitPosition, ::nds::characteristics::types::RailwayCrossing value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::characteristics::types::RailwayCrossing>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::characteristics::types::RailwayCrossing value);

template <>
::nds::characteristics::types::RailwayCrossing read<::nds::characteristics::types::RailwayCrossing>(::zserio::BitStreamReader& in);

template <>
::nds::characteristics::types::RailwayCrossing read<::nds::characteristics::types::RailwayCrossing, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::characteristics::types::RailwayCrossing>(::zserio::BitStreamWriter& out, ::nds::characteristics::types::RailwayCrossing value);

template <>
void write<::zserio::DeltaContext, ::nds::characteristics::types::RailwayCrossing>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::characteristics::types::RailwayCrossing value);

} // namespace zserio

#endif // NDS_CHARACTERISTICS_TYPES_RAILWAY_CROSSING_H
