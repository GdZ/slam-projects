/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_SET_MAP_H
#define NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_SET_MAP_H

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
#include <nds/display/reference/types/DisplayLinePositionValidity.h>
#include <nds/display/reference/types/DisplayLineReference.h>
#include <nds/rules/instantiations/RulesDisplayLinePositionAttributeSet.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesDisplayLinePositionAttributeSetMap
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet::ZserioPackingContext& getAttributeSet()
        {
            return m_attributeSet_;
        }

        ::zserio::DeltaContext& getFeature()
        {
            return m_feature_;
        }

    private:
        ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet::ZserioPackingContext m_attributeSet_;
        ::zserio::DeltaContext m_feature_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RulesDisplayLinePositionAttributeSetMap() noexcept :
            RulesDisplayLinePositionAttributeSetMap(allocator_type())
    {}

    explicit RulesDisplayLinePositionAttributeSetMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeSet = ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet,
            typename ZSERIO_T_references = ::zserio::vector<::nds::display::reference::types::DisplayLineReference>,
            typename ZSERIO_T_validities = ::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeSet, RulesDisplayLinePositionAttributeSetMap, allocator_type> = 0>
    RulesDisplayLinePositionAttributeSetMap(
            ZSERIO_T_attributeSet&& attributeSet_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_references&& references_,
            ZSERIO_T_validities&& validities_,
            const allocator_type& allocator = allocator_type()) :
            RulesDisplayLinePositionAttributeSetMap(allocator)
    {
        m_attributeSet_ = ::std::forward<ZSERIO_T_attributeSet>(attributeSet_);
        m_feature_ = feature_;
        m_references_ = ZserioArrayType_references(::std::forward<ZSERIO_T_references>(references_));
        m_validities_ = ZserioArrayType_validities(::std::forward<ZSERIO_T_validities>(validities_));
    }

    explicit RulesDisplayLinePositionAttributeSetMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit RulesDisplayLinePositionAttributeSetMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~RulesDisplayLinePositionAttributeSetMap() = default;

    RulesDisplayLinePositionAttributeSetMap(const RulesDisplayLinePositionAttributeSetMap& other);
    RulesDisplayLinePositionAttributeSetMap& operator=(const RulesDisplayLinePositionAttributeSetMap& other);

    RulesDisplayLinePositionAttributeSetMap(RulesDisplayLinePositionAttributeSetMap&& other);
    RulesDisplayLinePositionAttributeSetMap& operator=(RulesDisplayLinePositionAttributeSetMap&& other);

    RulesDisplayLinePositionAttributeSetMap(::zserio::PropagateAllocatorT,
            const RulesDisplayLinePositionAttributeSetMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    const ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet& getAttributeSet() const;
    ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet& getAttributeSet();
    void setAttributeSet(const ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet& attributeSet_);
    void setAttributeSet(::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet&& attributeSet_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& getReferences() const;
    ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& getReferences();
    void setReferences(const ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& references_);
    void setReferences(::zserio::vector<::nds::display::reference::types::DisplayLineReference>&& references_);

    const ::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>& getValidities() const;
    ::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>& getValidities();
    void setValidities(const ::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>& validities_);
    void setValidities(::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>&& validities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesDisplayLinePositionAttributeSetMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_references
    {
    public:
        using OwnerType = RulesDisplayLinePositionAttributeSetMap;

        static void create(RulesDisplayLinePositionAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesDisplayLinePositionAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& array,
                ::nds::display::reference::types::DisplayLineReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_validities
    {
    public:
        using OwnerType = RulesDisplayLinePositionAttributeSetMap;

        static void initializeElement(RulesDisplayLinePositionAttributeSetMap& owner,
                ::nds::display::reference::types::DisplayLinePositionValidity& element, size_t index);
    };

    class ZserioElementFactory_validities
    {
    public:
        using OwnerType = RulesDisplayLinePositionAttributeSetMap;

        static void create(RulesDisplayLinePositionAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesDisplayLinePositionAttributeSetMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>& array,
                ::nds::display::reference::types::DisplayLinePositionValidity::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_references = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayLineReference>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayLineReference, ZserioElementFactory_references>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_validities = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayLinePositionValidity>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayLinePositionValidity, ZserioElementFactory_validities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_validities>;

    ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet readAttributeSet(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet readAttributeSet(ZserioPackingContext& context,
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
    ::nds::rules::instantiations::RulesDisplayLinePositionAttributeSet m_attributeSet_;
    ::nds::core::attributemap::FeatureIterator m_feature_;
    ZserioArrayType_references m_references_;
    ZserioArrayType_validities m_validities_;
};

} // namespace instantiations
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_DISPLAY_LINE_POSITION_ATTRIBUTE_SET_MAP_H
