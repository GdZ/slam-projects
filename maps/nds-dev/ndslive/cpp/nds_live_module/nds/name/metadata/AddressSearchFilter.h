/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_METADATA_ADDRESS_SEARCH_FILTER_H
#define NDS_NAME_METADATA_ADDRESS_SEARCH_FILTER_H

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
#include <zserio/Vector.h>

#include <nds/name/metadata/AddressSearchFilterOptions.h>
#include <nds/name/types/AddressFormatId.h>
#include <nds/name/types/AdminHierarchyElementType.h>

namespace nds
{
namespace name
{
namespace metadata
{

class AddressSearchFilter
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getFilterOptions()
        {
            return m_filterOptions_;
        }

        ::zserio::DeltaContext& getAddressFormatId()
        {
            return m_addressFormatId_;
        }

    private:
        ::zserio::DeltaContext m_filterOptions_;
        ::zserio::DeltaContext m_addressFormatId_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AddressSearchFilter() noexcept :
            AddressSearchFilter(allocator_type())
    {}

    explicit AddressSearchFilter(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_adminHierarchyElementType = ::zserio::vector<::nds::name::types::AdminHierarchyElementType>,
            typename ZSERIO_T_addressFormatId = ::nds::name::types::AddressFormatId>
    AddressSearchFilter(
            ::nds::name::metadata::AddressSearchFilterOptions filterOptions_,
            ZSERIO_T_adminHierarchyElementType&& adminHierarchyElementType_,
            ZSERIO_T_addressFormatId&& addressFormatId_,
            const allocator_type& allocator = allocator_type()) :
            AddressSearchFilter(allocator)
    {
        m_filterOptions_ = filterOptions_;
        m_adminHierarchyElementType_ = ::zserio::createOptionalArray<ZserioArrayType_adminHierarchyElementType>(::std::forward<ZSERIO_T_adminHierarchyElementType>(adminHierarchyElementType_));
        m_addressFormatId_ = ::std::forward<ZSERIO_T_addressFormatId>(addressFormatId_);
    }

    explicit AddressSearchFilter(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AddressSearchFilter(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AddressSearchFilter() = default;

    AddressSearchFilter(const AddressSearchFilter&) = default;
    AddressSearchFilter& operator=(const AddressSearchFilter&) = default;

    AddressSearchFilter(AddressSearchFilter&&) = default;
    AddressSearchFilter& operator=(AddressSearchFilter&&) = default;

    AddressSearchFilter(::zserio::PropagateAllocatorT,
            const AddressSearchFilter& other, const allocator_type& allocator);

    ::nds::name::metadata::AddressSearchFilterOptions getFilterOptions() const;
    void setFilterOptions(::nds::name::metadata::AddressSearchFilterOptions filterOptions_);

    const ::zserio::vector<::nds::name::types::AdminHierarchyElementType>& getAdminHierarchyElementType() const;
    ::zserio::vector<::nds::name::types::AdminHierarchyElementType>& getAdminHierarchyElementType();
    void setAdminHierarchyElementType(const ::zserio::vector<::nds::name::types::AdminHierarchyElementType>& adminHierarchyElementType_);
    void setAdminHierarchyElementType(::zserio::vector<::nds::name::types::AdminHierarchyElementType>&& adminHierarchyElementType_);
    bool isAdminHierarchyElementTypeUsed() const;
    bool isAdminHierarchyElementTypeSet() const;
    void resetAdminHierarchyElementType();

    ::nds::name::types::AddressFormatId getAddressFormatId() const;
    void setAddressFormatId(::nds::name::types::AddressFormatId addressFormatId_);
    bool isAddressFormatIdUsed() const;
    bool isAddressFormatIdSet() const;
    void resetAddressFormatId();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AddressSearchFilter& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    using ZserioArrayType_adminHierarchyElementType = ::zserio::Array<::zserio::vector<::nds::name::types::AdminHierarchyElementType>, ::zserio::EnumArrayTraits<::nds::name::types::AdminHierarchyElementType>, ::zserio::ArrayType::AUTO>;

    ::nds::name::metadata::AddressSearchFilterOptions readFilterOptions(::zserio::BitStreamReader& in);
    ::nds::name::metadata::AddressSearchFilterOptions readFilterOptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminHierarchyElementType> readAdminHierarchyElementType(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminHierarchyElementType> readAdminHierarchyElementType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::types::AddressFormatId> readAddressFormatId(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::name::types::AddressFormatId> readAddressFormatId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::name::metadata::AddressSearchFilterOptions m_filterOptions_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminHierarchyElementType> m_adminHierarchyElementType_;
    ::zserio::InplaceOptionalHolder<::nds::name::types::AddressFormatId> m_addressFormatId_;
};

} // namespace metadata
} // namespace name
} // namespace nds

#endif // NDS_NAME_METADATA_ADDRESS_SEARCH_FILTER_H