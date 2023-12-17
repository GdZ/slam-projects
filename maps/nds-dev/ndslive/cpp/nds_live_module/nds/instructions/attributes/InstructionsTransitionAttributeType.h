/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_ATTRIBUTES_INSTRUCTIONS_TRANSITION_ATTRIBUTE_TYPE_H
#define NDS_INSTRUCTIONS_ATTRIBUTES_INSTRUCTIONS_TRANSITION_ATTRIBUTE_TYPE_H

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
namespace instructions
{
namespace attributes
{

enum class InstructionsTransitionAttributeType : uint16_t
{
    SIGNPOST_IMAGE = UINT16_C(0),
    SIGNPOST_INSTRUCTION = UINT16_C(1),
    LANE_INSTRUCTION = UINT16_C(2),
    JUNCTION_VIEW = UINT16_C(3)
};

} // namespace attributes
} // namespace instructions
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for InstructionsTransitionAttributeType enumeration.
template <>
struct EnumTraits<::nds::instructions::attributes::InstructionsTransitionAttributeType>
{
    static constexpr ::std::array<const char*, 4> names =
    {{
        "SIGNPOST_IMAGE",
        "SIGNPOST_INSTRUCTION",
        "LANE_INSTRUCTION",
        "JUNCTION_VIEW"
    }};

    static constexpr ::std::array<::nds::instructions::attributes::InstructionsTransitionAttributeType, 4> values =
    {{
        ::nds::instructions::attributes::InstructionsTransitionAttributeType::SIGNPOST_IMAGE,
        ::nds::instructions::attributes::InstructionsTransitionAttributeType::SIGNPOST_INSTRUCTION,
        ::nds::instructions::attributes::InstructionsTransitionAttributeType::LANE_INSTRUCTION,
        ::nds::instructions::attributes::InstructionsTransitionAttributeType::JUNCTION_VIEW
    }};

    static constexpr const char* enumName = "InstructionsTransitionAttributeType";
};

template <>
size_t enumToOrdinal<::nds::instructions::attributes::InstructionsTransitionAttributeType>(::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
::nds::instructions::attributes::InstructionsTransitionAttributeType valueToEnum<::nds::instructions::attributes::InstructionsTransitionAttributeType>(
        typename ::std::underlying_type<::nds::instructions::attributes::InstructionsTransitionAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::instructions::attributes::InstructionsTransitionAttributeType>(::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::instructions::attributes::InstructionsTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
size_t bitSizeOf<::nds::instructions::attributes::InstructionsTransitionAttributeType>(::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::instructions::attributes::InstructionsTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
size_t initializeOffsets<::nds::instructions::attributes::InstructionsTransitionAttributeType>(size_t bitPosition, ::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::instructions::attributes::InstructionsTransitionAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
::nds::instructions::attributes::InstructionsTransitionAttributeType read<::nds::instructions::attributes::InstructionsTransitionAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::instructions::attributes::InstructionsTransitionAttributeType read<::nds::instructions::attributes::InstructionsTransitionAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::instructions::attributes::InstructionsTransitionAttributeType>(::zserio::BitStreamWriter& out, ::nds::instructions::attributes::InstructionsTransitionAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::instructions::attributes::InstructionsTransitionAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::instructions::attributes::InstructionsTransitionAttributeType value);

} // namespace zserio

#endif // NDS_INSTRUCTIONS_ATTRIBUTES_INSTRUCTIONS_TRANSITION_ATTRIBUTE_TYPE_H
