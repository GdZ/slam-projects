/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_LANE_TOPICS_LANE_TOPIC_COLLECTION_H
#define NDS_LANE_TOPICS_LANE_TOPIC_COLLECTION_H

#include <zserio/CppRuntimeVersion.h>
#if CPP_EXTENSION_RUNTIME_VERSION_NUMBER != 2012000
    #error Version mismatch between Zserio runtime library and Zserio compiler!
    #error Please update your Zserio runtime library to the version 2.12.0.
#endif

#include <memory>
#include <zserio/AllocatorHolder.h>
#include <zserio/IPubsub.h>
#include <zserio/PubsubException.h>
#include <zserio/ArrayTraits.h>

#include <nds/lane/topics/LaneBoundaryGeometryOnPathTopic.h>
#include <nds/lane/topics/LaneGeometryOnPathTopic.h>
#include <nds/lane/topics/LaneGroupsOnPathTopic.h>

namespace nds
{
namespace lane
{
namespace topics
{

class LaneTopicCollection : public ::zserio::AllocatorHolder<::std::allocator<uint8_t>>
{
public:
    explicit LaneTopicCollection(::zserio::IPubsub& pubsub, const allocator_type& allocator = allocator_type());
    ~LaneTopicCollection() = default;

    LaneTopicCollection(const LaneTopicCollection&) = delete;
    LaneTopicCollection& operator=(const LaneTopicCollection&) = delete;

    LaneTopicCollection(LaneTopicCollection&&) = default;
    LaneTopicCollection& operator=(LaneTopicCollection&&) = delete;

    template <typename ZSERIO_MESSAGE>
    class LaneTopicCollectionCallback
    {
    public:
        virtual ~LaneTopicCollectionCallback() = default;
        virtual void operator()(::zserio::StringView topic, const ZSERIO_MESSAGE& message) = 0;
    };

    void publishLaneGroups(const ::nds::lane::topics::LaneGroupsOnPathTopic& message, void* context = nullptr);

    ::zserio::IPubsub::SubscriptionId subscribeLaneGroups(
            const ::std::shared_ptr<LaneTopicCollectionCallback<::nds::lane::topics::LaneGroupsOnPathTopic>>& callback,
            void* context = nullptr);

    void publishLaneCenterlineGeometry(const ::nds::lane::topics::LaneGeometryOnPathTopic& message, void* context = nullptr);

    ::zserio::IPubsub::SubscriptionId subscribeLaneCenterlineGeometry(
            const ::std::shared_ptr<LaneTopicCollectionCallback<::nds::lane::topics::LaneGeometryOnPathTopic>>& callback,
            void* context = nullptr);

    void publishLaneBoundaryGeometry(const ::nds::lane::topics::LaneBoundaryGeometryOnPathTopic& message, void* context = nullptr);

    ::zserio::IPubsub::SubscriptionId subscribeLaneBoundaryGeometry(
            const ::std::shared_ptr<LaneTopicCollectionCallback<::nds::lane::topics::LaneBoundaryGeometryOnPathTopic>>& callback,
            void* context = nullptr);

    void unsubscribe(::zserio::IPubsub::SubscriptionId id);

private:
    template <typename ZSERIO_MESSAGE>
    void publish(ZSERIO_MESSAGE& message, ::zserio::StringView topic, void* context);

    ::zserio::IPubsub& m_pubsub;
};

} // namespace topics
} // namespace lane
} // namespace nds

#endif // NDS_LANE_TOPICS_LANE_TOPIC_COLLECTION_H
