/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_METADATA_DISPLAY_LINE_RULES_LAYER_CONTENT_H
#define NDS_RULES_METADATA_DISPLAY_LINE_RULES_LAYER_CONTENT_H

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
namespace rules
{
namespace metadata
{

class DisplayLineRulesLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        DISPLAY_LINE_RANGE_MAPS = UINT32_C(1),
        DISPLAY_LINE_RANGE_SETS = UINT32_C(2),
        DISPLAY_LINE_POSITION_MAPS = UINT32_C(4),
        DISPLAY_LINE_POSITION_SETS = UINT32_C(8),
        LANGUAGES = UINT32_C(16)
    };

    constexpr DisplayLineRulesLayerContent() noexcept :
            m_value(0)
    {}

    explicit DisplayLineRulesLayerContent(::zserio::BitStreamReader& in);
    DisplayLineRulesLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr DisplayLineRulesLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit DisplayLineRulesLayerContent(underlying_type value);

    ~DisplayLineRulesLayerContent() = default;

    DisplayLineRulesLayerContent(const DisplayLineRulesLayerContent&) = default;
    DisplayLineRulesLayerContent& operator=(const DisplayLineRulesLayerContent&) = default;

    DisplayLineRulesLayerContent(DisplayLineRulesLayerContent&&) = default;
    DisplayLineRulesLayerContent& operator=(DisplayLineRulesLayerContent&&) = default;

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

inline bool operator==(const DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline DisplayLineRulesLayerContent operator|(DisplayLineRulesLayerContent::Values lhs, DisplayLineRulesLayerContent::Values rhs)
{
    return DisplayLineRulesLayerContent(static_cast<DisplayLineRulesLayerContent::underlying_type>(lhs) | static_cast<DisplayLineRulesLayerContent::underlying_type>(rhs));
}

inline DisplayLineRulesLayerContent operator|(const DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    return DisplayLineRulesLayerContent(lhs.getValue() | rhs.getValue());
}

inline DisplayLineRulesLayerContent operator&(DisplayLineRulesLayerContent::Values lhs, DisplayLineRulesLayerContent::Values rhs)
{
    return DisplayLineRulesLayerContent(static_cast<DisplayLineRulesLayerContent::underlying_type>(lhs) & static_cast<DisplayLineRulesLayerContent::underlying_type>(rhs));
}

inline DisplayLineRulesLayerContent operator&(const DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    return DisplayLineRulesLayerContent(lhs.getValue() & rhs.getValue());
}

inline DisplayLineRulesLayerContent operator^(DisplayLineRulesLayerContent::Values lhs, DisplayLineRulesLayerContent::Values rhs)
{
    return DisplayLineRulesLayerContent(static_cast<DisplayLineRulesLayerContent::underlying_type>(lhs) ^ static_cast<DisplayLineRulesLayerContent::underlying_type>(rhs));
}

inline DisplayLineRulesLayerContent operator^(const DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    return DisplayLineRulesLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline DisplayLineRulesLayerContent operator~(DisplayLineRulesLayerContent::Values lhs)
{
    return DisplayLineRulesLayerContent(~static_cast<DisplayLineRulesLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline DisplayLineRulesLayerContent operator~(const DisplayLineRulesLayerContent& lhs)
{
    return DisplayLineRulesLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline DisplayLineRulesLayerContent operator|=(DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    lhs = DisplayLineRulesLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline DisplayLineRulesLayerContent operator&=(DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    lhs = DisplayLineRulesLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline DisplayLineRulesLayerContent operator^=(DisplayLineRulesLayerContent& lhs, const DisplayLineRulesLayerContent& rhs)
{
    lhs = DisplayLineRulesLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace rules
} // namespace nds

#endif // NDS_RULES_METADATA_DISPLAY_LINE_RULES_LAYER_CONTENT_H
