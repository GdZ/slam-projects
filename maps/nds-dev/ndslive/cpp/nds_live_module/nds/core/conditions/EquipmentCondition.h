/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CORE_CONDITIONS_EQUIPMENT_CONDITION_H
#define NDS_CORE_CONDITIONS_EQUIPMENT_CONDITION_H

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

#include <nds/core/vehicle/Equipment.h>

namespace nds
{
namespace core
{
namespace conditions
{

class EquipmentCondition
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getEquipment()
        {
            return m_equipment_;
        }

    private:
        ::zserio::DeltaContext m_equipment_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    EquipmentCondition() noexcept :
            EquipmentCondition(allocator_type())
    {}

    explicit EquipmentCondition(const allocator_type& allocator) noexcept;

    EquipmentCondition(
            ::nds::core::vehicle::Equipment equipment_,
            bool isInclusive_,
            const allocator_type& allocator = allocator_type()) :
            EquipmentCondition(allocator)
    {
        m_equipment_ = equipment_;
        m_isInclusive_ = isInclusive_;
    }

    explicit EquipmentCondition(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit EquipmentCondition(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~EquipmentCondition() = default;

    EquipmentCondition(const EquipmentCondition&) = default;
    EquipmentCondition& operator=(const EquipmentCondition&) = default;

    EquipmentCondition(EquipmentCondition&&) = default;
    EquipmentCondition& operator=(EquipmentCondition&&) = default;

    EquipmentCondition(::zserio::PropagateAllocatorT,
            const EquipmentCondition& other, const allocator_type& allocator);

    ::nds::core::vehicle::Equipment getEquipment() const;
    void setEquipment(::nds::core::vehicle::Equipment equipment_);

    bool getIsInclusive() const;
    void setIsInclusive(bool isInclusive_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const EquipmentCondition& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::vehicle::Equipment readEquipment(::zserio::BitStreamReader& in);
    ::nds::core::vehicle::Equipment readEquipment(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    bool readIsInclusive(::zserio::BitStreamReader& in);

    ::nds::core::vehicle::Equipment m_equipment_;
    bool m_isInclusive_;
};

} // namespace conditions
} // namespace core
} // namespace nds

#endif // NDS_CORE_CONDITIONS_EQUIPMENT_CONDITION_H