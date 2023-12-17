/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_LANE_RANGE_ATTRIBUTE_H
#define NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_LANE_RANGE_ATTRIBUTE_H

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

#include <nds/traffic/attributes/TrafficLaneRangeAttributeType.h>
#include <nds/traffic/attributes/TrafficLaneRangeAttributeValue.h>

namespace nds
{
namespace traffic
{
namespace instantiations
{

class TrafficLaneRangeAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::traffic::attributes::TrafficLaneRangeAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::traffic::attributes::TrafficLaneRangeAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TrafficLaneRangeAttribute() noexcept :
            TrafficLaneRangeAttribute(allocator_type())
    {}

    explicit TrafficLaneRangeAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::traffic::attributes::TrafficLaneRangeAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, TrafficLaneRangeAttribute, allocator_type> = 0>
    explicit TrafficLaneRangeAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            TrafficLaneRangeAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit TrafficLaneRangeAttribute(::zserio::BitStreamReader& in,
            ::nds::traffic::attributes::TrafficLaneRangeAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit TrafficLaneRangeAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::traffic::attributes::TrafficLaneRangeAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~TrafficLaneRangeAttribute() = default;

    TrafficLaneRangeAttribute(const TrafficLaneRangeAttribute& other);
    TrafficLaneRangeAttribute& operator=(const TrafficLaneRangeAttribute& other);

    TrafficLaneRangeAttribute(TrafficLaneRangeAttribute&& other);
    TrafficLaneRangeAttribute& operator=(TrafficLaneRangeAttribute&& other);

    TrafficLaneRangeAttribute(::zserio::PropagateAllocatorT,
            const TrafficLaneRangeAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::traffic::attributes::TrafficLaneRangeAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::traffic::attributes::TrafficLaneRangeAttributeType getAttributeTypeCode() const;

    const ::nds::traffic::attributes::TrafficLaneRangeAttributeValue& getAttributeValue() const;
    ::nds::traffic::attributes::TrafficLaneRangeAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::traffic::attributes::TrafficLaneRangeAttributeValue& attributeValue_);
    void setAttributeValue(::nds::traffic::attributes::TrafficLaneRangeAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TrafficLaneRangeAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::traffic::attributes::TrafficLaneRangeAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::traffic::attributes::TrafficLaneRangeAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::traffic::attributes::TrafficLaneRangeAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::traffic::attributes::TrafficLaneRangeAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_LANE_RANGE_ATTRIBUTE_H