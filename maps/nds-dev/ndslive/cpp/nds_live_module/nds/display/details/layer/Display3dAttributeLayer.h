/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_DETAILS_LAYER_DISPLAY3D_ATTRIBUTE_LAYER_H
#define NDS_DISPLAY_DETAILS_LAYER_DISPLAY3D_ATTRIBUTE_LAYER_H

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
#include <nds/display/details/instantiations/Display3dMeshAttributeMapList.h>
#include <nds/display/details/instantiations/Display3dMeshAttributeSetList.h>
#include <nds/display/details/metadata/Display3dAttributeLayerContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace display
{
namespace details
{
namespace layer
{

class Display3dAttributeLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::display::details::instantiations::Display3dMeshAttributeMapList::ZserioPackingContext& getDisplay3dMeshAttributeMaps()
        {
            return m_display3dMeshAttributeMaps_;
        }

        ::nds::display::details::instantiations::Display3dMeshAttributeSetList::ZserioPackingContext& getDisplay3dMeshAttributeSets()
        {
            return m_display3dMeshAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::display::details::instantiations::Display3dMeshAttributeMapList::ZserioPackingContext m_display3dMeshAttributeMaps_;
        ::nds::display::details::instantiations::Display3dMeshAttributeSetList::ZserioPackingContext m_display3dMeshAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Display3dAttributeLayer() noexcept :
            Display3dAttributeLayer(allocator_type())
    {}

    explicit Display3dAttributeLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_display3dMeshAttributeMaps = ::nds::display::details::instantiations::Display3dMeshAttributeMapList,
            typename ZSERIO_T_display3dMeshAttributeSets = ::nds::display::details::instantiations::Display3dMeshAttributeSetList>
    Display3dAttributeLayer(
            ::nds::display::details::metadata::Display3dAttributeLayerContent content_,
            ZSERIO_T_display3dMeshAttributeMaps&& display3dMeshAttributeMaps_,
            ZSERIO_T_display3dMeshAttributeSets&& display3dMeshAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            Display3dAttributeLayer(allocator)
    {
        m_content_ = content_;
        m_display3dMeshAttributeMaps_ = ::std::forward<ZSERIO_T_display3dMeshAttributeMaps>(display3dMeshAttributeMaps_);
        m_display3dMeshAttributeSets_ = ::std::forward<ZSERIO_T_display3dMeshAttributeSets>(display3dMeshAttributeSets_);
    }

    explicit Display3dAttributeLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Display3dAttributeLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Display3dAttributeLayer() = default;

    Display3dAttributeLayer(const Display3dAttributeLayer& other);
    Display3dAttributeLayer& operator=(const Display3dAttributeLayer& other);

    Display3dAttributeLayer(Display3dAttributeLayer&& other);
    Display3dAttributeLayer& operator=(Display3dAttributeLayer&& other);

    Display3dAttributeLayer(::zserio::PropagateAllocatorT,
            const Display3dAttributeLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::display::details::metadata::Display3dAttributeLayerContent getContent() const;
    void setContent(::nds::display::details::metadata::Display3dAttributeLayerContent content_);

    const ::nds::display::details::instantiations::Display3dMeshAttributeMapList& getDisplay3dMeshAttributeMaps() const;
    ::nds::display::details::instantiations::Display3dMeshAttributeMapList& getDisplay3dMeshAttributeMaps();
    void setDisplay3dMeshAttributeMaps(const ::nds::display::details::instantiations::Display3dMeshAttributeMapList& display3dMeshAttributeMaps_);
    void setDisplay3dMeshAttributeMaps(::nds::display::details::instantiations::Display3dMeshAttributeMapList&& display3dMeshAttributeMaps_);
    bool isDisplay3dMeshAttributeMapsUsed() const;
    bool isDisplay3dMeshAttributeMapsSet() const;
    void resetDisplay3dMeshAttributeMaps();

    const ::nds::display::details::instantiations::Display3dMeshAttributeSetList& getDisplay3dMeshAttributeSets() const;
    ::nds::display::details::instantiations::Display3dMeshAttributeSetList& getDisplay3dMeshAttributeSets();
    void setDisplay3dMeshAttributeSets(const ::nds::display::details::instantiations::Display3dMeshAttributeSetList& display3dMeshAttributeSets_);
    void setDisplay3dMeshAttributeSets(::nds::display::details::instantiations::Display3dMeshAttributeSetList&& display3dMeshAttributeSets_);
    bool isDisplay3dMeshAttributeSetsUsed() const;
    bool isDisplay3dMeshAttributeSetsSet() const;
    void resetDisplay3dMeshAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Display3dAttributeLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::display::details::metadata::Display3dAttributeLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::display::details::metadata::Display3dAttributeLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::Display3dMeshAttributeMapList> readDisplay3dMeshAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::Display3dMeshAttributeMapList> readDisplay3dMeshAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::Display3dMeshAttributeSetList> readDisplay3dMeshAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::Display3dMeshAttributeSetList> readDisplay3dMeshAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::display::details::metadata::Display3dAttributeLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::Display3dMeshAttributeMapList> m_display3dMeshAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::display::details::instantiations::Display3dMeshAttributeSetList> m_display3dMeshAttributeSets_;
};

} // namespace layer
} // namespace details
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_DETAILS_LAYER_DISPLAY3D_ATTRIBUTE_LAYER_H
