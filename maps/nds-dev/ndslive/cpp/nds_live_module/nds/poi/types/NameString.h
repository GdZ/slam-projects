/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_TYPES_NAME_STRING_H
#define NDS_POI_TYPES_NAME_STRING_H

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

#include <nds/core/types/LanguageCode.h>
#include <nds/poi/types/NameStringRelationType.h>
#include <nds/poi/types/NameStringUsageType.h>

namespace nds
{
namespace poi
{
namespace types
{

class NameString
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLanguageCode()
        {
            return m_languageCode_;
        }

        ::zserio::DeltaContext& getNameStringRelationType()
        {
            return m_nameStringRelationType_;
        }

        ::zserio::DeltaContext& getNameStringUsageType()
        {
            return m_nameStringUsageType_;
        }

        ::zserio::DeltaContext& getRefNameStringIndex()
        {
            return m_refNameStringIndex_;
        }

    private:
        ::zserio::DeltaContext m_languageCode_;
        ::zserio::DeltaContext m_nameStringRelationType_;
        ::zserio::DeltaContext m_nameStringUsageType_;
        ::zserio::DeltaContext m_refNameStringIndex_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NameString() noexcept :
            NameString(allocator_type())
    {}

    explicit NameString(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_nameString = ::zserio::string<>,
            typename ZSERIO_T_refNameStringIndex = uint8_t,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_nameString, NameString, allocator_type> = 0>
    NameString(
            ZSERIO_T_nameString&& nameString_,
            ::nds::core::types::LanguageCode languageCode_,
            ::nds::poi::types::NameStringRelationType nameStringRelationType_,
            ::nds::poi::types::NameStringUsageType nameStringUsageType_,
            ZSERIO_T_refNameStringIndex&& refNameStringIndex_,
            const allocator_type& allocator = allocator_type()) :
            NameString(allocator)
    {
        m_nameString_ = ::std::forward<ZSERIO_T_nameString>(nameString_);
        m_languageCode_ = languageCode_;
        m_nameStringRelationType_ = nameStringRelationType_;
        m_nameStringUsageType_ = nameStringUsageType_;
        m_refNameStringIndex_ = ::std::forward<ZSERIO_T_refNameStringIndex>(refNameStringIndex_);
    }

    explicit NameString(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit NameString(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~NameString() = default;

    NameString(const NameString&) = default;
    NameString& operator=(const NameString&) = default;

    NameString(NameString&&) = default;
    NameString& operator=(NameString&&) = default;

    NameString(::zserio::PropagateAllocatorT,
            const NameString& other, const allocator_type& allocator);

    const ::zserio::string<>& getNameString() const;
    ::zserio::string<>& getNameString();
    void setNameString(const ::zserio::string<>& nameString_);
    void setNameString(::zserio::string<>&& nameString_);

    ::nds::core::types::LanguageCode getLanguageCode() const;
    void setLanguageCode(::nds::core::types::LanguageCode languageCode_);

    ::nds::poi::types::NameStringRelationType getNameStringRelationType() const;
    void setNameStringRelationType(::nds::poi::types::NameStringRelationType nameStringRelationType_);

    ::nds::poi::types::NameStringUsageType getNameStringUsageType() const;
    void setNameStringUsageType(::nds::poi::types::NameStringUsageType nameStringUsageType_);

    uint8_t getRefNameStringIndex() const;
    void setRefNameStringIndex(uint8_t refNameStringIndex_);
    bool isRefNameStringIndexUsed() const;
    bool isRefNameStringIndexSet() const;
    void resetRefNameStringIndex();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NameString& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::string<> readNameString(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::LanguageCode readLanguageCode(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readLanguageCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::poi::types::NameStringRelationType readNameStringRelationType(::zserio::BitStreamReader& in);
    ::nds::poi::types::NameStringRelationType readNameStringRelationType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::poi::types::NameStringUsageType readNameStringUsageType(::zserio::BitStreamReader& in);
    ::nds::poi::types::NameStringUsageType readNameStringUsageType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint8_t> readRefNameStringIndex(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint8_t> readRefNameStringIndex(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::zserio::string<> m_nameString_;
    ::nds::core::types::LanguageCode m_languageCode_;
    ::nds::poi::types::NameStringRelationType m_nameStringRelationType_;
    ::nds::poi::types::NameStringUsageType m_nameStringUsageType_;
    ::zserio::InplaceOptionalHolder<uint8_t> m_refNameStringIndex_;
};

} // namespace types
} // namespace poi
} // namespace nds

#endif // NDS_POI_TYPES_NAME_STRING_H
