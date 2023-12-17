/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_GEOMETRY_LINE_POSITION_OFFSET3_D_H
#define NDS_CORE_GEOMETRY_LINE_POSITION_OFFSET3_D_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/CoordWidth.h>
#include <nds/core/geometry/LinePosition.h>
#include <nds/core/geometry/PositionOffset3D.h>

namespace nds
{
namespace core
{
namespace geometry
{

class LinePositionOffset3D
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLinePosition()
        {
            return m_linePosition_;
        }

        ::zserio::DeltaContext& getNumBitsXY()
        {
            return m_numBitsXY_;
        }

        ::zserio::DeltaContext& getNumBitsZ()
        {
            return m_numBitsZ_;
        }

        ::nds::core::geometry::PositionOffset3D::ZserioPackingContext& getOffset()
        {
            return m_offset_;
        }

    private:
        ::zserio::DeltaContext m_linePosition_;
        ::zserio::DeltaContext m_numBitsXY_;
        ::zserio::DeltaContext m_numBitsZ_;
        ::nds::core::geometry::PositionOffset3D::ZserioPackingContext m_offset_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LinePositionOffset3D() noexcept :
            LinePositionOffset3D(allocator_type())
    {}

    explicit LinePositionOffset3D(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_offset = ::nds::core::geometry::PositionOffset3D>
    LinePositionOffset3D(
            ::nds::core::geometry::LinePosition linePosition_,
            ::nds::core::geometry::CoordWidth numBitsXY_,
            ::nds::core::geometry::CoordWidth numBitsZ_,
            ZSERIO_T_offset&& offset_,
            const allocator_type& allocator = allocator_type()) :
            LinePositionOffset3D(allocator)
    {
        m_linePosition_ = linePosition_;
        m_numBitsXY_ = numBitsXY_;
        m_numBitsZ_ = numBitsZ_;
        m_offset_ = ::std::forward<ZSERIO_T_offset>(offset_);
    }

    explicit LinePositionOffset3D(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_, const allocator_type& allocator = allocator_type());
    explicit LinePositionOffset3D(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_, const allocator_type& allocator = allocator_type());

    ~LinePositionOffset3D() = default;

    LinePositionOffset3D(const LinePositionOffset3D& other);
    LinePositionOffset3D& operator=(const LinePositionOffset3D& other);

    LinePositionOffset3D(LinePositionOffset3D&& other);
    LinePositionOffset3D& operator=(LinePositionOffset3D&& other);

    LinePositionOffset3D(::zserio::PropagateAllocatorT,
            const LinePositionOffset3D& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift shiftXY_,
            ::nds::core::geometry::CoordShift shiftZ_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getShiftXY() const;

    ::nds::core::geometry::CoordShift getShiftZ() const;

    ::nds::core::geometry::LinePosition getLinePosition() const;
    void setLinePosition(::nds::core::geometry::LinePosition linePosition_);

    ::nds::core::geometry::CoordWidth getNumBitsXY() const;
    void setNumBitsXY(::nds::core::geometry::CoordWidth numBitsXY_);

    ::nds::core::geometry::CoordWidth getNumBitsZ() const;
    void setNumBitsZ(::nds::core::geometry::CoordWidth numBitsZ_);

    const ::nds::core::geometry::PositionOffset3D& getOffset() const;
    ::nds::core::geometry::PositionOffset3D& getOffset();
    void setOffset(const ::nds::core::geometry::PositionOffset3D& offset_);
    void setOffset(::nds::core::geometry::PositionOffset3D&& offset_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LinePositionOffset3D& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::geometry::LinePosition readLinePosition(::zserio::BitStreamReader& in);
    ::nds::core::geometry::LinePosition readLinePosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordWidth readNumBitsXY(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordWidth readNumBitsXY(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordWidth readNumBitsZ(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordWidth readNumBitsZ(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::PositionOffset3D readOffset(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::PositionOffset3D readOffset(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_shiftXY_;
    ::nds::core::geometry::CoordShift m_shiftZ_;
    bool m_isInitialized;
    ::nds::core::geometry::LinePosition m_linePosition_;
    ::nds::core::geometry::CoordWidth m_numBitsXY_;
    ::nds::core::geometry::CoordWidth m_numBitsZ_;
    ::nds::core::geometry::PositionOffset3D m_offset_;
};

} // namespace geometry
} // namespace core
} // namespace nds

#endif // NDS_CORE_GEOMETRY_LINE_POSITION_OFFSET3_D_H
