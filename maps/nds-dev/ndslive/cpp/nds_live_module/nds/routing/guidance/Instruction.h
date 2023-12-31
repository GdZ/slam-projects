/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_GUIDANCE_INSTRUCTION_H
#define NDS_ROUTING_GUIDANCE_INSTRUCTION_H

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
#include <zserio/OptionalHolder.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>

#include <nds/routing/guidance/GuidanceLanes.h>
#include <nds/routing/guidance/GuidanceName.h>
#include <nds/routing/types/ExtGuidanceCode.h>
#include <nds/routing/types/GuidanceCode.h>

namespace nds
{
namespace routing
{
namespace guidance
{

class Instruction
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getTargetIndex()
        {
            return m_targetIndex_;
        }

        ::zserio::DeltaContext& getActivationDistance()
        {
            return m_activationDistance_;
        }

        ::zserio::DeltaContext& getGuidanceCode()
        {
            return m_guidanceCode_;
        }

        ::zserio::DeltaContext& getRoundaboutExitNumber()
        {
            return m_roundaboutExitNumber_;
        }

        ::nds::routing::guidance::GuidanceName::ZserioPackingContext& getTargetName()
        {
            return m_targetName_;
        }

        ::nds::routing::guidance::GuidanceName::ZserioPackingContext& getTowardsName()
        {
            return m_towardsName_;
        }

        ::nds::routing::guidance::GuidanceLanes::ZserioPackingContext& getLanes()
        {
            return m_lanes_;
        }

    private:
        ::zserio::DeltaContext m_targetIndex_;
        ::zserio::DeltaContext m_activationDistance_;
        ::zserio::DeltaContext m_guidanceCode_;
        ::zserio::DeltaContext m_roundaboutExitNumber_;
        ::nds::routing::guidance::GuidanceName::ZserioPackingContext m_targetName_;
        ::nds::routing::guidance::GuidanceName::ZserioPackingContext m_towardsName_;
        ::nds::routing::guidance::GuidanceLanes::ZserioPackingContext m_lanes_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Instruction() noexcept :
            Instruction(allocator_type())
    {}

    explicit Instruction(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_extGuidanceCode = ::nds::routing::types::ExtGuidanceCode,
            typename ZSERIO_T_roundaboutExitNumber = uint8_t,
            typename ZSERIO_T_targetName = ::nds::routing::guidance::GuidanceName,
            typename ZSERIO_T_towardsName = ::nds::routing::guidance::GuidanceName,
            typename ZSERIO_T_lanes = ::nds::routing::guidance::GuidanceLanes>
    Instruction(
            uint64_t targetIndex_,
            uint64_t activationDistance_,
            ::nds::routing::types::GuidanceCode guidanceCode_,
            ZSERIO_T_extGuidanceCode&& extGuidanceCode_,
            ZSERIO_T_roundaboutExitNumber&& roundaboutExitNumber_,
            ZSERIO_T_targetName&& targetName_,
            ZSERIO_T_towardsName&& towardsName_,
            ZSERIO_T_lanes&& lanes_,
            const allocator_type& allocator = allocator_type()) :
            Instruction(allocator)
    {
        m_targetIndex_ = targetIndex_;
        m_activationDistance_ = activationDistance_;
        m_guidanceCode_ = guidanceCode_;
        m_extGuidanceCode_ = ::std::forward<ZSERIO_T_extGuidanceCode>(extGuidanceCode_);
        m_roundaboutExitNumber_ = ::std::forward<ZSERIO_T_roundaboutExitNumber>(roundaboutExitNumber_);
        m_targetName_ = ::std::forward<ZSERIO_T_targetName>(targetName_);
        m_towardsName_ = ::std::forward<ZSERIO_T_towardsName>(towardsName_);
        m_lanes_ = ::std::forward<ZSERIO_T_lanes>(lanes_);
    }

    explicit Instruction(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Instruction(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Instruction() = default;

    Instruction(const Instruction&) = default;
    Instruction& operator=(const Instruction&) = default;

    Instruction(Instruction&&) = default;
    Instruction& operator=(Instruction&&) = default;

    Instruction(::zserio::PropagateAllocatorT,
            const Instruction& other, const allocator_type& allocator);

    void initializeChildren();

    uint64_t getTargetIndex() const;
    void setTargetIndex(uint64_t targetIndex_);

    uint64_t getActivationDistance() const;
    void setActivationDistance(uint64_t activationDistance_);

    ::nds::routing::types::GuidanceCode getGuidanceCode() const;
    void setGuidanceCode(::nds::routing::types::GuidanceCode guidanceCode_);

    const ::nds::routing::types::ExtGuidanceCode& getExtGuidanceCode() const;
    ::nds::routing::types::ExtGuidanceCode& getExtGuidanceCode();
    void setExtGuidanceCode(const ::nds::routing::types::ExtGuidanceCode& extGuidanceCode_);
    void setExtGuidanceCode(::nds::routing::types::ExtGuidanceCode&& extGuidanceCode_);
    bool isExtGuidanceCodeUsed() const;
    bool isExtGuidanceCodeSet() const;
    void resetExtGuidanceCode();

    uint8_t getRoundaboutExitNumber() const;
    void setRoundaboutExitNumber(uint8_t roundaboutExitNumber_);
    bool isRoundaboutExitNumberUsed() const;
    bool isRoundaboutExitNumberSet() const;
    void resetRoundaboutExitNumber();

    const ::nds::routing::guidance::GuidanceName& getTargetName() const;
    ::nds::routing::guidance::GuidanceName& getTargetName();
    void setTargetName(const ::nds::routing::guidance::GuidanceName& targetName_);
    void setTargetName(::nds::routing::guidance::GuidanceName&& targetName_);
    bool isTargetNameUsed() const;
    bool isTargetNameSet() const;
    void resetTargetName();

    const ::nds::routing::guidance::GuidanceName& getTowardsName() const;
    ::nds::routing::guidance::GuidanceName& getTowardsName();
    void setTowardsName(const ::nds::routing::guidance::GuidanceName& towardsName_);
    void setTowardsName(::nds::routing::guidance::GuidanceName&& towardsName_);
    bool isTowardsNameUsed() const;
    bool isTowardsNameSet() const;
    void resetTowardsName();

    const ::nds::routing::guidance::GuidanceLanes& getLanes() const;
    ::nds::routing::guidance::GuidanceLanes& getLanes();
    void setLanes(const ::nds::routing::guidance::GuidanceLanes& lanes_);
    void setLanes(::nds::routing::guidance::GuidanceLanes&& lanes_);
    bool isLanesUsed() const;
    bool isLanesSet() const;
    void resetLanes();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Instruction& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    uint64_t readTargetIndex(::zserio::BitStreamReader& in);
    uint64_t readTargetIndex(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    uint64_t readActivationDistance(::zserio::BitStreamReader& in);
    uint64_t readActivationDistance(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::routing::types::GuidanceCode readGuidanceCode(::zserio::BitStreamReader& in);
    ::nds::routing::types::GuidanceCode readGuidanceCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::routing::types::ExtGuidanceCode> readExtGuidanceCode(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<uint8_t> readRoundaboutExitNumber(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<uint8_t> readRoundaboutExitNumber(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceName> readTargetName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceName> readTargetName(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceName> readTowardsName(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceName> readTowardsName(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceLanes> readLanes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceLanes> readLanes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint64_t m_targetIndex_;
    uint64_t m_activationDistance_;
    ::nds::routing::types::GuidanceCode m_guidanceCode_;
    ::zserio::InplaceOptionalHolder<::nds::routing::types::ExtGuidanceCode> m_extGuidanceCode_;
    ::zserio::InplaceOptionalHolder<uint8_t> m_roundaboutExitNumber_;
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceName> m_targetName_;
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceName> m_towardsName_;
    ::zserio::InplaceOptionalHolder<::nds::routing::guidance::GuidanceLanes> m_lanes_;
};

} // namespace guidance
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_GUIDANCE_INSTRUCTION_H
