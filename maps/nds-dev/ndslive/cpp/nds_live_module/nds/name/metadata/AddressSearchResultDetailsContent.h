/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_METADATA_ADDRESS_SEARCH_RESULT_DETAILS_CONTENT_H
#define NDS_NAME_METADATA_ADDRESS_SEARCH_RESULT_DETAILS_CONTENT_H

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

class AddressSearchResultDetailsContent
{
public:
    using underlying_type = uint16_t;

    enum class Values : underlying_type
    {
        ATTRIBUTES = UINT16_C(1),
        ADMINISTRATIVE_HIERARCHY = UINT16_C(2),
        ADDRESS_FORMAT_ID = UINT16_C(4)
    };

    constexpr AddressSearchResultDetailsContent() noexcept :
            m_value(0)
    {}

    explicit AddressSearchResultDetailsContent(::zserio::BitStreamReader& in);
    AddressSearchResultDetailsContent(::zserio::DeltaContext& context, ::zserio::BitStreamReader& in);
    constexpr AddressSearchResultDetailsContent(Values value) noexcept :
            m_value(static_cast<underlying_type>(value))
    {}

    explicit AddressSearchResultDetailsContent(underlying_type value);

    ~AddressSearchResultDetailsContent() = default;

    AddressSearchResultDetailsContent(const AddressSearchResultDetailsContent&) = default;
    AddressSearchResultDetailsContent& operator=(const AddressSearchResultDetailsContent&) = default;

    AddressSearchResultDetailsContent(AddressSearchResultDetailsContent&&) = default;
    AddressSearchResultDetailsContent& operator=(AddressSearchResultDetailsContent&&) = default;

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

inline bool operator==(const AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    return lhs.getValue() == rhs.getValue();
}

inline bool operator!=(const AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    return lhs.getValue() != rhs.getValue();
}

inline AddressSearchResultDetailsContent operator|(AddressSearchResultDetailsContent::Values lhs, AddressSearchResultDetailsContent::Values rhs)
{
    return AddressSearchResultDetailsContent(static_cast<AddressSearchResultDetailsContent::underlying_type>(lhs) | static_cast<AddressSearchResultDetailsContent::underlying_type>(rhs));
}

inline AddressSearchResultDetailsContent operator|(const AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    return AddressSearchResultDetailsContent(lhs.getValue() | rhs.getValue());
}

inline AddressSearchResultDetailsContent operator&(AddressSearchResultDetailsContent::Values lhs, AddressSearchResultDetailsContent::Values rhs)
{
    return AddressSearchResultDetailsContent(static_cast<AddressSearchResultDetailsContent::underlying_type>(lhs) & static_cast<AddressSearchResultDetailsContent::underlying_type>(rhs));
}

inline AddressSearchResultDetailsContent operator&(const AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    return AddressSearchResultDetailsContent(lhs.getValue() & rhs.getValue());
}

inline AddressSearchResultDetailsContent operator^(AddressSearchResultDetailsContent::Values lhs, AddressSearchResultDetailsContent::Values rhs)
{
    return AddressSearchResultDetailsContent(static_cast<AddressSearchResultDetailsContent::underlying_type>(lhs) ^ static_cast<AddressSearchResultDetailsContent::underlying_type>(rhs));
}

inline AddressSearchResultDetailsContent operator^(const AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    return AddressSearchResultDetailsContent(lhs.getValue() ^ rhs.getValue());
}

inline AddressSearchResultDetailsContent operator~(AddressSearchResultDetailsContent::Values lhs)
{
    return AddressSearchResultDetailsContent(~static_cast<AddressSearchResultDetailsContent::underlying_type>(lhs) & UINT16_C(32767));
}

inline AddressSearchResultDetailsContent operator~(const AddressSearchResultDetailsContent& lhs)
{
    return AddressSearchResultDetailsContent(~lhs.getValue() & UINT16_C(32767));
}

inline AddressSearchResultDetailsContent operator|=(AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    lhs = AddressSearchResultDetailsContent(lhs.getValue() | rhs.getValue());
    return lhs;
}

inline AddressSearchResultDetailsContent operator&=(AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    lhs = AddressSearchResultDetailsContent(lhs.getValue() & rhs.getValue());
    return lhs;
}

inline AddressSearchResultDetailsContent operator^=(AddressSearchResultDetailsContent& lhs, const AddressSearchResultDetailsContent& rhs)
{
    lhs = AddressSearchResultDetailsContent(lhs.getValue() ^ rhs.getValue());
    return lhs;
}

} // namespace metadata
} // namespace name
} // namespace nds

#endif // NDS_NAME_METADATA_ADDRESS_SEARCH_RESULT_DETAILS_CONTENT_H
