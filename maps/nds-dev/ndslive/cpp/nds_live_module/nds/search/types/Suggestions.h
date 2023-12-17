/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_SEARCH_TYPES_SUGGESTIONS_H
#define NDS_SEARCH_TYPES_SUGGESTIONS_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>
#include <zserio/Vector.h>

namespace nds
{
namespace search
{
namespace types
{

class Suggestions
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    Suggestions() noexcept :
            Suggestions(allocator_type())
    {}

    explicit Suggestions(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_suggestion = ::zserio::vector<::zserio::string<>>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_suggestion, Suggestions, allocator_type> = 0>
    explicit Suggestions(
            ZSERIO_T_suggestion&& suggestion_,
            const allocator_type& allocator = allocator_type()) :
            Suggestions(allocator)
    {
        m_suggestion_ = ZserioArrayType_suggestion(::std::forward<ZSERIO_T_suggestion>(suggestion_));
    }

    explicit Suggestions(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Suggestions() = default;

    Suggestions(const Suggestions&) = default;
    Suggestions& operator=(const Suggestions&) = default;

    Suggestions(Suggestions&&) = default;
    Suggestions& operator=(Suggestions&&) = default;

    Suggestions(::zserio::PropagateAllocatorT,
            const Suggestions& other, const allocator_type& allocator);

    const ::zserio::vector<::zserio::string<>>& getSuggestion() const;
    ::zserio::vector<::zserio::string<>>& getSuggestion();
    void setSuggestion(const ::zserio::vector<::zserio::string<>>& suggestion_);
    void setSuggestion(::zserio::vector<::zserio::string<>>&& suggestion_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const Suggestions& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_suggestion = ::zserio::Array<::zserio::vector<::zserio::string<>>, ::zserio::StringArrayTraits, ::zserio::ArrayType::AUTO>;

    ZserioArrayType_suggestion readSuggestion(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ZserioArrayType_suggestion m_suggestion_;
};

} // namespace types
} // namespace search
} // namespace nds

#endif // NDS_SEARCH_TYPES_SUGGESTIONS_H