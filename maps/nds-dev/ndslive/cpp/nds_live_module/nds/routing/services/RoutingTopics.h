/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_ROUTING_SERVICES_ROUTING_TOPICS_H
#define NDS_ROUTING_SERVICES_ROUTING_TOPICS_H

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

#include <nds/routing/route/Route.h>

namespace nds
{
namespace routing
{
namespace services
{

class RoutingTopics : public ::zserio::AllocatorHolder<::std::allocator<uint8_t>>
{
public:
    explicit RoutingTopics(::zserio::IPubsub& pubsub, const allocator_type& allocator = allocator_type());
    ~RoutingTopics() = default;

    RoutingTopics(const RoutingTopics&) = delete;
    RoutingTopics& operator=(const RoutingTopics&) = delete;

    RoutingTopics(RoutingTopics&&) = default;
    RoutingTopics& operator=(RoutingTopics&&) = delete;

    template <typename ZSERIO_MESSAGE>
    class RoutingTopicsCallback
    {
    public:
        virtual ~RoutingTopicsCallback() = default;
        virtual void operator()(::zserio::StringView topic, const ZSERIO_MESSAGE& message) = 0;
    };

    void publishCurrentRoute(const ::nds::routing::route::Route& message, void* context = nullptr);

    ::zserio::IPubsub::SubscriptionId subscribeCurrentRoute(
            const ::std::shared_ptr<RoutingTopicsCallback<::nds::routing::route::Route>>& callback,
            void* context = nullptr);

    void unsubscribe(::zserio::IPubsub::SubscriptionId id);

private:
    template <typename ZSERIO_MESSAGE>
    void publish(ZSERIO_MESSAGE& message, ::zserio::StringView topic, void* context);

    ::zserio::IPubsub& m_pubsub;
};

} // namespace services
} // namespace routing
} // namespace nds

#endif // NDS_ROUTING_SERVICES_ROUTING_TOPICS_H
