/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_TYPES_ADDRESS_FORMAT_ELEMENT_TYPE_H
#define NDS_NAME_TYPES_ADDRESS_FORMAT_ELEMENT_TYPE_H

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

enum class AddressFormatElementType : uint8_t
{
    ROAD = UINT8_C(0),
    HOUSE = UINT8_C(1),
    ADMINISTRATIVE_HIERARCHY_ELEMENT = UINT8_C(2),
    ROAD_NUMBER = UINT8_C(3),
    ROUTE_NAME = UINT8_C(4)
};

} // namespace types
} // namespace name
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for AddressFormatElementType enumeration.
template <>
struct EnumTraits<::nds::name::types::AddressFormatElementType>
{
    static constexpr ::std::array<const char*, 5> names =
    {{
        "ROAD",
        "HOUSE",
        "ADMINISTRATIVE_HIERARCHY_ELEMENT",
        "ROAD_NUMBER",
        "ROUTE_NAME"
    }};

    static constexpr ::std::array<::nds::name::types::AddressFormatElementType, 5> values =
    {{
        ::nds::name::types::AddressFormatElementType::ROAD,
        ::nds::name::types::AddressFormatElementType::HOUSE,
        ::nds::name::types::AddressFormatElementType::ADMINISTRATIVE_HIERARCHY_ELEMENT,
        ::nds::name::types::AddressFormatElementType::ROAD_NUMBER,
        ::nds::name::types::AddressFormatElementType::ROUTE_NAME
    }};

    static constexpr const char* enumName = "AddressFormatElementType";
};

template <>
size_t enumToOrdinal<::nds::name::types::AddressFormatElementType>(::nds::name::types::AddressFormatElementType value);

template <>
::nds::name::types::AddressFormatElementType valueToEnum<::nds::name::types::AddressFormatElementType>(
        typename ::std::underlying_type<::nds::name::types::AddressFormatElementType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::name::types::AddressFormatElementType>(::nds::name::types::AddressFormatElementType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::name::types::AddressFormatElementType>(::zserio::DeltaContext& context, ::nds::name::types::AddressFormatElementType value);

template <>
size_t bitSizeOf<::nds::name::types::AddressFormatElementType>(::nds::name::types::AddressFormatElementType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::name::types::AddressFormatElementType>(::zserio::DeltaContext& context, ::nds::name::types::AddressFormatElementType value);

template <>
size_t initializeOffsets<::nds::name::types::AddressFormatElementType>(size_t bitPosition, ::nds::name::types::AddressFormatElementType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::name::types::AddressFormatElementType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::name::types::AddressFormatElementType value);

template <>
::nds::name::types::AddressFormatElementType read<::nds::name::types::AddressFormatElementType>(::zserio::BitStreamReader& in);

template <>
::nds::name::types::AddressFormatElementType read<::nds::name::types::AddressFormatElementType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::name::types::AddressFormatElementType>(::zserio::BitStreamWriter& out, ::nds::name::types::AddressFormatElementType value);

template <>
void write<::zserio::DeltaContext, ::nds::name::types::AddressFormatElementType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::name::types::AddressFormatElementType value);

} // namespace zserio

#endif // NDS_NAME_TYPES_ADDRESS_FORMAT_ELEMENT_TYPE_H