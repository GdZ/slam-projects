/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_ATTRIBUTE_MAP_H
#define NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_ATTRIBUTE_MAP_H

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

#include <nds/adas/attributes/AdasRoadAttributeType.h>
#include <nds/adas/instantiations/AdasPropertyList.h>
#include <nds/adas/instantiations/AdasRoadAttribute.h>
#include <nds/core/attributemap/AttributeIterator.h>
#include <nds/core/attributemap/ConditionList.h>
#include <nds/core/attributemap/FeatureIterator.h>
#include <nds/core/attributemap/Validity.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/road/reference/types/RoadReference.h>

namespace nds
{
namespace adas
{
namespace instantiations
{

class AdasRoadAttributeMap
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

    AdasRoadAttributeMap() noexcept :
            AdasRoadAttributeMap(allocator_type())
    {}

    explicit AdasRoadAttributeMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_featureReferences = ::zserio::vector<::nds::road::reference::types::RoadReference>,
            typename ZSERIO_T_featureValidities = ::zserio::vector<::nds::core::attributemap::Validity>,
            typename ZSERIO_T_featureValuePtr = ::zserio::vector<::nds::core::attributemap::AttributeIterator>,
            typename ZSERIO_T_attributeValues = ::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>,
            typename ZSERIO_T_attributeProperties = ::zserio::vector<::nds::adas::instantiations::AdasPropertyList>,
            typename ZSERIO_T_attributeConditions = ::zserio::vector<::nds::core::attributemap::ConditionList>>
    AdasRoadAttributeMap(
            ::nds::adas::attributes::AdasRoadAttributeType attributeTypeCode_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_featureReferences&& featureReferences_,
            ZSERIO_T_featureValidities&& featureValidities_,
            ZSERIO_T_featureValuePtr&& featureValuePtr_,
            ::nds::core::attributemap::AttributeIterator attribute_,
            ZSERIO_T_attributeValues&& attributeValues_,
            ZSERIO_T_attributeProperties&& attributeProperties_,
            ZSERIO_T_attributeConditions&& attributeConditions_,
            const allocator_type& allocator = allocator_type()) :
            AdasRoadAttributeMap(allocator)
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

    explicit AdasRoadAttributeMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit AdasRoadAttributeMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~AdasRoadAttributeMap() = default;

    AdasRoadAttributeMap(const AdasRoadAttributeMap& other);
    AdasRoadAttributeMap& operator=(const AdasRoadAttributeMap& other);

    AdasRoadAttributeMap(AdasRoadAttributeMap&& other);
    AdasRoadAttributeMap& operator=(AdasRoadAttributeMap&& other);

    AdasRoadAttributeMap(::zserio::PropagateAllocatorT,
            const AdasRoadAttributeMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    ::nds::adas::attributes::AdasRoadAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::adas::attributes::AdasRoadAttributeType attributeTypeCode_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::road::reference::types::RoadReference>& getFeatureReferences() const;
    ::zserio::vector<::nds::road::reference::types::RoadReference>& getFeatureReferences();
    void setFeatureReferences(const ::zserio::vector<::nds::road::reference::types::RoadReference>& featureReferences_);
    void setFeatureReferences(::zserio::vector<::nds::road::reference::types::RoadReference>&& featureReferences_);

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

    const ::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>& getAttributeValues() const;
    ::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>& getAttributeValues();
    void setAttributeValues(const ::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>& attributeValues_);
    void setAttributeValues(::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>&& attributeValues_);

    const ::zserio::vector<::nds::adas::instantiations::AdasPropertyList>& getAttributeProperties() const;
    ::zserio::vector<::nds::adas::instantiations::AdasPropertyList>& getAttributeProperties();
    void setAttributeProperties(const ::zserio::vector<::nds::adas::instantiations::AdasPropertyList>& attributeProperties_);
    void setAttributeProperties(::zserio::vector<::nds::adas::instantiations::AdasPropertyList>&& attributeProperties_);

    const ::zserio::vector<::nds::core::attributemap::ConditionList>& getAttributeConditions() const;
    ::zserio::vector<::nds::core::attributemap::ConditionList>& getAttributeConditions();
    void setAttributeConditions(const ::zserio::vector<::nds::core::attributemap::ConditionList>& attributeConditions_);
    void setAttributeConditions(::zserio::vector<::nds::core::attributemap::ConditionList>&& attributeConditions_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdasRoadAttributeMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_featureReferences
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadReference>& array,
                ::nds::road::reference::types::RoadReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_featureValidities
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void initializeElement(AdasRoadAttributeMap& owner,
                ::nds::core::attributemap::Validity& element, size_t index);
    };

    class ZserioElementFactory_featureValidities
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::core::attributemap::Validity>& array,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeValues
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void initializeElement(AdasRoadAttributeMap& owner,
                ::nds::adas::instantiations::AdasRoadAttribute& element, size_t index);
    };

    class ZserioElementFactory_attributeValues
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>& array,
                ::nds::adas::instantiations::AdasRoadAttribute::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeProperties
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void initializeElement(AdasRoadAttributeMap& owner,
                ::nds::adas::instantiations::AdasPropertyList& element, size_t index);
    };

    class ZserioElementFactory_attributeProperties
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasPropertyList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasPropertyList>& array,
                ::nds::adas::instantiations::AdasPropertyList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeConditions
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void initializeElement(AdasRoadAttributeMap& owner,
                ::nds::core::attributemap::ConditionList& element, size_t index);
    };

    class ZserioElementFactory_attributeConditions
    {
    public:
        using OwnerType = AdasRoadAttributeMap;

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasRoadAttributeMap& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionList>& array,
                ::nds::core::attributemap::ConditionList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_featureReferences = ::zserio::Array<::zserio::vector<::nds::road::reference::types::RoadReference>, ::zserio::ObjectArrayTraits<::nds::road::reference::types::RoadReference, ZserioElementFactory_featureReferences>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_featureValidities = ::zserio::Array<::zserio::vector<::nds::core::attributemap::Validity>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::Validity, ZserioElementFactory_featureValidities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_featureValidities>;
    using ZserioArrayType_featureValuePtr = ::zserio::Array<::zserio::vector<::nds::core::attributemap::AttributeIterator>, ::zserio::VarSizeArrayTraits, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_attributeValues = ::zserio::Array<::zserio::vector<::nds::adas::instantiations::AdasRoadAttribute>, ::zserio::ObjectArrayTraits<::nds::adas::instantiations::AdasRoadAttribute, ZserioElementFactory_attributeValues>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeValues>;
    using ZserioArrayType_attributeProperties = ::zserio::Array<::zserio::vector<::nds::adas::instantiations::AdasPropertyList>, ::zserio::ObjectArrayTraits<::nds::adas::instantiations::AdasPropertyList, ZserioElementFactory_attributeProperties>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeProperties>;
    using ZserioArrayType_attributeConditions = ::zserio::Array<::zserio::vector<::nds::core::attributemap::ConditionList>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::ConditionList, ZserioElementFactory_attributeConditions>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeConditions>;

    ::nds::adas::attributes::AdasRoadAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::adas::attributes::AdasRoadAttributeType readAttributeTypeCode(ZserioPackingContext& context,
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
    ::nds::adas::attributes::AdasRoadAttributeType m_attributeTypeCode_;
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
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_ATTRIBUTE_MAP_H
