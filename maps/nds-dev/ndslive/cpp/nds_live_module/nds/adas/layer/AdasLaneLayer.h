/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ADAS_LAYER_ADAS_LANE_LAYER_H
#define NDS_ADAS_LAYER_ADAS_LANE_LAYER_H

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

#include <nds/adas/instantiations/AdasLaneAttributeMapList.h>
#include <nds/adas/instantiations/AdasLaneAttributeSetList.h>
#include <nds/adas/metadata/AdasLaneLayerContent.h>
#include <nds/core/geometry/CoordShift.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace adas
{
namespace layer
{

class AdasLaneLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getContent()
        {
            return m_content_;
        }

        ::nds::adas::instantiations::AdasLaneAttributeMapList::ZserioPackingContext& getAdasLaneAttributeMaps()
        {
            return m_adasLaneAttributeMaps_;
        }

        ::nds::adas::instantiations::AdasLaneAttributeSetList::ZserioPackingContext& getAdasLaneAttributeSets()
        {
            return m_adasLaneAttributeSets_;
        }

    private:
        ::zserio::DeltaContext m_content_;
        ::nds::adas::instantiations::AdasLaneAttributeMapList::ZserioPackingContext m_adasLaneAttributeMaps_;
        ::nds::adas::instantiations::AdasLaneAttributeSetList::ZserioPackingContext m_adasLaneAttributeSets_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    AdasLaneLayer() noexcept :
            AdasLaneLayer(allocator_type())
    {}

    explicit AdasLaneLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_adasLaneAttributeMaps = ::nds::adas::instantiations::AdasLaneAttributeMapList,
            typename ZSERIO_T_adasLaneAttributeSets = ::nds::adas::instantiations::AdasLaneAttributeSetList>
    AdasLaneLayer(
            ::nds::adas::metadata::AdasLaneLayerContent content_,
            ZSERIO_T_adasLaneAttributeMaps&& adasLaneAttributeMaps_,
            ZSERIO_T_adasLaneAttributeSets&& adasLaneAttributeSets_,
            const allocator_type& allocator = allocator_type()) :
            AdasLaneLayer(allocator)
    {
        m_content_ = content_;
        m_adasLaneAttributeMaps_ = ::std::forward<ZSERIO_T_adasLaneAttributeMaps>(adasLaneAttributeMaps_);
        m_adasLaneAttributeSets_ = ::std::forward<ZSERIO_T_adasLaneAttributeSets>(adasLaneAttributeSets_);
    }

    explicit AdasLaneLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit AdasLaneLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~AdasLaneLayer() = default;

    AdasLaneLayer(const AdasLaneLayer& other);
    AdasLaneLayer& operator=(const AdasLaneLayer& other);

    AdasLaneLayer(AdasLaneLayer&& other);
    AdasLaneLayer& operator=(AdasLaneLayer&& other);

    AdasLaneLayer(::zserio::PropagateAllocatorT,
            const AdasLaneLayer& other, const allocator_type& allocator);

    void initializeChildren();

    ::nds::adas::metadata::AdasLaneLayerContent getContent() const;
    void setContent(::nds::adas::metadata::AdasLaneLayerContent content_);

    const ::nds::adas::instantiations::AdasLaneAttributeMapList& getAdasLaneAttributeMaps() const;
    ::nds::adas::instantiations::AdasLaneAttributeMapList& getAdasLaneAttributeMaps();
    void setAdasLaneAttributeMaps(const ::nds::adas::instantiations::AdasLaneAttributeMapList& adasLaneAttributeMaps_);
    void setAdasLaneAttributeMaps(::nds::adas::instantiations::AdasLaneAttributeMapList&& adasLaneAttributeMaps_);
    bool isAdasLaneAttributeMapsUsed() const;
    bool isAdasLaneAttributeMapsSet() const;
    void resetAdasLaneAttributeMaps();

    const ::nds::adas::instantiations::AdasLaneAttributeSetList& getAdasLaneAttributeSets() const;
    ::nds::adas::instantiations::AdasLaneAttributeSetList& getAdasLaneAttributeSets();
    void setAdasLaneAttributeSets(const ::nds::adas::instantiations::AdasLaneAttributeSetList& adasLaneAttributeSets_);
    void setAdasLaneAttributeSets(::nds::adas::instantiations::AdasLaneAttributeSetList&& adasLaneAttributeSets_);
    bool isAdasLaneAttributeSetsUsed() const;
    bool isAdasLaneAttributeSetsSet() const;
    void resetAdasLaneAttributeSets();

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const AdasLaneLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::adas::metadata::AdasLaneLayerContent readContent(::zserio::BitStreamReader& in);
    ::nds::adas::metadata::AdasLaneLayerContent readContent(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasLaneAttributeMapList> readAdasLaneAttributeMaps(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasLaneAttributeMapList> readAdasLaneAttributeMaps(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasLaneAttributeSetList> readAdasLaneAttributeSets(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasLaneAttributeSetList> readAdasLaneAttributeSets(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::adas::metadata::AdasLaneLayerContent m_content_;
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasLaneAttributeMapList> m_adasLaneAttributeMaps_;
    ::zserio::InplaceOptionalHolder<::nds::adas::instantiations::AdasLaneAttributeSetList> m_adasLaneAttributeSets_;
};

} // namespace layer
} // namespace adas
} // namespace nds

#endif // NDS_ADAS_LAYER_ADAS_LANE_LAYER_H
