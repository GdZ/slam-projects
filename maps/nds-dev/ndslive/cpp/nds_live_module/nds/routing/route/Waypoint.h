/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_ROUTE_WAYPOINT_H
#define NDS_ROUTING_ROUTE_WAYPOINT_H

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
#include <zserio/ArrayTraits.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/Position2D.h>
#include <nds/core/location/RoadLocationId.h>
#include <nds/core/location/RoadLocationPath.h>
#include <nds/core/types/TimeWithZone.h>
#include <nds/routing/types/WaypointType.h>

namespace nds
{
namespace routing
{
namespace route
{

class Waypoint
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::geometry::Position2D::ZserioPackingContext& getPosition()
        {
            return m_position_;
        }

        ::nds::core::location::RoadLocationPath::ZserioPackingContext& getLocationPath()
        {
            return m_locationPath_;
        }

        ::nds::core::location::RoadLocationId::ZserioPackingContext& getLocationId()
        {
            return m_locationId_;
        }

        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::nds::core::types::TimeWithZone::ZserioPackingContext& getDepartureTime()
        {
            return m_departureTime_;
        }

        ::nds::core::types::TimeWithZone::ZserioPackingContext& getArrivalTime()
        {
            return m_arrivalTime_;
        }

    private:
        ::nds::core::geometry::Position2D::ZserioPackingContext m_position_;
        ::nds::core::location::RoadLocationPath::ZserioPackingContext m_locationPath_;
        ::nds::core::location::RoadLocationId::ZserioPackingContext m_locationId_;
        ::zserio::DeltaContext m_type_;
        ::nds::core::types::TimeWithZone::ZserioPackingContext m_departureTime_;
        ::nds::core::types::TimeWithZone::ZserioPackingContext m_arrivalTime_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Waypoint() noexcept :
            Waypoint(allocator_type())
    {}

    explicit Waypoint(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_position = ::nds::core::geometry::Position2D,
            typename ZSERIO_T_locationPath = ::nds::core::location::RoadLocationPath,
            typename ZSERIO_T_locationId = ::nds::core::location::RoadLocationId,
            typename ZSERIO_T_rightSide = bool,
            typename ZSERIO_T_type = ::nds::routing::types::WaypointType,
            typename ZSERIO_T_departureTime = ::nds::core::types::TimeWithZone,
            typename ZSERIO_T_arrivalTime = ::nds::core::types::TimeWithZone,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_position, Waypoint, allocator_type> = 0>
    Waypoint(
            ZSERIO_T_position&& position_,
            ZSERIO_T_locationPath&& locationPath_,
            ZSERIO_T_locationId&& locationId_,
            ZSERIO_T_rightSide&& rightSide_,
            ZSERIO_T_type&& type_,
            ZSERIO_T_departureTime&& departureTime_,
            ZSERIO_T_arrivalTime&& arrivalTime_,
            const allocator_type& allocator = allocator_type()) :
            Waypoint(allocator)
    {
        m_position_ = ::std::forward<ZSERIO_T_position>(position_);
        m_locationPath_ = ::std::forward<ZSERIO_T_locationPath>(locationPath_);
        m_locationId_ = ::std::forward<ZSERIO_T_locationId>(locationId_);
        m_rightSide_ = ::std::forward<ZSERIO_T_rightSide>(rightSide_);
        m_type_ = ::std::forward<ZSERIO_T_type>(type_);
        m_departureTime_ = ::std::forward<ZSERIO_T_departureTime>(departureTime_);
        m_arrivalTime_ = ::std::forward<ZSERIO_T_arrivalTime>(arrivalTime_);
    }

    explicit Waypoint(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Waypoint(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Waypoint() = default;

    Waypoint(const Waypoint& other);
    Waypoint& operator=(const Waypoint& other);

    Waypoint(Waypoint&& other);
    Waypoint& operator=(Waypoint&& other);

    Waypoint(::zserio::PropagateAllocatorT,
            const Waypoint& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::core::geometry::Position2D& getPosition() const;
    ::nds::core::geometry::Position2D& getPosition();
    void setPosition(const ::nds::core::geometry::Position2D& position_);
    void setPosition(::nds::core::geometry::Position2D&& position_);

    const ::nds::core::location::RoadLocationPath& getLocationPath() const;
    ::nds::core::location::RoadLocationPath& getLocationPath();
    void setLocationPath(const ::nds::core::location::RoadLocationPath& locationPath_);
    void setLocationPath(::nds::core::location::RoadLocationPath&& locationPath_);
    bool isLocationPathUsed() const;
    bool isLocationPathSet() const;
    void resetLocationPath();

    const ::nds::core::location::RoadLocationId& getLocationId() const;
    ::nds::core::location::RoadLocationId& getLocationId();
    void setLocationId(const ::nds::core::location::RoadLocationId& locationId_);
    void setLocationId(::nds::core::location::RoadLocationId&& locationId_);
    bool isLocationIdUsed() const;
    bool isLocationIdSet() const;
    void resetLocationId();

    bool getRightSide() const;
    void setRightSide(bool rightSide_);
    bool isRightSideUsed() const;
    bool isRightSideSet() const;
    void resetRightSide();

    ::nds::routing::types::WaypointType getType() const;
    void setType(::nds::routing::types::WaypointType type_);
    bool isTypeUsed() const;
    bool isTypeSet() const;
    void resetType();

    const ::nds::core::types::TimeWithZone& getDepartureTime() const;
    ::nds::core::types::TimeWithZone& getDepartureTime();
    void setDepartureTime(const ::nds::core::types::TimeWithZone& departureTime_);
    void setDepartureTime(::nds::core::types::TimeWithZone&& departureTime_);
    bool isDepartureTimeUsed() const;
    bool isDepartureTimeSet() const;
    void resetDepartureTime();

    const ::nds::core::types::TimeWithZone& getArrivalTime() const;
    ::nds::core::types::TimeWithZone& getArrivalTime();
    void setArrivalTime(const ::nds::core::types::TimeWithZone& arrivalTime_);
    void setArrivalTime(::nds::core::types::TimeWithZone&& arrivalTime_);
    bool isArrivalTimeUsed() const;
    bool isArrivalTimeSet() const;
    void resetArrivalTime();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Waypoint& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::geometry::Position2D readPosition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::Position2D readPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationPath> readLocationPath(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationPath> readLocationPath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationId> readLocationId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationId> readLocationId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<bool> readRightSide(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::routing::types::WaypointType> readType(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::routing::types::WaypointType> readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readDepartureTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readDepartureTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readArrivalTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readArrivalTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::core::geometry::Position2D m_position_;
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationPath> m_locationPath_;
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationId> m_locationId_;
    ::zserio::InplaceOptionalHolder<bool> m_rightSide_;
    ::zserio::InplaceOptionalHolder<::nds::routing::types::WaypointType> m_type_;
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> m_departureTime_;
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> m_arrivalTime_;
};

} // namespace route
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_ROUTE_WAYPOINT_H