/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_DISPLAY_LAYER_DISPLAY2_DLAYER_H
#define NDS_DISPLAY_LAYER_DISPLAY2_DLAYER_H

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

#include <nds/display/layer/Display2DGeometryLayerList.h>
#include <nds/display/layer/Display2DLayerHeader.h>
#include <nds/display/metadata/Display2DContent.h>
#include <nds/display/types/ClippingEdgeList.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace display
{
namespace layer
{

class Display2DLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::display::layer::Display2DLayerHeader::ZserioPackingContext& getHeader()
        {
            return m_header_;
        }

        ::nds::display::layer::Display2DGeometryLayerList::ZserioPackingContext& getGeometryLayers()
        {
            return m_geometryLayers_;
        }

        ::nds::display::types::ClippingEdgeList::ZserioPackingContext& getClippingEdgeList()
        {
            return m_clippingEdgeList_;
        }

    private:
        ::nds::display::layer::Display2DLayerHeader::ZserioPackingContext m_header_;
        ::nds::display::layer::Display2DGeometryLayerList::ZserioPackingContext m_geometryLayers_;
        ::nds::display::types::ClippingEdgeList::ZserioPackingContext m_clippingEdgeList_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    Display2DLayer() noexcept :
            Display2DLayer(allocator_type())
    {}

    explicit Display2DLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_header = ::nds::display::layer::Display2DLayerHeader,
            typename ZSERIO_T_geometryLayers = ::nds::display::layer::Display2DGeometryLayerList,
            typename ZSERIO_T_scaleSublevelLayers = ::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>,
            typename ZSERIO_T_clippingEdgeList = ::nds::display::types::ClippingEdgeList,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_header, Display2DLayer, allocator_type> = 0>
    Display2DLayer(
            ZSERIO_T_header&& header_,
            ZSERIO_T_geometryLayers&& geometryLayers_,
            ZSERIO_T_scaleSublevelLayers&& scaleSublevelLayers_,
            ZSERIO_T_clippingEdgeList&& clippingEdgeList_,
            const allocator_type& allocator = allocator_type()) :
            Display2DLayer(allocator)
    {
        m_header_ = ::std::forward<ZSERIO_T_header>(header_);
        m_geometryLayers_ = ::std::forward<ZSERIO_T_geometryLayers>(geometryLayers_);
        m_scaleSublevelLayers_ = ::zserio::createOptionalArray<ZserioArrayType_scaleSublevelLayers>(::std::forward<ZSERIO_T_scaleSublevelLayers>(scaleSublevelLayers_));
        m_clippingEdgeList_ = ::std::forward<ZSERIO_T_clippingEdgeList>(clippingEdgeList_);
    }

    explicit Display2DLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit Display2DLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~Display2DLayer() = default;

    Display2DLayer(const Display2DLayer& other);
    Display2DLayer& operator=(const Display2DLayer& other);

    Display2DLayer(Display2DLayer&& other);
    Display2DLayer& operator=(Display2DLayer&& other);

    Display2DLayer(::zserio::PropagateAllocatorT,
            const Display2DLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::display::layer::Display2DLayerHeader& getHeader() const;
    ::nds::display::layer::Display2DLayerHeader& getHeader();
    void setHeader(const ::nds::display::layer::Display2DLayerHeader& header_);
    void setHeader(::nds::display::layer::Display2DLayerHeader&& header_);

    const ::nds::display::layer::Display2DGeometryLayerList& getGeometryLayers() const;
    ::nds::display::layer::Display2DGeometryLayerList& getGeometryLayers();
    void setGeometryLayers(const ::nds::display::layer::Display2DGeometryLayerList& geometryLayers_);
    void setGeometryLayers(::nds::display::layer::Display2DGeometryLayerList&& geometryLayers_);
    bool isGeometryLayersUsed() const;
    bool isGeometryLayersSet() const;
    void resetGeometryLayers();

    const ::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>& getScaleSublevelLayers() const;
    ::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>& getScaleSublevelLayers();
    void setScaleSublevelLayers(const ::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>& scaleSublevelLayers_);
    void setScaleSublevelLayers(::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>&& scaleSublevelLayers_);
    bool isScaleSublevelLayersUsed() const;
    bool isScaleSublevelLayersSet() const;
    void resetScaleSublevelLayers();

    const ::nds::display::types::ClippingEdgeList& getClippingEdgeList() const;
    ::nds::display::types::ClippingEdgeList& getClippingEdgeList();
    void setClippingEdgeList(const ::nds::display::types::ClippingEdgeList& clippingEdgeList_);
    void setClippingEdgeList(::nds::display::types::ClippingEdgeList&& clippingEdgeList_);
    bool isClippingEdgeListUsed() const;
    bool isClippingEdgeListSet() const;
    void resetClippingEdgeList();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const Display2DLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_scaleSublevelLayers
    {
    public:
        using OwnerType = Display2DLayer;

        static void initializeElement(Display2DLayer& owner,
                ::nds::display::layer::Display2DGeometryLayerList& element, size_t index);
    };

    class ZserioElementFactory_scaleSublevelLayers
    {
    public:
        using OwnerType = Display2DLayer;

        static void create(Display2DLayer& owner,
                ::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(Display2DLayer& owner,
                ::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>& array,
                ::nds::display::layer::Display2DGeometryLayerList::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_scaleSublevelLayers = ::zserio::Array<::zserio::vector<::nds::display::layer::Display2DGeometryLayerList>, ::zserio::ObjectArrayTraits<::nds::display::layer::Display2DGeometryLayerList, ZserioElementFactory_scaleSublevelLayers>, ::zserio::ArrayType::NORMAL, ZserioArrayExpressions_scaleSublevelLayers>;

    ::nds::display::layer::Display2DLayerHeader readHeader(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::display::layer::Display2DLayerHeader readHeader(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::layer::Display2DGeometryLayerList> readGeometryLayers(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::layer::Display2DGeometryLayerList> readGeometryLayers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_scaleSublevelLayers> readScaleSublevelLayers(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<ZserioArrayType_scaleSublevelLayers> readScaleSublevelLayers(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::types::ClippingEdgeList> readClippingEdgeList(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::display::types::ClippingEdgeList> readClippingEdgeList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::display::layer::Display2DLayerHeader m_header_;
    ::zserio::InplaceOptionalHolder<::nds::display::layer::Display2DGeometryLayerList> m_geometryLayers_;
    ::zserio::InplaceOptionalHolder<ZserioArrayType_scaleSublevelLayers> m_scaleSublevelLayers_;
    ::zserio::InplaceOptionalHolder<::nds::display::types::ClippingEdgeList> m_clippingEdgeList_;
};

} // namespace layer
} // namespace display
} // namespace nds

#endif // NDS_DISPLAY_LAYER_DISPLAY2_DLAYER_H
