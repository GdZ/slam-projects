/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_DISPLAY_LINE_RANGE_ATTRIBUTE_VALUE_H
#define NDS_NAME_ATTRIBUTES_NAME_DISPLAY_LINE_RANGE_ATTRIBUTE_VALUE_H

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

#include <nds/name/attributes/NameDisplayLineRangeAttributeType.h>
#include <nds/name/types/AdministrativeHierarchy.h>
#include <nds/name/types/BridgeName.h>
#include <nds/name/types/IntersectionName.h>
#include <nds/name/types/LabelName.h>
#include <nds/name/types/RoadName.h>
#include <nds/name/types/RoadNumber.h>
#include <nds/name/types/RouteName.h>
#include <nds/name/types/ServiceAreaName.h>
#include <nds/name/types/TunnelName.h>

namespace nds
{
namespace name
{
namespace attributes
{

class NameDisplayLineRangeAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_roadName = 0,
        CHOICE_bridgeName = 1,
        CHOICE_tunnelName = 2,
        CHOICE_routeName = 3,
        CHOICE_roadNumber = 4,
        CHOICE_administrativeHierarchy = 5,
        CHOICE_labelName = 6,
        CHOICE_waterName = 7,
        CHOICE_publicTransportName = 8,
        CHOICE_borderName = 9,
        CHOICE_serviceAreaName = 10,
        CHOICE_intersectionName = 11,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::name::types::AdministrativeHierarchy::ZserioPackingContext& getAdministrativeHierarchy()
        {
            return m_administrativeHierarchy_;
        }

    private:
        ::nds::name::types::AdministrativeHierarchy::ZserioPackingContext m_administrativeHierarchy_;
    };

    NameDisplayLineRangeAttributeValue() noexcept :
            NameDisplayLineRangeAttributeValue(allocator_type())
    {}

    explicit NameDisplayLineRangeAttributeValue(const allocator_type& allocator) noexcept;

    explicit NameDisplayLineRangeAttributeValue(::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameDisplayLineRangeAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit NameDisplayLineRangeAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameDisplayLineRangeAttributeType type_, const allocator_type& allocator = allocator_type());

    ~NameDisplayLineRangeAttributeValue() = default;

    NameDisplayLineRangeAttributeValue(const NameDisplayLineRangeAttributeValue& other);
    NameDisplayLineRangeAttributeValue& operator=(const NameDisplayLineRangeAttributeValue& other);

    NameDisplayLineRangeAttributeValue(NameDisplayLineRangeAttributeValue&& other);
    NameDisplayLineRangeAttributeValue& operator=(NameDisplayLineRangeAttributeValue&& other);

    NameDisplayLineRangeAttributeValue(::zserio::PropagateAllocatorT,
            const NameDisplayLineRangeAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::name::attributes::NameDisplayLineRangeAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::name::attributes::NameDisplayLineRangeAttributeType getType() const;

    const ::nds::name::types::RoadName& getRoadName() const;
    ::nds::name::types::RoadName& getRoadName();
    void setRoadName(const ::nds::name::types::RoadName& roadName_);
    void setRoadName(::nds::name::types::RoadName&& roadName_);

    const ::nds::name::types::BridgeName& getBridgeName() const;
    ::nds::name::types::BridgeName& getBridgeName();
    void setBridgeName(const ::nds::name::types::BridgeName& bridgeName_);
    void setBridgeName(::nds::name::types::BridgeName&& bridgeName_);

    const ::nds::name::types::TunnelName& getTunnelName() const;
    ::nds::name::types::TunnelName& getTunnelName();
    void setTunnelName(const ::nds::name::types::TunnelName& tunnelName_);
    void setTunnelName(::nds::name::types::TunnelName&& tunnelName_);

    const ::nds::name::types::RouteName& getRouteName() const;
    ::nds::name::types::RouteName& getRouteName();
    void setRouteName(const ::nds::name::types::RouteName& routeName_);
    void setRouteName(::nds::name::types::RouteName&& routeName_);

    const ::nds::name::types::RoadNumber& getRoadNumber() const;
    ::nds::name::types::RoadNumber& getRoadNumber();
    void setRoadNumber(const ::nds::name::types::RoadNumber& roadNumber_);
    void setRoadNumber(::nds::name::types::RoadNumber&& roadNumber_);

    const ::nds::name::types::AdministrativeHierarchy& getAdministrativeHierarchy() const;
    ::nds::name::types::AdministrativeHierarchy& getAdministrativeHierarchy();
    void setAdministrativeHierarchy(const ::nds::name::types::AdministrativeHierarchy& administrativeHierarchy_);
    void setAdministrativeHierarchy(::nds::name::types::AdministrativeHierarchy&& administrativeHierarchy_);

    const ::nds::name::types::LabelName& getLabelName() const;
    ::nds::name::types::LabelName& getLabelName();
    void setLabelName(const ::nds::name::types::LabelName& labelName_);
    void setLabelName(::nds::name::types::LabelName&& labelName_);

    const ::nds::name::types::LabelName& getWaterName() const;
    ::nds::name::types::LabelName& getWaterName();
    void setWaterName(const ::nds::name::types::LabelName& waterName_);
    void setWaterName(::nds::name::types::LabelName&& waterName_);

    const ::nds::name::types::LabelName& getPublicTransportName() const;
    ::nds::name::types::LabelName& getPublicTransportName();
    void setPublicTransportName(const ::nds::name::types::LabelName& publicTransportName_);
    void setPublicTransportName(::nds::name::types::LabelName&& publicTransportName_);

    const ::nds::name::types::LabelName& getBorderName() const;
    ::nds::name::types::LabelName& getBorderName();
    void setBorderName(const ::nds::name::types::LabelName& borderName_);
    void setBorderName(::nds::name::types::LabelName&& borderName_);

    const ::nds::name::types::ServiceAreaName& getServiceAreaName() const;
    ::nds::name::types::ServiceAreaName& getServiceAreaName();
    void setServiceAreaName(const ::nds::name::types::ServiceAreaName& serviceAreaName_);
    void setServiceAreaName(::nds::name::types::ServiceAreaName&& serviceAreaName_);

    const ::nds::name::types::IntersectionName& getIntersectionName() const;
    ::nds::name::types::IntersectionName& getIntersectionName();
    void setIntersectionName(const ::nds::name::types::IntersectionName& intersectionName_);
    void setIntersectionName(::nds::name::types::IntersectionName&& intersectionName_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NameDisplayLineRangeAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::name::attributes::NameDisplayLineRangeAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace name
} // namespace nds

#endif // NDS_NAME_ATTRIBUTES_NAME_DISPLAY_LINE_RANGE_ATTRIBUTE_VALUE_H
