/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_SERVICES_RANGE_PROJECTION_RESPONSE_H
#define NDS_ROUTING_SERVICES_RANGE_PROJECTION_RESPONSE_H

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
#include <nds/core/geometry/Ring2D.h>

namespace nds
{
namespace routing
{
namespace services
{

class RangeProjectionResponse
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getShift()
        {
            return m_shift_;
        }

        ::nds::core::geometry::Ring2D::ZserioPackingContext& getGeometry()
        {
            return m_geometry_;
        }

    private:
        ::zserio::DeltaContext m_shift_;
        ::nds::core::geometry::Ring2D::ZserioPackingContext m_geometry_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RangeProjectionResponse() noexcept :
            RangeProjectionResponse(allocator_type())
    {}

    explicit RangeProjectionResponse(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_geometry = ::nds::core::geometry::Ring2D>
    RangeProjectionResponse(
            ::nds::core::geometry::CoordShift shift_,
            ZSERIO_T_geometry&& geometry_,
            const allocator_type& allocator = allocator_type()) :
            RangeProjectionResponse(allocator)
    {
        m_shift_ = shift_;
        m_geometry_ = ::std::forward<ZSERIO_T_geometry>(geometry_);
    }

    explicit RangeProjectionResponse(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RangeProjectionResponse(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RangeProjectionResponse() = default;

    RangeProjectionResponse(const RangeProjectionResponse& other);
    RangeProjectionResponse& operator=(const RangeProjectionResponse& other);

    RangeProjectionResponse(RangeProjectionResponse&& other);
    RangeProjectionResponse& operator=(RangeProjectionResponse&& other);

    RangeProjectionResponse(::zserio::PropagateAllocatorT,
            const RangeProjectionResponse& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::core::geometry::CoordShift getShift() const;
    void setShift(::nds::core::geometry::CoordShift shift_);

    const ::nds::core::geometry::Ring2D& getGeometry() const;
    ::nds::core::geometry::Ring2D& getGeometry();
    void setGeometry(const ::nds::core::geometry::Ring2D& geometry_);
    void setGeometry(::nds::core::geometry::Ring2D&& geometry_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RangeProjectionResponse& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::geometry::CoordShift readShift(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::Ring2D readGeometry(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::Ring2D readGeometry(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::core::geometry::CoordShift m_shift_;
    ::nds::core::geometry::Ring2D m_geometry_;
};

} // namespace services
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_SERVICES_RANGE_PROJECTION_RESPONSE_H
