/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_FACILITY_ATTRIBUTE_VALUE_H
#define NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_FACILITY_ATTRIBUTE_VALUE_H

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
#include <zserio/AnyHolder.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/venue/details/attributes/ParkingFacilityAttributeType.h>
#include <nds/venue/details/types/ParkingFacilitySize.h>
#include <nds/venue/details/types/ProhibitedAccess.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace attributes
{

class ParkingFacilityAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_size = 0,
        CHOICE_prohibitedAccess = 1,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSize()
        {
            return m_size_;
        }

    private:
        ::zserio::DeltaContext m_size_;
    };

    ParkingFacilityAttributeValue() noexcept :
            ParkingFacilityAttributeValue(allocator_type())
    {}

    explicit ParkingFacilityAttributeValue(const allocator_type& allocator) noexcept;

    explicit ParkingFacilityAttributeValue(::zserio::BitStreamReader& in,
            ::nds::venue::details::attributes::ParkingFacilityAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit ParkingFacilityAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::venue::details::attributes::ParkingFacilityAttributeType type_, const allocator_type& allocator = allocator_type());

    ~ParkingFacilityAttributeValue() = default;

    ParkingFacilityAttributeValue(const ParkingFacilityAttributeValue& other);
    ParkingFacilityAttributeValue& operator=(const ParkingFacilityAttributeValue& other);

    ParkingFacilityAttributeValue(ParkingFacilityAttributeValue&& other);
    ParkingFacilityAttributeValue& operator=(ParkingFacilityAttributeValue&& other);

    ParkingFacilityAttributeValue(::zserio::PropagateAllocatorT,
            const ParkingFacilityAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::venue::details::attributes::ParkingFacilityAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::venue::details::attributes::ParkingFacilityAttributeType getType() const;

    ::nds::venue::details::types::ParkingFacilitySize getSize() const;
    void setSize(::nds::venue::details::types::ParkingFacilitySize size_);

    const ::nds::venue::details::types::ProhibitedAccess& getProhibitedAccess() const;
    ::nds::venue::details::types::ProhibitedAccess& getProhibitedAccess();
    void setProhibitedAccess(const ::nds::venue::details::types::ProhibitedAccess& prohibitedAccess_);
    void setProhibitedAccess(::nds::venue::details::types::ProhibitedAccess&& prohibitedAccess_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingFacilityAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::venue::details::attributes::ParkingFacilityAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_FACILITY_ATTRIBUTE_VALUE_H
