/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_BOUNDARIES_BOUNDARY_ELEMENT_RANGE_H
#define NDS_LANE_BOUNDARIES_BOUNDARY_ELEMENT_RANGE_H

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

#include <nds/lane/boundaries/BoundaryElementId.h>
#include <nds/lane/reference/types/BoundaryGeometryRange.h>

namespace nds
{
namespace lane
{
namespace boundaries
{

class BoundaryElementRange
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getBoundaryElementId()
        {
            return m_boundaryElementId_;
        }

        ::nds::lane::reference::types::BoundaryGeometryRange::ZserioPackingContext& getRange()
        {
            return m_range_;
        }

    private:
        ::zserio::DeltaContext m_boundaryElementId_;
        ::nds::lane::reference::types::BoundaryGeometryRange::ZserioPackingContext m_range_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    BoundaryElementRange() noexcept :
            BoundaryElementRange(allocator_type())
    {}

    explicit BoundaryElementRange(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_range = ::nds::lane::reference::types::BoundaryGeometryRange>
    BoundaryElementRange(
            ::nds::lane::boundaries::BoundaryElementId boundaryElementId_,
            ZSERIO_T_range&& range_,
            const allocator_type& allocator = allocator_type()) :
            BoundaryElementRange(allocator)
    {
        m_boundaryElementId_ = boundaryElementId_;
        m_range_ = ::std::forward<ZSERIO_T_range>(range_);
    }

    explicit BoundaryElementRange(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit BoundaryElementRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~BoundaryElementRange() = default;

    BoundaryElementRange(const BoundaryElementRange&) = default;
    BoundaryElementRange& operator=(const BoundaryElementRange&) = default;

    BoundaryElementRange(BoundaryElementRange&&) = default;
    BoundaryElementRange& operator=(BoundaryElementRange&&) = default;

    BoundaryElementRange(::zserio::PropagateAllocatorT,
            const BoundaryElementRange& other, const allocator_type& allocator);

    ::nds::lane::boundaries::BoundaryElementId getBoundaryElementId() const;
    void setBoundaryElementId(::nds::lane::boundaries::BoundaryElementId boundaryElementId_);

    const ::nds::lane::reference::types::BoundaryGeometryRange& getRange() const;
    ::nds::lane::reference::types::BoundaryGeometryRange& getRange();
    void setRange(const ::nds::lane::reference::types::BoundaryGeometryRange& range_);
    void setRange(::nds::lane::reference::types::BoundaryGeometryRange&& range_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const BoundaryElementRange& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::boundaries::BoundaryElementId readBoundaryElementId(::zserio::BitStreamReader& in);
    ::nds::lane::boundaries::BoundaryElementId readBoundaryElementId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::reference::types::BoundaryGeometryRange readRange(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::reference::types::BoundaryGeometryRange readRange(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::lane::boundaries::BoundaryElementId m_boundaryElementId_;
    ::nds::lane::reference::types::BoundaryGeometryRange m_range_;
};

} // namespace boundaries
} // namespace lane
} // namespace nds

#endif // NDS_LANE_BOUNDARIES_BOUNDARY_ELEMENT_RANGE_H