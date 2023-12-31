/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_RENDER_GROUP_TRIANGLE_STRIP_H
#define NDS_DISPLAY_TYPES_RENDER_GROUP_TRIANGLE_STRIP_H

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

#include <nds/core/geometry/PolyMesh3D.h>
#include <nds/display/types/Mesh3DRenderConfiguration.h>
#include <nds/display/types/MeshRangeIndex.h>

namespace nds
{
namespace display
{
namespace types
{

class RenderGroupTriangleStrip
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getConsecutiveQuads()
        {
            return m_consecutiveQuads_;
        }

    private:
        ::zserio::DeltaContext m_consecutiveQuads_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RenderGroupTriangleStrip() noexcept :
            RenderGroupTriangleStrip(allocator_type())
    {}

    explicit RenderGroupTriangleStrip(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_vertIndices = ::zserio::vector<::nds::display::types::MeshRangeIndex>>
    RenderGroupTriangleStrip(
            uint16_t consecutiveQuads_,
            ZSERIO_T_vertIndices&& vertIndices_,
            const allocator_type& allocator = allocator_type()) :
            RenderGroupTriangleStrip(allocator)
    {
        m_consecutiveQuads_ = consecutiveQuads_;
        m_vertIndices_ = ZserioArrayType_vertIndices(::std::forward<ZSERIO_T_vertIndices>(vertIndices_));
    }

    explicit RenderGroupTriangleStrip(::zserio::BitStreamReader& in,
            ::nds::core::geometry::PolyMesh3D& mesh_,
            ::nds::display::types::Mesh3DRenderConfiguration& config_, const allocator_type& allocator = allocator_type());
    explicit RenderGroupTriangleStrip(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::PolyMesh3D& mesh_,
            ::nds::display::types::Mesh3DRenderConfiguration& config_, const allocator_type& allocator = allocator_type());

    ~RenderGroupTriangleStrip() = default;

    RenderGroupTriangleStrip(const RenderGroupTriangleStrip& other);
    RenderGroupTriangleStrip& operator=(const RenderGroupTriangleStrip& other);

    RenderGroupTriangleStrip(RenderGroupTriangleStrip&& other);
    RenderGroupTriangleStrip& operator=(RenderGroupTriangleStrip&& other);

    RenderGroupTriangleStrip(::zserio::PropagateAllocatorT,
            const RenderGroupTriangleStrip& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::PolyMesh3D& mesh_,
            ::nds::display::types::Mesh3DRenderConfiguration& config_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::PolyMesh3D& getMesh();
    const ::nds::core::geometry::PolyMesh3D& getMesh() const;

    ::nds::display::types::Mesh3DRenderConfiguration& getConfig();
    const ::nds::display::types::Mesh3DRenderConfiguration& getConfig() const;

    uint16_t getConsecutiveQuads() const;
    void setConsecutiveQuads(uint16_t consecutiveQuads_);

    const ::zserio::vector<::nds::display::types::MeshRangeIndex>& getVertIndices() const;
    ::zserio::vector<::nds::display::types::MeshRangeIndex>& getVertIndices();
    void setVertIndices(const ::zserio::vector<::nds::display::types::MeshRangeIndex>& vertIndices_);
    void setVertIndices(::zserio::vector<::nds::display::types::MeshRangeIndex>&& vertIndices_);

    uint16_t funcNumIndicesTriangleStrip() const;

    uint32_t funcMaxMeshIndex() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RenderGroupTriangleStrip& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_vertIndices
    {
    public:
        using OwnerType = RenderGroupTriangleStrip;

        static void initializeElement(RenderGroupTriangleStrip& owner,
                ::nds::display::types::MeshRangeIndex& element, size_t index);
    };

    class ZserioElementFactory_vertIndices
    {
    public:
        using OwnerType = RenderGroupTriangleStrip;

        static void create(RenderGroupTriangleStrip& owner,
                ::zserio::vector<::nds::display::types::MeshRangeIndex>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RenderGroupTriangleStrip& owner,
                ::zserio::vector<::nds::display::types::MeshRangeIndex>& array,
                ::nds::display::types::MeshRangeIndex::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_vertIndices = ::zserio::Array<::zserio::vector<::nds::display::types::MeshRangeIndex>, ::zserio::ObjectArrayTraits<::nds::display::types::MeshRangeIndex, ZserioElementFactory_vertIndices>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_vertIndices>;

    uint16_t readConsecutiveQuads(::zserio::BitStreamReader& in);
    uint16_t readConsecutiveQuads(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_vertIndices readVertIndices(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_vertIndices readVertIndices(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::PolyMesh3D* m_mesh_;
    ::nds::display::types::Mesh3DRenderConfiguration* m_config_;
    bool m_isInitialized;
    uint16_t m_consecutiveQuads_;
    ZserioArrayType_vertIndices m_vertIndices_;
};

} // namespace types
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_TYPES_RENDER_GROUP_TRIANGLE_STRIP_H
