/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_LAYER_POI_ATTRIBUTE_LAYER_INDIRECT_H
#define NDS_POI_LAYER_POI_ATTRIBUTE_LAYER_INDIRECT_H

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

#include <nds/core/geometry/CoordShift.h>
#include <nds/poi/instantiations/PoiIndirectAttributeMapList.h>
#include <nds/poi/instantiations/PoiIndirectAttributeSetList.h>
#include <nds/poi/metadata/PoiAttributeLayerContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace poi
{
namespace layer
{

class PoiAttributeLayerIndirect
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::poi::instantiations::PoiIndirectAttributeMapList::ZserioPackingContext& getPoiAttributeMaps()
        {
            return m_poiAttributeMaps_;
        }

        ::nds::poi::instantiations::PoiIndirectAttributeSetList::ZserioPackingContext& getPoiAttributeSets()
        {
            return m_poiAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::poi::instantiations::PoiIndirectAttributeMapList::ZserioPackingContext m_poiAttributeMaps_;
        ::nds::poi::instantiations::PoiIndirectAttributeSetList::ZserioPackingContext m_poiAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiAttributeLayerIndirect() noexcept :
            PoiAttributeLayerIndirect(allocator_type())
    {}

    explicit PoiAttributeLayerIndirect(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_poiAttributeMaps = ::nds::poi::instantiations::PoiIndirectAttributeMapList,
            typename ZSERIO_T_poiAttributeSets = ::nds::poi::instantiations::PoiIndirectAttributeSetList>
    PoiAttributeLayerIndirect(
            ::nds::poi::metadata::PoiAttributeLayerContent content_,
            ZSERIO_T_poiAttributeMaps&& poiAttributeMaps_,
            ZSERIO_T_poiAttributeSets&& poiAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            PoiAttributeLayerIndirect(allocator)
    {
        m_content_ = content_;
        m_poiAttributeMaps_ = ::std::forward<ZSERIO_T_poiAttributeMaps>(poiAttributeMaps_);
        m_poiAttributeSets_ = ::std::forward<ZSERIO_T_poiAttributeSets>(poiAttributeSets_);
    }

    explicit PoiAttributeLayerIndirect(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PoiAttributeLayerIndirect(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PoiAttributeLayerIndirect() = default;

    PoiAttributeLayerIndirect(const PoiAttributeLayerIndirect& other);
    PoiAttributeLayerIndirect& operator=(const PoiAttributeLayerIndirect& other);

    PoiAttributeLayerIndirect(PoiAttributeLayerIndirect&& other);
    PoiAttributeLayerIndirect& operator=(PoiAttributeLayerIndirect&& other);

    PoiAttributeLayerIndirect(::zserio::PropagateAllocatorT,
            const PoiAttributeLayerIndirect& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::poi::metadata::PoiAttributeLayerContent getContent() const;
    void setContent(::nds::poi::metadata::PoiAttributeLayerContent content_);

    const ::nds::poi::instantiations::PoiIndirectAttributeMapList& getPoiAttributeMaps() const;
    ::nds::poi::instantiations::PoiIndirectAttributeMapList& getPoiAttributeMaps();
    void setPoiAttributeMaps(const ::nds::poi::instantiations::PoiIndirectAttributeMapList& poiAttributeMaps_);
    void setPoiAttributeMaps(::nds::poi::instantiations::PoiIndirectAttributeMapList&& poiAttributeMaps_);
    bool isPoiAttributeMapsUsed() const;
    bool isPoiAttributeMapsSet() const;
    void resetPoiAttributeMaps();

    const ::nds::poi::instantiations::PoiIndirectAttributeSetList& getPoiAttributeSets() const;
    ::nds::poi::instantiations::PoiIndirectAttributeSetList& getPoiAttributeSets();
    void setPoiAttributeSets(const ::nds::poi::instantiations::PoiIndirectAttributeSetList& poiAttributeSets_);
    void setPoiAttributeSets(::nds::poi::instantiations::PoiIndirectAttributeSetList&& poiAttributeSets_);
    bool isPoiAttributeSetsUsed() const;
    bool isPoiAttributeSetsSet() const;
    void resetPoiAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiAttributeLayerIndirect& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::poi::metadata::PoiAttributeLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::poi::metadata::PoiAttributeLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::poi::instantiations::PoiIndirectAttributeMapList> readPoiAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::poi::instantiations::PoiIndirectAttributeMapList> readPoiAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::poi::instantiations::PoiIndirectAttributeSetList> readPoiAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::poi::instantiations::PoiIndirectAttributeSetList> readPoiAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::poi::metadata::PoiAttributeLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::poi::instantiations::PoiIndirectAttributeMapList> m_poiAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::poi::instantiations::PoiIndirectAttributeSetList> m_poiAttributeSets_;
};

} // namespace layer
} // namespace poi
} // namespace nds

#endif // NDS_POI_LAYER_POI_ATTRIBUTE_LAYER_INDIRECT_H
