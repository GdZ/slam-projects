/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_INSTANTIATIONS_ADAS_PROPERTY_LIST_H
#define NDS_ADAS_INSTANTIATIONS_ADAS_PROPERTY_LIST_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Types.h>
#include <zserio/Vector.h>

#include <nds/adas/instantiations/AdasProperty.h>

namespace nds
{
namespace adas
{
namespace instantiations
{

class AdasPropertyList
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getNumProperties()
        {
            return m_numProperties_;
        }

    private:
        ::zserio::DeltaContext m_numProperties_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AdasPropertyList() noexcept :
            AdasPropertyList(allocator_type())
    {}

    explicit AdasPropertyList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_property = ::zserio::vector<::nds::adas::instantiations::AdasProperty>>
    AdasPropertyList(
            uint8_t numProperties_,
            ZSERIO_T_property&& property_,
            const allocator_type& allocator = allocator_type()) :
            AdasPropertyList(allocator)
    {
        m_numProperties_ = numProperties_;
        m_property_ = ::zserio::createOptionalArray<ZserioArrayType_property>(::std::forward<ZSERIO_T_property>(property_));
    }

    explicit AdasPropertyList(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AdasPropertyList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AdasPropertyList() = default;

    AdasPropertyList(const AdasPropertyList&) = default;
    AdasPropertyList& operator=(const AdasPropertyList&) = default;

    AdasPropertyList(AdasPropertyList&&) = default;
    AdasPropertyList& operator=(AdasPropertyList&&) = default;

    AdasPropertyList(::zserio::PropagateAllocatorT,
            const AdasPropertyList& other, const allocator_type& allocator);

    void initializeChildren();

    uint8_t getNumProperties() const;
    void setNumProperties(uint8_t numProperties_);

    const ::zserio::vector<::nds::adas::instantiations::AdasProperty>& getProperty() const;
    ::zserio::vector<::nds::adas::instantiations::AdasProperty>& getProperty();
    void setProperty(const ::zserio::vector<::nds::adas::instantiations::AdasProperty>& property_);
    void setProperty(::zserio::vector<::nds::adas::instantiations::AdasProperty>&& property_);
    bool isPropertyUsed() const;
    bool isPropertySet() const;
    void resetProperty();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdasPropertyList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_property
    {
    public:
        using OwnerType = AdasPropertyList;

        static void initializeElement(AdasPropertyList& owner,
                ::nds::adas::instantiations::AdasProperty& element, size_t index);
    };

    class ZserioElementFactory_property
    {
    public:
        using OwnerType = AdasPropertyList;

        static void create(AdasPropertyList& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasProperty>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AdasPropertyList& owner,
                ::zserio::vector<::nds::adas::instantiations::AdasProperty>& array,
                ::nds::adas::instantiations::AdasProperty::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_property = ::zserio::Array<::zserio::vector<::nds::adas::instantiations::AdasProperty>, ::zserio::ObjectArrayTraits<::nds::adas::instantiations::AdasProperty, ZserioElementFactory_property>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_property>;

    uint8_t readNumProperties(::zserio::BitStreamReader& in);
    uint8_t readNumProperties(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_property> readProperty(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_property> readProperty(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    uint8_t m_numProperties_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_property> m_property_;
};

} // namespace instantiations
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_INSTANTIATIONS_ADAS_PROPERTY_LIST_H
