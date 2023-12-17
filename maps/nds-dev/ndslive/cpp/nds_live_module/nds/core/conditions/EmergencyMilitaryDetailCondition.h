/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_EMERGENCY_MILITARY_DETAIL_CONDITION_H
#define NDS_CORE_CONDITIONS_EMERGENCY_MILITARY_DETAIL_CONDITION_H

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

#include <nds/core/vehicle/EmergencyMilitaryDetailTypes.h>

namespace nds
{
namespace core
{
namespace conditions
{

class EmergencyMilitaryDetailCondition
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

    EmergencyMilitaryDetailCondition() noexcept :
            EmergencyMilitaryDetailCondition(allocator_type())
    {}

    explicit EmergencyMilitaryDetailCondition(const allocator_type& allocator) noexcept;

    EmergencyMilitaryDetailCondition(
            ::nds::core::vehicle::EmergencyMilitaryDetailTypes vehicles_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            EmergencyMilitaryDetailCondition(allocator)
    {
        m_vehicles_ = vehicles_;
        m_isInclusive_ = isInclusive_;
    }

    explicit EmergencyMilitaryDetailCondition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit EmergencyMilitaryDetailCondition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~EmergencyMilitaryDetailCondition() = default;

    EmergencyMilitaryDetailCondition(const EmergencyMilitaryDetailCondition&) = default;
    EmergencyMilitaryDetailCondition& operator=(const EmergencyMilitaryDetailCondition&) = default;

    EmergencyMilitaryDetailCondition(EmergencyMilitaryDetailCondition&&) = default;
    EmergencyMilitaryDetailCondition& operator=(EmergencyMilitaryDetailCondition&&) = default;

    EmergencyMilitaryDetailCondition(::zserio::PropagateAllocatorT,
            const EmergencyMilitaryDetailCondition& other, const allocator_type& allocator);

    ::nds::core::vehicle::EmergencyMilitaryDetailTypes getVehicles() const;
    void setVehicles(::nds::core::vehicle::EmergencyMilitaryDetailTypes vehicles_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const EmergencyMilitaryDetailCondition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::EmergencyMilitaryDetailTypes readVehicles(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::EmergencyMilitaryDetailTypes readVehicles(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::vehicle::EmergencyMilitaryDetailTypes m_vehicles_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_EMERGENCY_MILITARY_DETAIL_CONDITION_H