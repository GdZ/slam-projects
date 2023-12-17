/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_METADATA_DISPLAY_NAME_LAYER_METADATA_H
#define NDS_NAME_METADATA_DISPLAY_NAME_LAYER_METADATA_H

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

#include <nds/core/language/AvailableLanguages.h>
#include <nds/name/instantiations/NameDisplayAreaAttributeMetadata.h>
#include <nds/name/instantiations/NameDisplayLineRangeAttributeMetadata.h>
#include <nds/name/instantiations/NameDisplayPointAttributeMetadata.h>
#include <nds/name/metadata/DisplayNameLayerContent.h>

namespace nds
{
namespace name
{
namespace metadata
{

class DisplayNameLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata::ZserioPackingContext& getDisplayLineRangeAttributeMetadata()
        {
            return m_displayLineRangeAttributeMetadata_;
        }

        ::nds::name::instantiations::NameDisplayAreaAttributeMetadata::ZserioPackingContext& getDisplayAreaAttributeMetadata()
        {
            return m_displayAreaAttributeMetadata_;
        }

        ::nds::name::instantiations::NameDisplayPointAttributeMetadata::ZserioPackingContext& getDisplayPointAttributeMetadata()
        {
            return m_displayPointAttributeMetadata_;
        }

        ::nds::core::language::AvailableLanguages::ZserioPackingContext& getAvailableLanguages()
        {
            return m_availableLanguages_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata::ZserioPackingContext m_displayLineRangeAttributeMetadata_;
        ::nds::name::instantiations::NameDisplayAreaAttributeMetadata::ZserioPackingContext m_displayAreaAttributeMetadata_;
        ::nds::name::instantiations::NameDisplayPointAttributeMetadata::ZserioPackingContext m_displayPointAttributeMetadata_;
        ::nds::core::language::AvailableLanguages::ZserioPackingContext m_availableLanguages_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayNameLayerMetadata() noexcept :
            DisplayNameLayerMetadata(allocator_type())
    {}

    explicit DisplayNameLayerMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_displayLineRangeAttributeMetadata = ::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata,
            typename ZSERIO_T_displayAreaAttributeMetadata = ::nds::name::instantiations::NameDisplayAreaAttributeMetadata,
            typename ZSERIO_T_displayPointAttributeMetadata = ::nds::name::instantiations::NameDisplayPointAttributeMetadata,
            typename ZSERIO_T_availableLanguages = ::nds::core::language::AvailableLanguages>
    DisplayNameLayerMetadata(
            ::nds::name::metadata::DisplayNameLayerContent content_,
            ZSERIO_T_displayLineRangeAttributeMetadata&& displayLineRangeAttributeMetadata_,
            ZSERIO_T_displayAreaAttributeMetadata&& displayAreaAttributeMetadata_,
            ZSERIO_T_displayPointAttributeMetadata&& displayPointAttributeMetadata_,
            ZSERIO_T_availableLanguages&& availableLanguages_,
            const allocator_type& allocator = allocator_type()) :
            DisplayNameLayerMetadata(allocator)
    {
        m_content_ = content_;
        m_displayLineRangeAttributeMetadata_ = ::std::forward<ZSERIO_T_displayLineRangeAttributeMetadata>(displayLineRangeAttributeMetadata_);
        m_displayAreaAttributeMetadata_ = ::std::forward<ZSERIO_T_displayAreaAttributeMetadata>(displayAreaAttributeMetadata_);
        m_displayPointAttributeMetadata_ = ::std::forward<ZSERIO_T_displayPointAttributeMetadata>(displayPointAttributeMetadata_);
        m_availableLanguages_ = ::std::forward<ZSERIO_T_availableLanguages>(availableLanguages_);
    }

    explicit DisplayNameLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayNameLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayNameLayerMetadata() = default;

    DisplayNameLayerMetadata(const DisplayNameLayerMetadata&) = default;
    DisplayNameLayerMetadata& operator=(const DisplayNameLayerMetadata&) = default;

    DisplayNameLayerMetadata(DisplayNameLayerMetadata&&) = default;
    DisplayNameLayerMetadata& operator=(DisplayNameLayerMetadata&&) = default;

    DisplayNameLayerMetadata(::zserio::PropagateAllocatorT,
            const DisplayNameLayerMetadata& other, const allocator_type& allocator);

    ::nds::name::metadata::DisplayNameLayerContent getContent() const;
    void setContent(::nds::name::metadata::DisplayNameLayerContent content_);

    const ::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata& getDisplayLineRangeAttributeMetadata() const;
    ::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata& getDisplayLineRangeAttributeMetadata();
    void setDisplayLineRangeAttributeMetadata(const ::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata& displayLineRangeAttributeMetadata_);
    void setDisplayLineRangeAttributeMetadata(::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata&& displayLineRangeAttributeMetadata_);
    bool isDisplayLineRangeAttributeMetadataUsed() const;
    bool isDisplayLineRangeAttributeMetadataSet() const;
    void resetDisplayLineRangeAttributeMetadata();

    const ::nds::name::instantiations::NameDisplayAreaAttributeMetadata& getDisplayAreaAttributeMetadata() const;
    ::nds::name::instantiations::NameDisplayAreaAttributeMetadata& getDisplayAreaAttributeMetadata();
    void setDisplayAreaAttributeMetadata(const ::nds::name::instantiations::NameDisplayAreaAttributeMetadata& displayAreaAttributeMetadata_);
    void setDisplayAreaAttributeMetadata(::nds::name::instantiations::NameDisplayAreaAttributeMetadata&& displayAreaAttributeMetadata_);
    bool isDisplayAreaAttributeMetadataUsed() const;
    bool isDisplayAreaAttributeMetadataSet() const;
    void resetDisplayAreaAttributeMetadata();

    const ::nds::name::instantiations::NameDisplayPointAttributeMetadata& getDisplayPointAttributeMetadata() const;
    ::nds::name::instantiations::NameDisplayPointAttributeMetadata& getDisplayPointAttributeMetadata();
    void setDisplayPointAttributeMetadata(const ::nds::name::instantiations::NameDisplayPointAttributeMetadata& displayPointAttributeMetadata_);
    void setDisplayPointAttributeMetadata(::nds::name::instantiations::NameDisplayPointAttributeMetadata&& displayPointAttributeMetadata_);
    bool isDisplayPointAttributeMetadataUsed() const;
    bool isDisplayPointAttributeMetadataSet() const;
    void resetDisplayPointAttributeMetadata();

    const ::nds::core::language::AvailableLanguages& getAvailableLanguages() const;
    ::nds::core::language::AvailableLanguages& getAvailableLanguages();
    void setAvailableLanguages(const ::nds::core::language::AvailableLanguages& availableLanguages_);
    void setAvailableLanguages(::nds::core::language::AvailableLanguages&& availableLanguages_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayNameLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::name::metadata::DisplayNameLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::name::metadata::DisplayNameLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata> readDisplayLineRangeAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata> readDisplayLineRangeAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeMetadata> readDisplayAreaAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeMetadata> readDisplayAreaAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeMetadata> readDisplayPointAttributeMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeMetadata> readDisplayPointAttributeMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::name::metadata::DisplayNameLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeMetadata> m_displayLineRangeAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeMetadata> m_displayAreaAttributeMetadata_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeMetadata> m_displayPointAttributeMetadata_;
    ::nds::core::language::AvailableLanguages m_availableLanguages_;
};

} // namespace metadata
} // namespace name
} // namespace nds

#endif // NDS_NAME_METADATA_DISPLAY_NAME_LAYER_METADATA_H