/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_INSTANTIATIONS_POI_PROPERTY_H
#define NDS_POI_INSTANTIATIONS_POI_PROPERTY_H

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

#include <nds/poi/properties/PoiPropertyType.h>
#include <nds/poi/properties/PoiPropertyValue.h>

namespace nds
{
namespace poi
{
namespace instantiations
{

class PoiProperty
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::poi::properties::PoiPropertyType::ZserioPackingContext& getPropertyTypeCode()
        {
            return m_propertyTypeCode_;
        }

        ::nds::poi::properties::PoiPropertyValue::ZserioPackingContext& getPropertyValue()
        {
            return m_propertyValue_;
        }

    private:
        ::nds::poi::properties::PoiPropertyType::ZserioPackingContext m_propertyTypeCode_;
        ::nds::poi::properties::PoiPropertyValue::ZserioPackingContext m_propertyValue_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiProperty() noexcept :
            PoiProperty(allocator_type())
    {}

    explicit PoiProperty(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_propertyTypeCode = ::nds::poi::properties::PoiPropertyType,
            typename ZSERIO_T_propertyValue = ::nds::poi::properties::PoiPropertyValue,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_propertyTypeCode, PoiProperty, allocator_type> = 0>
    PoiProperty(
            ZSERIO_T_propertyTypeCode&& propertyTypeCode_,
            ZSERIO_T_propertyValue&& propertyValue_,
            const allocator_type& allocator = allocator_type()) :
            PoiProperty(allocator)
    {
        m_propertyTypeCode_ = ::std::forward<ZSERIO_T_propertyTypeCode>(propertyTypeCode_);
        m_propertyValue_ = ::std::forward<ZSERIO_T_propertyValue>(propertyValue_);
    }

    explicit PoiProperty(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PoiProperty(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PoiProperty() = default;

    PoiProperty(const PoiProperty& other);
    PoiProperty& operator=(const PoiProperty& other);

    PoiProperty(PoiProperty&& other);
    PoiProperty& operator=(PoiProperty&& other);

    PoiProperty(::zserio::PropagateAllocatorT,
            const PoiProperty& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::poi::properties::PoiPropertyType& getPropertyTypeCode() const;
    ::nds::poi::properties::PoiPropertyType& getPropertyTypeCode();
    void setPropertyTypeCode(const ::nds::poi::properties::PoiPropertyType& propertyTypeCode_);
    void setPropertyTypeCode(::nds::poi::properties::PoiPropertyType&& propertyTypeCode_);

    const ::nds::poi::properties::PoiPropertyValue& getPropertyValue() const;
    ::nds::poi::properties::PoiPropertyValue& getPropertyValue();
    void setPropertyValue(const ::nds::poi::properties::PoiPropertyValue& propertyValue_);
    void setPropertyValue(::nds::poi::properties::PoiPropertyValue&& propertyValue_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiProperty& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::poi::properties::PoiPropertyType readPropertyTypeCode(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::poi::properties::PoiPropertyType readPropertyTypeCode(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::poi::properties::PoiPropertyValue readPropertyValue(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::poi::properties::PoiPropertyValue readPropertyValue(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::poi::properties::PoiPropertyType m_propertyTypeCode_;
    ::nds::poi::properties::PoiPropertyValue m_propertyValue_;
};

} // namespace instantiations
} // namespace poi
} // namespace nds

#endif // NDS_POI_INSTANTIATIONS_POI_PROPERTY_H