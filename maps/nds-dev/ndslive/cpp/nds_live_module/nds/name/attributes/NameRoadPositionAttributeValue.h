/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_ROAD_POSITION_ATTRIBUTE_VALUE_H
#define NDS_NAME_ATTRIBUTES_NAME_ROAD_POSITION_ATTRIBUTE_VALUE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <zserio/AnyHolder.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/name/attributes/NameRoadPositionAttributeType.h>
#include <nds/name/types/HouseNumber.h>
#include <nds/name/types/TollStationName.h>

namespace nds
{
namespace name
{
namespace attributes
{

class NameRoadPositionAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_houseNumber = 0,
        CHOICE_tollStationName = 1,
        UNDEFINED_CHOICE = -1
    };

    NameRoadPositionAttributeValue() noexcept :
            NameRoadPositionAttributeValue(allocator_type())
    {}

    explicit NameRoadPositionAttributeValue(const allocator_type& allocator) noexcept;

    explicit NameRoadPositionAttributeValue(::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameRoadPositionAttributeType type_, const allocator_type& allocator = allocator_type());

    ~NameRoadPositionAttributeValue() = default;

    NameRoadPositionAttributeValue(const NameRoadPositionAttributeValue& other);
    NameRoadPositionAttributeValue& operator=(const NameRoadPositionAttributeValue& other);

    NameRoadPositionAttributeValue(NameRoadPositionAttributeValue&& other);
    NameRoadPositionAttributeValue& operator=(NameRoadPositionAttributeValue&& other);

    NameRoadPositionAttributeValue(::zserio::PropagateAllocatorT,
            const NameRoadPositionAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::name::attributes::NameRoadPositionAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::name::attributes::NameRoadPositionAttributeType getType() const;

    const ::nds::name::types::HouseNumber& getHouseNumber() const;
    ::nds::name::types::HouseNumber& getHouseNumber();
    void setHouseNumber(const ::nds::name::types::HouseNumber& houseNumber_);
    void setHouseNumber(::nds::name::types::HouseNumber&& houseNumber_);

    const ::nds::name::types::TollStationName& getTollStationName() const;
    ::nds::name::types::TollStationName& getTollStationName();
    void setTollStationName(const ::nds::name::types::TollStationName& tollStationName_);
    void setTollStationName(::nds::name::types::TollStationName&& tollStationName_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const NameRoadPositionAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::name::attributes::NameRoadPositionAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace name
} // namespace nds

#endif // NDS_NAME_ATTRIBUTES_NAME_ROAD_POSITION_ATTRIBUTE_VALUE_H
