/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_INSTANTIATIONS_POI_DISPLAY_AREA_RELATION_H
#define NDS_POI_INSTANTIATIONS_POI_DISPLAY_AREA_RELATION_H

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

#include <nds/poi/poi/PoiDisplayAreaRelationType.h>
#include <nds/poi/poi/PoiDisplayAreaRelationValue.h>

namespace nds
{
namespace poi
{
namespace instantiations
{

class PoiDisplayAreaRelation
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::poi::poi::PoiDisplayAreaRelationValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::poi::poi::PoiDisplayAreaRelationValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiDisplayAreaRelation() noexcept :
            PoiDisplayAreaRelation(allocator_type())
    {}

    explicit PoiDisplayAreaRelation(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::poi::poi::PoiDisplayAreaRelationValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, PoiDisplayAreaRelation, allocator_type> = 0>
    explicit PoiDisplayAreaRelation(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            PoiDisplayAreaRelation(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit PoiDisplayAreaRelation(::zserio::BitStreamReader& in,
            ::nds::poi::poi::PoiDisplayAreaRelationType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit PoiDisplayAreaRelation(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::poi::poi::PoiDisplayAreaRelationType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~PoiDisplayAreaRelation() = default;

    PoiDisplayAreaRelation(const PoiDisplayAreaRelation& other);
    PoiDisplayAreaRelation& operator=(const PoiDisplayAreaRelation& other);

    PoiDisplayAreaRelation(PoiDisplayAreaRelation&& other);
    PoiDisplayAreaRelation& operator=(PoiDisplayAreaRelation&& other);

    PoiDisplayAreaRelation(::zserio::PropagateAllocatorT,
            const PoiDisplayAreaRelation& other, const allocator_type& allocator);

    void initialize(
            ::nds::poi::poi::PoiDisplayAreaRelationType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::poi::poi::PoiDisplayAreaRelationType getAttributeTypeCode() const;

    const ::nds::poi::poi::PoiDisplayAreaRelationValue& getAttributeValue() const;
    ::nds::poi::poi::PoiDisplayAreaRelationValue& getAttributeValue();
    void setAttributeValue(const ::nds::poi::poi::PoiDisplayAreaRelationValue& attributeValue_);
    void setAttributeValue(::nds::poi::poi::PoiDisplayAreaRelationValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiDisplayAreaRelation& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::poi::poi::PoiDisplayAreaRelationValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::poi::poi::PoiDisplayAreaRelationValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::poi::poi::PoiDisplayAreaRelationType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::poi::poi::PoiDisplayAreaRelationValue m_attributeValue_;
};

} // namespace instantiations
} // namespace poi
} // namespace nds

#endif // NDS_POI_INSTANTIATIONS_POI_DISPLAY_AREA_RELATION_H
