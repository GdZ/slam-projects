/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_METADATA_DISPLAY2_DCONTENT_H
#define NDS_DISPLAY_METADATA_DISPLAY2_DCONTENT_H

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

class Display2DContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        POINTS = UINT32_C(1),
        LINES = UINT32_C(2),
        AREAS = UINT32_C(4),
        AREA_TYPE_RELATIONS = UINT32_C(8),
        LINE_TYPE_RELATIONS = UINT32_C(16),
        POINT_TYPE_RELATIONS = UINT32_C(32),
        SIMPLE_AREAS = UINT32_C(64),
        SIMPLE_AREA_SETS = UINT32_C(128)
    };

    constexpr Display2DContent() noexcept :
            m_value(0)
    {}

    explicit Display2DContent(::zserio::BitStreamReader& in);
    Display2DContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr Display2DContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit Display2DContent(underlying_type value);

    ~Display2DContent() = default;

    Display2DContent(const Display2DContent&) = default;
    Display2DContent& operator=(const Display2DContent&) = default;

    Display2DContent(Display2DContent&&) = default;
    Display2DContent& operator=(Display2DContent&&) = default;

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

inline bool operator==(const Display2DContent& lhs, const Display2DContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const Display2DContent& lhs, const Display2DContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline Display2DContent operator|(Display2DContent::Values lhs, Display2DContent::Values rhs)
{
    return Display2DContent(static_cast<Display2DContent::underlying_type>(lhs) | static_cast<Display2DContent::underlying_type>(rhs));
}

inline Display2DContent operator|(const Display2DContent& lhs, const Display2DContent& rhs)
{
    return Display2DContent(lhs.getValue() | rhs.getValue());
}

inline Display2DContent operator&(Display2DContent::Values lhs, Display2DContent::Values rhs)
{
    return Display2DContent(static_cast<Display2DContent::underlying_type>(lhs) & static_cast<Display2DContent::underlying_type>(rhs));
}

inline Display2DContent operator&(const Display2DContent& lhs, const Display2DContent& rhs)
{
    return Display2DContent(lhs.getValue() & rhs.getValue());
}

inline Display2DContent operator^(Display2DContent::Values lhs, Display2DContent::Values rhs)
{
    return Display2DContent(static_cast<Display2DContent::underlying_type>(lhs) ^ static_cast<Display2DContent::underlying_type>(rhs));
}

inline Display2DContent operator^(const Display2DContent& lhs, const Display2DContent& rhs)
{
    return Display2DContent(lhs.getValue() ^ rhs.getValue());
}

inline Display2DContent operator~(Display2DContent::Values lhs)
{
    return Display2DContent(~static_cast<Display2DContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline Display2DContent operator~(const Display2DContent& lhs)
{
    return Display2DContent(~lhs.getValue() & UINT32_C(536870911));
}

inline Display2DContent operator|=(Display2DContent& lhs, const Display2DContent& rhs)
{
    lhs = Display2DContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline Display2DContent operator&=(Display2DContent& lhs, const Display2DContent& rhs)
{
    lhs = Display2DContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline Display2DContent operator^=(Display2DContent& lhs, const Display2DContent& rhs)
{
    lhs = Display2DContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_METADATA_DISPLAY2_DCONTENT_H