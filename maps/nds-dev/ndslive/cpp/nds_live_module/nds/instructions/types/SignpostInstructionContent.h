/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_TYPES_SIGNPOST_INSTRUCTION_CONTENT_H
#define NDS_INSTRUCTIONS_TYPES_SIGNPOST_INSTRUCTION_CONTENT_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/DeltaContext.h>
#include <zserio/BitSizeOfCalculator.h>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>

namespace nds
{
namespace instructions
{
namespace types
{

class SignpostInstructionContent
{
public:
    using underlying_type = uint16_t;

    enum class Values : underlying_type
    {
        EXIT_NAME = UINT16_C(1),
        EXIT_NUMBER = UINT16_C(2),
        TOWARDS_NAME = UINT16_C(4),
        TOWARDS_NUMBER = UINT16_C(8),
        DIRECTION_NAME = UINT16_C(16),
        DIRECTION_NUMBER = UINT16_C(32)
    };

    constexpr SignpostInstructionContent() noexcept :
            m_value(0)
    {}

    explicit SignpostInstructionContent(::zserio::BitStreamReader& in);
    SignpostInstructionContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr SignpostInstructionContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit SignpostInstructionContent(underlying_type value);

    ~SignpostInstructionContent() = default;

    SignpostInstructionContent(const SignpostInstructionContent&) = default;
    SignpostInstructionContent& operator=(const SignpostInstructionContent&) = default;

    SignpostInstructionContent(SignpostInstructionContent&&) = default;
    SignpostInstructionContent& operator=(SignpostInstructionContent&&) = default;

    constexpr explicit operator underlying_type() const
    {
        return m_value;
    }

    constexpr underlying_type getValue() const
    {
        return m_value;
    }

    void initPackingContext(::zserio::DeltaContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(::zserio::DeltaContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0) const;
    size_t initializeOffsets(::zserio::DeltaContext& context, size_t bitPosition) const;

    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(::zserio::DeltaContext& context, ::zserio::BitStreamWriter& out) const;

    ::zserio::string<> toString(const ::zserio::string<>::allocator_type& allocator =
            ::zserio::string<>::allocator_type()) const;

private:
    static underlying_type readValue(::zserio::BitStreamReader& in);
    static underlying_type readValue(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);

    underlying_type m_value;
};

inline bool operator==(const SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline SignpostInstructionContent operator|(SignpostInstructionContent::Values lhs, SignpostInstructionContent::Values rhs)
{
    return SignpostInstructionContent(static_cast<SignpostInstructionContent::underlying_type>(lhs) | static_cast<SignpostInstructionContent::underlying_type>(rhs));
}

inline SignpostInstructionContent operator|(const SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    return SignpostInstructionContent(lhs.getValue() | rhs.getValue());
}

inline SignpostInstructionContent operator&(SignpostInstructionContent::Values lhs, SignpostInstructionContent::Values rhs)
{
    return SignpostInstructionContent(static_cast<SignpostInstructionContent::underlying_type>(lhs) & static_cast<SignpostInstructionContent::underlying_type>(rhs));
}

inline SignpostInstructionContent operator&(const SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    return SignpostInstructionContent(lhs.getValue() & rhs.getValue());
}

inline SignpostInstructionContent operator^(SignpostInstructionContent::Values lhs, SignpostInstructionContent::Values rhs)
{
    return SignpostInstructionContent(static_cast<SignpostInstructionContent::underlying_type>(lhs) ^ static_cast<SignpostInstructionContent::underlying_type>(rhs));
}

inline SignpostInstructionContent operator^(const SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    return SignpostInstructionContent(lhs.getValue() ^ rhs.getValue());
}

inline SignpostInstructionContent operator~(SignpostInstructionContent::Values lhs)
{
    return SignpostInstructionContent(~static_cast<SignpostInstructionContent::underlying_type>(lhs) & UINT16_C(32767));
}

inline SignpostInstructionContent operator~(const SignpostInstructionContent& lhs)
{
    return SignpostInstructionContent(~lhs.getValue() & UINT16_C(32767));
}

inline SignpostInstructionContent operator|=(SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    lhs = SignpostInstructionContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline SignpostInstructionContent operator&=(SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    lhs = SignpostInstructionContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline SignpostInstructionContent operator^=(SignpostInstructionContent& lhs, const SignpostInstructionContent& rhs)
{
    lhs = SignpostInstructionContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace types
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_TYPES_SIGNPOST_INSTRUCTION_CONTENT_H
