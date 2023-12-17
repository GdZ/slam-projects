/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_TRANSITION_ATTRIBUTE_TYPE_H
#define NDS_NAME_ATTRIBUTES_NAME_TRANSITION_ATTRIBUTE_TYPE_H

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
namespace name
{
namespace attributes
{

enum class NameTransitionAttributeType : uint16_t
{
    INTERSECTION_NAME = UINT16_C(0)
};

} // namespace attributes
} // namespace name
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for NameTransitionAttributeType enumeration.
template <>
struct EnumTraits<::nds::name::attributes::NameTransitionAttributeType>
{
    static constexpr ::std::array<const char*, 1> names =
    {{
        "INTERSECTION_NAME"
    }};

    static constexpr ::std::array<::nds::name::attributes::NameTransitionAttributeType, 1> values =
    {{
        ::nds::name::attributes::NameTransitionAttributeType::INTERSECTION_NAME
    }};

    static constexpr const char* enumName = "NameTransitionAttributeType";
};

template <>
size_t enumToOrdinal<::nds::name::attributes::NameTransitionAttributeType>(::nds::name::attributes::NameTransitionAttributeType value);

template <>
::nds::name::attributes::NameTransitionAttributeType valueToEnum<::nds::name::attributes::NameTransitionAttributeType>(
        typename ::std::underlying_type<::nds::name::attributes::NameTransitionAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::name::attributes::NameTransitionAttributeType>(::nds::name::attributes::NameTransitionAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::name::attributes::NameTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::name::attributes::NameTransitionAttributeType value);

template <>
size_t bitSizeOf<::nds::name::attributes::NameTransitionAttributeType>(::nds::name::attributes::NameTransitionAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::name::attributes::NameTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::name::attributes::NameTransitionAttributeType value);

template <>
size_t initializeOffsets<::nds::name::attributes::NameTransitionAttributeType>(size_t bitPosition, ::nds::name::attributes::NameTransitionAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::name::attributes::NameTransitionAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::name::attributes::NameTransitionAttributeType value);

template <>
::nds::name::attributes::NameTransitionAttributeType read<::nds::name::attributes::NameTransitionAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::name::attributes::NameTransitionAttributeType read<::nds::name::attributes::NameTransitionAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::name::attributes::NameTransitionAttributeType>(::zserio::BitStreamWriter& out, ::nds::name::attributes::NameTransitionAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::name::attributes::NameTransitionAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::name::attributes::NameTransitionAttributeType value);

} // namespace zserio

#endif // NDS_NAME_ATTRIBUTES_NAME_TRANSITION_ATTRIBUTE_TYPE_H