/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_REFERENCE_TYPES_ROAD_RANGE_CHOICE_H
#define NDS_ROAD_REFERENCE_TYPES_ROAD_RANGE_CHOICE_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/road/reference/types/RoadGeometryOffsetRange.h>
#include <nds/road/reference/types/RoadGeometryRange.h>
#include <nds/road/reference/types/RoadLengthExtent.h>
#include <nds/road/reference/types/RoadLengthRange.h>
#include <nds/road/reference/types/RoadPercentageRange.h>
#include <nds/road/reference/types/RoadValidityRange.h>
#include <nds/road/reference/types/RoadValidityType.h>

namespace nds
{
namespace road
{
namespace reference
{
namespace types
{

class RoadRangeChoice
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_validityRange = 0,
        CHOICE_lengthRange = 1,
        CHOICE_geometryRange = 2,
        CHOICE_geometryOffsetRange = 3,
        CHOICE_percentageRange = 4,
        CHOICE_roadLengthExtent = 5,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::road::reference::types::RoadValidityRange::ZserioPackingContext& getValidityRange()
        {
            return m_validityRange_;
        }

        ::nds::road::reference::types::RoadLengthRange::ZserioPackingContext& getLengthRange()
        {
            return m_lengthRange_;
        }

        ::nds::road::reference::types::RoadGeometryRange::ZserioPackingContext& getGeometryRange()
        {
            return m_geometryRange_;
        }

        ::nds::road::reference::types::RoadGeometryOffsetRange::ZserioPackingContext& getGeometryOffsetRange()
        {
            return m_geometryOffsetRange_;
        }

        ::nds::road::reference::types::RoadPercentageRange::ZserioPackingContext& getPercentageRange()
        {
            return m_percentageRange_;
        }

        ::zserio::DeltaContext& getRoadLengthExtent()
        {
            return m_roadLengthExtent_;
        }

    private:
        ::nds::road::reference::types::RoadValidityRange::ZserioPackingContext m_validityRange_;
        ::nds::road::reference::types::RoadLengthRange::ZserioPackingContext m_lengthRange_;
        ::nds::road::reference::types::RoadGeometryRange::ZserioPackingContext m_geometryRange_;
        ::nds::road::reference::types::RoadGeometryOffsetRange::ZserioPackingContext m_geometryOffsetRange_;
        ::nds::road::reference::types::RoadPercentageRange::ZserioPackingContext m_percentageRange_;
        ::zserio::DeltaContext m_roadLengthExtent_;
    };

    RoadRangeChoice() noexcept :
            RoadRangeChoice(allocator_type())
    {}

    explicit RoadRangeChoice(const allocator_type& allocator) noexcept;

    explicit RoadRangeChoice(::zserio::BitStreamReader& in,
            ::nds::road::reference::types::RoadValidityType type_,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());
    explicit RoadRangeChoice(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::road::reference::types::RoadValidityType type_,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());

    ~RoadRangeChoice() = default;

    RoadRangeChoice(const RoadRangeChoice& other);
    RoadRangeChoice& operator=(const RoadRangeChoice& other);

    RoadRangeChoice(RoadRangeChoice&& other);
    RoadRangeChoice& operator=(RoadRangeChoice&& other);

    RoadRangeChoice(::zserio::PropagateAllocatorT,
            const RoadRangeChoice& other, const allocator_type& allocator);

    void initialize(
            ::nds::road::reference::types::RoadValidityType type_,
            ::nds::core::geometry::CoordShift shift_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::road::reference::types::RoadValidityType getType() const;

    ::nds::core::geometry::CoordShift getShift() const;

    const ::nds::road::reference::types::RoadValidityRange& getValidityRange() const;
    ::nds::road::reference::types::RoadValidityRange& getValidityRange();
    void setValidityRange(const ::nds::road::reference::types::RoadValidityRange& validityRange_);
    void setValidityRange(::nds::road::reference::types::RoadValidityRange&& validityRange_);

    const ::nds::road::reference::types::RoadLengthRange& getLengthRange() const;
    ::nds::road::reference::types::RoadLengthRange& getLengthRange();
    void setLengthRange(const ::nds::road::reference::types::RoadLengthRange& lengthRange_);
    void setLengthRange(::nds::road::reference::types::RoadLengthRange&& lengthRange_);

    const ::nds::road::reference::types::RoadGeometryRange& getGeometryRange() const;
    ::nds::road::reference::types::RoadGeometryRange& getGeometryRange();
    void setGeometryRange(const ::nds::road::reference::types::RoadGeometryRange& geometryRange_);
    void setGeometryRange(::nds::road::reference::types::RoadGeometryRange&& geometryRange_);

    const ::nds::road::reference::types::RoadGeometryOffsetRange& getGeometryOffsetRange() const;
    ::nds::road::reference::types::RoadGeometryOffsetRange& getGeometryOffsetRange();
    void setGeometryOffsetRange(const ::nds::road::reference::types::RoadGeometryOffsetRange& geometryOffsetRange_);
    void setGeometryOffsetRange(::nds::road::reference::types::RoadGeometryOffsetRange&& geometryOffsetRange_);

    const ::nds::road::reference::types::RoadPercentageRange& getPercentageRange() const;
    ::nds::road::reference::types::RoadPercentageRange& getPercentageRange();
    void setPercentageRange(const ::nds::road::reference::types::RoadPercentageRange& percentageRange_);
    void setPercentageRange(::nds::road::reference::types::RoadPercentageRange&& percentageRange_);

    ::nds::road::reference::types::RoadLengthExtent getRoadLengthExtent() const;
    void setRoadLengthExtent(::nds::road::reference::types::RoadLengthExtent roadLengthExtent_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadRangeChoice& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::road::reference::types::RoadValidityType m_type_;
    ::nds::core::geometry::CoordShift m_shift_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace types
} // namespace reference
} // namespace road
} // namespace nds

#endif // NDS_ROAD_REFERENCE_TYPES_ROAD_RANGE_CHOICE_H
