/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_PARKING_PARKING_POSITION_RELATION_VALUE_H
#define NDS_VENUE_PARKING_PARKING_POSITION_RELATION_VALUE_H

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
#include <zserio/AnyHolder.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/venue/parking/ParkingPositionRelationType.h>
#include <nds/venue/parking/RoadNetworkAccess.h>
#include <nds/venue/parking/RoadNetworkAccessLaneReference.h>
#include <nds/venue/parking/RoadNetworkAccessRoadReference.h>
#include <nds/venue/reference/types/ParkingSectionId.h>
#include <nds/venue/reference/types/ParkingSpotId.h>

namespace nds
{
namespace venue
{
namespace parking
{

class ParkingPositionRelationValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_sectionId = 0,
        CHOICE_parkingSpotId = 1,
        CHOICE_outsideRoadReference = 2,
        CHOICE_outsideLaneReference = 3,
        CHOICE_roadNetworkAccess = 4,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::venue::reference::types::ParkingSectionId::ZserioPackingContext& getSectionId()
        {
            return m_sectionId_;
        }

        ::nds::venue::reference::types::ParkingSpotId::ZserioPackingContext& getParkingSpotId()
        {
            return m_parkingSpotId_;
        }

        ::nds::venue::parking::RoadNetworkAccessRoadReference::ZserioPackingContext& getOutsideRoadReference()
        {
            return m_outsideRoadReference_;
        }

        ::nds::venue::parking::RoadNetworkAccessLaneReference::ZserioPackingContext& getOutsideLaneReference()
        {
            return m_outsideLaneReference_;
        }

        ::nds::venue::parking::RoadNetworkAccess::ZserioPackingContext& getRoadNetworkAccess()
        {
            return m_roadNetworkAccess_;
        }

    private:
        ::nds::venue::reference::types::ParkingSectionId::ZserioPackingContext m_sectionId_;
        ::nds::venue::reference::types::ParkingSpotId::ZserioPackingContext m_parkingSpotId_;
        ::nds::venue::parking::RoadNetworkAccessRoadReference::ZserioPackingContext m_outsideRoadReference_;
        ::nds::venue::parking::RoadNetworkAccessLaneReference::ZserioPackingContext m_outsideLaneReference_;
        ::nds::venue::parking::RoadNetworkAccess::ZserioPackingContext m_roadNetworkAccess_;
    };

    ParkingPositionRelationValue() noexcept :
            ParkingPositionRelationValue(allocator_type())
    {}

    explicit ParkingPositionRelationValue(const allocator_type& allocator) noexcept;

    explicit ParkingPositionRelationValue(::zserio::BitStreamReader& in,
            ::nds::venue::parking::ParkingPositionRelationType type_, const allocator_type& allocator = allocator_type());
    explicit ParkingPositionRelationValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::venue::parking::ParkingPositionRelationType type_, const allocator_type& allocator = allocator_type());

    ~ParkingPositionRelationValue() = default;

    ParkingPositionRelationValue(const ParkingPositionRelationValue& other);
    ParkingPositionRelationValue& operator=(const ParkingPositionRelationValue& other);

    ParkingPositionRelationValue(ParkingPositionRelationValue&& other);
    ParkingPositionRelationValue& operator=(ParkingPositionRelationValue&& other);

    ParkingPositionRelationValue(::zserio::PropagateAllocatorT,
            const ParkingPositionRelationValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::venue::parking::ParkingPositionRelationType type_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::venue::parking::ParkingPositionRelationType getType() const;

    const ::nds::venue::reference::types::ParkingSectionId& getSectionId() const;
    ::nds::venue::reference::types::ParkingSectionId& getSectionId();
    void setSectionId(const ::nds::venue::reference::types::ParkingSectionId& sectionId_);
    void setSectionId(::nds::venue::reference::types::ParkingSectionId&& sectionId_);

    const ::nds::venue::reference::types::ParkingSpotId& getParkingSpotId() const;
    ::nds::venue::reference::types::ParkingSpotId& getParkingSpotId();
    void setParkingSpotId(const ::nds::venue::reference::types::ParkingSpotId& parkingSpotId_);
    void setParkingSpotId(::nds::venue::reference::types::ParkingSpotId&& parkingSpotId_);

    const ::nds::venue::parking::RoadNetworkAccessRoadReference& getOutsideRoadReference() const;
    ::nds::venue::parking::RoadNetworkAccessRoadReference& getOutsideRoadReference();
    void setOutsideRoadReference(const ::nds::venue::parking::RoadNetworkAccessRoadReference& outsideRoadReference_);
    void setOutsideRoadReference(::nds::venue::parking::RoadNetworkAccessRoadReference&& outsideRoadReference_);

    const ::nds::venue::parking::RoadNetworkAccessLaneReference& getOutsideLaneReference() const;
    ::nds::venue::parking::RoadNetworkAccessLaneReference& getOutsideLaneReference();
    void setOutsideLaneReference(const ::nds::venue::parking::RoadNetworkAccessLaneReference& outsideLaneReference_);
    void setOutsideLaneReference(::nds::venue::parking::RoadNetworkAccessLaneReference&& outsideLaneReference_);

    const ::nds::venue::parking::RoadNetworkAccess& getRoadNetworkAccess() const;
    ::nds::venue::parking::RoadNetworkAccess& getRoadNetworkAccess();
    void setRoadNetworkAccess(const ::nds::venue::parking::RoadNetworkAccess& roadNetworkAccess_);
    void setRoadNetworkAccess(::nds::venue::parking::RoadNetworkAccess&& roadNetworkAccess_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingPositionRelationValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::venue::parking::ParkingPositionRelationType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace parking
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_PARKING_PARKING_POSITION_RELATION_VALUE_H
