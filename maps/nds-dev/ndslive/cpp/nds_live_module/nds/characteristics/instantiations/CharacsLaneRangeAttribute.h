/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_RANGE_ATTRIBUTE_H
#define NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_RANGE_ATTRIBUTE_H

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

#include <nds/characteristics/attributes/CharacsLaneRangeAttributeType.h>
#include <nds/characteristics/attributes/CharacsLaneRangeAttributeValue.h>

namespace nds
{
namespace characteristics
{
namespace instantiations
{

class CharacsLaneRangeAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CharacsLaneRangeAttribute() noexcept :
            CharacsLaneRangeAttribute(allocator_type())
    {}

    explicit CharacsLaneRangeAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, CharacsLaneRangeAttribute, allocator_type> = 0>
    explicit CharacsLaneRangeAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            CharacsLaneRangeAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit CharacsLaneRangeAttribute(::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsLaneRangeAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit CharacsLaneRangeAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsLaneRangeAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~CharacsLaneRangeAttribute() = default;

    CharacsLaneRangeAttribute(const CharacsLaneRangeAttribute& other);
    CharacsLaneRangeAttribute& operator=(const CharacsLaneRangeAttribute& other);

    CharacsLaneRangeAttribute(CharacsLaneRangeAttribute&& other);
    CharacsLaneRangeAttribute& operator=(CharacsLaneRangeAttribute&& other);

    CharacsLaneRangeAttribute(::zserio::PropagateAllocatorT,
            const CharacsLaneRangeAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::characteristics::attributes::CharacsLaneRangeAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::characteristics::attributes::CharacsLaneRangeAttributeType getAttributeTypeCode() const;

    const ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue& getAttributeValue() const;
    ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue& attributeValue_);
    void setAttributeValue(::nds::characteristics::attributes::CharacsLaneRangeAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsLaneRangeAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::characteristics::attributes::CharacsLaneRangeAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::characteristics::attributes::CharacsLaneRangeAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_INSTANTIATIONS_CHARACS_LANE_RANGE_ATTRIBUTE_H
