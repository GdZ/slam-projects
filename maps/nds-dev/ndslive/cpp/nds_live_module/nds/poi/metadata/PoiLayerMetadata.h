/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_METADATA_POI_LAYER_METADATA_H
#define NDS_POI_METADATA_POI_LAYER_METADATA_H

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

#include <nds/core/language/AvailableLanguages.h>
#include <nds/core/types/ScaleRangeList.h>
#include <nds/poi/metadata/PoiCategory.h>

namespace nds
{
namespace poi
{
namespace metadata
{

class PoiLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::types::ScaleRangeList::ZserioPackingContext& getScales()
        {
            return m_scales_;
        }

        ::nds::core::language::AvailableLanguages::ZserioPackingContext& getAvailableLanguages()
        {
            return m_availableLanguages_;
        }

    private:
        ::nds::core::types::ScaleRangeList::ZserioPackingContext m_scales_;
        ::nds::core::language::AvailableLanguages::ZserioPackingContext m_availableLanguages_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiLayerMetadata() noexcept :
            PoiLayerMetadata(allocator_type())
    {}

    explicit PoiLayerMetadata(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_categories = ::zserio::vector<::nds::poi::metadata::PoiCategory>,
            typename ZSERIO_T_scales = ::nds::core::types::ScaleRangeList,
            typename ZSERIO_T_availableLanguages = ::nds::core::language::AvailableLanguages,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_categories, PoiLayerMetadata, allocator_type> = 0>
    PoiLayerMetadata(
            ZSERIO_T_categories&& categories_,
            ZSERIO_T_scales&& scales_,
            ZSERIO_T_availableLanguages&& availableLanguages_,
            bool globalIconSetReferences_,
            const allocator_type& allocator = allocator_type()) :
            PoiLayerMetadata(allocator)
    {
        m_categories_ = ZserioArrayType_categories(::std::forward<ZSERIO_T_categories>(categories_));
        m_scales_ = ::std::forward<ZSERIO_T_scales>(scales_);
        m_availableLanguages_ = ::std::forward<ZSERIO_T_availableLanguages>(availableLanguages_);
        m_globalIconSetReferences_ = globalIconSetReferences_;
    }

    explicit PoiLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PoiLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PoiLayerMetadata() = default;

    PoiLayerMetadata(const PoiLayerMetadata&) = default;
    PoiLayerMetadata& operator=(const PoiLayerMetadata&) = default;

    PoiLayerMetadata(PoiLayerMetadata&&) = default;
    PoiLayerMetadata& operator=(PoiLayerMetadata&&) = default;

    PoiLayerMetadata(::zserio::PropagateAllocatorT,
            const PoiLayerMetadata& other, const allocator_type& allocator);

    const ::zserio::vector<::nds::poi::metadata::PoiCategory>& getCategories() const;
    ::zserio::vector<::nds::poi::metadata::PoiCategory>& getCategories();
    void setCategories(const ::zserio::vector<::nds::poi::metadata::PoiCategory>& categories_);
    void setCategories(::zserio::vector<::nds::poi::metadata::PoiCategory>&& categories_);

    const ::nds::core::types::ScaleRangeList& getScales() const;
    ::nds::core::types::ScaleRangeList& getScales();
    void setScales(const ::nds::core::types::ScaleRangeList& scales_);
    void setScales(::nds::core::types::ScaleRangeList&& scales_);

    const ::nds::core::language::AvailableLanguages& getAvailableLanguages() const;
    ::nds::core::language::AvailableLanguages& getAvailableLanguages();
    void setAvailableLanguages(const ::nds::core::language::AvailableLanguages& availableLanguages_);
    void setAvailableLanguages(::nds::core::language::AvailableLanguages&& availableLanguages_);

    bool getGlobalIconSetReferences() const;
    void setGlobalIconSetReferences(bool globalIconSetReferences_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_categories
    {
    public:
        using OwnerType = PoiLayerMetadata;

        static void create(PoiLayerMetadata& owner,
                ::zserio::vector<::nds::poi::metadata::PoiCategory>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiLayerMetadata& owner,
                ::zserio::vector<::nds::poi::metadata::PoiCategory>& array,
                ::nds::poi::metadata::PoiCategory::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_categories = ::zserio::Array<::zserio::vector<::nds::poi::metadata::PoiCategory>, ::zserio::ObjectArrayTraits<::nds::poi::metadata::PoiCategory, ZserioElementFactory_categories>, ::zserio::ArrayType::AUTO>;

    ZserioArrayType_categories readCategories(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_categories readCategories(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::types::ScaleRangeList readScales(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::ScaleRangeList readScales(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::language::AvailableLanguages readAvailableLanguages(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    bool readGlobalIconSetReferences(::zserio::BitStreamReader& in);

    ZserioArrayType_categories m_categories_;
    ::nds::core::types::ScaleRangeList m_scales_;
    ::nds::core::language::AvailableLanguages m_availableLanguages_;
    bool m_globalIconSetReferences_;
};

} // namespace metadata
} // namespace poi
} // namespace nds

#endif // NDS_POI_METADATA_POI_LAYER_METADATA_H
