/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_LANGUAGE_LANGUAGE_MAPPING_H
#define NDS_CORE_LANGUAGE_LANGUAGE_MAPPING_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>
#include <zserio/Vector.h>

#include <nds/core/language/LanguageName.h>
#include <nds/core/types/LanguageCode.h>

namespace nds
{
namespace core
{
namespace language
{

class LanguageMapping
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLanguageCode()
        {
            return m_languageCode_;
        }

        ::zserio::DeltaContext& getIsTransliterationOf()
        {
            return m_isTransliterationOf_;
        }

        ::zserio::DeltaContext& getIsDiacriticTransliterationOf()
        {
            return m_isDiacriticTransliterationOf_;
        }

    private:
        ::zserio::DeltaContext m_languageCode_;
        ::zserio::DeltaContext m_isTransliterationOf_;
        ::zserio::DeltaContext m_isDiacriticTransliterationOf_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LanguageMapping() noexcept :
            LanguageMapping(allocator_type())
    {}

    explicit LanguageMapping(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_isoCountryCode = ::zserio::string<>,
            typename ZSERIO_T_isoLanguageCode = ::zserio::string<>,
            typename ZSERIO_T_isoScriptCode = ::zserio::string<>,
            typename ZSERIO_T_languageNames = ::zserio::vector<::nds::core::language::LanguageName>>
    LanguageMapping(
            ::nds::core::types::LanguageCode languageCode_,
            ZSERIO_T_isoCountryCode&& isoCountryCode_,
            ZSERIO_T_isoLanguageCode&& isoLanguageCode_,
            ZSERIO_T_isoScriptCode&& isoScriptCode_,
            ::nds::core::types::LanguageCode isTransliterationOf_,
            ::nds::core::types::LanguageCode isDiacriticTransliterationOf_,
            ZSERIO_T_languageNames&& languageNames_,
            const allocator_type& allocator = allocator_type()) :
            LanguageMapping(allocator)
    {
        m_languageCode_ = languageCode_;
        m_isoCountryCode_ = ::std::forward<ZSERIO_T_isoCountryCode>(isoCountryCode_);
        m_isoLanguageCode_ = ::std::forward<ZSERIO_T_isoLanguageCode>(isoLanguageCode_);
        m_isoScriptCode_ = ::std::forward<ZSERIO_T_isoScriptCode>(isoScriptCode_);
        m_isTransliterationOf_ = isTransliterationOf_;
        m_isDiacriticTransliterationOf_ = isDiacriticTransliterationOf_;
        m_languageNames_ = ZserioArrayType_languageNames(::std::forward<ZSERIO_T_languageNames>(languageNames_));
    }

    explicit LanguageMapping(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LanguageMapping(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LanguageMapping() = default;

    LanguageMapping(const LanguageMapping&) = default;
    LanguageMapping& operator=(const LanguageMapping&) = default;

    LanguageMapping(LanguageMapping&&) = default;
    LanguageMapping& operator=(LanguageMapping&&) = default;

    LanguageMapping(::zserio::PropagateAllocatorT,
            const LanguageMapping& other, const allocator_type& allocator);

    ::nds::core::types::LanguageCode getLanguageCode() const;
    void setLanguageCode(::nds::core::types::LanguageCode languageCode_);

    const ::zserio::string<>& getIsoCountryCode() const;
    ::zserio::string<>& getIsoCountryCode();
    void setIsoCountryCode(const ::zserio::string<>& isoCountryCode_);
    void setIsoCountryCode(::zserio::string<>&& isoCountryCode_);

    const ::zserio::string<>& getIsoLanguageCode() const;
    ::zserio::string<>& getIsoLanguageCode();
    void setIsoLanguageCode(const ::zserio::string<>& isoLanguageCode_);
    void setIsoLanguageCode(::zserio::string<>&& isoLanguageCode_);

    const ::zserio::string<>& getIsoScriptCode() const;
    ::zserio::string<>& getIsoScriptCode();
    void setIsoScriptCode(const ::zserio::string<>& isoScriptCode_);
    void setIsoScriptCode(::zserio::string<>&& isoScriptCode_);

    ::nds::core::types::LanguageCode getIsTransliterationOf() const;
    void setIsTransliterationOf(::nds::core::types::LanguageCode isTransliterationOf_);

    ::nds::core::types::LanguageCode getIsDiacriticTransliterationOf() const;
    void setIsDiacriticTransliterationOf(::nds::core::types::LanguageCode isDiacriticTransliterationOf_);

    const ::zserio::vector<::nds::core::language::LanguageName>& getLanguageNames() const;
    ::zserio::vector<::nds::core::language::LanguageName>& getLanguageNames();
    void setLanguageNames(const ::zserio::vector<::nds::core::language::LanguageName>& languageNames_);
    void setLanguageNames(::zserio::vector<::nds::core::language::LanguageName>&& languageNames_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LanguageMapping& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_languageNames
    {
    public:
        using OwnerType = LanguageMapping;

        static void create(LanguageMapping& owner,
                ::zserio::vector<::nds::core::language::LanguageName>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(LanguageMapping& owner,
                ::zserio::vector<::nds::core::language::LanguageName>& array,
                ::nds::core::language::LanguageName::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_languageNames = ::zserio::Array<::zserio::vector<::nds::core::language::LanguageName>, ::zserio::ObjectArrayTraits<::nds::core::language::LanguageName, ZserioElementFactory_languageNames>, ::zserio::ArrayType::AUTO>;

    ::nds::core::types::LanguageCode readLanguageCode(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readLanguageCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::string<> readIsoCountryCode(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::string<> readIsoLanguageCode(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::string<> readIsoScriptCode(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::LanguageCode readIsTransliterationOf(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readIsTransliterationOf(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readIsDiacriticTransliterationOf(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readIsDiacriticTransliterationOf(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_languageNames readLanguageNames(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_languageNames readLanguageNames(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::types::LanguageCode m_languageCode_;
    ::zserio::string<> m_isoCountryCode_;
    ::zserio::string<> m_isoLanguageCode_;
    ::zserio::string<> m_isoScriptCode_;
    ::nds::core::types::LanguageCode m_isTransliterationOf_;
    ::nds::core::types::LanguageCode m_isDiacriticTransliterationOf_;
    ZserioArrayType_languageNames m_languageNames_;
};

} // namespace language
} // namespace core
} // namespace nds

#endif // NDS_CORE_LANGUAGE_LANGUAGE_MAPPING_H
