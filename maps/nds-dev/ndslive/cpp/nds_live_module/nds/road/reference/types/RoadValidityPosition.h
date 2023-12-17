/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_REFERENCE_TYPES_ROAD_VALIDITY_POSITION_H
#define NDS_ROAD_REFERENCE_TYPES_ROAD_VALIDITY_POSITION_H

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
#include <nds/road/reference/types/PercentageIndication.h>

namespace nds
{
namespace road
{
namespace reference
{
namespace types
{

class RoadValidityPosition
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::geometry::Position2D::ZserioPackingContext& getPosition()
        {
            return m_position_;
        }

    private:
        ::nds::core::geometry::Position2D::ZserioPackingContext m_position_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RoadValidityPosition() noexcept :
            RoadValidityPosition(allocator_type())
    {}

    explicit RoadValidityPosition(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_position = ::nds::core::geometry::Position2D,
            typename ZSERIO_T_positionIndication = ::nds::road::reference::types::PercentageIndication,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_position, RoadValidityPosition, allocator_type> = 0>
    RoadValidityPosition(
            ZSERIO_T_position&& position_,
            ZSERIO_T_positionIndication&& positionIndication_,
            const allocator_type& allocator = allocator_type()) :
            RoadValidityPosition(allocator)
    {
        m_position_ = ::std::forward<ZSERIO_T_position>(position_);
        m_positionIndication_ = ::std::forward<ZSERIO_T_positionIndication>(positionIndication_);
    }

    explicit RoadValidityPosition(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());
    explicit RoadValidityPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());

    ~RoadValidityPosition() = default;

    RoadValidityPosition(const RoadValidityPosition& other);
    RoadValidityPosition& operator=(const RoadValidityPosition& other);

    RoadValidityPosition(RoadValidityPosition&& other);
    RoadValidityPosition& operator=(RoadValidityPosition&& other);

    RoadValidityPosition(::zserio::PropagateAllocatorT,
            const RoadValidityPosition& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift shift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getShift() const;

    const ::nds::core::geometry::Position2D& getPosition() const;
    ::nds::core::geometry::Position2D& getPosition();
    void setPosition(const ::nds::core::geometry::Position2D& position_);
    void setPosition(::nds::core::geometry::Position2D&& position_);

    ::nds::road::reference::types::PercentageIndication getPositionIndication() const;
    void setPositionIndication(::nds::road::reference::types::PercentageIndication positionIndication_);
    bool isPositionIndicationUsed() const;
    bool isPositionIndicationSet() const;
    void resetPositionIndication();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RoadValidityPosition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::geometry::Position2D readPosition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::Position2D readPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::PercentageIndication> readPositionIndication(::zserio::BitStreamReader& in);

    ::nds::core::geometry::CoordShift m_shift_;
    bool m_isInitialized;
    ::nds::core::geometry::Position2D m_position_;
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::PercentageIndication> m_positionIndication_;
};

} // namespace types
} // namespace reference
} // namespace road
} // namespace nds

#endif // NDS_ROAD_REFERENCE_TYPES_ROAD_VALIDITY_POSITION_H