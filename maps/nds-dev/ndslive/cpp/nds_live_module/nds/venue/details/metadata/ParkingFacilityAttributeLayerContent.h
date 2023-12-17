/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_METADATA_PARKING_FACILITY_ATTRIBUTE_LAYER_CONTENT_H
#define NDS_VENUE_DETAILS_METADATA_PARKING_FACILITY_ATTRIBUTE_LAYER_CONTENT_H

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
namespace venue
{
namespace details
{
namespace metadata
{

class ParkingFacilityAttributeLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        PARKING_FACILITY_MAPS = UINT32_C(1),
        PARKING_FACILITY_SETS = UINT32_C(2),
        PARKING_LEVEL_MAPS = UINT32_C(4),
        PARKING_LEVEL_SETS = UINT32_C(8),
        PARKING_SECTION_MAPS = UINT32_C(16),
        PARKING_SECTION_SETS = UINT32_C(32),
        PARKING_ROW_MAPS = UINT32_C(64),
        PARKING_ROW_SETS = UINT32_C(128),
        PARKING_SPOT_MAPS = UINT32_C(256),
        PARKING_SPOT_SETS = UINT32_C(512)
    };

    constexpr ParkingFacilityAttributeLayerContent() noexcept :
            m_value(0)
    {}

    explicit ParkingFacilityAttributeLayerContent(::zserio::BitStreamReader& in);
    ParkingFacilityAttributeLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr ParkingFacilityAttributeLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit ParkingFacilityAttributeLayerContent(underlying_type value);

    ~ParkingFacilityAttributeLayerContent() = default;

    ParkingFacilityAttributeLayerContent(const ParkingFacilityAttributeLayerContent&) = default;
    ParkingFacilityAttributeLayerContent& operator=(const ParkingFacilityAttributeLayerContent&) = default;

    ParkingFacilityAttributeLayerContent(ParkingFacilityAttributeLayerContent&&) = default;
    ParkingFacilityAttributeLayerContent& operator=(ParkingFacilityAttributeLayerContent&&) = default;

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

inline bool operator==(const ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline ParkingFacilityAttributeLayerContent operator|(ParkingFacilityAttributeLayerContent::Values lhs, ParkingFacilityAttributeLayerContent::Values rhs)
{
    return ParkingFacilityAttributeLayerContent(static_cast<ParkingFacilityAttributeLayerContent::underlying_type>(lhs) | static_cast<ParkingFacilityAttributeLayerContent::underlying_type>(rhs));
}

inline ParkingFacilityAttributeLayerContent operator|(const ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    return ParkingFacilityAttributeLayerContent(lhs.getValue() | rhs.getValue());
}

inline ParkingFacilityAttributeLayerContent operator&(ParkingFacilityAttributeLayerContent::Values lhs, ParkingFacilityAttributeLayerContent::Values rhs)
{
    return ParkingFacilityAttributeLayerContent(static_cast<ParkingFacilityAttributeLayerContent::underlying_type>(lhs) & static_cast<ParkingFacilityAttributeLayerContent::underlying_type>(rhs));
}

inline ParkingFacilityAttributeLayerContent operator&(const ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    return ParkingFacilityAttributeLayerContent(lhs.getValue() & rhs.getValue());
}

inline ParkingFacilityAttributeLayerContent operator^(ParkingFacilityAttributeLayerContent::Values lhs, ParkingFacilityAttributeLayerContent::Values rhs)
{
    return ParkingFacilityAttributeLayerContent(static_cast<ParkingFacilityAttributeLayerContent::underlying_type>(lhs) ^ static_cast<ParkingFacilityAttributeLayerContent::underlying_type>(rhs));
}

inline ParkingFacilityAttributeLayerContent operator^(const ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    return ParkingFacilityAttributeLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline ParkingFacilityAttributeLayerContent operator~(ParkingFacilityAttributeLayerContent::Values lhs)
{
    return ParkingFacilityAttributeLayerContent(~static_cast<ParkingFacilityAttributeLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline ParkingFacilityAttributeLayerContent operator~(const ParkingFacilityAttributeLayerContent& lhs)
{
    return ParkingFacilityAttributeLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline ParkingFacilityAttributeLayerContent operator|=(ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    lhs = ParkingFacilityAttributeLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline ParkingFacilityAttributeLayerContent operator&=(ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    lhs = ParkingFacilityAttributeLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline ParkingFacilityAttributeLayerContent operator^=(ParkingFacilityAttributeLayerContent& lhs, const ParkingFacilityAttributeLayerContent& rhs)
{
    lhs = ParkingFacilityAttributeLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_METADATA_PARKING_FACILITY_ATTRIBUTE_LAYER_CONTENT_H
