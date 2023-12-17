/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_RENDER_SURFACE_H
#define NDS_DISPLAY_TYPES_RENDER_SURFACE_H

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
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/display/types/DisplayAreaType.h>
#include <nds/display/types/RenderSurfacePart.h>

namespace nds
{
namespace display
{
namespace types
{

class RenderSurface
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAreaType()
        {
            return m_areaType_;
        }

    private:
        ::zserio::DeltaContext m_areaType_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RenderSurface() noexcept :
            RenderSurface(allocator_type())
    {}

    explicit RenderSurface(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_renderSurfaceParts = ::zserio::vector<::nds::display::types::RenderSurfacePart>>
    RenderSurface(
            ::nds::display::types::DisplayAreaType areaType_,
            ZSERIO_T_renderSurfaceParts&& renderSurfaceParts_,
            const allocator_type& allocator = allocator_type()) :
            RenderSurface(allocator)
    {
        m_areaType_ = areaType_;
        m_renderSurfaceParts_ = ZserioArrayType_renderSurfaceParts(::std::forward<ZSERIO_T_renderSurfaceParts>(renderSurfaceParts_));
    }

    explicit RenderSurface(::zserio::BitStreamReader& in,
            uint8_t numIndexBits_, const allocator_type& allocator = allocator_type());
    explicit RenderSurface(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            uint8_t numIndexBits_, const allocator_type& allocator = allocator_type());

    ~RenderSurface() = default;

    RenderSurface(const RenderSurface& other);
    RenderSurface& operator=(const RenderSurface& other);

    RenderSurface(RenderSurface&& other);
    RenderSurface& operator=(RenderSurface&& other);

    RenderSurface(::zserio::PropagateAllocatorT,
            const RenderSurface& other, const allocator_type& allocator);

    void initialize(
            uint8_t numIndexBits_);
    bool isInitialized() const;
    void initializeChildren();

    uint8_t getNumIndexBits() const;

    ::nds::display::types::DisplayAreaType getAreaType() const;
    void setAreaType(::nds::display::types::DisplayAreaType areaType_);

    const ::zserio::vector<::nds::display::types::RenderSurfacePart>& getRenderSurfaceParts() const;
    ::zserio::vector<::nds::display::types::RenderSurfacePart>& getRenderSurfaceParts();
    void setRenderSurfaceParts(const ::zserio::vector<::nds::display::types::RenderSurfacePart>& renderSurfaceParts_);
    void setRenderSurfaceParts(::zserio::vector<::nds::display::types::RenderSurfacePart>&& renderSurfaceParts_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RenderSurface& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_renderSurfaceParts
    {
    public:
        using OwnerType = RenderSurface;

        static void initializeElement(RenderSurface& owner,
                ::nds::display::types::RenderSurfacePart& element, size_t index);
    };

    class ZserioElementFactory_renderSurfaceParts
    {
    public:
        using OwnerType = RenderSurface;

        static void create(RenderSurface& owner,
                ::zserio::vector<::nds::display::types::RenderSurfacePart>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RenderSurface& owner,
                ::zserio::vector<::nds::display::types::RenderSurfacePart>& array,
                ::nds::display::types::RenderSurfacePart::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_renderSurfaceParts = ::zserio::Array<::zserio::vector<::nds::display::types::RenderSurfacePart>, ::zserio::ObjectArrayTraits<::nds::display::types::RenderSurfacePart, ZserioElementFactory_renderSurfaceParts>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_renderSurfaceParts>;

    ::nds::display::types::DisplayAreaType readAreaType(::zserio::BitStreamReader& in);
    ::nds::display::types::DisplayAreaType readAreaType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_renderSurfaceParts readRenderSurfaceParts(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_renderSurfaceParts readRenderSurfaceParts(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numIndexBits_;
    bool m_isInitialized;
    ::nds::display::types::DisplayAreaType m_areaType_;
    ZserioArrayType_renderSurfaceParts m_renderSurfaceParts_;
};

} // namespace types
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_TYPES_RENDER_SURFACE_H