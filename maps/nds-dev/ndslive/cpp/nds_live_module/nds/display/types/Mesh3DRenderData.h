/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_TYPES_MESH3_DRENDER_DATA_H
#define NDS_DISPLAY_TYPES_MESH3_DRENDER_DATA_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/geometry/PolyMesh3D.h>
#include <nds/display/types/Mesh3DRenderConfiguration.h>
#include <nds/display/types/Mesh3DRenderLayerHeader.h>
#include <nds/display/types/RenderGroup.h>

namespace nds
{
namespace display
{
namespace types
{

class Mesh3DRenderData
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::display::types::Mesh3DRenderConfiguration::ZserioPackingContext& getMesh3DRenderConfiguration()
        {
            return m_mesh3DRenderConfiguration_;
        }

        ::zserio::DeltaContext& getStartIndexNormals()
        {
            return m_startIndexNormals_;
        }

        ::zserio::DeltaContext& getStartIndexColors()
        {
            return m_startIndexColors_;
        }

        ::zserio::DeltaContext& getStartIndexTextureCoords()
        {
            return m_startIndexTextureCoords_;
        }

        ::zserio::DeltaContext& getStartIndexTextureCoordsAdditional()
        {
            return m_startIndexTextureCoordsAdditional_;
        }

    private:
        ::nds::display::types::Mesh3DRenderConfiguration::ZserioPackingContext m_mesh3DRenderConfiguration_;
        ::zserio::DeltaContext m_startIndexNormals_;
        ::zserio::DeltaContext m_startIndexColors_;
        ::zserio::DeltaContext m_startIndexTextureCoords_;
        ::zserio::DeltaContext m_startIndexTextureCoordsAdditional_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Mesh3DRenderData() noexcept :
            Mesh3DRenderData(allocator_type())
    {}

    explicit Mesh3DRenderData(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_mesh3DRenderConfiguration = ::nds::display::types::Mesh3DRenderConfiguration,
            typename ZSERIO_T_startIndexNormals = uint32_t,
            typename ZSERIO_T_startIndexColors = uint32_t,
            typename ZSERIO_T_startIndexTextureCoords = uint32_t,
            typename ZSERIO_T_startIndexTextureCoordsAdditional = uint32_t,
            typename ZSERIO_T_renderGroups = ::zserio::vector<::nds::display::types::RenderGroup>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_mesh3DRenderConfiguration, Mesh3DRenderData, allocator_type> = 0>
    Mesh3DRenderData(
            ZSERIO_T_mesh3DRenderConfiguration&& mesh3DRenderConfiguration_,
            ZSERIO_T_startIndexNormals&& startIndexNormals_,
            ZSERIO_T_startIndexColors&& startIndexColors_,
            ZSERIO_T_startIndexTextureCoords&& startIndexTextureCoords_,
            ZSERIO_T_startIndexTextureCoordsAdditional&& startIndexTextureCoordsAdditional_,
            ZSERIO_T_renderGroups&& renderGroups_,
            const allocator_type& allocator = allocator_type()) :
            Mesh3DRenderData(allocator)
    {
        m_mesh3DRenderConfiguration_ = ::std::forward<ZSERIO_T_mesh3DRenderConfiguration>(mesh3DRenderConfiguration_);
        m_startIndexNormals_ = ::std::forward<ZSERIO_T_startIndexNormals>(startIndexNormals_);
        m_startIndexColors_ = ::std::forward<ZSERIO_T_startIndexColors>(startIndexColors_);
        m_startIndexTextureCoords_ = ::std::forward<ZSERIO_T_startIndexTextureCoords>(startIndexTextureCoords_);
        m_startIndexTextureCoordsAdditional_ = ::std::forward<ZSERIO_T_startIndexTextureCoordsAdditional>(startIndexTextureCoordsAdditional_);
        m_renderGroups_ = ZserioArrayType_renderGroups(::std::forward<ZSERIO_T_renderGroups>(renderGroups_));
    }

    explicit Mesh3DRenderData(::zserio::BitStreamReader& in,
            ::nds::core::geometry::PolyMesh3D& mesh_,
            ::nds::display::types::Mesh3DRenderLayerHeader& header_, const allocator_type& allocator = allocator_type());
    explicit Mesh3DRenderData(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::PolyMesh3D& mesh_,
            ::nds::display::types::Mesh3DRenderLayerHeader& header_, const allocator_type& allocator = allocator_type());

    ~Mesh3DRenderData() = default;

    Mesh3DRenderData(const Mesh3DRenderData& other);
    Mesh3DRenderData& operator=(const Mesh3DRenderData& other);

    Mesh3DRenderData(Mesh3DRenderData&& other);
    Mesh3DRenderData& operator=(Mesh3DRenderData&& other);

    Mesh3DRenderData(::zserio::PropagateAllocatorT,
            const Mesh3DRenderData& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::PolyMesh3D& mesh_,
            ::nds::display::types::Mesh3DRenderLayerHeader& header_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::PolyMesh3D& getMesh();
    const ::nds::core::geometry::PolyMesh3D& getMesh() const;

    ::nds::display::types::Mesh3DRenderLayerHeader& getHeader();
    const ::nds::display::types::Mesh3DRenderLayerHeader& getHeader() const;

    const ::nds::display::types::Mesh3DRenderConfiguration& getMesh3DRenderConfiguration() const;
    ::nds::display::types::Mesh3DRenderConfiguration& getMesh3DRenderConfiguration();
    void setMesh3DRenderConfiguration(const ::nds::display::types::Mesh3DRenderConfiguration& mesh3DRenderConfiguration_);
    void setMesh3DRenderConfiguration(::nds::display::types::Mesh3DRenderConfiguration&& mesh3DRenderConfiguration_);

    uint32_t getStartIndexNormals() const;
    void setStartIndexNormals(uint32_t startIndexNormals_);
    bool isStartIndexNormalsUsed() const;
    bool isStartIndexNormalsSet() const;
    void resetStartIndexNormals();

    uint32_t getStartIndexColors() const;
    void setStartIndexColors(uint32_t startIndexColors_);
    bool isStartIndexColorsUsed() const;
    bool isStartIndexColorsSet() const;
    void resetStartIndexColors();

    uint32_t getStartIndexTextureCoords() const;
    void setStartIndexTextureCoords(uint32_t startIndexTextureCoords_);
    bool isStartIndexTextureCoordsUsed() const;
    bool isStartIndexTextureCoordsSet() const;
    void resetStartIndexTextureCoords();

    uint32_t getStartIndexTextureCoordsAdditional() const;
    void setStartIndexTextureCoordsAdditional(uint32_t startIndexTextureCoordsAdditional_);
    bool isStartIndexTextureCoordsAdditionalUsed() const;
    bool isStartIndexTextureCoordsAdditionalSet() const;
    void resetStartIndexTextureCoordsAdditional();

    const ::zserio::vector<::nds::display::types::RenderGroup>& getRenderGroups() const;
    ::zserio::vector<::nds::display::types::RenderGroup>& getRenderGroups();
    void setRenderGroups(const ::zserio::vector<::nds::display::types::RenderGroup>& renderGroups_);
    void setRenderGroups(::zserio::vector<::nds::display::types::RenderGroup>&& renderGroups_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Mesh3DRenderData& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_renderGroups
    {
    public:
        using OwnerType = Mesh3DRenderData;

        static void initializeElement(Mesh3DRenderData& owner,
                ::nds::display::types::RenderGroup& element, size_t index);
    };

    class ZserioElementFactory_renderGroups
    {
    public:
        using OwnerType = Mesh3DRenderData;

        static void create(Mesh3DRenderData& owner,
                ::zserio::vector<::nds::display::types::RenderGroup>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Mesh3DRenderData& owner,
                ::zserio::vector<::nds::display::types::RenderGroup>& array,
                ::nds::display::types::RenderGroup::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_renderGroups = ::zserio::Array<::zserio::vector<::nds::display::types::RenderGroup>, ::zserio::ObjectArrayTraits<::nds::display::types::RenderGroup, ZserioElementFactory_renderGroups>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_renderGroups>;

    ::nds::display::types::Mesh3DRenderConfiguration readMesh3DRenderConfiguration(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::display::types::Mesh3DRenderConfiguration readMesh3DRenderConfiguration(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexNormals(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexNormals(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexColors(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexColors(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexTextureCoords(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexTextureCoords(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexTextureCoordsAdditional(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint32_t> readStartIndexTextureCoordsAdditional(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_renderGroups readRenderGroups(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_renderGroups readRenderGroups(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::PolyMesh3D* m_mesh_;
    ::nds::display::types::Mesh3DRenderLayerHeader* m_header_;
    bool m_isInitialized;
    ::nds::display::types::Mesh3DRenderConfiguration m_mesh3DRenderConfiguration_;
    ::zserio::InplaceOptionalHolder<uint32_t> m_startIndexNormals_;
    ::zserio::InplaceOptionalHolder<uint32_t> m_startIndexColors_;
    ::zserio::InplaceOptionalHolder<uint32_t> m_startIndexTextureCoords_;
    ::zserio::InplaceOptionalHolder<uint32_t> m_startIndexTextureCoordsAdditional_;
    ZserioArrayType_renderGroups m_renderGroups_;
};

} // namespace types
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_TYPES_MESH3_DRENDER_DATA_H