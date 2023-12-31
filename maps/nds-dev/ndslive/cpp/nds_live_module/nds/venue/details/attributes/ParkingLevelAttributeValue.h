/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_LEVEL_ATTRIBUTE_VALUE_H
#define NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_LEVEL_ATTRIBUTE_VALUE_H

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

#include <nds/venue/details/attributes/ParkingLevelAttributeType.h>
#include <nds/venue/details/types/ParkingLevelName.h>
#include <nds/venue/details/types/ParkingLevelSlope.h>
#include <nds/venue/details/types/ProhibitedAccess.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace attributes
{

class ParkingLevelAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_parkingLevelName = 0,
        CHOICE_prohibitedAccess = 1,
        CHOICE_slope = 2,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getSlope()
        {
            return m_slope_;
        }

    private:
        ::zserio::DeltaContext m_slope_;
    };

    ParkingLevelAttributeValue() noexcept :
            ParkingLevelAttributeValue(allocator_type())
    {}

    explicit ParkingLevelAttributeValue(const allocator_type& allocator) noexcept;

    explicit ParkingLevelAttributeValue(::zserio::BitStreamReader& in,
            ::nds::venue::details::attributes::ParkingLevelAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit ParkingLevelAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::venue::details::attributes::ParkingLevelAttributeType type_, const allocator_type& allocator = allocator_type());

    ~ParkingLevelAttributeValue() = default;

    ParkingLevelAttributeValue(const ParkingLevelAttributeValue& other);
    ParkingLevelAttributeValue& operator=(const ParkingLevelAttributeValue& other);

    ParkingLevelAttributeValue(ParkingLevelAttributeValue&& other);
    ParkingLevelAttributeValue& operator=(ParkingLevelAttributeValue&& other);

    ParkingLevelAttributeValue(::zserio::PropagateAllocatorT,
            const ParkingLevelAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::venue::details::attributes::ParkingLevelAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::venue::details::attributes::ParkingLevelAttributeType getType() const;

    const ::nds::venue::details::types::ParkingLevelName& getParkingLevelName() const;
    ::nds::venue::details::types::ParkingLevelName& getParkingLevelName();
    void setParkingLevelName(const ::nds::venue::details::types::ParkingLevelName& parkingLevelName_);
    void setParkingLevelName(::nds::venue::details::types::ParkingLevelName&& parkingLevelName_);

    const ::nds::venue::details::types::ProhibitedAccess& getProhibitedAccess() const;
    ::nds::venue::details::types::ProhibitedAccess& getProhibitedAccess();
    void setProhibitedAccess(const ::nds::venue::details::types::ProhibitedAccess& prohibitedAccess_);
    void setProhibitedAccess(::nds::venue::details::types::ProhibitedAccess&& prohibitedAccess_);

    ::nds::venue::details::types::ParkingLevelSlope getSlope() const;
    void setSlope(::nds::venue::details::types::ParkingLevelSlope slope_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingLevelAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::venue::details::attributes::ParkingLevelAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_ATTRIBUTES_PARKING_LEVEL_ATTRIBUTE_VALUE_H
