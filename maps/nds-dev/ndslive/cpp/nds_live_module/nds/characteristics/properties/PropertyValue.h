/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_PROPERTIES_PROPERTY_VALUE_H
#define NDS_CHARACTERISTICS_PROPERTIES_PROPERTY_VALUE_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

#include <nds/characteristics/properties/PropertyType.h>
#include <nds/characteristics/types/StationStopType.h>
#include <nds/characteristics/types/StationTemporary.h>
#include <nds/characteristics/types/StationTollBooths.h>
#include <nds/characteristics/types/TollPayment.h>

namespace nds
{
namespace characteristics
{
namespace properties
{

class PropertyValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_tollPayment = 0,
        CHOICE_stationStopType = 1,
        CHOICE_stationTemporary = 2,
        CHOICE_stationTollBooths = 3,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getStationStopType()
        {
            return m_stationStopType_;
        }

        ::zserio::DeltaContext& getStationTollBooths()
        {
            return m_stationTollBooths_;
        }

    private:
        ::zserio::DeltaContext m_stationStopType_;
        ::zserio::DeltaContext m_stationTollBooths_;
    };

    PropertyValue() noexcept :
            PropertyValue(allocator_type())
    {}

    explicit PropertyValue(const allocator_type& allocator) noexcept;

    explicit PropertyValue(::zserio::BitStreamReader& in,
            ::nds::characteristics::properties::PropertyType type_, const allocator_type& allocator = allocator_type());
    explicit PropertyValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::characteristics::properties::PropertyType type_, const allocator_type& allocator = allocator_type());

    ~PropertyValue() = default;

    PropertyValue(const PropertyValue& other);
    PropertyValue& operator=(const PropertyValue& other);

    PropertyValue(PropertyValue&& other);
    PropertyValue& operator=(PropertyValue&& other);

    PropertyValue(::zserio::PropagateAllocatorT,
            const PropertyValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::characteristics::properties::PropertyType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::characteristics::properties::PropertyType getType() const;

    const ::zserio::vector<::nds::characteristics::types::TollPayment>& getTollPayment() const;
    ::zserio::vector<::nds::characteristics::types::TollPayment>& getTollPayment();
    void setTollPayment(const ::zserio::vector<::nds::characteristics::types::TollPayment>& tollPayment_);
    void setTollPayment(::zserio::vector<::nds::characteristics::types::TollPayment>&& tollPayment_);

    ::nds::characteristics::types::StationStopType getStationStopType() const;
    void setStationStopType(::nds::characteristics::types::StationStopType stationStopType_);

    const ::nds::characteristics::types::StationTemporary& getStationTemporary() const;
    ::nds::characteristics::types::StationTemporary& getStationTemporary();
    void setStationTemporary(const ::nds::characteristics::types::StationTemporary& stationTemporary_);
    void setStationTemporary(::nds::characteristics::types::StationTemporary&& stationTemporary_);

    ::nds::characteristics::types::StationTollBooths getStationTollBooths() const;
    void setStationTollBooths(::nds::characteristics::types::StationTollBooths stationTollBooths_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PropertyValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_tollPayment
    {
    public:
        using OwnerType = PropertyValue;

        static void create(PropertyValue& owner,
                ::zserio::vector<::nds::characteristics::types::TollPayment>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PropertyValue& owner,
                ::zserio::vector<::nds::characteristics::types::TollPayment>& array,
                ::nds::characteristics::types::TollPayment::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_tollPayment = ::zserio::Array<::zserio::vector<::nds::characteristics::types::TollPayment>, ::zserio::ObjectArrayTraits<::nds::characteristics::types::TollPayment, ZserioElementFactory_tollPayment>, ::zserio::ArrayType::AUTO>;

    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::characteristics::properties::PropertyType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace properties
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_PROPERTIES_PROPERTY_VALUE_H
