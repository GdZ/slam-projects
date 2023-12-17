/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_RULES_INSTANTIATIONS_RULES_PROPERTY_LIST_H
#define NDS_RULES_INSTANTIATIONS_RULES_PROPERTY_LIST_H

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

#include <nds/rules/instantiations/RulesProperty.h>

namespace nds
{
namespace rules
{
namespace instantiations
{

class RulesPropertyList
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

    RulesPropertyList() noexcept :
            RulesPropertyList(allocator_type())
    {}

    explicit RulesPropertyList(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_property = ::zserio::vector<::nds::rules::instantiations::RulesProperty>>
    RulesPropertyList(
            uint8_t numProperties_,
            ZSERIO_T_property&& property_,
            const allocator_type& allocator = allocator_type()) :
            RulesPropertyList(allocator)
    {
        m_numProperties_ = numProperties_;
        m_property_ = ::zserio::createOptionalArray<ZserioArrayType_property>(::std::forward<ZSERIO_T_property>(property_));
    }

    explicit RulesPropertyList(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit RulesPropertyList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~RulesPropertyList() = default;

    RulesPropertyList(const RulesPropertyList&) = default;
    RulesPropertyList& operator=(const RulesPropertyList&) = default;

    RulesPropertyList(RulesPropertyList&&) = default;
    RulesPropertyList& operator=(RulesPropertyList&&) = default;

    RulesPropertyList(::zserio::PropagateAllocatorT,
            const RulesPropertyList& other, const allocator_type& allocator);

    void initializeChildren();

    uint8_t getNumProperties() const;
    void setNumProperties(uint8_t numProperties_);

    const ::zserio::vector<::nds::rules::instantiations::RulesProperty>& getProperty() const;
    ::zserio::vector<::nds::rules::instantiations::RulesProperty>& getProperty();
    void setProperty(const ::zserio::vector<::nds::rules::instantiations::RulesProperty>& property_);
    void setProperty(::zserio::vector<::nds::rules::instantiations::RulesProperty>&& property_);
    bool isPropertyUsed() const;
    bool isPropertySet() const;
    void resetProperty();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const RulesPropertyList& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_property
    {
    public:
        using OwnerType = RulesPropertyList;

        static void initializeElement(RulesPropertyList& owner,
                ::nds::rules::instantiations::RulesProperty& element, size_t index);
    };

    class ZserioElementFactory_property
    {
    public:
        using OwnerType = RulesPropertyList;

        static void create(RulesPropertyList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesProperty>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(RulesPropertyList& owner,
                ::zserio::vector<::nds::rules::instantiations::RulesProperty>& array,
                ::nds::rules::instantiations::RulesProperty::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_property = ::zserio::Array<::zserio::vector<::nds::rules::instantiations::RulesProperty>, ::zserio::ObjectArrayTraits<::nds::rules::instantiations::RulesProperty, ZserioElementFactory_property>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_property>;

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
} // namespace rules
} // namespace nds

#endif // NDS_RULES_INSTANTIATIONS_RULES_PROPERTY_LIST_H