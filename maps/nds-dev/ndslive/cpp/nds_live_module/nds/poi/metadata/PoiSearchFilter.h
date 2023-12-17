/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_METADATA_POI_SEARCH_FILTER_H
#define NDS_POI_METADATA_POI_SEARCH_FILTER_H

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

#include <nds/poi/instantiations/PoiFullAttribute.h>
#include <nds/poi/metadata/PoiSearchFilterOptions.h>
#include <nds/poi/reference/types/PoiCategoryId.h>

namespace nds
{
namespace poi
{
namespace metadata
{

class PoiSearchFilter
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getFilterOptions()
        {
            return m_filterOptions_;
        }

    private:
        ::zserio::DeltaContext m_filterOptions_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiSearchFilter() noexcept :
            PoiSearchFilter(allocator_type())
    {}

    explicit PoiSearchFilter(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_filterCategories = ::zserio::vector<::nds::poi::reference::types::PoiCategoryId>,
            typename ZSERIO_T_filterAttributes = ::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>>
    PoiSearchFilter(
            ::nds::poi::metadata::PoiSearchFilterOptions filterOptions_,
            ZSERIO_T_filterCategories&& filterCategories_,
            ZSERIO_T_filterAttributes&& filterAttributes_,
            const allocator_type& allocator = allocator_type()) :
            PoiSearchFilter(allocator)
    {
        m_filterOptions_ = filterOptions_;
        m_filterCategories_ = ::zserio::createOptionalArray<ZserioArrayType_filterCategories>(::std::forward<ZSERIO_T_filterCategories>(filterCategories_));
        m_filterAttributes_ = ::zserio::createOptionalArray<ZserioArrayType_filterAttributes>(::std::forward<ZSERIO_T_filterAttributes>(filterAttributes_));
    }

    explicit PoiSearchFilter(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PoiSearchFilter(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PoiSearchFilter() = default;

    PoiSearchFilter(const PoiSearchFilter&) = default;
    PoiSearchFilter& operator=(const PoiSearchFilter&) = default;

    PoiSearchFilter(PoiSearchFilter&&) = default;
    PoiSearchFilter& operator=(PoiSearchFilter&&) = default;

    PoiSearchFilter(::zserio::PropagateAllocatorT,
            const PoiSearchFilter& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::poi::metadata::PoiSearchFilterOptions getFilterOptions() const;
    void setFilterOptions(::nds::poi::metadata::PoiSearchFilterOptions filterOptions_);

    const ::zserio::vector<::nds::poi::reference::types::PoiCategoryId>& getFilterCategories() const;
    ::zserio::vector<::nds::poi::reference::types::PoiCategoryId>& getFilterCategories();
    void setFilterCategories(const ::zserio::vector<::nds::poi::reference::types::PoiCategoryId>& filterCategories_);
    void setFilterCategories(::zserio::vector<::nds::poi::reference::types::PoiCategoryId>&& filterCategories_);
    bool isFilterCategoriesUsed() const;
    bool isFilterCategoriesSet() const;
    void resetFilterCategories();

    const ::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>& getFilterAttributes() const;
    ::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>& getFilterAttributes();
    void setFilterAttributes(const ::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>& filterAttributes_);
    void setFilterAttributes(::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>&& filterAttributes_);
    bool isFilterAttributesUsed() const;
    bool isFilterAttributesSet() const;
    void resetFilterAttributes();

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiSearchFilter& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_filterAttributes
    {
    public:
        using OwnerType = PoiSearchFilter;

        static void initializeElement(PoiSearchFilter& owner,
                ::nds::poi::instantiations::PoiFullAttribute& element, size_t index);
    };

    class ZserioElementFactory_filterAttributes
    {
    public:
        using OwnerType = PoiSearchFilter;

        static void create(PoiSearchFilter& owner,
                ::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiSearchFilter& owner,
                ::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>& array,
                ::nds::poi::instantiations::PoiFullAttribute::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_filterCategories = ::zserio::Array<::zserio::vector<::nds::poi::reference::types::PoiCategoryId>, ::zserio::VarIntNNArrayTraits<::nds::poi::reference::types::PoiCategoryId>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_filterAttributes = ::zserio::Array<::zserio::vector<::nds::poi::instantiations::PoiFullAttribute>, ::zserio::ObjectArrayTraits<::nds::poi::instantiations::PoiFullAttribute, ZserioElementFactory_filterAttributes>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_filterAttributes>;

    ::nds::poi::metadata::PoiSearchFilterOptions readFilterOptions(::zserio::BitStreamReader& in);
    ::nds::poi::metadata::PoiSearchFilterOptions readFilterOptions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_filterCategories> readFilterCategories(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_filterCategories> readFilterCategories(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_filterAttributes> readFilterAttributes(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_filterAttributes> readFilterAttributes(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ::nds::poi::metadata::PoiSearchFilterOptions m_filterOptions_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_filterCategories> m_filterCategories_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_filterAttributes> m_filterAttributes_;
};

} // namespace metadata
} // namespace poi
} // namespace nds

#endif // NDS_POI_METADATA_POI_SEARCH_FILTER_H