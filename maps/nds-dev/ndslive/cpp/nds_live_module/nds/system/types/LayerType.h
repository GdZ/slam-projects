/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SYSTEM_TYPES_LAYER_TYPE_H
#define NDS_SYSTEM_TYPES_LAYER_TYPE_H

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
namespace system
{
namespace types
{

enum class LayerType : uint8_t
{
    FEATURE = UINT8_C(0),
    GEOMETRY = UINT8_C(1),
    ATTRIBUTE = UINT8_C(2),
    RELATION = UINT8_C(3)
};

} // namespace types
} // namespace system
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for LayerType enumeration.
template <>
struct EnumTraits<::nds::system::types::LayerType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "FEATURE",
        "GEOMETRY",
        "ATTRIBUTE",
        "RELATION"
    }};

    static constexpr ::std::array<::nds::system::types::LayerType, 4> values =
    {{
        ::nds::system::types::LayerType::FEATURE,
        ::nds::system::types::LayerType::GEOMETRY,
        ::nds::system::types::LayerType::ATTRIBUTE,
        ::nds::system::types::LayerType::RELATION
    }};

    static constexpr const char* enumName = "LayerType";
};

template <>
size_t enumToOrdinal<::nds::system::types::LayerType>(::nds::system::types::LayerType value);

template <>
::nds::system::types::LayerType valueToEnum<::nds::system::types::LayerType>(
        typename ::std::underlying_type<::nds::system::types::LayerType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::system::types::LayerType>(::nds::system::types::LayerType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::system::types::LayerType>(::zserio::DeltaContext& context, ::nds::system::types::LayerType value);

template <>
size_t bitSizeOf<::nds::system::types::LayerType>(::nds::system::types::LayerType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::system::types::LayerType>(::zserio::DeltaContext& context, ::nds::system::types::LayerType value);

template <>
size_t initializeOffsets<::nds::system::types::LayerType>(size_t bitPosition, ::nds::system::types::LayerType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::system::types::LayerType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::system::types::LayerType value);

template <>
::nds::system::types::LayerType read<::nds::system::types::LayerType>(::zserio::BitStreamReader& in);

template <>
::nds::system::types::LayerType read<::nds::system::types::LayerType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::system::types::LayerType>(::zserio::BitStreamWriter& out, ::nds::system::types::LayerType value);

template <>
void write<::zserio::DeltaContext, ::nds::system::types::LayerType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::system::types::LayerType value);

} // namespace zserio

#endif // NDS_SYSTEM_TYPES_LAYER_TYPE_H