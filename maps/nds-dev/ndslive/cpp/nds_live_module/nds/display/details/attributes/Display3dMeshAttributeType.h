/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_ATTRIBUTES_DISPLAY3D_MESH_ATTRIBUTE_TYPE_H
#define NDS_DISPLAY_DETAILS_ATTRIBUTES_DISPLAY3D_MESH_ATTRIBUTE_TYPE_H

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
namespace attributes
{

enum class Display3dMeshAttributeType : uint16_t
{
    ADDITIONAL_3D_FEATURE_CLASS = UINT16_C(0),
    ORIGINAL_POINT_HEIGHTS = UINT16_C(1)
};

} // namespace attributes
} // namespace details
} // namespace display
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for Display3dMeshAttributeType enumeration.
template <>
struct EnumTraits<::nds::display::details::attributes::Display3dMeshAttributeType>
{
    static constexpr ::std::array<const char*, 2> names =
    {{
        "ADDITIONAL_3D_FEATURE_CLASS",
        "ORIGINAL_POINT_HEIGHTS"
    }};

    static constexpr ::std::array<::nds::display::details::attributes::Display3dMeshAttributeType, 2> values =
    {{
        ::nds::display::details::attributes::Display3dMeshAttributeType::ADDITIONAL_3D_FEATURE_CLASS,
        ::nds::display::details::attributes::Display3dMeshAttributeType::ORIGINAL_POINT_HEIGHTS
    }};

    static constexpr const char* enumName = "Display3dMeshAttributeType";
};

template <>
size_t enumToOrdinal<::nds::display::details::attributes::Display3dMeshAttributeType>(::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
::nds::display::details::attributes::Display3dMeshAttributeType valueToEnum<::nds::display::details::attributes::Display3dMeshAttributeType>(
        typename ::std::underlying_type<::nds::display::details::attributes::Display3dMeshAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::display::details::attributes::Display3dMeshAttributeType>(::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::display::details::attributes::Display3dMeshAttributeType>(::zserio::DeltaContext& context, ::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
size_t bitSizeOf<::nds::display::details::attributes::Display3dMeshAttributeType>(::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::display::details::attributes::Display3dMeshAttributeType>(::zserio::DeltaContext& context, ::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
size_t initializeOffsets<::nds::display::details::attributes::Display3dMeshAttributeType>(size_t bitPosition, ::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::display::details::attributes::Display3dMeshAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
::nds::display::details::attributes::Display3dMeshAttributeType read<::nds::display::details::attributes::Display3dMeshAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::display::details::attributes::Display3dMeshAttributeType read<::nds::display::details::attributes::Display3dMeshAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::display::details::attributes::Display3dMeshAttributeType>(::zserio::BitStreamWriter& out, ::nds::display::details::attributes::Display3dMeshAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::display::details::attributes::Display3dMeshAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::display::details::attributes::Display3dMeshAttributeType value);

} // namespace zserio

#endif // NDS_DISPLAY_DETAILS_ATTRIBUTES_DISPLAY3D_MESH_ATTRIBUTE_TYPE_H
