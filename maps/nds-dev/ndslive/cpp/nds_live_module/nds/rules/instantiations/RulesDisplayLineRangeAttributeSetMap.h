/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_RANGE_ATTRIBUTE_SET_MAP_H
#define NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_RANGE_ATTRIBUTE_SET_MAP_H

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
#include <nds/display/reference/types/DisplayLineRangeValidity.h>
#include <nds/display/reference/types/DisplayLineReference.h>
#include <nds/rules/instantiations/RulesDisplayLineRangeAttributeSet.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesDisplayLineRangeAttributeSetMap
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet::ZserioPackingContext& getAttributeSet()
        {
            return m_attributeSet_;
        }

        ::zserio::DeltaContext& getFeature()
        {
            return m_feature_;
        }

    private:
        ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet::ZserioPackingContext m_attributeSet_;
        ::zserio::DeltaContext m_feature_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesDisplayLineRangeAttributeSetMap() noexcept :
            RulesDisplayLineRangeAttributeSetMap(allocator_type())
    {}

    explicit RulesDisplayLineRangeAttributeSetMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeSet = ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet,
            typename ZSERIO_T_references = ::zserio::vector<::nds::display::reference::types::DisplayLineReference>,
            typename ZSERIO_T_validities = ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeSet, RulesDisplayLineRangeAttributeSetMap, allocator_type> = 0>
    RulesDisplayLineRangeAttributeSetMap(
            ZSERIO_T_attributeSet&& attributeSet_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_references&& references_,
            ZSERIO_T_validities&& validities_,
            const allocator_type& allocator = allocator_type()) :
            RulesDisplayLineRangeAttributeSetMap(allocator)
    {
        m_attributeSet_ = ::std::forward<ZSERIO_T_attributeSet>(attributeSet_);
        m_feature_ = feature_;
        m_references_ = ZserioArrayType_references(::std::forward<ZSERIO_T_references>(references_));
        m_validities_ = ZserioArrayType_validities(::std::forward<ZSERIO_T_validities>(validities_));
    }

    explicit RulesDisplayLineRangeAttributeSetMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit RulesDisplayLineRangeAttributeSetMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~RulesDisplayLineRangeAttributeSetMap() = default;

    RulesDisplayLineRangeAttributeSetMap(const RulesDisplayLineRangeAttributeSetMap& other);
    RulesDisplayLineRangeAttributeSetMap& operator=(const RulesDisplayLineRangeAttributeSetMap& other);

    RulesDisplayLineRangeAttributeSetMap(RulesDisplayLineRangeAttributeSetMap&& other);
    RulesDisplayLineRangeAttributeSetMap& operator=(RulesDisplayLineRangeAttributeSetMap&& other);

    RulesDisplayLineRangeAttributeSetMap(::zserio::PropagateAllocatorT,
            const RulesDisplayLineRangeAttributeSetMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    const ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet& getAttributeSet() const;
    ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet& getAttributeSet();
    void setAttributeSet(const ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet& attributeSet_);
    void setAttributeSet(::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet&& attributeSet_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& getReferences() const;
    ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& getReferences();
    void setReferences(const ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& references_);
    void setReferences(::zserio::vector<::nds::display::reference::types::DisplayLineReference>&& references_);

    const ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& getValidities() const;
    ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& getValidities();
    void setValidities(const ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& validities_);
    void setValidities(::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>&& validities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesDisplayLineRangeAttributeSetMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_references
    {
    public:
        using OwnerType = RulesDisplayLineRangeAttributeSetMap;

        static void create(RulesDisplayLineRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesDisplayLineRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& array,
                ::nds::display::reference::types::DisplayLineReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_validities
    {
    public:
        using OwnerType = RulesDisplayLineRangeAttributeSetMap;

        static void initializeElement(RulesDisplayLineRangeAttributeSetMap& owner,
                ::nds::display::reference::types::DisplayLineRangeValidity& element, size_t index);
    };

    class ZserioElementFactory_validities
    {
    public:
        using OwnerType = RulesDisplayLineRangeAttributeSetMap;

        static void create(RulesDisplayLineRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesDisplayLineRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& array,
                ::nds::display::reference::types::DisplayLineRangeValidity::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_references = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayLineReference>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayLineReference, ZserioElementFactory_references>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_validities = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayLineRangeValidity, ZserioElementFactory_validities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_validities>;

    ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet readAttributeSet(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet readAttributeSet(ZserioPackingContext& context,
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
    ::nds::rules::instantiations::RulesDisplayLineRangeAttributeSet m_attributeSet_;
    ::nds::core::attributemap::FeatureIterator m_feature_;
    ZserioArrayType_references m_references_;
    ZserioArrayType_validities m_validities_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_RANGE_ATTRIBUTE_SET_MAP_H
