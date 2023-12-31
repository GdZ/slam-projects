/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_FREQUENTLY_USED_VEHICLE_TYPES_CONDITION_H
#define NDS_CORE_CONDITIONS_FREQUENTLY_USED_VEHICLE_TYPES_CONDITION_H

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

#include <nds/core/vehicle/FrequentlyUsedVehicleTypes.h>

namespace nds
{
namespace core
{
namespace conditions
{

class FrequentlyUsedVehicleTypesCondition
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getVehicleTypes()
        {
            return m_vehicleTypes_;
        }

    private:
        ::zserio::DeltaContext m_vehicleTypes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    FrequentlyUsedVehicleTypesCondition() noexcept :
            FrequentlyUsedVehicleTypesCondition(allocator_type())
    {}

    explicit FrequentlyUsedVehicleTypesCondition(const allocator_type& allocator) noexcept;

    FrequentlyUsedVehicleTypesCondition(
            ::nds::core::vehicle::FrequentlyUsedVehicleTypes vehicleTypes_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            FrequentlyUsedVehicleTypesCondition(allocator)
    {
        m_vehicleTypes_ = vehicleTypes_;
        m_isInclusive_ = isInclusive_;
    }

    explicit FrequentlyUsedVehicleTypesCondition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit FrequentlyUsedVehicleTypesCondition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~FrequentlyUsedVehicleTypesCondition() = default;

    FrequentlyUsedVehicleTypesCondition(const FrequentlyUsedVehicleTypesCondition&) = default;
    FrequentlyUsedVehicleTypesCondition& operator=(const FrequentlyUsedVehicleTypesCondition&) = default;

    FrequentlyUsedVehicleTypesCondition(FrequentlyUsedVehicleTypesCondition&&) = default;
    FrequentlyUsedVehicleTypesCondition& operator=(FrequentlyUsedVehicleTypesCondition&&) = default;

    FrequentlyUsedVehicleTypesCondition(::zserio::PropagateAllocatorT,
            const FrequentlyUsedVehicleTypesCondition& other, const allocator_type& allocator);

    ::nds::core::vehicle::FrequentlyUsedVehicleTypes getVehicleTypes() const;
    void setVehicleTypes(::nds::core::vehicle::FrequentlyUsedVehicleTypes vehicleTypes_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const FrequentlyUsedVehicleTypesCondition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::FrequentlyUsedVehicleTypes readVehicleTypes(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::FrequentlyUsedVehicleTypes readVehicleTypes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::vehicle::FrequentlyUsedVehicleTypes m_vehicleTypes_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_FREQUENTLY_USED_VEHICLE_TYPES_CONDITION_H
