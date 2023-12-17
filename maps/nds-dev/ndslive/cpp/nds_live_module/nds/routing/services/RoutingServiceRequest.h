/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_SERVICES_ROUTING_SERVICE_REQUEST_H
#define NDS_ROUTING_SERVICES_ROUTING_SERVICE_REQUEST_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/BitBuffer.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/location/RoadLocationPath.h>
#include <nds/core/types/LanguageCode.h>
#include <nds/core/types/TimeWithZone.h>
#include <nds/core/vehicle/VehicleDetails.h>
#include <nds/core/vehicle/VehiclePose.h>
#include <nds/routing/route/RouteOptions.h>
#include <nds/routing/route/Waypoint.h>
#include <nds/routing/types/DriverProfile.h>
#include <nds/routing/types/RouteType.h>

namespace nds
{
namespace routing
{
namespace services
{

class RoutingServiceRequest
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLanguage()
        {
            return m_language_;
        }

        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::nds::routing::route::Waypoint::ZserioPackingContext& getOrigin()
        {
            return m_origin_;
        }

        ::nds::routing::route::Waypoint::ZserioPackingContext& getDestination()
        {
            return m_destination_;
        }

        ::nds::core::vehicle::VehicleDetails::ZserioPackingContext& getVehicleDetails()
        {
            return m_vehicleDetails_;
        }

        ::nds::core::vehicle::VehiclePose::ZserioPackingContext& getVehiclePose()
        {
            return m_vehiclePose_;
        }

        ::nds::routing::types::DriverProfile::ZserioPackingContext& getDriverProfile()
        {
            return m_driverProfile_;
        }

        ::zserio::DeltaContext& getNumAlternativeRoutes()
        {
            return m_numAlternativeRoutes_;
        }

        ::nds::core::types::TimeWithZone::ZserioPackingContext& getDepartureTime()
        {
            return m_departureTime_;
        }

        ::nds::core::types::TimeWithZone::ZserioPackingContext& getArrivalTime()
        {
            return m_arrivalTime_;
        }

        ::nds::core::location::RoadLocationPath::ZserioPackingContext& getCoveredPath()
        {
            return m_coveredPath_;
        }

    private:
        ::zserio::DeltaContext m_language_;
        ::zserio::DeltaContext m_type_;
        ::nds::routing::route::Waypoint::ZserioPackingContext m_origin_;
        ::nds::routing::route::Waypoint::ZserioPackingContext m_destination_;
        ::nds::core::vehicle::VehicleDetails::ZserioPackingContext m_vehicleDetails_;
        ::nds::core::vehicle::VehiclePose::ZserioPackingContext m_vehiclePose_;
        ::nds::routing::types::DriverProfile::ZserioPackingContext m_driverProfile_;
        ::zserio::DeltaContext m_numAlternativeRoutes_;
        ::nds::core::types::TimeWithZone::ZserioPackingContext m_departureTime_;
        ::nds::core::types::TimeWithZone::ZserioPackingContext m_arrivalTime_;
        ::nds::core::location::RoadLocationPath::ZserioPackingContext m_coveredPath_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoutingServiceRequest() noexcept :
            RoutingServiceRequest(allocator_type())
    {}

    explicit RoutingServiceRequest(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_origin = ::nds::routing::route::Waypoint,
            typename ZSERIO_T_destination = ::nds::routing::route::Waypoint,
            typename ZSERIO_T_viaPoints = ::zserio::vector<::nds::routing::route::Waypoint>,
            typename ZSERIO_T_routeOptions = ::zserio::vector<::nds::routing::route::RouteOptions>,
            typename ZSERIO_T_vehicleDetails = ::nds::core::vehicle::VehicleDetails,
            typename ZSERIO_T_vehiclePose = ::nds::core::vehicle::VehiclePose,
            typename ZSERIO_T_driverProfile = ::nds::routing::types::DriverProfile,
            typename ZSERIO_T_departureTime = ::nds::core::types::TimeWithZone,
            typename ZSERIO_T_arrivalTime = ::nds::core::types::TimeWithZone,
            typename ZSERIO_T_coveredPath = ::nds::core::location::RoadLocationPath,
            typename ZSERIO_T_customRequestData = ::zserio::BitBuffer>
    RoutingServiceRequest(
            bool optimizeViaPoints_,
            ::nds::core::types::LanguageCode language_,
            ::nds::routing::types::RouteType type_,
            ZSERIO_T_origin&& origin_,
            ZSERIO_T_destination&& destination_,
            ZSERIO_T_viaPoints&& viaPoints_,
            ZSERIO_T_routeOptions&& routeOptions_,
            ZSERIO_T_vehicleDetails&& vehicleDetails_,
            ZSERIO_T_vehiclePose&& vehiclePose_,
            ZSERIO_T_driverProfile&& driverProfile_,
            uint8_t numAlternativeRoutes_,
            ZSERIO_T_departureTime&& departureTime_,
            ZSERIO_T_arrivalTime&& arrivalTime_,
            ZSERIO_T_coveredPath&& coveredPath_,
            ZSERIO_T_customRequestData&& customRequestData_,
            const allocator_type& allocator = allocator_type()) :
            RoutingServiceRequest(allocator)
    {
        m_optimizeViaPoints_ = optimizeViaPoints_;
        m_language_ = language_;
        m_type_ = type_;
        m_origin_ = ::std::forward<ZSERIO_T_origin>(origin_);
        m_destination_ = ::std::forward<ZSERIO_T_destination>(destination_);
        m_viaPoints_ = ::zserio::createOptionalArray<ZserioArrayType_viaPoints>(::std::forward<ZSERIO_T_viaPoints>(viaPoints_));
        m_routeOptions_ = ::zserio::createOptionalArray<ZserioArrayType_routeOptions>(::std::forward<ZSERIO_T_routeOptions>(routeOptions_));
        m_vehicleDetails_ = ::std::forward<ZSERIO_T_vehicleDetails>(vehicleDetails_);
        m_vehiclePose_ = ::std::forward<ZSERIO_T_vehiclePose>(vehiclePose_);
        m_driverProfile_ = ::std::forward<ZSERIO_T_driverProfile>(driverProfile_);
        m_numAlternativeRoutes_ = numAlternativeRoutes_;
        m_departureTime_ = ::std::forward<ZSERIO_T_departureTime>(departureTime_);
        m_arrivalTime_ = ::std::forward<ZSERIO_T_arrivalTime>(arrivalTime_);
        m_coveredPath_ = ::std::forward<ZSERIO_T_coveredPath>(coveredPath_);
        m_customRequestData_ = ::std::forward<ZSERIO_T_customRequestData>(customRequestData_);
    }

    explicit RoutingServiceRequest(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RoutingServiceRequest(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RoutingServiceRequest() = default;

    RoutingServiceRequest(const RoutingServiceRequest&) = default;
    RoutingServiceRequest& operator=(const RoutingServiceRequest&) = default;

    RoutingServiceRequest(RoutingServiceRequest&&) = default;
    RoutingServiceRequest& operator=(RoutingServiceRequest&&) = default;

    RoutingServiceRequest(::zserio::PropagateAllocatorT,
            const RoutingServiceRequest& other, const allocator_type& allocator);

    void initializeChildren();

    bool getOptimizeViaPoints() const;
    void setOptimizeViaPoints(bool optimizeViaPoints_);

    ::nds::core::types::LanguageCode getLanguage() const;
    void setLanguage(::nds::core::types::LanguageCode language_);

    ::nds::routing::types::RouteType getType() const;
    void setType(::nds::routing::types::RouteType type_);

    const ::nds::routing::route::Waypoint& getOrigin() const;
    ::nds::routing::route::Waypoint& getOrigin();
    void setOrigin(const ::nds::routing::route::Waypoint& origin_);
    void setOrigin(::nds::routing::route::Waypoint&& origin_);

    const ::nds::routing::route::Waypoint& getDestination() const;
    ::nds::routing::route::Waypoint& getDestination();
    void setDestination(const ::nds::routing::route::Waypoint& destination_);
    void setDestination(::nds::routing::route::Waypoint&& destination_);

    const ::zserio::vector<::nds::routing::route::Waypoint>& getViaPoints() const;
    ::zserio::vector<::nds::routing::route::Waypoint>& getViaPoints();
    void setViaPoints(const ::zserio::vector<::nds::routing::route::Waypoint>& viaPoints_);
    void setViaPoints(::zserio::vector<::nds::routing::route::Waypoint>&& viaPoints_);
    bool isViaPointsUsed() const;
    bool isViaPointsSet() const;
    void resetViaPoints();

    const ::zserio::vector<::nds::routing::route::RouteOptions>& getRouteOptions() const;
    ::zserio::vector<::nds::routing::route::RouteOptions>& getRouteOptions();
    void setRouteOptions(const ::zserio::vector<::nds::routing::route::RouteOptions>& routeOptions_);
    void setRouteOptions(::zserio::vector<::nds::routing::route::RouteOptions>&& routeOptions_);
    bool isRouteOptionsUsed() const;
    bool isRouteOptionsSet() const;
    void resetRouteOptions();

    const ::nds::core::vehicle::VehicleDetails& getVehicleDetails() const;
    ::nds::core::vehicle::VehicleDetails& getVehicleDetails();
    void setVehicleDetails(const ::nds::core::vehicle::VehicleDetails& vehicleDetails_);
    void setVehicleDetails(::nds::core::vehicle::VehicleDetails&& vehicleDetails_);
    bool isVehicleDetailsUsed() const;
    bool isVehicleDetailsSet() const;
    void resetVehicleDetails();

    const ::nds::core::vehicle::VehiclePose& getVehiclePose() const;
    ::nds::core::vehicle::VehiclePose& getVehiclePose();
    void setVehiclePose(const ::nds::core::vehicle::VehiclePose& vehiclePose_);
    void setVehiclePose(::nds::core::vehicle::VehiclePose&& vehiclePose_);
    bool isVehiclePoseUsed() const;
    bool isVehiclePoseSet() const;
    void resetVehiclePose();

    const ::nds::routing::types::DriverProfile& getDriverProfile() const;
    ::nds::routing::types::DriverProfile& getDriverProfile();
    void setDriverProfile(const ::nds::routing::types::DriverProfile& driverProfile_);
    void setDriverProfile(::nds::routing::types::DriverProfile&& driverProfile_);
    bool isDriverProfileUsed() const;
    bool isDriverProfileSet() const;
    void resetDriverProfile();

    uint8_t getNumAlternativeRoutes() const;
    void setNumAlternativeRoutes(uint8_t numAlternativeRoutes_);

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

    const ::nds::core::location::RoadLocationPath& getCoveredPath() const;
    ::nds::core::location::RoadLocationPath& getCoveredPath();
    void setCoveredPath(const ::nds::core::location::RoadLocationPath& coveredPath_);
    void setCoveredPath(::nds::core::location::RoadLocationPath&& coveredPath_);
    bool isCoveredPathUsed() const;
    bool isCoveredPathSet() const;
    void resetCoveredPath();

    const ::zserio::BitBuffer& getCustomRequestData() const;
    ::zserio::BitBuffer& getCustomRequestData();
    void setCustomRequestData(const ::zserio::BitBuffer& customRequestData_);
    void setCustomRequestData(::zserio::BitBuffer&& customRequestData_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoutingServiceRequest& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_viaPoints
    {
    public:
        using OwnerType = RoutingServiceRequest;

        static void initializeElement(RoutingServiceRequest& owner,
                ::nds::routing::route::Waypoint& element, size_t index);
    };

    class ZserioElementFactory_viaPoints
    {
    public:
        using OwnerType = RoutingServiceRequest;

        static void create(RoutingServiceRequest& owner,
                ::zserio::vector<::nds::routing::route::Waypoint>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RoutingServiceRequest& owner,
                ::zserio::vector<::nds::routing::route::Waypoint>& array,
                ::nds::routing::route::Waypoint::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioElementFactory_routeOptions
    {
    public:
        using OwnerType = RoutingServiceRequest;

        static void create(RoutingServiceRequest& owner,
                ::zserio::vector<::nds::routing::route::RouteOptions>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RoutingServiceRequest& owner,
                ::zserio::vector<::nds::routing::route::RouteOptions>& array,
                ::nds::routing::route::RouteOptions::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_viaPoints = ::zserio::Array<::zserio::vector<::nds::routing::route::Waypoint>, ::zserio::ObjectArrayTraits<::nds::routing::route::Waypoint, ZserioElementFactory_viaPoints>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_viaPoints>;
    using ZserioArrayType_routeOptions = ::zserio::Array<::zserio::vector<::nds::routing::route::RouteOptions>, ::zserio::ObjectArrayTraits<::nds::routing::route::RouteOptions, ZserioElementFactory_routeOptions>, ::zserio::ArrayType::AUTO>;

    bool readOptimizeViaPoints(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readLanguage(::zserio::BitStreamReader& in);
    ::nds::core::types::LanguageCode readLanguage(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::routing::types::RouteType readType(::zserio::BitStreamReader& in);
    ::nds::routing::types::RouteType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::routing::route::Waypoint readOrigin(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::routing::route::Waypoint readOrigin(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::routing::route::Waypoint readDestination(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::routing::route::Waypoint readDestination(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_viaPoints> readViaPoints(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_viaPoints> readViaPoints(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_routeOptions> readRouteOptions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_routeOptions> readRouteOptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehicleDetails> readVehicleDetails(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehicleDetails> readVehicleDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehiclePose> readVehiclePose(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehiclePose> readVehiclePose(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::types::DriverProfile> readDriverProfile(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::types::DriverProfile> readDriverProfile(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    uint8_t readNumAlternativeRoutes(::zserio::BitStreamReader& in);
    uint8_t readNumAlternativeRoutes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readDepartureTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readDepartureTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readArrivalTime(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> readArrivalTime(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationPath> readCoveredPath(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationPath> readCoveredPath(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::BitBuffer readCustomRequestData(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    bool m_optimizeViaPoints_;
    ::nds::core::types::LanguageCode m_language_;
    ::nds::routing::types::RouteType m_type_;
    ::nds::routing::route::Waypoint m_origin_;
    ::nds::routing::route::Waypoint m_destination_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_viaPoints> m_viaPoints_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_routeOptions> m_routeOptions_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehicleDetails> m_vehicleDetails_;
    ::zserio::InplaceOptionalHolder<::nds::core::vehicle::VehiclePose> m_vehiclePose_;
    ::zserio::InplaceOptionalHolder<::nds::routing::types::DriverProfile> m_driverProfile_;
    uint8_t m_numAlternativeRoutes_;
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> m_departureTime_;
    ::zserio::InplaceOptionalHolder<::nds::core::types::TimeWithZone> m_arrivalTime_;
    ::zserio::InplaceOptionalHolder<::nds::core::location::RoadLocationPath> m_coveredPath_;
    ::zserio::BitBuffer m_customRequestData_;
};

} // namespace services
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_SERVICES_ROUTING_SERVICE_REQUEST_H