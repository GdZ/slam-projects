/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_TYPES_NEXT_VALID_CHARACTER_LIST_H
#define NDS_SEARCH_TYPES_NEXT_VALID_CHARACTER_LIST_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <memory>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>

namespace nds
{
namespace search
{
namespace types
{

class NextValidCharacterList
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    NextValidCharacterList() noexcept :
            NextValidCharacterList(allocator_type())
    {}

    explicit NextValidCharacterList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_nvc = ::zserio::string<>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_nvc, NextValidCharacterList, allocator_type> = 0>
    explicit NextValidCharacterList(
            ZSERIO_T_nvc&& nvc_,
            const allocator_type& allocator = allocator_type()) :
            NextValidCharacterList(allocator)
    {
        m_nvc_ = ::std::forward<ZSERIO_T_nvc>(nvc_);
    }

    explicit NextValidCharacterList(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~NextValidCharacterList() = default;

    NextValidCharacterList(const NextValidCharacterList&) = default;
    NextValidCharacterList& operator=(const NextValidCharacterList&) = default;

    NextValidCharacterList(NextValidCharacterList&&) = default;
    NextValidCharacterList& operator=(NextValidCharacterList&&) = default;

    NextValidCharacterList(::zserio::PropagateAllocatorT,
            const NextValidCharacterList& other, const allocator_type& allocator);

    const ::zserio::string<>& getNvc() const;
    ::zserio::string<>& getNvc();
    void setNvc(const ::zserio::string<>& nvc_);
    void setNvc(::zserio::string<>&& nvc_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const NextValidCharacterList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    ::zserio::string<> readNvc(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::zserio::string<> m_nvc_;
};

} // namespace types
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_TYPES_NEXT_VALID_CHARACTER_LIST_H
