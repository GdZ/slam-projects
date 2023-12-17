/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_SERVICES_SUPPORTED_FEATURE_H
#define NDS_SEARCH_SERVICES_SUPPORTED_FEATURE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/DeltaContext.h>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>

namespace nds
{
namespace search
{
namespace services
{

class SupportedFeature
{
public:
    using underlying_type = uint8_t;

    enum class Values : underlying_type
    {
        ADDRESS = UINT8_C(1),
        POI = UINT8_C(2),
        NVC = UINT8_C(4),
        SUGGESTIONS = UINT8_C(8)
    };

    constexpr SupportedFeature() noexcept :
            m_value(0)
    {}

    explicit SupportedFeature(::zserio::BitStreamReader& in);
    SupportedFeature(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr SupportedFeature(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    constexpr explicit SupportedFeature(underlying_type value) noexcept :
            m_value(value)
    {}

    ~SupportedFeature() = default;

    SupportedFeature(const SupportedFeature&) = default;
    SupportedFeature& operator=(const SupportedFeature&) = default;

    SupportedFeature(SupportedFeature&&) = default;
    SupportedFeature& operator=(SupportedFeature&&) = default;

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

inline bool operator==(const SupportedFeature& lhs, const SupportedFeature& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const SupportedFeature& lhs, const SupportedFeature& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline SupportedFeature operator|(SupportedFeature::Values lhs, SupportedFeature::Values rhs)
{
    return SupportedFeature(static_cast<SupportedFeature::underlying_type>(lhs) | static_cast<SupportedFeature::underlying_type>(rhs));
}

inline SupportedFeature operator|(const SupportedFeature& lhs, const SupportedFeature& rhs)
{
    return SupportedFeature(lhs.getValue() | rhs.getValue());
}

inline SupportedFeature operator&(SupportedFeature::Values lhs, SupportedFeature::Values rhs)
{
    return SupportedFeature(static_cast<SupportedFeature::underlying_type>(lhs) & static_cast<SupportedFeature::underlying_type>(rhs));
}

inline SupportedFeature operator&(const SupportedFeature& lhs, const SupportedFeature& rhs)
{
    return SupportedFeature(lhs.getValue() & rhs.getValue());
}

inline SupportedFeature operator^(SupportedFeature::Values lhs, SupportedFeature::Values rhs)
{
    return SupportedFeature(static_cast<SupportedFeature::underlying_type>(lhs) ^ static_cast<SupportedFeature::underlying_type>(rhs));
}

inline SupportedFeature operator^(const SupportedFeature& lhs, const SupportedFeature& rhs)
{
    return SupportedFeature(lhs.getValue() ^ rhs.getValue());
}

inline SupportedFeature operator~(SupportedFeature::Values lhs)
{
    return SupportedFeature(~static_cast<SupportedFeature::underlying_type>(lhs));
}

inline SupportedFeature operator~(const SupportedFeature& lhs)
{
    return SupportedFeature(~lhs.getValue());
}

inline SupportedFeature operator|=(SupportedFeature& lhs, const SupportedFeature& rhs)
{
    lhs = SupportedFeature(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline SupportedFeature operator&=(SupportedFeature& lhs, const SupportedFeature& rhs)
{
    lhs = SupportedFeature(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline SupportedFeature operator^=(SupportedFeature& lhs, const SupportedFeature& rhs)
{
    lhs = SupportedFeature(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace services
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_SERVICES_SUPPORTED_FEATURE_H