/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_TYPES_NAME_STRING_COLLECTION_H
#define NDS_POI_TYPES_NAME_STRING_COLLECTION_H

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
#include <zserio/Array.h>
#include <zserio/ArrayTraits.h>
#include <zserio/Vector.h>

#include <nds/poi/types/NameString.h>

namespace nds
{
namespace poi
{
namespace types
{

class NameStringCollection
{
public:
    class ZserioPackingContext
    {
    };

    using allocator_type = ::std::allocator<uint8_t>;

    NameStringCollection() noexcept :
            NameStringCollection(allocator_type())
    {}

    explicit NameStringCollection(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_nameStrings = ::zserio::vector<::nds::poi::types::NameString>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_nameStrings, NameStringCollection, allocator_type> = 0>
    explicit NameStringCollection(
            ZSERIO_T_nameStrings&& nameStrings_,
            const allocator_type& allocator = allocator_type()) :
            NameStringCollection(allocator)
    {
        m_nameStrings_ = ZserioArrayType_nameStrings(::std::forward<ZSERIO_T_nameStrings>(nameStrings_));
    }

    explicit NameStringCollection(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit NameStringCollection(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~NameStringCollection() = default;

    NameStringCollection(const NameStringCollection&) = default;
    NameStringCollection& operator=(const NameStringCollection&) = default;

    NameStringCollection(NameStringCollection&&) = default;
    NameStringCollection& operator=(NameStringCollection&&) = default;

    NameStringCollection(::zserio::PropagateAllocatorT,
            const NameStringCollection& other, const allocator_type& allocator);

    const ::zserio::vector<::nds::poi::types::NameString>& getNameStrings() const;
    ::zserio::vector<::nds::poi::types::NameString>& getNameStrings();
    void setNameStrings(const ::zserio::vector<::nds::poi::types::NameString>& nameStrings_);
    void setNameStrings(::zserio::vector<::nds::poi::types::NameString>&& nameStrings_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const NameStringCollection& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_nameStrings
    {
    public:
        using OwnerType = NameStringCollection;

        static void create(NameStringCollection& owner,
                ::zserio::vector<::nds::poi::types::NameString>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(NameStringCollection& owner,
                ::zserio::vector<::nds::poi::types::NameString>& array,
                ::nds::poi::types::NameString::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_nameStrings = ::zserio::Array<::zserio::vector<::nds::poi::types::NameString>, ::zserio::ObjectArrayTraits<::nds::poi::types::NameString, ZserioElementFactory_nameStrings>, ::zserio::ArrayType::AUTO>;

    ZserioArrayType_nameStrings readNameStrings(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_nameStrings readNameStrings(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ZserioArrayType_nameStrings m_nameStrings_;
};

} // namespace types
} // namespace poi
} // namespace nds

#endif // NDS_POI_TYPES_NAME_STRING_COLLECTION_H
