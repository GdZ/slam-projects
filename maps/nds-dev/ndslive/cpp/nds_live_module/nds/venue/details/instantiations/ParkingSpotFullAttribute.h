/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_SPOT_FULL_ATTRIBUTE_H
#define NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_SPOT_FULL_ATTRIBUTE_H

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
#include <zserio/OptionalHolder.h>
#include <zserio/ArrayTraits.h>

#include <nds/core/attributemap/ConditionList.h>
#include <nds/venue/details/attributes/ParkingSpotAttributeType.h>
#include <nds/venue/details/attributes/ParkingSpotAttributeValue.h>
#include <nds/venue/details/instantiations/VenuePropertyList.h>

namespace nds
{
namespace venue
{
namespace details
{
namespace instantiations
{

class ParkingSpotFullAttribute
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getAttributeTypeCode()
        {
            return m_attributeTypeCode_;
        }

        ::nds::venue::details::attributes::ParkingSpotAttributeValue::ZserioPackingContext& getAttributeValue()
        {
            return m_attributeValue_;
        }

        ::nds::venue::details::instantiations::VenuePropertyList::ZserioPackingContext& getProperties()
        {
            return m_properties_;
        }

        ::nds::core::attributemap::ConditionList::ZserioPackingContext& getConditions()
        {
            return m_conditions_;
        }

    private:
        ::zserio::DeltaContext m_attributeTypeCode_;
        ::nds::venue::details::attributes::ParkingSpotAttributeValue::ZserioPackingContext m_attributeValue_;
        ::nds::venue::details::instantiations::VenuePropertyList::ZserioPackingContext m_properties_;
        ::nds::core::attributemap::ConditionList::ZserioPackingContext m_conditions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    ParkingSpotFullAttribute() noexcept :
            ParkingSpotFullAttribute(allocator_type())
    {}

    explicit ParkingSpotFullAttribute(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_attributeValue = ::nds::venue::details::attributes::ParkingSpotAttributeValue,
            typename ZSERIO_T_properties = ::nds::venue::details::instantiations::VenuePropertyList,
            typename ZSERIO_T_conditions = ::nds::core::attributemap::ConditionList>
    ParkingSpotFullAttribute(
            ::nds::venue::details::attributes::ParkingSpotAttributeType attributeTypeCode_,
            ZSERIO_T_attributeValue&& attributeValue_,
            ZSERIO_T_properties&& properties_,
            ZSERIO_T_conditions&& conditions_,
            const allocator_type& allocator = allocator_type()) :
            ParkingSpotFullAttribute(allocator)
    {
        m_attributeTypeCode_ = attributeTypeCode_;
        m_attributeValue_ = ::std::forward<ZSERIO_T_attributeValue>(attributeValue_);
        m_properties_ = ::std::forward<ZSERIO_T_properties>(properties_);
        m_conditions_ = ::std::forward<ZSERIO_T_conditions>(conditions_);
    }

    explicit ParkingSpotFullAttribute(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit ParkingSpotFullAttribute(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~ParkingSpotFullAttribute() = default;

    ParkingSpotFullAttribute(const ParkingSpotFullAttribute& other);
    ParkingSpotFullAttribute& operator=(const ParkingSpotFullAttribute& other);

    ParkingSpotFullAttribute(ParkingSpotFullAttribute&& other);
    ParkingSpotFullAttribute& operator=(ParkingSpotFullAttribute&& other);

    ParkingSpotFullAttribute(::zserio::PropagateAllocatorT,
            const ParkingSpotFullAttribute& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::venue::details::attributes::ParkingSpotAttributeType getAttributeTypeCode() const;
    void setAttributeTypeCode(::nds::venue::details::attributes::ParkingSpotAttributeType attributeTypeCode_);

    const ::nds::venue::details::attributes::ParkingSpotAttributeValue& getAttributeValue() const;
    ::nds::venue::details::attributes::ParkingSpotAttributeValue& getAttributeValue();
    void setAttributeValue(const ::nds::venue::details::attributes::ParkingSpotAttributeValue& attributeValue_);
    void setAttributeValue(::nds::venue::details::attributes::ParkingSpotAttributeValue&& attributeValue_);

    const ::nds::venue::details::instantiations::VenuePropertyList& getProperties() const;
    ::nds::venue::details::instantiations::VenuePropertyList& getProperties();
    void setProperties(const ::nds::venue::details::instantiations::VenuePropertyList& properties_);
    void setProperties(::nds::venue::details::instantiations::VenuePropertyList&& properties_);
    bool isPropertiesUsed() const;
    bool isPropertiesSet() const;
    void resetProperties();

    const ::nds::core::attributemap::ConditionList& getConditions() const;
    ::nds::core::attributemap::ConditionList& getConditions();
    void setConditions(const ::nds::core::attributemap::ConditionList& conditions_);
    void setConditions(::nds::core::attributemap::ConditionList&& conditions_);
    bool isConditionsUsed() const;
    bool isConditionsSet() const;
    void resetConditions();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const ParkingSpotFullAttribute& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::venue::details::attributes::ParkingSpotAttributeType readAttributeTypeCode(::zserio::BitStreamReader& in);
    ::nds::venue::details::attributes::ParkingSpotAttributeType readAttributeTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::venue::details::attributes::ParkingSpotAttributeValue readAttributeValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::venue::details::attributes::ParkingSpotAttributeValue readAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::VenuePropertyList> readProperties(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::VenuePropertyList> readProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> readConditions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::venue::details::attributes::ParkingSpotAttributeType m_attributeTypeCode_;
    ::nds::venue::details::attributes::ParkingSpotAttributeValue m_attributeValue_;
    ::zserio::InplaceOptionalHolder<::nds::venue::details::instantiations::VenuePropertyList> m_properties_;
    ::zserio::InplaceOptionalHolder<::nds::core::attributemap::ConditionList> m_conditions_;
};

} // namespace instantiations
} // namespace details
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_DETAILS_INSTANTIATIONS_PARKING_SPOT_FULL_ATTRIBUTE_H
