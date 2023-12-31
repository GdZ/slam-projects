/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_LAYER_DISPLAY3_DLAYER_HEADER_H
#define NDS_DISPLAY_LAYER_DISPLAY3_DLAYER_HEADER_H

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

#include <nds/core/types/ScaleDenominator.h>
#include <nds/display/metadata/Display3DContent.h>

namespace nds
{
namespace display
{
namespace layer
{

class Display3DLayerHeader
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::zserio::DeltaContext& getMinScaleDenominator()
        {
            return m_minScaleDenominator_;
        }

        ::zserio::DeltaContext& getMaxScaleDenominator()
        {
            return m_maxScaleDenominator_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::zserio::DeltaContext m_minScaleDenominator_;
        ::zserio::DeltaContext m_maxScaleDenominator_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Display3DLayerHeader() noexcept :
            Display3DLayerHeader(allocator_type())
    {}

    explicit Display3DLayerHeader(const allocator_type& allocator) noexcept;

    Display3DLayerHeader(
            ::nds::display::metadata::Display3DContent content_,
            ::nds::core::types::ScaleDenominator minScaleDenominator_,
            ::nds::core::types::ScaleDenominator maxScaleDenominator_,
            const allocator_type& allocator = allocator_type()) :
            Display3DLayerHeader(allocator)
    {
        m_content_ = content_;
        m_minScaleDenominator_ = minScaleDenominator_;
        m_maxScaleDenominator_ = maxScaleDenominator_;
    }

    explicit Display3DLayerHeader(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Display3DLayerHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Display3DLayerHeader() = default;

    Display3DLayerHeader(const Display3DLayerHeader&) = default;
    Display3DLayerHeader& operator=(const Display3DLayerHeader&) = default;

    Display3DLayerHeader(Display3DLayerHeader&&) = default;
    Display3DLayerHeader& operator=(Display3DLayerHeader&&) = default;

    Display3DLayerHeader(::zserio::PropagateAllocatorT,
            const Display3DLayerHeader& other, const allocator_type& allocator);

    ::nds::display::metadata::Display3DContent getContent() const;
    void setContent(::nds::display::metadata::Display3DContent content_);

    ::nds::core::types::ScaleDenominator getMinScaleDenominator() const;
    void setMinScaleDenominator(::nds::core::types::ScaleDenominator minScaleDenominator_);

    ::nds::core::types::ScaleDenominator getMaxScaleDenominator() const;
    void setMaxScaleDenominator(::nds::core::types::ScaleDenominator maxScaleDenominator_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Display3DLayerHeader& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::display::metadata::Display3DContent readContent(::zserio::BitStreamReader& in);
    ::nds::display::metadata::Display3DContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::ScaleDenominator readMinScaleDenominator(::zserio::BitStreamReader& in);
    ::nds::core::types::ScaleDenominator readMinScaleDenominator(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::types::ScaleDenominator readMaxScaleDenominator(::zserio::BitStreamReader& in);
    ::nds::core::types::ScaleDenominator readMaxScaleDenominator(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::display::metadata::Display3DContent m_content_;
    ::nds::core::types::ScaleDenominator m_minScaleDenominator_;
    ::nds::core::types::ScaleDenominator m_maxScaleDenominator_;
};

} // namespace layer
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_LAYER_DISPLAY3_DLAYER_HEADER_H
