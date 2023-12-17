/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROAD_METADATA_GEOMETRY_LAYER_METADATA_H
#define NDS_ROAD_METADATA_GEOMETRY_LAYER_METADATA_H

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

#include <nds/road/metadata/GeometryLayerType.h>

namespace nds
{
namespace road
{
namespace metadata
{

class GeometryLayerMetadata
{
public:
    class ZserioPackingContext
    {
    public:
        ::zserio::DeltaContext& getLayerType()
        {
            return m_layerType_;
        }

    private:
        ::zserio::DeltaContext m_layerType_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    GeometryLayerMetadata() noexcept :
            GeometryLayerMetadata(allocator_type())
    {}

    explicit GeometryLayerMetadata(const allocator_type& allocator) noexcept;

    explicit GeometryLayerMetadata(
            ::nds::road::metadata::GeometryLayerType layerType_,
            const allocator_type& allocator = allocator_type()) :
            GeometryLayerMetadata(allocator)
    {
        m_layerType_ = layerType_;
    }

    explicit GeometryLayerMetadata(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit GeometryLayerMetadata(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~GeometryLayerMetadata() = default;

    GeometryLayerMetadata(const GeometryLayerMetadata&) = default;
    GeometryLayerMetadata& operator=(const GeometryLayerMetadata&) = default;

    GeometryLayerMetadata(GeometryLayerMetadata&&) = default;
    GeometryLayerMetadata& operator=(GeometryLayerMetadata&&) = default;

    GeometryLayerMetadata(::zserio::PropagateAllocatorT,
            const GeometryLayerMetadata& other, const allocator_type& allocator);

    ::nds::road::metadata::GeometryLayerType getLayerType() const;
    void setLayerType(::nds::road::metadata::GeometryLayerType layerType_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const GeometryLayerMetadata& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::road::metadata::GeometryLayerType readLayerType(::zserio::BitStreamReader& in);
    ::nds::road::metadata::GeometryLayerType readLayerType(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);

    ::nds::road::metadata::GeometryLayerType m_layerType_;
};

} // namespace metadata
} // namespace road
} // namespace nds

#endif // NDS_ROAD_METADATA_GEOMETRY_LAYER_METADATA_H
