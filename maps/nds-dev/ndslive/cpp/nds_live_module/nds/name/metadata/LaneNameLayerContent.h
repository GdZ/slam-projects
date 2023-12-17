/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_METADATA_LANE_NAME_LAYER_CONTENT_H
#define NDS_NAME_METADATA_LANE_NAME_LAYER_CONTENT_H

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
namespace name
{
namespace metadata
{

class LaneNameLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        LANE_RANGE_MAPS = UINT32_C(1),
        LANE_RANGE_SETS = UINT32_C(2),
        LANE_POSITION_MAPS = UINT32_C(4),
        LANE_POSITION_SETS = UINT32_C(8),
        ADMIN_HIERARCHY = UINT32_C(16),
        ADDRESS_FORMAT = UINT32_C(32)
    };

    constexpr LaneNameLayerContent() noexcept :
            m_value(0)
    {}

    explicit LaneNameLayerContent(::zserio::BitStreamReader& in);
    LaneNameLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr LaneNameLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit LaneNameLayerContent(underlying_type value);

    ~LaneNameLayerContent() = default;

    LaneNameLayerContent(const LaneNameLayerContent&) = default;
    LaneNameLayerContent& operator=(const LaneNameLayerContent&) = default;

    LaneNameLayerContent(LaneNameLayerContent&&) = default;
    LaneNameLayerContent& operator=(LaneNameLayerContent&&) = default;

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

inline bool operator==(const LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline LaneNameLayerContent operator|(LaneNameLayerContent::Values lhs, LaneNameLayerContent::Values rhs)
{
    return LaneNameLayerContent(static_cast<LaneNameLayerContent::underlying_type>(lhs) | static_cast<LaneNameLayerContent::underlying_type>(rhs));
}

inline LaneNameLayerContent operator|(const LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    return LaneNameLayerContent(lhs.getValue() | rhs.getValue());
}

inline LaneNameLayerContent operator&(LaneNameLayerContent::Values lhs, LaneNameLayerContent::Values rhs)
{
    return LaneNameLayerContent(static_cast<LaneNameLayerContent::underlying_type>(lhs) & static_cast<LaneNameLayerContent::underlying_type>(rhs));
}

inline LaneNameLayerContent operator&(const LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    return LaneNameLayerContent(lhs.getValue() & rhs.getValue());
}

inline LaneNameLayerContent operator^(LaneNameLayerContent::Values lhs, LaneNameLayerContent::Values rhs)
{
    return LaneNameLayerContent(static_cast<LaneNameLayerContent::underlying_type>(lhs) ^ static_cast<LaneNameLayerContent::underlying_type>(rhs));
}

inline LaneNameLayerContent operator^(const LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    return LaneNameLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline LaneNameLayerContent operator~(LaneNameLayerContent::Values lhs)
{
    return LaneNameLayerContent(~static_cast<LaneNameLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline LaneNameLayerContent operator~(const LaneNameLayerContent& lhs)
{
    return LaneNameLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline LaneNameLayerContent operator|=(LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    lhs = LaneNameLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline LaneNameLayerContent operator&=(LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    lhs = LaneNameLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline LaneNameLayerContent operator^=(LaneNameLayerContent& lhs, const LaneNameLayerContent& rhs)
{
    lhs = LaneNameLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace name
} // namespace nds

#endif // NDS_NAME_METADATA_LANE_NAME_LAYER_CONTENT_H
