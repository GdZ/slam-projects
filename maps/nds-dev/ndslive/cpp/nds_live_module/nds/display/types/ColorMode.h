/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_COLOR_MODE_H
#define NDS_DISPLAY_TYPES_COLOR_MODE_H

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
namespace display
{
namespace types
{

enum class ColorMode : uint8_t
{
    NO_COLOR = UINT8_C(0),
    COLOR_PER_RENDER_GROUP = UINT8_C(1),
    COLOR_PER_VERTEX = UINT8_C(2)
};

} // namespace types
} // namespace display
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for ColorMode enumeration.
template <>
struct EnumTraits<::nds::display::types::ColorMode>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "NO_COLOR",
        "COLOR_PER_RENDER_GROUP",
        "COLOR_PER_VERTEX"
    }};

    static constexpr ::std::array<::nds::display::types::ColorMode, 3> values =
    {{
        ::nds::display::types::ColorMode::NO_COLOR,
        ::nds::display::types::ColorMode::COLOR_PER_RENDER_GROUP,
        ::nds::display::types::ColorMode::COLOR_PER_VERTEX
    }};

    static constexpr const char* enumName = "ColorMode";
};

template <>
size_t enumToOrdinal<::nds::display::types::ColorMode>(::nds::display::types::ColorMode value);

template <>
::nds::display::types::ColorMode valueToEnum<::nds::display::types::ColorMode>(
        typename ::std::underlying_type<::nds::display::types::ColorMode>::type rawValue);

template <>
uint32_t enumHashCode<::nds::display::types::ColorMode>(::nds::display::types::ColorMode value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::display::types::ColorMode>(::zserio::DeltaContext& context, ::nds::display::types::ColorMode value);

template <>
size_t bitSizeOf<::nds::display::types::ColorMode>(::nds::display::types::ColorMode value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::display::types::ColorMode>(::zserio::DeltaContext& context, ::nds::display::types::ColorMode value);

template <>
size_t initializeOffsets<::nds::display::types::ColorMode>(size_t bitPosition, ::nds::display::types::ColorMode value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::display::types::ColorMode>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::display::types::ColorMode value);

template <>
::nds::display::types::ColorMode read<::nds::display::types::ColorMode>(::zserio::BitStreamReader& in);

template <>
::nds::display::types::ColorMode read<::nds::display::types::ColorMode, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::display::types::ColorMode>(::zserio::BitStreamWriter& out, ::nds::display::types::ColorMode value);

template <>
void write<::zserio::DeltaContext, ::nds::display::types::ColorMode>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::display::types::ColorMode value);

} // namespace zserio

#endif // NDS_DISPLAY_TYPES_COLOR_MODE_H