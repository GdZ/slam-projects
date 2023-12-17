/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_GEOMETRY_LINE3_D_H
#define NDS_CORE_GEOMETRY_LINE3_D_H

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
#include <nds/core/geometry/Position3D.h>

namespace nds
{
namespace core
{
namespace geometry
{

class Line3D
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumPositions()
        {
            return m_numPositions_;
        }

    private:
        ::zserio::DeltaContext m_numPositions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Line3D() noexcept :
            Line3D(allocator_type())
    {}

    explicit Line3D(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_positions = ::zserio::vector<::nds::core::geometry::Position3D>>
    Line3D(
            uint32_t numPositions_,
            ZSERIO_T_positions&& positions_,
            const allocator_type& allocator = allocator_type()) :
            Line3D(allocator)
    {
        m_numPositions_ = numPositions_;
        m_positions_ = ZserioArrayType_positions(::std::forward<ZSERIO_T_positions>(positions_));
    }

    explicit Line3D(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_, const allocator_type& allocator = allocator_type());
    explicit Line3D(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_, const allocator_type& allocator = allocator_type());

    ~Line3D() = default;

    Line3D(const Line3D& other);
    Line3D& operator=(const Line3D& other);

    Line3D(Line3D&& other);
    Line3D& operator=(Line3D&& other);

    Line3D(::zserio::PropagateAllocatorT,
            const Line3D& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getShiftXY() const;

    ::nds::core::geometry::CoordShift getShiftZ() const;

    uint32_t getNumPositions() const;
    void setNumPositions(uint32_t numPositions_);

    const ::zserio::vector<::nds::core::geometry::Position3D>& getPositions() const;
    ::zserio::vector<::nds::core::geometry::Position3D>& getPositions();
    void setPositions(const ::zserio::vector<::nds::core::geometry::Position3D>& positions_);
    void setPositions(::zserio::vector<::nds::core::geometry::Position3D>&& positions_);

    uint32_t funcLastPositionIdx() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Line3D& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_positions
    {
    public:
        using OwnerType = Line3D;

        static void initializeElement(Line3D& owner,
                ::nds::core::geometry::Position3D& element, size_t index);
    };

    class ZserioElementFactory_positions
    {
    public:
        using OwnerType = Line3D;

        static void create(Line3D& owner,
                ::zserio::vector<::nds::core::geometry::Position3D>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Line3D& owner,
                ::zserio::vector<::nds::core::geometry::Position3D>& array,
                ::nds::core::geometry::Position3D::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_positions = ::zserio::Array<::zserio::vector<::nds::core::geometry::Position3D>, ::zserio::ObjectArrayTraits<::nds::core::geometry::Position3D, ZserioElementFactory_positions>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_positions>;

    uint32_t readNumPositions(::zserio::BitStreamReader& in);
    uint32_t readNumPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_positions readPositions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_positions readPositions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_shiftXY_;
    ::nds::core::geometry::CoordShift m_shiftZ_;
    bool m_isInitialized;
    uint32_t m_numPositions_;
    ZserioArrayType_positions m_positions_;
};

} // namespace geometry
} // namespace core
} // namespace nds

#endif // NDS_CORE_GEOMETRY_LINE3_D_H