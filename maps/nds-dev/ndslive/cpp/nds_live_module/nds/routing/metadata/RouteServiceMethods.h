/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_METADATA_ROUTE_SERVICE_METHODS_H
#define NDS_ROUTING_METADATA_ROUTE_SERVICE_METHODS_H

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

class RouteServiceMethods
{
public:
    using underlying_type = uint16_t;

    enum class Values : underlying_type
    {
        GET_ROUTE = UINT16_C(1)
    };

    constexpr RouteServiceMethods() noexcept :
            m_value(0)
    {}

    explicit RouteServiceMethods(::zserio::BitStreamReader& in);
    RouteServiceMethods(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr RouteServiceMethods(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    constexpr explicit RouteServiceMethods(underlying_type value) noexcept :
            m_value(value)
    {}

    ~RouteServiceMethods() = default;

    RouteServiceMethods(const RouteServiceMethods&) = default;
    RouteServiceMethods& operator=(const RouteServiceMethods&) = default;

    RouteServiceMethods(RouteServiceMethods&&) = default;
    RouteServiceMethods& operator=(RouteServiceMethods&&) = default;

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

inline bool operator==(const RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline RouteServiceMethods operator|(RouteServiceMethods::Values lhs, RouteServiceMethods::Values rhs)
{
    return RouteServiceMethods(static_cast<RouteServiceMethods::underlying_type>(lhs) | static_cast<RouteServiceMethods::underlying_type>(rhs));
}

inline RouteServiceMethods operator|(const RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    return RouteServiceMethods(lhs.getValue() | rhs.getValue());
}

inline RouteServiceMethods operator&(RouteServiceMethods::Values lhs, RouteServiceMethods::Values rhs)
{
    return RouteServiceMethods(static_cast<RouteServiceMethods::underlying_type>(lhs) & static_cast<RouteServiceMethods::underlying_type>(rhs));
}

inline RouteServiceMethods operator&(const RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    return RouteServiceMethods(lhs.getValue() & rhs.getValue());
}

inline RouteServiceMethods operator^(RouteServiceMethods::Values lhs, RouteServiceMethods::Values rhs)
{
    return RouteServiceMethods(static_cast<RouteServiceMethods::underlying_type>(lhs) ^ static_cast<RouteServiceMethods::underlying_type>(rhs));
}

inline RouteServiceMethods operator^(const RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    return RouteServiceMethods(lhs.getValue() ^ rhs.getValue());
}

inline RouteServiceMethods operator~(RouteServiceMethods::Values lhs)
{
    return RouteServiceMethods(~static_cast<RouteServiceMethods::underlying_type>(lhs));
}

inline RouteServiceMethods operator~(const RouteServiceMethods& lhs)
{
    return RouteServiceMethods(~lhs.getValue());
}

inline RouteServiceMethods operator|=(RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    lhs = RouteServiceMethods(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline RouteServiceMethods operator&=(RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    lhs = RouteServiceMethods(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline RouteServiceMethods operator^=(RouteServiceMethods& lhs, const RouteServiceMethods& rhs)
{
    lhs = RouteServiceMethods(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_METADATA_ROUTE_SERVICE_METHODS_H
