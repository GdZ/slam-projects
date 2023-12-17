/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_TRANSITION_ATTRIBUTE_VALUE_H
#define NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_TRANSITION_ATTRIBUTE_VALUE_H

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

#include <nds/characteristics/attributes/CharacsTransitionAttributeType.h>
#include <nds/characteristics/types/IntersectionType.h>

namespace nds
{
namespace characteristics
{
namespace attributes
{

class CharacsTransitionAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_intersectionType = 0,
        UNDEFINED_CHOICE = -1
    };

    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getIntersectionType()
        {
            return m_intersectionType_;
        }

    private:
        ::zserio::DeltaContext m_intersectionType_;
    };

    CharacsTransitionAttributeValue() noexcept :
            CharacsTransitionAttributeValue(allocator_type())
    {}

    explicit CharacsTransitionAttributeValue(const allocator_type& allocator) noexcept;

    explicit CharacsTransitionAttributeValue(::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsTransitionAttributeType type_, const allocator_type& allocator = allocator_type());
    explicit CharacsTransitionAttributeValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::characteristics::attributes::CharacsTransitionAttributeType type_, const allocator_type& allocator = allocator_type());

    ~CharacsTransitionAttributeValue() = default;

    CharacsTransitionAttributeValue(const CharacsTransitionAttributeValue& other);
    CharacsTransitionAttributeValue& operator=(const CharacsTransitionAttributeValue& other);

    CharacsTransitionAttributeValue(CharacsTransitionAttributeValue&& other);
    CharacsTransitionAttributeValue& operator=(CharacsTransitionAttributeValue&& other);

    CharacsTransitionAttributeValue(::zserio::PropagateAllocatorT,
            const CharacsTransitionAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::characteristics::attributes::CharacsTransitionAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::characteristics::attributes::CharacsTransitionAttributeType getType() const;

    ::nds::characteristics::types::IntersectionType getIntersectionType() const;
    void setIntersectionType(::nds::characteristics::types::IntersectionType intersectionType_);
    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CharacsTransitionAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> readObject(ZserioPackingContext& context, ::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::characteristics::attributes::CharacsTransitionAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace characteristics
} // namespace nds

#endif // NDS_CHARACTERISTICS_ATTRIBUTES_CHARACS_TRANSITION_ATTRIBUTE_VALUE_H