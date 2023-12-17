/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_INSTANTIATIONS_POI_DISPLAY_MESH3_DRELATION_MAP_H
#define NDS_POI_INSTANTIATIONS_POI_DISPLAY_MESH3_DRELATION_MAP_H

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

#include <nds/core/attributemap/AttributeIterator.h>
#include <nds/core/attributemap/ConditionList.h>
#include <nds/core/attributemap/FeatureIterator.h>
#include <nds/core/attributemap/PropertyList_CorePropertyType_CorePropertyValue.h>
#include <nds/core/attributemap/Validity.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/display/reference/types/DisplayMesh3dId.h>
#include <nds/poi/instantiations/PoiDisplayMesh3DRelation.h>
#include <nds/poi/poi/PoiDisplayMesh3DRelationType.h>

namespace nds
{
namespace poi
{
namespace instantiations
{

class PoiDisplayMesh3DRelationMap
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::zserio::DeltaContext& getFeature()
        {
            return m_feature_;
        }

        ::zserio::DeltaContext& getAttribute()
        {
            return m_attribute_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::zserio::DeltaContext m_feature_;
        ::zserio::DeltaContext m_attribute_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiDisplayMesh3DRelationMap() noexcept :
            PoiDisplayMesh3DRelationMap(allocator_type())
    {}

    explicit PoiDisplayMesh3DRelationMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_featureReferences = ::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>,
            typename ZSERIO_T_featureValidities = ::zserio::vector<::nds::core::attributemap::Validity>,
            typename ZSERIO_T_featureValuePtr = ::zserio::vector<::nds::core::attributemap::AttributeIterator>,
            typename ZSERIO_T_attributeValues = ::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>,
            typename ZSERIO_T_attributeProperties = ::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>,
            typename ZSERIO_T_attributeConditions = ::zserio::vector<::nds::core::attributemap::ConditionList>>
    PoiDisplayMesh3DRelationMap(
            ::nds::poi::poi::PoiDisplayMesh3DRelationType attributeTypeCode_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_featureReferences&& featureReferences_,
            ZSERIO_T_featureValidities&& featureValidities_,
            ZSERIO_T_featureValuePtr&& featureValuePtr_,
            ::nds::core::attributemap::AttributeIterator attribute_,
            ZSERIO_T_attributeValues&& attributeValues_,
            ZSERIO_T_attributeProperties&& attributeProperties_,
            ZSERIO_T_attributeConditions&& attributeConditions_,
            const allocator_type& allocator = allocator_type()) :
            PoiDisplayMesh3DRelationMap(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_feature_ = feature_;
        m_featureReferences_ = ZserioArrayType_featureReferences(::std::forward<ZSERIO_T_featureReferences>(featureReferences_));
        m_featureValidities_ = ZserioArrayType_featureValidities(::std::forward<ZSERIO_T_featureValidities>(featureValidities_));
        m_featureValuePtr_ = ZserioArrayType_featureValuePtr(::std::forward<ZSERIO_T_featureValuePtr>(featureValuePtr_));
        m_attribute_ = attribute_;
        m_attributeValues_ = ZserioArrayType_attributeValues(::std::forward<ZSERIO_T_attributeValues>(attributeValues_));
        m_attributeProperties_ = ZserioArrayType_attributeProperties(::std::forward<ZSERIO_T_attributeProperties>(attributeProperties_));
        m_attributeConditions_ = ZserioArrayType_attributeConditions(::std::forward<ZSERIO_T_attributeConditions>(attributeConditions_));
    }

    explicit PoiDisplayMesh3DRelationMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit PoiDisplayMesh3DRelationMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~PoiDisplayMesh3DRelationMap() = default;

    PoiDisplayMesh3DRelationMap(const PoiDisplayMesh3DRelationMap& other);
    PoiDisplayMesh3DRelationMap& operator=(const PoiDisplayMesh3DRelationMap& other);

    PoiDisplayMesh3DRelationMap(PoiDisplayMesh3DRelationMap&& other);
    PoiDisplayMesh3DRelationMap& operator=(PoiDisplayMesh3DRelationMap&& other);

    PoiDisplayMesh3DRelationMap(::zserio::PropagateAllocatorT,
            const PoiDisplayMesh3DRelationMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    ::nds::poi::poi::PoiDisplayMesh3DRelationType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::poi::poi::PoiDisplayMesh3DRelationType attributeTypeCode_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>& getFeatureReferences() const;
    ::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>& getFeatureReferences();
    void setFeatureReferences(const ::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>& featureReferences_);
    void setFeatureReferences(::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>&& featureReferences_);

    const ::zserio::vector<::nds::core::attributemap::Validity>& getFeatureValidities() const;
    ::zserio::vector<::nds::core::attributemap::Validity>& getFeatureValidities();
    void setFeatureValidities(const ::zserio::vector<::nds::core::attributemap::Validity>& featureValidities_);
    void setFeatureValidities(::zserio::vector<::nds::core::attributemap::Validity>&& featureValidities_);

    const ::zserio::vector<::nds::core::attributemap::AttributeIterator>& getFeatureValuePtr() const;
    ::zserio::vector<::nds::core::attributemap::AttributeIterator>& getFeatureValuePtr();
    void setFeatureValuePtr(const ::zserio::vector<::nds::core::attributemap::AttributeIterator>& featureValuePtr_);
    void setFeatureValuePtr(::zserio::vector<::nds::core::attributemap::AttributeIterator>&& featureValuePtr_);

    ::nds::core::attributemap::AttributeIterator getAttribute() const;
    void setAttribute(::nds::core::attributemap::AttributeIterator attribute_);

    const ::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>& getAttributeValues() const;
    ::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>& getAttributeValues();
    void setAttributeValues(const ::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>& attributeValues_);
    void setAttributeValues(::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>&& attributeValues_);

    const ::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>& getAttributeProperties() const;
    ::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>& getAttributeProperties();
    void setAttributeProperties(const ::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>& attributeProperties_);
    void setAttributeProperties(::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>&& attributeProperties_);

    const ::zserio::vector<::nds::core::attributemap::ConditionList>& getAttributeConditions() const;
    ::zserio::vector<::nds::core::attributemap::ConditionList>& getAttributeConditions();
    void setAttributeConditions(const ::zserio::vector<::nds::core::attributemap::ConditionList>& attributeConditions_);
    void setAttributeConditions(::zserio::vector<::nds::core::attributemap::ConditionList>&& attributeConditions_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiDisplayMesh3DRelationMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_featureReferences
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>& array,
                ::nds::display::reference::types::DisplayMesh3dId::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_featureValidities
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void initializeElement(PoiDisplayMesh3DRelationMap& owner,
                ::nds::core::attributemap::Validity& element, size_t index);
    };

    class ZserioElementFactory_featureValidities
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::core::attributemap::Validity>& array,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeValues
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void initializeElement(PoiDisplayMesh3DRelationMap& owner,
                ::nds::poi::instantiations::PoiDisplayMesh3DRelation& element, size_t index);
    };

    class ZserioElementFactory_attributeValues
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>& array,
                ::nds::poi::instantiations::PoiDisplayMesh3DRelation::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeProperties
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void initializeElement(PoiDisplayMesh3DRelationMap& owner,
                ::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue& element, size_t index);
    };

    class ZserioElementFactory_attributeProperties
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>& array,
                ::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeConditions
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void initializeElement(PoiDisplayMesh3DRelationMap& owner,
                ::nds::core::attributemap::ConditionList& element, size_t index);
    };

    class ZserioElementFactory_attributeConditions
    {
    public:
        using OwnerType = PoiDisplayMesh3DRelationMap;

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiDisplayMesh3DRelationMap& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionList>& array,
                ::nds::core::attributemap::ConditionList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_featureReferences = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayMesh3dId>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayMesh3dId, ZserioElementFactory_featureReferences>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_featureValidities = ::zserio::Array<::zserio::vector<::nds::core::attributemap::Validity>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::Validity, ZserioElementFactory_featureValidities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_featureValidities>;
    using ZserioArrayType_featureValuePtr = ::zserio::Array<::zserio::vector<::nds::core::attributemap::AttributeIterator>, ::zserio::VarSizeArrayTraits, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_attributeValues = ::zserio::Array<::zserio::vector<::nds::poi::instantiations::PoiDisplayMesh3DRelation>, ::zserio::ObjectArrayTraits<::nds::poi::instantiations::PoiDisplayMesh3DRelation, ZserioElementFactory_attributeValues>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeValues>;
    using ZserioArrayType_attributeProperties = ::zserio::Array<::zserio::vector<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::PropertyList_CorePropertyType_CorePropertyValue, ZserioElementFactory_attributeProperties>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeProperties>;
    using ZserioArrayType_attributeConditions = ::zserio::Array<::zserio::vector<::nds::core::attributemap::ConditionList>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::ConditionList, ZserioElementFactory_attributeConditions>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeConditions>;

    ::nds::poi::poi::PoiDisplayMesh3DRelationType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::poi::poi::PoiDisplayMesh3DRelationType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::attributemap::FeatureIterator readFeature(::zserio::BitStreamReader& in);
    ::nds::core::attributemap::FeatureIterator readFeature(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_featureReferences readFeatureReferences(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_featureReferences readFeatureReferences(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_featureValidities readFeatureValidities(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_featureValuePtr readFeatureValuePtr(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_featureValuePtr readFeatureValuePtr(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::attributemap::AttributeIterator readAttribute(::zserio::BitStreamReader& in);
    ::nds::core::attributemap::AttributeIterator readAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ZserioArrayType_attributeValues readAttributeValues(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_attributeValues readAttributeValues(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_attributeProperties readAttributeProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_attributeProperties readAttributeProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ZserioArrayType_attributeConditions readAttributeConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_attributeConditions readAttributeConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::core::geometry::CoordShift m_coordShift_;
    bool m_isInitialized;
    ::nds::poi::poi::PoiDisplayMesh3DRelationType m_attributeTypeCode_;
    ::nds::core::attributemap::FeatureIterator m_feature_;
    ZserioArrayType_featureReferences m_featureReferences_;
    ZserioArrayType_featureValidities m_featureValidities_;
    ZserioArrayType_featureValuePtr m_featureValuePtr_;
    ::nds::core::attributemap::AttributeIterator m_attribute_;
    ZserioArrayType_attributeValues m_attributeValues_;
    ZserioArrayType_attributeProperties m_attributeProperties_;
    ZserioArrayType_attributeConditions m_attributeConditions_;
};

} // namespace instantiations
} // namespace poi
} // namespace nds

#endif // NDS_POI_INSTANTIATIONS_POI_DISPLAY_MESH3_DRELATION_MAP_H
