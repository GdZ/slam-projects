/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_ROAD_LOCATION_RANGE_ATTRIBUTE_SET_MAP_H
#define NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_ROAD_LOCATION_RANGE_ATTRIBUTE_SET_MAP_H

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

#include <nds/characteristics/instantiations/CharacsRoadRangeAttributeSet.h>
#include <nds/core/attributemap/FeatureIterator.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/road/reference/location/RoadLocationRangeValidity.h>
#include <nds/road/reference/location/RoadLocationReference.h>

namespace nds
{
namespace characteristics
{
namespace instantiations
{

class CharacsRoadLocationRangeAttributeSetMap
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet::ZserioPackingContext& getAttributeSet()
        {
            return m_attributeSet_;
        }

        ::zserio::DeltaContext& getFeature()
        {
            return m_feature_;
        }

    private:
        ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet::ZserioPackingContext m_attributeSet_;
        ::zserio::DeltaContext m_feature_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CharacsRoadLocationRangeAttributeSetMap() noexcept :
            CharacsRoadLocationRangeAttributeSetMap(allocator_type())
    {}

    explicit CharacsRoadLocationRangeAttributeSetMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeSet = ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet,
            typename ZSERIO_T_references = ::zserio::vector<::nds::road::reference::location::RoadLocationReference>,
            typename ZSERIO_T_validities = ::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeSet, CharacsRoadLocationRangeAttributeSetMap, allocator_type> = 0>
    CharacsRoadLocationRangeAttributeSetMap(
            ZSERIO_T_attributeSet&& attributeSet_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_references&& references_,
            ZSERIO_T_validities&& validities_,
            const allocator_type& allocator = allocator_type()) :
            CharacsRoadLocationRangeAttributeSetMap(allocator)
    {
        m_attributeSet_ = ::std::forward<ZSERIO_T_attributeSet>(attributeSet_);
        m_feature_ = feature_;
        m_references_ = ZserioArrayType_references(::std::forward<ZSERIO_T_references>(references_));
        m_validities_ = ZserioArrayType_validities(::std::forward<ZSERIO_T_validities>(validities_));
    }

    explicit CharacsRoadLocationRangeAttributeSetMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit CharacsRoadLocationRangeAttributeSetMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~CharacsRoadLocationRangeAttributeSetMap() = default;

    CharacsRoadLocationRangeAttributeSetMap(const CharacsRoadLocationRangeAttributeSetMap& other);
    CharacsRoadLocationRangeAttributeSetMap& operator=(const CharacsRoadLocationRangeAttributeSetMap& other);

    CharacsRoadLocationRangeAttributeSetMap(CharacsRoadLocationRangeAttributeSetMap&& other);
    CharacsRoadLocationRangeAttributeSetMap& operator=(CharacsRoadLocationRangeAttributeSetMap&& other);

    CharacsRoadLocationRangeAttributeSetMap(::zserio::PropagateAllocatorT,
            const CharacsRoadLocationRangeAttributeSetMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    const ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet& getAttributeSet() const;
    ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet& getAttributeSet();
    void setAttributeSet(const ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet& attributeSet_);
    void setAttributeSet(::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet&& attributeSet_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::road::reference::location::RoadLocationReference>& getReferences() const;
    ::zserio::vector<::nds::road::reference::location::RoadLocationReference>& getReferences();
    void setReferences(const ::zserio::vector<::nds::road::reference::location::RoadLocationReference>& references_);
    void setReferences(::zserio::vector<::nds::road::reference::location::RoadLocationReference>&& references_);

    const ::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>& getValidities() const;
    ::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>& getValidities();
    void setValidities(const ::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>& validities_);
    void setValidities(::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>&& validities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsRoadLocationRangeAttributeSetMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_references
    {
    public:
        using OwnerType = CharacsRoadLocationRangeAttributeSetMap;

        static void create(CharacsRoadLocationRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::location::RoadLocationReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(CharacsRoadLocationRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::location::RoadLocationReference>& array,
                ::nds::road::reference::location::RoadLocationReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_validities
    {
    public:
        using OwnerType = CharacsRoadLocationRangeAttributeSetMap;

        static void initializeElement(CharacsRoadLocationRangeAttributeSetMap& owner,
                ::nds::road::reference::location::RoadLocationRangeValidity& element, size_t index);
    };

    class ZserioElementFactory_validities
    {
    public:
        using OwnerType = CharacsRoadLocationRangeAttributeSetMap;

        static void create(CharacsRoadLocationRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(CharacsRoadLocationRangeAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>& array,
                ::nds::road::reference::location::RoadLocationRangeValidity::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_references = ::zserio::Array<::zserio::vector<::nds::road::reference::location::RoadLocationReference>, ::zserio::ObjectArrayTraits<::nds::road::reference::location::RoadLocationReference, ZserioElementFactory_references>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_validities = ::zserio::Array<::zserio::vector<::nds::road::reference::location::RoadLocationRangeValidity>, ::zserio::ObjectArrayTraits<::nds::road::reference::location::RoadLocationRangeValidity, ZserioElementFactory_validities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_validities>;

    ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet readAttributeSet(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet readAttributeSet(ZserioPackingContext& context,
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
    ::nds::characteristics::instantiations::CharacsRoadRangeAttributeSet m_attributeSet_;
    ::nds::core::attributemap::FeatureIterator m_feature_;
    ZserioArrayType_references m_references_;
    ZserioArrayType_validities m_validities_;
};

} // namespace instantiations
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_ROAD_LOCATION_RANGE_ATTRIBUTE_SET_MAP_H
