/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_GUIDANCE_GUIDANCE_NAME_STRING_H
#define NDS_ROUTING_GUIDANCE_GUIDANCE_NAME_STRING_H

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
#include <zserio/OptionalHolder.h>
#include <zserio/ArrayTraits.h>
#include <zserio/String.h>
#include <zserio/Types.h>

#include <nds/core/speech/PhoneticTranscriptionList.h>
#include <nds/core/types/LanguageCode.h>
#include <nds/routing/guidance/GuidanceNameStringRelationList.h>

namespace nds
{
namespace routing
{
namespace guidance
{

class GuidanceNameString
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLanguage()
        {
            return m_language_;
        }

        ::nds::routing::guidance::GuidanceNameStringRelationList::ZserioPackingContext& getRelations()
        {
            return m_relations_;
        }

        ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext& getPhoneticTranscriptions()
        {
            return m_phoneticTranscriptions_;
        }

    private:
        ::zserio::DeltaContext m_language_;
        ::nds::routing::guidance::GuidanceNameStringRelationList::ZserioPackingContext m_relations_;
        ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext m_phoneticTranscriptions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    GuidanceNameString() noexcept :
            GuidanceNameString(allocator_type())
    {}

    explicit GuidanceNameString(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_name = ::zserio::string<>,
            typename ZSERIO_T_relations = ::nds::routing::guidance::GuidanceNameStringRelationList,
            typename ZSERIO_T_phoneticTranscriptions = ::nds::core::speech::PhoneticTranscriptionList>
    GuidanceNameString(
            ::nds::core::types::LanguageCode language_,
            ZSERIO_T_name&& name_,
            ZSERIO_T_relations&& relations_,
            ZSERIO_T_phoneticTranscriptions&& phoneticTranscriptions_,
            const allocator_type& allocator = allocator_type()) :
            GuidanceNameString(allocator)
    {
        m_language_ = language_;
        m_name_ = ::std::forward<ZSERIO_T_name>(name_);
        m_relations_ = ::std::forward<ZSERIO_T_relations>(relations_);
        m_phoneticTranscriptions_ = ::std::forward<ZSERIO_T_phoneticTranscriptions>(phoneticTranscriptions_);
    }

    explicit GuidanceNameString(::zserio::BitStreamReader& in,
            uint8_t numNames_, const allocator_type& allocator = allocator_type());
    explicit GuidanceNameString(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            uint8_t numNames_, const allocator_type& allocator = allocator_type());

    ~GuidanceNameString() = default;

    GuidanceNameString(const GuidanceNameString& other);
    GuidanceNameString& operator=(const GuidanceNameString& other);

    GuidanceNameString(GuidanceNameString&& other);
    GuidanceNameString& operator=(GuidanceNameString&& other);

    GuidanceNameString(::zserio::PropagateAllocatorT,
            const GuidanceNameString& other, const allocator_type& allocator);

    void initialize(
            uint8_t numNames_);
    bool isInitialized() const;
    void initializeChildren();

    uint8_t getNumNames() const;

    ::nds::core::types::LanguageCode getLanguage() const;
    void setLanguage(::nds::core::types::LanguageCode language_);

    const ::zserio::string<>& getName() const;
    ::zserio::string<>& getName();
    void setName(const ::zserio::string<>& name_);
    void setName(::zserio::string<>&& name_);

    const ::nds::routing::guidance::GuidanceNameStringRelationList& getRelations() const;
    ::nds::routing::guidance::GuidanceNameStringRelationList& getRelations();
    void setRelations(const ::nds::routing::guidance::GuidanceNameStringRelationList& relations_);
    void setRelations(::nds::routing::guidance::GuidanceNameStringRelationList&& relations_);
    bool isRelationsUsed() const;
    bool isRelationsSet() const;
    void resetRelations();

    const ::nds::core::speech::PhoneticTranscriptionList& getPhoneticTranscriptions() const;
    ::nds::core::speech::PhoneticTranscriptionList& getPhoneticTranscriptions();
    void setPhoneticTranscriptions(const ::nds::core::speech::PhoneticTranscriptionList& phoneticTranscriptions_);
    void setPhoneticTranscriptions(::nds::core::speech::PhoneticTranscriptionList&& phoneticTranscriptions_);
    bool isPhoneticTranscriptionsUsed() const;
    bool isPhoneticTranscriptionsSet() const;
    void resetPhoneticTranscriptions();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const GuidanceNameString& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::LanguageCode readLanguage(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readLanguage(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::string<> readName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceNameStringRelationList> readRelations(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceNameStringRelationList> readRelations(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> readPhoneticTranscriptions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> readPhoneticTranscriptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numNames_;
    bool m_isInitialized;
    ::nds::core::types::LanguageCode m_language_;
    ::zserio::string<> m_name_;
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceNameStringRelationList> m_relations_;
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> m_phoneticTranscriptions_;
};

} // namespace guidance
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_GUIDANCE_GUIDANCE_NAME_STRING_H