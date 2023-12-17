/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_PUBLIC_SERVICE_VEHICLES_CONDITION_H
#define NDS_CORE_CONDITIONS_PUBLIC_SERVICE_VEHICLES_CONDITION_H

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

#include <nds/core/vehicle/PublicServiceVehicleTypes.h>

namespace nds
{
namespace core
{
namespace conditions
{

class PublicServiceVehiclesCondition
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getVehicles()
        {
            return m_vehicles_;
        }

    private:
        ::zserio::DeltaContext m_vehicles_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PublicServiceVehiclesCondition() noexcept :
            PublicServiceVehiclesCondition(allocator_type())
    {}

    explicit PublicServiceVehiclesCondition(const allocator_type& allocator) noexcept;

    PublicServiceVehiclesCondition(
            ::nds::core::vehicle::PublicServiceVehicleTypes vehicles_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            PublicServiceVehiclesCondition(allocator)
    {
        m_vehicles_ = vehicles_;
        m_isInclusive_ = isInclusive_;
    }

    explicit PublicServiceVehiclesCondition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PublicServiceVehiclesCondition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PublicServiceVehiclesCondition() = default;

    PublicServiceVehiclesCondition(const PublicServiceVehiclesCondition&) = default;
    PublicServiceVehiclesCondition& operator=(const PublicServiceVehiclesCondition&) = default;

    PublicServiceVehiclesCondition(PublicServiceVehiclesCondition&&) = default;
    PublicServiceVehiclesCondition& operator=(PublicServiceVehiclesCondition&&) = default;

    PublicServiceVehiclesCondition(::zserio::PropagateAllocatorT,
            const PublicServiceVehiclesCondition& other, const allocator_type& allocator);

    ::nds::core::vehicle::PublicServiceVehicleTypes getVehicles() const;
    void setVehicles(::nds::core::vehicle::PublicServiceVehicleTypes vehicles_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PublicServiceVehiclesCondition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::PublicServiceVehicleTypes readVehicles(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::PublicServiceVehicleTypes readVehicles(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::vehicle::PublicServiceVehicleTypes m_vehicles_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_PUBLIC_SERVICE_VEHICLES_CONDITION_H
