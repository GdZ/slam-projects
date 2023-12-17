/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_PROPERTIES_POI_PROPERTY_TYPE_H
#define NDS_POI_PROPERTIES_POI_PROPERTY_TYPE_H

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
#include <nds/poi/properties/PropertyType.h>

namespace nds
{
namespace poi
{
namespace properties
{

class PoiPropertyType
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getType()
        {
            return m_type_;
        }

        ::zserio::DeltaContext& getCoreType()
        {
            return m_coreType_;
        }

    private:
        ::zserio::DeltaContext m_type_;
        ::zserio::DeltaContext m_coreType_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiPropertyType() noexcept :
            PoiPropertyType(allocator_type())
    {}

    explicit PoiPropertyType(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_coreType = ::nds::core::properties::CorePropertyType>
    PoiPropertyType(
            ::nds::poi::properties::PropertyType type_,
            ZSERIO_T_coreType&& coreType_,
            const allocator_type& allocator = allocator_type()) :
            PoiPropertyType(allocator)
    {
        m_type_ = type_;
        m_coreType_ = ::std::forward<ZSERIO_T_coreType>(coreType_);
    }

    explicit PoiPropertyType(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PoiPropertyType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PoiPropertyType() = default;

    PoiPropertyType(const PoiPropertyType&) = default;
    PoiPropertyType& operator=(const PoiPropertyType&) = default;

    PoiPropertyType(PoiPropertyType&&) = default;
    PoiPropertyType& operator=(PoiPropertyType&&) = default;

    PoiPropertyType(::zserio::PropagateAllocatorT,
            const PoiPropertyType& other, const allocator_type& allocator);

    ::nds::poi::properties::PropertyType getType() const;
    void setType(::nds::poi::properties::PropertyType type_);

    ::nds::core::properties::CorePropertyType getCoreType() const;
    void setCoreType(::nds::core::properties::CorePropertyType coreType_);
    bool isCoreTypeUsed() const;
    bool isCoreTypeSet() const;
    void resetCoreType();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiPropertyType& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::poi::properties::PropertyType readType(::zserio::BitStreamReader& in);
    ::nds::poi::properties::PropertyType readType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType> readCoreType(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType> readCoreType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::poi::properties::PropertyType m_type_;
    ::zserio::InplaceOptionalHolder<::nds::core::properties::CorePropertyType> m_coreType_;
};

} // namespace properties
} // namespace poi
} // namespace nds

#endif // NDS_POI_PROPERTIES_POI_PROPERTY_TYPE_H
