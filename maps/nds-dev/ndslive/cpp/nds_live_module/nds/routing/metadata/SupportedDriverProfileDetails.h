/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_METADATA_SUPPORTED_DRIVER_PROFILE_DETAILS_H
#define NDS_ROUTING_METADATA_SUPPORTED_DRIVER_PROFILE_DETAILS_H

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
namespace routing
{
namespace metadata
{

class SupportedDriverProfileDetails
{
public:
    using underlying_type = uint16_t;

    enum class Values : underlying_type
    {
        DRIVER_AGGRESSIVENESS = UINT16_C(1),
        DISABLED_DRIVERS = UINT16_C(2)
    };

    constexpr SupportedDriverProfileDetails() noexcept :
            m_value(0)
    {}

    explicit SupportedDriverProfileDetails(::zserio::BitStreamReader& in);
    SupportedDriverProfileDetails(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr SupportedDriverProfileDetails(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    constexpr explicit SupportedDriverProfileDetails(underlying_type value) noexcept :
            m_value(value)
    {}

    ~SupportedDriverProfileDetails() = default;

    SupportedDriverProfileDetails(const SupportedDriverProfileDetails&) = default;
    SupportedDriverProfileDetails& operator=(const SupportedDriverProfileDetails&) = default;

    SupportedDriverProfileDetails(SupportedDriverProfileDetails&&) = default;
    SupportedDriverProfileDetails& operator=(SupportedDriverProfileDetails&&) = default;

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

inline bool operator==(const SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline SupportedDriverProfileDetails operator|(SupportedDriverProfileDetails::Values lhs, SupportedDriverProfileDetails::Values rhs)
{
    return SupportedDriverProfileDetails(static_cast<SupportedDriverProfileDetails::underlying_type>(lhs) | static_cast<SupportedDriverProfileDetails::underlying_type>(rhs));
}

inline SupportedDriverProfileDetails operator|(const SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    return SupportedDriverProfileDetails(lhs.getValue() | rhs.getValue());
}

inline SupportedDriverProfileDetails operator&(SupportedDriverProfileDetails::Values lhs, SupportedDriverProfileDetails::Values rhs)
{
    return SupportedDriverProfileDetails(static_cast<SupportedDriverProfileDetails::underlying_type>(lhs) & static_cast<SupportedDriverProfileDetails::underlying_type>(rhs));
}

inline SupportedDriverProfileDetails operator&(const SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    return SupportedDriverProfileDetails(lhs.getValue() & rhs.getValue());
}

inline SupportedDriverProfileDetails operator^(SupportedDriverProfileDetails::Values lhs, SupportedDriverProfileDetails::Values rhs)
{
    return SupportedDriverProfileDetails(static_cast<SupportedDriverProfileDetails::underlying_type>(lhs) ^ static_cast<SupportedDriverProfileDetails::underlying_type>(rhs));
}

inline SupportedDriverProfileDetails operator^(const SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    return SupportedDriverProfileDetails(lhs.getValue() ^ rhs.getValue());
}

inline SupportedDriverProfileDetails operator~(SupportedDriverProfileDetails::Values lhs)
{
    return SupportedDriverProfileDetails(~static_cast<SupportedDriverProfileDetails::underlying_type>(lhs));
}

inline SupportedDriverProfileDetails operator~(const SupportedDriverProfileDetails& lhs)
{
    return SupportedDriverProfileDetails(~lhs.getValue());
}

inline SupportedDriverProfileDetails operator|=(SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    lhs = SupportedDriverProfileDetails(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline SupportedDriverProfileDetails operator&=(SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    lhs = SupportedDriverProfileDetails(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline SupportedDriverProfileDetails operator^=(SupportedDriverProfileDetails& lhs, const SupportedDriverProfileDetails& rhs)
{
    lhs = SupportedDriverProfileDetails(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_METADATA_SUPPORTED_DRIVER_PROFILE_DETAILS_H
