/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_TYPES_MULTI_DIGITIZED_LANE_GROUP_REFERENCE_H
#define NDS_CHARACTERISTICS_TYPES_MULTI_DIGITIZED_LANE_GROUP_REFERENCE_H

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

#include <nds/lane/reference/types/LaneGroupId.h>
#include <nds/lane/reference/types/LaneGroupReferenceIndirect.h>

namespace nds
{
namespace characteristics
{
namespace types
{

class MultiDigitizedLaneGroupReference
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::lane::reference::types::LaneGroupId::ZserioPackingContext& getCounterpartReference()
        {
            return m_counterpartReference_;
        }

        ::nds::lane::reference::types::LaneGroupReferenceIndirect::ZserioPackingContext& getCounterpartReferenceIndirect()
        {
            return m_counterpartReferenceIndirect_;
        }

    private:
        ::nds::lane::reference::types::LaneGroupId::ZserioPackingContext m_counterpartReference_;
        ::nds::lane::reference::types::LaneGroupReferenceIndirect::ZserioPackingContext m_counterpartReferenceIndirect_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    MultiDigitizedLaneGroupReference() noexcept :
            MultiDigitizedLaneGroupReference(allocator_type())
    {}

    explicit MultiDigitizedLaneGroupReference(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_counterpartReference = ::nds::lane::reference::types::LaneGroupId,
            typename ZSERIO_T_counterpartReferenceIndirect = ::nds::lane::reference::types::LaneGroupReferenceIndirect>
    MultiDigitizedLaneGroupReference(
            bool isDirectReference_,
            ZSERIO_T_counterpartReference&& counterpartReference_,
            ZSERIO_T_counterpartReferenceIndirect&& counterpartReferenceIndirect_,
            const allocator_type& allocator = allocator_type()) :
            MultiDigitizedLaneGroupReference(allocator)
    {
        m_isDirectReference_ = isDirectReference_;
        m_counterpartReference_ = ::std::forward<ZSERIO_T_counterpartReference>(counterpartReference_);
        m_counterpartReferenceIndirect_ = ::std::forward<ZSERIO_T_counterpartReferenceIndirect>(counterpartReferenceIndirect_);
    }

    explicit MultiDigitizedLaneGroupReference(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit MultiDigitizedLaneGroupReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~MultiDigitizedLaneGroupReference() = default;

    MultiDigitizedLaneGroupReference(const MultiDigitizedLaneGroupReference&) = default;
    MultiDigitizedLaneGroupReference& operator=(const MultiDigitizedLaneGroupReference&) = default;

    MultiDigitizedLaneGroupReference(MultiDigitizedLaneGroupReference&&) = default;
    MultiDigitizedLaneGroupReference& operator=(MultiDigitizedLaneGroupReference&&) = default;

    MultiDigitizedLaneGroupReference(::zserio::PropagateAllocatorT,
            const MultiDigitizedLaneGroupReference& other, const allocator_type& allocator);

    void initializeChildren();

    bool getIsDirectReference() const;
    void setIsDirectReference(bool isDirectReference_);

    const ::nds::lane::reference::types::LaneGroupId& getCounterpartReference() const;
    ::nds::lane::reference::types::LaneGroupId& getCounterpartReference();
    void setCounterpartReference(const ::nds::lane::reference::types::LaneGroupId& counterpartReference_);
    void setCounterpartReference(::nds::lane::reference::types::LaneGroupId&& counterpartReference_);
    bool isCounterpartReferenceUsed() const;
    bool isCounterpartReferenceSet() const;
    void resetCounterpartReference();

    const ::nds::lane::reference::types::LaneGroupReferenceIndirect& getCounterpartReferenceIndirect() const;
    ::nds::lane::reference::types::LaneGroupReferenceIndirect& getCounterpartReferenceIndirect();
    void setCounterpartReferenceIndirect(const ::nds::lane::reference::types::LaneGroupReferenceIndirect& counterpartReferenceIndirect_);
    void setCounterpartReferenceIndirect(::nds::lane::reference::types::LaneGroupReferenceIndirect&& counterpartReferenceIndirect_);
    bool isCounterpartReferenceIndirectUsed() const;
    bool isCounterpartReferenceIndirectSet() const;
    void resetCounterpartReferenceIndirect();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const MultiDigitizedLaneGroupReference& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    bool readIsDirectReference(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupId> readCounterpartReference(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupId> readCounterpartReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupReferenceIndirect> readCounterpartReferenceIndirect(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupReferenceIndirect> readCounterpartReferenceIndirect(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_isDirectReference_;
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupId> m_counterpartReference_;
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupReferenceIndirect> m_counterpartReferenceIndirect_;
};

} // namespace types
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_TYPES_MULTI_DIGITIZED_LANE_GROUP_REFERENCE_H