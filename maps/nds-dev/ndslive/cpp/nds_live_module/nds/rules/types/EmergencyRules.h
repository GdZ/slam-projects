/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_TYPES_EMERGENCY_RULES_H
#define NDS_RULES_TYPES_EMERGENCY_RULES_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <memory>
#include <zserio/ArrayTraits.h>

namespace nds
{
namespace rules
{
namespace types
{

class EmergencyRules
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    EmergencyRules() noexcept :
            EmergencyRules(allocator_type())
    {}

    explicit EmergencyRules(const allocator_type& allocator) noexcept;

    EmergencyRules(
            bool buildEmergencyCorridor_,
            bool changeLanes_,
            bool slowDown_,
            const allocator_type& allocator = allocator_type()) :
            EmergencyRules(allocator)
    {
        m_buildEmergencyCorridor_ = buildEmergencyCorridor_;
        m_changeLanes_ = changeLanes_;
        m_slowDown_ = slowDown_;
    }

    explicit EmergencyRules(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~EmergencyRules() = default;

    EmergencyRules(const EmergencyRules&) = default;
    EmergencyRules& operator=(const EmergencyRules&) = default;

    EmergencyRules(EmergencyRules&&) = default;
    EmergencyRules& operator=(EmergencyRules&&) = default;

    EmergencyRules(::zserio::PropagateAllocatorT,
            const EmergencyRules& other, const allocator_type& allocator);

    bool getBuildEmergencyCorridor() const;
    void setBuildEmergencyCorridor(bool buildEmergencyCorridor_);

    bool getChangeLanes() const;
    void setChangeLanes(bool changeLanes_);

    bool getSlowDown() const;
    void setSlowDown(bool slowDown_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const EmergencyRules& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    bool readBuildEmergencyCorridor(::zserio::BitStreamReader& in);
    bool readChangeLanes(::zserio::BitStreamReader& in);
    bool readSlowDown(::zserio::BitStreamReader& in);

    bool m_buildEmergencyCorridor_;
    bool m_changeLanes_;
    bool m_slowDown_;
};

} // namespace types
} // namespace rules
} // namespace nds

#endif // NDS_RULES_TYPES_EMERGENCY_RULES_H
