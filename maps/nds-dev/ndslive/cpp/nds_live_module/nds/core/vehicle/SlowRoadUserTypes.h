/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_VEHICLE_SLOW_ROAD_USER_TYPES_H
#define NDS_CORE_VEHICLE_SLOW_ROAD_USER_TYPES_H

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
namespace core
{
namespace vehicle
{

class SlowRoadUserTypes
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        PEDESTRIAN = UINT32_C(1),
        PEDESTRIAN_WITH_HANDCART = UINT32_C(2),
        HORSE_DRIVEN_CARRIAGE = UINT32_C(4),
        BICYCLE = UINT32_C(8),
        SCOOTER = UINT32_C(16),
        MOTORIZED_RICKSHAW = UINT32_C(32),
        MOPED = UINT32_C(64),
        RIDER = UINT32_C(128),
        TRACTOR = UINT32_C(256)
    };

    constexpr SlowRoadUserTypes() noexcept :
            m_value(0)
    {}

    explicit SlowRoadUserTypes(::zserio::BitStreamReader& in);
    SlowRoadUserTypes(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr SlowRoadUserTypes(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit SlowRoadUserTypes(underlying_type value);

    ~SlowRoadUserTypes() = default;

    SlowRoadUserTypes(const SlowRoadUserTypes&) = default;
    SlowRoadUserTypes& operator=(const SlowRoadUserTypes&) = default;

    SlowRoadUserTypes(SlowRoadUserTypes&&) = default;
    SlowRoadUserTypes& operator=(SlowRoadUserTypes&&) = default;

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

inline bool operator==(const SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline SlowRoadUserTypes operator|(SlowRoadUserTypes::Values lhs, SlowRoadUserTypes::Values rhs)
{
    return SlowRoadUserTypes(static_cast<SlowRoadUserTypes::underlying_type>(lhs) | static_cast<SlowRoadUserTypes::underlying_type>(rhs));
}

inline SlowRoadUserTypes operator|(const SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    return SlowRoadUserTypes(lhs.getValue() | rhs.getValue());
}

inline SlowRoadUserTypes operator&(SlowRoadUserTypes::Values lhs, SlowRoadUserTypes::Values rhs)
{
    return SlowRoadUserTypes(static_cast<SlowRoadUserTypes::underlying_type>(lhs) & static_cast<SlowRoadUserTypes::underlying_type>(rhs));
}

inline SlowRoadUserTypes operator&(const SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    return SlowRoadUserTypes(lhs.getValue() & rhs.getValue());
}

inline SlowRoadUserTypes operator^(SlowRoadUserTypes::Values lhs, SlowRoadUserTypes::Values rhs)
{
    return SlowRoadUserTypes(static_cast<SlowRoadUserTypes::underlying_type>(lhs) ^ static_cast<SlowRoadUserTypes::underlying_type>(rhs));
}

inline SlowRoadUserTypes operator^(const SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    return SlowRoadUserTypes(lhs.getValue() ^ rhs.getValue());
}

inline SlowRoadUserTypes operator~(SlowRoadUserTypes::Values lhs)
{
    return SlowRoadUserTypes(~static_cast<SlowRoadUserTypes::underlying_type>(lhs) & UINT32_C(536870911));
}

inline SlowRoadUserTypes operator~(const SlowRoadUserTypes& lhs)
{
    return SlowRoadUserTypes(~lhs.getValue() & UINT32_C(536870911));
}

inline SlowRoadUserTypes operator|=(SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    lhs = SlowRoadUserTypes(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline SlowRoadUserTypes operator&=(SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    lhs = SlowRoadUserTypes(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline SlowRoadUserTypes operator^=(SlowRoadUserTypes& lhs, const SlowRoadUserTypes& rhs)
{
    lhs = SlowRoadUserTypes(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace vehicle
} // namespace core
} // namespace nds

#endif // NDS_CORE_VEHICLE_SLOW_ROAD_USER_TYPES_H
