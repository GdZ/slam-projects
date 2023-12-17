/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_TOPICS_LANE_BOUNDARY_GEOMETRY_ON_PATH_TOPIC_H
#define NDS_LANE_TOPICS_LANE_BOUNDARY_GEOMETRY_ON_PATH_TOPIC_H

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

#include <nds/core/geometry/GeometryLayerType.h>
#include <nds/core/types/TimeStamp.h>
#include <nds/lane/boundaries/BoundaryElementDefinitions.h>
#include <nds/lane/instantiations/BoundaryGeometryLayer.h>
#include <nds/vehicle/reference/types/HorizonPathId.h>

namespace nds
{
namespace lane
{
namespace topics
{

class LaneBoundaryGeometryOnPathTopic
{
public:
    class ZserioPackingContext
    {
    public:
        ::nds::core::types::TimeStamp::ZserioPackingContext& getStamp()
        {
            return m_stamp_;
        }

        ::zserio::DeltaContext& getPathId()
        {
            return m_pathId_;
        }

        ::nds::lane::boundaries::BoundaryElementDefinitions::ZserioPackingContext& getBoundaryDefinitions()
        {
            return m_boundaryDefinitions_;
        }

        ::nds::lane::instantiations::BoundaryGeometryLayer::ZserioPackingContext& getBoundaryGeometryLayer()
        {
            return m_boundaryGeometryLayer_;
        }

    private:
        ::nds::core::types::TimeStamp::ZserioPackingContext m_stamp_;
        ::zserio::DeltaContext m_pathId_;
        ::nds::lane::boundaries::BoundaryElementDefinitions::ZserioPackingContext m_boundaryDefinitions_;
        ::nds::lane::instantiations::BoundaryGeometryLayer::ZserioPackingContext m_boundaryGeometryLayer_;
    };

    using allocator_type = ::std::allocator<uint8_t>;

    LaneBoundaryGeometryOnPathTopic() noexcept :
            LaneBoundaryGeometryOnPathTopic(allocator_type())
    {}

    explicit LaneBoundaryGeometryOnPathTopic(const allocator_type& allocator) noexcept;

    template <typename ZSERIO_T_stamp = ::nds::core::types::TimeStamp,
            typename ZSERIO_T_boundaryDefinitions = ::nds::lane::boundaries::BoundaryElementDefinitions,
            typename ZSERIO_T_boundaryGeometryLayer = ::nds::lane::instantiations::BoundaryGeometryLayer,
            ::zserio::is_field_constructor_enabled_t<ZSERIO_T_stamp, LaneBoundaryGeometryOnPathTopic, allocator_type> = 0>
    LaneBoundaryGeometryOnPathTopic(
            ZSERIO_T_stamp&& stamp_,
            ::nds::vehicle::reference::types::HorizonPathId pathId_,
            ZSERIO_T_boundaryDefinitions&& boundaryDefinitions_,
            ZSERIO_T_boundaryGeometryLayer&& boundaryGeometryLayer_,
            const allocator_type& allocator = allocator_type()) :
            LaneBoundaryGeometryOnPathTopic(allocator)
    {
        m_stamp_ = ::std::forward<ZSERIO_T_stamp>(stamp_);
        m_pathId_ = pathId_;
        m_boundaryDefinitions_ = ::std::forward<ZSERIO_T_boundaryDefinitions>(boundaryDefinitions_);
        m_boundaryGeometryLayer_ = ::std::forward<ZSERIO_T_boundaryGeometryLayer>(boundaryGeometryLayer_);
    }

    explicit LaneBoundaryGeometryOnPathTopic(::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());
    explicit LaneBoundaryGeometryOnPathTopic(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator = allocator_type());

    ~LaneBoundaryGeometryOnPathTopic() = default;

    LaneBoundaryGeometryOnPathTopic(const LaneBoundaryGeometryOnPathTopic& other);
    LaneBoundaryGeometryOnPathTopic& operator=(const LaneBoundaryGeometryOnPathTopic& other);

    LaneBoundaryGeometryOnPathTopic(LaneBoundaryGeometryOnPathTopic&& other);
    LaneBoundaryGeometryOnPathTopic& operator=(LaneBoundaryGeometryOnPathTopic&& other);

    LaneBoundaryGeometryOnPathTopic(::zserio::PropagateAllocatorT,
            const LaneBoundaryGeometryOnPathTopic& other, const allocator_type& allocator);

    void initializeChildren();

    const ::nds::core::types::TimeStamp& getStamp() const;
    ::nds::core::types::TimeStamp& getStamp();
    void setStamp(const ::nds::core::types::TimeStamp& stamp_);
    void setStamp(::nds::core::types::TimeStamp&& stamp_);

    ::nds::vehicle::reference::types::HorizonPathId getPathId() const;
    void setPathId(::nds::vehicle::reference::types::HorizonPathId pathId_);

    const ::nds::lane::boundaries::BoundaryElementDefinitions& getBoundaryDefinitions() const;
    ::nds::lane::boundaries::BoundaryElementDefinitions& getBoundaryDefinitions();
    void setBoundaryDefinitions(const ::nds::lane::boundaries::BoundaryElementDefinitions& boundaryDefinitions_);
    void setBoundaryDefinitions(::nds::lane::boundaries::BoundaryElementDefinitions&& boundaryDefinitions_);

    const ::nds::lane::instantiations::BoundaryGeometryLayer& getBoundaryGeometryLayer() const;
    ::nds::lane::instantiations::BoundaryGeometryLayer& getBoundaryGeometryLayer();
    void setBoundaryGeometryLayer(const ::nds::lane::instantiations::BoundaryGeometryLayer& boundaryGeometryLayer_);
    void setBoundaryGeometryLayer(::nds::lane::instantiations::BoundaryGeometryLayer&& boundaryGeometryLayer_);

    void initPackingContext(ZserioPackingContext& context) const;

    size_t bitSizeOf(size_t bitPosition = 0) const;
    size_t bitSizeOf(ZserioPackingContext& context, size_t bitPosition) const;

    size_t initializeOffsets(size_t bitPosition = 0);
    size_t initializeOffsets(ZserioPackingContext& context, size_t bitPosition);

    bool operator==(const LaneBoundaryGeometryOnPathTopic& other) const;
    uint32_t hashCode() const;

    void write(::zserio::BitStreamWriter& out) const;
    void write(ZserioPackingContext& context, ::zserio::BitStreamWriter& out) const;

private:
    ::nds::core::types::TimeStamp readStamp(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::core::types::TimeStamp readStamp(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::vehicle::reference::types::HorizonPathId readPathId(::zserio::BitStreamReader& in);
    ::nds::vehicle::reference::types::HorizonPathId readPathId(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in);
    ::nds::lane::boundaries::BoundaryElementDefinitions readBoundaryDefinitions(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::boundaries::BoundaryElementDefinitions readBoundaryDefinitions(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);
    ::nds::lane::instantiations::BoundaryGeometryLayer readBoundaryGeometryLayer(::zserio::BitStreamReader& in,
            const allocator_type& allocator);
    ::nds::lane::instantiations::BoundaryGeometryLayer readBoundaryGeometryLayer(ZserioPackingContext& context,
            ::zserio::BitStreamReader& in, const allocator_type& allocator);

    bool m_areChildrenInitialized;
    ::nds::core::types::TimeStamp m_stamp_;
    ::nds::vehicle::reference::types::HorizonPathId m_pathId_;
    ::nds::lane::boundaries::BoundaryElementDefinitions m_boundaryDefinitions_;
    ::nds::lane::instantiations::BoundaryGeometryLayer m_boundaryGeometryLayer_;
};

} // namespace topics
} // namespace lane
} // namespace nds

#endif // NDS_LANE_TOPICS_LANE_BOUNDARY_GEOMETRY_ON_PATH_TOPIC_H
