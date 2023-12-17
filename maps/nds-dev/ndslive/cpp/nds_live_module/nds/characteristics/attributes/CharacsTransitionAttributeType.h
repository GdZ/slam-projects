/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_TRANSITION_ATTRIBUTE_TYPE_H
#define NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_TRANSITION_ATTRIBUTE_TYPE_H

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
namespace characteristics
{
namespace attributes
{

enum class CharacsTransitionAttributeType : uint16_t
{
    INTERSECTION_TYPE = UINT16_C(0)
};

} // namespace attributes
} // namespace characteristics
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for CharacsTransitionAttributeType enumeration.
template <>
struct EnumTraits<::nds::characteristics::attributes::CharacsTransitionAttributeType>
{
    static constexpr ::std::array<const char*, 1> names =
    {{
        "INTERSECTION_TYPE"
    }};

    static constexpr ::std::array<::nds::characteristics::attributes::CharacsTransitionAttributeType, 1> values =
    {{
        ::nds::characteristics::attributes::CharacsTransitionAttributeType::INTERSECTION_TYPE
    }};

    static constexpr const char* enumName = "CharacsTransitionAttributeType";
};

template <>
size_t enumToOrdinal<::nds::characteristics::attributes::CharacsTransitionAttributeType>(::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
::nds::characteristics::attributes::CharacsTransitionAttributeType valueToEnum<::nds::characteristics::attributes::CharacsTransitionAttributeType>(
        typename ::std::underlying_type<::nds::characteristics::attributes::CharacsTransitionAttributeType>::type rawValue);

template <>
uint32_t enumHashCode<::nds::characteristics::attributes::CharacsTransitionAttributeType>(::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
size_t bitSizeOf<::nds::characteristics::attributes::CharacsTransitionAttributeType>(::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsTransitionAttributeType>(::zserio::DeltaContext& context, ::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
size_t initializeOffsets<::nds::characteristics::attributes::CharacsTransitionAttributeType>(size_t bitPosition, ::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsTransitionAttributeType>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
::nds::characteristics::attributes::CharacsTransitionAttributeType read<::nds::characteristics::attributes::CharacsTransitionAttributeType>(::zserio::BitStreamReader& in);

template <>
::nds::characteristics::attributes::CharacsTransitionAttributeType read<::nds::characteristics::attributes::CharacsTransitionAttributeType, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::characteristics::attributes::CharacsTransitionAttributeType>(::zserio::BitStreamWriter& out, ::nds::characteristics::attributes::CharacsTransitionAttributeType value);

template <>
void write<::zserio::DeltaContext, ::nds::characteristics::attributes::CharacsTransitionAttributeType>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::characteristics::attributes::CharacsTransitionAttributeType value);

} // namespace zserio

#endif // NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_TRANSITION_ATTRIBUTE_TYPE_H
