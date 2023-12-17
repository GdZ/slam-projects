/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_AREA_CHOICE_H
#define NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_AREA_CHOICE_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/display/reference/types/DisplayAreaValidityType.h>
#include <nds/display/reference/types/LabelPositioningHint.h>

namespace nds
{
namespace display
{
namespace reference
{
namespace types
{

class DisplayAreaChoice
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_hint = 0,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::nds::display::reference::types::LabelPositioningHint::ZserioPackingContext& getHint()
        {
            return m_hint_;
        }

    private:
        ::nds::display::reference::types::LabelPositioningHint::ZserioPackingContext m_hint_;
    };

    DisplayAreaChoice() noexcept :
            DisplayAreaChoice(allocator_type())
    {}

    explicit DisplayAreaChoice(const allocator_type& allocator) noexcept;

    explicit DisplayAreaChoice(::zserio::BitStreamReader& in,
            ::nds::display::reference::types::DisplayAreaValidityType type_,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());
    explicit DisplayAreaChoice(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::display::reference::types::DisplayAreaValidityType type_,
            ::nds::core::geometry::CoordShift shift_, const allocator_type& allocator = allocator_type());

    ~DisplayAreaChoice() = default;

    DisplayAreaChoice(const DisplayAreaChoice& other);
    DisplayAreaChoice& operator=(const DisplayAreaChoice& other);

    DisplayAreaChoice(DisplayAreaChoice&& other);
    DisplayAreaChoice& operator=(DisplayAreaChoice&& other);

    DisplayAreaChoice(::zserio::PropagateAllocatorT,
            const DisplayAreaChoice& other, const allocator_type& allocator);

    void initialize(
            ::nds::display::reference::types::DisplayAreaValidityType type_,
            ::nds::core::geometry::CoordShift shift_);
    bool isInitialized() const;
    void initializeChildren();

    ChoiceTag choiceTag() const;

    ::nds::display::reference::types::DisplayAreaValidityType getType() const;

    ::nds::core::geometry::CoordShift getShift() const;

    const ::nds::display::reference::types::LabelPositioningHint& getHint() const;
    ::nds::display::reference::types::LabelPositioningHint& getHint();
    void setHint(const ::nds::display::reference::types::LabelPositioningHint& hint_);
    void setHint(::nds::display::reference::types::LabelPositioningHint&& hint_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayAreaChoice& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::display::reference::types::DisplayAreaValidityType m_type_;
    ::nds::core::geometry::CoordShift m_shift_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace types
} // namespace reference
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_REFERENCE_TYPES_DISPLAY_AREA_CHOICE_H
