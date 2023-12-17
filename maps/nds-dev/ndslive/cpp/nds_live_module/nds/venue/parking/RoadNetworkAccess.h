/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_PARKING_ROAD_NETWORK_ACCESS_H
#define NDS_VENUE_PARKING_ROAD_NETWORK_ACCESS_H

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

#include <nds/venue/parking/RoadNetworkAccessType.h>
#include <nds/venue/reference/types/ParkingFacilityId.h>

namespace nds
{
namespace venue
{
namespace parking
{

class RoadNetworkAccess
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::venue::reference::types::ParkingFacilityId::ZserioPackingContext& getFacilityId()
        {
            return m_facilityId_;
        }

        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

    private:
        ::nds::venue::reference::types::ParkingFacilityId::ZserioPackingContext m_facilityId_;
        ::zserio::DeltaContext m_type_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadNetworkAccess() noexcept :
            RoadNetworkAccess(allocator_type())
    {}

    explicit RoadNetworkAccess(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_facilityId = ::nds::venue::reference::types::ParkingFacilityId,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_facilityId, RoadNetworkAccess, allocator_type> = 0>
    RoadNetworkAccess(
            ZSERIO_T_facilityId&& facilityId_,
            ::nds::venue::parking::RoadNetworkAccessType type_,
            const allocator_type& allocator = allocator_type()) :
            RoadNetworkAccess(allocator)
    {
        m_facilityId_ = ::std::forward<ZSERIO_T_facilityId>(facilityId_);
        m_type_ = type_;
    }

    explicit RoadNetworkAccess(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoadNetworkAccess(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoadNetworkAccess() = default;

    RoadNetworkAccess(const RoadNetworkAccess&) = default;
    RoadNetworkAccess& operator=(const RoadNetworkAccess&) = default;

    RoadNetworkAccess(RoadNetworkAccess&&) = default;
    RoadNetworkAccess& operator=(RoadNetworkAccess&&) = default;

    RoadNetworkAccess(::zserio::PropagateAllocatorT,
            const RoadNetworkAccess& other, const allocator_type& allocator);

    const ::nds::venue::reference::types::ParkingFacilityId& getFacilityId() const;
    ::nds::venue::reference::types::ParkingFacilityId& getFacilityId();
    void setFacilityId(const ::nds::venue::reference::types::ParkingFacilityId& facilityId_);
    void setFacilityId(::nds::venue::reference::types::ParkingFacilityId&& facilityId_);

    ::nds::venue::parking::RoadNetworkAccessType getType() const;
    void setType(::nds::venue::parking::RoadNetworkAccessType type_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadNetworkAccess& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::venue::reference::types::ParkingFacilityId readFacilityId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::venue::reference::types::ParkingFacilityId readFacilityId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::venue::parking::RoadNetworkAccessType readType(::zserio::BitStreamReader& in);
    ::nds::venue::parking::RoadNetworkAccessType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::venue::reference::types::ParkingFacilityId m_facilityId_;
    ::nds::venue::parking::RoadNetworkAccessType m_type_;
};

} // namespace parking
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_PARKING_ROAD_NETWORK_ACCESS_H