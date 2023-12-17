/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_METADATA_INSTRUCTIONS_IMAGE_LAYER_CONTENT_H
#define NDS_INSTRUCTIONS_METADATA_INSTRUCTIONS_IMAGE_LAYER_CONTENT_H

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
namespace instructions
{
namespace metadata
{

class InstructionsImageLayerContent
{
public:
    using underlying_type = uint32_t;

    enum class Values : underlying_type
    {
        SIGNPOSTS = UINT32_C(1),
        JUNCTION_VIEW = UINT32_C(2)
    };

    constexpr InstructionsImageLayerContent() noexcept :
            m_value(0)
    {}

    explicit InstructionsImageLayerContent(::zserio::BitStreamReader& in);
    InstructionsImageLayerContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr InstructionsImageLayerContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit InstructionsImageLayerContent(underlying_type value);

    ~InstructionsImageLayerContent() = default;

    InstructionsImageLayerContent(const InstructionsImageLayerContent&) = default;
    InstructionsImageLayerContent& operator=(const InstructionsImageLayerContent&) = default;

    InstructionsImageLayerContent(InstructionsImageLayerContent&&) = default;
    InstructionsImageLayerContent& operator=(InstructionsImageLayerContent&&) = default;

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

inline bool operator==(const InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline InstructionsImageLayerContent operator|(InstructionsImageLayerContent::Values lhs, InstructionsImageLayerContent::Values rhs)
{
    return InstructionsImageLayerContent(static_cast<InstructionsImageLayerContent::underlying_type>(lhs) | static_cast<InstructionsImageLayerContent::underlying_type>(rhs));
}

inline InstructionsImageLayerContent operator|(const InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    return InstructionsImageLayerContent(lhs.getValue() | rhs.getValue());
}

inline InstructionsImageLayerContent operator&(InstructionsImageLayerContent::Values lhs, InstructionsImageLayerContent::Values rhs)
{
    return InstructionsImageLayerContent(static_cast<InstructionsImageLayerContent::underlying_type>(lhs) & static_cast<InstructionsImageLayerContent::underlying_type>(rhs));
}

inline InstructionsImageLayerContent operator&(const InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    return InstructionsImageLayerContent(lhs.getValue() & rhs.getValue());
}

inline InstructionsImageLayerContent operator^(InstructionsImageLayerContent::Values lhs, InstructionsImageLayerContent::Values rhs)
{
    return InstructionsImageLayerContent(static_cast<InstructionsImageLayerContent::underlying_type>(lhs) ^ static_cast<InstructionsImageLayerContent::underlying_type>(rhs));
}

inline InstructionsImageLayerContent operator^(const InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    return InstructionsImageLayerContent(lhs.getValue() ^ rhs.getValue());
}

inline InstructionsImageLayerContent operator~(InstructionsImageLayerContent::Values lhs)
{
    return InstructionsImageLayerContent(~static_cast<InstructionsImageLayerContent::underlying_type>(lhs) & UINT32_C(536870911));
}

inline InstructionsImageLayerContent operator~(const InstructionsImageLayerContent& lhs)
{
    return InstructionsImageLayerContent(~lhs.getValue() & UINT32_C(536870911));
}

inline InstructionsImageLayerContent operator|=(InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    lhs = InstructionsImageLayerContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline InstructionsImageLayerContent operator&=(InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    lhs = InstructionsImageLayerContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline InstructionsImageLayerContent operator^=(InstructionsImageLayerContent& lhs, const InstructionsImageLayerContent& rhs)
{
    lhs = InstructionsImageLayerContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_METADATA_INSTRUCTIONS_IMAGE_LAYER_CONTENT_H
