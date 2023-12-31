/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_VEHICLE_ADR_TUNNEL_RESTRICTION_H
#define NDS_CORE_VEHICLE_ADR_TUNNEL_RESTRICTION_H

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
namespace vehicle
{

enum class AdrTunnelRestriction : uint8_t
{
    NONE = UINT8_C(0),
    B = UINT8_C(1),
    C = UINT8_C(2),
    D = UINT8_C(3),
    E = UINT8_C(4)
};

} // namespace vehicle
} // namespace core
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for AdrTunnelRestriction enumeration.
template <>
struct EnumTraits<::nds::core::vehicle::AdrTunnelRestriction>
{
    static constexpr ::std::array<const char*, 5> names =
    {{
        "NONE",
        "B",
        "C",
        "D",
        "E"
    }};

    static constexpr ::std::array<::nds::core::vehicle::AdrTunnelRestriction, 5> values =
    {{
        ::nds::core::vehicle::AdrTunnelRestriction::NONE,
        ::nds::core::vehicle::AdrTunnelRestriction::B,
        ::nds::core::vehicle::AdrTunnelRestriction::C,
        ::nds::core::vehicle::AdrTunnelRestriction::D,
        ::nds::core::vehicle::AdrTunnelRestriction::E
    }};

    static constexpr const char* enumName = "AdrTunnelRestriction";
};

template <>
size_t enumToOrdinal<::nds::core::vehicle::AdrTunnelRestriction>(::nds::core::vehicle::AdrTunnelRestriction value);

template <>
::nds::core::vehicle::AdrTunnelRestriction valueToEnum<::nds::core::vehicle::AdrTunnelRestriction>(
        typename ::std::underlying_type<::nds::core::vehicle::AdrTunnelRestriction>::type rawValue);

template <>
uint32_t enumHashCode<::nds::core::vehicle::AdrTunnelRestriction>(::nds::core::vehicle::AdrTunnelRestriction value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::core::vehicle::AdrTunnelRestriction>(::zserio::DeltaContext& context, ::nds::core::vehicle::AdrTunnelRestriction value);

template <>
size_t bitSizeOf<::nds::core::vehicle::AdrTunnelRestriction>(::nds::core::vehicle::AdrTunnelRestriction value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::core::vehicle::AdrTunnelRestriction>(::zserio::DeltaContext& context, ::nds::core::vehicle::AdrTunnelRestriction value);

template <>
size_t initializeOffsets<::nds::core::vehicle::AdrTunnelRestriction>(size_t bitPosition, ::nds::core::vehicle::AdrTunnelRestriction value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::core::vehicle::AdrTunnelRestriction>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::core::vehicle::AdrTunnelRestriction value);

template <>
::nds::core::vehicle::AdrTunnelRestriction read<::nds::core::vehicle::AdrTunnelRestriction>(::zserio::BitStreamReader& in);

template <>
::nds::core::vehicle::AdrTunnelRestriction read<::nds::core::vehicle::AdrTunnelRestriction, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::core::vehicle::AdrTunnelRestriction>(::zserio::BitStreamWriter& out, ::nds::core::vehicle::AdrTunnelRestriction value);

template <>
void write<::zserio::DeltaContext, ::nds::core::vehicle::AdrTunnelRestriction>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::core::vehicle::AdrTunnelRestriction value);

} // namespace zserio

#endif // NDS_CORE_VEHICLE_ADR_TUNNEL_RESTRICTION_H
