/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_PROPERTIES_PROPERTY_TYPE_H
#define NDS_DISPLAY_DETAILS_PROPERTIES_PROPERTY_TYPE_H

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
namespace display
{
namespace details
{
namespace properties
{

enum class PropertyType : uint16_t
{
    CORE = UINT16_C(0)
};

} // namespace properties
} // namespace details
} // namespace display
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for PropertyType enumeration.
template <>
struct EnumTraits<::nds::display::details::properties::PropertyType>
{
    static constexpr ::std::array<const char*, 1> names =
    {{
        "CORE"
    }};

    static constexpr ::std::array<::nds::display::details::properties::PropertyType, 1> values =
    {{
        ::nds::display::details::properties::PropertyType::CORE
    }};

    static constexpr const char* enumName = "PropertyType";
};

template <>
size_t enumToOrdinal<::nds::display::details::properties::PropertyType>(::nds::display::details::properties::PropertyType value);

template <>
::nds::display::details::properties::PropertyType valueToEnum<::nds::display::details::properties::PropertyType>(
        typename ::std::underlying_type<::nds::display::details::properties::PropertyType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::display::details::properties::PropertyType>(::nds::display::details::properties::PropertyType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::display::details::properties::PropertyType>(::zserio::DeltaContext& context, ::nds::display::details::properties::PropertyType value);

template <>
size_t bitSizeOf<::nds::display::details::properties::PropertyType>(::nds::display::details::properties::PropertyType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::display::details::properties::PropertyType>(::zserio::DeltaContext& context, ::nds::display::details::properties::PropertyType value);

template <>
size_t initializeOffsets<::nds::display::details::properties::PropertyType>(size_t bitPosition, ::nds::display::details::properties::PropertyType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::display::details::properties::PropertyType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::display::details::properties::PropertyType value);

template <>
::nds::display::details::properties::PropertyType read<::nds::display::details::properties::PropertyType>(::zserio::BitStreamReader& in);

template <>
::nds::display::details::properties::PropertyType read<::nds::display::details::properties::PropertyType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::display::details::properties::PropertyType>(::zserio::BitStreamWriter& out, ::nds::display::details::properties::PropertyType value);

template <>
void write<::zserio::DeltaContext, ::nds::display::details::properties::PropertyType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::display::details::properties::PropertyType value);

} // namespace zserio

#endif // NDS_DISPLAY_DETAILS_PROPERTIES_PROPERTY_TYPE_H
