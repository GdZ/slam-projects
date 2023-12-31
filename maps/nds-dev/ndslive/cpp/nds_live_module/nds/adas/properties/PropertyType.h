/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_PROPERTIES_PROPERTY_TYPE_H
#define NDS_ADAS_PROPERTIES_PROPERTY_TYPE_H

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
namespace adas
{
namespace properties
{

enum class PropertyType : uint16_t
{
    ADAS_ACCURACY = UINT16_C(0),
    CLOTHOID_META_DATA = UINT16_C(1),
    GRADIENT_META_DATA = UINT16_C(2),
    CORE = UINT16_C(3)
};

} // namespace properties
} // namespace adas
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for PropertyType enumeration.
template <>
struct EnumTraits<::nds::adas::properties::PropertyType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "ADAS_ACCURACY",
        "CLOTHOID_META_DATA",
        "GRADIENT_META_DATA",
        "CORE"
    }};

    static constexpr ::std::array<::nds::adas::properties::PropertyType, 4> values =
    {{
        ::nds::adas::properties::PropertyType::ADAS_ACCURACY,
        ::nds::adas::properties::PropertyType::CLOTHOID_META_DATA,
        ::nds::adas::properties::PropertyType::GRADIENT_META_DATA,
        ::nds::adas::properties::PropertyType::CORE
    }};

    static constexpr const char* enumName = "PropertyType";
};

template <>
size_t enumToOrdinal<::nds::adas::properties::PropertyType>(::nds::adas::properties::PropertyType value);

template <>
::nds::adas::properties::PropertyType valueToEnum<::nds::adas::properties::PropertyType>(
        typename ::std::underlying_type<::nds::adas::properties::PropertyType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::adas::properties::PropertyType>(::nds::adas::properties::PropertyType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::adas::properties::PropertyType>(::zserio::DeltaContext& context, ::nds::adas::properties::PropertyType value);

template <>
size_t bitSizeOf<::nds::adas::properties::PropertyType>(::nds::adas::properties::PropertyType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::adas::properties::PropertyType>(::zserio::DeltaContext& context, ::nds::adas::properties::PropertyType value);

template <>
size_t initializeOffsets<::nds::adas::properties::PropertyType>(size_t bitPosition, ::nds::adas::properties::PropertyType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::adas::properties::PropertyType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::adas::properties::PropertyType value);

template <>
::nds::adas::properties::PropertyType read<::nds::adas::properties::PropertyType>(::zserio::BitStreamReader& in);

template <>
::nds::adas::properties::PropertyType read<::nds::adas::properties::PropertyType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::adas::properties::PropertyType>(::zserio::BitStreamWriter& out, ::nds::adas::properties::PropertyType value);

template <>
void write<::zserio::DeltaContext, ::nds::adas::properties::PropertyType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::adas::properties::PropertyType value);

} // namespace zserio

#endif // NDS_ADAS_PROPERTIES_PROPERTY_TYPE_H
