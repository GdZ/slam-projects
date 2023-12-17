/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LOCALIZATION_LAYER_OCCUPANCY_GRID_LAYER_H
#define NDS_LOCALIZATION_LAYER_OCCUPANCY_GRID_LAYER_H

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

#include <nds/localization/instantiations/OccupancyProbabilityGridLayer.h>
#include <nds/system/types/LayerType.h>

namespace nds
{
namespace localization
{
namespace layer
{

class OccupancyGridLayer
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::localization::instantiations::OccupancyProbabilityGridLayer::ZserioPackingContext& getGridLayer()
        {
            return m_gridLayer_;
        }

    private:
        ::nds::localization::instantiations::OccupancyProbabilityGridLayer::ZserioPackingContext m_gridLayer_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    OccupancyGridLayer() noexcept :
            OccupancyGridLayer(allocator_type())
    {}

    explicit OccupancyGridLayer(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_gridLayer = ::nds::localization::instantiations::OccupancyProbabilityGridLayer>
    OccupancyGridLayer(
            bool hasIds_,
            ZSERIO_T_gridLayer&& gridLayer_,
            const allocator_type& allocator = allocator_type()) :
            OccupancyGridLayer(allocator)
    {
        m_hasIds_ = hasIds_;
        m_gridLayer_ = ::std::forward<ZSERIO_T_gridLayer>(gridLayer_);
    }

    explicit OccupancyGridLayer(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit OccupancyGridLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~OccupancyGridLayer() = default;

    OccupancyGridLayer(const OccupancyGridLayer& other);
    OccupancyGridLayer& operator=(const OccupancyGridLayer& other);

    OccupancyGridLayer(OccupancyGridLayer&& other);
    OccupancyGridLayer& operator=(OccupancyGridLayer&& other);

    OccupancyGridLayer(::zserio::PropagateAllocatorT,
            const OccupancyGridLayer& other, const allocator_type& allocator);

    void initializeChildren();

    bool getHasIds() const;
    void setHasIds(bool hasIds_);

    const ::nds::localization::instantiations::OccupancyProbabilityGridLayer& getGridLayer() const;
    ::nds::localization::instantiations::OccupancyProbabilityGridLayer& getGridLayer();
    void setGridLayer(const ::nds::localization::instantiations::OccupancyProbabilityGridLayer& gridLayer_);
    void setGridLayer(::nds::localization::instantiations::OccupancyProbabilityGridLayer&& gridLayer_);

    ::nds::system::types::LayerType funcGetLayerType() const;

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const OccupancyGridLayer& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    bool readHasIds(::zserio::BitStreamReader& in);
    ::nds::localization::instantiations::OccupancyProbabilityGridLayer readGridLayer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::localization::instantiations::OccupancyProbabilityGridLayer readGridLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    bool m_hasIds_;
    ::nds::localization::instantiations::OccupancyProbabilityGridLayer m_gridLayer_;
};

} // namespace layer
} // namespace localization
} // namespace nds

#endif // NDS_LOCALIZATION_LAYER_OCCUPANCY_GRID_LAYER_H