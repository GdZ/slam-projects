/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_TYPES_SIGNPOST_PHONETIC_TRANSCRIPTIONS_H
#define NDS_INSTRUCTIONS_TYPES_SIGNPOST_PHONETIC_TRANSCRIPTIONS_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

#include <nds/core/speech/PhoneticTranscriptionList.h>
#include <nds/instructions/types/SignpostInstructionContent.h>

namespace nds
{
namespace instructions
{
namespace types
{

class SignpostPhoneticTranscriptions
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext& getExitName()
        {
            return m_exitName_;
        }

        ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext& getExitNumber()
        {
            return m_exitNumber_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext m_exitName_;
        ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext m_exitNumber_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    SignpostPhoneticTranscriptions() noexcept :
            SignpostPhoneticTranscriptions(allocator_type())
    {}

    explicit SignpostPhoneticTranscriptions(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_exitName = ::nds::core::speech::PhoneticTranscriptionList,
            typename ZSERIO_T_exitNumber = ::nds::core::speech::PhoneticTranscriptionList,
            typename ZSERIO_T_towardsName = ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>,
            typename ZSERIO_T_towardsNumber = ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>,
            typename ZSERIO_T_directionName = ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>,
            typename ZSERIO_T_directionNumber = ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>>
    SignpostPhoneticTranscriptions(
            ::nds::instructions::types::SignpostInstructionContent content_,
            ZSERIO_T_exitName&& exitName_,
            ZSERIO_T_exitNumber&& exitNumber_,
            ZSERIO_T_towardsName&& towardsName_,
            ZSERIO_T_towardsNumber&& towardsNumber_,
            ZSERIO_T_directionName&& directionName_,
            ZSERIO_T_directionNumber&& directionNumber_,
            const allocator_type& allocator = allocator_type()) :
            SignpostPhoneticTranscriptions(allocator)
    {
        m_content_ = content_;
        m_exitName_ = ::std::forward<ZSERIO_T_exitName>(exitName_);
        m_exitNumber_ = ::std::forward<ZSERIO_T_exitNumber>(exitNumber_);
        m_towardsName_ = ::zserio::createOptionalArray<ZserioArrayType_towardsName>(::std::forward<ZSERIO_T_towardsName>(towardsName_));
        m_towardsNumber_ = ::zserio::createOptionalArray<ZserioArrayType_towardsNumber>(::std::forward<ZSERIO_T_towardsNumber>(towardsNumber_));
        m_directionName_ = ::zserio::createOptionalArray<ZserioArrayType_directionName>(::std::forward<ZSERIO_T_directionName>(directionName_));
        m_directionNumber_ = ::zserio::createOptionalArray<ZserioArrayType_directionNumber>(::std::forward<ZSERIO_T_directionNumber>(directionNumber_));
    }

    explicit SignpostPhoneticTranscriptions(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit SignpostPhoneticTranscriptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~SignpostPhoneticTranscriptions() = default;

    SignpostPhoneticTranscriptions(const SignpostPhoneticTranscriptions&) = default;
    SignpostPhoneticTranscriptions& operator=(const SignpostPhoneticTranscriptions&) = default;

    SignpostPhoneticTranscriptions(SignpostPhoneticTranscriptions&&) = default;
    SignpostPhoneticTranscriptions& operator=(SignpostPhoneticTranscriptions&&) = default;

    SignpostPhoneticTranscriptions(::zserio::PropagateAllocatorT,
            const SignpostPhoneticTranscriptions& other, const allocator_type& allocator);

    ::nds::instructions::types::SignpostInstructionContent getContent() const;
    void setContent(::nds::instructions::types::SignpostInstructionContent content_);

    const ::nds::core::speech::PhoneticTranscriptionList& getExitName() const;
    ::nds::core::speech::PhoneticTranscriptionList& getExitName();
    void setExitName(const ::nds::core::speech::PhoneticTranscriptionList& exitName_);
    void setExitName(::nds::core::speech::PhoneticTranscriptionList&& exitName_);
    bool isExitNameUsed() const;
    bool isExitNameSet() const;
    void resetExitName();

    const ::nds::core::speech::PhoneticTranscriptionList& getExitNumber() const;
    ::nds::core::speech::PhoneticTranscriptionList& getExitNumber();
    void setExitNumber(const ::nds::core::speech::PhoneticTranscriptionList& exitNumber_);
    void setExitNumber(::nds::core::speech::PhoneticTranscriptionList&& exitNumber_);
    bool isExitNumberUsed() const;
    bool isExitNumberSet() const;
    void resetExitNumber();

    const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getTowardsName() const;
    ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getTowardsName();
    void setTowardsName(const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& towardsName_);
    void setTowardsName(::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>&& towardsName_);
    bool isTowardsNameUsed() const;
    bool isTowardsNameSet() const;
    void resetTowardsName();

    const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getTowardsNumber() const;
    ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getTowardsNumber();
    void setTowardsNumber(const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& towardsNumber_);
    void setTowardsNumber(::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>&& towardsNumber_);
    bool isTowardsNumberUsed() const;
    bool isTowardsNumberSet() const;
    void resetTowardsNumber();

    const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getDirectionName() const;
    ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getDirectionName();
    void setDirectionName(const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& directionName_);
    void setDirectionName(::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>&& directionName_);
    bool isDirectionNameUsed() const;
    bool isDirectionNameSet() const;
    void resetDirectionName();

    const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getDirectionNumber() const;
    ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& getDirectionNumber();
    void setDirectionNumber(const ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& directionNumber_);
    void setDirectionNumber(::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>&& directionNumber_);
    bool isDirectionNumberUsed() const;
    bool isDirectionNumberSet() const;
    void resetDirectionNumber();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SignpostPhoneticTranscriptions& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_towardsName
    {
    public:
        using OwnerType = SignpostPhoneticTranscriptions;

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioElementFactory_towardsNumber
    {
    public:
        using OwnerType = SignpostPhoneticTranscriptions;

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioElementFactory_directionName
    {
    public:
        using OwnerType = SignpostPhoneticTranscriptions;

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioElementFactory_directionNumber
    {
    public:
        using OwnerType = SignpostPhoneticTranscriptions;

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(SignpostPhoneticTranscriptions& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>& array,
                ::nds::core::speech::PhoneticTranscriptionList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_towardsName = ::zserio::Array<::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>, ::zserio::ObjectArrayTraits<::nds::core::speech::PhoneticTranscriptionList, ZserioElementFactory_towardsName>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_towardsNumber = ::zserio::Array<::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>, ::zserio::ObjectArrayTraits<::nds::core::speech::PhoneticTranscriptionList, ZserioElementFactory_towardsNumber>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_directionName = ::zserio::Array<::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>, ::zserio::ObjectArrayTraits<::nds::core::speech::PhoneticTranscriptionList, ZserioElementFactory_directionName>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_directionNumber = ::zserio::Array<::zserio::vector<::nds::core::speech::PhoneticTranscriptionList>, ::zserio::ObjectArrayTraits<::nds::core::speech::PhoneticTranscriptionList, ZserioElementFactory_directionNumber>, ::zserio::ArrayType::AUTO>;

    ::nds::instructions::types::SignpostInstructionContent readContent(::zserio::BitStreamReader& in);
    ::nds::instructions::types::SignpostInstructionContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> readExitName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> readExitName(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> readExitNumber(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> readExitNumber(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_towardsName> readTowardsName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_towardsName> readTowardsName(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_towardsNumber> readTowardsNumber(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_towardsNumber> readTowardsNumber(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_directionName> readDirectionName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_directionName> readDirectionName(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_directionNumber> readDirectionNumber(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_directionNumber> readDirectionNumber(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::instructions::types::SignpostInstructionContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> m_exitName_;
    ::zserio::InplaceOptionalHolder<::nds::core::speech::PhoneticTranscriptionList> m_exitNumber_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_towardsName> m_towardsName_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_towardsNumber> m_towardsNumber_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_directionName> m_directionName_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_directionNumber> m_directionNumber_;
};

} // namespace types
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_TYPES_SIGNPOST_PHONETIC_TRANSCRIPTIONS_H