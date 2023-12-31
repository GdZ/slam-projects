/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_REFERENCE_TYPES_LANE_GROUP_TRANSITION_REFERENCE_H
#define NDS_LANE_REFERENCE_TYPES_LANE_GROUP_TRANSITION_REFERENCE_H

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

#include <nds/lane/reference/types/LaneGroupTransition.h>
#include <nds/lane/reference/types/LaneGroupTransitionGeoPath.h>
#include <nds/lane/reference/types/LaneGroupTransitionPath.h>
#include <nds/lane/reference/types/LaneGroupTransitionReferenceType.h>

namespace nds
{
namespace lane
{
namespace reference
{
namespace types
{

class LaneGroupTransitionReference
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::nds::lane::reference::types::LaneGroupTransition::ZserioPackingContext& getIntersectionTransition()
        {
            return m_intersectionTransition_;
        }

        ::nds::lane::reference::types::LaneGroupTransitionPath::ZserioPackingContext& getPathTransition()
        {
            return m_pathTransition_;
        }

        ::nds::lane::reference::types::LaneGroupTransitionGeoPath::ZserioPackingContext& getGeoPathTransition()
        {
            return m_geoPathTransition_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::nds::lane::reference::types::LaneGroupTransition::ZserioPackingContext m_intersectionTransition_;
        ::nds::lane::reference::types::LaneGroupTransitionPath::ZserioPackingContext m_pathTransition_;
        ::nds::lane::reference::types::LaneGroupTransitionGeoPath::ZserioPackingContext m_geoPathTransition_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneGroupTransitionReference() noexcept :
            LaneGroupTransitionReference(allocator_type())
    {}

    explicit LaneGroupTransitionReference(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_intersectionTransition = ::nds::lane::reference::types::LaneGroupTransition,
            typename ZSERIO_T_pathTransition = ::nds::lane::reference::types::LaneGroupTransitionPath,
            typename ZSERIO_T_geoPathTransition = ::nds::lane::reference::types::LaneGroupTransitionGeoPath>
    LaneGroupTransitionReference(
            ::nds::lane::reference::types::LaneGroupTransitionReferenceType type_,
            ZSERIO_T_intersectionTransition&& intersectionTransition_,
            ZSERIO_T_pathTransition&& pathTransition_,
            ZSERIO_T_geoPathTransition&& geoPathTransition_,
            const allocator_type& allocator = allocator_type()) :
            LaneGroupTransitionReference(allocator)
    {
        m_type_ = type_;
        m_intersectionTransition_ = ::std::forward<ZSERIO_T_intersectionTransition>(intersectionTransition_);
        m_pathTransition_ = ::std::forward<ZSERIO_T_pathTransition>(pathTransition_);
        m_geoPathTransition_ = ::std::forward<ZSERIO_T_geoPathTransition>(geoPathTransition_);
    }

    explicit LaneGroupTransitionReference(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneGroupTransitionReference(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneGroupTransitionReference() = default;

    LaneGroupTransitionReference(const LaneGroupTransitionReference&) = default;
    LaneGroupTransitionReference& operator=(const LaneGroupTransitionReference&) = default;

    LaneGroupTransitionReference(LaneGroupTransitionReference&&) = default;
    LaneGroupTransitionReference& operator=(LaneGroupTransitionReference&&) = default;

    LaneGroupTransitionReference(::zserio::PropagateAllocatorT,
            const LaneGroupTransitionReference& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::lane::reference::types::LaneGroupTransitionReferenceType getType() const;
    void setType(::nds::lane::reference::types::LaneGroupTransitionReferenceType type_);

    const ::nds::lane::reference::types::LaneGroupTransition& getIntersectionTransition() const;
    ::nds::lane::reference::types::LaneGroupTransition& getIntersectionTransition();
    void setIntersectionTransition(const ::nds::lane::reference::types::LaneGroupTransition& intersectionTransition_);
    void setIntersectionTransition(::nds::lane::reference::types::LaneGroupTransition&& intersectionTransition_);
    bool isIntersectionTransitionUsed() const;
    bool isIntersectionTransitionSet() const;
    void resetIntersectionTransition();

    const ::nds::lane::reference::types::LaneGroupTransitionPath& getPathTransition() const;
    ::nds::lane::reference::types::LaneGroupTransitionPath& getPathTransition();
    void setPathTransition(const ::nds::lane::reference::types::LaneGroupTransitionPath& pathTransition_);
    void setPathTransition(::nds::lane::reference::types::LaneGroupTransitionPath&& pathTransition_);
    bool isPathTransitionUsed() const;
    bool isPathTransitionSet() const;
    void resetPathTransition();

    const ::nds::lane::reference::types::LaneGroupTransitionGeoPath& getGeoPathTransition() const;
    ::nds::lane::reference::types::LaneGroupTransitionGeoPath& getGeoPathTransition();
    void setGeoPathTransition(const ::nds::lane::reference::types::LaneGroupTransitionGeoPath& geoPathTransition_);
    void setGeoPathTransition(::nds::lane::reference::types::LaneGroupTransitionGeoPath&& geoPathTransition_);
    bool isGeoPathTransitionUsed() const;
    bool isGeoPathTransitionSet() const;
    void resetGeoPathTransition();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneGroupTransitionReference& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::lane::reference::types::LaneGroupTransitionReferenceType readType(::zserio::BitStreamReader& in);
    ::nds::lane::reference::types::LaneGroupTransitionReferenceType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransition> readIntersectionTransition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransition> readIntersectionTransition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransitionPath> readPathTransition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransitionPath> readPathTransition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransitionGeoPath> readGeoPathTransition(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransitionGeoPath> readGeoPathTransition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::lane::reference::types::LaneGroupTransitionReferenceType m_type_;
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransition> m_intersectionTransition_;
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransitionPath> m_pathTransition_;
    ::zserio::InplaceOptionalHolder<::nds::lane::reference::types::LaneGroupTransitionGeoPath> m_geoPathTransition_;
};

} // namespace types
} // namespace reference
} // namespace lane
} // namespace nds

#endif // NDS_LANE_REFERENCE_TYPES_LANE_GROUP_TRANSITION_REFERENCE_H
