/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_TRANSITION_ATTRIBUTE_SET_MAP_H
#define NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_TRANSITION_ATTRIBUTE_SET_MAP_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

#include <nds/core/attributemap/FeatureIterator.h>
#include <nds/core/attributemap/Validity.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/road/reference/types/TransitionReference.h>
#include <nds/traffic/instantiations/TrafficTransitionAttributeSet.h>

namespace nds
{
namespace traffic
{
namespace instantiations
{

class TrafficTransitionAttributeSetMap
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::traffic::instantiations::TrafficTransitionAttributeSet::ZserioPackingContext& getAttributeSet()
        {
            return m_attributeSet_;
        }

        ::zserio::DeltaContext& getFeature()
        {
            return m_feature_;
        }

    private:
        ::nds::traffic::instantiations::TrafficTransitionAttributeSet::ZserioPackingContext m_attributeSet_;
        ::zserio::DeltaContext m_feature_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TrafficTransitionAttributeSetMap() noexcept :
            TrafficTransitionAttributeSetMap(allocator_type())
    {}

    explicit TrafficTransitionAttributeSetMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeSet = ::nds::traffic::instantiations::TrafficTransitionAttributeSet,
            typename ZSERIO_T_references = ::zserio::vector<::nds::road::reference::types::TransitionReference>,
            typename ZSERIO_T_validities = ::zserio::vector<::nds::core::attributemap::Validity>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeSet, TrafficTransitionAttributeSetMap, allocator_type> = 0>
    TrafficTransitionAttributeSetMap(
            ZSERIO_T_attributeSet&& attributeSet_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_references&& references_,
            ZSERIO_T_validities&& validities_,
            const allocator_type& allocator = allocator_type()) :
            TrafficTransitionAttributeSetMap(allocator)
    {
        m_attributeSet_ = ::std::forward<ZSERIO_T_attributeSet>(attributeSet_);
        m_feature_ = feature_;
        m_references_ = ZserioArrayType_references(::std::forward<ZSERIO_T_references>(references_));
        m_validities_ = ZserioArrayType_validities(::std::forward<ZSERIO_T_validities>(validities_));
    }

    explicit TrafficTransitionAttributeSetMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit TrafficTransitionAttributeSetMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~TrafficTransitionAttributeSetMap() = default;

    TrafficTransitionAttributeSetMap(const TrafficTransitionAttributeSetMap& other);
    TrafficTransitionAttributeSetMap& operator=(const TrafficTransitionAttributeSetMap& other);

    TrafficTransitionAttributeSetMap(TrafficTransitionAttributeSetMap&& other);
    TrafficTransitionAttributeSetMap& operator=(TrafficTransitionAttributeSetMap&& other);

    TrafficTransitionAttributeSetMap(::zserio::PropagateAllocatorT,
            const TrafficTransitionAttributeSetMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    const ::nds::traffic::instantiations::TrafficTransitionAttributeSet& getAttributeSet() const;
    ::nds::traffic::instantiations::TrafficTransitionAttributeSet& getAttributeSet();
    void setAttributeSet(const ::nds::traffic::instantiations::TrafficTransitionAttributeSet& attributeSet_);
    void setAttributeSet(::nds::traffic::instantiations::TrafficTransitionAttributeSet&& attributeSet_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::road::reference::types::TransitionReference>& getReferences() const;
    ::zserio::vector<::nds::road::reference::types::TransitionReference>& getReferences();
    void setReferences(const ::zserio::vector<::nds::road::reference::types::TransitionReference>& references_);
    void setReferences(::zserio::vector<::nds::road::reference::types::TransitionReference>&& references_);

    const ::zserio::vector<::nds::core::attributemap::Validity>& getValidities() const;
    ::zserio::vector<::nds::core::attributemap::Validity>& getValidities();
    void setValidities(const ::zserio::vector<::nds::core::attributemap::Validity>& validities_);
    void setValidities(::zserio::vector<::nds::core::attributemap::Validity>&& validities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TrafficTransitionAttributeSetMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_references
    {
    public:
        using OwnerType = TrafficTransitionAttributeSetMap;

        static void initializeElement(TrafficTransitionAttributeSetMap& owner,
                ::nds::road::reference::types::TransitionReference& element, size_t index);
    };

    class ZserioElementFactory_references
    {
    public:
        using OwnerType = TrafficTransitionAttributeSetMap;

        static void create(TrafficTransitionAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::TransitionReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(TrafficTransitionAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::TransitionReference>& array,
                ::nds::road::reference::types::TransitionReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_validities
    {
    public:
        using OwnerType = TrafficTransitionAttributeSetMap;

        static void initializeElement(TrafficTransitionAttributeSetMap& owner,
                ::nds::core::attributemap::Validity& element, size_t index);
    };

    class ZserioElementFactory_validities
    {
    public:
        using OwnerType = TrafficTransitionAttributeSetMap;

        static void create(TrafficTransitionAttributeSetMap& owner,
                ::zserio::vector<::nds::core::attributemap::Validity>& array,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_references = ::zserio::Array<::zserio::vector<::nds::road::reference::types::TransitionReference>, ::zserio::ObjectArrayTraits<::nds::road::reference::types::TransitionReference, ZserioElementFactory_references>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_references>;
    using ZserioArrayType_validities = ::zserio::Array<::zserio::vector<::nds::core::attributemap::Validity>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::Validity, ZserioElementFactory_validities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_validities>;

    ::nds::traffic::instantiations::TrafficTransitionAttributeSet readAttributeSet(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::traffic::instantiations::TrafficTransitionAttributeSet readAttributeSet(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::attributemap::FeatureIterator readFeature(::zserio::BitStreamReader& in);
    ::nds::core::attributemap::FeatureIterator readFeature(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_references readReferences(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_references readReferences(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_validities readValidities(::zserio::BitStreamReader& in,
            const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    ::nds::traffic::instantiations::TrafficTransitionAttributeSet m_attributeSet_;
    ::nds::core::attributemap::FeatureIterator m_feature_;
    ZserioArrayType_references m_references_;
    ZserioArrayType_validities m_validities_;
};

} // namespace instantiations
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_TRANSITION_ATTRIBUTE_SET_MAP_H
