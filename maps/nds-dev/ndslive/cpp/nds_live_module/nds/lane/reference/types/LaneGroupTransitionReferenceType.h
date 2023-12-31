/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_REFERENCE_TYPES_LANE_GROUP_TRANSITION_REFERENCE_TYPE_H
#define NDS_LANE_REFERENCE_TYPES_LANE_GROUP_TRANSITION_REFERENCE_TYPE_H

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
namespace reference
{
namespace types
{

enum class LaneGroupTransitionReferenceType : uint8_t
{
    INTERSECTION = UINT8_C(0),
    TRANSITION_PATH = UINT8_C(1),
    TRANSITION_GEO_PATH = UINT8_C(2)
};

} // namespace types
} // namespace reference
} // namespace lane
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for LaneGroupTransitionReferenceType enumeration.
template <>
struct EnumTraits<::nds::lane::reference::types::LaneGroupTransitionReferenceType>
{
    static constexpr ::std::array<const char*, 3> names =
    {{
        "INTERSECTION",
        "TRANSITION_PATH",
        "TRANSITION_GEO_PATH"
    }};

    static constexpr ::std::array<::nds::lane::reference::types::LaneGroupTransitionReferenceType, 3> values =
    {{
        ::nds::lane::reference::types::LaneGroupTransitionReferenceType::INTERSECTION,
        ::nds::lane::reference::types::LaneGroupTransitionReferenceType::TRANSITION_PATH,
        ::nds::lane::reference::types::LaneGroupTransitionReferenceType::TRANSITION_GEO_PATH
    }};

    static constexpr const char* enumName = "LaneGroupTransitionReferenceType";
};

template <>
size_t enumToOrdinal<::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
::nds::lane::reference::types::LaneGroupTransitionReferenceType valueToEnum<::nds::lane::reference::types::LaneGroupTransitionReferenceType>(
        typename ::std::underlying_type<::nds::lane::reference::types::LaneGroupTransitionReferenceType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::zserio::DeltaContext& context, ::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
size_t bitSizeOf<::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::zserio::DeltaContext& context, ::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
size_t initializeOffsets<::nds::lane::reference::types::LaneGroupTransitionReferenceType>(size_t bitPosition, ::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
::nds::lane::reference::types::LaneGroupTransitionReferenceType read<::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::zserio::BitStreamReader& in);

template <>
::nds::lane::reference::types::LaneGroupTransitionReferenceType read<::nds::lane::reference::types::LaneGroupTransitionReferenceType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::zserio::BitStreamWriter& out, ::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

template <>
void write<::zserio::DeltaContext, ::nds::lane::reference::types::LaneGroupTransitionReferenceType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::lane::reference::types::LaneGroupTransitionReferenceType value);

} // namespace zserio

#endif // NDS_LANE_REFERENCE_TYPES_LANE_GROUP_TRANSITION_REFERENCE_TYPE_H
