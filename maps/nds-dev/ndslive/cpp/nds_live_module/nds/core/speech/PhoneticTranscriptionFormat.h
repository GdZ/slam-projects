/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_SPEECH_PHONETIC_TRANSCRIPTION_FORMAT_H
#define NDS_CORE_SPEECH_PHONETIC_TRANSCRIPTION_FORMAT_H

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
namespace core
{
namespace speech
{

enum class PhoneticTranscriptionFormat : uint8_t
{
    IPA = UINT8_C(0),
    STARREC_SAMPA = UINT8_C(1),
    X_SAMPA = UINT8_C(2),
    LH_PLUS = UINT8_C(3),
    NT_SAMPA = UINT8_C(4),
    SVOX_PA = UINT8_C(5),
    LH_PLUS_V24 = UINT8_C(6),
    I_FLYTEC = UINT8_C(7),
    JEITA = UINT8_C(8)
};

} // namespace speech
} // namespace core
} // namespace nds

namespace zserio
{

// This is full specialization of enumeration traits and methods for PhoneticTranscriptionFormat enumeration.
template <>
struct EnumTraits<::nds::core::speech::PhoneticTranscriptionFormat>
{
    static constexpr ::std::array<const char*, 9> names =
    {{
        "IPA",
        "STARREC_SAMPA",
        "X_SAMPA",
        "LH_PLUS",
        "NT_SAMPA",
        "SVOX_PA",
        "LH_PLUS_V24",
        "I_FLYTEC",
        "JEITA"
    }};

    static constexpr ::std::array<::nds::core::speech::PhoneticTranscriptionFormat, 9> values =
    {{
        ::nds::core::speech::PhoneticTranscriptionFormat::IPA,
        ::nds::core::speech::PhoneticTranscriptionFormat::STARREC_SAMPA,
        ::nds::core::speech::PhoneticTranscriptionFormat::X_SAMPA,
        ::nds::core::speech::PhoneticTranscriptionFormat::LH_PLUS,
        ::nds::core::speech::PhoneticTranscriptionFormat::NT_SAMPA,
        ::nds::core::speech::PhoneticTranscriptionFormat::SVOX_PA,
        ::nds::core::speech::PhoneticTranscriptionFormat::LH_PLUS_V24,
        ::nds::core::speech::PhoneticTranscriptionFormat::I_FLYTEC,
        ::nds::core::speech::PhoneticTranscriptionFormat::JEITA
    }};

    static constexpr const char* enumName = "PhoneticTranscriptionFormat";
};

template <>
size_t enumToOrdinal<::nds::core::speech::PhoneticTranscriptionFormat>(::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
::nds::core::speech::PhoneticTranscriptionFormat valueToEnum<::nds::core::speech::PhoneticTranscriptionFormat>(
        typename ::std::underlying_type<::nds::core::speech::PhoneticTranscriptionFormat>::type rawValue);

template <>
uint32_t enumHashCode<::nds::core::speech::PhoneticTranscriptionFormat>(::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
void initPackingContext<::zserio::DeltaContext, ::nds::core::speech::PhoneticTranscriptionFormat>(::zserio::DeltaContext& context, ::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
size_t bitSizeOf<::nds::core::speech::PhoneticTranscriptionFormat>(::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
size_t bitSizeOf<::zserio::DeltaContext, ::nds::core::speech::PhoneticTranscriptionFormat>(::zserio::DeltaContext& context, ::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
size_t initializeOffsets<::nds::core::speech::PhoneticTranscriptionFormat>(size_t bitPosition, ::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
size_t initializeOffsets<::zserio::DeltaContext, ::nds::core::speech::PhoneticTranscriptionFormat>(::zserio::DeltaContext& context, size_t bitPosition,
        ::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
::nds::core::speech::PhoneticTranscriptionFormat read<::nds::core::speech::PhoneticTranscriptionFormat>(::zserio::BitStreamReader& in);

template <>
::nds::core::speech::PhoneticTranscriptionFormat read<::nds::core::speech::PhoneticTranscriptionFormat, ::zserio::DeltaContext>(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

template <>
void write<::nds::core::speech::PhoneticTranscriptionFormat>(::zserio::BitStreamWriter& out, ::nds::core::speech::PhoneticTranscriptionFormat value);

template <>
void write<::zserio::DeltaContext, ::nds::core::speech::PhoneticTranscriptionFormat>(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out,
        ::nds::core::speech::PhoneticTranscriptionFormat value);

} // namespace zserio

#endif // NDS_CORE_SPEECH_PHONETIC_TRANSCRIPTION_FORMAT_H
