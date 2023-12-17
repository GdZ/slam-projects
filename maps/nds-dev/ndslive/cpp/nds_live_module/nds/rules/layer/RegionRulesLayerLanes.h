/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_LAYER_REGION_RULES_LAYER_LANES_H
#define NDS_RULES_LAYER_REGION_RULES_LAYER_LANES_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/core/geometry/CoordShift.h>
#include <nds/core/types/RegionId.h>
#include <nds/rules/instantiations/RulesRegionAttributeMapList.h>
#include <nds/rules/instantiations/RulesRegionAttributeSetList.h>
#include <nds/rules/layer/RegionLaneGroupRelationList.h>
#include <nds/rules/metadata/RegionRulesLayerContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace rules
{
namespace layer
{

class RegionRulesLayerLanes
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumRegions()
        {
            return m_numRegions_;
        }

        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::rules::instantiations::RulesRegionAttributeMapList::ZserioPackingContext& getRegionRulesAttributeMaps()
        {
            return m_regionRulesAttributeMaps_;
        }

        ::nds::rules::instantiations::RulesRegionAttributeSetList::ZserioPackingContext& getRegionRulesAttributeSets()
        {
            return m_regionRulesAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_numRegions_;
        ::zserio::DeltaContext m_content_;
        ::nds::rules::instantiations::RulesRegionAttributeMapList::ZserioPackingContext m_regionRulesAttributeMaps_;
        ::nds::rules::instantiations::RulesRegionAttributeSetList::ZserioPackingContext m_regionRulesAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    RegionRulesLayerLanes() noexcept :
            RegionRulesLayerLanes(allocator_type())
    {}

    explicit RegionRulesLayerLanes(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_regionId = ::zserio::vector<::nds::core::types::RegionId>,
            typename ZSERIO_T_regionRulesAttributeMaps = ::nds::rules::instantiations::RulesRegionAttributeMapList,
            typename ZSERIO_T_regionRulesAttributeSets = ::nds::rules::instantiations::RulesRegionAttributeSetList,
            typename ZSERIO_T_hasFeatureRelations = bool,
            typename ZSERIO_T_featureRelations = ::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>>
    RegionRulesLayerLanes(
            uint16_t numRegions_,
            ZSERIO_T_regionId&& regionId_,
            ::nds::rules::metadata::RegionRulesLayerContent content_,
            ZSERIO_T_regionRulesAttributeMaps&& regionRulesAttributeMaps_,
            ZSERIO_T_regionRulesAttributeSets&& regionRulesAttributeSets_,
            ZSERIO_T_hasFeatureRelations&& hasFeatureRelations_,
            ZSERIO_T_featureRelations&& featureRelations_,
            const allocator_type& allocator = allocator_type()) :
            RegionRulesLayerLanes(allocator)
    {
        m_numRegions_ = numRegions_;
        m_regionId_ = ZserioArrayType_regionId(::std::forward<ZSERIO_T_regionId>(regionId_));
        m_content_ = content_;
        m_regionRulesAttributeMaps_ = ::std::forward<ZSERIO_T_regionRulesAttributeMaps>(regionRulesAttributeMaps_);
        m_regionRulesAttributeSets_ = ::std::forward<ZSERIO_T_regionRulesAttributeSets>(regionRulesAttributeSets_);
        m_hasFeatureRelations_ = ::std::forward<ZSERIO_T_hasFeatureRelations>(hasFeatureRelations_);
        m_featureRelations_ = ::zserio::createOptionalArray<ZserioArrayType_featureRelations>(::std::forward<ZSERIO_T_featureRelations>(featureRelations_));
    }

    explicit RegionRulesLayerLanes(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RegionRulesLayerLanes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RegionRulesLayerLanes() = default;

    RegionRulesLayerLanes(const RegionRulesLayerLanes& other);
    RegionRulesLayerLanes& operator=(const RegionRulesLayerLanes& other);

    RegionRulesLayerLanes(RegionRulesLayerLanes&& other);
    RegionRulesLayerLanes& operator=(RegionRulesLayerLanes&& other);

    RegionRulesLayerLanes(::zserio::PropagateAllocatorT,
            const RegionRulesLayerLanes& other, const allocator_type& allocator);

    void initializeChildren();

    uint16_t getNumRegions() const;
    void setNumRegions(uint16_t numRegions_);

    const ::zserio::vector<::nds::core::types::RegionId>& getRegionId() const;
    ::zserio::vector<::nds::core::types::RegionId>& getRegionId();
    void setRegionId(const ::zserio::vector<::nds::core::types::RegionId>& regionId_);
    void setRegionId(::zserio::vector<::nds::core::types::RegionId>&& regionId_);

    ::nds::rules::metadata::RegionRulesLayerContent getContent() const;
    void setContent(::nds::rules::metadata::RegionRulesLayerContent content_);

    const ::nds::rules::instantiations::RulesRegionAttributeMapList& getRegionRulesAttributeMaps() const;
    ::nds::rules::instantiations::RulesRegionAttributeMapList& getRegionRulesAttributeMaps();
    void setRegionRulesAttributeMaps(const ::nds::rules::instantiations::RulesRegionAttributeMapList& regionRulesAttributeMaps_);
    void setRegionRulesAttributeMaps(::nds::rules::instantiations::RulesRegionAttributeMapList&& regionRulesAttributeMaps_);
    bool isRegionRulesAttributeMapsUsed() const;
    bool isRegionRulesAttributeMapsSet() const;
    void resetRegionRulesAttributeMaps();

    const ::nds::rules::instantiations::RulesRegionAttributeSetList& getRegionRulesAttributeSets() const;
    ::nds::rules::instantiations::RulesRegionAttributeSetList& getRegionRulesAttributeSets();
    void setRegionRulesAttributeSets(const ::nds::rules::instantiations::RulesRegionAttributeSetList& regionRulesAttributeSets_);
    void setRegionRulesAttributeSets(::nds::rules::instantiations::RulesRegionAttributeSetList&& regionRulesAttributeSets_);
    bool isRegionRulesAttributeSetsUsed() const;
    bool isRegionRulesAttributeSetsSet() const;
    void resetRegionRulesAttributeSets();

    bool getHasFeatureRelations() const;
    void setHasFeatureRelations(bool hasFeatureRelations_);
    bool isHasFeatureRelationsUsed() const;
    bool isHasFeatureRelationsSet() const;
    void resetHasFeatureRelations();

    const ::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>& getFeatureRelations() const;
    ::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>& getFeatureRelations();
    void setFeatureRelations(const ::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>& featureRelations_);
    void setFeatureRelations(::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>&& featureRelations_);
    bool isFeatureRelationsUsed() const;
    bool isFeatureRelationsSet() const;
    void resetFeatureRelations();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RegionRulesLayerLanes& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_featureRelations
    {
    public:
        using OwnerType = RegionRulesLayerLanes;

        static void initializeElement(RegionRulesLayerLanes& owner,
                ::nds::rules::layer::RegionLaneGroupRelationList& element, size_t index);
    };

    class ZserioElementFactory_featureRelations
    {
    public:
        using OwnerType = RegionRulesLayerLanes;

        static void create(RegionRulesLayerLanes& owner,
                ::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RegionRulesLayerLanes& owner,
                ::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>& array,
                ::nds::rules::layer::RegionLaneGroupRelationList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_regionId = ::zserio::Array<::zserio::vector<::nds::core::types::RegionId>, ::zserio::VarIntNNArrayTraits<::nds::core::types::RegionId>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_featureRelations = ::zserio::Array<::zserio::vector<::nds::rules::layer::RegionLaneGroupRelationList>, ::zserio::ObjectArrayTraits<::nds::rules::layer::RegionLaneGroupRelationList, ZserioElementFactory_featureRelations>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_featureRelations>;

    uint16_t readNumRegions(::zserio::BitStreamReader& in);
    uint16_t readNumRegions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_regionId readRegionId(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_regionId readRegionId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::rules::metadata::RegionRulesLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::rules::metadata::RegionRulesLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRegionAttributeMapList> readRegionRulesAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRegionAttributeMapList> readRegionRulesAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRegionAttributeSetList> readRegionRulesAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRegionAttributeSetList> readRegionRulesAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<bool> readHasFeatureRelations(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_featureRelations> readFeatureRelations(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_featureRelations> readFeatureRelations(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    uint16_t m_numRegions_;
    ZserioArrayType_regionId m_regionId_;
    ::nds::rules::metadata::RegionRulesLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRegionAttributeMapList> m_regionRulesAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::rules::instantiations::RulesRegionAttributeSetList> m_regionRulesAttributeSets_;
    ::zserio::InplaceOptionalHolder<bool> m_hasFeatureRelations_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_featureRelations> m_featureRelations_;
};

} // namespace layer
} // namespace rules
} // namespace nds

#endif // NDS_RULES_LAYER_REGION_RULES_LAYER_LANES_H
