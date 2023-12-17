/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_POI_ATTRIBUTE_VALUE_H
#define NDS_NAME_ATTRIBUTES_NAME_POI_ATTRIBUTE_VALUE_H

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

#include <nds/name/attributes/NamePoiAttributeType.h>
#include <nds/name/types/AdministrativeHierarchy.h>
#include <nds/name/types/BuildingName.h>
#include <nds/name/types/FloorName.h>
#include <nds/name/types/HouseNumber.h>
#include <nds/name/types/PoiName.h>
#include <nds/name/types/RoadName.h>

namespace nds
{
namespace name
{
namespace attributes
{

class NamePoiAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_poiName = 0,
        CHOICE_administrativeHierarchy = 1,
        CHOICE_roadName = 2,
        CHOICE_houseNumber = 3,
        CHOICE_buildingName = 4,
        CHOICE_floorName = 5,
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

    NamePoiAttributeValue() noexcept :
            NamePoiAttributeValue(allocator_type())
    {}

    explicit NamePoiAttributeValue(const allocator_type& allocator) noexcept;

    explicit NamePoiAttributeValue(::zserio::BitStreamReader& in,
            ::nds::name::attributes::NamePoiAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit NamePoiAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::name::attributes::NamePoiAttributeType type_, const allocator_type& allocator = allocator_type());

    ~NamePoiAttributeValue() = default;

    NamePoiAttributeValue(const NamePoiAttributeValue& other);
    NamePoiAttributeValue& operator=(const NamePoiAttributeValue& other);

    NamePoiAttributeValue(NamePoiAttributeValue&& other);
    NamePoiAttributeValue& operator=(NamePoiAttributeValue&& other);

    NamePoiAttributeValue(::zserio::PropagateAllocatorT,
            const NamePoiAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::name::attributes::NamePoiAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::name::attributes::NamePoiAttributeType getType() const;

    const ::nds::name::types::PoiName& getPoiName() const;
    ::nds::name::types::PoiName& getPoiName();
    void setPoiName(const ::nds::name::types::PoiName& poiName_);
    void setPoiName(::nds::name::types::PoiName&& poiName_);

    const ::nds::name::types::AdministrativeHierarchy& getAdministrativeHierarchy() const;
    ::nds::name::types::AdministrativeHierarchy& getAdministrativeHierarchy();
    void setAdministrativeHierarchy(const ::nds::name::types::AdministrativeHierarchy& administrativeHierarchy_);
    void setAdministrativeHierarchy(::nds::name::types::AdministrativeHierarchy&& administrativeHierarchy_);

    const ::nds::name::types::RoadName& getRoadName() const;
    ::nds::name::types::RoadName& getRoadName();
    void setRoadName(const ::nds::name::types::RoadName& roadName_);
    void setRoadName(::nds::name::types::RoadName&& roadName_);

    const ::nds::name::types::HouseNumber& getHouseNumber() const;
    ::nds::name::types::HouseNumber& getHouseNumber();
    void setHouseNumber(const ::nds::name::types::HouseNumber& houseNumber_);
    void setHouseNumber(::nds::name::types::HouseNumber&& houseNumber_);

    const ::nds::name::types::BuildingName& getBuildingName() const;
    ::nds::name::types::BuildingName& getBuildingName();
    void setBuildingName(const ::nds::name::types::BuildingName& buildingName_);
    void setBuildingName(::nds::name::types::BuildingName&& buildingName_);

    const ::nds::name::types::FloorName& getFloorName() const;
    ::nds::name::types::FloorName& getFloorName();
    void setFloorName(const ::nds::name::types::FloorName& floorName_);
    void setFloorName(::nds::name::types::FloorName&& floorName_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NamePoiAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::name::attributes::NamePoiAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace name
} // namespace nds

#endif // NDS_NAME_ATTRIBUTES_NAME_POI_ATTRIBUTE_VALUE_H