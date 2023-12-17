/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_ATTRIBUTE_MAP_H
#define NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_ATTRIBUTE_MAP_H

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
#include <nds/core/geometry/CoordShift.h>
#include <nds/display/details/attributes/DisplayLineAttributeType.h>
#include <nds/display/details/instantiations/DisplayLineAttribute.h>
#include <nds/display/details/instantiations/DisplayPropertyList.h>
#include <nds/display/reference/types/DisplayLineRangeValidity.h>
#include <nds/display/reference/types/DisplayLineReference.h>

namespace nds
{
namespace display
{
namespace details
{
namespace instantiations
{

class DisplayLineAttributeMap
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

    DisplayLineAttributeMap() noexcept :
            DisplayLineAttributeMap(allocator_type())
    {}

    explicit DisplayLineAttributeMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_featureReferences = ::zserio::vector<::nds::display::reference::types::DisplayLineReference>,
            typename ZSERIO_T_featureValidities = ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>,
            typename ZSERIO_T_featureValuePtr = ::zserio::vector<::nds::core::attributemap::AttributeIterator>,
            typename ZSERIO_T_attributeValues = ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>,
            typename ZSERIO_T_attributeProperties = ::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>,
            typename ZSERIO_T_attributeConditions = ::zserio::vector<::nds::core::attributemap::ConditionList>>
    DisplayLineAttributeMap(
            ::nds::display::details::attributes::DisplayLineAttributeType attributeTypeCode_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_featureReferences&& featureReferences_,
            ZSERIO_T_featureValidities&& featureValidities_,
            ZSERIO_T_featureValuePtr&& featureValuePtr_,
            ::nds::core::attributemap::AttributeIterator attribute_,
            ZSERIO_T_attributeValues&& attributeValues_,
            ZSERIO_T_attributeProperties&& attributeProperties_,
            ZSERIO_T_attributeConditions&& attributeConditions_,
            const allocator_type& allocator = allocator_type()) :
            DisplayLineAttributeMap(allocator)
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

    explicit DisplayLineAttributeMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit DisplayLineAttributeMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~DisplayLineAttributeMap() = default;

    DisplayLineAttributeMap(const DisplayLineAttributeMap& other);
    DisplayLineAttributeMap& operator=(const DisplayLineAttributeMap& other);

    DisplayLineAttributeMap(DisplayLineAttributeMap&& other);
    DisplayLineAttributeMap& operator=(DisplayLineAttributeMap&& other);

    DisplayLineAttributeMap(::zserio::PropagateAllocatorT,
            const DisplayLineAttributeMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    ::nds::display::details::attributes::DisplayLineAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::display::details::attributes::DisplayLineAttributeType attributeTypeCode_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& getFeatureReferences() const;
    ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& getFeatureReferences();
    void setFeatureReferences(const ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& featureReferences_);
    void setFeatureReferences(::zserio::vector<::nds::display::reference::types::DisplayLineReference>&& featureReferences_);

    const ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& getFeatureValidities() const;
    ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& getFeatureValidities();
    void setFeatureValidities(const ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& featureValidities_);
    void setFeatureValidities(::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>&& featureValidities_);

    const ::zserio::vector<::nds::core::attributemap::AttributeIterator>& getFeatureValuePtr() const;
    ::zserio::vector<::nds::core::attributemap::AttributeIterator>& getFeatureValuePtr();
    void setFeatureValuePtr(const ::zserio::vector<::nds::core::attributemap::AttributeIterator>& featureValuePtr_);
    void setFeatureValuePtr(::zserio::vector<::nds::core::attributemap::AttributeIterator>&& featureValuePtr_);

    ::nds::core::attributemap::AttributeIterator getAttribute() const;
    void setAttribute(::nds::core::attributemap::AttributeIterator attribute_);

    const ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>& getAttributeValues() const;
    ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>& getAttributeValues();
    void setAttributeValues(const ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>& attributeValues_);
    void setAttributeValues(::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>&& attributeValues_);

    const ::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>& getAttributeProperties() const;
    ::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>& getAttributeProperties();
    void setAttributeProperties(const ::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>& attributeProperties_);
    void setAttributeProperties(::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>&& attributeProperties_);

    const ::zserio::vector<::nds::core::attributemap::ConditionList>& getAttributeConditions() const;
    ::zserio::vector<::nds::core::attributemap::ConditionList>& getAttributeConditions();
    void setAttributeConditions(const ::zserio::vector<::nds::core::attributemap::ConditionList>& attributeConditions_);
    void setAttributeConditions(::zserio::vector<::nds::core::attributemap::ConditionList>&& attributeConditions_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayLineAttributeMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_featureReferences
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineReference>& array,
                ::nds::display::reference::types::DisplayLineReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_featureValidities
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void initializeElement(DisplayLineAttributeMap& owner,
                ::nds::display::reference::types::DisplayLineRangeValidity& element, size_t index);
    };

    class ZserioElementFactory_featureValidities
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>& array,
                ::nds::display::reference::types::DisplayLineRangeValidity::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeValues
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void initializeElement(DisplayLineAttributeMap& owner,
                ::nds::display::details::instantiations::DisplayLineAttribute& element, size_t index);
    };

    class ZserioElementFactory_attributeValues
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>& array,
                ::nds::display::details::instantiations::DisplayLineAttribute::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeProperties
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void initializeElement(DisplayLineAttributeMap& owner,
                ::nds::display::details::instantiations::DisplayPropertyList& element, size_t index);
    };

    class ZserioElementFactory_attributeProperties
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>& array,
                ::nds::display::details::instantiations::DisplayPropertyList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_attributeConditions
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void initializeElement(DisplayLineAttributeMap& owner,
                ::nds::core::attributemap::ConditionList& element, size_t index);
    };

    class ZserioElementFactory_attributeConditions
    {
    public:
        using OwnerType = DisplayLineAttributeMap;

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayLineAttributeMap& owner,
                ::zserio::vector<::nds::core::attributemap::ConditionList>& array,
                ::nds::core::attributemap::ConditionList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_featureReferences = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayLineReference>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayLineReference, ZserioElementFactory_featureReferences>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_featureValidities = ::zserio::Array<::zserio::vector<::nds::display::reference::types::DisplayLineRangeValidity>, ::zserio::ObjectArrayTraits<::nds::display::reference::types::DisplayLineRangeValidity, ZserioElementFactory_featureValidities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_featureValidities>;
    using ZserioArrayType_featureValuePtr = ::zserio::Array<::zserio::vector<::nds::core::attributemap::AttributeIterator>, ::zserio::VarSizeArrayTraits, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_attributeValues = ::zserio::Array<::zserio::vector<::nds::display::details::instantiations::DisplayLineAttribute>, ::zserio::ObjectArrayTraits<::nds::display::details::instantiations::DisplayLineAttribute, ZserioElementFactory_attributeValues>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeValues>;
    using ZserioArrayType_attributeProperties = ::zserio::Array<::zserio::vector<::nds::display::details::instantiations::DisplayPropertyList>, ::zserio::ObjectArrayTraits<::nds::display::details::instantiations::DisplayPropertyList, ZserioElementFactory_attributeProperties>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeProperties>;
    using ZserioArrayType_attributeConditions = ::zserio::Array<::zserio::vector<::nds::core::attributemap::ConditionList>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::ConditionList, ZserioElementFactory_attributeConditions>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_attributeConditions>;

    ::nds::display::details::attributes::DisplayLineAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::display::details::attributes::DisplayLineAttributeType readAttributeTypeCode(ZserioPackingContext& context,
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
    ZserioArrayType_featureValidities readFeatureValidities(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
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
    ::nds::display::details::attributes::DisplayLineAttributeType m_attributeTypeCode_;
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
} // namespace details
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_DETAILS_INSTANTIATIONS_DISPLAY_LINE_ATTRIBUTE_MAP_H
