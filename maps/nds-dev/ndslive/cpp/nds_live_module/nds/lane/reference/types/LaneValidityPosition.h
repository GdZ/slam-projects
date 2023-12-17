/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_REFERENCE_TYPES_LANE_VALIDITY_POSITION_H
#define NDS_LANE_REFERENCE_TYPES_LANE_VALIDITY_POSITION_H

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
#include <nds/core/geometry/Position3D.h>
#include <nds/lane/reference/types/PercentageIndication.h>

namespace nds
{
namespace lane
{
namespace reference
{
namespace types
{

class LaneValidityPosition
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::geometry::Position3D::ZserioPackingContext& getPosition()
        {
            return m_position_;
        }

    private:
        ::nds::core::geometry::Position3D::ZserioPackingContext m_position_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneValidityPosition() noexcept :
            LaneValidityPosition(allocator_type())
    {}

    explicit LaneValidityPosition(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_position = ::nds::core::geometry::Position3D,
            typename ZSERIO_T_positionIndication = ::nds::lane::reference::types::PercentageIndication,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_position, LaneValidityPosition, allocator_type> = 0>
    LaneValidityPosition(
            ZSERIO_T_position&& position_,
            ZSERIO_T_positionIndication&& positionIndication_,
            const allocator_type& allocator = allocator_type()) :
            LaneValidityPosition(allocator)
    {
        m_position_ = ::std::forward<ZSERIO_T_position>(position_);
        m_positionIndication_ = ::std::forward<ZSERIO_T_positionIndication>(positionIndication_);
    }

    explicit LaneValidityPosition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneValidityPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneValidityPosition() = default;

    LaneValidityPosition(const LaneValidityPosition& other);
    LaneValidityPosition& operator=(const LaneValidityPosition& other);

    LaneValidityPosition(LaneValidityPosition&& other);
    LaneValidityPosition& operator=(LaneValidityPosition&& other);

    LaneValidityPosition(::zserio::PropagateAllocatorT,
            const LaneValidityPosition& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::core::geometry::Position3D& getPosition() const;
    ::nds::core::geometry::Position3D& getPosition();
    void setPosition(const ::nds::core::geometry::Position3D& position_);
    void setPosition(::nds::core::geometry::Position3D&& position_);

    ::nds::lane::reference::types::PercentageIndication getPositionIndication() const;
    void setPositionIndication(::nds::lane::reference::types::PercentageIndication positionIndication_);
    bool isPositionIndicationUsed() const;
    bool isPositionIndicationSet() const;
    void resetPositionIndication();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneValidityPosition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::geometry::Position3D readPosition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::geometry::Position3D readPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::PercentageIndication> readPositionIndication(::zserio::BitStreamReader& in);

    bool m_areChildrenInitialized;
    ::nds::core::geometry::Position3D m_position_;
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::PercentageIndication> m_positionIndication_;
};

} // namespace types
} // namespace reference
} // namespace lane
} // namespace nds

#endif // NDS_LANE_REFERENCE_TYPES_LANE_VALIDITY_POSITION_H
