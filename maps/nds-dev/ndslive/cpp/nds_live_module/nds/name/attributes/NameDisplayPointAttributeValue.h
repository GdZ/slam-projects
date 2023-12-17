/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_DISPLAY_POINT_ATTRIBUTE_VALUE_H
#define NDS_NAME_ATTRIBUTES_NAME_DISPLAY_POINT_ATTRIBUTE_VALUE_H

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

#include <nds/name/attributes/NameDisplayPointAttributeType.h>
#include <nds/name/types/LabelName.h>
#include <nds/name/types/TollStationName.h>

namespace nds
{
namespace name
{
namespace attributes
{

class NameDisplayPointAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_pointName = 0,
        CHOICE_administrativeAreaCenterName = 1,
        CHOICE_mountainName = 2,
        CHOICE_islandName = 3,
        CHOICE_tollStationName = 4,
        UNDEFINED_CHOICE = -1
    };

    NameDisplayPointAttributeValue() noexcept :
            NameDisplayPointAttributeValue(allocator_type())
    {}

    explicit NameDisplayPointAttributeValue(const allocator_type& allocator) noexcept;

    explicit NameDisplayPointAttributeValue(::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameDisplayPointAttributeType type_, const allocator_type& allocator = allocator_type());

    ~NameDisplayPointAttributeValue() = default;

    NameDisplayPointAttributeValue(const NameDisplayPointAttributeValue& other);
    NameDisplayPointAttributeValue& operator=(const NameDisplayPointAttributeValue& other);

    NameDisplayPointAttributeValue(NameDisplayPointAttributeValue&& other);
    NameDisplayPointAttributeValue& operator=(NameDisplayPointAttributeValue&& other);

    NameDisplayPointAttributeValue(::zserio::PropagateAllocatorT,
            const NameDisplayPointAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::name::attributes::NameDisplayPointAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::name::attributes::NameDisplayPointAttributeType getType() const;

    const ::nds::name::types::LabelName& getPointName() const;
    ::nds::name::types::LabelName& getPointName();
    void setPointName(const ::nds::name::types::LabelName& pointName_);
    void setPointName(::nds::name::types::LabelName&& pointName_);

    const ::nds::name::types::LabelName& getAdministrativeAreaCenterName() const;
    ::nds::name::types::LabelName& getAdministrativeAreaCenterName();
    void setAdministrativeAreaCenterName(const ::nds::name::types::LabelName& administrativeAreaCenterName_);
    void setAdministrativeAreaCenterName(::nds::name::types::LabelName&& administrativeAreaCenterName_);

    const ::nds::name::types::LabelName& getMountainName() const;
    ::nds::name::types::LabelName& getMountainName();
    void setMountainName(const ::nds::name::types::LabelName& mountainName_);
    void setMountainName(::nds::name::types::LabelName&& mountainName_);

    const ::nds::name::types::LabelName& getIslandName() const;
    ::nds::name::types::LabelName& getIslandName();
    void setIslandName(const ::nds::name::types::LabelName& islandName_);
    void setIslandName(::nds::name::types::LabelName&& islandName_);

    const ::nds::name::types::TollStationName& getTollStationName() const;
    ::nds::name::types::TollStationName& getTollStationName();
    void setTollStationName(const ::nds::name::types::TollStationName& tollStationName_);
    void setTollStationName(::nds::name::types::TollStationName&& tollStationName_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const NameDisplayPointAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::name::attributes::NameDisplayPointAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace name
} // namespace nds

#endif // NDS_NAME_ATTRIBUTES_NAME_DISPLAY_POINT_ATTRIBUTE_VALUE_H
