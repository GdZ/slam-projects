/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_PROPERTIES_ATTRIBUTE_REASON_H
#define NDS_CORE_PROPERTIES_ATTRIBUTE_REASON_H

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
#include <nds/core/geometry/Position3D.h>
#include <nds/core/properties/AttributeReasonPositionAvailability.h>
#include <nds/core/properties/AttributeReasonType.h>

namespace nds
{
namespace core
{
namespace properties
{

class AttributeReason
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::zserio::DeltaContext& getHasPosition()
        {
            return m_hasPosition_;
        }

        ::nds::core::geometry::Position2D::ZserioPackingContext& getPosition2D()
        {
            return m_position2D_;
        }

        ::nds::core::geometry::Position3D::ZserioPackingContext& getPosition3D()
        {
            return m_position3D_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::zserio::DeltaContext m_hasPosition_;
        ::nds::core::geometry::Position2D::ZserioPackingContext m_position2D_;
        ::nds::core::geometry::Position3D::ZserioPackingContext m_position3D_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AttributeReason() noexcept :
            AttributeReason(allocator_type())
    {}

    explicit AttributeReason(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_position2D = ::nds::core::geometry::Position2D,
            typename ZSERIO_T_position3D = ::nds::core::geometry::Position3D>
    AttributeReason(
            ::nds::core::properties::AttributeReasonType type_,
            ::nds::core::properties::AttributeReasonPositionAvailability hasPosition_,
            ZSERIO_T_position2D&& position2D_,
            ZSERIO_T_position3D&& position3D_,
            const allocator_type& allocator = allocator_type()) :
            AttributeReason(allocator)
    {
        m_type_ = type_;
        m_hasPosition_ = hasPosition_;
        m_position2D_ = ::std::forward<ZSERIO_T_position2D>(position2D_);
        m_position3D_ = ::std::forward<ZSERIO_T_position3D>(position3D_);
    }

    explicit AttributeReason(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AttributeReason(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AttributeReason() = default;

    AttributeReason(const AttributeReason& other);
    AttributeReason& operator=(const AttributeReason& other);

    AttributeReason(AttributeReason&& other);
    AttributeReason& operator=(AttributeReason&& other);

    AttributeReason(::zserio::PropagateAllocatorT,
            const AttributeReason& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::core::properties::AttributeReasonType getType() const;
    void setType(::nds::core::properties::AttributeReasonType type_);

    ::nds::core::properties::AttributeReasonPositionAvailability getHasPosition() const;
    void setHasPosition(::nds::core::properties::AttributeReasonPositionAvailability hasPosition_);

    const ::nds::core::geometry::Position2D& getPosition2D() const;
    ::nds::core::geometry::Position2D& getPosition2D();
    void setPosition2D(const ::nds::core::geometry::Position2D& position2D_);
    void setPosition2D(::nds::core::geometry::Position2D&& position2D_);
    bool isPosition2DUsed() const;
    bool isPosition2DSet() const;
    void resetPosition2D();

    const ::nds::core::geometry::Position3D& getPosition3D() const;
    ::nds::core::geometry::Position3D& getPosition3D();
    void setPosition3D(const ::nds::core::geometry::Position3D& position3D_);
    void setPosition3D(::nds::core::geometry::Position3D&& position3D_);
    bool isPosition3DUsed() const;
    bool isPosition3DSet() const;
    void resetPosition3D();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AttributeReason& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::properties::AttributeReasonType readType(::zserio::BitStreamReader& in);
    ::nds::core::properties::AttributeReasonType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::properties::AttributeReasonPositionAvailability readHasPosition(::zserio::BitStreamReader& in);
    ::nds::core::properties::AttributeReasonPositionAvailability readHasPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> readPosition2D(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> readPosition2D(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position3D> readPosition3D(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position3D> readPosition3D(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::core::properties::AttributeReasonType m_type_;
    ::nds::core::properties::AttributeReasonPositionAvailability m_hasPosition_;
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position2D> m_position2D_;
    ::zserio::InplaceOptionalHolder<::nds::core::geometry::Position3D> m_position3D_;
};

} // namespace properties
} // namespace core
} // namespace nds

#endif // NDS_CORE_PROPERTIES_ATTRIBUTE_REASON_H
