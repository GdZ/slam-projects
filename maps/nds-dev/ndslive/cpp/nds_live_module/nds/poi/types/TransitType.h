/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_TYPES_TRANSIT_TYPE_H
#define NDS_POI_TYPES_TRANSIT_TYPE_H

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
namespace poi
{
namespace types
{

enum class TransitType : uint8_t
{
    BUS = UINT8_C(0),
    RAIL = UINT8_C(1),
    BOTH = UINT8_C(2)
};

} // namespace types
} // namespace poi
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for TransitType enumeration.
template <>
struct EnumTraits<::nds::poi::types::TransitType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "BUS",
        "RAIL",
        "BOTH"
    }};

    static constexpr ::std::array<::nds::poi::types::TransitType, 3> values =
    {{
        ::nds::poi::types::TransitType::BUS,
        ::nds::poi::types::TransitType::RAIL,
        ::nds::poi::types::TransitType::BOTH
    }};

    static constexpr const char* enumName = "TransitType";
};

template <>
size_t enumToOrdinal<::nds::poi::types::TransitType>(::nds::poi::types::TransitType value);

template <>
::nds::poi::types::TransitType valueToEnum<::nds::poi::types::TransitType>(
        typename ::std::underlying_type<::nds::poi::types::TransitType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::poi::types::TransitType>(::nds::poi::types::TransitType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::poi::types::TransitType>(::zserio::DeltaContext& context, ::nds::poi::types::TransitType value);

template <>
size_t bitSizeOf<::nds::poi::types::TransitType>(::nds::poi::types::TransitType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::poi::types::TransitType>(::zserio::DeltaContext& context, ::nds::poi::types::TransitType value);

template <>
size_t initializeOffsets<::nds::poi::types::TransitType>(size_t bitPosition, ::nds::poi::types::TransitType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::poi::types::TransitType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::poi::types::TransitType value);

template <>
::nds::poi::types::TransitType read<::nds::poi::types::TransitType>(::zserio::BitStreamReader& in);

template <>
::nds::poi::types::TransitType read<::nds::poi::types::TransitType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::poi::types::TransitType>(::zserio::BitStreamWriter& out, ::nds::poi::types::TransitType value);

template <>
void write<::zserio::DeltaContext, ::nds::poi::types::TransitType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::poi::types::TransitType value);

} // namespace zserio

#endif // NDS_POI_TYPES_TRANSIT_TYPE_H
