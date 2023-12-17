/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_TEXTURE_CONDITION_USAGE_TYPE_H
#define NDS_DISPLAY_TYPES_TEXTURE_CONDITION_USAGE_TYPE_H

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
namespace display
{
namespace types
{

class TextureConditionUsageType
{
public:
    using underlying_type = uint64_t;

    enum class Values : underlying_type
    {
        TIME_DAY = UINT64_C(1),
        TIME_NIGHT = UINT64_C(2),
        WEATHER_RAINY = UINT64_C(4),
        WEATHER_CLOUDY = UINT64_C(8),
        WEATHER_SUNNY = UINT64_C(16),
        WEATHER_SNOWY = UINT64_C(32),
        SEASONAL_WINTER = UINT64_C(64),
        SEASONAL_SPRING = UINT64_C(128),
        SEASONAL_SUMMER = UINT64_C(256),
        SEASONAL_FALL = UINT64_C(512)
    };

    constexpr TextureConditionUsageType() noexcept :
            m_value(0)
    {}

    explicit TextureConditionUsageType(::zserio::BitStreamReader& in);
    TextureConditionUsageType(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr TextureConditionUsageType(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit TextureConditionUsageType(underlying_type value);

    ~TextureConditionUsageType() = default;

    TextureConditionUsageType(const TextureConditionUsageType&) = default;
    TextureConditionUsageType& operator=(const TextureConditionUsageType&) = default;

    TextureConditionUsageType(TextureConditionUsageType&&) = default;
    TextureConditionUsageType& operator=(TextureConditionUsageType&&) = default;

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

inline bool operator==(const TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline TextureConditionUsageType operator|(TextureConditionUsageType::Values lhs, TextureConditionUsageType::Values rhs)
{
    return TextureConditionUsageType(static_cast<TextureConditionUsageType::underlying_type>(lhs) | static_cast<TextureConditionUsageType::underlying_type>(rhs));
}

inline TextureConditionUsageType operator|(const TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    return TextureConditionUsageType(lhs.getValue() | rhs.getValue());
}

inline TextureConditionUsageType operator&(TextureConditionUsageType::Values lhs, TextureConditionUsageType::Values rhs)
{
    return TextureConditionUsageType(static_cast<TextureConditionUsageType::underlying_type>(lhs) & static_cast<TextureConditionUsageType::underlying_type>(rhs));
}

inline TextureConditionUsageType operator&(const TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    return TextureConditionUsageType(lhs.getValue() & rhs.getValue());
}

inline TextureConditionUsageType operator^(TextureConditionUsageType::Values lhs, TextureConditionUsageType::Values rhs)
{
    return TextureConditionUsageType(static_cast<TextureConditionUsageType::underlying_type>(lhs) ^ static_cast<TextureConditionUsageType::underlying_type>(rhs));
}

inline TextureConditionUsageType operator^(const TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    return TextureConditionUsageType(lhs.getValue() ^ rhs.getValue());
}

inline TextureConditionUsageType operator~(TextureConditionUsageType::Values lhs)
{
    return TextureConditionUsageType(~static_cast<TextureConditionUsageType::underlying_type>(lhs) & UINT64_C(144115188075855871));
}

inline TextureConditionUsageType operator~(const TextureConditionUsageType& lhs)
{
    return TextureConditionUsageType(~lhs.getValue() & UINT64_C(144115188075855871));
}

inline TextureConditionUsageType operator|=(TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    lhs = TextureConditionUsageType(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline TextureConditionUsageType operator&=(TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    lhs = TextureConditionUsageType(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline TextureConditionUsageType operator^=(TextureConditionUsageType& lhs, const TextureConditionUsageType& rhs)
{
    lhs = TextureConditionUsageType(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace types
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_TYPES_TEXTURE_CONDITION_USAGE_TYPE_H