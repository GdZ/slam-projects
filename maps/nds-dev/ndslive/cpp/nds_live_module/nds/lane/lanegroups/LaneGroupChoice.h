/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_LANEGROUPS_LANE_GROUP_CHOICE_H
#define NDS_LANE_LANEGROUPS_LANE_GROUP_CHOICE_H

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

#include <nds/lane/lanegroups/ArtificialIntersectionLaneGroup.h>
#include <nds/lane/lanegroups/ArtificialRoadLaneGroup.h>
#include <nds/lane/lanegroups/BorderLaneGroup.h>
#include <nds/lane/lanegroups/ForkLaneGroup.h>
#include <nds/lane/lanegroups/IntersectionLaneGroup.h>
#include <nds/lane/lanegroups/LaneGroupType.h>
#include <nds/lane/lanegroups/RoadLaneGroup.h>

namespace nds
{
namespace lane
{
namespace lanegroups
{

class LaneGroupChoice
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_road = 0,
        CHOICE_intersection = 1,
        CHOICE_border = 2,
        CHOICE_fork = 3,
        CHOICE_artificialRoad = 4,
        CHOICE_artificialIntersection = 5,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::lane::lanegroups::RoadLaneGroup::ZserioPackingContext& getRoad()
        {
            return m_road_;
        }

        ::nds::lane::lanegroups::IntersectionLaneGroup::ZserioPackingContext& getIntersection()
        {
            return m_intersection_;
        }

        ::nds::lane::lanegroups::BorderLaneGroup::ZserioPackingContext& getBorder()
        {
            return m_border_;
        }

        ::nds::lane::lanegroups::ForkLaneGroup::ZserioPackingContext& getFork()
        {
            return m_fork_;
        }

        ::nds::lane::lanegroups::ArtificialRoadLaneGroup::ZserioPackingContext& getArtificialRoad()
        {
            return m_artificialRoad_;
        }

        ::nds::lane::lanegroups::ArtificialIntersectionLaneGroup::ZserioPackingContext& getArtificialIntersection()
        {
            return m_artificialIntersection_;
        }

    private:
        ::nds::lane::lanegroups::RoadLaneGroup::ZserioPackingContext m_road_;
        ::nds::lane::lanegroups::IntersectionLaneGroup::ZserioPackingContext m_intersection_;
        ::nds::lane::lanegroups::BorderLaneGroup::ZserioPackingContext m_border_;
        ::nds::lane::lanegroups::ForkLaneGroup::ZserioPackingContext m_fork_;
        ::nds::lane::lanegroups::ArtificialRoadLaneGroup::ZserioPackingContext m_artificialRoad_;
        ::nds::lane::lanegroups::ArtificialIntersectionLaneGroup::ZserioPackingContext m_artificialIntersection_;
    };

    LaneGroupChoice() noexcept :
            LaneGroupChoice(allocator_type())
    {}

    explicit LaneGroupChoice(const allocator_type& allocator) noexcept;

    explicit LaneGroupChoice(::zserio::BitStreamReader& in,
            ::nds::lane::lanegroups::LaneGroupType type_,
            bool hasBoundaryGeometry_, const allocator_type& allocator = allocator_type());
    explicit LaneGroupChoice(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::lane::lanegroups::LaneGroupType type_,
            bool hasBoundaryGeometry_, const allocator_type& allocator = allocator_type());

    ~LaneGroupChoice() = default;

    LaneGroupChoice(const LaneGroupChoice& other);
    LaneGroupChoice& operator=(const LaneGroupChoice& other);

    LaneGroupChoice(LaneGroupChoice&& other);
    LaneGroupChoice& operator=(LaneGroupChoice&& other);

    LaneGroupChoice(::zserio::PropagateAllocatorT,
            const LaneGroupChoice& other, const allocator_type& allocator);

    void initialize(
            ::nds::lane::lanegroups::LaneGroupType type_,
            bool hasBoundaryGeometry_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::lane::lanegroups::LaneGroupType getType() const;

    bool getHasBoundaryGeometry() const;

    const ::nds::lane::lanegroups::RoadLaneGroup& getRoad() const;
    ::nds::lane::lanegroups::RoadLaneGroup& getRoad();
    void setRoad(const ::nds::lane::lanegroups::RoadLaneGroup& road_);
    void setRoad(::nds::lane::lanegroups::RoadLaneGroup&& road_);

    const ::nds::lane::lanegroups::IntersectionLaneGroup& getIntersection() const;
    ::nds::lane::lanegroups::IntersectionLaneGroup& getIntersection();
    void setIntersection(const ::nds::lane::lanegroups::IntersectionLaneGroup& intersection_);
    void setIntersection(::nds::lane::lanegroups::IntersectionLaneGroup&& intersection_);

    const ::nds::lane::lanegroups::BorderLaneGroup& getBorder() const;
    ::nds::lane::lanegroups::BorderLaneGroup& getBorder();
    void setBorder(const ::nds::lane::lanegroups::BorderLaneGroup& border_);
    void setBorder(::nds::lane::lanegroups::BorderLaneGroup&& border_);

    const ::nds::lane::lanegroups::ForkLaneGroup& getFork() const;
    ::nds::lane::lanegroups::ForkLaneGroup& getFork();
    void setFork(const ::nds::lane::lanegroups::ForkLaneGroup& fork_);
    void setFork(::nds::lane::lanegroups::ForkLaneGroup&& fork_);

    const ::nds::lane::lanegroups::ArtificialRoadLaneGroup& getArtificialRoad() const;
    ::nds::lane::lanegroups::ArtificialRoadLaneGroup& getArtificialRoad();
    void setArtificialRoad(const ::nds::lane::lanegroups::ArtificialRoadLaneGroup& artificialRoad_);
    void setArtificialRoad(::nds::lane::lanegroups::ArtificialRoadLaneGroup&& artificialRoad_);

    const ::nds::lane::lanegroups::ArtificialIntersectionLaneGroup& getArtificialIntersection() const;
    ::nds::lane::lanegroups::ArtificialIntersectionLaneGroup& getArtificialIntersection();
    void setArtificialIntersection(const ::nds::lane::lanegroups::ArtificialIntersectionLaneGroup& artificialIntersection_);
    void setArtificialIntersection(::nds::lane::lanegroups::ArtificialIntersectionLaneGroup&& artificialIntersection_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneGroupChoice& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::lane::lanegroups::LaneGroupType m_type_;
    bool m_hasBoundaryGeometry_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace lanegroups
} // namespace lane
} // namespace nds

#endif // NDS_LANE_LANEGROUPS_LANE_GROUP_CHOICE_H
