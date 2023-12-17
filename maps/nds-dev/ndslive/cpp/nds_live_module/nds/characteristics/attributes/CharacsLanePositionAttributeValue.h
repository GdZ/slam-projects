/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_LANE_POSITION_ATTRIBUTE_VALUE_H
#define NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_LANE_POSITION_ATTRIBUTE_VALUE_H

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

#include <nds/characteristics/attributes/CharacsLanePositionAttributeType.h>
#include <nds/characteristics/types/StationaryObjectType.h>
#include <nds/characteristics/types/StopLine.h>
#include <nds/characteristics/types/WaitingLine.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/core/geometry/Line3D.h>

namespace nds
{
namespace characteristics
{
namespace attributes
{

class CharacsLanePositionAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_stopLine = 0,
        CHOICE_slowRoadUserCrossing = 1,
        CHOICE_waitingLine = 2,
        CHOICE_stationaryObjectType = 3,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::core::geometry::Line3D::ZserioPackingContext& getSlowRoadUserCrossing()
        {
            return m_slowRoadUserCrossing_;
        }

        ::zserio::DeltaContext& getStationaryObjectType()
        {
            return m_stationaryObjectType_;
        }

    private:
        ::nds::core::geometry::Line3D::ZserioPackingContext m_slowRoadUserCrossing_;
        ::zserio::DeltaContext m_stationaryObjectType_;
    };

    CharacsLanePositionAttributeValue() noexcept :
            CharacsLanePositionAttributeValue(allocator_type())
    {}

    explicit CharacsLanePositionAttributeValue(const allocator_type& allocator) noexcept;

    explicit CharacsLanePositionAttributeValue(::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsLanePositionAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit CharacsLanePositionAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsLanePositionAttributeType type_, const allocator_type& allocator = allocator_type());

    ~CharacsLanePositionAttributeValue() = default;

    CharacsLanePositionAttributeValue(const CharacsLanePositionAttributeValue& other);
    CharacsLanePositionAttributeValue& operator=(const CharacsLanePositionAttributeValue& other);

    CharacsLanePositionAttributeValue(CharacsLanePositionAttributeValue&& other);
    CharacsLanePositionAttributeValue& operator=(CharacsLanePositionAttributeValue&& other);

    CharacsLanePositionAttributeValue(::zserio::PropagateAllocatorT,
            const CharacsLanePositionAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::characteristics::attributes::CharacsLanePositionAttributeType type_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::characteristics::attributes::CharacsLanePositionAttributeType getType() const;

    const ::nds::characteristics::types::StopLine& getStopLine() const;
    ::nds::characteristics::types::StopLine& getStopLine();
    void setStopLine(const ::nds::characteristics::types::StopLine& stopLine_);
    void setStopLine(::nds::characteristics::types::StopLine&& stopLine_);

    const ::nds::core::geometry::Line3D& getSlowRoadUserCrossing() const;
    ::nds::core::geometry::Line3D& getSlowRoadUserCrossing();
    void setSlowRoadUserCrossing(const ::nds::core::geometry::Line3D& slowRoadUserCrossing_);
    void setSlowRoadUserCrossing(::nds::core::geometry::Line3D&& slowRoadUserCrossing_);

    const ::nds::characteristics::types::WaitingLine& getWaitingLine() const;
    ::nds::characteristics::types::WaitingLine& getWaitingLine();
    void setWaitingLine(const ::nds::characteristics::types::WaitingLine& waitingLine_);
    void setWaitingLine(::nds::characteristics::types::WaitingLine&& waitingLine_);

    ::nds::characteristics::types::StationaryObjectType getStationaryObjectType() const;
    void setStationaryObjectType(::nds::characteristics::types::StationaryObjectType stationaryObjectType_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsLanePositionAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::characteristics::attributes::CharacsLanePositionAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_LANE_POSITION_ATTRIBUTE_VALUE_H