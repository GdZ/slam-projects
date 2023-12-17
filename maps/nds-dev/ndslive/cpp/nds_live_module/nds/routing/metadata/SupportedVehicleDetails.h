/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_METADATA_SUPPORTED_VEHICLE_DETAILS_H
#define NDS_ROUTING_METADATA_SUPPORTED_VEHICLE_DETAILS_H

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

class SupportedVehicleDetails
{
public:
    using underlying_type = uint16_t;

    enum class Values : underlying_type
    {
        ENGINE_TYPE_ELECTRIC = UINT16_C(1),
        ENGINE_EURO_EMISSION_CLASS = UINT16_C(2),
        VEHICLE_TYPE_TRUCK = UINT16_C(4),
        VEHICLE_TYPE_PUBLIC_TRANSPORT = UINT16_C(8),
        VEHICLE_TYPE_PEDESTRIAN = UINT16_C(16),
        VEHICLE_TYPE_BICYCLE = UINT16_C(32)
    };

    constexpr SupportedVehicleDetails() noexcept :
            m_value(0)
    {}

    explicit SupportedVehicleDetails(::zserio::BitStreamReader& in);
    SupportedVehicleDetails(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr SupportedVehicleDetails(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    constexpr explicit SupportedVehicleDetails(underlying_type value) noexcept :
            m_value(value)
    {}

    ~SupportedVehicleDetails() = default;

    SupportedVehicleDetails(const SupportedVehicleDetails&) = default;
    SupportedVehicleDetails& operator=(const SupportedVehicleDetails&) = default;

    SupportedVehicleDetails(SupportedVehicleDetails&&) = default;
    SupportedVehicleDetails& operator=(SupportedVehicleDetails&&) = default;

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

inline bool operator==(const SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline SupportedVehicleDetails operator|(SupportedVehicleDetails::Values lhs, SupportedVehicleDetails::Values rhs)
{
    return SupportedVehicleDetails(static_cast<SupportedVehicleDetails::underlying_type>(lhs) | static_cast<SupportedVehicleDetails::underlying_type>(rhs));
}

inline SupportedVehicleDetails operator|(const SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    return SupportedVehicleDetails(lhs.getValue() | rhs.getValue());
}

inline SupportedVehicleDetails operator&(SupportedVehicleDetails::Values lhs, SupportedVehicleDetails::Values rhs)
{
    return SupportedVehicleDetails(static_cast<SupportedVehicleDetails::underlying_type>(lhs) & static_cast<SupportedVehicleDetails::underlying_type>(rhs));
}

inline SupportedVehicleDetails operator&(const SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    return SupportedVehicleDetails(lhs.getValue() & rhs.getValue());
}

inline SupportedVehicleDetails operator^(SupportedVehicleDetails::Values lhs, SupportedVehicleDetails::Values rhs)
{
    return SupportedVehicleDetails(static_cast<SupportedVehicleDetails::underlying_type>(lhs) ^ static_cast<SupportedVehicleDetails::underlying_type>(rhs));
}

inline SupportedVehicleDetails operator^(const SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    return SupportedVehicleDetails(lhs.getValue() ^ rhs.getValue());
}

inline SupportedVehicleDetails operator~(SupportedVehicleDetails::Values lhs)
{
    return SupportedVehicleDetails(~static_cast<SupportedVehicleDetails::underlying_type>(lhs));
}

inline SupportedVehicleDetails operator~(const SupportedVehicleDetails& lhs)
{
    return SupportedVehicleDetails(~lhs.getValue());
}

inline SupportedVehicleDetails operator|=(SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    lhs = SupportedVehicleDetails(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline SupportedVehicleDetails operator&=(SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    lhs = SupportedVehicleDetails(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline SupportedVehicleDetails operator^=(SupportedVehicleDetails& lhs, const SupportedVehicleDetails& rhs)
{
    lhs = SupportedVehicleDetails(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_METADATA_SUPPORTED_VEHICLE_DETAILS_H
