/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_VENUE_INSTANTIATIONS_CORE_PROPERTY_H
#define NDS_VENUE_INSTANTIATIONS_CORE_PROPERTY_H

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

#include <nds/core/properties/CorePropertyType.h>
#include <nds/core/properties/CorePropertyValue.h>

namespace nds
{
namespace venue
{
namespace instantiations
{

class CoreProperty
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getPropertyTypeCode()
        {
            return m_propertyTypeCode_;
        }

        ::nds::core::properties::CorePropertyValue::ZserioPackingContext& getPropertyValue()
        {
            return m_propertyValue_;
        }

    private:
        ::zserio::DeltaContext m_propertyTypeCode_;
        ::nds::core::properties::CorePropertyValue::ZserioPackingContext m_propertyValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    CoreProperty() noexcept :
            CoreProperty(allocator_type())
    {}

    explicit CoreProperty(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_propertyValue = ::nds::core::properties::CorePropertyValue>
    CoreProperty(
            ::nds::core::properties::CorePropertyType propertyTypeCode_,
            ZSERIO_T_propertyValue&& propertyValue_,
            const allocator_type& allocator = allocator_type()) :
            CoreProperty(allocator)
    {
        m_propertyTypeCode_ = propertyTypeCode_;
        m_propertyValue_ = ::std::forward<ZSERIO_T_propertyValue>(propertyValue_);
    }

    explicit CoreProperty(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit CoreProperty(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~CoreProperty() = default;

    CoreProperty(const CoreProperty& other);
    CoreProperty& operator=(const CoreProperty& other);

    CoreProperty(CoreProperty&& other);
    CoreProperty& operator=(CoreProperty&& other);

    CoreProperty(::zserio::PropagateAllocatorT,
            const CoreProperty& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::core::properties::CorePropertyType getPropertyTypeCode() const;
    void setPropertyTypeCode(::nds::core::properties::CorePropertyType propertyTypeCode_);

    const ::nds::core::properties::CorePropertyValue& getPropertyValue() const;
    ::nds::core::properties::CorePropertyValue& getPropertyValue();
    void setPropertyValue(const ::nds::core::properties::CorePropertyValue& propertyValue_);
    void setPropertyValue(::nds::core::properties::CorePropertyValue&& propertyValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const CoreProperty& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::properties::CorePropertyType readPropertyTypeCode(::zserio::BitStreamReader& in);
    ::nds::core::properties::CorePropertyType readPropertyTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::properties::CorePropertyValue readPropertyValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::properties::CorePropertyValue readPropertyValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::core::properties::CorePropertyType m_propertyTypeCode_;
    ::nds::core::properties::CorePropertyValue m_propertyValue_;
};

} // namespace instantiations
} // namespace venue
} // namespace nds

#endif // NDS_VENUE_INSTANTIATIONS_CORE_PROPERTY_H
