/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_NAME_LAYER_DISPLAY_NAME_LAYER_H
#define NDS_NAME_LAYER_DISPLAY_NAME_LAYER_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/name/instantiations/NameDisplayAreaAttributeMapList.h>
#include <nds/name/instantiations/NameDisplayAreaAttributeSetList.h>
#include <nds/name/instantiations/NameDisplayLineRangeAttributeMapList.h>
#include <nds/name/instantiations/NameDisplayLineRangeAttributeSetList.h>
#include <nds/name/instantiations/NameDisplayPointAttributeMapList.h>
#include <nds/name/instantiations/NameDisplayPointAttributeSetList.h>
#include <nds/name/metadata/DisplayNameLayerContent.h>
#include <nds/name/types/AddressFormat.h>
#include <nds/name/types/AdministrativeHierarchyElement.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace name
{
namespace layer
{

class DisplayNameLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::zserio::DeltaContext& getShift()
        {
            return m_shift_;
        }

        ::nds::name::instantiations::NameDisplayLineRangeAttributeMapList::ZserioPackingContext& getDisplayLineRangeAttributeMaps()
        {
            return m_displayLineRangeAttributeMaps_;
        }

        ::nds::name::instantiations::NameDisplayAreaAttributeMapList::ZserioPackingContext& getDisplayAreaAttributeMaps()
        {
            return m_displayAreaAttributeMaps_;
        }

        ::nds::name::instantiations::NameDisplayPointAttributeMapList::ZserioPackingContext& getDisplayPointAttributeMaps()
        {
            return m_displayPointAttributeMaps_;
        }

        ::nds::name::instantiations::NameDisplayLineRangeAttributeSetList::ZserioPackingContext& getDisplayLineRangeAttributeSets()
        {
            return m_displayLineRangeAttributeSets_;
        }

        ::nds::name::instantiations::NameDisplayAreaAttributeSetList::ZserioPackingContext& getDisplayAreaAttributeSets()
        {
            return m_displayAreaAttributeSets_;
        }

        ::nds::name::instantiations::NameDisplayPointAttributeSetList::ZserioPackingContext& getDisplayPointAttributeSets()
        {
            return m_displayPointAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::zserio::DeltaContext m_shift_;
        ::nds::name::instantiations::NameDisplayLineRangeAttributeMapList::ZserioPackingContext m_displayLineRangeAttributeMaps_;
        ::nds::name::instantiations::NameDisplayAreaAttributeMapList::ZserioPackingContext m_displayAreaAttributeMaps_;
        ::nds::name::instantiations::NameDisplayPointAttributeMapList::ZserioPackingContext m_displayPointAttributeMaps_;
        ::nds::name::instantiations::NameDisplayLineRangeAttributeSetList::ZserioPackingContext m_displayLineRangeAttributeSets_;
        ::nds::name::instantiations::NameDisplayAreaAttributeSetList::ZserioPackingContext m_displayAreaAttributeSets_;
        ::nds::name::instantiations::NameDisplayPointAttributeSetList::ZserioPackingContext m_displayPointAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    DisplayNameLayer() noexcept :
            DisplayNameLayer(allocator_type())
    {}

    explicit DisplayNameLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_displayLineRangeAttributeMaps = ::nds::name::instantiations::NameDisplayLineRangeAttributeMapList,
            typename ZSERIO_T_displayAreaAttributeMaps = ::nds::name::instantiations::NameDisplayAreaAttributeMapList,
            typename ZSERIO_T_displayPointAttributeMaps = ::nds::name::instantiations::NameDisplayPointAttributeMapList,
            typename ZSERIO_T_displayLineRangeAttributeSets = ::nds::name::instantiations::NameDisplayLineRangeAttributeSetList,
            typename ZSERIO_T_displayAreaAttributeSets = ::nds::name::instantiations::NameDisplayAreaAttributeSetList,
            typename ZSERIO_T_displayPointAttributeSets = ::nds::name::instantiations::NameDisplayPointAttributeSetList,
            typename ZSERIO_T_adminHierarchyElementDefinitions = ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>,
            typename ZSERIO_T_addressFormats = ::zserio::vector<::nds::name::types::AddressFormat>>
    DisplayNameLayer(
            ::nds::name::metadata::DisplayNameLayerContent content_,
            ::nds::core::geometry::CoordShift shift_,
            ZSERIO_T_displayLineRangeAttributeMaps&& displayLineRangeAttributeMaps_,
            ZSERIO_T_displayAreaAttributeMaps&& displayAreaAttributeMaps_,
            ZSERIO_T_displayPointAttributeMaps&& displayPointAttributeMaps_,
            ZSERIO_T_displayLineRangeAttributeSets&& displayLineRangeAttributeSets_,
            ZSERIO_T_displayAreaAttributeSets&& displayAreaAttributeSets_,
            ZSERIO_T_displayPointAttributeSets&& displayPointAttributeSets_,
            ZSERIO_T_adminHierarchyElementDefinitions&& adminHierarchyElementDefinitions_,
            ZSERIO_T_addressFormats&& addressFormats_,
            const allocator_type& allocator = allocator_type()) :
            DisplayNameLayer(allocator)
    {
        m_content_ = content_;
        m_shift_ = shift_;
        m_displayLineRangeAttributeMaps_ = ::std::forward<ZSERIO_T_displayLineRangeAttributeMaps>(displayLineRangeAttributeMaps_);
        m_displayAreaAttributeMaps_ = ::std::forward<ZSERIO_T_displayAreaAttributeMaps>(displayAreaAttributeMaps_);
        m_displayPointAttributeMaps_ = ::std::forward<ZSERIO_T_displayPointAttributeMaps>(displayPointAttributeMaps_);
        m_displayLineRangeAttributeSets_ = ::std::forward<ZSERIO_T_displayLineRangeAttributeSets>(displayLineRangeAttributeSets_);
        m_displayAreaAttributeSets_ = ::std::forward<ZSERIO_T_displayAreaAttributeSets>(displayAreaAttributeSets_);
        m_displayPointAttributeSets_ = ::std::forward<ZSERIO_T_displayPointAttributeSets>(displayPointAttributeSets_);
        m_adminHierarchyElementDefinitions_ = ::zserio::createOptionalArray<ZserioArrayType_adminHierarchyElementDefinitions>(::std::forward<ZSERIO_T_adminHierarchyElementDefinitions>(adminHierarchyElementDefinitions_));
        m_addressFormats_ = ::zserio::createOptionalArray<ZserioArrayType_addressFormats>(::std::forward<ZSERIO_T_addressFormats>(addressFormats_));
    }

    explicit DisplayNameLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit DisplayNameLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~DisplayNameLayer() = default;

    DisplayNameLayer(const DisplayNameLayer& other);
    DisplayNameLayer& operator=(const DisplayNameLayer& other);

    DisplayNameLayer(DisplayNameLayer&& other);
    DisplayNameLayer& operator=(DisplayNameLayer&& other);

    DisplayNameLayer(::zserio::PropagateAllocatorT,
            const DisplayNameLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::name::metadata::DisplayNameLayerContent getContent() const;
    void setContent(::nds::name::metadata::DisplayNameLayerContent content_);

    ::nds::core::geometry::CoordShift getShift() const;
    void setShift(::nds::core::geometry::CoordShift shift_);

    const ::nds::name::instantiations::NameDisplayLineRangeAttributeMapList& getDisplayLineRangeAttributeMaps() const;
    ::nds::name::instantiations::NameDisplayLineRangeAttributeMapList& getDisplayLineRangeAttributeMaps();
    void setDisplayLineRangeAttributeMaps(const ::nds::name::instantiations::NameDisplayLineRangeAttributeMapList& displayLineRangeAttributeMaps_);
    void setDisplayLineRangeAttributeMaps(::nds::name::instantiations::NameDisplayLineRangeAttributeMapList&& displayLineRangeAttributeMaps_);
    bool isDisplayLineRangeAttributeMapsUsed() const;
    bool isDisplayLineRangeAttributeMapsSet() const;
    void resetDisplayLineRangeAttributeMaps();

    const ::nds::name::instantiations::NameDisplayAreaAttributeMapList& getDisplayAreaAttributeMaps() const;
    ::nds::name::instantiations::NameDisplayAreaAttributeMapList& getDisplayAreaAttributeMaps();
    void setDisplayAreaAttributeMaps(const ::nds::name::instantiations::NameDisplayAreaAttributeMapList& displayAreaAttributeMaps_);
    void setDisplayAreaAttributeMaps(::nds::name::instantiations::NameDisplayAreaAttributeMapList&& displayAreaAttributeMaps_);
    bool isDisplayAreaAttributeMapsUsed() const;
    bool isDisplayAreaAttributeMapsSet() const;
    void resetDisplayAreaAttributeMaps();

    const ::nds::name::instantiations::NameDisplayPointAttributeMapList& getDisplayPointAttributeMaps() const;
    ::nds::name::instantiations::NameDisplayPointAttributeMapList& getDisplayPointAttributeMaps();
    void setDisplayPointAttributeMaps(const ::nds::name::instantiations::NameDisplayPointAttributeMapList& displayPointAttributeMaps_);
    void setDisplayPointAttributeMaps(::nds::name::instantiations::NameDisplayPointAttributeMapList&& displayPointAttributeMaps_);
    bool isDisplayPointAttributeMapsUsed() const;
    bool isDisplayPointAttributeMapsSet() const;
    void resetDisplayPointAttributeMaps();

    const ::nds::name::instantiations::NameDisplayLineRangeAttributeSetList& getDisplayLineRangeAttributeSets() const;
    ::nds::name::instantiations::NameDisplayLineRangeAttributeSetList& getDisplayLineRangeAttributeSets();
    void setDisplayLineRangeAttributeSets(const ::nds::name::instantiations::NameDisplayLineRangeAttributeSetList& displayLineRangeAttributeSets_);
    void setDisplayLineRangeAttributeSets(::nds::name::instantiations::NameDisplayLineRangeAttributeSetList&& displayLineRangeAttributeSets_);
    bool isDisplayLineRangeAttributeSetsUsed() const;
    bool isDisplayLineRangeAttributeSetsSet() const;
    void resetDisplayLineRangeAttributeSets();

    const ::nds::name::instantiations::NameDisplayAreaAttributeSetList& getDisplayAreaAttributeSets() const;
    ::nds::name::instantiations::NameDisplayAreaAttributeSetList& getDisplayAreaAttributeSets();
    void setDisplayAreaAttributeSets(const ::nds::name::instantiations::NameDisplayAreaAttributeSetList& displayAreaAttributeSets_);
    void setDisplayAreaAttributeSets(::nds::name::instantiations::NameDisplayAreaAttributeSetList&& displayAreaAttributeSets_);
    bool isDisplayAreaAttributeSetsUsed() const;
    bool isDisplayAreaAttributeSetsSet() const;
    void resetDisplayAreaAttributeSets();

    const ::nds::name::instantiations::NameDisplayPointAttributeSetList& getDisplayPointAttributeSets() const;
    ::nds::name::instantiations::NameDisplayPointAttributeSetList& getDisplayPointAttributeSets();
    void setDisplayPointAttributeSets(const ::nds::name::instantiations::NameDisplayPointAttributeSetList& displayPointAttributeSets_);
    void setDisplayPointAttributeSets(::nds::name::instantiations::NameDisplayPointAttributeSetList&& displayPointAttributeSets_);
    bool isDisplayPointAttributeSetsUsed() const;
    bool isDisplayPointAttributeSetsSet() const;
    void resetDisplayPointAttributeSets();

    const ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& getAdminHierarchyElementDefinitions() const;
    ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& getAdminHierarchyElementDefinitions();
    void setAdminHierarchyElementDefinitions(const ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& adminHierarchyElementDefinitions_);
    void setAdminHierarchyElementDefinitions(::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>&& adminHierarchyElementDefinitions_);
    bool isAdminHierarchyElementDefinitionsUsed() const;
    bool isAdminHierarchyElementDefinitionsSet() const;
    void resetAdminHierarchyElementDefinitions();

    const ::zserio::vector<::nds::name::types::AddressFormat>& getAddressFormats() const;
    ::zserio::vector<::nds::name::types::AddressFormat>& getAddressFormats();
    void setAddressFormats(const ::zserio::vector<::nds::name::types::AddressFormat>& addressFormats_);
    void setAddressFormats(::zserio::vector<::nds::name::types::AddressFormat>&& addressFormats_);
    bool isAddressFormatsUsed() const;
    bool isAddressFormatsSet() const;
    void resetAddressFormats();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const DisplayNameLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioElementFactory_adminHierarchyElementDefinitions
    {
    public:
        using OwnerType = DisplayNameLayer;

        static void create(DisplayNameLayer& owner,
                ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayNameLayer& owner,
                ::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>& array,
                ::nds::name::types::AdministrativeHierarchyElement::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    class ZserioElementFactory_addressFormats
    {
    public:
        using OwnerType = DisplayNameLayer;

        static void create(DisplayNameLayer& owner,
                ::zserio::vector<::nds::name::types::AddressFormat>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(DisplayNameLayer& owner,
                ::zserio::vector<::nds::name::types::AddressFormat>& array,
                ::nds::name::types::AddressFormat::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_adminHierarchyElementDefinitions = ::zserio::Array<::zserio::vector<::nds::name::types::AdministrativeHierarchyElement>, ::zserio::ObjectArrayTraits<::nds::name::types::AdministrativeHierarchyElement, ZserioElementFactory_adminHierarchyElementDefinitions>, ::zserio::ArrayType::AUTO>;
    using ZserioArrayType_addressFormats = ::zserio::Array<::zserio::vector<::nds::name::types::AddressFormat>, ::zserio::ObjectArrayTraits<::nds::name::types::AddressFormat, ZserioElementFactory_addressFormats>, ::zserio::ArrayType::AUTO>;

    ::nds::name::metadata::DisplayNameLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::name::metadata::DisplayNameLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(::zserio::BitStreamReader& in);
    ::nds::core::geometry::CoordShift readShift(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeMapList> readDisplayLineRangeAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeMapList> readDisplayLineRangeAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeMapList> readDisplayAreaAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeMapList> readDisplayAreaAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeMapList> readDisplayPointAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeMapList> readDisplayPointAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeSetList> readDisplayLineRangeAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeSetList> readDisplayLineRangeAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeSetList> readDisplayAreaAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeSetList> readDisplayAreaAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeSetList> readDisplayPointAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeSetList> readDisplayPointAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminHierarchyElementDefinitions> readAdminHierarchyElementDefinitions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminHierarchyElementDefinitions> readAdminHierarchyElementDefinitions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_addressFormats> readAddressFormats(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_addressFormats> readAddressFormats(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::name::metadata::DisplayNameLayerContent m_content_;
    ::nds::core::geometry::CoordShift m_shift_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeMapList> m_displayLineRangeAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeMapList> m_displayAreaAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeMapList> m_displayPointAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayLineRangeAttributeSetList> m_displayLineRangeAttributeSets_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayAreaAttributeSetList> m_displayAreaAttributeSets_;
    ::zserio::InplaceOptionalHolder<::nds::name::instantiations::NameDisplayPointAttributeSetList> m_displayPointAttributeSets_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_adminHierarchyElementDefinitions> m_adminHierarchyElementDefinitions_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_addressFormats> m_addressFormats_;
};

} // namespace layer
} // namespace name
} // namespace nds

#endif // NDS_NAME_LAYER_DISPLAY_NAME_LAYER_H