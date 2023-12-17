/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_METADATA_DISPLAY_ATTRIBUTE_LAYER_CONTENT_H
#define NDS_DISPLAY_DETAILS_METADATA_DISPLAY_ATTRIBUTE_LAYER_CONTENT_H

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
namespace display
{
namespace details
{
namespace metadata
{

class DisplayAttributeLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        DISPLAY_AREA_MAPS = UINT32_C(1),
        DISPLAY_AREA_SETS = UINT32_C(2),
        DISPLAY_LINE_MAPS = UINT32_C(4),
        DISPLAY_LINE_SETS = UINT32_C(8),
        DISPLAY_POINT_MAPS = UINT32_C(16),
        DISPLAY_POINT_SETS = UINT32_C(32)
    };

    constexpr DisplayAttributeLayerContent() noexcept :
            m_value(0)
    {}

    explicit DisplayAttributeLayerContent(::zserio::BitStreamReader& in);
    DisplayAttributeLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr DisplayAttributeLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit DisplayAttributeLayerContent(underlying_type value);

    ~DisplayAttributeLayerContent() = default;

    DisplayAttributeLayerContent(const DisplayAttributeLayerContent&) = default;
    DisplayAttributeLayerContent& operator=(const DisplayAttributeLayerContent&) = default;

    DisplayAttributeLayerContent(DisplayAttributeLayerContent&&) = default;
    DisplayAttributeLayerContent& operator=(DisplayAttributeLayerContent&&) = default;

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

inline bool operator==(const DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline DisplayAttributeLayerContent operator|(DisplayAttributeLayerContent::Values lhs, DisplayAttributeLayerContent::Values rhs)
{
    return DisplayAttributeLayerContent(static_cast<DisplayAttributeLayerContent::underlying_type>(lhs) | static_cast<DisplayAttributeLayerContent::underlying_type>(rhs));
}

inline DisplayAttributeLayerContent operator|(const DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    return DisplayAttributeLayerContent(lhs.getValue() | rhs.getValue());
}

inline DisplayAttributeLayerContent operator&(DisplayAttributeLayerContent::Values lhs, DisplayAttributeLayerContent::Values rhs)
{
    return DisplayAttributeLayerContent(static_cast<DisplayAttributeLayerContent::underlying_type>(lhs) & static_cast<DisplayAttributeLayerContent::underlying_type>(rhs));
}

inline DisplayAttributeLayerContent operator&(const DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    return DisplayAttributeLayerContent(lhs.getValue() & rhs.getValue());
}

inline DisplayAttributeLayerContent operator^(DisplayAttributeLayerContent::Values lhs, DisplayAttributeLayerContent::Values rhs)
{
    return DisplayAttributeLayerContent(static_cast<DisplayAttributeLayerContent::underlying_type>(lhs) ^ static_cast<DisplayAttributeLayerContent::underlying_type>(rhs));
}

inline DisplayAttributeLayerContent operator^(const DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    return DisplayAttributeLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline DisplayAttributeLayerContent operator~(DisplayAttributeLayerContent::Values lhs)
{
    return DisplayAttributeLayerContent(~static_cast<DisplayAttributeLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline DisplayAttributeLayerContent operator~(const DisplayAttributeLayerContent& lhs)
{
    return DisplayAttributeLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline DisplayAttributeLayerContent operator|=(DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    lhs = DisplayAttributeLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline DisplayAttributeLayerContent operator&=(DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    lhs = DisplayAttributeLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline DisplayAttributeLayerContent operator^=(DisplayAttributeLayerContent& lhs, const DisplayAttributeLayerContent& rhs)
{
    lhs = DisplayAttributeLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace details
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_DETAILS_METADATA_DISPLAY_ATTRIBUTE_LAYER_CONTENT_H
