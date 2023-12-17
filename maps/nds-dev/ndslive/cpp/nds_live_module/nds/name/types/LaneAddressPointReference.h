/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_TYPES_LANE_ADDRESS_POINT_REFERENCE_H
#define NDS_NAME_TYPES_LANE_ADDRESS_POINT_REFERENCE_H

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
#include <zserio/ArrayTraits.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/lane/reference/types/LaneGroupPositionValidity.h>
#include <nds/lane/reference/types/LaneGroupReferenceIndirect.h>

namespace nds
{
namespace name
{
namespace types
{

class LaneAddressPointReference
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::lane::reference::types::LaneGroupReferenceIndirect::ZserioPackingContext& getIndirectReference()
        {
            return m_indirectReference_;
        }

        ::nds::lane::reference::types::LaneGroupPositionValidity::ZserioPackingContext& getPosition()
        {
            return m_position_;
        }

    private:
        ::nds::lane::reference::types::LaneGroupReferenceIndirect::ZserioPackingContext m_indirectReference_;
        ::nds::lane::reference::types::LaneGroupPositionValidity::ZserioPackingContext m_position_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneAddressPointReference() noexcept :
            LaneAddressPointReference(allocator_type())
    {}

    explicit LaneAddressPointReference(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_indirectReference = ::nds::lane::reference::types::LaneGroupReferenceIndirect,
            typename ZSERIO_T_position = ::nds::lane::reference::types::LaneGroupPositionValidity,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_indirectReference, LaneAddressPointReference, allocator_type> = 0>
    LaneAddressPointReference(
            ZSERIO_T_indirectReference&& indirectReference_,
            ZSERIO_T_position&& position_,
            const allocator_type& allocator = allocator_type()) :
            LaneAddressPointReference(allocator)
    {
        m_indirectReference_ = ::std::forward<ZSERIO_T_indirectReference>(indirectReference_);
        m_position_ = ::std::forward<ZSERIO_T_position>(position_);
    }

    explicit LaneAddressPointReference(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneAddressPointReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneAddressPointReference() = default;

    LaneAddressPointReference(const LaneAddressPointReference& other);
    LaneAddressPointReference& operator=(const LaneAddressPointReference& other);

    LaneAddressPointReference(LaneAddressPointReference&& other);
    LaneAddressPointReference& operator=(LaneAddressPointReference&& other);

    LaneAddressPointReference(::zserio::PropagateAllocatorT,
            const LaneAddressPointReference& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::lane::reference::types::LaneGroupReferenceIndirect& getIndirectReference() const;
    ::nds::lane::reference::types::LaneGroupReferenceIndirect& getIndirectReference();
    void setIndirectReference(const ::nds::lane::reference::types::LaneGroupReferenceIndirect& indirectReference_);
    void setIndirectReference(::nds::lane::reference::types::LaneGroupReferenceIndirect&& indirectReference_);

    const ::nds::lane::reference::types::LaneGroupPositionValidity& getPosition() const;
    ::nds::lane::reference::types::LaneGroupPositionValidity& getPosition();
    void setPosition(const ::nds::lane::reference::types::LaneGroupPositionValidity& position_);
    void setPosition(::nds::lane::reference::types::LaneGroupPositionValidity&& position_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneAddressPointReference& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::reference::types::LaneGroupReferenceIndirect readIndirectReference(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::reference::types::LaneGroupReferenceIndirect readIndirectReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::lane::reference::types::LaneGroupPositionValidity readPosition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::reference::types::LaneGroupPositionValidity readPosition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::lane::reference::types::LaneGroupReferenceIndirect m_indirectReference_;
    ::nds::lane::reference::types::LaneGroupPositionValidity m_position_;
};

} // namespace types
} // namespace name
} // namespace nds

#endif // NDS_NAME_TYPES_LANE_ADDRESS_POINT_REFERENCE_H
