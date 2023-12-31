/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_TYPES_SLOPE_POINT_H
#define NDS_ADAS_TYPES_SLOPE_POINT_H

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

#include <nds/adas/types/AdasGeometryPosition.h>
#include <nds/adas/types/Slope.h>

namespace nds
{
namespace adas
{
namespace types
{

class SlopePoint
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getPoint()
        {
            return m_point_;
        }

        ::zserio::DeltaContext& getSlope()
        {
            return m_slope_;
        }

    private:
        ::zserio::DeltaContext m_point_;
        ::zserio::DeltaContext m_slope_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    SlopePoint() noexcept :
            SlopePoint(allocator_type())
    {}

    explicit SlopePoint(const allocator_type& allocator) noexcept;

    SlopePoint(
            ::nds::adas::types::AdasGeometryPosition point_,
            ::nds::adas::types::Slope slope_,
            const allocator_type& allocator = allocator_type()) :
            SlopePoint(allocator)
    {
        m_point_ = point_;
        m_slope_ = slope_;
    }

    explicit SlopePoint(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit SlopePoint(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~SlopePoint() = default;

    SlopePoint(const SlopePoint&) = default;
    SlopePoint& operator=(const SlopePoint&) = default;

    SlopePoint(SlopePoint&&) = default;
    SlopePoint& operator=(SlopePoint&&) = default;

    SlopePoint(::zserio::PropagateAllocatorT,
            const SlopePoint& other, const allocator_type& allocator);

    ::nds::adas::types::AdasGeometryPosition getPoint() const;
    void setPoint(::nds::adas::types::AdasGeometryPosition point_);

    ::nds::adas::types::Slope getSlope() const;
    void setSlope(::nds::adas::types::Slope slope_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const SlopePoint& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::adas::types::AdasGeometryPosition readPoint(::zserio::BitStreamReader& in);
    ::nds::adas::types::AdasGeometryPosition readPoint(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::adas::types::Slope readSlope(::zserio::BitStreamReader& in);
    ::nds::adas::types::Slope readSlope(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::adas::types::AdasGeometryPosition m_point_;
    ::nds::adas::types::Slope m_slope_;
};

} // namespace types
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_TYPES_SLOPE_POINT_H
