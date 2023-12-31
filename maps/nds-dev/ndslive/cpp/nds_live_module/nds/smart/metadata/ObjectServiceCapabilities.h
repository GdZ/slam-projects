/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SMART_METADATA_OBJECT_SERVICE_CAPABILITIES_H
#define NDS_SMART_METADATA_OBJECT_SERVICE_CAPABILITIES_H

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

class ObjectServiceCapabilities
{
public:
    using underlying_type = uint16_t;

    enum class Values : underlying_type
    {
        GET_OBJECT_BY_REFERENCE = UINT16_C(1),
        GET_OBJECTS_IN_TILE = UINT16_C(2),
        GET_HEADER_ONLY_BY_OBJECT_REFERENCE = UINT16_C(4),
        GET_HEADER_ONLY_LIST_IN_TILE = UINT16_C(8),
        GET_LOCATION_PATH_FOR_OBJECT_REFERENCE = UINT16_C(16),
        GET_LOCATION_ID_FOR_OBJECT_REFERENCE = UINT16_C(32),
        TOPIC_NDS_SMART_OBJECT_UPDATE = UINT16_C(64),
        GET_SINGLE_DATA_LAYER_BY_OBJECT_REFERENCE = UINT16_C(128)
    };

    constexpr ObjectServiceCapabilities() noexcept :
            m_value(0)
    {}

    explicit ObjectServiceCapabilities(::zserio::BitStreamReader& in);
    ObjectServiceCapabilities(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr ObjectServiceCapabilities(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    constexpr explicit ObjectServiceCapabilities(underlying_type value) noexcept :
            m_value(value)
    {}

    ~ObjectServiceCapabilities() = default;

    ObjectServiceCapabilities(const ObjectServiceCapabilities&) = default;
    ObjectServiceCapabilities& operator=(const ObjectServiceCapabilities&) = default;

    ObjectServiceCapabilities(ObjectServiceCapabilities&&) = default;
    ObjectServiceCapabilities& operator=(ObjectServiceCapabilities&&) = default;

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

inline bool operator==(const ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline ObjectServiceCapabilities operator|(ObjectServiceCapabilities::Values lhs, ObjectServiceCapabilities::Values rhs)
{
    return ObjectServiceCapabilities(static_cast<ObjectServiceCapabilities::underlying_type>(lhs) | static_cast<ObjectServiceCapabilities::underlying_type>(rhs));
}

inline ObjectServiceCapabilities operator|(const ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    return ObjectServiceCapabilities(lhs.getValue() | rhs.getValue());
}

inline ObjectServiceCapabilities operator&(ObjectServiceCapabilities::Values lhs, ObjectServiceCapabilities::Values rhs)
{
    return ObjectServiceCapabilities(static_cast<ObjectServiceCapabilities::underlying_type>(lhs) & static_cast<ObjectServiceCapabilities::underlying_type>(rhs));
}

inline ObjectServiceCapabilities operator&(const ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    return ObjectServiceCapabilities(lhs.getValue() & rhs.getValue());
}

inline ObjectServiceCapabilities operator^(ObjectServiceCapabilities::Values lhs, ObjectServiceCapabilities::Values rhs)
{
    return ObjectServiceCapabilities(static_cast<ObjectServiceCapabilities::underlying_type>(lhs) ^ static_cast<ObjectServiceCapabilities::underlying_type>(rhs));
}

inline ObjectServiceCapabilities operator^(const ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    return ObjectServiceCapabilities(lhs.getValue() ^ rhs.getValue());
}

inline ObjectServiceCapabilities operator~(ObjectServiceCapabilities::Values lhs)
{
    return ObjectServiceCapabilities(~static_cast<ObjectServiceCapabilities::underlying_type>(lhs));
}

inline ObjectServiceCapabilities operator~(const ObjectServiceCapabilities& lhs)
{
    return ObjectServiceCapabilities(~lhs.getValue());
}

inline ObjectServiceCapabilities operator|=(ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    lhs = ObjectServiceCapabilities(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline ObjectServiceCapabilities operator&=(ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    lhs = ObjectServiceCapabilities(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline ObjectServiceCapabilities operator^=(ObjectServiceCapabilities& lhs, const ObjectServiceCapabilities& rhs)
{
    lhs = ObjectServiceCapabilities(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace smart
} // namespace nds

#endif // NDS_SMART_METADATA_OBJECT_SERVICE_CAPABILITIES_H
