/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_METADATA_ICON_LAYER_CONTENT_H
#define NDS_DISPLAY_METADATA_ICON_LAYER_CONTENT_H

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
namespace metadata
{

class IconLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        GENERIC_ICON_SETS = UINT32_C(1),
        REFERENCED_ICON_SETS = UINT32_C(2),
        TEMPLATE_ICON_SETS = UINT32_C(4)
    };

    constexpr IconLayerContent() noexcept :
            m_value(0)
    {}

    explicit IconLayerContent(::zserio::BitStreamReader& in);
    IconLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr IconLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit IconLayerContent(underlying_type value);

    ~IconLayerContent() = default;

    IconLayerContent(const IconLayerContent&) = default;
    IconLayerContent& operator=(const IconLayerContent&) = default;

    IconLayerContent(IconLayerContent&&) = default;
    IconLayerContent& operator=(IconLayerContent&&) = default;

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

inline bool operator==(const IconLayerContent& lhs, const IconLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const IconLayerContent& lhs, const IconLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline IconLayerContent operator|(IconLayerContent::Values lhs, IconLayerContent::Values rhs)
{
    return IconLayerContent(static_cast<IconLayerContent::underlying_type>(lhs) | static_cast<IconLayerContent::underlying_type>(rhs));
}

inline IconLayerContent operator|(const IconLayerContent& lhs, const IconLayerContent& rhs)
{
    return IconLayerContent(lhs.getValue() | rhs.getValue());
}

inline IconLayerContent operator&(IconLayerContent::Values lhs, IconLayerContent::Values rhs)
{
    return IconLayerContent(static_cast<IconLayerContent::underlying_type>(lhs) & static_cast<IconLayerContent::underlying_type>(rhs));
}

inline IconLayerContent operator&(const IconLayerContent& lhs, const IconLayerContent& rhs)
{
    return IconLayerContent(lhs.getValue() & rhs.getValue());
}

inline IconLayerContent operator^(IconLayerContent::Values lhs, IconLayerContent::Values rhs)
{
    return IconLayerContent(static_cast<IconLayerContent::underlying_type>(lhs) ^ static_cast<IconLayerContent::underlying_type>(rhs));
}

inline IconLayerContent operator^(const IconLayerContent& lhs, const IconLayerContent& rhs)
{
    return IconLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline IconLayerContent operator~(IconLayerContent::Values lhs)
{
    return IconLayerContent(~static_cast<IconLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline IconLayerContent operator~(const IconLayerContent& lhs)
{
    return IconLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline IconLayerContent operator|=(IconLayerContent& lhs, const IconLayerContent& rhs)
{
    lhs = IconLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline IconLayerContent operator&=(IconLayerContent& lhs, const IconLayerContent& rhs)
{
    lhs = IconLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline IconLayerContent operator^=(IconLayerContent& lhs, const IconLayerContent& rhs)
{
    lhs = IconLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_METADATA_ICON_LAYER_CONTENT_H
