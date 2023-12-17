/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_METADATA_LANE_INSTRUCTIONS_LAYER_CONTENT_H
#define NDS_INSTRUCTIONS_METADATA_LANE_INSTRUCTIONS_LAYER_CONTENT_H

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
namespace metadata
{

class LaneInstructionsLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        LANE_TRANSITION_MAPS = UINT32_C(1),
        LANE_TRANSITION_SETS = UINT32_C(2)
    };

    constexpr LaneInstructionsLayerContent() noexcept :
            m_value(0)
    {}

    explicit LaneInstructionsLayerContent(::zserio::BitStreamReader& in);
    LaneInstructionsLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr LaneInstructionsLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit LaneInstructionsLayerContent(underlying_type value);

    ~LaneInstructionsLayerContent() = default;

    LaneInstructionsLayerContent(const LaneInstructionsLayerContent&) = default;
    LaneInstructionsLayerContent& operator=(const LaneInstructionsLayerContent&) = default;

    LaneInstructionsLayerContent(LaneInstructionsLayerContent&&) = default;
    LaneInstructionsLayerContent& operator=(LaneInstructionsLayerContent&&) = default;

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

inline bool operator==(const LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline LaneInstructionsLayerContent operator|(LaneInstructionsLayerContent::Values lhs, LaneInstructionsLayerContent::Values rhs)
{
    return LaneInstructionsLayerContent(static_cast<LaneInstructionsLayerContent::underlying_type>(lhs) | static_cast<LaneInstructionsLayerContent::underlying_type>(rhs));
}

inline LaneInstructionsLayerContent operator|(const LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    return LaneInstructionsLayerContent(lhs.getValue() | rhs.getValue());
}

inline LaneInstructionsLayerContent operator&(LaneInstructionsLayerContent::Values lhs, LaneInstructionsLayerContent::Values rhs)
{
    return LaneInstructionsLayerContent(static_cast<LaneInstructionsLayerContent::underlying_type>(lhs) & static_cast<LaneInstructionsLayerContent::underlying_type>(rhs));
}

inline LaneInstructionsLayerContent operator&(const LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    return LaneInstructionsLayerContent(lhs.getValue() & rhs.getValue());
}

inline LaneInstructionsLayerContent operator^(LaneInstructionsLayerContent::Values lhs, LaneInstructionsLayerContent::Values rhs)
{
    return LaneInstructionsLayerContent(static_cast<LaneInstructionsLayerContent::underlying_type>(lhs) ^ static_cast<LaneInstructionsLayerContent::underlying_type>(rhs));
}

inline LaneInstructionsLayerContent operator^(const LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    return LaneInstructionsLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline LaneInstructionsLayerContent operator~(LaneInstructionsLayerContent::Values lhs)
{
    return LaneInstructionsLayerContent(~static_cast<LaneInstructionsLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline LaneInstructionsLayerContent operator~(const LaneInstructionsLayerContent& lhs)
{
    return LaneInstructionsLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline LaneInstructionsLayerContent operator|=(LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    lhs = LaneInstructionsLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline LaneInstructionsLayerContent operator&=(LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    lhs = LaneInstructionsLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline LaneInstructionsLayerContent operator^=(LaneInstructionsLayerContent& lhs, const LaneInstructionsLayerContent& rhs)
{
    lhs = LaneInstructionsLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_METADATA_LANE_INSTRUCTIONS_LAYER_CONTENT_H