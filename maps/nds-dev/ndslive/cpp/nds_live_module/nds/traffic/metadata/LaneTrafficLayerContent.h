/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_METADATA_LANE_TRAFFIC_LAYER_CONTENT_H
#define NDS_TRAFFIC_METADATA_LANE_TRAFFIC_LAYER_CONTENT_H

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
namespace traffic
{
namespace metadata
{

class LaneTrafficLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        LANE_RANGE_MAPS = UINT32_C(1),
        LANE_RANGE_SETS = UINT32_C(2)
    };

    constexpr LaneTrafficLayerContent() noexcept :
            m_value(0)
    {}

    explicit LaneTrafficLayerContent(::zserio::BitStreamReader& in);
    LaneTrafficLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr LaneTrafficLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit LaneTrafficLayerContent(underlying_type value);

    ~LaneTrafficLayerContent() = default;

    LaneTrafficLayerContent(const LaneTrafficLayerContent&) = default;
    LaneTrafficLayerContent& operator=(const LaneTrafficLayerContent&) = default;

    LaneTrafficLayerContent(LaneTrafficLayerContent&&) = default;
    LaneTrafficLayerContent& operator=(LaneTrafficLayerContent&&) = default;

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

inline bool operator==(const LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline LaneTrafficLayerContent operator|(LaneTrafficLayerContent::Values lhs, LaneTrafficLayerContent::Values rhs)
{
    return LaneTrafficLayerContent(static_cast<LaneTrafficLayerContent::underlying_type>(lhs) | static_cast<LaneTrafficLayerContent::underlying_type>(rhs));
}

inline LaneTrafficLayerContent operator|(const LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    return LaneTrafficLayerContent(lhs.getValue() | rhs.getValue());
}

inline LaneTrafficLayerContent operator&(LaneTrafficLayerContent::Values lhs, LaneTrafficLayerContent::Values rhs)
{
    return LaneTrafficLayerContent(static_cast<LaneTrafficLayerContent::underlying_type>(lhs) & static_cast<LaneTrafficLayerContent::underlying_type>(rhs));
}

inline LaneTrafficLayerContent operator&(const LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    return LaneTrafficLayerContent(lhs.getValue() & rhs.getValue());
}

inline LaneTrafficLayerContent operator^(LaneTrafficLayerContent::Values lhs, LaneTrafficLayerContent::Values rhs)
{
    return LaneTrafficLayerContent(static_cast<LaneTrafficLayerContent::underlying_type>(lhs) ^ static_cast<LaneTrafficLayerContent::underlying_type>(rhs));
}

inline LaneTrafficLayerContent operator^(const LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    return LaneTrafficLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline LaneTrafficLayerContent operator~(LaneTrafficLayerContent::Values lhs)
{
    return LaneTrafficLayerContent(~static_cast<LaneTrafficLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline LaneTrafficLayerContent operator~(const LaneTrafficLayerContent& lhs)
{
    return LaneTrafficLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline LaneTrafficLayerContent operator|=(LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    lhs = LaneTrafficLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline LaneTrafficLayerContent operator&=(LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    lhs = LaneTrafficLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline LaneTrafficLayerContent operator^=(LaneTrafficLayerContent& lhs, const LaneTrafficLayerContent& rhs)
{
    lhs = LaneTrafficLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_METADATA_LANE_TRAFFIC_LAYER_CONTENT_H
