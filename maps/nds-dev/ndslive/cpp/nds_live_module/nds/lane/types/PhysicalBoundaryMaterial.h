/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_TYPES_PHYSICAL_BOUNDARY_MATERIAL_H
#define NDS_LANE_TYPES_PHYSICAL_BOUNDARY_MATERIAL_H

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
namespace lane
{
namespace types
{

enum class PhysicalBoundaryMaterial : uint8_t
{
    UNKNOWN = UINT8_C(0),
    METAL = UINT8_C(1),
    CONCRETE = UINT8_C(2),
    STONE = UINT8_C(3),
    WOOD = UINT8_C(4),
    PLASTIC = UINT8_C(5),
    TRANSPARENT_MATERIAL = UINT8_C(6)
};

} // namespace types
} // namespace lane
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for PhysicalBoundaryMaterial enumeration.
template <>
struct EnumTraits<::nds::lane::types::PhysicalBoundaryMaterial>
{
    static constexpr ::std::array<const char*, 7> names =
    {{
        "UNKNOWN",
        "METAL",
        "CONCRETE",
        "STONE",
        "WOOD",
        "PLASTIC",
        "TRANSPARENT_MATERIAL"
    }};

    static constexpr ::std::array<::nds::lane::types::PhysicalBoundaryMaterial, 7> values =
    {{
        ::nds::lane::types::PhysicalBoundaryMaterial::UNKNOWN,
        ::nds::lane::types::PhysicalBoundaryMaterial::METAL,
        ::nds::lane::types::PhysicalBoundaryMaterial::CONCRETE,
        ::nds::lane::types::PhysicalBoundaryMaterial::STONE,
        ::nds::lane::types::PhysicalBoundaryMaterial::WOOD,
        ::nds::lane::types::PhysicalBoundaryMaterial::PLASTIC,
        ::nds::lane::types::PhysicalBoundaryMaterial::TRANSPARENT_MATERIAL
    }};

    static constexpr const char* enumName = "PhysicalBoundaryMaterial";
};

template <>
size_t enumToOrdinal<::nds::lane::types::PhysicalBoundaryMaterial>(::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
::nds::lane::types::PhysicalBoundaryMaterial valueToEnum<::nds::lane::types::PhysicalBoundaryMaterial>(
        typename ::std::underlying_type<::nds::lane::types::PhysicalBoundaryMaterial>::type rawValue);

template <>
uint32_t enumHashCode<::nds::lane::types::PhysicalBoundaryMaterial>(::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::lane::types::PhysicalBoundaryMaterial>(::zserio::DeltaContext& context, ::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
size_t bitSizeOf<::nds::lane::types::PhysicalBoundaryMaterial>(::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::lane::types::PhysicalBoundaryMaterial>(::zserio::DeltaContext& context, ::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
size_t initializeOffsets<::nds::lane::types::PhysicalBoundaryMaterial>(size_t bitPosition, ::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::lane::types::PhysicalBoundaryMaterial>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
::nds::lane::types::PhysicalBoundaryMaterial read<::nds::lane::types::PhysicalBoundaryMaterial>(::zserio::BitStreamReader& in);

template <>
::nds::lane::types::PhysicalBoundaryMaterial read<::nds::lane::types::PhysicalBoundaryMaterial, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::lane::types::PhysicalBoundaryMaterial>(::zserio::BitStreamWriter& out, ::nds::lane::types::PhysicalBoundaryMaterial value);

template <>
void write<::zserio::DeltaContext, ::nds::lane::types::PhysicalBoundaryMaterial>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::lane::types::PhysicalBoundaryMaterial value);

} // namespace zserio

#endif // NDS_LANE_TYPES_PHYSICAL_BOUNDARY_MATERIAL_H
