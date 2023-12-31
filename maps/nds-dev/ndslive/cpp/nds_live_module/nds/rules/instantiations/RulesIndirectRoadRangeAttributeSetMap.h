/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_INDIRECT_ROAD_RANGE_ATTRIBUTE_SET_MAP_H
#define NDS_RULES_INSTANTIATIONS_RULES_INDIRECT_ROAD_RANGE_ATTRIBUTE_SET_MAP_H

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
#include <nds/core/geometry/CoordShift.h>
#include <nds/road/reference/types/RoadRangeValidity.h>
#include <nds/road/reference/types/RoadReferenceIndirect.h>
#include <nds/rules/instantiations/RulesRoadRangeAttributeSet.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesIndirectRoadRangeAttributeSetMap
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::rules::instantiations::RulesRoadRangeAttributeSet::ZserioPackingContext& getAttributeSet()
        {
            return m_attributeSet_;
        }

        ::zserio::DeltaContext& getFeature()
        {
            return m_feature_;
        }

    private:
        ::nds::rules::instantiations::RulesRoadRangeAttributeSet::ZserioPackingContext m_attributeSet_;
        ::zserio::DeltaContext m_feature_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesIndirectRoadRangeAttributeSetMap() noexcept :
            RulesIndirectRoadRangeAttributeSetMap(allocator_type())
    {}

    explicit RulesIndirectRoadRangeAttributeSetMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeSet = ::nds::rules::instantiations::RulesRoadRangeAttributeSet,
            typename ZSERIO_T_references = ::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>,
            typename ZSERIO_T_validities = ::zserio::vector<::nds::road::reference::types::RoadRangeValidity>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeSet, RulesIndirectRoadRangeAttributeSetMap, allocator_type> = 0>
    RulesIndirectRoadRangeAttributeSetMap(
            ZSERIO_T_attributeSet&& attributeSet_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_references&& references_,
            ZSERIO_T_validities&& validities_,
            const allocator_type& allocator = allocator_type()) :
            RulesIndirectRoadRangeAttributeSetMap(allocator)
    {
        m_attributeSet_ = ::std::forward<ZSERIO_T_attributeSet>(attributeSet_);
        m_feature_ = feature_;
        m_references_ = ZserioArrayType_references(::std::forward<ZSERIO_T_references>(references_));
        m_validities_ = ZserioArrayType_validities(::std::forward<ZSERIO_T_validities>(validities_));
    }

    explicit RulesIndirectRoadRangeAttributeSetMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit RulesIndirectRoadRangeAttributeSetMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~RulesIndirectRoadRangeAttributeSetMap() = default;

    RulesIndirectRoadRangeAttributeSetMap(const RulesIndirectRoadRangeAttributeSetMap& other);
    RulesIndirectRoadRangeAttributeSetMap& operator=(const RulesIndirectRoadRangeAttributeSetMap& other);

    RulesIndirectRoadRangeAttributeSetMap(RulesIndirectRoadRangeAttributeSetMap&& other);
    RulesIndirectRoadRangeAttributeSetMap& operator=(RulesIndirectRoadRangeAttributeSetMap&& other);

    RulesIndirectRoadRangeAttributeSetMap(::zserio::PropagateAllocatorT,
            const RulesIndirectRoadRangeAttributeSetMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    const ::nds::rules::instantiations::RulesRoadRangeAttributeSet& getAttributeSet() const;
    ::nds::rules::instantiations::RulesRoadRangeAttributeSet& getAttributeSet();
    void setAttributeSet(const ::nds::rules::instantiations::RulesRoadRangeAttributeSet& attributeSet_);
    void setAttributeSet(::nds::rules::instantiations::RulesRoadRangeAttributeSet&& attributeSet_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>& getReferences() const;
    ::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>& getReferences();
    void setReferences(const ::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>& references_);
    void setReferences(::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>&& references_);

    const ::zserio::vector<::nds::road::reference::types::RoadRangeValidity>& getValidities() const;
    ::zserio::vector<::nds::road::reference::types::RoadRangeValidity>& getValidities();
    void setValidities(const ::zserio::vector<::nds::road::reference::types::RoadRangeValidity>& validities_);
    void setValidities(::zserio::vector<::nds::road::reference::types::RoadRangeValidity>&& validities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesIndirectRoadRangeAttributeSetMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_references
    {
    public:
        using OwnerType = RulesIndirectRoadRangeAttributeSetMap;

        static void initializeElement(RulesIndirectRoadRangeAttributeSetMap& owner,
                ::nds::road::reference::types::RoadReferenceIndirect& element, size_t index);
    };

    class ZserioElementFactory_references
    {
    public:
        using OwnerType = RulesIndirectRoadRangeAttributeSetMap;

        static void create(RulesIndirectRoadRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesIndirectRoadRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>& array,
                ::nds::road::reference::types::RoadReferenceIndirect::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_validities
    {
    public:
        using OwnerType = RulesIndirectRoadRangeAttributeSetMap;

        static void initializeElement(RulesIndirectRoadRangeAttributeSetMap& owner,
                ::nds::road::reference::types::RoadRangeValidity& element, size_t index);
    };

    class ZserioElementFactory_validities
    {
    public:
        using OwnerType = RulesIndirectRoadRangeAttributeSetMap;

        static void create(RulesIndirectRoadRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadRangeValidity>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesIndirectRoadRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadRangeValidity>& array,
                ::nds::road::reference::types::RoadRangeValidity::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_references = ::zserio::Array<::zserio::vector<::nds::road::reference::types::RoadReferenceIndirect>, ::zserio::ObjectArrayTraits<::nds::road::reference::types::RoadReferenceIndirect, ZserioElementFactory_references>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_references>;
    using ZserioArrayType_validities = ::zserio::Array<::zserio::vector<::nds::road::reference::types::RoadRangeValidity>, ::zserio::ObjectArrayTraits<::nds::road::reference::types::RoadRangeValidity, ZserioElementFactory_validities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_validities>;

    ::nds::rules::instantiations::RulesRoadRangeAttributeSet readAttributeSet(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::instantiations::RulesRoadRangeAttributeSet readAttributeSet(ZserioPackingContext& context,
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
    ZserioArrayType_validities readValidities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    ::nds::rules::instantiations::RulesRoadRangeAttributeSet m_attributeSet_;
    ::nds::core::attributemap::FeatureIterator m_feature_;
    ZserioArrayType_references m_references_;
    ZserioArrayType_validities m_validities_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_INDIRECT_ROAD_RANGE_ATTRIBUTE_SET_MAP_H
