/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_REFERENCE_TYPES_TRANSITION_REFERENCE_H
#define NDS_ROAD_REFERENCE_TYPES_TRANSITION_REFERENCE_H

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

#include <nds/road/reference/types/IntersectionTransition.h>
#include <nds/road/reference/types/TransitionGeoPathReference.h>
#include <nds/road/reference/types/TransitionPathReference.h>
#include <nds/road/reference/types/TransitionReferenceType.h>

namespace nds
{
namespace road
{
namespace reference
{
namespace types
{

class TransitionReference
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::nds::road::reference::types::IntersectionTransition::ZserioPackingContext& getIntersectionTransition()
        {
            return m_intersectionTransition_;
        }

        ::nds::road::reference::types::TransitionPathReference::ZserioPackingContext& getTransitionPathReference()
        {
            return m_transitionPathReference_;
        }

        ::nds::road::reference::types::TransitionGeoPathReference::ZserioPackingContext& getTransitionGeoPathReference()
        {
            return m_transitionGeoPathReference_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::nds::road::reference::types::IntersectionTransition::ZserioPackingContext m_intersectionTransition_;
        ::nds::road::reference::types::TransitionPathReference::ZserioPackingContext m_transitionPathReference_;
        ::nds::road::reference::types::TransitionGeoPathReference::ZserioPackingContext m_transitionGeoPathReference_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TransitionReference() noexcept :
            TransitionReference(allocator_type())
    {}

    explicit TransitionReference(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_intersectionTransition = ::nds::road::reference::types::IntersectionTransition,
            typename ZSERIO_T_transitionPathReference = ::nds::road::reference::types::TransitionPathReference,
            typename ZSERIO_T_transitionGeoPathReference = ::nds::road::reference::types::TransitionGeoPathReference>
    TransitionReference(
            ::nds::road::reference::types::TransitionReferenceType type_,
            ZSERIO_T_intersectionTransition&& intersectionTransition_,
            ZSERIO_T_transitionPathReference&& transitionPathReference_,
            ZSERIO_T_transitionGeoPathReference&& transitionGeoPathReference_,
            const allocator_type& allocator = allocator_type()) :
            TransitionReference(allocator)
    {
        m_type_ = type_;
        m_intersectionTransition_ = ::std::forward<ZSERIO_T_intersectionTransition>(intersectionTransition_);
        m_transitionPathReference_ = ::std::forward<ZSERIO_T_transitionPathReference>(transitionPathReference_);
        m_transitionGeoPathReference_ = ::std::forward<ZSERIO_T_transitionGeoPathReference>(transitionGeoPathReference_);
    }

    explicit TransitionReference(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TransitionReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TransitionReference() = default;

    TransitionReference(const TransitionReference& other);
    TransitionReference& operator=(const TransitionReference& other);

    TransitionReference(TransitionReference&& other);
    TransitionReference& operator=(TransitionReference&& other);

    TransitionReference(::zserio::PropagateAllocatorT,
            const TransitionReference& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::road::reference::types::TransitionReferenceType getType() const;
    void setType(::nds::road::reference::types::TransitionReferenceType type_);

    const ::nds::road::reference::types::IntersectionTransition& getIntersectionTransition() const;
    ::nds::road::reference::types::IntersectionTransition& getIntersectionTransition();
    void setIntersectionTransition(const ::nds::road::reference::types::IntersectionTransition& intersectionTransition_);
    void setIntersectionTransition(::nds::road::reference::types::IntersectionTransition&& intersectionTransition_);
    bool isIntersectionTransitionUsed() const;
    bool isIntersectionTransitionSet() const;
    void resetIntersectionTransition();

    const ::nds::road::reference::types::TransitionPathReference& getTransitionPathReference() const;
    ::nds::road::reference::types::TransitionPathReference& getTransitionPathReference();
    void setTransitionPathReference(const ::nds::road::reference::types::TransitionPathReference& transitionPathReference_);
    void setTransitionPathReference(::nds::road::reference::types::TransitionPathReference&& transitionPathReference_);
    bool isTransitionPathReferenceUsed() const;
    bool isTransitionPathReferenceSet() const;
    void resetTransitionPathReference();

    const ::nds::road::reference::types::TransitionGeoPathReference& getTransitionGeoPathReference() const;
    ::nds::road::reference::types::TransitionGeoPathReference& getTransitionGeoPathReference();
    void setTransitionGeoPathReference(const ::nds::road::reference::types::TransitionGeoPathReference& transitionGeoPathReference_);
    void setTransitionGeoPathReference(::nds::road::reference::types::TransitionGeoPathReference&& transitionGeoPathReference_);
    bool isTransitionGeoPathReferenceUsed() const;
    bool isTransitionGeoPathReferenceSet() const;
    void resetTransitionGeoPathReference();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TransitionReference& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::road::reference::types::TransitionReferenceType readType(::zserio::BitStreamReader& in);
    ::nds::road::reference::types::TransitionReferenceType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::IntersectionTransition> readIntersectionTransition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::IntersectionTransition> readIntersectionTransition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::TransitionPathReference> readTransitionPathReference(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::TransitionPathReference> readTransitionPathReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::TransitionGeoPathReference> readTransitionGeoPathReference(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::TransitionGeoPathReference> readTransitionGeoPathReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::road::reference::types::TransitionReferenceType m_type_;
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::IntersectionTransition> m_intersectionTransition_;
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::TransitionPathReference> m_transitionPathReference_;
    ::zserio::InplaceOptionalHolder<::nds::road::reference::types::TransitionGeoPathReference> m_transitionGeoPathReference_;
};

} // namespace types
} // namespace reference
} // namespace road
} // namespace nds

#endif // NDS_ROAD_REFERENCE_TYPES_TRANSITION_REFERENCE_H
