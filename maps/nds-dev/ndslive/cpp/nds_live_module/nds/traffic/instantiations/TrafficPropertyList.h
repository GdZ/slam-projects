/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_PROPERTY_LIST_H
#define NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_PROPERTY_LIST_H

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

#include <nds/traffic/instantiations/TrafficProperty.h>

namespace nds
{
namespace traffic
{
namespace instantiations
{

class TrafficPropertyList
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

    TrafficPropertyList() noexcept :
            TrafficPropertyList(allocator_type())
    {}

    explicit TrafficPropertyList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_property = ::zserio::vector<::nds::traffic::instantiations::TrafficProperty>>
    TrafficPropertyList(
            uint8_t numProperties_,
            ZSERIO_T_property&& property_,
            const allocator_type& allocator = allocator_type()) :
            TrafficPropertyList(allocator)
    {
        m_numProperties_ = numProperties_;
        m_property_ = ::zserio::createOptionalArray<ZserioArrayType_property>(::std::forward<ZSERIO_T_property>(property_));
    }

    explicit TrafficPropertyList(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit TrafficPropertyList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~TrafficPropertyList() = default;

    TrafficPropertyList(const TrafficPropertyList&) = default;
    TrafficPropertyList& operator=(const TrafficPropertyList&) = default;

    TrafficPropertyList(TrafficPropertyList&&) = default;
    TrafficPropertyList& operator=(TrafficPropertyList&&) = default;

    TrafficPropertyList(::zserio::PropagateAllocatorT,
            const TrafficPropertyList& other, const allocator_type& allocator);

    void initializeChildren();

    uint8_t getNumProperties() const;
    void setNumProperties(uint8_t numProperties_);

    const ::zserio::vector<::nds::traffic::instantiations::TrafficProperty>& getProperty() const;
    ::zserio::vector<::nds::traffic::instantiations::TrafficProperty>& getProperty();
    void setProperty(const ::zserio::vector<::nds::traffic::instantiations::TrafficProperty>& property_);
    void setProperty(::zserio::vector<::nds::traffic::instantiations::TrafficProperty>&& property_);
    bool isPropertyUsed() const;
    bool isPropertySet() const;
    void resetProperty();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const TrafficPropertyList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_property
    {
    public:
        using OwnerType = TrafficPropertyList;

        static void initializeElement(TrafficPropertyList& owner,
                ::nds::traffic::instantiations::TrafficProperty& element, size_t index);
    };

    class ZserioElementFactory_property
    {
    public:
        using OwnerType = TrafficPropertyList;

        static void create(TrafficPropertyList& owner,
                ::zserio::vector<::nds::traffic::instantiations::TrafficProperty>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(TrafficPropertyList& owner,
                ::zserio::vector<::nds::traffic::instantiations::TrafficProperty>& array,
                ::nds::traffic::instantiations::TrafficProperty::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_property = ::zserio::Array<::zserio::vector<::nds::traffic::instantiations::TrafficProperty>, ::zserio::ObjectArrayTraits<::nds::traffic::instantiations::TrafficProperty, ZserioElementFactory_property>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_property>;

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
} // namespace traffic
} // namespace nds

#endif // NDS_TRAFFIC_INSTANTIATIONS_TRAFFIC_PROPERTY_LIST_H