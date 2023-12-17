/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_SPEECH_PHONETIC_TRANSCRIPTION_LIST_H
#define NDS_CORE_SPEECH_PHONETIC_TRANSCRIPTION_LIST_H

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
#include <zserio/Vector.h>

#include <nds/core/speech/PhoneticTranscription.h>
#include <nds/core/speech/PhoneticTranscriptionFormat.h>

namespace nds
{
namespace core
{
namespace speech
{

class PhoneticTranscriptionList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getFormat()
        {
            return m_format_;
        }

    private:
        ::zserio::DeltaContext m_format_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PhoneticTranscriptionList() noexcept :
            PhoneticTranscriptionList(allocator_type())
    {}

    explicit PhoneticTranscriptionList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_transcriptions = ::zserio::vector<::nds::core::speech::PhoneticTranscription>>
    PhoneticTranscriptionList(
            ::nds::core::speech::PhoneticTranscriptionFormat format_,
            ZSERIO_T_transcriptions&& transcriptions_,
            const allocator_type& allocator = allocator_type()) :
            PhoneticTranscriptionList(allocator)
    {
        m_format_ = format_;
        m_transcriptions_ = ZserioArrayType_transcriptions(::std::forward<ZSERIO_T_transcriptions>(transcriptions_));
    }

    explicit PhoneticTranscriptionList(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PhoneticTranscriptionList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PhoneticTranscriptionList() = default;

    PhoneticTranscriptionList(const PhoneticTranscriptionList&) = default;
    PhoneticTranscriptionList& operator=(const PhoneticTranscriptionList&) = default;

    PhoneticTranscriptionList(PhoneticTranscriptionList&&) = default;
    PhoneticTranscriptionList& operator=(PhoneticTranscriptionList&&) = default;

    PhoneticTranscriptionList(::zserio::PropagateAllocatorT,
            const PhoneticTranscriptionList& other, const allocator_type& allocator);

    ::nds::core::speech::PhoneticTranscriptionFormat getFormat() const;
    void setFormat(::nds::core::speech::PhoneticTranscriptionFormat format_);

    const ::zserio::vector<::nds::core::speech::PhoneticTranscription>& getTranscriptions() const;
    ::zserio::vector<::nds::core::speech::PhoneticTranscription>& getTranscriptions();
    void setTranscriptions(const ::zserio::vector<::nds::core::speech::PhoneticTranscription>& transcriptions_);
    void setTranscriptions(::zserio::vector<::nds::core::speech::PhoneticTranscription>&& transcriptions_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PhoneticTranscriptionList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_transcriptions
    {
    public:
        using OwnerType = PhoneticTranscriptionList;

        static void create(PhoneticTranscriptionList& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscription>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PhoneticTranscriptionList& owner,
                ::zserio::vector<::nds::core::speech::PhoneticTranscription>& array,
                ::nds::core::speech::PhoneticTranscription::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_transcriptions = ::zserio::Array<::zserio::vector<::nds::core::speech::PhoneticTranscription>, ::zserio::ObjectArrayTraits<::nds::core::speech::PhoneticTranscription, ZserioElementFactory_transcriptions>, ::zserio::ArrayType::AUTO>;

    ::nds::core::speech::PhoneticTranscriptionFormat readFormat(::zserio::BitStreamReader& in);
    ::nds::core::speech::PhoneticTranscriptionFormat readFormat(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_transcriptions readTranscriptions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_transcriptions readTranscriptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::speech::PhoneticTranscriptionFormat m_format_;
    ZserioArrayType_transcriptions m_transcriptions_;
};

} // namespace speech
} // namespace core
} // namespace nds

#endif // NDS_CORE_SPEECH_PHONETIC_TRANSCRIPTION_LIST_H
