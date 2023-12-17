/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_POI_LAYER_POI_LAYER_H
#define NDS_POI_LAYER_POI_LAYER_H

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

#include <nds/poi/poi/Poi.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace poi
{
namespace layer
{

class PoiLayer
{
public:
    class ZserioPackingContext
    {
    };

    using allocator_type = ::std::allocator<uint8_t>;

    PoiLayer() noexcept :
            PoiLayer(allocator_type())
    {}

    explicit PoiLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_poiList = ::zserio::vector<::nds::poi::poi::Poi>,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_poiList, PoiLayer, allocator_type> = 0>
    explicit PoiLayer(
            ZSERIO_T_poiList&& poiList_,
            const allocator_type& allocator = allocator_type()) :
            PoiLayer(allocator)
    {
        m_poiList_ = ZserioArrayType_poiList(::std::forward<ZSERIO_T_poiList>(poiList_));
    }

    explicit PoiLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit PoiLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~PoiLayer() = default;

    PoiLayer(const PoiLayer&) = default;
    PoiLayer& operator=(const PoiLayer&) = default;

    PoiLayer(PoiLayer&&) = default;
    PoiLayer& operator=(PoiLayer&&) = default;

    PoiLayer(::zserio::PropagateAllocatorT,
            const PoiLayer& other, const allocator_type& allocator);

    void initializeChildren();

    const ::zserio::vector<::nds::poi::poi::Poi>& getPoiList() const;
    ::zserio::vector<::nds::poi::poi::Poi>& getPoiList();
    void setPoiList(const ::zserio::vector<::nds::poi::poi::Poi>& poiList_);
    void setPoiList(::zserio::vector<::nds::poi::poi::Poi>&& poiList_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const PoiLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    class ZserioArrayExpressions_poiList
    {
    public:
        using OwnerType = PoiLayer;

        static void initializeElement(PoiLayer& owner,
                ::nds::poi::poi::Poi& element, size_t index);
    };

    class ZserioElementFactory_poiList
    {
    public:
        using OwnerType = PoiLayer;

        static void create(PoiLayer& owner,
                ::zserio::vector<::nds::poi::poi::Poi>& array,
                ::zserio::BitStreamReader& in, size_t index);

        static void create(PoiLayer& owner,
                ::zserio::vector<::nds::poi::poi::Poi>& array,
                ::nds::poi::poi::Poi::ZserioPackingContext& context,
                ::zserio::BitStreamReader& in, size_t index);
    };

    using ZserioArrayType_poiList = ::zserio::Array<::zserio::vector<::nds::poi::poi::Poi>, ::zserio::ObjectArrayTraits<::nds::poi::poi::Poi, ZserioElementFactory_poiList>, ::zserio::ArrayType::AUTO, ZserioArrayExpressions_poiList>;

    ZserioArrayType_poiList readPoiList(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ZserioArrayType_poiList readPoiList(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    ZserioArrayType_poiList m_poiList_;
};

} // namespace layer
} // namespace poi
} // namespace nds

#endif // NDS_POI_LAYER_POI_LAYER_H