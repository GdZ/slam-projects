/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_COLOR_COLOR_RGBA_H
#define NDS_CORE_COLOR_COLOR_RGBA_H

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
#include <zserio/Types.h>

namespace nds
{
namespace core
{
namespace color
{

class ColorRgba
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getRed()
        {
            return m_red_;
        }

        ::zserio::DeltaContext& getGreen()
        {
            return m_green_;
        }

        ::zserio::DeltaContext& getBlue()
        {
            return m_blue_;
        }

        ::zserio::DeltaContext& getAlpha()
        {
            return m_alpha_;
        }

    private:
        ::zserio::DeltaContext m_red_;
        ::zserio::DeltaContext m_green_;
        ::zserio::DeltaContext m_blue_;
        ::zserio::DeltaContext m_alpha_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ColorRgba() noexcept :
            ColorRgba(allocator_type())
    {}

    explicit ColorRgba(const allocator_type& allocator) noexcept;

    ColorRgba(
            uint8_t red_,
            uint8_t green_,
            uint8_t blue_,
            uint8_t alpha_,
            const allocator_type& allocator = allocator_type()) :
            ColorRgba(allocator)
    {
        m_red_ = red_;
        m_green_ = green_;
        m_blue_ = blue_;
        m_alpha_ = alpha_;
    }

    explicit ColorRgba(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ColorRgba(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ColorRgba() = default;

    ColorRgba(const ColorRgba&) = default;
    ColorRgba& operator=(const ColorRgba&) = default;

    ColorRgba(ColorRgba&&) = default;
    ColorRgba& operator=(ColorRgba&&) = default;

    ColorRgba(::zserio::PropagateAllocatorT,
            const ColorRgba& other, const allocator_type& allocator);

    uint8_t getRed() const;
    void setRed(uint8_t red_);

    uint8_t getGreen() const;
    void setGreen(uint8_t green_);

    uint8_t getBlue() const;
    void setBlue(uint8_t blue_);

    uint8_t getAlpha() const;
    void setAlpha(uint8_t alpha_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ColorRgba& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint8_t readRed(::zserio::BitStreamReader& in);
    uint8_t readRed(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint8_t readGreen(::zserio::BitStreamReader& in);
    uint8_t readGreen(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint8_t readBlue(::zserio::BitStreamReader& in);
    uint8_t readBlue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint8_t readAlpha(::zserio::BitStreamReader& in);
    uint8_t readAlpha(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    uint8_t m_red_;
    uint8_t m_green_;
    uint8_t m_blue_;
    uint8_t m_alpha_;
};

} // namespace color
} // namespace core
} // namespace nds

#endif // NDS_CORE_COLOR_COLOR_RGBA_H
