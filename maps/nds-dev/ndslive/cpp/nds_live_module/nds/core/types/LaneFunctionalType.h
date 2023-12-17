/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_TYPES_LANE_FUNCTIONAL_TYPE_H
#define NDS_CORE_TYPES_LANE_FUNCTIONAL_TYPE_H

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
namespace core
{
namespace types
{

enum class LaneFunctionalType : uint16_t
{
    NORMAL_LANE = UINT16_C(0),
    EXIT_LANE = UINT16_C(1),
    ENTRY_LANE = UINT16_C(2),
    ENTRY_AND_EXIT_LANE = UINT16_C(3),
    TURNING_LANE = UINT16_C(4),
    PARKING_LANE = UINT16_C(5),
    TRUCK_PARKING_LANE = UINT16_C(6),
    WAITING_LANE = UINT16_C(7),
    ANY = UINT16_C(8),
    U_TURN_LANE = UINT16_C(9)
};

} // namespace types
} // namespace core
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for LaneFunctionalType enumeration.
template <>
struct EnumTraits<::nds::core::types::LaneFunctionalType>
{
    static constexpr ::std::array<const char*, 10> names =
    {{
        "NORMAL_LANE",
        "EXIT_LANE",
        "ENTRY_LANE",
        "ENTRY_AND_EXIT_LANE",
        "TURNING_LANE",
        "PARKING_LANE",
        "TRUCK_PARKING_LANE",
        "WAITING_LANE",
        "ANY",
        "U_TURN_LANE"
    }};

    static constexpr ::std::array<::nds::core::types::LaneFunctionalType, 10> values =
    {{
        ::nds::core::types::LaneFunctionalType::NORMAL_LANE,
        ::nds::core::types::LaneFunctionalType::EXIT_LANE,
        ::nds::core::types::LaneFunctionalType::ENTRY_LANE,
        ::nds::core::types::LaneFunctionalType::ENTRY_AND_EXIT_LANE,
        ::nds::core::types::LaneFunctionalType::TURNING_LANE,
        ::nds::core::types::LaneFunctionalType::PARKING_LANE,
        ::nds::core::types::LaneFunctionalType::TRUCK_PARKING_LANE,
        ::nds::core::types::LaneFunctionalType::WAITING_LANE,
        ::nds::core::types::LaneFunctionalType::ANY,
        ::nds::core::types::LaneFunctionalType::U_TURN_LANE
    }};

    static constexpr const char* enumName = "LaneFunctionalType";
};

template <>
size_t enumToOrdinal<::nds::core::types::LaneFunctionalType>(::nds::core::types::LaneFunctionalType value);

template <>
::nds::core::types::LaneFunctionalType valueToEnum<::nds::core::types::LaneFunctionalType>(
        typename ::std::underlying_type<::nds::core::types::LaneFunctionalType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::core::types::LaneFunctionalType>(::nds::core::types::LaneFunctionalType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::core::types::LaneFunctionalType>(::zserio::DeltaContext& context, ::nds::core::types::LaneFunctionalType value);

template <>
size_t bitSizeOf<::nds::core::types::LaneFunctionalType>(::nds::core::types::LaneFunctionalType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::core::types::LaneFunctionalType>(::zserio::DeltaContext& context, ::nds::core::types::LaneFunctionalType value);

template <>
size_t initializeOffsets<::nds::core::types::LaneFunctionalType>(size_t bitPosition, ::nds::core::types::LaneFunctionalType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::core::types::LaneFunctionalType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::core::types::LaneFunctionalType value);

template <>
::nds::core::types::LaneFunctionalType read<::nds::core::types::LaneFunctionalType>(::zserio::BitStreamReader& in);

template <>
::nds::core::types::LaneFunctionalType read<::nds::core::types::LaneFunctionalType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::core::types::LaneFunctionalType>(::zserio::BitStreamWriter& out, ::nds::core::types::LaneFunctionalType value);

template <>
void write<::zserio::DeltaContext, ::nds::core::types::LaneFunctionalType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::core::types::LaneFunctionalType value);

} // namespace zserio

#endif // NDS_CORE_TYPES_LANE_FUNCTIONAL_TYPE_H