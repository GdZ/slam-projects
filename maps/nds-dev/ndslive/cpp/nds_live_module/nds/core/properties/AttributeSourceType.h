/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_PROPERTIES_ATTRIBUTE_SOURCE_TYPE_H
#define NDS_CORE_PROPERTIES_ATTRIBUTE_SOURCE_TYPE_H

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
namespace properties
{

enum class AttributeSourceType : uint8_t
{
    CAPTURED = UINT8_C(0),
    FLEET_DATA = UINT8_C(1),
    ARTIFICIAL = UINT8_C(2)
};

} // namespace properties
} // namespace core
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for AttributeSourceType enumeration.
template <>
struct EnumTraits<::nds::core::properties::AttributeSourceType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "CAPTURED",
        "FLEET_DATA",
        "ARTIFICIAL"
    }};

    static constexpr ::std::array<::nds::core::properties::AttributeSourceType, 3> values =
    {{
        ::nds::core::properties::AttributeSourceType::CAPTURED,
        ::nds::core::properties::AttributeSourceType::FLEET_DATA,
        ::nds::core::properties::AttributeSourceType::ARTIFICIAL
    }};

    static constexpr const char* enumName = "AttributeSourceType";
};

template <>
size_t enumToOrdinal<::nds::core::properties::AttributeSourceType>(::nds::core::properties::AttributeSourceType value);

template <>
::nds::core::properties::AttributeSourceType valueToEnum<::nds::core::properties::AttributeSourceType>(
        typename ::std::underlying_type<::nds::core::properties::AttributeSourceType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::core::properties::AttributeSourceType>(::nds::core::properties::AttributeSourceType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::core::properties::AttributeSourceType>(::zserio::DeltaContext& context, ::nds::core::properties::AttributeSourceType value);

template <>
size_t bitSizeOf<::nds::core::properties::AttributeSourceType>(::nds::core::properties::AttributeSourceType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::core::properties::AttributeSourceType>(::zserio::DeltaContext& context, ::nds::core::properties::AttributeSourceType value);

template <>
size_t initializeOffsets<::nds::core::properties::AttributeSourceType>(size_t bitPosition, ::nds::core::properties::AttributeSourceType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::core::properties::AttributeSourceType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::core::properties::AttributeSourceType value);

template <>
::nds::core::properties::AttributeSourceType read<::nds::core::properties::AttributeSourceType>(::zserio::BitStreamReader& in);

template <>
::nds::core::properties::AttributeSourceType read<::nds::core::properties::AttributeSourceType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::core::properties::AttributeSourceType>(::zserio::BitStreamWriter& out, ::nds::core::properties::AttributeSourceType value);

template <>
void write<::zserio::DeltaContext, ::nds::core::properties::AttributeSourceType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::core::properties::AttributeSourceType value);

} // namespace zserio

#endif // NDS_CORE_PROPERTIES_ATTRIBUTE_SOURCE_TYPE_H
