/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_TYPES_INSTRUCTION_LANE_MARKING_H
#define NDS_INSTRUCTIONS_TYPES_INSTRUCTION_LANE_MARKING_H

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

class InstructionLaneMarking
{
public:
    using underlying_type = uint64_t;

    enum class Values : underlying_type
    {
        NONE = UINT64_C(0),
        ARROW_STRAIGHT = UINT64_C(2),
        ARROW_LEFT = UINT64_C(4),
        ARROW_RIGHT = UINT64_C(8),
        ARROW_SLIGHT_LEFT = UINT64_C(16),
        ARROW_SLIGHT_RIGHT = UINT64_C(32),
        ARROW_SHARP_RIGHT = UINT64_C(64),
        ARROW_SHARP_LEFT = UINT64_C(128),
        ARROW_U_TURN_LEFT = UINT64_C(256),
        ARROW_U_TURN_RIGHT = UINT64_C(512)
    };

    constexpr InstructionLaneMarking() noexcept :
            m_value(0)
    {}

    explicit InstructionLaneMarking(::zserio::BitStreamReader& in);
    InstructionLaneMarking(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr InstructionLaneMarking(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit InstructionLaneMarking(underlying_type value);

    ~InstructionLaneMarking() = default;

    InstructionLaneMarking(const InstructionLaneMarking&) = default;
    InstructionLaneMarking& operator=(const InstructionLaneMarking&) = default;

    InstructionLaneMarking(InstructionLaneMarking&&) = default;
    InstructionLaneMarking& operator=(InstructionLaneMarking&&) = default;

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

inline bool operator==(const InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline InstructionLaneMarking operator|(InstructionLaneMarking::Values lhs, InstructionLaneMarking::Values rhs)
{
    return InstructionLaneMarking(static_cast<InstructionLaneMarking::underlying_type>(lhs) | static_cast<InstructionLaneMarking::underlying_type>(rhs));
}

inline InstructionLaneMarking operator|(const InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    return InstructionLaneMarking(lhs.getValue() | rhs.getValue());
}

inline InstructionLaneMarking operator&(InstructionLaneMarking::Values lhs, InstructionLaneMarking::Values rhs)
{
    return InstructionLaneMarking(static_cast<InstructionLaneMarking::underlying_type>(lhs) & static_cast<InstructionLaneMarking::underlying_type>(rhs));
}

inline InstructionLaneMarking operator&(const InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    return InstructionLaneMarking(lhs.getValue() & rhs.getValue());
}

inline InstructionLaneMarking operator^(InstructionLaneMarking::Values lhs, InstructionLaneMarking::Values rhs)
{
    return InstructionLaneMarking(static_cast<InstructionLaneMarking::underlying_type>(lhs) ^ static_cast<InstructionLaneMarking::underlying_type>(rhs));
}

inline InstructionLaneMarking operator^(const InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    return InstructionLaneMarking(lhs.getValue() ^ rhs.getValue());
}

inline InstructionLaneMarking operator~(InstructionLaneMarking::Values lhs)
{
    return InstructionLaneMarking(~static_cast<InstructionLaneMarking::underlying_type>(lhs) & UINT64_C(144115188075855871));
}

inline InstructionLaneMarking operator~(const InstructionLaneMarking& lhs)
{
    return InstructionLaneMarking(~lhs.getValue() & UINT64_C(144115188075855871));
}

inline InstructionLaneMarking operator|=(InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    lhs = InstructionLaneMarking(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline InstructionLaneMarking operator&=(InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    lhs = InstructionLaneMarking(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline InstructionLaneMarking operator^=(InstructionLaneMarking& lhs, const InstructionLaneMarking& rhs)
{
    lhs = InstructionLaneMarking(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace types
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_TYPES_INSTRUCTION_LANE_MARKING_H
