/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_ATTRIBUTES_INSTRUCTIONS_TRANSITION_ATTRIBUTE_VALUE_H
#define NDS_INSTRUCTIONS_ATTRIBUTES_INSTRUCTIONS_TRANSITION_ATTRIBUTE_VALUE_H

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

#include <nds/instructions/attributes/InstructionsTransitionAttributeType.h>
#include <nds/instructions/types/JunctionView.h>
#include <nds/instructions/types/LaneInstruction.h>
#include <nds/instructions/types/SignpostImage.h>
#include <nds/instructions/types/SignpostInstruction.h>

namespace nds
{
namespace instructions
{
namespace attributes
{

class InstructionsTransitionAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_signpostImage = 0,
        CHOICE_signpostInstruction = 1,
        CHOICE_laneInstruction = 2,
        CHOICE_junctionView = 3,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::instructions::types::SignpostImage::ZserioPackingContext& getSignpostImage()
        {
            return m_signpostImage_;
        }

        ::nds::instructions::types::SignpostInstruction::ZserioPackingContext& getSignpostInstruction()
        {
            return m_signpostInstruction_;
        }

        ::nds::instructions::types::LaneInstruction::ZserioPackingContext& getLaneInstruction()
        {
            return m_laneInstruction_;
        }

        ::nds::instructions::types::JunctionView::ZserioPackingContext& getJunctionView()
        {
            return m_junctionView_;
        }

    private:
        ::nds::instructions::types::SignpostImage::ZserioPackingContext m_signpostImage_;
        ::nds::instructions::types::SignpostInstruction::ZserioPackingContext m_signpostInstruction_;
        ::nds::instructions::types::LaneInstruction::ZserioPackingContext m_laneInstruction_;
        ::nds::instructions::types::JunctionView::ZserioPackingContext m_junctionView_;
    };

    InstructionsTransitionAttributeValue() noexcept :
            InstructionsTransitionAttributeValue(allocator_type())
    {}

    explicit InstructionsTransitionAttributeValue(const allocator_type& allocator) noexcept;

    explicit InstructionsTransitionAttributeValue(::zserio::BitStreamReader& in,
            ::nds::instructions::attributes::InstructionsTransitionAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit InstructionsTransitionAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::instructions::attributes::InstructionsTransitionAttributeType type_, const allocator_type& allocator = allocator_type());

    ~InstructionsTransitionAttributeValue() = default;

    InstructionsTransitionAttributeValue(const InstructionsTransitionAttributeValue& other);
    InstructionsTransitionAttributeValue& operator=(const InstructionsTransitionAttributeValue& other);

    InstructionsTransitionAttributeValue(InstructionsTransitionAttributeValue&& other);
    InstructionsTransitionAttributeValue& operator=(InstructionsTransitionAttributeValue&& other);

    InstructionsTransitionAttributeValue(::zserio::PropagateAllocatorT,
            const InstructionsTransitionAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::instructions::attributes::InstructionsTransitionAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::instructions::attributes::InstructionsTransitionAttributeType getType() const;

    const ::nds::instructions::types::SignpostImage& getSignpostImage() const;
    ::nds::instructions::types::SignpostImage& getSignpostImage();
    void setSignpostImage(const ::nds::instructions::types::SignpostImage& signpostImage_);
    void setSignpostImage(::nds::instructions::types::SignpostImage&& signpostImage_);

    const ::nds::instructions::types::SignpostInstruction& getSignpostInstruction() const;
    ::nds::instructions::types::SignpostInstruction& getSignpostInstruction();
    void setSignpostInstruction(const ::nds::instructions::types::SignpostInstruction& signpostInstruction_);
    void setSignpostInstruction(::nds::instructions::types::SignpostInstruction&& signpostInstruction_);

    const ::nds::instructions::types::LaneInstruction& getLaneInstruction() const;
    ::nds::instructions::types::LaneInstruction& getLaneInstruction();
    void setLaneInstruction(const ::nds::instructions::types::LaneInstruction& laneInstruction_);
    void setLaneInstruction(::nds::instructions::types::LaneInstruction&& laneInstruction_);

    const ::nds::instructions::types::JunctionView& getJunctionView() const;
    ::nds::instructions::types::JunctionView& getJunctionView();
    void setJunctionView(const ::nds::instructions::types::JunctionView& junctionView_);
    void setJunctionView(::nds::instructions::types::JunctionView&& junctionView_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const InstructionsTransitionAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::instructions::attributes::InstructionsTransitionAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_ATTRIBUTES_INSTRUCTIONS_TRANSITION_ATTRIBUTE_VALUE_H
