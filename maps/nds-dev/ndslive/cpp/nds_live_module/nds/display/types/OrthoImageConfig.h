/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_ORTHO_IMAGE_CONFIG_H
#define NDS_DISPLAY_TYPES_ORTHO_IMAGE_CONFIG_H

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

#include <nds/display/types/OrthoImageConditionUsageType.h>
#include <nds/display/types/OrthoImageContentType.h>
#include <nds/display/types/OrthoImageFormat.h>

namespace nds
{
namespace display
{
namespace types
{

class OrthoImageConfig
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getFormat()
        {
            return m_format_;
        }

        ::zserio::DeltaContext& getSourceType()
        {
            return m_sourceType_;
        }

        ::zserio::DeltaContext& getUsageType()
        {
            return m_usageType_;
        }

    private:
        ::zserio::DeltaContext m_format_;
        ::zserio::DeltaContext m_sourceType_;
        ::zserio::DeltaContext m_usageType_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    OrthoImageConfig() noexcept :
            OrthoImageConfig(allocator_type())
    {}

    explicit OrthoImageConfig(const allocator_type& allocator) noexcept;

    OrthoImageConfig(
            ::nds::display::types::OrthoImageFormat format_,
            ::nds::display::types::OrthoImageContentType sourceType_,
            ::nds::display::types::OrthoImageConditionUsageType usageType_,
            const allocator_type& allocator = allocator_type()) :
            OrthoImageConfig(allocator)
    {
        m_format_ = format_;
        m_sourceType_ = sourceType_;
        m_usageType_ = usageType_;
    }

    explicit OrthoImageConfig(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit OrthoImageConfig(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~OrthoImageConfig() = default;

    OrthoImageConfig(const OrthoImageConfig&) = default;
    OrthoImageConfig& operator=(const OrthoImageConfig&) = default;

    OrthoImageConfig(OrthoImageConfig&&) = default;
    OrthoImageConfig& operator=(OrthoImageConfig&&) = default;

    OrthoImageConfig(::zserio::PropagateAllocatorT,
            const OrthoImageConfig& other, const allocator_type& allocator);

    ::nds::display::types::OrthoImageFormat getFormat() const;
    void setFormat(::nds::display::types::OrthoImageFormat format_);

    ::nds::display::types::OrthoImageContentType getSourceType() const;
    void setSourceType(::nds::display::types::OrthoImageContentType sourceType_);

    ::nds::display::types::OrthoImageConditionUsageType getUsageType() const;
    void setUsageType(::nds::display::types::OrthoImageConditionUsageType usageType_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const OrthoImageConfig& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::display::types::OrthoImageFormat readFormat(::zserio::BitStreamReader& in);
    ::nds::display::types::OrthoImageFormat readFormat(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::display::types::OrthoImageContentType readSourceType(::zserio::BitStreamReader& in);
    ::nds::display::types::OrthoImageContentType readSourceType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::display::types::OrthoImageConditionUsageType readUsageType(::zserio::BitStreamReader& in);
    ::nds::display::types::OrthoImageConditionUsageType readUsageType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::display::types::OrthoImageFormat m_format_;
    ::nds::display::types::OrthoImageContentType m_sourceType_;
    ::nds::display::types::OrthoImageConditionUsageType m_usageType_;
};

} // namespace types
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_TYPES_ORTHO_IMAGE_CONFIG_H