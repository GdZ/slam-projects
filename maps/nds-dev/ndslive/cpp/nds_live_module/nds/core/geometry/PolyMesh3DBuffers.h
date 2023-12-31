/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_GEOMETRY_POLY_MESH3_DBUFFERS_H
#define NDS_CORE_GEOMETRY_POLY_MESH3_DBUFFERS_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/IndexBuffer.h>
#include <nds/core/geometry/PolyMesh3D.h>
#include <nds/core/geometry/PolyMesh3DType.h>
#include <nds/core/geometry/Position3D.h>

namespace nds
{
namespace core
{
namespace geometry
{

class PolyMesh3DBuffers
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumPositions()
        {
            return m_numPositions_;
        }

        ::nds::core::geometry::IndexBuffer::ZserioPackingContext& getIndexBuffer()
        {
            return m_indexBuffer_;
        }

    private:
        ::zserio::DeltaContext m_numPositions_;
        ::nds::core::geometry::IndexBuffer::ZserioPackingContext m_indexBuffer_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PolyMesh3DBuffers() noexcept :
            PolyMesh3DBuffers(allocator_type())
    {}

    explicit PolyMesh3DBuffers(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_positions = ::zserio::vector<::nds::core::geometry::Position3D>,
            typename ZSERIO_T_indexBuffer = ::nds::core::geometry::IndexBuffer,
            typename ZSERIO_T_polymeshes = ::zserio::vector<::nds::core::geometry::PolyMesh3D>>
    PolyMesh3DBuffers(
            uint32_t numPositions_,
            ZSERIO_T_positions&& positions_,
            ZSERIO_T_indexBuffer&& indexBuffer_,
            ZSERIO_T_polymeshes&& polymeshes_,
            const allocator_type& allocator = allocator_type()) :
            PolyMesh3DBuffers(allocator)
    {
        m_numPositions_ = numPositions_;
        m_positions_ = ZserioArrayType_positions(::std::forward<ZSERIO_T_positions>(positions_));
        m_indexBuffer_ = ::std::forward<ZSERIO_T_indexBuffer>(indexBuffer_);
        m_polymeshes_ = ZserioArrayType_polymeshes(::std::forward<ZSERIO_T_polymeshes>(polymeshes_));
    }

    explicit PolyMesh3DBuffers(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_,
            uint32_t numElements_,
            ::nds::core::geometry::PolyMesh3DType type_, const allocator_type& allocator = allocator_type());
    explicit PolyMesh3DBuffers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_,
            uint32_t numElements_,
            ::nds::core::geometry::PolyMesh3DType type_, const allocator_type& allocator = allocator_type());

    ~PolyMesh3DBuffers() = default;

    PolyMesh3DBuffers(const PolyMesh3DBuffers& other);
    PolyMesh3DBuffers& operator=(const PolyMesh3DBuffers& other);

    PolyMesh3DBuffers(PolyMesh3DBuffers&& other);
    PolyMesh3DBuffers& operator=(PolyMesh3DBuffers&& other);

    PolyMesh3DBuffers(::zserio::PropagateAllocatorT,
            const PolyMesh3DBuffers& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_,
            uint32_t numElements_,
            ::nds::core::geometry::PolyMesh3DType type_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getShiftXY() const;

    ::nds::core::geometry::CoordShift getShiftZ() const;

    uint32_t getNumElements() const;

    ::nds::core::geometry::PolyMesh3DType getType() const;

    uint32_t getNumPositions() const;
    void setNumPositions(uint32_t numPositions_);

    const ::zserio::vector<::nds::core::geometry::Position3D>& getPositions() const;
    ::zserio::vector<::nds::core::geometry::Position3D>& getPositions();
    void setPositions(const ::zserio::vector<::nds::core::geometry::Position3D>& positions_);
    void setPositions(::zserio::vector<::nds::core::geometry::Position3D>&& positions_);

    const ::nds::core::geometry::IndexBuffer& getIndexBuffer() const;
    ::nds::core::geometry::IndexBuffer& getIndexBuffer();
    void setIndexBuffer(const ::nds::core::geometry::IndexBuffer& indexBuffer_);
    void setIndexBuffer(::nds::core::geometry::IndexBuffer&& indexBuffer_);

    const ::zserio::vector<::nds::core::geometry::PolyMesh3D>& getPolymeshes() const;
    ::zserio::vector<::nds::core::geometry::PolyMesh3D>& getPolymeshes();
    void setPolymeshes(const ::zserio::vector<::nds::core::geometry::PolyMesh3D>& polymeshes_);
    void setPolymeshes(::zserio::vector<::nds::core::geometry::PolyMesh3D>&& polymeshes_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PolyMesh3DBuffers& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_positions
    {
    public:
        using OwnerType = PolyMesh3DBuffers;

        static void initializeElement(PolyMesh3DBuffers& owner,
                ::nds::core::geometry::Position3D& element, size_t index);
    };

    class ZserioElementFactory_positions
    {
    public:
        using OwnerType = PolyMesh3DBuffers;

        static void create(PolyMesh3DBuffers& owner,
                ::zserio::vector<::nds::core::geometry::Position3D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PolyMesh3DBuffers& owner,
                ::zserio::vector<::nds::core::geometry::Position3D>& array,
                ::nds::core::geometry::Position3D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_polymeshes
    {
    public:
        using OwnerType = PolyMesh3DBuffers;

        static void initializeElement(PolyMesh3DBuffers& owner,
                ::nds::core::geometry::PolyMesh3D& element, size_t index);
    };

    class ZserioElementFactory_polymeshes
    {
    public:
        using OwnerType = PolyMesh3DBuffers;

        static void create(PolyMesh3DBuffers& owner,
                ::zserio::vector<::nds::core::geometry::PolyMesh3D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PolyMesh3DBuffers& owner,
                ::zserio::vector<::nds::core::geometry::PolyMesh3D>& array,
                ::nds::core::geometry::PolyMesh3D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_positions = ::zserio::Array<::zserio::vector<::nds::core::geometry::Position3D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::Position3D, ZserioElementFactory_positions>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_positions>;
    using ZserioArrayType_polymeshes = ::zserio::Array<::zserio::vector<::nds::core::geometry::PolyMesh3D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::PolyMesh3D, ZserioElementFactory_polymeshes>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_polymeshes>;

    uint32_t readNumPositions(::zserio::BitStreamReader& in);
    uint32_t readNumPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_positions readPositions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_positions readPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::geometry::IndexBuffer readIndexBuffer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::IndexBuffer readIndexBuffer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_polymeshes readPolymeshes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_polymeshes readPolymeshes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_shiftXY_;
    ::nds::core::geometry::CoordShift m_shiftZ_;
    uint32_t m_numElements_;
    ::nds::core::geometry::PolyMesh3DType m_type_;
    bool m_isInitialized;
    uint32_t m_numPositions_;
    ZserioArrayType_positions m_positions_;
    ::nds::core::geometry::IndexBuffer m_indexBuffer_;
    ZserioArrayType_polymeshes m_polymeshes_;
};

} // namespace geometry
} // namespace core
} // namespace nds

#endif // NDS_CORE_GEOMETRY_POLY_MESH3_DBUFFERS_H
