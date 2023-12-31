/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_ATTRIBUTE_SET_MAP_H
#define NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_ATTRIBUTE_SET_MAP_H

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

#include <nds/adas/instantiations/AdasRoadAttributeSet.h>
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

class AdasRoadAttributeSetMap
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::adas::instantiations::AdasRoadAttributeSet::ZserioPackingContext& getAttributeSet()
        {
            return m_attributeSet_;
        }

        ::zserio::DeltaContext& getFeature()
        {
            return m_feature_;
        }

    private:
        ::nds::adas::instantiations::AdasRoadAttributeSet::ZserioPackingContext m_attributeSet_;
        ::zserio::DeltaContext m_feature_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AdasRoadAttributeSetMap() noexcept :
            AdasRoadAttributeSetMap(allocator_type())
    {}

    explicit AdasRoadAttributeSetMap(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeSet = ::nds::adas::instantiations::AdasRoadAttributeSet,
            typename ZSERIO_T_references = ::zserio::vector<::nds::road::reference::types::RoadReference>,
            typename ZSERIO_T_validities = ::zserio::vector<::nds::core::attributemap::Validity>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeSet, AdasRoadAttributeSetMap, allocator_type> = 0>
    AdasRoadAttributeSetMap(
            ZSERIO_T_attributeSet&& attributeSet_,
            ::nds::core::attributemap::FeatureIterator feature_,
            ZSERIO_T_references&& references_,
            ZSERIO_T_validities&& validities_,
            const allocator_type& allocator = allocator_type()) :
            AdasRoadAttributeSetMap(allocator)
    {
        m_attributeSet_ = ::std::forward<ZSERIO_T_attributeSet>(attributeSet_);
        m_feature_ = feature_;
        m_references_ = ZserioArrayType_references(::std::forward<ZSERIO_T_references>(references_));
        m_validities_ = ZserioArrayType_validities(::std::forward<ZSERIO_T_validities>(validities_));
    }

    explicit AdasRoadAttributeSetMap(::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());
    explicit AdasRoadAttributeSetMap(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::core::geometry::CoordShift coordShift_, const allocator_type& allocator = allocator_type());

    ~AdasRoadAttributeSetMap() = default;

    AdasRoadAttributeSetMap(const AdasRoadAttributeSetMap& other);
    AdasRoadAttributeSetMap& operator=(const AdasRoadAttributeSetMap& other);

    AdasRoadAttributeSetMap(AdasRoadAttributeSetMap&& other);
    AdasRoadAttributeSetMap& operator=(AdasRoadAttributeSetMap&& other);

    AdasRoadAttributeSetMap(::zserio::PropagateAllocatorT,
            const AdasRoadAttributeSetMap& other, const allocator_type& allocator);

    void initialize(
            ::nds::core::geometry::CoordShift coordShift_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::core::geometry::CoordShift getCoordShift() const;

    const ::nds::adas::instantiations::AdasRoadAttributeSet& getAttributeSet() const;
    ::nds::adas::instantiations::AdasRoadAttributeSet& getAttributeSet();
    void setAttributeSet(const ::nds::adas::instantiations::AdasRoadAttributeSet& attributeSet_);
    void setAttributeSet(::nds::adas::instantiations::AdasRoadAttributeSet&& attributeSet_);

    ::nds::core::attributemap::FeatureIterator getFeature() const;
    void setFeature(::nds::core::attributemap::FeatureIterator feature_);

    const ::zserio::vector<::nds::road::reference::types::RoadReference>& getReferences() const;
    ::zserio::vector<::nds::road::reference::types::RoadReference>& getReferences();
    void setReferences(const ::zserio::vector<::nds::road::reference::types::RoadReference>& references_);
    void setReferences(::zserio::vector<::nds::road::reference::types::RoadReference>&& references_);

    const ::zserio::vector<::nds::core::attributemap::Validity>& getValidities() const;
    ::zserio::vector<::nds::core::attributemap::Validity>& getValidities();
    void setValidities(const ::zserio::vector<::nds::core::attributemap::Validity>& validities_);
    void setValidities(::zserio::vector<::nds::core::attributemap::Validity>&& validities_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdasRoadAttributeSetMap& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_references
    {
    public:
        using OwnerType = AdasRoadAttributeSetMap;

        static void create(AdasRoadAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadReference>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasRoadAttributeSetMap& owner,
                ::zserio::vector<::nds::road::reference::types::RoadReference>& array,
                ::nds::road::reference::types::RoadReference::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioArrayExpressions_validities
    {
    public:
        using OwnerType = AdasRoadAttributeSetMap;

        static void initializeElement(AdasRoadAttributeSetMap& owner,
                ::nds::core::attributemap::Validity& element, size_t index);
    };

    class ZserioElementFactory_validities
    {
    public:
        using OwnerType = AdasRoadAttributeSetMap;

        static void create(AdasRoadAttributeSetMap& owner,
                ::zserio::vector<::nds::core::attributemap::Validity>& array,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_references = ::zserio::Array<::zserio::vector<::nds::road::reference::types::RoadReference>, ::zserio::ObjectArrayTraits<::nds::road::reference::types::RoadReference, ZserioElementFactory_references>, ::zserio::ArrayType::NORMAL>;
    using ZserioArrayType_validities = ::zserio::Array<::zserio::vector<::nds::core::attributemap::Validity>, ::zserio::ObjectArrayTraits<::nds::core::attributemap::Validity, ZserioElementFactory_validities>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_validities>;

    ::nds::adas::instantiations::AdasRoadAttributeSet readAttributeSet(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::adas::instantiations::AdasRoadAttributeSet readAttributeSet(ZserioPackingContext& context,
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
    ::nds::adas::instantiations::AdasRoadAttributeSet m_attributeSet_;
    ::nds::core::attributemap::FeatureIterator m_feature_;
    ZserioArrayType_references m_references_;
    ZserioArrayType_validities m_validities_;
};

} // namespace instantiations
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_INSTANTIATIONS_ADAS_ROAD_ATTRIBUTE_SET_MAP_H
