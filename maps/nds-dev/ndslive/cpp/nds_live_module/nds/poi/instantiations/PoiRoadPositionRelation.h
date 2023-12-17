/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_INSTANTIATIONS_POI_ROAD_POSITION_RELATION_H
#define NDS_POI_INSTANTIATIONS_POI_ROAD_POSITION_RELATION_H

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
#include <zserio/ArrayTraits.h>

#include <nds/poi/poi/PoiRoadPositionRelationType.h>
#include <nds/poi/poi/PoiRoadPositionRelationValue.h>

namespace nds
{
namespace poi
{
namespace instantiations
{

class PoiRoadPositionRelation
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::poi::poi::PoiRoadPositionRelationValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::poi::poi::PoiRoadPositionRelationValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiRoadPositionRelation() noexcept :
            PoiRoadPositionRelation(allocator_type())
    {}

    explicit PoiRoadPositionRelation(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::poi::poi::PoiRoadPositionRelationValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, PoiRoadPositionRelation, allocator_type> = 0>
    explicit PoiRoadPositionRelation(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            PoiRoadPositionRelation(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit PoiRoadPositionRelation(::zserio::BitStreamReader& in,
            ::nds::poi::poi::PoiRoadPositionRelationType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit PoiRoadPositionRelation(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::poi::poi::PoiRoadPositionRelationType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~PoiRoadPositionRelation() = default;

    PoiRoadPositionRelation(const PoiRoadPositionRelation& other);
    PoiRoadPositionRelation& operator=(const PoiRoadPositionRelation& other);

    PoiRoadPositionRelation(PoiRoadPositionRelation&& other);
    PoiRoadPositionRelation& operator=(PoiRoadPositionRelation&& other);

    PoiRoadPositionRelation(::zserio::PropagateAllocatorT,
            const PoiRoadPositionRelation& other, const allocator_type& allocator);

    void initialize(
            ::nds::poi::poi::PoiRoadPositionRelationType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::poi::poi::PoiRoadPositionRelationType getAttributeTypeCode() const;

    const ::nds::poi::poi::PoiRoadPositionRelationValue& getAttributeValue() const;
    ::nds::poi::poi::PoiRoadPositionRelationValue& getAttributeValue();
    void setAttributeValue(const ::nds::poi::poi::PoiRoadPositionRelationValue& attributeValue_);
    void setAttributeValue(::nds::poi::poi::PoiRoadPositionRelationValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiRoadPositionRelation& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::poi::poi::PoiRoadPositionRelationValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::poi::poi::PoiRoadPositionRelationValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::poi::poi::PoiRoadPositionRelationType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::poi::poi::PoiRoadPositionRelationValue m_attributeValue_;
};

} // namespace instantiations
} // namespace poi
} // namespace nds

#endif // NDS_POI_INSTANTIATIONS_POI_ROAD_POSITION_RELATION_H
