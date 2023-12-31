/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_AREA_VALIDITY_TYPE_H
#define NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_AREA_VALIDITY_TYPE_H

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
namespace reference
{
namespace types
{

enum class DisplayAreaValidityType : uint8_t
{
    COMPLETE = UINT8_C(0),
    LABEL_POSITIONING_HINT = UINT8_C(1)
};

} // namespace types
} // namespace reference
} // namespace display
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for DisplayAreaValidityType enumeration.
template <>
struct EnumTraits<::nds::display::reference::types::DisplayAreaValidityType>
{
    static constexpr ::std::array<const char*, 2> names =
    {{
        "COMPLETE",
        "LABEL_POSITIONING_HINT"
    }};

    static constexpr ::std::array<::nds::display::reference::types::DisplayAreaValidityType, 2> values =
    {{
        ::nds::display::reference::types::DisplayAreaValidityType::COMPLETE,
        ::nds::display::reference::types::DisplayAreaValidityType::LABEL_POSITIONING_HINT
    }};

    static constexpr const char* enumName = "DisplayAreaValidityType";
};

template <>
size_t enumToOrdinal<::nds::display::reference::types::DisplayAreaValidityType>(::nds::display::reference::types::DisplayAreaValidityType value);

template <>
::nds::display::reference::types::DisplayAreaValidityType valueToEnum<::nds::display::reference::types::DisplayAreaValidityType>(
        typename ::std::underlying_type<::nds::display::reference::types::DisplayAreaValidityType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::display::reference::types::DisplayAreaValidityType>(::nds::display::reference::types::DisplayAreaValidityType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::display::reference::types::DisplayAreaValidityType>(::zserio::DeltaContext& context, ::nds::display::reference::types::DisplayAreaValidityType value);

template <>
size_t bitSizeOf<::nds::display::reference::types::DisplayAreaValidityType>(::nds::display::reference::types::DisplayAreaValidityType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::display::reference::types::DisplayAreaValidityType>(::zserio::DeltaContext& context, ::nds::display::reference::types::DisplayAreaValidityType value);

template <>
size_t initializeOffsets<::nds::display::reference::types::DisplayAreaValidityType>(size_t bitPosition, ::nds::display::reference::types::DisplayAreaValidityType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::display::reference::types::DisplayAreaValidityType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::display::reference::types::DisplayAreaValidityType value);

template <>
::nds::display::reference::types::DisplayAreaValidityType read<::nds::display::reference::types::DisplayAreaValidityType>(::zserio::BitStreamReader& in);

template <>
::nds::display::reference::types::DisplayAreaValidityType read<::nds::display::reference::types::DisplayAreaValidityType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::display::reference::types::DisplayAreaValidityType>(::zserio::BitStreamWriter& out, ::nds::display::reference::types::DisplayAreaValidityType value);

template <>
void write<::zserio::DeltaContext, ::nds::display::reference::types::DisplayAreaValidityType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::display::reference::types::DisplayAreaValidityType value);

} // namespace zserio

#endif // NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_AREA_VALIDITY_TYPE_H
