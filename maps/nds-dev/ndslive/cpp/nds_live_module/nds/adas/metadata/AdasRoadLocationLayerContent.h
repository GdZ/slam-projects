/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_METADATA_ADAS_ROAD_LOCATION_LAYER_CONTENT_H
#define NDS_ADAS_METADATA_ADAS_ROAD_LOCATION_LAYER_CONTENT_H

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
namespace adas
{
namespace metadata
{

class AdasRoadLocationLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        ROAD_LOCATION_MAPS = UINT32_C(1),
        ROAD_LOCATION_SETS = UINT32_C(2),
        ROAD_LOCATION_TRANSITION_MAPS = UINT32_C(4),
        ROAD_LOCATION_TRANSITION_SETS = UINT32_C(8)
    };

    constexpr AdasRoadLocationLayerContent() noexcept :
            m_value(0)
    {}

    explicit AdasRoadLocationLayerContent(::zserio::BitStreamReader& in);
    AdasRoadLocationLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr AdasRoadLocationLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit AdasRoadLocationLayerContent(underlying_type value);

    ~AdasRoadLocationLayerContent() = default;

    AdasRoadLocationLayerContent(const AdasRoadLocationLayerContent&) = default;
    AdasRoadLocationLayerContent& operator=(const AdasRoadLocationLayerContent&) = default;

    AdasRoadLocationLayerContent(AdasRoadLocationLayerContent&&) = default;
    AdasRoadLocationLayerContent& operator=(AdasRoadLocationLayerContent&&) = default;

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

inline bool operator==(const AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline AdasRoadLocationLayerContent operator|(AdasRoadLocationLayerContent::Values lhs, AdasRoadLocationLayerContent::Values rhs)
{
    return AdasRoadLocationLayerContent(static_cast<AdasRoadLocationLayerContent::underlying_type>(lhs) | static_cast<AdasRoadLocationLayerContent::underlying_type>(rhs));
}

inline AdasRoadLocationLayerContent operator|(const AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    return AdasRoadLocationLayerContent(lhs.getValue() | rhs.getValue());
}

inline AdasRoadLocationLayerContent operator&(AdasRoadLocationLayerContent::Values lhs, AdasRoadLocationLayerContent::Values rhs)
{
    return AdasRoadLocationLayerContent(static_cast<AdasRoadLocationLayerContent::underlying_type>(lhs) & static_cast<AdasRoadLocationLayerContent::underlying_type>(rhs));
}

inline AdasRoadLocationLayerContent operator&(const AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    return AdasRoadLocationLayerContent(lhs.getValue() & rhs.getValue());
}

inline AdasRoadLocationLayerContent operator^(AdasRoadLocationLayerContent::Values lhs, AdasRoadLocationLayerContent::Values rhs)
{
    return AdasRoadLocationLayerContent(static_cast<AdasRoadLocationLayerContent::underlying_type>(lhs) ^ static_cast<AdasRoadLocationLayerContent::underlying_type>(rhs));
}

inline AdasRoadLocationLayerContent operator^(const AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    return AdasRoadLocationLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline AdasRoadLocationLayerContent operator~(AdasRoadLocationLayerContent::Values lhs)
{
    return AdasRoadLocationLayerContent(~static_cast<AdasRoadLocationLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline AdasRoadLocationLayerContent operator~(const AdasRoadLocationLayerContent& lhs)
{
    return AdasRoadLocationLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline AdasRoadLocationLayerContent operator|=(AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    lhs = AdasRoadLocationLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline AdasRoadLocationLayerContent operator&=(AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    lhs = AdasRoadLocationLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline AdasRoadLocationLayerContent operator^=(AdasRoadLocationLayerContent& lhs, const AdasRoadLocationLayerContent& rhs)
{
    lhs = AdasRoadLocationLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_METADATA_ADAS_ROAD_LOCATION_LAYER_CONTENT_H