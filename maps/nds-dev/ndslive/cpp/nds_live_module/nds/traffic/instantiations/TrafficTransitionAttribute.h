/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_TRANSITION_ATTRIBUTE_H
#define NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_TRANSITION_ATTRIBUTE_H

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

#include <nds/traffic/attributes/TrafficTransitionAttributeType.h>
#include <nds/traffic/attributes/TrafficTransitionAttributeValue.h>

namespace nds
{
namespace traffic
{
namespace instantiations
{

class TrafficTransitionAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::traffic::attributes::TrafficTransitionAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::traffic::attributes::TrafficTransitionAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    TrafficTransitionAttribute() noexcept :
            TrafficTransitionAttribute(allocator_type())
    {}

    explicit TrafficTransitionAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::traffic::attributes::TrafficTransitionAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, TrafficTransitionAttribute, allocator_type> = 0>
    explicit TrafficTransitionAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            TrafficTransitionAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit TrafficTransitionAttribute(::zserio::BitStreamReader& in,
            ::nds::traffic::attributes::TrafficTransitionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit TrafficTransitionAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::traffic::attributes::TrafficTransitionAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~TrafficTransitionAttribute() = default;

    TrafficTransitionAttribute(const TrafficTransitionAttribute& other);
    TrafficTransitionAttribute& operator=(const TrafficTransitionAttribute& other);

    TrafficTransitionAttribute(TrafficTransitionAttribute&& other);
    TrafficTransitionAttribute& operator=(TrafficTransitionAttribute&& other);

    TrafficTransitionAttribute(::zserio::PropagateAllocatorT,
            const TrafficTransitionAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::traffic::attributes::TrafficTransitionAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::traffic::attributes::TrafficTransitionAttributeType getAttributeTypeCode() const;

    const ::nds::traffic::attributes::TrafficTransitionAttributeValue& getAttributeValue() const;
    ::nds::traffic::attributes::TrafficTransitionAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::traffic::attributes::TrafficTransitionAttributeValue& attributeValue_);
    void setAttributeValue(::nds::traffic::attributes::TrafficTransitionAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TrafficTransitionAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::traffic::attributes::TrafficTransitionAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::traffic::attributes::TrafficTransitionAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::traffic::attributes::TrafficTransitionAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::traffic::attributes::TrafficTransitionAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_TRANSITION_ATTRIBUTE_H