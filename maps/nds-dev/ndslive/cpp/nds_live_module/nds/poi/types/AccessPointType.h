/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_TYPES_ACCESS_POINT_TYPE_H
#define NDS_POI_TYPES_ACCESS_POINT_TYPE_H

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

enum class AccessPointType : uint8_t
{
    ENTRY = UINT8_C(0),
    EXIT = UINT8_C(1),
    BOTH = UINT8_C(2)
};

} // namespace types
} // namespace poi
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for AccessPointType enumeration.
template <>
struct EnumTraits<::nds::poi::types::AccessPointType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "ENTRY",
        "EXIT",
        "BOTH"
    }};

    static constexpr ::std::array<::nds::poi::types::AccessPointType, 3> values =
    {{
        ::nds::poi::types::AccessPointType::ENTRY,
        ::nds::poi::types::AccessPointType::EXIT,
        ::nds::poi::types::AccessPointType::BOTH
    }};

    static constexpr const char* enumName = "AccessPointType";
};

template <>
size_t enumToOrdinal<::nds::poi::types::AccessPointType>(::nds::poi::types::AccessPointType value);

template <>
::nds::poi::types::AccessPointType valueToEnum<::nds::poi::types::AccessPointType>(
        typename ::std::underlying_type<::nds::poi::types::AccessPointType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::poi::types::AccessPointType>(::nds::poi::types::AccessPointType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::poi::types::AccessPointType>(::zserio::DeltaContext& context, ::nds::poi::types::AccessPointType value);

template <>
size_t bitSizeOf<::nds::poi::types::AccessPointType>(::nds::poi::types::AccessPointType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::poi::types::AccessPointType>(::zserio::DeltaContext& context, ::nds::poi::types::AccessPointType value);

template <>
size_t initializeOffsets<::nds::poi::types::AccessPointType>(size_t bitPosition, ::nds::poi::types::AccessPointType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::poi::types::AccessPointType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::poi::types::AccessPointType value);

template <>
::nds::poi::types::AccessPointType read<::nds::poi::types::AccessPointType>(::zserio::BitStreamReader& in);

template <>
::nds::poi::types::AccessPointType read<::nds::poi::types::AccessPointType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::poi::types::AccessPointType>(::zserio::BitStreamWriter& out, ::nds::poi::types::AccessPointType value);

template <>
void write<::zserio::DeltaContext, ::nds::poi::types::AccessPointType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::poi::types::AccessPointType value);

} // namespace zserio

#endif // NDS_POI_TYPES_ACCESS_POINT_TYPE_H