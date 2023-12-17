/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_METADATA_DISPLAY3_DSTYLE_LAYER_METADATA_H
#define NDS_DISPLAY_METADATA_DISPLAY3_DSTYLE_LAYER_METADATA_H

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

#include <nds/display/metadata/Display3DStyleLayerContent.h>
#include <nds/display/metadata/TextureContentDescriptor.h>

namespace nds
{
namespace display
{
namespace metadata
{

class Display3DStyleLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::display::metadata::TextureContentDescriptor::ZserioPackingContext& getTextureMetadata()
        {
            return m_textureMetadata_;
        }

    private:
        ::nds::display::metadata::TextureContentDescriptor::ZserioPackingContext m_textureMetadata_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Display3DStyleLayerMetadata() noexcept :
            Display3DStyleLayerMetadata(allocator_type())
    {}

    explicit Display3DStyleLayerMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_content = ::nds::display::metadata::Display3DStyleLayerContent,
            typename ZSERIO_T_textureMetadata = ::nds::display::metadata::TextureContentDescriptor,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_content, Display3DStyleLayerMetadata, allocator_type> = 0>
    Display3DStyleLayerMetadata(
            ZSERIO_T_content&& content_,
            ZSERIO_T_textureMetadata&& textureMetadata_,
            const allocator_type& allocator = allocator_type()) :
            Display3DStyleLayerMetadata(allocator)
    {
        m_content_ = ::std::forward<ZSERIO_T_content>(content_);
        m_textureMetadata_ = ::std::forward<ZSERIO_T_textureMetadata>(textureMetadata_);
    }

    explicit Display3DStyleLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Display3DStyleLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Display3DStyleLayerMetadata() = default;

    Display3DStyleLayerMetadata(const Display3DStyleLayerMetadata&) = default;
    Display3DStyleLayerMetadata& operator=(const Display3DStyleLayerMetadata&) = default;

    Display3DStyleLayerMetadata(Display3DStyleLayerMetadata&&) = default;
    Display3DStyleLayerMetadata& operator=(Display3DStyleLayerMetadata&&) = default;

    Display3DStyleLayerMetadata(::zserio::PropagateAllocatorT,
            const Display3DStyleLayerMetadata& other, const allocator_type& allocator);

    const ::nds::display::metadata::Display3DStyleLayerContent& getContent() const;
    ::nds::display::metadata::Display3DStyleLayerContent& getContent();
    void setContent(const ::nds::display::metadata::Display3DStyleLayerContent& content_);
    void setContent(::nds::display::metadata::Display3DStyleLayerContent&& content_);

    const ::nds::display::metadata::TextureContentDescriptor& getTextureMetadata() const;
    ::nds::display::metadata::TextureContentDescriptor& getTextureMetadata();
    void setTextureMetadata(const ::nds::display::metadata::TextureContentDescriptor& textureMetadata_);
    void setTextureMetadata(::nds::display::metadata::TextureContentDescriptor&& textureMetadata_);
    bool isTextureMetadataUsed() const;
    bool isTextureMetadataSet() const;
    void resetTextureMetadata();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Display3DStyleLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::display::metadata::Display3DStyleLayerContent readContent(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::metadata::TextureContentDescriptor> readTextureMetadata(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::metadata::TextureContentDescriptor> readTextureMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::display::metadata::Display3DStyleLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::display::metadata::TextureContentDescriptor> m_textureMetadata_;
};

} // namespace metadata
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_METADATA_DISPLAY3_DSTYLE_LAYER_METADATA_H