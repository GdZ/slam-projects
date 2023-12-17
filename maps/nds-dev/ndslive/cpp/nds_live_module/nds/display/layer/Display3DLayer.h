/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_LAYER_DISPLAY3_DLAYER_H
#define NDS_DISPLAY_LAYER_DISPLAY3_DLAYER_H

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
#include <zserio/ArrayTraits.h>

#include <nds/display/layer/Display3DGeometryLayerList.h>
#include <nds/display/layer/Display3DLayerHeader.h>
#include <nds/display/metadata/Display3DContent.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace display
{
namespace layer
{

class Display3DLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::display::layer::Display3DLayerHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

        ::nds::display::layer::Display3DGeometryLayerList::ZserioPackingContext& getGeometryLayers()
        {
            return m_geometryLayers_;
        }

    private:
        ::nds::display::layer::Display3DLayerHeader::ZserioPackingContext m_header_;
        ::nds::display::layer::Display3DGeometryLayerList::ZserioPackingContext m_geometryLayers_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Display3DLayer() noexcept :
            Display3DLayer(allocator_type())
    {}

    explicit Display3DLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::display::layer::Display3DLayerHeader,
            typename ZSERIO_T_geometryLayers = ::nds::display::layer::Display3DGeometryLayerList,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_header, Display3DLayer, allocator_type> = 0>
    Display3DLayer(
            ZSERIO_T_header&& header_,
            ZSERIO_T_geometryLayers&& geometryLayers_,
            const allocator_type& allocator = allocator_type()) :
            Display3DLayer(allocator)
    {
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_geometryLayers_ = ::std::forward<ZSERIO_T_geometryLayers>(geometryLayers_);
    }

    explicit Display3DLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Display3DLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Display3DLayer() = default;

    Display3DLayer(const Display3DLayer& other);
    Display3DLayer& operator=(const Display3DLayer& other);

    Display3DLayer(Display3DLayer&& other);
    Display3DLayer& operator=(Display3DLayer&& other);

    Display3DLayer(::zserio::PropagateAllocatorT,
            const Display3DLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::display::layer::Display3DLayerHeader& getHeader() const;
    ::nds::display::layer::Display3DLayerHeader& getHeader();
    void setHeader(const ::nds::display::layer::Display3DLayerHeader& header_);
    void setHeader(::nds::display::layer::Display3DLayerHeader&& header_);

    const ::nds::display::layer::Display3DGeometryLayerList& getGeometryLayers() const;
    ::nds::display::layer::Display3DGeometryLayerList& getGeometryLayers();
    void setGeometryLayers(const ::nds::display::layer::Display3DGeometryLayerList& geometryLayers_);
    void setGeometryLayers(::nds::display::layer::Display3DGeometryLayerList&& geometryLayers_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Display3DLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::display::layer::Display3DLayerHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::display::layer::Display3DLayerHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::display::layer::Display3DGeometryLayerList readGeometryLayers(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::display::layer::Display3DGeometryLayerList readGeometryLayers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::display::layer::Display3DLayerHeader m_header_;
    ::nds::display::layer::Display3DGeometryLayerList m_geometryLayers_;
};

} // namespace layer
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_LAYER_DISPLAY3_DLAYER_H
