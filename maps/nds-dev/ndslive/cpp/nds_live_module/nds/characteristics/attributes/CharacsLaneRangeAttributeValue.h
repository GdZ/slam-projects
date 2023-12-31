/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_LANE_RANGE_ATTRIBUTE_VALUE_H
#define NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_LANE_RANGE_ATTRIBUTE_VALUE_H

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

#include <nds/characteristics/attributes/CharacsLaneRangeAttributeType.h>
#include <nds/characteristics/types/ComplexIntersectionType.h>
#include <nds/characteristics/types/DividerType.h>
#include <nds/characteristics/types/FerryType.h>
#include <nds/characteristics/types/FrictionCoefficient.h>
#include <nds/characteristics/types/GradeType.h>
#include <nds/characteristics/types/HasSidewalk.h>
#include <nds/characteristics/types/HasStreetLights.h>
#include <nds/characteristics/types/InBusinessDistrict.h>
#include <nds/characteristics/types/LaneWidthState.h>
#include <nds/characteristics/types/MetricLaneWidth.h>
#include <nds/characteristics/types/MovableBridge.h>
#include <nds/characteristics/types/MultiDigitizedLaneGroupReference.h>
#include <nds/characteristics/types/PavementType.h>
#include <nds/characteristics/types/PedestrianCrossing.h>
#include <nds/characteristics/types/RailwayCrossing.h>
#include <nds/characteristics/types/RoadLocationAssignment.h>
#include <nds/characteristics/types/RoadMedian.h>
#include <nds/characteristics/types/SharedRoadSurfaceWithPedestrians.h>
#include <nds/characteristics/types/StartOrDestinationRoadOnly.h>
#include <nds/characteristics/types/StationPlazaType.h>
#include <nds/characteristics/types/Stubble.h>
#include <nds/characteristics/types/SuperElevationClass.h>
#include <nds/characteristics/types/TrafficCalming.h>
#include <nds/core/types/FunctionalRoadClass.h>
#include <nds/core/types/GlobalSourceId.h>
#include <nds/core/types/LaneType.h>
#include <nds/core/types/PriorityRoadClass.h>
#include <nds/core/types/SpeedKmh.h>

namespace nds
{
namespace characteristics
{
namespace attributes
{

class CharacsLaneRangeAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_laneType = 0,
        CHOICE_metricLaneWidth = 1,
        CHOICE_pavementType = 2,
        CHOICE_dividerType = 3,
        CHOICE_gradeType = 4,
        CHOICE_railwayCrossing = 5,
        CHOICE_pedestrianCrossing = 6,
        CHOICE_trafficCalming = 7,
        CHOICE_movableBridge = 8,
        CHOICE_superElevation = 9,
        CHOICE_roadMedian = 10,
        CHOICE_hasSidewalk = 11,
        CHOICE_frictionCoefficient = 12,
        CHOICE_stationPlazaType = 13,
        CHOICE_averageSpeed = 14,
        CHOICE_functionalRoadClass = 15,
        CHOICE_priorityRoadClass = 16,
        CHOICE_laneWidthState = 17,
        CHOICE_complexIntersectionType = 18,
        CHOICE_startOrDestinationRoadOnly = 19,
        CHOICE_roadLocationId = 20,
        CHOICE_hasStreetLights = 21,
        CHOICE_sharedRoadSurfaceWithPedestrians = 22,
        CHOICE_inBusinessDistrict = 23,
        CHOICE_ferryType = 24,
        CHOICE_stubble = 25,
        CHOICE_middleDividerType = 26,
        CHOICE_multiDigitizedLaneGroupReference = 27,
        CHOICE_globalSourceId = 28,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::core::types::LaneType::ZserioPackingContext& getLaneType()
        {
            return m_laneType_;
        }

        ::zserio::DeltaContext& getMetricLaneWidth()
        {
            return m_metricLaneWidth_;
        }

        ::zserio::DeltaContext& getPavementType()
        {
            return m_pavementType_;
        }

        ::zserio::DeltaContext& getDividerType()
        {
            return m_dividerType_;
        }

        ::zserio::DeltaContext& getGradeType()
        {
            return m_gradeType_;
        }

        ::zserio::DeltaContext& getRailwayCrossing()
        {
            return m_railwayCrossing_;
        }

        ::zserio::DeltaContext& getTrafficCalming()
        {
            return m_trafficCalming_;
        }

        ::zserio::DeltaContext& getSuperElevation()
        {
            return m_superElevation_;
        }

        ::nds::characteristics::types::RoadMedian::ZserioPackingContext& getRoadMedian()
        {
            return m_roadMedian_;
        }

        ::zserio::DeltaContext& getStationPlazaType()
        {
            return m_stationPlazaType_;
        }

        ::zserio::DeltaContext& getAverageSpeed()
        {
            return m_averageSpeed_;
        }

        ::zserio::DeltaContext& getFunctionalRoadClass()
        {
            return m_functionalRoadClass_;
        }

        ::zserio::DeltaContext& getPriorityRoadClass()
        {
            return m_priorityRoadClass_;
        }

        ::zserio::DeltaContext& getLaneWidthState()
        {
            return m_laneWidthState_;
        }

        ::zserio::DeltaContext& getComplexIntersectionType()
        {
            return m_complexIntersectionType_;
        }

        ::nds::characteristics::types::RoadLocationAssignment::ZserioPackingContext& getRoadLocationId()
        {
            return m_roadLocationId_;
        }

        ::zserio::DeltaContext& getFerryType()
        {
            return m_ferryType_;
        }

        ::zserio::DeltaContext& getMiddleDividerType()
        {
            return m_middleDividerType_;
        }

        ::nds::characteristics::types::MultiDigitizedLaneGroupReference::ZserioPackingContext& getMultiDigitizedLaneGroupReference()
        {
            return m_multiDigitizedLaneGroupReference_;
        }

    private:
        ::nds::core::types::LaneType::ZserioPackingContext m_laneType_;
        ::zserio::DeltaContext m_metricLaneWidth_;
        ::zserio::DeltaContext m_pavementType_;
        ::zserio::DeltaContext m_dividerType_;
        ::zserio::DeltaContext m_gradeType_;
        ::zserio::DeltaContext m_railwayCrossing_;
        ::zserio::DeltaContext m_trafficCalming_;
        ::zserio::DeltaContext m_superElevation_;
        ::nds::characteristics::types::RoadMedian::ZserioPackingContext m_roadMedian_;
        ::zserio::DeltaContext m_stationPlazaType_;
        ::zserio::DeltaContext m_averageSpeed_;
        ::zserio::DeltaContext m_functionalRoadClass_;
        ::zserio::DeltaContext m_priorityRoadClass_;
        ::zserio::DeltaContext m_laneWidthState_;
        ::zserio::DeltaContext m_complexIntersectionType_;
        ::nds::characteristics::types::RoadLocationAssignment::ZserioPackingContext m_roadLocationId_;
        ::zserio::DeltaContext m_ferryType_;
        ::zserio::DeltaContext m_middleDividerType_;
        ::nds::characteristics::types::MultiDigitizedLaneGroupReference::ZserioPackingContext m_multiDigitizedLaneGroupReference_;
    };

    CharacsLaneRangeAttributeValue() noexcept :
            CharacsLaneRangeAttributeValue(allocator_type())
    {}

    explicit CharacsLaneRangeAttributeValue(const allocator_type& allocator) noexcept;

    explicit CharacsLaneRangeAttributeValue(::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsLaneRangeAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit CharacsLaneRangeAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsLaneRangeAttributeType type_, const allocator_type& allocator = allocator_type());

    ~CharacsLaneRangeAttributeValue() = default;

    CharacsLaneRangeAttributeValue(const CharacsLaneRangeAttributeValue& other);
    CharacsLaneRangeAttributeValue& operator=(const CharacsLaneRangeAttributeValue& other);

    CharacsLaneRangeAttributeValue(CharacsLaneRangeAttributeValue&& other);
    CharacsLaneRangeAttributeValue& operator=(CharacsLaneRangeAttributeValue&& other);

    CharacsLaneRangeAttributeValue(::zserio::PropagateAllocatorT,
            const CharacsLaneRangeAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::characteristics::attributes::CharacsLaneRangeAttributeType type_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::characteristics::attributes::CharacsLaneRangeAttributeType getType() const;

    const ::nds::core::types::LaneType& getLaneType() const;
    ::nds::core::types::LaneType& getLaneType();
    void setLaneType(const ::nds::core::types::LaneType& laneType_);
    void setLaneType(::nds::core::types::LaneType&& laneType_);

    ::nds::characteristics::types::MetricLaneWidth getMetricLaneWidth() const;
    void setMetricLaneWidth(::nds::characteristics::types::MetricLaneWidth metricLaneWidth_);

    ::nds::characteristics::types::PavementType getPavementType() const;
    void setPavementType(::nds::characteristics::types::PavementType pavementType_);

    ::nds::characteristics::types::DividerType getDividerType() const;
    void setDividerType(::nds::characteristics::types::DividerType dividerType_);

    ::nds::characteristics::types::GradeType getGradeType() const;
    void setGradeType(::nds::characteristics::types::GradeType gradeType_);

    ::nds::characteristics::types::RailwayCrossing getRailwayCrossing() const;
    void setRailwayCrossing(::nds::characteristics::types::RailwayCrossing railwayCrossing_);

    const ::nds::characteristics::types::PedestrianCrossing& getPedestrianCrossing() const;
    ::nds::characteristics::types::PedestrianCrossing& getPedestrianCrossing();
    void setPedestrianCrossing(const ::nds::characteristics::types::PedestrianCrossing& pedestrianCrossing_);
    void setPedestrianCrossing(::nds::characteristics::types::PedestrianCrossing&& pedestrianCrossing_);

    ::nds::characteristics::types::TrafficCalming getTrafficCalming() const;
    void setTrafficCalming(::nds::characteristics::types::TrafficCalming trafficCalming_);

    const ::nds::characteristics::types::MovableBridge& getMovableBridge() const;
    ::nds::characteristics::types::MovableBridge& getMovableBridge();
    void setMovableBridge(const ::nds::characteristics::types::MovableBridge& movableBridge_);
    void setMovableBridge(::nds::characteristics::types::MovableBridge&& movableBridge_);

    ::nds::characteristics::types::SuperElevationClass getSuperElevation() const;
    void setSuperElevation(::nds::characteristics::types::SuperElevationClass superElevation_);

    const ::nds::characteristics::types::RoadMedian& getRoadMedian() const;
    ::nds::characteristics::types::RoadMedian& getRoadMedian();
    void setRoadMedian(const ::nds::characteristics::types::RoadMedian& roadMedian_);
    void setRoadMedian(::nds::characteristics::types::RoadMedian&& roadMedian_);

    const ::nds::characteristics::types::HasSidewalk& getHasSidewalk() const;
    ::nds::characteristics::types::HasSidewalk& getHasSidewalk();
    void setHasSidewalk(const ::nds::characteristics::types::HasSidewalk& hasSidewalk_);
    void setHasSidewalk(::nds::characteristics::types::HasSidewalk&& hasSidewalk_);

    ::nds::characteristics::types::FrictionCoefficient getFrictionCoefficient() const;
    void setFrictionCoefficient(::nds::characteristics::types::FrictionCoefficient frictionCoefficient_);

    ::nds::characteristics::types::StationPlazaType getStationPlazaType() const;
    void setStationPlazaType(::nds::characteristics::types::StationPlazaType stationPlazaType_);

    ::nds::core::types::SpeedKmh getAverageSpeed() const;
    void setAverageSpeed(::nds::core::types::SpeedKmh averageSpeed_);

    ::nds::core::types::FunctionalRoadClass getFunctionalRoadClass() const;
    void setFunctionalRoadClass(::nds::core::types::FunctionalRoadClass functionalRoadClass_);

    ::nds::core::types::PriorityRoadClass getPriorityRoadClass() const;
    void setPriorityRoadClass(::nds::core::types::PriorityRoadClass priorityRoadClass_);

    ::nds::characteristics::types::LaneWidthState getLaneWidthState() const;
    void setLaneWidthState(::nds::characteristics::types::LaneWidthState laneWidthState_);

    ::nds::characteristics::types::ComplexIntersectionType getComplexIntersectionType() const;
    void setComplexIntersectionType(::nds::characteristics::types::ComplexIntersectionType complexIntersectionType_);

    const ::nds::characteristics::types::StartOrDestinationRoadOnly& getStartOrDestinationRoadOnly() const;
    ::nds::characteristics::types::StartOrDestinationRoadOnly& getStartOrDestinationRoadOnly();
    void setStartOrDestinationRoadOnly(const ::nds::characteristics::types::StartOrDestinationRoadOnly& startOrDestinationRoadOnly_);
    void setStartOrDestinationRoadOnly(::nds::characteristics::types::StartOrDestinationRoadOnly&& startOrDestinationRoadOnly_);

    const ::nds::characteristics::types::RoadLocationAssignment& getRoadLocationId() const;
    ::nds::characteristics::types::RoadLocationAssignment& getRoadLocationId();
    void setRoadLocationId(const ::nds::characteristics::types::RoadLocationAssignment& roadLocationId_);
    void setRoadLocationId(::nds::characteristics::types::RoadLocationAssignment&& roadLocationId_);

    const ::nds::characteristics::types::HasStreetLights& getHasStreetLights() const;
    ::nds::characteristics::types::HasStreetLights& getHasStreetLights();
    void setHasStreetLights(const ::nds::characteristics::types::HasStreetLights& hasStreetLights_);
    void setHasStreetLights(::nds::characteristics::types::HasStreetLights&& hasStreetLights_);

    const ::nds::characteristics::types::SharedRoadSurfaceWithPedestrians& getSharedRoadSurfaceWithPedestrians() const;
    ::nds::characteristics::types::SharedRoadSurfaceWithPedestrians& getSharedRoadSurfaceWithPedestrians();
    void setSharedRoadSurfaceWithPedestrians(const ::nds::characteristics::types::SharedRoadSurfaceWithPedestrians& sharedRoadSurfaceWithPedestrians_);
    void setSharedRoadSurfaceWithPedestrians(::nds::characteristics::types::SharedRoadSurfaceWithPedestrians&& sharedRoadSurfaceWithPedestrians_);

    const ::nds::characteristics::types::InBusinessDistrict& getInBusinessDistrict() const;
    ::nds::characteristics::types::InBusinessDistrict& getInBusinessDistrict();
    void setInBusinessDistrict(const ::nds::characteristics::types::InBusinessDistrict& inBusinessDistrict_);
    void setInBusinessDistrict(::nds::characteristics::types::InBusinessDistrict&& inBusinessDistrict_);

    ::nds::characteristics::types::FerryType getFerryType() const;
    void setFerryType(::nds::characteristics::types::FerryType ferryType_);

    const ::nds::characteristics::types::Stubble& getStubble() const;
    ::nds::characteristics::types::Stubble& getStubble();
    void setStubble(const ::nds::characteristics::types::Stubble& stubble_);
    void setStubble(::nds::characteristics::types::Stubble&& stubble_);

    ::nds::characteristics::types::DividerType getMiddleDividerType() const;
    void setMiddleDividerType(::nds::characteristics::types::DividerType middleDividerType_);

    const ::nds::characteristics::types::MultiDigitizedLaneGroupReference& getMultiDigitizedLaneGroupReference() const;
    ::nds::characteristics::types::MultiDigitizedLaneGroupReference& getMultiDigitizedLaneGroupReference();
    void setMultiDigitizedLaneGroupReference(const ::nds::characteristics::types::MultiDigitizedLaneGroupReference& multiDigitizedLaneGroupReference_);
    void setMultiDigitizedLaneGroupReference(::nds::characteristics::types::MultiDigitizedLaneGroupReference&& multiDigitizedLaneGroupReference_);

    const ::nds::core::types::GlobalSourceId& getGlobalSourceId() const;
    ::nds::core::types::GlobalSourceId& getGlobalSourceId();
    void setGlobalSourceId(const ::nds::core::types::GlobalSourceId& globalSourceId_);
    void setGlobalSourceId(::nds::core::types::GlobalSourceId&& globalSourceId_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsLaneRangeAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::characteristics::attributes::CharacsLaneRangeAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_LANE_RANGE_ATTRIBUTE_VALUE_H
