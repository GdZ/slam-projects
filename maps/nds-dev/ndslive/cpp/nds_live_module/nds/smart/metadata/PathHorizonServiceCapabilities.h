/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_METADATA_PATH_HORIZON_SERVICE_CAPABILITIES_H
#define NDS_SMART_METADATA_PATH_HORIZON_SERVICE_CAPABILITIES_H

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
namespace smart
{
namespace metadata
{

class PathHorizonServiceCapabilities
{
public:
    using underlying_type = uint16_t;

    enum class Values : underlying_type
    {
        GET_HORIZON_DATA_FOR_PATH = UINT16_C(1),
        GET_HORIZON_DATA_FOR_POSE = UINT16_C(2)
    };

    constexpr PathHorizonServiceCapabilities() noexcept :
            m_value(0)
    {}

    explicit PathHorizonServiceCapabilities(::zserio::BitStreamReader& in);
    PathHorizonServiceCapabilities(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr PathHorizonServiceCapabilities(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    constexpr explicit PathHorizonServiceCapabilities(underlying_type value) noexcept :
            m_value(value)
    {}

    ~PathHorizonServiceCapabilities() = default;

    PathHorizonServiceCapabilities(const PathHorizonServiceCapabilities&) = default;
    PathHorizonServiceCapabilities& operator=(const PathHorizonServiceCapabilities&) = default;

    PathHorizonServiceCapabilities(PathHorizonServiceCapabilities&&) = default;
    PathHorizonServiceCapabilities& operator=(PathHorizonServiceCapabilities&&) = default;

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

inline bool operator==(const PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline PathHorizonServiceCapabilities operator|(PathHorizonServiceCapabilities::Values lhs, PathHorizonServiceCapabilities::Values rhs)
{
    return PathHorizonServiceCapabilities(static_cast<PathHorizonServiceCapabilities::underlying_type>(lhs) | static_cast<PathHorizonServiceCapabilities::underlying_type>(rhs));
}

inline PathHorizonServiceCapabilities operator|(const PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    return PathHorizonServiceCapabilities(lhs.getValue() | rhs.getValue());
}

inline PathHorizonServiceCapabilities operator&(PathHorizonServiceCapabilities::Values lhs, PathHorizonServiceCapabilities::Values rhs)
{
    return PathHorizonServiceCapabilities(static_cast<PathHorizonServiceCapabilities::underlying_type>(lhs) & static_cast<PathHorizonServiceCapabilities::underlying_type>(rhs));
}

inline PathHorizonServiceCapabilities operator&(const PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    return PathHorizonServiceCapabilities(lhs.getValue() & rhs.getValue());
}

inline PathHorizonServiceCapabilities operator^(PathHorizonServiceCapabilities::Values lhs, PathHorizonServiceCapabilities::Values rhs)
{
    return PathHorizonServiceCapabilities(static_cast<PathHorizonServiceCapabilities::underlying_type>(lhs) ^ static_cast<PathHorizonServiceCapabilities::underlying_type>(rhs));
}

inline PathHorizonServiceCapabilities operator^(const PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    return PathHorizonServiceCapabilities(lhs.getValue() ^ rhs.getValue());
}

inline PathHorizonServiceCapabilities operator~(PathHorizonServiceCapabilities::Values lhs)
{
    return PathHorizonServiceCapabilities(~static_cast<PathHorizonServiceCapabilities::underlying_type>(lhs));
}

inline PathHorizonServiceCapabilities operator~(const PathHorizonServiceCapabilities& lhs)
{
    return PathHorizonServiceCapabilities(~lhs.getValue());
}

inline PathHorizonServiceCapabilities operator|=(PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    lhs = PathHorizonServiceCapabilities(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline PathHorizonServiceCapabilities operator&=(PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    lhs = PathHorizonServiceCapabilities(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline PathHorizonServiceCapabilities operator^=(PathHorizonServiceCapabilities& lhs, const PathHorizonServiceCapabilities& rhs)
{
    lhs = PathHorizonServiceCapabilities(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace smart
} // namespace nds

#endif // NDS_SMART_METADATA_PATH_HORIZON_SERVICE_CAPABILITIES_H
