/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_LANGUAGE_LANGUAGE_NAME_H
#define NDS_CORE_LANGUAGE_LANGUAGE_NAME_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <zserio/DeltaContext.h>
#include <memory>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>

#include <nds/core/types/LanguageCode.h>

namespace nds
{
namespace core
{
namespace language
{

class LanguageName
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLanguageCode()
        {
            return m_languageCode_;
        }

    private:
        ::zserio::DeltaContext m_languageCode_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LanguageName() noexcept :
            LanguageName(allocator_type())
    {}

    explicit LanguageName(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_languageName = ::zserio::string<>>
    LanguageName(
            ::nds::core::types::LanguageCode languageCode_,
            ZSERIO_T_languageName&& languageName_,
            const allocator_type& allocator = allocator_type()) :
            LanguageName(allocator)
    {
        m_languageCode_ = languageCode_;
        m_languageName_ = ::std::forward<ZSERIO_T_languageName>(languageName_);
    }

    explicit LanguageName(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LanguageName(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LanguageName() = default;

    LanguageName(const LanguageName&) = default;
    LanguageName& operator=(const LanguageName&) = default;

    LanguageName(LanguageName&&) = default;
    LanguageName& operator=(LanguageName&&) = default;

    LanguageName(::zserio::PropagateAllocatorT,
            const LanguageName& other, const allocator_type& allocator);

    ::nds::core::types::LanguageCode getLanguageCode() const;
    void setLanguageCode(::nds::core::types::LanguageCode languageCode_);

    const ::zserio::string<>& getLanguageName() const;
    ::zserio::string<>& getLanguageName();
    void setLanguageName(const ::zserio::string<>& languageName_);
    void setLanguageName(::zserio::string<>&& languageName_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LanguageName& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::LanguageCode readLanguageCode(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readLanguageCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::string<> readLanguageName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::core::types::LanguageCode m_languageCode_;
    ::zserio::string<> m_languageName_;
};

} // namespace language
} // namespace core
} // namespace nds

#endif // NDS_CORE_LANGUAGE_LANGUAGE_NAME_H
