/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_PROPERTIES_INSTRUCTIONS_PROPERTY_VALUE_H
#define NDS_INSTRUCTIONS_PROPERTIES_INSTRUCTIONS_PROPERTY_VALUE_H

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

#include <nds/core/properties/CorePropertyType.h>
#include <nds/core/properties/CorePropertyValue.h>
#include <nds/instructions/properties/InstructionsPropertyType.h>
#include <nds/instructions/properties/PropertyType.h>
#include <nds/instructions/properties/PropertyValue.h>

namespace nds
{
namespace instructions
{
namespace properties
{

class InstructionsPropertyValue
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::instructions::properties::PropertyValue::ZserioPackingContext& getValue()
        {
            return m_value_;
        }

        ::nds::core::properties::CorePropertyValue::ZserioPackingContext& getCoreValue()
        {
            return m_coreValue_;
        }

    private:
        ::nds::instructions::properties::PropertyValue::ZserioPackingContext m_value_;
        ::nds::core::properties::CorePropertyValue::ZserioPackingContext m_coreValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    InstructionsPropertyValue() noexcept :
            InstructionsPropertyValue(allocator_type())
    {}

    explicit InstructionsPropertyValue(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_value = ::nds::instructions::properties::PropertyValue,
            typename ZSERIO_T_coreValue = ::nds::core::properties::CorePropertyValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_value, InstructionsPropertyValue, allocator_type> = 0>
    InstructionsPropertyValue(
            ZSERIO_T_value&& value_,
            ZSERIO_T_coreValue&& coreValue_,
            const allocator_type& allocator = allocator_type()) :
            InstructionsPropertyValue(allocator)
    {
        m_value_ = ::std::forward<ZSERIO_T_value>(value_);
        m_coreValue_ = ::std::forward<ZSERIO_T_coreValue>(coreValue_);
    }

    explicit InstructionsPropertyValue(::zserio::BitStreamReader& in,
            ::nds::instructions::properties::InstructionsPropertyType& type_, const allocator_type& allocator = allocator_type());
    explicit InstructionsPropertyValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in,
            ::nds::instructions::properties::InstructionsPropertyType& type_, const allocator_type& allocator = allocator_type());

    ~InstructionsPropertyValue() = default;

    InstructionsPropertyValue(const InstructionsPropertyValue& other);
    InstructionsPropertyValue& operator=(const InstructionsPropertyValue& other);

    InstructionsPropertyValue(InstructionsPropertyValue&& other);
    InstructionsPropertyValue& operator=(InstructionsPropertyValue&& other);

    InstructionsPropertyValue(::zserio::PropagateAllocatorT,
            const InstructionsPropertyValue& other, const allocator_type& allocator);

    void initialize(
            ::nds::instructions::properties::InstructionsPropertyType& type_);
    bool isInitialized() const;
    void initializeChildren();

    ::nds::instructions::properties::InstructionsPropertyType& getType();
    const ::nds::instructions::properties::InstructionsPropertyType& getType() const;

    const ::nds::instructions::properties::PropertyValue& getValue() const;
    ::nds::instructions::properties::PropertyValue& getValue();
    void setValue(const ::nds::instructions::properties::PropertyValue& value_);
    void setValue(::nds::instructions::properties::PropertyValue&& value_);
    bool isValueUsed() const;
    bool isValueSet() const;
    void resetValue();

    const ::nds::core::properties::CorePropertyValue& getCoreValue() const;
    ::nds::core::properties::CorePropertyValue& getCoreValue();
    void setCoreValue(const ::nds::core::properties::CorePropertyValue& coreValue_);
    void setCoreValue(::nds::core::properties::CorePropertyValue&& coreValue_);
    bool isCoreValueUsed() const;
    bool isCoreValueSet() const;
    void resetCoreValue();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const InstructionsPropertyValue& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::zserio::InplaceOptionalHolder<::nds::instructions::properties::PropertyValue> readValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::instructions::properties::PropertyValue> readValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue> readCoreValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue> readCoreValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::instructions::properties::InstructionsPropertyType* m_type_;
    bool m_isInitialized;
    ::zserio::InplaceOptionalHolder<::nds::instructions::properties::PropertyValue> m_value_;
    ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyValue> m_coreValue_;
};

} // namespace properties
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_PROPERTIES_INSTRUCTIONS_PROPERTY_VALUE_H
