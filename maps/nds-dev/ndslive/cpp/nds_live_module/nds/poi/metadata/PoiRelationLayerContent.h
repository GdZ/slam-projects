/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_METADATA_POI_RELATION_LAYER_CONTENT_H
#define NDS_POI_METADATA_POI_RELATION_LAYER_CONTENT_H

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
namespace metadata
{

class PoiRelationLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        LANE_POSITION_MAPS = UINT32_C(1),
        LANE_INDIRECT_POSITION_MAPS = UINT32_C(2),
        ROAD_POSITION_MAPS = UINT32_C(4),
        ROAD_INDIRECT_POSITION_MAPS = UINT32_C(8),
        DISPLAY_AREA_MAPS = UINT32_C(16),
        ROAD_LOCATION_POSITION_MAPS = UINT32_C(32),
        DISPLAY_MESH_MAPS = UINT32_C(64)
    };

    constexpr PoiRelationLayerContent() noexcept :
            m_value(0)
    {}

    explicit PoiRelationLayerContent(::zserio::BitStreamReader& in);
    PoiRelationLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr PoiRelationLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit PoiRelationLayerContent(underlying_type value);

    ~PoiRelationLayerContent() = default;

    PoiRelationLayerContent(const PoiRelationLayerContent&) = default;
    PoiRelationLayerContent& operator=(const PoiRelationLayerContent&) = default;

    PoiRelationLayerContent(PoiRelationLayerContent&&) = default;
    PoiRelationLayerContent& operator=(PoiRelationLayerContent&&) = default;

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

inline bool operator==(const PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline PoiRelationLayerContent operator|(PoiRelationLayerContent::Values lhs, PoiRelationLayerContent::Values rhs)
{
    return PoiRelationLayerContent(static_cast<PoiRelationLayerContent::underlying_type>(lhs) | static_cast<PoiRelationLayerContent::underlying_type>(rhs));
}

inline PoiRelationLayerContent operator|(const PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    return PoiRelationLayerContent(lhs.getValue() | rhs.getValue());
}

inline PoiRelationLayerContent operator&(PoiRelationLayerContent::Values lhs, PoiRelationLayerContent::Values rhs)
{
    return PoiRelationLayerContent(static_cast<PoiRelationLayerContent::underlying_type>(lhs) & static_cast<PoiRelationLayerContent::underlying_type>(rhs));
}

inline PoiRelationLayerContent operator&(const PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    return PoiRelationLayerContent(lhs.getValue() & rhs.getValue());
}

inline PoiRelationLayerContent operator^(PoiRelationLayerContent::Values lhs, PoiRelationLayerContent::Values rhs)
{
    return PoiRelationLayerContent(static_cast<PoiRelationLayerContent::underlying_type>(lhs) ^ static_cast<PoiRelationLayerContent::underlying_type>(rhs));
}

inline PoiRelationLayerContent operator^(const PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    return PoiRelationLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline PoiRelationLayerContent operator~(PoiRelationLayerContent::Values lhs)
{
    return PoiRelationLayerContent(~static_cast<PoiRelationLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline PoiRelationLayerContent operator~(const PoiRelationLayerContent& lhs)
{
    return PoiRelationLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline PoiRelationLayerContent operator|=(PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    lhs = PoiRelationLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline PoiRelationLayerContent operator&=(PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    lhs = PoiRelationLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline PoiRelationLayerContent operator^=(PoiRelationLayerContent& lhs, const PoiRelationLayerContent& rhs)
{
    lhs = PoiRelationLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace poi
} // namespace nds

#endif // NDS_POI_METADATA_POI_RELATION_LAYER_CONTENT_H
