/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_FACILITY_ATTRIBUTE_H
#define NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_FACILITY_ATTRIBUTE_H

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

#include <nds/venue/details/attributes/ParkingFacilityAttributeType.h>
#include <nds/venue/details/attributes/ParkingFacilityAttributeValue.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace instantiations
{

class ParkingFacilityAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::venue::details::attributes::ParkingFacilityAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

    private:
        ::nds::venue::details::attributes::ParkingFacilityAttributeValue::ZserioPackingContext m_attributeValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingFacilityAttribute() noexcept :
            ParkingFacilityAttribute(allocator_type())
    {}

    explicit ParkingFacilityAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::venue::details::attributes::ParkingFacilityAttributeValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_attributeValue, ParkingFacilityAttribute, allocator_type> = 0>
    explicit ParkingFacilityAttribute(
            ZSERIO_T_attributeValue&& attributeValue_,
            const allocator_type& allocator = allocator_type()) :
            ParkingFacilityAttribute(allocator)
    {
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
    }

    explicit ParkingFacilityAttribute(::zserio::BitStreamReader& in,
            ::nds::venue::details::attributes::ParkingFacilityAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());
    explicit ParkingFacilityAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::venue::details::attributes::ParkingFacilityAttributeType attributeTypeCode_, const allocator_type& allocator = allocator_type());

    ~ParkingFacilityAttribute() = default;

    ParkingFacilityAttribute(const ParkingFacilityAttribute& other);
    ParkingFacilityAttribute& operator=(const ParkingFacilityAttribute& other);

    ParkingFacilityAttribute(ParkingFacilityAttribute&& other);
    ParkingFacilityAttribute& operator=(ParkingFacilityAttribute&& other);

    ParkingFacilityAttribute(::zserio::PropagateAllocatorT,
            const ParkingFacilityAttribute& other, const allocator_type& allocator);

    void initialize(
            ::nds::venue::details::attributes::ParkingFacilityAttributeType attributeTypeCode_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::venue::details::attributes::ParkingFacilityAttributeType getAttributeTypeCode() const;

    const ::nds::venue::details::attributes::ParkingFacilityAttributeValue& getAttributeValue() const;
    ::nds::venue::details::attributes::ParkingFacilityAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::venue::details::attributes::ParkingFacilityAttributeValue& attributeValue_);
    void setAttributeValue(::nds::venue::details::attributes::ParkingFacilityAttributeValue&& attributeValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingFacilityAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::venue::details::attributes::ParkingFacilityAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::venue::details::attributes::ParkingFacilityAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::venue::details::attributes::ParkingFacilityAttributeType m_attributeTypeCode_;
    bool m_isInitialized;
    ::nds::venue::details::attributes::ParkingFacilityAttributeValue m_attributeValue_;
};

} // namespace instantiations
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_FACILITY_ATTRIBUTE_H
