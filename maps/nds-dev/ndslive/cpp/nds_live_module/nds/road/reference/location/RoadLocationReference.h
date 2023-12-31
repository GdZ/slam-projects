/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_REFERENCE_LOCATION_ROAD_LOCATION_REFERENCE_H
#define NDS_ROAD_REFERENCE_LOCATION_ROAD_LOCATION_REFERENCE_H

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

#include <nds/core/location/RoadLocationId.h>
#include <nds/core/types/Direction.h>

namespace nds
{
namespace road
{
namespace reference
{
namespace location
{

class RoadLocationReference
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getDirection()
        {
            return m_direction_;
        }

        ::nds::core::location::RoadLocationId::ZserioPackingContext& getLocationId()
        {
            return m_locationId_;
        }

    private:
        ::zserio::DeltaContext m_direction_;
        ::nds::core::location::RoadLocationId::ZserioPackingContext m_locationId_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadLocationReference() noexcept :
            RoadLocationReference(allocator_type())
    {}

    explicit RoadLocationReference(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_locationId = ::nds::core::location::RoadLocationId>
    RoadLocationReference(
            ::nds::core::types::Direction direction_,
            ZSERIO_T_locationId&& locationId_,
            const allocator_type& allocator = allocator_type()) :
            RoadLocationReference(allocator)
    {
        m_direction_ = direction_;
        m_locationId_ = ::std::forward<ZSERIO_T_locationId>(locationId_);
    }

    explicit RoadLocationReference(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadLocationReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadLocationReference() = default;

    RoadLocationReference(const RoadLocationReference&) = default;
    RoadLocationReference& operator=(const RoadLocationReference&) = default;

    RoadLocationReference(RoadLocationReference&&) = default;
    RoadLocationReference& operator=(RoadLocationReference&&) = default;

    RoadLocationReference(::zserio::PropagateAllocatorT,
            const RoadLocationReference& other, const allocator_type& allocator);

    ::nds::core::types::Direction getDirection() const;
    void setDirection(::nds::core::types::Direction direction_);

    const ::nds::core::location::RoadLocationId& getLocationId() const;
    ::nds::core::location::RoadLocationId& getLocationId();
    void setLocationId(const ::nds::core::location::RoadLocationId& locationId_);
    void setLocationId(::nds::core::location::RoadLocationId&& locationId_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadLocationReference& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::Direction readDirection(::zserio::BitStreamReader& in);
    ::nds::core::types::Direction readDirection(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::location::RoadLocationId readLocationId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::location::RoadLocationId readLocationId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::types::Direction m_direction_;
    ::nds::core::location::RoadLocationId m_locationId_;
};

} // namespace location
} // namespace reference
} // namespace road
} // namespace nds

#endif // NDS_ROAD_REFERENCE_LOCATION_ROAD_LOCATION_REFERENCE_H
