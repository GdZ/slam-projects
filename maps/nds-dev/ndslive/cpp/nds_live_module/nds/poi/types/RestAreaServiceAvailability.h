/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_TYPES_REST_AREA_SERVICE_AVAILABILITY_H
#define NDS_POI_TYPES_REST_AREA_SERVICE_AVAILABILITY_H

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
namespace poi
{
namespace types
{

class RestAreaServiceAvailability
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        REST_ROOM = UINT32_C(1),
        PARKING = UINT32_C(2),
        MOTORWAY_SERVICE = UINT32_C(4),
        OTHER_SERVICE = UINT32_C(8)
    };

    constexpr RestAreaServiceAvailability() noexcept :
            m_value(0)
    {}

    explicit RestAreaServiceAvailability(::zserio::BitStreamReader& in);
    RestAreaServiceAvailability(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr RestAreaServiceAvailability(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit RestAreaServiceAvailability(underlying_type value);

    ~RestAreaServiceAvailability() = default;

    RestAreaServiceAvailability(const RestAreaServiceAvailability&) = default;
    RestAreaServiceAvailability& operator=(const RestAreaServiceAvailability&) = default;

    RestAreaServiceAvailability(RestAreaServiceAvailability&&) = default;
    RestAreaServiceAvailability& operator=(RestAreaServiceAvailability&&) = default;

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

inline bool operator==(const RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline RestAreaServiceAvailability operator|(RestAreaServiceAvailability::Values lhs, RestAreaServiceAvailability::Values rhs)
{
    return RestAreaServiceAvailability(static_cast<RestAreaServiceAvailability::underlying_type>(lhs) | static_cast<RestAreaServiceAvailability::underlying_type>(rhs));
}

inline RestAreaServiceAvailability operator|(const RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    return RestAreaServiceAvailability(lhs.getValue() | rhs.getValue());
}

inline RestAreaServiceAvailability operator&(RestAreaServiceAvailability::Values lhs, RestAreaServiceAvailability::Values rhs)
{
    return RestAreaServiceAvailability(static_cast<RestAreaServiceAvailability::underlying_type>(lhs) & static_cast<RestAreaServiceAvailability::underlying_type>(rhs));
}

inline RestAreaServiceAvailability operator&(const RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    return RestAreaServiceAvailability(lhs.getValue() & rhs.getValue());
}

inline RestAreaServiceAvailability operator^(RestAreaServiceAvailability::Values lhs, RestAreaServiceAvailability::Values rhs)
{
    return RestAreaServiceAvailability(static_cast<RestAreaServiceAvailability::underlying_type>(lhs) ^ static_cast<RestAreaServiceAvailability::underlying_type>(rhs));
}

inline RestAreaServiceAvailability operator^(const RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    return RestAreaServiceAvailability(lhs.getValue() ^ rhs.getValue());
}

inline RestAreaServiceAvailability operator~(RestAreaServiceAvailability::Values lhs)
{
    return RestAreaServiceAvailability(~static_cast<RestAreaServiceAvailability::underlying_type>(lhs) & UINT32_C(536870911));
}

inline RestAreaServiceAvailability operator~(const RestAreaServiceAvailability& lhs)
{
    return RestAreaServiceAvailability(~lhs.getValue() & UINT32_C(536870911));
}

inline RestAreaServiceAvailability operator|=(RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    lhs = RestAreaServiceAvailability(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline RestAreaServiceAvailability operator&=(RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    lhs = RestAreaServiceAvailability(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline RestAreaServiceAvailability operator^=(RestAreaServiceAvailability& lhs, const RestAreaServiceAvailability& rhs)
{
    lhs = RestAreaServiceAvailability(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace types
} // namespace poi
} // namespace nds

#endif // NDS_POI_TYPES_REST_AREA_SERVICE_AVAILABILITY_H
