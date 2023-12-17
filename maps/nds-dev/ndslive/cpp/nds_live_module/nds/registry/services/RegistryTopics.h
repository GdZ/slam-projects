/**
 * Automatically generated by Zserio C++ extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode, sourcesAmalgamation, stdAllocator.
 */

#ifndef NDS_REGISTRY_SERVICES_REGISTRY_TOPICS_H
#define NDS_REGISTRY_SERVICES_REGISTRY_TOPICS_H

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

#include <nds/core/types/Empty.h>
#include <nds/system/types/NdsSystemToken.h>

namespace nds
{
namespace registry
{
namespace services
{

class RegistryTopics : public ::zserio::AllocatorHolder<::std::allocator<uint8_t>>
{
public:
    explicit RegistryTopics(::zserio::IPubsub& pubsub, const allocator_type& allocator = allocator_type());
    ~RegistryTopics() = default;

    RegistryTopics(const RegistryTopics&) = delete;
    RegistryTopics& operator=(const RegistryTopics&) = delete;

    RegistryTopics(RegistryTopics&&) = default;
    RegistryTopics& operator=(RegistryTopics&&) = delete;

    template <typename ZSERIO_MESSAGE>
    class RegistryTopicsCallback
    {
    public:
        virtual ~RegistryTopicsCallback() = default;
        virtual void operator()(::zserio::StringView topic, const ZSERIO_MESSAGE& message) = 0;
    };

    void publishNdsSystemToken(const ::nds::system::types::NdsSystemToken& message, void* context = nullptr);

    ::zserio::IPubsub::SubscriptionId subscribeNdsSystemToken(
            const ::std::shared_ptr<RegistryTopicsCallback<::nds::system::types::NdsSystemToken>>& callback,
            void* context = nullptr);

    void publishEmpty(const ::nds::core::types::Empty& message, void* context = nullptr);

    ::zserio::IPubsub::SubscriptionId subscribeEmpty(
            const ::std::shared_ptr<RegistryTopicsCallback<::nds::core::types::Empty>>& callback,
            void* context = nullptr);

    void unsubscribe(::zserio::IPubsub::SubscriptionId id);

private:
    template <typename ZSERIO_MESSAGE>
    void publish(ZSERIO_MESSAGE& message, ::zserio::StringView topic, void* context);

    ::zserio::IPubsub& m_pubsub;
};

} // namespace services
} // namespace registry
} // namespace nds

#endif // NDS_REGISTRY_SERVICES_REGISTRY_TOPICS_H
