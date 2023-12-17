/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_METADATA_TEXTURE_CONTENT_DESCRIPTOR_H
#define NDS_DISPLAY_METADATA_TEXTURE_CONTENT_DESCRIPTOR_H

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

#include <nds/display/types/TextureConditionUsageType.h>
#include <nds/display/types/TextureFormat.h>
#include <nds/display/types/TextureRenderingUsageType.h>

namespace nds
{
namespace display
{
namespace metadata
{

class TextureContentDescriptor
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getTextureConditionUsageTypes()
        {
            return m_textureConditionUsageTypes_;
        }

    private:
        ::zserio::DeltaContext m_textureConditionUsageTypes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TextureContentDescriptor() noexcept :
            TextureContentDescriptor(allocator_type())
    {}

    explicit TextureContentDescriptor(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_textureFormats = ::zserio::vector<::nds::display::types::TextureFormat>,
            typename ZSERIO_T_textureRenderingUsageTypes = ::zserio::vector<::nds::display::types::TextureRenderingUsageType>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_textureFormats, TextureContentDescriptor, allocator_type> = 0>
    TextureContentDescriptor(
            ZSERIO_T_textureFormats&& textureFormats_,
            ZSERIO_T_textureRenderingUsageTypes&& textureRenderingUsageTypes_,
            ::nds::display::types::TextureConditionUsageType textureConditionUsageTypes_,
            const allocator_type& allocator = allocator_type()) :
            TextureContentDescriptor(allocator)
    {
        m_textureFormats_ = ZserioArrayType_textureFormats(::std::forward<ZSERIO_T_textureFormats>(textureFormats_));
        m_textureRenderingUsageTypes_ = ZserioArrayType_textureRenderingUsageTypes(::std::forward<ZSERIO_T_textureRenderingUsageTypes>(textureRenderingUsageTypes_));
        m_textureConditionUsageTypes_ = textureConditionUsageTypes_;
    }

    explicit TextureContentDescriptor(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TextureContentDescriptor(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TextureContentDescriptor() = default;

    TextureContentDescriptor(const TextureContentDescriptor&) = default;
    TextureContentDescriptor& operator=(const TextureContentDescriptor&) = default;

    TextureContentDescriptor(TextureContentDescriptor&&) = default;
    TextureContentDescriptor& operator=(TextureContentDescriptor&&) = default;

    TextureContentDescriptor(::zserio::PropagateAllocatorT,
            const TextureContentDescriptor& other, const allocator_type& allocator);

    const ::zserio::vector<::nds::display::types::TextureFormat>& getTextureFormats() const;
    ::zserio::vector<::nds::display::types::TextureFormat>& getTextureFormats();
    void setTextureFormats(const ::zserio::vector<::nds::display::types::TextureFormat>& textureFormats_);
    void setTextureFormats(::zserio::vector<::nds::display::types::TextureFormat>&& textureFormats_);

    const ::zserio::vector<::nds::display::types::TextureRenderingUsageType>& getTextureRenderingUsageTypes() const;
    ::zserio::vector<::nds::display::types::TextureRenderingUsageType>& getTextureRenderingUsageTypes();
    void setTextureRenderingUsageTypes(const ::zserio::vector<::nds::display::types::TextureRenderingUsageType>& textureRenderingUsageTypes_);
    void setTextureRenderingUsageTypes(::zserio::vector<::nds::display::types::TextureRenderingUsageType>&& textureRenderingUsageTypes_);

    ::nds::display::types::TextureConditionUsageType getTextureConditionUsageTypes() const;
    void setTextureConditionUsageTypes(::nds::display::types::TextureConditionUsageType textureConditionUsageTypes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TextureContentDescriptor& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_textureFormats = ::zserio::Array<::zserio::vector<::nds::display::types::TextureFormat>, ::zserio::EnumArrayTraits<::nds::display::types::TextureFormat>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_textureRenderingUsageTypes = ::zserio::Array<::zserio::vector<::nds::display::types::TextureRenderingUsageType>, ::zserio::EnumArrayTraits<::nds::display::types::TextureRenderingUsageType>, ::zserio::ArrayType::AUTO>;

    ZserioArrayType_textureFormats readTextureFormats(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_textureFormats readTextureFormats(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_textureRenderingUsageTypes readTextureRenderingUsageTypes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_textureRenderingUsageTypes readTextureRenderingUsageTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::display::types::TextureConditionUsageType readTextureConditionUsageTypes(::zserio::BitStreamReader& in);
    ::nds::display::types::TextureConditionUsageType readTextureConditionUsageTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ZserioArrayType_textureFormats m_textureFormats_;
    ZserioArrayType_textureRenderingUsageTypes m_textureRenderingUsageTypes_;
    ::nds::display::types::TextureConditionUsageType m_textureConditionUsageTypes_;
};

} // namespace metadata
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_METADATA_TEXTURE_CONTENT_DESCRIPTOR_H
