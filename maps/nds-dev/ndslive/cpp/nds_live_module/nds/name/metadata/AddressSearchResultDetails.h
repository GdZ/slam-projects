/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_METADATA_ADDRESS_SEARCH_RESULT_DETAILS_H
#define NDS_NAME_METADATA_ADDRESS_SEARCH_RESULT_DETAILS_H

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

#include <nds/name/instantiations/NameRoadRangeFullAttribute.h>
#include <nds/name/metadata/AddressSearchResultDetailsContent.h>
#include <nds/name/types/AddressFormatId.h>
#include <nds/name/types/AdministrativeHierarchyElement.h>

namespace nds
{
namespace name
{
namespace metadata
{

class AddressSearchResultDetails
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::zserio::DeltaContext& getAddressFormatId()
        {
            return m_addressFormatId_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::zserio::DeltaContext m_addressFormatId_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AddressSearchResultDetails() noexcept :
            AddressSearchResultDetails(allocator_type())
    {}

    explicit AddressSearchResultDetails(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_nameAttributes = ::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>,
            typename ZSERIO_T_adminElements = ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>,
            typename ZSERIO_T_addressFormatId = ::nds::name::types::AddressFormatId>
    AddressSearchResultDetails(
            ::nds::name::metadata::AddressSearchResultDetailsContent content_,
            ZSERIO_T_nameAttributes&& nameAttributes_,
            ZSERIO_T_adminElements&& adminElements_,
            ZSERIO_T_addressFormatId&& addressFormatId_,
            const allocator_type& allocator = allocator_type()) :
            AddressSearchResultDetails(allocator)
    {
        m_content_ = content_;
        m_nameAttributes_ = ::zserio::createOptionalArray<ZserioArrayType_nameAttributes>(::std::forward<ZSERIO_T_nameAttributes>(nameAttributes_));
        m_adminElements_ = ::zserio::createOptionalArray<ZserioArrayType_adminElements>(::std::forward<ZSERIO_T_adminElements>(adminElements_));
        m_addressFormatId_ = ::std::forward<ZSERIO_T_addressFormatId>(addressFormatId_);
    }

    explicit AddressSearchResultDetails(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AddressSearchResultDetails(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AddressSearchResultDetails() = default;

    AddressSearchResultDetails(const AddressSearchResultDetails&) = default;
    AddressSearchResultDetails& operator=(const AddressSearchResultDetails&) = default;

    AddressSearchResultDetails(AddressSearchResultDetails&&) = default;
    AddressSearchResultDetails& operator=(AddressSearchResultDetails&&) = default;

    AddressSearchResultDetails(::zserio::PropagateAllocatorT,
            const AddressSearchResultDetails& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::name::metadata::AddressSearchResultDetailsContent getContent() const;
    void setContent(::nds::name::metadata::AddressSearchResultDetailsContent content_);

    const ::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>& getNameAttributes() const;
    ::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>& getNameAttributes();
    void setNameAttributes(const ::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>& nameAttributes_);
    void setNameAttributes(::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>&& nameAttributes_);
    bool isNameAttributesUsed() const;
    bool isNameAttributesSet() const;
    void resetNameAttributes();

    const ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& getAdminElements() const;
    ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& getAdminElements();
    void setAdminElements(const ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& adminElements_);
    void setAdminElements(::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>&& adminElements_);
    bool isAdminElementsUsed() const;
    bool isAdminElementsSet() const;
    void resetAdminElements();

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

    bool operator==(const AddressSearchResultDetails& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_nameAttributes
    {
    public:
        using OwnerType = AddressSearchResultDetails;

        static void initializeElement(AddressSearchResultDetails& owner,
                ::nds::name::instantiations::NameRoadRangeFullAttribute& element, size_t index);
    };

    class ZserioElementFactory_nameAttributes
    {
    public:
        using OwnerType = AddressSearchResultDetails;

        static void create(AddressSearchResultDetails& owner,
                ::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AddressSearchResultDetails& owner,
                ::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>& array,
                ::nds::name::instantiations::NameRoadRangeFullAttribute::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioElementFactory_adminElements
    {
    public:
        using OwnerType = AddressSearchResultDetails;

        static void create(AddressSearchResultDetails& owner,
                ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(AddressSearchResultDetails& owner,
                ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& array,
                ::nds::name::types::AdministrativeHierarchyElement::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_nameAttributes = ::zserio::Array<::zserio::vector<::nds::name::instantiations::NameRoadRangeFullAttribute>, ::zserio::ObjectArrayTraits<::nds::name::instantiations::NameRoadRangeFullAttribute, ZserioElementFactory_nameAttributes>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_nameAttributes>;
    using ZserioArrayType_adminElements = ::zserio::Array<::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>, ::zserio::ObjectArrayTraits<::nds::name::types::AdministrativeHierarchyElement, ZserioElementFactory_adminElements>, ::zserio::ArrayType::AUTO>;

    ::nds::name::metadata::AddressSearchResultDetailsContent readContent(::zserio::BitStreamReader& in);
    ::nds::name::metadata::AddressSearchResultDetailsContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_nameAttributes> readNameAttributes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_nameAttributes> readNameAttributes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminElements> readAdminElements(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminElements> readAdminElements(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::types::AddressFormatId> readAddressFormatId(::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::name::types::AddressFormatId> readAddressFormatId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::name::metadata::AddressSearchResultDetailsContent m_content_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_nameAttributes> m_nameAttributes_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminElements> m_adminElements_;
    ::zserio::InplaceOptionalHolder<::nds::name::types::AddressFormatId> m_addressFormatId_;
};

} // namespace metadata
} // namespace name
} // namespace nds

#endif // NDS_NAME_METADATA_ADDRESS_SEARCH_RESULT_DETAILS_H
