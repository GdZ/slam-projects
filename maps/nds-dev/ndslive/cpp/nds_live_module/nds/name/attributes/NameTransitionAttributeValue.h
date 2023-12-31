/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_ATTRIBUTES_NAME_TRANSITION_ATTRIBUTE_VALUE_H
#define NDS_NAME_ATTRIBUTES_NAME_TRANSITION_ATTRIBUTE_VALUE_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <zserio/Traits.h>
#include <zserio/BitStreamReader.h>
#include <zserio/BitStreamWriter.h>
#include <zserio/AllocatorPropagatingCopy.h>
#include <zserio/AnyHolder.h>
#include <memory>
#include <zserio/ArrayTraits.h>

#include <nds/name/attributes/NameTransitionAttributeType.h>
#include <nds/name/types/IntersectionName.h>

namespace nds
{
namespace name
{
namespace attributes
{

class NameTransitionAttributeValue
{
public:
    using allocator_type = ::std::allocator<uint8_t>;

    enum ChoiceTag : int32_t
    {
        CHOICE_intersectionName = 0,
        UNDEFINED_CHOICE = -1
    };

    NameTransitionAttributeValue() noexcept :
            NameTransitionAttributeValue(allocator_type())
    {}

    explicit NameTransitionAttributeValue(const allocator_type& allocator) noexcept;

    explicit NameTransitionAttributeValue(::zserio::BitStreamReader& in,
            ::nds::name::attributes::NameTransitionAttributeType type_, const allocator_type& allocator = allocator_type());

    ~NameTransitionAttributeValue() = default;

    NameTransitionAttributeValue(const NameTransitionAttributeValue& other);
    NameTransitionAttributeValue& operator=(const NameTransitionAttributeValue& other);

    NameTransitionAttributeValue(NameTransitionAttributeValue&& other);
    NameTransitionAttributeValue& operator=(NameTransitionAttributeValue&& other);

    NameTransitionAttributeValue(::zserio::PropagateAllocatorT,
            const NameTransitionAttributeValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::name::attributes::NameTransitionAttributeType type_);
    bool isInitialized() const;

    ChoiceTag choiceTag() const;

    ::nds::name::attributes::NameTransitionAttributeType getType() const;

    const ::nds::name::types::IntersectionName& getIntersectionName() const;
    ::nds::name::types::IntersectionName& getIntersectionName();
    void setIntersectionName(const ::nds::name::types::IntersectionName& intersectionName_);
    void setIntersectionName(::nds::name::types::IntersectionName&& intersectionName_);

    size_t bitSizeOf(size_t bitPosition = 0) const;

    size_t initializeOffsets(size_t bitPosition = 0);

    bool operator==(const NameTransitionAttributeValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;

private:
    ::zserio::AnyHolder<> readObject(::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::AnyHolder<> copyObject(const allocator_type& allocator) const;

    ::nds::name::attributes::NameTransitionAttributeType m_type_;
    bool m_isInitialized;
    ::zserio::AnyHolder<> m_objectChoice;
};

} // namespace attributes
} // namespace name
} // namespace nds

#endif // NDS_NAME_ATTRIBUTES_NAME_TRANSITION_ATTRIBUTE_VALUE_H
