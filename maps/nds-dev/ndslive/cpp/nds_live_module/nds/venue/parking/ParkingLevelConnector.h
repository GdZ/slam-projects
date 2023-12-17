/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_PARKING_PARKING_LEVEL_CONNECTOR_H
#define NDS_VENUE_PARKING_PARKING_LEVEL_CONNECTOR_H

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

#include <nds/core/geometry/BoundingPolygon3D.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/venue/reference/types/ParkingLevelId.h>

namespace nds
{
namespace venue
{
namespace parking
{

class ParkingLevelConnector
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::venue::reference::types::ParkingLevelId::ZserioPackingContext& getLevelId()
        {
            return m_levelId_;
        }

        ::nds::core::geometry::BoundingPolygon3D::ZserioPackingContext& getTransitionPolygon()
        {
            return m_transitionPolygon_;
        }

    private:
        ::nds::venue::reference::types::ParkingLevelId::ZserioPackingContext m_levelId_;
        ::nds::core::geometry::BoundingPolygon3D::ZserioPackingContext m_transitionPolygon_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingLevelConnector() noexcept :
            ParkingLevelConnector(allocator_type())
    {}

    explicit ParkingLevelConnector(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_levelId = ::nds::venue::reference::types::ParkingLevelId,
            typename ZSERIO_T_transitionPolygon = ::nds::core::geometry::BoundingPolygon3D,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_levelId, ParkingLevelConnector, allocator_type> = 0>
    ParkingLevelConnector(
            ZSERIO_T_levelId&& levelId_,
            ZSERIO_T_transitionPolygon&& transitionPolygon_,
            const allocator_type& allocator = allocator_type()) :
            ParkingLevelConnector(allocator)
    {
        m_levelId_ = ::std::forward<ZSERIO_T_levelId>(levelId_);
        m_transitionPolygon_ = ::std::forward<ZSERIO_T_transitionPolygon>(transitionPolygon_);
    }

    explicit ParkingLevelConnector(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ParkingLevelConnector(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ParkingLevelConnector() = default;

    ParkingLevelConnector(const ParkingLevelConnector& other);
    ParkingLevelConnector& operator=(const ParkingLevelConnector& other);

    ParkingLevelConnector(ParkingLevelConnector&& other);
    ParkingLevelConnector& operator=(ParkingLevelConnector&& other);

    ParkingLevelConnector(::zserio::PropagateAllocatorT,
            const ParkingLevelConnector& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::venue::reference::types::ParkingLevelId& getLevelId() const;
    ::nds::venue::reference::types::ParkingLevelId& getLevelId();
    void setLevelId(const ::nds::venue::reference::types::ParkingLevelId& levelId_);
    void setLevelId(::nds::venue::reference::types::ParkingLevelId&& levelId_);

    const ::nds::core::geometry::BoundingPolygon3D& getTransitionPolygon() const;
    ::nds::core::geometry::BoundingPolygon3D& getTransitionPolygon();
    void setTransitionPolygon(const ::nds::core::geometry::BoundingPolygon3D& transitionPolygon_);
    void setTransitionPolygon(::nds::core::geometry::BoundingPolygon3D&& transitionPolygon_);
    bool isTransitionPolygonUsed() const;
    bool isTransitionPolygonSet() const;
    void resetTransitionPolygon();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingLevelConnector& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::venue::reference::types::ParkingLevelId readLevelId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::venue::reference::types::ParkingLevelId readLevelId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::BoundingPolygon3D> readTransitionPolygon(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::BoundingPolygon3D> readTransitionPolygon(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::venue::reference::types::ParkingLevelId m_levelId_;
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::BoundingPolygon3D> m_transitionPolygon_;
};

} // namespace parking
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_PARKING_PARKING_LEVEL_CONNECTOR_H