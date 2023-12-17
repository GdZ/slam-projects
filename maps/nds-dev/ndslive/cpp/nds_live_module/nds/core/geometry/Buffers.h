/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_GEOMETRY_BUFFERS_H
#define NDS_CORE_GEOMETRY_BUFFERS_H

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
#include <zserio/AnyHolder.h>
#include <memory>
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/GeometryLayerType.h>
#include <nds/core/geometry/Line2D.h>
#include <nds/core/geometry/Line3D.h>
#include <nds/core/geometry/PolyMesh3DBuffers.h>
#include <nds/core/geometry/PolyMesh3DType.h>
#include <nds/core/geometry/Polygon2DBuffers.h>
#include <nds/core/geometry/Position2D.h>
#include <nds/core/geometry/Position3D.h>
#include <nds/core/geometry/SimplePolygon2D.h>
#include <nds/core/geometry/SimplePolygonSet2D.h>

namespace nds
{
namespace core
{
namespace geometry
{

class Buffers
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_positions2D = 0,
        CHOICE_positions3D = 1,
        CHOICE_lines2D = 2,
        CHOICE_lines3D = 3,
        CHOICE_polygons2D = 4,
        CHOICE_polygons3D = 5,
        CHOICE_meshes3D = 6,
        CHOICE_simplePolygons2D = 7,
        CHOICE_simplePolygonSets2D = 8,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::core::geometry::Polygon2DBuffers::ZserioPackingContext& getPolygons2D()
        {
            return m_polygons2D_;
        }

        ::nds::core::geometry::PolyMesh3DBuffers::ZserioPackingContext& getPolygons3D()
        {
            return m_polygons3D_;
        }

        ::nds::core::geometry::PolyMesh3DBuffers::ZserioPackingContext& getMeshes3D()
        {
            return m_meshes3D_;
        }

    private:
        ::nds::core::geometry::Polygon2DBuffers::ZserioPackingContext m_polygons2D_;
        ::nds::core::geometry::PolyMesh3DBuffers::ZserioPackingContext m_polygons3D_;
        ::nds::core::geometry::PolyMesh3DBuffers::ZserioPackingContext m_meshes3D_;
    };

    Buffers() noexcept :
            Buffers(allocator_type())
    {}

    explicit Buffers(const allocator_type& allocator) noexcept;

    explicit Buffers(::zserio::BitStreamReader& in,
            ::nds::core::geometry::GeometryLayerType type_,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_,
            uint32_t numElements_, const allocator_type& allocator = allocator_type());
    explicit Buffers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::GeometryLayerType type_,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_,
            uint32_t numElements_, const allocator_type& allocator = allocator_type());

    ~Buffers() = default;

    Buffers(const Buffers& other);
    Buffers& operator=(const Buffers& other);

    Buffers(Buffers&& other);
    Buffers& operator=(Buffers&& other);

    Buffers(::zserio::PropagateAllocatorT,
            const Buffers& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::GeometryLayerType type_,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_,
            uint32_t numElements_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::core::geometry::GeometryLayerType getType() const;

    ::nds::core::geometry::CoordShift getShiftXY() const;

    ::nds::core::geometry::CoordShift getShiftZ() const;

    uint32_t getNumElements() const;

    const ::zserio::vector<::nds::core::geometry::Position2D>& getPositions2D() const;
    ::zserio::vector<::nds::core::geometry::Position2D>& getPositions2D();
    void setPositions2D(const ::zserio::vector<::nds::core::geometry::Position2D>& positions2D_);
    void setPositions2D(::zserio::vector<::nds::core::geometry::Position2D>&& positions2D_);

    const ::zserio::vector<::nds::core::geometry::Position3D>& getPositions3D() const;
    ::zserio::vector<::nds::core::geometry::Position3D>& getPositions3D();
    void setPositions3D(const ::zserio::vector<::nds::core::geometry::Position3D>& positions3D_);
    void setPositions3D(::zserio::vector<::nds::core::geometry::Position3D>&& positions3D_);

    const ::zserio::vector<::nds::core::geometry::Line2D>& getLines2D() const;
    ::zserio::vector<::nds::core::geometry::Line2D>& getLines2D();
    void setLines2D(const ::zserio::vector<::nds::core::geometry::Line2D>& lines2D_);
    void setLines2D(::zserio::vector<::nds::core::geometry::Line2D>&& lines2D_);

    const ::zserio::vector<::nds::core::geometry::Line3D>& getLines3D() const;
    ::zserio::vector<::nds::core::geometry::Line3D>& getLines3D();
    void setLines3D(const ::zserio::vector<::nds::core::geometry::Line3D>& lines3D_);
    void setLines3D(::zserio::vector<::nds::core::geometry::Line3D>&& lines3D_);

    const ::nds::core::geometry::Polygon2DBuffers& getPolygons2D() const;
    ::nds::core::geometry::Polygon2DBuffers& getPolygons2D();
    void setPolygons2D(const ::nds::core::geometry::Polygon2DBuffers& polygons2D_);
    void setPolygons2D(::nds::core::geometry::Polygon2DBuffers&& polygons2D_);

    const ::nds::core::geometry::PolyMesh3DBuffers& getPolygons3D() const;
    ::nds::core::geometry::PolyMesh3DBuffers& getPolygons3D();
    void setPolygons3D(const ::nds::core::geometry::PolyMesh3DBuffers& polygons3D_);
    void setPolygons3D(::nds::core::geometry::PolyMesh3DBuffers&& polygons3D_);

    const ::nds::core::geometry::PolyMesh3DBuffers& getMeshes3D() const;
    ::nds::core::geometry::PolyMesh3DBuffers& getMeshes3D();
    void setMeshes3D(const ::nds::core::geometry::PolyMesh3DBuffers& meshes3D_);
    void setMeshes3D(::nds::core::geometry::PolyMesh3DBuffers&& meshes3D_);

    const ::zserio::vector<::nds::core::geometry::SimplePolygon2D>& getSimplePolygons2D() const;
    ::zserio::vector<::nds::core::geometry::SimplePolygon2D>& getSimplePolygons2D();
    void setSimplePolygons2D(const ::zserio::vector<::nds::core::geometry::SimplePolygon2D>& simplePolygons2D_);
    void setSimplePolygons2D(::zserio::vector<::nds::core::geometry::SimplePolygon2D>&& simplePolygons2D_);

    const ::zserio::vector<::nds::core::geometry::SimplePolygonSet2D>& getSimplePolygonSets2D() const;
    ::zserio::vector<::nds::core::geometry::SimplePolygonSet2D>& getSimplePolygonSets2D();
    void setSimplePolygonSets2D(const ::zserio::vector<::nds::core::geometry::SimplePolygonSet2D>& simplePolygonSets2D_);
    void setSimplePolygonSets2D(::zserio::vector<::nds::core::geometry::SimplePolygonSet2D>&& simplePolygonSets2D_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Buffers& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_positions2D
    {
    public:
        using OwnerType = Buffers;

        static void initializeElement(Buffers& owner,
                ::nds::core::geometry::Position2D& element, size_t index);
    };

    class ZserioElementFactory_positions2D
    {
    public:
        using OwnerType = Buffers;

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Position2D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Position2D>& array,
                ::nds::core::geometry::Position2D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_positions3D
    {
    public:
        using OwnerType = Buffers;

        static void initializeElement(Buffers& owner,
                ::nds::core::geometry::Position3D& element, size_t index);
    };

    class ZserioElementFactory_positions3D
    {
    public:
        using OwnerType = Buffers;

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Position3D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Position3D>& array,
                ::nds::core::geometry::Position3D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_lines2D
    {
    public:
        using OwnerType = Buffers;

        static void initializeElement(Buffers& owner,
                ::nds::core::geometry::Line2D& element, size_t index);
    };

    class ZserioElementFactory_lines2D
    {
    public:
        using OwnerType = Buffers;

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Line2D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Line2D>& array,
                ::nds::core::geometry::Line2D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_lines3D
    {
    public:
        using OwnerType = Buffers;

        static void initializeElement(Buffers& owner,
                ::nds::core::geometry::Line3D& element, size_t index);
    };

    class ZserioElementFactory_lines3D
    {
    public:
        using OwnerType = Buffers;

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Line3D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::Line3D>& array,
                ::nds::core::geometry::Line3D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_simplePolygons2D
    {
    public:
        using OwnerType = Buffers;

        static void initializeElement(Buffers& owner,
                ::nds::core::geometry::SimplePolygon2D& element, size_t index);
    };

    class ZserioElementFactory_simplePolygons2D
    {
    public:
        using OwnerType = Buffers;

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::SimplePolygon2D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::SimplePolygon2D>& array,
                ::nds::core::geometry::SimplePolygon2D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_simplePolygonSets2D
    {
    public:
        using OwnerType = Buffers;

        static void initializeElement(Buffers& owner,
                ::nds::core::geometry::SimplePolygonSet2D& element, size_t index);
    };

    class ZserioElementFactory_simplePolygonSets2D
    {
    public:
        using OwnerType = Buffers;

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::SimplePolygonSet2D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Buffers& owner,
                ::zserio::vector<::nds::core::geometry::SimplePolygonSet2D>& array,
                ::nds::core::geometry::SimplePolygonSet2D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_positions2D = ::zserio::Array<::zserio::vector<::nds::core::geometry::Position2D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::Position2D, ZserioElementFactory_positions2D>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_positions2D>;
    using ZserioArrayType_positions3D = ::zserio::Array<::zserio::vector<::nds::core::geometry::Position3D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::Position3D, ZserioElementFactory_positions3D>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_positions3D>;
    using ZserioArrayType_lines2D = ::zserio::Array<::zserio::vector<::nds::core::geometry::Line2D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::Line2D, ZserioElementFactory_lines2D>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_lines2D>;
    using ZserioArrayType_lines3D = ::zserio::Array<::zserio::vector<::nds::core::geometry::Line3D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::Line3D, ZserioElementFactory_lines3D>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_lines3D>;
    using ZserioArrayType_simplePolygons2D = ::zserio::Array<::zserio::vector<::nds::core::geometry::SimplePolygon2D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::SimplePolygon2D, ZserioElementFactory_simplePolygons2D>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_simplePolygons2D>;
    using ZserioArrayType_simplePolygonSets2D = ::zserio::Array<::zserio::vector<::nds::core::geometry::SimplePolygonSet2D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::SimplePolygonSet2D, ZserioElementFactory_simplePolygonSets2D>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_simplePolygonSets2D>;

    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::core::geometry::GeometryLayerType m_type_;
    ::nds::core::geometry::CoordShift m_shiftXY_;
    ::nds::core::geometry::CoordShift m_shiftZ_;
    uint32_t m_numElements_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace geometry
} // namespace core
} // namespace nds

#endif // NDS_CORE_GEOMETRY_BUFFERS_H
