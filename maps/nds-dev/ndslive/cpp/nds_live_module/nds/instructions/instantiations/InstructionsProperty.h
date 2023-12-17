/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_PROPERTY_H
#define NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_PROPERTY_H

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

#include <nds/instructions/properties/InstructionsPropertyType.h>
#include <nds/instructions/properties/InstructionsPropertyValue.h>

namespace nds
{
namespace instructions
{
namespace instantiations
{

class InstructionsProperty
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::instructions::properties::InstructionsPropertyType::ZserioPackingContext& getPropertyTypeCode()
        {
            return m_propertyTypeCode_;
        }

        ::nds::instructions::properties::InstructionsPropertyValue::ZserioPackingContext& getPropertyValue()
        {
            return m_propertyValue_;
        }

    private:
        ::nds::instructions::properties::InstructionsPropertyType::ZserioPackingContext m_propertyTypeCode_;
        ::nds::instructions::properties::InstructionsPropertyValue::ZserioPackingContext m_propertyValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    InstructionsProperty() noexcept :
            InstructionsProperty(allocator_type())
    {}

    explicit InstructionsProperty(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_propertyTypeCode = ::nds::instructions::properties::InstructionsPropertyType,
            typename ZSERIO_T_propertyValue = ::nds::instructions::properties::InstructionsPropertyValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_propertyTypeCode, InstructionsProperty, allocator_type> = 0>
    InstructionsProperty(
            ZSERIO_T_propertyTypeCode&& propertyTypeCode_,
            ZSERIO_T_propertyValue&& propertyValue_,
            const allocator_type& allocator = allocator_type()) :
            InstructionsProperty(allocator)
    {
        m_propertyTypeCode_ = ::std::forward<ZSERIO_T_propertyTypeCode>(propertyTypeCode_);
        m_propertyValue_ = ::std::forward<ZSERIO_T_propertyValue>(propertyValue_);
    }

    explicit InstructionsProperty(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit InstructionsProperty(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~InstructionsProperty() = default;

    InstructionsProperty(const InstructionsProperty& other);
    InstructionsProperty& operator=(const InstructionsProperty& other);

    InstructionsProperty(InstructionsProperty&& other);
    InstructionsProperty& operator=(InstructionsProperty&& other);

    InstructionsProperty(::zserio::PropagateAllocatorT,
            const InstructionsProperty& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::instructions::properties::InstructionsPropertyType& getPropertyTypeCode() const;
    ::nds::instructions::properties::InstructionsPropertyType& getPropertyTypeCode();
    void setPropertyTypeCode(const ::nds::instructions::properties::InstructionsPropertyType& propertyTypeCode_);
    void setPropertyTypeCode(::nds::instructions::properties::InstructionsPropertyType&& propertyTypeCode_);

    const ::nds::instructions::properties::InstructionsPropertyValue& getPropertyValue() const;
    ::nds::instructions::properties::InstructionsPropertyValue& getPropertyValue();
    void setPropertyValue(const ::nds::instructions::properties::InstructionsPropertyValue& propertyValue_);
    void setPropertyValue(::nds::instructions::properties::InstructionsPropertyValue&& propertyValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const InstructionsProperty& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::instructions::properties::InstructionsPropertyType readPropertyTypeCode(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::instructions::properties::InstructionsPropertyType readPropertyTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::instructions::properties::InstructionsPropertyValue readPropertyValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::instructions::properties::InstructionsPropertyValue readPropertyValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::instructions::properties::InstructionsPropertyType m_propertyTypeCode_;
    ::nds::instructions::properties::InstructionsPropertyValue m_propertyValue_;
};

} // namespace instantiations
} // namespace instructions
} // namespace nds

#endif // NDS_INSTRUCTIONS_INSTANTIATIONS_INSTRUCTIONS_PROPERTY_H
